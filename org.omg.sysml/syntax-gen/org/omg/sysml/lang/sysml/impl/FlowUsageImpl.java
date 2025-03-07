/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2024 Model Driven Solutions, Inc.
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
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FlowUsage;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.PayloadFeature;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.FlowEnd;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Connection Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#isIndividual <em>Is Individual</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getPortionKind <em>Portion Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getFlowEnd <em>Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getPayloadFeature <em>Payload Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowUsageImpl#getFlowDefinition <em>Flow Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowUsageImpl extends ConnectorAsUsageImpl implements FlowUsage {
	/**
	 * The cached setting delegate for the '{@link #getIndividualDefinition() <em>Individual Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INDIVIDUAL_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION).getSettingDelegate();
	/**
	 * The default value of the '{@link #isIndividual() <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIVIDUAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIndividual() <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividual()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndividual = IS_INDIVIDUAL_EDEFAULT;
	/**
	 * The default value of the '{@link #getPortionKind() <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortionKind()
	 * @generated
	 * @ordered
	 */
	protected static final PortionKind PORTION_KIND_EDEFAULT = PortionKind.TIMESLICE;
	/**
	 * The cached value of the '{@link #getPortionKind() <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortionKind()
	 * @generated
	 * @ordered
	 */
	protected PortionKind portionKind = PORTION_KIND_EDEFAULT;
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
	 * The cached setting delegate for the '{@link #getFlowDefinition() <em>Flow Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FLOW_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW_USAGE__FLOW_DEFINITION).getSettingDelegate();
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
	public OccurrenceDefinition getIndividualDefinition() {
		return (OccurrenceDefinition)INDIVIDUAL_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceDefinition basicGetIndividualDefinition() {
		return (OccurrenceDefinition)INDIVIDUAL_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndividualDefinition(OccurrenceDefinition newIndividualDefinition) {
		INDIVIDUAL_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIndividualDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIndividual() {
		return isIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsIndividual(boolean newIsIndividual) {
		boolean oldIsIndividual = isIndividual;
		isIndividual = newIsIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL, oldIsIndividual, isIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortionKind getPortionKind() {
		return portionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortionKind(PortionKind newPortionKind) {
		PortionKind oldPortionKind = portionKind;
		portionKind = newPortionKind == null ? PORTION_KIND_EDEFAULT : newPortionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FLOW_USAGE__PORTION_KIND, oldPortionKind, portionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getOccurrenceDefinition() {
		@SuppressWarnings("unchecked")
		EList<org.omg.sysml.lang.sysml.Class> actionDefinition = (EList<org.omg.sysml.lang.sysml.Class>)((EList<?>)getActionDefinition());
		return actionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOccurrenceDefinition() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getActionDefinition() {
		@SuppressWarnings("unchecked")
		EList<Behavior> flowDefinition = (EList<Behavior>)((EList<?>)getFlowDefinition());
		return flowDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionDefinition() {
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
	public EList<Interaction> getFlowDefinition() {
		return (EList<Interaction>)FLOW_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowDefinition() {
		return !getFlowDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interaction> getInteraction() {
		return getFlowDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInteraction() {
  		return false;
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

	// Operations
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> inputParameters() {
		try {
			return (EList<Feature>)INPUT_PARAMETERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Feature inputParameter(int i) {
		try {
			return (Feature)INPUT_PARAMETER_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{i}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
	public Expression argument(int i) {
		try {
			return (Expression)ARGUMENT_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{i}));
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
	public boolean isSubactionUsage() {
		try {
			return (Boolean)IS_SUBACTION_USAGE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	// Additional overrides
	
	@Override
	public boolean isAbstract() {
		if (getRelatedFeature().size() < 2) {
			isAbstract = true;
		}
		return super.isAbstract();
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FLOW_USAGE__OCCURRENCE_DEFINITION:
				return getOccurrenceDefinition();
			case SysMLPackage.FLOW_USAGE__INDIVIDUAL_DEFINITION:
				if (resolve) return getIndividualDefinition();
				return basicGetIndividualDefinition();
			case SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL:
				return isIndividual();
			case SysMLPackage.FLOW_USAGE__PORTION_KIND:
				return getPortionKind();
			case SysMLPackage.FLOW_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.FLOW_USAGE__PARAMETER:
				return getParameter();
			case SysMLPackage.FLOW_USAGE__ACTION_DEFINITION:
				return getActionDefinition();
			case SysMLPackage.FLOW_USAGE__PAYLOAD_TYPE:
				return getPayloadType();
			case SysMLPackage.FLOW_USAGE__TARGET_INPUT_FEATURE:
				if (resolve) return getTargetInputFeature();
				return basicGetTargetInputFeature();
			case SysMLPackage.FLOW_USAGE__SOURCE_OUTPUT_FEATURE:
				if (resolve) return getSourceOutputFeature();
				return basicGetSourceOutputFeature();
			case SysMLPackage.FLOW_USAGE__FLOW_END:
				return getFlowEnd();
			case SysMLPackage.FLOW_USAGE__PAYLOAD_FEATURE:
				if (resolve) return getPayloadFeature();
				return basicGetPayloadFeature();
			case SysMLPackage.FLOW_USAGE__INTERACTION:
				return getInteraction();
			case SysMLPackage.FLOW_USAGE__FLOW_DEFINITION:
				return getFlowDefinition();
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
			case SysMLPackage.FLOW_USAGE__OCCURRENCE_DEFINITION:
				getOccurrenceDefinition().clear();
				getOccurrenceDefinition().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__INDIVIDUAL_DEFINITION:
				setIndividualDefinition((OccurrenceDefinition)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL:
				setIsIndividual((Boolean)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__PORTION_KIND:
				setPortionKind((PortionKind)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__ACTION_DEFINITION:
				getActionDefinition().clear();
				getActionDefinition().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__PAYLOAD_TYPE:
				getPayloadType().clear();
				getPayloadType().addAll((Collection<? extends Classifier>)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__TARGET_INPUT_FEATURE:
				setTargetInputFeature((Feature)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__SOURCE_OUTPUT_FEATURE:
				setSourceOutputFeature((Feature)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__FLOW_END:
				getFlowEnd().clear();
				getFlowEnd().addAll((Collection<? extends FlowEnd>)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__PAYLOAD_FEATURE:
				setPayloadFeature((PayloadFeature)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends Interaction>)newValue);
				return;
			case SysMLPackage.FLOW_USAGE__FLOW_DEFINITION:
				getFlowDefinition().clear();
				getFlowDefinition().addAll((Collection<? extends Interaction>)newValue);
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
			case SysMLPackage.FLOW_USAGE__OCCURRENCE_DEFINITION:
				getOccurrenceDefinition().clear();
				return;
			case SysMLPackage.FLOW_USAGE__INDIVIDUAL_DEFINITION:
				setIndividualDefinition((OccurrenceDefinition)null);
				return;
			case SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL:
				setIsIndividual(IS_INDIVIDUAL_EDEFAULT);
				return;
			case SysMLPackage.FLOW_USAGE__PORTION_KIND:
				setPortionKind(PORTION_KIND_EDEFAULT);
				return;
			case SysMLPackage.FLOW_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.FLOW_USAGE__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.FLOW_USAGE__ACTION_DEFINITION:
				getActionDefinition().clear();
				return;
			case SysMLPackage.FLOW_USAGE__PAYLOAD_TYPE:
				getPayloadType().clear();
				return;
			case SysMLPackage.FLOW_USAGE__TARGET_INPUT_FEATURE:
				setTargetInputFeature((Feature)null);
				return;
			case SysMLPackage.FLOW_USAGE__SOURCE_OUTPUT_FEATURE:
				setSourceOutputFeature((Feature)null);
				return;
			case SysMLPackage.FLOW_USAGE__FLOW_END:
				getFlowEnd().clear();
				return;
			case SysMLPackage.FLOW_USAGE__PAYLOAD_FEATURE:
				setPayloadFeature((PayloadFeature)null);
				return;
			case SysMLPackage.FLOW_USAGE__INTERACTION:
				getInteraction().clear();
				return;
			case SysMLPackage.FLOW_USAGE__FLOW_DEFINITION:
				getFlowDefinition().clear();
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
			case SysMLPackage.FLOW_USAGE__DEFINITION:
				return isSetDefinition();
			case SysMLPackage.FLOW_USAGE__OCCURRENCE_DEFINITION:
				return isSetOccurrenceDefinition();
			case SysMLPackage.FLOW_USAGE__INDIVIDUAL_DEFINITION:
				return INDIVIDUAL_DEFINITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL:
				return isIndividual != IS_INDIVIDUAL_EDEFAULT;
			case SysMLPackage.FLOW_USAGE__PORTION_KIND:
				return portionKind != PORTION_KIND_EDEFAULT;
			case SysMLPackage.FLOW_USAGE__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.FLOW_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.FLOW_USAGE__PARAMETER:
				return isSetParameter();
			case SysMLPackage.FLOW_USAGE__ACTION_DEFINITION:
				return isSetActionDefinition();
			case SysMLPackage.FLOW_USAGE__ASSOCIATION:
				return isSetAssociation();
			case SysMLPackage.FLOW_USAGE__PAYLOAD_TYPE:
				return PAYLOAD_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_USAGE__TARGET_INPUT_FEATURE:
				return TARGET_INPUT_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_USAGE__SOURCE_OUTPUT_FEATURE:
				return SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_USAGE__FLOW_END:
				return FLOW_END__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_USAGE__PAYLOAD_FEATURE:
				return PAYLOAD_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_USAGE__INTERACTION:
				return isSetInteraction();
			case SysMLPackage.FLOW_USAGE__FLOW_DEFINITION:
				return isSetFlowDefinition();
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
		if (baseClass == OccurrenceUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_USAGE__OCCURRENCE_DEFINITION: return SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION;
				case SysMLPackage.FLOW_USAGE__INDIVIDUAL_DEFINITION: return SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION;
				case SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL: return SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL;
				case SysMLPackage.FLOW_USAGE__PORTION_KIND: return SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND;
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
				case SysMLPackage.FLOW_USAGE__PAYLOAD_TYPE: return SysMLPackage.FLOW__PAYLOAD_TYPE;
				case SysMLPackage.FLOW_USAGE__TARGET_INPUT_FEATURE: return SysMLPackage.FLOW__TARGET_INPUT_FEATURE;
				case SysMLPackage.FLOW_USAGE__SOURCE_OUTPUT_FEATURE: return SysMLPackage.FLOW__SOURCE_OUTPUT_FEATURE;
				case SysMLPackage.FLOW_USAGE__FLOW_END: return SysMLPackage.FLOW__FLOW_END;
				case SysMLPackage.FLOW_USAGE__PAYLOAD_FEATURE: return SysMLPackage.FLOW__PAYLOAD_FEATURE;
				case SysMLPackage.FLOW_USAGE__INTERACTION: return SysMLPackage.FLOW__INTERACTION;
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
				case SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION: return SysMLPackage.FLOW_USAGE__OCCURRENCE_DEFINITION;
				case SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION: return SysMLPackage.FLOW_USAGE__INDIVIDUAL_DEFINITION;
				case SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL: return SysMLPackage.FLOW_USAGE__IS_INDIVIDUAL;
				case SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND: return SysMLPackage.FLOW_USAGE__PORTION_KIND;
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
				case SysMLPackage.FLOW__PAYLOAD_TYPE: return SysMLPackage.FLOW_USAGE__PAYLOAD_TYPE;
				case SysMLPackage.FLOW__TARGET_INPUT_FEATURE: return SysMLPackage.FLOW_USAGE__TARGET_INPUT_FEATURE;
				case SysMLPackage.FLOW__SOURCE_OUTPUT_FEATURE: return SysMLPackage.FLOW_USAGE__SOURCE_OUTPUT_FEATURE;
				case SysMLPackage.FLOW__FLOW_END: return SysMLPackage.FLOW_USAGE__FLOW_END;
				case SysMLPackage.FLOW__PAYLOAD_FEATURE: return SysMLPackage.FLOW_USAGE__PAYLOAD_FEATURE;
				case SysMLPackage.FLOW__INTERACTION: return SysMLPackage.FLOW_USAGE__INTERACTION;
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
				case SysMLPackage.ACTION_USAGE___INPUT_PARAMETERS: return SysMLPackage.FLOW_USAGE___INPUT_PARAMETERS;
				case SysMLPackage.ACTION_USAGE___INPUT_PARAMETER__INT: return SysMLPackage.FLOW_USAGE___INPUT_PARAMETER__INT;
				case SysMLPackage.ACTION_USAGE___ARGUMENT__INT: return SysMLPackage.FLOW_USAGE___ARGUMENT__INT;
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
			case SysMLPackage.FLOW_USAGE___INPUT_PARAMETERS:
				return inputParameters();
			case SysMLPackage.FLOW_USAGE___INPUT_PARAMETER__INT:
				return inputParameter((Integer)arguments.get(0));
			case SysMLPackage.FLOW_USAGE___ARGUMENT__INT:
				return argument((Integer)arguments.get(0));
			case SysMLPackage.FLOW_USAGE___IS_SUBACTION_USAGE:
				return isSubactionUsage();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isIndividual: ");
		result.append(isIndividual);
		result.append(", portionKind: ");
		result.append(portionKind);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getDefinition() {
		@SuppressWarnings("unchecked")
		EList<Classifier> occurrenceDefinition = (EList<Classifier>)((EList<?>)getOccurrenceDefinition());
		return occurrenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinition() {
  		return false;
	}

} //FlowConnectionUsageImpl
