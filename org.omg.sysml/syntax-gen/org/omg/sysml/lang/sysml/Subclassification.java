/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subclassification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>Subclassification</code> is <code>Specialization</code> in which both the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Classifier</code>. This means all instances of the specific <code>Classifier</code> are also instances of the general <code>Classifier</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Subclassification#getSuperclassifier <em>Superclassifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Subclassification#getOwningClassifier <em>Owning Classifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Subclassification#getSubclassifier <em>Subclassifier</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubclassification()
 * @model
 * @generated
 */
public interface Subclassification extends Specialization {
	/**
	 * Returns the value of the '<em><b>Superclassifier</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getGeneral() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The more <code>general</code> Classifier in this <code>Subclassification</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Superclassifier</em>' reference.
	 * @see #setSuperclassifier(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubclassification_Superclassifier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='superclassification'"
	 *        annotation="redefines"
	 * @generated
	 */
	Classifier getSuperclassifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subclassification#getSuperclassifier <em>Superclassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclassifier</em>' reference.
	 * @see #getSuperclassifier()
	 * @generated
	 */
	void setSuperclassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Owning Classifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Classifier#getOwnedSubclassification <em>Owned Subclassification</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Classifier</code> that owns this <code>Subclassification</code> relationship, which must also be its <code>subclassifier</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Classifier</em>' reference.
	 * @see #setOwningClassifier(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubclassification_OwningClassifier()
	 * @see org.omg.sysml.lang.sysml.Classifier#getOwnedSubclassification
	 * @model opposite="ownedSubclassification" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Classifier getOwningClassifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subclassification#getOwningClassifier <em>Owning Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Classifier</em>' reference.
	 * @see #getOwningClassifier()
	 * @generated
	 */
	void setOwningClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Subclassifier</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getSpecific() <em>Specific</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The more specific <code>Classifier</code> in this <code>Subclassification</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subclassifier</em>' reference.
	 * @see #setSubclassifier(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubclassification_Subclassifier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subclassification'"
	 *        annotation="redefines"
	 * @generated
	 */
	Classifier getSubclassifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subclassification#getSubclassifier <em>Subclassifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclassifier</em>' reference.
	 * @see #getSubclassifier()
	 * @generated
	 */
	void setSubclassifier(Classifier value);

} // Subclassification
