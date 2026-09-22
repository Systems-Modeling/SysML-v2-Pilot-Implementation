/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2026 Model Driven Solutions, Inc.
 * Copyright (c) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.CrossSubsetting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.logic.implicit.specialization.api.IImplicitSpecializationCache;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.VirtualContainer;

public class FeatureAdapter extends TypeAdapter {

	public FeatureAdapter(Feature element) {
		super(element);
	}

	@Override
	public Feature getTarget() {
		return (Feature) super.getTarget();
	}
	
	// Caching

	EList<Type> types = null;
	String storedEffectiveName = null;
	String storedEffectiveShortName = null;

	public void storeEffectiveName(String effectiveName) {
		storedEffectiveName = effectiveName;
	}

	public String getEffectiveName() {
		return storedEffectiveName;
	}

	public void storeEffectiveShortName(String effectiveShortName) {
		storedEffectiveShortName = effectiveShortName;
	}

	public String getEffectiveShortName() {
		return storedEffectiveShortName;
	}

	Set<Feature> allRedefinedFeatures = null;

	@Override
	public void clearCaches() {
		super.clearCaches();
		types = null;
		allRedefinedFeatures = null;
		storedEffectiveName = null;
		storedEffectiveShortName = null;
	}

	// Implicit Elements

	protected Set<Type> implicitFeaturingTypes = new LinkedHashSet<>();

	public void addImplicitFeaturingTypes() {
		Namespace owner = getTarget().getOwningNamespace();
		if (owner instanceof Feature) {
			EList<Type> ownerFeaturingTypes = ((Feature) owner).getFeaturingType();
			if (implicitFeaturingTypes.isEmpty()) {
				addFeaturingTypes(ownerFeaturingTypes);
			}
		}
	}

	public void addFeaturingType(Type type) {
		implicitFeaturingTypes.add(type);
		VirtualContainer.attach(type, getTarget());
	}

	public void addFeaturingTypes(Collection<Type> featuringTypes) {
		for (Type featuringType : featuringTypes) {
			addFeaturingType(featuringType);
		}
	}

	public void forEachImplicitFeaturingType(Consumer<Type> action) {
		implicitFeaturingTypes.forEach(action);
	}

	public void removeAllImplicitFeaturingTypes() {
		implicitFeaturingTypes = new LinkedHashSet<>();
	}

	public boolean isImplicitFeaturingTypesEmpty() {
		return implicitFeaturingTypes.isEmpty();
	}

