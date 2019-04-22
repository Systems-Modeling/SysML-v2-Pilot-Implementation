/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends Relationship {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_Lower()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='lowerMultiplicity'"
	 *        annotation="subsets"
	 * @generated
	 */
	Expression getLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getLower <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' reference.
	 * @see #setUpper(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_Upper()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='upperMultiplicity'"
	 *        annotation="subsets"
	 * @generated
	 */
	Expression getUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Expression value);

	/**
	 * Returns the value of the '<em><b>Feature With Multiplicity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getMultiplicity <em>Multiplicity</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature With Multiplicity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature With Multiplicity</em>' reference.
	 * @see #setFeatureWithMultiplicity(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity_FeatureWithMultiplicity()
	 * @see org.omg.sysml.lang.sysml.Feature#getMultiplicity
	 * @model opposite="multiplicity" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' featureWith Multiplicity'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getFeatureWithMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature With Multiplicity</em>' reference.
	 * @see #getFeatureWithMultiplicity()
	 * @generated
	 */
	void setFeatureWithMultiplicity(Feature value);

} // Multiplicity
