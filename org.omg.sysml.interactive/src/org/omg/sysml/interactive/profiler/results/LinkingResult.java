/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
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
 */
package org.omg.sysml.interactive.profiler.results;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.omg.sysml.lang.sysml.Element;

public class LinkingResult extends LinkStep
{
	public static List<LinkStep> RESULTS = new LinkedList<>();
	
	private final String text;
	private final EReference reference;
	private final int line;
	private String resource;
	private String result;
	
	public LinkingResult(String text, EReference reference, int line, String resource, LinkStep parent) {
		super(parent);
		this.reference = reference;
		this.text = text;
		this.line = line;
		this.resource = resource;		
	}
			
	@Override
	public void print(int nesting, PrintStream out) {
		if (isRoot()) {
			out.println("----------------------------------");
		}
		createNesting(nesting, out);
		out.println("Linking " + text + "[" + reference.getName().trim() + "] in " + resource + ":" + line +" took " + getDuration().toMillis() + "ms {");
		final var incNesting = nesting + 1;
		getChildren().forEach(res -> res.print(incNesting, out));
		createNesting(nesting + 1, out);
		out.println(result != null ? "Linked " + result : "Could not link");
		createNesting(nesting, out);
		out.println("}");
	}
	
	public void setResult(List<EObject> linkedObjects) {
		if (!linkedObjects.isEmpty()) {
			var singeResult = linkedObjects.iterator().next();
			if (singeResult instanceof Element) {
				var element = (Element) singeResult;
				result = "QN: " + element.getQualifiedName() + ", eClass: " + element.eClass().getName();
			}
		}
	}
}
