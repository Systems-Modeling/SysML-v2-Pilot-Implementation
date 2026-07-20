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
