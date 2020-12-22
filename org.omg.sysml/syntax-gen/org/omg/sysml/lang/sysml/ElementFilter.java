/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>ElementFilter is a Relationship between a Package and a MetadataCondition that asserts that all imported <code>members</code> of the Package must meet the MetadataCondition.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ElementFilter#getCondition_comp <em>Condition comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ElementFilter#getFilteredPackage <em>Filtered Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ElementFilter#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementFilter()
 * @model
 * @generated
 */
public interface ElementFilter extends Relationship {
	/**
	 * Returns the value of the '<em><b>Condition comp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The MetadataCondition used to filter the imported <code>members</code> of the <code>filteredPackage</code> of this ElementFilter.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition comp</em>' containment reference.
	 * @see #setCondition_comp(MetadataCondition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementFilter_Condition_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningFilter'"
	 * @generated
	 */
	MetadataCondition getCondition_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ElementFilter#getCondition_comp <em>Condition comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition comp</em>' containment reference.
	 * @see #getCondition_comp()
	 * @generated
	 */
	void setCondition_comp(MetadataCondition value);

	/**
	 * Returns the value of the '<em><b>Filtered Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Package#getFilter_comp <em>Filter comp</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Package whose imported <code>members</code> are restricted by this ElementFilter, which is also the <code>owningRelatedElement</code> of the Relationship.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filtered Package</em>' container reference.
	 * @see #setFilteredPackage(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementFilter_FilteredPackage()
	 * @see org.omg.sysml.lang.sysml.Package#getFilter_comp
	 * @model opposite="filter_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getFilteredPackage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ElementFilter#getFilteredPackage <em>Filtered Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtered Package</em>' container reference.
	 * @see #getFilteredPackage()
	 * @generated
	 */
	void setFilteredPackage(org.omg.sysml.lang.sysml.Package value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(MetadataCondition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementFilter_Condition()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	MetadataCondition getCondition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ElementFilter#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(MetadataCondition value);

} // ElementFilter
