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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Conjugation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortConjugationImpl#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortConjugationImpl#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortConjugationImpl extends ConjugationImpl implements PortConjugation {
	/**
	 * The cached value of the '{@link #getOriginalPortDefinition() <em>Original Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected PortDefinition originalPortDefinition;

	/**
	 * The cached setting delegate for the '{@link #getConjugatedPortDefinition() <em>Conjugated Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjugatedPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONJUGATED_PORT_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortConjugationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PORT_CONJUGATION;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PortDefinition getOriginalPortDefinition() {
		return originalPortDefinition == null? basicGetOriginalPortDefinition(): getOriginalPortDefinitionGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition getOriginalPortDefinitionGen() {
		if (originalPortDefinition != null && originalPortDefinition.eIsProxy()) {
			InternalEObject oldOriginalPortDefinition = (InternalEObject)originalPortDefinition;
			originalPortDefinition = (PortDefinition)eResolveProxy(oldOriginalPortDefinition);
			if (originalPortDefinition != oldOriginalPortDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION, oldOriginalPortDefinition, originalPortDefinition));
			}
		}
		return originalPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround:
	 * If the originalPortDefinition is empty, then set it to the owner of the conjugatedPortDefinition
	 * (if that is a PortDefinition).
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortDefinition basicGetOriginalPortDefinition() {
		if (originalPortDefinition == null) {
			ConjugatedPortDefinition conjugatedPortDefinition = getConjugatedPortDefinition();
			if (conjugatedPortDefinition != null) {
				Element conjugatedPortDefinitionOwner = conjugatedPortDefinition.getOwner();
				if (conjugatedPortDefinitionOwner instanceof PortDefinition) {
					originalPortDefinition = (PortDefinition)conjugatedPortDefinitionOwner;
				}
			}
		}
		return originalPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalPortDefinition(PortDefinition newOriginalPortDefinition) {
		PortDefinition oldOriginalPortDefinition = originalPortDefinition;
		originalPortDefinition = newOriginalPortDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION, oldOriginalPortDefinition, originalPortDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalPortDefinition() {
		return originalPortDefinition != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugatedPortDefinition getConjugatedPortDefinition() {
		return (ConjugatedPortDefinition)CONJUGATED_PORT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjugatedPortDefinition basicGetConjugatedPortDefinition() {
		return (ConjugatedPortDefinition)CONJUGATED_PORT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConjugatedPortDefinition(ConjugatedPortDefinition newConjugatedPortDefinition) {
		CONJUGATED_PORT_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newConjugatedPortDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConjugatedPortDefinition() {
		return basicGetConjugatedPortDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOriginalType() {
		return getOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetOriginalType() {
		return basicGetOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalType(Type newOriginalType) {
		if (newOriginalType != null && !(newOriginalType instanceof PortDefinition)) {
			throw new IllegalArgumentException("newOriginalType must be an instance of PortDefinition");
		}
		setOriginalPortDefinition((PortDefinition) newOriginalType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return getConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetOwningType() {
		return basicGetConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningType(Type newOwningType) {
		if (newOwningType != null && !(newOwningType instanceof ConjugatedPortDefinition)) {
			throw new IllegalArgumentException("newOwningType must be an instance of ConjugatedPortDefinition");
		}
		setConjugatedPortDefinition((ConjugatedPortDefinition) newOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION:
				if (resolve) return getOriginalPortDefinition();
				return basicGetOriginalPortDefinition();
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				if (resolve) return getConjugatedPortDefinition();
				return basicGetConjugatedPortDefinition();
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
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)newValue);
				return;
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				setConjugatedPortDefinition((ConjugatedPortDefinition)newValue);
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
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)null);
				return;
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				setConjugatedPortDefinition((ConjugatedPortDefinition)null);
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
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_TYPE:
				return isSetOriginalType();
			case SysMLPackage.PORT_CONJUGATION__OWNING_TYPE:
				return isSetOwningType();
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION:
				return isSetOriginalPortDefinition();
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				return isSetConjugatedPortDefinition();
		}
		return super.eIsSet(featureID);
	}

} //PortConjugationImpl
