/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A RequirementDefinition is a ConstraintDefinition that defines a requirement as a constraint that is used in the context of a specification that a valid solution must satisfy.</p>
 * 
 * <p>A RequirementDefinition must subclass, directly or indirectly, the base RequirementDefinition RequirementCheck from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getSubjectParameter <em>Subject Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getReqId <em>Req Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getAssumedConstraint <em>Assumed Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getRequiredConstraint <em>Required Constraint</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition()
 * @model
 * @generated
 */
public interface RequirementDefinition extends ConstraintDefinition {
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
	 * <p>The owned or inherited Feature of this RequirementDefinition that redefines (directly or indirectly) the "subject" Feature of the base RequirementsDefinition RequirementsCheck from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Parameter</em>' reference.
	 * @see #setSubjectParameter(Parameter)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_SubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parameteredRequirementDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	Parameter getSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementDefinition#getSubjectParameter <em>Subject Parameter</em>}' reference.
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
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_ReqId()
	 * @model default="" dataType="org.omg.sysml.lang.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReqId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementDefinition#getReqId <em>Req Id</em>}' attribute.
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
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_Text()
	 * @model default="" dataType="org.omg.sysml.lang.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementDefinition#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Assumed Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumed Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumed Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_AssumedConstraint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='assumingRequirementDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConstraintUsage> getAssumedConstraint();

	/**
	 * Returns the value of the '<em><b>Required Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_RequiredConstraint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requiringRequirementDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConstraintUsage> getRequiredConstraint();

} // RequirementDefinition
