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
import org.omg.sysml.adapter.DefinitionAdapter;
import org.omg.sysml.adapter.TypeAdapter;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

public class TypeUtil {
	
	private TypeUtil() {
	}

	protected static TypeAdapter getTypeAdapter(Type target) {
		return (TypeAdapter)ElementUtil.getElementAdapter(target);
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
		List<Type> ownedGeneralEnds = new ArrayList<>(); 
		type.getOwnedSpecialization()
			.stream()
			.filter(spec -> spec != skip)
			.map(Specialization::getGeneral)
			.forEachOrdered(ownedGeneralEnds::add);
		ownedGeneralEnds.addAll(getImplicitGeneralTypesFor(type));
		return ownedGeneralEnds;
	}
	
	public static boolean conforms(Type subtype, Type supertype) {
		return conforms(subtype, supertype, new HashSet<>());
	}
	
	// Note: Generalizations are allowed to be cyclic.
	protected static boolean conforms(Type subtype, Type supertype, Set<Type> visited) {
		if (subtype == supertype) {
			return true;
		} else if (subtype != null) {
			visited.add(subtype);
			if (subtype.isConjugated()) {
				Type originalType = subtype.getOwnedConjugator().getOriginalType();
				return !visited.contains(originalType) && conforms(originalType, supertype);
			} else if (getSupertypesOf(subtype).stream().
					anyMatch(type->!visited.contains(type) && 
							conforms(type, supertype, visited))) {
				return true;
			} else if (subtype instanceof Feature) {
				Feature lastChainingFeature = FeatureUtil.getLastChainingFeatureOf((Feature)subtype);
				if (lastChainingFeature != null && !visited.contains(lastChainingFeature)) {
					return conforms(lastChainingFeature, supertype, visited);
				}
			}
		}
		return false;
	}
	
	// Features
	
	public static List<Feature> getPublicFeaturesOf(Type type) {
		return type.visibleMemberships(new BasicEList<>(), false, false).stream().
				filter(FeatureMembership.class::isInstance).
				map(FeatureMembership.class::cast).
				map(FeatureMembership::getMemberFeature).
				collect(Collectors.toList());
	}
	
	public static List<Feature> getAllEndFeaturesOf(Type type) {
		return getAllEndFeaturesOf(type, new HashSet<>());
	}
	
	private static List<Feature> getAllEndFeaturesOf(Type type, Set<Type> visited) {
		visited.add(type);
		List<Feature> ends = getOwnedEndFeaturesOf(type);
		int n = ends.size();
		for (Type general: getSupertypesOf(type)) {
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
		return type.getOwnedFeature().stream().
				filter(Feature::isEnd).
				collect(Collectors.toList());
	}
	
	public static List<Feature> getAllParametersOf(Type type) {
		return getAllParametersOf(type, new HashSet<>());
	}
	
	private static List<Feature> getAllParametersOf(Type type, Set<Type> visited) {
		visited.add(type);
		List<Feature> parameters = getOwnedParametersOf(type);
		parameters.removeIf(FeatureUtil::isResultParameter);
		int n = parameters.size();
		Feature resultParameter = getOwnedResultParameterOf(type);
		for (Type general: TypeUtil.getSupertypesOf(type)) {
			if (general != null && !visited.contains(general)) {
				List<Feature> inheritedParameters = getAllParametersOf(general, visited);
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
		// NOTE: This method will fill in an inherited result Parameter if this Type does not
		// have an owned result Parameter. It is for use when transform may have not yet been
		// called on this Type.
		return getResultParameterOf(type, new HashSet<>());
	}
	
	private static Feature getResultParameterOf(Type type, Set<Type> visited) {
		visited.add(type);
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
	
	// Membership

	public static <M extends Membership, T> Stream<T> getInheritedMembersByMembershipIn(Type type, Class<M> kind, Class<T> memberType) {
		return type.getInheritedMembership().stream().
				filter(kind::isInstance).
				map(Membership::getOwnedMemberElement).
				filter(memberType::isInstance).
				map(memberType::cast);
	}

	public static <T extends Membership> Stream<Feature> getFeaturesByMembershipIn(Type type, Class<T> kind) {
		return type.getFeatureMembership().stream().
				filter(kind::isInstance).
				map(FeatureMembership::getMemberFeature);
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
	
	// Implicit general types
	
	public static boolean isImplicitGeneralizationDeclaredFor(Type type, EClass eClass) {
		return getTypeAdapter(type).isImplicitGeneralizationDeclaredFor(eClass);
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
	 * Physically insert implicit generalizations into the model.
	 */
	public static void insertImplicitGeneralizations(Type type) {
		TypeAdapter adapter = getTypeAdapter(type);
		adapter.forEachImplicitGeneralType((eClass, general)->{
			Specialization newGeneralization = (Specialization)SysMLFactory.eINSTANCE.create(eClass);
			newGeneralization.setGeneral(general);
			newGeneralization.setSpecific(type);
			type.getOwnedRelationship().add(newGeneralization);			
		});
		adapter.cleanImplicitGeneralTypes();
	}

	// Implicit binding connectors

	public static BindingConnector createBindingConnector(Feature source, Feature target) {
		BindingConnector connector = SysMLFactory.eINSTANCE.createBindingConnector();
		ConnectorUtil.addConnectorEndTo(connector, source);
		ConnectorUtil.addConnectorEndTo(connector, target);
		return connector;
	}

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

	// Subject parameters

	public static Feature getSubjectParameterOf(Type type) {
		return type instanceof Definition? ((DefinitionAdapter)ElementUtil.getElementAdapter((Definition)type)).getSubjectParameter():
			   type instanceof Usage? UsageUtil.getUsageAdapter((Usage)type).getSubjectParameter():
			   null;
	}

	public static Usage basicGetSubjectParameterOf(Type type) {
		return (Usage)getOwnedFeatureByMembershipIn(type, SubjectMembership.class);
	}
	
	// Objective requirements

	public static RequirementUsage getObjectiveRequirementOf(Type type) {
		return type instanceof CaseDefinition? ((CaseDefinition)type).getObjectiveRequirement():
			   type instanceof CaseUsage? ((CaseUsage)type).getObjectiveRequirement():
			   null;
	}
	
	// Associations

	public static Type getSourceTypeOf(Association association) {
		EList<Type> relatedType = association.getRelatedType();
		return relatedType.size() == 2? relatedType.get(0): null;
	}

	public static void addTargetTypes(Association association, EList<Type> targetTypes) {
		EList<Type> relatedTypes = association.getRelatedType();
		if (relatedTypes.size() == 2) {
			targetTypes.add(relatedTypes.get(1));
		} else {
			targetTypes.addAll(relatedTypes);
		}
	}
	
	// Individuals
	
	public static boolean isIndividual(Type type) {
		return type instanceof OccurrenceDefinition && ((OccurrenceDefinition)type).isIndividual() ||
			   type instanceof OccurrenceUsage && ((OccurrenceUsage)type).isIndividual();
	}

}
