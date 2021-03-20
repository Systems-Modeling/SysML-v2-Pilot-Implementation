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

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class ItemFlowFeatureAdapter extends FeatureAdapter {

	public static final String[] ITEM_FLOW_INPUT_OUTPUT_FEATURES = { "Transfers::Transfer::transferSource::sourceOutput", "Transfers::Transfer::transferTarget::targetInput" };

	public ItemFlowFeatureAdapter(ItemFlowFeature element) {
		super(element);
	}
	
	@Override
	public ItemFlowFeature getTarget() {
		return (ItemFlowFeature)super.getTarget();
	}

	@Override
	public void addComputedRedefinitions(Element skip) {
		if (!isImplicitGeneralizationDeclaredFor(SysMLPackage.eINSTANCE.getRedefinition())) {
			addRedefinitions(skip);
		}
	}

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return type instanceof ItemFlowEnd? type.getOwnedFeature():
				Collections.singletonList((Feature)getLibraryType(ITEM_FLOW_INPUT_OUTPUT_FEATURES[getEndIndex()]));
	}
	
	protected int getEndIndex() {
		Type owningType = getTarget().getOwningType();
		if (owningType != null) {
			Element connector = owningType.getOwner();
			if (connector instanceof Connector) {
				int i = ((Connector)connector).getConnectorEnd().indexOf(owningType);
				if (i >= 0) {
					return i;
				}
			}
		}
		return 0;
	}

}
