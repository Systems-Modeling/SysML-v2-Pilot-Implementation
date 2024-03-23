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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getTriggerAction <em>Trigger Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getEffectAction <em>Effect Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getSuccession <em>Succession</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionUsageImpl extends ActionUsageImpl implements TransitionUsage {
	
	/**
	 * The cached setting delegate for the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TRANSITION_USAGE__SOURCE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TRANSITION_USAGE__TARGET).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTriggerAction() <em>Trigger Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TRIGGER_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TRANSITION_USAGE__TRIGGER_ACTION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getGuardExpression() <em>Guard Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GUARD_EXPRESSION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TRANSITION_USAGE__GUARD_EXPRESSION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getEffectAction() <em>Effect Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EFFECT_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TRANSITION_USAGE__EFFECT_ACTION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSuccession() <em>Succession</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccession()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SUCCESSION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.TRANSITION_USAGE__SUCCESSION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TRANSITION_USAGE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getSource() {
		return (ActionUsage)SOURCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetSource() {
		return (ActionUsage)SOURCE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ActionUsage newSource) {
		SOURCE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getTarget() {
		return (ActionUsage)TARGET__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetTarget() {
		return (ActionUsage)TARGET__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ActionUsage newTarget) {
		TARGET__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AcceptActionUsage> getTriggerAction() {
		return (EList<AcceptActionUsage>)TRIGGER_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getGuardExpression() {
		return (EList<Expression>)GUARD_EXPRESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionUsage> getEffectAction() {
		return (EList<ActionUsage>)EFFECT_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Succession getSuccession() {
		return (Succession)SUCCESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Succession basicGetSuccession() {
		return (Succession)SUCCESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccession(Succession newSuccession) {
		SUCCESSION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSuccession);
	}
	
	/**
	 * The cached invocation delegate for the '{@link #triggerPayloadParameter() <em>Trigger Payload Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #triggerPayloadParameter()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TRIGGER_PAYLOAD_PARAMETER__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.TRANSITION_USAGE___TRIGGER_PAYLOAD_PARAMETER).getInvocationDelegate();

	// Operations
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceUsage triggerPayloadParameter() {
		try {
			return (ReferenceUsage)TRIGGER_PAYLOAD_PARAMETER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				return getTriggerAction();
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				return getGuardExpression();
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				return getEffectAction();
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				if (resolve) return getSuccession();
				return basicGetSuccession();
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
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				setSource((ActionUsage)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				setTarget((ActionUsage)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				getTriggerAction().clear();
				getTriggerAction().addAll((Collection<? extends AcceptActionUsage>)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				getGuardExpression().clear();
				getGuardExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				getEffectAction().clear();
				getEffectAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				setSuccession((Succession)newValue);
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
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				setSource((ActionUsage)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				setTarget((ActionUsage)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				getTriggerAction().clear();
				return;
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				getGuardExpression().clear();
				return;
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				getEffectAction().clear();
				return;
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				setSuccession((Succession)null);
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
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				return SOURCE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				return TARGET__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				return TRIGGER_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				return GUARD_EXPRESSION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				return EFFECT_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				return SUCCESSION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.TRANSITION_USAGE___TRIGGER_PAYLOAD_PARAMETER:
				return triggerPayloadParameter();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionStepImpl
