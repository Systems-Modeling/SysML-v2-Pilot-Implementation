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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * Generates one adapter class per SysML EClass in {@code org.omg.sysml.logic.adapter}.
 *
 * <p>The generation is deterministic:
 * <ul>
 * <li>classes are sorted by name;</li>
 * <li>all adapter files are regenerated from the same Ecore input;</li>
 * <li>obsolete generated adapter files are removed before generation.</li>
 * </ul>
 *
 * <p>Usage:
 * <pre>{@code
 * java org.omg.sysml.model.tools.GenerateAdaptersFromEcore \
 *   <path-to-SysML.ecore> <path-to-org.omg.sysml.logic-module>
 * }</pre>
 */
public final class GenerateAdaptersFromEcore {

    private final String ECORE_EXTENSION = "ecore";
    private final String ADAPTER_SUFFIX = "Adapter.java";
    private final Path ADAPTER_PACKAGE_PATH = Path.of("src/main/java/org/omg/sysml/logic/adapter");

    private final String COPYRIGHT = """
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
            """;

    /**
     * Utility constructor.
     */
    private GenerateAdaptersFromEcore() {
    }

    /**
     * Program entry point.
     *
     * @param args command-line arguments
     * @throws IOException if generation fails
     */
    public static void main(String[] args) throws IOException {
        new GenerateAdaptersFromEcore().generate(args);
    }

    /**
     * Generates adapter sources from the provided Ecore model.
     *
     * @param args command-line arguments
     * @throws IOException if file access or generation fails
     */
    private void generate(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: GenerateAdaptersFromEcore <ecore-file> <logic-module-dir>");
        }

        var ecoreFile = new File(args[0]).getAbsoluteFile();
        var logicModule = new File(args[1]).getAbsoluteFile().toPath();
        var outputDir = logicModule.resolve(ADAPTER_PACKAGE_PATH);

        var classes = loadAllClasses(ecoreFile);
        classes.sort(Comparator.comparing(EClass::getName));
        validateClassNameUniqueness(classes);

        cleanGeneratedFiles(outputDir, ADAPTER_SUFFIX);
        Files.createDirectories(outputDir);
        write(outputDir.resolve("AbstractSysMLAdapter.java"), abstractAdapterClass());
        write(outputDir.resolve("SysMLLogicAdapterFactory.java"), adapterFactoryClass(classes));
        write(outputDir.resolve("SysMLAdapters.java"), adaptersServiceClass());

