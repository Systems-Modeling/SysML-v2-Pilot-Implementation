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


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.MembershipImport;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.model.Element;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.repository.ProjectRepository.RepositoryProject;


public class RepositoryContentFetcher {
	
	private final EObjectUUIDTracker tracker;
	private final RepositoryProject repositoryProject;
	
	private static Set<String> disabledStructuralFeatures = Set.of("importedMembership", "memberName", "memberShortName");
	
	public RepositoryContentFetcher(RepositoryProject repositoryProject, EObjectUUIDTracker tracker) {
		this.repositoryProject = repositoryProject;
		this.tracker = tracker;
	}
	
	public ProjectDelta fetch() {
		repositoryProject.loadRemote();
		
		Map<EObject, Element> rootNamespaces = new HashMap<>(); 
		
		//traverse containment
		for (var projectRoot: repositoryProject.getProjectRoots()) {
			if (!Boolean.TRUE.equals(projectRoot.get("isLibraryElement"))) {
				EObject rootNamespace = transform(projectRoot);
				rootNamespaces.put(rootNamespace, projectRoot);
			}
		}
		
		//traverse cross-references, set attributes
		tracker.forEachTrackedUserElement((id, langElement) -> {
			Element element = repositoryProject.getElement(id);
			if (element != null && isNotStandardLibraryElement(langElement)) {
				tranformCrossreferences(langElement, element);
				tranformAttributes(langElement, element);
				//set importedMemberships for MembershipImports
				setImportedMembership(langElement, element);
			}
		});
		
		return new ProjectDelta(repositoryProject, rootNamespaces);
	}
	
	private EObject transform(Element dto) {
		Object uuid = dto.get("@id");
		
		assert uuid != null;
		
		Object typeField = dto.get("@type");
		
		final EClass typeClass = getTypeClass(typeField);
		
		assert typeClass != null;
		
		EObject langElement = tracker.createIfMissingAndTrack(uuid, id -> SysMLFactory.eINSTANCE.create(typeClass));
		
		if (canTransformInternals(langElement)) {
			transformContainmentReferences(langElement, dto);
		}
		
		return langElement;
	}
	
	private void setImportedMembership(EObject langElement, Element dto) {
		if (langElement instanceof MembershipImport membershipImport) {
			//use imported elements derived field instead of the importedMember feature reference.
			//this is a workaround to address library element proxies where UUIDs of referenced Memberships aren't stable,
			//so the importedElement UUID is used instead.
			Object importedMembers = dto.get("importedElement");
			EObject resolvedReference = resolveReference(importedMembers, false);
			if (resolvedReference != null) {
				membershipImport.setImportedMembership(((org.omg.sysml.lang.sysml.Element) resolvedReference).getOwningMembership());
			}
		}
	}

	private boolean canTransformInternals(EObject langElement) {
		return isNotStandardLibraryElement(langElement);
	}
	
	private EClass getTypeClass(Object typeField) {
		if (typeField instanceof String typeName) {
			return (EClass) SysMLPackage.eINSTANCE.getEClassifier(typeName); 
		}
		return null;
	}
	
	private boolean isNotStandardLibraryElement(EObject langElement) {
		return !ElementUtil.isStandardLibraryElement((org.omg.sysml.lang.sysml.Element) langElement);
	}

	private void transformContainmentReferences(EObject langElement, Element remoteElement) {
		for (EStructuralFeature feature: getStructuralFeatuers(langElement))
		{
			if (!feature.isDerived() && remoteElement.get(feature.getName()) != null) {
				if (feature instanceof EReference reference && reference.isContainment()) {
					transformStructuralFeature(langElement, remoteElement, reference, true, true);
				}
			}
		}
	}
	
	private void tranformCrossreferences(EObject langElement, Element remoteElement) {
		for (EStructuralFeature feature: getStructuralFeatuers(langElement))
		{
			if (!feature.isDerived() && remoteElement.containsKey(feature.getName())) {
				if (feature instanceof EReference reference) {
					transformStructuralFeature(langElement, remoteElement, reference, true, false);
				}
			}
		}
		
		if (langElement instanceof FeatureTyping ft) {
			ft.setTypedFeature(null);
		}
	}
	
	private void tranformAttributes(EObject langElement, Element remoteElement) {
		for (EStructuralFeature feature: getStructuralFeatuers(langElement))
		{
			if (!feature.isDerived() && remoteElement.containsKey(feature.getName())) {
				if (feature instanceof EAttribute reference) {
					transformStructuralFeature(langElement, remoteElement, reference, false, false);
				}
			}
		}
	}
	
	private static Collection<EStructuralFeature> getStructuralFeatuers(EObject langElement){
		EClass eClass = langElement.eClass();
		EList<EStructuralFeature> ownedFeatures = langElement.eClass().getEStructuralFeatures();
		return langElement.eClass().getEAllStructuralFeatures().stream().filter(f -> f.getEContainingClass() == eClass
				|| ownedFeatures.stream().noneMatch(of -> Objects.equals(of.getName(), f.getName()))).collect(Collectors.toList());
	}
	
	@SuppressWarnings("unchecked")
	private void transformStructuralFeature(EObject langElement,  Element remoteElement, EStructuralFeature feature, boolean isReference, boolean isContainment) {
		if (!disabledStructuralFeatures.contains(feature.getName())) {
			try {
				if (feature.isMany()) {
					var referenceList = (List<EObject>) langElement.eGet(feature, false);
					Object value = remoteElement.get(feature.getName());
					if (value instanceof Collection valueCollection) {
						for (Object referenceValue: valueCollection) {
							EObject referencedLangElement = resolveReference(referenceValue, isContainment);
							if (referencedLangElement != null) {
								referenceList.add(referencedLangElement);
							}
						}
					} 
				} else {
					Object value = remoteElement.get(feature.getName());
					if (value != null) {
						langElement.eSet(feature, isReference? resolveReference(value, isContainment) : transformAttributeValue(value, feature));
					}
				}
			}
			catch (Exception e) {
				System.out.printf("Unable to set structural feature %s::%s %n", feature.getEContainingClass().getName(), feature.getName());
			}
		}
	}
	
	private EObject resolveReference(Object referenceValue, boolean isContainment) {
		if (referenceValue instanceof Map referenceObjectMap) {
			Object refUUID = referenceObjectMap.get("@id");
			Element referencedElement = repositoryProject.getElement(refUUID);
			EObject referencedLangElement = isContainment? transform(referencedElement) : tracker.get(refUUID);
			return referencedLangElement;
		}
		return null;		
	}
	
	
	private Object transformAttributeValue(Object attributeValue, EStructuralFeature feature) {
		if (feature instanceof EAttribute attribute && attributeValue != null) {
				EDataType eAttributeType = attribute.getEAttributeType();
				
				final String value;
				
				if (eAttributeType.getName().equals("Integer")) {
					//in some cases the number returned is not in an integer format (e.g 0.0 instead of 0)
					//cast non-integer values to integer
					value = Integer.valueOf((int) Double.parseDouble(attributeValue.toString())).toString();
				} else {
					value = attributeValue.toString();
				}
			
				return EcoreUtil.createFromString(eAttributeType, value);
		}
		
		return null;		
	}
}
