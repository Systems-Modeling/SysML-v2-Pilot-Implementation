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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class LinkingResult extends LinkStep
{
	public static List<LinkStep> RESULTS = new LinkedList<>();
	
	private final String text;
	private final EReference reference;
	private final int line;
	private final int column;
	private EObject result;
	
	public LinkingResult(String text, EReference reference, int line, int column, LinkStep parent) {
		super(parent);
		this.reference = reference;
		this.text = text;
		this.line = line;
		this.column = column;		
	}
			
	@Override
	public void print(int nesting) {
		if (isRoot()) {
			System.out.println("----------------------------------");
		}
		createNesting(nesting);
		
		String resName = "";
		
		/*
		 * if (result != null) { resName = result.eResource().getURI().lastSegment(); }
		 */
		
		System.out.println("Linking " + text + "(" + reference.getName().trim() + ")" + " took " + getDuration().toMillis() + "ms in line " + line + " --found in--> " + resName);
		final var incNesting = ++nesting;
		getChildren().forEach(res -> res.print(incNesting));
	}
	
	public void addResult(List<EObject> linkedObjects) {
		if (!linkedObjects.isEmpty())
			this.result = linkedObjects.get(0);
	}
}
