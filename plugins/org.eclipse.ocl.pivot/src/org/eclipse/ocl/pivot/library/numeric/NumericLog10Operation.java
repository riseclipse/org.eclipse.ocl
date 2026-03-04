package org.eclipse.ocl.pivot.library.numeric;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.RealValue;

public class NumericLog10Operation extends AbstractSimpleUnaryOperation {
	
	public static final @NonNull NumericLog10Operation INSTANCE = new NumericLog10Operation();
	
	@Override
	public @NonNull RealValue evaluate(@Nullable Object sourceVal) {
		RealValue numericValue = asRealValue(sourceVal); 
		double d = Math.log10(numericValue.asDouble());
		return ValueUtil.realValueOf(d);
	}
}
