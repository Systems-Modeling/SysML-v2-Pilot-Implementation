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

package org.omg.sysml.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.adapter.FeatureAdapter;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.CrossSubsetting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.impl.ClassifierImpl;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

public class FeatureUtil {
	
	private FeatureUtil() {
	}

	protected static FeatureAdapter getFeatureAdapter(Feature target) {
		return (FeatureAdapter)ElementUtil.getElementAdapter(target);
	}
	
	// Utility
	
	public static boolean isParameter(Feature feature) {
		Type owningType = feature.getOwningType();
		return ( owningType instanceof Behavior || owningType instanceof Step ) && 
			   feature.getDirection() != null;
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
	
	public static boolean checkIsOrdered(Feature feature, Set<Feature> visited) {
		if (feature.isOrdered()) {
			return feature.isOrdered();
		} else {
			visited.add(feature);
			for (Feature subsettedFeature: FeatureUtil.getSubsettedFeaturesOf(feature)) {
				if (subsettedFeature != null && !visited.contains(subsettedFeature) && 
						checkIsOrdered(subsettedFeature, visited)) {
					return true;
				}
			}
			return false;
		}
	}

	// Typing
	
	public static EList<Type> cacheTypesOf(Feature feature, Supplier<EList<Type>> supplier) {	
		FeatureAdapter adapter = getFeatureAdapter(feature);
		EList<Type> types = adapter.getTypes();
		return types == null? adapter.setTypes(supplier.get()): types;
	}
	
	public static <T> T getFirstTypeOf(Feature feature, Class<T> kind) {
		return FeatureUtil.getAllTypesOf(feature).stream().
				filter(kind::isInstance).
				map(kind::cast).
				findFirst().
				orElse(null);
	}
	
	public static <T> EList<T> getAllTypesOf(Feature feature, Class<T> kind, int featureId) {		
		EList<T> types = new NonNotifyingEObjectEList<T>(kind, (InternalEObject)feature, featureId);
	    getAllTypesOf(feature).stream().
	    	filter(kind::isInstance).
	    	map(kind::cast).
	    	forEachOrdered(types::add);
		return types;
	}
	
	public static EList<Type> getAllTypesOf(Feature feature) {
		return FeatureUtil.cacheTypesOf(feature, ()->{
			EList<Type> types = new NonNotifyingEObjectEList<Type>(Type.class, (InternalEObject)feature, SysMLPackage.FEATURE__TYPE);
			getTypesOf(feature, types, new HashSet<Feature>());
			removeRedundantTypes(types);
			return types;
		});
	}
	
	private static void getTypesOf(Feature feature, List<Type> types, Set<Feature> visitedFeatures) {
		visitedFeatures.add(feature);
		getFeatureTypesOf(feature, types, visitedFeatures);
		for (Feature typingFeature : feature.typingFeatures()) {
			if (!visitedFeatures.contains(typingFeature)) {
				getTypesOf(typingFeature, types, visitedFeatures);
			}
		}
	}
	
	private static void getFeatureTypesOf(Feature feature, List<Type> types, Set<Feature> visitedFeatures) {
		feature.getOwnedTyping().stream().
				map(typing->typing.getType()).
				filter(type->type != null).
				forEachOrdered(types::add);
		types.addAll(TypeUtil.getImplicitGeneralTypesFor(feature, SysMLPackage.eINSTANCE.getFeatureTyping()));
	}
	
	protected static void removeRedundantTypes(List<Type> types) {
		for (int i = types.size() - 1; i >= 0 ; i--) {
			Type type = types.get(i);
			if (types.stream().anyMatch(otherType->otherType != type && TypeUtil.specializes(otherType, type))) {
				types.remove(i);
			}
		}
	}
	
	public static FeatureTyping addFeatureTypingTo(Feature feature) {
		FeatureTyping featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
		featureTyping.setTypedFeature(feature);
		feature.getOwnedRelationship().add(featureTyping);
		return featureTyping;
	}

	// Subsetting and redefinition
	
	public static List<Feature> getSubsettedFeaturesOf(Feature feature) {
		return getFeatureAdapter(feature).getSubsettedFeatures();
	}

	public static List<Feature> getSubsettedNotRedefinedFeaturesOf(Feature feature) {
		return getFeatureAdapter(feature).getSubsettedNotRedefinedFeatures().collect(Collectors.toList());
	}

	public static List<Feature> getSubsettedNotCrossedFeaturesOf(Feature feature) {
		return getFeatureAdapter(feature).getSubsettedNotCrossedFeatures();
	}

	public static Feature getReferencedFeatureOf(Feature feature) {
		return getFeatureAdapter(feature).getReferencedFeature();
	}

	public static Optional<Subsetting> getFirstOwnedSubsettingOf(Feature feature) {
		return feature.getOwnedSubsetting().stream().
				filter(subsetting->!(subsetting instanceof Redefinition)).findFirst();
	}
	
	public static Subsetting addSubsettingTo(Feature feature) {
		Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
		subsetting.setSubsettingFeature(feature);
		feature.getOwnedRelationship().add(subsetting);
		return subsetting;
	}
	
	public static <T extends Feature> T getEffectiveReferencedFeatureOf(T feature, Class<T> kind) {
		ReferenceSubsetting subsetting = feature.getOwnedReferenceSubsetting();
		if (subsetting != null) {
			Feature referencedFeature = getBasicFeatureOf(subsetting.getReferencedFeature());
			if (kind.isInstance(referencedFeature)) {
				return kind.cast(referencedFeature);
			}
		}
		return feature;
	}

	public static List<Feature> getRedefinedFeaturesOf(Feature feature) {
		return getFeatureAdapter(feature).getRedefinedFeatures();
	}
	
	public static List<Feature> getRedefinedFeaturesWithComputedOf(Feature feature, Element skip) {
		return getFeatureAdapter(feature).getRedefinedFeaturesWithComputed(skip);
	}
	
	public static void forceComputeRedefinitionsFor(Feature feature) {
		getFeatureAdapter(feature).forceComputeRedefinitions();
	}
	
	public static Set<Feature> getAllRedefinedFeaturesOf(Feature feature) {
		return getFeatureAdapter(feature).getAllRedefinedFeatures();
	}
	
	public static void addAllRedefinedFeaturesTo(Feature feature, Set<Feature> redefinedFeatures) {
		getFeatureAdapter(feature).addAllRedefinedFeaturesTo(redefinedFeatures);
	}
	
	public static boolean isIgnoredParameter(Feature feature) {
		return getFeatureAdapter(feature).isIgnoredParameter();
	}
	
	public static List<Feature> getAllSubsettingFeaturesIn(Type type, Feature subsettedFeature) {
		return type.getFeature().stream().
				filter(f->TypeUtil.specializes(f, subsettedFeature)).
				collect(Collectors.toList());
	}
	
	// Cross features
	
	public static Feature getCrossFeatureOf(Feature feature) {
		Feature crossedFeature = getFeatureAdapter(feature).getCrossedFeature();
		if (crossedFeature != null) {
			List<Feature> chainingFeatures = crossedFeature.getChainingFeature();
			if (chainingFeatures.size() >=2) {
				return chainingFeatures.get(1);
			}
		}
		return null;
	}

	public static Feature getOwnedCrossFeatureOf(Namespace namespace) {
		return !(namespace instanceof Feature) || !((Feature)namespace).isEnd()? null:
				(Feature)namespace.getOwnedMember().stream().
				filter(element->element instanceof Feature && 
						!(element instanceof Multiplicity) && 
						!(element instanceof MetadataFeature) &&
						!(element.getOwningMembership() instanceof FeatureMembership)&&
						!(element.getOwningMembership() instanceof FeatureValue)).
				findFirst().orElse(null);
	}

	public static boolean isOwnedCrossFeature(Feature feature) {
		Namespace owner = feature.getOwningNamespace();
		return feature == getOwnedCrossFeatureOf(owner);
	}
	
	public static List<Type> getCrossFeatureTypes(Feature feature) {
		return feature.getOwnedSpecialization().stream().
				filter(s->!(s instanceof Redefinition ||
						s instanceof ReferenceSubsetting || 
						s instanceof CrossSubsetting)).
				map(Specialization::getGeneral).toList();
	}
	
	public static void addOwnedCrossFeatureTypeFeaturingTo(Feature feature) {
		getFeatureAdapter(feature).addOwnedCrossFeatureTypeFeaturing();
	}

	// Feature values
	
	public static FeatureValue getValuationFor(Feature feature) {
		return (FeatureValue)feature.getOwnedMembership().stream().
				filter(FeatureValue.class::isInstance).
				findFirst().orElse(null);
	}
	
	public static Expression getValueExpressionFor(Feature feature) {
		FeatureValue featureValue = getValuationFor(feature);
		return featureValue == null? null: featureValue.getValue();
	}
	
	public static FeatureValue addFeatureValueTo(Feature feature, Expression value) {
		FeatureValue featureValue = SysMLFactory.eINSTANCE.createFeatureValue();
		featureValue.setValue(value);
		feature.getOwnedRelationship().add(featureValue);
		return featureValue;
	}

	// Featuring Types
	
	/**
	 * Perform a breadth first traversal of featuring types starting with the originalFeature.
	 */
	public static List<Type> getAllFeaturingTypesOf(Feature originalFeature) {
		List<Type> allFeaturingTypes = new ArrayList<>();
		List<Feature> features = new ArrayList<>();
		features.add(originalFeature);
		while (!features.isEmpty()) {
			List<Feature> nextFeatures = new ArrayList<>();
			for (Feature feature: features) {
				Membership owningMembership = feature.getOwningMembership();
				if (owningMembership instanceof FeatureValue) {
					// Handle directly the implicit featuringTypes of a FeatureValue value Expression,
					// in case this transformation has not been done yet.
					feature = ((FeatureValue)owningMembership).getFeatureWithValue();
				}
				EList<Type> featuringTypes = feature.getFeaturingType();
				for (Type featuringType: featuringTypes) {
					if (!allFeaturingTypes.contains(featuringType)) {
						allFeaturingTypes.add(featuringType);
						if (featuringType instanceof Feature) {
							nextFeatures.add((Feature)featuringType);
						}
					}
				}
			}
			features = nextFeatures;
		}
		return allFeaturingTypes;
	}
	
	public static void addFeaturingTypesTo(Feature feature, Collection<Type> featuringTypes) {
		getFeatureAdapter(feature).addFeaturingTypes(featuringTypes);
	}

	public static void forEachImplicitFeaturingTypeOf(Feature feature, Consumer<Type> action) {
		getFeatureAdapter(feature).forEachImplicitFeaturingType(action);
	}
	
	public static TypeFeaturing addTypeFeaturingTo(Feature feature) {
		TypeFeaturing typeFeaturing = SysMLFactory.eINSTANCE.createTypeFeaturing();
		typeFeaturing.setFeatureOfType(feature);
		feature.getOwnedRelationship().add(typeFeaturing);
		return typeFeaturing;
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
				featuring.setIsImplied(true);
				featuring.setFeaturingType(type);
				featuring.setFeatureOfType(feature);
				if (type.getOwningRelationship() == null) {
					featuring.getOwnedRelatedElement().add(type);
				}
				feature.getOwnedRelationship().add(featuring);
			}
		});
	}

	public static Stream<Feature> getFeaturingFeaturesOf(Feature feature) {
		ElementUtil.transform(feature);
		return feature.getFeaturingType().stream().
				filter(Feature.class::isInstance).
				map(Feature.class::cast);
	}
	
	public static boolean canAccess(Feature subsettingFeature, Feature subsettedFeature) {
		return canAccess(subsettingFeature, subsettedFeature, new HashSet<>());
	}	

	private static boolean canAccess(Feature subsettingFeature, Feature subsettedFeature, Set<Feature> visited) {
		visited.add(subsettingFeature);
		List<Type> featuringTypes = subsettingFeature.getFeaturingType();
		return featuringTypes.isEmpty() && subsettedFeature == 
				SysMLLibraryUtil.getLibraryType(subsettingFeature, ImplicitGeneralizationMap.getDefaultSupertypeFor(ClassifierImpl.class)) ||
				featuringTypes.stream().anyMatch(featuringType-> 
						subsettedFeature.isFeaturedWithin(featuringType) ||				
						featuringType instanceof Feature &&
						!visited.contains(featuringType) &&
						canAccess(((Feature)featuringType), subsettedFeature, visited));
	}
	
	// Feature Chaining
	
	public static Feature getFirstChainingFeatureOf(Feature feature) {
		EList<FeatureChaining> featureChainings = feature.getOwnedFeatureChaining();
		return featureChainings.isEmpty()? null: featureChainings.get(0).getChainingFeature();
	}

	public static Feature getLastChainingFeatureOf(Feature feature) {
		EList<FeatureChaining> featureChainings = feature.getOwnedFeatureChaining();
		return featureChainings.isEmpty()? null: featureChainings.get(featureChainings.size()-1).getChainingFeature();
	}
	
	/**
	 * Get either the given Feature, if it is not chained, or else its last chaining Feature.
	 */
	public static Feature getBasicFeatureOf(Feature feature) {
		if (feature == null) {
			return null;
		} else {
			EList<FeatureChaining> featureChainings = feature.getOwnedFeatureChaining();
			return featureChainings.isEmpty()? feature: featureChainings.get(featureChainings.size()-1).getChainingFeature();
		}
	}
	
	public static Feature chainFeatures(Feature... features) {
		Feature chainedFeature = SysMLFactory.eINSTANCE.createFeature();
		for (Feature feature: features) {
			EList<Feature> chainingFeatures = feature.getChainingFeature();
			if (chainingFeatures.isEmpty()) {
				addChainingFeature(chainedFeature, feature);
			} else {
				for (Feature chainingFeature: chainingFeatures) {
					addChainingFeature(chainedFeature, chainingFeature);
				}
			}
		}
		return chainedFeature;
	}
	
	public static Feature chainFeatures(List<Feature> features) {
		Feature[] featuresArray = new Feature[features.size()];
		return chainFeatures(features.toArray(featuresArray));
	}
	
	public static Feature addChainingFeature(Feature chainedFeature, Feature chainingFeature) {
		FeatureChaining featureChaining = SysMLFactory.eINSTANCE.createFeatureChaining();
		featureChaining.setChainingFeature(chainingFeature);
		chainedFeature.getOwnedRelationship().add(featureChaining);
		return chainedFeature;
	}
	
	// Steps
	
	public static boolean isPerformanceFeature(Feature step) {
		Type owningType = step.getOwningType();
		return owningType instanceof Behavior || owningType instanceof Step;
	}
	
	// Multiplicity

	public static MultiplicityRange getMultiplicityRangeOf(Multiplicity multiplicity) {
		return getMultiplicityRangeOf(multiplicity, new HashSet<>());
	}
	
	private static MultiplicityRange getMultiplicityRangeOf(Multiplicity multiplicity, Set<Multiplicity> visited) {
		if (multiplicity instanceof MultiplicityRange) {
			return (MultiplicityRange) multiplicity;
		} else if (multiplicity != null) {
			List<Feature> subsettedFeatures = FeatureUtil.getSubsettedFeaturesOf(multiplicity);
			if (!subsettedFeatures.isEmpty()) {
				Feature multSubsetted = subsettedFeatures.get(0);
				if (multSubsetted instanceof Multiplicity && !visited.contains(multiplicity)) {
					visited.add(multiplicity);
					return getMultiplicityRangeOf((Multiplicity)multSubsetted, visited);
				}
			}
		}
		return null;
	}	
	
	//Naming
	
	public static String computeEffectiveName(Feature self) {
		return computeEffectiveName(self, new HashSet<>());
	}
	
	private static String computeEffectiveName(Feature self, Set<Feature> visited) {
		if (isNameSet(self)) {
			return self.getDeclaredName();
		}
		
		String effectiveName = getFeatureAdapter(self).getEffectiveName();
		
		if (effectiveName != null) {
			return effectiveName;
		}

		visited.add(self);
		Feature namingFeature = self.namingFeature();
		
		if (namingFeature != null && !visited.contains(namingFeature)) {
			effectiveName = computeEffectiveName(namingFeature, visited);
			getFeatureAdapter(self).storeEffectiveName(effectiveName);
		}
		
		return effectiveName;
	}
	
	public static String computeEffectiveShortName(Feature self) {
		return computeEffectiveShortName(self, new HashSet<>());
	}
	
	private static String computeEffectiveShortName(Feature self, Set<Feature> visited) {
		if (isNameSet(self)) {
			return self.getDeclaredShortName();
		}
		
		String effectiveShortName = getFeatureAdapter(self).getEffectiveShortName();
		
		if (effectiveShortName != null) {
			return effectiveShortName;
		}

		visited.add(self);
		Feature namingFeature = self.namingFeature();
		
		if (namingFeature != null && !visited.contains(namingFeature)) {
			effectiveShortName = computeEffectiveShortName(namingFeature, visited);
			getFeatureAdapter(self).storeEffectiveShortName(effectiveShortName);
		}
		
		return effectiveShortName;
	}
	
	private static boolean isNameSet(Feature self) {
		return self.getDeclaredName() != null || self.getDeclaredShortName() != null;
	}
}
