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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.CallExp;
import org.eclipse.ocl.pivot.CollectionType;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.internal.manager.TemplateParameterSubstitutionVisitor;
import org.eclipse.ocl.pivot.internal.values.BagImpl;
import org.eclipse.ocl.pivot.internal.values.BagValueImpl;
import org.eclipse.ocl.pivot.internal.values.OrderedSetImpl;
import org.eclipse.ocl.pivot.internal.values.RangeOrderedSetValueImpl;
import org.eclipse.ocl.pivot.internal.values.SequenceValueImpl;
import org.eclipse.ocl.pivot.internal.values.SparseOrderedSetValueImpl;
import org.eclipse.ocl.pivot.internal.values.UndefinedValueImpl;
import org.eclipse.ocl.pivot.library.AbstractSimpleUnaryOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.Bag;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

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
		List<Object> toVisit = new ArrayList<Object>(elements);
		return switch (collectionValue) {
			case UndefinedValueImpl u -> throw new InvalidValueException(PivotMessages.ConvertibleValueRequired, "Invalid");
			case BagValue b -> createBagValue(collectionValue.getTypeId(), flattenAux(toVisit, new BagImpl<>()));
			case SetValue s -> createSetValue(collectionValue.getTypeId(), flattenAux(toVisit, new HashSet<>()));
			case RangeOrderedSetValueImpl r -> collectionValue;
			case SparseOrderedSetValueImpl s -> createOrderedSetValue(collectionValue.getTypeId(), flattenAux(toVisit, new OrderedSetImpl<>()));
			default -> createSequenceValue(collectionValue.getTypeId(), flattenAux(toVisit, new ArrayList<>()));	
		};
	}
	
	private <T extends Collection<?>> T flattenAux(List<Object> toVisit, T flattenedElements){
		int i = 0;
		while (i != toVisit.size()) {
			Object element = toVisit.get(i);
			CollectionValue collectionElement = ValueUtil.isCollectionValue(element);
			if (collectionElement != null) {
				toVisit.addAll(collectionElement.getElements());
			} else {
				flattenedElements.add(element);
			};
			i++;
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