	public Stream<Feature> getSubsettedNotRedefinedFeatures() {
		Feature target = getTarget();
		Stream<Feature> implicitSubsettedFeatures = TypeUtil
				.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.SUBSETTING).stream()
				.map(Feature.class::cast);
		Stream<Feature> implicitReferencedFeatures = TypeUtil
				.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.REFERENCE_SUBSETTING).stream()
				.map(Feature.class::cast);
		Stream<Feature> implicitCrossedFeatures = TypeUtil
				.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.CROSS_SUBSETTING).stream()
				.map(Feature.class::cast);
		Stream<Feature> ownedSubsettedFeatures = target.getOwnedSubsetting().stream()
				.filter(s -> !(s instanceof Redefinition)).map(Subsetting::getSubsettedFeature).filter(f -> f != null);
		return Stream.concat(ownedSubsettedFeatures, Stream.concat(implicitReferencedFeatures,
				Stream.concat(implicitCrossedFeatures, implicitSubsettedFeatures)));
	}

	public List<Feature> getSubsettedFeatures() {
		Feature target = getTarget();
		// Note: Build on getSubsettedNotRedefinedFeatures here because it is overridden
		// in some subclasses.
		Stream<Feature> subsettedFeatures = getSubsettedNotRedefinedFeatures();
		Stream<Feature> ownedRedefinedFeatures = target.getOwnedRedefinition().stream()
				.map(Redefinition::getRedefinedFeature).filter(f -> f != null);
		Stream<Feature> implicitRedefinedFeatures = TypeUtil
				.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.REDEFINITION).stream()
				.map(Feature.class::cast);
		return Stream.concat(Stream.concat(subsettedFeatures, ownedRedefinedFeatures), implicitRedefinedFeatures)
				.toList();
	}

	public List<Feature> getSubsettedNotCrossedFeatures() {
		Feature target = getTarget();
		List<Feature> features = new ArrayList<>();
		target.getOwnedSubsetting().stream().filter(s -> !(s instanceof CrossSubsetting))
				.map(Subsetting::getSubsettedFeature).filter(f -> f != null).forEachOrdered(features::add);
		TypeUtil.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.SUBSETTING).stream().map(Feature.class::cast)
				.forEachOrdered(features::add);
		TypeUtil.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.REFERENCE_SUBSETTING).stream()
				.map(Feature.class::cast).forEachOrdered(features::add);
		TypeUtil.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.REDEFINITION).stream()
				.map(Feature.class::cast).forEachOrdered(features::add);
		return features;
	}

	public Feature getReferencedFeature() {
		Feature target = getTarget();
		ReferenceSubsetting ownedReferenceSubsetting = target.getOwnedReferenceSubsetting();
		if (ownedReferenceSubsetting != null) {
			return ownedReferenceSubsetting.getReferencedFeature();
		} else {
			return TypeUtil.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.REFERENCE_SUBSETTING).stream()
					.map(Feature.class::cast).findFirst().orElse(null);
		}
	}

	public Feature getCrossedFeature() {
		Feature target = getTarget();
		CrossSubsetting ownedCrossSubsetting = target.getOwnedCrossSubsetting();
		if (ownedCrossSubsetting != null) {
			return ownedCrossSubsetting.getCrossedFeature();
		} else {
			return TypeUtil.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.CROSS_SUBSETTING).stream()
					.map(Feature.class::cast).findFirst().orElse(null);
		}
	}

	public List<Feature> getRedefinedFeatures() {
		Feature target = getTarget();
		Stream<Feature> implicitRedefinedFeatures = TypeUtil
				.getImplicitGeneralTypesOnly(target, SysMLPackage.Literals.REDEFINITION).stream()
				.map(Feature.class::cast);
		Stream<Feature> ownedRedefinedFeatures = target.getOwnedRedefinition().stream()
				.map(Redefinition::getRedefinedFeature).filter(f -> f != null);
		return Stream.concat(ownedRedefinedFeatures, implicitRedefinedFeatures).toList();
	}

	/**
	 * Return a set including this Feature and all Features that it redefines
	 * directly or indirectly.
	 */
	public Set<Feature> getAllRedefinedFeatures() {
		if (allRedefinedFeatures == null) {
			allRedefinedFeatures = new HashSet<>();

			// Ensure that the redefinitions for this feature are recomputed.
			forceComputeRedefinitions();

			addAllRedefinedFeaturesTo(allRedefinedFeatures);
		}
		return allRedefinedFeatures;
	}

	public void addAllRedefinedFeaturesTo(Set<Feature> redefinedFeatures) {
		redefinedFeatures.add(getTarget());
		getRedefinedFeaturesWithComputed().stream().forEach(redefinedFeature -> {
			if (redefinedFeature != null && !redefinedFeatures.contains(redefinedFeature)) {
				FeatureUtil.addAllRedefinedFeaturesTo(redefinedFeature, redefinedFeatures);
			}
		});
	}

	// Computed Redefinition

	// See https://openmbee.atlassian.net/browse/ST6RI-978 to find out why we do not reuse getOwnedRedefinition
	private List<Feature> getOwnedRedefinedFeatures() {
		Feature target = getTarget();
		List<Feature> redefinedFeatures = new ArrayList<>();
		for (Relationship relationship : target.getOwnedRelationship()) {
			// Same selection as the ownedSpecialization setting delegate: a Redefinition whose
			// specific Type is the target.
			if (relationship instanceof Redefinition redefinition && redefinition.getSpecific() == target) {
				Feature redefined = redefinition.getRedefinedFeature();
				if (redefined != null) {
					redefinedFeatures.add(redefined);
				}
			}
		}
		return redefinedFeatures;
	}

	public List<Feature> getRedefinedFeaturesWithComputed() {
		Feature target = getTarget();
		// Do use getOwnedRedefinition for performance issue
		List<Feature> redefinedFeatures = getOwnedRedefinedFeatures();

		// Once the implicit redefinitions of the target are stable, they are read from its cache
		// without looking up the service: they no longer depend on provisional data, so there is no
		// incompleteness to propagate to the requester.
		List<ImplicitSpecialization> stableRedefinitions = null;
		IImplicitSpecializationCache cache = IImplicitSpecializationCache.find(target);
		if (cache != null && cache.areRedefinitionsStable()) {
			stableRedefinitions = cache.getCandidatesOfKind(SysMLPackage.eINSTANCE.getRedefinition());
		}
		if (stableRedefinitions != null) {
			stableRedefinitions.stream().map(candidate -> (Feature) candidate.generalType())
					.forEachOrdered(redefinedFeatures::add);
		} else {
			TypeUtil.getImplicitGeneralTypesOnly(target, SysMLPackage.eINSTANCE.getRedefinition()).stream()
					.map(Feature.class::cast).forEachOrdered(redefinedFeatures::add);
		}
		return redefinedFeatures;
	}

	/**
	 * Invalidates the provisional implicit-specialization results of the target
	 * Feature so that the next query recomputes them. Complete results are kept.
	 * <p>
	 * No guard is needed for a Feature whose own computation is in progress: that
	 * computation only starts when the cache holds no candidates, so its cache is
	 * still empty and the invalidation has no effect.
	 */
	public void forceComputeRedefinitions() {
		IImplicitSpecializationCache cache = IImplicitSpecializationCache.find(getTarget());
		if (cache != null && !cache.isComplete()) {
			cache.invalidate();
		}
	}

	public EList<Type> getAllTypes() {
		if (types == null) {
			EList<Type> allTypes = new NonNotifyingEObjectEList<Type>(Type.class, (InternalEObject) getTarget(),
					SysMLPackage.FEATURE__TYPE);
			getTypes(allTypes, new HashSet<Feature>());
			removeRedundantTypes(allTypes);
			// Note: Cache must be set only after completion of computation of types, in
			// order to correctly
			// handle a possible circular recursive call back to this method.
			types = allTypes;
		}
		return types;
	}

	public void getTypes(List<Type> types, Set<Feature> visitedFeatures) {
		Feature feature = getTarget();
		visitedFeatures.add(feature);
		getFeatureTypes(types, visitedFeatures);
		for (Feature typingFeature : feature.typingFeatures()) {
			if (typingFeature != null && !visitedFeatures.contains(typingFeature)) {
				FeatureUtil.getTypesOf(typingFeature, types, visitedFeatures);
			}
		}
	}

	public void getFeatureTypes(List<Type> types, Set<Feature> visitedFeatures) {
		Feature feature = getTarget();
		feature.getOwnedTyping().stream().map(typing -> typing.getType()).filter(type -> type != null)
				.forEachOrdered(types::add);
		types.addAll(TypeUtil.getImplicitGeneralTypesFor(feature, SysMLPackage.eINSTANCE.getFeatureTyping()));
	}

	protected static void removeRedundantTypes(List<Type> types) {
		for (int i = types.size() - 1; i >= 0; i--) {
			Type type = types.get(i);
			if (types.stream().anyMatch(otherType -> otherType != type && TypeUtil.specializes(otherType, type))) {
				types.remove(i);
			}
		}
	}

	public boolean isIgnoredParameter() {
		return FeatureUtil.isResultParameter(getTarget());
	}

	private static Feature getCrossFeatureOf(Feature feature) {
		Feature crossFeature = feature.getCrossFeature();
		if (crossFeature == null) {
			crossFeature = FeatureUtil.getBasicFeatureOf(
					(Feature) TypeUtil.getImplicitGeneralTypesOnly(feature, SysMLPackage.Literals.CROSS_SUBSETTING)
							.stream().findFirst().orElse(null));
		}
		return crossFeature;
	}

	// Transformation

	protected Feature getBoundValueResult() {
		FeatureValue valuation = FeatureUtil.getValuationFor(getTarget());
		if (valuation != null && !valuation.isDefault() && valuation.getValue() != null) {
			Expression value = valuation.getValue();
			ElementUtil.transform(value);
			if (value.getResult() != null) {
				return FeatureUtil.chainFeatures(value, value.getResult());
			}
		}
		return null;
	}

	/**
	 * @satisfies checkFeatureFeatureMembershipTypeFeaturing
	 */
	protected Type computeFeaturingType() {
		Feature feature = getTarget();
		Type owningType = feature.getOwningType();
		if (owningType == null) {
			return null;
		} else if (!feature.isVariable()) {
			addFeaturingType(owningType);
			return owningType;
		} else {
			Element occurrenceClass = getLibraryType("Occurrences::Occurrence");
			Feature snapshotsFeature = (Feature) getLibraryType("Occurrences::Occurrence::snapshots");
			Feature featuringType;

			if (owningType == occurrenceClass) {
				featuringType = snapshotsFeature;
			} else {
				featuringType = SysMLFactory.eINSTANCE.createFeature();

				String name = owningType.getQualifiedName();
				if (name == null) {
					name = "";
				} else {
					int i = name.indexOf("::");
					if (i >= 0) {
						name = name.substring(i + 2);
					}
					name = name.replace("::", "_");
				}
				featuringType.setDeclaredName(name + "_snapshots");

				Redefinition redefinition = SysMLFactory.eINSTANCE.createRedefinition();
				redefinition.setRedefinedFeature(snapshotsFeature);
				redefinition.setRedefiningFeature(featuringType);
				featuringType.getOwnedRelationship().add(redefinition);

				TypeFeaturing typeFeaturing = SysMLFactory.eINSTANCE.createTypeFeaturing();
				typeFeaturing.setFeaturingType(owningType);
				typeFeaturing.setFeatureOfType(featuringType);
				featuringType.getOwnedRelationship().add(typeFeaturing);
			}

			addFeaturingType(featuringType);
			return featuringType;
		}
	}

	protected void addFeaturingTypeIfNecessary(Type featuringType) {
		Feature feature = getTarget();
		if (featuringType != null && feature.getOwningType() == null && feature.getOwnedTypeFeaturing().isEmpty()) {
			addFeaturingType(featuringType);
		}
	}

	protected void addImplicitFeaturingTypesIfNecessary() {
		Feature feature = getTarget();
		Namespace owner = feature.getOwningNamespace();
		if (owner instanceof Feature && isImplicitFeaturingTypesEmpty()) {
			ElementUtil.transform(owner);
			addFeaturingTypes(((Feature) owner).getFeaturingType());
		}
	}

	protected BindingConnector addBindingConnector(Collection<Type> featuringTypes, Feature source, Feature target) {
		BindingConnector connector = createImplicitBindingConnector(source, target);
		addImplicitMemberBindingConnector(connector);
		FeatureUtil.addFeaturingTypesTo(connector, featuringTypes);
		return connector;
	}

	/**
	 * @satisfies checkFeatureValueBindingConnector
	 */
	protected void computeValueConnector() {
		Feature target = getTarget();
		// returns null if valuation isDefault is true
		Feature result = getBoundValueResult();
		if (result != null) {
			List<Type> featuringTypes;
			if (FeatureUtil.getValuationFor(target).isInitial()) {
				Feature that = (Feature) getLibraryType("Base::things::that");
				Feature startShot = (Feature) getLibraryType("Occurrences::Occurrence::startShot");
				if (that != null && startShot != null) {
					featuringTypes = Collections.singletonList(FeatureUtil.chainFeatures(that, startShot));
				} else {
					featuringTypes = target.getFeaturingType();
				}
			} else {
				featuringTypes = target.getFeaturingType();
			}
			addBindingConnector(featuringTypes, result, target);
		}
	}

	/**
	 * @satisfies checkFeatureOwnedCrossFeatureTypeFeaturing
	 */
	public void addOwnedCrossFeatureTypeFeaturing() {
		Feature target = getTarget();
		if (FeatureUtil.isOwnedCrossFeature(target) && target.getOwnedTypeFeaturing().isEmpty()
				&& isImplicitFeaturingTypesEmpty()) {
			Feature owningFeature = (Feature) target.getOwner();
			Type ownerOwningType = owningFeature.getOwningType();
			if (ownerOwningType != null) {
				List<Feature> endFeatures = ownerOwningType.getEndFeature();
				int n = endFeatures.size();
				if (n == 2) {
					Feature otherEnd = endFeatures.get(1 - endFeatures.indexOf(owningFeature));
					addFeaturingTypes(otherEnd.getType());
				} else if (n > 2) {
					Feature cartesianProductFeature = SysMLFactory.eINSTANCE.createFeature();

					for (Feature otherEnd : endFeatures) {
						if (otherEnd != owningFeature) {
							List<Type> crossFeatureTypes = otherEnd.getType();
							if (crossFeatureTypes.isEmpty()) {
								crossFeatureTypes = Collections.singletonList(getLibraryType("Base::Anything"));
							}
							if (cartesianProductFeature.getOwnedTypeFeaturing().isEmpty()) {
								for (Type crossFeatureType : crossFeatureTypes) {
									FeatureUtil.addTypeFeaturingTo(cartesianProductFeature)
											.setFeaturingType(crossFeatureType);
								}
							} else {
								if (!cartesianProductFeature.getOwnedTyping().isEmpty()) {
									Feature previousCartesianProductFeature = cartesianProductFeature;
									cartesianProductFeature = SysMLFactory.eINSTANCE.createFeature();
									TypeFeaturing typeFeaturing = FeatureUtil
											.addTypeFeaturingTo(cartesianProductFeature);
									typeFeaturing.setFeaturingType(previousCartesianProductFeature);
									typeFeaturing.getOwnedRelatedElement().add(previousCartesianProductFeature);
								}
								for (Type crossFeatureType : crossFeatureTypes) {
									FeatureUtil.addFeatureTypingTo(cartesianProductFeature).setType(crossFeatureType);
								}
							}
						}
					}

					addFeaturingType(cartesianProductFeature);

					for (Feature redefinedFeature : FeatureUtil.getRedefinedFeaturesWithComputedOf(owningFeature)) {
						if (redefinedFeature.isEnd()) {
							Feature crossFeature = getCrossFeatureOf(redefinedFeature);
							if (crossFeature != null) {
								FeatureUtil.addOwnedCrossFeatureTypeFeaturingTo(crossFeature);
								for (Type featuringType : crossFeature.getFeaturingType()) {
									if (featuringType instanceof Feature) {
										FeatureUtil.addSubsettingTo(cartesianProductFeature)
												.setSubsettedFeature((Feature) featuringType);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void doTransform() {
		computeFeaturingType();
		computeValueConnector();
		forceComputeRedefinitions();
		super.doTransform();
		addOwnedCrossFeatureTypeFeaturing();
	}

}
