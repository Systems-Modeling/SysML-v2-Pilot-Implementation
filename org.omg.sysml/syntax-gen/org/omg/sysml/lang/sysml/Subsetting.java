/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Subsetting</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Subsetting is Generalization in which&nbsp;the specific and general Types are Features. This means all values of the subsettingFeature (on instances of its domain, i.e., the intersection of its featuringTypes) are values of the subsettingFeature on instances of its domain.&nbsp; To support this,&nbsp;the domain&nbsp;of the subsettingFeature must be the same or specialize (at least indirectly) the&nbsp;domain&nbsp;of the subsettedFeature (via Generalization), and the range (intersection of a Feature&#39;s types) of the subsetting feature must specialize the range of the subsetted feature.&nbsp;The subsettedFeature is imported into the owningNamespace of the subsettingFeature (if it is not already in that namespace), requiring the names of the subsetting and subsettedFeatures to be different.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature <em>Subsetting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature <em>Owning Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubsetting()
 * @model
 * @generated
 */
public interface Subsetting extends Generalization {
	/**
	 * Returns the value of the '<em><b>Subsetted Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getGeneral() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that has a more encompassing value set of the pair linked by this Subsetting.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsetted Feature</em>' reference.
	 * @see #setSubsettedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubsetting_SubsettedFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subsetting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getSubsettedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature <em>Subsetted Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsetted Feature</em>' reference.
	 * @see #getSubsettedFeature()
	 * @generated
	 */
	void setSubsettedFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Subsetting Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getSpecific() <em>Specific</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetting Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature whose set of values is a subset of the set of values of the other member of the pair linked by this Subsetting.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsetting Feature</em>' reference.
	 * @see #setSubsettingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubsetting_SubsettingFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='supersetting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getSubsettingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature <em>Subsetting Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Subsetting Feature</em>' reference.
	 * @see #getSubsettingFeature()
	 * @generated
	 */
	void setSubsettingFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owning Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting <em>Owned Subsetting</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature whose set of values is a subset of the set of values of the other member of the pair linked by this Subsetting. It also owns the relationship.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Feature</em>' reference.
	 * @see #setOwningFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubsetting_OwningFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting
	 * @model opposite="ownedSubsetting" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getOwningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature</em>' reference.
	 * @see #getOwningFeature()
	 * @generated
	 */
	void setOwningFeature(Feature value);

} // Subsetting
