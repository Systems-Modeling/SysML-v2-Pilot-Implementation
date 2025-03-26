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
package org.omg.sysml.jupyter.kernel.magic;

import java.util.List;
import java.util.Map;

import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.jupyter.kernel.ISysML;

import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;

public class ApiBasePath {
	
    private static final MagicsArgs SHOW_ARGS = MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
    		.optional("basePath")
            .flag("help", 'h', "true")
    		.build();
	
	@LineMagic("api-base-path")
	public static String apiBasePath(List<String> args) {
		Map<String, List<String>> vals = SHOW_ARGS.parse(args);
		List<String> basePaths = vals.get("basePath");
		String basePath = basePaths.isEmpty()? null: basePaths.get(0);
		
		SysMLInteractive interactive = ISysML.getKernelInstance().getInteractive();
		
		if (basePath != null) {
			interactive.setApiBasePath(basePath);
		}
		
		return "Api base path is: " + ISysML.getKernelInstance().getInteractive().getApiBasePath();
	}
}
