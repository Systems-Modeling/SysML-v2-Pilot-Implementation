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

import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureTyping;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Typing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureTypingImpl#getOwningFeature <em>Owning Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureTypingImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureTypingImpl#getTypedFeature <em>Typed Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureTypingImpl extends SpecializationImpl implements FeatureTyping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureTypingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_TYPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwningFeature() {
		return (Feature)eGet(SysMLPackage.Literals.FEATURE_TYPING__OWNING_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningFeature(Feature newOwningFeature) {
		eSet(SysMLPackage.Literals.FEATURE_TYPING__OWNING_FEATURE, newOwningFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return (Type)eGet(SysMLPackage.Literals.FEATURE_TYPING__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		eSet(SysMLPackage.Literals.FEATURE_TYPING__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getTypedFeature() {
		return (Feature)eGet(SysMLPackage.Literals.FEATURE_TYPING__TYPED_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypedFeature(Feature newTypedFeature) {
		eSet(SysMLPackage.Literals.FEATURE_TYPING__TYPED_FEATURE, newTypedFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		var sourceValue = this.getOwningFeature();
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
		var sourceValue = this.getType();
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
		var sourceValue = this.getTypedFeature();
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

} //FeatureTypingImpl
