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

package org.omg.sysml.delegate;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.util.UsageUtil;

public class AcceptActionUsage_payloadParameterDerived_PropertySettingDelegate extends BasicSettingDelegate.Stateless {

	public AcceptActionUsage_payloadParameterDerived_PropertySettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {
		ReferenceUsage payloadParameter = basicGetPayloadParameter((AcceptActionUsage)owner);
		return payloadParameter != null && payloadParameter.eIsProxy() ? 
				(ReferenceUsage)owner.eResolveProxy((InternalEObject)payloadParameter) : payloadParameter;
	}

	private ReferenceUsage basicGetPayloadParameter(AcceptActionUsage owner) {
		Feature payloadParameter = UsageUtil.getPayloadParameterOf(owner);
		return payloadParameter instanceof ReferenceUsage? (ReferenceUsage)payloadParameter: null;
	}

	@Override
	protected boolean isSet(InternalEObject owner) {
		return false;
	}

}