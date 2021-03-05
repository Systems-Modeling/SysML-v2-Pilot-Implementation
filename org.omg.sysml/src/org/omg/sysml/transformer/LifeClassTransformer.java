/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

package org.omg.sysml.transformer;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.util.TransformationUtil;

public class LifeClassTransformer extends ClassTransformer {

	public LifeClassTransformer(LifeClass element) {
		super(element);
	}
	
	@Override
	public LifeClass getElement() {
		return (LifeClass)super.getElement();
	}

	public void addSuperclassing() {
		LifeClass lifeClass = getElement();
		Namespace owner = lifeClass.getOwningNamespace();
		EList<Superclassing> superclassings = lifeClass.getOwnedSuperclassing();
		if (owner instanceof Classifier) {
			if (superclassings.size() < 2) {
				Superclassing superclassing = SysMLFactory.eINSTANCE.createSuperclassing();
				superclassing.setSuperclass((Classifier)owner);
				superclassing.setSubclass(lifeClass);
				lifeClass.getOwnedRelationship_comp().add(superclassing);
			} else {
				superclassings.get(1).setSuperclass((Classifier)owner);
			}
		}
	}
	
	public void addMultiplicity() {
		LifeClass lifeClass = getElement();
		Multiplicity multiplicity = lifeClass.getMultiplicity();
		if (multiplicity == null || multiplicity.getOwningType() != this) {
			TransformationUtil.addOwnedFeatureTo(lifeClass, createSingletonMultiplicity());
		}
	}
	
	protected Multiplicity createSingletonMultiplicity() {
		Multiplicity multiplicity = SysMLFactory.eINSTANCE.createMultiplicityRange();
		
		LiteralInteger bound = SysMLFactory.eINSTANCE.createLiteralInteger();
		bound.setValue(0);
		TransformationUtil.addOwnedFeatureTo(multiplicity, bound);
		
		bound = SysMLFactory.eINSTANCE.createLiteralInteger();
		bound.setValue(1);
		TransformationUtil.addOwnedFeatureTo(multiplicity, bound);
		
		return multiplicity;
	}

	@Override
	public void transform() {
		super.transform();
		addSuperclassing();
		addMultiplicity();
	}
	
}
