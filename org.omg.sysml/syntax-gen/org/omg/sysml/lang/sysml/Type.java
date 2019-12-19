/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Types (M1 elements (indirectly) classified by M2 Type) are set descriptors, which give criteria for things in the real-world (or relationships between them) being members of the set. For example, the set of real numbers, the set of all wheeled vehicles, the set of all occurring actions, and so on.</p>
 * 
 * ownedGeneralization->asSet() = specificOfGeneralization->intersection(ownedElement)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedFeatureMembership_comp <em>Owned Feature Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedEndFeature <em>Owned End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getInheritedMembership <em>Inherited Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getEndFeature <em>End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#isSufficient <em>Is Sufficient</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType()
 * @model
 * @generated
 */
public interface Type extends org.omg.sysml.lang.sysml.Package {
	/**
	 * Returns the value of the '<em><b>Owned Generalization</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Generalization}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Generalization#getOwningType <em>Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp() <em>Owned Relationship comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Generalization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Generalization</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedGeneralization()
	 * @see org.omg.sysml.lang.sysml.Generalization#getOwningType
	 * @model opposite="owningType" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Generalization> getOwnedGeneralization();

	/**
	 * Returns the value of the '<em><b>Owned Feature Membership comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureMembership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningType <em>Owning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature Membership comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Feature Membership comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedFeatureMembership_comp()
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwningType
	 * @model opposite="owningType" containment="true"
	 * @generated
	 */
	EList<FeatureMembership> getOwnedFeatureMembership_comp();

	/**
	 * Returns the value of the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureMembership}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getOwnedMembership_comp() <em>Owned Membership comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Feature Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedFeatureMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FeatureMembership> getOwnedFeatureMembership();

	/**
	 * Returns the value of the '<em><b>Owned Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwningType <em>Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwningType
	 * @model opposite="owningType" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getOwnedFeature();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_Feature()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringType'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_Input()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeWithInput'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_Output()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeWithOutput'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getOutput();

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
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_IsAbstract()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Type#isAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Inherited Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Membership}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getMembership() <em>Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_InheritedMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='inheritingtype'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Membership> getInheritedMembership();

	/**
	 * Returns the value of the '<em><b>End Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_EndFeature()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='endFeaturingType'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getEndFeature();

	/**
	 * Returns the value of the '<em><b>Is Sufficient</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sufficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sufficient</em>' attribute.
	 * @see #setIsSufficient(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_IsSufficient()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSufficient();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Type#isSufficient <em>Is Sufficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sufficient</em>' attribute.
	 * @see #isSufficient()
	 * @generated
	 */
	void setIsSufficient(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned End Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getEndOwningType <em>End Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getEndFeature() <em>End Feature</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned End Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedEndFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getEndOwningType
	 * @model opposite="endOwningType" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getOwnedEndFeature();

} // Type
