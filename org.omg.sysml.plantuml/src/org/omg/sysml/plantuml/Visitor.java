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

    protected String getString() {
        if (prev == null) {
            flushContexts();
            flushPRelations();
        }
        return sb.toString();
    }

    protected int length() {
        return sb.length();
    }

    protected Integer getId(Element e) {
        return s2p.getId(e);
    }

    protected boolean checkId(Element e) {
        return s2p.checkId(e);
    }

    protected String getRelStyle(Element rel) {
        return s2p.getRelStyle(rel);
    }

    protected String getStereotypeStyle(Element e) {
        return s2p.getStereotypeStyle(e);
    }

    protected String styleString(Type typ) {
        return s2p.styleString(typ);
    }

    protected String getText(EObject eObj) {
        return s2p.getText(eObj);
    }

    private String getLinkStr(EObject eObj) {
        return s2p.getLinkStr(eObj);
    }

    protected void addLink(EObject eObj) {
        addLink(eObj, null);
    }

    protected void addLink(EObject eObj, String txt) {
        String uriStr = getLinkStr(eObj);
        if (uriStr == null) return;
        append("[[");
        append(uriStr);
        append(' ');
        if (txt != null) {
            append(txt);
            append("]]");
        } else {
            append("]] ");
        }
    }

    protected void quote0(String s) {
        if (s.indexOf('"') >= 0) {
            // Replace nonsafe " to ''
            s = s.replace("\"", "''");
        }
        append(s);
    }

    protected void quote(String s) {
        append('"');
        quote0(s);
        append('"');
    }

    protected void addNameWithId(Element e, String name) {
        quote(name);
        append(" as ");
        addIdStr(e);
        append(' ');
    }

    private static void closeBlockInternal(StringBuilder sbParent,
                                           StringBuilder sbChild,
                                           String endStr) {
        if (sbChild.length() == 0) {
            sbParent.append('\n');
        } else {
            sbParent.append("{\n");
            sbParent.append(sbChild);
            sbParent.append(endStr);
            sbParent.append("}\n");
        }
    }

    protected void closeBlock(String endStr) {
        if (prev == null) return;
        closeBlockInternal(prev.sb, sb, endStr);
        sb.setLength(0);
    }

    protected void flush() {
        if (prev == null) return;
        prev.sb.append(sb);
        sb.setLength(0);
    }

    protected void addIdStr(Element e) {
        if (e == null) {
            append("[*]");
        } else {
            append("Eid");
            append(getId(e));
        }
    }

    private final List<PRelation> pRelations;

    protected PRelation addPRelation(Element src, Element dest, Element rel, String description) {
        PRelation pr = new PRelation(src, dest, rel, description);
        pRelations.add(pr);
        return pr;
    }

    protected PRelation addPRelation(Element src, Element dest, Element rel) {
        return addPRelation(src, dest, rel, null);
    }

    private void addMultiplicityString(Element e) {
        if (!showsMultiplicity) return;
        if (!(e instanceof Type)) return;
        Type typ = (Type) e;
        Multiplicity m = typ.getMultiplicity();
        if (m instanceof MultiplicityRange) {
            MultiplicityRange mr = (MultiplicityRange) m;
            String exl = getText(mr.getLowerBound());
            String exu = getText(mr.getUpperBound());
            if (exl == null) {
                if (exu == null) return;
                sb.append('"');
                quote0(exu);
                sb.append('"');
                return;
            }
            if ((exu == null) || (exl.equals(exu))) {
                append('"');
                quote0(exl);
                append('"');
                return;
            }
            if ("0".equals(exl) && "*".equals(exu)) {
                append("\"*\"");
            } else {
                append('"');
                quote0(exl);
                append("..");
                quote0(exu);
                append('"');
            }
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

    private boolean outputPRelation(PRelation pr) {
        if (!(((pr.src == null) || checkId(pr.src))
              && ((pr.dest == null) || checkId(pr.dest)))) return false;
        String relStr = getRelStyle(pr.rel);

        if (relStr == null) return true;
        if ((pr.src == null) && (pr.dest == null)) return true;
        addIdStr(pr.src);

        // addMultiplicityString(pr.src);
                
        append(relStr);

        addMultiplicityString(pr.rel);

        addIdStr(pr.dest);
        String desc = pr.getDescription();
        if (!((desc == null) || (desc.isEmpty()))) {
            append(" : ");
            append(desc);
        }
        append('\n');

        return true;
    }

    protected void outputPRelations(List<PRelation> prs) {
    	if (prs == null) return;
        for (PRelation pr: prs) {
            outputPRelation(pr);
        }
    }

    private void flushPRelations() {
        PRelation[] prs = new PRelation[pRelations.size()];
        prs = pRelations.toArray(prs);
        pRelations.clear();

        for (PRelation pr: prs) {
            if (!outputPRelation(pr)) {
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
    }

    public String visit(Element e) {
        return doSwitch(e);
    }
}
