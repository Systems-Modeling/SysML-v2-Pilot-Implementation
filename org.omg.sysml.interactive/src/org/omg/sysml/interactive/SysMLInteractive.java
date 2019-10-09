/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.interactive;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.ApiException;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.naming.AlfQualifiedNameConverter;
import org.omg.sysml.util.AlfUtil;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.impl.ApiElementProcessingFacade;
import org.omg.sysml.util.traversal.impl.TraversalImpl;
import org.omg.sysml.util.traversal.visitor.impl.ElementVisitorFactoryImpl;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class SysMLInteractive extends AlfUtil {
	
	public static final String KERNEL_LIBRARY_DIRECTORY = "Kernel Library";
	public static final String SYSTEMS_LIBRARY_DIRECTORY = "Systems Library";
	public static final String DOMAIN_LIBRARIES_DIRECTORY = "Domain Libraries";
	public static final String KERML_EXTENSION = ".kerml";
	public static final String SYSML_EXTENSION = ".sysml";
	
	protected static SysMLInteractive instance = null;
	
	protected String apiBasePath = ApiElementProcessingFacade.DEFAULT_BASE_PATH;
	
	protected static Injector injector;
	
	protected int counter = 1;
	protected XtextResource resource;
	
	protected Traversal traversal;
	
	@Inject
	private IGlobalScopeProvider scopeProvider;
	
	@Inject
	private AlfQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private IResourceValidator validator;
	
	@Inject
	private SysMLInteractive() {
		super(new InverseOrderedResourceSetImpl());
		KerMLStandaloneSetup.doSetup();
		SysMLStandaloneSetup.doSetup();
	}
	
	public void loadLibrary(String path) {
		if (path != null) {
			if (!path.endsWith("/")) {
				path += "/";
			}
			SysMLLibraryUtil.setModelLibraryDirectory(path);
			this.readAll(path + KERNEL_LIBRARY_DIRECTORY, false, KERML_EXTENSION);
			this.readAll(path + SYSTEMS_LIBRARY_DIRECTORY, false, SYSML_EXTENSION);
			this.readAll(path + DOMAIN_LIBRARIES_DIRECTORY, false, SYSML_EXTENSION);
		}
	}
	
	public void setApiBasePath(String apiBasePath) {
		this.apiBasePath = apiBasePath;
	}
	
	public int next() {
		this.resource = (XtextResource)this.createResource(this.counter + SYSML_EXTENSION);
		this.addInputResource(this.resource);
		return this.counter++;
	}
	
	public XtextResource getResource() {
		return this.resource;
	}
	
	public void removeResource() {
		if (this.resource != null) {
			try {
				this.resource.delete(null);
				this.resource = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Element getRootElement() {
		XtextResource resource = this.getResource();
		if (resource == null) {
			return null;
		} else {
			final IParseResult result = resource.getParseResult();
			return result == null? null: (Element)result.getRootASTElement();
		}
	}
	
	public void parse(String input) throws IOException {
		XtextResource resource = this.getResource();
		if (resource != null) {
			// Surround input with braces so that it is parsed as an anonymous package.
			resource.reparse("{\n" + input + "}");
		}
	}
	
	public List<Issue> validate() {
		XtextResource resource = this.getResource();
		if (resource == null) {
			return Collections.emptyList();
		} else {
			List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			for (Issue issue: issues) {
				// Adjust line numbers to account for the initial brace added for parsing.
				((Issue.IssueImpl)issue).setLineNumber(issue.getLineNumber() - 1);
			}
			return issues;
		}
	}
	
	public SysMLInteractiveResult eval(String input) {
		this.next();
		try {
			this.parse(input);
			List<Issue> issues = this.validate();
			Element rootElement = this.getRootElement();
			if (!issues.isEmpty()) {
				this.removeResource();
			}
			return new SysMLInteractiveResult(rootElement, issues);
		} catch (Exception e) {
			this.removeResource();
			return new SysMLInteractiveResult(e);
		}
	}
	
	public Element resolve(String name) {
		List<Resource> resources = this.resourceSet.getResources();
		if (!resources.isEmpty()) {
			IScope scope = scopeProvider.getScope(
					resources.get(resources.size() - 1), 
					SysMLPackage.eINSTANCE.getPackage_Member(), 
					new Predicate<IEObjectDescription>() {
	
						@Override
						public boolean apply(IEObjectDescription description) {
							EObject object = description.getEObjectOrProxy();
							return inputResources.contains(object.eResource());
						}
					
					});
			IEObjectDescription description = scope.getSingleElement(
					this.qualifiedNameConverter.toQualifiedName(name));
			if (description != null) {
				EObject object = description.getEObjectOrProxy();
				return object instanceof Element? (Element)object: null;
			}
		}
		return null;
	}
	
	public String show(String name) {
		this.counter++;
		try {
			Element element = this.resolve(name);
			return element == null? "ERROR:Couldn't resolve reference to Element '" + name + "'\n":
					SysMLInteractiveUtil.formatTree(element);
		} catch (Exception e) {
			return SysMLInteractiveUtil.formatException(e);
		}
	}
	
	protected ApiElementProcessingFacade getProcessingFacade(String modelName) throws ApiException {
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(modelName, this.apiBasePath);	
		final ElementVisitorFactoryImpl visitorFactory = new ElementVisitorFactoryImpl(processingFacade);
		Traversal traversal = new TraversalImpl(visitorFactory);
		visitorFactory.setTraversal(traversal);	
		processingFacade.setTraversal(traversal);
		return processingFacade;
	}
	
	public String publish(String name) {
		this.counter++;
		try {
			Element element = this.resolve(name);
			if (element == null) {
				return "ERROR:Couldn't resolve reference to Element '" + name + "'\n";
			} else {
				String modelName = element.getName() + " " + new Date();
				ApiElementProcessingFacade processingFacade = this.getProcessingFacade(modelName);
				processingFacade.getTraversal().visit(element);
				return modelName + " (" + processingFacade.getModelId() + ")\n";
			}
		} catch (Exception e) {
			return SysMLInteractiveUtil.formatException(e);
		}
	}
	
	public void run(String input) {
		if (input != null && !input.isEmpty()) {
			System.out.print(this.eval(input));
		}
	}
	
	public void run() {
        try (Scanner in = new Scanner(System.in)) {
	        do {
	        	System.out.print(this.counter + "> ");
	        	String input = in.nextLine().trim();
	        	if (input.startsWith("%")) {
	        		if ("%".equals(input)) {
	        			input = "";
	        			String line = in.nextLine();
	        			while (!"%".equals(line.trim())) {
	        				if ("%%".equals(line.trim())) {
	        					input = null;
	        					break;
	        				}
	        				input += line + "\n";
	        				line = in.nextLine();
	        			}
		        		run(input);
	        		} else {
	        			String[] tokens = input.split("\\s");
	        			if ("%exit".equals(tokens[0])) {
	        				break;
	        			} else if ("%show".equals(tokens[0])) {
	        				if (tokens.length > 1) {
	        					System.out.print(this.show(tokens[1]));
	        				}
	        			} else if ("%publish".equals(tokens[0])) {
	        				if (tokens.length > 1) {
	        					System.out.print(this.publish(tokens[1]));
	        				}
	        			} else {
	        				System.out.println("ERROR:Invalid command '" + input + "'");
	        			}
	        		}
	        	} else {
	        		run(input);
	        	}
	        } while(true);
        }
    }
	
	public static SysMLInteractive createInstance() {
		if (injector == null) {
			injector = new AlfStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		return injector.getInstance(SysMLInteractive.class);
	}
	
	public static SysMLInteractive getInstance() {
		if (instance == null) {
			instance = createInstance();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println("SysML v2 Pilot Implementation");
		SysMLInteractive instance = getInstance();
		if (args.length > 0) {
			instance.loadLibrary(args[0]);
			if (args.length > 1) {
				instance.setApiBasePath(args[1]);
			}
		}
		instance.run();	
	}

}
