/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A UseCaseDefinition is a CaseDefinition that specifies a set of actions performed by its subject, in interaction with one or more actors external to the subject. The objective is to yield an observable result that is of value for one or more of the actors.</p>
 * 
 * <p>A UseCaseDefinition must subclass, directly or indirectly, the base UseCaseDefinition <em>UseCase</em> from the Systems model library.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.UseCaseDefinition#getIncludedUseCase <em>Included Use Case</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUseCaseDefinition()
 * @model
 * @generated
 */
public interface UseCaseDefinition extends CaseDefinition {
	/**
	 * Returns the value of the '<em><b>Included Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.UseCaseUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The UseCaseUsages that are included by this UseCaseDefinition. Derived as the <code>includedUseCase</code> of the IncludeUseCaseUsages owned by this UseCaseDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included Use Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUseCaseDefinition_IncludedUseCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='includingUseCaseDefinition'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<UseCaseUsage> getIncludedUseCase();

} // UseCaseDefinition
