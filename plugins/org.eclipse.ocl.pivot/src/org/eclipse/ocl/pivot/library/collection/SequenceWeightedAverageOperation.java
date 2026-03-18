package org.eclipse.ocl.pivot.library.collection;

import java.util.Iterator;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * SequenceWeightedAverageOperation realises the Sequence::weightedAverage() library operation.
 */
public class SequenceWeightedAverageOperation extends AbstractBinaryOperation {
	
	public static final SequenceWeightedAverageOperation INSTANCE = new SequenceWeightedAverageOperation();

	@Override
	public @Nullable Object evaluate(@NonNull Executor executor, @NonNull TypeId returnTypeId, @Nullable Object sourceValue, @Nullable Object argumentValue) {
		SequenceValue sequence = asSequenceValue(sourceValue);
		SequenceValue weights = asSequenceValue(argumentValue);
		
		if (sequence.size() != weights.size()) {
			throw new InvalidValueException(PivotMessages.InvalidArgument, "size of weights should be the same as the source sequence");
		}
		
		if (sequence.isEmpty()) {
			throw new InvalidValueException(PivotMessages.InvalidArgument, "empty source sequence");
		}
		
		// compute sum of weights
		TypeId realTypeId = executor.getStandardLibrary().getRealType().getTypeId();
		RealValue weightsSum = asRealValue(CollectionSumOperation.INSTANCE.evaluate(executor, realTypeId, weights));
		if (weightsSum.bigDecimalValue().signum() == 0) {
			throw new InvalidValueException(PivotMessages.InvalidArgument, "sum of weights is zero");
		}
		

		// compute sum of sequence.at(i) * weights.at(i) 
		Object addProduct = realValueOf(0); 
		for (int i = 1; i <= sequence.intSize(); i++) {
			Object value = sequence.at(i);
			Object weight = weights.at(i);
		
			addProduct = NumericPlusOperation.INSTANCE.evaluate(addProduct, 
				                                                NumericTimesOperation.INSTANCE.evaluate(value, weight));
		}
		
		return NumericDivideOperation.INSTANCE.evaluate(addProduct, weightsSum);
	}

}
