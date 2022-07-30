/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.EnumerationDefinition;
import org.omg.sysml.lang.sysml.EnumerationUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.EnumerationUsageImpl#getEnumerationDefinition <em>Enumeration Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationUsageImpl extends AttributeUsageImpl implements EnumerationUsage {
	/**
	 * The cached setting delegate for the '{@link #getEnumerationDefinition() <em>Enumeration Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ENUMERATION_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ENUMERATION_USAGE__ENUMERATION_DEFINITION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ENUMERATION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationDefinition getEnumerationDefinition() {
		return (EnumerationDefinition)ENUMERATION_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationDefinition basicGetEnumerationDefinition() {
		return (EnumerationDefinition)ENUMERATION_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumerationDefinition(EnumerationDefinition newEnumerationDefinition) {
		ENUMERATION_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newEnumerationDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnumerationDefinition() {
		return basicGetEnumerationDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getAttributeDefinition() {
		EList<DataType> attributeDefinition = new UniqueEList<DataType>();
		EnumerationDefinition enumerationDefinition = getEnumerationDefinition();
		if (enumerationDefinition != null) {
			attributeDefinition.add(enumerationDefinition);
		}
		return new UnionEObjectEList<DataType>(this, SysMLPackage.Literals.ATTRIBUTE_USAGE__ATTRIBUTE_DEFINITION, attributeDefinition.size(), attributeDefinition.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeDefinition() {
  		return false;
	}

	/**
	 * Treat EnumerationUsage like a regular feature for the purposes of effective naming,
	 * rather than like a normal variant Usage.
	 */
	protected Optional<Feature> getVariantSubsettedFeature() {
		return Optional.empty();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ENUMERATION_USAGE__ENUMERATION_DEFINITION:
				if (resolve) return getEnumerationDefinition();
				return basicGetEnumerationDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.ENUMERATION_USAGE__ENUMERATION_DEFINITION:
				setEnumerationDefinition((EnumerationDefinition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.ENUMERATION_USAGE__ENUMERATION_DEFINITION:
				setEnumerationDefinition((EnumerationDefinition)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.ENUMERATION_USAGE__ATTRIBUTE_DEFINITION:
				return isSetAttributeDefinition();
			case SysMLPackage.ENUMERATION_USAGE__ENUMERATION_DEFINITION:
				return isSetEnumerationDefinition();
		}
		return super.eIsSet(featureID);
	}

} //EnumerationUsageImpl
