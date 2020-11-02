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

import io.github.spencerpark.jupyter.kernel.magic.LineMagicArgs;
import io.github.spencerpark.jupyter.kernel.magic.LineMagicParseContext;
import io.github.spencerpark.jupyter.kernel.magic.MagicParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMagicParser extends MagicParser {
    private final Pattern lineMagicPattern;
    private final Pattern cellMagicPattern;

    public MyMagicParser() {
        this("^%", "%%");
    }

    public MyMagicParser(String lineMagicStart, String cellMagicStart) {
        super(lineMagicStart, cellMagicStart);
        this.lineMagicPattern = Pattern.compile(lineMagicStart + "(?<args>\\w.*?)$", Pattern.MULTILINE);
        this.cellMagicPattern = Pattern.compile("^(?<argsLine>" + cellMagicStart + "(?<args>\\w.*?))\\R(?<body>(?sU).+?)$");
    }

    public List<LineMagicParseContext> parseLineMagics(String cell) {
        List<LineMagicParseContext> magics = new ArrayList<>();
        StringBuffer transformedCell = new StringBuffer();

        Matcher m = this.lineMagicPattern.matcher(cell);
        while (m.find()) {
            String raw = m.group();
            String rawArgs = m.group("args");
            List<String> split = split(rawArgs);

            LineMagicArgs args = LineMagicArgs.of(split.get(0), split.subList(1, split.size()));
            LineMagicParseContext ctx = LineMagicParseContext.of(args, raw, cell, cell.substring(0, m.start()));

            magics.add(ctx);
        }
        return magics;
    }
}
