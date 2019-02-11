/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ownedRedefinition = ownedSubsetting->intersection(redefining)
 * referencedType = type - ownedElement
 * ownedSubsetting = ownedGeneralization->intersection(subsetting)
 * isComposite = owningFeatureMembership <> null and owningFeatureMembership.isPart
 * ownedType = type->intersection(ownedElement)
 * type = typing.type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwningCategory <em>Owning Category</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting <em>Owned Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getValuation <em>Valuation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getTyping <em>Typing</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isNonunique <em>Is Nonunique</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Category {
	/**
	 * Returns the value of the '<em><b>Referenced Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Category}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_ReferencedType()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencingFeature'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Category> getReferencedType();

	/**
	 * Returns the value of the '<em><b>Owning Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Category#getOwnedFeature <em>Owned Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace() <em>Owning Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Category</em>' reference.
	 * @see #setOwningCategory(Category)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwningCategory()
	 * @see org.omg.sysml.lang.sysml.Category#getOwnedFeature
	 * @model opposite="ownedFeature" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Category getOwningCategory();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getOwningCategory <em>Owning Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Category</em>' reference.
	 * @see #getOwningCategory()
	 * @generated
	 */
	void setOwningCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsUnique()
	 * @model default="true" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsOrdered()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Type()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedFeature'"
	 * @generated
	 */
	EList<Category> getType();

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Category}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedType()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningFeature'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Category> getOwnedType();

	/**
	 * Returns the value of the '<em><b>Owned Redefinition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Redefinition}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting() <em>Owned Subsetting</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Redefinition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Redefinition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedRedefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningFeature'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Redefinition> getOwnedRedefinition();

	/**
	 * Returns the value of the '<em><b>Owned Subsetting</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Subsetting}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature <em>Owning Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Category#getOwnedGeneralization() <em>Owned Generalization</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subsetting</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Subsetting</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedSubsetting()
	 * @see org.omg.sysml.lang.sysml.Subsetting#getOwningFeature
	 * @model opposite="owningFeature" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Subsetting> getOwnedSubsetting();

	/**
	 * Returns the value of the '<em><b>Owning Feature Membership</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature <em>Owned Member Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwningMembership() <em>Owning Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature Membership</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Feature Membership</em>' container reference.
	 * @see #setOwningFeatureMembership(FeatureMembership)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwningFeatureMembership()
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature
	 * @model opposite="ownedMemberFeature" transient="false" ordered="false"
	 *        annotation="subsets"
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
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Valuation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue <em>Feature With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuation</em>' containment reference.
	 * @see #setValuation(FeatureValue)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Valuation()
	 * @see org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue
	 * @model opposite="featureWithValue" containment="true" ordered="false"
	 * @generated
	 */
	FeatureValue getValuation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getValuation <em>Valuation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuation</em>' containment reference.
	 * @see #getValuation()
	 * @generated
	 */
	void setValuation(FeatureValue value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Multiplicity()
	 * @see org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity
	 * @model opposite="FeatureWithMultiplicity" containment="true" ordered="false"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Typing</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureTyping}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature <em>Typed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typing</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Typing()
	 * @see org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature
	 * @model opposite="typedFeature" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<FeatureTyping> getTyping();

	/**
	 * Returns the value of the '<em><b>Is Nonunique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Nonunique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nonunique</em>' attribute.
	 * @see #setIsNonunique(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsNonunique()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNonunique();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isNonunique <em>Is Nonunique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nonunique</em>' attribute.
	 * @see #isNonunique()
	 * @generated
	 */
	void setIsNonunique(boolean value);

} // Feature
