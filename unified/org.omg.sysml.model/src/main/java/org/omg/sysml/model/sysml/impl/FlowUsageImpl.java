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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.Behavior;
import org.omg.sysml.model.sysml.Classifier;
import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Flow;
import org.omg.sysml.model.sysml.FlowEnd;
import org.omg.sysml.model.sysml.FlowUsage;
import org.omg.sysml.model.sysml.Interaction;
import org.omg.sysml.model.sysml.OccurrenceDefinition;
import org.omg.sysml.model.sysml.OccurrenceUsage;
import org.omg.sysml.model.sysml.PayloadFeature;
import org.omg.sysml.model.sysml.PortionKind;
import org.omg.sysml.model.sysml.Step;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#isIsIndividual <em>Is Individual</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getPortionKind <em>Portion Kind</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getOccurrenceDefinition <em>Occurrence Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getActionDefinition <em>Action Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getFlowEnd <em>Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getPayloadFeature <em>Payload Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowUsageImpl#getFlowDefinition <em>Flow Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowUsageImpl extends ConnectorAsUsageImpl implements FlowUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FLOW_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsIndividual() {
		return (Boolean)eGet(SysMLPackage.Literals.OCCURRENCE_USAGE__IS_INDIVIDUAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsIndividual(boolean newIsIndividual) {
		eSet(SysMLPackage.Literals.OCCURRENCE_USAGE__IS_INDIVIDUAL, newIsIndividual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortionKind getPortionKind() {
		return (PortionKind)eGet(SysMLPackage.Literals.OCCURRENCE_USAGE__PORTION_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortionKind(PortionKind newPortionKind) {
		eSet(SysMLPackage.Literals.OCCURRENCE_USAGE__PORTION_KIND, newPortionKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceDefinition getIndividualDefinition() {
		return (OccurrenceDefinition)eGet(SysMLPackage.Literals.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndividualDefinition(OccurrenceDefinition newIndividualDefinition) {
		eSet(SysMLPackage.Literals.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION, newIndividualDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.omg.sysml.model.sysml.Class> getOccurrenceDefinition() {
		return (EList<org.omg.sysml.model.sysml.Class>)eGet(SysMLPackage.Literals.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Behavior> getBehavior() {
		return (EList<Behavior>)eGet(SysMLPackage.Literals.STEP__BEHAVIOR, true);
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
	@Override
	public EList<Behavior> getActionDefinition() {
		var sourceValue = this.getFlowDefinition();
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
	public EList<FlowEnd> getFlowEnd() {
		return (EList<FlowEnd>)eGet(SysMLPackage.Literals.FLOW__FLOW_END, true);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interaction> getInteraction() {
		var sourceValue = this.getFlowDefinition();
		Object source = sourceValue;
		var result = new BasicEList<Interaction>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Interaction typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Interaction typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Interaction> getFlowDefinition() {
		return (EList<Interaction>)eGet(SysMLPackage.Literals.FLOW_USAGE__FLOW_DEFINITION, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #argument(int) <em>Argument</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #argument(int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ARGUMENT_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ACTION_USAGE___ARGUMENT__INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression argument(int i) {
		try {
			return (Expression)ARGUMENT_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{i}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #inputParameter(int) <em>Input Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inputParameter(int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INPUT_PARAMETER_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ACTION_USAGE___INPUT_PARAMETER__INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature inputParameter(int i) {
		try {
			return (Feature)INPUT_PARAMETER_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{i}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #inputParameters() <em>Input Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inputParameters()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INPUT_PARAMETERS__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ACTION_USAGE___INPUT_PARAMETERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> inputParameters() {
		try {
			return (EList<Feature>)INPUT_PARAMETERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSubactionUsage() <em>Is Subaction Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubactionUsage()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SUBACTION_USAGE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ACTION_USAGE___IS_SUBACTION_USAGE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSubactionUsage() {
		try {
			return (Boolean)IS_SUBACTION_USAGE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OccurrenceUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL: return SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL;
				case SysMLPackage.FLOW_USAGE__PORTION_KIND: return SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND;
				case SysMLPackage.FLOW_USAGE__INDIVIDUAL_DEFINITION: return SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION;
				case SysMLPackage.FLOW_USAGE__OCCURRENCE_DEFINITION: return SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
				case SysMLPackage.FLOW_USAGE__PARAMETER: return SysMLPackage.STEP__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ActionUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_USAGE__ACTION_DEFINITION: return SysMLPackage.ACTION_USAGE__ACTION_DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == Flow.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_USAGE__FLOW_END: return SysMLPackage.FLOW__FLOW_END;
				case SysMLPackage.FLOW_USAGE__INTERACTION: return SysMLPackage.FLOW__INTERACTION;
				case SysMLPackage.FLOW_USAGE__PAYLOAD_FEATURE: return SysMLPackage.FLOW__PAYLOAD_FEATURE;
				case SysMLPackage.FLOW_USAGE__PAYLOAD_TYPE: return SysMLPackage.FLOW__PAYLOAD_TYPE;
				case SysMLPackage.FLOW_USAGE__SOURCE_OUTPUT_FEATURE: return SysMLPackage.FLOW__SOURCE_OUTPUT_FEATURE;
				case SysMLPackage.FLOW_USAGE__TARGET_INPUT_FEATURE: return SysMLPackage.FLOW__TARGET_INPUT_FEATURE;
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
		if (baseClass == OccurrenceUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL: return SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL;
				case SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND: return SysMLPackage.FLOW_USAGE__PORTION_KIND;
				case SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION: return SysMLPackage.FLOW_USAGE__INDIVIDUAL_DEFINITION;
				case SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION: return SysMLPackage.FLOW_USAGE__OCCURRENCE_DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.FLOW_USAGE__BEHAVIOR;
				case SysMLPackage.STEP__PARAMETER: return SysMLPackage.FLOW_USAGE__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ActionUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ACTION_USAGE__ACTION_DEFINITION: return SysMLPackage.FLOW_USAGE__ACTION_DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == Flow.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FLOW__FLOW_END: return SysMLPackage.FLOW_USAGE__FLOW_END;
				case SysMLPackage.FLOW__INTERACTION: return SysMLPackage.FLOW_USAGE__INTERACTION;
				case SysMLPackage.FLOW__PAYLOAD_FEATURE: return SysMLPackage.FLOW_USAGE__PAYLOAD_FEATURE;
				case SysMLPackage.FLOW__PAYLOAD_TYPE: return SysMLPackage.FLOW_USAGE__PAYLOAD_TYPE;
				case SysMLPackage.FLOW__SOURCE_OUTPUT_FEATURE: return SysMLPackage.FLOW_USAGE__SOURCE_OUTPUT_FEATURE;
				case SysMLPackage.FLOW__TARGET_INPUT_FEATURE: return SysMLPackage.FLOW_USAGE__TARGET_INPUT_FEATURE;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == OccurrenceUsage.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Step.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ActionUsage.class) {
			switch (baseOperationID) {
				case SysMLPackage.ACTION_USAGE___ARGUMENT__INT: return SysMLPackage.FLOW_USAGE___ARGUMENT__INT;
				case SysMLPackage.ACTION_USAGE___INPUT_PARAMETER__INT: return SysMLPackage.FLOW_USAGE___INPUT_PARAMETER__INT;
				case SysMLPackage.ACTION_USAGE___INPUT_PARAMETERS: return SysMLPackage.FLOW_USAGE___INPUT_PARAMETERS;
				case SysMLPackage.ACTION_USAGE___IS_SUBACTION_USAGE: return SysMLPackage.FLOW_USAGE___IS_SUBACTION_USAGE;
				default: return -1;
			}
		}
		if (baseClass == Flow.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.FLOW_USAGE___ARGUMENT__INT:
				return argument((Integer)arguments.get(0));
			case SysMLPackage.FLOW_USAGE___INPUT_PARAMETER__INT:
				return inputParameter((Integer)arguments.get(0));
			case SysMLPackage.FLOW_USAGE___INPUT_PARAMETERS:
				return inputParameters();
			case SysMLPackage.FLOW_USAGE___IS_SUBACTION_USAGE:
				return isSubactionUsage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FlowUsageImpl
