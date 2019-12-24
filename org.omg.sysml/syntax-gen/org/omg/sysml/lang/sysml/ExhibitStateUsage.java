/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exhibit State Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ExhibitStateUsage#getExhibitedState <em>Exhibited State</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExhibitStateUsage()
 * @model
 * @generated
 */
public interface ExhibitStateUsage extends StateUsage {
	/**
	 * Returns the value of the '<em><b>Exhibited State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exhibited State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exhibited State</em>' reference.
	 * @see #setExhibitedState(StateUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExhibitStateUsage_ExhibitedState()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	StateUsage getExhibitedState();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ExhibitStateUsage#getExhibitedState <em>Exhibited State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exhibited State</em>' reference.
	 * @see #getExhibitedState()
	 * @generated
	 */
	void setExhibitedState(StateUsage value);

} // ExhibitStateUsage
