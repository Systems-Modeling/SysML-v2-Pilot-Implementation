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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionUsageImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionUsageImpl#getActionDefinition <em>Action Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionUsageImpl extends UsageImpl implements ActionUsage {
	
	public static final String ACTION_SUBSETTING_BASE_DEFAULT = "Actions::actions";
	public static final String ACTION_SUBSETTING_SUBACTION_DEFAULT = "Actions::Action::subactions";
	public static final String STATE_BASE = "States::State";
	public static final String TRANSITION_BASE = "States::Transition";
	
	protected boolean isCheckSubsetting = true;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getParameter() {
		EList<Feature> parameters = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.ACTION_USAGE__PARAMETER);
		parameters.addAll(getAllParameters());
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Behavior> getActionDefinition() {
		EList<Behavior> behaviors = new NonNotifyingEObjectEList<>(Behavior.class, this, SysMLPackage.ACTION_USAGE__ACTION_DEFINITION);
		super.getType().stream().
			filter(type->type instanceof Behavior).
			map(type->(Behavior)type).
			forEachOrdered(behaviors::add);
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionDefinition() {
		return !getActionDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> behavior = (EList<Type>)((EList<?>)getBehavior());
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior() {
		return getActionDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
  		return false;
	}

	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return StepImpl.getRelevantFeaturesOf(this);
	}	
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		String redefinedFeature = getRedefinedFeature();
		return redefinedFeature == null? super.getRelevantFeatures(type):
			   type == getOwningType()? Collections.singletonList(this):
			   Collections.singletonList((Feature)getDefaultType(redefinedFeature));
	}
	
	protected String getRedefinedFeature() {
		FeatureMembership membership = getOwningFeatureMembership();
		return membership instanceof StateSubactionMembership?
					STATE_BASE + "::" + ((StateSubactionMembership)membership).getKind().toString() + "Action": 
			   membership instanceof TransitionFeatureMembership? 
					TRANSITION_BASE + "::" + ((TransitionFeatureMembership)membership).getKind().toString(): 
					null;
	}
	
	@Override
	protected String getDefaultSupertype() {
		return isSubperformance()? 
					ACTION_SUBSETTING_SUBACTION_DEFAULT:
					ACTION_SUBSETTING_BASE_DEFAULT;
	}
	
	public boolean isSubperformance() {
		return StepImpl.isCompositePerformanceFeature(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.ACTION_USAGE__PARAMETER:
				return getParameter();
			case SysMLPackage.ACTION_USAGE__ACTION_DEFINITION:
				return getActionDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.ACTION_USAGE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ACTION_USAGE__ACTION_DEFINITION:
				getActionDefinition().clear();
				getActionDefinition().addAll((Collection<? extends Behavior>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.ACTION_USAGE__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.ACTION_USAGE__ACTION_DEFINITION:
				getActionDefinition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.ACTION_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.ACTION_USAGE__PARAMETER:
				return !getParameter().isEmpty();
			case SysMLPackage.ACTION_USAGE__ACTION_DEFINITION:
				return isSetActionDefinition();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ACTION_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
				case SysMLPackage.ACTION_USAGE__PARAMETER: return SysMLPackage.STEP__PARAMETER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.ACTION_USAGE__BEHAVIOR;
				case SysMLPackage.STEP__PARAMETER: return SysMLPackage.ACTION_USAGE__PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActionImpl
