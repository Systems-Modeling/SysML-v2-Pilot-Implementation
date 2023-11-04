/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2023 Mgnite Inc.
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, MDS
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
import org.omg.sysml.util.ElementUtil;

public abstract class VTraverser extends Visitor {
    private Set<Namespace> visited;

    private Membership currentMembership;
    protected Membership getCurrentMembership() {
        return currentMembership;
    }

    protected boolean checkVisited(Namespace n) {
    	if (visited.contains(n)) return true;
    	visited.add(n);
    	return false;
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
        return ElementUtil.isStandardLibraryElement(e);
    }

    private void traverseInternal(Namespace n, Set<Element> covered) {
        for (Relationship r: n.getOwnedRelationship()) {
            if (r instanceof Membership) {
                Membership ms = (Membership) r;
                setInherited(false);
                Element e = ms.getMemberElement();
                markRedefining(e, covered);
                this.currentMembership = ms;
                visit(ms);
                for (Relationship r2: ms.getOwnedRelationship()) {
                    setInherited(false);
                    visit(r2);
                }
            } else if (r instanceof Import) {
                setInherited(false);
                visit(r);
            }
        }
    }

    private void traverseInherited(Type typ, Set<Element> covered) {
        for (Membership ms: typ.getInheritedMembership()) {
            Element e = ms.getMemberElement();
            if (!showLib() && isModelLibrary(e)) continue;
            if (markRedefining(e, covered)) continue;
            setInherited(true);
            pushVisited();
            visit(ms);
            popVisited();
        }
    }

    private void traverseRest(VPath vpath) {
        for (Element e: vpath.rest()) {
            currentMembership = null;
            setInherited(true);
            visit(e);
        }
    }

    public String traverse(Namespace ns, boolean noInherit, boolean noPopNamespace) {
        VPath vpath = getVPath();
        if (!pushNamespace(ns)) return null;
        vpath.enter(ns);
        Set<Element> covered = new HashSet<Element>();
        traverseInternal(ns, covered);
        if (!noInherit) {
            inheriting(ns);
            if (showInherited()) {
            	if (ns instanceof Type) {
            		traverseInherited((Type) ns, covered);
            	}
            } else {
                traverseRest(vpath);
            }
        }
        vpath.leave(ns);
        if (!noPopNamespace) {
            popNamespace();
        }
        return "";
    }

    public String traverse(Namespace ns) {
        return traverse(ns, false, false);
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
