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
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationServices;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.VirtualContainer;

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
		EList<Membership> inheritedMembership = getInheritedMemberships(excluded, new HashSet<>(), isRecursive);
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
		nonPrivateMemberships.addAll(getInheritedMemberships(excludedNamespaces, excludedTypes, excludeImplied));
		return nonPrivateMemberships;
	}
	
	/**
	 * As defined in the OCL in the specification, excludedTypes only accumulate along the traversal of a single path in the specialization graph, essentially just
	 * to avoid circular references within that path. This means that a Type may be visited multiple times along different paths (e.g., due to "diamond specialization").
	 * However, the non-private memberships computed for the Type should not differ from visit to visit.
	 * 
	 * Therefore, this method computes the non-private membership of a Type only if the Type is not contained in excludedTypes. If computed, the non-private memberships 
	 * are cached, and the cached memberships are used if the Type is visited again during traversal of the specialization graph. This allows the set of excludedTypes to 
	 * "accumulate" as the entire specialization graph is traversed, avoiding recomputation of non-private membership if a Type is revisited and greatly improving
	 * performance.
	 * 
	 * Note that this only affects the handling of excludedTypes for inheritance, with no impact on the handling of excludedNamespaces for imports.
	 */
	public void addNonPrivateMembership(EList<Membership> inheritedMemberships, Set<Namespace> excludedNamespaces, Set<Type> excludedTypes, boolean excludeImplied) {
		if (!excludedTypes.contains(getTarget())) {
			nonPrivateMembership = getNonPrivateMembership(excludedNamespaces, excludedTypes, excludeImplied);
		}
		if (nonPrivateMembership != null) {
			inheritedMemberships.addAll(nonPrivateMembership);
		}
	}
	
	/**
	 * This method uses addNonPrivateMembershipsFor, rather than calling getNonPrivateMemberships directly, in order to take advantage of the caching of
	 * nonPrivateMemberships.
	 */
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
	
	/**
	 * Make a first path through the given memberships list, removing Memberships with memberElements redefined by ownedFeatures of
	 * the target Type and collecting the set of all Features redefined (directly or indirectly) by any of the memberships. Then use
	 * the allFeatureRedefinedByMemberships set to remove any Membership with a memberElement redefined by another Membership.
	 */
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
	
	/**
	 * If excludeImplied is false and inheritedMembership has been previously cached, then return the cached collection, rather than recomputing it. Otherwise, compute 
	 * an inheritedMembership collection, but taking into account the given exclusions. However, do not cache the computed collection. Only the full inheritedMembership 
	 * collection is cached, without exclusions. 
	 */
	public EList<Membership> getInheritedMemberships(Set<Namespace> excludedNamespaces, Set<Type> excludedTypes, boolean excludeImplied) {
		if (!excludeImplied && inheritedMembership != null) {
			return inheritedMembership;
		} else {
			EList<Membership> inheritedMemberships = getInheritableMemberships(excludedNamespaces, excludedTypes, excludeImplied);
			removeRedefinedFeatures(inheritedMemberships);
			return inheritedMemberships;
		}
	}
	
	/**
	 * Compute all inheritedMemberships of the target Type and cache the result.
	 */
	public EList<Membership> getInheritedMembership() {
		inheritedMembership = getInheritedMemberships(new HashSet<>(), new HashSet<>(), false);
		return inheritedMembership;
	}
	
	/**
	 * If redefinedFeatures have been cached, then return them. Otherwise, compute all the Features directly redefined by the owned
	 * Features of the target Type and cache the result.
	 */
	protected Collection<Feature> getFeaturesRedefinedByType() {
		if (redefinedFeatures == null) {
			addAdditionalMembers();
			redefinedFeatures = TypeUtil.getFeaturesRedefinedBy(getTarget(), null);
		}
		return redefinedFeatures;		
	}
	
	public EList<FeatureMembership> getFeatureMembership() {
		if (featureMembership == null) {
			Type target = getTarget();
			EList<FeatureMembership> featureMemberships = new NonNotifyingEObjectEList<FeatureMembership>(FeatureMembership.class, (InternalEObject) target, SysMLPackage.TYPE__FEATURE_MEMBERSHIP);
			featureMemberships.addAll(target.getOwnedFeatureMembership());
			// For improved performance, compute supertypes only once.
			List<Type> allSupertypes = target.allSupertypes();
			for (Membership membership: target.getInheritedMembership()) {
				if (membership instanceof FeatureMembership && 
						allSupertypes.contains(membership.getMembershipOwningNamespace())) {
					featureMemberships.add((FeatureMembership)membership);
				}
			}
			featureMembership = featureMemberships;
		}
		return featureMembership;
	}

	// Caching
	
	private EList<Membership> inheritedMembership = null;
	private EList<Membership> nonPrivateMembership = null;
	private Collection<Feature> redefinedFeatures = null;
	private EList<FeatureMembership> featureMembership = null;
	
	public void clearCaches() {
		super.clearCaches();
		inheritedMembership = null;
		nonPrivateMembership = null;
		redefinedFeatures = null;
		featureMembership = null;
	}
	
	// Implicit Elements
	
	/** Binding connectors collected during transformation, separate from specialization caches. */
	protected List<BindingConnector> implicitMemberBindingConnectors = new ArrayList<>();
	protected List<BindingConnector> implicitFeatureBindingConnectors = new ArrayList<>();
	
	/** Clears only specialization state; retained for existing adapter clients. */
	public void cleanImplicitGeneralTypes() {
		TypeUtil.invalidateImplicitSpecializations(getTarget());
	}

	public void cleanImplicitBindingConnectors() {
		implicitMemberBindingConnectors.clear();
		implicitFeatureBindingConnectors.clear();
	}

	public void forEachImplicitBindingConnector(Consumer<BindingConnector> consumer) {
		Stream.concat(implicitMemberBindingConnectors.stream(), implicitFeatureBindingConnectors.stream())
				.forEach(consumer);
	}
	
	/**
	 * Executes the given consumer function with all implicit binding connectors and
	 * their corresponding membership type (OwningMembership or FeatureMembership)
	 */
	public void forEachImplicitBindingConnector(BiConsumer<BindingConnector, EClass> consumer) {
		for (BindingConnector connector : implicitFeatureBindingConnectors) {
			consumer.accept(connector, SysMLPackage.Literals.FEATURE_MEMBERSHIP);
		}
		for (BindingConnector connector : implicitMemberBindingConnectors) {
			consumer.accept(connector, SysMLPackage.Literals.OWNING_MEMBERSHIP);
		}
	}
	
	public void addImplicitFeatureBindingConnector(BindingConnector connector) {
		implicitFeatureBindingConnectors.add(connector);
	}
	
	public void addImplicitMemberBindingConnector(BindingConnector connector) {
		implicitMemberBindingConnectors.add(connector);
	}
	
	public Type getLibraryType(String... defaultNames) {
		return SysMLLibraryUtil.getLibraryType(getTarget(), defaultNames);
	}
	
	// Transformation
	
	/**
	 * Creates and transforms a binding connector implied by a constraint on the target Type. The
	 * implied relationship is the owning membership of the connector in the target, so the target
	 * is its virtual container. It is recorded before the transformation, which looks up the
	 * library general of the connector, and before any query on the connector.
	 */
	protected BindingConnector createImplicitBindingConnector(Feature source, Feature target) {
		BindingConnector connector = VirtualContainer.attach(ConnectorUtil.createBindingConnector(source, target), getTarget());
		ConnectorUtil.transformBindingConnector(connector);
		return connector;
	}

	public BindingConnector addBindingConnector(Feature source, Feature target) {
		Type type = getTarget();
		BindingConnector connector = createImplicitBindingConnector(source, target);
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
		Feature sourceResult = sourceExpression.getResult();
		return sourceResult == null || target == null? null: addBindingConnector(sourceResult, target);
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
		ImplicitSpecializationServices.get(getTarget()).getImplicitSpecializations(getTarget());
	}

}
