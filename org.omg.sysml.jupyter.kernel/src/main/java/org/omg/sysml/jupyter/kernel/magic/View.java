/*
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Mgnite Inc.
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;
import org.omg.sysml.jupyter.kernel.ISysML;
import org.omg.sysml.interactive.VizResult;

import java.util.List;
import java.util.Map;

public class View {
    private static final MagicsArgs VIEW_ARGS
      = (MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
         .optional("usage")
         .keyword("render")
         .keyword("style")
         .flag("help", 'h', "true")
         .build());

    @LineMagic
    public static DisplayData view(List<String> args) {
        Map<String, List<String>> vals = VIEW_ARGS.parse(args);

        List<String> usage = vals.get("usage");
        List<String> views = vals.get("render");
        List<String> styles = vals.get("style");
        List<String> help = vals.get("help");

        VizResult vr = ISysML.getKernelInstance().getInteractive().view(usage.isEmpty()? null: usage.get(0), views, styles, help);

        DisplayData dd = new DisplayData();

        switch (vr.kind) {
        case EXCEPTION:
            dd.putText(vr.formatException());
            break;
        case PLANTUML:
            dd.putText(vr.getPlantUML());
            break;
        case SVG:
            dd.putSVG(vr.getSVG());
            break;
        case TEXT:
            dd.putText(vr.getText());
        }
        return dd;
    }
}
