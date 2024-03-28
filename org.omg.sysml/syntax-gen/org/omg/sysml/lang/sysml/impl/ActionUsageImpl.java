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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

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
public class ActionUsageImpl extends OccurrenceUsageImpl implements ActionUsage {
	
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
	 * The cached setting delegate for the '{@link #getActionDefinition() <em>Action Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ACTION_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ACTION_USAGE__ACTION_DEFINITION).getSettingDelegate();

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
	public EList<Behavior> getActionDefinition() {
		return (EList<Behavior>)ACTION_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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

	//

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
			case SysMLPackage.ACTION_USAGE__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.ACTION_USAGE__PARAMETER:
				return isSetParameter();
			case SysMLPackage.ACTION_USAGE__OCCURRENCE_DEFINITION:
				return isSetOccurrenceDefinition();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.ACTION_USAGE___INPUT_PARAMETERS:
				return inputParameters();
			case SysMLPackage.ACTION_USAGE___INPUT_PARAMETER__INT:
				return inputParameter((Integer)arguments.get(0));
			case SysMLPackage.ACTION_USAGE___ARGUMENT__INT:
				return argument((Integer)arguments.get(0));
			case SysMLPackage.ACTION_USAGE___IS_SUBACTION_USAGE:
				return isSubactionUsage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionImpl
