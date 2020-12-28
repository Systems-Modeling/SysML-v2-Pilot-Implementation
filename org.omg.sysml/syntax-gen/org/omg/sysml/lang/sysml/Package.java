/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Package is a Namespace used to group Elements, without any instance-level semantics. It may have one or MetadataConditions used to filter its <code>importedMemberships</code>. Any imported <code>member</code> must meet all of the <code>filterConditions<code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getFilterCondition <em>Filter Condition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getFilter_comp <em>Filter comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Namespace {
	/**
	 * Returns the value of the '<em><b>Filter Condition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.MetadataCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The MetadataConditions used to filter the <code>members</code> of this Package, derived as the <code>conditions</code> of all the <code>filters</code> of the Package.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Condition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_FilterCondition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conditionedPackage'"
	 * @generated
	 */
	EList<MetadataCondition> getFilterCondition();

	/**
	 * Returns the value of the '<em><b>Filter comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ElementFilter}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ElementFilter#getFilteredPackage <em>Filtered Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ElementFilters used to restrict the imported <code>members</code> of this Package.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_Filter_comp()
	 * @see org.omg.sysml.lang.sysml.ElementFilter#getFilteredPackage
	 * @model opposite="filteredPackage" containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementFilter> getFilter_comp();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ElementFilter}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp() <em>Owned Relationship comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_Filter()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ElementFilter> getFilter();

} // Package
