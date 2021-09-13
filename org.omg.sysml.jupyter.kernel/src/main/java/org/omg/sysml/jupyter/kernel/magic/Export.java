/*
 * SysML 2 Pilot Implementation
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;
import org.apache.commons.lang3.StringEscapeUtils;
import org.omg.sysml.jupyter.kernel.ISysML;

import java.util.Base64;
import java.util.List;
import java.util.Map;

public class Export {
    private static final MagicsArgs EXPORT_ARGS = MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
    		.optional("element")
            .flag("help", 'h', "true")
    		.build();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @LineMagic
    public static DisplayData export(List<String> args) {
        Map<String, List<String>> vals = EXPORT_ARGS.parse(args);
        List<String> elements = vals.get("element");
        String element = elements.isEmpty()? null:elements.get(0);
        List<String> help = vals.get("help");
        
        Object output = ISysML.getKernelInstance().getInteractive().export(element, help);
        DisplayData dd = new DisplayData();
        if (output instanceof JsonElement) {
        	StringBuilder builder = new StringBuilder();
            builder.append("<p><a download=\"");
            builder.append(StringEscapeUtils.escapeHtml4(element));
            builder.append(".json\" href=\"data:application/json;base64,");
            builder.append(Base64.getEncoder().encodeToString(GSON.toJson((JsonElement) output).getBytes()));
            builder.append("\">Download</a>");
        	dd.putHTML(builder.toString());
        }
        else {
        	dd.putText(output.toString());
        }
        return dd;
    }
}
