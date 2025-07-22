package org.omg.sysml.xtext.util;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.repository.APIModel;
import org.omg.sysml.util.repository.EMFModelDelta;
import org.omg.sysml.util.repository.EMFModelRefresher;
import org.omg.sysml.util.repository.EObjectUUIDTracker;
import org.omg.sysml.util.repository.ProjectRepository;
import org.omg.sysml.util.repository.RemoteProject;
import org.omg.sysml.util.repository.Revision;
import org.omg.sysml.util.repository.RemoteProject.RemoteBranch;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.impl.ApiElementProcessingFacade;
import org.omg.sysml.util.traversal.facade.impl.JsonElementProcessingFacade;

public class SysMLAPIAccess {
	
	private SysMLAccess sysmlAccess;
	private String repositoryURL;
	
	private EObjectUUIDTracker tracker = new EObjectUUIDTracker();
	
	/* package */ SysMLAPIAccess(String apiBasePath, SysMLAccess sysmlAccess) {
		this.repositoryURL = apiBasePath;
		this.sysmlAccess = sysmlAccess;
	}
	
	/**
	 * Sets the api base path for the repository
	 * 
	 * @param apiBasePath
	 */
	public void setApibasePath(String apiBasePath) {
		this.repositoryURL = apiBasePath;
	}
	
	/**
	 * Publishes to the repository the model elements rooted in a named element
	 * 
	 * @param element			root element of the model
	 * @param projectName		if null a new project is created named after the {@code element} otherwise it is used as the name of the project to create or update
	 * @param branchName		if null the default branch is used otherwise the model is written to this branch of the project.
	 * @param includeDerievd	include derived properties
	 */
	public void publish(Element element, String projectName, String branchName, boolean includeDerievd) {
		assert repositoryURL != null: "ERROR: API base path is not set";
		if (!sysmlAccess.isInputResource(element.eResource())) {
			throw new IllegalArgumentException("ERROR:'" + element.getQualifiedName() + "' is a library element");
		} else {
			String remoteProjectName = projectName == null? element.getDeclaredName() : projectName;
			
			ApiElementProcessingFacade processingFacade = this.getApiElementProcessingFacade(remoteProjectName, branchName, includeDerievd);
			processingFacade.getTraversal().visit(element);
			processingFacade.commit(element);
		}
	}
	
	/**
	 * Publishes to the repository the resource's contents
	 * 
	 * @param element			resource to be published
	 * @param projectName		if null a new project is created named after the {@code element} otherwise it is used as the name of the project to create or update
	 * @param branchName		if null the default branch is used otherwise the model is written to this branch of the project.
	 * @param includeDerievd	include derived properties
	 */
	public void publish(Resource resource, String projectName, String branchName, boolean includeDerievd) {
		EObject first = resource.getContents().getFirst();
		if (first instanceof Element) {
			publish((Element) first, projectName, branchName, includeDerievd);
		}
	}
	
	/**
	 *  Publishes to the repository the model elements rooted in a named element
	 * 
	 * @param element			qualified name of the root element
	 * @param projectName		if null a new project is created named after the {@code element} otherwise it is used as the name of the project to create or update
	 * @param branchName		if null the default branch is used otherwise the model is written to this branch of the project.
	 * @param includeDerievd	include derived properties
	 */
	public void publish(String elementName, String projectName, String branchName, boolean includeDerievd) {
		Element element = sysmlAccess.resolve(elementName);
		
		if (element == null) {
			throw new NoSuchElementException("ERROR:Couldn't resolve reference to Element '" + elementName);
		}
		
		publish(element, projectName, branchName, includeDerievd);
	}
	
	/**
	 * Downloads previously published models from a project in the repository.
	 * 
	 * @param projectDescriptor		to specify the project and the branch to be used.
	 * 
	 * @return list of loaded resources
	 */
	public List<Resource> load(APIProjectDescriptor projectDescriptor) {
		
		final ProjectRepository repository = new ProjectRepository(repositoryURL);
		
		final RemoteProject project = projectDescriptor.getBranchId().map(repository::getProjectById)
			.or(() -> projectDescriptor.getProjectName().map(repository::getProjectByName))
			.orElseThrow(() -> new NoSuchElementException("ERROR:Project doesn't exist"));
		
		
		final RemoteBranch branch;
		
		if (projectDescriptor.getBranchId().isEmpty() && projectDescriptor.getBranchName().isEmpty()) {
			branch = project.getDefaultBranch();
			if (branch == null) {
				throw new NoSuchElementException("ERROR:Project has no default branch");
			}
		} else {
			branch = projectDescriptor.getBranchId().map(id -> project.getBranch(UUID.fromString(id)))
				.or(() -> projectDescriptor.getBranchName().map(project::getBranch)).orElseThrow(() -> new NoSuchElementException("ERROR:Branch doesn't exist"));
		}
		
		return load(branch);
	}
	
