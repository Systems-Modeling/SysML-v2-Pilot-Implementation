/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.IndividualUsage;
import org.omg.sysml.lang.sysml.InterfaceUsage;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.util.NonNotifyingEcoreEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getOwnedMembership_comp <em>Owned Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedState <em>Nested State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedConstraint <em>Nested Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedTransition <em>Nested Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedRequirement <em>Nested Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedCalculation <em>Nested Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getFlowFeature <em>Flow Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedCase <em>Nested Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedAnalysisCase <em>Nested Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getVariantMembership_comp <em>Variant Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedReference <em>Nested Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedConnection <em>Nested Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedItem <em>Nested Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedPart <em>Nested Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedIndividual <em>Nested Individual</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedInterface <em>Nested Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedAttribute <em>Nested Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedView <em>Nested View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedViewpoint <em>Nested Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedRendering <em>Nested Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedVerificationCase <em>Nested Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getVariantMembership <em>Variant Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UsageImpl extends FeatureImpl implements Usage {
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
	 * The cached value of the '{@link #getVariantMembership_comp() <em>Variant Membership comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantMembership_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<VariantMembership> variantMembership_comp;

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
	 * @generated NOT
	 */
	@Override
	public Membership getOwningMembership() {
		return super.getOwningMembership();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOwningMembership(Membership newOwningMembership, NotificationChain msgs) {
		return super.basicSetOwningMembership(newOwningMembership, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getOwnedMembership_comp() {
		if (ownedMembership_comp == null) {
			ownedMembership_comp = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, SysMLPackage.USAGE__OWNED_MEMBERSHIP_COMP, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE);
		}
		return ownedMembership_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getNestedUsage() {
		return new DerivedEObjectEList<Usage>(Usage.class, this, SysMLPackage.USAGE__NESTED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwningUsage() {
		Usage owningUsage = basicGetOwningUsage();
		return owningUsage != null && owningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)owningUsage) : owningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetOwningUsage() {
		Type owningType = getOwningType();
		return owningType instanceof Usage? (Usage)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningUsage(Usage newOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getOwningDefinition() {
		Definition owningDefinition = basicGetOwningDefinition();
		return owningDefinition != null && owningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)owningDefinition) : owningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetOwningDefinition() {
		Type owningType = getOwningType();
		return owningType instanceof Definition? (Definition)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningDefinition(Definition newOwningDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PortUsage> getNestedPort() {
		return new DerivedEObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.USAGE__NESTED_PORT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<StateUsage> getNestedState() {
		return new DerivedEObjectEList<StateUsage>(StateUsage.class, this, SysMLPackage.USAGE__NESTED_STATE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConstraintUsage> getNestedConstraint() {
		return new DerivedEObjectEList<ConstraintUsage>(ConstraintUsage.class, this, SysMLPackage.USAGE__NESTED_CONSTRAINT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TransitionUsage> getNestedTransition() {
		return new DerivedEObjectEList<TransitionUsage>(TransitionUsage.class, this, SysMLPackage.USAGE__NESTED_TRANSITION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<RequirementUsage> getNestedRequirement() {
		return new DerivedEObjectEList<RequirementUsage>(RequirementUsage.class, this, SysMLPackage.USAGE__NESTED_REQUIREMENT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<CalculationUsage> getNestedCalculation() {
		return new DerivedEObjectEList<CalculationUsage>(CalculationUsage.class, this, SysMLPackage.USAGE__NESTED_CALCULATION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
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
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getFlowFeature() {
		EList<Usage> flows = new NonNotifyingEcoreEList<>(Usage.class, this, SysMLPackage.USAGE__FLOW_FEATURE);
		getMembership().stream().
			filter(membership->membership instanceof FeatureMembership && ((FeatureMembership)membership).getDirection() != null).
			map(membership->((FeatureMembership)membership).getMemberFeature()).
			filter(Usage.class::isInstance).
			map(Usage.class::cast).
			forEachOrdered(flows::add);
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<CaseUsage> getNestedCase() {
		return new DerivedEObjectEList<>(CaseUsage.class, this, SysMLPackage.USAGE__NESTED_CASE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getVariant() {
		EList<Usage> variants = new NonNotifyingEcoreEList<>(Usage.class, this, SysMLPackage.USAGE__VARIANT);
		getVariantMembership().stream().
			map(VariantMembership::getOwnedVariantUsage).
			forEachOrdered(variants::add);
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AnalysisCaseUsage> getNestedAnalysisCase() {
		return new DerivedEObjectEList<>(AnalysisCaseUsage.class, this, SysMLPackage.USAGE__NESTED_ANALYSIS_CASE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getUsage() {
		return new DerivedEObjectEList<>(Usage.class, this, SysMLPackage.USAGE__NESTED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getVariantMembership() <em>Variant Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] VARIANT_MEMBERSHIP_ESUPERSETS = new int[] {SysMLPackage.USAGE__OWNED_MEMBERSHIP_COMP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ReferenceUsage> getNestedReference() {
		return new DerivedEObjectEList<>(ReferenceUsage.class, this, SysMLPackage.USAGE__NESTED_REFERENCE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConnectionUsage> getNestedConnection() {
		return new DerivedEObjectEList<>(ConnectionUsage.class, this, SysMLPackage.USAGE__NESTED_CONNECTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ItemUsage> getNestedItem() {
		return new DerivedEObjectEList<>(ItemUsage.class, this, SysMLPackage.USAGE__NESTED_ITEM, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PartUsage> getNestedPart() {
		return new DerivedEObjectEList<>(PartUsage.class, this, SysMLPackage.USAGE__NESTED_PART, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<IndividualUsage> getNestedIndividual() {
		return new DerivedEObjectEList<>(IndividualUsage.class, this, SysMLPackage.USAGE__NESTED_INDIVIDUAL, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<InterfaceUsage> getNestedInterface() {
		return new DerivedEObjectEList<>(InterfaceUsage.class, this, SysMLPackage.USAGE__NESTED_INTERFACE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AttributeUsage> getNestedAttribute() {
		return new DerivedEObjectEList<>(AttributeUsage.class, this, SysMLPackage.USAGE__NESTED_ATTRIBUTE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ViewUsage> getNestedView() {
		return new DerivedEObjectEList<>(ViewUsage.class, this, SysMLPackage.USAGE__NESTED_VIEW, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ViewpointUsage> getNestedViewpoint() {
		return new DerivedEObjectEList<>(ViewpointUsage.class, this, SysMLPackage.USAGE__NESTED_VIEWPOINT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<RenderingUsage> getNestedRendering() {
		return new DerivedEObjectEList<>(RenderingUsage.class, this, SysMLPackage.USAGE__NESTED_RENDERING, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<VerificationCaseUsage> getNestedVerificationCase() {
		return new DerivedEObjectEList<>(VerificationCaseUsage.class, this, SysMLPackage.USAGE__NESTED_VERIFICATION_CASE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ActionUsage> getNestedAction() {
		return new DerivedEObjectEList<>(ActionUsage.class, this, SysMLPackage.USAGE__NESTED_ACTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<VariantMembership> getVariantMembership() {
		EList<VariantMembership> variantMemberships = new NonNotifyingEcoreEList<>(VariantMembership.class, this, SysMLPackage.USAGE__VARIANT_MEMBERSHIP);
		super.getOwnedMembership().stream().
			filter(VariantMembership.class::isInstance).
			map(VariantMembership.class::cast).
			forEachOrdered(variantMemberships::add);
		variantMemberships.addAll(getVariantMembership_comp());
		return variantMemberships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariantMembership> getVariantMembership_comp() {
		if (variantMembership_comp == null) {
			variantMembership_comp = new EObjectContainmentEList<VariantMembership>(VariantMembership.class, this, SysMLPackage.USAGE__VARIANT_MEMBERSHIP_COMP);
		}
		return variantMembership_comp;
	}

	// Additional overrides
	
	@Override
	public boolean isAbstract() {
		return isVariation() || super.isAbstract();
	}

	@Override
	protected Feature getNamingFeature() {
		if (getOwningVariantMembership() != null) {
			Feature subsettedFeature = getFirstSubsettedFeature().orElse(null);
			if (subsettedFeature != getOwningVariationUsage()) {
				return subsettedFeature;
			}
		}
		return super.getNamingFeature();
	}
	
	@Override
	public List<FeatureTyping> basicGetOwnedTyping() {
		List<FeatureTyping> typings = super.basicGetOwnedTyping();
		Definition variationDefinition = getOwningVariationDefinition();
		if (variationDefinition != null) {
			if (!typings.stream().anyMatch(s->s.getType() == variationDefinition)) {
				FeatureTyping typing = typings.stream().
						filter(s->s.getType() == null).findFirst().orElse(null);
				if (typing == null) {
					typing = SysMLFactory.eINSTANCE.createFeatureTyping();
					typing.setTypedFeature(this);
					getOwnedRelationship_comp().add(typing);
				}
				typing.setType(variationDefinition);
			}
		}
		return typings;
	}
	
	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		List<Subsetting> subsettings = super.basicGetOwnedSubsetting();
		Usage variationUsage = getOwningVariationUsage();
		if (variationUsage != null && isVariant()) {
			if (!subsettings.stream().anyMatch(s->s.getSubsettedFeature() == variationUsage)) {
				Subsetting subsetting = subsettings.stream().
						filter(s->!(s instanceof Redefinition) && s.getSubsettedFeature() == null).
						findFirst().orElse(null);
				if (subsetting == null) {
					subsetting = SysMLFactory.eINSTANCE.createSubsetting();
					subsetting.setSubsettingFeature(this);
					getOwnedRelationship_comp().add(subsetting);
				}
				subsetting.setSubsettedFeature(variationUsage);
			}
		}
		return super.getOwnedSubsetting();
	}
	
	/**
	 * A subject Parameter always redefines a subject Parameter.
	 */
	@Override
	public List<? extends Feature> getParameterRelevantFeatures(Type type) {
		if (isSubjectParameter()) {
			Feature typeSubject = getSubjectParameterOf(type);
			return typeSubject == null? Collections.emptyList(): 
				Collections.singletonList(typeSubject);
		}
		return super.getParameterRelevantFeatures(type);
	}
	
	@Override
	protected boolean isIgnoredParameter() {
		return super.isIgnoredParameter() || isSubjectParameter();
	}
	
	@Override
	public BindingConnector getValueConnector() {
		FeatureValue valuation = getValuation();
		if (valuation != null) {
			return super.getValueConnector();
		} else if (isSubjectParameter()){
			Feature subjectParameter = getRelevantSubjectParameter();
			if (subjectParameter != null) {
				valueConnector = makeBinding(valueConnector, subjectParameter, this);
			}
		}
		return valueConnector;
	}
	
	@Override
	public void transform() {
		basicGetOwnedTyping();
		getOwnedSubsetting();
		super.transform();
	}
	
	// Utility methods
	
	public Definition getOwningVariationDefinition() {
		org.omg.sysml.lang.sysml.Package owner = getOwningNamespace();
		return owner instanceof Definition && ((Definition)owner).isVariation()? 
				((Definition)owner): null;
	}

	public Usage getOwningVariationUsage() {
		org.omg.sysml.lang.sysml.Package owner = getOwningNamespace();
		return owner instanceof Usage && ((Usage)owner).isVariation()? ((Usage)owner): null;
	}

	public VariantMembership getOwningVariantMembership() {
		Membership owningMembership = getOwningMembership();
		return owningMembership instanceof VariantMembership? (VariantMembership)owningMembership: null;
	}
	
	public boolean isVariant() {
		return getOwningMembership() instanceof VariantMembership;
	}

	public Usage getSubjectParameter() {
		return null;
	}
	
	public boolean isSubjectParameter() {
		return getOwningFeatureMembership() instanceof SubjectMembership;
	}

	/**
	 * Return the relevant subject parameter to which this Usage should be bound.
	 */
	public Feature getRelevantSubjectParameter() {
		Type owningType = getOwningType();		
		if (owningType instanceof Usage && !owningType.isAbstract()) {
			if (((UsageImpl)owningType).hasRelevantSubjectParameter()) {
				return getSubjectParameterOf(((Usage)owningType).getOwningType());
			}
		}
		return null;
	}
	
	protected boolean hasRelevantSubjectParameter() {
		return false;
	}
	
	protected static Usage getSubjectParameterOf(Type type) {
		return type instanceof Definition? ((DefinitionImpl)type).getSubjectParameter():
			   type instanceof Usage? ((UsageImpl)type).getSubjectParameter():
			   null;
	}
	
	protected static Usage basicGetSubjectParameterOf(Type type) {
		Usage subjectParameter = null;
		if (type != null) {
			subjectParameter = (Usage)((TypeImpl)type).getOwnedFeatureByMembership(SubjectMembership.class);
			if (subjectParameter == null) {
				subjectParameter = addSubjectParameterTo(type);
			}
		}
		return subjectParameter;
	}
	
	public static Usage addSubjectParameterTo(Type type) {
		Usage parameter = SysMLFactory.eINSTANCE.createReferenceUsage();
		SubjectMembership membership = SysMLFactory.eINSTANCE.createSubjectMembership();
		membership.setOwnedSubjectParameter_comp(parameter);
		type.getOwnedFeatureMembership_comp().add(membership);
		return parameter;
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.USAGE__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMembership_comp()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.USAGE__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<?>)getOwnedMembership_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP_COMP:
				return ((InternalEList<?>)getVariantMembership_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.USAGE__NESTED_USAGE:
				return getNestedUsage();
			case SysMLPackage.USAGE__OWNING_USAGE:
				if (resolve) return getOwningUsage();
				return basicGetOwningUsage();
			case SysMLPackage.USAGE__NESTED_PORT:
				return getNestedPort();
			case SysMLPackage.USAGE__NESTED_ACTION:
				return getNestedAction();
			case SysMLPackage.USAGE__NESTED_STATE:
				return getNestedState();
			case SysMLPackage.USAGE__NESTED_CONSTRAINT:
				return getNestedConstraint();
			case SysMLPackage.USAGE__NESTED_TRANSITION:
				return getNestedTransition();
			case SysMLPackage.USAGE__NESTED_REQUIREMENT:
				return getNestedRequirement();
			case SysMLPackage.USAGE__NESTED_CALCULATION:
				return getNestedCalculation();
			case SysMLPackage.USAGE__IS_VARIATION:
				return isVariation();
			case SysMLPackage.USAGE__FLOW_FEATURE:
				return getFlowFeature();
			case SysMLPackage.USAGE__NESTED_CASE:
				return getNestedCase();
			case SysMLPackage.USAGE__NESTED_ANALYSIS_CASE:
				return getNestedAnalysisCase();
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP_COMP:
				return getVariantMembership_comp();
			case SysMLPackage.USAGE__USAGE:
				return getUsage();
			case SysMLPackage.USAGE__VARIANT:
				return getVariant();
			case SysMLPackage.USAGE__NESTED_REFERENCE:
				return getNestedReference();
			case SysMLPackage.USAGE__NESTED_CONNECTION:
				return getNestedConnection();
			case SysMLPackage.USAGE__NESTED_ITEM:
				return getNestedItem();
			case SysMLPackage.USAGE__NESTED_PART:
				return getNestedPart();
			case SysMLPackage.USAGE__NESTED_INDIVIDUAL:
				return getNestedIndividual();
			case SysMLPackage.USAGE__NESTED_INTERFACE:
				return getNestedInterface();
			case SysMLPackage.USAGE__NESTED_ATTRIBUTE:
				return getNestedAttribute();
			case SysMLPackage.USAGE__NESTED_VIEW:
				return getNestedView();
			case SysMLPackage.USAGE__NESTED_VIEWPOINT:
				return getNestedViewpoint();
			case SysMLPackage.USAGE__NESTED_RENDERING:
				return getNestedRendering();
			case SysMLPackage.USAGE__NESTED_VERIFICATION_CASE:
				return getNestedVerificationCase();
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				if (resolve) return getOwningDefinition();
				return basicGetOwningDefinition();
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP:
				return getVariantMembership();
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
			case SysMLPackage.USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				getNestedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__OWNING_USAGE:
				setOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_PORT:
				getNestedPort().clear();
				getNestedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ACTION:
				getNestedAction().clear();
				getNestedAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_STATE:
				getNestedState().clear();
				getNestedState().addAll((Collection<? extends StateUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CONSTRAINT:
				getNestedConstraint().clear();
				getNestedConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_TRANSITION:
				getNestedTransition().clear();
				getNestedTransition().addAll((Collection<? extends TransitionUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_REQUIREMENT:
				getNestedRequirement().clear();
				getNestedRequirement().addAll((Collection<? extends RequirementUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CALCULATION:
				getNestedCalculation().clear();
				getNestedCalculation().addAll((Collection<? extends CalculationUsage>)newValue);
				return;
			case SysMLPackage.USAGE__IS_VARIATION:
				setIsVariation((Boolean)newValue);
				return;
			case SysMLPackage.USAGE__FLOW_FEATURE:
				getFlowFeature().clear();
				getFlowFeature().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CASE:
				getNestedCase().clear();
				getNestedCase().addAll((Collection<? extends CaseUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ANALYSIS_CASE:
				getNestedAnalysisCase().clear();
				getNestedAnalysisCase().addAll((Collection<? extends AnalysisCaseUsage>)newValue);
				return;
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP_COMP:
				getVariantMembership_comp().clear();
				getVariantMembership_comp().addAll((Collection<? extends VariantMembership>)newValue);
				return;
			case SysMLPackage.USAGE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__VARIANT:
				getVariant().clear();
				getVariant().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_REFERENCE:
				getNestedReference().clear();
				getNestedReference().addAll((Collection<? extends ReferenceUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_CONNECTION:
				getNestedConnection().clear();
				getNestedConnection().addAll((Collection<? extends ConnectionUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ITEM:
				getNestedItem().clear();
				getNestedItem().addAll((Collection<? extends ItemUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_PART:
				getNestedPart().clear();
				getNestedPart().addAll((Collection<? extends PartUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_INDIVIDUAL:
				getNestedIndividual().clear();
				getNestedIndividual().addAll((Collection<? extends IndividualUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_INTERFACE:
				getNestedInterface().clear();
				getNestedInterface().addAll((Collection<? extends InterfaceUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ATTRIBUTE:
				getNestedAttribute().clear();
				getNestedAttribute().addAll((Collection<? extends AttributeUsage>)newValue);
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
			case SysMLPackage.USAGE__NESTED_VERIFICATION_CASE:
				getNestedVerificationCase().clear();
				getNestedVerificationCase().addAll((Collection<? extends VerificationCaseUsage>)newValue);
				return;
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				setOwningDefinition((Definition)newValue);
				return;
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP:
				getVariantMembership().clear();
				getVariantMembership().addAll((Collection<? extends VariantMembership>)newValue);
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
			case SysMLPackage.USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				return;
			case SysMLPackage.USAGE__OWNING_USAGE:
				setOwningUsage((Usage)null);
				return;
			case SysMLPackage.USAGE__NESTED_PORT:
				getNestedPort().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ACTION:
				getNestedAction().clear();
				return;
			case SysMLPackage.USAGE__NESTED_STATE:
				getNestedState().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CONSTRAINT:
				getNestedConstraint().clear();
				return;
			case SysMLPackage.USAGE__NESTED_TRANSITION:
				getNestedTransition().clear();
				return;
			case SysMLPackage.USAGE__NESTED_REQUIREMENT:
				getNestedRequirement().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CALCULATION:
				getNestedCalculation().clear();
				return;
			case SysMLPackage.USAGE__IS_VARIATION:
				setIsVariation(IS_VARIATION_EDEFAULT);
				return;
			case SysMLPackage.USAGE__FLOW_FEATURE:
				getFlowFeature().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CASE:
				getNestedCase().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ANALYSIS_CASE:
				getNestedAnalysisCase().clear();
				return;
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP_COMP:
				getVariantMembership_comp().clear();
				return;
			case SysMLPackage.USAGE__USAGE:
				getUsage().clear();
				return;
			case SysMLPackage.USAGE__VARIANT:
				getVariant().clear();
				return;
			case SysMLPackage.USAGE__NESTED_REFERENCE:
				getNestedReference().clear();
				return;
			case SysMLPackage.USAGE__NESTED_CONNECTION:
				getNestedConnection().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ITEM:
				getNestedItem().clear();
				return;
			case SysMLPackage.USAGE__NESTED_PART:
				getNestedPart().clear();
				return;
			case SysMLPackage.USAGE__NESTED_INDIVIDUAL:
				getNestedIndividual().clear();
				return;
			case SysMLPackage.USAGE__NESTED_INTERFACE:
				getNestedInterface().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ATTRIBUTE:
				getNestedAttribute().clear();
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
			case SysMLPackage.USAGE__NESTED_VERIFICATION_CASE:
				getNestedVerificationCase().clear();
				return;
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				setOwningDefinition((Definition)null);
				return;
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP:
				getVariantMembership().clear();
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
			case SysMLPackage.USAGE__OWNED_MEMBERSHIP_COMP:
				return ownedMembership_comp != null && !ownedMembership_comp.isEmpty();
			case SysMLPackage.USAGE__NESTED_USAGE:
				return !getNestedUsage().isEmpty();
			case SysMLPackage.USAGE__OWNING_USAGE:
				return basicGetOwningUsage() != null;
			case SysMLPackage.USAGE__NESTED_PORT:
				return !getNestedPort().isEmpty();
			case SysMLPackage.USAGE__NESTED_ACTION:
				return !getNestedAction().isEmpty();
			case SysMLPackage.USAGE__NESTED_STATE:
				return !getNestedState().isEmpty();
			case SysMLPackage.USAGE__NESTED_CONSTRAINT:
				return !getNestedConstraint().isEmpty();
			case SysMLPackage.USAGE__NESTED_TRANSITION:
				return !getNestedTransition().isEmpty();
			case SysMLPackage.USAGE__NESTED_REQUIREMENT:
				return !getNestedRequirement().isEmpty();
			case SysMLPackage.USAGE__NESTED_CALCULATION:
				return !getNestedCalculation().isEmpty();
			case SysMLPackage.USAGE__IS_VARIATION:
				return isVariation != IS_VARIATION_EDEFAULT;
			case SysMLPackage.USAGE__FLOW_FEATURE:
				return !getFlowFeature().isEmpty();
			case SysMLPackage.USAGE__NESTED_CASE:
				return !getNestedCase().isEmpty();
			case SysMLPackage.USAGE__NESTED_ANALYSIS_CASE:
				return !getNestedAnalysisCase().isEmpty();
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP_COMP:
				return variantMembership_comp != null && !variantMembership_comp.isEmpty();
			case SysMLPackage.USAGE__USAGE:
				return !getUsage().isEmpty();
			case SysMLPackage.USAGE__VARIANT:
				return !getVariant().isEmpty();
			case SysMLPackage.USAGE__NESTED_REFERENCE:
				return !getNestedReference().isEmpty();
			case SysMLPackage.USAGE__NESTED_CONNECTION:
				return !getNestedConnection().isEmpty();
			case SysMLPackage.USAGE__NESTED_ITEM:
				return !getNestedItem().isEmpty();
			case SysMLPackage.USAGE__NESTED_PART:
				return !getNestedPart().isEmpty();
			case SysMLPackage.USAGE__NESTED_INDIVIDUAL:
				return !getNestedIndividual().isEmpty();
			case SysMLPackage.USAGE__NESTED_INTERFACE:
				return !getNestedInterface().isEmpty();
			case SysMLPackage.USAGE__NESTED_ATTRIBUTE:
				return !getNestedAttribute().isEmpty();
			case SysMLPackage.USAGE__NESTED_VIEW:
				return !getNestedView().isEmpty();
			case SysMLPackage.USAGE__NESTED_VIEWPOINT:
				return !getNestedViewpoint().isEmpty();
			case SysMLPackage.USAGE__NESTED_RENDERING:
				return !getNestedRendering().isEmpty();
			case SysMLPackage.USAGE__NESTED_VERIFICATION_CASE:
				return !getNestedVerificationCase().isEmpty();
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				return basicGetOwningDefinition() != null;
			case SysMLPackage.USAGE__VARIANT_MEMBERSHIP:
				return !getVariantMembership().isEmpty();
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
