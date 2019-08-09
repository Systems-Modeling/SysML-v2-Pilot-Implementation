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
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
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

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class SysMLInteractive extends AlfUtil {
	
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
		EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, SysMLPackage.eINSTANCE);
	}
	
	public void loadLibrary(String path) {
		if (path != null) {
			SysMLLibraryUtil.setModelLibraryDirectory(path);
			this.readAll(path, false);
		}
	}
	
	public int next() {
		this.resource = (XtextResource)this.createResource(this.counter + ALF_EXTENSION);
		this.addInputResource(this.resource);
		return this.counter++;
	}
	
	public XtextResource getResource() {
		return this.resource;
	}
	
	public Element getRootElement() {
		final IParseResult result = this.getResource().getParseResult();
		return result == null? null: (Element)result.getRootASTElement();
	}
	
	public void parse(String input) throws IOException {
		this.getResource().reparse(input);
	}
	
	public List<Issue> validate() {
		return validator.validate(this.getResource(), CheckMode.ALL, CancelIndicator.NullImpl);
	}
	
	public SysMLInteractiveResult eval(String input) {
		this.next();
		try {
			this.parse(input);
			return new SysMLInteractiveResult(this.getRootElement(), this.validate());
		} catch (Exception e) {
			return new SysMLInteractiveResult(e);
		}
	}
	
	public Element resolve(String name) {
		if (this.resource != null) {
			IScope scope = scopeProvider.getScope(
					this.resource, SysMLPackage.eINSTANCE.getPackage_Member(), 
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
			return element == null? "ERROR:Couldn't resolve reference to Element '" + name + "'":
					new SysMLInteractiveResult(this.resolve(name), null).formatRootElement();
		} catch (Exception e) {
			return new SysMLInteractiveResult(e).formatException();
		}
	}
	
	protected static ApiElementProcessingFacade getProcessingFacade(String modelName) throws ApiException {
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(modelName);	
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
				return "ERROR:Couldn't resolve reference to Element '" + name + "'";
			} else {
				String modelName = element.getName() + " " + new Date();
				ApiElementProcessingFacade processingFacade = getProcessingFacade(modelName);
				processingFacade.getTraversal().visit(element);
				return modelName + " (" + processingFacade.getModelId() + ")";
			}
		} catch (Exception e) {
			StringWriter writer = new StringWriter();
			e.printStackTrace(new PrintWriter(writer));
			return writer.toString();
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
	        					System.out.println(this.show(tokens[1]));
	        				}
	        			} else if ("%publish".equals(tokens[0])) {
	        				if (tokens.length > 1) {
	        					System.out.println(this.publish(tokens[1]));
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
	
	public static SysMLInteractive getInstance() {
		if (injector == null) {
			injector = new AlfStandaloneSetup().createInjectorAndDoEMFRegistration();
		}
		return injector.getInstance(SysMLInteractive.class);
	}
	
	public static void main(String[] args) {
		System.out.println("SysML v2 Pilot Implementation");
		SysMLInteractive instance = getInstance();
		if (args.length > 0) {
			instance.loadLibrary(args[0]);
		}
		instance.run();	
	}

}
