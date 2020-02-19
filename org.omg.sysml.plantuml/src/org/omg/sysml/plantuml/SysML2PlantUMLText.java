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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Block;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.PartProperty;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.StateActionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;

import com.google.inject.Inject;

public class SysML2PlantUMLText {
    public enum MODE {
        MIXED,
        STRUCTURE,
        STATE_MACHINE,
        ACTIVITY,
        SEQUENCE
    }

    @Inject
    public SysML2PlantUMLText(SysML2PlantUMLLinkProvider linkProvider) {
        this.linkProvider = linkProvider;
    }

    private final SysML2PlantUMLLinkProvider linkProvider;

    private String getLinkStr(EObject eObj) {
        if (linkProvider == null) return null;
        return linkProvider.getLinkString(eObj);
    }

    private MODE diagramMode = MODE.MIXED;

    private void setMode(MODE m) {
        this.diagramMode = m;
    }

    private MODE getMode(EObject eObj) {
        if (eObj instanceof StateUsage) {
            return MODE.STATE_MACHINE;
        } else {
            return MODE.MIXED;
        }
    }

    private boolean skipStructure() {
        return diagramMode != MODE.MIXED;
    }

    private static void quote(StringBuilder sb, String s) {
        if (s.indexOf('"') >= 0) {
            // Replace nonsafe " to ''
            s = s.replace("\"", "''");
        }
        sb.append('"');
        sb.append(s);
        sb.append('"');
    }

    private static boolean isPackage(EObject eObj) {
        return eObj instanceof org.omg.sysml.lang.sysml.Package;
    }

    private List<EObject> setupVisualizationMode(EObject eObj) {
        List<EObject> eObjs = new ArrayList<EObject>(1);
        eObjs.add(eObj);
        MODE mode = getMode(eObj);
        setMode(mode);
        return eObjs;
    }

    private List<? extends EObject> matchMode(EObject eObj) {
        MODE mode = getMode(eObj);
        MODE mc = MODE.MIXED;
        if (eObj instanceof Element) {
            Element e = (Element) eObj;
            for (Element ec: e.getOwnedElement()) {
                MODE m = getMode(ec);
                if (mc == MODE.MIXED) {
                    mc = m;
                } else if (mc != m) {
                    return setupVisualizationMode(e);
                }
            }
            if (mode != mc) {
                // This case "e" has owned elements belonging to the same diagram mode but e is NOT.
                // So we choose the mode for owned elements.  E.g a package has some state machines.
                setMode(mc);
                return e.getOwnedElement();
            }
        }
        return setupVisualizationMode(eObj);
    }

    public List<? extends EObject> setupVisualizationEObjects(EObject eObj) {
        if (eObj == null) return null;
        EObject eObjParent = eObj.eContainer();
        while (eObjParent != null && !isPackage(eObjParent)) {
            eObjParent = eObjParent.eContainer();
        }
        if (eObjParent != null) {
            return matchMode(eObjParent);
            // return setupVisualizationMode(eObjParent);
        }

        if (!isPackage(eObj)) return null;
        return setupVisualizationMode(eObj);
    }

    public String sysML2PUML(List<? extends EObject> eObjs) {
        StringBuilder sb = new StringBuilder("@startuml\n");
        if (!skipStructure()) {
            sb.append("allow_mixing\n");
        }
        
        restTexts.clear();
        idMap.clear();
        pRelations.clear();
        int len = sb.length();

        for (EObject eObj : eObjs) {
            if (eObj instanceof Element) {
                element2P(sb, (Element) eObj, null);
            }
        }
        flushTexts(sb);
        flushPRelations(sb);

        if (len == sb.length()) {
            return null;
        }
        sb.append("\n@enduml");

        return sb.toString();
    }


    private List<StringBuilder> restTexts = new ArrayList<StringBuilder>();

    private StringBuilder newText() {
        StringBuilder sb = new StringBuilder();
        restTexts.add(sb);
        return sb;
    }

    private void flushTexts(StringBuilder sb) {
        for (StringBuilder text : restTexts) {
            sb.append(text);
        }
        restTexts.clear();
    }

    private Map<Element, Integer> idMap = new HashMap<Element, Integer>();

    private boolean checkId(Element e) {
        return idMap.containsKey(e);
    }

    private Integer getId(Element e) {
        Integer ii = idMap.get(e);
        
        if (ii == null) {
            ii = new Integer(idMap.size());
            idMap.put(e, ii);
        }

        return ii;
    }

