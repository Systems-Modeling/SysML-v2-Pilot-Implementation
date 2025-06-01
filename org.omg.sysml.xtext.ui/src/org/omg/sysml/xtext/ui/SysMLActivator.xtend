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
package org.omg.sysml.xtext.ui

import org.omg.sysml.xtext.SysMLRuntimeModule
import org.omg.sysml.xtext.ui.internal.XtextActivator
import org.omg.sysml.xtext.ui.xmi.SysMLxUIModule
import org.omg.sysml.xtext.xmi.SysMLxRuntimeModule

class SysMLActivator extends XtextActivator {

	override getRuntimeModule(String grammar) {
		return switch (grammar) {
			case ORG_OMG_SYSML_XTEXT_SYSML: new SysMLRuntimeModule
			case SysMLxRuntimeModule::SYSMLX_LANGUAGE_NAME: new SysMLxRuntimeModule
			default: throw new IllegalArgumentException(grammar)
		}
	}

	override getUiModule(String grammar) {
		return switch (grammar) {
			case ORG_OMG_SYSML_XTEXT_SYSML: new SysMLUiModule(this)
			case SysMLxRuntimeModule::SYSMLX_LANGUAGE_NAME: new SysMLxUIModule(this)
			default: throw new IllegalArgumentException(grammar)
		}
	}
}
