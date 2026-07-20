/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.delegate.invocation;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.impl.NamespaceImpl;
import org.omg.sysml.util.NamespaceUtil;

public class Namespace_visibleMemberships_InvocationDelegate extends BasicInvocationDelegate {
	
	public Namespace_visibleMemberships_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		NamespaceImpl self = (NamespaceImpl) target;
		@SuppressWarnings("unchecked")
		EList<Namespace> excluded = (EList<Namespace>) arguments.get(0);
		boolean isRecursive = (boolean) arguments.get(1);
		boolean includeAll = (boolean) arguments.get(2);
		
		return NamespaceUtil.getVisibleMembershipsFor(self, new HashSet<>(excluded), isRecursive, includeAll);
	}

}
