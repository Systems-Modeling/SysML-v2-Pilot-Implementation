/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2022 Model Driven Solutions, Inc.
 * Copyright (c) 2021 Twingineer LLC
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
 *  Ivan Gomes
 * 
 *****************************************************************************/
package org.omg.sysml.util.traversal.facade.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.model.DataIdentity;
import org.omg.sysml.model.DataVersion;
import org.omg.sysml.model.Identified;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

/**
 * This is an element-processing facade that uses the SysML v2 REST API client to export Elements to JSON.
 * A list of DataVersions is constructed during traversal of the model. Once the traversal is
 * completed, this change set can be exported to JSON.
 * 
 * @author Ed Seidewitz
 * @author Ivan Gomes
 *
 */
public class JsonElementProcessingFacade implements ElementProcessingFacade {

	private static final int ELEMENTS_PER_DOT = 100;
	private static final int DOTS_PER_LINE = 50;

	private Traversal traversal;
	
	protected boolean isIncludeDerived = false;
	protected boolean isVerbose = false;
	protected int elementCount = 0;
	protected int dotCount = 0;
	
	private final List<DataVersion> versions = new ArrayList<>();
	private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	/**
	 * Set the source SysML model traversal.
	 * 
	 * @param 	traversal			the source SysML model traversal from which Elements are being saved
	 */
	public void setTraversal(Traversal traversal) {
		this.traversal = traversal;
	}
	
	/**
	 * Get the source SysML model traversal.
	 * 
	 * @return	the source SysML model traversal from which Elements are being saved
	 */
	public Traversal getTraversal() {
		return this.traversal;
	}
	
	/**
	 * Set whether the facade prints a detailed trace of what is being traversed.
	 * 
	 * @param 	isVerbose		whether verbose mode is to be activated
	 */
	public void setIsVerbose(boolean isVerbose) {
		this.isVerbose = isVerbose;
	}
	
	/**
	 * Return whether verbose mode is active.
	 * 
	 * @return whether verbose mode is active
	 */
	public boolean isVerbose() {
		return this.isVerbose;
	}
	
	/**
	 * Set whether derived features are processed.
	 * 
	 * @param	isincludeDerived	whether derived features are processed
	 */
	public void setIsIncludeDerived(boolean isIncludeDerived) {
		this.isIncludeDerived = isIncludeDerived;
	}
	
	/**
	 * Return whether derived features are being processed.
	 * 
	 * @return whether derived features are being processed
	 */
	public boolean isIncludeDerived() {
		return this.isIncludeDerived;
	}

	/**
	 * Return the collection of DataVersions that have been created from
	 * processed model Elements.
	 * 
	 * @return	the collection of DataVersions that have been created 
	 */
	List<DataVersion> getVersions() {
		return Collections.unmodifiableList(this.versions);
	}
	
	/**
	 * Add a DataVersion to the collection.
	 * 
	 * @param 	elementVersion	the DataVersion to be added to the collection
	 */
	protected void addVersion(DataVersion elementVersion) {
		this.versions.add(elementVersion);
	}
	
	/**
	 * Create an Identified object with the given identifier.
	 * 
	 * @param 	identifier			the UUID of the object being identified
	 * @return	an Identified object with the given identifier
	 */
	protected static Identified identified(UUID identifier) {
		return new Identified().atId(identifier);
	}
	
	/**
	 * Create an Identified object containing the identifier of the given element.
	 * 
	 * @param 	element				the Element to be identified
	 * @return	an Identified object for the given Element (or null if the input is null).
	 */
	protected Identified getIdentified(Element element) {
		return element == null? null: identified(UUID.fromString(element.getElementId()));
	}
	
	/**
	 * Create a list of Identified objects corresponding to the identifiers of a given list of Elements.
	 * 
	 * @param 	elements			the Elements being identified
	 * @return	a list of Identified objects with the identifiers of the given elements
	 */
	protected List<Identified> getIdentified(List<Element> elements) {
		return elements.stream().
				map(this::getIdentified).
				filter(id->id != null).
				collect(Collectors.toList());
	}