    private void addIdStr(StringBuilder sb, Element e) {
        if (e == null) {
            sb.append("[*]");
        } else {
            sb.append("Eid");
            sb.append(getId(e));
        }
    }

    private void addLink(StringBuilder sb, EObject eObj) {
        addLink(sb, eObj, null);
    }

    private void addLink(StringBuilder sb, EObject eObj, String txt) {
        String uriStr = getLinkStr(eObj);
        if (uriStr == null) return;
        sb.append("[[");
        sb.append(uriStr);
        sb.append(' ');
        if (txt != null) {
            sb.append(txt);
            sb.append("]]");
        } else {
            sb.append("]] ");
        }
    }

    private void addNameWithId(StringBuilder sb, Element e) {
        quote(sb, e.getName());
        sb.append(" as ");
        addIdStr(sb, e);
        sb.append(' ');
    }

    private static class PRelation {
        public final Element src;
        public final Element dest;
        public final String rel;
        private String description;
        public String getDescription() {
            return description;
        }

        public PRelation(Element src, Element dest, String rel, String description) {
            this.src = src;
            this.dest = dest;
            this.rel = rel;
            this.description = description;
        }
    }

    public boolean isValid(PRelation pr) {
        return checkId(pr.src) && checkId(pr.dest);
    }

    private List<PRelation> pRelations = new ArrayList<PRelation>();

    private PRelation addPRelation(Element src, Element dest, String rel, String description) {
        PRelation pr = new PRelation(src, dest, rel, description);
        pRelations.add(pr);
        return pr;
    }

    private PRelation addPRelation(Element src, Element dest, String rel) {
        return addPRelation(src, dest, rel, null);
    }

    private void flushPRelations(StringBuilder sb) {
        List<PRelation> rest = new ArrayList<PRelation>();

        for (PRelation pr: pRelations) {
            if (((pr.src == null) || checkId(pr.src))
                && ((pr.dest == null) || checkId(pr.dest))) {
                if ((pr.src == null) && (pr.dest == null)) continue;
                addIdStr(sb, pr.src);
                sb.append(pr.rel);
                addIdStr(sb, pr.dest);
                if (pr.getDescription() != null) {
                    sb.append(" : ");
                    sb.append(pr.getDescription());
                }
                sb.append('\n');
                continue;
            }
            rest.add(pr);
        }
        pRelations = rest;
    }

