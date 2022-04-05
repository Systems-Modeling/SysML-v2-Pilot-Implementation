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

package org.omg.sysml.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;

public class TypeAdapter extends NamespaceAdapter {

	private EList<Membership> inheritedMembership = null;
	
	public TypeAdapter(Type element) {
		super(element);
	}
	
	public Type getTarget() {
		return (Type)super.getTarget();
	}
	
	// Caching
	
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
	}
	
	// Implicit Elements
	
	protected boolean isAddImplicitGeneralTypes = true;
	
	public void setIsAddImplicitGeneralTypes(boolean isAddImplicitGeneralTypes) {
		this.isAddImplicitGeneralTypes = isAddImplicitGeneralTypes;
	}
	
	/**
	 * Contains the required ends for implicit generalizations like implicit
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
		computeImplicitGeneralTypes();
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
	
	protected static boolean hasNoConformingGeneralizations(Type type, Class<?> kind, Type defaultGeneral) {
		return type.getOwnedRelationship().stream().
				filter(kind::isInstance).
				map(Specialization.class::cast).
				noneMatch(spec->spec.getSpecific() == type && TypeUtil.conforms(defaultGeneral, spec.getGeneral()));
	}

	public void addImplicitGeneralType(EClass eClass, Type general) {
		if (isAddImplicitGeneralTypes && general != null && general != getTarget() && !isImplicitGeneralizationFor(eClass, general)) {
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
	
	public void removeUnnecessaryImplicitGeneralTypes() {
		Type target = getTarget();
		List<Type> explicitGenerals = target.getOwnedSpecialization().stream().
				filter(spec->spec.getSpecific() == target).
				map(Specialization::getGeneral).
				collect(Collectors.toList());
		for (Object eClass: implicitGeneralTypes.keySet().toArray()) {
			if (eClass != SysMLPackage.eINSTANCE.getRedefinition()) {
				List<Type> implicitGenerals = implicitGeneralTypes.get(eClass);
				for (Object general: implicitGenerals.toArray()) {
					Stream<Type> generals = Stream.concat(
							implicitGenerals.stream().filter(type->type != general), 
							explicitGenerals.stream());
					if (generals.anyMatch(type->TypeUtil.conforms(type, (Type)general))) {
						implicitGenerals.remove(general);
						if (implicitGenerals.isEmpty()) {
							implicitGeneralTypes.remove(eClass);
						}
					}
				}
			}
		}
		
		// Disallow adding more implicit general types once unnecessary ones have been removed.
		isAddImplicitGeneralTypes = false;
	}
	
	// Implicit Generalization Computation
	
	boolean isComputeImplicitGeneralTypes = true;
	
	public void computeImplicitGeneralTypes() {
		if (isComputeImplicitGeneralTypes && !getTarget().isConjugated()) {
			addDefaultGeneralType();
			isComputeImplicitGeneralTypes = false;
 		}
	}
	
	public void addDefaultGeneralType() {
		for (Type baseType: getBaseTypes()) {
			addImplicitGeneralType(getGeneralizationEClass(), baseType);
		}
		addDefaultGeneralType(getGeneralizationEClass(), getDefaultSupertype());
	}
	
	public void addDefaultGeneralType(String kind) {
		addDefaultGeneralType(getGeneralizationEClass(), getDefaultSupertype(kind));
	}
	
	public void addDefaultGeneralType(EClass generalizationEClass, String... superTypeNames) {
		addImplicitGeneralType(generalizationEClass, getLibraryType(superTypeNames));
	}
	
	protected EClass getGeneralizationEClass() {
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
						map(expr->expr.evaluate(target)).
						filter(results->results != null && !results.isEmpty()).
						map(results->results.get(0)).
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
	
	public void addResultParameter() {
		Type type = getTarget();
		if (type.getOwnedFeatureMembership().stream().noneMatch(ReturnParameterMembership.class::isInstance)) {
			ReturnParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			Feature resultParameter = SysMLFactory.eINSTANCE.createReferenceUsage();
			membership.setOwnedMemberParameter(resultParameter);
			type.getOwnedRelationship().add(membership);
			ElementUtil.transform(resultParameter);
		}
	}
	
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
