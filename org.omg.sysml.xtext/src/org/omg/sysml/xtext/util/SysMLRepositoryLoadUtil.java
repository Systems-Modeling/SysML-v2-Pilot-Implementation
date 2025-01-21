/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
 * Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.sysml.xtext.util;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.util.SysMLUtil;
import org.omg.sysml.util.repository.RepositoryProject;
import org.omg.sysml.util.repository.RepositoryToLocalProject;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class SysMLRepositoryLoadUtil extends SysMLUtil {
		
	public static void main(String[] args) throws ParseException {
		SysMLRepositoryLoadUtil sysMLRepositoryLoadUtil = createUsingArgs(args);
		sysMLRepositoryLoadUtil.load();
	}
	
	public static SysMLRepositoryLoadUtil createUsingArgs(String... args) throws ParseException {
		var repositoryOption = new Option("r", "repository", true, "Repository url. E.g: http://localhost:9000");
		repositoryOption.setRequired(false);
		
		var projectOption = new Option("p", "project", true, "Project name in the repository.");
		projectOption.setRequired(true);
		
		var targetOption = new Option("t", "target", true, "Location where the project is loaded");
		targetOption.setRequired(true);
		
		Options options = new Options().addOption(repositoryOption).addOption(projectOption).addOption(targetOption);
		
		CommandLineParser parser = new DefaultParser();
		CommandLine cli = parser.parse(options, args);
		
		return new SysMLRepositoryLoadUtil(
					cli.hasOption(repositoryOption)? cli.getOptionValue(repositoryOption) : "http://localhost:9000",
					cli.getOptionValue(projectOption),
					cli.getOptionValue(targetOption)
				);
	}
	
	private final String repositoryURL;
	private final String projectName;
	private final String targetLocation;
	
	public SysMLRepositoryLoadUtil(String repositoryURL, String projectName, String targetLocation) {
		super();
		this.repositoryURL = repositoryURL;
		this.projectName = projectName;
		this.targetLocation = targetLocation;
		
		KerMLStandaloneSetup.doSetup();
		SysMLStandaloneSetup.doSetup();
	}
	
	public void load() {
		RepositoryProject repositoryProject = new RepositoryProject(repositoryURL, projectName);
		repositoryProject.loadRemote();
		
		RepositoryToLocalProject transformer = new RepositoryToLocalProject(repositoryProject, targetLocation);
		transformer.transform(getResourceSet());
	}
}
