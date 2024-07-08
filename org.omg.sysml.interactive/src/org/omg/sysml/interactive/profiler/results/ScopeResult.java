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
import java.util.stream.Collectors;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.omg.sysml.lang.sysml.Namespace;

public class ScopeResult extends LinkStep {
	
	private QualifiedName qualifiedName;
	private String referenceType;
	private String namespace;
	private String result;
	
	private List<Pair<String, QualifiedName>> nsSearchStep = new LinkedList<>(); 
	
	
	public ScopeResult(QualifiedName name, String namespace, String referenceType, LinkStep parent) {
		super(parent);
		this.qualifiedName = name;
		this.namespace = namespace;
		this.referenceType = referenceType;
	}
	
	public void setResult(IEObjectDescription description) {
		if (description != null) {
			result = description.getName().toString() + "[" + description.getEClass().getName() +"]";
		}
	}
	
	@Override
	public void addNamespace(Namespace ns, QualifiedName qn) {
		nsSearchStep.add(Tuples.create(ns.getQualifiedName(), qn));
	}

	@Override
	public void print(int nesting, PrintStream out) {
		createNesting(nesting, out);
		out.println("Scope " + namespace + " looking for " + qualifiedName.toString() + "[" + referenceType + "] took " + getDuration().toMillis() + "ms {");
		final var incNesting = nesting + 1;
		getChildren().forEach(res -> res.print(incNesting, out));
		createNesting(incNesting, out);
		out.println("Visited namespaces: " + nsSearchStep.stream().map(p -> p.getFirst()).collect(Collectors.joining(", ")));
		createNesting(incNesting, out);
		out.println("Found " + result);
		createNesting(nesting, out);
		out.println("}");
	}
}