	/**
	 * Create a DataVersion for the given model Element including the values of all its non-derived  
	 * attributes (unless it is a library model element, in which case only its non-referential attribute values 
	 * are included). If isIncludeDerived is true, also include derived attributes. The ID for the DataVersion 
	 * uses the identifier from the model Element.
	 * 
	 * @param 	element				the source model Element as it is represented in Ecore
	 * @return	a DataVersion with the API representation of the given Element as its data
	 */
	@SuppressWarnings("unchecked")
	protected org.omg.sysml.model.DataVersion createElementVersion(Element element) {
		org.omg.sysml.model.Data apiElement = new org.omg.sysml.model.Data();
		EClass eClass = element.eClass();
		apiElement.put("@type", eClass.getName());
		boolean isLibraryElement = ElementUtil.isStandardLibraryElement(element);
		for (EStructuralFeature feature: eClass.getEAllStructuralFeatures()) {
			String className = eClass.getName();
			String featureName = feature.getName();
			if ((this.isIncludeDerived() || !feature.isDerived()) && 
					// Skip implementation-specific features.
					!("Feature".equals(className) && "isNonunique".equals(featureName) || 
					  "OperatorExpression".equals(className) && "operand".equals(featureName) || 
					  apiElement.containsKey(featureName))) {
				Object value = element.eGet(feature);
				if (value != null) {
					if (feature instanceof EReference) {
						value = isLibraryElement? null:
								feature.isMany()?
									getIdentified((List<Element>)value):
									getIdentified((Element)value);
					} else if (feature.getEType() instanceof EEnum) {
						if (feature.isMany()) {
							value = ((List<Element>)value).stream().
									map(v->v == null? null: v.toString()).
									collect(Collectors.toList());
						} else {
							value = value.toString();
						}
					}
				}
				apiElement.put(featureName, value);
			}
		}
		return new DataVersion().payload(apiElement).
				identity(new DataIdentity().atId(UUID.fromString(element.getElementId())));
	}
	
	/**
	 * Create a description of the given SysML model Element, for use in logging.
	 * 
	 * @param 	element				the Element to be described
	 * @return	a description of the Element, in terms of its EClass name, hash code, Element name 
	 * 			and whether it is a proxy.
	 */
	public static String descriptionOf(Element element) {
		String s = element.eClass().getName();
		String name = element.getDeclaredName();
		if (name != null) {
			s += " (" + name + ")";
		}		
		if (element.eIsProxy()) {
			s += " PROXY";
		}
		return s + " " + element.getElementId();
	}
	
	/**
	 * Record that the given Element is being processed by returning a UUID constructed
	 * from its identifier.
	 * 
	 * @param 	element				the Element to be processed
	 * @return	a unique identifier for the processed Element
	 */
	@Override
	public Object process(Element element) {
		if (this.isVerbose()) {
			System.out.println("Processing " + descriptionOf(element));
		} else {
			if (elementCount == ELEMENTS_PER_DOT) {
				System.out.print(".");
				elementCount = 0;
				dotCount++;
				if (dotCount == DOTS_PER_LINE) {
					System.out.println();
					dotCount = 0;
				}
			}
			elementCount++;
		}
		return UUID.fromString(element.getElementId());
	}
	
	/**
	 * Post-process the given Element by creating a DataVersion for it and adding that
	 * to the change set being constructed. This is done as a post-processing step so that
	 * derived references to library model Elements not included in the change set can be
	 * excluded.
	 * 
	 * @param 	element				the Element to be post-processed
	 */
	@Override
	public void postProcess(Element element) {
		this.addVersion(this.createElementVersion(element));
	}
	
	public String toJson() {
		return gson.toJson(versions);
	}
	
	public JsonElement toJsonTree() {
		return gson.toJsonTree(versions);
	}
}
