/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Direct specification of a variant
 * 
 * 
 * Validation rule:
 * level=Warning
 * Individual tree should include all Feature's that have a defined featurePath
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.Individual#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Individual#getParent <em>Parent</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Individual#getChild <em>Child</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Individual#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends EObject {
	/**
	 * Returns the value of the '<em><b>Defining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Feature</em>' reference.
	 * @see #setDefiningFeature(Feature)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getIndividual_DefiningFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getDefiningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Individual#getDefiningFeature <em>Defining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Feature</em>' reference.
	 * @see #getDefiningFeature()
	 * @generated
	 */
	void setDefiningFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Individual#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Individual)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getIndividual_Parent()
	 * @see org.omg.sysml.kerml.structure.Individual#getChild
	 * @model opposite="child" ordered="false"
	 * @generated
	 */
	Individual getParent();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Individual#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Individual value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Individual}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Individual#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getIndividual_Child()
	 * @see org.omg.sysml.kerml.structure.Individual#getParent
	 * @model opposite="parent" ordered="false"
	 * @generated
	 */
	EList<Individual> getChild();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(org.omg.sysml.kerml.structure.Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getIndividual_Context()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.structure.Class getContext();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Individual#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(org.omg.sysml.kerml.structure.Class value);

} // Individual
