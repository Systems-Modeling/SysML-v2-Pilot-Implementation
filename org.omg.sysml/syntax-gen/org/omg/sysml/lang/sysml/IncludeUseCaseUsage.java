/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Use Case Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>IncludeUseCaseUsage</code> is a <code>UseCaseUsage</code> that represents the inclusion of a <code>UseCaseUsage</code> by a <code>UseCaseDefinition</code> or <code>UseCaseUsage</code>. Unless it is the <code>IncludeUseCaseUsage</code> itself, the <code>UseCaseUsage</code> to be included is related to the <code>includedUseCase</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>. An <code>IncludeUseCaseUsage</code> is also a PerformActionUsage, with its <code>useCaseIncluded</code> as the <code>performedAction</code>.</p>
 * 
 * owningType <> null and
 * (owningType.oclIsKindOf(UseCaseDefinition) or
 *  owningType.oclIsKindOf(UseCaseUsage) implies
 *     specializesFromLibrary('UseCases::UseCase::includedUseCases')
 * ownedReferenceSubsetting <> null implies
 *     ownedReferenceSubsetting.referencedFeature.oclIsKindOf(UseCaseUsage)
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
	 * <p>The <code>UseCaseUsage</code> to be included by this <code>IncludeUseCaseUsage</code>. It is the <code>performedAction</code> of the <code>IncludeUseCaseUsage</code> considered as a <code>PerformActionUsage</code>, which must be a <code>UseCaseUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case Included</em>' reference.
	 * @see #setUseCaseIncluded(UseCaseUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIncludeUseCaseUsage_UseCaseIncluded()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='useCaseInclusion'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
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
