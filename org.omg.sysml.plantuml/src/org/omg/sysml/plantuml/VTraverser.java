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
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

public abstract class VTraverser extends Visitor {
    private Set<Namespace> visited;

    private Namespace currentNamespace;
    protected Namespace getCurrentNamespace() {
        return currentNamespace;
    }
    private Membership currentMembership;
    protected Membership getCurrentMembership() {
        return currentMembership;
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
        for (Relationship r: n.getOwnedRelationship()) {
            if (r instanceof Membership) {
                Membership m = (Membership) r;
                setInherited(false);
                visit(m);
                for (Relationship r2: m.getOwnedRelationship()) {
                    setInherited(false);
                    visit(r2);
                }
            } else if (r instanceof Import) {
                setInherited(false);
                visit(r);
            }
        }
        return "";
    }

    private boolean markRedefining(Element e, Set<Element> covered) {
        if (covered.contains(e)) return true;
        if (!(e instanceof Feature)) return false;
        Feature f = (Feature) e;
        for (Redefinition r: f.getOwnedRedefinition()) {
            Feature rf = r.getRedefinedFeature();
            covered.add(rf);
        }
        return false;
    }

    private static boolean isModelLibrary(Element e) {
        return SysMLLibraryUtil.isModelLibrary(e.eResource());
    }

    private String traverseWithInherited(Type typ) {
        Set<Element> covered = new HashSet<Element>();
        for (Membership ms: typ.getOwnedMembership()) {
            Element e = ms.getMemberElement();
            markRedefining(e, covered);
            setInherited(false);
            visit(ms);
            for (Relationship r: ms.getOwnedRelationship()) {
                setInherited(false);
                visit(r);
            }
        }
        for (Membership ms: typ.getInheritedMembership()) {
            Element e = ms.getMemberElement();
            if (!showLib() && isModelLibrary(e)) continue;
            if (markRedefining(e, covered)) continue;
            setInherited(true);
            visit(ms);
        }
        setInherited(false);

        return "";
    }

    public String traverse(Namespace ns) {
        VPath vpath = getVPath();
        vpath.enter(ns);
        this.currentNamespace = ns;
        if (showInherited() && (ns instanceof Type)) {
            traverseWithInherited((Type) ns);
        } else {
            traverse0(ns);
            for (Element e: vpath.rest()) {
                setInherited(true);
                currentMembership = null;
                visit(e);
            }
            setInherited(false);
        }
        this.currentNamespace = null;
        vpath.leave(ns);
        return "";
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

    private boolean inited = false;
    private boolean showInherited;
    private boolean showLib;

    private void init() {
        if (inited) return;
        this.showInherited = styleBooleanValue("showInherited");
        this.showLib = styleBooleanValue("showLib");
        this.inited = true;
    }
    
    private boolean showInherited() {
        init();
        return showInherited;
    }

    private boolean showLib() {
        init();
        return showLib;
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
    	this(prev, false);
    }
    
    protected VTraverser() {
        this(null, false);
    }
}
