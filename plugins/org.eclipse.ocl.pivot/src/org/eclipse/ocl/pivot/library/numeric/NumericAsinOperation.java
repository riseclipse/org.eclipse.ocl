package org.eclipse.ocl.pivot.library.numeric;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.RealValue;

public class NumericAsinOperation extends AbstractSimpleUnaryOperation {
	
	public static final @NonNull NumericAsinOperation INSTANCE = new NumericAsinOperation();
	
	@Override
	public @NonNull RealValue evaluate(@Nullable Object sourceVal) {
		RealValue numericValue = asRealValue(sourceVal); 
		double d = Math.asin(numericValue.asDouble());
		return ValueUtil.realValueOf(d);
	}
}
