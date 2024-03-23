/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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

package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EOperation;
import org.omg.sysml.lang.sysml.ControlNode;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ControlNodeImpl extends ActionUsageImpl implements ControlNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONTROL_NODE;
	}

	/**
	 * The cached invocation delegate for the '{@link #multiplicityHasBounds(org.omg.sysml.lang.sysml.Multiplicity, int, int) <em>Multiplicity Has Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #multiplicityHasBounds(org.omg.sysml.lang.sysml.Multiplicity, int, int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MULTIPLICITY_HAS_BOUNDS_MULTIPLICITY_INT_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.CONTROL_NODE___MULTIPLICITY_HAS_BOUNDS__MULTIPLICITY_INT_INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean multiplicityHasBounds(Multiplicity mult, int lower, int upper) {
		try {
			return (Boolean)MULTIPLICITY_HAS_BOUNDS_MULTIPLICITY_INT_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(3, new Object[]{mult, lower, upper}));
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
			case SysMLPackage.CONTROL_NODE___MULTIPLICITY_HAS_BOUNDS__MULTIPLICITY_INT_INT:
				return multiplicityHasBounds((Multiplicity)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ControlNodeImpl
