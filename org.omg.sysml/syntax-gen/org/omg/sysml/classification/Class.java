/**
 */
package org.omg.sysml.classification;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.groups.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.classification.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Class#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Class#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Class#getTypedFeature <em>Typed Feature</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Class#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.classification.ClassificationPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Namespace {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.omg.sysml.classification.ClassificationPackage#getClass_IsAbstract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.classification.Feature#getFeaturingClasses <em>Featuring Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getClass_Feature()
	 * @see org.omg.sysml.classification.Feature#getFeaturingClasses
	 * @model opposite="featuringClasses" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Owned Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.classification.Feature#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Feature</em>' containment reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getClass_OwnedFeature()
	 * @see org.omg.sysml.classification.Feature#getClass_
	 * @model opposite="class" containment="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getOwnedFeature();

	/**
	 * Returns the value of the '<em><b>Typed Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.classification.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Feature</em>' reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getClass_TypedFeature()
	 * @see org.omg.sysml.classification.Feature#getType
	 * @model opposite="type" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getTypedFeature();

	/**
	 * Returns the value of the '<em><b>Owned Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.classification.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.classification.Generalization#getOwningGeneralization <em>Owning Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Generalization</em>' containment reference list.
	 * @see org.omg.sysml.classification.ClassificationPackage#getClass_OwnedGeneralization()
	 * @see org.omg.sysml.classification.Generalization#getOwningGeneralization
	 * @model opposite="owningGeneralization" containment="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getOwnedGeneralization();

} // Class
