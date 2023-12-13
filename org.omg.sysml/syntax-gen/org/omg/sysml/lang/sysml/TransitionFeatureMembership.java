/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>TransitionFeatureMembership</code> is a <code>FeatureMembership</code> for a trigger, guard or effect of a <code>TransitionUsage</code>, whose <code>transitionFeature</code> is a <code>AcceptActionUsage</code>, <em><code>Boolean</code></em>-valued <code>Expression</code> or <code>ActionUsage</code>, depending on its <code>kind</code>. </p>
 * kind = TransitionFeatureKind::trigger implies
 *     transitionFeature.oclIsKindOf(AcceptActionUsage)
 * owningType.oclIsKindOf(TransitionUsage)
 * kind = TransitionFeatureKind::guard implies
 *     transitionFeature.oclIsKindOf(Expression) and
 *     let guard : Expression = transitionFeature.oclIsKindOf(Expression) in
 *     guard.result.specializesFromLibrary('ScalarValues::Boolean') and
 *     guard.result.multiplicity <> null and
 *     guard.result.multiplicity.hasBounds(1,1)
 * kind = TransitionFeatureKind::effect implies
 *     transitionFeature.oclIsKindOf(ActionUsage)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getTransitionFeature <em>Transition Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionFeatureMembership()
 * @model
 * @generated
 */
public interface TransitionFeatureMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.TransitionFeatureKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>TransitionFeatureMembership </code> is for a <code>trigger</code>, <code>guard</code> or <code>effect</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.TransitionFeatureKind
	 * @see #setKind(TransitionFeatureKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionFeatureMembership_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransitionFeatureKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.TransitionFeatureKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionFeatureKind value);

	/**
	 * Returns the value of the '<em><b>Transition Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature() <em>Owned Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Step</code> that is the <code>ownedMemberFeature</code> of this <code>TransitionFeatureMembership</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition Feature</em>' reference.
	 * @see #setTransitionFeature(Step)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionFeatureMembership_TransitionFeature()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transitionFeatureMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Step getTransitionFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getTransitionFeature <em>Transition Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Feature</em>' reference.
	 * @see #getTransitionFeature()
	 * @generated
	 */
	void setTransitionFeature(Step value);

} // TransitionFeatureMembership
