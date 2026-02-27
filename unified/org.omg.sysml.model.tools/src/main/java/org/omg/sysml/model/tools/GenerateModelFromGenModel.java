/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *
 *******************************************************************************/
package org.omg.sysml.model.tools;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Generates EMF Java model code from a SysML {@code .genmodel} in standalone mode.
 *
 * <p>This tool loads the provided GenModel, resolves referenced Ecore resources, configures
 * generation settings (including model output directory and copyright header), then triggers EMF
 * code generation for all contained GenPackages.
 *
 * <p>Usage:
 * <pre>{@code
 * java org.omg.sysml.model.tools.GenerateModelFromGenModel \
 *   <path-to-SysML.genmodel> <path-to-org.omg.sysml.model-module>
 * }</pre>
 *
 * <p>Arguments:
 * <ul>
 * <li>arg0: absolute or relative path to the {@code .genmodel} file;</li>
 * <li>arg1: absolute or relative path to the model module root directory (the directory
 * containing {@code src/main/java} and {@code src/main/resources/model/}).</li>
 * </ul>
 */
public final class GenerateModelFromGenModel {

    private final String USAGE = "Usage: GenerateModelFromGenModel <genmodel-file> <model-project-dir>";
    private final String ECORE_EXTENSION = "ecore";
    private final String GENMODEL_EXTENSION = "genmodel";
    private final String MODEL_DIRECTORY = "/org.omg.sysml.model/src/main/java";
    private final String SYSML_ECORE_FILENAME = "SysML.ecore";

    private final String COPYRIGHT = """
            SysML 2 Pilot Implementation
            Copyright (c) 2026 Obeo

            This program is free software: you can redistribute it and/or modify
            it under the terms of the GNU Lesser General Public License as published by
            the Free Software Foundation, either version 3 of the License, or
            (at your option) any later version.

            This program is distributed in the hope that it will be useful,
            but WITHOUT ANY WARRANTY; without even the implied warranty of
            MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
            GNU Lesser General Public License for more details.

            You should have received a copy of the GNU Lesser General Public License
            along with this program.  If not, see <https://www.gnu.org/licenses/>.

            @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
            """;

    /**
     * Prevents direct instantiation outside this class.
     */
    private GenerateModelFromGenModel() {
    }

    public static void main(String[] args) {
        new GenerateModelFromGenModel().generate(args);
    }

    /**
     * Generates model code from the provided command-line arguments.
     *
     * @param args command-line arguments:
     *             {@code <genmodel-file> <model-project-dir>}
     */
    private void generate(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(USAGE);
        }

        var genModelFile = new File(args[0]).getAbsoluteFile();
        var modelProjectDir = new File(args[1]).getAbsoluteFile();
        var resourceSet = createResourceSet(modelProjectDir);

        var ecoreSibling = new File(genModelFile.getParentFile(), SYSML_ECORE_FILENAME);
        resourceSet.getResource(URI.createFileURI(ecoreSibling.getPath()), true);
        var uri = URI.createFileURI(genModelFile.getPath());
        Resource resource = resourceSet.getResource(uri, true);
        if (resource.getContents().isEmpty() || !(resource.getContents().get(0) instanceof GenModel genModel)) {
            throw new IllegalStateException("No GenModel in " + genModelFile);
        }
        // Reload the GenModel resource from disk to ensure generation uses the latest saved state.
        genModel = reloadGenModel(resourceSet, uri, genModelFile);

        EcoreUtil.resolveAll(resourceSet);
        genModel.setModelDirectory(MODEL_DIRECTORY);
        genModel.setCopyrightText(toEmfCopyrightText(COPYRIGHT));
        genModel.setCanGenerate(true);

        GeneratorAdapterFactory.Descriptor.DelegatingRegistry descriptorRegistry =
                new GeneratorAdapterFactory.Descriptor.DelegatingRegistry();
        descriptorRegistry.addDescriptor(GenModelPackage.eNS_URI, GenModelGeneratorAdapterFactory.DESCRIPTOR);

