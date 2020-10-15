/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Item
 * Flow End</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemFlowEndImpl extends FeatureImpl implements ItemFlowEnd {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW_END;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		addItemFlowEndSubsetting();
		return super.getOwnedSubsetting();
	}
	
	@Override
	public void computeImplicitGeneralization() {
		// Note: Do not add item flow end subsetting here, to avoid circularity due to name resolution.
		addComputedRedefinitions();
	}

	protected void addItemFlowEndSubsetting() {
		EList<Feature> features = getOwnedFeature();
		if (!features.isEmpty()) {
			List<Redefinition> redefinitions = ((FeatureImpl) features.get(0)).basicGetOwnedRedefinition();
			if (!redefinitions.isEmpty()) {
				Feature feature = redefinitions.get(0).getRedefinedFeature();
				if (feature != null) {
					Type owner = feature.getOwningType();
					if (owner instanceof Feature) {
						Subsetting subsetting = basicGetOwnedSubsetting().stream().
								filter(s->!(s instanceof Redefinition)).findFirst().orElse(null);
						if (subsetting == null) {
							subsetting = SysMLFactory.eINSTANCE.createSubsetting();
							subsetting.setSubsettingFeature(this);
							getOwnedRelationship_comp().add(subsetting);
						}
						subsetting.setSubsettedFeature((Feature) owner);
					}
				}
			}
		}
	}

	@Override
	protected List<Type> getGeneralTypes(Type type) {
		return type instanceof ItemFlow ? new ArrayList<>(((ItemFlow) type).getType()) : super.getGeneralTypes(type);
	}

	@Override
	public List<Feature> getRelevantFeatures() {
		return getOwnedFeature();
	}
	
	@Override
	public void transform() {
		addItemFlowEndSubsetting();
		super.transform();
	}
	
} // ItemFlowEndImpl
