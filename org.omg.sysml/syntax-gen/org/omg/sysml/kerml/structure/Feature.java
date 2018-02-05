/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 *   <body>
 *     <p>
 * &#160;This is called Feature rather than attribute because in UML&#160;Attribute's are more restrictive w.r.t. typing than the intent of KerML&#160;Feature which is more open.
 * 
 *     </p>
 * 
 *     <p>
 * &#160;
 * 
 *     </p>
 * 
 *     <p>
 * Possible Alias: Usage(SysML2)
 * 
 *     </p>
 * 
 * </body>
 * </html>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getRedefinedFeature <em>Redefined Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getMethodVisibility <em>Method Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getContext <em>Context</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getFeaturePath <em>Feature Path</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getNestingFeature <em>Nesting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getNestedFeature <em>Nested Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getDefiningType <em>Defining Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getRefiningType <em>Refining Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends org.omg.sysml.kerml.core.Container {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_Type()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.kerml.structure.Class> getType();

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_Upper()
	 * @model ordered="false"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_Lower()
	 * @model ordered="false"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Class#getOwnedFeature <em>Owned Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(org.omg.sysml.kerml.structure.Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_Class()
	 * @see org.omg.sysml.kerml.structure.Class#getOwnedFeature
	 * @model opposite="ownedFeature" transient="false" ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.structure.Class getClass_();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(org.omg.sysml.kerml.structure.Class value);

	/**
	 * Returns the value of the '<em><b>Redefined Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Feature</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_RedefinedFeature()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> getRedefinedFeature();

	/**
	 * Returns the value of the '<em><b>Subsetted Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Feature</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_SubsettedFeature()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> getSubsettedFeature();

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
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_IsDerived()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#isIsDerived <em>Is Derived</em>}' attribute.
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
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_IsUnique()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#isIsUnique <em>Is Unique</em>}' attribute.
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
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_IsReadOnly()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#isIsReadOnly <em>Is Read Only</em>}' attribute.
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
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_IsOrdered()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Method Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.kerml.core.visibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific Visibility of the feature not the package
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Visibility</em>' attribute.
	 * @see org.omg.sysml.kerml.core.visibilityKind
	 * @see #setMethodVisibility(org.omg.sysml.kerml.core.visibilityKind)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_MethodVisibility()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.core.visibilityKind getMethodVisibility();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getMethodVisibility <em>Method Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Visibility</em>' attribute.
	 * @see org.omg.sysml.kerml.core.visibilityKind
	 * @see #getMethodVisibility()
	 * @generated
	 */
	void setMethodVisibility(org.omg.sysml.kerml.core.visibilityKind value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Class#getNestedFeatureOfClass <em>Nested Feature Of Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(org.omg.sysml.kerml.structure.Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_Context()
	 * @see org.omg.sysml.kerml.structure.Class#getNestedFeatureOfClass
	 * @model opposite="nestedFeatureOfClass" transient="false" derived="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.structure.Class getContext();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(org.omg.sysml.kerml.structure.Class value);

	/**
	 * Returns the value of the '<em><b>Feature Path</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.FeaturePathNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entries on the featurePath may include other features with featurePath defined as long as the resulting path creates a legal set of M0 instances as specified by the defining model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Path</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_FeaturePath()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeaturePathNode> getFeaturePath();

	/**
	 * Returns the value of the '<em><b>Nesting Feature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Feature#getNestedFeature <em>Nested Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Feature</em>' container reference.
	 * @see #setNestingFeature(Feature)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_NestingFeature()
	 * @see org.omg.sysml.kerml.structure.Feature#getNestedFeature
	 * @model opposite="nestedFeature" transient="false" ordered="false"
	 * @generated
	 */
	Feature getNestingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getNestingFeature <em>Nesting Feature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Feature</em>' container reference.
	 * @see #getNestingFeature()
	 * @generated
	 */
	void setNestingFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Nested Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Feature#getNestingFeature <em>Nesting Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Feature</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_NestedFeature()
	 * @see org.omg.sysml.kerml.structure.Feature#getNestingFeature
	 * @model opposite="nestingFeature" containment="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getNestedFeature();

	/**
	 * Returns the value of the '<em><b>Defining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note that the default instance of definingType is the M1 Library element Any
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining Type</em>' reference.
	 * @see #setDefiningType(org.omg.sysml.kerml.structure.Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_DefiningType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.structure.Class getDefiningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getDefiningType <em>Defining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Type</em>' reference.
	 * @see #getDefiningType()
	 * @generated
	 */
	void setDefiningType(org.omg.sysml.kerml.structure.Class value);

	/**
	 * Returns the value of the '<em><b>Refining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note that the default instance of refiningType is the M1 Library element Any
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refining Type</em>' reference.
	 * @see #setRefiningType(org.omg.sysml.kerml.structure.Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_RefiningType()
	 * @model ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.structure.Class getRefiningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getRefiningType <em>Refining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refining Type</em>' reference.
	 * @see #getRefiningType()
	 * @generated
	 */
	void setRefiningType(org.omg.sysml.kerml.structure.Class value);

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_OwnedType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.kerml.structure.Class> getOwnedType();

	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Class#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuring Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference.
	 * @see #setFeaturingClassifier(org.omg.sysml.kerml.structure.Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getFeature_FeaturingClassifier()
	 * @see org.omg.sysml.kerml.structure.Class#getFeature
	 * @model opposite="feature" derived="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.structure.Class getFeaturingClassifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuring Classifier</em>' reference.
	 * @see #getFeaturingClassifier()
	 * @generated
	 */
	void setFeaturingClassifier(org.omg.sysml.kerml.structure.Class value);

} // Feature
