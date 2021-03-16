/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

package org.omg.sysml.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.adapter.FeatureAdapter;
import org.omg.sysml.adapter.ItemFlowEndAdapter;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;

public class FeatureUtil {
	
	private FeatureUtil() {
	}

	protected static FeatureAdapter getFeatureAdapter(Feature target) {
		return (FeatureAdapter)ElementUtil.getElementAdapter(target);
	}
	
	// Utility
	
	public static boolean isStructureFeature(Feature feature) {
		return feature.getType().stream().anyMatch(Structure.class::isInstance);
	}
	
	public static boolean isDataFeature(Feature feature) {
		return feature.getType().stream().anyMatch(DataType.class::isInstance);
	}
	
	public static boolean hasClassType(Feature feature) {
		return ((FeatureImpl)feature).basicGetOwnedTyping().stream().map(FeatureTyping::getType).anyMatch(org.omg.sysml.lang.sysml.Class.class::isInstance) ||
				TypeUtil.getImplicitGeneralTypesFor(feature, SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(org.omg.sysml.lang.sysml.Class.class::isInstance);
	}
	
	public static boolean hasStructureType(Feature feature) {
		return ((FeatureImpl)feature).basicGetOwnedTyping().stream().map(FeatureTyping::getType).anyMatch(Structure.class::isInstance) ||
				TypeUtil.getImplicitGeneralTypesFor(feature, SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(Structure.class::isInstance);
	}
	
	public static boolean hasDataType(Feature feature) {
		return ((FeatureImpl)feature).basicGetOwnedTyping().stream().map(FeatureTyping::getType).anyMatch(DataType.class::isInstance) ||
				TypeUtil.getImplicitGeneralTypesFor(feature, SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(DataType.class::isInstance);
	}
	
	public static boolean isParameter(Feature feature) {
		return feature.getOwningMembership() instanceof ParameterMembership;
	}

	public static boolean isResultParameter(Feature feature) {
		return feature.getOwningMembership() instanceof ReturnParameterMembership;
	}
	
	public static boolean isInputParameter(Feature feature) {
		FeatureDirectionKind direction = getDirection(feature);
		return direction == FeatureDirectionKind.IN || direction == FeatureDirectionKind.INOUT;
	}
	
	public static boolean isOutputParameter(Feature feature) {
		FeatureDirectionKind direction = getDirection(feature);
		return direction == FeatureDirectionKind.OUT || direction == FeatureDirectionKind.INOUT;
	}
	
	public static FeatureDirectionKind getDirection(Feature feature) {
		Type owningType = feature.getOwningType();
		if (owningType == null) {
			return null;
		} else {
			return feature.directionFor(owningType);
		}
	}
	
// Subsetting and redefinition

	public static Optional<Subsetting> getFirstOwnedSubsettingOf(Feature feature) {
		return ((FeatureImpl)feature).basicGetOwnedSubsetting().stream().
				filter(s->!(s instanceof Redefinition)).findFirst();
	}

	public static Subsetting addSubsettingTo(Feature feature) {
		Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
		subsetting.setSubsettingFeature(feature);
		feature.getOwnedRelationship().add(subsetting);
		return subsetting;
	}

	public static void addItemFlowEndSubsettingTo(ItemFlowEnd itemFlowEnd) {
		((ItemFlowEndAdapter)getFeatureAdapter(itemFlowEnd)).addItemFlowEndSubsetting();
	}
	
	public static List<Feature> getRedefinedFeaturesOf(Feature feature) {
		return ((FeatureImpl)feature).getRedefinedFeatures();
	}

	public static void forceComputeRedefinitionsFor(Feature feature) {
		((FeatureImpl)feature).forceComputeRedefinitions();
	}

	// Feature values
	
	public static FeatureValue getValuationFor(Feature feature) {
		return (FeatureValue)feature.getOwnedMembership().stream().
				filter(FeatureValue.class::isInstance).
				findFirst().orElse(null);
	}

	public static BindingConnector getValueConnectorFor(Feature feature) {
		return getFeatureAdapter(feature).getValueConnector();
	}

	public static BindingConnector addValueBindingTo(Feature feature, Expression sourceExpression) {
		ElementUtil.transform(sourceExpression);
		return TypeUtil.addBindingConnectorTo(feature, feature.getFeaturingType(), sourceExpression.getResult(), feature);
	}
		
	// Featuring Types
	
	/**
	 * Perform a breadth first traversal of featuring types starting with the originalFeature.
	 */
	protected static List<Type> getAllFeaturingTypesOf(Feature originalFeature) {
		List<Type> allFeaturingTypes = new ArrayList<>();
		List<Feature> features = new ArrayList<>();
		features.add(originalFeature);
		while (!features.isEmpty()) {
			List<Feature> nextFeatures = new ArrayList<>();
			for (Feature feature: features) {
				List<Type> featuringTypes = feature.getFeaturingType();
				if (featuringTypes.isEmpty()) {
					allFeaturingTypes.add(null);
				} else {
					for (Type featuringType: featuringTypes) {
						if (!allFeaturingTypes.contains(featuringType)) {
							allFeaturingTypes.add(featuringType);
							if (featuringType instanceof Feature) {
								nextFeatures.add((Feature)featuringType);
							}
						}
					}
				}
			}
			features = nextFeatures;
		}
		return allFeaturingTypes;
	}

	public static boolean isImplicitFeaturingTypesEmpty(Feature feature) {
		return getFeatureAdapter(feature).isImplicitFeaturingTypesEmpty();
	}

	public static void addFeaturingTypeTo(Feature feature, Type featuringType) {
		getFeatureAdapter(feature).addFeaturingType(featuringType);
	}

	public static void addFeaturingTypesTo(Feature feature, Collection<Type> featuringTypes) {
		getFeatureAdapter(feature).addFeaturingTypes(featuringTypes);
	}

	public static void forEachImplicitFeaturingTypeOf(Feature feature, Consumer<Type> action) {
		getFeatureAdapter(feature).forEachImplicitFeaturingType(action);
	}

	/**
	 * Physically insert implicit TypeFeaturings into the model.
	 */
	public static void insertImplicitTypeFeaturings(Feature feature) {
		forEachImplicitFeaturingTypeOf(feature, type->{
			boolean featuringRequired = feature.getOwnedRelationship().stream().
				filter(TypeFeaturing.class::isInstance).
				map(TypeFeaturing.class::cast).
				noneMatch(f -> Objects.equals(f.getFeatureOfType(), feature)
						&& Objects.equals(f.getFeaturingType(), type));
			if (featuringRequired) {
				TypeFeaturing featuring = SysMLFactory.eINSTANCE.createTypeFeaturing();
				featuring.setFeaturingType(type);
				featuring.setFeatureOfType(feature);
				feature.getOwnedRelationship().add(featuring);
			}
		});
	}

	// Steps
	
	public static boolean isEnactedPerformance(Feature step) {
		Type owningType = step.getOwningType();
		return owningType instanceof Structure ||
				owningType instanceof Feature && 
					isStructureFeature((Feature)owningType);
	}

	public static boolean isIncomingTransfer(Feature step) {
		return step.getOwnedFeature().stream().anyMatch(ItemFeature.class::isInstance);
	}

	public static boolean isCompositePerformanceFeature(Feature step) {
		return step.isComposite() && isPerformanceFeature(step);
	}

	public static boolean isPerformanceFeature(Feature step) {
		Type owningType = step.getOwningType();
		return owningType instanceof Behavior || owningType instanceof Step;
	}
	
	public static List<Step> getSubstepsOf(Step step) {
		return step.getOwnedFeature().stream().
				filter(Step.class::isInstance).
				map(Step.class::cast).
				collect(Collectors.toList());
	}
	
	// SourceEnds

	public static Feature getSource(Feature owningFeature) {
		Type type = owningFeature.getOwningType();
		return owningFeature instanceof BindingConnector && 
			   type instanceof SatisfyRequirementUsage? 
					((SatisfyRequirementUsage)type).getSubjectParameter(): 
					getPreviousFeature(owningFeature);
	}
	
	private static Feature getPreviousFeature(Feature feature) {
		Namespace owner = feature.getOwningNamespace();
		if (!(owner instanceof Type)) {
			return null;
		} else {
			EList<Membership> memberships = ((Type)owner).getOwnedMembership();
			for (int i = memberships.indexOf(feature.getOwningMembership()) - 1; i >= 0; i--) {
				Membership membership = memberships.get(i);
				if (!(membership instanceof TransitionFeatureMembership)) {
					Element previousElement = memberships.get(i).getMemberElement();
					if (previousElement instanceof Feature &&
						!(isParameter((Feature)previousElement) || 
						  previousElement instanceof Connector || 
						  previousElement instanceof TransitionUsage)) {
						return (Feature)previousElement;
					}
				}
			}
			return owner instanceof Feature? getPreviousFeature((Feature)owner): null;
		}
	}

}
