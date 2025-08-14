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
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.CrossSubsetting;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.impl.RedefinitionImpl;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class FeatureAdapter extends TypeAdapter {
	
	public FeatureAdapter(Feature element) {
		super(element);
	}
	
	@Override
	public Feature getTarget() {
		return (Feature)super.getTarget();
	}
	
	// Post-processing
	
	@Override
	public void postProcess() {
		super.postProcess();
		setIsVariableIfConstant();
	}
	
	// Note: Can be individually overridden.
	protected void setIsVariableIfConstant() {
		Feature target = getTarget();
		if (target.isConstant()) {
			target.setIsVariable(true);
		}		
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
	
	public EList<Type> getTypes() {
		return types;
	}
	
	public EList<Type> setTypes(EList<Type> types) {
		this.types = types;
		return types;
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
				Feature valueResult = value.getResult();
				if (valueResult != null) {
					Feature result = FeatureUtil.chainFeatures(value, value.getResult());
					return result;
				}
			}
		}
		return null;
	}
	
	/**
	 * @satisfies checkFeatureValuationSpecialization
	 * @satisfies checkFeatureCrossingSpecialization
	 * @satisfies checkFeatureOwnedCrossFeatureSpecialization
	 * @satisfies checkFeatureOwnedCrossFeatureRedefinitionSpecialization
	 * 
	 */
	@Override
	public void addDefaultGeneralType() {
		// Note: This must happen before call to super, because default supertype depends on ownedTyping.
		addOwnedCrossFeatureSpecialization();

		super.addDefaultGeneralType();
		
		addBoundValueSubsetting();
		addParticipantSubsetting();
		addCrossingSpecialization();
	}
	

	/**
	 * @satisfies checkFeatureValuationSpecialization
	 */
	protected void addBoundValueSubsetting() {
		Feature target = getTarget();
		Feature result = getBoundValueResult();

		if (result != null && target.getOwnedSpecialization().isEmpty() && target.getDirection() == null) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), result);
		}
	}
	
	/**
	 * @satisfies checkFeatureEndSpecialization
	 */
	protected void addParticipantSubsetting() {
		if (isAssociationEnd() && 
				!isImplicitSpecializationDeclaredFor(SysMLPackage.eINSTANCE.getRedefinition())) {
			addDefaultGeneralType("participant");
		}
	}
	
	/**
	 * @satisfies checkFeatureCrossingSpecialization
	 */
	public void addCrossingSpecialization() {
		Feature target = getTarget();
		Feature ownedCrossFeature = FeatureUtil.getOwnedCrossFeatureOf(target);
		if (ownedCrossFeature != null && target.getOwnedCrossSubsetting() == null && 
				getImplicitGeneralTypesOnly(SysMLPackage.Literals.CROSS_SUBSETTING).isEmpty()) {
			Type owningType = target.getOwningType();
			if (owningType != null) {
				List<Feature> endFeatures = owningType.getOwnedEndFeature();
				if (endFeatures.size() == 2) {
					Feature otherEnd = endFeatures.indexOf(target) == 0?
							endFeatures.get(1): endFeatures.get(0);
					addImplicitGeneralType(SysMLPackage.eINSTANCE.getCrossSubsetting(), 
							FeatureUtil.chainFeatures(otherEnd, ownedCrossFeature));
				} else {
					Feature firstFeature = SysMLFactory.eINSTANCE.createFeature();
					FeatureUtil.addFeaturingTypesTo(firstFeature, Collections.singleton(owningType));
					
					// Adding implicit general type here avoids circularity when adding cross-feature feature typing.
					Feature featureChain = FeatureUtil.chainFeatures(firstFeature, ownedCrossFeature);
					featureChain.getOwnedFeatureChaining().get(0).getOwnedRelatedElement().add(firstFeature);
					addImplicitGeneralType(SysMLPackage.eINSTANCE.getCrossSubsetting(), featureChain);
					
					FeatureUtil.addOwnedCrossFeatureTypeFeaturingTo(ownedCrossFeature);
					for (Type type: ownedCrossFeature.getFeaturingType()) {
						FeatureTyping featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
						featureTyping.setType(type);
						firstFeature.getOwnedRelationship().add(featureTyping);						
					}
				}
			}
		}
	}
	
	/**
	 * @satisfies checkFeatureOwnedCrossFeatureSpecialization
	 * @satisfies checkFeatureOwnedCrossFeatureRedefinitionSpecialization
	 */
	protected void addOwnedCrossFeatureSpecialization() {
		Feature target = getTarget();
		Namespace owner = target.getOwningNamespace();
		if (FeatureUtil.isOwnedCrossFeature(target)) {
			for (Type type: ((Feature)owner).getType()) {
				addImplicitGeneralType(SysMLPackage.eINSTANCE.getFeatureTyping(), type);
			}
			
			for (Feature redefinedFeature: FeatureUtil.getRedefinedFeaturesWithComputedOf((Feature)owner, null)) {
				if (redefinedFeature.isEnd()) {
					Feature crossFeature = getCrossFeatureOf(redefinedFeature);
					if (crossFeature != null) {
						addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), crossFeature);
					}
				}
			}
		}
	}
	
	public static Feature getCrossFeatureOf(Feature feature) {
		Feature crossFeature = feature.getCrossFeature();
		if (crossFeature == null) {
			ElementUtil.transform(feature);
			crossFeature = FeatureUtil.getBasicFeatureOf(
					(Feature)TypeUtil.getImplicitGeneralTypesOnly(feature, SysMLPackage.eINSTANCE.getCrossSubsetting()).stream().
					findFirst().orElse(null));
		}
		return crossFeature;
	}
	
	/**
	 * @satisfies checkFeatureObjectSpecialization
	 * @satisfies checkFeatureSubobjectSpecialization
	 * @satisfies checkFeatureSuboccurrenceSpecialization
	 * @satisfies checkFeaturePortionSpecialization
	 * @satisfies checkFeatureOccurrenceSpecialization
	 * @satisfies checkFeatureDataValueSpecialization
	 * @satisfies checkFeatureSpecialization
	 */
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
		Stream<Feature> implicitCrossedFeatures = getImplicitGeneralTypesOnly(SysMLPackage.Literals.CROSS_SUBSETTING).stream().
				map(Feature.class::cast);
		Stream<Feature> ownedSubsettedFeatures = target.getOwnedSubsetting().stream().
				filter(s->!(s instanceof Redefinition)).
				map(Subsetting::getSubsettedFeature).
				filter(f->f != null);
		return Stream.concat(ownedSubsettedFeatures, Stream.concat(implicitReferencedFeatures, Stream.concat(implicitCrossedFeatures, implicitSubsettedFeatures)));
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
				toList();
	}
	
	public List<Feature> getSubsettedNotCrossedFeatures() {
		computeImplicitGeneralTypes();
		Feature target = getTarget();
		List<Feature> features = new ArrayList<>();
		target.getOwnedSubsetting().stream().
				filter(s->!(s instanceof CrossSubsetting)).
				map(Subsetting::getSubsettedFeature).
				filter(f->f != null).
				forEachOrdered(features::add);
		getImplicitGeneralTypesOnly(SysMLPackage.Literals.SUBSETTING).stream().
			map(Feature.class::cast).forEachOrdered(features::add);
		getImplicitGeneralTypesOnly(SysMLPackage.Literals.REFERENCE_SUBSETTING).stream().
			map(Feature.class::cast).forEachOrdered(features::add);
		getImplicitGeneralTypesOnly(SysMLPackage.Literals.REDEFINITION).stream().
			map(Feature.class::cast).forEachOrdered(features::add);		
		return features;
	}
	
	public Feature getReferencedFeature() {
		Feature target = getTarget();
		ReferenceSubsetting ownedReferenceSubsetting = target.getOwnedReferenceSubsetting();
		if (ownedReferenceSubsetting != null) {
			return ownedReferenceSubsetting.getReferencedFeature();
		} else {
			computeImplicitGeneralTypes();
			return getImplicitGeneralTypesOnly(SysMLPackage.Literals.REFERENCE_SUBSETTING).stream().
					map(Feature.class::cast).findFirst().orElse(null);
		}
	}
	
	public Feature getCrossedFeature() {
		Feature target = getTarget();
		CrossSubsetting ownedCrossSubsetting = target.getOwnedCrossSubsetting();
		if (ownedCrossSubsetting != null) {
			return ownedCrossSubsetting.getCrossedFeature();
		} else {
			computeImplicitGeneralTypes();
			return getImplicitGeneralTypesOnly(SysMLPackage.Literals.CROSS_SUBSETTING).stream().
					map(Feature.class::cast).findFirst().orElse(null);
		}
	}
	
	public List<Feature> getRedefinedFeatures() {
		Feature target = getTarget();
		computeImplicitGeneralTypes();
		Stream<Feature> implicitRedefinedFeatures = getImplicitGeneralTypesOnly(SysMLPackage.Literals.REDEFINITION).stream().
				map(Feature.class::cast);
		Stream<Feature> ownedRedefinedFeatures = target.getOwnedRedefinition().stream().
				map(Redefinition::getRedefinedFeature).
				filter(f->f != null);
		return Stream.concat(ownedRedefinedFeatures, implicitRedefinedFeatures).toList();
	}
	
	/**
	 * Return a set including this Feature and all Features that it redefines directly or indirectly.
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
		Type owningType = target.getOwningType();
		return isAddImplicitGeneralTypes && isComputeRedefinitions &&
				(!(owningType instanceof InvocationExpression || ExpressionUtil.isConstructorResult(owningType)) ||
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
			int i = getRelevantFeatures(type).indexOf(target);
			if (i >= 0) {
				for (Type general: getGeneralTypes(type, skip)) {
					List<? extends Feature> features = getRelevantFeatures(general);
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
		for (Type generalType: TypeUtil.getGeneralTypesOf(type, false, skip)) {
			if (!generalTypes.contains(generalType)) {
				generalTypes.add(generalType);
			}
		}
		return generalTypes;
	}
	
	/**
	 * Get the relevant Features that may be redefined from the given Type.
	 * This includes end features, owned features of constructor results, and
	 * generally parameters.
	 */
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		Feature target = getTarget();
		return type == null? Collections.emptyList():
			   target.isEnd()? getEndRelevantFeatures(type):
			   ExpressionUtil.isConstructorResult(target.getOwningType())? getConstructorRelevantFeatures(type):
			   FeatureUtil.isParameter(target)? getParameterRelevantFeatures(type):
			   Collections.emptyList();
	}
	
	/**
	 * @satisfies checkFeatureEndRedefinition
	 */
	protected List<? extends Feature> getEndRelevantFeatures(Type type) {
		return getTarget().getOwningType() == type? type.getOwnedEndFeature(): type.getEndFeature();
	}
	
	/**
	 * @satisfies checkConstructorExpressionResultFeatureRedefinition
	 */
	protected List<? extends Feature> getConstructorRelevantFeatures(Type type) {
		Type owningType = getTarget().getOwningType();
		if (type == owningType) {
			return type.getOwnedFeature();
		} else {
			Type instantiatedType = ((ConstructorExpression)(owningType.getOwningNamespace())).getInstantiatedType();
			return type != instantiatedType? Collections.emptyList():
				instantiatedType.getFeature().stream().filter(f->
					f.getOwningFeatureMembership().getVisibility() == VisibilityKind.PUBLIC).toList();
		}
	}
	
	/**
	 * Parameters redefine (owned) Parameters of general Types, with a result
	 * Parameter always redefining the result Parameter of a general Function or
	 * Expression.
	 * 
	 * @satisfies checkFeatureResultRedefinition
	 */
	public List<? extends Feature> getParameterRelevantFeatures(Type type) {
		if (type != null) {
			if (FeatureUtil.isResultParameter(getTarget())) {
				Feature resultParameter = TypeUtil.getResultParameterOf(type);
				if (resultParameter != null) {
					return Collections.singletonList(resultParameter);
				}
			} else {
				return getRelevantParameters(type);
			}
		}
		return Collections.emptyList();
	}
	
	/**
	 * @satisfies checkFeatureParameterRedefinition
	 */
	protected List<Feature> getRelevantParameters(Type type) {
		Type owningType = getTarget().getOwningType();
		return filterIgnoredParameters(type == owningType? 
					TypeUtil.getOwnedParametersOf(type): 
					TypeUtil.getAllParametersOf(type));
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
			Feature snapshotsFeature = (Feature)getLibraryType("Occurrences::Occurrence::snapshots");
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
		if (featuringType != null && feature.getOwningType() == null && 
			feature.getOwnedTypeFeaturing().isEmpty()) {
			addFeaturingType(featuringType);
		}
	}
	
	protected void addImplicitFeaturingTypesIfNecessary() {
		Feature feature = getTarget();
		Namespace owner = feature.getOwningNamespace();
		if (owner instanceof Feature && isImplicitFeaturingTypesEmpty()) {
			ElementUtil.transform(owner);
			addFeaturingTypes(((Feature)owner).getFeaturingType());
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
	
	/**
	 * @satisfies checkFeatureValueBindingConnector
	 */
	protected void computeValueConnector() {
		Feature target = getTarget();
		//returns null if valuation isDefault is true
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
	
	/**
	 * @satisfies checkFeatureOwnedCrossFeatureTypeFeaturing
	 */
	public void addOwnedCrossFeatureTypeFeaturing() {
		Feature target = getTarget();
		if (FeatureUtil.isOwnedCrossFeature(target) && target.getOwnedTypeFeaturing().isEmpty() && isImplicitFeaturingTypesEmpty()) {
			Feature owningFeature = (Feature)target.getOwner();
			Type ownerOwningType = owningFeature.getOwningType();
			if (ownerOwningType != null) {
				List<Feature> endFeatures = ownerOwningType.getEndFeature();
				int n = endFeatures.size();
				if (n == 2) {
					Feature otherEnd = endFeatures.get(1 - endFeatures.indexOf(owningFeature));
					addFeaturingTypes(otherEnd.getType());
				} else if (n > 2) {
					Feature cartesianProductFeature = SysMLFactory.eINSTANCE.createFeature();
					
					for (Feature otherEnd: endFeatures) {
						if (otherEnd != owningFeature) {
							List<Type> crossFeatureTypes = otherEnd.getType();
							if (crossFeatureTypes.isEmpty()) {
								crossFeatureTypes = Collections.singletonList(getLibraryType("Base::Anything"));
							}							
							if (cartesianProductFeature.getOwnedTypeFeaturing().isEmpty()) {
								for (Type crossFeatureType: crossFeatureTypes) {
									FeatureUtil.addTypeFeaturingTo(cartesianProductFeature).
										setFeaturingType(crossFeatureType);
								}
							} else {
								if (!cartesianProductFeature.getOwnedTyping().isEmpty()) {
									Feature previousCartesianProductFeature = cartesianProductFeature;
									cartesianProductFeature = SysMLFactory.eINSTANCE.createFeature();
									TypeFeaturing typeFeaturing = FeatureUtil.addTypeFeaturingTo(cartesianProductFeature);
									typeFeaturing.setFeaturingType(previousCartesianProductFeature);
									typeFeaturing.getOwnedRelatedElement().add(previousCartesianProductFeature);
								}
								for (Type crossFeatureType: crossFeatureTypes) {
									FeatureUtil.addFeatureTypingTo(cartesianProductFeature).
										setType(crossFeatureType);
								}
							}
						}
					}
					
					addFeaturingType(cartesianProductFeature);

					for (Feature redefinedFeature: FeatureUtil.getRedefinedFeaturesWithComputedOf(owningFeature, null)) {
						if (redefinedFeature.isEnd()) {
							Feature crossFeature = getCrossFeatureOf(redefinedFeature);
							if (crossFeature != null) {
								FeatureUtil.addOwnedCrossFeatureTypeFeaturingTo(crossFeature);
								for (Type featuringType: crossFeature.getFeaturingType()) {
									if (featuringType instanceof Feature) {
										FeatureUtil.addSubsettingTo(cartesianProductFeature).
											setSubsettedFeature((Feature)featuringType);
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
