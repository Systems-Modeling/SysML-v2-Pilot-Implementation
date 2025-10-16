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

/**
 * This is an API that enables building batch applications
 * for parsing and validation of sysml and kerml models
 * by setting up the language infrastructure and reading the library.
 * The API provides access to the underlying EMF infrastructure as well to enable
 * model processing. {@link SysMLAccess#getAPIAccess() } can be used to construct an
 * interface for reading and writing models from/to the standard SysML REST API.
 */
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
	private SysMLAPIAccess apiAccess;
	
	@Inject
	public SysMLAccess() {
		super();
	}
	
	protected SysMLAccess(ResourceDescriptionsData resourceDescriptionData) {
		super(resourceDescriptionData);
	}
	
	/**
	 * Provides access for the library index.
	 * 
	 * @return Library index provider
	 */
	public ILibraryIndexProvider getLibraryIndexCache() {
		return libraryIndexCache;
	}
	
	/**
	 * Initializes the language infrastructure for loading .kermlx and .sysmlx models.
	 */
	public void setupXMISupport() {
		addExtension(KERMLX_EXTENSION);
		addExtension(SYSMLX_EXTENSION);
		KerMLxStandaloneSetup.doSetup();
		SysMLxStandaloneSetup.doSetup();
	}
	
	/**
	 * Loads the library from the specified directory.
	 * Use {@link SysMLAccess#setModelLibraryDirectory(String)} to set the directory path.
	 * 
	 * @throws IOException
	 */
	public void loadLibrary() throws IOException {
		doLoadLibrary(getModelLibraryDirectory());
	}
	
	protected void doLoadLibrary(String path) throws IOException {
		if (path != null) {
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
	
	/**
	 * Returns the root element from a resource
	 * 
	 * @param resource		resource with the root element
	 * @return				root element
	 */
	public Element getRootElement(Resource resource) {
		if (resource instanceof XtextResource xtextResource) {
			final IParseResult result = xtextResource.getParseResult();
			return result == null? null: (Element)result.getRootASTElement();
		} else {
			EList<EObject> contents = resource.getContents();
			return contents.isEmpty()? null: (Element)contents.get(0);
		}
	}
	
	/**
	 * Resolves the given name from the loaded resources.
	 * 
	 * @param name		name to resolve
	 * @return			resolved {@link Element} or null if name cannot be resolved
	 */
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
	
	/**
	 * Loads, parses and validates a model file or a directory (recursively) with a set of model files.
	 * 
	 * @param file			file to parse or directory containing model files
	 * @param isInput		whether the file(s) read are to be considered input resources
	 * @return				result of the parsing/validation
	 * @throws IOException
	 */
	public List<SysMLParseResult> parseFiles(File file, boolean isInput) throws IOException {
		List<Resource> resources = this.readAll(file, isInput);
		return  validateResources(resources);
	}
	
	
	/**
	 * Loads, parses and validates a model file or a directory (recursively) with a set of model files.
	 * 
	 * @param file			file to parse or directory containing model files
	 * @param isInput		whether the file(s) read are to be considered input resources
	 * @return				result of the parsing/validation
	 * @throws IOException
	 */
	public List<SysMLParseResult> parseFile(String file, boolean isInput) throws IOException {
		return parseFiles(new File(file), isInput);
	}
	
	
	/**
	 * Validates the given resources
	 * 
	 * @param resources		resources to validate
	 * @return				list of results
	 * @throws OperationCanceledError
	 */
	public List<SysMLParseResult> validateResources(List<Resource> resources) throws OperationCanceledError {
		final List<SysMLParseResult> results = new LinkedList<>();
		for (var resource: resources) {
			List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			results.add(new SysMLParseResult(getRootElement(resource), issues));
		}
		return results;
	}
	
	/**
	 * Parses a string that contains a sysml or kerml model.
	 * The {@code resourceURI} identifies the loaded model in the {@code SysMLAccess}.
	 * It is mandatory to use either .sysml or .kerml extension {@code resourceURI}
	 * depending on the input to be parsed.
	 * 
	 * @param resourceURI		identifier of the parsed model in the {@code SysMLAccess}
	 * @param input				string to be parsed
	 * @return					results of the parsing
	 * @throws IOException
	 */
	public SysMLParseResult parse(String resourceURI, String input) throws IOException {
		assert resourceURI.endsWith(".kerml") || resourceURI.endsWith(".sysml"): "resourceName must use .kerml or .sysml file extension";
		
		Resource resource = this.createResource(resourceURI);
		addInputResource(resource);
		if (resource instanceof XtextResource xtextResource) {
			xtextResource.reparse(input);
			addResourceToIndex(xtextResource);
		} else {
			//TODO: add warning when resource is not meant to be parsed
		}
		
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		return new SysMLParseResult(getRootElement(resource), issues);
	}
	
	/**
	 * Changes the model library directory
	 * 
	 * @param directory		directory with the standard sysml library
	 */
	public void setModelLibraryDirectory(String directory) {
		if (!directory.endsWith("/")) {
			directory += "/";
		}
		SysMLLibraryUtil.setModelLibraryDirectory(directory);
	}
	
	/**
	 * @return path to set sysml standard library
	 */
	public String getModelLibraryDirectory() {
		return SysMLLibraryUtil.getModelLibraryPath();
	}
	
	/**
	 * Returns the {@link SysMLAPIAccess}: a utility for accessing the SysML REST API. With basic read and write functionality.
	 * The instance is lazily created and stored on the first call further calls only modify the {@code apiBasePath}.
	 * 
	 * @param apiBasePath		API base path for the repository
	 * @return					utility for writing/loading the repository
	 */
	public SysMLAPIAccess getOrCreateAPIAccess(String apiBasePath) {
		if (apiAccess == null) {
			this.apiAccess = new SysMLAPIAccess(apiBasePath, this);
		} else {
			this.apiAccess.setApibasePath(apiBasePath);
		}
		return this.apiAccess;
	}
	
	/**
	 * Returns the stored {@link SysMLAPIAccess}. Use {@link SysMLAccess#getOrCreateAPIAccess(String)}
	 * for initialization. 
	 * 
	 * @return		stored {@code SysMLAPIAccess} or null if it isn't initialized
	 */
	public SysMLAPIAccess getAPIAccess() {
		return this.apiAccess;
	}
	
	/**
	 * Returns a builder for the {@link SysMLAccess}. With more initialization options.
	 * 
	 * @return builder
	 */
	public static Builder builder() {
		return new Builder();
	}
	
	/**
	 * Creates a {@link SysMLAccess} instance and initializes the language infrastructure as well as the API Access.
	 * 
	 * @param modelLibraryDirectory		directory with the standard sysml library
	 * @param apiBasePath				API base path for the repository
	 * @return configured SysMLAccess instance
	 */
	public static SysMLAccess createFullyFeaturedWithAPIAccess(String modelLibraryDirectory, String apiBasePath) {
		return builder()
				.libraryPath(modelLibraryDirectory)
				.apiBasePath(apiBasePath)
				.xmiSupport()
				.verbose()
				.build();
	}
	
	/**
	 * Creates a {@link SysMLAccess} instance and initializes the language infrastructure.
	 * 
	 * @param modelLibraryDirectory		directory with the standard sysml library
	 * @return configured SysMLAccess instance
	 */
	public static SysMLAccess createFullyFeatured(String modelLibraryDirectory) {
		return builder()
				.libraryPath(modelLibraryDirectory)
				.xmiSupport()
				.verbose()
				.build();
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
		private String apiBasePath;
		
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
		
		/**
		 * Sets the api base path. This option also turns on {@link Builder#xmiSupport()}
		 * as it is needed for api usage.
		 * 
		 * @param apiBasePath
		 * @return the builder
		 */
		public Builder apiBasePath(String apiBasePath) {
			this.apiBasePath = apiBasePath;
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
			//to create an instance
			access.getOrCreateAPIAccess(apiBasePath);
			
			if (withXMISupport || apiBasePath != null) {
				access.setupXMISupport();
			}
			
			return access;
		}
	}
}
