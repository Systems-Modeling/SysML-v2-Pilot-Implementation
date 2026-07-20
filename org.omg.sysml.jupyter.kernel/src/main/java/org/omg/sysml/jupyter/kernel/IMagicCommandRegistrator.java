/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 *
 *****************************************************************************/
package org.omg.sysml.jupyter.kernel;

import org.omg.sysml.interactive.SysMLInteractiveHelp;

import io.github.spencerpark.jupyter.kernel.magic.registry.Magics;

public interface IMagicCommandRegistrator {

	/**
	 * Implementors of this method are free to register their extra commands to the
	 * Jupyter kernel. This method is called when the Jupyter environment is
	 * initialized and it assumed the registration code will run quickly and without
	 * exceptions. If the registrator cannot run successfully, it should not
	 * register anything instead of throwing an exception.
	 * </p>
	 * Implementors are recommended to use the register methods of the {@link Magics}
	 * class. Help is managed by the {@link SysMLInteractiveHelp} class.
	 *
	 * @see Magics#registerMagics(Class)
	 * @see SysMLInteractiveHelp#registerHelpString(String, String, String)
	 */
	void registerMagicCommand(Magics magics);
}
