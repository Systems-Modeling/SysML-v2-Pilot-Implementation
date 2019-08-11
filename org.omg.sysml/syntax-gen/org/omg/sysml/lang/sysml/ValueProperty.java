/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ValueProperty is a Property whose type is a DataType. Nominally, if the type is a ValueType, a ValueProperty ris a usage of a ValueType to represent the value of some system characteristic. However, non-ValueType DataTypes are also allowed, to permit use of Classes from the Kernel Library. A ValueProperty must not be composite. Any nested Properties of a ValueProperty must also not be composite (and, therefore, cannot be PartProperties).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ValueProperty#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getValueProperty()
 * @model
 * @generated
 */
public interface ValueProperty extends Property, Usage {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(DataType)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getValueProperty_ValueType()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedValue'"
	 *        annotation="redefines"
	 * @generated
	 */
	DataType getValueType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ValueProperty#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(DataType value);

} // ValueProperty
