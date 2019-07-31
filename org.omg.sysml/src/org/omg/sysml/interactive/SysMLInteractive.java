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
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class SysMLInteractive {
	
	public static final String SYSML_EXTENSION = ".alf";
	
	protected int counter = 1;
	protected final ResourceSet resourceSet = new ResourceSetImpl();
	protected final XtextResource resource;
	
	@Inject
	private IResourceValidator validator;
	
	@Inject
	private SysMLInteractive() {
		EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, SysMLPackage.eINSTANCE);
		this.resource = (XtextResource)this.resourceSet.createResource(URI.createFileURI("shell" + SYSML_EXTENSION));
	}
	
	public Element getRootElement() {
		final IParseResult result = this.resource.getParseResult();
		return result == null? null: (Element)result.getRootASTElement();
	}
	
	public void parse(String input) throws IOException {
		this.resource.reparse(input);
	}
	
	public List<Issue> validate() {
		return validator.validate(this.resource, CheckMode.ALL, CancelIndicator.NullImpl);
	}
	
	public SysMLInteractiveResult eval(String input) {
		this.counter++;
		try {
			this.resource.reparse(input);
			return new SysMLInteractiveResult(this.getRootElement(), this.validate());
		} catch (Exception e) {
			return new SysMLInteractiveResult(e);
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
	        	String input = in.nextLine();
	        	if ("\\\\".equals(input.trim())) {
	        		break;
	        	} else {
	        		if ("\\".equals(input.trim())) {
	        			input = "";
	        			String line = in.nextLine();
	        			while (!"\\".equals(line.trim())) {
	        				if ("\\\\".equals(line.trim())) {
	        					input = null;
	        					break;
	        				}
	        				input += line + "\n";
	        				line = in.nextLine();
	        			}
	        		}
	        		run(input);
	        	}
	        } while(true);
        }
    }
	
	public static SysMLInteractive getInstance() {
		Injector injector = new AlfStandaloneSetup().createInjectorAndDoEMFRegistration();
		return injector.getInstance(SysMLInteractive.class);
	}
	
	public static void main(String[] args) {
		System.out.println("SysML v2 Pilot Implementation");
		getInstance().run();	
	}

}
