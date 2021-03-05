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
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl;
import org.omg.sysml.lang.sysml.impl.ExpressionImpl;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.lang.sysml.impl.FeatureReferenceExpressionImpl;
import org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl;
import org.omg.sysml.lang.sysml.impl.ItemFlowEndImpl;
import org.omg.sysml.lang.sysml.impl.NamespaceImpl;
import org.omg.sysml.lang.sysml.impl.SatisfyRequirementUsageImpl;
import org.omg.sysml.lang.sysml.impl.TransitionUsageImpl;
import org.omg.sysml.lang.sysml.impl.TypeImpl;
import org.omg.sysml.lang.sysml.impl.UsageImpl;

public class TransformationUtil {
	
	private TransformationUtil() {
	}
	
	public static ImplicitTypeRelationships getImplicitTypeRelationshipsAdapter(Type target) {
		return ImplicitTypeRelationships.getOrCreateAdapter(target);
	}
	
	public static ImplicitFeatureRelationships getImplicitFeatureRelationshipsAdapter(Feature target) {
		return ImplicitFeatureRelationships.getOrCreateAdapter(target);
	}
	
	// Namespace
	
	public static Membership addOwnedMemberTo(Namespace namespace, Element element) {
		Membership membership = SysMLFactory.eINSTANCE.createMembership();
		membership.setOwnedMemberElement_comp(element);
		namespace.getOwnedMembership_comp().add(membership);
		return membership;
	}
	
	public static void clearCachesOf(Namespace namespace) {
		((NamespaceImpl)namespace).clearCaches();
	}
	
	// Type
	
	public static <T extends Membership> Feature getOwnedFeatureByMembershipIn(Type type, Class<T> kind) {
		return ((TypeImpl)type).getOwnedFeatureByMembership(kind);
	}
	
	public static FeatureMembership addOwnedFeatureTo(Type type, Feature feature) {
		FeatureMembership membership = SysMLFactory.eINSTANCE.createFeatureMembership();
		membership.setOwnedMemberFeature_comp(feature);
		type.getOwnedFeatureMembership_comp().add(membership);
		return membership;
	}
	
	public static void addGeneralTypeTo(Type type, EClass kind, Type generalType) {
		getImplicitTypeRelationshipsAdapter(type).addImplicitGeneralType(kind, generalType);
	}
	
	public static void computeImplicitGeneralTypesFor(Type type) {
		((TypeImpl)type).computeImplicitGeneralTypes();
	}
	
	public static BindingConnector createBindingConnector(Feature source, Feature target) {
		BindingConnector connector = SysMLFactory.eINSTANCE.createBindingConnector();
		addConnectorEndTo(connector, source);
		addConnectorEndTo(connector, target);
		return connector;
	}
	
	public static void addMemberBindingConnectorTo(Type type, BindingConnector connector) {
		getImplicitTypeRelationshipsAdapter(type).addImplicitMemberBindingConnector(connector);
	}
	
	public static void addFeatureBindingConnectorTo(Type type, BindingConnector connector) {
		getImplicitTypeRelationshipsAdapter(type).addImplicitFeatureBindingConnector(connector);
	}
	
	public static BindingConnector addBindingConnectorTo(Type type, Feature source, Feature target) {
		BindingConnector connector = createBindingConnector(source, target);
		if (getContextTypeFor(connector) == type) {
			addFeatureBindingConnectorTo(type, connector);
		} else {
			addMemberBindingConnectorTo(type, connector);
		}
		return connector;
	}

	protected static BindingConnector addBindingConnectorTo(Type type, Collection<Type> featuringTypes, Feature source, Feature target) {
		BindingConnector connector = createBindingConnector(source, target);
		getImplicitTypeRelationshipsAdapter(type).addImplicitMemberBindingConnector(connector);
		addFeaturingTypesTo(connector, featuringTypes);
		return connector;
	}
	
	public static BindingConnector addResultBindingTo(Type type, Expression sourceExpression, Feature target) {
		ElementUtil.transform(sourceExpression);
		return addBindingConnectorTo(type, sourceExpression.getResult(), target);
	}
	
