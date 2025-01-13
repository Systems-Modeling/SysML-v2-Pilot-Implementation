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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;

public class TypeAdapter extends NamespaceAdapter {

	public TypeAdapter(Type element) {
		super(element);
	}
	
	public Type getTarget() {
		return (Type)super.getTarget();
	}
	
	// Additional operations
	
	@Override
	public EList<Membership> getVisibleMemberships(Set<org.omg.sysml.lang.sysml.Namespace> excluded, boolean isRecursive, boolean includeAll) {
		Type target = getTarget();
		EList<Membership> visibleMembership = super.getVisibleMemberships(excluded, isRecursive, includeAll);
		excluded.add(target);
		EList<Membership> inheritedMembership = getInheritedMembership(excluded, new HashSet<>(), isRecursive);
		excluded.remove(target);
		if (!includeAll) {
			inheritedMembership.removeIf(mem->mem.getVisibility() != VisibilityKind.PUBLIC);
		}
		visibleMembership.addAll(inheritedMembership);
		return visibleMembership;
	}
	
	public EList<Membership> getNonPrivateMembership(Set<Namespace> excludedNamespaces, Set<Type> excludedTypes, boolean excludeImplied) {
		EList<Membership> nonPrivateMemberships = getMembershipsOfVisibility(VisibilityKind.PUBLIC, excludedNamespaces);
		nonPrivateMemberships.addAll(getMembershipsOfVisibility(VisibilityKind.PROTECTED, excludedNamespaces));
		nonPrivateMemberships.addAll(getInheritedMembership(excludedNamespaces, excludedTypes, excludeImplied));
		return nonPrivateMemberships;
	}
	
	public void addNonPrivateMembership(EList<Membership> inheritedMemberships, Set<Namespace> excludedNamespaces, Set<Type> excludedTypes, boolean excludeImplied) {
		if (!excludedTypes.contains(getTarget())) {
			nonPrivateMembership = getNonPrivateMembership(excludedNamespaces, excludedTypes, excludeImplied);
		}
		if (nonPrivateMembership != null) {
			inheritedMemberships.addAll(nonPrivateMembership);
		}
	}
	
	public EList<Membership> getInheritedMembership(Set<Namespace> excludedNamespaces, Set<Type> excludedTypes, boolean excludeImplied) {
		if (inheritedMembership != null) {
			return inheritedMembership;
		} else {
			EList<Membership> inheritedMemberships = getInheritableMemberships(excludedNamespaces, excludedTypes, excludeImplied);
			removeRedefinedFeatures(inheritedMemberships);
			return inheritedMemberships;
		}
	}
	
	public EList<Membership> getInheritableMemberships(Set<Namespace> excludedNamespaces, Set<Type> excludedTypes, boolean excludeImplied) {
		Type target = getTarget();
		excludedTypes.add(target);

		// Using an EObjectEList ensures that isUnique = true.
		EList<Membership> inheritedMemberships = new NonNotifyingEObjectEList<Membership>(Membership.class, (InternalEObject) target, SysMLPackage.TYPE__INHERITED_MEMBERSHIP);
		
		Conjugation conjugator = target.getOwnedConjugator();
		if (conjugator != null) {
			Type originalType = conjugator.getOriginalType();
			if (originalType != null) {
				TypeUtil.addNonPrivateMembershipFor(originalType, inheritedMemberships, excludedNamespaces, excludedTypes, excludeImplied);
			}
		}
		for (Type general: TypeUtil.getGeneralTypesOf(target, excludeImplied)) {
			if (general != null) {
				TypeUtil.addNonPrivateMembershipFor(general, inheritedMemberships, excludedNamespaces, excludedTypes, excludeImplied);
			}
		}
		return inheritedMemberships;
	}
	
	public void removeRedefinedFeatures(List<Membership> memberships) {
		Collection<Feature> featuresRedefinedByType = getFeaturesRedefinedByType();
		Collection<Feature> allFeaturesRedefinedByMemberships = new HashSet<>();
		int n = memberships.size();
		for (int i = 0; i < n; i++) {
			Membership membership = memberships.get(i);
			Element memberElement = membership.getMemberElement();
			if (memberElement instanceof Feature) {
				Collection<Feature> membershipRedefinedFeatures = 
						FeatureUtil.getAllRedefinedFeaturesOf((Feature)memberElement);
				if (membershipRedefinedFeatures.stream().anyMatch(featuresRedefinedByType::contains)) {
					memberships.remove(membership);
					i--; n--;
				}
				membershipRedefinedFeatures.stream().
					filter(feature->feature != memberElement).
					forEach(allFeaturesRedefinedByMemberships::add);
			}
		}
		memberships.removeIf(membership->allFeaturesRedefinedByMemberships.contains(membership.getMemberElement()));
	}
	
