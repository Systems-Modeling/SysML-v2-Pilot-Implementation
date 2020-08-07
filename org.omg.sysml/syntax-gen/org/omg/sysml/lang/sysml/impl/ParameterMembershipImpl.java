/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Parameter Membership</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl#getOwnedMemberParameter_comp <em>Owned Member Parameter comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl#getMemberParameter <em>Member Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl#getOwnedMemberParameter <em>Owned Member Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterMembershipImpl extends FeatureMembershipImpl implements ParameterMembership {
	/**
	 * The cached value of the '{@link #getOwnedMemberParameter_comp() <em>Owned Member Parameter comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberParameter_comp()
	 * @generated
	 * @ordered
	 */
	protected Feature ownedMemberParameter_comp;

	/**
	 * The cached value of the '{@link #getMemberParameter() <em>Member Parameter</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMemberParameter()
	 * @generated
	 * @ordered
	 */
	protected Feature memberParameter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PARAMETER_MEMBERSHIP;
	}

	@Override
	public Feature getMemberParameter() {
		return memberParameter == null ? basicGetMemberParameter() : getMemberParameterGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getMemberParameterGen() {
		if (memberParameter != null && memberParameter.eIsProxy()) {
			InternalEObject oldMemberParameter = (InternalEObject)memberParameter;
			memberParameter = (Feature)eResolveProxy(oldMemberParameter);
			if (memberParameter != oldMemberParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER, oldMemberParameter, memberParameter));
			}
		}
		return memberParameter;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Note: This is still necessary, because the Xtext lazy linker clears the memberParameter value set via a
	 * call to setOwnedMemberParameter, but does not install a proxy.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Feature basicGetMemberParameter() {
		Feature ownedMemberParameter = getOwnedMemberParameter();
		if (memberParameter == null && ownedMemberParameter != null) {
			memberParameter = ownedMemberParameter;
		}
		return memberParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberParameter(Feature newMemberParameter) {
		Feature oldMemberParameter = memberParameter;
		memberParameter = newMemberParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER, oldMemberParameter, memberParameter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberParameter() {
		return memberParameter != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberParameter_comp() {
		return ownedMemberParameter_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberParameter_comp(Feature newOwnedMemberParameter_comp, NotificationChain msgs) {
		Feature oldOwnedMemberParameter_comp = ownedMemberParameter_comp;
		ownedMemberParameter_comp = newOwnedMemberParameter_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP, oldOwnedMemberParameter_comp, newOwnedMemberParameter_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberParameter_comp(Feature newOwnedMemberParameter_comp) {
		if (newOwnedMemberParameter_comp != ownedMemberParameter_comp) {
			NotificationChain msgs = null;
			if (ownedMemberParameter_comp != null)
				msgs = ((InternalEObject)ownedMemberParameter_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP, null, msgs);
			if (newOwnedMemberParameter_comp != null)
				msgs = ((InternalEObject)newOwnedMemberParameter_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP, null, msgs);
			msgs = basicSetOwnedMemberParameter_comp(newOwnedMemberParameter_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP, newOwnedMemberParameter_comp, newOwnedMemberParameter_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberParameter_comp() {
		return ownedMemberParameter_comp != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberParameter() {
		Feature ownedMemberParameter = basicGetOwnedMemberParameter();
		return ownedMemberParameter != null && ownedMemberParameter.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)ownedMemberParameter) : ownedMemberParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetOwnedMemberParameter() {
		return getOwnedMemberParameter_comp();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedMemberParameter(Feature newOwnedMemberParameter) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP:
				return basicSetOwnedMemberParameter_comp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getMemberFeature() {
		return getMemberParameter();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetMemberFeature() {
		return basicGetMemberParameter();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberFeature(Feature newMemberFeature) {
		setMemberParameter(newMemberFeature);
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature_comp() {
		return getOwnedMemberParameter_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp, NotificationChain msgs) {
		return basicSetOwnedMemberParameter_comp(newOwnedMemberFeature_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp) {
		setOwnedMemberParameter_comp(newOwnedMemberFeature_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature_comp() {
  		return false;
	}

	@Override
	public FeatureDirectionKind getDirection() {
		if (direction == null) {
			direction = FeatureDirectionKind.IN;
		}
		return direction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP:
				return getOwnedMemberParameter_comp();
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER:
				if (resolve) return getMemberParameter();
				return basicGetMemberParameter();
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				if (resolve) return getOwnedMemberParameter();
				return basicGetOwnedMemberParameter();
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP:
				setOwnedMemberParameter_comp((Feature)newValue);
				return;
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER:
				setMemberParameter((Feature)newValue);
				return;
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				setOwnedMemberParameter((Feature)newValue);
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP:
				setOwnedMemberParameter_comp((Feature)null);
				return;
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER:
				setMemberParameter((Feature)null);
				return;
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				setOwnedMemberParameter((Feature)null);
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP:
				return isSetOwnedMemberFeature_comp();
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_FEATURE:
				return isSetMemberFeature();
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP:
				return isSetOwnedMemberParameter_comp();
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER:
				return isSetMemberParameter();
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				return basicGetOwnedMemberParameter() != null;
		}
		return super.eIsSet(featureID);
	}

} // ParameterMembershipImpl
