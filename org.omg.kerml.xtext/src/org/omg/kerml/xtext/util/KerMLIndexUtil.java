/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.kerml.xtext.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.io.SysMLUtil;

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
		java.util.LinkedHashMap<String, String> map = indexAsMap(inputPath);
		List<String> entries = new ArrayList<>();
		for (var entry : map.entrySet()) {
			entries.add(formatEntry(entry.getKey(), entry.getValue()));
		}
		return String.join("\n", entries);
	}
	
	public java.util.LinkedHashMap<String, String> indexAsMap(String inputPath) {
		read(inputPath);
		File inputFile = new File(inputPath);
		String inputDir = inputPath;
		if (!inputFile.isDirectory()) {
			inputDir = inputFile.getParent();
			if (inputDir == null) inputDir = "";
		}
		java.util.TreeMap<String, String> sorted = new java.util.TreeMap<>();
		for (Resource resource : getInputResources()) {
			String resourcePath = resource.getURI().toFileString().replace(inputDir + "/", "");
			Namespace rootNamespace = (Namespace) resource.getContents().get(0);
			List<Membership> memberships = rootNamespace.visibleMemberships(new BasicEList<>(), false, false);
			for (Membership m : memberships) {
				if (m.getMemberName() != null) sorted.put(m.getMemberName(), resourcePath);
				if (m.getMemberShortName() != null) sorted.put(m.getMemberShortName(), resourcePath);
			}
		}
		return new java.util.LinkedHashMap<>(sorted);
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
