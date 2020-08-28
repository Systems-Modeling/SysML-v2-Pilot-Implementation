/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Case Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VerificationCaseDefinitionImpl extends CaseDefinitionImpl implements VerificationCaseDefinition {
	
	public static final String VERIFICATION_CASE_DEFINITION_SUPERCLASS_DEFAULT = "Verifications::VerificationCase";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationCaseDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VERIFICATION_CASE_DEFINITION;
	}

	@Override
	protected String getDefaultSupertype() {
		return VERIFICATION_CASE_DEFINITION_SUPERCLASS_DEFAULT;
	}

} //VerificationCaseDefinitionImpl
