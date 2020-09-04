/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Expose is an Import of a Package into a ViewUsage that provides the root for determining what Elements are to be included in a view. It may optionally include a <code>modelQuery</code> to selectively gather the Elements to included.</p>
 * <p>A ConditionalImport is an Import that is based on a specific condition. The condition allows for selective gathering of items from one package to another.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Expose#getModelQuery_comp <em>Model Query comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Expose#getModelQuery <em>Model Query</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExpose()
 * @model
 * @generated
 */
public interface Expose extends Import {
	/**
	 * Returns the value of the '<em><b>Model Query comp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A static query to be run on the <code>importedPackage</code> to determine which Memberships are actually imported.</p>
	 * <p>The ImportCondition that links the ConditionalImport to a predicate that is the basis for accepting the import.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Query comp</em>' containment reference.
	 * @see #setModelQuery_comp(ModelQuery)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExpose_ModelQuery_comp()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='queryImport'"
	 * @generated
	 */
	ModelQuery getModelQuery_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Expose#getModelQuery_comp <em>Model Query comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Query comp</em>' containment reference.
	 * @see #getModelQuery_comp()
	 * @generated
	 */
	void setModelQuery_comp(ModelQuery value);

	/**
	 * Returns the value of the '<em><b>Model Query</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Query</em>' reference.
	 * @see #setModelQuery(ModelQuery)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExpose_ModelQuery()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	ModelQuery getModelQuery();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Expose#getModelQuery <em>Model Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Query</em>' reference.
	 * @see #getModelQuery()
	 * @generated
	 */
	void setModelQuery(ModelQuery value);

} // Expose
