/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019, 2020 Model Driven Solutions, Inc.
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
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
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
import org.omg.kerml.xtext.naming.KerMLQualifiedNameConverter;
import org.omg.sysml.ApiException;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.plantuml.SysML2PlantUMLLinkProvider;
import org.omg.sysml.plantuml.SysML2PlantUMLSvc;
import org.omg.sysml.util.SysMLUtil;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.impl.ApiElementProcessingFacade;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class SysMLInteractive extends SysMLUtil {
	
	public static final String KERNEL_LIBRARY_DIRECTORY = "Kernel Library";
	public static final String SYSTEMS_LIBRARY_DIRECTORY = "Systems Library";
	public static final String DOMAIN_LIBRARIES_DIRECTORY = "Domain Libraries";
	public static final String QUANTITIES_AND_UNITS_DIRECTORY = DOMAIN_LIBRARIES_DIRECTORY + "/Quantities and Units";
	public static final String GEOMETRY_DIRECTORY = DOMAIN_LIBRARIES_DIRECTORY + "/Geometry";
	public static final String KERML_EXTENSION = ".kerml";
	public static final String SYSML_EXTENSION = ".sysml";
	
	protected static Injector injector;
	protected static SysMLInteractive instance = null;
		
	protected String apiBasePath = ApiElementProcessingFacade.DEFAULT_BASE_PATH;
	
	protected int counter = 1;
	protected XtextResource resource;
	
	protected Traversal traversal;
	
	@Inject
	private IGlobalScopeProvider scopeProvider;
	
	@Inject
	private KerMLQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private IResourceValidator validator;
	
	@Inject
	private SysMLInteractive() {
		super(new InverseOrderedResourceSetImpl());
	}
	
	public void loadLibrary(String path) {
		if (path != null) {
			if (!path.endsWith("/")) {
				path += "/";
			}
			SysMLLibraryUtil.setModelLibraryDirectory(path);
			this.readAll(path + KERNEL_LIBRARY_DIRECTORY, false, KERML_EXTENSION);
			this.readAll(path + SYSTEMS_LIBRARY_DIRECTORY, false, SYSML_EXTENSION);
			
			// TODO: Replace this hardcoding with a configuration mechanism.
			this.readAll(path + QUANTITIES_AND_UNITS_DIRECTORY + "/Quantities" + SYSML_EXTENSION, false, SYSML_EXTENSION);
			this.readAll(path + QUANTITIES_AND_UNITS_DIRECTORY + "/UnitsAndScales" + SYSML_EXTENSION, false, SYSML_EXTENSION);
			this.readAll(path + QUANTITIES_AND_UNITS_DIRECTORY + "/ISQ" + SYSML_EXTENSION, false, SYSML_EXTENSION);
			this.readAll(path + QUANTITIES_AND_UNITS_DIRECTORY + "/SIPrefixes" + SYSML_EXTENSION, false, SYSML_EXTENSION);
			this.readAll(path + QUANTITIES_AND_UNITS_DIRECTORY + "/SI" + SYSML_EXTENSION, false, SYSML_EXTENSION);
			this.readAll(path + QUANTITIES_AND_UNITS_DIRECTORY + "/USCustomaryUnits" + SYSML_EXTENSION, false, SYSML_EXTENSION);
			this.readAll(path + QUANTITIES_AND_UNITS_DIRECTORY + "/Time" + SYSML_EXTENSION, false, SYSML_EXTENSION);
			
			this.readAll(path + GEOMETRY_DIRECTORY, false, SYSML_EXTENSION);

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

    private class LinkProvider implements SysML2PlantUMLLinkProvider {
        @Override
        public String getLinkString(EObject eObj) {
            // TODO: Delegate it to Jupyter environment
            return null;
        }

        @Override
        public String getText(EObject eObj) {
            ICompositeNode node = NodeModelUtils.getNode(eObj);
            if (node == null) return null;
            return node.getText();
        }
    }

    private SysML2PlantUMLSvc sysml2PlantUMLSvc;
    private SysML2PlantUMLSvc getSysML2PlantUMLSvc() {
        if (sysml2PlantUMLSvc == null) {
            sysml2PlantUMLSvc = new SysML2PlantUMLSvc(new LinkProvider());
        }
        return sysml2PlantUMLSvc;
    }

	public void setGraphVizPath(String path) {
		getSysML2PlantUMLSvc().setGraphVizPath(path);
	}

	public VizResult viz(String name, List<String> views) {
		this.counter++;
		try {
			Element element = this.resolve(name);
            if (element != null) {
                SysML2PlantUMLSvc svc = getSysML2PlantUMLSvc();
                if (!views.isEmpty()) {
                    String view = views.get(0);
                    svc.setView(view);
                }
                return new VizResult(svc.getSVG(element));
            } else {
                return VizResult.unresolvedResult(name);
            }
		} catch (Exception e) {
			return new VizResult(e);
		}
	}


	
	protected ApiElementProcessingFacade getProcessingFacade(String modelName) throws ApiException {
		System.out.println("API base path: " + this.apiBasePath);
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(modelName, this.apiBasePath);	
		processingFacade.setTraversal(new Traversal(processingFacade));
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
				processingFacade.commit();
				System.out.println();
				return "Saved to Project " + modelName + " (" + processingFacade.getProjectId() + ")\n";
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
	        			int i = input.indexOf(' ');
	        			String command = i == -1? input: input.substring(0, i);
	        			String argument = i == -1? "": input.substring(i + 1);
	        			
	        			if ("%exit".equals(command)) {
	        				break;
	        			} else if ("%show".equals(command)) {
	        				if (!"".equals(argument)) {
	        					System.out.print(this.show(argument));
	        				}
	        			} else if ("%publish".equals(command)) {
	        				if (!"".equals(argument)) {
	        					System.out.print(this.publish(argument));
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
			KerMLStandaloneSetup.doSetup();
			injector = new SysMLStandaloneSetup().createInjectorAndDoEMFRegistration();
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
