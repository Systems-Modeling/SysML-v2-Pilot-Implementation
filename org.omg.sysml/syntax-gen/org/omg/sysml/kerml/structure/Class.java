/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The generic Model constructor and the generic type of all properties. It has a complete set of sub-sets. While it is permitted to create a Class in SysML2 it is intended that the user would eventually specify further intent for the Class (Block, Behavior, ConstriantBlock, Requirement, etc.). Therefore use of a plain Class would be considered a minor constraint violation that should be addressed of as the maturity of the Model improves
 * 
 * Normative Alias: Definition(SysML2)
 * SECM Alias: Definition Element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getSpecificClassifier <em>Specific Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getGeneralClassifier <em>General Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getInheritedFeature <em>Inherited Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getTypesFeature <em>Types Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getInstanceOf <em>Instance Of</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Class#getNestedFeatureOfClass <em>Nested Feature Of Class</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends org.omg.sysml.kerml.core.Container {
	/**
	 * Returns the value of the '<em><b>Specific Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specializations of this Block derived from any Generalization relationships of which block is the source
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Classifier</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_SpecificClassifier()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Class> getSpecificClassifier();

	/**
	 * Returns the value of the '<em><b>General Classifier</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Classifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Classifier</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_GeneralClassifier()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Class> getGeneralClassifier();

	/**
	 * Returns the value of the '<em><b>Owned Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Feature#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Feature</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_OwnedFeature()
	 * @see org.omg.sysml.kerml.structure.Feature#getClass_
	 * @model opposite="class" containment="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getOwnedFeature();

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
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_IsAbstract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Inherited Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Feature</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_InheritedFeature()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getInheritedFeature();

	/**
	 * Returns the value of the '<em><b>Types Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Feature</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_TypesFeature()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getTypesFeature();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_Feature()
	 * @see org.omg.sysml.kerml.structure.Feature#getFeaturingClassifier
	 * @model opposite="featuringClassifier" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_InstanceOf()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	Class getInstanceOf();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Class#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(Class value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_Generalization()
	 * @see org.omg.sysml.kerml.structure.Generalization#getSpecific
	 * @model opposite="specific" containment="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Nested Feature Of Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Feature#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Feature is an ownedRefinement if it has a defined featurePath
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Feature Of Class</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getClass_NestedFeatureOfClass()
	 * @see org.omg.sysml.kerml.structure.Feature#getContext
	 * @model opposite="context" containment="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getNestedFeatureOfClass();

} // Class
