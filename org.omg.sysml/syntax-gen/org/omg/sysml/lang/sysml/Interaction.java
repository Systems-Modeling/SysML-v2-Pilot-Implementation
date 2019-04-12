/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Interaction#getParticipantFeature <em>Participant Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends Association, Behavior {
	/**
	 * Returns the value of the '<em><b>Participant Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getInvolvesFeature() <em>Involves Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInteraction_ParticipantFeature()
	 * @model lower="2" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getParticipantFeature();

} // Interaction
