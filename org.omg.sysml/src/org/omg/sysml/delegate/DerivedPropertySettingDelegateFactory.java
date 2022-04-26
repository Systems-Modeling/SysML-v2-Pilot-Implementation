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
	
	public static final String SYSML_ANNOTATION = "http://www.omg.org/spec/SysML";

	@Override
	public SettingDelegate createSettingDelegate(EStructuralFeature eStructuralFeature) {
		switch (eStructuralFeature.getFeatureID()) {
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT:
				return new AcceptActionUsage_payloadArgument_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER:
				return new AcceptActionUsage_payloadParameter_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				return new AcceptActionUsage_receiverArgument_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				return new Element_effectiveName_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__NAME:
				return new Element_name_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				return new Element_ownedAnnotation_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return new Element_ownedElement_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNER:
				return new Element_owner_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return new Element_owningMembership_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				return new Element_owningNamespace_SettingDelegate(eStructuralFeature);
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return new Element_qualifiedName_SettingDelegate(eStructuralFeature);
			default:
				return new DefaultDerivedPropertySettingDelegate(eStructuralFeature);
		}	
	}

}
