/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item
 * Flow</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFlowEnd <em>Item Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFlowFeature <em>Item Flow Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFeature <em>Item Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow()
 * @model
 * @generated
 */
public interface ItemFlow extends Connector, Step {
	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' reference list. The list
	 * contents are of type {@link org.omg.sysml.lang.sysml.Classifier}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Item Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemType()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Classifier> getItemType();

	/**
	 * Returns the value of the '<em><b>Target Input Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Input Feature</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Input Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_TargetInputFeature()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Feature> getTargetInputFeature();

	/**
	 * Returns the value of the '<em><b>Source Output Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Output Feature</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Output Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_SourceOutputFeature()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Feature> getSourceOutputFeature();

	/**
	 * Returns the value of the '<em><b>Item Flow End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemFlowEnd}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd() <em>Connector End</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Flow End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Flow End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemFlowEnd()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<ItemFlowEnd> getItemFlowEnd();

	/**
	 * Returns the value of the '<em><b>Item Flow Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemFlowFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Flow Feature</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Flow Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemFlowFeature()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ItemFlowFeature> getItemFlowFeature();

	/**
	 * Returns the value of the '<em><b>Item Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemFeature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemFeature()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ItemFeature> getItemFeature();

} // ItemFlow
