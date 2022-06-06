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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Succession</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Succession is a binary&nbsp;Connector that requires its <code>relatedFeatures</code> to happen separately in time. A Succession must be typed by the Association <em>HappensBefore</em> from the Kernel Model Library (or a specialization of it).</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Succession#getTransitionStep <em>Transition Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Succession#getTriggerStep <em>Trigger Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Succession#getEffectStep <em>Effect Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Succession#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession()
 * @model
 * @generated
 */
public interface Succession extends Connector {

	/**
	 * Returns the value of the '<em><b>Trigger Step</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Steps that map incoming events to the timing of occurrences of the <code>transitionStep</code>. The values of <code>triggerStep</code> subset the list of acceptable events to be received by a Behavior or the object that performs it.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Step</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession_TriggerStep()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='succession'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Step> getTriggerStep();

	/**
	 * Returns the value of the '<em><b>Effect Step</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Steps that represent occurrences that are side effects of the <code>transitionStep</code> occurring.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect Step</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession_EffectStep()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='succession'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Step> getEffectStep();

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Expression</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Expressions that must evaluate to true before the <code>transitionStep</code> can occur.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard Expression</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession_GuardExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='succession'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Expression> getGuardExpression();

	/**
	 * Returns the value of the '<em><b>Transition Step</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A Step that is typed by the Behavior <em>TransitionPerformance</em> (from the Model Library) that has this Succession as its <em><code>transitionLink</code></em>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition Step</em>' reference.
	 * @see #setTransitionStep(Step)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession_TransitionStep()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='succession'"
	 *        annotation="subsets"
	 * @generated
	 */
	Step getTransitionStep();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Succession#getTransitionStep <em>Transition Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Step</em>' reference.
	 * @see #getTransitionStep()
	 * @generated
	 */
	void setTransitionStep(Step value);
} // Succession
