/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.ValueOption#getOption <em>Option</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.ValueOption#getOptionOfProperty <em>Option Of Property</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getValueOption()
 * @model
 * @generated
 */
public interface ValueOption extends org.omg.sysml.kerml.core.Relationship, org.omg.sysml.kerml.structure.Class {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getValueOption_Option()
	 * @model lower="2" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.kerml.structure.Class> getOption();

	/**
	 * Returns the value of the '<em><b>Option Of Property</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.StructuredFeature#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Of Property</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Of Property</em>' container reference.
	 * @see #setOptionOfProperty(StructuredFeature)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getValueOption_OptionOfProperty()
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getOption
	 * @model opposite="option" required="true" transient="false" ordered="false"
	 * @generated
	 */
	StructuredFeature getOptionOfProperty();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.ValueOption#getOptionOfProperty <em>Option Of Property</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Of Property</em>' container reference.
	 * @see #getOptionOfProperty()
	 * @generated
	 */
	void setOptionOfProperty(StructuredFeature value);

} // ValueOption
