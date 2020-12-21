/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A MetadataCondition is a MetadataExpression that tests whether some given metadata passes a defined condition. It has a single <code>parameter</code> that is used to accept the metadata to be tested and a <code>result</code> type of <emph>Boolean</emph>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataCondition#getAnnotationParameter <em>Annotation Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataCondition()
 * @model
 * @generated
 */
public interface MetadataCondition extends MetadataExpression {
	/**
	 * Returns the value of the '<em><b>Annotation Parameter</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getParameter() <em>Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The single <code>parameter</code> of this MetadataCondition used to accept the metadata to be tested.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Parameter</em>' reference.
	 * @see #setAnnotationParameter(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataCondition_AnnotationParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parameteredCondition'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getAnnotationParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataCondition#getAnnotationParameter <em>Annotation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Parameter</em>' reference.
	 * @see #getAnnotationParameter()
	 * @generated
	 */
	void setAnnotationParameter(Feature value);

} // MetadataCondition
