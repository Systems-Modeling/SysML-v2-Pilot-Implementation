/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Element;

public class ElementAdapter extends AdapterImpl {
	
	protected Class<?> kind;
	protected boolean isTransformed = false;
	
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

	public boolean isTransformed() {
		return isTransformed;
	}
	
	public void clearCaches() {
	}
	
	public void transform() {
		if (!isTransformed) {
			doTransform();
			isTransformed = true;
		}
	}
	
	public void doTransform() {
		clearCaches();
	}
		
}
