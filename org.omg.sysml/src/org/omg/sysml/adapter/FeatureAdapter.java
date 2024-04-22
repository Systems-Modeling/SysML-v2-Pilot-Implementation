/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2024 Model Driven Solutions, Inc.
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
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.RedefinitionImpl;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class FeatureAdapter extends TypeAdapter {
	
	EList<Type> types = null;
	
	public FeatureAdapter(Feature element) {
		super(element);
	}
	
	@Override
	public Feature getTarget() {
		return (Feature)super.getTarget();
	}
	
	// Inheritance
	
	@Override
	protected void addInheritedMemberships(EList<Membership> inheritedMemberships, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		super.addInheritedMemberships(inheritedMemberships, excludedNamespaces, excludedTypes, includeProtected);
		EList<FeatureChaining> featureChainings = getTarget().getOwnedFeatureChaining();
		if (!featureChainings.isEmpty()) {
			Feature chainingFeature = featureChainings.get(featureChainings.size()-1).getChainingFeature();
			if (chainingFeature != null && !excludedTypes.contains(chainingFeature)) {
				inheritedMemberships.addAll(TypeUtil.getNonPrivateMembershipFor(chainingFeature, excludedNamespaces, excludedTypes, includeProtected));
			}
		}
	}

	// Caching
	
	public EList<Type> getTypes() {
		return types;
	}
	
	public EList<Type> setTypes(EList<Type> types) {
		this.types = types;
		return types;
	}
		
	@Override
	public void clearCaches() {
		super.clearCaches();
		types = null;
	}
	
	// Implicit Elements
	
	protected Set<Type> implicitFeaturingTypes = new LinkedHashSet<>();
	
	public void addImplicitFeaturingTypes() {
		Namespace owner = getTarget().getOwningNamespace();
		if (owner instanceof Feature) {
			EList<Type> ownerFeaturingTypes = ((Feature)owner).getFeaturingType();
			if (implicitFeaturingTypes.isEmpty()) {
				addFeaturingTypes(ownerFeaturingTypes);
			}
		}
	}
	
	public void addFeaturingType(Type type) {
		implicitFeaturingTypes.add(type);
	}
	
	public void addFeaturingTypes(Collection<Type> featuringTypes) {
		implicitFeaturingTypes.addAll(featuringTypes);
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
	
	// Implicit Generalization

	@Override
	protected EClass getSpecializationEClass() {
		return SysMLPackage.eINSTANCE.getSubsetting();
	}
	
	@Override
	protected List<Type> getBaseTypes() {
		return super.getBaseTypes().stream().
				filter(Feature.class::isInstance).
				collect(Collectors.toList());
	}
	
	protected boolean isBehaviorOwned() {
		return FeatureUtil.isPerformanceFeature(getTarget());
	}
	
	protected boolean isBehaviorOwnedComposite() {
		return isBehaviorOwned() && getTarget().isComposite();
	}
	
	protected boolean isStructureOwnedComposite() {
		Feature target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && 
				(owningType instanceof Structure || 
				 owningType instanceof Feature && hasStructureType((Feature)owningType));
	}
	
	protected boolean isAssociationEnd() {
		Feature target = getTarget();
		Type endOwningType = target.getEndOwningType();
		return endOwningType instanceof Association || endOwningType instanceof Connector; 
	}
	
	protected Feature getBoundValueResult() {
		Feature target = getTarget();
		FeatureValue valuation = FeatureUtil.getValuationFor(target);
		if (valuation != null && !valuation.isDefault()) {
			Expression value = valuation.getValue();
			if (value != null) {
				ElementUtil.transform(value);
				Feature result = value.getResult();
				return result;
			}
		}
		return null;
	}
	
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		
		Feature target = getTarget();
		Feature result = getBoundValueResult();
		if (result != null && target.getOwnedSpecialization().isEmpty() && target.getDirection() == null) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), result);
		}
		
		if (isAssociationEnd() && 
				!isImplicitSpecializationDeclaredFor(SysMLPackage.eINSTANCE.getRedefinition())) {
			addDefaultGeneralType("participant");
		}
	}
	
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype(
			hasStructureType()? isSubobject()? "subobject": "object":
			hasClassType()? 
					isSuboccurrence()? "suboccurrence": 
					isPortion()? "portion":
					"occurrence":
			hasDataType()? "dataValue":
			"base");
	}
	
	protected boolean isSuboccurrence() {
		Feature target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && 
				(owningType instanceof org.omg.sysml.lang.sysml.Class ||
				 owningType instanceof Feature && (hasClassType((Feature)owningType)));
	}
	
	protected boolean isPortion() {
		Feature target = getTarget();
		Type owningType = target.getOwningType();
		return target.isPortion() && 
				(owningType instanceof org.omg.sysml.lang.sysml.Class ||
				 owningType instanceof Feature && (hasClassType((Feature)owningType)));
	}
	
	public boolean hasClassType() {
		return hasClassType(getTarget());
	}
	
	public boolean hasClassType(Feature feature) {
		return feature.getOwnedTyping().stream().
				map(FeatureTyping::getType).anyMatch(org.omg.sysml.lang.sysml.Class.class::isInstance) ||
				getImplicitGeneralTypes(SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(org.omg.sysml.lang.sysml.Class.class::isInstance);
	}
	
	protected boolean isSubobject() {
		Feature target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && 
				(owningType instanceof org.omg.sysml.lang.sysml.Structure ||
				 owningType instanceof Feature && (hasStructureType((Feature)owningType)));
	}
	
	public boolean hasStructureType() {
		return hasStructureType(getTarget());
	}
	
	public static boolean hasStructureType(Feature feature) {
		return feature.getOwnedTyping().stream().
				map(FeatureTyping::getType).anyMatch(Structure.class::isInstance) ||
				TypeUtil.getImplicitGeneralTypesFor(feature, SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(Structure.class::isInstance);
	}
	
	public boolean hasDataType() {
		return getTarget().getOwnedTyping().stream().
				map(FeatureTyping::getType).anyMatch(DataType.class::isInstance) ||
				getImplicitGeneralTypes(SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(DataType.class::isInstance);
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		addComputedRedefinitions(null);
		super.computeImplicitGeneralTypes();
	}
	
	public Stream<Feature> getSubsettedNotRedefinedFeatures() {
		computeImplicitGeneralTypes();
		Feature target = getTarget();
		Stream<Feature> implicitSubsettedFeatures = getImplicitGeneralTypesOnly(SysMLPackage.Literals.SUBSETTING).stream().
				map(Feature.class::cast);
		Stream<Feature> implicitReferencedFeatures = getImplicitGeneralTypesOnly(SysMLPackage.Literals.REFERENCE_SUBSETTING).stream().
				map(Feature.class::cast);
		Stream<Feature> ownedSubsettedFeatures = target.getOwnedSubsetting().stream().
				filter(s->!(s instanceof Redefinition)).
				map(Subsetting::getSubsettedFeature).
				filter(f->f != null);
		return Stream.concat(ownedSubsettedFeatures, Stream.concat(implicitReferencedFeatures,implicitSubsettedFeatures));
	}
	
	public List<Feature> getSubsettedFeatures() {
		Feature target = getTarget();
		// Note: Build on getSubsettedNotRedefinedFeatures here because it is overridden in some subclasses.
		Stream<Feature> subsettedFeatures = getSubsettedNotRedefinedFeatures();
		Stream<Feature> ownedRedefinedFeatures = target.getOwnedRedefinition().stream().
				map(Redefinition::getRedefinedFeature).
				filter(f->f != null);
		Stream<Feature> implicitRedefinedFeatures = getImplicitGeneralTypesOnly(SysMLPackage.Literals.REDEFINITION).stream().
				map(Feature.class::cast);		
		return Stream.concat(Stream.concat(subsettedFeatures, ownedRedefinedFeatures), implicitRedefinedFeatures).
				collect(Collectors.toList());
	}
	
	public Feature getReferencedFeature() {
		Feature target = getTarget();
		ReferenceSubsetting ownedReferenceSubsetting = target.getOwnedReferenceSubsetting();
		return ownedReferenceSubsetting != null? ownedReferenceSubsetting.getReferencedFeature():
			 getImplicitGeneralTypesOnly(SysMLPackage.Literals.REFERENCE_SUBSETTING).stream().
				map(Feature.class::cast).findFirst().orElse(null);
	}
	
	public List<Feature> getRedefinedFeatures() {
		Feature target = getTarget();
		computeImplicitGeneralTypes();
		Stream<Feature> implicitRedefinedFeatures = getImplicitGeneralTypesOnly(SysMLPackage.Literals.REDEFINITION).stream().
				map(Feature.class::cast);
		Stream<Feature> ownedRedefinedFeatures = target.getOwnedRedefinition().stream().
				map(Redefinition::getRedefinedFeature).
				filter(f->f != null);
		return Stream.concat(ownedRedefinedFeatures, implicitRedefinedFeatures).
				collect(Collectors.toList());
	}
	
	/**
	 * Return a set including this Feature and all Features that it redefines directly or indirectly.
	 */
	public Set<Feature> getAllRedefinedFeatures() {
		Set<Feature> redefinedFeatures = new HashSet<>();
		
		// Ensure that the redefinitions for this feature are recomputed. 
		forceComputeRedefinitions();
		
		addAllRedefinedFeaturesTo(redefinedFeatures);
		return redefinedFeatures;
	}
	
	public void addAllRedefinedFeaturesTo(Set<Feature> redefinedFeatures) {
		redefinedFeatures.add(getTarget());
		getRedefinedFeaturesWithComputed(null).stream().forEach(redefinedFeature->{
			if (redefinedFeature != null && !redefinedFeatures.contains(redefinedFeature)) {
				FeatureUtil.addAllRedefinedFeaturesTo(redefinedFeature, redefinedFeatures);
			}
		});
	}
	
	// Computed Redefinition
	
	public List<Feature> getRedefinedFeaturesWithComputed(Element skip) {
		Feature target = getTarget();
		
		addComputedRedefinitions(skip);
		EList<Redefinition> redefinitions = target.getOwnedRedefinition();
		
		List<Feature> redefinedFeatures = new ArrayList<>();
		redefinitions.stream().
			map(r->r == skip? ((RedefinitionImpl)r).basicGetRedefinedFeature(): r.getRedefinedFeature()).
			filter(f->f != null).
			forEachOrdered(redefinedFeatures::add);
		
		getImplicitGeneralTypesOnly(SysMLPackage.eINSTANCE.getRedefinition()).stream().
			map(Feature.class::cast).
			forEachOrdered(redefinedFeatures::add);
		
		return redefinedFeatures; 
	}
	
	protected boolean isComputeRedefinitions = true;
	
	public void forceComputeRedefinitions() {
		isComputeRedefinitions = isAddImplicitGeneralTypes;
	}
	
	public boolean isComputeRedefinitions() {
		Feature target = getTarget();
		return isAddImplicitGeneralTypes && isComputeRedefinitions &&
				(!FeatureUtil.isParameter(target) ||
				 target.getOwnedRedefinition().isEmpty());
	}
	
	/**
	 * Compute relevant implicit Redefinitions, as appropriate.
	 */
	public void addComputedRedefinitions(Element skip) {
		if (isComputeRedefinitions()) {
			removeImplicitGeneralType(SysMLPackage.eINSTANCE.getRedefinition());
			// NOTE: Set flag before adding redefinitions, to avoid possible infinite
			// recursion if computeImplicitGeneralTypes is called again on this Feature.
			isComputeRedefinitions = false;
			addRedefinitions(skip);
		}
	}
	
	/**
	 * Compute relevant Redefinitions and add them to this Feature. By default, if this Feature is relevant for its
	 * owning Type, then it is paired with relevant Features in the same position in Generalizations of the 
	 * owning Type. The determination of what are relevant Categories and Features can be adjusted by
	 * overriding getGeneralCategories and getRelevantFeatures.
	 */
	protected void addRedefinitions(Element skip) {
		Feature target = getTarget();
		Type type = target.getOwningType();
		if (type != null) {
			int i = getRelevantFeatures(type, skip).indexOf(target);
			if (i >= 0) {
				for (Type general: getGeneralTypes(type, skip)) {
					List<? extends Feature> features = getRelevantFeatures(general, skip);
					if (i < features.size()) {
						Feature redefinedFeature = features.get(i);
						if (redefinedFeature != null && redefinedFeature != target) {
							addImplicitGeneralType(SysMLPackage.eINSTANCE.getRedefinition(), redefinedFeature);
						}
					}
				}
			}
		}
	}
	
	/**
	 * Get the (ordered) set of Types, more general than the given type, that may have 
	 * features redefined by this feature. By default this is all general Types of the
	 * given Type.
	 */
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		List<Type> generalTypes = new ArrayList<>();
		for (Type generalType: TypeUtil.getGeneralTypesOf(type, skip)) {
			if (!generalTypes.contains(generalType)) {
				generalTypes.add(generalType);
			}
		}
		return generalTypes;
	}
	
	/**
	 * Get the relevant Features that may be redefined from the given Type.
	 * If this is an end Feature, return the end Features of the Type,
	 * otherwise return the relevant features of the type.
	 */
	protected List<? extends Feature> getRelevantFeatures(Type type, Element skip) {
		Feature target = getTarget();
		return type == null? Collections.emptyList():
			   target.isEnd()? TypeUtil.getAllEndFeaturesOf(type):
			   FeatureUtil.isParameter(target)? getParameterRelevantFeatures(type, skip):
			   TypeUtil.getRelevantFeaturesOf(type);
	}
	
	/**
	 * Parameters redefine (owned) Parameters of general Types, with a result
	 * Parameter always redefining the result Parameter of a general Function or
	 * Expression.
	 */
	public List<? extends Feature> getParameterRelevantFeatures(Type type, Element skip) {
		if (type != null) {
			if (FeatureUtil.isResultParameter(getTarget())) {
				Feature resultParameter = TypeUtil.getResultParameterOf(type);
				if (resultParameter != null) {
					return Collections.singletonList(resultParameter);
				}
			} else {
				return getRelevantParameters(type, skip);
			}
		}
		return Collections.emptyList();
	}
	
	protected List<Feature> getRelevantParameters(Type type, Element skip) {
		Type owningType = getTarget().getOwningType();
		return type == owningType? filterIgnoredParameters(TypeUtil.getOwnedParametersOf(type)): 
			   owningType instanceof InvocationExpression && 
			        type == ExpressionUtil.getExpressionTypeOf((InvocationExpression)owningType) &&
			   		!(type instanceof Function || type instanceof Expression)? 
			   				ExpressionUtil.getTypeFeaturesOf((InvocationExpression)owningType):
			   filterIgnoredParameters(TypeUtil.getAllParametersOf(type, skip));
	}
	
	protected List<Feature> filterIgnoredParameters(List<Feature> parameters) {
		return parameters.stream().
				filter(p -> !FeatureUtil.isIgnoredParameter(p)).
				collect(Collectors.toList());
	}
	
	public boolean isIgnoredParameter() {
		return FeatureUtil.isResultParameter(getTarget());
	}
	
	// Transformation
	
	protected void addFeaturingTypeIfNecessary(Type featuringType) {
		Feature feature = getTarget();
		if (featuringType != null && feature.getOwningType() == null && 
			feature.getOwnedTypeFeaturing().isEmpty()) {
			addFeaturingType(featuringType);
		}
	}
	
	protected void addImplicitFeaturingTypesIfNecessary() {
		Feature feature = getTarget();
		Namespace owner = feature.getOwningNamespace();
		if (owner instanceof Feature) {
			EList<Type> ownerFeaturingTypes = ((Feature)owner).getFeaturingType();
			if (isImplicitFeaturingTypesEmpty()) {
				addFeaturingTypes(ownerFeaturingTypes);
			}
		}
	}
	
	protected BindingConnector addBindingConnector(Collection<Type> featuringTypes, Feature source, Feature target) {
		BindingConnector connector = ConnectorUtil.createBindingConnector(source, target);
		ConnectorUtil.transformBindingConnector(connector, getTarget());
		addImplicitMemberBindingConnector(connector);
		FeatureUtil.addFeaturingTypesTo(connector, featuringTypes);
		return connector;
	}
	
	protected void addFeatureWriteTypes(List<Feature> parameters, Feature referent) {
		if (!parameters.isEmpty()) {
			Feature targetFeature = parameters.get(0);
			List<Feature> features = targetFeature.getOwnedFeature();
			if (!features.isEmpty()) {
				Feature startingAtFeature = features.get(0);
				TypeUtil.addDefaultGeneralTypeTo(startingAtFeature, SysMLPackage.eINSTANCE.getRedefinition(), getDefaultSupertype("startingAt"));
				TypeUtil.setIsAddImplicitGeneralTypesFor(startingAtFeature, false);
				features = startingAtFeature.getOwnedFeature();
				if (!features.isEmpty()) {
					Feature accessedFeature = features.get(0);
					TypeUtil.addDefaultGeneralTypeTo(accessedFeature, SysMLPackage.eINSTANCE.getRedefinition(), getDefaultSupertype("accessedFeature"));
					if (referent != null) {
						TypeUtil.addImplicitGeneralTypeTo(accessedFeature, SysMLPackage.eINSTANCE.getRedefinition(), referent);
					}
					TypeUtil.setIsAddImplicitGeneralTypesFor(accessedFeature, false);
				}
			}
		}
	}

	protected void computeValueConnector() {
		Feature target = getTarget();
		Feature result = getBoundValueResult();
		if (result != null) {
			List<Type> featuringTypes;
			if (FeatureUtil.getValuationFor(target).isInitial()) {
				Feature that = (Feature)getLibraryType("Base::things::that");
				Feature startShot = (Feature)getLibraryType("Occurrences::Occurrence::startShot");
				featuringTypes = Collections.singletonList(FeatureUtil.chainFeatures(that, startShot));
			} else {
				featuringTypes = target.getFeaturingType();
			}
			addBindingConnector(featuringTypes, result, target);
		}
	}
	
	@Override
	public void doTransform() {
		computeValueConnector();
		forceComputeRedefinitions();
		super.doTransform();
	}

}
