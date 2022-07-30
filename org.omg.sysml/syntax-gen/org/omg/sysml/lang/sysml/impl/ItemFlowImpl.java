/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemFlowEnd <em>Item Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemFeature <em>Item Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl#getItemFlowFeature <em>Item Flow Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemFlowImpl extends ConnectorImpl implements ItemFlow {
	
	/**
	 * The cached setting delegate for the '{@link #getBehavior() <em>Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BEHAVIOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STEP__BEHAVIOR).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STEP__PARAMETER).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getItemType() <em>Item Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ITEM_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ITEM_FLOW__ITEM_TYPE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getTargetInputFeature() <em>Target Input Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_INPUT_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ITEM_FLOW__TARGET_INPUT_FEATURE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getSourceOutputFeature() <em>Source Output Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOutputFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ITEM_FLOW__SOURCE_OUTPUT_FEATURE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getItemFlowEnd() <em>Item Flow End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemFlowEnd()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ITEM_FLOW_END__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ITEM_FLOW__ITEM_FLOW_END).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getItemFeature() <em>Item Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ITEM_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ITEM_FLOW__ITEM_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getItemFlowFeature() <em>Item Flow Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemFlowFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ITEM_FLOW_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ITEM_FLOW__ITEM_FLOW_FEATURE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Behavior> getBehavior() {
		return (EList<Behavior>)BEHAVIOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
		return !getBehavior().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getParameter() {
		return (EList<Feature>)PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameter() {
		return !getParameter().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Classifier> getItemType() {
		return (EList<Classifier>)ITEM_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ItemFeature> getItemFeature() {
		return (EList<ItemFeature>)ITEM_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getSourceOutputFeature() {
		return (EList<Feature>)SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ItemFlowEnd> getItemFlowEnd() {
		return (EList<ItemFlowEnd>)ITEM_FLOW_END__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemFlowEnd() {
		return !getItemFlowEnd().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ItemFlowFeature> getItemFlowFeature() {
		return (EList<ItemFlowFeature>)ITEM_FLOW_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getTargetInputFeature() {
		return (EList<Feature>)TARGET_INPUT_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> association = (EList<Type>)((EList<?>)getAssociation());
		return association;
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
	public EList<Feature> getDirectedFeature() {
		return getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectedFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getConnectorEnd() {
		@SuppressWarnings("unchecked")
		EList<Feature> itemFlowEnd = (EList<Feature>)((EList<?>)getItemFlowEnd());
		return itemFlowEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectorEnd() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ITEM_FLOW__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.ITEM_FLOW__PARAMETER:
				return getParameter();
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				return getItemType();
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				return getTargetInputFeature();
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				return getSourceOutputFeature();
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				return getItemFlowEnd();
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				return getItemFeature();
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				return getItemFlowFeature();
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
			case SysMLPackage.ITEM_FLOW__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				getItemType().clear();
				getItemType().addAll((Collection<? extends Classifier>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				getTargetInputFeature().clear();
				getTargetInputFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				getSourceOutputFeature().clear();
				getSourceOutputFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				getItemFlowEnd().clear();
				getItemFlowEnd().addAll((Collection<? extends ItemFlowEnd>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				getItemFeature().clear();
				getItemFeature().addAll((Collection<? extends ItemFeature>)newValue);
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				getItemFlowFeature().clear();
				getItemFlowFeature().addAll((Collection<? extends ItemFlowFeature>)newValue);
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
			case SysMLPackage.ITEM_FLOW__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.ITEM_FLOW__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				getItemType().clear();
				return;
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				getTargetInputFeature().clear();
				return;
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				getSourceOutputFeature().clear();
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				getItemFlowEnd().clear();
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				getItemFeature().clear();
				return;
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				getItemFlowFeature().clear();
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
			case SysMLPackage.ITEM_FLOW__TYPE:
				return isSetType();
			case SysMLPackage.ITEM_FLOW__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.ITEM_FLOW__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.ITEM_FLOW__PARAMETER:
				return isSetParameter();
			case SysMLPackage.ITEM_FLOW__CONNECTOR_END:
				return isSetConnectorEnd();
			case SysMLPackage.ITEM_FLOW__ITEM_TYPE:
				return ITEM_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				return TARGET_INPUT_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				return SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				return isSetItemFlowEnd();
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				return ITEM_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				return ITEM_FLOW_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
				case SysMLPackage.ITEM_FLOW__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
				case SysMLPackage.ITEM_FLOW__PARAMETER: return SysMLPackage.STEP__PARAMETER;
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
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.ITEM_FLOW__BEHAVIOR;
				case SysMLPackage.STEP__PARAMETER: return SysMLPackage.ITEM_FLOW__PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ItemFlowImpl
