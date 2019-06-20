/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Ownership#getSource_comp <em>Source comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Ownership#getTarget_comp <em>Target comp</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership()
 * @model
 * @generated
 */
public interface Ownership extends Relationship {

	/**
	 * Returns the value of the '<em><b>Source comp</b></em>' containment reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source comp</em>' containment reference.
	 * @see #setSource_comp(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership_Source_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sourceOwnership'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getSource_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Ownership#getSource_comp <em>Source comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source comp</em>' containment reference.
	 * @see #getSource_comp()
	 * @generated
	 */
	void setSource_comp(Element value);

	/**
	 * Returns the value of the '<em><b>Target comp</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target comp</em>' reference.
	 * @see #setTarget_comp(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOwnership_Target_comp()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='targetOwnership'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getTarget_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Ownership#getTarget_comp <em>Target comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target comp</em>' reference.
	 * @see #getTarget_comp()
	 * @generated
	 */
	void setTarget_comp(Element value);
} // Ownership
