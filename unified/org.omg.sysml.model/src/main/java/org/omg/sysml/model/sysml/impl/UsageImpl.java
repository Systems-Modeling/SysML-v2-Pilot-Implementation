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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.AllocationUsage;
import org.omg.sysml.model.sysml.AnalysisCaseUsage;
import org.omg.sysml.model.sysml.AttributeUsage;
import org.omg.sysml.model.sysml.CalculationUsage;
import org.omg.sysml.model.sysml.CaseUsage;
import org.omg.sysml.model.sysml.Classifier;
import org.omg.sysml.model.sysml.ConcernUsage;
import org.omg.sysml.model.sysml.ConnectorAsUsage;
import org.omg.sysml.model.sysml.ConstraintUsage;
import org.omg.sysml.model.sysml.Definition;
import org.omg.sysml.model.sysml.EnumerationUsage;
import org.omg.sysml.model.sysml.Feature;
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
import org.omg.sysml.model.sysml.Type;
import org.omg.sysml.model.sysml.Usage;
import org.omg.sysml.model.sysml.UseCaseUsage;
import org.omg.sysml.model.sysml.VariantMembership;
import org.omg.sysml.model.sysml.VerificationCaseUsage;
import org.omg.sysml.model.sysml.ViewUsage;
import org.omg.sysml.model.sysml.ViewpointUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#isIsVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#isMayTimeVary <em>May Time Vary</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedAllocation <em>Nested Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedAnalysisCase <em>Nested Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedAttribute <em>Nested Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedCalculation <em>Nested Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedCase <em>Nested Case</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedConcern <em>Nested Concern</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedConnection <em>Nested Connection</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedConstraint <em>Nested Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedEnumeration <em>Nested Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedFlow <em>Nested Flow</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedInterface <em>Nested Interface</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedItem <em>Nested Item</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedMetadata <em>Nested Metadata</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedOccurrence <em>Nested Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedPart <em>Nested Part</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedReference <em>Nested Reference</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedRendering <em>Nested Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedRequirement <em>Nested Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedState <em>Nested State</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedTransition <em>Nested Transition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedUseCase <em>Nested Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedVerificationCase <em>Nested Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedView <em>Nested View</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getNestedViewpoint <em>Nested Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.UsageImpl#getVariantMembership <em>Variant Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageImpl extends FeatureImpl implements Usage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsReference() {
		return (Boolean)eGet(SysMLPackage.Literals.USAGE__IS_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReference(boolean newIsReference) {
		eSet(SysMLPackage.Literals.USAGE__IS_REFERENCE, newIsReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVariation() {
		return (Boolean)eGet(SysMLPackage.Literals.USAGE__IS_VARIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVariation(boolean newIsVariation) {
		eSet(SysMLPackage.Literals.USAGE__IS_VARIATION, newIsVariation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMayTimeVary() {
		return (Boolean)eGet(SysMLPackage.Literals.USAGE__MAY_TIME_VARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMayTimeVary(boolean newMayTimeVary) {
		eSet(SysMLPackage.Literals.USAGE__MAY_TIME_VARY, newMayTimeVary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Classifier> getDefinition() {
		return (EList<Classifier>)eGet(SysMLPackage.Literals.USAGE__DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getDirectedUsage() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.USAGE__DIRECTED_USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionUsage> getNestedAction() {
		return (EList<ActionUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AllocationUsage> getNestedAllocation() {
		return (EList<AllocationUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_ALLOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AnalysisCaseUsage> getNestedAnalysisCase() {
		return (EList<AnalysisCaseUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_ANALYSIS_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AttributeUsage> getNestedAttribute() {
		return (EList<AttributeUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CalculationUsage> getNestedCalculation() {
		return (EList<CalculationUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_CALCULATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CaseUsage> getNestedCase() {
		return (EList<CaseUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernUsage> getNestedConcern() {
		return (EList<ConcernUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_CONCERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConnectorAsUsage> getNestedConnection() {
		return (EList<ConnectorAsUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getNestedConstraint() {
		return (EList<ConstraintUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EnumerationUsage> getNestedEnumeration() {
		return (EList<EnumerationUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_ENUMERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FlowUsage> getNestedFlow() {
		return (EList<FlowUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_FLOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<InterfaceUsage> getNestedInterface() {
		return (EList<InterfaceUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ItemUsage> getNestedItem() {
		return (EList<ItemUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MetadataUsage> getNestedMetadata() {
		return (EList<MetadataUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OccurrenceUsage> getNestedOccurrence() {
		return (EList<OccurrenceUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_OCCURRENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getNestedPart() {
		return (EList<PartUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PortUsage> getNestedPort() {
		return (EList<PortUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ReferenceUsage> getNestedReference() {
		return (EList<ReferenceUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RenderingUsage> getNestedRendering() {
		return (EList<RenderingUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_RENDERING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RequirementUsage> getNestedRequirement() {
		return (EList<RequirementUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StateUsage> getNestedState() {
		return (EList<StateUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TransitionUsage> getNestedTransition() {
		return (EList<TransitionUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_TRANSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getNestedUsage() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.USAGE__NESTED_USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<UseCaseUsage> getNestedUseCase() {
		return (EList<UseCaseUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_USE_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VerificationCaseUsage> getNestedVerificationCase() {
		return (EList<VerificationCaseUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_VERIFICATION_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewUsage> getNestedView() {
		return (EList<ViewUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_VIEW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewpointUsage> getNestedViewpoint() {
		return (EList<ViewpointUsage>)eGet(SysMLPackage.Literals.USAGE__NESTED_VIEWPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getOwningDefinition() {
		return (Definition)eGet(SysMLPackage.Literals.USAGE__OWNING_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningDefinition(Definition newOwningDefinition) {
		eSet(SysMLPackage.Literals.USAGE__OWNING_DEFINITION, newOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwningUsage() {
		return (Usage)eGet(SysMLPackage.Literals.USAGE__OWNING_USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningUsage(Usage newOwningUsage) {
		eSet(SysMLPackage.Literals.USAGE__OWNING_USAGE, newOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getUsage() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.USAGE__USAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getVariant() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.USAGE__VARIANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VariantMembership> getVariantMembership() {
		return (EList<VariantMembership>)eGet(SysMLPackage.Literals.USAGE__VARIANT_MEMBERSHIP, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #referencedFeatureTarget() <em>Referenced Feature Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #referencedFeatureTarget()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REFERENCED_FEATURE_TARGET__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.USAGE___REFERENCED_FEATURE_TARGET).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature referencedFeatureTarget() {
		try {
			return (Feature)REFERENCED_FEATURE_TARGET__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.USAGE___REFERENCED_FEATURE_TARGET:
				return referencedFeatureTarget();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		var sourceValue = this.getDefinition();
		Object source = sourceValue;
		var result = new BasicEList<Type>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Type typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Type typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVariable() {
		var sourceValue = this.isMayTimeVary();
		Object source = sourceValue;
		return sourceValue;
	}

} //UsageImpl
