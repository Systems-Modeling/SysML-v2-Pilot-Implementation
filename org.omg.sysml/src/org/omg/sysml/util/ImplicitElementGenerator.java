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
package org.omg.sysml.util;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.lang.sysml.impl.TypeImpl;

/**
 * This class is responsible for updating a SysML model by generating all
 * inferred elements into. Note that calling this class updates contents of the
 * original model instead.
 *
 */
public class ImplicitElementGenerator {

	public void generateElements(Resource resource) {
		TreeIterator<EObject> it = resource.getAllContents();
		while (it.hasNext()) {
			EObject nextElement = it.next();
			if (nextElement instanceof TypeImpl) {
				((TypeImpl) nextElement).addImplicitGeneralizations();
			}
		}
	}
}
