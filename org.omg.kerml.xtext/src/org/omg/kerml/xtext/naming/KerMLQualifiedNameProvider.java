/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020,2023 Model Driven Solutions, Inc. 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 */

package org.omg.kerml.xtext.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.omg.sysml.util.ElementUtil;

import com.google.common.base.Function;

public class KerMLQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	private Function<EObject, String> resolver = SimpleAttributeResolver.newResolver(String.class, "declaredName");
	
	@Override
	protected Function<EObject, String> getResolver() {
		Function<EObject, String> parentResolver = resolver;
		return object -> {
			String unescapedName = parentResolver.apply(object);
			return unescapedName == null ? null : "'" + ElementUtil.escapeString(unescapedName) + "'";
		};
	}

}
