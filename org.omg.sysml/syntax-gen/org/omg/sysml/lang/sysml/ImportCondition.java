/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ImportCondition#getPredicate_comp <em>Predicate comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ImportCondition#getConditionalImport <em>Conditional Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ImportCondition#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImportCondition()
 * @model
 * @generated
 */
public interface ImportCondition extends Relationship {
	/**
	 * Returns the value of the '<em><b>Conditional Import</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ConditionalImport#getCondition_comp <em>Condition comp</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Import</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Import</em>' container reference.
	 * @see #setConditionalImport(ConditionalImport)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImportCondition_ConditionalImport()
	 * @see org.omg.sysml.lang.sysml.ConditionalImport#getCondition_comp
	 * @model opposite="condition_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	ConditionalImport getConditionalImport();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ImportCondition#getConditionalImport <em>Conditional Import</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Import</em>' container reference.
	 * @see #getConditionalImport()
	 * @generated
	 */
	void setConditionalImport(ConditionalImport value);

	/**
	 * Returns the value of the '<em><b>Predicate comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate comp</em>' containment reference.
	 * @see #setPredicate_comp(Predicate)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImportCondition_Predicate_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='condition'"
	 *        annotation="redefines"
	 * @generated
	 */
	Predicate getPredicate_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ImportCondition#getPredicate_comp <em>Predicate comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate comp</em>' containment reference.
	 * @see #getPredicate_comp()
	 * @generated
	 */
	void setPredicate_comp(Predicate value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(Predicate)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImportCondition_Predicate()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ImportCondition#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

} // ImportCondition
