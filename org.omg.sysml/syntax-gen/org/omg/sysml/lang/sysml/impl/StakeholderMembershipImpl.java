/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StakeholderMembershipImpl#getOwnedStakeholderParameter <em>Owned Stakeholder Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderMembershipImpl extends ParameterMembershipImpl implements StakeholderMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STAKEHOLDER_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartUsage getOwnedStakeholderParameter() {
		PartUsage ownedStakeholderParameter = basicGetOwnedStakeholderParameter();
		return ownedStakeholderParameter != null && ownedStakeholderParameter.eIsProxy() ? (PartUsage)eResolveProxy((InternalEObject)ownedStakeholderParameter) : ownedStakeholderParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartUsage basicGetOwnedStakeholderParameter() {
		// TODO: implement this method to return the 'Owned Stakeholder Parameter' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedStakeholderParameter(PartUsage newOwnedStakeholderParameter) {
		// TODO: implement this method to set the 'Owned Stakeholder Parameter' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.STAKEHOLDER_MEMBERSHIP__OWNED_STAKEHOLDER_PARAMETER:
				if (resolve) return getOwnedStakeholderParameter();
				return basicGetOwnedStakeholderParameter();
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
			case SysMLPackage.STAKEHOLDER_MEMBERSHIP__OWNED_STAKEHOLDER_PARAMETER:
				setOwnedStakeholderParameter((PartUsage)newValue);
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
			case SysMLPackage.STAKEHOLDER_MEMBERSHIP__OWNED_STAKEHOLDER_PARAMETER:
				setOwnedStakeholderParameter((PartUsage)null);
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
			case SysMLPackage.STAKEHOLDER_MEMBERSHIP__OWNED_STAKEHOLDER_PARAMETER:
				return basicGetOwnedStakeholderParameter() != null;
		}
		return super.eIsSet(featureID);
	}

} //StakeholderMembershipImpl
