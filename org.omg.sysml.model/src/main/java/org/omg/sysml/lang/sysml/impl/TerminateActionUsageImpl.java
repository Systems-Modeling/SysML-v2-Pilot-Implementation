/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TerminateActionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminate Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TerminateActionUsageImpl#getTerminatedOccurrenceArgument <em>Terminated Occurrence Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminateActionUsageImpl extends ActionUsageImpl implements TerminateActionUsage {
	/**
	 * The cached setting delegate for the '{@link #getTerminatedOccurrenceArgument() <em>Terminated Occurrence Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminatedOccurrenceArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TERMINATED_OCCURRENCE_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TERMINATE_ACTION_USAGE__TERMINATED_OCCURRENCE_ARGUMENT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminateActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TERMINATE_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getTerminatedOccurrenceArgument() {
		return (Expression)TERMINATED_OCCURRENCE_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetTerminatedOccurrenceArgument() {
		return (Expression)TERMINATED_OCCURRENCE_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminatedOccurrenceArgument(Expression newTerminatedOccurrenceArgument) {
		TERMINATED_OCCURRENCE_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTerminatedOccurrenceArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.TERMINATE_ACTION_USAGE__TERMINATED_OCCURRENCE_ARGUMENT:
				if (resolve) return getTerminatedOccurrenceArgument();
				return basicGetTerminatedOccurrenceArgument();
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
			case SysMLPackage.TERMINATE_ACTION_USAGE__TERMINATED_OCCURRENCE_ARGUMENT:
				setTerminatedOccurrenceArgument((Expression)newValue);
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
			case SysMLPackage.TERMINATE_ACTION_USAGE__TERMINATED_OCCURRENCE_ARGUMENT:
				setTerminatedOccurrenceArgument((Expression)null);
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
			case SysMLPackage.TERMINATE_ACTION_USAGE__TERMINATED_OCCURRENCE_ARGUMENT:
				return TERMINATED_OCCURRENCE_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //TerminateActionUsageImpl
