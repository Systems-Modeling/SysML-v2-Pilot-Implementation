/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.PortMembership;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortMembershipImpl#getMemberPort <em>Member Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortMembershipImpl extends FeatureMembershipImpl implements PortMembership {
	/**
	 * The cached value of the '{@link #getMemberPort() <em>Member Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberPort()
	 * @generated
	 * @ordered
	 */
	protected PortUsage memberPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PORT_MEMBERSHIP;
	}

	@Override
	public PortUsage getMemberPort() {
		return memberPort == null? basicGetMemberPort(): getMemberPortGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUsage getMemberPortGen() {
		if (memberPort != null && memberPort.eIsProxy()) {
			InternalEObject oldMemberPort = (InternalEObject)memberPort;
			memberPort = (PortUsage)eResolveProxy(oldMemberPort);
			if (memberPort != oldMemberPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.PORT_MEMBERSHIP__MEMBER_PORT, oldMemberPort, memberPort));
			}
		}
		return memberPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUsage basicGetMemberPort() {
		Element ownedMemberElement = getOwnedMemberElement();
		if (memberPort == null && ownedMemberElement instanceof PortUsage) {
			memberPort = (PortUsage)ownedMemberElement;
		}
		return memberPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberPort(PortUsage newMemberPort) {
		PortUsage oldMemberPort = memberPort;
		memberPort = newMemberPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.PORT_MEMBERSHIP__MEMBER_PORT, oldMemberPort, memberPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberPort() {
		return memberPort != null;
	}

	@Override
	public FeatureDirectionKind getDirection() {
		if (direction == null) {
			direction = FeatureDirectionKind.IN;
		}
		return direction;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PORT_MEMBERSHIP__MEMBER_PORT:
				if (resolve) return getMemberPort();
				return basicGetMemberPort();
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
			case SysMLPackage.PORT_MEMBERSHIP__MEMBER_PORT:
				setMemberPort((PortUsage)newValue);
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
			case SysMLPackage.PORT_MEMBERSHIP__MEMBER_PORT:
				setMemberPort((PortUsage)null);
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
			case SysMLPackage.PORT_MEMBERSHIP__MEMBER_FEATURE:
				return isSetMemberFeature();
			case SysMLPackage.PORT_MEMBERSHIP__MEMBER_PORT:
				return isSetMemberPort();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getMemberFeature() {
		return getMemberPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetMemberFeature() {
		return basicGetMemberPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberFeature(Feature newMemberFeature) {
		if (newMemberFeature != null && !(newMemberFeature instanceof PortUsage)) {
			throw new IllegalArgumentException("newMemberFeature must be an instance of PortUsage");
		}
		setMemberPort((PortUsage) newMemberFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberFeature() {
  		return false;
	}

} //PortMembershipImpl
