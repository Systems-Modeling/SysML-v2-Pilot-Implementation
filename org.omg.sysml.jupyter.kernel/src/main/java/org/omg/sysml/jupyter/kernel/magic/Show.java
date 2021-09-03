/*
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 California Institute of Technology ("Caltech")
 * Copyright (c) 2021 Twingineer LLC
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */

package org.omg.sysml.jupyter.kernel.magic;

import com.google.gson.JsonElement;
import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;
import org.omg.sysml.jupyter.kernel.ISysML;

import java.util.List;
import java.util.Map;

public class Show {
    private static final MagicsArgs SHOW_ARGS = MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
    		.optional("element")
    		.keyword("style")
            .flag("help", 'h', "true")
    		.build();

    @LineMagic
    public static DisplayData show(List<String> args) {
        Map<String, List<String>> vals = SHOW_ARGS.parse(args);
        List<String> elements = vals.get("element");
        String element = elements.isEmpty()? null:elements.get(0);
        List<String> styles = vals.get("style");
        List<String> help = vals.get("help");
        
        Object output = ISysML.getKernelInstance().getInteractive().show(element, styles, help);
        DisplayData dd = new DisplayData();
        if (output instanceof JsonElement) {
        	dd.putData("application/json", output);
        }
        else {
        	dd.putText(output.toString());
        }
        return dd;
    }
}
