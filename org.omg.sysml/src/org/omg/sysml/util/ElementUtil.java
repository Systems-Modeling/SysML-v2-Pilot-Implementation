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
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.omg.sysml.adapter.ElementAdapter;
import org.omg.sysml.adapter.ElementAdapterFactory;
import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;

public class ElementUtil {
	
	private ElementUtil() {
	}
	
	// General
	
	/**
	 * Converts a string literal or unrestricted name with escaped characters 
	 * into a string in which the escape sequences are replaced with the corresponding 
	 * represented characters. If the input string starts with a single or double quote
	 * character, it is assumed to be a lexically valid unrestricted name or string literal,
	 * respectively. Otherwise, the input string is returned without change.
	 */
	public static String unescapeString(String literal) {
		if (literal == null || literal.isEmpty() || 
				literal.charAt(0) != '"' && literal.charAt(0) != '\'') {
			return literal;
		} else {
			StringBuilder s = new StringBuilder();
			int i = 1;
			int j = literal.indexOf('\\', 1);
			while (j >= 0) {
				char c = literal.charAt(j + 1);
				s.append(literal.substring(i, j));
				s.append(
					c == 'b'? '\b':
					c == 't'? '\t':
					c == 'n'? '\n':
					c == 'f'? '\f':
					c == 'r'? '\r':
					c == '"'? '"':
					c == '\''? '\'':
					c == '\\'? '\\':
					' ');
				i = j + 2;
				j = literal.indexOf('\\', i);
			}
			int n = literal.length();
			if (n > 1) {
				s.append(literal.substring(i, n - 1));
			}
			return s.toString();
		}
	}
	
	/**
	 * Return a string that is the same as the input string,  but with escapable characters
	 * replaced by appropriate escape sequences.
	 */
	public static String escapeString(String str) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int c = "\b\t\n\f\r\"'\\".indexOf(str.charAt(i));
			if (c < 0) {
				s.append(str.charAt(i));
			} else {
				s.append('\\');
				s.append("btnfr\"'\\".charAt(c));
			}
		}
		return s.toString();
	}

	public static String escapeName(String name) {
		return (name == null || name.isEmpty() || isIdentifier(name))? name:
			   "'" + escapeString(name) + "'";	
	}

	public static boolean isIdentifier(String name) {
		return name.matches("[a-zA-Z_]\\w*");
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
	
	// Annotation
	
	/**
	 * Get all the AnnotatingFeatures relevant to this Element. By default, these are just those that
	 * are related to the Element by ownedAnnotations.
	 */
	public static List<AnnotatingFeature> getAllAnnotatingFeaturesOf(Element element) {
		List<AnnotatingFeature> annotatingFeatures =  element.getOwnedAnnotation().stream().
				map(Annotation::getAnnotatingElement).
				filter(AnnotatingFeature.class::isInstance).
				map(AnnotatingFeature.class::cast).
				collect(Collectors.toList());
		if (element instanceof Namespace) {
			/**
			 * Include AnnotatingFeatures that are members of a Namespace.
			 */
			(((Namespace)element).getOwnedMember()).stream().
				filter(AnnotatingFeature.class::isInstance).
				map(AnnotatingFeature.class::cast).
				filter(feature->feature.getAnnotatedElement().contains(element)).
				forEach(annotatingFeatures::add);
			}
		return annotatingFeatures;
	}

	public static String processCommentBody(String body) {
		if (body != null) {
			body = body.replaceFirst("/\\*\\*", "").replaceFirst("/\\*", "").replaceFirst("^\\s*", "");			
			if (body.endsWith("*/")) {
				body = body.substring(0, body.length()-2);
			}
			String[] lines = body.split("\\r?\\n");
			if (lines.length == 1) 
				body = lines[0];
			else {
				StringBuilder builder = new StringBuilder();
				for (int i = 0; i < lines.length; i++) {
					// Strip initial white space(not including line breaks) - 
					// by splitting no line breaks at the end
					String s = lines[i].replaceFirst("^\\s*", ""); 
					s = s.startsWith("*") ? (s.startsWith("* ")? s.replaceFirst("\\*\\s{1}", "") : s.replaceFirst("\\*", "")) : s;
					if (i != 0) {
						// Add back newline
						builder.append("\n");
					}
					builder.append(s);
				}
				body = builder.toString();
			}
		}
		return body;
	}

	// Adapters
	
	public static ElementAdapter getElementAdapter(Element target) {
		return ElementAdapterFactory.getAdapter(target);
	}
	
	public static void clean(Element element) {
		ElementAdapterFactory.removeAdapter(element);
	}
	
	public static void clearCachesOf(Element element) {
		getElementAdapter(element).clearCaches();
	}
	
	// Transformation 
	
	public static void transformAll(ResourceSet resourceSet, boolean addImplicitElements) {
		for (Resource resource: resourceSet.getResources()) {
			transformAll(resource, addImplicitElements);
		}
	}

	public static void transformAll(Resource resource, boolean addImplicitElements) {
		// Turn off derived state computation. Resource will be fully initialized
		// when this is done.
		((DerivedStateAwareResource)resource).setFullyInitialized(true);
		for (EObject object: resource.getContents()) {
			if (object instanceof Element) {
				transformAll((Element)object, addImplicitElements);
			}
		}
	}
	
	public static void transformAll(Element root, boolean addImplicitElements) {
		if (addImplicitElements && root instanceof Type) {
			TypeUtil.insertImplicitBindingConnectors((Type) root);
		}
		transform(root);
		for (Relationship relationship: root.getOwnedRelationship()) {
			transformAll(relationship, addImplicitElements);
			for (Element element: relationship.getOwnedRelatedElement()) {
				transformAll(element, addImplicitElements);
			}
		}
		if (addImplicitElements && root instanceof Type) {
			TypeUtil.insertImplicitGeneralizations((Type)root);
		}
		if (addImplicitElements && root instanceof Feature) {
			FeatureUtil.insertImplicitTypeFeaturings((Feature)root);
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

}
