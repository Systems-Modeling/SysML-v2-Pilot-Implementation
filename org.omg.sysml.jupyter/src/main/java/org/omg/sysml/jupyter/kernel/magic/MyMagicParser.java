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
