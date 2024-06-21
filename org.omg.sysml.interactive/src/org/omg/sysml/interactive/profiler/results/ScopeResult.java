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

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

public class ScopeResult extends LinkStep {
	
	private QualifiedName qualifiedName;
	private String referenceType;
	private String namespace;
	private String result;
	
	
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
	public void print(int nesting, PrintStream out) {
		createNesting(nesting, out);
		out.println("Scope " + namespace + " looking for " + qualifiedName.toString() + "[" + referenceType + "] took " + getDuration().toMillis() + "ms {");
		final var incNesting = nesting + 1;
		getChildren().forEach(res -> res.print(incNesting, out));
		createNesting(nesting + 1, out);
		out.println("Found " + result);
		createNesting(nesting, out);
		out.println("}");
	}
}
