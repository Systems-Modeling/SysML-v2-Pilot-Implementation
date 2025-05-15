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
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.PayloadFeature;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.FlowEnd;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowImpl#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowImpl#getFlowEnd <em>Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowImpl#getPayloadFeature <em>Payload Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowImpl#getInteraction <em>Interaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends ConnectorImpl implements Flow {
	
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
	 * The cached setting delegate for the '{@link #getPayloadType() <em>Payload Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAYLOAD_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW__PAYLOAD_TYPE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getTargetInputFeature() <em>Target Input Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_INPUT_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW__TARGET_INPUT_FEATURE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getSourceOutputFeature() <em>Source Output Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOutputFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW__SOURCE_OUTPUT_FEATURE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getFlowEnd() <em>Flow End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowEnd()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FLOW_END__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW__FLOW_END).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getPayloadFeature() <em>Payload Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAYLOAD_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW__PAYLOAD_FEATURE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getInteraction() <em>Interaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INTERACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW__INTERACTION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getBehavior() {
		@SuppressWarnings("unchecked")
		EList<Behavior> interaction = (EList<Behavior>)((EList<?>)getInteraction());
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
  		return false;
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
	public EList<Classifier> getPayloadType() {
		return (EList<Classifier>)PAYLOAD_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSourceOutputFeature() {
		return (Feature)SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSourceOutputFeature() {
		return (Feature)SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceOutputFeature(Feature newSourceOutputFeature) {
		SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSourceOutputFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FlowEnd> getFlowEnd() {
		return (EList<FlowEnd>)FLOW_END__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayloadFeature getPayloadFeature() {
		return (PayloadFeature)PAYLOAD_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayloadFeature basicGetPayloadFeature() {
		return (PayloadFeature)PAYLOAD_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayloadFeature(PayloadFeature newPayloadFeature) {
		PAYLOAD_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPayloadFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Interaction> getInteraction() {
		return (EList<Interaction>)INTERACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInteraction() {
		return !getInteraction().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getTargetInputFeature() {
		return (Feature)TARGET_INPUT_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetTargetInputFeature() {
		return (Feature)TARGET_INPUT_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetInputFeature(Feature newTargetInputFeature) {
		TARGET_INPUT_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTargetInputFeature);
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
	public EList<Association> getAssociation() {
		@SuppressWarnings("unchecked")
		EList<Association> interaction = (EList<Association>)((EList<?>)getInteraction());
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociation() {
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
			case SysMLPackage.FLOW__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.FLOW__PARAMETER:
				return getParameter();
			case SysMLPackage.FLOW__PAYLOAD_TYPE:
				return getPayloadType();
			case SysMLPackage.FLOW__TARGET_INPUT_FEATURE:
				if (resolve) return getTargetInputFeature();
				return basicGetTargetInputFeature();
			case SysMLPackage.FLOW__SOURCE_OUTPUT_FEATURE:
				if (resolve) return getSourceOutputFeature();
				return basicGetSourceOutputFeature();
			case SysMLPackage.FLOW__FLOW_END:
				return getFlowEnd();
			case SysMLPackage.FLOW__PAYLOAD_FEATURE:
				if (resolve) return getPayloadFeature();
				return basicGetPayloadFeature();
			case SysMLPackage.FLOW__INTERACTION:
				return getInteraction();
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
			case SysMLPackage.FLOW__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.FLOW__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FLOW__PAYLOAD_TYPE:
				getPayloadType().clear();
				getPayloadType().addAll((Collection<? extends Classifier>)newValue);
				return;
			case SysMLPackage.FLOW__TARGET_INPUT_FEATURE:
				setTargetInputFeature((Feature)newValue);
				return;
			case SysMLPackage.FLOW__SOURCE_OUTPUT_FEATURE:
				setSourceOutputFeature((Feature)newValue);
				return;
			case SysMLPackage.FLOW__FLOW_END:
				getFlowEnd().clear();
				getFlowEnd().addAll((Collection<? extends FlowEnd>)newValue);
				return;
			case SysMLPackage.FLOW__PAYLOAD_FEATURE:
				setPayloadFeature((PayloadFeature)newValue);
				return;
			case SysMLPackage.FLOW__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends Interaction>)newValue);
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
			case SysMLPackage.FLOW__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.FLOW__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.FLOW__PAYLOAD_TYPE:
				getPayloadType().clear();
				return;
			case SysMLPackage.FLOW__TARGET_INPUT_FEATURE:
				setTargetInputFeature((Feature)null);
				return;
			case SysMLPackage.FLOW__SOURCE_OUTPUT_FEATURE:
				setSourceOutputFeature((Feature)null);
				return;
			case SysMLPackage.FLOW__FLOW_END:
				getFlowEnd().clear();
				return;
			case SysMLPackage.FLOW__PAYLOAD_FEATURE:
				setPayloadFeature((PayloadFeature)null);
				return;
			case SysMLPackage.FLOW__INTERACTION:
				getInteraction().clear();
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
			case SysMLPackage.FLOW__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.FLOW__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.FLOW__PARAMETER:
				return isSetParameter();
			case SysMLPackage.FLOW__ASSOCIATION:
				return isSetAssociation();
			case SysMLPackage.FLOW__PAYLOAD_TYPE:
				return PAYLOAD_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW__TARGET_INPUT_FEATURE:
				return TARGET_INPUT_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW__SOURCE_OUTPUT_FEATURE:
				return SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW__FLOW_END:
				return FLOW_END__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW__PAYLOAD_FEATURE:
				return PAYLOAD_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW__INTERACTION:
				return isSetInteraction();
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
				case SysMLPackage.FLOW__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
				case SysMLPackage.FLOW__PARAMETER: return SysMLPackage.STEP__PARAMETER;
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
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.FLOW__BEHAVIOR;
				case SysMLPackage.STEP__PARAMETER: return SysMLPackage.FLOW__PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ItemFlowImpl
