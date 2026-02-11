package fr.centralesupelec.edf.riseclipse.mathlib;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.RealValue;

public class SinOperation extends AbstractSimpleUnaryOperation {

	public static final @NonNull SinOperation INSTANCE = new SinOperation();

	@Override
	public @NonNull RealValue evaluate(@Nullable Object sourceVal) {
		RealValue numericValue = asRealValue(sourceVal);
		double d = Math.sin(numericValue.asDouble());
		return ValueUtil.realValueOf(d);
	}
}
