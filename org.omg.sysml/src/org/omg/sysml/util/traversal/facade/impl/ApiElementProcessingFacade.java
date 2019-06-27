/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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

import java.util.UUID;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.api.ElementApi;
import org.omg.sysml.api.ModelApi;
import org.omg.sysml.api.RelationshipApi;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
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
	 * The base path to be used to access the REST end point.
	 */
	public final String BASE_PATH = "http://sysml2.intercax.com:9000";
	
	private final ApiClient apiClient = new ApiClient();
	private final ElementApi elementApi = new ElementApi(apiClient);
	private final RelationshipApi relationshipApi = new RelationshipApi(apiClient);
	private final ModelApi modelApi = new ModelApi(apiClient);

	private final org.omg.sysml.model.Model parentModel;
	private Traversal traversal;

	/**
	 * Create a facade for processing the Elements of a model with the given name. A model with that name
	 * is created in the repository, and subsequently processed Elements are added to that model.
	 * 
	 * @param 	modelName			the name of the model for which Elements are being saved
	 * @throws 	ApiException
	 */
	public ApiElementProcessingFacade(String modelName) throws ApiException {
		this.apiClient.setBasePath(BASE_PATH);
		org.omg.sysml.model.Model model = new org.omg.sysml.model.Model();
		model.setName(modelName);
		this.parentModel = modelApi.createModel(model);
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
	 * Get a string representation of the UUID of the model as it is saved in the repository.
	 * 
	 * @return	the UUID of the model saved in the repository
	 */
	public String getModelId() {
		return this.parentModel.getIdentifier().toString();
	}
	
	/**
	 * Initialize the given API Element from the given source model Element.
	 * 
	 * @param 	apiElement			the Element as it is represented in the API
	 * @param 	modelElement		the Element as it is represented in Ecore
	 * @return	the repository Element
	 */
	protected <T extends org.omg.sysml.model.Element> T initialize(T apiElement, Element modelElement) {
		apiElement.setName(modelElement.getName());
		apiElement.setDescription(descriptionOf(modelElement));
		apiElement.setType(modelElement.eClass().getName());
		apiElement.setParentModel(this.parentModel.getIdentifier());
//		System.out.println("... name = " + apiElement.getName() + 
//				" type = " + apiElement.getType() + 
//				" parentModel = " + apiElement.getParentModel());
		return apiElement;
	}
	
	/**
	 * Use the API to save the given source model Element to the repository. Return the data for the Element
	 * as it was saved in the repository. Note that the given model Element should not be a Relationship.
	 * 
	 * @param 	modelElement		the source model Element as it is represented in Ecore
	 * @return	the Element as saved in the repository, as it is represented in the API
	 * @throws 	ApiException
	 */
	protected org.omg.sysml.model.Element createElement(Element modelElement) throws ApiException {
		return  elementApi.createElement(this.initialize(new org.omg.sysml.model.Element(), modelElement));
	}

	/**
	 * Use the API to save the given source model Relationship to the repository. Return the data for the Relationship
	 * as it was saved in the repository.
	 * 
	 * @param 	modelRelationship	the source model Relationship as it is represented in Ecore
	 * @return	the Relationship as saved in the repository, as it is represented in the API
	 * @throws 	ApiException
	 */
	protected org.omg.sysml.model.Relationship createRelationship(Relationship modelRelationship) throws ApiException {
		org.omg.sysml.model.Relationship repositoryRelationship = this.initialize(new org.omg.sysml.model.Relationship(), modelRelationship);
		EList<Element> source = modelRelationship.getSource();
		if (!source.isEmpty()) {
			Object identifier = traversal.getIdentifier(modelRelationship.getSource().get(0));
			if (identifier instanceof UUID) {
				repositoryRelationship.setSourceElementRole("source");
				repositoryRelationship.setSourceElement((UUID)identifier);
			}
		}
		EList<Element> target = modelRelationship.getTarget();
		if (!target.isEmpty()) {
			Object identifier = traversal.getIdentifier(modelRelationship.getTarget().get(0));
			if (identifier instanceof UUID) {
				repositoryRelationship.setTargetElementRole("target");
				repositoryRelationship.setTargetElement((UUID)identifier);
			}
		}
		return  relationshipApi.createRelationship(repositoryRelationship);
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
	 * @param 	element				the Element to be processed (this should not be a Relationship)
	 * @return	a unique identifier for the processed Element
	 */
	@Override
	public Object processElement(Element element) {
		try {
			System.out.println("Saving element " + descriptionOf(element));
			UUID identifier = this.createElement(element).getIdentifier();
			System.out.println("... element id is " + identifier);
			return identifier;
		} catch (ApiException e) {
			System.out.println("Error: " + e.getCode() + " " + e.getMessage());
			return Integer.toHexString(element.hashCode());
		}
	}

	/**
	 * Save the given Relationship to the repository and, if successful, return the UUID created for it.
	 * If there is an exception while saving the element, return an identifier based on the
	 * Relationship hash code, so that the Element can still be recorded as having been visited.
	 * 
	 * @param 	relationship	the Relationship to be processed
	 * @return	a unique identifier for the processed Relationship
	 */
	@Override
	public Object processRelationship(Relationship relationship) {
		try {
			System.out.println("Saving relationship " + descriptionOf(relationship));
			UUID identifier = this.createRelationship(relationship).getIdentifier();
			System.out.println("... relationship id is " + identifier);
			return identifier;
		} catch (ApiException e) {
			System.out.println("Error: " + e.getCode() + " " + e.getMessage());
			return Integer.toHexString(relationship.hashCode());
		}
	}

}