	protected Collection<Feature> getFeaturesRedefinedByType() {
		if (redefinedFeatures == null) {
			redefinedFeatures = TypeUtil.getFeaturesRedefinedBy(getTarget(), null);
		}
		return redefinedFeatures;		
	}

	// Caching
	
	private EList<Membership> inheritedMembership = null;
	private EList<Membership> nonPrivateMembership = null;
	private Collection<Feature> redefinedFeatures = null;	
	
	public EList<Membership> getInheritedMembership() {
		return inheritedMembership;
	}
	
	public EList<Membership> setInheritedMembership(EList<Membership> inheritedMembership) {
		this.inheritedMembership = inheritedMembership;
		return inheritedMembership;
	}
		
	public void clearCaches() {
		super.clearCaches();
		inheritedMembership = null;
		nonPrivateMembership = null;
		redefinedFeatures = null;
	}
	
	// Implicit Elements
	
	protected boolean isAddImplicitGeneralTypes = true;
	
	public void setIsAddImplicitGeneralTypes(boolean isAddImplicitGeneralTypes) {
		this.isAddImplicitGeneralTypes = isAddImplicitGeneralTypes;
	}
	
	/**
	 * Contains the required ends for implicit specializations like implicit
	 * superclassing, subsetting, featuretyping and redefinitions for future access.
	 * The lists must not contain null values and the current type.
	 */
	protected Map<EClass, List<Type>> implicitGeneralTypes = new HashMap<>();
	protected List<BindingConnector> implicitMemberBindingConnectors = new ArrayList<>();
	protected List<BindingConnector> implicitFeatureBindingConnectors = new ArrayList<>();
	
	public void cleanImplicitGeneralTypes() {
		implicitGeneralTypes.clear();
	}
	
	public void cleanImplicitBindingConnectors() {
		implicitMemberBindingConnectors.clear();
		implicitFeatureBindingConnectors.clear();
	}

	public boolean isImplicitGeneralTypesEmpty() {
		return implicitGeneralTypes.isEmpty();
	}
	
	public Collection<EClass> getImplicitGeneralTypeKinds() {
		// Sort keys, to ensure a deterministic ordering of implied specializations 
		// for implicit general types.
		List<EClass> keyList = new ArrayList<>(implicitGeneralTypes.keySet());
		Collections.sort(keyList, new Comparator<EClass>() {
			@Override
			public int compare(EClass c1, EClass c2) {
				return Integer.compare(c1.getClassifierID(), c2.getClassifierID());
			}			
		});
		return keyList;
	}
	
	public void forEachImplicitBindingConnector(Consumer<BindingConnector> consumer) {
		Stream.concat(implicitMemberBindingConnectors.stream(), implicitFeatureBindingConnectors.stream())
				.forEach(consumer);
	}
	
	/**
	 * Executes the given consumer function with all implicit binding connectors and
	 * their corresponding membership type (Membership or FeatureMembership)
	 */
	public void forEachImplicitBindingConnector(BiConsumer<BindingConnector, EClass> consumer) {
		for (BindingConnector connector : implicitFeatureBindingConnectors) {
			consumer.accept(connector, SysMLPackage.Literals.FEATURE_MEMBERSHIP);
		}
		for (BindingConnector connector : implicitMemberBindingConnectors) {
			consumer.accept(connector, SysMLPackage.Literals.MEMBERSHIP);
		}
	}
	
	public List<Type> getImplicitGeneralTypes() {
		computeImplicitGeneralTypes();
		
		return getImplicitGeneralTypeKinds().stream().
				map(implicitGeneralTypes::get).
				flatMap(Collection::stream).
				collect(Collectors.toList());
	}
	
