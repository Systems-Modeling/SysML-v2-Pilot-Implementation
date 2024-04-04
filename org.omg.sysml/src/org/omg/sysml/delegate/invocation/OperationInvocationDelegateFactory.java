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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EOperation.Internal.InvocationDelegate;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;

public class OperationInvocationDelegateFactory implements InvocationDelegate.Factory {
	
	public static final String SYSML_ANNOTATION = "http://www.omg.org/spec/SysML";
	
	private static final Map<EOperation, OperationInvocationDelegateSelector> selectorMap = new HashMap<>();

	@Override
	public InvocationDelegate createInvocationDelegate(EOperation eOperation) {
		return getInvocationDelegate(eOperation);
	}
	
	public static InvocationDelegate getInvocationDelegate(EClass eClass, EOperation eOperation) {
		OperationInvocationDelegateSelector selector = (OperationInvocationDelegateSelector) getInvocationDelegate(eOperation);
		
		return selector.calculateInvocationDelegateRecursive(eClass);
	}
	
	public static InvocationDelegate getInvocationDelegate(EOperation eOperation) {
		if (eOperation.getEAnnotation(SYSML_ANNOTATION) == null) {
			// This is not our operation, use default invocation delegate
			return new BasicInvocationDelegate(eOperation);
		}
		
		OperationInvocationDelegateSelector selector = selectorMap.get(eOperation);
		
		if (selector != null) {
			return selector;
		}
		
		if (selector == null) {
			selector = new OperationInvocationDelegateSelector(eOperation);
			selectorMap.put(eOperation, selector);
		}
		
		return selector;
	}
 
}
