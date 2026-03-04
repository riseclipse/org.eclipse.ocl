package org.eclipse.ocl.pivot.library.numeric;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.RealValue;

public class NumericSqrtOperation extends AbstractSimpleUnaryOperation {
	
	public static final @NonNull NumericSqrtOperation INSTANCE = new NumericSqrtOperation();
	
	@Override
	public @NonNull RealValue evaluate(@Nullable Object sourceVal) {
		RealValue numericValue = asRealValue(sourceVal); 
		double d = Math.sqrt(numericValue.asDouble());
		return ValueUtil.realValueOf(d);
	}
}
