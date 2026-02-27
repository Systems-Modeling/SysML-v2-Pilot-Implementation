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
import org.omg.sysml.model.sysml.StateUsage;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateUsageImpl#isIsParallel <em>Is Parallel</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateUsageImpl#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateUsageImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateUsageImpl#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateUsageImpl#getStateDefinition <em>State Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateUsageImpl extends ActionUsageImpl implements StateUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STATE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsParallel() {
		return (Boolean)eGet(SysMLPackage.Literals.STATE_USAGE__IS_PARALLEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsParallel(boolean newIsParallel) {
		eSet(SysMLPackage.Literals.STATE_USAGE__IS_PARALLEL, newIsParallel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getDoAction() {
		return (ActionUsage)eGet(SysMLPackage.Literals.STATE_USAGE__DO_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoAction(ActionUsage newDoAction) {
		eSet(SysMLPackage.Literals.STATE_USAGE__DO_ACTION, newDoAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getEntryAction() {
		return (ActionUsage)eGet(SysMLPackage.Literals.STATE_USAGE__ENTRY_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryAction(ActionUsage newEntryAction) {
		eSet(SysMLPackage.Literals.STATE_USAGE__ENTRY_ACTION, newEntryAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getExitAction() {
		return (ActionUsage)eGet(SysMLPackage.Literals.STATE_USAGE__EXIT_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitAction(ActionUsage newExitAction) {
		eSet(SysMLPackage.Literals.STATE_USAGE__EXIT_ACTION, newExitAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Behavior> getStateDefinition() {
		return (EList<Behavior>)eGet(SysMLPackage.Literals.STATE_USAGE__STATE_DEFINITION, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #isSubstateUsage(boolean) <em>Is Substate Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstateUsage(boolean)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SUBSTATE_USAGE_BOOLEAN__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.STATE_USAGE___IS_SUBSTATE_USAGE__BOOLEAN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSubstateUsage(boolean isParallel) {
		try {
			return (Boolean)IS_SUBSTATE_USAGE_BOOLEAN__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{isParallel}));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.STATE_USAGE___IS_SUBSTATE_USAGE__BOOLEAN:
				return isSubstateUsage((Boolean)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getActionDefinition() {
		var sourceValue = this.getStateDefinition();
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

} //StateUsageImpl
