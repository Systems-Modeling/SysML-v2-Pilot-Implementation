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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ViewUsage</code> is a usage of a <code>ViewDefinition</code> to specify the generation of a view of the <code>members</code> of a collection of <code>exposedNamespaces</code>. The <code>ViewUsage</code> can satisfy more <code>viewpoints</code> than its definition, and it can specialize the <code>viewRendering</code> specified by its definition.<p>
 * exposedElement = ownedImport->selectByKind(Expose).
 *     importedMemberships(Set{}).memberElement->
 *     select(elm | includeAsExposed(elm))->
 *     asOrderedSet()
 * satisfiedViewpoint = ownedRequirement->
 *     selectByKind(ViewpointUsage)->
 *     select(isComposite)
 * viewCondition = ownedMembership->
 *     selectByKind(ElementFilterMembership).
 *     condition
 * viewRendering =
 *     let renderings: OrderedSet(ViewRenderingMembership) =
 *         featureMembership->selectByKind(ViewRenderingMembership) in
 *     if renderings->isEmpty() then null
 *     else renderings->first().referencedRendering
 *     endif
 * featureMembership->
 *     selectByKind(ViewRenderingMembership)->
 *     size() <= 1
 * specializesFromLibrary('Views::views')
 * owningType <> null and
 * (owningType.oclIsKindOf(ViewDefinition) or
 *  owningType.oclIsKindOf(ViewUsage)) implies
 *     specializesFromLibrary('Views::View::subviews')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getViewDefinition <em>View Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getSatisfiedViewpoint <em>Satisfied Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getExposedElement <em>Exposed Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getViewRendering <em>View Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getViewCondition <em>View Condition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage()
 * @model
 * @generated
 */
public interface ViewUsage extends PartUsage {
	/**
	 * Returns the value of the '<em><b>View Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.PartUsage#getPartDefinition() <em>Part Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ViewDefinition</code> that is the <code>definition</code> of this <code>ViewUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Definition</em>' reference.
	 * @see #setViewDefinition(ViewDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ViewDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedView'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ViewDefinition getViewDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewUsage#getViewDefinition <em>View Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Definition</em>' reference.
	 * @see #getViewDefinition()
	 * @generated
	 */
	void setViewDefinition(ViewDefinition value);

	/**
	 * Returns the value of the '<em><b>Satisfied Viewpoint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewpointUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedRequirement() <em>Nested Requirement</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>nestedRequirements</code> of this <code>ViewUsage</code> that are <code>ViewpointUsages</code> for (additional) viewpoints satisfied by the <code>ViewUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_SatisfiedViewpoint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointSatisfyingView'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ViewpointUsage> getSatisfiedViewpoint();

	/**
	 * Returns the value of the '<em><b>Exposed Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Elements</code> that are exposed by this <code>ViewUsage</code>, which are those <code>memberElements</code> of the imported <code>Memberships</code> from all the <code>Expose</code> <code>Relationships</code> that meet all the owned and inherited <code>viewConditions</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposed Element</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ExposedElement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exposingView'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Element> getExposedElement();

	/**
	 * Returns the value of the '<em><b>View Rendering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RenderingUsage</code> to be used to render views defined by this <code>ViewUsage</code>, which is the <code>referencedRendering</code> of the <code>ViewRenderingMembership</code> of the <code>ViewUsage</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Rendering</em>' reference.
	 * @see #setViewRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ViewRendering()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='renderingOwningView'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RenderingUsage getViewRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewUsage#getViewRendering <em>View Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Rendering</em>' reference.
	 * @see #getViewRendering()
	 * @generated
	 */
	void setViewRendering(RenderingUsage value);

	/**
	 * Returns the value of the '<em><b>View Condition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expressions</code> related to this <code>ViewUsage</code> by <code>ElementFilterMemberships</code>, which specify conditions on <code>Elements</code> to be rendered in a view.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Condition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ViewCondition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningView'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Expression> getViewCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Determine whether the given <code>element</code> meets all the owned and inherited <code>viewConditions</code>.</p>
	 * let metadataFeatures: Sequence(AnnotatingElement) = 
	 *     element.ownedAnnotation.annotatingElement->
	 *         select(oclIsKindOf(MetadataFeature)) in
	 * self.membership->selectByKind(ElementFilterMembership).
	 *     condition->forAll(cond | 
	 *         metadataFeatures->exists(elem | 
	 *             cond.checkCondition(elem)))
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" elementRequired="true" elementOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean includeAsExposed(Element element);

} // ViewUsage
