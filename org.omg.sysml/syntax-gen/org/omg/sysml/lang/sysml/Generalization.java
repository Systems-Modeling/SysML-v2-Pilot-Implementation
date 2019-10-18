/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Generalization determines how instances of Types are related to one another. This includes:</p>
 * 
 * <ol>
 * 	<li><span><span>A classifier A is a generalization of a classifier B if (as usual) any instance of A is also an instance of B.</span></span></li>
 * 	<li><span><span>A classifier A is a generalization of a feature B if A is the same as or a generalization of the <em>feature type</em> of B.</span></span></li>
 * 	<li><span><span>A feature A is a generalization of a feature B if <em>both</em> the featuring type of A is a generalization of the featuring type of B <em>and</em> the feature type of A is the same as or a generalization of the feature type of B. (In other words, both domain of A is a generalization of domain of B and range of A is a generalization of range of B)</span></span></li>
 * 	<li><span><span>A feature cannot be a generalization of a classifier.</span></span></li>
 * </ol>
 * 
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
