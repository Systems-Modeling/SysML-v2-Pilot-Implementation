/**
 */
package org.omg.sysml.kerml.structure;

import org.omg.sysml.kerml.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restricts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.Restricts#getRestricted <em>Restricted</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Restricts#getRestrictedBy <em>Restricted By</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getRestricts()
 * @model
 * @generated
 */
public interface Restricts extends Relationship, Generalization {
	/**
	 * Returns the value of the '<em><b>Restricted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted</em>' reference.
	 * @see #setRestricted(DataType)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getRestricts_Restricted()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getRestricted();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Restricts#getRestricted <em>Restricted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted</em>' reference.
	 * @see #getRestricted()
	 * @generated
	 */
	void setRestricted(DataType value);

	/**
	 * Returns the value of the '<em><b>Restricted By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restricted By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted By</em>' reference.
	 * @see #setRestrictedBy(ValueRestriction)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getRestricts_RestrictedBy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ValueRestriction getRestrictedBy();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Restricts#getRestrictedBy <em>Restricted By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted By</em>' reference.
	 * @see #getRestrictedBy()
	 * @generated
	 */
	void setRestrictedBy(ValueRestriction value);

} // Restricts
