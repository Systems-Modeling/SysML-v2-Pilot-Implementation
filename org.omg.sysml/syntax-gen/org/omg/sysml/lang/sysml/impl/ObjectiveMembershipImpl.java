/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ObjectiveMembershipImpl#getOwnedObjectiveRequirement <em>Owned Objective Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveMembershipImpl extends FeatureMembershipImpl implements ObjectiveMembership {
	/**
	 * The cached value of the '{@link #getOwnedObjectiveRequirement() <em>Owned Objective Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedObjectiveRequirement()
	 * @generated
	 * @ordered
	 */
	protected RequirementUsage ownedObjectiveRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OBJECTIVE_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getOwnedObjectiveRequirement() {
		if (ownedObjectiveRequirement != null && ownedObjectiveRequirement.eIsProxy()) {
			InternalEObject oldOwnedObjectiveRequirement = (InternalEObject)ownedObjectiveRequirement;
			ownedObjectiveRequirement = (RequirementUsage)eResolveProxy(oldOwnedObjectiveRequirement);
			if (ownedObjectiveRequirement != oldOwnedObjectiveRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT, oldOwnedObjectiveRequirement, ownedObjectiveRequirement));
			}
		}
		return ownedObjectiveRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementUsage basicGetOwnedObjectiveRequirement() {
		return ownedObjectiveRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedObjectiveRequirement(RequirementUsage newOwnedObjectiveRequirement) {
		RequirementUsage oldOwnedObjectiveRequirement = ownedObjectiveRequirement;
		ownedObjectiveRequirement = newOwnedObjectiveRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT, oldOwnedObjectiveRequirement, ownedObjectiveRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedObjectiveRequirement() {
		return ownedObjectiveRequirement != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT:
				if (resolve) return getOwnedObjectiveRequirement();
				return basicGetOwnedObjectiveRequirement();
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
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT:
				setOwnedObjectiveRequirement((RequirementUsage)newValue);
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
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT:
				setOwnedObjectiveRequirement((RequirementUsage)null);
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
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP:
				return isSetOwnedMemberFeature_comp();
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT:
				return isSetOwnedObjectiveRequirement();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature_comp() {
		return getOwnedObjectiveRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp, NotificationChain msgs) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of RequirementUsage");
		}
		setOwnedObjectiveRequirement((RequirementUsage) newOwnedMemberFeature_comp);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of RequirementUsage");
		}
		setOwnedObjectiveRequirement((RequirementUsage) newOwnedMemberFeature_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature_comp() {
  		return false;
	}

} //ObjectiveMembershipImpl
