/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

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
	 * @generated NOT
	 */
	public Expression basicGetTargetArgument() {
		List<Feature> parameters = TypeUtil.getOwnedParametersOf(this);
		return parameters.isEmpty()? null: FeatureUtil.getValueExpressionFor(parameters.get(0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTargetArgument(Expression newTargetArgument) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValueExpression() {
		Expression valueExpression = basicGetValueExpression();
		return valueExpression != null && valueExpression.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)valueExpression) : valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetValueExpression() {
		List<Feature> parameters = TypeUtil.getOwnedParametersOf(this);
		return parameters.size() < 2? null: FeatureUtil.getValueExpressionFor(parameters.get(1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueExpression(Expression newValueExpression) {
		throw new UnsupportedOperationException();
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
	 * @generated NOT
	 */
	public Feature basicGetReferent() {
		return (Feature) getOwnedMembership().stream().
				map(Membership::getMemberElement).
				filter(e->e instanceof Feature && !FeatureUtil.isParameter((Feature)e)).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setReferent(Feature newReferent) {
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
				return basicGetValueExpression() != null;
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE__REFERENT:
				return basicGetReferent() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentActionUsageImpl
