/*
 * Copyright (c) 2005, 2018 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329, 398462, 535301
 *   Christian W. Damus (CEA) - 398462
 *   Kenn Hussey (CEA) - 212765, 403365, 420938, 421756, 432921
 */
package org.omg.sysml.lang.sysml.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreEList;

/**
 * An unmodifiable list that represents a union of elements. This list is ideal
 * for implementing derived features whose values are obtained from the values
 * of other features in a non-trivial way.
 * 
 * This file comes from https://github.com/eclipse-uml2/uml2/blob/master/plugins/org.eclipse.uml2.common/src/org/eclipse/uml2/common/util/UnionEObjectEList.java.
 */
public class UnionEObjectEList<E> extends EcoreEList.UnmodifiableEList<E> {

	private static final long serialVersionUID = 1L;

	public UnionEObjectEList(InternalEObject owner,
			EStructuralFeature eStructuralFeature, int size, Object[] data) {
		super(owner, eStructuralFeature, size, data);
	}

	protected EObject resolveProxy(EObject eObject) {
		return eObject.eIsProxy()
			? owner.eResolveProxy((InternalEObject) eObject)
			: eObject;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected E resolve(int index, E object) {
		E resolved = (E) resolveProxy((EObject) object);

		if (resolved != object) {
			E oldObject = (E) data[index];
			assign(index, validate(index, resolved));
			didSet(index, resolved, oldObject);

			return resolved;
		} else {
			return object;
		}
	}

	@Override
	protected boolean canContainNull() {
		return false;
	}

	@Override
	protected boolean isUnique() {
		return true;
	}

	@Override
	protected boolean useEquals() {
		return false;
	}

	@Override
	public boolean contains(Object object) {
		boolean result = super.contains(object);

		if (!result) {

			for (int i = 0; i < size; i++) {

				if (resolveProxy((EObject) data[i]) == object) {
					return true;
				}
			}
		}

		return result;
	}

	@Override
	public int indexOf(Object object) {
		int result = super.indexOf(object);

		if (result == -1) {

			for (int i = 0; i < size; i++) {

				if (resolveProxy((EObject) data[i]) == object) {
					return i;
				}
			}
		}

		return result;
	}

	@Override
	public int lastIndexOf(Object object) {
		int result = super.lastIndexOf(object);

		if (result == -1) {

			for (int i = size - 1; i >= 0; i--) {

				if (resolveProxy((EObject) data[i]) == object) {
					return i;
				}
			}
		}

		return result;
	}

	@Override
	public Iterator<E> iterator() {
		return listIterator();
	}

    @SuppressWarnings("deprecation")
	@Override
	public ListIterator<E> listIterator() {
		return new EListIterator<E>();
	}

	@SuppressWarnings("deprecation")
	@Override
	public ListIterator<E> listIterator(int index) {

		if (index < 0 || index > size()) {
			throw new BasicIndexOutOfBoundsException(index, size);
		}

		return new EListIterator<E>(index);
	}

	protected boolean isLoading() {
		Resource.Internal eInternalResource = owner.eInternalResource();
		return eInternalResource != null && eInternalResource.isLoading();
	}

	@Override
	public NotificationChain basicRemove(Object object,
			NotificationChain notifications) {
		return isLoading()
			? notifications
			: super.basicRemove(object, notifications);
	}

	@Override
	public NotificationChain basicAdd(E object, NotificationChain notifications) {
		return isLoading()
			? notifications
			: super.basicAdd(object, notifications);
	}

	@Override
	public boolean add(E object) {
		return false;
	}

	@Override
	public void add(int index, E object) {
		// do nothing
	}

	@Override
	public void clear() {
		// do nothing
	}

	@Override
	public void move(int index, E object) {
		// do nothing
	}

	@Override
	public void addUnique(E object) {
		// do nothing
	}

	@Override
	public void addUnique(int index, E object) {
		// do nothing
	}

	@Override
	public boolean addAllUnique(int index, Collection<? extends E> collection) {
		return false;
	}

	@Override
	public E move(int targetIndex, int sourceIndex) {
		return null;
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public boolean addAllUnique(Collection<? extends E> collection) {
		return false;
	}

}
