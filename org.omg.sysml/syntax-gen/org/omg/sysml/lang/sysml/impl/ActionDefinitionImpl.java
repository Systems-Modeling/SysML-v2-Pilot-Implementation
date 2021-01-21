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
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionDefinitionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDefinitionImpl extends DefinitionImpl implements ActionDefinition {

	public static final String ACTION_DEFINITION_SUPERCLASS_DEFAULT = "Actions::Action";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Step> getStep() {
		return new DerivedEObjectEList<Step>(Step.class, this, 
				SysMLPackage.ACTION_DEFINITION__STEP, 
				new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getParameter() {
		EList<Feature> parameters = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.ACTION_DEFINITION__PARAMETER);
		parameters.addAll(getAllParameters());
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ActionUsage> getAction() {
		return new DerivedEObjectEList<ActionUsage>(ActionUsage.class, this, 
				SysMLPackage.ACTION_DEFINITION__ACTION, 
				new int[] {SysMLPackage.TYPE__FEATURE});
	}

	protected String getDefaultSupertype() {
		return ACTION_DEFINITION_SUPERCLASS_DEFAULT;
	}
	
	/**
	 * Return the non-parameter abstract features of the Activity.
	 */
	@Override
	public List<Feature> getRelevantFeatures() {
		return Collections.emptyList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ACTION_DEFINITION__STEP:
				return getStep();
			case SysMLPackage.ACTION_DEFINITION__PARAMETER:
				return getParameter();
			case SysMLPackage.ACTION_DEFINITION__ACTION:
				return getAction();
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
			case SysMLPackage.ACTION_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.ACTION_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ACTION_DEFINITION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionUsage>)newValue);
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
			case SysMLPackage.ACTION_DEFINITION__STEP:
				getStep().clear();
				return;
			case SysMLPackage.ACTION_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.ACTION_DEFINITION__ACTION:
				getAction().clear();
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
			case SysMLPackage.ACTION_DEFINITION__STEP:
				return !getStep().isEmpty();
			case SysMLPackage.ACTION_DEFINITION__PARAMETER:
				return !getParameter().isEmpty();
			case SysMLPackage.ACTION_DEFINITION__ACTION:
				return !getAction().isEmpty();
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
		if (baseClass == org.omg.sysml.lang.sysml.Class.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ACTION_DEFINITION__STEP: return SysMLPackage.BEHAVIOR__STEP;
				case SysMLPackage.ACTION_DEFINITION__PARAMETER: return SysMLPackage.BEHAVIOR__PARAMETER;
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
		if (baseClass == org.omg.sysml.lang.sysml.Class.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case SysMLPackage.BEHAVIOR__STEP: return SysMLPackage.ACTION_DEFINITION__STEP;
				case SysMLPackage.BEHAVIOR__PARAMETER: return SysMLPackage.ACTION_DEFINITION__PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityImpl
