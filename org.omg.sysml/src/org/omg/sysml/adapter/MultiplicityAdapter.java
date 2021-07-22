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

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Type;

public class MultiplicityAdapter extends FeatureAdapter {

	public MultiplicityAdapter(Multiplicity element) {
		super(element);
	}
	
	@Override
	public Multiplicity getTarget() {
		return (Multiplicity)super.getTarget();
	}

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
	protected List<Multiplicity> getRelevantFeatures(Type type, Element skip) {
		return Collections.emptyList();
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addImplicitFeaturingTypesIfNecessary();
	}

}
