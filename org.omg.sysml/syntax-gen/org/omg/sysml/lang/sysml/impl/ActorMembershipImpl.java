/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActorMembershipImpl#getOwnedActorParameter <em>Owned Actor Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorMembershipImpl extends ParameterMembershipImpl implements ActorMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACTOR_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartUsage getOwnedActorParameter() {
		PartUsage ownedActorParameter = basicGetOwnedActorParameter();
		return ownedActorParameter != null && ownedActorParameter.eIsProxy() ? (PartUsage)eResolveProxy((InternalEObject)ownedActorParameter) : ownedActorParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PartUsage basicGetOwnedActorParameter() {
		Feature ownedActorParameter = super.getOwnedMemberFeature();
		return ownedActorParameter instanceof PartUsage? (PartUsage)ownedActorParameter: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedActorParameter(PartUsage newOwnedActorParameter) {
		super.setOwnedMemberParameter(newOwnedActorParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedActorParameter() {
		return basicGetOwnedActorParameter() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ACTOR_MEMBERSHIP__OWNED_ACTOR_PARAMETER:
				if (resolve) return getOwnedActorParameter();
				return basicGetOwnedActorParameter();
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
			case SysMLPackage.ACTOR_MEMBERSHIP__OWNED_ACTOR_PARAMETER:
				setOwnedActorParameter((PartUsage)newValue);
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
			case SysMLPackage.ACTOR_MEMBERSHIP__OWNED_ACTOR_PARAMETER:
				setOwnedActorParameter((PartUsage)null);
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
			case SysMLPackage.ACTOR_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				return isSetOwnedMemberParameter();
			case SysMLPackage.ACTOR_MEMBERSHIP__OWNED_ACTOR_PARAMETER:
				return isSetOwnedActorParameter();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getOwnedMemberParameter() {
		return getOwnedActorParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetOwnedMemberParameter() {
		return basicGetOwnedActorParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberParameter(Feature newOwnedMemberParameter) {
		if (newOwnedMemberParameter != null && !(newOwnedMemberParameter instanceof PartUsage)) {
			throw new IllegalArgumentException("newOwnedMemberParameter must be an instance of PartUsage");
		}
		setOwnedActorParameter((PartUsage) newOwnedMemberParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberParameter() {
  		return false;
	}

} //ActorMembershipImpl
