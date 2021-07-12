/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.IfActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IfActionUsageImpl#getElseAction <em>Else Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IfActionUsageImpl#getThenAction <em>Then Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IfActionUsageImpl#getIfArgument <em>If Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfActionUsageImpl extends ActionUsageImpl implements IfActionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.IF_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getElseAction() {
		ActionUsage elseAction = basicGetElseAction();
		return elseAction != null && elseAction.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)elseAction) : elseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetElseAction() {
		// TODO: implement this method to return the 'Else Action' reference
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
	public void setElseAction(ActionUsage newElseAction) {
		// TODO: implement this method to set the 'Else Action' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getThenAction() {
		ActionUsage thenAction = basicGetThenAction();
		return thenAction != null && thenAction.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)thenAction) : thenAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetThenAction() {
		// TODO: implement this method to return the 'Then Action' reference
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
	public void setThenAction(ActionUsage newThenAction) {
		// TODO: implement this method to set the 'Then Action' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getIfArgument() {
		Expression ifArgument = basicGetIfArgument();
		return ifArgument != null && ifArgument.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)ifArgument) : ifArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetIfArgument() {
		// TODO: implement this method to return the 'If Argument' reference
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
	public void setIfArgument(Expression newIfArgument) {
		// TODO: implement this method to set the 'If Argument' reference
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
			case SysMLPackage.IF_ACTION_USAGE__ELSE_ACTION:
				if (resolve) return getElseAction();
				return basicGetElseAction();
			case SysMLPackage.IF_ACTION_USAGE__THEN_ACTION:
				if (resolve) return getThenAction();
				return basicGetThenAction();
			case SysMLPackage.IF_ACTION_USAGE__IF_ARGUMENT:
				if (resolve) return getIfArgument();
				return basicGetIfArgument();
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
			case SysMLPackage.IF_ACTION_USAGE__ELSE_ACTION:
				setElseAction((ActionUsage)newValue);
				return;
			case SysMLPackage.IF_ACTION_USAGE__THEN_ACTION:
				setThenAction((ActionUsage)newValue);
				return;
			case SysMLPackage.IF_ACTION_USAGE__IF_ARGUMENT:
				setIfArgument((Expression)newValue);
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
			case SysMLPackage.IF_ACTION_USAGE__ELSE_ACTION:
				setElseAction((ActionUsage)null);
				return;
			case SysMLPackage.IF_ACTION_USAGE__THEN_ACTION:
				setThenAction((ActionUsage)null);
				return;
			case SysMLPackage.IF_ACTION_USAGE__IF_ARGUMENT:
				setIfArgument((Expression)null);
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
			case SysMLPackage.IF_ACTION_USAGE__ELSE_ACTION:
				return basicGetElseAction() != null;
			case SysMLPackage.IF_ACTION_USAGE__THEN_ACTION:
				return basicGetThenAction() != null;
			case SysMLPackage.IF_ACTION_USAGE__IF_ARGUMENT:
				return basicGetIfArgument() != null;
		}
		return super.eIsSet(featureID);
	}

} //IfActionUsageImpl