        for (var eClass : classes) {
            var className = sanitize(eClass.getName());
            write(outputDir.resolve(className + "Adapter.java"), adapterClass(className, eClass));
        }
    }

    /**
     * Loads all EClasses from the input Ecore file.
     *
     * @param ecoreFile Ecore model file
     * @return discovered EClasses
     */
    private List<EClass> loadAllClasses(File ecoreFile) {
        var resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ECORE_EXTENSION, new XMIResourceFactoryImpl());
        Resource resource = resourceSet.getResource(URI.createFileURI(ecoreFile.getPath()), true);

        List<EClass> allClasses = new ArrayList<>();
        for (EObject root : resource.getContents()) {
            if (root instanceof EPackage ePackage) {
                collectClasses(ePackage, allClasses);
            }
        }
        return allClasses;
    }

    /**
     * Recursively collects EClasses from an EPackage hierarchy.
     *
     * @param ePackage package to inspect
     * @param target list receiving classes
     */
    private void collectClasses(EPackage ePackage, List<EClass> target) {
        for (EClassifier classifier : ePackage.getEClassifiers()) {
            if (classifier instanceof EClass eClass) {
                target.add(eClass);
            }
        }
        for (EPackage sub : ePackage.getESubpackages()) {
            collectClasses(sub, target);
        }
    }

    /**
     * Validates that sanitized class names are unique.
     *
     * @param classes discovered EClasses
     */
    private void validateClassNameUniqueness(List<EClass> classes) {
        Set<String> seenNames = new HashSet<>();
        for (var eClass : classes) {
            var className = sanitize(eClass.getName());
            if (!seenNames.add(className)) {
                throw new IllegalStateException("Duplicate EClass name found for adapter generation: " + className);
            }
        }
    }

    /**
     * Deletes previously generated source files matching a suffix in the output directory.
     *
     * @param outputDir output directory
     * @param suffix file suffix to delete
     * @throws IOException if deletion fails
     */
    private void cleanGeneratedFiles(Path outputDir, String suffix) throws IOException {
        if (!Files.isDirectory(outputDir)) {
            return;
        }
        try (var stream = Files.list(outputDir)) {
            for (Path file : stream.toList()) {
                var name = file.getFileName().toString();
                if (name.endsWith(suffix)) {
                    Files.deleteIfExists(file);
                }
            }
        }
    }

    /**
     * Builds the source code for the abstract adapter base type.
     *
     * @return Java source content
     */
    private String abstractAdapterClass() {
        return COPYRIGHT
                + "package org.omg.sysml.logic.adapter;\n\n"
                + "import java.util.Optional;\n\n"
                + "import org.eclipse.emf.common.notify.Notifier;\n"
                + "import org.eclipse.emf.common.notify.impl.AdapterImpl;\n\n"
                + "/**\n"
                + " * Base type for generated SysML element adapters.\n"
                + " *\n"
                + " * @param <T> adapted SysML element type\n"
                + " */\n"
                + "public abstract class AbstractSysMLAdapter<T> extends AdapterImpl {\n\n"
                + "    private final Class<T> adaptedType;\n\n"
                + "    protected AbstractSysMLAdapter(Class<T> adaptedType) {\n"
                + "        this.adaptedType = adaptedType;\n"
                + "    }\n\n"
                + "    public final Class<T> adaptedType() {\n"
                + "        return adaptedType;\n"
                + "    }\n\n"
                + "    @Override\n"
                + "    public boolean isAdapterForType(Object type) {\n"
                + "        return type == adaptedType;\n"
                + "    }\n\n"
                + "    @Override\n"
                + "    public void setTarget(Notifier newTarget) {\n"
                + "        super.setTarget(newTarget);\n"
                + "    }\n\n"
                + "    public final Optional<T> adaptedTarget() {\n"
                + "        var target = getTarget();\n"
                + "        if (adaptedType.isInstance(target)) {\n"
                + "            return Optional.of(adaptedType.cast(target));\n"
                + "        }\n"
                + "        return Optional.empty();\n"
                + "    }\n"
                + "}\n";
    }

    /**
     * Builds the source code for one generated adapter class.
     *
     * @param className generated class name
     * @param eClass source metaclass
     * @return Java source content
     */
    private String adapterClass(String className, EClass eClass) {
        return COPYRIGHT
                + "package org.omg.sysml.logic.adapter;\n\n"
                + "import org.omg.sysml.model.sysml." + className + ";\n\n"
                + "/**\n"
                + " * Generated adapter for {@link " + className + "}.\n"
                + " */\n"
                + "public class " + className + "Adapter extends AbstractSysMLAdapter<" + className + "> {\n\n"
                + "    public " + className + "Adapter() {\n"
                + "        super(" + className + ".class);\n"
                + "    }\n"
                + "}\n";
    }

    /**
     * Builds the source code for the generated adapter factory.
     *
     * @param classes source metaclasses
     * @return Java source content
     */
    private String adapterFactoryClass(List<EClass> classes) {
        var switchCases = new StringBuilder();
        var createMethods = new StringBuilder();
        for (var eClass : classes) {
            var className = sanitize(eClass.getName());
            switchCases.append("            @Override\n")
                    .append("            public org.eclipse.emf.common.notify.Adapter case")
                    .append(className)
                    .append("(org.omg.sysml.model.sysml.")
                    .append(className)
                    .append(" object) {\n")
                    .append("                return create")
                    .append(className)
                    .append("Adapter();\n")
                    .append("            }\n");
            createMethods.append("\n")
                    .append("    public org.eclipse.emf.common.notify.Adapter create")
                    .append(className)
                    .append("Adapter() {\n")
                    .append("        return new ")
                    .append(className)
                    .append("Adapter();\n")
                    .append("    }\n");
        }

        return COPYRIGHT
                + "package org.omg.sysml.logic.adapter;\n\n"
                + "import org.eclipse.emf.common.notify.Adapter;\n"
                + "import org.eclipse.emf.common.notify.Notifier;\n"
                + "import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;\n"
                + "import org.eclipse.emf.ecore.EObject;\n"
                + "import org.omg.sysml.model.sysml.SysMLPackage;\n"
                + "import org.omg.sysml.model.sysml.util.SysMLSwitch;\n\n"
                + "/**\n"
                + " * Generated adapter factory for SysML logic adapters.\n"
                + " */\n"
                + "public class SysMLLogicAdapterFactory extends AdapterFactoryImpl {\n\n"
                + "    private final SysMLSwitch<Adapter> modelSwitch = new SysMLSwitch<>() {\n"
                + switchCases
                + "            @Override\n"
                + "            public Adapter defaultCase(EObject object) {\n"
                + "                return null;\n"
                + "            }\n"
                + "        };\n\n"
                + "    @Override\n"
                + "    public boolean isFactoryForType(Object object) {\n"
                + "        if (object == SysMLPackage.eINSTANCE) {\n"
                + "            return true;\n"
                + "        }\n"
                + "        if (object instanceof EObject eObject) {\n"
                + "            return eObject.eClass().getEPackage() == SysMLPackage.eINSTANCE;\n"
                + "        }\n"
                + "        return false;\n"
                + "    }\n\n"
                + "    @Override\n"
                + "    public Adapter createAdapter(Notifier target) {\n"
                + "        if (target instanceof EObject eObject) {\n"
                + "            return modelSwitch.doSwitch(eObject);\n"
                + "        }\n"
                + "        return null;\n"
                + "    }\n"
                + createMethods
                + "}\n";
    }

    /**
     * Builds the source code for the runtime adapter access service.
     *
     * @return Java source content
     */
    private String adaptersServiceClass() {
        return COPYRIGHT
                + "package org.omg.sysml.logic.adapter;\n\n"
                + "import java.util.Optional;\n\n"
                + "import org.eclipse.emf.ecore.EObject;\n\n"
                + "/**\n"
                + " * Runtime adapter access service for SysML model elements.\n"
                + " */\n"
                + "public class SysMLAdapters {\n\n"
                + "    private final SysMLLogicAdapterFactory adapterFactory;\n\n"
                + "    public SysMLAdapters(SysMLLogicAdapterFactory adapterFactory) {\n"
                + "        this.adapterFactory = adapterFactory;\n"
                + "    }\n\n"
                + "    public <A extends AbstractSysMLAdapter<?>> Optional<A> find(EObject element, Class<A> adapterClass) {\n"
                + "        for (var adapter : element.eAdapters()) {\n"
                + "            if (adapterClass.isInstance(adapter)) {\n"
                + "                return Optional.of(adapterClass.cast(adapter));\n"
                + "            }\n"
                + "        }\n"
                + "        return Optional.empty();\n"
                + "    }\n\n"
                + "    public <A extends AbstractSysMLAdapter<?>> A adapt(EObject element, Class<A> adapterClass) {\n"
                + "        var existing = find(element, adapterClass);\n"
                + "        if (existing.isPresent()) {\n"
                + "            return existing.orElseThrow();\n"
                + "        }\n"
                + "\n"
                + "        var created = adapterFactory.createAdapter(element);\n"
                + "        if (created == null || !adapterClass.isInstance(created)) {\n"
                + "            var createdType = created == null ? \"null\" : created.getClass().getName();\n"
                + "            throw new IllegalStateException(\n"
                + "                    \"Cannot adapt \" + element.eClass().getName() + \" with \" + adapterClass.getName()\n"
                + "                            + \"; factory produced \" + createdType);\n"
                + "        }\n"
                + "\n"
                + "        element.eAdapters().add(created);\n"
                + "        return adapterClass.cast(created);\n"
                + "    }\n"
                + "}\n";
    }

    /**
     * Writes generated content to a file using UTF-8.
     *
     * @param path target file path
     * @param content source content
     * @throws IOException if write fails
     */
    private void write(Path path, String content) throws IOException {
        Files.writeString(path, content, StandardCharsets.UTF_8);
    }

    /**
     * Converts an identifier into a Java-safe token.
     *
     * @param identifier source identifier
     * @return sanitized identifier
     */
    private String sanitize(String identifier) {
        StringBuilder result = new StringBuilder(identifier.length());
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '_') {
                result.append(c);
            } else {
                result.append('_');
            }
        }
        if (result.isEmpty()) {
            return "_";
        }
        if (!Character.isJavaIdentifierStart(result.charAt(0))) {
            result.insert(0, '_');
        }
        return result.toString();
    }
}
