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

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.TerminateActionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminate Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.TerminateActionUsageImpl#getTerminatedOccurrenceArgument <em>Terminated Occurrence Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminateActionUsageImpl extends ActionUsageImpl implements TerminateActionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminateActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TERMINATE_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getTerminatedOccurrenceArgument() {
		return (Expression)eGet(SysMLPackage.Literals.TERMINATE_ACTION_USAGE__TERMINATED_OCCURRENCE_ARGUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminatedOccurrenceArgument(Expression newTerminatedOccurrenceArgument) {
		eSet(SysMLPackage.Literals.TERMINATE_ACTION_USAGE__TERMINATED_OCCURRENCE_ARGUMENT, newTerminatedOccurrenceArgument);
	}

} //TerminateActionUsageImpl
