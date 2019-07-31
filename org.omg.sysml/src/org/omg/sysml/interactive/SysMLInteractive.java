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

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.AlfUtil;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class SysMLInteractive extends AlfUtil {
	
	protected static Injector injector;
	
	protected int counter = 1;
	protected XtextResource resource;
	
	@Inject
	private IResourceValidator validator;
	
	@Inject
	private SysMLInteractive() {
		EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, SysMLPackage.eINSTANCE);
	}
	
	public void loadLibrary(String path) {
		if (path != null) {
			this.readAll(path, false);
		}
	}
	
	protected XtextResource getResource() {
		if (this.resource == null) {
			this.resource = (XtextResource)this.createResource("shell" + ALF_EXTENSION);
		}
		return this.resource;
	}
	
	public Element getRootElement() {
		final IParseResult result = this.resource.getParseResult();
		return result == null? null: (Element)result.getRootASTElement();
	}
	
	public void parse(String input) throws IOException {
		this.getResource().reparse(input);
	}
	
	public List<Issue> validate() {
		return validator.validate(this.resource, CheckMode.ALL, CancelIndicator.NullImpl);
	}
	
	public SysMLInteractiveResult eval(String input) {
		this.counter++;
		try {
			this.parse(input);
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
