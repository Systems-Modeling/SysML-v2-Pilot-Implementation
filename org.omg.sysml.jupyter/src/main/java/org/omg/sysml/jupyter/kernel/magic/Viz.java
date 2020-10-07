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
