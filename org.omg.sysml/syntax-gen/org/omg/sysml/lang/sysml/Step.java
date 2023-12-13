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
 * '<em><b>Step</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Step</code> is a <code>Feature</code> that is typed by one or more <code>Behaviors</code>. <code>Steps</code> may be used by one <code>Behavior</code> to coordinate the performance of other <code>Behaviors</code>, supporting a steady refinement of behavioral descriptions. <code>Steps</code> can be ordered in time and can be connected using <code>ItemFlows</code> to specify things flowing between their <code>parameters</code>.</p>
 * 
 * specializesFromLibrary('Performances::performances')
 * owningType <> null and
 *     (owningType.oclIsKindOf(Behavior) or
 *      owningType.oclIsKindOf(Step)) implies
 *     specializesFromLibrary('Performances::Performance::enclosedPerformance')
 * isComposite and owningType <> null and
 * (owningType.oclIsKindOf(Structure) or
 *  owningType.oclIsKindOf(Feature) and
 *  owningType.oclAsType(Feature).type->
 *     exists(oclIsKindOf(Structure)) implies
 *     specializesFromLibrary('Objects::Object::ownedPerformance')
 * owningType <> null and
 *     (owningType.oclIsKindOf(Behavior) or
 *      owningType.oclIsKindOf(Step)) and
 *     self.isComposite implies
 *     specializesFromLibrary('Performances::Performance::subperformance')
 * behavior = type->selectByKind(Behavior)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Step#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Step#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends Feature {

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Behavior}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Behaviors</code> that type this <code>Step</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStep_Behavior()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedStep'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Behavior> getBehavior();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getDirectedFeature() <em>Directed Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>parameters</code> of this <code>Step</code>, which are defined as its <code>directedFeatures</code>, whose values are passed into and/or out of a performance of the <code>Step</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStep_Parameter()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parameteredStep'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getParameter();

} // Step
