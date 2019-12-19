/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.sysml.lang.sysml.AtomicInteraction;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Atomic
 * Interaction</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AtomicInteractionImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicInteractionImpl extends MinimalEObjectImpl.Container implements AtomicInteraction {
	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> itemType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ATOMIC_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getItemType() {
		if (itemType == null) {
			itemType = new EObjectResolvingEList<Classifier>(Classifier.class, this, SysMLPackage.ATOMIC_INTERACTION__ITEM_TYPE);
		}
		return itemType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ATOMIC_INTERACTION__ITEM_TYPE:
				return getItemType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.ATOMIC_INTERACTION__ITEM_TYPE:
				getItemType().clear();
				getItemType().addAll((Collection<? extends Classifier>)newValue);
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
			case SysMLPackage.ATOMIC_INTERACTION__ITEM_TYPE:
				getItemType().clear();
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
			case SysMLPackage.ATOMIC_INTERACTION__ITEM_TYPE:
				return itemType != null && !itemType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // AtomicInteractionImpl
