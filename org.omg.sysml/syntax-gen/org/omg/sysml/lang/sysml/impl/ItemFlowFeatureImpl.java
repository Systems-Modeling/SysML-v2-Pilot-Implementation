/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item
 * Flow Feature</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFlowFeatureImpl extends FeatureImpl implements ItemFlowFeature {

	public static final String[] ITEM_FLOW_INPUT_OUTPUT_FEATURES = { "Transfers::Transfer::transferSource::sourceOutput", "Transfers::Transfer::transferTarget::targetInput" };

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW_FEATURE;
	}

	@Override
	public void addComputedRedefinitions(Element skip) {
		if (!TypeUtil.isImplicitGeneralizationDeclaredFor(this, SysMLPackage.eINSTANCE.getRedefinition())) {
			addRedefinitions(skip);
		}
	}

	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return type instanceof ItemFlowEnd ? type.getOwnedFeature():
				Collections.singletonList((Feature)SysMLLibraryUtil.getLibraryType(this, ITEM_FLOW_INPUT_OUTPUT_FEATURES[getEndIndex()]));
	}
	
	protected int getEndIndex() {
		Type owningType = getOwningType();
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

} // ItemFlowFeatureImpl
