/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
 *   Laszlo Gati, MDS
 */
package org.omg.sysml.xtext.ui.xmi

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory
import org.osgi.framework.FrameworkUtil
import org.omg.sysml.xtext.ui.SysMLActivator
import org.omg.sysml.xtext.xmi.SysMLxRuntimeModule

class SysMLxExecutableExtensionFactory  extends AbstractGuiceAwareExecutableExtensionFactory {
	
	override protected getBundle() {
		FrameworkUtil.getBundle(SysMLActivator)
	}
	
	override protected getInjector() {
		val instance = SysMLActivator.instance
		return instance !== null? instance.getInjector(SysMLxRuntimeModule::SYSMLX_LANGUAGE_NAME) : null 
	}
}