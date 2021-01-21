/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.ConjugatedPortTyping;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugated Port Typing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortTypingImpl#getPortDefinition <em>Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortTypingImpl#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjugatedPortTypingImpl extends FeatureTypingImpl implements ConjugatedPortTyping {
	/**
	 * The cached value of the '{@link #getPortDefinition() <em>Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected PortDefinition portDefinition;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugatedPortTypingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONJUGATED_PORT_TYPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDefinition getPortDefinition() {
		if (portDefinition != null && portDefinition.eIsProxy()) {
			InternalEObject oldPortDefinition = (InternalEObject)portDefinition;
			portDefinition = (PortDefinition)eResolveProxy(oldPortDefinition);
			if (portDefinition != oldPortDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONJUGATED_PORT_TYPING__PORT_DEFINITION, oldPortDefinition, portDefinition));
			}
		}
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition basicGetPortDefinition() {
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortDefinition(PortDefinition newPortDefinition) {
		PortDefinition oldPortDefinition = portDefinition;
		portDefinition = newPortDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONJUGATED_PORT_TYPING__PORT_DEFINITION, oldPortDefinition, portDefinition));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newPortDefinition != null) {
				EList<Element> target = getTarget();
				if (!target.contains(newPortDefinition)) {
					target.add(newPortDefinition);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugatedPortDefinition getConjugatedPortDefinition() {
		ConjugatedPortDefinition conjugatedPortDefinition = basicGetConjugatedPortDefinition();
		return conjugatedPortDefinition != null && conjugatedPortDefinition.eIsProxy() ? (ConjugatedPortDefinition)eResolveProxy((InternalEObject)conjugatedPortDefinition) : conjugatedPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConjugatedPortDefinition basicGetConjugatedPortDefinition() {
		PortDefinition originalPortDefinition = getPortDefinition();
		return originalPortDefinition == null? null: originalPortDefinition.getConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConjugatedPortDefinition(ConjugatedPortDefinition newConjugatedPortDefinition) {
		setPortDefinition(newConjugatedPortDefinition == null? null: 
			newConjugatedPortDefinition.getOriginalPortDefinition());
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONJUGATED_PORT_TYPING__PORT_DEFINITION:
				if (resolve) return getPortDefinition();
				return basicGetPortDefinition();
			case SysMLPackage.CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION:
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
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Type general = getGeneral();
		if (general != null) {
			target.add(general);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.CONJUGATED_PORT_TYPING__PORT_DEFINITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return getConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetType() {
		return basicGetConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != null && !(newType instanceof ConjugatedPortDefinition)) {
			throw new IllegalArgumentException("newType must be an instance of ConjugatedPortDefinition");
		}
		setConjugatedPortDefinition((ConjugatedPortDefinition) newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.CONJUGATED_PORT_TYPING__PORT_DEFINITION:
				setPortDefinition((PortDefinition)newValue);
				return;
			case SysMLPackage.CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION:
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
			case SysMLPackage.CONJUGATED_PORT_TYPING__PORT_DEFINITION:
				setPortDefinition((PortDefinition)null);
				return;
			case SysMLPackage.CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION:
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
			case SysMLPackage.CONJUGATED_PORT_TYPING__TARGET:
				return isSetTarget();
			case SysMLPackage.CONJUGATED_PORT_TYPING__TYPE:
				return isSetType();
			case SysMLPackage.CONJUGATED_PORT_TYPING__PORT_DEFINITION:
				return portDefinition != null;
			case SysMLPackage.CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION:
				return isSetConjugatedPortDefinition();
		}
		return super.eIsSet(featureID);
	}

} //ConjugatedPortTypingImpl
