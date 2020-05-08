/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An IndividualDefinition is a Block that is constrained to represent an individual thing. The instances of an IndividualDefinition include all spatial and temporal portions of the individual being represented, but only one of these can be the complete Life of the individual. All other instances must be portions of the "maximal portion" that is single Life instance, capturing the conception that all of the instances represent one individual with a single "identity".</p>
 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * <p>An Class that is an <tt>ownedMember</tt> of this IndividualDefinition, which specializes both the IndividualDefinition and the <tt>Base::Life</tt> Class from the Kernel Library and has a multiplicity of 0..1. This constrains the IndividualDefinition to have at most one instance that is a complete Life.</p>
	 * <!-- end-model-doc -->
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
