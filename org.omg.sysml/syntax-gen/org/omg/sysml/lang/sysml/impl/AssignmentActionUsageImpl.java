/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssignmentActionUsageImpl#getTargetArgument <em>Target Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssignmentActionUsageImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssignmentActionUsageImpl#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentActionUsageImpl extends ActionUsageImpl implements AssignmentActionUsage {
	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression valueExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSIGNMENT_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getTargetArgument() {
		Expression targetArgument = basicGetTargetArgument();
		return targetArgument != null && targetArgument.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)targetArgument) : targetArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetTargetArgument() {
		// TODO: implement this method to return the 'Target Argument' reference
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
	public void setTargetArgument(Expression newTargetArgument) {
		// TODO: implement this method to set the 'Target Argument' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValueExpression() {
		if (valueExpression != null && valueExpression.eIsProxy()) {
			InternalEObject oldValueExpression = (InternalEObject)valueExpression;
			valueExpression = (Expression)eResolveProxy(oldValueExpression);
			if (valueExpression != oldValueExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION, oldValueExpression, valueExpression));
			}
		}
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueExpression(Expression newValueExpression) {
		Expression oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION, oldValueExpression, valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getReferent() {
		Feature referent = basicGetReferent();
		return referent != null && referent.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)referent) : referent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetReferent() {
		// TODO: implement this method to return the 'Referent' reference
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
	public void setReferent(Feature newReferent) {
		// TODO: implement this method to set the 'Referent' reference
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
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__TARGET_ARGUMENT:
				if (resolve) return getTargetArgument();
				return basicGetTargetArgument();
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION:
				if (resolve) return getValueExpression();
				return basicGetValueExpression();
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__REFERENT:
				if (resolve) return getReferent();
				return basicGetReferent();
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
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__TARGET_ARGUMENT:
				setTargetArgument((Expression)newValue);
				return;
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION:
				setValueExpression((Expression)newValue);
				return;
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__REFERENT:
				setReferent((Feature)newValue);
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
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__TARGET_ARGUMENT:
				setTargetArgument((Expression)null);
				return;
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION:
				setValueExpression((Expression)null);
				return;
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__REFERENT:
				setReferent((Feature)null);
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
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__TARGET_ARGUMENT:
				return basicGetTargetArgument() != null;
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION:
				return valueExpression != null;
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__REFERENT:
				return basicGetReferent() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentActionUsageImpl
