/**
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
 */

package org.omg.kerml.xtext.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.omg.sysml.lang.sysml.impl.ElementImpl;

import com.google.common.base.Function;

public class KerMLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	@Override
	protected Function<EObject, String> getResolver() {
		Function<EObject, String> parentResolver = super.getResolver();
		return object -> {
			String unescapedName = parentResolver.apply(object);
			return unescapedName == null ? null : "'" + ElementImpl.escapeString(unescapedName) + "'";
		};
	}

}
