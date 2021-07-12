/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjoining</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Disjoining is a Relationships that asserts that the interpretations of the <code>typeDisjoined</code> and the <code>disjoiningType</code> are disjoint.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Disjoining#getDisjoiningType <em>Disjoining Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Disjoining#getTypeDisjoined <em>Type Disjoined</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDisjoining()
 * @model
 * @generated
 */
public interface Disjoining extends Relationship {
	/**
	 * Returns the value of the '<em><b>Disjoining Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Type that is asserted to be disjoint with the <code>typeDisjoined</code>. Sequences in the interpretation of <code>disjoiningType</code>  are not in the interpretation of <code>typeDisjoined</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disjoining Type</em>' reference.
	 * @see #setDisjoiningType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDisjoining_DisjoiningType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='disjoinedTypeDisjoining'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getDisjoiningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Disjoining#getDisjoiningType <em>Disjoining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoining Type</em>' reference.
	 * @see #getDisjoiningType()
	 * @generated
	 */
	void setDisjoiningType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Disjoined</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getDisjoiningTypeDisjoining <em>Disjoining Type Disjoining</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Type that is asserted to be disjoint with the <code>disjoiningType</code>. Sequences in the interpretation of <code>typeDisjoined</code> are not in the interpretation of <code>disjoiningType</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Disjoined</em>' reference.
	 * @see #setTypeDisjoined(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDisjoining_TypeDisjoined()
	 * @see org.omg.sysml.lang.sysml.Type#getDisjoiningTypeDisjoining
	 * @model opposite="disjoiningTypeDisjoining" required="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getTypeDisjoined();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Disjoining#getTypeDisjoined <em>Type Disjoined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Disjoined</em>' reference.
	 * @see #getTypeDisjoined()
	 * @generated
	 */
	void setTypeDisjoined(Type value);

} // Disjoining
