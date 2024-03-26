/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.AssociationStructure;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.UsageUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Connection Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getItemFlowEnd <em>Item Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getItemFeature <em>Item Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionUsageImpl#getFlowConnectionDefinition <em>Flow Connection Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowConnectionUsageImpl extends ConnectionUsageImpl implements FlowConnectionUsage {
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
	 * The cached setting delegate for the '{@link #getTargetInputFeature() <em>Target Input Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_INPUT_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ITEM_FLOW__TARGET_INPUT_FEATURE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getSourceOutputFeature() <em>Source Output Feature</em>}' reference.
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
	 * The cached setting delegate for the '{@link #getItemFeature() <em>Item Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ITEM_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ITEM_FLOW__ITEM_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFlowConnectionDefinition() <em>Flow Connection Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConnectionDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FLOW_CONNECTION_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW_CONNECTION_USAGE__FLOW_CONNECTION_DEFINITION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowConnectionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FLOW_CONNECTION_USAGE;
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
		EList<Behavior> flowConnectionDefinition = (EList<Behavior>)((EList<?>)getFlowConnectionDefinition());
		return flowConnectionDefinition;
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
	public EList<Classifier> getItemType() {
		return (EList<Classifier>)ITEM_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	public EList<ItemFlowEnd> getItemFlowEnd() {
		return (EList<ItemFlowEnd>)ITEM_FLOW_END__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemFeature getItemFeature() {
		return (ItemFeature)ITEM_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemFeature basicGetItemFeature() {
		return (ItemFeature)ITEM_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemFeature(ItemFeature newItemFeature) {
		ITEM_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newItemFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interaction> getInteraction() {
		return getFlowConnectionDefinition();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Interaction> getFlowConnectionDefinition() {
		return (EList<Interaction>)FLOW_CONNECTION_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowConnectionDefinition() {
		return !getFlowConnectionDefinition().isEmpty();
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
		EList<Association> connectionDefinition = (EList<Association>)((EList<?>)getConnectionDefinition());
		return connectionDefinition;
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
	public EList<AssociationStructure> getConnectionDefinition() {
		@SuppressWarnings("unchecked")
		EList<AssociationStructure> flowConnectionDefinition = (EList<AssociationStructure>)((EList<?>)getFlowConnectionDefinition());
		return flowConnectionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionDefinition() {
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
	 * @generated NOT
	 */
	public Feature inputParameter(int i) {
		EList<Feature> parameters = inputParameters();
		return parameters.size() > i? null: parameters.get(i-1);
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
	 * @generated NOT
	 */
	public Expression argument(int i) {
		return UsageUtil.getArgumentOf(this, i);
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
	 * @generated NOT
	 */
	public boolean isSubactionUsage() {
		Type owningType = getOwningType();
		FeatureMembership owningMembership = getOwningFeatureMembership();
		return isComposite() && 
			   (owningType instanceof ActionDefinition || owningType instanceof ActionUsage) &&
			    (!(owningMembership instanceof StateSubactionMembership) ||
			     ((StateSubactionMembership)owningMembership).getKind() == StateSubactionKind.DO);
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
			case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER:
				return getParameter();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ACTION_DEFINITION:
				return getActionDefinition();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE:
				return getItemType();
			case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE:
				if (resolve) return getTargetInputFeature();
				return basicGetTargetInputFeature();
			case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE:
				if (resolve) return getSourceOutputFeature();
				return basicGetSourceOutputFeature();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END:
				return getItemFlowEnd();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE:
				if (resolve) return getItemFeature();
				return basicGetItemFeature();
			case SysMLPackage.FLOW_CONNECTION_USAGE__INTERACTION:
				return getInteraction();
			case SysMLPackage.FLOW_CONNECTION_USAGE__FLOW_CONNECTION_DEFINITION:
				return getFlowConnectionDefinition();
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
			case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ACTION_DEFINITION:
				getActionDefinition().clear();
				getActionDefinition().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE:
				getItemType().clear();
				getItemType().addAll((Collection<? extends Classifier>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE:
				setTargetInputFeature((Feature)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE:
				setSourceOutputFeature((Feature)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END:
				getItemFlowEnd().clear();
				getItemFlowEnd().addAll((Collection<? extends ItemFlowEnd>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE:
				setItemFeature((ItemFeature)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__INTERACTION:
				getInteraction().clear();
				getInteraction().addAll((Collection<? extends Interaction>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__FLOW_CONNECTION_DEFINITION:
				getFlowConnectionDefinition().clear();
				getFlowConnectionDefinition().addAll((Collection<? extends Interaction>)newValue);
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
			case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ACTION_DEFINITION:
				getActionDefinition().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE:
				getItemType().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE:
				setTargetInputFeature((Feature)null);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE:
				setSourceOutputFeature((Feature)null);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END:
				getItemFlowEnd().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE:
				setItemFeature((ItemFeature)null);
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__INTERACTION:
				getInteraction().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_USAGE__FLOW_CONNECTION_DEFINITION:
				getFlowConnectionDefinition().clear();
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
			case SysMLPackage.FLOW_CONNECTION_USAGE__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER:
				return isSetParameter();
			case SysMLPackage.FLOW_CONNECTION_USAGE__OCCURRENCE_DEFINITION:
				return isSetOccurrenceDefinition();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ACTION_DEFINITION:
				return isSetActionDefinition();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ASSOCIATION:
				return isSetAssociation();
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE:
				return ITEM_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE:
				return TARGET_INPUT_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE:
				return SOURCE_OUTPUT_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END:
				return ITEM_FLOW_END__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE:
				return ITEM_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FLOW_CONNECTION_USAGE__INTERACTION:
				return isSetInteraction();
			case SysMLPackage.FLOW_CONNECTION_USAGE__CONNECTION_DEFINITION:
				return isSetConnectionDefinition();
			case SysMLPackage.FLOW_CONNECTION_USAGE__FLOW_CONNECTION_DEFINITION:
				return isSetFlowConnectionDefinition();
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
				case SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
				case SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER: return SysMLPackage.STEP__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ActionUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_CONNECTION_USAGE__ACTION_DEFINITION: return SysMLPackage.ACTION_USAGE__ACTION_DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == ItemFlow.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE: return SysMLPackage.ITEM_FLOW__ITEM_TYPE;
				case SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE: return SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE;
				case SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE: return SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE;
				case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END: return SysMLPackage.ITEM_FLOW__ITEM_FLOW_END;
				case SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE: return SysMLPackage.ITEM_FLOW__ITEM_FEATURE;
				case SysMLPackage.FLOW_CONNECTION_USAGE__INTERACTION: return SysMLPackage.ITEM_FLOW__INTERACTION;
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
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.FLOW_CONNECTION_USAGE__BEHAVIOR;
				case SysMLPackage.STEP__PARAMETER: return SysMLPackage.FLOW_CONNECTION_USAGE__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ActionUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ACTION_USAGE__ACTION_DEFINITION: return SysMLPackage.FLOW_CONNECTION_USAGE__ACTION_DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == ItemFlow.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ITEM_FLOW__ITEM_TYPE: return SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_TYPE;
				case SysMLPackage.ITEM_FLOW__TARGET_INPUT_FEATURE: return SysMLPackage.FLOW_CONNECTION_USAGE__TARGET_INPUT_FEATURE;
				case SysMLPackage.ITEM_FLOW__SOURCE_OUTPUT_FEATURE: return SysMLPackage.FLOW_CONNECTION_USAGE__SOURCE_OUTPUT_FEATURE;
				case SysMLPackage.ITEM_FLOW__ITEM_FLOW_END: return SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FLOW_END;
				case SysMLPackage.ITEM_FLOW__ITEM_FEATURE: return SysMLPackage.FLOW_CONNECTION_USAGE__ITEM_FEATURE;
				case SysMLPackage.ITEM_FLOW__INTERACTION: return SysMLPackage.FLOW_CONNECTION_USAGE__INTERACTION;
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
		if (baseClass == Step.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ActionUsage.class) {
			switch (baseOperationID) {
				case SysMLPackage.ACTION_USAGE___INPUT_PARAMETERS: return SysMLPackage.FLOW_CONNECTION_USAGE___INPUT_PARAMETERS;
				case SysMLPackage.ACTION_USAGE___INPUT_PARAMETER__INT: return SysMLPackage.FLOW_CONNECTION_USAGE___INPUT_PARAMETER__INT;
				case SysMLPackage.ACTION_USAGE___ARGUMENT__INT: return SysMLPackage.FLOW_CONNECTION_USAGE___ARGUMENT__INT;
				case SysMLPackage.ACTION_USAGE___IS_SUBACTION_USAGE: return SysMLPackage.FLOW_CONNECTION_USAGE___IS_SUBACTION_USAGE;
				default: return -1;
			}
		}
		if (baseClass == ItemFlow.class) {
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
			case SysMLPackage.FLOW_CONNECTION_USAGE___INPUT_PARAMETERS:
				return inputParameters();
			case SysMLPackage.FLOW_CONNECTION_USAGE___INPUT_PARAMETER__INT:
				return inputParameter((Integer)arguments.get(0));
			case SysMLPackage.FLOW_CONNECTION_USAGE___ARGUMENT__INT:
				return argument((Integer)arguments.get(0));
			case SysMLPackage.FLOW_CONNECTION_USAGE___IS_SUBACTION_USAGE:
				return isSubactionUsage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FlowConnectionUsageImpl
