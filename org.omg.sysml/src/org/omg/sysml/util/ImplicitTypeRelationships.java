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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.TypeImpl;

/**
 * This adapter implementation can be used to store the implicit relationships
 * for each type, including generalizations and binding connectors and provides
 * some utility methods to ease its access.
 */
public class ImplicitTypeRelationships extends AdapterImpl {

	/**
	 * Contains the required ends for implicit generalizations like implicit
	 * superclassing, subsetting, featuretyping and redefinitions for future access.
	 * The lists must not contain null values and the current type.
	 */
	protected Map<EClass, List<Type>> implicitGeneralTypes = new HashMap<>();
	protected List<BindingConnector> implicitMemberBindingConnectors = new ArrayList<>();
	protected List<BindingConnector> implicitFeatureBindingConnectors = new ArrayList<>();
	
	public static ImplicitTypeRelationships getOrCreateAdapter(Type target) {
		return getExistingTypeAdapter(target).orElseGet(() -> {
				ImplicitTypeRelationships adapter = new ImplicitTypeRelationships();
				target.eAdapters().add(adapter);
				return adapter;
			});
	}

	protected static Optional<ImplicitTypeRelationships> getExistingTypeAdapter(Type target) {
		return target.eAdapters()
			.stream()
			.filter(ImplicitTypeRelationships.class::isInstance)
			.map(ImplicitTypeRelationships.class::cast)
			.findFirst();
	}
	
	public static void removeAdapter(Type target) {
		getExistingTypeAdapter(target).ifPresent(target.eAdapters()::remove);
	}
	
	protected ImplicitTypeRelationships() {
		// Hidden constructor
	}
	
	protected ImplicitTypeRelationships(ImplicitTypeRelationships other) {
		this.implicitGeneralTypes = other.implicitGeneralTypes;
		this.implicitMemberBindingConnectors = other.implicitMemberBindingConnectors;
		this.implicitFeatureBindingConnectors = other.implicitFeatureBindingConnectors;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type instanceof Type;
	}

	@Override
	public Type getTarget() {
		return (Type)super.getTarget();
	}
	
	public void cleanImplicitGeneralTypes() {
		implicitGeneralTypes.clear();
	}
	
	public void cleanImplicitBindingConnectors() {
		implicitMemberBindingConnectors.clear();
		implicitFeatureBindingConnectors.clear();
	}

	public void addImplicitGeneralizations() {
		Type type = getTarget();
		for (EClass eClass : implicitGeneralTypes.keySet()) {
			for (Type general : implicitGeneralTypes.get(eClass)) {
				Generalization newGeneralization = (Generalization)SysMLFactory.eINSTANCE.create(eClass);
				newGeneralization.setGeneral(general);
				newGeneralization.setSpecific(type);
				type.getOwnedRelationship_comp().add(newGeneralization);
			}
		}
		cleanImplicitGeneralTypes();
	}
	
	public List<Membership> addImplicitBindingConnectors() {
		TypeImpl type = (TypeImpl) getTarget();
		List<Membership> createdMemberships = new ArrayList<>();
		for (BindingConnector connector : implicitFeatureBindingConnectors) {
			createdMemberships.add(TransformationUtil.addOwnedFeatureTo(type, connector));
		}
		for (BindingConnector connector : implicitMemberBindingConnectors) {
			createdMemberships.add(TransformationUtil.addOwnedMemberTo(type, connector));
		}
		cleanImplicitBindingConnectors();
		return createdMemberships;
	}
	
	public boolean isImplicitGeneralTypesEmpty() {
		return implicitGeneralTypes.isEmpty();
	}
	
	public Collection<EClass> getImplicitGeneralTypeKinds() {
		return implicitGeneralTypes.keySet();
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
		return implicitGeneralTypes.values().stream().
				flatMap(Collection::stream).
				collect(Collectors.toList());
	}
	
	public List<Type> getImplicitGeneralTypes(EClass eClass) {
		return implicitGeneralTypes.keySet().stream().
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
	
	public boolean isImplicitGeneralizationDeclaredFor(EClass eClass) {
		return implicitGeneralTypes.containsKey(eClass);
	}
	
	public boolean isImplicitGeneralizationFor(EClass eClass, Type general) {
		return implicitGeneralTypes.getOrDefault(eClass, Collections.emptyList()).contains(general);
	}
	
	@SuppressWarnings("unchecked")
	public void addDefaultGeneralType(EClass generalizationEClass, String... superTypeNames) {
		Class<? extends Generalization> kind = (Class<? extends Generalization>)generalizationEClass.getInstanceClass();
		TypeImpl type = (TypeImpl)getTarget();
		type.removeEmptyGeneralTypes(kind);
		if (getImplicitGeneralTypes(generalizationEClass).isEmpty() &&
				type.basicGetOwnedGeneralization(kind).isEmpty()) {
			Type general = type.getDefaultType(superTypeNames);
			if (general != null && general != this) {
				List<Type> generalizations = new ArrayList<>();
				generalizations.add(general);
				implicitGeneralTypes.put(generalizationEClass, generalizations);
			}
		}
	}
	
	public void addImplicitGeneralType(EClass eClass, Type general) {
		if (general != null && !isImplicitGeneralizationFor(eClass, general)) {
			implicitGeneralTypes.computeIfAbsent(eClass, e -> new ArrayList<>()).add(general);
		}
	}
	
	public void removeImplicitGeneralType(EClass eClass) {
		implicitGeneralTypes.remove(eClass);
	}
	
	public void forEachImplicitGeneralType(BiConsumer<EClass, Type> action) {
		for (EClass eClass : implicitGeneralTypes.keySet()) {
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
	
}
