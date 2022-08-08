/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022 Model Driven Solutions, Inc.
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

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
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
	
	// Utility
	
	public Usage getSubjectParameter() {
		return null;
	}
	
	public boolean hasRelevantSubjectParameter() {
		return false;
	}
	
	// Implicit Generalization
	
	protected void addSubsetting(String subsettedFeatureName) {
		Feature feature = (Feature)getLibraryType(subsettedFeatureName);
		if (feature != null) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), feature);
		}
	}

	public void addVariationSubsetting() {
		Usage usage = getTarget();
		Usage variationUsage = UsageUtil.getOwningVariationUsageFor(usage);
		if (variationUsage != null && UsageUtil.isVariant(usage)) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), variationUsage);
		}
	}
	
	@Override
	public Stream<Feature> getSubsettedNotRedefinedFeatures() {
		addVariationSubsetting();
		return super.getSubsettedNotRedefinedFeatures();
	}
	
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	// Computed Redefinitions
	
	/**
	 * A subject Parameter always redefines a subject Parameter.
	 */
	@Override
	public List<? extends Feature> getParameterRelevantFeatures(Type type, Element skip) {
		if (UsageUtil.isSubjectParameter(getTarget())) {
			Feature typeSubject = TypeUtil.getSubjectParameterOf(type);
			return typeSubject == null? Collections.emptyList(): 
				Collections.singletonList(typeSubject);
		}
		return super.getParameterRelevantFeatures(type, skip);
	}
	
	@Override
	public boolean isIgnoredParameter() {
		return super.isIgnoredParameter() || UsageUtil.isSubjectParameter(getTarget());
	}
	
	// Transformation
	
	protected void addDefaultMultiplicity() {
		Usage target = getTarget();
		if (target.getOwningType() != null &&
			target.getOwnedSubsetting().stream().
				map(Subsetting::getSubsettedFeature).
				filter(f->f != null).
				map(FeatureUtil::getBasicFeatureOf).
				noneMatch(f->f != null && f.getOwningType() != null)) {
			FeatureUtil.addMultiplicityTo(target);
		}
	}
	
	/**
	 * Return the relevant subject parameter to which a Usage should be bound.
	 */
	protected Feature getRelevantSubjectParameterFor(Usage usage) {
		Type owningType = usage.getOwningType();		
		return !(owningType instanceof Usage) || owningType.isAbstract() || 
			   !UsageUtil.hasRelevantSubjectParameter((Usage)owningType)? null:
			   TypeUtil.getSubjectParameterOf(((Usage)owningType).getOwningType());
	}
	
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
	
	protected static void computeSubjectParameterOf(Type type) {
		if (type != null && 
			type.getOwnedMembership().stream().noneMatch(SubjectMembership.class::isInstance)) {
			Usage parameter = SysMLFactory.eINSTANCE.createReferenceUsage();
			SubjectMembership membership = SysMLFactory.eINSTANCE.createSubjectMembership();
			membership.setOwnedSubjectParameter(parameter);
			type.getOwnedRelationship().add(membership);
		}
	}
	
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
	public void doTransform() {		
		addVariationTyping();
		super.doTransform();
	}
	
}