	private List<Resource> load(RemoteBranch branch) {
		assert repositoryURL != null: "ERROR: API base path is not set";
		
		Revision headRevision = branch.getHeadRevision();
		if (!headRevision.isRemote()) {
			throw new NoSuchElementException("ERROR:Branch has no head commit");
		}
		
		if (!tracker.isLibraryTracked()) {
			System.out.println("Caching library UUIDs...");
			tracker.trackLibraryUUIDs(sysmlAccess.getLibraryResources());
		}
		
		tracker.clear();
		List<Resource> inputResources = sysmlAccess.getInputResources();
		//UUIDS coming from resources that were added later in time will shadow previous ones
		tracker.trackLocalUUIDs(inputResources);
		
		System.out.println("Downloading model...");
		APIModel model = headRevision.fetchRemote();
		
		EMFModelRefresher modelRefresher = new EMFModelRefresher(model, tracker);
		EMFModelDelta delta = modelRefresher.create();
		modelRefresher.getIssues().forEach(System.out::println);
		
		return delta.getProjectRootsAsNamespaces().stream().map(rootNs -> {
			Resource resource = sysmlAccess.createResource(rootNs.toString() + SysMLAccess.SYSML_EXTENSION);
			resource.getContents().add(rootNs);
			sysmlAccess.addInputResource(resource);
			sysmlAccess.addResourceToIndex(resource);
			return resource;
		}).toList();
	}
	
	
	protected ApiElementProcessingFacade getApiElementProcessingFacade(String modelName, String branchName, boolean includeDerived) {
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(modelName, branchName, repositoryURL);	
		processingFacade.setIsIncludeDerived(includeDerived);
		processingFacade.setTraversal(new Traversal(processingFacade));
		return processingFacade;
	}
	
	/**
	 * Creates a JSON representation of the abstract syntax tree rooted in the named element.
	 * 
	 * @param root				root Element
	 * @param includeDerived	include derived fields in the output	
	 * @param asDelta			wrap the elements in a delta as additions for direct REST API use
	 * @return					JSON representation of the model
	 */
	public String toJson(Element root, boolean includeDerived, boolean asDelta) {
		JsonElementProcessingFacade jsonFacade = new JsonElementProcessingFacade();
		jsonFacade.setIsIncludeDerived(includeDerived);
		Traversal traversal = new Traversal(jsonFacade);
		jsonFacade.setTraversal(traversal);
		traversal.visit(root);
		return jsonFacade.toJson(asDelta);
	}
	
	/**
	 * Queries projects stored in the repository
	 * 
	 * @return list of stored projects
	 */
	public List<RemoteProject> getProjects() {
		final ProjectRepository repository = new ProjectRepository(repositoryURL);
		return repository.getProjects();
	}
	
	/**
	 * Configuration for targeting a project and project branch in the repository.
	 * 
	 * The {@code projectName} and {@code projectId} are mutually exclusive.
	 * The {@code branchName} and {@code branchId} are mutually exclusive.
	 */
	public static class APIProjectDescriptor {
		private String projectName;
		private String projectId;
		private String branchName;
		private String branchId;
		
		public APIProjectDescriptor projectId(String projectId) {
			assert projectName == null: "ERROR:Project name and id cannot be provided at the same time";
			this.projectId = projectId;
			return this;
		}
		
		public APIProjectDescriptor projectName(String projectName) {
			assert projectId == null: "ERROR:Project name and id cannot be provided at the same time";
			this.projectName = projectName;
			return this;
		}
		
		public APIProjectDescriptor branchName(String branchName) {
			assert branchId == null: "ERROR:Branch name and id cannot be provided at the same time";
			this.branchName = branchName;
			return this;
		}
		
		public APIProjectDescriptor pranchId(String branchId) {
			assert branchName == null: "ERROR:Branch name and id cannot be provided at the same time";
			this.branchId = branchId;
			return this;
		}

		public Optional<String> getProjectName() {
			return Optional.ofNullable(projectName);
		}

		public Optional<String> getProjectId() {
			return Optional.ofNullable(projectId);
		}

		public Optional<String> getBranchName() {
			return Optional.ofNullable(branchName);
		}

		public Optional<String> getBranchId() {
			return Optional.ofNullable(branchId);
		}
	}
}
