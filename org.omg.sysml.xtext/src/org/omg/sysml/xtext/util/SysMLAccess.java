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
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.service.OperationCanceledError;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.kerml.xtext.library.ILibraryIndexProvider;
import org.omg.kerml.xtext.naming.KerMLQualifiedNameConverter;
import org.omg.kerml.xtext.xmi.KerMLxStandaloneSetup;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.SysMLUtil;
import org.omg.sysml.xtext.SysMLStandaloneSetup;
import org.omg.sysml.xtext.xmi.SysMLxStandaloneSetup;

import com.google.common.base.Predicates;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class SysMLAccess extends SysMLUtil {
	public static final String KERNEL_LIBRARIES_DIRECTORY = "Kernel Libraries";
	public static final String SYSTEMS_LIBRARY_DIRECTORY = "Systems Library";
	public static final String DOMAIN_LIBRARIES_DIRECTORY = "Domain Libraries";
	
	public static final String KERML_EXTENSION = ".kerml";
	public static final String SYSML_EXTENSION = ".sysml";
	
	public static final String KERMLX_EXTENSION = ".kermlx";
	public static final String SYSMLX_EXTENSION = ".sysmlx";
	
    private Resource dummyResource;
	
    @Inject
	protected IGlobalScopeProvider scopeProvider;
	
	@Inject
	protected KerMLQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private ILibraryIndexProvider libraryIndexCache;
	
	@Inject
	protected IResourceValidator validator;
	
	@Inject
	public SysMLAccess() {
		super();
	}
	
	protected SysMLAccess(ResourceDescriptionsData resourceDescriptionData) {
		super(resourceDescriptionData);
	}
	
	public ILibraryIndexProvider getLibraryIndexCache() {
		return libraryIndexCache;
	}
	
	
	public void setupXMISupport() {
		addExtension(KERMLX_EXTENSION);
		addExtension(SYSMLX_EXTENSION);
		KerMLxStandaloneSetup.doSetup();
		SysMLxStandaloneSetup.doSetup();
	}
	
	public void loadLibrary() throws IOException {
		loadLibrary(getModelLibraryDirectory());
	}
	
	protected void loadLibrary(String path) throws IOException {
		if (path != null) {
			if (!path.endsWith("/")) {
				path += "/";
			}
			this.readAll(path + KERNEL_LIBRARIES_DIRECTORY, false, KERML_EXTENSION);
			this.readAll(path + SYSTEMS_LIBRARY_DIRECTORY, false, SYSML_EXTENSION);
			this.readAll(path + DOMAIN_LIBRARIES_DIRECTORY, false, SYSML_EXTENSION);
		}
	}
	
	protected Resource getDummyResource() {
		if (this.dummyResource == null) {
			this.dummyResource = this.createResource("dummy" + SYSML_EXTENSION);
			this.dummyResource.getContents().add(SysMLFactory.eINSTANCE.createNamespace());
		}
		return this.dummyResource;
	}
	
	public Element getRootElement(Resource resource) {
		if (resource instanceof XtextResource xtextResource) {
			final IParseResult result = xtextResource.getParseResult();
			return result == null? null: (Element)result.getRootASTElement();
		} else {
			EList<EObject> contents = resource.getContents();
			return contents.isEmpty()? null: (Element)contents.get(0);
		}
	}
	
	public Element resolve(String name) {
		IScope scope = scopeProvider.getScope(
				this.getDummyResource(), 
				SysMLPackage.eINSTANCE.getNamespace_Member(), 
				Predicates.alwaysTrue());
		IEObjectDescription description = scope.getSingleElement(
				this.qualifiedNameConverter.toQualifiedName(name));
		if (description == null) {
			return null;
		} else {
			EObject object = description.getEObjectOrProxy();
			return object instanceof Element? (Element)object: null;
		}
	}
	
	public List<SysMLParseResult> parseFiles(File file, boolean isInput) throws IOException {
		List<Resource> resources = this.readAll(file, isInput);
		return  validateResources(resources);
	}
	
	public List<SysMLParseResult> parseFile(String file, boolean isInput) throws IOException {
		return parseFiles(new File(file), isInput);
	}

	public List<SysMLParseResult> validateResources(List<Resource> resources) throws OperationCanceledError {
		final List<SysMLParseResult> results = new LinkedList<>();
		for (var resource: resources) {
			List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			results.add(new SysMLParseResult(getRootElement(resource), issues));
		}
		return results;
	}
	
	public SysMLParseResult parse(String resourceURI, String input) throws IOException {
		assert resourceURI.endsWith(".kerml") || resourceURI.endsWith(".sysml"): "resourceName must use .kerml or .sysml file extension";
		
		Resource resource = this.createResource(resourceURI);
		if (resource instanceof XtextResource xtextResource) {
			addResourceToIndex(resource);
			xtextResource.reparse(input);
		} else {
			//TODO: add warning when resource is not meant to be parsed
		}
		
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		return new SysMLParseResult(getRootElement(resource), issues);
	}
	
	public void setModelLibraryDirectory(String directory) {
		SysMLLibraryUtil.setModelLibraryDirectory(directory);
	}
	
	public String getModelLibraryDirectory() {
		return SysMLLibraryUtil.getModelLibraryPath();
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static SysMLAccess createFullyFeatured(String modelLibraryDirectory, boolean interactiveShadowing) {
		return builder()
				.libraryPath(modelLibraryDirectory)
				.xmiSupport()
				.verbose()
				.build();
	}
	
	public static SysMLAccess createFullyFeatured(String modelLibraryDirectory) {
		return createFullyFeatured(modelLibraryDirectory, false);
	}
		
	protected static class SysMLInteractiveAccess extends SysMLAccess {
		
		@Inject
		public SysMLInteractiveAccess() {
			super(new StrictShadowingResourceDescriptionData());
		}
	}
	
	public static class Builder {
		private boolean interactiveShadowing = false;
		private String modelLibraryDirectory = SysMLLibraryUtil.DEFAULT_MODEL_LIBRARY_PATH;
		private boolean withXMISupport = false;
		private boolean verbose;
		
		public Builder libraryPath(String modelLibraryDirectory) {
			this.modelLibraryDirectory = modelLibraryDirectory;
			return this;
		}
		
		public Builder interactiveShadowingSemantics() {
			this.interactiveShadowing = true;
			return this;
		}
		
		public Builder xmiSupport() {
			this.withXMISupport = true;
			return this;
		}
		
		public Builder verbose() {
			this.verbose = true;
			return this;
		}
		
		public SysMLAccess build() {
			// Note: An EPackage must be registered to be sure the correctly configured
			// CompositeEValidator is used.
			EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, SysMLPackage.eINSTANCE);
			
			KerMLStandaloneSetup.doSetup();
			Injector injector = new SysMLStandaloneSetup().createInjectorAndDoEMFRegistration();
			
			final SysMLAccess access;
			if (interactiveShadowing) {
				access = injector.getInstance(SysMLInteractiveAccess.class);
			} else {
				access = injector.getInstance(SysMLAccess.class);
			}
			
			access.addExtension(SYSML_EXTENSION);
			access.addExtension(KERML_EXTENSION);
			
			access.setModelLibraryDirectory(modelLibraryDirectory);
			access.setVerbose(verbose);
			
			if (withXMISupport) {
				access.setupXMISupport();
			}
			
			return access;
		}
	}
}
