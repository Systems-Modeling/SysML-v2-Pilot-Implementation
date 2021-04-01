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

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SnapshotFeature;
import org.omg.sysml.lang.sysml.Type;

public class SnapshotFeatureAdapter extends FeatureAdapter {

	public static final String SNAPSHOT_FEATURE_REDEFINED_FEATURE = "Occurrences::Occurrence::snapshotOf";

	public SnapshotFeatureAdapter(SnapshotFeature element) {
		super(element);
	}
	
	@Override
	public SnapshotFeature getTarget() {
		return (SnapshotFeature)super.getTarget();
	}

	@Override
	public void computeImplicitGeneralTypes() {
		setIndividualTyping();
		super.computeImplicitGeneralTypes();
	}
		
	@Override
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		return Collections.singletonList(null);
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		SnapshotFeature target = getTarget();
		return Collections.singletonList(type == target.getOwner()? target:
			   (Feature)getLibraryType(SNAPSHOT_FEATURE_REDEFINED_FEATURE));
	}

}
