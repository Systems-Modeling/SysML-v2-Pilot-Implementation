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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TimeSliceFeature;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slice Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TimeSliceFeatureImpl extends FeatureImpl implements TimeSliceFeature {
	
	public static final String TIME_SLICE_FEATURE_DEFAULT_NAME = "timeSliceOf";	
	public static final String TIME_SLICE_FEATURE_REDEFINED_FEATURE = "Occurrences::Occurrence::timeSliceOf";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSliceFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TIME_SLICE_FEATURE;
	}
	
	@Override
	public String basicGetName() {
		if (super.basicGetName() == null) {
			basicSetName(TIME_SLICE_FEATURE_DEFAULT_NAME);
		}
		return super.basicGetName();
	}
	
	@Override
	protected List<Type> getFeatureTypes(List<Type> types) {
		IndividualUsageImpl.setTypingFor(this);
		return super.getFeatureTypes(types);
	}

	@Override
	public void computeImplicitGeneralization() {
		IndividualUsageImpl.setTypingFor(this);
		super.computeImplicitGeneralization();
	}
	
	@Override
	protected List<Type> getGeneralTypes(Type type) {
		return Collections.singletonList(null);
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return Collections.singletonList(type == getOwner()? this:
			   (Feature)getDefaultType(TIME_SLICE_FEATURE_REDEFINED_FEATURE));
	}
	
} //TimeSliceFeatureImpl
