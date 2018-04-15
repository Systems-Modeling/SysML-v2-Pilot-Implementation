/**
 */
package org.omg.sysml.classification;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.behaviors.Expression;

import org.omg.sysml.groups.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.classification.Feature#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#getFeaturingClasses <em>Featuring Classes</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#getRedefinedFeature <em>Redefined Feature</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Feature#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.classification.ClassificationPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Namespace {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(Expression)
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_Lower()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Feature#getLower <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' reference.
	 * @see #setUpper(Expression)
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_Upper()
	 * @model ordered="false"
	 * @generated
	 */
	Expression getUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Feature#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Expression value);

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
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_IsDerived()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Feature#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

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
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_IsUnique()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Feature#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

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
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_IsReadOnly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Feature#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

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
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_IsOrdered()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Feature#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Featuring Classes</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Class}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.classification.Class#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuring Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuring Classes</em>' reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_FeaturingClasses()
	 * @see org.omg.sysml.classification.Class#getFeature
	 * @model opposite="feature" derived="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.classification.Class> getFeaturingClasses();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.classification.Class#getOwnedFeature <em>Owned Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(org.omg.sysml.classification.Class)
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_Class()
	 * @see org.omg.sysml.classification.Class#getOwnedFeature
	 * @model opposite="ownedFeature" transient="false" ordered="false"
	 * @generated
	 */
	org.omg.sysml.classification.Class getClass_();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Feature#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.omg.sysml.classification.Class value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Class}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.classification.Class#getTypedFeature <em>Typed Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_Type()
	 * @see org.omg.sysml.classification.Class#getTypedFeature
	 * @model opposite="typedFeature" derived="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.classification.Class> getType();

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type</em>' containment reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_OwnedType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.classification.Class> getOwnedType();

	/**
	 * Returns the value of the '<em><b>Referenced Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Type</em>' reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_ReferencedType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.classification.Class> getReferencedType();

	/**
	 * Returns the value of the '<em><b>Redefined Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Feature</em>' reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_RedefinedFeature()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> getRedefinedFeature();

	/**
	 * Returns the value of the '<em><b>Subsetted Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Feature</em>' reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getFeature_SubsettedFeature()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> getSubsettedFeature();

} // Feature
