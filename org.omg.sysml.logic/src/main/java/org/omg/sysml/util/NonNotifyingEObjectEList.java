/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
 * Contributors:
 *  Zoltan Ujhelyi
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.util;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

public class NonNotifyingEObjectEList<T> extends EObjectEList<T> {

	private static final long serialVersionUID = -189113090526844372L;
	
	protected boolean isUnique;
	
	public NonNotifyingEObjectEList(Class<?> dataClass, InternalEObject owner, int featureID) {
		this(dataClass, owner, featureID, true);
	}

	public NonNotifyingEObjectEList(Class<?> dataClass, InternalEObject owner, int featureID, boolean isUnique) {
		super(dataClass, owner, featureID);
		this.isUnique = isUnique;
	}
	
	@Override
	public boolean isUnique() {
		return this.isUnique;
	}
	
	@Override
	protected boolean canContainNull() {
		return !this.isUnique;
	}

	@Override
	protected boolean isNotificationRequired() {
		return false;
	}

}
