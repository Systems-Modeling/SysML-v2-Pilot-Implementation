/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Siemens AG
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Type;

public class Type_ownedConjugator_SettingDelegate extends BasicDerivedObjectSettingDelegate {

	public Type_ownedConjugator_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected EObject basicGet(InternalEObject owner) {
		return (Conjugation) ((Type)owner).getOwnedRelationship().stream().
				filter(Conjugation.class::isInstance).
				findFirst().orElse(null);
	}
	
	protected void set(InternalEObject owner, Conjugation newOwnedConjugator) {
		throw new UnsupportedOperationException();
	}

}
