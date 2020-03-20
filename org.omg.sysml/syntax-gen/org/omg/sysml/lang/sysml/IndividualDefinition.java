/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.IndividualDefinition#getLifeClass <em>Life Class</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndividualDefinition()
 * @model
 * @generated
 */
public interface IndividualDefinition extends Block {
	/**
	 * Returns the value of the '<em><b>Life Class</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Life Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Life Class</em>' reference.
	 * @see #setLifeClass(org.omg.sysml.lang.sysml.Class)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIndividualDefinition_LifeClass()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='individualWithLife'"
	 *        annotation="subsets"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Class getLifeClass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.IndividualDefinition#getLifeClass <em>Life Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Life Class</em>' reference.
	 * @see #getLifeClass()
	 * @generated
	 */
	void setLifeClass(org.omg.sysml.lang.sysml.Class value);

} // IndividualDefinition
