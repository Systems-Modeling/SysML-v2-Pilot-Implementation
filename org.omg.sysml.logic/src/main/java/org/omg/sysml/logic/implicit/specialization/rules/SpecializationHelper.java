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
package org.omg.sysml.logic.implicit.specialization.rules;

import java.util.Arrays;
import java.util.Objects;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.logic.implicit.specialization.ImplicitSpecializationResult;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.SysMLLibraryUtil;

/**
 * Stateless helpers resolving specialization candidates through
 * {@link ImplicitGeneralizationMap} and the standard library.
 */
final class SpecializationHelper {
	private SpecializationHelper() {
	}

	/**
	 * Selects the specialization kind implied for a type (KerML &sect;8.4.2): Subclassification
	 * for a Classifier, Subsetting for a Feature, otherwise Specialization.
	 *
	 * @param type the specific type
	 * @return the concrete specialization metaclass
	 */
	static EClass defaultKind(Type type) {
		if (type instanceof Feature) {
			return SysMLPackage.Literals.SUBSETTING;
		}
		if (type instanceof Classifier) {
			return SysMLPackage.Literals.SUBCLASSIFICATION;
		}
		return SysMLPackage.Literals.SPECIALIZATION;
	}

	/**
	 * Reads a qualified library name from the static generalization map.
	 *
	 * @param type the metaclass source
	 * @param key the contextual mapping key
	 * @return the qualified library name, or {@code null}
	 */
	static String mapped(Type type, String key) {
		return ImplicitGeneralizationMap.getDefaultSupertypeFor(type.getClass(), key);
	}

	/**
	 * Resolves a library type and marks the result incomplete when absent.
	 *
	 * @param result the result whose completeness is tracked
	 * @param context the lookup context
	 * @param names qualified names in fallback order
	 * @return the first resolved library type, or {@code null}
	 */
	static Type library(ImplicitSpecializationResult result, Element context, String... names) {
		Type type = SysMLLibraryUtil.getLibraryType(context, names);
		if (type == null && Arrays.stream(names).anyMatch(Objects::nonNull)) {
			result.markIncomplete();
		}
		return type;
	}

	/**
	 * Adds one directly named library type as a specialization candidate.
	 *
	 * @param result the candidates to update
	 * @param context the lookup context
	 * @param kind the specialization metaclass
	 * @param names the constant qualified library names, in fallback order
	 */
	static void addLibrary(ImplicitSpecializationResult result, Element context, EClass kind, String... names) {
		result.add(kind, library(result, context, names));
	}

	/**
	 * Adds one mapping entry after library resolution.
	 *
	 * @param result the candidates to update
	 * @param type the metaclass source and lookup context
	 * @param kind the specialization metaclass
	 * @param key the contextual mapping key
	 */
	static void addMapped(ImplicitSpecializationResult result, Type type, EClass kind, String key) {
		addLibrary(result, type, kind, mapped(type, key));
	}

	/**
	 * Adds, as a Subsetting, the library default mapped to a key for the concrete class of a Type.
	 *
	 * @param result the result to update
	 * @param type the Type whose concrete class selects the map entry
	 * @param key the contextual mapping key
	 */
	static void addMappedSubsetting(ImplicitSpecializationResult result, Type type, String key) {
		addMapped(result, type, SysMLPackage.Literals.SUBSETTING, key);
	}
}
