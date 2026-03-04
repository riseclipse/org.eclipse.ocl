/*******************************************************************************
 * Copyright (c) 2010, 2018 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractUnaryOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation;
import org.eclipse.ocl.pivot.values.CollectionValue;

public class CollectionAverageOperation extends AbstractUnaryOperation
{
	public static final @NonNull CollectionAverageOperation INSTANCE = new CollectionAverageOperation();

	@Override
	public @NonNull Object evaluate(@NonNull Executor executor, @NonNull TypeId returnTypeId, @Nullable Object sourceVal) {
		CollectionValue value = asCollectionValue(sourceVal);
		Object sum = CollectionSumOperation.INSTANCE.evaluate(executor, returnTypeId, sourceVal);
		
        return NumericDivideOperation.INSTANCE.evaluate(sum, value.size());
	}
}
