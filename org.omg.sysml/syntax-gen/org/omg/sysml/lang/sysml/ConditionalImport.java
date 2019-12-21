/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConditionalImport#getCondition_comp <em>Condition comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConditionalImport#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConditionalImport#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConditionalImport()
 * @model
 * @generated
 */
public interface ConditionalImport extends Import {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' reference.
	 * @see #setSelector(Predicate)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConditionalImport_Selector()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='import'"
	 * @generated
	 */
	Predicate getSelector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConditionalImport#getSelector <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(Predicate value);

	/**
	 * Returns the value of the '<em><b>Condition comp</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ImportCondition#getConditionalImport <em>Conditional Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition comp</em>' containment reference.
	 * @see #setCondition_comp(ImportCondition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConditionalImport_Condition_comp()
	 * @see org.omg.sysml.lang.sysml.ImportCondition#getConditionalImport
	 * @model opposite="conditionalImport" containment="true" required="true" ordered="false"
	 * @generated
	 */
	ImportCondition getCondition_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConditionalImport#getCondition_comp <em>Condition comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition comp</em>' containment reference.
	 * @see #getCondition_comp()
	 * @generated
	 */
	void setCondition_comp(ImportCondition value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp() <em>Owned Relationship comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(ImportCondition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConditionalImport_Condition()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	ImportCondition getCondition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConditionalImport#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ImportCondition value);

} // ConditionalImport
