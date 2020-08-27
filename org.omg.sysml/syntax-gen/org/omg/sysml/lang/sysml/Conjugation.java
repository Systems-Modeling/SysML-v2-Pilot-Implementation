/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjugation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Conjugation is a Relationship between two types in which the conjugatedType inherits all the Features of the originalType, but with all input and output Features reversed. That is, any Features with a FeatureMembership with direction <em>in</em> relative to the originalType are considered to have an effective direction of <em>out</em> relative to the conjugatedType and, similarly, Features with direction <em>out</em> in the original type are considered to have an effective direction of <em>in</em> in the original type. Features with direction <em>inout</em>, or with no direction, in the originalType, are inherited without change.</p>
 * 
 * <p>A Type may participate as a conjugatedType in at most one Conjugation relationship, and such a Type may not also be the specific Type in any Generalization relationship.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Conjugation#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Conjugation#getConjugatedType <em>Conjugated Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Conjugation#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugation()
 * @model
 * @generated
 */
public interface Conjugation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Original Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Type to be conjugated.</P>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Type</em>' reference.
	 * @see #setOriginalType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugation_OriginalType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conjugation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getOriginalType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Conjugation#getOriginalType <em>Original Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type</em>' reference.
	 * @see #getOriginalType()
	 * @generated
	 */
	void setOriginalType(Type value);

	/**
	 * Returns the value of the '<em><b>Conjugated Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conjugated Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Type that is the result of applying Conjugation to the <code>originalType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conjugated Type</em>' reference.
	 * @see #setConjugatedType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugation_ConjugatedType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conjugator'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getConjugatedType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Conjugation#getConjugatedType <em>Conjugated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugated Type</em>' reference.
	 * @see #getConjugatedType()
	 * @generated
	 */
	void setConjugatedType(Type value);

	/**
	 * Returns the value of the '<em><b>Owning Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedConjugator <em>Owned Conjugator</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Conjugation#getConjugatedType() <em>Conjugated Type</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>conjugatingType</code> of this Type that is also its <code>owningRelatedElement</p>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Type</em>' reference.
	 * @see #setOwningType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugation_OwningType()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedConjugator
	 * @model opposite="ownedConjugator" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Type getOwningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Conjugation#getOwningType <em>Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Type</em>' reference.
	 * @see #getOwningType()
	 * @generated
	 */
	void setOwningType(Type value);

} // Conjugation
