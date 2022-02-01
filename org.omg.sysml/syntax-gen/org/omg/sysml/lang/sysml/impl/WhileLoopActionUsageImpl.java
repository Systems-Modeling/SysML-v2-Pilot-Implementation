/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.WhileLoopActionUsage;
import org.omg.sysml.util.TypeUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.WhileLoopActionUsageImpl#getWhileArgument <em>While Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.WhileLoopActionUsageImpl#getUntilArgument <em>Until Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileLoopActionUsageImpl extends LoopActionUsageImpl implements WhileLoopActionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoopActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.WHILE_LOOP_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWhileArgument() {
		Expression whileArgument = basicGetWhileArgument();
		return whileArgument != null && whileArgument.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)whileArgument) : whileArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetWhileArgument() {
		return TypeUtil.getOwnedParameterOf(this, 0, Expression.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setWhileArgument(Expression newWhileArgument) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUntilArgument() {
		Expression untilArgument = basicGetUntilArgument();
		return untilArgument != null && untilArgument.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)untilArgument) : untilArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetUntilArgument() {
		return TypeUtil.getOwnedParameterOf(this, 2, Expression.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setUntilArgument(Expression newUntilArgument) {
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
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT:
				if (resolve) return getWhileArgument();
				return basicGetWhileArgument();
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT:
				if (resolve) return getUntilArgument();
				return basicGetUntilArgument();
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
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT:
				setWhileArgument((Expression)newValue);
				return;
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT:
				setUntilArgument((Expression)newValue);
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
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT:
				setWhileArgument((Expression)null);
				return;
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT:
				setUntilArgument((Expression)null);
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
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT:
				return basicGetWhileArgument() != null;
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT:
				return basicGetUntilArgument() != null;
		}
		return super.eIsSet(featureID);
	}

} //WhileLoopActionUsageImpl
