/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
 * Copyright (c) 2024 Budapest University of Technology and Economics
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

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class TypeFeaturingAdapter extends RelationshipAdapter {

	public TypeFeaturingAdapter(TypeFeaturing element) {
		super(element);
	}
	
	@Override
	public TypeFeaturing getTarget() {
		return (TypeFeaturing)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		TypeFeaturing obj = getTarget();
		
		// If the featureOfType is empty, then set it to the owningRelatedElement (if this is a Feature).
		Object featureOfType = obj.eGet(SysMLPackage.Literals.TYPE_FEATURING__FEATURE_OF_TYPE, false);
		if (featureOfType == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				obj.setFeatureOfType((Feature)owner);
			}
		}
	}
	
}
