/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.interactive.profiler;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationService;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationServices;
import org.omg.sysml.logic.implicit.specialization.api.ImplicitSpecialization;
import org.omg.sysml.util.ElementUtil;

/**
 * Writes the raw and reduced implicit specializations of every Type of the standard libraries and
 * of a SysML corpus, once after resolution and once after transformation, so that two
 * implementations of the rules can be compared by a plain text diff. The loading protocol is the
 * one of {@link SysMLInteractiveModelBenchmark}.
 * <p>
 * Use it as a non-regression check of a change to the implicit-specialization rules or engine
 * that must not change the computed specializations: dump the corpus with the build before the
 * change and with the build after it, then compare the two files. Any difference, including a
 * different order, is a behavior change to explain. The procedure is described in the
 * "Verification" section of {@code org.omg.sysml.logic/doc/implicit-specialization.md}.
 * <p>
 * Each line has the form {@code <checkpoint> <view> <type> = [<kind>:<general>, ...]}, where
 * {@code <checkpoint>} is {@code resolved} or {@code transformed}, {@code <view>} is {@code raw}
 * ({@code getImplicitSpecializationCandidates}) or {@code reduced}
 * ({@code getImplicitSpecializations}), and elements are identified by the last segment of their
 * resource URI and their URI fragment. A general without resource is written as
 * {@code chain(...)} for a feature chain, or {@code detached <metaclass>} otherwise. Types are
 * written in containment order, and the specializations of a Type in the order returned by the
 * service. The output is deterministic for a given build and corpus.
 */
public final class ImplicitSpecializationDump {

	private ImplicitSpecializationDump() {
	}

	/**
	 * Loads, resolves and transforms the corpus, and writes the dump.
	 *
	 * @param args the standard library folder, the folder searched recursively for {@code .sysml}
	 *        models, and the output file
	 * @throws Exception when a model cannot be loaded or the output cannot be written
	 */
	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			throw new IllegalArgumentException(
					"Usage: ImplicitSpecializationDump <standard-library-folder> <models-folder> <output-file>");
		}
		Path libraries = Path.of(args[0]).toAbsolutePath().normalize();
		Path models = Path.of(args[1]).toAbsolutePath().normalize();
		List<Path> inputs;
		try (var paths = Files.walk(models)) {
			inputs = paths.filter(Files::isRegularFile)
					.filter(path -> path.toString().endsWith(".sysml")).sorted().toList();
		}
		System.setProperty("org.eclipse.emf.common.util.ReferenceClearingQueue", "false");
		SysMLInteractive instance = SysMLInteractive.getInstance();
		instance.getLibraryIndexCache().setIndexDisabled(true);
		ImplicitSpecializationService service = new ImplicitSpecializationService(type -> true);
		ImplicitSpecializationServices.install(instance.getResourceSet(), service);
		instance.loadLibrary(libraries.toString());
		for (Path input : inputs) {
			instance.addInputResource(instance.getResource(input.toString()));
		}
		ResourceSet resources = instance.getResourceSet();
		for (int i = 0; i < resources.getResources().size(); i++) {
			EcoreUtil2.resolveLazyCrossReferences(resources.getResources().get(i), null);
		}
		try (BufferedWriter out = Files.newBufferedWriter(Path.of(args[2]), StandardCharsets.UTF_8)) {
			dump(out, "resolved", resources, service);
			ElementUtil.transformAll(resources, false);
			dump(out, "transformed", resources, service);
		}
	}

	private static void dump(BufferedWriter out, String checkpoint, ResourceSet resources,
			ImplicitSpecializationService service) throws IOException {
		List<Type> types = new ArrayList<>();
		for (var contents = EcoreUtil.getAllContents(resources, false); contents.hasNext();) {
			if (contents.next() instanceof Type type) {
				types.add(type);
			}
		}
		for (Type type : types) {
			String id = describe(type);
			out.write(checkpoint + " raw " + id + " = " + describe(service.getImplicitSpecializationCandidates(type)));
			out.newLine();
			out.write(checkpoint + " reduced " + id + " = " + describe(service.getImplicitSpecializations(type)));
			out.newLine();
		}
	}

	private static String describe(List<ImplicitSpecialization> specializations) {
		return specializations.stream()
				.map(specialization -> specialization.specializationKind().getName() + ":"
						+ describe(specialization.generalType()))
				.collect(Collectors.joining(", ", "[", "]"));
	}

	private static String describe(EObject element) {
		if (element == null) {
			return "null";
		}
		Resource resource = element.eResource();
		if (resource != null) {
			return resource.getURI().lastSegment() + "#" + resource.getURIFragment(element);
		}
		if (element instanceof Feature feature && !feature.getChainingFeature().isEmpty()) {
			return feature.getChainingFeature().stream().map(ImplicitSpecializationDump::describe)
					.collect(Collectors.joining(".", "chain(", ")"));
		}
		return "detached " + element.eClass().getName();
	}
}
