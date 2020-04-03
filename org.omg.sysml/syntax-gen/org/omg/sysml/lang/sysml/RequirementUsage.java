/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A RequirementUsage is a Usage of a RequirementDefinition.</p>
 * 
 * <p>A RequirementUsage (other than a SatisfyRequirementUsage owned by a Part) must subset, directly or indirectly, the base RequirementUsage "requirementChecks" from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementDefinition <em>Requirement Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementOwningUsage <em>Requirement Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementUsage#getSubjectParameter <em>Subject Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementUsage#getReqId <em>Req Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementUsage#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequiredConstraint <em>Required Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementUsage#getAssumedConstraint <em>Assumed Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementOwningDefinition <em>Requirement Owning Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage()
 * @model
 * @generated
 */
public interface RequirementUsage extends ConstraintUsage {
	/**
	 * Returns the value of the '<em><b>Requirement Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintDefinition() <em>Constraint Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Definition</em>' reference.
	 * @see #setRequirementDefinition(RequirementDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage_RequirementDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedRequirement'"
	 *        annotation="redefines"
	 * @generated
	 */
	RequirementDefinition getRequirementDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementDefinition <em>Requirement Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Definition</em>' reference.
	 * @see #getRequirementDefinition()
	 * @generated
	 */
	void setRequirementDefinition(RequirementDefinition value);

	/**
	 * Returns the value of the '<em><b>Requirement Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedRequirement <em>Nested Requirement</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintOwningUsage() <em>Constraint Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Owning Usage</em>' reference.
	 * @see #setRequirementOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage_RequirementOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedRequirement
	 * @model opposite="nestedRequirement" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getRequirementOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementOwningUsage <em>Requirement Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Owning Usage</em>' reference.
	 * @see #getRequirementOwningUsage()
	 * @generated
	 */
	void setRequirementOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>Subject Parameter</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getParameter() <em>Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned or inherited Feature of this RequirementUsage that redefines (directly or indirectly) the "subject" Feature of the base RequirementsDefinition RequirementsCheck from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Parameter</em>' reference.
	 * @see #setSubjectParameter(Parameter)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage_SubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parameteredRequirement'"
	 *        annotation="subsets"
	 * @generated
	 */
	Parameter getSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementUsage#getSubjectParameter <em>Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Parameter</em>' reference.
	 * @see #getSubjectParameter()
	 * @generated
	 */
	void setSubjectParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Req Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Id</em>' attribute.
	 * @see #setReqId(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage_ReqId()
	 * @model default="" dataType="org.omg.sysml.lang.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReqId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementUsage#getReqId <em>Req Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Id</em>' attribute.
	 * @see #getReqId()
	 * @generated
	 */
	void setReqId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage_Text()
	 * @model default="" dataType="org.omg.sysml.lang.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementUsage#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Required Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage_RequiredConstraint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requringRequirement'"
	 * @generated
	 */
	EList<ConstraintUsage> getRequiredConstraint();

	/**
	 * Returns the value of the '<em><b>Assumed Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumed Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumed Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage_AssumedConstraint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constrainingRequirement'"
	 * @generated
	 */
	EList<ConstraintUsage> getAssumedConstraint();

	/**
	 * Returns the value of the '<em><b>Requirement Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement <em>Owned Requirement</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintOwningDefinition() <em>Constraint Owning Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Owning Definition</em>' reference.
	 * @see #setRequirementOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementUsage_RequirementOwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedRequirement
	 * @model opposite="ownedRequirement" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Definition getRequirementOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementOwningDefinition <em>Requirement Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Owning Definition</em>' reference.
	 * @see #getRequirementOwningDefinition()
	 * @generated
	 */
	void setRequirementOwningDefinition(Definition value);

} // RequirementUsage
