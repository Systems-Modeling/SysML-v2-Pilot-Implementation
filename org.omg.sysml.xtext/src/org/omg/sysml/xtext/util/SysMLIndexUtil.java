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

package org.omg.sysml.xtext.util;

import org.omg.kerml.xtext.util.KerMLIndexUtil;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class SysMLIndexUtil extends KerMLIndexUtil {

	public SysMLIndexUtil() {
		super();
		SysMLStandaloneSetup.doSetup();
		addExtension(".sysml");
	}

	/**
	 * Index all projects in a sysand workspace. For each project, parses SysML/KerML
	 * files, computes symbol-to-file index, and updates the project's {@code .meta.json}.
	 *
	 * @param workspacePath path to the workspace directory containing {@code .workspace.json}
	 */
	public void indexWorkspace(String workspacePath) throws com.sensmetry.sysand.exceptions.SysandException {
		String[] projectPaths = com.sensmetry.sysand.Sysand.workspaceProjectPaths(
				java.nio.file.Paths.get(workspacePath));
		for (String projectPath : projectPaths) {
			System.out.println("Indexing project: " + projectPath);
			SysMLIndexUtil util = new SysMLIndexUtil();
			java.util.LinkedHashMap<String, String> index = util.indexAsMap(projectPath);
			com.sensmetry.sysand.Sysand.setProjectIndex(
					java.nio.file.Paths.get(projectPath), index);
			System.out.println("  Updated " + index.size() + " index entries");
		}
	}

	/**
	 * <p>Usage:
	 *
	 * <p>Workspace mode: SysMLIndexUtil workspace-path
	 * <p>Single-file mode: SysMLIndexUtil input-path output-path
	 *
	 * <p>Workspace mode is detected when the first argument is a directory
	 * containing {@code .workspace.json}.
	 */
	public static void main(String[] args) {
		try {
			if (new java.io.File(args[0], ".workspace.json").exists()) {
				new SysMLIndexUtil().indexWorkspace(args[0]);
			} else {
				new SysMLIndexUtil().writeIndex(args[0], args[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
