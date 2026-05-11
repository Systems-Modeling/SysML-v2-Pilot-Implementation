/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
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
 *   Laszlo Gati, MDS
 */
package org.omg.kerml.xtext.ui.xmi

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory
import org.omg.kerml.xtext.xmi.KerMLxRuntimeModule
import org.omg.kerml.xtext.ui.KerMLActivator
import org.osgi.framework.FrameworkUtil

class KerMLxExecutableExtensionFactory  extends AbstractGuiceAwareExecutableExtensionFactory {
	
	override protected getBundle() {
		FrameworkUtil.getBundle(KerMLActivator)
	}
	
	override protected getInjector() {
		val instance = KerMLActivator.instance
		return instance !== null? instance.getInjector(KerMLxRuntimeModule::KERMLX_LANGUAGE_NAME) : null 
	}
}