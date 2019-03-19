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

public class ApiElementProcessingFacade implements ElementProcessingFacade {

	public final String BASE_PATH = "http://sysml2.intercax.com:9000";
	
	private final ApiClient apiClient = new ApiClient();
	private final ElementApi elementApi = new ElementApi(apiClient);
	private final RelationshipApi relationshipApi = new RelationshipApi(apiClient);
	private final ModelApi modelApi = new ModelApi(apiClient);

	private final org.omg.sysml.model.Model parentModel;
	private Traversal traversal;

	public ApiElementProcessingFacade(String modelName) throws ApiException {
		this.apiClient.setBasePath(BASE_PATH);
		org.omg.sysml.model.Model model = new org.omg.sysml.model.Model();
		model.setName(modelName);
		this.parentModel = modelApi.createModel(model);
	}
	
	public void setTraversal(Traversal traversal) {
		this.traversal = traversal;
	}
	
	public Traversal getTraversal() {
		return this.traversal;
	}
	
	public String getModelId() {
		return this.parentModel.getIdentifier().toString();
	}
	
	protected <T extends org.omg.sysml.model.Element> T initialize(T repositoryElement, Element modelElement) {
		repositoryElement.setName(modelElement.getName());
		repositoryElement.setType(modelElement.eClass().getName());
		repositoryElement.setParentModel(this.parentModel.getIdentifier());
//		System.out.println("... name = " + repositoryElement.getName() + 
//				" type = " + repositoryElement.getType() + 
//				" parentModel = " + repositoryElement.getParentModel());
		return repositoryElement;
	}
	
	protected org.omg.sysml.model.Element createElement(Element modelElement) throws ApiException {
		return  elementApi.createElement(this.initialize(new org.omg.sysml.model.Element(), modelElement));
	}

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
