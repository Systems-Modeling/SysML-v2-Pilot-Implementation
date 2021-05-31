/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portioning Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A PortioningFeature is a Feature that is a redefinition of one of the Features<code> <em>timeSliceOf</em></code> or <em><code>snapshotOf</code></em> of the <em><code>portionOfLife</code></em> of each of the types of its <code>portioningUsage</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PortioningFeature#getPortionKind <em>Portion Kind</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortioningFeature()
 * @model
 * @generated
 */
public interface PortioningFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Portion Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.PortionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this PortionFeature is a redefinition of <code>timeSliceOf</code> or <code>snapshotOf</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portion Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.PortionKind
	 * @see #setPortionKind(PortionKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortioningFeature_PortionKind()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	PortionKind getPortionKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PortioningFeature#getPortionKind <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portion Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.PortionKind
	 * @see #getPortionKind()
	 * @generated
	 */
	void setPortionKind(PortionKind value);

} // PortioningFeature
