/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionFeatureMembershipImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionFeatureMembershipImpl#getTransitionFeature_comp <em>Transition Feature comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionFeatureMembershipImpl#getTransitionFeature <em>Transition Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionFeatureMembershipImpl extends FeatureMembershipImpl implements TransitionFeatureMembership {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionFeatureKind KIND_EDEFAULT = TransitionFeatureKind.TRIGGER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransitionFeatureKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitionFeature_comp() <em>Transition Feature comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionFeature_comp()
	 * @generated
	 * @ordered
	 */
	protected Step transitionFeature_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionFeatureMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TRANSITION_FEATURE_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionFeatureKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(TransitionFeatureKind newKind) {
		TransitionFeatureKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getTransitionFeature_comp() {
		return transitionFeature_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionFeature_comp(Step newTransitionFeature_comp, NotificationChain msgs) {
		Step oldTransitionFeature_comp = transitionFeature_comp;
		transitionFeature_comp = newTransitionFeature_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP, oldTransitionFeature_comp, newTransitionFeature_comp);
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
	public void setTransitionFeature_comp(Step newTransitionFeature_comp) {
		if (newTransitionFeature_comp != transitionFeature_comp) {
			NotificationChain msgs = null;
			if (transitionFeature_comp != null)
				msgs = ((InternalEObject)transitionFeature_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP, null, msgs);
			if (newTransitionFeature_comp != null)
				msgs = ((InternalEObject)newTransitionFeature_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP, null, msgs);
			msgs = basicSetTransitionFeature_comp(newTransitionFeature_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP, newTransitionFeature_comp, newTransitionFeature_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransitionFeature_comp() {
		return transitionFeature_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getTransitionFeature() {
		Step transitionFeature = basicGetTransitionFeature();
		return transitionFeature != null && transitionFeature.eIsProxy() ? (Step)eResolveProxy((InternalEObject)transitionFeature) : transitionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Step basicGetTransitionFeature() {
		return getTransitionFeature_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTransitionFeature(Step newTransitionFeature) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature_comp() {
		return getTransitionFeature_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp, NotificationChain msgs) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof Step)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of Step");
		}
		return basicSetTransitionFeature_comp((Step) newOwnedMemberFeature_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof Step)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of Step");
		}
		setTransitionFeature_comp((Step) newOwnedMemberFeature_comp);
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
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP:
				return basicSetTransitionFeature_comp(null, msgs);
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
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__KIND:
				return getKind();
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP:
				return getTransitionFeature_comp();
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE:
				if (resolve) return getTransitionFeature();
				return basicGetTransitionFeature();
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
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__KIND:
				setKind((TransitionFeatureKind)newValue);
				return;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP:
				setTransitionFeature_comp((Step)newValue);
				return;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE:
				setTransitionFeature((Step)newValue);
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
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP:
				setTransitionFeature_comp((Step)null);
				return;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE:
				setTransitionFeature((Step)null);
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
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP:
				return isSetOwnedMemberFeature_comp();
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__KIND:
				return kind != KIND_EDEFAULT;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP:
				return isSetTransitionFeature_comp();
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE:
				return basicGetTransitionFeature() != null;
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

} //TransitionFeatureMembershipImpl
