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

import java.io.File;
import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.SysMLUtil;
import org.omg.sysml.util.repository.EObjectUUIDTracker;
import org.omg.sysml.util.repository.ProjectDelta;
import org.omg.sysml.util.repository.ProjectRepository;
import org.omg.sysml.util.repository.ProjectRepository.RepositoryProject;
import org.omg.sysml.util.repository.RepositoryContentFetcher;
import org.omg.sysml.xmi.SysMLxStandaloneSetup;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class SysMLRepositoryLoadUtil extends SysMLUtil {
	
	public static void main(String[] args) throws ParseException {
		SysMLRepositoryLoadUtil sysMLRepositoryLoadUtil = createUsingArgs(args);
		
		KerMLStandaloneSetup.doSetup();
		SysMLStandaloneSetup.doSetup();
		SysMLxStandaloneSetup.doSetup();
		
		sysMLRepositoryLoadUtil.load();
	}
	
	public static SysMLRepositoryLoadUtil createUsingArgs(String... args) throws ParseException {
		var localLibrary = new Option("l", "library", true, "Path to local library");
		localLibrary.setRequired(true);
		
		var repositoryOption = new Option("b", "base", true, "Repository url. E.g: http://localhost:9000");
		repositoryOption.setRequired(false);
		
		var projectOption = new Option("p", "project", true, "Project name in the repository.");
		projectOption.setRequired(true);
		
		var targetOption = new Option("t", "target", true, "Location where the project is loaded");
		targetOption.setRequired(true);
		
		Options options = new Options().addOption(repositoryOption).addOption(projectOption).addOption(targetOption).addOption(localLibrary);
		
		CommandLineParser parser = new DefaultParser();
		CommandLine cli = parser.parse(options, args);
		
		return new SysMLRepositoryLoadUtil(
					cli.hasOption(repositoryOption)? cli.getOptionValue(repositoryOption) : "http://localhost:9000",
					cli.getOptionValue(projectOption),
					cli.getOptionValue(targetOption),
					new File(cli.getOptionValue(localLibrary))
				);
	}
	
	private final String repositoryURL;
	private final String projectName;
	private final String targetLocation;
	private final File localLibraryPath;
	
	public SysMLRepositoryLoadUtil(String repositoryURL, String projectName, String targetLocation, File localLibraryPath) {
		super();
		this.repositoryURL = repositoryURL;
		this.projectName = projectName;
		this.targetLocation = targetLocation;
		this.localLibraryPath = localLibraryPath;
		
		addExtension(".sysml");
		addExtension(".kerml");
	}
	
	public void load() {
		System.out.println("Reading library");
		
		readAll(localLibraryPath, false);
		
		//collect ids from library
		EObjectUUIDTracker tracker = new EObjectUUIDTracker();
		tracker.trackLibraryUUIDs(getLibraryResources());
		
		ProjectRepository projectRepository = new ProjectRepository(repositoryURL);
		//TODO change to name
		RepositoryProject repositoryProject = projectRepository.getProjectById(projectName);
		RepositoryContentFetcher repositoryFetcher = new RepositoryContentFetcher(repositoryProject, tracker);
		ProjectDelta delta = repositoryFetcher.fetch();
		
		ResourceSet resourceSet = getResourceSet();

		try {
			delta.save(resourceSet, URI.createFileURI(projectName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
