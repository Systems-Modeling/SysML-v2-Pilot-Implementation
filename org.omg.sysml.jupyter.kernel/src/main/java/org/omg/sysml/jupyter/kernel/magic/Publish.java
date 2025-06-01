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

import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;
import org.omg.sysml.jupyter.kernel.ISysML;

import java.util.List;
import java.util.Map;

public class Publish {
    private static final MagicsArgs SHOW_ARGS = MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
    		.optional("element")
    		.keyword("project")
    		.keyword("branch")
    		.flag("derived", 'd', "false")
            .flag("help", 'h', "true")
    		.build();

    @LineMagic
    public static String publish(List<String> args) {
        Map<String, List<String>> vals = SHOW_ARGS.parse(args);
        List<String> elements = vals.get("element");
        List<String> projects = vals.get("project");
        List<String> branches = vals.get("branch");
        String element = elements.isEmpty()? null:elements.get(0);
        String project = projects.isEmpty()? null:projects.get(0);
        String branch = branches.isEmpty()? null:branches.get(0);
        boolean includeDerived = !vals.get("derived").isEmpty();
        List<String> help = vals.get("help");
        return ISysML.getKernelInstance().getInteractive().publish(element, project, branch, includeDerived, help);
    }
}
