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

import java.io.StringReader;
import java.util.Scanner;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.impl.DefaultElementProcessingFacadeImpl;
import org.omg.sysml.util.traversal.impl.TraversalImpl;
import org.omg.sysml.util.traversal.visitor.impl.ElementVisitorFactoryImpl;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class SysMLInteractive {
	
	protected int counter = 1;
	
	protected Traversal traversal;
	
	protected StringBuilder outline;
	
	@Inject
	protected IParser parser;
	
	@Inject
	private SysMLInteractive() {
		EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, SysMLPackage.eINSTANCE);
		final ElementVisitorFactoryImpl visitorFactory = new ElementVisitorFactoryImpl(
				new DefaultElementProcessingFacadeImpl() {
					@Override
					public void println(String line) {
						outline.append(line);
						outline.append("\n");
					}
				});
		this.traversal = new TraversalImpl(visitorFactory);
		visitorFactory.setTraversal(this.traversal);	
	}
	
	public Object eval(String input) {
		IParseResult result = parser.parse(new StringReader(input));
		this.counter++;
		return this.formatParseResult(result);
	}
	
	public String formatElement(Element element) {
		this.outline = new StringBuilder();
		this.traversal.reset();
		this.traversal.visit(element);
		return this.outline.toString();
	}
		
	public String formatParseResult(IParseResult result) {
		if (!result.hasSyntaxErrors()) {
			return this.formatElement((Element)result.getRootASTElement());
		} else {
			String errorMessages = "";
			for (INode node: result.getSyntaxErrors()) {
				SyntaxErrorMessage errorMessage = node.getSyntaxErrorMessage();
				errorMessages += errorMessage.getMessage() + "\n";
			}
			return errorMessages;
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
