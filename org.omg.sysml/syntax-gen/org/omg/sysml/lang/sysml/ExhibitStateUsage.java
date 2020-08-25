/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exhibit State Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An ExhibitStateUsage is a StateUsage that represents the exhibiting of a StateUsage. The StateUsage to be exhibited (which may be the ExhibitStateUsage itself) is related to the ExhibitStateUsage by a Subsetting Relationship.</p>
 * 
 * <p>If the ExhibitStateUsage is owned by a Part, then it also subsets the <code>exhibitedStates</code> property of that Part (as defined in the library model for Part), otherwise it subsets either <code>states</code> or <code>substates</code>, as required for a regular StateUsage.</p>
 * 
 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * <p>The StateUsage to be exhibited by the ExhibitStateUsage. It is the <tt>subsettedFeature</tt> of the first owned Subsetting Relationship of the ExhibitStateUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exhibited State</em>' reference.
	 * @see #setExhibitedState(StateUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExhibitStateUsage_ExhibitedState()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateExhibition'"
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
