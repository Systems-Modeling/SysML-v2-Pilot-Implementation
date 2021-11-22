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
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.IncludeUseCaseUsage#getUseCaseIncluded <em>Use Case Included</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIncludeUseCaseUsage()
 * @model
 * @generated
 */
public interface IncludeUseCaseUsage extends UseCaseUsage, PerformActionUsage {

	/**
	 * Returns the value of the '<em><b>Use Case Included</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.PerformActionUsage#getPerformedAction() <em>Performed Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The UseCaseUsage to be included by this IncludeUseCaseUsage. It is the <code>subsettedFeature</code> of the first owned Subsetting Relationship of the IncludeUseCaseUsage.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case Included</em>' reference.
	 * @see #setUseCaseIncluded(UseCaseUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIncludeUseCaseUsage_UseCaseIncluded()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='useCaseInclusion'"
	 *        annotation="redefines"
	 * @generated
	 */
	UseCaseUsage getUseCaseIncluded();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IncludeUseCaseUsage#getUseCaseIncluded <em>Use Case Included</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case Included</em>' reference.
	 * @see #getUseCaseIncluded()
	 * @generated
	 */
	void setUseCaseIncluded(UseCaseUsage value);
} // IncludeUseCaseUsage
