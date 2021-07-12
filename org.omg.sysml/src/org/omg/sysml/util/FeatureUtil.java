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
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.adapter.FeatureAdapter;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;

public class FeatureUtil {
	
	private FeatureUtil() {
	}

	protected static FeatureAdapter getFeatureAdapter(Feature target) {
		return (FeatureAdapter)ElementUtil.getElementAdapter(target);
	}
	
	// Caching
	
	public static EList<Type> cacheTypesOf(Feature feature, Supplier<EList<Type>> supplier) {	
		FeatureAdapter adapter = getFeatureAdapter(feature);
		EList<Type> types = adapter.getTypes();
		return types == null? adapter.setTypes(supplier.get()): types;
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
	
	// Subsetting and redefinition
	
	public static List<Feature> getSubsettedFeaturesOf(Feature feature) {
		return getFeatureAdapter(feature).getSubsettedFeatures();
	}

	public static List<Feature> getSubsettedNotRedefinedFeaturesOf(Feature feature) {
		return getFeatureAdapter(feature).getSubsettedNotRedefinedFeatures().collect(Collectors.toList());
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

	public static <T extends Feature> T getReferencedFeatureOf(T feature, Class<T> kind) {
		return feature.getOwnedSubsetting().stream().
				filter(sub->!(sub instanceof Redefinition)).
				map(Subsetting::getSubsettedFeature).
				filter(kind::isInstance).
				map(kind::cast).
				findFirst().orElse(feature);
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

	// Feature values
	
	public static FeatureValue getValuationFor(Feature feature) {
		return (FeatureValue)feature.getOwnedMembership().stream().
				filter(FeatureValue.class::isInstance).
				findFirst().orElse(null);
	}

	public static BindingConnector getValueConnectorFor(Feature feature) {
		return getFeatureAdapter(feature).getValueConnector();
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
	
	public static boolean isPerformanceFeature(Feature step) {
		Type owningType = step.getOwningType();
		return owningType instanceof Behavior || owningType instanceof Step;
	}
	
}
