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

package org.omg.sysml.transform;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;

public class FeatureTransformer extends TypeTransformer {
	
	public FeatureTransformer(Feature element) {
		super(element);
	}
	
	@Override
	public Feature getElement() {
		return (Feature)super.getElement();
	}
	
	protected void addFeaturingType(Type featuringType) {
		Feature feature = getElement();
		if (featuringType != null && feature.getOwningType() == null && 
			feature.getOwnedTypeFeaturing().isEmpty()) {
			((FeatureImpl)feature).addFeaturingType(featuringType);
		}
	}
	
	protected void addImplicitFeaturingTypes() {
		FeatureImpl feature = (FeatureImpl)getElement();
		Namespace owner = feature.getOwningNamespace();
		if (owner instanceof Feature) {
			EList<Type> ownerFeaturingTypes = ((Feature)owner).getFeaturingType();
			if (feature.isImplicitFeaturingTypesEmpty()) {
				feature.addFeaturingTypes(ownerFeaturingTypes);
			}
		}
	}
	
	public BindingConnector computeAssertionConnector(Feature result) {
		Feature feature = getElement();
		LiteralBoolean literalBoolean = (LiteralBoolean)feature.getOwnedFeature().stream().
				filter(f->f instanceof LiteralBoolean).
				findFirst().orElse(null);
		return literalBoolean == null? null:
			((FeatureImpl)feature).makeResultBinding(literalBoolean, result);
	}
	
	protected void computeValueConnector() {
		FeatureImpl feature = (FeatureImpl)getElement();
		FeatureValue valuation = feature.getValuation();
		if (valuation != null) {
			Expression value = valuation.getValue();
			valuation.setValueConnector(value == null? null:
				feature.makeValueBinding(value));
		}
	}
	
	@Override
	public void transform() {
		FeatureImpl feature = (FeatureImpl)getElement();
		feature.forceComputeRedefinitions();
		super.transform();
		computeValueConnector();
	}

}
