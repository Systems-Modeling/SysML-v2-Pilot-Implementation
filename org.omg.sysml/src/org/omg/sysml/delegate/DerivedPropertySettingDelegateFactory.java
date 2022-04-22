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
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class DerivedPropertySettingDelegateFactory 
	implements EStructuralFeature.Internal.SettingDelegate.Factory {

	@Override
	public SettingDelegate createSettingDelegate(EStructuralFeature eStructuralFeature) {
		switch (eStructuralFeature.getFeatureID()) {
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT:
				return new AcceptActionUsage_payloadArgumentDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER:
				return new AcceptActionUsage_payloadParameterDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				return new AcceptActionUsage_receiverArgumentDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				return new Element_documentationDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				return new Element_effectiveNameDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__NAME:
				return new Element_nameDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				return new Element_ownedAnnotationDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return new Element_ownedElementDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNER:
				return new Element_ownerDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return new Element_owningMembershipDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				return new Element_owningNamespaceDerived_PropertySettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return new Element_qualifiedNameDerived_PropertySettingDelegate(eStructuralFeature);
			default:
				return new DefaultDerivedPropertySettingDelegate(eStructuralFeature);
		}	
	}

}
