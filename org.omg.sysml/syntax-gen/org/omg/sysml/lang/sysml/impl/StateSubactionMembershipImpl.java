/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Subaction Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateSubactionMembershipImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateSubactionMembershipImpl#getAction_comp <em>Action comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateSubactionMembershipImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateSubactionMembershipImpl extends FeatureMembershipImpl implements StateSubactionMembership {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final StateSubactionKind KIND_EDEFAULT = StateSubactionKind.ENTRY;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected StateSubactionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction_comp() <em>Action comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction_comp()
	 * @generated
	 * @ordered
	 */
	protected ActionUsage action_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSubactionMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STATE_SUBACTION_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateSubactionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(StateSubactionKind newKind) {
		StateSubactionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.STATE_SUBACTION_MEMBERSHIP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getAction_comp() {
		return action_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction_comp(ActionUsage newAction_comp, NotificationChain msgs) {
		ActionUsage oldAction_comp = action_comp;
		action_comp = newAction_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP, oldAction_comp, newAction_comp);
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
	public void setAction_comp(ActionUsage newAction_comp) {
		if (newAction_comp != action_comp) {
			NotificationChain msgs = null;
			if (action_comp != null)
				msgs = ((InternalEObject)action_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP, null, msgs);
			if (newAction_comp != null)
				msgs = ((InternalEObject)newAction_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP, null, msgs);
			msgs = basicSetAction_comp(newAction_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP, newAction_comp, newAction_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAction_comp() {
		return action_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getAction() {
		ActionUsage action = basicGetAction();
		return action != null && action.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)action) : action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionUsage basicGetAction() {
		return getAction_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setAction(ActionUsage newAction) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature_comp() {
		return getAction_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp, NotificationChain msgs) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof ActionUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of ActionUsage");
		}
		return basicSetAction_comp((ActionUsage) newOwnedMemberFeature_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof ActionUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of ActionUsage");
		}
		setAction_comp((ActionUsage) newOwnedMemberFeature_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature_comp() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP:
				return basicSetAction_comp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__KIND:
				return getKind();
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP:
				return getAction_comp();
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
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
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__KIND:
				setKind((StateSubactionKind)newValue);
				return;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP:
				setAction_comp((ActionUsage)newValue);
				return;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION:
				setAction((ActionUsage)newValue);
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
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP:
				setAction_comp((ActionUsage)null);
				return;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION:
				setAction((ActionUsage)null);
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
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP:
				return isSetOwnedMemberFeature_comp();
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__KIND:
				return kind != KIND_EDEFAULT;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION_COMP:
				return isSetAction_comp();
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__ACTION:
				return basicGetAction() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //StateSubactionMembershipImpl
