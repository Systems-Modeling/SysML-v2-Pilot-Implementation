/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A  <code>MetadataUsage</code> is a <code>Usage</code> and a <code>MetadataFeature</code>, used to annotate other <code>Elements</code> in a system model with metadata. As a <code>MetadataFeature</code>, its type must be a <code>Metaclass</code>, which will nominally be a <code>MetadataDefinition</code>. However, any kernel <code>Metaclass</code> is also allowed, to permit use of <code>Metaclasses</code> from the Kernel Model Libraries.</p>
 * specializesFromLibrary('Metadata::metadataItems')
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.ItemUsage#getItemDefinition() <em>Item Definition</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetaclass() <em>Metaclass</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>MetadataDefinition</code> that is the <code>definition</code> of this <code>MetadataUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Definition</em>' reference.
	 * @see #setMetadataDefinition(Metaclass)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataUsage_MetadataDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
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
