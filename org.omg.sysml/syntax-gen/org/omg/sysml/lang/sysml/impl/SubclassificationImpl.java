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

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Subclassification;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Superclassing</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubclassificationImpl#getSuperclassifier <em>Superclassifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubclassificationImpl#getOwningClassifier <em>Owning Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubclassificationImpl#getSubclassifier <em>Subclassifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubclassificationImpl extends SpecializationImpl implements Subclassification {
	/**
	 * The cached value of the '{@link #getSuperclassifier() <em>Superclassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier superclassifier;

	/**
	 * The cached setting delegate for the '{@link #getOwningClassifier() <em>Owning Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClassifier()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_CLASSIFIER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SUBCLASSIFICATION__OWNING_CLASSIFIER).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getSubclassifier() <em>Subclassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclassifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier subclassifier;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SubclassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public Classifier getSuperclassifier() {
		if (superclassifier != null && superclassifier.eIsProxy()) {
			InternalEObject oldSuperclassifier = (InternalEObject)superclassifier;
			superclassifier = (Classifier)eResolveProxy(oldSuperclassifier);
			if (superclassifier != oldSuperclassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBCLASSIFICATION__SUPERCLASSIFIER, oldSuperclassifier, superclassifier));
			}
		}
		return superclassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetSuperclassifier() {
		return superclassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperclassifier(Classifier newSuperclassifier) {
		Classifier oldSuperclassifier = superclassifier;
		superclassifier = newSuperclassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBCLASSIFICATION__SUPERCLASSIFIER, oldSuperclassifier, superclassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperclassifier() {
		return superclassifier != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier getOwningClassifier() {
		return (Classifier)OWNING_CLASSIFIER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetOwningClassifier() {
		return (Classifier)OWNING_CLASSIFIER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningClassifier(Classifier newOwningClassifier) {
		OWNING_CLASSIFIER__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningClassifier);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningClassifier() {
		return basicGetOwningClassifier() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public org.omg.sysml.lang.sysml.Classifier getSubclassifier() {
		return subclassifier == null ? basicGetSubclassifier() : getSubclassifierGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSubclassifierGen() {
		if (subclassifier != null && subclassifier.eIsProxy()) {
			InternalEObject oldSubclassifier = (InternalEObject)subclassifier;
			subclassifier = (Classifier)eResolveProxy(oldSubclassifier);
			if (subclassifier != oldSubclassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBCLASSIFICATION__SUBCLASSIFIER, oldSubclassifier, subclassifier));
			}
		}
		return subclassifier;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Xtext workaround:
	 * If the subclassifier is empty, then set it to the owningRelatedElement,
	 * if this is a Classifier.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public org.omg.sysml.lang.sysml.Classifier basicGetSubclassifier() {
		if (subclassifier == null) {
			Element owner = getOwningRelatedElement();
			if (owner instanceof Classifier) {
				subclassifier = (Classifier) owner;
			}
		}
		return subclassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubclassifier(Classifier newSubclassifier) {
		Classifier oldSubclassifier = subclassifier;
		subclassifier = newSubclassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBCLASSIFICATION__SUBCLASSIFIER, oldSubclassifier, subclassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubclassifier() {
		return subclassifier != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getGeneral() {
		return getSuperclassifier();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetGeneral() {
		return basicGetSuperclassifier();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Type newGeneral) {
		if (newGeneral != null && !(newGeneral instanceof Classifier)) {
			throw new IllegalArgumentException("newGeneral must be an instance of Classifier");
		}
		setSuperclassifier((Classifier) newGeneral);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeneral() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getSpecific() {
		return getSubclassifier();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetSpecific() {
		return basicGetSubclassifier();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Type newSpecific) {
		if (newSpecific != null && !(newSpecific instanceof Classifier)) {
			throw new IllegalArgumentException("newSpecific must be an instance of Classifier");
		}
		setSubclassifier((Classifier) newSpecific);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecific() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return getOwningClassifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetOwningType() {
		return basicGetOwningClassifier();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningType(Type newOwningType) {
		if (newOwningType != null && !(newOwningType instanceof Classifier)) {
			throw new IllegalArgumentException("newOwningType must be an instance of Classifier");
		}
		setOwningClassifier((Classifier) newOwningType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SUBCLASSIFICATION__SUPERCLASSIFIER:
				if (resolve) return getSuperclassifier();
				return basicGetSuperclassifier();
			case SysMLPackage.SUBCLASSIFICATION__OWNING_CLASSIFIER:
				if (resolve) return getOwningClassifier();
				return basicGetOwningClassifier();
			case SysMLPackage.SUBCLASSIFICATION__SUBCLASSIFIER:
				if (resolve) return getSubclassifier();
				return basicGetSubclassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.SUBCLASSIFICATION__SUPERCLASSIFIER:
				setSuperclassifier((Classifier)newValue);
				return;
			case SysMLPackage.SUBCLASSIFICATION__OWNING_CLASSIFIER:
				setOwningClassifier((Classifier)newValue);
				return;
			case SysMLPackage.SUBCLASSIFICATION__SUBCLASSIFIER:
				setSubclassifier((Classifier)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.SUBCLASSIFICATION__SUPERCLASSIFIER:
				setSuperclassifier((Classifier)null);
				return;
			case SysMLPackage.SUBCLASSIFICATION__OWNING_CLASSIFIER:
				setOwningClassifier((Classifier)null);
				return;
			case SysMLPackage.SUBCLASSIFICATION__SUBCLASSIFIER:
				setSubclassifier((Classifier)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.SUBCLASSIFICATION__GENERAL:
				return isSetGeneral();
			case SysMLPackage.SUBCLASSIFICATION__OWNING_TYPE:
				return isSetOwningType();
			case SysMLPackage.SUBCLASSIFICATION__SPECIFIC:
				return isSetSpecific();
			case SysMLPackage.SUBCLASSIFICATION__SUPERCLASSIFIER:
				return isSetSuperclassifier();
			case SysMLPackage.SUBCLASSIFICATION__OWNING_CLASSIFIER:
				return isSetOwningClassifier();
			case SysMLPackage.SUBCLASSIFICATION__SUBCLASSIFIER:
				return isSetSubclassifier();
		}
		return super.eIsSet(featureID);
	}

} // SuperclassingImpl
