/*******************************************************************************
 * Copyright (c) 2010, 2026 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *   CentraleSupélec (students V. Carrez and Y.-S. Chesnel--Bicep, professor D. Marcadet)
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.numeric;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * NumericSinOperation realises the cbrt() library operation.
 */
public class NumericCbrtOperation extends AbstractSimpleUnaryOperation {
	
	public static final @NonNull NumericCbrtOperation INSTANCE = new NumericCbrtOperation();
	
	@Override
	public @NonNull RealValue evaluate(@Nullable Object sourceVal) {
		RealValue numericValue = asRealValue(sourceVal); 
		double d = Math.cbrt(numericValue.asDouble());
		return ValueUtil.realValueOf(d);
	}
}
