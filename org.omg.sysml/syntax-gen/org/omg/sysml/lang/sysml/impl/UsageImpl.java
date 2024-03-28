/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2024 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConnectorAsUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.UseCaseUsage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.util.UsageUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#isReference <em>Is Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getVariantMembership <em>Variant Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedReference <em>Nested Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedAttribute <em>Nested Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedEnumeration <em>Nested Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedOccurrence <em>Nested Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedItem <em>Nested Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedPart <em>Nested Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedConnection <em>Nested Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedFlow <em>Nested Flow</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedInterface <em>Nested Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedAllocation <em>Nested Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedState <em>Nested State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedTransition <em>Nested Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedCalculation <em>Nested Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedConstraint <em>Nested Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedRequirement <em>Nested Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedConcern <em>Nested Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedCase <em>Nested Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedAnalysisCase <em>Nested Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedVerificationCase <em>Nested Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedUseCase <em>Nested Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedView <em>Nested View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedViewpoint <em>Nested Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedRendering <em>Nested Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedMetadata <em>Nested Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageImpl extends FeatureImpl implements Usage {
	/**
	 * The cached setting delegate for the '{@link #isReference() <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReference()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_REFERENCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__IS_REFERENCE).getSettingDelegate();
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
	protected EStructuralFeature.Internal.SettingDelegate VARIANT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__VARIANT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getVariantMembership() <em>Variant Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantMembership()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VARIANT_MEMBERSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__VARIANT_MEMBERSHIP).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwningDefinition() <em>Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__OWNING_DEFINITION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwningUsage() <em>Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningUsage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_USAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__OWNING_USAGE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedUsage() <em>Nested Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedUsage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_USAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_USAGE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getDefinition() <em>Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__DEFINITION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getUsage() <em>Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__USAGE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getDirectedUsage() <em>Directed Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedUsage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DIRECTED_USAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__DIRECTED_USAGE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedReference() <em>Nested Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedReference()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_REFERENCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_REFERENCE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedAttribute() <em>Nested Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_ATTRIBUTE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_ATTRIBUTE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedEnumeration() <em>Nested Enumeration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_ENUMERATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_ENUMERATION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedOccurrence() <em>Nested Occurrence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedOccurrence()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_OCCURRENCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_OCCURRENCE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedItem() <em>Nested Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedItem()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_ITEM__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_ITEM).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedPart() <em>Nested Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPart()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_PART__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_PART).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedPort() <em>Nested Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPort()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_PORT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_PORT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedConnection() <em>Nested Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedConnection()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_CONNECTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_CONNECTION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedFlow() <em>Nested Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedFlow()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_FLOW__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_FLOW).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedInterface() <em>Nested Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_INTERFACE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedAllocation() <em>Nested Allocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedAllocation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_ALLOCATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_ALLOCATION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedAction() <em>Nested Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_ACTION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedState() <em>Nested State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedState()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_STATE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_STATE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedTransition() <em>Nested Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedTransition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_TRANSITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_TRANSITION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedCalculation() <em>Nested Calculation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedCalculation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_CALCULATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_CALCULATION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedConstraint() <em>Nested Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedConstraint()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_CONSTRAINT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_CONSTRAINT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedRequirement() <em>Nested Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_REQUIREMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_REQUIREMENT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedConcern() <em>Nested Concern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedConcern()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_CONCERN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_CONCERN).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedCase() <em>Nested Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_CASE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedAnalysisCase() <em>Nested Analysis Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedAnalysisCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_ANALYSIS_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_ANALYSIS_CASE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedVerificationCase() <em>Nested Verification Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedVerificationCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_VERIFICATION_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_VERIFICATION_CASE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedUseCase() <em>Nested Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_USE_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_USE_CASE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedView() <em>Nested View</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedView()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_VIEW__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_VIEW).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedViewpoint() <em>Nested Viewpoint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedViewpoint()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_VIEWPOINT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_VIEWPOINT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedRendering() <em>Nested Rendering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedRendering()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_RENDERING__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_RENDERING).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getNestedMetadata() <em>Nested Metadata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedMetadata()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NESTED_METADATA__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USAGE__NESTED_METADATA).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * Default isComposite to true (so isReference is false) for Usages.  
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected UsageImpl() {
		super();
		isComposite = true;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getNestedUsage() {
		return (EList<Usage>)NESTED_USAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwningUsage() {
		return (Usage)OWNING_USAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage basicGetOwningUsage() {
		return (Usage)OWNING_USAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningUsage(Usage newOwningUsage) {
		OWNING_USAGE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getOwningDefinition() {
		return (Definition)OWNING_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition basicGetOwningDefinition() {
		return (Definition)OWNING_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningDefinition(Definition newOwningDefinition) {
		OWNING_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PortUsage> getNestedPort() {
		return (EList<PortUsage>)NESTED_PORT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StateUsage> getNestedState() {
		return (EList<StateUsage>)NESTED_STATE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getNestedConstraint() {
		return (EList<ConstraintUsage>)NESTED_CONSTRAINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TransitionUsage> getNestedTransition() {
		return (EList<TransitionUsage>)NESTED_TRANSITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RequirementUsage> getNestedRequirement() {
		return (EList<RequirementUsage>)NESTED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CalculationUsage> getNestedCalculation() {
		return (EList<CalculationUsage>)NESTED_CALCULATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.USAGE__IS_VARIATION, oldIsVariation, isVariation));
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
	public EList<CaseUsage> getNestedCase() {
		return (EList<CaseUsage>)NESTED_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	public EList<AnalysisCaseUsage> getNestedAnalysisCase() {
		return (EList<AnalysisCaseUsage>)NESTED_ANALYSIS_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	public EList<ReferenceUsage> getNestedReference() {
		return (EList<ReferenceUsage>)NESTED_REFERENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConnectorAsUsage> getNestedConnection() {
		return (EList<ConnectorAsUsage>)NESTED_CONNECTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ItemUsage> getNestedItem() {
		return (EList<ItemUsage>)NESTED_ITEM__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getNestedPart() {
		return (EList<PartUsage>)NESTED_PART__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<InterfaceUsage> getNestedInterface() {
		return (EList<InterfaceUsage>)NESTED_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AttributeUsage> getNestedAttribute() {
		return (EList<AttributeUsage>)NESTED_ATTRIBUTE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewUsage> getNestedView() {
		return (EList<ViewUsage>)NESTED_VIEW__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ViewpointUsage> getNestedViewpoint() {
		return (EList<ViewpointUsage>)NESTED_VIEWPOINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RenderingUsage> getNestedRendering() {
		return (EList<RenderingUsage>)NESTED_RENDERING__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VerificationCaseUsage> getNestedVerificationCase() {
		return (EList<VerificationCaseUsage>)NESTED_VERIFICATION_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EnumerationUsage> getNestedEnumeration() {
		return (EList<EnumerationUsage>)NESTED_ENUMERATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AllocationUsage> getNestedAllocation() {
		return (EList<AllocationUsage>)NESTED_ALLOCATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernUsage> getNestedConcern() {
		return (EList<ConcernUsage>)NESTED_CONCERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OccurrenceUsage> getNestedOccurrence() {
		return (EList<OccurrenceUsage>)NESTED_OCCURRENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FlowConnectionUsage> getNestedFlow() {
		return (EList<FlowConnectionUsage>)NESTED_FLOW__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<MetadataUsage> getNestedMetadata() {
		return (EList<MetadataUsage>)NESTED_METADATA__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionUsage> getNestedAction() {
		return (EList<ActionUsage>)NESTED_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<UseCaseUsage> getNestedUseCase() {
		return (EList<UseCaseUsage>)NESTED_USE_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Classifier> getDefinition() {
		return (EList<Classifier>)DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinition() {
		return !getDefinition().isEmpty();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReference() {
		return (Boolean)IS_REFERENCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReference(boolean newIsReference) {
		IS_REFERENCE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsReference);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> definition = (EList<Type>)((EList<?>)getDefinition());
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	// Additional overrides
	
	@Override
	public boolean isAbstract() {
		return isVariation() || super.isAbstract();
	}

	@Override
	public boolean isComposite() {
		return UsageUtil.isComposite(this, isComposite);
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
			case SysMLPackage.USAGE__IS_REFERENCE:
				return isReference();
			case SysMLPackage.USAGE__IS_VARIATION:
				return isVariation();
			case SysMLPackage.USAGE__VARIANT:
				return getVariant();
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP:
				return getVariantMembership();
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				if (resolve) return getOwningDefinition();
				return basicGetOwningDefinition();
			case SysMLPackage.USAGE__OWNING_USAGE:
				if (resolve) return getOwningUsage();
				return basicGetOwningUsage();
			case SysMLPackage.USAGE__NESTED_USAGE:
				return getNestedUsage();
			case SysMLPackage.USAGE__DEFINITION:
				return getDefinition();
			case SysMLPackage.USAGE__USAGE:
				return getUsage();
			case SysMLPackage.USAGE__DIRECTED_USAGE:
				return getDirectedUsage();
			case SysMLPackage.USAGE__NESTED_REFERENCE:
				return getNestedReference();
			case SysMLPackage.USAGE__NESTED_ATTRIBUTE:
				return getNestedAttribute();
			case SysMLPackage.USAGE__NESTED_ENUMERATION:
				return getNestedEnumeration();
			case SysMLPackage.USAGE__NESTED_OCCURRENCE:
				return getNestedOccurrence();
			case SysMLPackage.USAGE__NESTED_ITEM:
				return getNestedItem();
			case SysMLPackage.USAGE__NESTED_PART:
				return getNestedPart();
			case SysMLPackage.USAGE__NESTED_PORT:
				return getNestedPort();
			case SysMLPackage.USAGE__NESTED_CONNECTION:
				return getNestedConnection();
			case SysMLPackage.USAGE__NESTED_FLOW:
				return getNestedFlow();
			case SysMLPackage.USAGE__NESTED_INTERFACE:
				return getNestedInterface();
			case SysMLPackage.USAGE__NESTED_ALLOCATION:
				return getNestedAllocation();
			case SysMLPackage.USAGE__NESTED_ACTION:
				return getNestedAction();
			case SysMLPackage.USAGE__NESTED_STATE:
				return getNestedState();
			case SysMLPackage.USAGE__NESTED_TRANSITION:
				return getNestedTransition();
			case SysMLPackage.USAGE__NESTED_CALCULATION:
				return getNestedCalculation();
			case SysMLPackage.USAGE__NESTED_CONSTRAINT:
				return getNestedConstraint();
			case SysMLPackage.USAGE__NESTED_REQUIREMENT:
				return getNestedRequirement();
			case SysMLPackage.USAGE__NESTED_CONCERN:
				return getNestedConcern();
			case SysMLPackage.USAGE__NESTED_CASE:
				return getNestedCase();
			case SysMLPackage.USAGE__NESTED_ANALYSIS_CASE:
				return getNestedAnalysisCase();
			case SysMLPackage.USAGE__NESTED_VERIFICATION_CASE:
				return getNestedVerificationCase();
			case SysMLPackage.USAGE__NESTED_USE_CASE:
				return getNestedUseCase();
			case SysMLPackage.USAGE__NESTED_VIEW:
				return getNestedView();
			case SysMLPackage.USAGE__NESTED_VIEWPOINT:
				return getNestedViewpoint();
			case SysMLPackage.USAGE__NESTED_RENDERING:
				return getNestedRendering();
			case SysMLPackage.USAGE__NESTED_METADATA:
				return getNestedMetadata();
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
			case SysMLPackage.USAGE__IS_REFERENCE:
				setIsReference((Boolean)newValue);
				return;
			case SysMLPackage.USAGE__IS_VARIATION:
				setIsVariation((Boolean)newValue);
				return;
			case SysMLPackage.USAGE__VARIANT:
				getVariant().clear();
				getVariant().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP:
				getVariantMembership().clear();
				getVariantMembership().addAll((Collection<? extends VariantMembership>)newValue);
				return;
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				setOwningDefinition((Definition)newValue);
				return;
			case SysMLPackage.USAGE__OWNING_USAGE:
				setOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				getNestedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__DEFINITION:
				getDefinition().clear();
				getDefinition().addAll((Collection<? extends Classifier>)newValue);
				return;
			case SysMLPackage.USAGE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__DIRECTED_USAGE:
				getDirectedUsage().clear();
				getDirectedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_REFERENCE:
				getNestedReference().clear();
				getNestedReference().addAll((Collection<? extends ReferenceUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ATTRIBUTE:
				getNestedAttribute().clear();
				getNestedAttribute().addAll((Collection<? extends AttributeUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ENUMERATION:
				getNestedEnumeration().clear();
				getNestedEnumeration().addAll((Collection<? extends EnumerationUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_OCCURRENCE:
				getNestedOccurrence().clear();
				getNestedOccurrence().addAll((Collection<? extends OccurrenceUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ITEM:
				getNestedItem().clear();
				getNestedItem().addAll((Collection<? extends ItemUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_PART:
				getNestedPart().clear();
				getNestedPart().addAll((Collection<? extends PartUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_PORT:
				getNestedPort().clear();
				getNestedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CONNECTION:
				getNestedConnection().clear();
				getNestedConnection().addAll((Collection<? extends ConnectorAsUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_FLOW:
				getNestedFlow().clear();
				getNestedFlow().addAll((Collection<? extends FlowConnectionUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_INTERFACE:
				getNestedInterface().clear();
				getNestedInterface().addAll((Collection<? extends InterfaceUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ALLOCATION:
				getNestedAllocation().clear();
				getNestedAllocation().addAll((Collection<? extends AllocationUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ACTION:
				getNestedAction().clear();
				getNestedAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_STATE:
				getNestedState().clear();
				getNestedState().addAll((Collection<? extends StateUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_TRANSITION:
				getNestedTransition().clear();
				getNestedTransition().addAll((Collection<? extends TransitionUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CALCULATION:
				getNestedCalculation().clear();
				getNestedCalculation().addAll((Collection<? extends CalculationUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CONSTRAINT:
				getNestedConstraint().clear();
				getNestedConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_REQUIREMENT:
				getNestedRequirement().clear();
				getNestedRequirement().addAll((Collection<? extends RequirementUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CONCERN:
				getNestedConcern().clear();
				getNestedConcern().addAll((Collection<? extends ConcernUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CASE:
				getNestedCase().clear();
				getNestedCase().addAll((Collection<? extends CaseUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ANALYSIS_CASE:
				getNestedAnalysisCase().clear();
				getNestedAnalysisCase().addAll((Collection<? extends AnalysisCaseUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_VERIFICATION_CASE:
				getNestedVerificationCase().clear();
				getNestedVerificationCase().addAll((Collection<? extends VerificationCaseUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_USE_CASE:
				getNestedUseCase().clear();
				getNestedUseCase().addAll((Collection<? extends UseCaseUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_VIEW:
				getNestedView().clear();
				getNestedView().addAll((Collection<? extends ViewUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_VIEWPOINT:
				getNestedViewpoint().clear();
				getNestedViewpoint().addAll((Collection<? extends ViewpointUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_RENDERING:
				getNestedRendering().clear();
				getNestedRendering().addAll((Collection<? extends RenderingUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_METADATA:
				getNestedMetadata().clear();
				getNestedMetadata().addAll((Collection<? extends MetadataUsage>)newValue);
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
			case SysMLPackage.USAGE__IS_REFERENCE:
				IS_REFERENCE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.USAGE__IS_VARIATION:
				setIsVariation(IS_VARIATION_EDEFAULT);
				return;
			case SysMLPackage.USAGE__VARIANT:
				getVariant().clear();
				return;
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP:
				getVariantMembership().clear();
				return;
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				setOwningDefinition((Definition)null);
				return;
			case SysMLPackage.USAGE__OWNING_USAGE:
				setOwningUsage((Usage)null);
				return;
			case SysMLPackage.USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				return;
			case SysMLPackage.USAGE__DEFINITION:
				getDefinition().clear();
				return;
			case SysMLPackage.USAGE__USAGE:
				getUsage().clear();
				return;
			case SysMLPackage.USAGE__DIRECTED_USAGE:
				getDirectedUsage().clear();
				return;
			case SysMLPackage.USAGE__NESTED_REFERENCE:
				getNestedReference().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ATTRIBUTE:
				getNestedAttribute().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ENUMERATION:
				getNestedEnumeration().clear();
				return;
			case SysMLPackage.USAGE__NESTED_OCCURRENCE:
				getNestedOccurrence().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ITEM:
				getNestedItem().clear();
				return;
			case SysMLPackage.USAGE__NESTED_PART:
				getNestedPart().clear();
				return;
			case SysMLPackage.USAGE__NESTED_PORT:
				getNestedPort().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CONNECTION:
				getNestedConnection().clear();
				return;
			case SysMLPackage.USAGE__NESTED_FLOW:
				getNestedFlow().clear();
				return;
			case SysMLPackage.USAGE__NESTED_INTERFACE:
				getNestedInterface().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ALLOCATION:
				getNestedAllocation().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ACTION:
				getNestedAction().clear();
				return;
			case SysMLPackage.USAGE__NESTED_STATE:
				getNestedState().clear();
				return;
			case SysMLPackage.USAGE__NESTED_TRANSITION:
				getNestedTransition().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CALCULATION:
				getNestedCalculation().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CONSTRAINT:
				getNestedConstraint().clear();
				return;
			case SysMLPackage.USAGE__NESTED_REQUIREMENT:
				getNestedRequirement().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CONCERN:
				getNestedConcern().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CASE:
				getNestedCase().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ANALYSIS_CASE:
				getNestedAnalysisCase().clear();
				return;
			case SysMLPackage.USAGE__NESTED_VERIFICATION_CASE:
				getNestedVerificationCase().clear();
				return;
			case SysMLPackage.USAGE__NESTED_USE_CASE:
				getNestedUseCase().clear();
				return;
			case SysMLPackage.USAGE__NESTED_VIEW:
				getNestedView().clear();
				return;
			case SysMLPackage.USAGE__NESTED_VIEWPOINT:
				getNestedViewpoint().clear();
				return;
			case SysMLPackage.USAGE__NESTED_RENDERING:
				getNestedRendering().clear();
				return;
			case SysMLPackage.USAGE__NESTED_METADATA:
				getNestedMetadata().clear();
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
			case SysMLPackage.USAGE__TYPE:
				return isSetType();
			case SysMLPackage.USAGE__IS_REFERENCE:
				return IS_REFERENCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__IS_VARIATION:
				return isVariation != IS_VARIATION_EDEFAULT;
			case SysMLPackage.USAGE__VARIANT:
				return VARIANT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP:
				return VARIANT_MEMBERSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				return OWNING_DEFINITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__OWNING_USAGE:
				return OWNING_USAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_USAGE:
				return NESTED_USAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__DEFINITION:
				return isSetDefinition();
			case SysMLPackage.USAGE__USAGE:
				return USAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__DIRECTED_USAGE:
				return DIRECTED_USAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_REFERENCE:
				return NESTED_REFERENCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_ATTRIBUTE:
				return NESTED_ATTRIBUTE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_ENUMERATION:
				return NESTED_ENUMERATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_OCCURRENCE:
				return NESTED_OCCURRENCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_ITEM:
				return NESTED_ITEM__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_PART:
				return NESTED_PART__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_PORT:
				return NESTED_PORT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_CONNECTION:
				return NESTED_CONNECTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_FLOW:
				return NESTED_FLOW__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_INTERFACE:
				return NESTED_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_ALLOCATION:
				return NESTED_ALLOCATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_ACTION:
				return NESTED_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_STATE:
				return NESTED_STATE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_TRANSITION:
				return NESTED_TRANSITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_CALCULATION:
				return NESTED_CALCULATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_CONSTRAINT:
				return NESTED_CONSTRAINT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_REQUIREMENT:
				return NESTED_REQUIREMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_CONCERN:
				return NESTED_CONCERN__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_CASE:
				return NESTED_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_ANALYSIS_CASE:
				return NESTED_ANALYSIS_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_VERIFICATION_CASE:
				return NESTED_VERIFICATION_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_USE_CASE:
				return NESTED_USE_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_VIEW:
				return NESTED_VIEW__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_VIEWPOINT:
				return NESTED_VIEWPOINT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_RENDERING:
				return NESTED_RENDERING__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.USAGE__NESTED_METADATA:
				return NESTED_METADATA__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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

} //UsageImpl
