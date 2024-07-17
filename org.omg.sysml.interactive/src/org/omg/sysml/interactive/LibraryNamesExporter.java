/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
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
 */
package org.omg.sysml.interactive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.kerml.xtext.library.LibraryIndex;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class LibraryNamesExporter {
	public static void main(final String[] args) throws IOException {
		LibraryIndex.disable();
		final SysMLInteractive instance = SysMLInteractive.getProfilingInstance();
		instance.loadLibrary(args[0]);
		final Map<String, Set<String>> shortNames = new HashMap<>();
		instance.getLibraryResources().forEach(it -> {
			EcoreUtil.resolveAll(it);
			it.getAllContents().forEachRemaining(el -> {
				if (el instanceof Namespace) {
					final String nsQn = ((Namespace) el).getQualifiedName();
					if ((nsQn != null) && (!nsQn.isEmpty())) {
						EList<Membership> membership = ((Namespace) el).getMembership();
						for (final Membership mem : membership) {
							{
								final String memberName = mem.getMemberName();
								final String memberShortName = mem.getMemberShortName();
								final Element memberElement = mem.getMemberElement();
								final String memberElementDeclaredName = memberElement.getDeclaredName();;
								final String memberElementDeclaredShortName = memberElement.getDeclaredShortName();;
								LibraryNamesExporter.addIfNotNull(shortNames, nsQn, memberName);
								LibraryNamesExporter.addIfNotNull(shortNames, nsQn, memberShortName);
								LibraryNamesExporter.addIfNotNull(shortNames, nsQn, memberElementDeclaredName);
								LibraryNamesExporter.addIfNotNull(shortNames, nsQn, memberElementDeclaredShortName);
							}
						}
					}
				}
			});
		});
		
		final Gson gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
		final String json = gson.toJson(shortNames);
		Files.write(Paths.get("../org.omg.kerml.xtext/src-gen/org/omg/kerml/xtext/library/LibraryIndex.json"), json.getBytes());
	}

	public static void addIfNotNull(final Map<String, Set<String>> names, final String ns, final String name) {
		if (name != null) {
			names.computeIfAbsent(ns, key -> new HashSet<>()).add(name);
		}
	}
}
