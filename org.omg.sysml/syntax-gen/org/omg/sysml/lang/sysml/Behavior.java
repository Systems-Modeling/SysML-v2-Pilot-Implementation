/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Behavior#getTakesStep <em>Takes Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Behavior#getInvolvesFeature <em>Involves Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends org.omg.sysml.lang.sysml.Class {
	/**
	 * Returns the value of the '<em><b>Takes Step</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Step}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Category#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Takes Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Takes Step</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getBehavior_TakesStep()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='inBehavior'"
	 * @generated
	 */
	EList<Step> getTakesStep();

	/**
	 * Returns the value of the '<em><b>Involves Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involves Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getBehavior_InvolvesFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getInvolvesFeature();

} // Behavior
