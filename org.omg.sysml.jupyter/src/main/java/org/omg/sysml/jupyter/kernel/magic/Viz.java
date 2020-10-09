/*
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
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

public class Viz {
    private static final MagicsArgs VIZ_ARGS
      = (MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
         .varargs("element")
         .keyword("view")
         .keyword("style")
         .build());

    @LineMagic
    public static DisplayData viz(List<String> args) {
        Map<String, List<String>> vals = VIZ_ARGS.parse(args);

        List<String> elements = vals.get("element");
        List<String> views = vals.get("view");
        List<String> styles = vals.get("style");

        VizResult vr = ISysML.getKernelInstance().getInteractive().viz(elements, views, styles);
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
        }
        return dd;
    }
}
