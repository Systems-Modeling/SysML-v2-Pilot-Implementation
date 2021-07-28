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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Subsetting;
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
		Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
		subsetting.setSubsettedFeature(relatedFeature);
		subsetting.setSubsettingFeature(endFeature);
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
	
	public static EList<Feature> getRelatedFeaturesOf(Connector connector) {
		EList<Feature> relatedFeatures = new BasicInternalEList<Feature>(Feature.class);
		for (Object end: connector.getConnectorEnd().toArray()) {
			if (end != null) {
				Feature subsettedFeature = ((Feature)end).firstSubsettedFeature();
				if (subsettedFeature != null) {
					relatedFeatures.add(subsettedFeature);
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
		return relatedFeatures.size() == 2? relatedFeatures.get(0): null;
	}

	public static void addTargetFeatures(Connector connector, EList<Feature> targetFeatures) {
		EList<Feature> relatedFeatures = connector.getRelatedFeature();
		if (relatedFeatures.size() == 2) {
			targetFeatures.add(relatedFeatures.get(1));
		} else {
			targetFeatures.addAll(relatedFeatures);
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
			List<Type> featuringTypes = FeatureUtil.getAllFeaturingTypesOf(relatedFeature);
			if (commonFeaturingTypes == null) {
				commonFeaturingTypes = featuringTypes;
			} else {
				commonFeaturingTypes.removeIf(t->
					featuringTypes.stream().noneMatch(f->
						TypeUtil.conforms(f, t) || TypeUtil.conforms(t, f)));
			}
		}
		return commonFeaturingTypes == null || commonFeaturingTypes.isEmpty()? 
				null: commonFeaturingTypes.get(0);
	}

}
