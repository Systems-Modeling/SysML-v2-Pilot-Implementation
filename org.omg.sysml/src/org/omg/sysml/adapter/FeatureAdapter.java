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

package org.omg.sysml.adapter;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.IndividualDefinition;
import org.omg.sysml.lang.sysml.IndividualUsage;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class FeatureAdapter extends TypeAdapter {
	
	public static final String FEATURE_SUBSETTING_DEFAULT = "Base::things";
	public static final String VALUE_FEATURE_SUBSETTING_DEFAULT = "Base::dataValues";
	public static final String OCCURRENCE_FEATURE_SUBSETTING_DEFAULT = "Occurrences::occurrences";
	public static final String OBJECT_FEATURE_SUBSETTING_DEFAULT = "Objects::objects";
	
	public FeatureAdapter(Feature element) {
		super(element);
	}
	
	@Override
	public Feature getTarget() {
		return (Feature)super.getTarget();
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
	protected EClass getGeneralizationEClass() {
		return SysMLPackage.eINSTANCE.getSubsetting();
	}
	
	@Override
	protected String getDefaultSupertype() {
		return hasStructureType()? OBJECT_FEATURE_SUBSETTING_DEFAULT:
			   hasClassType()? OCCURRENCE_FEATURE_SUBSETTING_DEFAULT:
			   hasDataType()? VALUE_FEATURE_SUBSETTING_DEFAULT:
			   FEATURE_SUBSETTING_DEFAULT;
	}
	
	public boolean hasClassType() {
		return getTarget().getOwnedTyping().stream().
				map(FeatureTyping::getType).anyMatch(org.omg.sysml.lang.sysml.Class.class::isInstance) ||
				getImplicitGeneralTypes(SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(org.omg.sysml.lang.sysml.Class.class::isInstance);
	}
	
	public boolean hasStructureType() {
		return getTarget().getOwnedTyping().stream().
				map(FeatureTyping::getType).anyMatch(Structure.class::isInstance) ||
				getImplicitGeneralTypes(SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(Structure.class::isInstance);
	}
	
	public boolean hasDataType() {
		return getTarget().getOwnedTyping().stream().
				map(FeatureTyping::getType).anyMatch(DataType.class::isInstance) ||
				getImplicitGeneralTypes(SysMLPackage.Literals.FEATURE_TYPING).stream().anyMatch(DataType.class::isInstance);
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		FeatureUtil.addComputedRedefinitionsTo(getTarget(), null);
		super.computeImplicitGeneralTypes();
	}
	
	public Optional<Feature> getFirstSubsettedFeature() {
		return getSubsettedNotRedefinedFeatures().findFirst();
	}
	
	protected Stream<Feature> getSubsettedNotRedefinedFeatures() {
		computeImplicitGeneralTypes();
		Feature target = getTarget();
		Stream<Feature> implicitSubsettedFeatures = getImplicitGeneralTypesOnly(SysMLPackage.Literals.SUBSETTING).stream().
				map(Feature.class::cast);
		Stream<Feature> ownedSubsettedFeatures = target.getOwnedSubsetting().stream().
				filter(s->!(s instanceof Redefinition)).
				map(Subsetting::getSubsettedFeature);
		return Stream.concat(ownedSubsettedFeatures, implicitSubsettedFeatures);
	}
	
	public List<Feature> getSubsettedFeatures() {
		Feature target = getTarget();
		// Note: Build on getSubsettedNotRedefinedFeatures here because it is overridden in some subclasses.
		Stream<Feature> subsettedFeatures = getSubsettedNotRedefinedFeatures();
		Stream<Feature> ownedRedefinedFeatures = target.getOwnedRedefinition().stream().
				map(Redefinition::getRedefinedFeature);
		Stream<Feature> implicitRedefinedFeatures = getImplicitGeneralTypesOnly(SysMLPackage.Literals.REDEFINITION).stream().
				map(Feature.class::cast);		
		return Stream.concat(Stream.concat(subsettedFeatures, ownedRedefinedFeatures), implicitRedefinedFeatures).
				collect(Collectors.toList());
	}
	
	public List<Feature> getRedefinedFeatures() {
		Feature target = getTarget();
		computeImplicitGeneralTypes();
		Stream<Feature> implicitRedefinedFeatures = getImplicitGeneralTypesOnly( SysMLPackage.Literals.REDEFINITION).stream().
				map(Feature.class::cast);
		Stream<Feature> ownedRedefinedFeatures = target.getOwnedRedefinition().stream().
				map(Redefinition::getRedefinedFeature);
		return Stream.concat(ownedRedefinedFeatures, implicitRedefinedFeatures).
				collect(Collectors.toList());
	}
	
	/**
	 * Return a set including this Feature and all Features that it redefines directly or indirectly.
	 */
	public Set<Feature> getAllRedefinedFeatures() {
		Set<Feature> redefinedFeatures = new HashSet<>();
		
		// Ensure that the redefinitions for this feature are recomputed. 
		FeatureUtil.forceComputeRedefinitionsFor(getTarget());
		
		addAllRedefinedFeaturesTo(redefinedFeatures);
		return redefinedFeatures;
	}
	
	public void addAllRedefinedFeaturesTo(Set<Feature> redefinedFeatures) {
		Feature target = getTarget();
		redefinedFeatures.add(target);
		FeatureUtil.getRedefinedFeaturesWithComputedOf(target, null).stream().forEach(redefinedFeature->{
			if (redefinedFeature != null && !redefinedFeatures.contains(redefinedFeature)) {
				FeatureUtil.addAllRedefinedFeaturesTo(redefinedFeature, redefinedFeatures);
			}
		});
	}
	
	// Transformation
	
	/**
	 * This method is used for time slice and snapshot features.
	 */
	public void setIndividualTyping() {
		Feature target = getTarget();
		Type owningType = target.getOwningType();
		if (owningType instanceof IndividualDefinition || owningType instanceof IndividualUsage) {
			Type type = owningType instanceof IndividualUsage? 
					((IndividualUsage)owningType).getIndividualDefinition(): 
					owningType;
					addImplicitGeneralType(SysMLPackage.eINSTANCE.getFeatureTyping(), type);
		}
	}	
	
	protected BindingConnector valueConnector;
	
	public BindingConnector getValueConnector() {
		return valueConnector;
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
		if (owner instanceof Feature) {
			EList<Type> ownerFeaturingTypes = ((Feature)owner).getFeaturingType();
			if (isImplicitFeaturingTypesEmpty()) {
				addFeaturingTypes(ownerFeaturingTypes);
			}
		}
	}
	
	protected BindingConnector addBindingConnector(Collection<Type> featuringTypes, Feature source, Feature target) {
		BindingConnector connector = TypeUtil.createBindingConnector(source, target);
		addImplicitMemberBindingConnector(connector);
		FeatureUtil.addFeaturingTypesTo(connector, featuringTypes);
		return connector;
	}

	protected BindingConnector addValueBinding(Expression sourceExpression) {
		Feature target = getTarget();
		ElementUtil.transform(sourceExpression);
		return addBindingConnector(target.getFeaturingType(), sourceExpression.getResult(), target);
	}
		
	public BindingConnector computeAssertionConnector(Feature result) {
		Feature feature = getTarget();
		LiteralBoolean literalBoolean = (LiteralBoolean)feature.getOwnedFeature().stream().
				filter(f->f instanceof LiteralBoolean).
				findFirst().orElse(null);
		return literalBoolean == null? null:
			addResultBinding(literalBoolean, result);
	}
	
	protected void computeValueConnector() {
		Feature feature = getTarget();
		FeatureValue valuation = FeatureUtil.getValuationFor(feature);
		if (valuation != null) {
			Expression value = valuation.getValue();
			valueConnector = value == null? null: addValueBinding(value);
		}
	}
	
	@Override
	public void doTransform() {
		FeatureUtil.forceComputeRedefinitionsFor(getTarget());
		super.doTransform();
		computeValueConnector();
	}

}
