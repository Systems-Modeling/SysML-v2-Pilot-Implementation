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
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Usage</code> is a usage of a <code>Definition</code>. A <code>Usage</code> may only be an <code>ownedFeature</code> of a <code>Definition</code> or another <code>Usage</code>.</p>
 * 
 * <p>A <code>Usage</code> may have <code>nestedUsages</code> that model <code>features</code> that apply in the context of the <code>owningUsage</code>. A <code>Usage</code> may also have <code>Definitions</code> nested in it, but this has no semantic significance, other than the nested scoping resulting from the <code>Usage</code> being considered as a <code>Namespace</code> for any nested <code>Definitions</code>.</p>
 * 
 * <p>However, if a <code>Usage</code> has <code>isVariation = true</code>, then it represents a <em>variation point</em> <code>Usage</code>. In this case, all of its <code>members</code> must be <code>variant</code> <code>Usages</code>, related to the <code>Usage</code> by <code>VariantMembership</code> <code>Relationships</code>. Rather than being <code>features</code> of the <code>Usage</code>, <code>variant</code> <code>Usages</code> model different concrete alternatives that can be chosen to fill in for the variation point <code>Usage</code>.</p>
 * variant = variantMembership.ownedVariantUsage
 * variantMembership = ownedMembership->selectByKind(VariantMembership)
 * isVariation implies ownedFeatureMembership->isEmpty()
 * isReference = not isComposite
 * owningVariationUsage <> null implies
 *     specializes(owningVariationUsage)
 * isVariation implies
 *     not ownedSpecialization.specific->exists(
 *         oclIsKindOf(Definition) and
 *         oclAsType(Definition).isVariation or
 *         oclIsKindOf(Usage) and
 *         oclAsType(Usage).isVariation)
 * owningVariationDefinition <> null implies
 *     specializes(owningVariationDefinition)
 * directedUsage = directedFeature->selectByKind(Usage)
 * nestedAction = nestedUsage->selectByKind(ActionUsage)
 * nestedAllocation = nestedUsage->selectByKind(AllocationUsage)
 * nestedAnalysisCase = nestedUsage->selectByKind(AnalysisCaseUsage)
 * nestedAttribute = nestedUsage->selectByKind(AttributeUsage)
 * nestedCalculation = nestedUsage->selectByKind(CalculationUsage)
 * nestedCase = nestedUsage->selectByKind(CaseUsage)
 * nestedConcern = nestedUsage->selectByKind(ConcernUsage)
 * nestedConnection = nestedUsage->selectByKind(ConnectorAsUsage)
 * nestedConstraint = nestedUsage->selectByKind(ConstraintUsage)
 * ownedNested = nestedUsage->selectByKind(EnumerationUsage)
 * nestedFlow = nestedUsage->selectByKind(FlowConnectionUsage)
 * nestedInterface = nestedUsage->selectByKind(ReferenceUsage)
 * nestedItem = nestedUsage->selectByKind(ItemUsage)
 * nestedMetadata = nestedUsage->selectByKind(MetadataUsage)
 * nestedOccurrence = nestedUsage->selectByKind(OccurrenceUsage)
 * nestedPart = nestedUsage->selectByKind(PartUsage)
 * nestedPort = nestedUsage->selectByKind(PortUsage)
 * nestedReference = nestedUsage->selectByKind(ReferenceUsage)
 * nestedRendering = nestedUsage->selectByKind(RenderingUsage)
 * nestedRequirement = nestedUsage->selectByKind(RequirementUsage)
 * nestedState = nestedUsage->selectByKind(StateUsage)
 * nestedTransition = nestedUsage->selectByKind(TransitionUsage)
 * nestedUsage = ownedFeature->selectByKind(Usage)
 * nestedUseCase = nestedUsage->selectByKind(UseCaseUsage)
 * nestedVerificationCase = nestedUsage->selectByKind(VerificationCaseUsage)
 * nestedView = nestedUsage->selectByKind(ViewUsage)
 * nestedViewpoint = nestedUsage->selectByKind(ViewpointUsage)
 * usage = feature->selectByKind(Usage)
 * direction <> null or isEnd or featuringType->isEmpty() implies
 *     isReference
 * isVariation implies isAbstract
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#isReference <em>Is Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getVariantMembership <em>Variant Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedReference <em>Nested Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAttribute <em>Nested Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedEnumeration <em>Nested Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedOccurrence <em>Nested Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedItem <em>Nested Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedPart <em>Nested Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedConnection <em>Nested Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedFlow <em>Nested Flow</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedInterface <em>Nested Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAllocation <em>Nested Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedState <em>Nested State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedTransition <em>Nested Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedCalculation <em>Nested Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedConstraint <em>Nested Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedRequirement <em>Nested Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedConcern <em>Nested Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedCase <em>Nested Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAnalysisCase <em>Nested Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedVerificationCase <em>Nested Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedUseCase <em>Nested Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedView <em>Nested View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedViewpoint <em>Nested Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedRendering <em>Nested Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedMetadata <em>Nested Metadata</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage()
 * @model
 * @generated
 */
