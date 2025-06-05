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
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.ApiException;
import org.omg.sysml.util.SysMLUtil;
import org.omg.sysml.util.repository.EObjectUUIDTracker;
import org.omg.sysml.util.repository.APIModel;
import org.omg.sysml.util.repository.EMFModelDelta;
import org.omg.sysml.util.repository.ProjectRepository;
import org.omg.sysml.util.repository.Revision;
import org.omg.sysml.util.repository.RemoteProject;
import org.omg.sysml.util.repository.RemoteProject.RemoteBranch;
import org.omg.sysml.util.repository.EMFModelRefresher;
import org.omg.sysml.util.traversal.facade.impl.ApiElementProcessingFacade;
import org.omg.sysml.xtext.SysMLStandaloneSetup;
import org.omg.sysml.xtext.xmi.SysMLxStandaloneSetup;

public class SysMLRepositoryLoadUtil extends SysMLUtil {
	
	public static void main(String[] args) throws ParseException, UnsupportedOperationException, ApiException {
		SysMLRepositoryLoadUtil sysMLRepositoryLoadUtil = createUsingArgs(args);
		
		KerMLStandaloneSetup.doSetup();
		SysMLStandaloneSetup.doSetup();
		SysMLxStandaloneSetup.doSetup();
		
		sysMLRepositoryLoadUtil.load();
	}
	
	public static SysMLRepositoryLoadUtil createUsingArgs(String... args) throws ParseException {
		var localLibrary = new Option("l", "library", true, "Path to local library");
		localLibrary.setRequired(true);
		
		var repositoryOption = new Option("b", "base", true, "Repository url. E.g: " + ApiElementProcessingFacade.DEFAULT_BASE_PATH);
		repositoryOption.setRequired(false);
		
		OptionGroup projectOption = new OptionGroup();
		projectOption.setRequired(true);
		var projectNameOption = new Option("n", "name", true, "Project's name in the repository.");
		var projectIdOption = new Option("id", "id", true, "Project's id in the repository.");
		
		projectOption.addOption(projectNameOption);
		projectOption.addOption(projectIdOption);
		
		var branchOption = new Option("br", "branch", true, "Branch's name in the project");
		
		var targetOption = new Option("t", "target", true, "Location where the project is loaded");
		targetOption.setRequired(true);
		
		Options options = new Options()
				.addOption(repositoryOption)
				.addOptionGroup(projectOption)
				.addOption(branchOption)
				.addOption(targetOption)
				.addOption(localLibrary);
		
		
		CommandLineParser parser = new DefaultParser(false);
		
		CommandLine cli = parser.parse(options, args);
		
		return new SysMLRepositoryLoadUtil(
					cli.hasOption(repositoryOption)? cli.getOptionValue(repositoryOption) : ApiElementProcessingFacade.DEFAULT_BASE_PATH,
					cli.hasOption(projectNameOption)? cli.getOptionValue(projectNameOption) : cli.getOptionValue(projectIdOption),
					cli.getOptionValue(branchOption),
					cli.getOptionValue(targetOption),
					new File(cli.getOptionValue(localLibrary))
				).setIsReferencedById(cli.hasOption(projectIdOption));
	}
	
	private final String repositoryURL;
	private final String project;
	private final String branchName;
	private final String targetLocation;
	private final File localLibraryPath;
	private boolean isReferencedById;
	
	public SysMLRepositoryLoadUtil(String repositoryURL, String project, String branch, String targetLocation, File localLibraryPath) {
		super();
		this.repositoryURL = repositoryURL;
		this.project = project;
		this.targetLocation = targetLocation;
		this.localLibraryPath = localLibraryPath;
		this.branchName = branch;
		
		addExtension(".sysml");
		addExtension(".kerml");
	}
	
	public void load() throws UnsupportedOperationException, ApiException {
		
		ProjectRepository projectRepository = new ProjectRepository(repositoryURL);
		RemoteProject repositoryProject =  isReferencedById? projectRepository.getProjectById(project):
			projectRepository.getProjectByName(project);
		
		if (repositoryProject == null) {
			System.err.println("Project does not exist.");
			return;
		}
		
		final RemoteBranch branch;
		if (branchName == null) {
			branch = repositoryProject.getDefaultBranch();
		} else {
			branch = repositoryProject.getBranch(branchName);
		}
		
		if (branch == null) {
			System.err.println("Branch does not exist.");
			return;
		}
		
		System.out.println("Reading library...");
		readAll(localLibraryPath, false);
		
		//collect ids from library
		System.out.println("Tracking library UUIDs...");
		EObjectUUIDTracker tracker = new EObjectUUIDTracker();
		tracker.trackLibraryUUIDs(getLibraryResources());
		
		System.out.println("Downloading project...");
		Revision headRevision = branch.getHeadRevision();
		APIModel remote = headRevision.fetchRemote();
		EMFModelRefresher modelRefresher = new EMFModelRefresher(remote, tracker);
		EMFModelDelta delta = modelRefresher.create();
		modelRefresher.getIssues().forEach(System.out::println);
		ResourceSet resourceSet = getResourceSet();
		
		try {
			System.out.println("Saving resources...");
			delta.apply(resourceSet, URI.createFileURI(targetLocation));
			System.out.println("Done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public SysMLRepositoryLoadUtil setIsReferencedById(boolean referencedById) {
		this.isReferencedById = referencedById;
		return this;
	}
}
