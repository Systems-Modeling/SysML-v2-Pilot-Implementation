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

import org.omg.sysml.jupyter.kernel.ISysML;

import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;

public class Load {
    private static final MagicsArgs SHOW_ARGS = MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
    		.keyword("id")
    		.keyword("name")
    		.optional("name")
            .flag("help", 'h', "true")
    		.build();

	@LineMagic
	public static String load(List<String> args) {
        Map<String, List<String>> vals = SHOW_ARGS.parse(args);
        List<String> help = vals.get("help");
        List<String> name = vals.get("name");
        List<String> id = vals.get("id");
        
        if (!name.isEmpty() && !id.isEmpty()) {
        	return "Name and id cannot be provided at the same time.";
        } else if (!name.isEmpty()) {
        	return ISysML.getKernelInstance().getInteractive().loadByName(name.get(0), help);
        } else if (!id.isEmpty()) {
        	return ISysML.getKernelInstance().getInteractive().loadById(id.get(0), help);
        } else {
        	return ISysML.getKernelInstance().getInteractive().help("%load");
        }
	}
}
