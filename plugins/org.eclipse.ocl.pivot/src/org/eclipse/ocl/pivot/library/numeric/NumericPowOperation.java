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
import org.eclipse.ocl.pivot.library.AbstractSimpleBinaryOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * NumericSinOperation realises the pow() library operation.
 */
public class NumericPowOperation extends AbstractSimpleBinaryOperation {
	
	public static final @NonNull NumericPowOperation INSTANCE = new NumericPowOperation();
	
	@Override
	public @NonNull RealValue evaluate(@Nullable Object left, @Nullable Object right) {
		RealValue leftNumeric = asRealValue(left);
		RealValue rightNumeric = asRealValue(right);
		double d = Math.pow(leftNumeric.asDouble(), rightNumeric.asDouble());
		if (Double.isNaN(d)) {
			throw new InvalidValueException(PivotMessages.InvalidOperation,"pow",leftNumeric.asDouble() + " power " + rightNumeric.asDouble());
		}
		return ValueUtil.realValueOf(d);
	}
}
