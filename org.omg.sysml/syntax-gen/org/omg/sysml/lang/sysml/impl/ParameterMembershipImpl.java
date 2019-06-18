/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl#getMemberParameter <em>Member Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl#getOwnedMemberParameter <em>Owned Member Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterMembershipImpl extends FeatureMembershipImpl implements ParameterMembership {
	/**
	 * The cached value of the '{@link #getMemberParameter() <em>Member Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter memberParameter;

	/**
	 * The cached value of the '{@link #getOwnedMemberParameter() <em>Owned Member Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter ownedMemberParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PARAMETER_MEMBERSHIP;
	}

	@Override
	public Parameter getMemberParameter() {
		return memberParameter == null? basicGetMemberParameter(): getMemberParameterGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getMemberParameterGen() {
		if (memberParameter != null && memberParameter.eIsProxy()) {
			InternalEObject oldMemberParameter = (InternalEObject)memberParameter;
			memberParameter = (Parameter)eResolveProxy(oldMemberParameter);
			if (memberParameter != oldMemberParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER, oldMemberParameter, memberParameter));
			}
		}
		return memberParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetMemberParameter() {
		return memberParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberParameter(Parameter newMemberParameter) {
		Parameter oldMemberParameter = memberParameter;
		memberParameter = newMemberParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER, oldMemberParameter, memberParameter));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (ownedMemberParameter != null && ownedMemberParameter != newMemberParameter) {
				setOwnedMemberParameter(null);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public Parameter getOwnedMemberParameter() {
		return ownedMemberParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberParameter(Parameter newOwnedMemberParameter, NotificationChain msgs) {
		Parameter oldOwnedMemberParameter = ownedMemberParameter;
		ownedMemberParameter = newOwnedMemberParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER, oldOwnedMemberParameter, newOwnedMemberParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwnedMemberParameter != null) {
				if (newOwnedMemberParameter != memberParameter) {
					setMemberParameter(newOwnedMemberParameter);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberParameter(Parameter newOwnedMemberParameter) {
		if (newOwnedMemberParameter != ownedMemberParameter) {
			NotificationChain msgs = null;
			if (ownedMemberParameter != null)
				msgs = ((InternalEObject)ownedMemberParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER, null, msgs);
			if (newOwnedMemberParameter != null)
				msgs = ((InternalEObject)newOwnedMemberParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER, null, msgs);
			msgs = basicSetOwnedMemberParameter(newOwnedMemberParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER, newOwnedMemberParameter, newOwnedMemberParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberParameter() {
		return ownedMemberParameter != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				return basicSetOwnedMemberParameter(null, msgs);
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
		if (newMemberFeature != null && !(newMemberFeature instanceof Parameter)) {
			throw new IllegalArgumentException("newMemberFeature must be an instance of Parameter");
		}
		setMemberParameter((Parameter) newMemberFeature);
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
	public Feature getOwnedMemberFeature() {
		return getOwnedMemberParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature(Feature newOwnedMemberFeature, NotificationChain msgs) {
		if (newOwnedMemberFeature != null && !(newOwnedMemberFeature instanceof Parameter)) {
			throw new IllegalArgumentException("newOwnedMemberFeature must be an instance of Parameter");
		}
		return basicSetOwnedMemberParameter((Parameter) newOwnedMemberFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature(Feature newOwnedMemberFeature) {
		if (newOwnedMemberFeature != null && !(newOwnedMemberFeature instanceof Parameter)) {
			throw new IllegalArgumentException("newOwnedMemberFeature must be an instance of Parameter");
		}
		setOwnedMemberParameter((Parameter) newOwnedMemberFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER:
				if (resolve) return getMemberParameter();
				return basicGetMemberParameter();
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				return getOwnedMemberParameter();
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER:
				setMemberParameter((Parameter)newValue);
				return;
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				setOwnedMemberParameter((Parameter)newValue);
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER:
				setMemberParameter((Parameter)null);
				return;
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				setOwnedMemberParameter((Parameter)null);
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_PARAMETER:
				return isSetMemberParameter();
			case SysMLPackage.PARAMETER_MEMBERSHIP__MEMBER_FEATURE:
				return isSetMemberFeature();
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				return isSetOwnedMemberFeature();
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				return isSetOwnedMemberParameter();
		}
		return super.eIsSet(featureID);
	}

} //ParameterMembershipImpl