        Generator generator = new Generator(descriptorRegistry);
        generator.setInput(genModel);
        for (GenPackage genPackage : genModel.getGenPackages()) {
            Diagnostic diagnostic = generator.generate(
                    genPackage,
                    GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
                    new BasicMonitor.Printing(System.out));
            if (diagnostic.getSeverity() >= Diagnostic.ERROR) {
                throw new IllegalStateException("EMF generation failed: " + diagnostic.getMessage());
            }
        }
        deletePluginArtifacts(modelProjectDir.toPath());
    }

    /**
     * Creates and configures a standalone EMF {@link ResourceSet} for SysML model generation.
     *
     * @param modelProjectDir model project directory
     * @return configured resource set
     */
    private ResourceSet createResourceSet(File modelProjectDir) {
        var resourceSet = new ResourceSetImpl();
        resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ECORE_EXTENSION, new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(GENMODEL_EXTENSION, new XMIResourceFactoryImpl());
        resourceSet.getURIConverter().getURIMap().put(
                URI.createURI("platform:/resource/org.omg.sysml.model/"),
                URI.createFileURI(modelProjectDir.getPath() + "/"));
        return resourceSet;
    }

    /**
     * Normalizes a block copyright text to EMF GenModel format.
     *
     * @param rawCopyright raw copyright text
     * @return normalized text suitable for {@code GenModel#setCopyrightText}
     */
    private String toEmfCopyrightText(String rawCopyright) {
        String normalized = rawCopyright.stripTrailing().replace("\r\n", "\n");
        String[] lines = normalized.split("\n");
        StringBuilder out = new StringBuilder();
        for (String line : lines) {
            String trimmed = line.strip();
            if (trimmed.startsWith("/*") || trimmed.endsWith("*/")) {
                continue;
            }
            String normalizedLine = line;
            if (trimmed.startsWith("*")) {
                normalizedLine = trimmed.substring(1).stripLeading();
            }
            if (out.length() > 0) {
                out.append('\n');
            }
            out.append(normalizedLine);
        }
        return out.toString();
    }

    /**
     * Reloads the GenModel resource from disk to use the latest saved state.
     *
     * @param resourceSet EMF resource set containing the resource
     * @param uri URI of the GenModel resource
     * @param sourceFile source file for diagnostics
     * @return reloaded {@link GenModel}
     */
    private GenModel reloadGenModel(ResourceSet resourceSet, URI uri, File sourceFile) {
        Resource resource = resourceSet.getResource(uri, false);
        if (resource == null) {
            throw new IllegalStateException("Cannot reload missing GenModel resource: " + sourceFile);
        }
        resource.unload();
        try {
            resource.load(null);
        } catch (IOException e) {
            throw new IllegalStateException("Failed to reload GenModel resource: " + sourceFile, e);
        }
        if (resource.getContents().isEmpty() || !(resource.getContents().get(0) instanceof GenModel genModel)) {
            throw new IllegalStateException("No GenModel in " + sourceFile + " after reload");
        }
        return genModel;
    }

    /**
     * Deletes Eclipse plugin artifacts generated as side effects of EMF generation.
     *
     * @param modelProjectDir model project directory
     */
    private void deletePluginArtifacts(Path modelProjectDir) {
        try {
            Files.deleteIfExists(modelProjectDir.resolve("plugin.xml"));
            Files.deleteIfExists(modelProjectDir.resolve("plugin.properties"));
            Files.deleteIfExists(modelProjectDir.resolve("build.properties"));
            Files.deleteIfExists(modelProjectDir.resolve("META-INF").resolve("MANIFEST.MF"));
            Files.deleteIfExists(modelProjectDir.resolve("META-INF"));
        } catch (IOException e) {
            throw new IllegalStateException("Failed to remove Eclipse plugin artifacts from " + modelProjectDir, e);
        }
    }

}