	// Feature
	
	public static FeatureValue getValuationFor(Feature feature) {
		return ((FeatureImpl)feature).getValuation();
	}
	
	public static List<Feature> getRedefinedFeaturesOf(Feature feature) {
		return ((FeatureImpl)feature).getRedefinedFeatures();
	}
	
	public static void forceComputeRedefinitionsFor(Feature feature) {
		((FeatureImpl)feature).forceComputeRedefinitions();
	}
	
	public static boolean isImplicitFeaturingTypesEmpty(Feature feature) {
		return getImplicitFeatureRelationshipsAdapter(feature).isImplicitFeaturingTypesEmpty();
	}
	
	public static void addFeaturingTypeTo(Feature feature, Type featuringType) {
		getImplicitFeatureRelationshipsAdapter(feature).addFeaturingType(featuringType);
	}
	
	public static void addFeaturingTypesTo(Feature feature, Collection<Type> featuringTypes) {
		getImplicitFeatureRelationshipsAdapter(feature).addFeaturingTypes(featuringTypes);
	}

	public static BindingConnector addValueBindingTo(Feature feature, Expression sourceExpression) {
		ElementUtil.transform(sourceExpression);
		return addBindingConnectorTo(feature, feature.getFeaturingType(), sourceExpression.getResult(), feature);
	}
	
	public static Subsetting addSubsettingTo(Feature feature) {
		Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
		subsetting.setSubsettingFeature(feature);
		feature.getOwnedRelationship_comp().add(subsetting);
		return subsetting;
	}
	
	public static Optional<Subsetting> getFirstOwnedSubsettingOf(Feature feature) {
		return ((FeatureImpl)feature).basicGetOwnedSubsetting().stream().
				filter(s->!(s instanceof Redefinition)).findFirst();
	}
	
	/**
	 * Perform a breadth first traversal of featuring types starting with the originalFeature.
	 */
	protected static List<Type> getAllFeaturingTypesOf(Feature originalFeature) {
		List<Type> allFeaturingTypes = new ArrayList<>();
		List<Feature> features = new ArrayList<>();
		features.add(originalFeature);
		while (!features.isEmpty()) {
			List<Feature> nextFeatures = new ArrayList<>();
			for (Feature feature: features) {
				List<Type> featuringTypes = feature.getFeaturingType();
				if (featuringTypes.isEmpty()) {
					allFeaturingTypes.add(null);
				} else {
					for (Type featuringType: featuringTypes) {
						if (!allFeaturingTypes.contains(featuringType)) {
							allFeaturingTypes.add(featuringType);
							if (featuringType instanceof Feature) {
								nextFeatures.add((Feature)featuringType);
							}
						}
					}
				}
			}
			features = nextFeatures;
		}
		return allFeaturingTypes;
	}
	
	// Connector
	
	public static Feature addConnectorEndTo(Connector connector, Feature relatedFeature) {
		Feature endFeature = SysMLFactory.eINSTANCE.createFeature();
		Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
		subsetting.setSubsettedFeature(relatedFeature);
		subsetting.setSubsettingFeature(endFeature);
		endFeature.getOwnedRelationship_comp().add(subsetting);
		FeatureMembership membership = SysMLFactory.eINSTANCE.createEndFeatureMembership();
		membership.setOwnedMemberFeature_comp(endFeature);
		connector.getOwnedFeatureMembership_comp().add(membership);
		return endFeature;
	}
	
	public static void setRelatedFeatureOf(Connector connector, int index, Feature relatedFeature) {
		EList<Feature> connectorEnds = connector.getConnectorEnd();
		if (index < connectorEnds.size()) {
			setRelatedFeatureOf(connector, connectorEnds.get(index), relatedFeature);
		}
	}

	public static void setRelatedFeatureOf(Connector connector, Feature connectorEnd, Feature relatedFeature) {
		getFirstOwnedSubsettingOf(connector).
			orElseGet(()->addSubsettingTo(connectorEnd)).
			setSubsettedFeature(relatedFeature);
	}
		
