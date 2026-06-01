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

package org.omg.sysml.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.api.IModelLibraryProvider;

/**
 * Static entry point for resolving elements from the SysML/KerML model
 * libraries.
 *
 * <p>This utility centralizes two pieces of state used by library lookup:
 * a configured model-library location and a pluggable provider lookup. The
 * provider lookup supplies an {@link IModelLibraryProvider} appropriate for the
 * current runtime environment, such as an Eclipse/Xtext-based implementation or
 * a standalone EMF-based implementation.
 *
 * <p>The class itself does not perform library resolution logic directly.
 * Instead, it delegates lookups to the provider returned for the context
 * element's {@link Resource}. If no provider has been installed, library lookup
 * methods return {@code null}.
 *
 * <p>The configured model-library path is primarily advisory state shared with
 * provider implementations. For example, a standalone provider may use it to
 * identify which loaded resources should be treated as library resources.
 */
public class SysMLLibraryUtil {

	/**
	 * Functional strategy used to obtain a library provider for a given EMF
	 * resource.
	 */
	@FunctionalInterface
	public interface ProviderLookup {

		/**
		 * Returns the provider that should resolve library elements for the given
		 * resource.
		 *
		 * @param resource the resource from which a lookup originates, or
		 *        {@code null} if no context resource is available
		 * @return the library provider to use, or {@code null} if none is available
		 */
		IModelLibraryProvider get(Resource resource);
	}

	/**
	 * Default logical location of the model library when no explicit directory has
	 * been configured.
	 */
	public static final String DEFAULT_MODEL_LIBRARY_PATH = "/resource/sysml.library";

	private static String modelLibraryPath = DEFAULT_MODEL_LIBRARY_PATH;
	private static volatile ProviderLookup providerLookup;

	/**
	 * Utility class; not meant to be instantiated.
	 */
	private SysMLLibraryUtil() {
	}

	/**
	 * Sets the filesystem directory that should be treated as the model-library
	 * location.
	 *
	 * <p>The given directory is normalized through an EMF file {@link URI} so the
	 * stored path is suitable for comparison with resource URIs across different
	 * environments.
	 *
	 * @param dir the directory containing SysML/KerML library resources
	 */
	public static void setModelLibraryDirectory(String dir) {
		URI uri = URI.createFileURI(dir);
		modelLibraryPath = uri.devicePath() != null ? uri.devicePath() : uri.path();
	}

	/**
	 * Returns the currently configured model-library path.
	 *
	 * @return the configured library path, or the default path if none has been
	 *         set explicitly
	 */
	public static String getModelLibraryPath() {
		return modelLibraryPath;
	}

	/**
	 * Installs the runtime-specific provider lookup used for subsequent library
	 * resolution requests.
	 *
	 * @param lookup the lookup strategy to install, or {@code null} to clear the
	 *        current provider lookup
	 */
	public static void setProviderLookup(ProviderLookup lookup) {
		providerLookup = lookup;
	}

	/**
	 * Resolves a library element by qualified name relative to the given context
	 * element.
	 *
	 * <p>The context element is used to locate the originating resource and obtain
	 * the appropriate {@link IModelLibraryProvider}. If no provider is available
	 * or the provider cannot resolve the name, this method returns {@code null}.
	 *
	 * @param context the lookup context
	 * @param name the qualified library name to resolve
	 * @return the resolved library element, or {@code null} if it cannot be
	 *         resolved
	 */
	public static Element getLibraryElement(Element context, String name) {
		Resource resource = context == null ? null : context.eResource();
		IModelLibraryProvider provider = getInstance(resource);
		return provider == null ? null : provider.getElement(context, name);
	}

	/**
	 * Resolves the first matching library element that is also a {@link Type}.
	 *
	 * <p>The provided names are tried in order until one resolves to a library
	 * element that is a type. Names that resolve to non-type elements are ignored.
	 *
	 * @param context the lookup context
	 * @param defaultNames candidate qualified library names to try in order
	 * @return the first resolved library type, or {@code null} if none of the
	 *         given names resolves to a type
	 */
	public static Type getLibraryType(Element context, String... defaultNames) {
		for (String defaultName : defaultNames) {
			Element element = getLibraryElement(context, defaultName);
			if (element instanceof Type type) {
				return type;
			}
		}
		return null;
	}

	/**
	 * Obtains the library provider for a resource through the installed provider
	 * lookup.
	 *
	 * <p>Failures in provider acquisition are treated as lookup failures and
	 * reported to standard output rather than propagated.
	 *
	 * @param resource the originating resource for the lookup
	 * @return the provider to use, or {@code null} if none is available or if
	 *         provider acquisition fails
	 */
	private static IModelLibraryProvider getInstance(Resource resource) {
		try {
			ProviderLookup lookup = providerLookup;
			return lookup == null ? null : lookup.get(resource);
		} catch (Exception e) {
			System.out.println("[SysMLLibraryUtil] Cannot get library provider: " + e);
			return null;
		}
	}
}
