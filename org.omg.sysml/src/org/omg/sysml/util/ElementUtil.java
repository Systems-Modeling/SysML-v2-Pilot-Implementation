/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019, 2020 Model Driven Solutions, Inc.
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
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/

package org.omg.sysml.util;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.omg.sysml.adapter.ElementAdapter;
import org.omg.sysml.adapter.FeatureAdapter;
import org.omg.sysml.adapter.ElementAdapterFactory;
import org.omg.sysml.adapter.TypeAdapter;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;

public class ElementUtil {
	
	private ElementUtil() {
	}
	
	// General
	
	/**
	 * Get documentation text for this element, as given by the body of the first documentation comment
	 * annotating the element (if any).
	 */
	public static String getDocumentationTextFor(Element element) {
		return element.getDocumentationComment().stream().
				map(Comment::getBody).
				findFirst().orElse(null);
	}
	
	// Adapters
	
	public static ElementAdapter getElementAdapter(Element target) {
		return ElementAdapterFactory.getAdapter(target);
	}
	
	public static TypeAdapter getTypeAdapter(Type target) {
		return (TypeAdapter)getElementAdapter(target);
	}

	public static FeatureAdapter getFeatureAdapter(Feature target) {
		return (FeatureAdapter)getElementAdapter(target);
	}
	
	public static void clean(Element element) {
		ElementAdapterFactory.removeAdapter(element);
	}
	
	// Transformation 
	
	public static void transformAll(ResourceSet resourceSet, boolean addImplicitElements) {
		for (Resource resource: resourceSet.getResources()) {
			transformAll(resource, addImplicitElements);
		}
	}

	public static void transformAll(Resource resource, boolean addImplicitElements) {
		for (EObject object: resource.getContents()) {
			if (object instanceof Element) {
				transformAll((Element)object, addImplicitElements);
			}
		}
	}
	
	public static void transformAll(Element root, boolean addImplicitElements) {
		if (addImplicitElements && root instanceof Type) {
			addImplicitBindingConnectors((Type) root);
		}
		transform(root);
		for (Relationship relationship: root.getOwnedRelationship()) {
			transformAll(relationship, addImplicitElements);
			for (Element element: relationship.getOwnedRelatedElement()) {
				transformAll(element, addImplicitElements);
			}
		}
		if (addImplicitElements && root instanceof Type) {
			addImplicitGeneralizations((Type)root);
		}
		if (addImplicitElements && root instanceof Feature) {
			addImplicitTypeFeaturings((Feature)root);
		}
	}
	
	public static void transform(Element element) {
		ElementAdapter transformer = getElementAdapter(element);
		if (transformer != null) {
			transformer.transform();
		}
	}
	
	public static boolean isTransformed(Element element) {
		return getElementAdapter(element).isTransformed();
	}
	
	// Implicit elements
	
	public static void addImplicitGeneralizations(Type type) {
		ElementUtil.getTypeAdapter(type).addImplicitGeneralizations();
	}
	
	public static void addImplicitTypeFeaturings(Feature feature) {
		ElementUtil.getFeatureAdapter(feature).addImplicitTypeFeaturings();
	}
	
	public static void addImplicitBindingConnectors(Type type) {
		List<Membership> addedMemberships = ElementUtil.getTypeAdapter(type).addImplicitBindingConnectors();
		// This is required as the owned relationships call of the type will not return
		// the newly created binding connectors so we have to ensure the transform
		// function is used appropriately
		for (Membership m : addedMemberships) {
			transformAll(m.getMemberElement(), true);
		}
	}

}
