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
import org.omg.sysml.model.sysml.ReferenceSubsetting;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Subsetting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ReferenceSubsettingImpl#getReferencedFeature <em>Referenced Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ReferenceSubsettingImpl#getReferencingFeature <em>Referencing Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceSubsettingImpl extends SubsettingImpl implements ReferenceSubsetting {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceSubsettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REFERENCE_SUBSETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getReferencedFeature() {
		return (Feature)eGet(SysMLPackage.Literals.REFERENCE_SUBSETTING__REFERENCED_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedFeature(Feature newReferencedFeature) {
		eSet(SysMLPackage.Literals.REFERENCE_SUBSETTING__REFERENCED_FEATURE, newReferencedFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getReferencingFeature() {
		return (Feature)eGet(SysMLPackage.Literals.REFERENCE_SUBSETTING__REFERENCING_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencingFeature(Feature newReferencingFeature) {
		eSet(SysMLPackage.Literals.REFERENCE_SUBSETTING__REFERENCING_FEATURE, newReferencingFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSubsettedFeature() {
		var sourceValue = this.getReferencedFeature();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Feature typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Feature typedValue) {
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
	public Feature getOwningFeature() {
		var sourceValue = this.getReferencingFeature();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Feature typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Feature typedValue) {
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
	public Feature getSubsettingFeature() {
		var sourceValue = this.getReferencingFeature();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Feature typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Feature typedValue) {
			return typedValue;
		}
		return null;
	}

} //ReferenceSubsettingImpl