public interface Usage extends Feature {
	/**
	 * Returns the value of the '<em><b>Nested Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usages</code> that are <code>ownedFeatures</code> of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getOwningUsage
	 * @model opposite="owningUsage" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getNestedUsage();

	/**
	 * Returns the value of the '<em><b>Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage <em>Nested Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usage</code> in which this <code>Usage</code> is nested (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Usage</em>' reference.
	 * @see #setOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_OwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedUsage
	 * @model opposite="nestedUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Usage getOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Usage</em>' reference.
	 * @see #getOwningUsage()
	 * @generated
	 */
	void setOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage <em>Owned Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Definition</code> that owns this <code>Usage</code> (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Definition</em>' reference.
	 * @see #setOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_OwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedUsage
	 * @model opposite="ownedUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Definition getOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Definition</em>' reference.
	 * @see #getOwningDefinition()
	 * @generated
	 */
	void setOwningDefinition(Definition value);

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
	 * <p>The <code>ownedMemberships</code> of this <code>Usage</code> that are <code>VariantMemberships</code>. If <code>isVariation = true</code>, then this must be all <code>memberships</code> of the <code>Usage</code>. If <code>isVariation = false</code>, then <code>variantMembership</code>must be empty.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_VariantMembership()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<VariantMembership> getVariantMembership();

	/**
	 * Returns the value of the '<em><b>Nested Port</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PortUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>PortUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Port</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedPort()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='portOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<PortUsage> getNestedPort();

	/**
	 * Returns the value of the '<em><b>Nested State</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.StateUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedAction() <em>Nested Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>StateUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested State</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedState()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<StateUsage> getNestedState();

	/**
	 * Returns the value of the '<em><b>Nested Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedOccurrence() <em>Nested Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConstraintUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedConstraint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constraintOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConstraintUsage> getNestedConstraint();

	/**
	 * Returns the value of the '<em><b>Nested Transition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.TransitionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>TransitionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Transition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transitionOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<TransitionUsage> getNestedTransition();

	/**
	 * Returns the value of the '<em><b>Nested Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RequirementUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedConstraint() <em>Nested Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RequirementUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Requirement</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedRequirement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<RequirementUsage> getNestedRequirement();

	/**
	 * Returns the value of the '<em><b>Nested Calculation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CalculationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedAction() <em>Nested Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>CalculationUsage</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Calculation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedCalculation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='calculationOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<CalculationUsage> getNestedCalculation();

	/**
	 * Returns the value of the '<em><b>Is Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>Usage</code> is for a variation point or not. If true, then all the <code>memberships</code> of the <code>Usage</code> must be <code>VariantMemberships</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Variation</em>' attribute.
	 * @see #setIsVariation(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_IsVariation()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVariation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#isVariation <em>Is Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variation</em>' attribute.
	 * @see #isVariation()
	 * @generated
	 */
	void setIsVariation(boolean value);

	/**
	 * Returns the value of the '<em><b>Directed Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getUsage() <em>Usage</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getDirectedFeature() <em>Directed Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of this <code>Usage</code> that are <code>directedFeatures</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_DirectedUsage()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='usageWithDirectedUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getDirectedUsage();

	/**
	 * Returns the value of the '<em><b>Nested Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedCalculation() <em>Nested Calculation</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>CaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='caseOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<CaseUsage> getNestedCase();

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
	 * <p>The <code>Usages</code> which represent the variants of this <code>Usage</code> as a variation point <code>Usage</code>, if <code>isVariation = true</code>. If <code>isVariation = false</code>, then there must be no <code>variants</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Variant()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getVariant();

	/**
	 * Returns the value of the '<em><b>Nested Analysis Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AnalysisCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedCase() <em>Nested Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AnalysisCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Analysis Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAnalysisCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='analysisCaseOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AnalysisCaseUsage> getNestedAnalysisCase();

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
	 * <p>The <code>Usages</code> that are <code>features</code> of this <code>Usage</code> (not necessarily owned).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Usage()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getUsage();

	/**
	 * Returns the value of the '<em><b>Nested Reference</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ReferenceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ReferenceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Reference</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedReference()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referenceOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ReferenceUsage> getNestedReference();

	/**
	 * Returns the value of the '<em><b>Nested Connection</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConnectorAsUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedPart() <em>Nested Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConnectorAsUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>. Note that this list includes <code>BindingConnectorAsUsages</code> and <code>SuccessionAsUsages</code>, even though these are <code>ConnectorAsUsages</code> but not <code>ConnectionUsages</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Connection</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedConnection()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectionOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConnectorAsUsage> getNestedConnection();

	/**
	 * Returns the value of the '<em><b>Nested Item</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedOccurrence() <em>Nested Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ItemUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Item</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedItem()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='itemOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ItemUsage> getNestedItem();

	/**
	 * Returns the value of the '<em><b>Nested Part</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PartUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedItem() <em>Nested Item</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>PartUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Part</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedPart()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='partOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<PartUsage> getNestedPart();

	/**
	 * Returns the value of the '<em><b>Nested Interface</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.InterfaceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedConnection() <em>Nested Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>InterfaceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Interface</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedInterface()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interfaceOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<InterfaceUsage> getNestedInterface();

	/**
	 * Returns the value of the '<em><b>Nested Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AttributeUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The code>AttributeUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Attribute</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAttribute()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='attributeOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AttributeUsage> getNestedAttribute();

	/**
	 * Returns the value of the '<em><b>Nested View</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedPart() <em>Nested Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ViewUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested View</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedView()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ViewUsage> getNestedView();

	/**
	 * Returns the value of the '<em><b>Nested Viewpoint</b></em>' reference list.
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
	 * <p>The <code>ViewpointUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedViewpoint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ViewpointUsage> getNestedViewpoint();

	/**
	 * Returns the value of the '<em><b>Nested Rendering</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RenderingUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedPart() <em>Nested Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RenderingUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Rendering</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedRendering()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='renderingOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<RenderingUsage> getNestedRendering();

	/**
	 * Returns the value of the '<em><b>Nested Verification Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.VerificationCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedCase() <em>Nested Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>VerificationCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Verification Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedVerificationCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='verificationCaseOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<VerificationCaseUsage> getNestedVerificationCase();

	/**
	 * Returns the value of the '<em><b>Nested Enumeration</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.EnumerationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedAttribute() <em>Nested Attribute</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The code>EnumerationUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Enumeration</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedEnumeration()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='enumerationOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<EnumerationUsage> getNestedEnumeration();

	/**
	 * Returns the value of the '<em><b>Nested Allocation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AllocationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedConnection() <em>Nested Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AllocationUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Allocation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAllocation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='allocationOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AllocationUsage> getNestedAllocation();

	/**
	 * Returns the value of the '<em><b>Nested Concern</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConcernUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedRequirement() <em>Nested Requirement</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConcernUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Concern</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedConcern()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='concernOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConcernUsage> getNestedConcern();

	/**
	 * Returns the value of the '<em><b>Nested Occurrence</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.OccurrenceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>OccurrenceUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Occurrence</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedOccurrence()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='occurrenceOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<OccurrenceUsage> getNestedOccurrence();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Classifier}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Classifiers</code> that are the types of this <code>Usage</code>. Nominally, these are <code>Definitions</code>, but other kinds of Kernel <code>Classifiers</code> are also allowed, to permit use of <code>Classifiers</code> from the Kernel Model Libraries.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Definition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedUsage'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Classifier> getDefinition();

	/**
	 * Returns the value of the '<em><b>Nested Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.UseCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedCase() <em>Nested Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>UseCaseUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Use Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedUseCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='useCaseOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<UseCaseUsage> getNestedUseCase();

	/**
	 * Returns the value of the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>Usage</code> is a referential <code>Usage</code>, that is, it has <code>isComposite = false</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Reference</em>' attribute.
	 * @see #setIsReference(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_IsReference()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isReference();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#isReference <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reference</em>' attribute.
	 * @see #isReference()
	 * @generated
	 */
	void setIsReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Nested Flow</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FlowConnectionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedConnection() <em>Nested Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The code>FlowConnectionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Flow</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedFlow()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<FlowConnectionUsage> getNestedFlow();

	/**
	 * Returns the value of the '<em><b>Nested Metadata</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.MetadataUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedItem() <em>Nested Item</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>MetadataUsages</code> that are <code>nestedUsages</code> of this of this <code>Usage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Metadata</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedMetadata()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='metadataOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<MetadataUsage> getNestedMetadata();

	/**
	 * Returns the value of the '<em><b>Nested Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedOccurrence() <em>Nested Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsages</code> that are <code>nestedUsages</code> of this <code>Usage</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAction()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actionOwningUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ActionUsage> getNestedAction();

} // Usage
