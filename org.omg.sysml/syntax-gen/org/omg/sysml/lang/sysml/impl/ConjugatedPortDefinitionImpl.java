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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugated Port Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortDefinitionImpl#getOwnedPortConjugator <em>Owned Port Conjugator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortDefinitionImpl#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjugatedPortDefinitionImpl extends PortDefinitionImpl implements ConjugatedPortDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugatedPortDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONJUGATED_PORT_DEFINITION;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConjugation getOwnedPortConjugator() {
		PortConjugation ownedPortConjugator = basicGetOwnedPortConjugator();
		return ownedPortConjugator != null && ownedPortConjugator.eIsProxy() ? (PortConjugation)eResolveProxy((InternalEObject)ownedPortConjugator) : ownedPortConjugator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortConjugation basicGetOwnedPortConjugator() {
		return (PortConjugation) getOwnedRelationship().stream().
				filter(PortConjugation.class::isInstance).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedPortConjugator(PortConjugation newOwnedPortConjugator) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedPortConjugator() {
		return basicGetOwnedPortConjugator() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDefinition getOriginalPortDefinition() {
		PortDefinition originalPortDefinition = basicGetOriginalPortDefinition();
		return originalPortDefinition != null && originalPortDefinition.eIsProxy() ? (PortDefinition)eResolveProxy((InternalEObject)originalPortDefinition) : originalPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortDefinition basicGetOriginalPortDefinition() {
		PortConjugation conjugator = getOwnedPortConjugator();
		return conjugator != null? conjugator.getOriginalPortDefinition(): null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOriginalPortDefinition(PortDefinition newOriginalPortDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalPortDefinition() {
		return basicGetOriginalPortDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getOwningNamespace() {
		return getOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetOwningNamespace() {
		return basicGetOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningNamespace(Namespace newOwningNamespace) {
		if (newOwningNamespace != null && !(newOwningNamespace instanceof PortDefinition)) {
			throw new IllegalArgumentException("newOwningNamespace must be an instance of PortDefinition");
		}
		setOriginalPortDefinition((PortDefinition) newOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningNamespace() {
  		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjugation getOwnedConjugator() {
		return getOwnedPortConjugator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjugation basicGetOwnedConjugator() {
		return basicGetOwnedPortConjugator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConjugator(Conjugation newOwnedConjugator) {
		if (newOwnedConjugator != null && !(newOwnedConjugator instanceof PortConjugation)) {
			throw new IllegalArgumentException("newOwnedConjugator must be an instance of PortConjugation");
		}
		setOwnedPortConjugator((PortConjugation) newOwnedConjugator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConjugator() {
  		return false;
	}

	// Operation overrides
	
	@Override
	public String effectiveName() {
		String name = super.getName();
		if (name == null) {
			PortDefinition originalPortDefinition = getOriginalPortDefinition();
			if (originalPortDefinition != null) {
				name = originalPortDefinition.getName();
				if (name != null) {
					name = "~" + name;
				}
			}
		}
		return name;
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				if (resolve) return getOwnedPortConjugator();
				return basicGetOwnedPortConjugator();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				if (resolve) return getOriginalPortDefinition();
				return basicGetOriginalPortDefinition();
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				setOwnedPortConjugator((PortConjugation)newValue);
				return;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)newValue);
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				setOwnedPortConjugator((PortConjugation)null);
				return;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)null);
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_CONJUGATOR:
				return isSetOwnedConjugator();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNING_NAMESPACE:
				return isSetOwningNamespace();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				return isSetOwnedPortConjugator();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				return isSetOriginalPortDefinition();
		}
		return super.eIsSet(featureID);
	}

} //ConjugatedPortDefinitionImpl
