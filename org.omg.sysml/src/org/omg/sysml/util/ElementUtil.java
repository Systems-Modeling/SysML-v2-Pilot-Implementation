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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.lang.sysml.impl.TypeImpl;
import org.omg.sysml.transform.Transformer;
import org.omg.sysml.transform.TransformerFactory;
import org.omg.sysml.transform.TransformerUtil;

public class ElementUtil {
	
	private ElementUtil() {
	}
	
	/**
	 * Get documentation text for this element, as given by the body of the first documentation comment
	 * annotating the element (if any).
	 */
	public static String getDocumentationTextFor(Element element) {
		return element.getDocumentationComment().stream().
				map(Comment::getBody).
				findFirst().orElse(null);
	}
	
	// Transformation 
	
	private static Set<Element> transformedElements;
	
	private static Set<Element> getTransformedElements() {
		if (transformedElements == null) {
			transformedElements = new HashSet<>();
		}
		return transformedElements;
	}
	
	public static boolean isTransformed(Element element) {
		return getTransformedElements().contains(element);
	}
	
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
		Set<Element> transformedElements = getTransformedElements();
		if (!transformedElements.contains(element)) {
			Transformer transformer = TransformerFactory.createTransformer(element);
			if (transformer != null) {
				transformer.transform();
			}
			transformedElements.add(element);
		}
	}
	
	public static void clean(Element element) {
		getTransformedElements().remove(element);
		if (element instanceof TypeImpl) {
			((TypeImpl)element).cleanImplicitValues();
		}
	}
	
	// Implicit elements
	
	public static void addImplicitGeneralizations(Type type) {
		((TypeImpl)type).forEachImplicitGeneralType((eClass, general)->{
			Generalization newGeneralization = (Generalization)SysMLFactory.eINSTANCE.create(eClass);
			newGeneralization.setGeneral(general);
			newGeneralization.setSpecific(type);
			type.getOwnedRelationship_comp().add(newGeneralization);
		});
		((TypeImpl)type).cleanImplicitGeneralTypes();
	}
	
	public static void addImplicitTypeFeaturings(Feature feature) {
		((FeatureImpl)feature).forEachImplicitFeaturingType(type->{
			boolean featuringRequired = feature.getOwnedRelationship_comp().stream().
				filter(TypeFeaturing.class::isInstance).
				map(TypeFeaturing.class::cast).
				noneMatch(f -> Objects.equals(f.getFeatureOfType(), feature)
						&& Objects.equals(f.getFeaturingType(), type));
			if (featuringRequired) {
				TypeFeaturing featuring = SysMLFactory.eINSTANCE.createTypeFeaturing();
				featuring.setFeaturingType(type);
				featuring.setFeatureOfType(feature);
				feature.getOwnedRelationship_comp().add(featuring);
			}
		});
	}
	
	public static void addImplicitBindingConnectors(Type type) {
		List<Membership> addedMemberships = new ArrayList<>();
		((TypeImpl)type).forEachImplicitBindingConnector((connector, eClass)->{
			if (eClass == SysMLPackage.Literals.FEATURE_MEMBERSHIP) {
				addedMemberships.add(TransformerUtil.addOwnedFeatureTo(type, connector));
			} else {
				addedMemberships.add(TransformerUtil.addOwnedMemberTo(type, connector));
			}
		});
		((TypeImpl)type).cleanImplicitBindingConnectors();
		// This is required as the owned relationships call of the type will not return
		// the newly created binding connectors so we have to ensure the transform
		// function is used appropriately
		for (Membership m : addedMemberships) {
			transformAll(m.getMemberElement(), true);
		}
	}
	
}
