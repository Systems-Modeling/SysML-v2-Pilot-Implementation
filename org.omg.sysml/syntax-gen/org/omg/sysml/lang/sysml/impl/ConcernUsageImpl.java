/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.ConcernDefinition;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concern Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConcernUsageImpl#getConcernDefinition <em>Concern Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcernUsageImpl extends RequirementUsageImpl implements ConcernUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONCERN_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernDefinition getConcernDefinition() {
		ConcernDefinition concernDefinition = basicGetConcernDefinition();
		return concernDefinition != null && concernDefinition.eIsProxy() ? (ConcernDefinition)eResolveProxy((InternalEObject)concernDefinition) : concernDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernDefinition basicGetConcernDefinition() {
		RequirementDefinition definition = super.basicGetRequirementDefinition();
		return definition instanceof ConcernDefinition? (ConcernDefinition)definition: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConcernDefinition(ConcernDefinition newConcernDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcernDefinition() {
		return basicGetConcernDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONCERN_USAGE__CONCERN_DEFINITION:
				if (resolve) return getConcernDefinition();
				return basicGetConcernDefinition();
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
			case SysMLPackage.CONCERN_USAGE__CONCERN_DEFINITION:
				setConcernDefinition((ConcernDefinition)newValue);
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
			case SysMLPackage.CONCERN_USAGE__CONCERN_DEFINITION:
				setConcernDefinition((ConcernDefinition)null);
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
			case SysMLPackage.CONCERN_USAGE__REQUIREMENT_DEFINITION:
				return isSetRequirementDefinition();
			case SysMLPackage.CONCERN_USAGE__CONCERN_DEFINITION:
				return isSetConcernDefinition();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementDefinition getRequirementDefinition() {
		return getConcernDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementDefinition basicGetRequirementDefinition() {
		return basicGetConcernDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementDefinition(RequirementDefinition newRequirementDefinition) {
		if (newRequirementDefinition != null && !(newRequirementDefinition instanceof ConcernDefinition)) {
			throw new IllegalArgumentException("newRequirementDefinition must be an instance of ConcernDefinition");
		}
		setConcernDefinition((ConcernDefinition) newRequirementDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequirementDefinition() {
  		return false;
	}

} //ConcernUsageImpl
