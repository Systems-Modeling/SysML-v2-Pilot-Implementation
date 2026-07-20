/*
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 California Institute of Technology ("Caltech")
 * Copyright (c) 2021 Twingineer LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
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
