/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
 *  
 *******************************************************************************/

package org.omg.sysml.delegate.invocation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;

public class OperationInvocationDelegateSelector extends BasicInvocationDelegate {
	
	private static final String PACKAGE_NAME = OperationInvocationDelegateSelector.class.getPackage().getName();
	
	private final Map<EClass, BasicInvocationDelegate> delegateMap = new HashMap<>();

	public OperationInvocationDelegateSelector(EOperation operation) {
		super(operation);
	}
		
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		BasicInvocationDelegate delegate = calculateInvocationDelegateRecursive(target.eClass());
		
		if (delegate == null) {
			throw new RuntimeException("Could not find any applicable invocation delegate implementation for operation: " + eOperation.getName());
		}
		
		return delegate.dynamicInvoke(target, arguments);
	}
	
	protected BasicInvocationDelegate calculateInvocationDelegateRecursive(EClass eClass) {
		BasicInvocationDelegate delegate = delegateMap.get(eClass);
		
		if (delegate != null) {
			return delegate;
		}
		
		delegate = getInvocationDelegate(eClass);
		
		if (delegate != null) {
			delegateMap.put(eClass, delegate);
			return delegate;
		}
		
		for (EClass superclass : eClass.getESuperTypes()) {
			delegate = calculateInvocationDelegateRecursive(superclass);
			
			if (delegate != null) {
				delegateMap.put(eClass, delegate);
				return delegate;
			}
		}
		
		return null;
	}
	
	protected BasicInvocationDelegate getInvocationDelegate(EClass eClass) {
		Constructor<?> constructor = getDelegateConstructor(eClass);

		if (constructor == null) {
			// This eClass does not have a specific delegate implementation
			return null;
		}
		
		try {
			return (BasicInvocationDelegate) constructor.newInstance(eOperation);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected Constructor<?> getDelegateConstructor(EClass eClass) {		
		String delegateName = PACKAGE_NAME + "." + 
				eClass.getName() + "_" + 
				eOperation.getName() + "_InvocationDelegate";
		
		try {
			return Class.forName(delegateName).getConstructor(EOperation.class);
		} catch (ClassNotFoundException e) {
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
