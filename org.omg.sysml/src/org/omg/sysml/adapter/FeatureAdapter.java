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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.util.TransformationUtil;

public class FeatureAdapter extends TypeAdapter {
	
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
	
	public void addImplicitTypeFeaturings() {
		for (Type type : implicitFeaturingTypes) {
			Feature feature = getTarget();
			boolean featuringRequired = feature.getOwnedRelationship_comp().stream().
				filter(TypeFeaturing.class::isInstance).
				map(TypeFeaturing.class::cast).
				noneMatch(f -> Objects.equals(f.getFeatureOfType(), getTarget())
						&& Objects.equals(f.getFeaturingType(), type));
			if (featuringRequired) {
				TypeFeaturing featuring = SysMLFactory.eINSTANCE.createTypeFeaturing();
				featuring.setFeaturingType(type);
				featuring.setFeatureOfType(feature);
				feature.getOwnedRelationship_comp().add(featuring);
			}
		}
	}
	
	public boolean isImplicitFeaturingTypesEmpty() {
		return implicitFeaturingTypes.isEmpty();
	}

	// Transformation
	
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
	
	public BindingConnector computeAssertionConnector(Feature result) {
		Feature feature = getTarget();
		LiteralBoolean literalBoolean = (LiteralBoolean)feature.getOwnedFeature().stream().
				filter(f->f instanceof LiteralBoolean).
				findFirst().orElse(null);
		return literalBoolean == null? null:
			TransformationUtil.addResultBindingTo(feature, literalBoolean, result);
	}
	
	protected void computeValueConnector() {
		Feature feature = getTarget();
		FeatureValue valuation = TransformationUtil.getValuationFor(feature);
		if (valuation != null) {
			Expression value = valuation.getValue();
			valueConnector = value == null? null:
				TransformationUtil.addValueBindingTo(feature, value);
		}
	}
	
	@Override
	public void doTransform() {
		TransformationUtil.forceComputeRedefinitionsFor(getTarget());
		super.doTransform();
		computeValueConnector();
	}

}
