/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2024, 2025 Model Driven Solutions, Inc.
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

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;

public class MultiplicityAdapter extends FeatureAdapter {

	public MultiplicityAdapter(Multiplicity element) {
		super(element);
	}
	
	@Override
	public Multiplicity getTarget() {
		return (Multiplicity)super.getTarget();
	}
	
	/**
	 * @satisfies checkOccurrenceDefinitionMultiplicitySpecialization, Note: SysML grammar adds the empty multiplicity
	 * @satisfies checkMultiplicitySpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		Element owner = getTarget().getOwner();
		return owner instanceof Classifier?
					getDefaultSupertype("classifier"):
			   owner instanceof Feature?
					getDefaultSupertype("feature"):
					getDefaultSupertype("base");
	}
	
	@Override
	protected List<Multiplicity> getRelevantFeatures(Type type) {
		return Collections.emptyList();
	}
	
	/**
	 * @satisfies checkMultiplicityTypeFeaturing
	 */
	@Override
	protected void addImplicitFeaturingTypesIfNecessary() {
		Feature feature = getTarget();
		Namespace owner = feature.getOwningNamespace();
		if (owner instanceof Feature) {
			Namespace owningEnd = owner.getOwningNamespace();
			if (FeatureUtil.isOwnedCrossFeature((Feature)owner) && 
				isImplicitFeaturingTypesEmpty()) {
				addFeaturingTypes(((Feature)owningEnd).getFeaturingType());
			} else {
				super.addImplicitFeaturingTypesIfNecessary();
			}
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		//checkMultiplicityTypeFeaturing
		addImplicitFeaturingTypesIfNecessary();
	}

}
