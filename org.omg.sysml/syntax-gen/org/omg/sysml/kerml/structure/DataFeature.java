/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.DataFeature#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.DataFeature#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.DataFeature#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getDataFeature()
 * @model
 * @generated
 */
public interface DataFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getDataFeature_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.DataFeature#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.ValueRestriction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getDataFeature_Value()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueRestriction> getValue();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(ValueRestriction)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getDataFeature_DefaultValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ValueRestriction getDefaultValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.DataFeature#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueRestriction value);

} // DataFeature
