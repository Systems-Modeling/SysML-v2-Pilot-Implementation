/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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

package org.omg.sysml.delegate.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.TypeUtil;

public class Usage_mayTimeVary_SettingDelegate extends BasicDerivedPropertySettingDelegate {

	public Usage_mayTimeVary_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected Boolean basicGet(InternalEObject owner) {
		Usage self = (Usage)owner;
		Type owningType = self.getOwningType();
		return owningType != null &&
			   TypeUtil.conforms(owningType, (Type)SysMLLibraryUtil.getLibraryElement(self, "Occurrences::Occurrence")) &&
			   !(self.isPortion() ||
			     TypeUtil.conforms(self, (Type)SysMLLibraryUtil.getLibraryElement(self, "Links::SelfLink")) ||
			     TypeUtil.conforms(self, (Type)SysMLLibraryUtil.getLibraryElement(self, "Occurrences::HappensLink")) ||
			     self.isComposite() && TypeUtil.conforms(self, (Type)SysMLLibraryUtil.getLibraryElement(self, "Actions::Action")));
	}

}
