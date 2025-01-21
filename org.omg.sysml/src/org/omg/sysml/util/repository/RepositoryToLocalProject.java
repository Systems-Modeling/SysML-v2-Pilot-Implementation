/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.util.repository;


import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.model.Element;

import com.google.common.primitives.Primitives;


public class RepositoryToLocalProject {
	
	private final String localProjectPath;
	private final Map<Resource, Element> resourceToProjectRoot = new HashMap<>();
	private final Map<Object, EObject> uuidToLangElement = new HashMap<>();
	private final RepositoryProject repositoryProject;
	
	public RepositoryToLocalProject(RepositoryProject repositoryProject, String localProjectPath) {
		this.localProjectPath = localProjectPath;
		this.repositoryProject = repositoryProject;
	}
	
	public void transform(ResourceSet rs) {
		for (var projectRoot: repositoryProject.getProjectRoots()) {
			Object rootId = projectRoot.get("@id");
			URI uri = URI.createFileURI(localProjectPath + "/" + rootId + ".xmi");
			Resource resource = rs.createResource(uri);
			resourceToProjectRoot.put(resource, projectRoot);
			
			EObject rootNamespace = transform(projectRoot);
			resource.getContents().add(rootNamespace);
			
			uuidToLangElement.put(rootId, rootNamespace);
		}
		
		uuidToLangElement.forEach((id, langElement) -> {
			Element element = repositoryProject.getElement(id);
			tranformCrossreferences(langElement, element);
		});
		
		uuidToLangElement.forEach((id, langElement) -> {
			Element element = repositoryProject.getElement(id);
			tranformAttributes(langElement, element);
		});
		
		System.out.println("Saving project");
		
		try {
			for (var r : rs.getResources()) {
				r.save(Collections.EMPTY_MAP);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private EObject transform(Element dto) {
		Object uuid = dto.get("@id");
		
		assert uuid != null;
		
		Object typeField = dto.get("@type");
		
		final EClass typeClass = getTypeClass(typeField);
		
		assert typeClass != null;
		
		EObject langElement = uuidToLangElement.computeIfAbsent(uuid, id -> SysMLFactory.eINSTANCE.create(typeClass));
		
		transformContainmentReferences(langElement, dto);
		
		return langElement;
	}
	
	private EClass getTypeClass(Object typeField) {
		if (typeField instanceof String typeName) {
			return (EClass) SysMLPackage.eINSTANCE.getEClassifier(typeName); 
		}
		return null;
	}

	private void transformContainmentReferences(EObject langElement, Element remoteElement) {
		for (EStructuralFeature feature: langElement.eClass().getEAllStructuralFeatures())
		{
			if (!feature.isDerived() && remoteElement.get(feature.getName()) != null) {
				if (feature instanceof EReference reference && reference.isContainment()) {
					transformStructuralFeature(langElement, remoteElement, reference, true, true);
				}
			}
		}
	}
	
	private void tranformCrossreferences(EObject langElement, Element remoteElement) {
		for (EStructuralFeature feature: langElement.eClass().getEAllStructuralFeatures())
		{
			if (!feature.isDerived() && remoteElement.containsKey(feature.getName())) {
				if (feature instanceof EReference reference) {
					transformStructuralFeature(langElement, remoteElement, reference, true, false);
				}
			}
		}
	}
	
	private void tranformAttributes(EObject langElement, Element remoteElement) {
		for (EStructuralFeature feature: langElement.eClass().getEAllStructuralFeatures())
		{
			if (!feature.isDerived() && remoteElement.containsKey(feature.getName())) {
				if (feature instanceof EAttribute reference) {
					transformStructuralFeature(langElement, remoteElement, reference, false, false);
				}
			}
		}
	}

	private void transformStructuralFeature(EObject langElement,  Element remoteElement, EStructuralFeature feature, boolean isReference, boolean isContainment) {
		try {
			if (feature.isMany()) {
				var referenceList = (List<EObject>) langElement.eGet(feature, false);
				Object value = remoteElement.get(feature.getName());
				if (value instanceof Collection valueCollection) {
					for (Object referenceValue: valueCollection) {
						EObject referencedLangElement = transformReferenceValue(referenceValue, isContainment);
						referenceList.add(referencedLangElement);
					}
				} 
			} else {
				Object value = remoteElement.get(feature.getName());
				langElement.eSet(feature, isReference? transformReferenceValue(value, isContainment) : transformAttributeValue(value, feature));
			}
		}
		catch (Exception e) {
			System.out.printf("Unable to set structural feature %s::%s %n", feature.getEContainingClass().getName(), feature.getName());
		}
	}
	
	
	private EObject transformReferenceValue(Object referenceValue, boolean isContainment) {
		if (referenceValue instanceof Map referenceObjectMap) {
			Object refUUID = referenceObjectMap.get("@id");
			Element referencedElement = repositoryProject.getElement(refUUID);
			EObject referencedLangElement = isContainment? transform(referencedElement) : uuidToLangElement.get(refUUID);
			return referencedLangElement;
		}
		return null;		
	}
	
	private static List<String> disabledAttributes = List.of("elementId");
	
	private Object transformAttributeValue(Object attributeValue, EStructuralFeature feature) {
		
		if (feature instanceof EAttribute attribute && !disabledAttributes.contains(attribute.getName()) && attributeValue != null) {
			return EcoreUtil.createFromString(attribute.getEAttributeType(), attributeValue.toString());
		}
		
		return null;		
	}
}
