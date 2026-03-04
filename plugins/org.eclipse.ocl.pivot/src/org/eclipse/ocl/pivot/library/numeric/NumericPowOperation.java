package org.eclipse.ocl.pivot.library.numeric;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleBinaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.RealValue;

public class NumericPowOperation extends AbstractSimpleBinaryOperation {
	
	public static final @NonNull NumericPowOperation INSTANCE = new NumericPowOperation();
	
	@Override
	public @NonNull RealValue evaluate(@Nullable Object left, @Nullable Object right) {
		RealValue leftNumeric = asRealValue(left);
		RealValue rightNumeric = asRealValue(right);
		double d = Math.pow(leftNumeric.asDouble(), rightNumeric.asDouble());
		return ValueUtil.realValueOf(d);
	}
}
