/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
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
	 * The cached setting delegate for the '{@link #getTargetArgument() <em>Target Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ASSIGNMENT_ACTION_USAGE__TARGET_ARGUMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getValueExpression() <em>Value Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VALUE_EXPRESSION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getReferent() <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferent()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REFERENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ASSIGNMENT_ACTION_USAGE__REFERENT).getSettingDelegate();

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
		return (Expression)TARGET_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetTargetArgument() {
		return (Expression)TARGET_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetArgument(Expression newTargetArgument) {
		TARGET_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTargetArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValueExpression() {
		return (Expression)VALUE_EXPRESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetValueExpression() {
		return (Expression)VALUE_EXPRESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueExpression(Expression newValueExpression) {
		VALUE_EXPRESSION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newValueExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getReferent() {
		return (Feature)REFERENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetReferent() {
		return (Feature)REFERENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferent(Feature newReferent) {
		REFERENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newReferent);
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
				return TARGET_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION:
				return VALUE_EXPRESSION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__REFERENT:
				return REFERENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //AssignmentActionUsageImpl
