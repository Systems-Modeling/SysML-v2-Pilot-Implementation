/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2020 Model Driven Solutions, Inc.
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
import org.omg.sysml.api.CommitApi;
import org.omg.sysml.api.ProjectApi;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.model.Commit;
import org.omg.sysml.model.ElementIdentity;
import org.omg.sysml.model.ElementVersion;
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
	public static final String DEFAULT_BASE_PATH = "http://sysml2-dev.intercax.com:9000";
	
	private static final int MAX_DOT_COUNT = 100;
	
	private final ApiClient apiClient = new ApiClient();
	private final ProjectApi projectApi = new ProjectApi(apiClient);
	private final CommitApi commitApi = new CommitApi(apiClient);

	private final org.omg.sysml.model.Project project;
	private Traversal traversal;
	
	private boolean isVerbose = false;
	private int dotCount = 0;

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
		project.setName(projectName);
		this.project = projectApi.postProject(project);
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
	 * Get a string representation of the UUID of the project as it is saved in the repository.
	 * 
	 * @return	the UUID of the project saved in the repository
	 */
	public String getProjectId() {
		return this.project.getId().toString();
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
	 * @param 	element				the Element to be identified
	 * @return	an Identified object the the given Element (or null if the input is null).
	 */
	private Identified getIdentified(Element element) {
		return element == null? null: identified(UUID.fromString(element.getIdentifier()));
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
	 * Use the API to save the given source model Element to the repository. Return the data for the Element
	 * as it was saved in the repository.
	 * 
	 * @param 	modelElement		the source model Element as it is represented in Ecore
	 * @return	the Element as saved in the repository, as it is represented in the API
	 * @throws 	ApiException
	 */
	@SuppressWarnings("unchecked")
	protected org.omg.sysml.model.ElementVersion createElementVersion(Element element) {
		org.omg.sysml.model.Element apiElement = new org.omg.sysml.model.Element();
		EClass eClass = element.eClass();
		apiElement.put("@type", eClass.getName());
		boolean isLibraryElement = SysMLLibraryUtil.isModelLibrary(element.eResource());
		for (EStructuralFeature feature: eClass.getEAllStructuralFeatures()) {
			String name = feature.getName();
			if (name == null || !(name.endsWith("_comp") || apiElement.containsKey(name))) {
				Object value = element.eGet(feature);
				if (feature instanceof EReference) {
					value = isLibraryElement? null:
							feature.isMany()?
								getIdentified((List<Element>)value):
								getIdentified((Element)value);
				}
				apiElement.put(feature.getName(), value);
			}
		}
		return new ElementVersion().data(apiElement).
				identity(new ElementIdentity().id(UUID.fromString(element.getIdentifier())));
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
		String name = element.getName();
		if (name != null) {
			s += " (" + name + ")";
		}		
		if (element.eIsProxy()) {
			s += " PROXY";
		}
		return s + " " + element.getIdentifier();
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
		if (this.isVerbose()) {
			System.out.println("Saving " + descriptionOf(element));
		} else {
			if (dotCount == MAX_DOT_COUNT) {
				System.out.println();
				dotCount = 0;
			}
			System.out.print(".");
			dotCount++;
		}
		return this.createElementVersion(element);
	}
	
	public void commit() {
		List<ElementVersion> changeSet = this.traversal.getIdentifiers().stream().
				map(ElementVersion.class::cast).collect(Collectors.toList());
		try {
			Commit commit = new Commit().changes(changeSet);
			if (this.isVerbose()) {
				System.out.println(commit);
				System.out.print("\nPosting Commit... ");
			}
			commit = this.commitApi.postCommitByProject(this.project.getId(), commit);
			if (this.isVerbose()) {
				System.out.println(commit.getId());
			}
		} catch (ApiException e) {
			System.out.println("\nError: " + e.getCode() + " " + e.getMessage());
		}
	}
}
