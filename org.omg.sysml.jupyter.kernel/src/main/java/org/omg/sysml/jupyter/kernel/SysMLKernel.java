/*
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
 * Copyright (C) 2021 Model Driven Solutions, Inc.
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

package org.omg.sysml.jupyter.kernel;

import io.github.spencerpark.jupyter.kernel.BaseKernel;
import io.github.spencerpark.jupyter.kernel.LanguageInfo;
import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import io.github.spencerpark.jupyter.kernel.magic.LineMagicParseContext;
import io.github.spencerpark.jupyter.kernel.magic.registry.Magics;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;
import org.omg.sysml.jupyter.kernel.magic.*;

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

    public Magics getMagics() {
        return magics;
    }

    public SysMLKernel() {
        this.interactive = SysMLInteractive.getInstance();
        Optional<String> libraryPath = Optional.ofNullable(System.getenv(ISysML.LIBRARY_PATH_KEY));
        // Replace with Optional#or in Java 9+
        if (!libraryPath.isPresent()) {
            libraryPath = Arrays.stream(System.getProperty("java.class.path", "")
            		.split(File.pathSeparator))
            		.filter(path -> !path.isEmpty())
            		.map(path -> Paths.get(path))
            		.map(path -> !path.toFile().isDirectory() ? path.getParent() : path)
            		.map(path -> path.resolve("sysml.library"))
            		.filter(Files::exists)
            		.map(Path::normalize)
            		.map(Path::toString)
            		.findFirst();
        }
        libraryPath.ifPresent(path -> Arrays.stream(path.split(File.pathSeparator)).forEach(interactive::loadLibrary));

        Optional.ofNullable(System.getenv(ISysML.API_BASE_PATH_KEY)).ifPresent(interactive::setApiBasePath);

        Optional.ofNullable(System.getenv(ISysML.GRAPHVIZ_PATH_KEY)).ifPresent(interactive::setGraphVizPath);

        this.magics = new Magics();
        this.magics.registerMagics(Help.class);
        this.magics.registerMagics(Eval.class);
        this.magics.registerMagics(Listing.class);
        this.magics.registerMagics(Show.class);
        this.magics.registerMagics(Publish.class);
        this.magics.registerMagics(Viz.class);
        this.magics.registerMagics(View.class);
        this.magics.registerMagics(Export.class);
        this.magics.registerMagics(ApiBasePath.class);

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

        SysMLInteractiveResult result = interactive.process(expr);
        if (!result.getSyntaxErrors().isEmpty()) {
            result.getSyntaxErrors().forEach(System.err::println);
        }
        else {
            result.getSemanticErrors().forEach(System.err::println);
            result.getWarnings().forEach(System.out::println);
        }
        if (result.getException() != null) {
            throw result.getException();
        }
        return new DisplayData(result.hasErrors()? "": result.formatRootElement());
    }

    @Override
    public LanguageInfo getLanguageInfo() {
        return languageInfo;
    }

    public SysMLInteractive getInteractive() {
        return interactive;
    }
}
