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
 * <p>A Usage is a usage of a Definition. A Usage may only be an <code>ownedFeature</code> of a Definition or another Usage.</p>
 * 
 * <p>A Usage may have <code>nestedUsages</code> that model <code>features</code> that apply in the context of the <code>owningUsage</code>. A Usage may also have Definitions nested in it, but this has no semantic significance, other than the nested scoping resulting from the Usage being considered as a Namespace for any nested Definitions.</p>
 * 
 * <p>However, if a Usage has <code>isVariation</code> = true, then it represents a <em>variation point</em> Usage. In this case, all of its <code>members</code> must be <code>variant</code> Usages, related to the Usage by VariantMembership Relationships. Rather than being <code>features</code> of the Usage, <code>variant</code> Usages model different concrete alternatives that can be chosen to fill in for the variation point Usage.</p>
 * variant = variantMembership.ownedVariantUsage
 * variantMembership = ownedMembership->selectByKind(VariantMembership)
 * not isVariation implies variantMembership->isEmpty()
 * isVariation implies variantMembership = ownedMembership
 * isReference = not isComposite
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedState <em>Nested State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedConstraint <em>Nested Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedTransition <em>Nested Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedRequirement <em>Nested Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedCalculation <em>Nested Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedCase <em>Nested Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAnalysisCase <em>Nested Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getVariantMembership <em>Variant Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedReference <em>Nested Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedConnection <em>Nested Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedItem <em>Nested Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedPart <em>Nested Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedInterface <em>Nested Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAttribute <em>Nested Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedView <em>Nested View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedViewpoint <em>Nested Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedRendering <em>Nested Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedVerificationCase <em>Nested Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedEnumeration <em>Nested Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAllocation <em>Nested Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedConcern <em>Nested Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedOccurrence <em>Nested Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedUseCase <em>Nested Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#isReference <em>Is Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedFlow <em>Nested Flow</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage()
 * @model abstract="true"
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
	 * <p>The Usages that are <code>ownedFeatures</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getOwningUsage
	 * @model opposite="owningUsage" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
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
	 * <p>The Usage in which this Usage is nested (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Usage</em>' reference.
	 * @see #setOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_OwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedUsage
	 * @model opposite="nestedUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
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
	 * <p>The Definition that owns this Usage (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Definition</em>' reference.
	 * @see #setOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_OwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedUsage
	 * @model opposite="ownedUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
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
	 * <p>The <code>ownedMemberships</code> of this Usage that are VariantMemberships. If <code>isVariation</code> = true, then this must be all <code>memberships</code> of the Usages. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_VariantMembership()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VariantMembership> getVariantMembership();

	/**
	 * Returns the value of the '<em><b>Nested Port</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PortUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage <em>Port Owning Usage</em>}'.
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
	 * <p>The PortUsages that are <code>ownedUsages</cpde> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Port</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedPort()
	 * @see org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage
	 * @model opposite="portOwningUsage" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
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
	 * <p>The StateUsages that are <tt>ownedUsages</tt> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested State</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedState()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The ConstraintUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedConstraint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constraintOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The TransitionUsages that are <tt>ownedUsages</tt> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Transition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transitionOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The RequirementUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Requirement</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedRequirement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The CalculationUsage that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Calculation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedCalculation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='calculationOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<CalculationUsage> getNestedCalculation();

	/**
	 * Returns the value of the '<em><b>Is Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this Usage is for a variation point or not. If true, then all the <code>memberships</code> of the Usage must be VariantMemberships.</p>
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
	 * <p>The <code>usages</code> of this Usage that are <code>directedFeatures</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_DirectedUsage()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body=' /usageWithDirectedUsage'"
	 *        annotation="subsets"
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
	 * <p>The CaseUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='caseOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The Usages which represent the variants of this Usage as a variation point Usage, if <code>isVariation</code> = true. If <code>isVariation</code> = false, the there must be no <code>variants</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Variant()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationUsage'"
	 *        annotation="subsets"
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
	 * <p>The AnalysisCaseUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Analysis Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAnalysisCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='analysisCaseOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The Usages that are <code>features</code> of this Usage (not necessarily owned).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Usage()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringUsage'"
	 *        annotation="subsets"
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
	 * @return the value of the '<em>Nested Reference</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedReference()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referenceOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The ConnectorAsUsages that are <code>nestedUsages</code> of this Usage. Note that this list includes BindingConnectorAsUsages and SuccessionAsUsages, even though these are ConnectorAsUsages but not ConnectionUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Connection</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedConnection()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectionOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The ItemUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Item</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedItem()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='itemOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The PartUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Part</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedPart()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='partOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The InterfaceUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Interface</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedInterface()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interfaceOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The AttributeUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Attribute</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAttribute()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='attributeOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The <code>nestedUsages</code> of this Usage that are ViewUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested View</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedView()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The <code>nestedUsages</p> of this Usage that are ViewpointUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedViewpoint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The <code>nestedUsages</p> of this Usage that are RenderingUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Rendering</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedRendering()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='renderingOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The <code>nestedUsages</code> of this Usage that are VerifactionCaseUsages</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Verification Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedVerificationCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='verificationCaseOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The EnumerationUsages that are <code>nestedUsages</code> of this Usage.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Enumeration</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedEnumeration()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='enumerationOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The AllocationUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Allocation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAllocation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='allocationOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The ConcernUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Concern</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedConcern()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='concernOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The OccurrenceUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Occurrence</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedOccurrence()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='occurrenceOwningUsage'"
	 *        annotation="subsets"
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
	 * <p>The Classifiers that are the types of this Usage. Nominally, these are Definitions, but other kinds of Kernel Classifiers are also allowed, to permit use of Classifiers from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Definition()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedUsage'"
	 *        annotation="redefines"
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
	 * <p>The UseCaseUsages that are <code>ownedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Use Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedUseCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='useCaseOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UseCaseUsage> getNestedUseCase();

	/**
	 * Returns the value of the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this Usage is a reference Usage, derived as the negation of <code>isComposite</code>.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Reference</em>' attribute.
	 * @see #setIsReference(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_IsReference()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
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
	 * <p>The FlowConnectionUsages that are <code>nestedUsages</code> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Flow</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedFlow()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FlowConnectionUsage> getNestedFlow();

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
	 * <p>The ActionUsages that are <tt>ownedUsages</tt> of this Usage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAction()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actionOwningUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ActionUsage> getNestedAction();

} // Usage
