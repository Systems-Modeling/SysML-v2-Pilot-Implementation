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
 *  
 *******************************************************************************/

package org.omg.sysml.delegate.invocation;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EOperation.Internal.InvocationDelegate;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;

public class OperationInvocationDelegateFactory implements InvocationDelegate.Factory {
	
	public static final String SYSML_ANNOTATION = "http://www.omg.org/spec/SysML";
	
	private static final String PACKAGE_NAME = OperationInvocationDelegateFactory.class.getPackage().getName();
	
	private final Map<EOperation, Constructor<?>> constructorMap = new HashMap<>();
	
	protected Constructor<?> getDelegateConstructor(EOperation eOperation) {
		Constructor<?> constructor = constructorMap.get(eOperation);
		if (constructor == null) {		
			try {
				String delegateName = PACKAGE_NAME + "." + 
						eOperation.getEContainingClass().getName() + "_" + 
						eOperation.getName() + "_InvocationDelegate";
				constructor = Class.forName(delegateName).getConstructor(EOperation.class);
				constructorMap.put(eOperation, constructor);
			} catch (ClassNotFoundException e) {
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		
		return constructor;
	}
	
	@Override
	public InvocationDelegate createInvocationDelegate(EOperation eOperation) {
		Constructor<?> constructor = getDelegateConstructor(eOperation);
		if (constructor == null) {
			return new BasicInvocationDelegate(eOperation);
		} else {
			try {
				return (InvocationDelegate) constructor.newInstance(eOperation);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

}
