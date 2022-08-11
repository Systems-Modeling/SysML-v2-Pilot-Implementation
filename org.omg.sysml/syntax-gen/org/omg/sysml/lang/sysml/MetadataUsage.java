/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An MetadataUsage is a Usage and a MetadataFeature, used to annotate other Elements in a system model with metadata. As a MetadataFeature, its type must be a Metaclass, which will nominally be a MetadataDefinition. However, any Kernel Metaclass is also allowed, to permit use of Metaclasses from the Kernel Library.</p>
 * 
 * <p>A MetadataUsage must subset, directly or indirectly, the base MetadataUsage <code>metadataItems</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataUsage#getMetadataDefinition <em>Metadata Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataUsage()
 * @model
 * @generated
 */
public interface MetadataUsage extends ItemUsage, MetadataFeature {
	/**
	 * Returns the value of the '<em><b>Metadata Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetaclass() <em>Metaclass</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ItemUsage#getItemDefinition() <em>Item Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Definition</em>' reference.
	 * @see #setMetadataDefinition(Metaclass)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataUsage_MetadataDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedMetadata'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Metaclass getMetadataDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataUsage#getMetadataDefinition <em>Metadata Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Definition</em>' reference.
	 * @see #getMetadataDefinition()
	 * @generated
	 */
	void setMetadataDefinition(Metaclass value);

} // MetadataUsage
