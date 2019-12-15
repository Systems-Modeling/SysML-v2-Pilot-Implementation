/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Project Driven Solutions, Inc.
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
package org.omg.sysml.util.traversal.facade.impl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.api.ElementApi;
import org.omg.sysml.api.ProjectApi;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.model.Identified;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

/**
 * This is an element-processing facade that uses the SysML v2 REST API to write Elements to a repository.
 * 
 * @author Ed Seidewitz
 *
 */
public class ApiElementProcessingFacade implements ElementProcessingFacade {

	/**
	 * The default base path for accessing the REST end point.
	 */
	public static final String DEFAULT_BASE_PATH = "http://sysml2.intercax.com:9000";
	
	private final ApiClient apiClient = new ApiClient();
	private final ElementApi elementApi = new ElementApi(apiClient);
	private final ProjectApi projectApi = new ProjectApi(apiClient);

	private final org.omg.sysml.model.Project project;
	private Traversal traversal;

	/**
	 * Create a facade for processing the Elements of a project with the given name. A project with that name
	 * is created in the repository, and subsequently processed Elements are added to that project.
	 * 
	 * @param 	projectName			the name of the project for which Elements are being saved
	 * @param	basePath			the base path to be used to access the REST end point.
	 * @throws 	ApiException
	 */
	public ApiElementProcessingFacade(String projectName, String basePath) throws ApiException {
		this.apiClient.setBasePath(basePath);
		org.omg.sysml.model.Project project = new org.omg.sysml.model.Project();
		project.setAtType("Project");
		project.setName(projectName);
		this.project = projectApi.createProject(project);
	}
	
	/**
	 * Create a facade for processing the Elements of a model with the given name using the default base path.
	 * 
	 * @param 	projectName			the name of the project for which Elements are being saved
	 * @throws 	ApiException
	 */
	public ApiElementProcessingFacade(String projectName) throws ApiException {
		this(projectName, DEFAULT_BASE_PATH);
	}
	
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
	 * Get a string representation of the UUID of the project as it is saved in the repository.
	 * 
	 * @return	the UUID of the project saved in the repository
	 */
	public String getProjectId() {
		return this.project.getIdentifier().toString();
	}
	
	/**
	 * Create an Identified object with the given identifier.
	 * 
	 * @param 	identifier			the UUID of the object being identified
	 * @return	an Identified object with the given identifier
	 */
	private static Identified identified(UUID identifier) {
		return new Identified().identifier(identifier);
	}
	
	/**
	 * Create an Identified object containing the identifier of the given element.
	 * 
	 * @param element
	 * @return
	 */
	private Identified getIdentified(Element element) {
		Object identifier = this.traversal.getIdentifier(element);
		return identifier instanceof UUID? identified((UUID)identifier): null;
	}
	
	/**
	 * Create a list of Identified objects corresponding to the identifiers of a given list of Elements.
	 * 
	 * @param 	elements			the Elements being identified
	 * @return	a list of Identified objects with the identifiers of the given elements
	 */
	private List<Identified> getIdentified(List<Element> elements) {
		return elements.stream().
				map(this::getIdentified).
				filter(id->id != null).
				collect(Collectors.toList());
	}

	/**
	 * Return a new API Element initialized with type, containing Project and name from the given 
	 * source model Element.
	 * 
	 * @param 	modelElement		the Element as it is represented in Ecore
	 * @return	the Element as it is represented in the API
	 */
	protected org.omg.sysml.model.Element initialize(Element modelElement) {
		org.omg.sysml.model.Element apiElement = new org.omg.sysml.model.Element();
		apiElement.put("@type", modelElement.eClass().getName());
		apiElement.put("containingProject", identified(this.project.getIdentifier()));
		apiElement.put("name", modelElement.getName());
		return apiElement;
	}
	
	/**
	 * Use the API to save the given source model Element to the repository. Return the data for the Element
	 * as it was saved in the repository.
	 * 
	 * @param 	modelElement		the source model Element as it is represented in Ecore
	 * @return	the Element as saved in the repository, as it is represented in the API
	 * @throws 	ApiException
	 */
	protected org.omg.sysml.model.Element createElement(org.omg.sysml.model.Element apiElement) {
		try {
			return this.elementApi.createElement(apiElement);
		} catch (ApiException e) {
			System.out.println();
			if (e.getCode() >= 500) {
				throw new RuntimeException("Error: " + e.getCode() + " " + e.getMessage());
			} else {
				System.out.println("Error: " + e.getCode() + " " + e.getMessage());
				return null;
			}
		}
	}
	
	/**
	 * Create a description of the given SysML model Element, for use in logging.
	 * 
	 * @param 	element				the Element to be described
	 * @return	a description of the Element, in terms of its EClass name, hash code, Element name 
	 * 			and whether it is a proxy.
	 */
	public static String descriptionOf(Element element) {
		String s = element.eClass().getName() + "@" + Integer.toHexString(element.hashCode());
		String name = element.getName();
		if (name != null) {
			s += " (" + name + ")";
		}
		
		if (element.eIsProxy()) {
			s += " PROXY";
		}
		return s;
	}
	
	/**
	 * Save the given Element to the repository and, if successful, return the UUID created for it.
	 * If there is an exception while saving the element, return an identifier based on the
	 * Element hash code, so that the Element can still be recorded as having been visited.
	 * 
	 * @param 	element				the Element to be processed
	 * @return	a unique identifier for the processed Element
	 */
	@Override
	public Object process(Element element) {
		System.out.print("Saving " + descriptionOf(element) + "... ");
		Object identifier = UUID.fromString((String)this.createElement(this.initialize(element)).get("identifier"));
		if (identifier == null) {
			identifier = Integer.toHexString(element.hashCode());
		}
		System.out.println("id is " + identifier);
		return identifier;
	}

	/**
	 * Post-process the given Element by updating its record in the repository with the values of 
	 * all its attributes. This is done as a post-processing step so that any referenced Elements
	 * will already have been visited and have generated identifiers.
	 * 
	 * @param 	element				the Element to be post-processed
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void postProcess(Element element) {
		org.omg.sysml.model.Element apiElement = new org.omg.sysml.model.Element();
		EClass eClass = element.eClass();
		apiElement.put("@type", eClass.getName());
		apiElement.put("identifier", this.traversal.getIdentifier(element).toString());
		apiElement.put("containingProject", identified(this.project.getIdentifier()));
		for (EStructuralFeature feature: eClass.getEAllStructuralFeatures()) {
			String name = feature.getName();
			if (!apiElement.containsKey(name) && 
					// TODO: Remove the line below when the API is fixed.
					!"feature".equals(name) && !"bound".equals(name)) {
				Object value = element.eGet(feature);
				if (feature instanceof EReference) {
					value = feature.isMany()?
						getIdentified((List<Element>)value):
						getIdentified((Element)value);
				}
				apiElement.put(feature.getName(), value);
			}
		}
		this.createElement(apiElement);
	}

}
