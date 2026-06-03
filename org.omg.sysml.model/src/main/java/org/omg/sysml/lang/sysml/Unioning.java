/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>Unioning</code> is a <code>Relationship</code> that makes its <code>unioningType</code> one of the <code>unioningTypes</code> of its <code>typeUnioned</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Unioning#getTypeUnioned <em>Type Unioned</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Unioning#getUnioningType <em>Unioning Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUnioning()
 * @model
 * @generated
 */
public interface Unioning extends Relationship {
	/**
	 * Returns the value of the '<em><b>Unioning Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unioning Type</em>' reference.
	 * @see #setUnioningType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUnioning_UnioningType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='unionedUnioning'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getUnioningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Unioning#getUnioningType <em>Unioning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unioning Type</em>' reference.
	 * @see #getUnioningType()
	 * @generated
	 */
	void setUnioningType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Unioned</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedUnioning <em>Owned Unioning</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> with interpretations partly determined by <code>unioningType</code>, as described in <code>Type::unioningType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Unioned</em>' reference.
	 * @see #setTypeUnioned(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUnioning_TypeUnioned()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedUnioning
	 * @model opposite="ownedUnioning" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getTypeUnioned();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Unioning#getTypeUnioned <em>Type Unioned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Unioned</em>' reference.
	 * @see #getTypeUnioned()
	 * @generated
	 */
	void setTypeUnioned(Type value);

} // Unioning
