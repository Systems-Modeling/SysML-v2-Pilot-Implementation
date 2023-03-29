/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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

package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AllocationUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.EnumerationUsage;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.InterfaceUsage;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.MetadataUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConnectorAsUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.UseCaseUsage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getVariantMembership <em>Variant Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedReference <em>Owned Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedEnumeration <em>Owned Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedOccurrence <em>Owned Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedItem <em>Owned Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedConnection <em>Owned Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedFlow <em>Owned Flow</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedInterface <em>Owned Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAllocation <em>Owned Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedCalculation <em>Owned Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedCase <em>Owned Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAnalysisCase <em>Owned Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedVerificationCase <em>Owned Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedView <em>Owned View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedViewpoint <em>Owned Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedMetadata <em>Owned Metadata</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedUsage <em>Owned Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends ClassifierImpl implements Definition {
	/**
	 * The default value of the '{@link #isVariation() <em>Is Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVariation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VARIATION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isVariation() <em>Is Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVariation()
	 * @generated
	 * @ordered
	 */
	protected boolean isVariation = IS_VARIATION_EDEFAULT;
	/**
	 * The cached setting delegate for the '{@link #getVariant() <em>Variant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VARIANT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__VARIANT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getVariantMembership() <em>Variant Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantMembership()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VARIANT_MEMBERSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__VARIANT_MEMBERSHIP).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getUsage() <em>Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__USAGE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getDirectedUsage() <em>Directed Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedUsage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DIRECTED_USAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__DIRECTED_USAGE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedReference() <em>Owned Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReference()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_REFERENCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_REFERENCE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ATTRIBUTE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_ATTRIBUTE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedEnumeration() <em>Owned Enumeration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ENUMERATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_ENUMERATION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedOccurrence() <em>Owned Occurrence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOccurrence()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_OCCURRENCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_OCCURRENCE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedItem() <em>Owned Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedItem()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ITEM__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_ITEM).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedPart() <em>Owned Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_PART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_PART).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedPort() <em>Owned Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_PORT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedConnection() <em>Owned Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnection()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_CONNECTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_CONNECTION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedFlow() <em>Owned Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFlow()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_FLOW__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_FLOW).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedInterface() <em>Owned Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_INTERFACE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedAllocation() <em>Owned Allocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAllocation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ALLOCATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_ALLOCATION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedAction() <em>Owned Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_ACTION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedState() <em>Owned State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedState()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_STATE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_STATE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedTransition() <em>Owned Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_TRANSITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_TRANSITION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedCalculation() <em>Owned Calculation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCalculation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_CALCULATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_CALCULATION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedConstraint() <em>Owned Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraint()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_CONSTRAINT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_CONSTRAINT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedRequirement() <em>Owned Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_REQUIREMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_REQUIREMENT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedConcern() <em>Owned Concern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConcern()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_CONCERN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_CONCERN).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedCase() <em>Owned Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_CASE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedAnalysisCase() <em>Owned Analysis Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnalysisCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ANALYSIS_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_ANALYSIS_CASE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedVerificationCase() <em>Owned Verification Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVerificationCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_VERIFICATION_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_VERIFICATION_CASE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedUseCase() <em>Owned Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_USE_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_USE_CASE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedView() <em>Owned View</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedView()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_VIEW__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_VIEW).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedViewpoint() <em>Owned Viewpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedViewpoint()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_VIEWPOINT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_VIEWPOINT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedRendering() <em>Owned Rendering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRendering()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_RENDERING__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_RENDERING).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedMetadata() <em>Owned Metadata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMetadata()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_METADATA__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_METADATA).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedUsage() <em>Owned Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUsage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_USAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.DEFINITION__OWNED_USAGE).getSettingDelegate();
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getUsage() {
		return (EList<Usage>)USAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PortUsage> getOwnedPort() {
		return (EList<PortUsage>)OWNED_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getDirectedUsage() {
		return (EList<Usage>)DIRECTED_USAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionUsage> getOwnedAction() {
		return (EList<ActionUsage>)OWNED_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConnectorAsUsage> getOwnedConnection() {
		return (EList<ConnectorAsUsage>)OWNED_CONNECTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ItemUsage> getOwnedItem() {
		return (EList<ItemUsage>)OWNED_ITEM__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getOwnedPart() {
		return (EList<PartUsage>)OWNED_PART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<InterfaceUsage> getOwnedInterface() {
		return (EList<InterfaceUsage>)OWNED_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AttributeUsage> getOwnedAttribute() {
		return (EList<AttributeUsage>)OWNED_ATTRIBUTE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewUsage> getOwnedView() {
		return (EList<ViewUsage>)OWNED_VIEW__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewpointUsage> getOwnedViewpoint() {
		return (EList<ViewpointUsage>)OWNED_VIEWPOINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RenderingUsage> getOwnedRendering() {
		return (EList<RenderingUsage>)OWNED_RENDERING__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VerificationCaseUsage> getOwnedVerificationCase() {
		return (EList<VerificationCaseUsage>)OWNED_VERIFICATION_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EnumerationUsage> getOwnedEnumeration() {
		return (EList<EnumerationUsage>)OWNED_ENUMERATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AllocationUsage> getOwnedAllocation() {
		return (EList<AllocationUsage>)OWNED_ALLOCATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernUsage> getOwnedConcern() {
		return (EList<ConcernUsage>)OWNED_CONCERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OccurrenceUsage> getOwnedOccurrence() {
		return (EList<OccurrenceUsage>)OWNED_OCCURRENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<UseCaseUsage> getOwnedUseCase() {
		return (EList<UseCaseUsage>)OWNED_USE_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FlowConnectionUsage> getOwnedFlow() {
		return (EList<FlowConnectionUsage>)OWNED_FLOW__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MetadataUsage> getOwnedMetadata() {
		return (EList<MetadataUsage>)OWNED_METADATA__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StateUsage> getOwnedState() {
		return (EList<StateUsage>)OWNED_STATE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getOwnedConstraint() {
		return (EList<ConstraintUsage>)OWNED_CONSTRAINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TransitionUsage> getOwnedTransition() {
		return (EList<TransitionUsage>)OWNED_TRANSITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RequirementUsage> getOwnedRequirement() {
		return (EList<RequirementUsage>)OWNED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CalculationUsage> getOwnedCalculation() {
		return (EList<CalculationUsage>)OWNED_CALCULATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVariation() {
		return isVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVariation(boolean newIsVariation) {
		boolean oldIsVariation = isVariation;
		isVariation = newIsVariation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.DEFINITION__IS_VARIATION, oldIsVariation, isVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AnalysisCaseUsage> getOwnedAnalysisCase() {
		return (EList<AnalysisCaseUsage>)OWNED_ANALYSIS_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CaseUsage> getOwnedCase() {
		return (EList<CaseUsage>)OWNED_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ReferenceUsage> getOwnedReference() {
		return (EList<ReferenceUsage>)OWNED_REFERENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getOwnedUsage() {
		return (EList<Usage>)OWNED_USAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getVariant() {
		return (EList<Usage>)VARIANT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VariantMembership> getVariantMembership() {
		return (EList<VariantMembership>)VARIANT_MEMBERSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	// Additional Overrides
	
	@Override
	public boolean isAbstract() {
		return isVariation() || super.isAbstract();
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__IS_VARIATION:
				return isVariation();
			case SysMLPackage.DEFINITION__VARIANT:
				return getVariant();
			case SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP:
				return getVariantMembership();
			case SysMLPackage.DEFINITION__USAGE:
				return getUsage();
			case SysMLPackage.DEFINITION__DIRECTED_USAGE:
				return getDirectedUsage();
			case SysMLPackage.DEFINITION__OWNED_REFERENCE:
				return getOwnedReference();
			case SysMLPackage.DEFINITION__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case SysMLPackage.DEFINITION__OWNED_ENUMERATION:
				return getOwnedEnumeration();
			case SysMLPackage.DEFINITION__OWNED_OCCURRENCE:
				return getOwnedOccurrence();
			case SysMLPackage.DEFINITION__OWNED_ITEM:
				return getOwnedItem();
			case SysMLPackage.DEFINITION__OWNED_PART:
				return getOwnedPart();
			case SysMLPackage.DEFINITION__OWNED_PORT:
				return getOwnedPort();
			case SysMLPackage.DEFINITION__OWNED_CONNECTION:
				return getOwnedConnection();
			case SysMLPackage.DEFINITION__OWNED_FLOW:
				return getOwnedFlow();
			case SysMLPackage.DEFINITION__OWNED_INTERFACE:
				return getOwnedInterface();
			case SysMLPackage.DEFINITION__OWNED_ALLOCATION:
				return getOwnedAllocation();
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				return getOwnedAction();
			case SysMLPackage.DEFINITION__OWNED_STATE:
				return getOwnedState();
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				return getOwnedTransition();
			case SysMLPackage.DEFINITION__OWNED_CALCULATION:
				return getOwnedCalculation();
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				return getOwnedConstraint();
			case SysMLPackage.DEFINITION__OWNED_REQUIREMENT:
				return getOwnedRequirement();
			case SysMLPackage.DEFINITION__OWNED_CONCERN:
				return getOwnedConcern();
			case SysMLPackage.DEFINITION__OWNED_CASE:
				return getOwnedCase();
			case SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE:
				return getOwnedAnalysisCase();
			case SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE:
				return getOwnedVerificationCase();
			case SysMLPackage.DEFINITION__OWNED_USE_CASE:
				return getOwnedUseCase();
			case SysMLPackage.DEFINITION__OWNED_VIEW:
				return getOwnedView();
			case SysMLPackage.DEFINITION__OWNED_VIEWPOINT:
				return getOwnedViewpoint();
			case SysMLPackage.DEFINITION__OWNED_RENDERING:
				return getOwnedRendering();
			case SysMLPackage.DEFINITION__OWNED_METADATA:
				return getOwnedMetadata();
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				return getOwnedUsage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__IS_VARIATION:
				setIsVariation((Boolean)newValue);
				return;
			case SysMLPackage.DEFINITION__VARIANT:
				getVariant().clear();
				getVariant().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP:
				getVariantMembership().clear();
				getVariantMembership().addAll((Collection<? extends VariantMembership>)newValue);
				return;
			case SysMLPackage.DEFINITION__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.DEFINITION__DIRECTED_USAGE:
				getDirectedUsage().clear();
				getDirectedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_REFERENCE:
				getOwnedReference().clear();
				getOwnedReference().addAll((Collection<? extends ReferenceUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends AttributeUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ENUMERATION:
				getOwnedEnumeration().clear();
				getOwnedEnumeration().addAll((Collection<? extends EnumerationUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_OCCURRENCE:
				getOwnedOccurrence().clear();
				getOwnedOccurrence().addAll((Collection<? extends OccurrenceUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ITEM:
				getOwnedItem().clear();
				getOwnedItem().addAll((Collection<? extends ItemUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_PART:
				getOwnedPart().clear();
				getOwnedPart().addAll((Collection<? extends PartUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CONNECTION:
				getOwnedConnection().clear();
				getOwnedConnection().addAll((Collection<? extends ConnectorAsUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_FLOW:
				getOwnedFlow().clear();
				getOwnedFlow().addAll((Collection<? extends FlowConnectionUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_INTERFACE:
				getOwnedInterface().clear();
				getOwnedInterface().addAll((Collection<? extends InterfaceUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ALLOCATION:
				getOwnedAllocation().clear();
				getOwnedAllocation().addAll((Collection<? extends AllocationUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				getOwnedAction().clear();
				getOwnedAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends StateUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends TransitionUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CALCULATION:
				getOwnedCalculation().clear();
				getOwnedCalculation().addAll((Collection<? extends CalculationUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				getOwnedConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_REQUIREMENT:
				getOwnedRequirement().clear();
				getOwnedRequirement().addAll((Collection<? extends RequirementUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CONCERN:
				getOwnedConcern().clear();
				getOwnedConcern().addAll((Collection<? extends ConcernUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CASE:
				getOwnedCase().clear();
				getOwnedCase().addAll((Collection<? extends CaseUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE:
				getOwnedAnalysisCase().clear();
				getOwnedAnalysisCase().addAll((Collection<? extends AnalysisCaseUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE:
				getOwnedVerificationCase().clear();
				getOwnedVerificationCase().addAll((Collection<? extends VerificationCaseUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCaseUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_VIEW:
				getOwnedView().clear();
				getOwnedView().addAll((Collection<? extends ViewUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_VIEWPOINT:
				getOwnedViewpoint().clear();
				getOwnedViewpoint().addAll((Collection<? extends ViewpointUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_RENDERING:
				getOwnedRendering().clear();
				getOwnedRendering().addAll((Collection<? extends RenderingUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_METADATA:
				getOwnedMetadata().clear();
				getOwnedMetadata().addAll((Collection<? extends MetadataUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				getOwnedUsage().clear();
				getOwnedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__IS_VARIATION:
				setIsVariation(IS_VARIATION_EDEFAULT);
				return;
			case SysMLPackage.DEFINITION__VARIANT:
				getVariant().clear();
				return;
			case SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP:
				getVariantMembership().clear();
				return;
			case SysMLPackage.DEFINITION__USAGE:
				getUsage().clear();
				return;
			case SysMLPackage.DEFINITION__DIRECTED_USAGE:
				getDirectedUsage().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_REFERENCE:
				getOwnedReference().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ENUMERATION:
				getOwnedEnumeration().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_OCCURRENCE:
				getOwnedOccurrence().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ITEM:
				getOwnedItem().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_PART:
				getOwnedPart().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CONNECTION:
				getOwnedConnection().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_FLOW:
				getOwnedFlow().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_INTERFACE:
				getOwnedInterface().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ALLOCATION:
				getOwnedAllocation().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				getOwnedAction().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_STATE:
				getOwnedState().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				getOwnedTransition().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CALCULATION:
				getOwnedCalculation().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_REQUIREMENT:
				getOwnedRequirement().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CONCERN:
				getOwnedConcern().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CASE:
				getOwnedCase().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE:
				getOwnedAnalysisCase().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE:
				getOwnedVerificationCase().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_VIEW:
				getOwnedView().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_VIEWPOINT:
				getOwnedViewpoint().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_RENDERING:
				getOwnedRendering().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_METADATA:
				getOwnedMetadata().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				getOwnedUsage().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__IS_VARIATION:
				return isVariation != IS_VARIATION_EDEFAULT;
			case SysMLPackage.DEFINITION__VARIANT:
				return VARIANT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__VARIANT_MEMBERSHIP:
				return VARIANT_MEMBERSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__USAGE:
				return USAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__DIRECTED_USAGE:
				return DIRECTED_USAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_REFERENCE:
				return OWNED_REFERENCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_ATTRIBUTE:
				return OWNED_ATTRIBUTE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_ENUMERATION:
				return OWNED_ENUMERATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_OCCURRENCE:
				return OWNED_OCCURRENCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_ITEM:
				return OWNED_ITEM__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_PART:
				return OWNED_PART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_PORT:
				return OWNED_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_CONNECTION:
				return OWNED_CONNECTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_FLOW:
				return OWNED_FLOW__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_INTERFACE:
				return OWNED_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_ALLOCATION:
				return OWNED_ALLOCATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				return OWNED_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_STATE:
				return OWNED_STATE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				return OWNED_TRANSITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_CALCULATION:
				return OWNED_CALCULATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				return OWNED_CONSTRAINT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_REQUIREMENT:
				return OWNED_REQUIREMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_CONCERN:
				return OWNED_CONCERN__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_CASE:
				return OWNED_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_ANALYSIS_CASE:
				return OWNED_ANALYSIS_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_VERIFICATION_CASE:
				return OWNED_VERIFICATION_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_USE_CASE:
				return OWNED_USE_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_VIEW:
				return OWNED_VIEW__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_VIEWPOINT:
				return OWNED_VIEWPOINT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_RENDERING:
				return OWNED_RENDERING__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_METADATA:
				return OWNED_METADATA__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				return OWNED_USAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isVariation: ");
		result.append(isVariation);
		result.append(')');
		return result.toString();
	}

} //DefinitionImpl
