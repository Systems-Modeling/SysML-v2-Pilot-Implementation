package org.omg.sysml.jupyter.kernel.magic;

import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;
import org.omg.sysml.jupyter.kernel.ISysML;

import java.util.List;
import java.util.Map;

public class Show {
    private static final MagicsArgs SHOW_ARGS = MagicsArgs.builder().required("element").onlyKnownKeywords().onlyKnownFlags().build();

    @LineMagic
    public static String show(List<String> args) {
        Map<String, List<String>> vals = SHOW_ARGS.parse(args);
        return ISysML.getKernelInstance().getInteractive().show(vals.get("element").get(0));
    }
}
