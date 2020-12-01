/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LifeClassImpl extends ClassImpl implements LifeClass {
	
	public static final String LIFE_CLASS_LIFE_SUPERCLASS = "Occurrences::Life";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.LIFE_CLASS;
	}
	
	@Override
	protected String getDefaultSupertype() {
		return LIFE_CLASS_LIFE_SUPERCLASS;
	}
	
	public void addSuperclassing() {	
		org.omg.sysml.lang.sysml.Package owner = getOwningNamespace();
		EList<Superclassing> superclassings = getOwnedSuperclassing();
		if (owner instanceof Classifier) {
			if (superclassings.size() < 2) {
				Superclassing superclassing = SysMLFactory.eINSTANCE.createSuperclassing();
				superclassing.setSuperclass((Classifier)owner);
				superclassing.setSubclass(this);
				getOwnedRelationship_comp().add(superclassing);
			} else {
				superclassings.get(1).setSuperclass((Classifier)owner);
			}
		}
	}
	
	public void addMultiplicity() {
		Multiplicity multiplicity = super.basicGetMultiplicity();
		if (multiplicity == null || multiplicity.getOwningType() != this) {
			multiplicity = createSingletonMultiplicity();
			addOwnedFeature(multiplicity);
		}
	}
	
	protected Multiplicity createSingletonMultiplicity() {
		MultiplicityRangeImpl multiplicity = (MultiplicityRangeImpl)SysMLFactory.eINSTANCE.createMultiplicityRange();
		
		LiteralInteger bound = SysMLFactory.eINSTANCE.createLiteralInteger();
		bound.setValue(0);
		multiplicity.addOwnedFeature(bound);
		
		bound = SysMLFactory.eINSTANCE.createLiteralInteger();
		bound.setValue(1);
		multiplicity.addOwnedFeature(bound);
		
		return multiplicity;
	}

	@Override
	public void transform() {
		super.transform();
		addSuperclassing();
		addMultiplicity();
	}
	
} //LifeClassImpl
