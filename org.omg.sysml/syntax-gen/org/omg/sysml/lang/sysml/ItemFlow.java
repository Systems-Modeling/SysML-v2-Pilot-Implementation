/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow()
 * @model
 * @generated
 */
public interface ItemFlow extends Connector, Step {
	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemType()
	 * @model required="true"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getItemType();

	/**
	 * Returns the value of the '<em><b>Target Input Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Input Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Input Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_TargetInputFeature()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getTargetInputFeature();

	/**
	 * Returns the value of the '<em><b>Source Output Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Output Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Output Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_SourceOutputFeature()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getSourceOutputFeature();

} // ItemFlow
