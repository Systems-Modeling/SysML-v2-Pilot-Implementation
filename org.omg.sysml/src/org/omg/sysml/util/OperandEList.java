/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2026 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.util;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.VisibilityKind;

/**
 * This class provides the facade of an EList, but only for adding operands to an InvocationExpression.
 * Operands are actually added as FeatureValue Expressions of in parameters of the InvocationExpression.
 * Values CANNOT be read back from an OperandEList.Use InvocationExpression::getArgument instead.
 */
public class OperandEList implements InternalEList<Expression> {
	private InvocationExpression containingExpression;
	
	public OperandEList(InvocationExpression containingExpression) {
		this.containingExpression = containingExpression;
	}
	
	@Override
	public void addUnique(Expression object) {
		TypeUtil.addOwnedParameterTo(containingExpression, object).
			setVisibility(VisibilityKind.PRIVATE);
	}

	@Override
	public void addUnique(int i, Expression object) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean addAllUnique(Collection<? extends Expression> collection) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAllUnique(int index, Collection<? extends Expression> collection) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Expression setUnique(int index, Expression object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Expression remove(int i) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {

	}

	@Override
	public Object[] basicToArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] basicToArray(T[] array) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int basicIndexOf(Object object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int basicLastIndexOf(Object object) {
		return -1;
	}

	@Override
	public boolean basicContains(Object object) {
		return false;
	}

	@Override
	public boolean basicContainsAll(Collection<?> collection) {
		return false;
	}

	@Override
	public NotificationChain basicRemove(Object object, NotificationChain notifications) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NotificationChain basicAdd(Expression object, NotificationChain notifications) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Expression> basicList() {
		return Collections.emptyList();
	}

	@Override
	public Iterator<Expression> basicIterator() {
		return Collections.emptyIterator();
	}

	@Override
	public ListIterator<Expression> basicListIterator() {
		return Collections.emptyListIterator();
	}

	@Override
	public ListIterator<Expression> basicListIterator(int i) {
		return Collections.emptyListIterator();
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public Expression move(int targetIndex, int sourceIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Expression get(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void move(int newPosition, Expression object) {
		throw new UnsupportedOperationException();	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<Expression> iterator() {
		return Collections.emptyIterator();
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(Expression e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Expression> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends Expression> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Expression set(int index, Expression element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(int index, Expression element) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public int indexOf(Object o) {
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		return -1;
	}

	@Override
	public ListIterator<Expression> listIterator() {
		return Collections.emptyListIterator();
	}

	@Override
	public ListIterator<Expression> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Expression> subList(int fromIndex, int toIndex) {
		return Collections.emptyList();
	}

	@Override
	public Expression basicGet(int index) {
		throw new UnsupportedOperationException();
	}
}
