/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A UseCaseUsage is a Usage of a UseCaseDefinition.</p>
 * 
 * <p>A UseCaseUsage must subset, directly or indirectly, either the base UseCaseUsage <em><code>useCases</code></em> from the Systems model library. If it is owned by a UseCaseDefinition or UseCaseUsage then it must subset the UseCaseUsage <em><code>UseCase::subUseCases</code></em>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.UseCaseUsage#getUseCaseDefinition <em>Use Case Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.UseCaseUsage#getIncludedUseCase <em>Included Use Case</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUseCaseUsage()
 * @model
 * @generated
 */
public interface UseCaseUsage extends CaseUsage {
	/**
	 * Returns the value of the '<em><b>Use Case Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.CaseUsage#getCaseDefinition() <em>Case Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The UseCaseDefinition that is the type of this UseCaseUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case Definition</em>' reference.
	 * @see #setUseCaseDefinition(UseCaseDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUseCaseUsage_UseCaseDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedUseCase'"
	 *        annotation="redefines"
	 * @generated
	 */
	UseCaseDefinition getUseCaseDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.UseCaseUsage#getUseCaseDefinition <em>Use Case Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case Definition</em>' reference.
	 * @see #getUseCaseDefinition()
	 * @generated
	 */
	void setUseCaseDefinition(UseCaseDefinition value);

	/**
	 * Returns the value of the '<em><b>Included Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.UseCaseUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The UseCaseUsages that are included by this UseCaseUsage. Derived as the <code>includedUseCase</code> of the IncludeUseCaseUsages owned by this UseCaseUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included Use Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUseCaseUsage_IncludedUseCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='includingUseCase'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<UseCaseUsage> getIncludedUseCase();

} // UseCaseUsage
