package org.eclipse.ocl.pivot.library.numeric;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.RealValue;

public class NumericSinOperation extends AbstractSimpleUnaryOperation {
	
	public static final @NonNull NumericSinOperation INSTANCE = new NumericSinOperation();
	
	@Override
	public @NonNull RealValue evaluate(@Nullable Object sourceVal) {
		RealValue numericValue = asRealValue(sourceVal); 
		double d = Math.sin(numericValue.asDouble());
		return ValueUtil.realValueOf(d);
	}
}
