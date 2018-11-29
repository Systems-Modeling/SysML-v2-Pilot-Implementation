/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature <em>Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedFeatureElement <em>Owned Feature Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isPart <em>Is Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningCategory <em>Owning Category</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership()
 * @model
 * @generated
 */
public interface FeatureMembership extends Membership {
	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsDerived()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsReadOnly()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Member Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberElement() <em>Member Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Feature</em>' reference.
	 * @see #setMemberFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_MemberFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featureMembership'"
	 * @generated
	 */
	Feature getMemberFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature <em>Member Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Feature</em>' reference.
	 * @see #getMemberFeature()
	 * @generated
	 */
	void setMemberFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owned Feature Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature() <em>Member Feature</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement() <em>Owned Member Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Feature Element</em>' containment reference.
	 * @see #setOwnedFeatureElement(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_OwnedFeatureElement()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership
	 * @model opposite="owningFeatureMembership" containment="true" ordered="false"
	 * @generated
	 */
	Feature getOwnedFeatureElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedFeatureElement <em>Owned Feature Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Feature Element</em>' containment reference.
	 * @see #getOwnedFeatureElement()
	 * @generated
	 */
	void setOwnedFeatureElement(Feature value);

	/**
	 * Returns the value of the '<em><b>Is Part</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part</em>' attribute.
	 * @see #setIsPart(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsPart()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPart();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPart <em>Is Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part</em>' attribute.
	 * @see #isPart()
	 * @generated
	 */
	void setIsPart(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Port</em>' attribute.
	 * @see #setIsPort(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsPort()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPort();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPort <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Port</em>' attribute.
	 * @see #isPort()
	 * @generated
	 */
	void setIsPort(boolean value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.FeatureDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @see #setDirection(FeatureDirectionKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_Direction()
	 * @model ordered="false"
	 * @generated
	 */
	FeatureDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FeatureDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Owning Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Category#getOwnedFeatureMembership <em>Owned Feature Membership</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage() <em>Membership Owning Package</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Category</em>' reference.
	 * @see #setOwningCategory(Category)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_OwningCategory()
	 * @see org.omg.sysml.lang.sysml.Category#getOwnedFeatureMembership
	 * @model opposite="ownedFeatureMembership" required="true" ordered="false"
	 * @generated
	 */
	Category getOwningCategory();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningCategory <em>Owning Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Category</em>' reference.
	 * @see #getOwningCategory()
	 * @generated
	 */
	void setOwningCategory(Category value);

} // FeatureMembership