	public List<Type> getImplicitGeneralTypes(EClass eClass) {
		return getImplicitGeneralTypeKinds().stream().
				filter(eClass::isSuperTypeOf).
				flatMap(keyClass->getImplicitGeneralTypesOnly(keyClass).stream()).
				collect(Collectors.toList());
	}
	
	public List<Type> getImplicitGeneralTypesOnly(EClass eClass) {
		return implicitGeneralTypes.getOrDefault(eClass, Collections.emptyList());
	}
	
	public Type getFirstImplicitGeneralType(EClass eClass) {
		List<Type> types = getImplicitGeneralTypes(eClass);
		return types.isEmpty() ? null : types.get(0);
	}
	
	public boolean isImplicitSpecializationDeclaredFor(EClass eClass) {
		return implicitGeneralTypes.containsKey(eClass);
	}
	
	public boolean isImplicitSpecializationFor(EClass eClass, Type general) {
		return implicitGeneralTypes.getOrDefault(eClass, Collections.emptyList()).contains(general);
	}
	
	protected static boolean hasNoConformingSpecializations(Type type, Class<?> kind, Type defaultGeneral) {
		return type.getOwnedRelationship().stream().
				filter(kind::isInstance).
				map(Specialization.class::cast).
				noneMatch(spec->spec.getSpecific() == type && TypeUtil.conforms(defaultGeneral, spec.getGeneral()));
	}

	public void addImplicitGeneralType(EClass eClass, Type general) {
		if (isAddImplicitGeneralTypes && general != null && general != getTarget() && !isImplicitSpecializationFor(eClass, general)) {
			implicitGeneralTypes.computeIfAbsent(eClass, e -> new ArrayList<>()).add(general);
		}
	}
	
	public void removeImplicitGeneralType(EClass eClass) {
		implicitGeneralTypes.remove(eClass);
	}
	
	public void forEachImplicitGeneralType(BiConsumer<EClass, Type> action) {
		for (EClass eClass : getImplicitGeneralTypeKinds()) {
			for (Type supertype : implicitGeneralTypes.get(eClass)) {
				action.accept(eClass, supertype);
			}
		}
	}	

	public void addImplicitFeatureBindingConnector(BindingConnector connector) {
		implicitFeatureBindingConnectors.add(connector);
	}
	
	public void addImplicitMemberBindingConnector(BindingConnector connector) {
		implicitMemberBindingConnectors.add(connector);
	}
	
	public void removeUnnecessaryImplicitGeneralTypes() {
		Type target = getTarget();
		List<Specialization> specializations = target.getOwnedSpecialization().stream().
				filter(spec->spec.getSpecific() == target && spec.getGeneral() != target).
				collect(Collectors.toList());
		List<Type> generals = specializations.stream().
				map(Specialization::getGeneral).
				collect(Collectors.toList());
		List<Type> redefinedFeatures = specializations.stream().
				filter(Redefinition.class::isInstance).
				map(Specialization::getGeneral).
				collect(Collectors.toList());
		List<Type> implicitGenerals = new ArrayList<>();
		implicitGeneralTypes.values().forEach(implicitGenerals::addAll);
		for (Object eClass: implicitGeneralTypes.keySet().toArray()) {
			List<Type> implicitEClassGenerals = implicitGeneralTypes.get(eClass);
			if (eClass == SysMLPackage.eINSTANCE.getRedefinition()) {
				implicitEClassGenerals.removeAll(redefinedFeatures);
			} else {
				implicitEClassGenerals.removeIf(gen->
					generals.stream().anyMatch(type->conforms(type, gen)) ||
					implicitGenerals.stream().anyMatch(type->type != gen && conforms(type, gen)));
			}
			if (implicitEClassGenerals.isEmpty()) {
				implicitGeneralTypes.remove(eClass);
			}
		}
		
		// Disallow adding more implicit general types once unnecessary ones have been removed.
		setIsAddImplicitGeneralTypes(false);
	}
	
	protected boolean conforms(Type subtype, Type supertype) {
		// NOTE: Treat target as already having been visited when checking conformance,
		// to allow for the possibility of circular specialization. Otherwise, implicit
		// specializations would get removed from all types in the circle.
		Set<Type> visited = new HashSet<>();
		visited.add(getTarget());
		return TypeUtil.conforms(subtype, supertype, visited);
	}
	
	// Implicit Specialization Computation
	
