/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Property is a Usage that represents a measurable or observable attribute, quality or characteristic of a system or part of a system.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Property#getPropertyOwningDefinition <em>Property Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Property#getPropertyOwningUsage <em>Property Owning Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getProperty()
 * @model abstract="true"
 * @generated
 */
public interface Property extends Usage {
	/**
	 * Returns the value of the '<em><b>Property Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedProperty <em>Owned Property</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition() <em>Owning Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Definition that owns this Property (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Owning Definition</em>' reference.
	 * @see #setPropertyOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getProperty_PropertyOwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedProperty
	 * @model opposite="ownedProperty" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Definition getPropertyOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Property#getPropertyOwningDefinition <em>Property Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Owning Definition</em>' reference.
	 * @see #getPropertyOwningDefinition()
	 * @generated
	 */
	void setPropertyOwningDefinition(Definition value);

	/**
	 * Returns the value of the '<em><b>Property Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedProperty <em>Nested Property</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage() <em>Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usage in which this Property is nested (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Owning Usage</em>' reference.
	 * @see #setPropertyOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getProperty_PropertyOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedProperty
	 * @model opposite="nestedProperty" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getPropertyOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Property#getPropertyOwningUsage <em>Property Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Owning Usage</em>' reference.
	 * @see #getPropertyOwningUsage()
	 * @generated
	 */
	void setPropertyOwningUsage(Usage value);

} // Property
