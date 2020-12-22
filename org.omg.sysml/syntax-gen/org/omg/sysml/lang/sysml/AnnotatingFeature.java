/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotating Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingFeature#getMetadataType <em>Metadata Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingFeature#getOwnedMetadata <em>Owned Metadata</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingFeature()
 * @model
 * @generated
 */
public interface AnnotatingFeature extends Feature, AnnotatingElement {
	/**
	 * Returns the value of the '<em><b>Metadata Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Type</em>' reference.
	 * @see #setMetadataType(DataType)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingFeature_MetadataType()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	DataType getMetadataType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AnnotatingFeature#getMetadataType <em>Metadata Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Type</em>' reference.
	 * @see #getMetadataType()
	 * @generated
	 */
	void setMetadataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Owned Metadata</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.MetadataFeature}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Metadata</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Metadata</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingFeature_OwnedMetadata()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningAnnotatingFeature'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<MetadataFeature> getOwnedMetadata();

} // AnnotatingFeature
