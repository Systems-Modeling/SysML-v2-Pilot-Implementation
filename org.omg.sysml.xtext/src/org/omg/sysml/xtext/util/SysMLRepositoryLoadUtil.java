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

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.kerml.xtext.linking.KerMLLazyLinkingResource;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.SysMLUtil;
import org.omg.sysml.util.repository.ProjectDelta;
import org.omg.sysml.util.repository.RepositoryContentFetcher;
import org.omg.sysml.util.repository.RepositoryProject;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.impl.ElementIdProcessingFacade;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class SysMLRepositoryLoadUtil extends SysMLUtil {
	
	private static final String EXTENSION = "xmi";
	
	public static void main(String[] args) throws ParseException {
		SysMLRepositoryLoadUtil sysMLRepositoryLoadUtil = createUsingArgs(args);
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
					cli.getOptionValue(localLibrary)
				);
	}
	
	private final String repositoryURL;
	private final String projectName;
	private final String targetLocation;
	private final String localLibraryPath;
	
	public SysMLRepositoryLoadUtil(String repositoryURL, String projectName, String targetLocation, String localLibraryPath) {
		super();
		this.repositoryURL = repositoryURL;
		this.projectName = projectName;
		this.targetLocation = targetLocation;
		this.localLibraryPath = localLibraryPath;
		
		KerMLStandaloneSetup.doSetup();
		SysMLStandaloneSetup.doSetup();
		
		addExtension(".sysml");
		addExtension(".kerml");
	}
	
	public void load() {
		System.out.println("Reading library");
		
		readAll(localLibraryPath, false);
		
		//avoid concurrent modification exception in the traversal by transforming the library
		ElementUtil.transformAll(getResourceSet(), false);
		
		
		//collect ids from library
		ElementIdProcessingFacade idProcessingFacade = new ElementIdProcessingFacade();
		var traversal = new Traversal(idProcessingFacade, true);
		
		getLibraryResources().forEach(res -> {
			if (!res.getContents().isEmpty()) {
				traversal.visit((Element) res.getContents().get(0));
			}
		});
		
		Map<Object, EObject> uuidToElementMap = idProcessingFacade.getUUIDToElementMap();
		
		RepositoryProject repositoryProject = new RepositoryProject(repositoryURL, projectName);
		RepositoryContentFetcher repositoryFetcher = new RepositoryContentFetcher(repositoryProject, uuidToElementMap);
		ProjectDelta delta = repositoryFetcher.fetch();
		
		var projectRoots = delta.getProjectRoots();
		
		try {
			ResourceSet resourceSet = getResourceSet();
			
			for (var root : projectRoots.keySet()) {
				var dto = projectRoots.get(root);
				Object object = dto.get("@id");
				URI fileURI = URI.createFileURI(String.format("%s/%s.%s", targetLocation, object.toString(), EXTENSION));
				Resource resource = resourceSet.createResource(fileURI);
				resource.getContents().add(root);
				System.out.println("Saving resource");
				resource.save(Collections.EMPTY_MAP);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
