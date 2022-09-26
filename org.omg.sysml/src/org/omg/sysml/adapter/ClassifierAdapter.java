/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class ClassifierAdapter extends TypeAdapter {
	
	public ClassifierAdapter(Classifier element) {
		super(element);
	}
	
	@Override
	public Classifier getTarget() {
		return (Classifier)super.getTarget();
	}

	@Override
	protected EClass getSpecializationEClass() {
		return SysMLPackage.eINSTANCE.getSubclassification();
	}
	
	@Override
	protected List<Type> getBaseTypes() {
		return super.getBaseTypes().stream().
				flatMap(type->type instanceof Feature? 
						((Feature)type).getType().stream(): 
						Stream.of(type)).
				filter(Classifier.class::isInstance).
				collect(Collectors.toList());
	}
	
}
