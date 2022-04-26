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

import java.util.Collection;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;
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
	 * @generated NOT
	 */
	@Override
	public EList<Behavior> getBehavior() {
		EList<Behavior> behaviors = new NonNotifyingEObjectEList<>(Behavior.class, this, SysMLPackage.STEP__BEHAVIOR);
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
	public boolean isSetBehavior() {
		return !getBehavior().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getParameter() {
		EList<Feature> parameters = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.ITEM_FLOW__PARAMETER);
		parameters.addAll(TypeUtil.getAllParametersOf(this));
		return parameters;
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
	 * @generated NOT
	 */
	@Override
	public EList<Classifier> getItemType() {
		EList<Classifier> itemType = new NonNotifyingEObjectEList<>(Classifier.class, this, SysMLPackage.ITEM_FLOW__ITEM_TYPE);
		getItemFeature().get(0).getType();
		getItemFeature().stream().
			flatMap(f->f.getType().stream()).
			filter(t->t instanceof Classifier).
			map(t->(Classifier)t).
			forEachOrdered(itemType::add);
		return itemType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemFeature> getItemFeature() {
		return new DerivedEObjectEList<ItemFeature>(
				ItemFeature.class, this, SysMLPackage.ITEM_FLOW__ITEM_FEATURE, 
				new int[]{SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getSourceOutputFeature() {
		EList<Feature> sourceOutputFeature = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE);
		getInputOutputFeature(0).ifPresent(sourceOutputFeature::add);
		return sourceOutputFeature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ItemFlowEnd> getItemFlowEnd() {
		EList<ItemFlowEnd> itemFlows = 
				new NonNotifyingEObjectEList<>(ItemFlowEnd.class, this, SysMLPackage.ITEM_FLOW__ITEM_FLOW_END);
		getConnectorEnd().stream().
			filter(end->end instanceof ItemFlowEnd).
			map(end->(ItemFlowEnd)end).
			forEachOrdered(itemFlows::add);
		return itemFlows;
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
	 * @generated NOT
	 */
	@Override
	public EList<ItemFlowFeature> getItemFlowFeature() {
		EList<ItemFlowFeature> itemFlowFeatures = 
				new EObjectResolvingEList<ItemFlowFeature>(ItemFlowFeature.class, this, SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE);
		getItemFlowEnd().stream().
			map(end->(ItemFlowFeature)end.getOwnedFeature().get(0)).
			forEachOrdered(itemFlowFeatures::add);
		return itemFlowFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getTargetInputFeature() {
		EList<Feature> targetInputFeature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE);
		getInputOutputFeature(1).ifPresent(targetInputFeature::add);
		return targetInputFeature;
	}
	
	public Optional<Feature> getInputOutputFeature(int i) {
		EList<ItemFlowFeature> features = getItemFlowFeature();
		return features.size() <= i? Optional.empty(): Optional.of(features.get(i));
	}
	
	public EList<Feature> getConnectorEnd() {
		// This method cannot be removed otherwise the EMF generator creates a replacement with a different content
		return super.getConnectorEnd();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectorEnd() {
  		return false;
	}

	@Override
	public boolean basicIsComposite() {
		if (!isComposite && FeatureUtil.isPerformanceFeature(this)) {
			isComposite = true;
		}
		return isComposite;
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
				return !getItemType().isEmpty();
			case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE:
				return !getTargetInputFeature().isEmpty();
			case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE:
				return !getSourceOutputFeature().isEmpty();
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END:
				return isSetItemFlowEnd();
			case SysMLPackage.ITEM_FLOW__ITEM_FEATURE:
				return !getItemFeature().isEmpty();
			case SysMLPackage.ITEM_FLOW__ITEM_FLOW_FEATURE:
				return !getItemFlowFeature().isEmpty();
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

} //ItemFlowImpl
