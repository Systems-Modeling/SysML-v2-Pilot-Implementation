/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2025 Model Driven Solutions, Inc.
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

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class UsageAdapter extends FeatureAdapter {

	public UsageAdapter(Usage element) {
		super(element);
	}
	
	@Override
	public Usage getTarget() {
		return (Usage)super.getTarget();
	}
	
	// Post-processing
	
	@Override
	public void postProcess () {
		super.postProcess();
		Usage target = getTarget();
		if (target.isVariation()) {
			target.setIsAbstract(true);
		}
	}
	
	@Override
	protected void setIsVariableIfConstant() {
	}
	
	// Caching
	
	private Boolean mayTimeVary = null;
	
	public boolean mayTimeVary() {
		if (mayTimeVary == null) {
			Usage target = getTarget();
			Type owningType = target.getOwningType();
			mayTimeVary = owningType != null &&
					TypeUtil.specializes(owningType, (Type)SysMLLibraryUtil.getLibraryElement(target, "Occurrences::Occurrence")) &&
					!(target.isPortion() ||
					  TypeUtil.specializes(target, (Type)SysMLLibraryUtil.getLibraryElement(target, "Links::SelfLink")) ||
					  TypeUtil.specializes(target, (Type)SysMLLibraryUtil.getLibraryElement(target, "Occurrences::HappensLink")) ||
					  target.isComposite() && TypeUtil.specializes(target, (Type)SysMLLibraryUtil.getLibraryElement(target, "Actions::Action")));
		}
		return mayTimeVary;
	}
	
	@Override
	public void clearCaches() {
		super.clearCaches();
		mayTimeVary = null;
	}
	
	// Utility
	
	public boolean hasRelevantSubjectParameter() {
		return false;
	}
	
	public boolean isActionOwnedComposite() {
		Usage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && !isEntryExitAction() && 
			   (owningType instanceof ActionDefinition || owningType instanceof ActionUsage);
	}
	
	public boolean isPartOwnedComposite() {
		Usage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && (owningType instanceof PartDefinition || owningType instanceof PartUsage);
	}
	
	public boolean isEntryExitAction() {
		FeatureMembership owningFeatureMembership = getTarget().getOwningFeatureMembership();
		if (!(owningFeatureMembership instanceof StateSubactionMembership)) {
			return false;
		} else {
			StateSubactionKind kind = ((StateSubactionMembership)owningFeatureMembership).getKind();
			return kind == StateSubactionKind.ENTRY || kind == StateSubactionKind.EXIT;
		}
	}
		
	// Implicit Generalization
	
	protected void addSubsetting(String subsettedFeatureName) {
		Feature feature = (Feature)getLibraryType(subsettedFeatureName);
		if (feature != null) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), feature);
		}
	}
	
	/**
	 * @satisfies checkUsageVariationDefinitionSpecialization
	 * @satisfies checkUsageVariationUsageSpecialization
	 */
	protected void addVariationTyping() {
		Usage usage = getTarget();
		if (UsageUtil.isVariant(usage)) {
			Definition variationDefinition = UsageUtil.getOwningVariationDefinitionFor(usage);
			if (variationDefinition != null) {
				addImplicitGeneralType(SysMLPackage.eINSTANCE.getFeatureTyping(), variationDefinition);
			} else {
				Usage variationUsage = UsageUtil.getOwningVariationUsageFor(usage);
				if (variationUsage != null) {
					addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), variationUsage);
				}
			}
		}
	}
	
	@Override
	public void addDefaultGeneralType() {
		addVariationTyping();
		
		super.addDefaultGeneralType();
	}
	
	// Transformation
	
	// Used to check for default multiplicity for AttributeUsages, ItemUsages and PortUsages.
	protected boolean isAddDefaultMultiplicity() {
		Usage target = getTarget();
		return target.isEnd() ||
			   target.getOwningType() != null &&
			   target.getOwnedSubsetting().stream().
					map(Subsetting::getSubsettedFeature).
					filter(f->f != null).
					map(FeatureUtil::getBasicFeatureOf).
					noneMatch(f->f != null && f.getOwningType() != null);
	}
	
	// Multiplicity of 1..1 is always the default for an end usage.
	protected boolean isAddMultiplicity() {
		return getTarget().isEnd();
	}
	
	@Override
	public void addAdditionalMembers() {
		if (isAddMultiplicity()) {
			TypeUtil.addMultiplicityTo(getTarget());
		}
	}
	
	/**
	 * Return the relevant subject parameter to which a Usage should be bound.
	 */
	protected Feature getRelevantSubjectParameterFor(Usage usage) {
		Type owningType = usage.getOwningType();		
		return !(owningType instanceof Usage) || owningType.isAbstract() || 
			   !UsageUtil.hasRelevantSubjectParameter((Usage)owningType)? null:
			   UsageUtil.getSubjectParameterOf(((Usage)owningType).getOwningType());
	}
	
	/**
	 * @satisfies checkSatisfyRequirementUsageBindingConnector
	 */
	@Override
	protected void computeValueConnector() {
		Usage usage = getTarget();
		FeatureValue valuation = FeatureUtil.getValuationFor(usage);
		if (valuation == null && UsageUtil.isSubjectParameter(usage)){
			Feature subjectParameter = getRelevantSubjectParameterFor(usage);
			if (subjectParameter != null) {
				addBindingConnector(subjectParameter, usage);
			}
		} else {
			super.computeValueConnector();
		}
	}
	
	/**
	 * @satisfies checkUsageVariationUsageTypeFeaturing
	 */
	@Override
	public void doTransform() {
		super.doTransform();
		Usage target = getTarget();
		if (UsageUtil.isVariant(target)) {
			addImplicitFeaturingTypesIfNecessary();
		}
		
		// Note: This cannot be done in postProcess, because of mayTimeVary computation.
		if (target.isEnd() && mayTimeVary()) {
			target.setIsConstant(true);
		}
	}
}
