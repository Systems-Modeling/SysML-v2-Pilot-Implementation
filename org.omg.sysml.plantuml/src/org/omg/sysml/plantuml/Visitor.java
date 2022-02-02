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
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;
import org.omg.sysml.util.FeatureUtil;

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
            flushPRelations(true);
            flushContexts();
            sb.append(pRelationsSB);
            pRelationsSB.setLength(0);
        }
        return sb.toString();
    }

    protected int length() {
        return sb.length();
    }

    protected VPath getVPath() {
        return s2p.getVPath();
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
            flushPRelations(false);
        }
        s2p.popIdMap(keep);
    }

    protected void setInherited(boolean flag) {
        s2p.setInherited(flag);
    }
    
    protected boolean isInherited() {
        return s2p.isInherited();
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

    protected boolean styleBooleanValue(String option) {
        return s2p.styleValue(option) != null;
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

    private String compId(Element e) {
        if (e == null) return "[*]";
        Integer ii = getVPath().getId(e);
        if (ii == null) {
            if (!checkId(e)) {
                if (e instanceof Subsetting) {
                    Subsetting ss = (Subsetting) e;
                    e = ss.getSubsettedFeature();
                    if (!checkId(e)) return null;
                } else {
                	return null;
                }
            }
            ii = getId(e);
        }
        return 'E' + ii.toString();
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
        return FeatureUtil.getMultiplicityRangeOf(m);
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

    protected static String getFeatureName(Feature f) {
        return f.getEffectiveName();
    }

    protected static String getName(Element e) {
        if (e instanceof Feature) {
            return getFeatureName((Feature) e);
        } else {
            return e.getName();
        }
    }

    private Element fullyQualifiedElement;

    protected String getNameAnyway(Element e, boolean creole) {
        String ret = null;
        if (e.equals(fullyQualifiedElement)) {
            ret = e.getQualifiedName();
        }
        if (ret == null) {
            ret = getName(e);
        }
        if (ret == null) {
            if (creole) {
                ret = "<s>noname</s>";
            } else {
                ret = "noname";
            }
        }
        if (e instanceof Type) {
            Type typ = (Type) e;
            if (typ.isAbstract()) {
                ret = "<i>" + ret + "</i>";
            }
        }
        return ret;
    }

    protected static String getFeatureChainName(Feature f) {
        String name = f.getEffectiveName();
        if (name != null) return name;
        for (Subsetting ss: f.getOwnedSubsetting()) {
            Feature sf = ss.getSubsettedFeature();
            List<FeatureChaining> fcs = sf.getOwnedFeatureChaining();
            if (fcs.isEmpty()) continue;
            StringBuilder sb = new StringBuilder();
            for (FeatureChaining fc : fcs) {
                if (sb.length() > 0) {
                    sb.append('.');
                }
                sb.append(fc.getChainingFeature().getEffectiveName());
            }
            return sb.toString();
        }
        return null;
    }

    protected static String getNameWithNamespace(Feature f) {
        String name = getFeatureName(f);
        if (name == null) return null;
        org.omg.sysml.lang.sysml.Namespace pkg = f.getOwningNamespace();
        if (pkg == null) {
            return name;
        } else {
            return pkg.getName() + "::" + name;
        }
    }

    protected static boolean appendSubsettingFeature(StringBuilder sb, String prefix, Feature f) {
        List<Subsetting> ss = f.getOwnedSubsetting();
        if (ss.isEmpty()) return false;
        boolean added = false;
        for (Subsetting s: ss) {
            if (s == null) continue;
            if (s instanceof Redefinition) continue;
            Feature sf = s.getSubsettedFeature();
            if (sf == null) continue;
            String name = getNameWithNamespace(sf);
            if (name == null) continue;
            if (added) {
                sb.append(", ");
            } else {
                sb.append(prefix);
                added = true;
            }
            sb.append(name);
        }
        return added;
    }

    protected static boolean appendFeatureType(StringBuilder sb, String prefix, Feature f) {
        List<FeatureTyping> tt = f.getOwnedTyping();
        if (tt.isEmpty()) return false;
        boolean added = false;
        for (FeatureTyping ft: tt) {
            if (ft == null) continue;
            Type typ = ft.getType();
            if (typ == null) continue;
            String typeName = typ.getName();
            if (typeName == null) continue;
            if (added) {
                sb.append(", ");
            } else {
                sb.append(prefix);
                added = true;
            }
            sb.append(typeName);
        }
        return added;
    }

    protected boolean addFeatureTypeText(String prefix, Feature f) {
        return appendFeatureType(sb, prefix, f);
    }

    protected void addFeatureTypeAndSubsettedText(Feature f) {
        appendFeatureType(sb, ": ", f);
        appendSubsettingFeature(sb, ":> ", f);
    }

    private void renderImportedPackage(org.omg.sysml.lang.sysml.Package pkg, Collection<Element> nonPkgs) {
        String name = pkg.getQualifiedName();
        if (name == null) return;
        append("package ");
        addNameWithId(pkg, name, true);
        append(' ');
        addLink(pkg);
        append(" {\n");
        for (Element dest: nonPkgs) {
            if (compId(dest) != null) continue;
            if (pkg.equals(dest.getOwner())) {
                visit(dest);
            }
        }
        append("}\n");
    }

    private void sortOutDestinations(Collection<org.omg.sysml.lang.sysml.Package> pkgs, Collection<Element> nonPkgs) {
        for (PRelation pr: pRelations) {
            if (compId(pr.src) == null) continue;
            Element dest = pr.dest;
            if (compId(dest) != null) continue;
            if (dest instanceof org.omg.sysml.lang.sysml.Package) {
                pkgs.add((org.omg.sysml.lang.sysml.Package) dest);
            } else {
                if (getName(dest) == null) {
                    // It would be a feature chain and it should be rendered in the future.
                    continue;
                }
                nonPkgs.add(dest);
            }
        }
    }

    private void renderDestinations() {
        if (!styleBooleanValue("showImported")) return;
        Set<org.omg.sysml.lang.sysml.Package> pkgs = new HashSet<>();
        Set<Element> nonPkgs = new HashSet<>();
        sortOutDestinations(pkgs, nonPkgs);
        for (org.omg.sysml.lang.sysml.Package pkg: pkgs) {
            renderImportedPackage(pkg, nonPkgs);
        }
        for (Element e: nonPkgs) {
            if (compId(e) != null) continue;
            this.fullyQualifiedElement = e;
            visit(e);
        }
        this.fullyQualifiedElement = null;
    }

    private boolean outputPRelation(StringBuilder ss, PRelation pr) {
        if ((pr.src == null) && (pr.dest == null)) return true;

        String srcId = compId(pr.src);
        if (srcId == null) return false;
        String destId = compId(pr.dest);
        if (destId == null) return false;

        String relStr = getRelStyle(pr.rel);
        if (relStr == null) return true;
        
        ss.append(srcId);

        // addMultiplicityString(ss, pr.src);
                
        ss.append(relStr);

        if (pr.rel instanceof Membership) {
            addMultiplicityString(ss, pr.dest);
        } else {
            addMultiplicityString(ss, pr.rel);
        }

        ss.append(destId);
        ss.append(' ');
        addLink(ss, pr.rel, null);

        String desc = pr.getDescription();
        if (!((desc == null) || (desc.isEmpty()))) {
            ss.append(": ");
            desc = desc.replace("\r", "").replace("\n", "\\n");
            ss.append(desc);
        }
        ss.append('\n');

        return true;
    }

    protected void outputPRelations(List<?extends PRelation> prs) {
    	if (prs == null) return;
        for (PRelation pr: prs) {
            outputPRelation(sb, pr);
        }
    }

    private void flushPRelations(boolean last) {
        PRelation[] prs = new PRelation[pRelations.size()];
        prs = pRelations.toArray(prs);
        pRelations.clear();

        for (PRelation pr: prs) {
            if (!outputPRelation(pRelationsSB, pr)) {
                pRelations.add(pr);
            }
        }
        if (!last) return;
        renderDestinations();
        for (PRelation pr: pRelations) {
            outputPRelation(pRelationsSB, pr);
        }
    }

    protected Visitor(Visitor parent, boolean independent) {
        this.sb = new StringBuilder();
        if (parent == null) {
            this.prev = null;
            this.contexts = new ArrayList<Visitor>();
            this.pRelations = new ArrayList<PRelation>();
            this.pRelationsSB = new StringBuilder();
        } else {
            this.prev = parent;
            this.contexts = null;
            if (independent) {
                parent.addContext(this);
            }
            this.pRelations = parent.pRelations;
            this.pRelationsSB = parent.pRelationsSB;
            this.s2p = parent.s2p;
            this.showsMultiplicity = parent.showsMultiplicity;
        }
    }

    protected Visitor(Visitor parent) {
        this(parent, false);
    }

    protected Visitor() {
        this(null, false);
    }

    public String visit(Element e) {
    	if (e == null) return null;
        return doSwitch(e);
    }
}