	boolean isComputeImplicitGeneralTypes = true;
	
	public void computeImplicitGeneralTypes() {
		if (isComputeImplicitGeneralTypes && !getTarget().isConjugated()) {
			addDefaultGeneralType();
			isComputeImplicitGeneralTypes = false;
 		}
	}
	
	public void addDefaultGeneralType() {
		for (Type baseType: getBaseTypes()) {
			addImplicitGeneralType(getSpecializationEClass(), baseType);
		}
		addDefaultGeneralType(getSpecializationEClass(), getDefaultSupertype());
	}
	
	public void addDefaultGeneralType(String kind) {
		addDefaultGeneralType(getSpecializationEClass(), getDefaultSupertype(kind));
	}
	
	public void addDefaultGeneralType(EClass generalizationEClass, String... superTypeNames) {
		addImplicitGeneralType(generalizationEClass, getLibraryType(superTypeNames));
	}
	
	protected EClass getSpecializationEClass() {
		return SysMLPackage.eINSTANCE.getSpecialization();
	}
	
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	protected String getDefaultSupertype(String kind) {
		return ImplicitGeneralizationMap.getDefaultSupertypeFor(getTarget().getClass(), kind);
	}
	
	public Type getLibraryType(String... defaultNames) {
		return SysMLLibraryUtil.getLibraryType(getTarget(), defaultNames);
	}
	
	// Computed Redefinitions
	
	/**
	 * This method returns those features from the target type that should be automatically overridden in its usages.
	 * By default, there are none.
	 * 
	 * @return	Relevant features from the target type that should be redefined in usages.
	 */
	public List<? extends Feature> getRelevantFeatures() {
		return Collections.emptyList();
	}
	
	// Extension
	
	private boolean isGetBaseTypes = true;
	
	protected List<Type> getBaseTypes() {
		List<Type> baseTypes = new ArrayList<>();
		if (isGetBaseTypes) {
			isGetBaseTypes = false;
			Type target = getTarget();
			for (MetadataFeature metadataFeature : ElementUtil.getAllMetadataFeaturesOf(target)) {
				metadataFeature.getFeature().stream().
						filter(f->TypeUtil.conforms(f, getBaseTypeFeature(metadataFeature))).
						map(FeatureUtil::getValueExpressionFor).
						filter(expr->expr != null).
						map(expr->expr.evaluate(target)).
						filter(results->results != null && !results.isEmpty()).
						map(results->results.get(0)).
						map(EvaluationUtil::getMetaclassReferenceOf).
						filter(Type.class::isInstance).
						map(Type.class::cast).
						forEachOrdered(baseTypes::add);
			}
			isGetBaseTypes = true;
		}
		return baseTypes;
	}
	
	protected Feature getBaseTypeFeature(Element element) {
		return (Feature)SysMLLibraryUtil.getLibraryType(element, 
				ImplicitGeneralizationMap.getDefaultSupertypeFor(element.getClass(), "baseType"));
	}
	
	// Transformation
	
	public BindingConnector addBindingConnector(Feature source, Feature target) {
		Type type = getTarget();
		BindingConnector connector = ConnectorUtil.createBindingConnector(source, target);
		ConnectorUtil.transformBindingConnector(connector, getTarget());
		Type contextType = ConnectorUtil.getContextTypeFor(connector);
		if (contextType == type) {
			addImplicitFeatureBindingConnector(connector);
		} else {
			addImplicitMemberBindingConnector(connector);
			if (contextType != null) {
				FeatureUtil.addFeaturingTypesTo(connector, Collections.singleton(contextType));
			}
		}
		return connector;
	}

	public BindingConnector addResultBinding(Expression sourceExpression, Feature target) {
		ElementUtil.transform(sourceExpression);
		return addBindingConnector(sourceExpression.getResult(), target);
	}
	
	public void createResultConnector(Feature result) {
		Expression resultExpression = 
				(Expression)TypeUtil.getOwnedFeatureByMembershipIn(getTarget(), ResultExpressionMembership.class);
		if (resultExpression != null) {
			addResultBinding(resultExpression, result);
		}
	}

	@Override
	public void doTransform() {
		super.doTransform();
		computeImplicitGeneralTypes();
		removeUnnecessaryImplicitGeneralTypes();
	}
	
}
