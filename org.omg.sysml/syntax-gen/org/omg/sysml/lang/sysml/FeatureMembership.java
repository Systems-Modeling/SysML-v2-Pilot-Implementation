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
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningCategory <em>Owning Category</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature <em>Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedFeatureElement <em>Owned Feature Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isIsPart <em>Is Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isIsPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership()
 * @model
 * @generated
 */
public interface FeatureMembership extends Membership {
	/**
	 * Returns the value of the '<em><b>Owning Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Category#getOwnedFeatureMembership <em>Owned Feature Membership</em>}'.
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

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsDerived()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsReadOnly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

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
	 * Returns the value of the '<em><b>Is Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Port</em>' attribute.
	 * @see #setIsPort(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsPort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPort();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isIsPort <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Port</em>' attribute.
	 * @see #isIsPort()
	 * @generated
	 */
	void setIsPort(boolean value);

	/**
	 * Returns the value of the '<em><b>Member Feature</b></em>' reference.
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part</em>' attribute.
	 * @see #setIsPart(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsPart()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPart();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isIsPart <em>Is Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part</em>' attribute.
	 * @see #isIsPart()
	 * @generated
	 */
	void setIsPart(boolean value);

} // FeatureMembership
