/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;

public class ElementAdapter extends AdapterImpl {
	
	protected Class<?> kind;
	protected boolean isTransformed = false;
	
	private MetadataFeature metaclassFeature = null;
	
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
	
	// Metaclass Feature
	
	public MetadataFeature getMetaclassFeature() {
		if (metaclassFeature == null) {
			Element element = getTarget();
			Type metaclass = ElementUtil.getMetaclassOf(element);
			if (metaclass != null) {
				metaclassFeature = SysMLFactory.eINSTANCE.createMetadataFeature();
				FeatureTyping typing = SysMLFactory.eINSTANCE.createFeatureTyping();
				typing.setType(metaclass);
				Annotation annotation = SysMLFactory.eINSTANCE.createAnnotation();
				annotation.setAnnotatingElement(metaclassFeature);
				annotation.setAnnotatedElement(element);
				metaclassFeature.getOwnedRelationship().add(typing);
				metaclassFeature.getOwnedRelationship().add(annotation);
			}
		}
		return metaclassFeature;
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
	
	public void doTransform() {
		clearCaches();
	}
		
}
