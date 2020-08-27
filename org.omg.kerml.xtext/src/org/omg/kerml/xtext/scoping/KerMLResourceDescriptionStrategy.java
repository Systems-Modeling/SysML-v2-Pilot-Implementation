/*****************************************************************************
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping;

import java.util.Objects;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class KerMLResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Override
	protected boolean isIndexable(EReference eReference) {
		/*
		 * ST6RI-210: Feature::typing references are not added to the Xtext index as
		 * Xtext index cannot handle the implicit generalizations that are not part of
		 * any Xtext resource. These references are safe to ignore from the Xtext index
		 * as only references pointing to other resources are indexed - checked in the
		 * method #isResolvedAndExternal(EObject from, EObject to) where all the
		 * generalization would have been removed.
		 */
		return !Objects.equals(eReference, SysMLPackage.Literals.FEATURE__TYPING)
			&& super.isIndexable(eReference);
	}

}
