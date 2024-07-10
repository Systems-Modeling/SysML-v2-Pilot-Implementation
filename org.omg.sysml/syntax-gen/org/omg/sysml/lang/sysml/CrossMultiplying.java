/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Multiplying</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.CrossMultiplying#getMultiplyingType <em>Multiplying Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.CrossMultiplying#getTypeMultiplied <em>Type Multiplied</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCrossMultiplying()
 * @model
 * @generated
 */
public interface CrossMultiplying extends Relationship {
	/**
	 * Returns the value of the '<em><b>Multiplying Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplying Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplying Type</em>' reference.
	 * @see #setMultiplyingType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCrossMultiplying_MultiplyingType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='multipliedCrossMultiplying'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getMultiplyingType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CrossMultiplying#getMultiplyingType <em>Multiplying Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplying Type</em>' reference.
	 * @see #getMultiplyingType()
	 * @generated
	 */
	void setMultiplyingType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Multiplied</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedCrossMultiplying <em>Owned Cross Multiplying</em>}'.
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
	 * If the meaning of the '<em>Type Multiplied</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Multiplied</em>' reference.
	 * @see #setTypeMultiplied(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCrossMultiplying_TypeMultiplied()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedCrossMultiplying
	 * @model opposite="ownedCrossMultiplying" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getTypeMultiplied();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CrossMultiplying#getTypeMultiplied <em>Type Multiplied</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Multiplied</em>' reference.
	 * @see #getTypeMultiplied()
	 * @generated
	 */
	void setTypeMultiplied(Type value);

} // CrossMultiplying
