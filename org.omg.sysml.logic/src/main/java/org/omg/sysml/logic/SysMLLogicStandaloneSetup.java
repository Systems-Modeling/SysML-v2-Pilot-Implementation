/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.logic;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.delegate.invocation.OperationInvocationDelegateFactory;
import org.omg.sysml.delegate.setting.DerivedPropertySettingDelegateFactory;
import org.omg.sysml.logic.api.IModelLibraryProvider;
import org.omg.sysml.util.SysMLLibraryUtil;

/**
 * Standalone bootstrap for applications using {@code org.omg.sysml.logic}
 * without Xtext or Eclipse.
 *
 * <p>Call this before creating SysML model instances so generated EMF classes
 * cache the SysML-specific setting and invocation delegates.
 */
public final class SysMLLogicStandaloneSetup {

	private static final IModelLibraryProvider DEFAULT_LIBRARY_PROVIDER = new ResourceSetModelLibraryProvider();

	/**
	 * Utility class; not meant to be instantiated.
	 */
	private SysMLLogicStandaloneSetup() {
	}

	/**
	 * Installs the default standalone logic bootstrap using a plain-EMF library
	 * provider.
	 *
	 * <p>Call this before creating or loading SysML model instances that rely on
	 * SysML setting or invocation delegates.
	 */
	public static void doSetup() {
		doSetup(DEFAULT_LIBRARY_PROVIDER);
	}

	/**
	 * Installs the standalone logic bootstrap using the given library provider.
	 *
	 * <p>This registers the SysML derived-property setting delegate factory and
	 * operation invocation delegate factory in the global EMF registries, then
	 * installs the supplied provider for library element lookup.
	 *
	 * @param libraryProvider the provider used to resolve SysML/KerML library
	 *        elements in standalone mode
	 */
	public static void doSetup(IModelLibraryProvider libraryProvider) {
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(
				DerivedPropertySettingDelegateFactory.SYSML_ANNOTATION,
				new DerivedPropertySettingDelegateFactory());
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
				OperationInvocationDelegateFactory.SYSML_ANNOTATION,
				new OperationInvocationDelegateFactory());
		SysMLLibraryUtil.setProviderLookup(resource -> libraryProvider);
	}
}