    private void addTrimmedBody(StringBuilder sb, String str) {
        int len = str.length();
        int st = -1;
        int end = -1;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                if (end < 0) end = i;
            } else {
                if (st < 0) st = i;
                end = -1;
            }
            if (c == '\n') {
                if (st >= 0) {
                    if (end < 0) end = i;
                    sb.append(str, st, end);
                }
                sb.append('\n');
                st = end = -1;
            }
        }
        if (st >= 0) {
            if (end < 0) end = len;
            sb.append(str, st, end);
        }
    }


    private void comment2P(StringBuilder sb, Comment c, Element parent) {
        if (checkId(c)) return;
        sb = newText();
        sb.append("note as ");
        addIdStr(sb, c);
        sb.append('\n');
        addLink(sb, c, "@");
        addTrimmedBody(sb, c.getBody());
        sb.append("\nend note ");
        sb.append('\n');
        Element e = c.getCommentedElement();
        if (e == null) {
            if (parent instanceof Annotation) {
                Annotation a = (Annotation) parent;
                e = a.getAnnotatedElement();
            }
        }
        if (e != null) {
            addPRelation(c, e, "..");
        }
    }

    private void annotation2P(StringBuilder sb, Annotation a, Element parent) {
        Comment c = a.getAnnotatingComment();
        if (c == null) return;
        comment2P(sb, c, a);
    }

    private void element2P(StringBuilder sb, Element e, Type parent) {
        if (e instanceof Annotation) {
            annotation2P(sb, (Annotation) e, parent);
        } else if (e instanceof Comment) {
            comment2P(sb, (Comment) e, parent);
        } else if (e instanceof Type) {
            type2P(sb, (Type) e, parent);
        } else if (isPackage(e)) {
            package2P(sb, (org.omg.sysml.lang.sysml.Package) e);
        }
    }

    private void relationship2P(StringBuilder sb, Relationship r, Element parent) {
        if (r instanceof Annotation) {
            annotation2P(sb, (Annotation) r, parent);
        }
    }

    private void featureMembership2P(StringBuilder sb, Type t) {
        for (Membership m: t.getOwnedMembership()) {
            if (m instanceof FeatureMembership) {
                FeatureMembership fm = (FeatureMembership) m;
                Feature f = fm.getMemberFeature();
                type2P(sb, f, t);
            } else {
                Element e = m.getMemberElement();
                element2P(sb, e, t);
            }
            for (Relationship r: m.getOwnedRelationship()) {
                relationship2P(sb, r, m);
            }
        }
    }

    private void membership2P(StringBuilder sb, org.omg.sysml.lang.sysml.Package p) {
        for (Membership m: p.getOwnedMembership()) {
            Element e = m.getMemberElement();
            element2P(sb, e, null);
            for (Relationship r: m.getOwnedRelationship()) {
                relationship2P(sb, r, m);
            }
        }
    }

    private void closeBlock(StringBuilder sbParent, StringBuilder sbChild) {
        if (sbChild.length() == 0) {
            sbParent.append('\n');
        } else {
            sbParent.append("{\n");
            sbParent.append(sbChild);
            sbParent.append("}\n");
        }
    }

    private void owned2P(StringBuilder sb, Element e) {
        StringBuilder sb2 = new StringBuilder();
        if (e instanceof Type) {
            Type parent = (Type) e;
            featureMembership2P(sb2, parent);
        } else if (isPackage(e)) {
            membership2P(sb2, (org.omg.sysml.lang.sysml.Package) e);
            flushTexts(sb2);
        }
        if (skipStructure()) {
            sb.append(sb2);
        } else {
            closeBlock(sb, sb2);
        }
    }

    private void addGeneralizations(StringBuilder sb, Type typ, String rel) {
        for (Generalization g: typ.getOwnedGeneralization()) {
            Type gt = g.getGeneral();
            if (gt.getName() != null) {
                addPRelation(typ, gt, rel);
            }
        }
    }

    private void addState(StringBuilder sb, StateUsage su) {
        if (su instanceof ExhibitStateUsage) return;
        sb.append("state ");
        addNameWithId(sb, su);
        addLink(sb, su);
        // PlantUML cannot properly render nested states if allow_mixing is enabled
        if (diagramMode == MODE.STATE_MACHINE) {
            addMembersInState(sb, su);
        }
        sb.append("\n");
    }

    private Element getEnd(Feature f) {
        for (Subsetting ss: f.getOwnedSubsetting()) {
            return ss.getSubsettedFeature();
        }
        return null;
    }

    private String convertToDescription(AcceptActionUsage aau) {
        StringBuilder sb = new StringBuilder();
        for (FeatureMembership fm: aau.getOwnedFeatureMembership()) {
            Feature f = fm.getMemberFeature();
            if (f instanceof ItemFeature) {
                List<Type> tts = f.getType();
                addTypesText(sb, tts);
            }
        }
        if (sb.length() == 0) return null;
        return sb.toString();
    }

    private String convertToDescription(PerformActionUsage pau) {
        StringBuilder sb = new StringBuilder();
        for (Subsetting ss: pau.getOwnedSubsetting()) {
            Feature f = ss.getSubsettedFeature();
            if (f instanceof ActionUsage) {
                if (ss instanceof Redefinition) {
                    sb.insert(0, "/ ");
                    sb.insert(0, f.getName());
                } else {
                    sb.append(f.getName());
                    sb.append(' ');
                }
            }
        }
        if (sb.length() == 0) return null;
        return sb.toString();
    }

    private PRelation addSuccession(Succession ss) {
        Element src = null;
        Element dest = null;
        for (FeatureMembership fm2: ss.getOwnedFeatureMembership()) {
            Feature f2 = fm2.getMemberFeature();
            if (f2 instanceof SourceEnd) {
                if (src == null) {
                    src = getEnd(f2);
                }
            } else {
                if (dest == null) {
                    dest = getEnd(f2);
                }
            }
        }

        if (!(src instanceof StateUsage)) {
            src = null;
        }
        if (!(dest instanceof StateUsage)) {
            dest = null;
        }
        if ((src == null) && (dest == null)) return null;
        return addPRelation(src, dest, "-->", null);
    }

    private void addTransition(StringBuilder sb, TransitionUsage tu) {
        String description  = null;
        for (FeatureMembership fm: tu.getOwnedFeatureMembership()) {
            Feature f = fm.getMemberFeature();
            if (f instanceof AcceptActionUsage) {
                description = convertToDescription((AcceptActionUsage) f);
            }
        }
        Feature src = tu.getSource();
        Feature tgt = tu.getTarget();
        if ((src != null) && (tgt != null)) {
            addPRelation(src, tgt, "-->", description);
        }
    }

    private void addMembersInState(StringBuilder sb, StateUsage su) {
        StringBuilder sb2 = new StringBuilder();
        List<String> descriptions = null;
        for (FeatureMembership fm: su.getOwnedFeatureMembership()) {
            Feature f = fm.getMemberFeature();
            if (fm instanceof StateActionMembership) {
                if (f instanceof PerformActionUsage) {
                    String desc = convertToDescription((PerformActionUsage) f);
                    if (desc != null) {
                        if (descriptions == null) {
                            descriptions = new ArrayList<String>();
                        }
                        descriptions.add(desc);
                    }
                }
            } else {
                if (f instanceof StateUsage) {
                    addState(sb2, (StateUsage) f);
                } else if (f instanceof TransitionUsage) {
                    addTransition(sb2, (TransitionUsage) f);
                } else if (f instanceof Succession) {
                    addSuccession((Succession) f);
                }
            }
        }
        if (descriptions != null) {
            int size = descriptions.size();
            if (sb2.length() > 0) {
                closeBlock(sb, sb2);
                sb.append("state ");
                addNameWithId(sb, su);
            }
            int i = 0;
            for (;;) {
                sb.append(" : ");
                sb.append(descriptions.get(i));
                sb.append('\n');
                i++;
                if (i >= size) break;

                sb.append("state ");
                addNameWithId(sb, su);
            }
        } else {
            closeBlock(sb, sb2);
        }
        flushPRelations(sb);
    }

    private void addType(StringBuilder sb, Type typ, Type parent) {
        if (typ instanceof StateUsage) {
            StateUsage su = (StateUsage) typ;
            if ((parent == null) || (su.isComposite())) {
                addState(sb, (StateUsage) typ);
            }
            return;
        }
        if (!skipStructure()) {
            sb.append("class ");
            addNameWithId(sb, typ);
            if (typ instanceof Block) {
                sb.append(" << (B,green) >> ");
                addGeneralizations(sb, typ, "--|>");
            } else if (typ instanceof Class) {
                addGeneralizations(sb, typ, "--|>");
            } else if (typ instanceof PartProperty) {
                sb.append(" << (P,lightgreen) >> ");
                addGeneralizations(sb, typ, "..|>");
            } else if (typ instanceof Feature) {
                sb.append(" << (F,yellow) >> ");
                addGeneralizations(sb, typ, "..|>");
            } else {
                sb.append(" << (T,blue) >> ");
            }
            addLink(sb, typ);
        }
        owned2P(sb, typ);
    }

    private void addTypesText(StringBuilder sb, List<Type> tts) {
        boolean first = true;
        for (Type tt: tts) {
            String name = tt.getName();
            if (name == null) continue;
            if (first) {
            	first = false;
            } else {
                sb.append(',');
            }
            sb.append(name);
        } 
    }

    private void type2P(StringBuilder sb, Type typ, Type parent) {
        if (typ == null) return;
        String name = typ.getName();
        if (name == null) return;

        if ((parent != null) && !skipStructure()) {
            if (typ instanceof PartProperty) {
                sb = newText();
                addPRelation(parent, typ, "*--");
            } else if (typ instanceof Classifier) {
                sb = newText();
                addPRelation(parent, typ, "+--");
            } else if (typ instanceof Feature) {
                sb.append(typ.getName());
                Feature f = (Feature) typ;
                List<Type> tts = f.getType();
                if (!tts.isEmpty()) {
                    sb.append(" :");
                    addTypesText(sb, tts);
                }
                sb.append("\n");
                return;
            }
        }

        addType(sb, typ, parent);
    }

    private void package2P(StringBuilder sb, org.omg.sysml.lang.sysml.Package pkg) {
        if (!skipStructure()) {
            sb.append("package ");
            quote(sb, pkg.getName());
            sb.append(' ');
            addLink(sb, pkg);
        }
        owned2P(sb, pkg);
    }
}
