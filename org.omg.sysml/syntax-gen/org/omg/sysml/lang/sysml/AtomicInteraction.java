/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Atomic
 * Interaction</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AtomicInteraction#getItemType <em>Item Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAtomicInteraction()
 * @model
 * @generated
 */
public interface AtomicInteraction extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' reference list. The list
	 * contents are of type {@link org.omg.sysml.lang.sysml.Classifier}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Item Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAtomicInteraction_ItemType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getItemType();

} // AtomicInteraction
