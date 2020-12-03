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
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public abstract class Visitor extends SysMLSwitch<String> {
    private SysML2PlantUMLText s2p = null;

    public void setSysML2PlantUMLText(SysML2PlantUMLText s2p) {
        this.s2p = s2p;
    }

    private boolean showsMultiplicity = true;
    public void setShowsMultiplicity(boolean flag) {
        this.showsMultiplicity = flag;
    }

    protected SysML2PlantUMLStyle getStyle() {
        return null;
    }

    private List<Visitor> contexts;
    private final Visitor prev;

    private StringBuilder sb;

    protected void append(String str) {
        sb.append(str);
    }

    protected void append(char ch) {
        sb.append(ch);
    }

    protected void append(Object o) {
        sb.append(o);
    }

    protected void append(String str, int st, int end) {
        sb.append(str, st, end);
    }

    private void addContext(Visitor v) {
        if (contexts != null) {
            contexts.add(v);
        } else {
            prev.addContext(v);
        }
    }

    protected void flushContexts() {
        if (contexts == null) return;
        for (Visitor v: contexts) {
            sb.append(v.sb);
        }
        contexts.clear();
    }

    protected boolean isEmpty() {
        return sb.length() == 0;
    }

    protected String getString() {
        if (prev == null) {
            flushContexts();
            flushPRelations();
            sb.append(pRelationsSB);
            pRelationsSB.setLength(0);
        }
        return sb.toString();
    }

    protected int length() {
        return sb.length();
    }

    private Integer newId(Element e) {
        return s2p.newId(e);
    }

    private Integer getId(Element e) {
        return s2p.getId(e);
    }

    protected boolean checkId(Element e) {
        return s2p.checkId(e);
    }

    protected void pushIdMap() {
        s2p.pushIdMap();
    }

    protected void popIdMap(boolean keep) {
        if (keep) {
            flushPRelations();
        }
        s2p.popIdMap(keep);
    }

    protected String getRelStyle(Element rel) {
        return s2p.getRelStyle(rel);
    }

    protected String styleString(Type typ) {
        return s2p.styleString(typ);
    }

    protected String styleValue(String option) {
        return s2p.styleValue(option);
    }

    protected String getText(EObject eObj) {
        return s2p.getText(eObj);
    }

    private String getLinkStr(EObject eObj) {
        return s2p.getLinkStr(eObj);
    }

    protected void addLink(EObject eObj) {
        addLink(sb, eObj, null);
    }

    protected void addLink(EObject eObj, String txt) {
        addLink(sb, eObj, txt);
    }

    private void addLink(StringBuilder ss, EObject eObj, String txt) {
        String uriStr = getLinkStr(eObj);
        if (uriStr == null) return;
        ss.append("[[");
        ss.append(uriStr);
        ss.append(' ');
        if (txt != null) {
            ss.append(txt);
            ss.append("]]");
        } else {
            ss.append("]] ");
        }
    }

    private String quote0Str(String s) {
        if (s.indexOf('"') >= 0) {
            // Replace nonsafe " to ''
            return s.replace("\"", "''");
        }
        return s;
    }

    protected void quote0(String s) {
        append(quote0Str(s));
    }

    protected void quote(String s) {
        append('"');
        quote0(s);
        append('"');
    }

    protected void addNameWithId(Element e, String name, boolean force) {
        quote(name);
        append(" as ");
        addIdStr(e, force);
        append(' ');
    }

    private void close() {
        sb.setLength(0);
    }

    protected void closeBlock() {
        if (prev == null) return;
        prev.sb.append("{\n");
        prev.sb.append(sb);
        prev.sb.append("}\n");
        close();
    }

    protected void flush() {
        if (prev == null) return;
        prev.sb.append(sb);
        close();
    }

    private void appendId(StringBuilder ss, Element e, boolean force) {
        if (e == null) {
            ss.append("[*]");
        } else {
            ss.append('E');
            if (force) {
                ss.append(newId(e));
            } else {
                ss.append(getId(e));
            }
        }
    }

    protected void addIdStr(Element e, boolean force) {
        appendId(sb, e, force);
    }

    private void outputPRId(StringBuilder ss, Element e) {
        appendId(ss, e, false);
    }

    private final List<PRelation> pRelations;
    private final StringBuilder pRelationsSB;

    protected PRelation addPRelation(Element src, Element dest, Element rel, String description) {
        PRelation pr = new PRelation(src, dest, rel, description);
        pRelations.add(pr);
        return pr;
    }

    protected PRelation addPRelation(Element src, Element dest, Element rel) {
        return addPRelation(src, dest, rel, null);
    }

    private MultiplicityRange getEffectiveMultiplicityRange(Element e) {
        if (!(e instanceof Type)) return null;
        Type typ = (Type) e;
        Multiplicity m = typ.getMultiplicity();
        if (!(m instanceof MultiplicityRange)) return null;
        if (!typ.equals(m.getOwner())) return null;
        return (MultiplicityRange) m;
    }

    private void addMultiplicityString(StringBuilder ss, Element e) {
        if (!showsMultiplicity) return;
        MultiplicityRange mr = getEffectiveMultiplicityRange(e);
        if (mr == null) return;

        String exl = getText(mr.getLowerBound());
        String exu = getText(mr.getUpperBound());
        if (exl == null) {
            if (exu == null) return;
            ss.append('"');
            ss.append(quote0Str(exu));
            ss.append('"');
            return;
        }
        if ((exu == null) || (exl.equals(exu))) {
            ss.append('"');
            ss.append(quote0Str(exl));
            ss.append('"');
            return;
        }
        if ("0".equals(exl) && "*".equals(exu)) {
            ss.append("\"*\"");
        } else {
            ss.append('"');
            ss.append(quote0Str(exl));
            ss.append("..");
            ss.append(quote0Str(exu));
            ss.append('"');
        }
    }

    protected void addTypeText(String prefix, Feature f) {
        List<Type> ts = f.getType();
        if (ts.isEmpty()) return;
        // getType() should return the most specific type but for the time being we use the first type only.
        Type t = ts.get(0);
        String name = t.getName();
        if (name == null) return;
        append(prefix);
        append(name);
    }

    protected Element getEnd(Feature f) {
        if (f == null) return null;
        for (Subsetting ss: f.getOwnedSubsetting()) {
            return ss.getSubsettedFeature();
        }
        return null;
    }

    private boolean outputPRelation(StringBuilder ss, PRelation pr) {
        if (!(((pr.src == null) || checkId(pr.src))
              && ((pr.dest == null) || checkId(pr.dest)))) return false;
        String relStr = getRelStyle(pr.rel);

        if (relStr == null) return true;
        if ((pr.src == null) && (pr.dest == null)) return true;
        outputPRId(ss, pr.src);

        // addMultiplicityString(ss, pr.src);
                
        ss.append(relStr);

        addMultiplicityString(ss, pr.rel);

        outputPRId(ss, pr.dest);
        ss.append(' ');
        addLink(ss, pr.rel, null);

        String desc = pr.getDescription();
        if (!((desc == null) || (desc.isEmpty()))) {
            ss.append(": ");
            ss.append(desc);
        }
        ss.append('\n');

        return true;
    }

    protected void outputPRelations(List<PRelation> prs) {
    	if (prs == null) return;
        for (PRelation pr: prs) {
            outputPRelation(sb, pr);
        }
    }

    private void flushPRelations() {
        PRelation[] prs = new PRelation[pRelations.size()];
        prs = pRelations.toArray(prs);
        pRelations.clear();

        for (PRelation pr: prs) {
            if (!outputPRelation(pRelationsSB, pr)) {
                pRelations.add(pr);
            }
        }
    }

    protected Visitor(Visitor parent, boolean independent) {
        this.prev = parent;
        this.contexts = null;
        this.sb = new StringBuilder();
        if (independent) {
            parent.addContext(this);
        }
        this.pRelations = parent.pRelations;
        this.pRelationsSB = parent.pRelationsSB;
        this.s2p = parent.s2p;
        this.showsMultiplicity = parent.showsMultiplicity;
    }

    protected Visitor(Visitor parent) {
        this(parent, false);
    }

    protected Visitor() {
        this.prev = null;
        this.sb = new StringBuilder();
        this.contexts = new ArrayList<Visitor>();
        this.pRelations = new ArrayList<PRelation>();
        this.pRelationsSB = new StringBuilder();
    }

    public String visit(Element e) {
    	if (e == null) return null;
        return doSwitch(e);
    }
}
