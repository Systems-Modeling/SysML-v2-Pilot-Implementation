package org.omg.sysml.jupyter.kernel;

import io.github.spencerpark.jupyter.kernel.BaseKernel;
import io.github.spencerpark.jupyter.kernel.LanguageInfo;
import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import io.github.spencerpark.jupyter.kernel.magic.LineMagicParseContext;
import io.github.spencerpark.jupyter.kernel.magic.registry.Magics;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;
import org.omg.sysml.jupyter.kernel.magic.MyMagicParser;
import org.omg.sysml.jupyter.kernel.magic.Publish;
import org.omg.sysml.jupyter.kernel.magic.Show;
import org.omg.sysml.jupyter.kernel.magic.Viz;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SysMLKernel extends BaseKernel {

    private final LanguageInfo languageInfo = new LanguageInfo.Builder("SysML").version("1.0.0").mimetype("text/x-sysml").fileExtension(".sysml").pygments("java").codemirror("sysml").build();

    private final SysMLInteractive interactive;
    private final Magics magics;
    private final MyMagicParser magicParser;

    public SysMLKernel() {
        this.interactive = SysMLInteractive.getInstance();
        Optional<String> libraryPath = Optional.ofNullable(System.getenv(ISysML.LIBRARY_PATH_KEY));
        // Replace with Optional#or in Java 9+
        if (!libraryPath.isPresent()) {
            libraryPath = Arrays.stream(System.getProperty("java.class.path", "").split(File.pathSeparator)).filter(path -> !path.isEmpty()).map(path -> Paths.get(path)).map(path -> !path.toFile().isDirectory() ? path.getParent() : path).map(path -> path.resolve("sysml.library")).filter(Files::exists).map(Path::normalize).map(Path::toString).findFirst();
        }
        libraryPath.ifPresent(path -> Arrays.stream(path.split(File.pathSeparator)).forEach(interactive::loadLibrary));

        Optional.ofNullable(System.getenv(ISysML.API_BASE_PATH_KEY)).ifPresent(interactive::setApiBasePath);

        Optional.ofNullable(System.getenv(ISysML.GRAPHVIZ_PATH_KEY)).ifPresent(interactive::setGraphVizPath);

        this.magics = new Magics();
        this.magics.registerMagics(Show.class);
        this.magics.registerMagics(Publish.class);
        this.magics.registerMagics(Viz.class);

        this.magicParser = new MyMagicParser();
    }

    @Override
    public DisplayData eval(String expr) throws Exception {
        List<LineMagicParseContext> contexts = magicParser.parseLineMagics(expr);
        if (!contexts.isEmpty()) {
            LineMagicParseContext ctx = contexts.get(0);
            Object result = magics.applyLineMagic(ctx.getMagicCall().getName(), ctx.getMagicCall().getArgs());
            if (result instanceof DisplayData) {
                return (DisplayData) result;
            } else if (result instanceof String) {
                return new DisplayData((String) result);
            } else {
                throw new IllegalArgumentException("Invalid magic command:" + contexts);
            }
        }

        SysMLInteractiveResult result = interactive.eval(expr);
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

    public SysMLInteractive getInteractive() {
        return interactive;
    }
}