	public static Type getContextTypeFor(Connector connector) {
		Element owner = connector.getOwner();
		List<Feature> relatedFeatures = connector.getRelatedFeature();
		
		// TODO: Handle inherited features more properly when determining context type.
		if (owner instanceof Type) {
			List<Feature> ownerInheritedFeatures = ((Type)owner).getInheritedFeature();
			relatedFeatures.removeAll(ownerInheritedFeatures);
			if (relatedFeatures.isEmpty()) {
				return (Type)owner;
			}
		}
		
		List<Type> commonFeaturingTypes = null;
		for (Feature relatedFeature: relatedFeatures) {
			List<Type> featuringTypes = getAllFeaturingTypesOf(relatedFeature);
			if (commonFeaturingTypes == null) {
				commonFeaturingTypes = featuringTypes;
			} else {
				commonFeaturingTypes.retainAll(featuringTypes);
			}
		}
		return commonFeaturingTypes == null || commonFeaturingTypes.isEmpty()? 
				null: commonFeaturingTypes.get(0);
	}	
	
	public void updateConnector(Connector connector, List<Type> featuringTypes, Feature source, Feature target) {
		setRelatedFeatureOf(connector, 0, source);
		setRelatedFeatureOf(connector, 1, target);
		if (featuringTypes != null) {
			addFeaturingTypesTo(connector, featuringTypes);
		}
	}
	
	// Expression
	
	public static Type getExpressionTypeOf(Expression expression) {
		return ((ExpressionImpl)expression).getExpressionType();
	}
	
	public static List<Feature> getTypeParametersOf(Expression expression) {
		return ((ExpressionImpl)expression).getTypeParameters();
	}
	
	public static List<Feature> getTypeFeaturesOf(InvocationExpression expression) {
		return ((InvocationExpressionImpl)expression).getTypeFeatures();
	}
	
	public static Expression getArgumentForFeature(List<Expression> arguments, Feature feature, int index) {
		return InvocationExpressionImpl.getArgumentForFeature(arguments, feature, index);
	}
	
	public static boolean hasReferentFeature(FeatureReferenceExpression expression) {
		return ((FeatureReferenceExpressionImpl)expression).getReferentFeature().isPresent();
	}
	
	// ItemFlowEnd
	
	public static void addItemFlowEndSubsettingTo(ItemFlowEnd itemFlowEnd) {
		((ItemFlowEndImpl)itemFlowEnd).addItemFlowEndSubsetting();
	}
	
	// Usage
	
	public static boolean isSubjectParameter(Usage usage) {
		return ((UsageImpl)usage).isSubjectParameter();
	}
	
	public static boolean hasRelevantSubjectParameter(Usage usage) {
		return ((UsageImpl)usage).hasRelevantSubjectParameter();
	}
	
	public static Feature getSubjectParameterOf(Type type) {
		return UsageImpl.getSubjectParameterOf(type);
	}
	
	public static Definition getOwningVariationDefinitionFor(Usage usage) {
		return ((UsageImpl)usage).getOwningVariationDefinition();
	}
	
	public static boolean isVariant(Usage usage) {
		return ((UsageImpl)usage).isVariant();
	}
	
	// ConstraintUsage
	
	public static boolean isRequirement(ConstraintUsage constraint) {
		return ((ConstraintUsageImpl)constraint).isRequirement();
	}
	
	// SatisfyRequirementUsage
	
	public static BindingConnector getSatisfyingFeatureConnectorOf(SatisfyRequirementUsage usage) {
		return ((SatisfyRequirementUsageImpl)usage).getSatisfyingFeatureConnector();
	}
	
	// TransitionUsage
	
	public static Feature getTransitionLinkFeatureOf(TransitionUsage transition) {
		return ((TransitionUsageImpl)transition).getTransitionLinkFeature();
	}
	
	public static void setTransitionLinkFeatureOf(TransitionUsage transition, Feature transitionLinkFeature) {
		((TransitionUsageImpl)transition).setTransitionLinkFeature(transitionLinkFeature);
	}
	
}
