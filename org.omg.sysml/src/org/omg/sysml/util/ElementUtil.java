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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.ElementImpl;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.lang.sysml.impl.TypeImpl;

public class ElementUtil {
	
	public static void transform(Element element) {
		((ElementImpl)element).transform();
	}
	
	public static void addImplicitGeneralizations(Type type) {
		((TypeImpl)type).addImplicitGeneralizations();
	}
	
	public static void addImplicitTypeFeaturings(Feature feature) {
		((FeatureImpl)feature).addImplicitTypeFeaturing();
	}
	
	public static void addImplicitBindingConnectors(Type type) {
		List<Membership> addedMemberships = ((TypeImpl)type).addImplicitBindingConnectors();
		// This is required as the owned relationships call of the type will not return
		// the newly created binding connectors so we have to ensure the transform
		// function is used appropriately
		for (Membership m : addedMemberships) {
			transformAll(m.getMemberElement(), true);
		}
	}
	
	public static void transformAll(Element root, boolean generateImplicitElements) {
		if (generateImplicitElements && root instanceof Type) {
			addImplicitBindingConnectors((Type) root);
		}
		transform(root);
		for (Relationship relationship: root.getOwnedRelationship()) {
			transformAll(relationship, generateImplicitElements);
			for (Element element: relationship.getOwnedRelatedElement()) {
				transformAll(element, generateImplicitElements);
			}
		}
		if (generateImplicitElements && root instanceof Type) {
			addImplicitGeneralizations((Type)root);
		}
		if (generateImplicitElements && root instanceof Feature) {
			addImplicitTypeFeaturings((Feature)root);
		}
	}
	
	public static void transformAll(Resource resource, boolean generateImplicitElements) {
		for (EObject object: resource.getContents()) {
			if (object instanceof Element) {
				transformAll((Element)object, generateImplicitElements);
			}
		}
	}
	
	public static void transformAll(ResourceSet resourceSet, boolean generateImplicitElements) {
		for (Resource resource: resourceSet.getResources()) {
			transformAll(resource, generateImplicitElements);
		}
	}

}
