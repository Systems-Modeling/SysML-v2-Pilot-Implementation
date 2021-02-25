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
 * 
 *****************************************************************************/
package org.omg.sysml.util;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;

/**
 * This adapter implementation can be used to store the implicit relationships
 * for each feature, including implicit featuring types.
 */
public class ImplicitFeatureRelationships extends ImplicitTypeRelationships {

	private Set<Type> implicitFeaturingTypes = new LinkedHashSet<>();
	
	public static ImplicitFeatureRelationships getOrCreateAdapter(Feature target) {
		return getExistingFeatureAdapter(target).orElseGet(() -> initializeFeatureAdapter(target));
	}
	
	private static ImplicitFeatureRelationships initializeFeatureAdapter(Feature target) {
		// Replace existing type adapter with an appropriate feature adapter
		ImplicitFeatureRelationships adapter = 
				getExistingTypeAdapter(target).map(typeRelationships -> {
					target.eAdapters().remove(typeRelationships);
					return new ImplicitFeatureRelationships(typeRelationships);
				}).orElse(new ImplicitFeatureRelationships());
		target.eAdapters().add(adapter);
		return adapter;
	}

	private static Optional<ImplicitFeatureRelationships> getExistingFeatureAdapter(Feature target) {
		return target.eAdapters()
			.stream()
			.filter(ImplicitFeatureRelationships.class::isInstance)
			.map(ImplicitFeatureRelationships.class::cast)
			.findFirst();
	}
	
	public static void removeAdapter(Feature target) {
		getExistingFeatureAdapter(target).ifPresent(target.eAdapters()::remove);
	}
	
	private ImplicitFeatureRelationships() {
		super();
	}
	
	private ImplicitFeatureRelationships(ImplicitTypeRelationships typeRelationships) {
		super(typeRelationships);
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type instanceof Feature;
	}

	@Override
	public Feature getTarget() {
		return (Feature)super.getTarget();
	}
	
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
	
	public void addImplicitTypeFeaturing() {
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

}
