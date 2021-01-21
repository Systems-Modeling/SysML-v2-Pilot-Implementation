/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.AssociationStructure;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssociationStructureImpl extends AssociationImpl implements AssociationStructure {

	public static final String ASSOCIATION_STRUCTURE_SUPERCLASS_DEFAULT = "Objects::LinkObject";
	public static final String BINARY_ASSOCIATION_STRUCTURE_SUPERCLASS_DEFAULT = "Objects::BinaryLinkObject";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSOCIATION_STRUCTURE;
	}
	
	@Override
	protected String getDefaultSupertype() {
		return getOwnedEndFeature().size() > 2 ? ASSOCIATION_STRUCTURE_SUPERCLASS_DEFAULT
				: BINARY_ASSOCIATION_STRUCTURE_SUPERCLASS_DEFAULT;
	}


} //AssociationStructureImpl
