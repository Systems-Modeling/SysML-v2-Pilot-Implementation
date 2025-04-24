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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

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

/**
 * Class responsible for downloading project contents from the repository
 * and transforming the otherwise flat data structure to a hierarchical one.
 * UUID based cross-references are also resolved during this process using
 * the {@link EObjectUUIDTracker} which serves as an index. The tracker can be
 * pre-populated with local objects enabling resolution between local and the repository models. 
 */
public class RepositoryContentFetcher {
	
	private final EObjectUUIDTracker tracker;
	private final RepositoryProject repositoryProject;
	
	private static Set<String> disabledStructuralFeatures = Set.of("importedMembership");
	
	private final List<Issue> issues = new LinkedList<>();
	
	/**
	 * @param repositoryProject as the input
	 * @param tracker index based on element UUIDs
	 */
	public RepositoryContentFetcher(RepositoryProject repositoryProject, EObjectUUIDTracker tracker) {
		this.repositoryProject = repositoryProject;
		this.tracker = tracker;
	}
	
	/**
	 * Initiates the download of the repository project. Then transforms the project contents
	 * from a flat data structure to a hierarchical one while also resolving UUID based cross-references.
	 * 
	 * @return project diff. (currently just a container for the entire model downloaded from the project)
	 */
	public ProjectDelta fetch() {
		issues.clear();
		boolean success = repositoryProject.loadRemote();
		
		if (!success) throw new RuntimeException("Couldn't download project: " + repositoryProject.getProjectName());
		
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
				transformCrossReferences(langElement, element);
				transformAttributes(langElement, element);
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
		
		EObject langElement = tracker.createIfMissingAndTrack(UUID.fromString(uuid.toString()), id -> SysMLFactory.eINSTANCE.create(typeClass));
		
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
			resolveReference(importedMembers, false).ifPresent(resolvedReference -> {
				membershipImport.setImportedMembership(((org.omg.sysml.lang.sysml.Element) resolvedReference).getOwningMembership());
			});
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
		for (EStructuralFeature feature: getStructuralFeatures(langElement))
		{
			if (!feature.isDerived() && remoteElement.get(feature.getName()) != null) {
				if (feature instanceof EReference reference && reference.isContainment()) {
					transformStructuralFeature(langElement, remoteElement, reference, true, true);
				}
			}
		}
	}
	
	private void transformCrossReferences(EObject langElement, Element remoteElement) {
		for (EStructuralFeature feature: getStructuralFeatures(langElement))
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
	
	private void transformAttributes(EObject langElement, Element remoteElement) {
		for (EStructuralFeature feature: getStructuralFeatures(langElement))
		{
			if (!feature.isDerived() && remoteElement.containsKey(feature.getName())) {
				if (feature instanceof EAttribute reference) {
					transformStructuralFeature(langElement, remoteElement, reference, false, false);
				}
			}
		}
	}
	
	private static Collection<EStructuralFeature> getStructuralFeatures(EObject langElement){
		EClass eClass = langElement.eClass();
		
		Set<EObject> allRedefined = eClass.getEAllStructuralFeatures().stream()
				.map(f -> f.getEAnnotation("redefines")).filter(Objects::nonNull)
				.flatMap(a -> a.getReferences().stream()).collect(Collectors.toSet());
		
		return eClass.getEAllStructuralFeatures().stream().filter(f -> !allRedefined.contains(f)).collect(Collectors.toList());
	}
	

	private void transformStructuralFeature(EObject langElement,  Element remoteElement, EStructuralFeature feature, boolean isReference, boolean isContainment) {
		
		if (disabledStructuralFeatures.contains(feature.getName())) {
			return;
		}
		
		try {
			if (feature.isMany()) {
				Object value = remoteElement.get(feature.getName());
				transformAndAddFeatureValues(langElement, feature, isReference, isContainment, value);
			} else {
				Object value = remoteElement.get(feature.getName());
				transformAndSetFeatureValue(langElement, feature, isReference, isContainment, value);
			}
		} catch (IllegalArgumentException e) {
			// handle EObject.eGet, eSet errors
			issues.add(new Issue(String.format("Unable to set structural feature %s because %s ha no such feature or feature is not changable.",
					feature.getName(), feature.getEType().getName())));
		}
	}
	
	private void transformAndSetFeatureValue(EObject langElement, EStructuralFeature feature, boolean isReference, boolean isContainment,  Object valueToTransform) {
		if (valueToTransform != null) {
			langElement.eSet(feature, isReference ? resolveReference(valueToTransform, isContainment).orElse(null)
					: transformAttributeValue(valueToTransform, feature));
		}
	}
	
	@SuppressWarnings("unchecked")
	private void transformAndAddFeatureValues(EObject langElement, EStructuralFeature feature, boolean isReference, boolean isContainment,  Object valueToTransform) {
		var referenceList = (List<EObject>) langElement.eGet(feature, false);
		if (valueToTransform instanceof Collection valueCollection) {
			for (Object referenceValue : valueCollection) {
				resolveReference(referenceValue, isContainment).ifPresentOrElse(referenceList::add, () -> {
					issues.add(new Issue("Could not resolve reference: " + feature.getName()));
				});
			}
		}
	}
	
	private Optional<EObject> resolveReference(Object referenceValue, boolean isContainment) {
		if (referenceValue instanceof Map referenceObjectMap) {
			Object refUUID = referenceObjectMap.get("@id");
			Element referencedElement = repositoryProject.getElement(UUID.fromString(refUUID.toString()));
			EObject referencedLangElement = isContainment? transform(referencedElement) : tracker.get(UUID.fromString(refUUID.toString()));
			return Optional.ofNullable(referencedLangElement);
		}
		return Optional.empty();		
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
	
	public List<Issue> getIssues() {
		return issues;
	}
	
	public static class Issue {
		private final String message;

		public Issue(String message) {
			this.message = message;
		}
		
		public String getMessage() {
			return message;
		}
	}
}
