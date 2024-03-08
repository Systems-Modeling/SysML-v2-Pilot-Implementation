/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Siemens AG
 * Copyright (c) 2022, 2023 Model Driven Solutions, Inc.
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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.NonNotifyingEObjectEList;

public class Type_input_SettingDelegate extends BasicDerivedListSettingDelegate {

	public Type_input_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected EList<?> basicGet(InternalEObject owner) {
		EList<Feature> inputs = new NonNotifyingEObjectEList<>(Feature.class, owner, eStructuralFeature.getFeatureID());
		addInputsOf((Type)owner, inputs, new HashSet<Type>());
		return inputs;
	}
	
	public static void addInputsOf(Type type, EList<Feature> inputs, Set<Type> visited) {
		visited.add(type);
		type.getOwnedFeature().stream().filter(feature->
			FeatureDirectionKind.IN.equals(feature.getDirection()) ||
			FeatureDirectionKind.INOUT.equals(feature.getDirection())).
				forEachOrdered(inputs::add);
		Conjugation conjugator = type.getOwnedConjugator();
		if (conjugator != null) {
			Type_output_SettingDelegate.addOutputsOf(conjugator.getOriginalType(), inputs, visited);
		} else {
			type.getOwnedSpecialization().stream().
				map(Specialization::getGeneral).
				filter(g->!visited.contains(g)).
				forEachOrdered(supertype->addInputsOf(supertype, inputs, visited));
		}
	}

}
