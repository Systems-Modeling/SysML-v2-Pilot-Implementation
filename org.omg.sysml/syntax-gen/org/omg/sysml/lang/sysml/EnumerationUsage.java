/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An EnumerationUsage is an AttributeUsage whose <code>attributeDefinition</code> is an EnumerationDefinition.</p>
 * 
 * <p>An EnumerationUsage must subset, directly or indirectly, the base EnumerationUsage <code>enumerationValues</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.EnumerationUsage#getEnumerationDefinition <em>Enumeration Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEnumerationUsage()
 * @model
 * @generated
 */
public interface EnumerationUsage extends AttributeUsage {
	/**
	 * Returns the value of the '<em><b>Enumeration Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.AttributeUsage#getAttributeDefinition() <em>Attribute Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The single EnumerationDefinition that is the type of this EnumerationUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Definition</em>' reference.
	 * @see #setEnumerationDefinition(EnumerationDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEnumerationUsage_EnumerationDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedEnumeration'"
	 *        annotation="redefines"
	 * @generated
	 */
	EnumerationDefinition getEnumerationDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.EnumerationUsage#getEnumerationDefinition <em>Enumeration Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Definition</em>' reference.
	 * @see #getEnumerationDefinition()
	 * @generated
	 */
	void setEnumerationDefinition(EnumerationDefinition value);

} // EnumerationUsage
