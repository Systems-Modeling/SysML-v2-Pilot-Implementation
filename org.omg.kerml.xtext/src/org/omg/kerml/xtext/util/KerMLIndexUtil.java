/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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

package org.omg.kerml.xtext.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.util.SysMLUtil;

public class KerMLIndexUtil extends SysMLUtil {
	
	public KerMLIndexUtil() {
		super();
		KerMLStandaloneSetup.doSetup();
		addExtension(".kerml");
	}
	
	protected static String formatEntry(String elementName, String resourcePath) {
		return "    \"" + elementName + "\": \"" + resourcePath + "\"";
	}
	
	public String index(String inputPath) {
		read(inputPath);
		File inputFile = new File(inputPath);
		if (!inputFile.isDirectory()) {
			inputPath = inputFile.getParent();
			if (inputPath == null) {
				inputPath = "";
			}
		}
		List<String> entries = new ArrayList<>();
		for (Resource resource: getInputResources()) {
			String resourcePath = resource.getURI().toFileString().replace(inputPath + "/", "");
			Namespace rootNamespace = (Namespace)resource.getContents().get(0);
			List<Membership> memberships = rootNamespace.visibleMemberships(new BasicEList<>(), false, false);
			Stream<String> names = memberships.stream().map(Membership::getMemberName);
			Stream<String> shortNames = memberships.stream().map(Membership::getMemberShortName);
			Stream.concat(names, shortNames)
				.filter(name->name != null)
				.map(name->formatEntry(name, resourcePath))
				.forEach(entries::add);
		}
		entries.sort(null);
		return String.join("\n", entries); 
	}
	
	public void writeIndex(String inputPath, String outputPath) throws IOException {
		String index = index(inputPath);
		System.out.println("Writing " + outputPath + "...");
		Files.writeString(Path.of(outputPath), index);
	}
	
	/**
	 * <p>Usage:
	 * 
	 * <p>KerMLIndexUtil input-path output-path
	 * 
	 * <p>where:
	 * 
	 * <ul>
	 * <li>input-path             is a path for reading input resources (file or directory)</li>
	 * <li>output-path            is a path for an output file</li>
	 * </ul>
	 */
	public static void main(String[] args) {
		try {
			new KerMLIndexUtil().writeIndex(args[0], args[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
