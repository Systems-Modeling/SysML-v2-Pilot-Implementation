/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Association;
import org.omg.sysml.model.sysml.Behavior;
import org.omg.sysml.model.sysml.Classifier;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Flow;
import org.omg.sysml.model.sysml.FlowEnd;
import org.omg.sysml.model.sysml.Interaction;
import org.omg.sysml.model.sysml.PayloadFeature;
import org.omg.sysml.model.sysml.Step;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowImpl#getFlowEnd <em>Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowImpl#getPayloadFeature <em>Payload Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowImpl#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends ConnectorImpl implements Flow {
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
		var sourceValue = this.getInteraction();
		Object source = sourceValue;
		var result = new BasicEList<Behavior>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Behavior typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Behavior typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getParameter() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.STEP__PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FlowEnd> getFlowEnd() {
		return (EList<FlowEnd>)eGet(SysMLPackage.Literals.FLOW__FLOW_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Interaction> getInteraction() {
		return (EList<Interaction>)eGet(SysMLPackage.Literals.FLOW__INTERACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayloadFeature getPayloadFeature() {
		return (PayloadFeature)eGet(SysMLPackage.Literals.FLOW__PAYLOAD_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayloadFeature(PayloadFeature newPayloadFeature) {
		eSet(SysMLPackage.Literals.FLOW__PAYLOAD_FEATURE, newPayloadFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Classifier> getPayloadType() {
		return (EList<Classifier>)eGet(SysMLPackage.Literals.FLOW__PAYLOAD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSourceOutputFeature() {
		return (Feature)eGet(SysMLPackage.Literals.FLOW__SOURCE_OUTPUT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceOutputFeature(Feature newSourceOutputFeature) {
		eSet(SysMLPackage.Literals.FLOW__SOURCE_OUTPUT_FEATURE, newSourceOutputFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getTargetInputFeature() {
		return (Feature)eGet(SysMLPackage.Literals.FLOW__TARGET_INPUT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetInputFeature(Feature newTargetInputFeature) {
		eSet(SysMLPackage.Literals.FLOW__TARGET_INPUT_FEATURE, newTargetInputFeature);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getAssociation() {
		var sourceValue = this.getInteraction();
		Object source = sourceValue;
		var result = new BasicEList<Association>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Association typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Association typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

} //FlowImpl
