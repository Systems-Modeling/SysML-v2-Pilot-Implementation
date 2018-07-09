/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwningClass <em>Owning Class</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getNestedFeature <em>Nested Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getNestingFeature <em>Nesting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubset <em>Owned Subset</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getParticipantOfAssociation <em>Participant Of Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getEndOfAssociation <em>End Of Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isIsComposite <em>Is Composite</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends org.omg.sysml.lang.sysml.Class {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' containment reference.
	 * @see #setLower(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Lower()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getLower <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' containment reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' containment reference.
	 * @see #setUpper(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Upper()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getUpper <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' containment reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsUnique()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsOrdered()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Class#getOwnedFeature <em>Owned Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class</em>' reference.
	 * @see #setOwningClass(org.omg.sysml.lang.sysml.Class)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwningClass()
	 * @see org.omg.sysml.lang.sysml.Class#getOwnedFeature
	 * @model opposite="ownedFeature" derived="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Class getOwningClass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getOwningClass <em>Owning Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(org.omg.sysml.lang.sysml.Class value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Type()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getType();

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Class#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedType()
	 * @see org.omg.sysml.lang.sysml.Class#getOwningFeature
	 * @model opposite="owningFeature" derived="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getOwnedType();

	/**
	 * Returns the value of the '<em><b>Referenced Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_ReferencedType()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getReferencedType();

	/**
	 * Returns the value of the '<em><b>Nested Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getNestingFeature <em>Nesting Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_NestedFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getNestingFeature
	 * @model opposite="nestingFeature" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getNestedFeature();

	/**
	 * Returns the value of the '<em><b>Nesting Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getNestedFeature <em>Nested Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_NestingFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getNestedFeature
	 * @model opposite="nestedFeature" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getNestingFeature();

	/**
	 * Returns the value of the '<em><b>Owned Redefinition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Redefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Redefinition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Redefinition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedRedefinition()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Redefinition> getOwnedRedefinition();

	/**
	 * Returns the value of the '<em><b>Owned Subset</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Subset}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Subset#getOwningFeature <em>Owning Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subset</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Subset</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedSubset()
	 * @see org.omg.sysml.lang.sysml.Subset#getOwningFeature
	 * @model opposite="owningFeature" derived="true" ordered="false"
	 * @generated
	 */
	EList<Subset> getOwnedSubset();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Value()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Participant Of Association</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Association}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Association#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Of Association</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Of Association</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_ParticipantOfAssociation()
	 * @see org.omg.sysml.lang.sysml.Association#getParticipant
	 * @model opposite="participant" derived="true" ordered="false"
	 * @generated
	 */
	EList<Association> getParticipantOfAssociation();

	/**
	 * Returns the value of the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedFeatureElement <em>Owned Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature Membership</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Feature Membership</em>' container reference.
	 * @see #setOwningFeatureMembership(FeatureMembership)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwningFeatureMembership()
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwnedFeatureElement
	 * @model opposite="ownedFeatureElement" transient="false" ordered="false"
	 * @generated
	 */
	FeatureMembership getOwningFeatureMembership();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature Membership</em>' container reference.
	 * @see #getOwningFeatureMembership()
	 * @generated
	 */
	void setOwningFeatureMembership(FeatureMembership value);

	/**
	 * Returns the value of the '<em><b>End Of Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Association#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Of Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Association</em>' reference.
	 * @see #setEndOfAssociation(Association)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_EndOfAssociation()
	 * @see org.omg.sysml.lang.sysml.Association#getEnd
	 * @model opposite="end" derived="true" ordered="false"
	 * @generated
	 */
	Association getEndOfAssociation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getEndOfAssociation <em>End Of Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Association</em>' reference.
	 * @see #getEndOfAssociation()
	 * @generated
	 */
	void setEndOfAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsComposite()
	 * @model required="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

} // Feature
