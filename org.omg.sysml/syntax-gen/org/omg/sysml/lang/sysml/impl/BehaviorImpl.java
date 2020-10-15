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

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Behavior</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends ClassifierImpl implements Behavior {

	public static final String BEHAVIOR_SUPERCLASS_DEFAULT = "Performances::Performance";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public EList<Step> getStep() {
		return new DerivedEObjectEList<Step>(Step.class, this, SysMLPackage.BEHAVIOR__STEP,
				new int[] { SysMLPackage.TYPE__FEATURE });
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public EList<Feature> getParameter() {
		EList<Feature> parameters = new EObjectEList<>(Feature.class, this, SysMLPackage.BEHAVIOR__PARAMETER);
		parameters.addAll(getAllParameters());
		return parameters;
	}

	@Override
	protected String getDefaultSupertype() {
		return BEHAVIOR_SUPERCLASS_DEFAULT;
	}

	/**
	 * Return the non-parameter abstract features of the Behavior.
	 */
	@Override
	public List<Feature> getRelevantFeatures() {
		return getRelevantFeaturesFor(this);
	}
	
	public static List<Feature> getRelevantFeaturesFor(Type type) {
		return type.getOwnedFeature().stream().
				filter(feature -> !((FeatureImpl)feature).isParameter() && feature.isAbstract()).
				collect(Collectors.toList());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.BEHAVIOR__STEP:
				return getStep();
			case SysMLPackage.BEHAVIOR__PARAMETER:
				return getParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.BEHAVIOR__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.BEHAVIOR__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.BEHAVIOR__STEP:
				getStep().clear();
				return;
			case SysMLPackage.BEHAVIOR__PARAMETER:
				getParameter().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.BEHAVIOR__STEP:
				return !getStep().isEmpty();
			case SysMLPackage.BEHAVIOR__PARAMETER:
				return !getParameter().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BehaviorImpl
