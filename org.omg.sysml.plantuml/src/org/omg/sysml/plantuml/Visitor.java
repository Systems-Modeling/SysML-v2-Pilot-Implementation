/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2024 Mgnite Inc.
 * Copyright (c) 2023 Model Driven Solutions, Inc.
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
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Specialization;
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

    protected int getCurrentLength() {
        return sb.length();
    }

    protected void insert(int point, String str) {
        sb.insert(point, str);
    }

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

    protected boolean pushNamespace(Namespace ns) {
        return s2p.pushNamespace(ns);
    }

    protected Namespace getCurrentNamespace() {
        return s2p.getCurrentNamespace();
    }

    protected void inheriting(Namespace ns) {
        s2p.inheriting(ns);
    }

    protected void popNamespace() {
        s2p.popNamespace();
    }

    protected InheritKey makeInheritKey(Feature ref) {
        return s2p.makeInheritKey(ref);
    }

    protected InheritKey makeInheritKey(Membership ref) {
        return s2p.makeInheritKey(ref);
    }

    protected List<Element> eval(Element e) {
        return s2p.eval(e);
    }

    protected boolean matchCurrentInheritings(InheritKey ik) {
        return s2p.matchCurrentInheritings(ik);
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

    private static final String creoleSpecials = "<'-_*/=#~";

    protected void cQuote(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
        	char ch = s.charAt(i);
            if (creoleSpecials.indexOf(ch) >= 0) {
                append(String.format("<U+%04X>", (int) ch));
            } else {
                append(ch);
            }
        }
    }

    protected int addNameWithId(Element e, String name, boolean force) {
        quote(name);
        append(" as ");
        int id = addIdStr(e, force);
        append(' ');
        return id;
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

    private int appendId(StringBuilder ss, Element e, boolean force) {
        if (e == null) {
            ss.append("[*]");
            return 0;
        } else {
            ss.append('E');
            int id;
            if (force) {
                id = newId(e);
            } else {
                id = getId(e);
            }
            ss.append(id);
            return id;
        }
    }

    protected int addIdStr(Element e, boolean force) {
        return appendId(sb, e, force);
    }

    private final List<PRelation> pRelations;
    private final StringBuilder pRelationsSB;

    protected PRelation addPRelation(PRelation pr) {
        pRelations.add(pr);
        return pr;
    }

    protected PRelation addPRelation(InheritKey ik, Element src, Element dest, Element rel, String description) {
        PRelation pr = new PRelation(ik, src, dest, rel, description);
        pRelations.add(pr);
        return pr;
    }

    protected PRelation addPRelation(Element src, Element dest, Element rel, String description) {
        if (rel instanceof Feature) {
            return addPRelation(makeInheritKey((Feature) rel), src, dest, rel, description);
        } else if (rel instanceof Membership) {
            return addPRelation(makeInheritKey((Membership) rel), src, dest, rel, description);
        } else {
            return addPRelation(null, src, dest, rel, description);
        }
    }

    protected PRelation addPRelation(Element src, Element dest, Element rel) {
        return addPRelation(src, dest, rel, null);
    }

    private MultiplicityRange getEffectiveMultiplicityRange(Element e) {
        if (!(e instanceof Type)) return null;
        Type typ = (Type) e;
        Multiplicity m = FeatureUtil.getMultiplicityOf(typ);
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
        return f.getName();
    }

    protected static String getName(Element e) {
        if (e instanceof Feature) {
            return getFeatureName((Feature) e);
        } else {
            return e.getDeclaredName();
        }
    }

    private Element fullyQualifiedElement;

    protected String getNameAnyway(Element e, boolean creole, boolean isInherited) {
        String ret = null;
        String shortName = e.getShortName();
        if (e.equals(fullyQualifiedElement)) {
            ret = e.getQualifiedName();
        }
        if (ret == null) {
            ret = getName(e);
        }
        if (shortName != null) {
            String shortNameDesc;
            if (creole) {
                shortNameDesc = "~<" + shortName + ">";
            } else {
                shortNameDesc = '<' + shortName + '>';
            }
            if (ret == null) {
                ret = shortNameDesc;
            } else {
                ret = shortNameDesc + ' ' + ret;
            }
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
        if (isInherited) {
            return '^' + ret;
        } else {
            return ret;
        }
    }

    protected String getNameAnyway(Element e) {
        return getNameAnyway(e, true, isInherited());
    }

    private static String getFeatureChainName(List<FeatureChaining> fcs) {
        StringBuilder sb = new StringBuilder();
        for (FeatureChaining fc : fcs) {
            if (sb.length() > 0) {
                sb.append('.');
            }
            sb.append(fc.getChainingFeature().getName());
        }
        return sb.toString();
    }

    protected static String getFeatureChainName(Feature f) {
        String name = f.getName();
        if (name != null) return name;
        for (Subsetting ss: toOwnedSubsettingArray(f)) {
            Feature sf = ss.getSubsettedFeature();
            List<FeatureChaining> fcs = sf.getOwnedFeatureChaining();
            if (fcs.isEmpty()) continue;
            return getFeatureChainName(fcs);
        }
        return null;
    }

    private static String getNameWithNamespace(Feature f, org.omg.sysml.lang.sysml.Namespace enclosingNs) {
        String name = getFeatureName(f);
        if (name == null) return null;

        org.omg.sysml.lang.sysml.Namespace pkg = f.getOwningNamespace();
        if ((pkg == null) || pkg.equals(enclosingNs)) return name;
        String pkgName = pkg.getDeclaredName();
        if (pkgName == null) return name;
        return pkgName + "::" + name;
    }


    protected static String getRefName(Feature f, org.omg.sysml.lang.sysml.Namespace enclosingNs) {
        List<FeatureChaining> fcs = f.getOwnedFeatureChaining();
        if (fcs.isEmpty()) return getNameWithNamespace(f, enclosingNs);
        return getFeatureChainName(fcs);
    }

    protected static boolean appendReferenceSubsetting(StringBuilder sb, Feature f) {
        ReferenceSubsetting rs = f.getOwnedReferenceSubsetting();
        if (rs == null) return false;
        Feature rsf = rs.getSubsettedFeature();
        if (rsf == null) return false;
        String name = getRefName(rsf, f.getOwningNamespace());
        if (name == null) return false;
        sb.append("::> ");
        sb.append(name);
        return true;
    }

    protected static boolean appendSubsettings(StringBuilder sb, Feature f) {
        List<Subsetting> ss = f.getOwnedSubsetting();
        if (ss.isEmpty()) return false;
        boolean added = false;
        for (Subsetting s: ss) {
            if (s == null) continue;
            if (s instanceof Redefinition) continue;
            if (s instanceof ReferenceSubsetting) continue;

            Feature sf = s.getSubsettedFeature();
            if (sf == null) continue;
            String name = getRefName(sf, f.getOwningNamespace());
            if (name == null) continue;
            if (added) {
                sb.append(", ");
            } else {
                sb.append(":>");
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
        appendReferenceSubsetting(sb, f);
        appendSubsettings(sb, f);
    }

    private boolean exists(Element e) {
        Integer ii = getVPath().getId(null, e);
        if (ii != null) return true;
        return checkId(e);
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
        	// pkg cannot be inherit so that pass null as an inheritKey.
            if (exists(dest)) continue;
            if (pkg.equals(dest.getOwner())) {
                visit(dest);
            }
        }
        append("}\n");
    }

    private void sortOutDestinations(Collection<org.omg.sysml.lang.sysml.Package> pkgs, Collection<Element> nonPkgs) {
        for (PRelation pr: pRelations) {
            if (pr.compSrcId(s2p) == null) continue;
            if (pr.compDestId(s2p) != null) continue;
            Element dest = pr.getDestElement();
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
            if (exists(e)) continue;
            this.fullyQualifiedElement = e;
            visit(e);
        }
        this.fullyQualifiedElement = null;
    }

    private void addPRDesc(StringBuilder ss, PRelation pr) {
        int idx = ss.length();
        if (pr.rel != null) {
            String mName = SysML2PlantUMLText.getMetadataUsageName(pr.rel);
            if (mName != null) {
                ss.append(mName);
            }
        }
        String desc = pr.getDescription();
        if (desc != null) {
            if (idx < ss.length()) {
                ss.append("\\n");
            }
            if (InheritKey.isDirectInherit(pr.ik)) {
                ss.append('^');
            }
            desc = desc.replace("\r", "").replace("\n", "\\n");
            ss.append(desc);
        }
        if (idx < ss.length()) {
            ss.insert(idx, ": ");
        }
    }
    

    private boolean outputPRelation(StringBuilder ss, PRelation pr) {
        if (pr.isInvalid()) return true;

        String srcId = pr.compSrcId(s2p);
        if (srcId == null) return false;
        String destId = pr.compDestId(s2p);
        if (destId == null) return false;

        String relStr = getRelStyle(pr.rel);
        if (relStr == null) return true;
        
        ss.append(srcId);

        // addMultiplicityString(ss, pr.src);
                
        ss.append(relStr);

        if (pr.rel instanceof Membership) {
            Element dest = pr.getDestElement();
            if (dest != null) {
                addMultiplicityString(ss, dest);
            }
        } else {
            addMultiplicityString(ss, pr.rel);
        }

        ss.append(destId);
        ss.append(' ');
        addLink(ss, pr.rel, null);

        addPRDesc(ss, pr);

        /*
        String desc = pr.getDescription();
        if (desc == null) desc = "";
        if (pr.rel != null) {
            String mName = SysML2PlantUMLText.getMetadataUsageName(pr.rel);
            if (mName != null) {
                desc = mName + desc;
            }
        }
        
        if (InheritKey.isDirectInherit(pr.ik)) {
            desc = "^" + desc;
        }
        if (!desc.isEmpty()) {
            ss.append(": ");
            desc = desc.replace("\r", "").replace("\n", "\\n");
            ss.append(desc);
        }
        */
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
        s2p.countVisits();
        return doSwitch(e);
    }

    // Accessing relationships may cause ConcurrentModificationException over iterators
    // because it may trigger "on-demand" tranfomation.  So we introduce utility methods
    // to copy them into an array.
    public static Element[] toOwnedElementArray(Element e) {
        List<Element> es = e.getOwnedElement();
        Element[] array = new Element[es.size()];
        return es.toArray(array);
    }

    public static Feature[] toOwnedFeatureArray(Type typ) {
        List<Feature> fs = typ.getOwnedFeature();
        Feature[] array = new Feature[fs.size()];
        return fs.toArray(array);
    }

    public static Relationship[] toOwnedRelationshipArray(Element e) {
        List<Relationship> rels = e.getOwnedRelationship();
        Relationship[] array = new Relationship[rels.size()];
        return rels.toArray(array);
    }

    public static Membership[] toOwnedMembershipArray(Namespace ns) {
        List<Membership> ms = ns.getOwnedMembership();
        Membership[] array = new Membership[ms.size()];
        return ms.toArray(array);
    }

    public static Membership[] toInheritedMembershipArray(Type typ) {
        List<Membership> ms = typ.getInheritedMembership();
        Membership[] array = new Membership[ms.size()];
        return ms.toArray(array);
    }

    public static Specialization[] toOwnedSpecializationArray(Type typ) {
        List<Specialization> ss = typ.getOwnedSpecialization();
        Specialization[] array = new Specialization[ss.size()];
        return ss.toArray(array);
    }

    public static FeatureMembership[] toOwnedFeatureMembershipArray(Feature f) {
        List<FeatureMembership> fms = f.getOwnedFeatureMembership();
        FeatureMembership[] array = new FeatureMembership[fms.size()];
        return fms.toArray(array);
    }

    public static FeatureTyping[] toOwnedTypingArray(Feature f) {
        List<FeatureTyping> ts = f.getOwnedTyping();
        FeatureTyping[] array = new FeatureTyping[ts.size()];
        return ts.toArray(array);
    }

    public static Subsetting[] toOwnedSubsettingArray(Feature f) {
        List<Subsetting> ss = f.getOwnedSubsetting();
        Subsetting[] array = new Subsetting[ss.size()];
        return ss.toArray(array);
    }

    public static Redefinition[] toOwnedRedefinitionArray(Feature f) {
        List<Redefinition> rs = f.getOwnedRedefinition();
        Redefinition[] array = new Redefinition[rs.size()];
        return rs.toArray(array);
    }
    
}
