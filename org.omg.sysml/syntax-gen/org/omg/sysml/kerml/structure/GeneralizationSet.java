/**
 */
package org.omg.sysml.kerml.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.GeneralizationSet#getComplete <em>Complete</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getGeneralizationSet()
 * @model
 * @generated
 */
public interface GeneralizationSet extends org.omg.sysml.kerml.core.Relationship {
	/**
	 * Returns the value of the '<em><b>Complete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete</em>' reference.
	 * @see #setComplete(Generalization)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getGeneralizationSet_Complete()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Generalization getComplete();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.GeneralizationSet#getComplete <em>Complete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' reference.
	 * @see #getComplete()
	 * @generated
	 */
	void setComplete(Generalization value);

} // GeneralizationSet
