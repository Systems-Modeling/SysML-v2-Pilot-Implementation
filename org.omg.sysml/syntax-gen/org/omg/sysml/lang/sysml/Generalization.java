/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Generalization is a Relationship between two Types that asserts that any instance of the specific type is also an instance of the general Type. Special cases of Generalization include</p>
 * 
 * <ol>
 * <li>Subclassing, in which the related Types are both Classifiers,</li>
 * <li>Subsetting , in which the related Types are both Features, and</li>
 * <li>FeatureTyping, in which the specific Type is a Feature and the general Type can be either a Classifier or a Feature.</li>
 * </ol>
 * 
 * <p>A Generalization is not allowed with a specific Type that is a Classifier and a general Type that is a Feature. This is because a Classifier always includes instances that are individual entities, which an never be instances of a Feature.</p>
 * 
 * <p>The specific Type of a Generalization can also not be a conjugated Type.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Generalization#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends Relationship {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getGeneralization_General()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='speciallization'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getGeneral();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Type value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' reference.
	 * @see #setSpecific(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getGeneralization_Specific()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='generalization'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getSpecific();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Generalization#getSpecific <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Type value);

	/**
	 * Returns the value of the '<em><b>Owning Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedGeneralization <em>Owned Generalization</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getSpecific() <em>Specific</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwner() <em>Owner</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Type</em>' reference.
	 * @see #setOwningType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getGeneralization_OwningType()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedGeneralization
	 * @model opposite="ownedGeneralization" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Type getOwningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Generalization#getOwningType <em>Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Type</em>' reference.
	 * @see #getOwningType()
	 * @generated
	 */
	void setOwningType(Type value);

} // Generalization
