/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.AllocationUsage;
import org.omg.sysml.model.sysml.AnalysisCaseUsage;
import org.omg.sysml.model.sysml.AttributeUsage;
import org.omg.sysml.model.sysml.CalculationUsage;
import org.omg.sysml.model.sysml.CaseUsage;
import org.omg.sysml.model.sysml.ConcernUsage;
import org.omg.sysml.model.sysml.ConnectorAsUsage;
import org.omg.sysml.model.sysml.ConstraintUsage;
import org.omg.sysml.model.sysml.Definition;
import org.omg.sysml.model.sysml.EnumerationUsage;
import org.omg.sysml.model.sysml.FlowUsage;
import org.omg.sysml.model.sysml.InterfaceUsage;
import org.omg.sysml.model.sysml.ItemUsage;
import org.omg.sysml.model.sysml.MetadataUsage;
import org.omg.sysml.model.sysml.OccurrenceUsage;
import org.omg.sysml.model.sysml.PartUsage;
import org.omg.sysml.model.sysml.PortUsage;
import org.omg.sysml.model.sysml.ReferenceUsage;
import org.omg.sysml.model.sysml.RenderingUsage;
import org.omg.sysml.model.sysml.RequirementUsage;
import org.omg.sysml.model.sysml.StateUsage;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.TransitionUsage;
import org.omg.sysml.model.sysml.Usage;
import org.omg.sysml.model.sysml.UseCaseUsage;
import org.omg.sysml.model.sysml.VariantMembership;
import org.omg.sysml.model.sysml.VerificationCaseUsage;
import org.omg.sysml.model.sysml.ViewUsage;
import org.omg.sysml.model.sysml.ViewpointUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#isIsVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedAllocation <em>Owned Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedAnalysisCase <em>Owned Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedCalculation <em>Owned Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedCase <em>Owned Case</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedConnection <em>Owned Connection</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedEnumeration <em>Owned Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedFlow <em>Owned Flow</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedInterface <em>Owned Interface</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedItem <em>Owned Item</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedMetadata <em>Owned Metadata</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedOccurrence <em>Owned Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedReference <em>Owned Reference</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedUsage <em>Owned Usage</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedVerificationCase <em>Owned Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedView <em>Owned View</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getOwnedViewpoint <em>Owned Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.DefinitionImpl#getVariantMembership <em>Variant Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends ClassifierImpl implements Definition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVariation() {
		return (Boolean)eGet(SysMLPackage.Literals.DEFINITION__IS_VARIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVariation(boolean newIsVariation) {
		eSet(SysMLPackage.Literals.DEFINITION__IS_VARIATION, newIsVariation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getDirectedUsage() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.DEFINITION__DIRECTED_USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionUsage> getOwnedAction() {
		return (EList<ActionUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AllocationUsage> getOwnedAllocation() {
		return (EList<AllocationUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_ALLOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AnalysisCaseUsage> getOwnedAnalysisCase() {
		return (EList<AnalysisCaseUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_ANALYSIS_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AttributeUsage> getOwnedAttribute() {
		return (EList<AttributeUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CalculationUsage> getOwnedCalculation() {
		return (EList<CalculationUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_CALCULATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CaseUsage> getOwnedCase() {
		return (EList<CaseUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernUsage> getOwnedConcern() {
		return (EList<ConcernUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_CONCERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConnectorAsUsage> getOwnedConnection() {
		return (EList<ConnectorAsUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getOwnedConstraint() {
		return (EList<ConstraintUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EnumerationUsage> getOwnedEnumeration() {
		return (EList<EnumerationUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_ENUMERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FlowUsage> getOwnedFlow() {
		return (EList<FlowUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_FLOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<InterfaceUsage> getOwnedInterface() {
		return (EList<InterfaceUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ItemUsage> getOwnedItem() {
		return (EList<ItemUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MetadataUsage> getOwnedMetadata() {
		return (EList<MetadataUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OccurrenceUsage> getOwnedOccurrence() {
		return (EList<OccurrenceUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_OCCURRENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getOwnedPart() {
		return (EList<PartUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PortUsage> getOwnedPort() {
		return (EList<PortUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ReferenceUsage> getOwnedReference() {
		return (EList<ReferenceUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RenderingUsage> getOwnedRendering() {
		return (EList<RenderingUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_RENDERING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RequirementUsage> getOwnedRequirement() {
		return (EList<RequirementUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StateUsage> getOwnedState() {
		return (EList<StateUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TransitionUsage> getOwnedTransition() {
		return (EList<TransitionUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_TRANSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getOwnedUsage() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<UseCaseUsage> getOwnedUseCase() {
		return (EList<UseCaseUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_USE_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VerificationCaseUsage> getOwnedVerificationCase() {
		return (EList<VerificationCaseUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_VERIFICATION_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewUsage> getOwnedView() {
		return (EList<ViewUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_VIEW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewpointUsage> getOwnedViewpoint() {
		return (EList<ViewpointUsage>)eGet(SysMLPackage.Literals.DEFINITION__OWNED_VIEWPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getUsage() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.DEFINITION__USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getVariant() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.DEFINITION__VARIANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VariantMembership> getVariantMembership() {
		return (EList<VariantMembership>)eGet(SysMLPackage.Literals.DEFINITION__VARIANT_MEMBERSHIP, true);
	}

} //DefinitionImpl
