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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.sysml.interactive.SysMLInteractive;

import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;

public class Load {
    private static final MagicsArgs SHOW_ARGS = MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
    		.keyword("id")
    		.keyword("name")
    		.optional("name")
    		.keyword("branch")
    		.keyword("branchid")
            .flag("help", 'h', "true")
    		.build();

	@LineMagic
	public static String load(List<String> args) {
        Map<String, List<String>> vals = SHOW_ARGS.parse(args);
        Map<String, String> parameters = new HashMap<>();
        
        if (optionPassed(vals,"name")) {
        	parameters.put(SysMLInteractive.PROJECT_NAME_KEY, getFirstValueOrNull(vals, "name"));
        }
        
        if (optionPassed(vals,"id")) {
        	parameters.put(SysMLInteractive.PROJECT_ID_KEY, getFirstValueOrNull(vals, "id"));
        }
        
        if (optionPassed(vals,"branch")) {
        	parameters.put(SysMLInteractive.BRANCH_NAME_KEY, getFirstValueOrNull(vals, "branch"));
        }
        
        if (optionPassed(vals,"branchid")) {
        	parameters.put(SysMLInteractive.BRANCH_ID_KEY, getFirstValueOrNull(vals, "branchid"));
        }
        
        if (optionPassed(vals,"help")) {
        	parameters.put(SysMLInteractive.HELP_KEY, "true");
        }
        
        return SysMLInteractive.getInstance().load(parameters);
	}
	
	private static String getFirstValueOrNull(Map<String, List<String>> map, String key) {
		if (map.containsKey(key)) {
			List<String> values = map.get(key);
			return values.isEmpty()? null: values.get(0);
		}
		return null;
	}
	
	private static boolean optionPassed(Map<String, List<String>> map, String key) {
		return map.containsKey(key) && map.get(key) != null && !map.get(key).isEmpty();
	}
}
