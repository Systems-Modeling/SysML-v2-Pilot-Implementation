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
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Definition</code> is a <code>Classifier</code> of <code>Usages</code>. The actual kinds of <code>Definition</code> that may appear in a model are given by the subclasses of <code>Definition</code> (possibly as extended with user-defined <em><code>SemanticMetadata</code></em>).</p>
 * 
 * <p>Normally, a <code>Definition</code> has owned Usages that model <code>features</code> of the thing being defined. A <code>Definition</code> may also have other <code>Definitions</code> nested in it, but this has no semantic significance, other than the nested scoping resulting from the <code>Definition</code> being considered as a <code>Namespace</code> for any nested <code>Definitions</code>.</p>
 * 
 * <p>However, if a <code>Definition</code> has <code>isVariation</code> = <code>true</code>, then it represents a <em>variation point</em> <code>Definition</code>. In this case, all of its <code>members</code> must be <code>variant</code> <code>Usages</code>, related to the <code>Definition</code> by <code>VariantMembership</code> <code>Relationships</code>. Rather than being <code>features</code> of the <code>Definition</code>, <code>variant</code> <code>Usages</code> model different concrete alternatives that can be chosen to fill in for an abstract <code>Usage</code> of the variation point <code>Definition</code>.</p>
 * 
 * isVariation implies ownedFeatureMembership->isEmpty()
 * variant = variantMembership.ownedVariantUsage
 * variantMembership = ownedMembership->selectByKind(VariantMembership)
 * isVariation implies
 *     not ownedSpecialization.specific->exists(
 *         oclIsKindOf(Definition) and
 *         oclAsType(Definition).isVariation)
 * usage = feature->selectByKind(Usage)
 * directedUsage = directedFeature->selectByKind(Usage)
 * ownedUsage = ownedFeature->selectByKind(Usage)
 * ownedAttribute = ownedUsage->selectByKind(AttributeUsage)
 * ownedReference = ownedUsage->selectByKind(ReferenceUsage)
 * ownedEnumeration = ownedUsage->selectByKind(EnumerationUsage)
 * ownedOccurrence = ownedUsage->selectByKind(OccurrenceUsage)
 * ownedItem = ownedUsage->selectByKind(ItemUsage)
 * ownedPart = ownedUsage->selectByKind(PartUsage)
 * ownedPort = ownedUsage->selectByKind(PortUsage)
 * ownedConnection = ownedUsage->selectByKind(ConnectorAsUsage)
 * ownedFlow = ownedUsage->selectByKind(FlowConnectionUsage)
 * ownedInterface = ownedUsage->selectByKind(ReferenceUsage)
 * ownedAllocation = ownedUsage->selectByKind(AllocationUsage)
 * ownedAction = ownedUsage->selectByKind(ActionUsage)
 * ownedState = ownedUsage->selectByKind(StateUsage)
 * ownedTransition = ownedUsage->selectByKind(TransitionUsage)
 * ownedCalculation = ownedUsage->selectByKind(CalculationUsage)
 * ownedConstraint = ownedUsage->selectByKind(ConstraintUsage)
 * ownedRequirement = ownedUsage->selectByKind(RequirementUsage)
 * ownedConcern = ownedUsage->selectByKind(ConcernUsage)
 * ownedCase = ownedUsage->selectByKind(CaseUsage)
 * ownedAnalysisCase = ownedUsage->selectByKind(AnalysisCaseUsage)
 * ownedVerificationCase = ownedUsage->selectByKind(VerificationCaseUsage)
 * ownedUseCase = ownedUsage->selectByKind(UseCaseUsage)
 * ownedView = ownedUsage->selectByKind(ViewUsage)
 * ownedViewpoint = ownedUsage->selectByKind(ViewpointUsage)
 * ownedRendering = ownedUsage->selectByKind(RenderingUsage)
 * ownedMetadata = ownedUsage->selectByKind(MetadataUsage)
 * isVariation implies isAbstract
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getVariantMembership <em>Variant Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedReference <em>Owned Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedEnumeration <em>Owned Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedOccurrence <em>Owned Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedItem <em>Owned Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedConnection <em>Owned Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedFlow <em>Owned Flow</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedInterface <em>Owned Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAllocation <em>Owned Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedCalculation <em>Owned Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedCase <em>Owned Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAnalysisCase <em>Owned Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedVerificationCase <em>Owned Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedView <em>Owned View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedViewpoint <em>Owned Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedMetadata <em>Owned Metadata</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage <em>Owned Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PortUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>PortUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedPort()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='portOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<PortUsage> getOwnedPort();

	/**
	 * Returns the value of the '<em><b>Directed Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getDirectedFeature() <em>Directed Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of this <code>Definition</code> that are <code>directedFeatures</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_DirectedUsage()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definitionWithDirectedUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getDirectedUsage();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usages</code> that are <code>features</code> of this <code>Definition</code> (not necessarily owned).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_Usage()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getUsage();

	/**
	 * Returns the value of the '<em><b>Owned Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedOccurrence() <em>Owned Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAction()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actionOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ActionUsage> getOwnedAction();

	/**
	 * Returns the value of the '<em><b>Owned Connection</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConnectorAsUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedPart() <em>Owned Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConnectorAsUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>. Note that this list includes <code>BindingConnectorAsUsages</code> and <code>SuccessionAsUsages</code>, even though these are <code>ConnectorAsUsages</code> but not <code>ConnectionUsages</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connection</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedConnection()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectionOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConnectorAsUsage> getOwnedConnection();

	/**
	 * Returns the value of the '<em><b>Owned Item</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedOccurrence() <em>Owned Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ItemUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Item</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedItem()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='itemOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ItemUsage> getOwnedItem();

	/**
	 * Returns the value of the '<em><b>Owned Part</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PartUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedItem() <em>Owned Item</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>PartUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Part</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedPart()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='partOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<PartUsage> getOwnedPart();

	/**
	 * Returns the value of the '<em><b>Owned Interface</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.InterfaceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConnection() <em>Owned Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>InterfaceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Interface</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedInterface()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interfaceOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<InterfaceUsage> getOwnedInterface();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AttributeUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AttributeUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAttribute()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='attributeOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AttributeUsage> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned View</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedPart() <em>Owned Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ViewUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned View</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedView()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ViewUsage> getOwnedView();

	/**
	 * Returns the value of the '<em><b>Owned Viewpoint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewpointUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement() <em>Owned Requirement</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ViewpointUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedViewpoint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ViewpointUsage> getOwnedViewpoint();

	/**
	 * Returns the value of the '<em><b>Owned Rendering</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RenderingUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedPart() <em>Owned Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RenderingUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rendering</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedRendering()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='redenderingOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<RenderingUsage> getOwnedRendering();

	/**
	 * Returns the value of the '<em><b>Owned Verification Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.VerificationCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedCase() <em>Owned Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>VerificationCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Verification Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedVerificationCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='verificationCaseOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<VerificationCaseUsage> getOwnedVerificationCase();

	/**
	 * Returns the value of the '<em><b>Owned Enumeration</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.EnumerationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedAttribute() <em>Owned Attribute</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>EnumerationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Enumeration</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedEnumeration()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='enumerationOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<EnumerationUsage> getOwnedEnumeration();

	/**
	 * Returns the value of the '<em><b>Owned Allocation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AllocationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConnection() <em>Owned Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AllocationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Allocation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAllocation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='allocationOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AllocationUsage> getOwnedAllocation();

	/**
	 * Returns the value of the '<em><b>Owned Concern</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConcernUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement() <em>Owned Requirement</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConcernUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Concern</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedConcern()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='concernOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConcernUsage> getOwnedConcern();

	/**
	 * Returns the value of the '<em><b>Owned Occurrence</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.OccurrenceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>OccurrenceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Occurrence</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedOccurrence()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='occurrenceOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<OccurrenceUsage> getOwnedOccurrence();

	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.UseCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedCase() <em>Owned Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>UseCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedUseCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='useCaseOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<UseCaseUsage> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Owned Flow</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FlowConnectionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConnection() <em>Owned Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>FlowConnectionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Flow</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedFlow()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<FlowConnectionUsage> getOwnedFlow();

	/**
	 * Returns the value of the '<em><b>Owned Metadata</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.MetadataUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedItem() <em>Owned Item</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>MetadataUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Metadata</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedMetadata()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='metadataOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<MetadataUsage> getOwnedMetadata();

	/**
	 * Returns the value of the '<em><b>Variant Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.VariantMembership}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership() <em>Owned Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedMemberships</code> of this <code>Definition</code> that are <code>VariantMemberships</code>. If <code>isVariation</code> = true, then this must be all <code>ownedMemberships</code> of the <code>Definition</code>. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_VariantMembership()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<VariantMembership> getVariantMembership();

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.StateUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedAction() <em>Owned Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>StateUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned State</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedState()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<StateUsage> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedOccurrence() <em>Owned Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConstraintUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedConstraint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constraintOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConstraintUsage> getOwnedConstraint();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.TransitionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>TransitionUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Transition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transitionOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<TransitionUsage> getOwnedTransition();

	/**
	 * Returns the value of the '<em><b>Owned Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RequirementUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConstraint() <em>Owned Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RequirementUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Requirement</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedRequirement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<RequirementUsage> getOwnedRequirement();

	/**
	 * Returns the value of the '<em><b>Owned Calculation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CalculationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedAction() <em>Owned Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>CalculationUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Calculation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedCalculation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='calculationOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<CalculationUsage> getOwnedCalculation();

	/**
	 * Returns the value of the '<em><b>Is Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>Definition</code> is for a variation point or not. If true, then all the <code>memberships</code> of the <code>Definition</code> must be <code>VariantMemberships</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Variation</em>' attribute.
	 * @see #setIsVariation(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_IsVariation()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVariation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Definition#isVariation <em>Is Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variation</em>' attribute.
	 * @see #isVariation()
	 * @generated
	 */
	void setIsVariation(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Analysis Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AnalysisCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedCase() <em>Owned Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AnalysisCaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Analysis Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAnalysisCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='analysisCaseOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AnalysisCaseUsage> getOwnedAnalysisCase();

	/**
	 * Returns the value of the '<em><b>Owned Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedCalculation() <em>Owned Calculation</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The code>CaseUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='caseOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<CaseUsage> getOwnedCase();

	/**
	 * Returns the value of the '<em><b>Owned Reference</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ReferenceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ReferenceUsages</code> that are <code>ownedUsages</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reference</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedReference()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referenceOwningDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ReferenceUsage> getOwnedReference();

	/**
	 * Returns the value of the '<em><b>Owned Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usages</code> that are <code>ownedFeatures</code> of this <code>Definition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getOwningDefinition
	 * @model opposite="owningDefinition" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getOwnedUsage();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usages</code> which represent the variants of this <code>Definition</code> as a variation point <code>Definition</code>, if <code>isVariation</code> = true. If <code>isVariation = false</code>, the there must be no <code>variants</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_Variant()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getVariant();

} // Definition
