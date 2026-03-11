/*******************************************************************************
 * Copyright (c) 2010, 2022 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Queue;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.CallExp;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.internal.manager.TemplateParameterSubstitutionVisitor;
import org.eclipse.ocl.pivot.internal.values.BagImpl;
import org.eclipse.ocl.pivot.internal.values.BagValueImpl;
import org.eclipse.ocl.pivot.internal.values.OrderedSetImpl;
import org.eclipse.ocl.pivot.internal.values.RangeOrderedSetValueImpl;
import org.eclipse.ocl.pivot.internal.values.RangeSequenceValueImpl;
import org.eclipse.ocl.pivot.internal.values.SetValueImpl;
import org.eclipse.ocl.pivot.internal.values.SparseOrderedSetValueImpl;
import org.eclipse.ocl.pivot.internal.values.UndefinedValueImpl;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * CollectionFlattenWidthOperation realises the Collection::flattenWidth() library operation.
 */
public class CollectionFlattenWidthOperation extends AbstractSimpleUnaryOperation
{
	public static final @NonNull CollectionFlattenWidthOperation INSTANCE = new CollectionFlattenWidthOperation();

	@Override
	public @NonNull CollectionValue evaluate(@Nullable Object argument) {
		CollectionValue collectionValue = asCollectionValue(argument);
		Collection<? extends Object> elements = collectionValue.getElements();
		Deque<Object> toVisitFile = new ArrayDeque<Object>(elements);
		CollectionTypeId valuesType = collectionValue.getTypeId();
		return switch (collectionValue) {
			case UndefinedValueImpl u -> throw new InvalidValueException(PivotMessages.ConvertibleValueRequired, "Invalid");
			case BagValueImpl b -> createBagValue(valuesType, flattenAux(toVisitFile, new BagImpl<>()));
			case SetValueImpl s -> createSetValue(valuesType, flattenAux(toVisitFile, new HashSet<>()));
			case RangeOrderedSetValueImpl r -> collectionValue;
			case SparseOrderedSetValueImpl s -> createOrderedSetValue(valuesType, flattenAux(toVisitFile, new OrderedSetImpl<>()));
			case RangeSequenceValueImpl r -> collectionValue;
			default -> createSequenceValue(valuesType, flattenAux(toVisitFile, new ArrayList<>()));	
		};
	}
	
	private <T extends Collection<Object>> T flattenAux(@NonNull Queue<Object> toVisit, @NonNull T flattenedElements){
		while (!toVisit.isEmpty()) {
			Object element = toVisit.poll();
			CollectionValue collectionElement = ValueUtil.isCollectionValue(element);
			if (collectionElement != null) {
				toVisit.addAll(collectionElement.getElements());
			} else {
				flattenedElements.add(element);
			}
		}
		return flattenedElements;
	}

	/**
	 *	Special case processing for flatten() that flattens nested types.
	 *
	 * @since 1.18
	 */
	@Override
	public void resolveUnmodeledTemplateParameterSubstitutions(@NonNull TemplateParameterSubstitutionVisitor templateParameterSubstitutions, @NonNull CallExp callExp) {
		Type elementType = callExp.getOwnedSource().getType();
		while (elementType instanceof CollectionType) {
			elementType = ((CollectionType)elementType).getElementType();
		}
		templateParameterSubstitutions.put(1, elementType);
	}
}
