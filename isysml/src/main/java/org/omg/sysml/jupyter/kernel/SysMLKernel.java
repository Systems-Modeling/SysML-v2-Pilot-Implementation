package org.omg.sysml.jupyter.kernel;

import io.github.spencerpark.jupyter.kernel.BaseKernel;
import io.github.spencerpark.jupyter.kernel.LanguageInfo;
import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

public class SysMLKernel extends BaseKernel {

    private final LanguageInfo languageInfo = new LanguageInfo.Builder("SysML").version("1.0.0").mimetype("text/x-sysml").fileExtension(".sysml").pygments("java").codemirror("sysml").build();

    private SysMLInteractive instance;

    public SysMLKernel() {
        this.instance = SysMLInteractive.getInstance();
        Optional.of(System.getenv(ISysML.LIBRARY_PATH_KEY)).ifPresent(path -> Arrays.stream(path.split(File.pathSeparator)).forEach(instance::loadLibrary));
    }

    @Override
    public DisplayData eval(String expr) throws Exception {
        SysMLInteractiveResult result = instance.eval(expr);
        if (!result.getSyntaxErrors().isEmpty()) {
            result.getSyntaxErrors().forEach(System.err::println);
        }
        else {
            result.getSemanticErrors().forEach(System.err::println);
        }
        if (result.getException() != null) {
            throw result.getException();
        }
        return new DisplayData(result.getIssues().isEmpty()? result.formatRootElement(): "");
    }

    @Override
    public LanguageInfo getLanguageInfo() {
        return languageInfo;
    }
}
