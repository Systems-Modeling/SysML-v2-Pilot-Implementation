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
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

public abstract class LinkStep implements Comparable<LinkStep>{
	private LinkStep parent;
	private List<LinkStep> children = new LinkedList<>();
	private Duration duration;
	private boolean isFirst;
	
	public LinkStep(LinkStep parent) {
		this.parent = parent;

		if (parent != null)
			parent.addLinkStep(this);
	}
	
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
		
	public void addLinkStep(LinkStep scopeResult) {
		this.children.add(scopeResult);
	}
	
	public boolean isRoot() {
		return parent == null;
	}
	
	public List<LinkStep> getChildren(){
		return children;
	}
	
	public Duration getDuration() {
		return duration;
	}
	
	public void setFirst() {
		this.isFirst = true;
	}
	
	public boolean isFirst() {
		return isFirst;
	}
	
	@Override
	public int compareTo(LinkStep o) {
		return duration.compareTo(o.duration);
	}

	public abstract void print(int indent, PrintStream out);
	
	public static void createNesting(int nesting, PrintStream out) {
		for (int i = 0; i < nesting; i++) {
			out.print(' ');
		}
	}
}
