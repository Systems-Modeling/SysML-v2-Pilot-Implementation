/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) Obeo
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.logic.api;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.SysMLLibraryUtil;

/**
 * Strategy interface for resolving elements from the SysML/KerML model
 * libraries.
 *
 * <p>{@link SysMLLibraryUtil} delegates library lookup to an implementation of
 * this interface so the resolution mechanism can vary by runtime environment.
 * For example, an Eclipse/Xtext-based implementation may resolve library
 * elements through indexing and scoping services, while a standalone
 * implementation may resolve them from resources that are already loaded in an
 * EMF resource set.
 *
 * <p>The contract of this interface is intentionally small: given a context
 * element and a library-qualified name, return the matching library element if
 * it can be resolved in the current environment. Implementations are expected
 * to be read-only and should not mutate the passed context, its resource set,
 * or any global model state as part of a normal lookup.
 *
 * <p>The {@code context} parameter provides the resolution environment. It may
 * be used to determine which resource set, scope, library location, or
 * configuration should be consulted. The {@code name} parameter is expected to
 * be a qualified library name in the canonical SysML form using
 * {@code "::"} separators, for example {@code "Base::Anything"}.
 *
 * <p>If an implementation cannot resolve the requested name, it should return
 * {@code null} rather than throwing an exception for ordinary "not found"
 * cases. Exceptions should be reserved for truly exceptional situations such as
 * invalid runtime configuration or unrecoverable infrastructure failures.
 */
public interface IModelLibraryProvider {

	/**
	 * Resolves a library element by qualified name relative to the given
	 * resolution context.
	 *
	 * @param context the element providing the lookup context, typically used to
	 *        determine the relevant resource set, scope, or library environment
	 * @param name the qualified library name to resolve, usually using
	 *        {@code "::"} separators
	 * @return the resolved library element, or {@code null} if no matching
	 *         element can be found
	 */
	Element getElement(Element context, String name);
}
