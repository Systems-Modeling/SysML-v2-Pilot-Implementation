/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2026 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.UUID;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;

public class ElementAdapter extends AdapterImpl {
	
	protected Class<?> kind;
	protected boolean isTransformed = false;
	
	private MetadataFeature metaclassFeature = null;
	
	private String elementId;
	
	public ElementAdapter(Element element) {
		super();
		kind = element.getClass();
	}
	
	public Element getTarget() {
		return (Element)super.getTarget();
	}
	
	@Override
	public boolean isAdapterForType(Object object) {
		return kind.isInstance(object);
	}
	
	// Element IDs
	
	public String getElementId() {
		if (elementId == null) {
			elementId = createElementId();
		}
		return elementId;
	}
	
	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	/**
	 * If the Element is not a standard library Element, create a random UUID. 
	 * If the Element is a standard library Element, create a name-based UUID using the Element's path.
	 */
	protected String createElementId() {
		Element target = getTarget();
		UUID uuid = UUID.randomUUID();
		if (ElementUtil.isStandardLibraryElement(target)) {
			String path = target.path();
			if (path != null) {				
				Namespace libraryNamespace = target.libraryNamespace();
				if (target != libraryNamespace) {
					UUID namespaceUUID = UUID.fromString(libraryNamespace.getElementId());
					uuid = ElementUtil.constructNameUUID(namespaceUUID, path);
				}
			}
		}					
		return uuid.toString();
	}
	
	// Metaclass Feature
	
	public MetadataFeature getMetaclassFeature() {
		if (metaclassFeature == null) {
			Element element = getTarget();
			Type metaclass = ElementUtil.getMetaclassOf(element);
			if (metaclass != null) {
				metaclassFeature = SysMLFactory.eINSTANCE.createMetadataFeature();
				FeatureTyping typing = SysMLFactory.eINSTANCE.createFeatureTyping();
				typing.setType(metaclass);
				typing.setTypedFeature(metaclassFeature);
				Annotation annotation = SysMLFactory.eINSTANCE.createAnnotation();
				annotation.setAnnotatedElement(element);
				metaclassFeature.getOwnedRelationship().add(typing);
				metaclassFeature.getOwnedRelationship().add(annotation);
			}
		}
		return metaclassFeature;
	}
	
	// Parse post-processing
	
	public void postProcess() {
		Element target = getTarget();
		target.setDeclaredName(ElementUtil.unescapeString(target.getDeclaredName()));
		target.setDeclaredShortName(ElementUtil.unescapeString(target.getDeclaredShortName()));
	}
	
	// Transformation
		
	public boolean isTransformed() {
		return isTransformed;
	}
	
	public void clearCaches() {
	}
	
	public void transform() {
		if (!isTransformed) {
			isTransformed = true;
			doTransform();
		}
	}
	
	protected void doTransform() {
		clearCaches();
	}
		
}
