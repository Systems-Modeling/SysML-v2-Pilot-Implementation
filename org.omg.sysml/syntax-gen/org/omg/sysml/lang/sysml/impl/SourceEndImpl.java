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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source End</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SourceEndImpl extends FeatureImpl implements SourceEnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SOURCE_END;
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		addComputedRedefinitions(null);
	}
	
	@Override
	public void addComputedRedefinitions(Element skip) {
		addDefaultGeneralType();
		super.addComputedRedefinitions(skip);
	}
	
	@Override
	public Type getDefaultType(String... defaultNames) {
		Type type = getOwningType();
		return type instanceof Feature? 
				getSource((Feature)type): 
				super.getDefaultType(defaultNames);
	}
	
	protected Feature getSource(Feature owningFeature) {
		Type type = owningFeature.getOwningType();
		return owningFeature instanceof BindingConnector && 
			   type instanceof SatisfyRequirementUsage? 
					((SatisfyRequirementUsage)type).getSubjectParameter(): 
					getPreviousFeature(owningFeature);
	}
	
	protected static Feature getPreviousFeature(Feature feature) {
		Namespace owner = feature.getOwningNamespace();
		if (!(owner instanceof Type)) {
			return null;
		} else {
			EList<Membership> memberships = ((Type)owner).getOwnedMembership();
			for (int i = memberships.indexOf(feature.getOwningMembership()) - 1; i >= 0; i--) {
				Membership membership = memberships.get(i);
				if (!(membership instanceof TransitionFeatureMembership)) {
					Element previousElement = memberships.get(i).getMemberElement();
					if (previousElement instanceof Feature &&
						!(FeatureUtil.isParameter((Feature)previousElement) || 
						  previousElement instanceof Connector || 
						  previousElement instanceof TransitionUsage)) {
						return (Feature)previousElement;
					}
				}
			}
			return owner instanceof Feature? getPreviousFeature((Feature)owner): null;
		}
	}
	
} //SourceEndImpl
