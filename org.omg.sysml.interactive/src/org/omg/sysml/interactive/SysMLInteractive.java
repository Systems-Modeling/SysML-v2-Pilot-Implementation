/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2022 Model Driven Solutions, Inc.
 * Copyright (c) 2020 Mgnite Inc.
 * Copyright (c) 2021 Twingineer LLC
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
 *  Ed Seidewitz, MDS
 *  Hisashi Miyashita, Mgnite
 *  Zoltan Ujhelyi, MDS
 *  Ivan Gomes, Twingineer
 * 
 *****************************************************************************/
package org.omg.sysml.interactive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.EObjectDescription;
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
import org.omg.sysml.execution.expressions.ExpressionEvaluator;
import org.omg.sysml.interactive.profiler.ProfilingKerMLStandaloneSetup;
import org.omg.sysml.interactive.profiler.ProfilingSysMLStandaloneSetup;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.plantuml.SysML2PlantUMLLinkProvider;
import org.omg.sysml.plantuml.SysML2PlantUMLSvc;
import org.omg.sysml.util.SysMLUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.impl.ApiElementProcessingFacade;
import org.omg.sysml.util.traversal.facade.impl.JsonElementProcessingFacade;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

import com.google.common.base.Predicates;
import com.google.common.base.Strings;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class SysMLInteractive extends SysMLUtil {
	
	public static final String KERNEL_LIBRARIES_DIRECTORY = "Kernel Libraries";
	public static final String SYSTEMS_LIBRARY_DIRECTORY = "Systems Library";
	public static final String DOMAIN_LIBRARIES_DIRECTORY = "Domain Libraries";

	public static final String KERML_EXTENSION = ".kerml";
	public static final String SYSML_EXTENSION = ".sysml";
	
	protected static Injector injector;
	protected static SysMLInteractive instance = null;
		
	protected String apiBasePath = ApiElementProcessingFacade.DEFAULT_BASE_PATH;
	
	protected int counter = 1;
	protected XtextResource resource;
	
	protected Traversal traversal;
	
    protected SysML2PlantUMLSvc sysml2PlantUMLSvc;
    
    private Resource dummyResource;

    @Inject
	private IGlobalScopeProvider scopeProvider;
	
	@Inject
	private KerMLQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private IResourceValidator validator;
	
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	
	@Inject
	private SysMLInteractive() {
		super(new StrictShadowingResourceDescriptionData());
	}
	
	public void loadLibrary(String path) {
		if (path != null) {
			if (!path.endsWith("/")) {
				path += "/";
			}
			SysMLLibraryUtil.setModelLibraryDirectory(path);
			this.readAll(path + KERNEL_LIBRARIES_DIRECTORY, false, KERML_EXTENSION);
			this.readAll(path + SYSTEMS_LIBRARY_DIRECTORY, false, SYSML_EXTENSION);
			this.readAll(path + DOMAIN_LIBRARIES_DIRECTORY, false, SYSML_EXTENSION);
	//		this.readAll("C:\\Users\\GatiL\\Documents\\git\\SysML-v2-Pilot-Implementation\\org.omg.kerml.xpect.tests\\src\\DependencyOuterPackage.kerml", false, ".kerml");
		}
	}
	
	public void setApiBasePath(String apiBasePath) {
		this.apiBasePath = apiBasePath;
	}
	
	public int next() {
		this.resource = (XtextResource)this.createResource(counter + SYSML_EXTENSION);
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
			resource.reparse(input);
		}
	}
	
	public List<Issue> validate() {
		XtextResource resource = this.getResource();
		return resource == null? Collections.emptyList():
			validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
	}
	
	private Resource getDummyResource() {
		if (this.dummyResource == null) {
			this.dummyResource = this.createResource("dummy" + SYSML_EXTENSION);
			this.dummyResource.getContents().add(SysMLFactory.eINSTANCE.createNamespace());
		}
		return this.dummyResource;
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
	
	public SysMLInteractiveResult process(String input) {
		return process(input, true);
	}
	
	public SysMLInteractiveResult process(String input, boolean isAddResource) {
		this.next();
		try {
			this.parse(input);
			List<Issue> issues = this.validate();
			Element rootElement = this.getRootElement();
			SysMLInteractiveResult result = new SysMLInteractiveResult(rootElement, issues);
			if (result.hasErrors()) {
				this.removeResource();
			} else if (isAddResource) {
				this.addResourceToIndex(resource);
			}
			return result;
		} catch (Exception e) {
			this.removeResource();
			return new SysMLInteractiveResult(e);
		}
	}
	
	public String help(String command, List<String> help) {
		this.counter++;
		if (Strings.isNullOrEmpty(command)) {
			return help.isEmpty()? SysMLInteractiveHelp.getGeneralHelp(): SysMLInteractiveHelp.getHelpHelp();
		}
		if (!command.startsWith("%")) {
			command = "%" + command;
		}
		String helpString = SysMLInteractiveHelp.getHelpString(command);
		return helpString == null? SysMLInteractiveHelp.getGeneralHelp(): helpString;
	}
	
	public String help(String command) {
		return "-h".equals(command)? 
				help(null, Collections.singletonList("true")):
				help(command, Collections.emptyList());
	}
	
	public String eval(String input, String targetName, List<String> help) {
		if (Strings.isNullOrEmpty(input)) {
			this.counter++;
			return help.isEmpty()? "": SysMLInteractiveHelp.getEvalHelp();
		}
		if (input == null || input.isEmpty()) {
			this.counter++;
			return "";
		}
		Element target = null;
		if (Strings.isNullOrEmpty(targetName)) {
			input = "calc{\n" + input + "}";
		} else {
			target = this.resolve(targetName);
			if (target == null) {
				this.counter++;
				return "ERROR:Couldn't resolve reference to Element '" + targetName + "'\n";
			}
			input = "calc{import " + targetName + "::*;\n" + input + "}";
		}
		SysMLInteractiveResult result = this.process(input, false);
		if (result.hasErrors()) {
			return result.toString();
		} else {
			Type calc = (Type)((Namespace)result.getRootElement()).getOwnedMember().get(0);
			Expression expr = (Expression)TypeUtil.getFeatureByMembershipIn(calc, ResultExpressionMembership.class);
			List<Element> elements = ExpressionEvaluator.INSTANCE.evaluate(expr, target);
			this.removeResource();
			return elements == null? "": 
				elements.stream().map(SysMLInteractiveUtil::formatElement).collect(Collectors.joining());
		}
	}
	
	public String eval(String input, String targetName) {
		return "-h".equals(input)? 
				eval(null, null, Collections.singletonList("true")):
				eval(input, targetName, Collections.emptyList());
	}
	
	public String listLibrary() {
		this.counter++;
		try {
			List<Membership> globalMemberships = 
					this.getLibraryResources().stream().
					flatMap(r->r.getContents().stream()).
					filter(Namespace.class::isInstance).
					flatMap(n->((Namespace)n).visibleMemberships(new BasicEList<>(), false, false).stream()).
					collect(Collectors.toList());
			return SysMLInteractiveUtil.formatMembershipList(globalMemberships);
		} catch (Exception e) {
			return SysMLInteractiveUtil.formatException(e);
		}
	}
	
	public String listQuery(String query) {
		if (!query.endsWith(";")) {
			query += ";";
		}
		SysMLInteractiveResult result = this.process("import " + query, false);
		if (result.hasErrors()) {
			return result.toString();
		} else {
			List<Membership> memberships = ((Namespace)result.getRootElement()).visibleMemberships(new BasicEList<>(), false, false);
			this.removeResource();
			return SysMLInteractiveUtil.formatMembershipList(memberships);
		}
	}
	
	public String list(String query, List<String> help) {
		return Strings.isNullOrEmpty(query)? 
					!help.isEmpty()? SysMLInteractiveHelp.getListHelp():
					listLibrary(): 
				listQuery(query);
	}
	
	protected String list(String query) {
		return "-h".equals(query)? 
				list(null, Collections.singletonList("true")):
				list(query, Collections.emptyList());
	}
	
	public Object show(String name, List<String> styles, List<String> help) {
		this.counter++;
		if (Strings.isNullOrEmpty(name)) {
			return help.isEmpty()? "": SysMLInteractiveHelp.getShowHelp();
		}
		try {
			Element element = this.resolve(name);
			if (element == null) {
				return "ERROR:Couldn't resolve reference to Element '" + name + "'\n";
			}
			else if (matchStyle(styles, "JSON")) {
				JsonElementProcessingFacade processingFacade = this.getJsonElementProcessingFacade();
				processingFacade.getTraversal().visit(element);
				return processingFacade.toJsonTree();
			}
			else if (styles.isEmpty() || matchStyle(styles, "TREE")){
				return SysMLInteractiveUtil.formatTree(element);
			} else {
				return "ERROR:Invalid style. Possible styles: TREE and JSON";
			}
		} catch (Exception e) {
			return SysMLInteractiveUtil.formatException(e);
		}
	}

	public Object export(String name, List<String> help) {
		this.counter++;
		if (Strings.isNullOrEmpty(name)) {
			return help.isEmpty()? "": SysMLInteractiveHelp.getExportHelp();
		}
		try {
			Element element = this.resolve(name);
			if (element == null) {
				return "ERROR:Couldn't resolve reference to Element '" + name + "'\n";
			}
			JsonElementProcessingFacade processingFacade = this.getJsonElementProcessingFacade();
			processingFacade.getTraversal().visit(element);
			return processingFacade.toJsonTree();
		} catch (Exception e) {
			return SysMLInteractiveUtil.formatException(e);
		}
	}
	
	public String show(String name) {
		if (name.startsWith("--style=")) {
			int i = name.indexOf(" ");
			if (i > 0) {
				String style = name.substring("--style=".length(), i).toUpperCase();
				name = name.substring(i).trim();
				return show(name, Collections.singletonList(style), Collections.emptyList()).toString() + "\n";
			}
		}
		return (String) ("-h".equals(name)? 
				show(null, Collections.emptyList(), Collections.singletonList("true")):
				show(name, Collections.emptyList(), Collections.emptyList()));
	}
	
	public String publish(String name, List<String> help) {
		this.counter++;
		if (Strings.isNullOrEmpty(name)) {
			return help.isEmpty()? "": SysMLInteractiveHelp.getPublishHelp();
		}
		try {
			Element element = this.resolve(name);
			if (element == null) {
				return "ERROR:Couldn't resolve reference to Element '" + name + "'\n";
			} else if (!this.isInputResource(element.eResource())) {
				return "ERROR:'" + name + "' is a library element\n";
			} else {
				String modelName = element.getDeclaredName() + " " + new Date();
				ApiElementProcessingFacade processingFacade = this.getApiElementProcessingFacade(modelName);
				processingFacade.getTraversal().visit(element);
				processingFacade.commit();
				System.out.println();
				return "Saved to Project " + modelName + " (" + processingFacade.getProjectId() + ")\n";
			}
		} catch (Exception e) {
			return SysMLInteractiveUtil.formatException(e);
		}
	}
	
	protected String publish(String name) {
		return "-h".equals(name)? 
				publish(null, Collections.singletonList("true")):
				publish(name, Collections.emptyList());
	}
	
	protected ApiElementProcessingFacade getApiElementProcessingFacade(String modelName) {
		System.out.println("API base path: " + this.apiBasePath);
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(modelName, this.apiBasePath);	
		processingFacade.setIsIncludeDerived(true);
		processingFacade.setTraversal(new Traversal(processingFacade));
		return processingFacade;
	}
	
	protected JsonElementProcessingFacade getJsonElementProcessingFacade() {
		JsonElementProcessingFacade processingFacade = new JsonElementProcessingFacade();	
		processingFacade.setIsIncludeDerived(true);
		processingFacade.setTraversal(new Traversal(processingFacade));
		return processingFacade;
	}
	
	public VizResult view(String name, List<String> renders, List<String> styles, List<String> help) {
		this.counter++;
        if (!help.isEmpty()
                || (name == null && renders.isEmpty() && styles.isEmpty())) {
                return VizResult.textResult(SysMLInteractiveHelp.getViewHelp());
        }
        if (name == null) {
        	return VizResult.emptyResult();
        }
		Element element = this.resolve(name);
		if (element == null) {
			return VizResult.unresolvedResult(name);
		} else if (!(element instanceof ViewUsage)) {
			return VizResult.vizExceptionResult("ERROR:'" + name + "' is not a view\n");
		}
    	ViewUsage viewSpec = (ViewUsage)element;
    	RenderingUsage rendering = viewSpec.getViewRendering();
    	if (rendering != null) {
    		String renderingName = rendering.getName();
    		if ("asTreeDiagram".equals(renderingName)) {
    			renders.add(0, "TREE");
    		} else if ("asInterconnectionDiagram".equals(renderingName)) {
    			renders.add(0, "INTERCONNECTION");
    		} else {
    			return VizResult.vizExceptionResult("ERROR:Rendering " + renderingName + " is not a supported\n");
    		}
    	}
    	List<EObject> elements = new ArrayList<>();
    	elements.addAll(viewSpec.getExposedElement());
    	return viz(elements, renders, styles);
	}
	
	protected VizResult view(String name) {
		return "-h".equals(name)? 
				this.view(null, new ArrayList<String>(), Collections.emptyList(), Collections.singletonList("true")):
				this.view(name, new ArrayList<String>(), Collections.singletonList("PUMLCODE"), Collections.emptyList());
	}
	
	public VizResult viz(List<String> names, List<String> views, List<String> styles, List<String> help) {
		this.counter++;
        if (!help.isEmpty()
            || (names.isEmpty() && views.isEmpty() && styles.isEmpty())) {
            return VizResult.textResult(SysMLInteractiveHelp.getVizHelp());
        }
        List<EObject> elements = new ArrayList<EObject>(names.size());
        for (String name: names) {
            Element element = this.resolve(name);
            if (element != null) {
                elements.add(element);
            } else {
                return VizResult.unresolvedResult(name);
            }
        }
        return viz(elements, views, styles);
	}
	
	protected VizResult viz(List<EObject> elements, List<String> views, List<String> styles) {
        if (elements.isEmpty()) {
        	return VizResult.emptyResult();
        } else {
        	try {
        		SysML2PlantUMLSvc svc = getSysML2PlantUMLSvc();
        		if (!views.isEmpty()) {
        			String view = views.get(0);
        			svc.setView(view);
        		}
        		List<String> fStyles = filterStyle(styles, "PUMLCODE");
        		if (fStyles.size() != styles.size()) {
        			// --style PUMLCODE option
        			return VizResult.plantumlResult(svc.getPlantUMLCode(elements, fStyles));
        		} else {
        			return VizResult.svgResult(svc.getSVG(elements, fStyles));
        		}
        	} catch (Exception e) {
        		return VizResult.exceptionResult(e);
        	}
        }
	}
	
	protected VizResult viz(String name) {
		return "-h".equals(name)? 
				this.viz(Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.singletonList("true")):
				this.viz(Collections.singletonList(name), Collections.emptyList(), Collections.singletonList("PUMLCODE"), Collections.emptyList());
	}
	
    private static List<String> filterStyle(List<String> styles, String name) {
        return styles.stream()
            .filter(x -> !x.toUpperCase().equals(name))
            .collect(Collectors.toList());
    }
	
    private static boolean matchStyle(List<String> styles, String name) {
        return styles.stream()
            .anyMatch(x -> x.toUpperCase().equals(name));
    }

    private class LinkProvider implements SysML2PlantUMLLinkProvider {
        @Override
        public String getLinkString(EObject eObj) {
            if (!(eObj instanceof Element)) return null;
            Element e = (Element) eObj;
            String id = e.getElementId();
            if (id == null) return null;
            return "psysml:" + id;
        }

        @Override
        public String getText(EObject eObj) {
            ICompositeNode node = NodeModelUtils.getNode(eObj);
            if (node == null) return null;
            return node.getText();
        }
    }

    protected SysML2PlantUMLSvc getSysML2PlantUMLSvc() {
        if (sysml2PlantUMLSvc == null) {
            sysml2PlantUMLSvc = new SysML2PlantUMLSvc(new LinkProvider());
        }
        return sysml2PlantUMLSvc;
    }

	public void setGraphVizPath(String path) {
		getSysML2PlantUMLSvc().setGraphVizPath(path);
	}
	
	public void run(String input) {
		if (input != null && !input.isEmpty()) {
			System.out.print(this.process(input));
		}
	}
	
	public void run() {
        try (Scanner in = new Scanner(System.in)) {
	        do {
	        	try {
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
							String argument = i == -1? "": input.substring(i + 1).trim();
							
							if ("%exit".equals(command)) {
								break;
							} else if ("%help".equals(command)) {
								System.out.print(this.help(argument));
							} else if ("%list".equals(command)) {
								System.out.print(this.list(argument));
							} else if ("%show".equals(command)) {
								if (!"".equals(argument)) {
									System.out.print(this.show(argument));
								}
							} else if ("%publish".equals(command)) {
								if (!"".equals(argument)) {
									System.out.print(this.publish(argument));
								}
							} else if ("%viz".equals(command)) {
								if (!"".equals(argument)) {
									System.out.print(this.viz(argument));
								}
							} else if ("%view".equals(command)) {
								if (!"".equals(argument)) {
									System.out.print(this.view(argument));
								}
							} else if ("%eval".equals(command)) {
								if (!"".equals(argument)) {
									String name = null;
									if (argument.startsWith("--target ") || argument.startsWith("--target=")) {
										argument = argument.substring(9);
					        			i = argument.indexOf(' ');
					        			name = i == -1? argument: argument.substring(0, i);
					        			argument = i == -1? null: argument.substring(i + 1).trim();
									}
									System.out.print(eval(argument, name));
								}
							} else {
								System.out.println("ERROR:Invalid command '" + input + "'");
							}
						}
					} else {
						run(input);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
	        } while(true);
        }
    }
	
	public void indexInheritedLibraryTypes() {
		var index = (StrictShadowingResourceDescriptionData) getIndex();
		
		getLibraryResources().forEach(library -> {
			library.getAllContents().forEachRemaining(eObject -> {
				if (eObject instanceof Namespace) {
					var namespace = (Namespace) eObject;
					for (var membership: namespace.getMembership()) {
						if (membership.getMemberElement() instanceof AttributeUsage) {
							var attrusage = (AttributeUsage) membership.getMemberElement();
							if (membership.getMemberName() != null && membership.getMemberName().equals("time"))
								System.out.println(namespace.getQualifiedName() + "." + membership.getMemberName() + " " + attrusage.getQualifiedName());
							var nsfqn = qualifiedNameProvider.getFullyQualifiedName(namespace);
							var ufqn = qualifiedNameProvider.getFullyQualifiedName(attrusage);
							if (nsfqn != null && ufqn != null && !nsfqn.isEmpty() && !ufqn.isEmpty()) {
								var segments = new LinkedList<>(nsfqn.getSegments());
								segments.add(ufqn.getLastSegment());
								var newQualifiedName = QualifiedName.create(segments);
								index.addDescription(attrusage, SysMLPackage.eINSTANCE.getAttributeUsage(), EObjectDescription.create(newQualifiedName, attrusage));
							}
		
							
						}
					}
				}
				
				
				if (eObject instanceof Type) {
					var type = (Type) eObject;
					var qualifiedNameOfType = qualifiedNameProvider.getFullyQualifiedName(type);
					if (qualifiedNameOfType  != null && !qualifiedNameOfType.isEmpty()) {
						var inheritedFeatures = type.getInheritedFeature();
						inheritedFeatures.forEach(it -> {
							var qualifiedNameOfInherited = qualifiedNameProvider.getFullyQualifiedName(it);
							if (qualifiedNameOfInherited!= null && !qualifiedNameOfInherited.isEmpty()) {
								var segment = new LinkedList<>(qualifiedNameOfType.getSegments());
								segment.add(qualifiedNameOfInherited.getLastSegment());
								var newQualifiedName = QualifiedName.create(segment);
								index.addDescription(it, SysMLPackage.eINSTANCE.getFeature(), EObjectDescription.create(newQualifiedName, it));
							}
						});
					}
				}
			});
		});
	}
	
	public static SysMLInteractive createInstance() {
		if (injector == null) {
			// Note: An EPackage must be registered to be sure the correctly configured
			// CompositeEValidator is used.
			EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, SysMLPackage.eINSTANCE);
			ProfilingKerMLStandaloneSetup.doSetup();
			injector = new ProfilingSysMLStandaloneSetup().createInjectorAndDoEMFRegistration();
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
