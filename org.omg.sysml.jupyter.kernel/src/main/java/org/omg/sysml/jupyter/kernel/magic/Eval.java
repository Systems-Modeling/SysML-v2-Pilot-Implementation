/*
 * SysML 2 Pilot Implementation
 * Copyright (C) 2022 Model Driven Solutions, Inc.
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

public class Eval {
    private static final MagicsArgs EVAL_ARGS = MagicsArgs.builder().onlyKnownKeywords().onlyKnownFlags()
    		.optional("expr")
    		.keyword("target")
            .flag("help", 'h', "true")
    		.build();

    @LineMagic
    public static String eval(List<String> args) {
        Map<String, List<String>> vals = EVAL_ARGS.parse(args);
        List<String> exprs = vals.get("expr");
        String expr = exprs.isEmpty()? null: exprs.get(0);
        List<String> targets = vals.get("target");
        String target = targets.isEmpty()? null: targets.get(0);
        List<String> help = vals.get("help");
        return ISysML.getKernelInstance().getInteractive().eval(expr, target, help);
    }
}
