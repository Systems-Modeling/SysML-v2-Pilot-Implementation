/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.adapter.TypeAdapter;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class TypeUtil {
	
	private TypeUtil() {
	}

	protected static TypeAdapter getTypeAdapter(Type target) {
		return (TypeAdapter)ElementUtil.getElementAdapter(target);
	}
	
	// Inheritance
	
	public static EList<Membership> getMembershipFor(Type type, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		return getTypeAdapter(type).getMembership(excludedNamespaces, excludedTypes, includeProtected);
	}

	public static EList<Membership> getNonPrivateMembershipFor(Type type, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		return getTypeAdapter(type).getNonPrivateMembership(excludedNamespaces, excludedTypes, includeProtected);
	}

	public static EList<Membership> getInheritedMembershipFor(Type type, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		return getTypeAdapter(type).getInheritedMembership(excludedNamespaces, excludedTypes, includeProtected);
	}

	// Caching
	
	public static EList<Membership> cacheInheritedMembershipOf(Type type, Supplier<EList<Membership>> supplier) {	
		TypeAdapter adapter = getTypeAdapter(type);
		EList<Membership> membership = adapter.getInheritedMembership();
		return membership == null? adapter.setInheritedMembership(supplier.get()): membership;
	}
	
	// Supertypes
	
	public static List<Type> getSupertypesOf(Type type) {
		return getSupertypesOf(type, null);
	}
	
	public static List<Type> getSupertypesOf(Type type, Element skip) {
		List<Type> supertypes = new ArrayList<>();
		type.getOwnedSpecialization()
			.stream()
			.filter(spec -> spec != skip)
			.map(Specialization::getGeneral)
			.forEachOrdered(supertypes::add);
		supertypes.addAll(getImplicitGeneralTypesFor(type));
		return supertypes;
	}
	
	public static List<Type> getGeneralTypesOf(Type type) {
		return getGeneralTypesOf(type, null);
	}

	/**
	 * Get the immediate general types of the given type. If the type is a chained Feature,
	 * then its last chaining Feature is included, for the purposes of inheritance.
	 */
	public static List<Type> getGeneralTypesOf(Type type, Element skip) {
		List<Type> generalTypes = getSupertypesOf(type);
		if (type instanceof Feature) {
			EList<FeatureChaining> featureChainings = ((Feature)type).getOwnedFeatureChaining();
			if (!featureChainings.isEmpty() && !featureChainings.contains(skip)) {
				FeatureChaining lastFeatureChaining = featureChainings.get(featureChainings.size()-1);
				Feature lastChainingFeature = lastFeatureChaining.getChainingFeature();
				if (lastChainingFeature != null) {
					generalTypes.add(lastChainingFeature);
				}
			}
		}
		return generalTypes;
	}

	public static boolean conforms(Type subtype, Type supertype) {
		return conforms(subtype, supertype, new HashSet<>());
	}
	
	// Note: Generalizations are allowed to be cyclic.
	public static boolean conforms(Type subtype, Type supertype, Set<Type> visited) {
		if (subtype == supertype) {
			return true;
		} else if (subtype != null) {
			visited.add(subtype);
			if (subtype.isConjugated()) {
				Type originalType = subtype.getOwnedConjugator().getOriginalType();
				return !visited.contains(originalType) && conforms(originalType, supertype);
			} else {
				return getGeneralTypesOf(subtype).stream().
						anyMatch(type->!visited.contains(type) && 
								conforms(type, supertype, visited));
			}
		} else {
			return false;
		}
	}
	
	// Features
	
	public static List<Feature> getPublicFeaturesOf(Type type) {
		return type.visibleMemberships(new BasicEList<>(), false, false).stream().
				filter(FeatureMembership.class::isInstance).
				map(FeatureMembership.class::cast).
				map(FeatureMembership::getOwnedMemberFeature).
				collect(Collectors.toList());
	}
	
	public static List<Feature> getAllEndFeaturesOf(Type type) {
		return getAllEndFeaturesOf(type, new HashSet<>());
	}
	
	private static List<Feature> getAllEndFeaturesOf(Type type, Set<Type> visited) {
		visited.add(type);
		List<Feature> ends = getOwnedEndFeaturesOf(type);
		int n = ends.size();
		for (Type general: getGeneralTypesOf(type)) {
			if (general != null && !visited.contains(general)) {
				List<Feature> inheritedEnds = getAllEndFeaturesOf(general, visited);
				if (inheritedEnds.size() > n) {
					ends.addAll(inheritedEnds.subList(n, inheritedEnds.size()));
				}
			}
		}
		return ends;
	}
	
	public static List<Feature> getOwnedEndFeaturesOf(Type type) {
		return type == null? Collections.emptyList():
			   	type.getOwnedFeature().stream().
			   		filter(Feature::isEnd).
			   		collect(Collectors.toList());
	}
	
	public static List<Feature> getAllParametersOf(Type type) {
		return getAllParametersOf(type, null);
	}
	
	public static List<Feature> getAllParametersOf(Type type, Element skip) {
		return getAllParametersOf(type, new HashSet<>(), skip);
	}
	
	private static List<Feature> getAllParametersOf(Type type, Set<Type> visited, Element skip) {
		visited.add(type);
		List<Feature> parameters = getOwnedParametersOf(type);
		parameters.removeIf(FeatureUtil::isResultParameter);
		int n = parameters.size();
		Feature resultParameter = getOwnedResultParameterOf(type);
		for (Type general: TypeUtil.getGeneralTypesOf(type, skip)) {
			if (general != null && !visited.contains(general)) {
				List<Feature> inheritedParameters = getAllParametersOf(general, visited, skip);
				if (resultParameter == null) {
					resultParameter = inheritedParameters.stream().
							filter(FeatureUtil::isResultParameter).
							findFirst().orElse(null);
				}
				inheritedParameters.removeIf(FeatureUtil::isResultParameter);
				if (inheritedParameters.size() > n) {
					parameters.addAll(inheritedParameters.subList(n, inheritedParameters.size()));
				}
			}
		}
		if (resultParameter != null) {
			parameters.add(resultParameter);
		}
		return parameters;
	}
	
	public static List<Feature> getOwnedParametersOf(Type type) {
		if (type instanceof Feature) {
			type = FeatureUtil.getBasicFeatureOf((Feature)type);
		}
		return type.getOwnedFeature().stream().
				filter(FeatureUtil::isParameter).
				collect(Collectors.toList());
	}
	
	public static Feature getOwnedResultParameterOf(Type type) {
		return getOwnedParametersOf(type).stream().
				filter(FeatureUtil::isResultParameter).
				findFirst().orElse(null);
	}
	
	public static Feature getResultParameterOf(Type type) {
		return getResultParameterOf(type, new HashSet<>());
	}
	
	private static Feature getResultParameterOf(Type type, Set<Type> visited) {
		visited.add(type);
		getTypeAdapter(type).addAdditionalMembers();
		Feature resultParameter = getOwnedResultParameterOf(type);
		if (resultParameter == null) {
			for (Type general: getSupertypesOf(type)) {
				if (general != null && !visited.contains(general)) {
					resultParameter = getResultParameterOf(general, visited);
					if (resultParameter != null) {
						break;
					}
				}
			}
		}
		return resultParameter;
	}

	public static void addResultParameterTo(Type type) {
		addResultParameterTo(type, SysMLFactory.eINSTANCE.createFeature());
	}
	
	public static void addResultParameterTo(Type type, Feature resultParameter) {
		if (type.getOwnedRelationship().stream().noneMatch(ReturnParameterMembership.class::isInstance)) {
			ReturnParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			membership.setOwnedMemberParameter(resultParameter);
			type.getOwnedRelationship().add(membership);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Feature> T getOwnedParameterOf(Type type, int index, Class<T> kind) {
		List<Feature> parameters = TypeUtil.getOwnedParametersOf(type);
		if (parameters.size() <= index) {
			return null;
		} else {
			Feature parameter = parameters.get(index);
			return kind.isInstance(parameter)? (T)parameter: null;
		}		
	}
	
	// Membership

	public static <M extends Membership, T> Stream<T> getInheritedMembersByMembershipIn(Type type, Class<M> kind, Class<T> memberType) {
		return type.getInheritedMembership().stream().
				filter(kind::isInstance).
				map(Membership::getMemberElement).
				filter(memberType::isInstance).
				map(memberType::cast);
	}

	public static <T extends Membership> Stream<Feature> getFeaturesByMembershipIn(Type type, Class<T> kind) {
		return type.getFeatureMembership().stream().
				filter(kind::isInstance).
				map(FeatureMembership::getOwnedMemberFeature);
	}

	public static <T extends Membership> Feature getFeatureByMembershipIn(Type type, Class<T> kind) {
		return getFeaturesByMembershipIn(type, kind).findFirst().orElse(null);
	}

	public static <T extends Membership> Stream<Feature> getOwnedFeaturesByMembershipIn(Type type, Class<T> kind) {
		return type.getOwnedFeatureMembership().stream().
				filter(kind::isInstance).
				map(FeatureMembership::getOwnedMemberFeature).
				filter(f->f != null);
	}

	public static <M extends Membership, E extends Element> void addOwnedFeaturesByMembership(Type type, 
			Class<M> kind, Class<E> elementKind, List<E> list) {
		getOwnedFeaturesByMembershipIn(type, kind).map(elementKind::cast).forEachOrdered(list::add);
	}

	public static <T extends Membership> Feature getOwnedFeatureByMembershipIn(Type type, Class<T> kind) {
		return getOwnedFeaturesByMembershipIn(type, kind).findFirst().orElse(null);
	}

	public static FeatureMembership addOwnedFeatureTo(Type type, Feature feature) {
		FeatureMembership membership = SysMLFactory.eINSTANCE.createFeatureMembership();
		membership.setOwnedMemberFeature(feature);
		type.getOwnedRelationship().add(membership);
		return membership;
	}
	
	private static <T extends FeatureMembership> T addBoundFeatureTo(Type type, Expression value, T membership) {
		Feature feature = SysMLFactory.eINSTANCE.createFeature();
		if (value != null) {
			FeatureUtil.addFeatureValueTo(feature, value);
		}
		membership.setOwnedMemberFeature(feature);
		type.getOwnedRelationship().add(membership);
		return membership;
	}
	
	public static FeatureMembership addBoundFeatureTo(Type type, Expression value) {
		return addBoundFeatureTo(type, value, SysMLFactory.eINSTANCE.createFeatureMembership());
	}
	
	public static ParameterMembership addOwnedParameterTo(Type type, Expression value) {
		return addBoundFeatureTo(type, value, SysMLFactory.eINSTANCE.createParameterMembership());
	}
	
	// Implicit general types
	
	public static void setIsAddImplicitGeneralTypesFor(Type type, boolean isAddImplicitGeneralTypes) {
		getTypeAdapter(type).setIsAddImplicitGeneralTypes(isAddImplicitGeneralTypes);
	}
	
	public static boolean isImplicitSpecializationDeclaredFor(Type type, EClass eClass) {
		return getTypeAdapter(type).isImplicitSpecializationDeclaredFor(eClass);
	}
	
	public static boolean isImplicitGeneralTypesEmpty(Type type) {
		return getTypeAdapter(type).isImplicitGeneralTypesEmpty();
	}
	
	public static List<Type> getImplicitGeneralTypesFor(Type type) {
		return getTypeAdapter(type).getImplicitGeneralTypes();
	}
	
	public static List<Type> getImplicitGeneralTypesFor(Type type, EClass kind) {
		return getTypeAdapter(type).getImplicitGeneralTypes(kind);
	}
	
	public static List<Type> getImplicitGeneralTypesOnly(Type type, EClass kind) {
		return getTypeAdapter(type).getImplicitGeneralTypesOnly(kind);
	}
	
	public static void addDefaultGeneralTypeTo(Type type) {
		getTypeAdapter(type).addDefaultGeneralType();
	}
	
	public static void addDefaultGeneralTypeTo(Type type, EClass generalizationEClass, String... superTypeNames) {
		getTypeAdapter(type).addDefaultGeneralType(generalizationEClass, superTypeNames);
	}
	
	public static void addImplicitGeneralTypeTo(Type type, EClass kind, Type generalType) {
		getTypeAdapter(type).addImplicitGeneralType(kind, generalType);
	}
	
	public static void removeImplicitGeneralTypeFrom(Type type, EClass kind) {
		getTypeAdapter(type).removeImplicitGeneralType(SysMLPackage.eINSTANCE.getRedefinition());
	}
	
	public static void forEachImplicitGeneralTypeOf(Type type, BiConsumer<EClass, Type> action) {
		getTypeAdapter(type).forEachImplicitGeneralType(action);
	}

	/**
	 * Physically insert implicit specializations into the model.
	 */
	public static void insertImplicitSpecializations(Type type) {
		TypeAdapter adapter = getTypeAdapter(type);
		adapter.forEachImplicitGeneralType((eClass, general)->{
			Specialization newSpecialization = (Specialization)SysMLFactory.eINSTANCE.create(eClass);
			newSpecialization.setIsImplied(true);
			newSpecialization.setGeneral(general);
			newSpecialization.setSpecific(type);
			type.getOwnedRelationship().add(newSpecialization);			
		});
		adapter.cleanImplicitGeneralTypes();
	}

	// Implicit binding connectors

	public static void forEachImplicitBindingConnectorOf(Type type, BiConsumer<BindingConnector, EClass> consumer) {
		getTypeAdapter(type).forEachImplicitBindingConnector(consumer);
	}

	/**
	 * Physically insert implicit binding connectors into the model.
	 */
	public static void insertImplicitBindingConnectors(Type type) {		
		TypeAdapter adapter = getTypeAdapter(type);
		List<Membership> createdMemberships = new ArrayList<>();
		adapter.forEachImplicitBindingConnector((connector, eClass)->{
			connector.setIsImplied(true);
			if (eClass == SysMLPackage.Literals.FEATURE_MEMBERSHIP) {
				createdMemberships.add(TypeUtil.addOwnedFeatureTo(type, connector));
			} else {
				createdMemberships.add(NamespaceUtil.addOwnedMemberTo(type, connector));
			}
		});
		adapter.cleanImplicitBindingConnectors();
		
		// This is required as the owned relationships call of the type will not return
		// the newly created binding connectors so we have to ensure the transform
		// function is used appropriately
		for (Membership m : createdMemberships) {
			ElementUtil.transformAll(m.getMemberElement(), true);
		}
	}
	
	// Relevant features
	
	public static List<? extends Feature> getRelevantFeaturesOf(Type type) {
		return getTypeAdapter(type).getRelevantFeatures();
	}
	
	/**
	 * Get the non-parameter abstract Features. (For use with Behaviors.)
	 */
	public static List<Feature> getNonParameterAbstractFeaturesFor(Type type) {
		return type.getOwnedFeature().stream().
				filter(feature -> !FeatureUtil.isParameter(feature) && feature.isAbstract()).
				collect(Collectors.toList());
	}
	
	/**
	 * Get ItemFeatures. (For use with Steps.)
	 */
	public static List<? extends Feature> getItemFeaturesOf(Type type) {
		return type.getOwnedFeature().stream().
				filter(ItemFeature.class::isInstance).
				collect(Collectors.toList());
	}

	// Associations

	public static Type getSourceTypeOf(Association association) {
		EList<Type> relatedTypes = association.getRelatedType();
		return relatedTypes.isEmpty()? null: relatedTypes.get(0);
	}

	public static void addTargetTypes(Association association, EList<Type> targetTypes) {
		EList<Type> relatedTypes = association.getRelatedType();
		if (relatedTypes.size() >= 2) {
			targetTypes.addAll(relatedTypes.subList(1, relatedTypes.size()));
		}
	}
	
	// Individuals
	
	public static boolean isIndividual(Type type) {
		return type instanceof OccurrenceDefinition && ((OccurrenceDefinition)type).isIndividual() ||
			   type instanceof OccurrenceUsage && ((OccurrenceUsage)type).isIndividual();
	}

}
