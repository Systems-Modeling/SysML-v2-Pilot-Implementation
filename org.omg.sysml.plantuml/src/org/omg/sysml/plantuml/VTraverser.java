/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020 Mgnite Inc.
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
 *  Hisashi Miyashita, Mgnite Inc.
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;

public abstract class VTraverser extends Visitor {
    private Set<Namespace> visited;

    private Membership currentMembership;
    protected Membership getCurrentMembership() {
        return currentMembership;
    }

    protected boolean isInherited() {
        return currentMembership == null;
    }
    
    protected boolean checkVisited(Namespace n) {
    	boolean flag = visited.contains(n);
    	visited.add(n);
    	return flag;
    }

    private List<Set<Namespace>> listOfVisited = new ArrayList<Set<Namespace>>();

    protected void pushVisited() {
        listOfVisited.add(visited);
        this.visited = new HashSet<Namespace>();
    }

    protected void popVisited() {
        int idx = listOfVisited.size() - 1;
        this.visited = listOfVisited.get(idx);
        listOfVisited.remove(idx);
    }


    protected String traverse0(Namespace n) {
        for (Membership m: n.getOwnedMembership()) {
            // if (visit(m) == null) return null;
            visit(m);
            for (Relationship r: m.getOwnedRelationship()) {
                visit(r);
            }
        }
        return getString();
    }

    public String traverseWithInherited(Type typ) {
        traverse0(typ);
        for (Generalization g: typ.getOwnedGeneralization()) {
            Type gt = g.getGeneral();
            if (gt == null) continue;
            for (FeatureMembership fm: gt.getOwnedFeatureMembership()) {
                visit(fm);
            }
        }
        return getString();
    }

    public String traverse(Namespace ns) {
        VPath vpath = getVPath();
        vpath.enter(ns);
        traverse0(ns);
        for (Element e: vpath.rest()) {
            currentMembership = null;
            visit(e);
        }
        vpath.leave(ns);
        return getString();
    }

    protected String visitMembership(Membership m) {
        this.currentMembership = m;
        return visit(m.getMemberElement());
    }

    @Override
    public String caseMembership(Membership m) {
        return visitMembership(m);
    }

    @Override
    public String caseNamespace(Namespace n) {
        if (checkVisited(n)) {
            return "";
        }
        return traverse(n);
    }

    private static Set<Namespace> initVisited(Visitor prev) {
        if (prev instanceof VTraverser) {
            VTraverser vtprev = (VTraverser) prev;
            return vtprev.visited;
        }
        return new HashSet<Namespace>();
    }
    
    protected VTraverser(Visitor prev, boolean block) {
    	super(prev, block);
        this.visited = initVisited(prev);
    }
    
    protected VTraverser(Visitor prev) {
    	super(prev);
        this.visited = initVisited(prev);
    }
    
    protected VTraverser() {
    	super();
        this.visited = initVisited(null);
    }
}
