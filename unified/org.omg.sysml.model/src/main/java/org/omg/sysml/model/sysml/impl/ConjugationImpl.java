/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 */
package org.omg.sysml.model.sysml.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Conjugation;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConjugationImpl#getConjugatedType <em>Conjugated Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConjugationImpl#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConjugationImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjugationImpl extends RelationshipImpl implements Conjugation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONJUGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getConjugatedType() {
		return (Type)eGet(SysMLPackage.Literals.CONJUGATION__CONJUGATED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConjugatedType(Type newConjugatedType) {
		eSet(SysMLPackage.Literals.CONJUGATION__CONJUGATED_TYPE, newConjugatedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOriginalType() {
		return (Type)eGet(SysMLPackage.Literals.CONJUGATION__ORIGINAL_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalType(Type newOriginalType) {
		eSet(SysMLPackage.Literals.CONJUGATION__ORIGINAL_TYPE, newOriginalType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return (Type)eGet(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningType(Type newOwningType) {
		eSet(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE, newOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		var sourceValue = this.getConjugatedType();
		Object source = sourceValue;
		var result = new BasicEList<Element>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Element typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Element typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		var sourceValue = this.getOriginalType();
		Object source = sourceValue;
		var result = new BasicEList<Element>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Element typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Element typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

} //ConjugationImpl
