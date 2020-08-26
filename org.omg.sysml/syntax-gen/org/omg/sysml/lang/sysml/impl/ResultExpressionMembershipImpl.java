/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Expression Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ResultExpressionMembershipImpl#getOwnedResultExpression_comp <em>Owned Result Expression comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ResultExpressionMembershipImpl#getOwnedResultExpression <em>Owned Result Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultExpressionMembershipImpl extends FeatureMembershipImpl implements ResultExpressionMembership {
	/**
	 * The cached value of the '{@link #getOwnedResultExpression_comp() <em>Owned Result Expression comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedResultExpression_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression ownedResultExpression_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultExpressionMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.RESULT_EXPRESSION_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOwnedResultExpression_comp() {
		return ownedResultExpression_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedResultExpression_comp(Expression newOwnedResultExpression_comp, NotificationChain msgs) {
		Expression oldOwnedResultExpression_comp = ownedResultExpression_comp;
		ownedResultExpression_comp = newOwnedResultExpression_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP, oldOwnedResultExpression_comp, newOwnedResultExpression_comp);
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
	public void setOwnedResultExpression_comp(Expression newOwnedResultExpression_comp) {
		if (newOwnedResultExpression_comp != ownedResultExpression_comp) {
			NotificationChain msgs = null;
			if (ownedResultExpression_comp != null)
				msgs = ((InternalEObject)ownedResultExpression_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP, null, msgs);
			if (newOwnedResultExpression_comp != null)
				msgs = ((InternalEObject)newOwnedResultExpression_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP, null, msgs);
			msgs = basicSetOwnedResultExpression_comp(newOwnedResultExpression_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP, newOwnedResultExpression_comp, newOwnedResultExpression_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedResultExpression_comp() {
		return ownedResultExpression_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOwnedResultExpression() {
		Expression ownedResultExpression = basicGetOwnedResultExpression();
		return ownedResultExpression != null && ownedResultExpression.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)ownedResultExpression) : ownedResultExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetOwnedResultExpression() {
		return getOwnedResultExpression_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedResultExpression(Expression newOwnedResultExpression) {
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
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP:
				return basicSetOwnedResultExpression_comp(null, msgs);
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
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP:
				return getOwnedResultExpression_comp();
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION:
				if (resolve) return getOwnedResultExpression();
				return basicGetOwnedResultExpression();
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
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP:
				setOwnedResultExpression_comp((Expression)newValue);
				return;
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION:
				setOwnedResultExpression((Expression)newValue);
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
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP:
				setOwnedResultExpression_comp((Expression)null);
				return;
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION:
				setOwnedResultExpression((Expression)null);
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
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP:
				return isSetOwnedMemberFeature_comp();
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION_COMP:
				return isSetOwnedResultExpression_comp();
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION:
				return basicGetOwnedResultExpression() != null;
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
		return getOwnedResultExpression_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp, NotificationChain msgs) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of Expression");
		}
		return basicSetOwnedResultExpression_comp((Expression) newOwnedMemberFeature_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of Expression");
		}
		setOwnedResultExpression_comp((Expression) newOwnedMemberFeature_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature_comp() {
  		return false;
	}

} //ResultExpressionMembershipImpl
