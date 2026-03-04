/*******************************************************************************
 * Copyright (c) 2012, 2018 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * StringSplitOperation realises the String::split() library operation.
 */
public class StringSplitOperation extends AbstractBinaryOperation
{
	public static final @NonNull StringSplitOperation INSTANCE = new StringSplitOperation();
	public static final @NonNull CollectionTypeId SEQ_STRING = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING);

	@Override
	public @NonNull SequenceValue evaluate(@NonNull Executor executor, @NonNull TypeId returnTypeId, @Nullable Object sourceValue, @Nullable Object firstArgumentValue) {
		String sourceString = asString(sourceValue);
		String regex = asString(firstArgumentValue);
		Pattern pattern = executor.getRegexPattern(regex);
		String[] stringtkt = pattern.split(sourceString);
		List<Object> results = new ArrayList<>(stringtkt.length);
		for (String str : stringtkt) {
			results.add(str);
		}
		return createSequenceValue(SEQ_STRING, results);
	}
}
