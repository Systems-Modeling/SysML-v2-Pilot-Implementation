/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Featuring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Featuring is a Relationship between a Type and a Feature that is featured by that Type. Every instance in the domain of the <code>featureOfType</code> must be classified by the <code>featuringType</code>. This means that sequences that are classified by the <code>featureOfType</code> must have a prefix subsequence that is classified by the <code>featuringType</code>.</p>
 * 
 * <p>Featuring is abstract and does not commit to which of <code>featureOfType</code> or <code>featuredType</code> are the source or target. This commitment is made in the subclasses of Featuring, TypeFeaturing and FeatureMembership, which are directed differently.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Featuring#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Featuring#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeaturing()
 * @model abstract="true"
 * @generated
 */
public interface Featuring extends Relationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Type that features the <code>featureOfType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeaturing_Type()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringOfType'"
	 *        annotation="subsets"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Featuring#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that is featured by the <code>featuringType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeaturing_Feature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuring'"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Featuring#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Featuring
