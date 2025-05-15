/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
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
