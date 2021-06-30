/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Use Case Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An IncludeUseCaseUsage is a UseCaseUsage that represents the inclusion of a UseCaseUsage by a UseCaseDefinition or UseCaseUsage. The UseCaseUsage to be included (which may be the IncludeUseCaseUsage itself) is related to the <code>includedUseCase</code> by a Subsetting Relationship. An IncludeUseCaseUsage is also a PerformActionUsage, with its <code>includedUseCase</code> as the <code>performedAction</code>.</p>
 * 
 * <p>If the IncludeUseCaseUsage is owned by a UseCaseDefinition or UseCaseUsage, then it also subsets the UseCaseUsage <em><code>UseCase::includedUseCases</code></em> from the Systems model library.</p>
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIncludeUseCaseUsage()
 * @model
 * @generated
 */
public interface IncludeUseCaseUsage extends UseCaseUsage, PerformActionUsage {
} // IncludeUseCaseUsage
