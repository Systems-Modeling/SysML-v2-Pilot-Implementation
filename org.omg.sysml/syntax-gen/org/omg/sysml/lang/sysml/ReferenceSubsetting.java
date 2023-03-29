/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Subsetting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>ReferenceSubsetting</code> is a kind of <code>Subsetting</code> in which the <code>referencedFeature</code> is syntactically distinguished from other <code>Features</code> subsetted by the <code>referencingFeature</code>. <code>ReferenceSubsetting</code> has the same semantics as <code>Subsetting</code>, but the <code>referenceFeature</code> may have a special purpose relative to the <code>referencingFeature</code>. For instance, <code>ReferenceSubsetting</code> is used to identify the <code>relatedFeatures</code> of a <code>Connector</code>.</p>
 * 
 * <p><code>ReferenceSubsetting</code> is always an <code>ownedRelationship</code> of its <code>referencingFeature</code>. A <code>Feature</code> can have at most one <code>ownedReferenceSubsetting</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ReferenceSubsetting#getReferencedFeature <em>Referenced Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ReferenceSubsetting#getReferencingFeature <em>Referencing Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getReferenceSubsetting()
 * @model
 * @generated
 */
public interface ReferenceSubsetting extends Subsetting {
	/**
	 * Returns the value of the '<em><b>Referenced Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature() <em>Subsetted Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is referenced by the <code>referencingFeature</code> of this <code>ReferenceSubsetting</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Feature</em>' reference.
	 * @see #setReferencedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getReferenceSubsetting_ReferencedFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencing'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getReferencedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ReferenceSubsetting#getReferencedFeature <em>Referenced Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Feature</em>' reference.
	 * @see #getReferencedFeature()
	 * @generated
	 */
	void setReferencedFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Referencing Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedReferenceSubsetting <em>Owned Reference Subsetting</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature() <em>Subsetting Feature</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature() <em>Owning Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that owns this <code>ReferenceSubsetting</code> relationship, which is also its <code>subsettingFeature</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referencing Feature</em>' reference.
	 * @see #setReferencingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getReferenceSubsetting_ReferencingFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedReferenceSubsetting
	 * @model opposite="ownedReferenceSubsetting" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getReferencingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ReferenceSubsetting#getReferencingFeature <em>Referencing Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencing Feature</em>' reference.
	 * @see #getReferencingFeature()
	 * @generated
	 */
	void setReferencingFeature(Feature value);

} // ReferenceSubsetting
