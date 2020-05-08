package org.omg.sysml.jupyter.kernel.magic;

import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;
import org.omg.sysml.jupyter.kernel.ISysML;
import org.omg.sysml.interactive.VizResult;

import java.util.List;
import java.util.Map;

public class Viz {
    private static final MagicsArgs VIZ_ARGS = MagicsArgs.builder().required("element").optional("view").onlyKnownKeywords().onlyKnownFlags().build();

    @LineMagic
    public static DisplayData viz(List<String> args) {
        Map<String, List<String>> vals = VIZ_ARGS.parse(args);

        String element = vals.get("element").get(0);
        List<String> views = vals.get("view");

        VizResult vr = ISysML.getKernelInstance().getInteractive().viz(element, views);
        DisplayData dd = new DisplayData();
        if (vr.hasException()) {
            dd.putText(vr.formatException());
        } else {
            dd.putSVG(vr.getSVG());
        }
        return dd;
    }
}
