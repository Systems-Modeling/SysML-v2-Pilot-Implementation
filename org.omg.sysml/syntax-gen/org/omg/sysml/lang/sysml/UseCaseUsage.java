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
 * <p>A <code>UseCaseUsage</code> is a <code>Usage</code> of a <code>UseCaseDefinition</code>.</p>
 * includedUseCase = ownedUseCase->
 *     selectByKind(IncludeUseCaseUsage).
 *     useCaseIncluded
 * specializesFromLibrary('UseCases::useCases')
 * isComposite and owningType <> null and
 * (owningType.oclIsKindOf(UseCaseDefinition) or
 *  owningType.oclIsKindOf(UseCaseUsage)) implies
 *     specializesFromLibrary('UseCases::UseCase::subUseCases')
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
	 * <p>The <code>UseCaseDefinition</code> that is the <code>definition</code> of this <code>UseCaseUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case Definition</em>' reference.
	 * @see #setUseCaseDefinition(UseCaseDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUseCaseUsage_UseCaseDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedUseCase'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p>The <code>UseCaseUsages</code> that are included by this <code>UseCaseUse</code>, which are the <code>useCaseIncludeds</code> of the <code>IncludeUseCaseUsages</code> owned by this <code>UseCaseUsage<code>.</p>
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
