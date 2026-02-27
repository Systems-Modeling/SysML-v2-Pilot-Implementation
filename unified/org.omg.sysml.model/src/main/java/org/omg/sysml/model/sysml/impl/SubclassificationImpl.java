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

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Classifier;
import org.omg.sysml.model.sysml.Subclassification;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subclassification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SubclassificationImpl#getOwningClassifier <em>Owning Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SubclassificationImpl#getSubclassifier <em>Subclassifier</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SubclassificationImpl#getSuperclassifier <em>Superclassifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubclassificationImpl extends SpecializationImpl implements Subclassification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubclassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUBCLASSIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getOwningClassifier() {
		return (Classifier)eGet(SysMLPackage.Literals.SUBCLASSIFICATION__OWNING_CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningClassifier(Classifier newOwningClassifier) {
		eSet(SysMLPackage.Literals.SUBCLASSIFICATION__OWNING_CLASSIFIER, newOwningClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getSubclassifier() {
		return (Classifier)eGet(SysMLPackage.Literals.SUBCLASSIFICATION__SUBCLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubclassifier(Classifier newSubclassifier) {
		eSet(SysMLPackage.Literals.SUBCLASSIFICATION__SUBCLASSIFIER, newSubclassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getSuperclassifier() {
		return (Classifier)eGet(SysMLPackage.Literals.SUBCLASSIFICATION__SUPERCLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperclassifier(Classifier newSuperclassifier) {
		eSet(SysMLPackage.Literals.SUBCLASSIFICATION__SUPERCLASSIFIER, newSuperclassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		var sourceValue = this.getOwningClassifier();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Type typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Type typedValue) {
			return typedValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getSpecific() {
		var sourceValue = this.getSubclassifier();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Type typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Type typedValue) {
			return typedValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getGeneral() {
		var sourceValue = this.getSuperclassifier();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Type typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Type typedValue) {
			return typedValue;
		}
		return null;
	}

} //SubclassificationImpl
