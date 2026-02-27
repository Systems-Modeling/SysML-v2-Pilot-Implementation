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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.StateDefinition;
import org.omg.sysml.model.sysml.StateUsage;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateDefinitionImpl#isIsParallel <em>Is Parallel</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateDefinitionImpl#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateDefinitionImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateDefinitionImpl#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.StateDefinitionImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateDefinitionImpl extends ActionDefinitionImpl implements StateDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STATE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsParallel() {
		return (Boolean)eGet(SysMLPackage.Literals.STATE_DEFINITION__IS_PARALLEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsParallel(boolean newIsParallel) {
		eSet(SysMLPackage.Literals.STATE_DEFINITION__IS_PARALLEL, newIsParallel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getDoAction() {
		return (ActionUsage)eGet(SysMLPackage.Literals.STATE_DEFINITION__DO_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoAction(ActionUsage newDoAction) {
		eSet(SysMLPackage.Literals.STATE_DEFINITION__DO_ACTION, newDoAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getEntryAction() {
		return (ActionUsage)eGet(SysMLPackage.Literals.STATE_DEFINITION__ENTRY_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryAction(ActionUsage newEntryAction) {
		eSet(SysMLPackage.Literals.STATE_DEFINITION__ENTRY_ACTION, newEntryAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getExitAction() {
		return (ActionUsage)eGet(SysMLPackage.Literals.STATE_DEFINITION__EXIT_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitAction(ActionUsage newExitAction) {
		eSet(SysMLPackage.Literals.STATE_DEFINITION__EXIT_ACTION, newExitAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<StateUsage> getState() {
		return (EList<StateUsage>)eGet(SysMLPackage.Literals.STATE_DEFINITION__STATE, true);
	}

} //StateDefinitionImpl
