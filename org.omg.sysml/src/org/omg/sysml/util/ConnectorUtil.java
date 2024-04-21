/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
 * Copyright (c) 2023 Mgnite Inc.
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

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

public class ConnectorUtil {
	
	private ConnectorUtil() {
	}
	
	
	// Creation
	
	public static BindingConnector createBindingConnector(Feature source, Feature target) {
		BindingConnector connector = SysMLFactory.eINSTANCE.createBindingConnector();
		addConnectorEndTo(connector, source);
		addConnectorEndTo(connector, target);
		return connector;
	}

	public static void transformBindingConnector(BindingConnector connector, Type owner) {
		TypeUtil.addImplicitGeneralTypeTo(connector, SysMLPackage.eINSTANCE.getSubsetting(), 
				SysMLLibraryUtil.getLibraryType(owner, ImplicitGeneralizationMap.getDefaultSupertypeFor(connector.getClass(), "binary")));
		for (Feature end: connector.getConnectorEnd()) {
			ElementUtil.transform(end);
		}
	}

	// Connector ends
	
	public static Feature addConnectorEndTo(Connector connector, Feature relatedFeature) {
		Feature endFeature = SysMLFactory.eINSTANCE.createFeature();
		ReferenceSubsetting subsetting = SysMLFactory.eINSTANCE.createReferenceSubsetting();
		subsetting.setReferencedFeature(relatedFeature);
		endFeature.getOwnedRelationship().add(subsetting);
		endFeature.setIsEnd(true);
		FeatureMembership membership = SysMLFactory.eINSTANCE.createFeatureMembership();
		membership.setOwnedMemberFeature(endFeature);
		connector.getOwnedRelationship().add(membership);
		return endFeature;
	}
	
	public static void transformConnectorEndsOf(ItemFlow flow) {
		Namespace owner = flow.getOwningNamespace();
		if (owner instanceof Feature) {
			EList<Feature> ends = flow.getConnectorEnd();
			if (ends.size() >= 2) {
				EList<Feature> endFeatures = ends.get(1).getOwnedFeature();
				if (!endFeatures.isEmpty()) {
					Feature flowEndFeature = endFeatures.get(0);
					if (flowEndFeature.getOwnedRedefinition().isEmpty()) {
						TypeUtil.addImplicitGeneralTypeTo(flowEndFeature, SysMLPackage.eINSTANCE.getRedefinition(), (Feature)owner);
					}
				}
			}
		}
	}

	// Related Features

    public static Feature getRelatedFeatureOfEnd(Feature end) {
    	return FeatureUtil.getReferencedFeatureOf(end);
	}
	
	public static EList<Feature> getRelatedFeaturesOf(Connector connector) {
		EList<Feature> relatedFeatures = new BasicInternalEList<Feature>(Feature.class);
        for (Object end: connector.getConnectorEnd().toArray()) {
			if (end != null) {
				Feature referencedFeature = getRelatedFeatureOfEnd((Feature) end);
				if (referencedFeature != null) {
					relatedFeatures.add(referencedFeature);
				}
			}
		}
		return relatedFeatures;
	}
	
	public static void setRelatedFeatureOf(Connector connector, int index, Feature relatedFeature) {
		EList<Feature> connectorEnds = connector.getConnectorEnd();
		if (index < connectorEnds.size()) {
			setRelatedFeatureOf(connector, connectorEnds.get(index), relatedFeature);
		}
	}

	public static void setRelatedFeatureOf(Connector connector, Feature connectorEnd, Feature relatedFeature) {
		FeatureUtil.getFirstOwnedSubsettingOf(connector).
			orElseGet(()->FeatureUtil.addSubsettingTo(connectorEnd)).
			setSubsettedFeature(relatedFeature);
	}
	
	public static Feature getSourceFeatureOf(Connector connector) {
		EList<Feature> relatedFeatures = connector.getRelatedFeature();
		return relatedFeatures.isEmpty()? null: relatedFeatures.get(0);
	}

	public static void addTargetFeatures(Connector connector, EList<Feature> targetFeatures) {
		EList<Feature> relatedFeatures = connector.getRelatedFeature();
		if (relatedFeatures.size() >= 2) {
			targetFeatures.addAll(relatedFeatures.subList(1, relatedFeatures.size()));
		}
	}
	
	// Path
	
	public static void getPath(EList<Feature> path, Namespace start, Feature feature) {
		if (feature != null) {
			Namespace owningNamespace = feature.getOwningNamespace();
			if (owningNamespace instanceof Feature && owningNamespace != start) {
				getPath(path, start, (Feature)owningNamespace);
			}
			path.add(feature);
		}
	}

	// Context Type
	
	public static Type getContextTypeFor(Connector connector) {
		List<Type> commonFeaturingTypes = null;
		for (Feature relatedFeature: connector.getRelatedFeature()) {
			// getAllFeaturingTypesOf returns a breadth-first transitive traversal of all the
			// the featuring type hierarchy for relatedFeatures. 
			List<Type> featuringTypes = FeatureUtil.getAllFeaturingTypesOf(relatedFeature);
			if (commonFeaturingTypes == null) {
				commonFeaturingTypes = featuringTypes;
			} else {
				int i = 0;
				while (i < commonFeaturingTypes.size()) {
					Type type = commonFeaturingTypes.get(i);
					Optional<Type> subtype = featuringTypes.stream().filter(f->TypeUtil.conforms(f, type)).findFirst();
					if (subtype.isPresent()) {
						// If the featuringTypes of the next relatedFeature include a subtype of this type,
						// then replace this type with the subtype in the list of commonFeaturingTypes.
						commonFeaturingTypes.set(i, subtype.get());
					} else if (featuringTypes.stream().noneMatch(f->TypeUtil.conforms(type, f))) {
						// Otherwise, if this type doesn't conform to any of the featuringTypes of the
						// next relatedFeature, remove it from the list of commonFeaturingTypes.
						commonFeaturingTypes.remove(i);
						i--;
					}
					i++;
				}
			}
		}
		// If any commonFeaturingTypes have been found across all relatedFeatures, then
		// return the first (innermost) one.
		return commonFeaturingTypes == null || commonFeaturingTypes.isEmpty()? 
				null: commonFeaturingTypes.get(0);
	}

}
