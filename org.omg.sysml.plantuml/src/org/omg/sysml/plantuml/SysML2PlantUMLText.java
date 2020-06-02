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
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Block;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.PartProperty;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceProperty;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

import com.google.inject.Inject;

public class SysML2PlantUMLText {
    public enum MODE {
        Default,
        Tree,
        StateMachine,
        Interconnection,
        Activity,
        Sequence,
        MIXED;
    }

    public static class StyleSwitch {
        public final StyleRelSwitch styleRelSwitch;
        public final StyleStereotypeSwitch styleStereotypeSwitch;

        public void setComposite(boolean flag) {
            if (styleStereotypeSwitch == null) return;
            styleStereotypeSwitch.setComposite(flag);
        }

        public StyleSwitch(StyleRelSwitch styleRelSwitch,
                           StyleStereotypeSwitch styleStereotypeSwitch) {
            this.styleRelSwitch = styleRelSwitch;
            this.styleStereotypeSwitch = styleStereotypeSwitch;
        }
    }

    public static abstract class StyleRelSwitch extends SysMLSwitch<String> {
    }

    public static abstract class StyleStereotypeSwitch extends SysMLSwitch<String> {
        protected boolean isComposite = false;
        public void setComposite(boolean flag) {
            this.isComposite = flag;
        }
        protected String defaultStr() {
            return " <<";
        }
    }

    public class StyleRelDefaultSwitch extends StyleRelSwitch {
		@Override
        public String caseFeatureTyping(FeatureTyping e) {
            return " --:|> ";
        }

		@Override
		public String caseRedefinition(Redefinition object) {
            return "--||>";
		}

		@Override
		public String caseConnector(Connector object) {
            return " -[thickness=3]- ";
		}

		@Override
		public String caseComment(Comment object) {
            if (isDottedComment()) {
                return " .. ";
            } else {
                return " --> ";
            }
		}

		@Override
		public String caseTransitionUsage(TransitionUsage object) {
            return "  --> ";
		}

		@Override
		public String caseClassifier(Classifier object) {
            return " +-- ";
		}

		@Override
		public String caseReferenceProperty(ReferenceProperty object) {
            return " o-- ";
		}

		@Override
		public String casePartProperty(PartProperty object) {
            return " *-- ";
		}

		@Override
		public String caseBindingConnector(BindingConnector object) {
            return " -[thickness=5]- ";
		}

		@Override
		public String caseGeneralization(Generalization object) {
            return " --|> ";
		}
    }

    public class StyleStereotypeDefaultSwitch extends StyleStereotypeSwitch {
		@Override
		public String caseClass(Class object) {
            if (isComposite) return defaultStr();
            if (SysMLPackage.Literals.CLASS.equals(object.eClass())) return " ";
            return null;
		}

		@Override
		public String casePartProperty(PartProperty object) {
            if (isComposite) return " ";
            return " <<part>> ";
		}
    }

    private final Set<SysML2PlantUMLStyle> styles = EnumSet.noneOf(SysML2PlantUMLStyle.class);
    private StyleSwitch styleSwitch;
    private final StyleSwitch styleDefaultSwitch = new StyleSwitch(new StyleRelDefaultSwitch(),
                                                                   new StyleStereotypeDefaultSwitch());

    public void addStyle(SysML2PlantUMLStyle style) {
        styles.add(style);
        if (style.styleSwitch != null) {
            styleSwitch = style.styleSwitch;
        }
    }

    public void clearStyle() {
        styles.clear();
        styleSwitch = null;
    }

    private String getRelStyle(Element e) {
        String ret;
        if ((styleSwitch != null)
            && (styleSwitch.styleRelSwitch != null)) {
            ret = styleSwitch.styleRelSwitch.doSwitch(e);
            if (ret != null) return ret;
        }
        return styleDefaultSwitch.styleRelSwitch.doSwitch(e);
    }

    private String getStereotypeStyle(Element e) {
        String ret;
        if ((styleSwitch != null)
            && (styleSwitch.styleStereotypeSwitch != null)) {
            ret = styleSwitch.styleStereotypeSwitch.doSwitch(e);
            if (ret != null) return ret;
        }
        return styleDefaultSwitch.styleStereotypeSwitch.doSwitch(e);
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

    private String getText(EObject eObj) {
        if (eObj == null) return null;
        if (linkProvider == null) {
            return eObj.toString();
        }
        return linkProvider.getText(eObj);
    }

    private MODE diagramMode = MODE.Default;

    public void setMode(MODE m) {
        if (m != MODE.Default) {
            this.diagramMode = m;
        }
    }

    private MODE getMode(EObject eObj) {
        if (eObj instanceof StateUsage) {
            return MODE.StateMachine;
        } else {
            return MODE.MIXED;
        }
    }

    private boolean classicStyle = true;

    public void setClassicStyle(boolean flag) {
        this.classicStyle = flag;
    }

    public boolean isClassic() {
        return !classicStyle;
    }

    private boolean skipStructure() {
        return (diagramMode == MODE.StateMachine);
    }

    /* If at least in StateMachine mode, ".." comment does not work. */
    private boolean isDottedComment() {
        return (diagramMode != MODE.StateMachine);
    }

    private boolean isComposite() {
        return diagramMode == MODE.Interconnection;
    }

    private void initStyle() {
        if (styles.isEmpty()) {
            clearStyle();
            addStyle(SysML2PlantUMLStyle.DEFAULT);
        }
        if (styleSwitch != null) {
            styleSwitch.setComposite(isComposite());
        }
        styleDefaultSwitch.setComposite(isComposite());
    }

    private boolean showsMultiplicity() {
        return (diagramMode != MODE.Interconnection) && !skipStructure();
    }

    private static void quote0(StringBuilder sb, String s) {
        if (s.indexOf('"') >= 0) {
            // Replace nonsafe " to ''
            s = s.replace("\"", "''");
        }
        sb.append(s);
    }

    private static void quote(StringBuilder sb, String s) {
        sb.append('"');
        quote0(sb, s);
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

    private void addStyleHeader(StringBuilder sb) {
        for (SysML2PlantUMLStyle style: styles) {
            sb.append(style.commandStr);
        }
        sb.append('\n');
    }

    public String sysML2PUML(List<? extends EObject> eObjs) {
        initStyle();
        StringBuilder sb = new StringBuilder();
        if (!skipStructure()) {
            sb.append("allow_mixing\n");
        }

        if (diagramMode == MODE.Interconnection) {
            sb.append("skinparam ranksep 8\n");
            sb.append("skinparam rectangle {\n backgroundColor<<block>> LightGreen\n}\n");
        }

        addStyleHeader(sb);
        
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

    private void addNameWithId(StringBuilder sb, Element e, String name) {
        quote(sb, name);
        sb.append(" as ");
        addIdStr(sb, e);
        sb.append(' ');
    }

    private void addNameWithId(StringBuilder sb, Element e) {
        addNameWithId(sb, e, e.getName());
    }

    private static class PRelation {
        public final Element src;
        public final Element dest;
        public final Element rel;

        private String description;
        public String getDescription() {
            return description;
        }

        public PRelation(Element src, Element dest, Element rel, String description) {
            this.src = src;
            this.dest = dest;
            this.rel = rel;
            this.description = description;
        }
    }

    private String relString(Element rel) {
        String val = getRelStyle(rel);
        if (val == null) {
            throw new IllegalArgumentException("The edge:" + rel + "is not supported.");
        }
        return val;
    }

    public boolean isValid(PRelation pr) {
        return checkId(pr.src) && checkId(pr.dest);
    }

    private List<PRelation> pRelations = new ArrayList<PRelation>();

    private PRelation addPRelation(Element src, Element dest, Element rel, String description) {
        PRelation pr = new PRelation(src, dest, rel, description);
        pRelations.add(pr);
        return pr;
    }

    private PRelation addPRelation(Element src, Element dest, Element rel) {
        return addPRelation(src, dest, rel, null);
    }

    private void addMultiplicityString(StringBuilder sb, Element e) {
        if (!showsMultiplicity()) return;
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
                quote0(sb, exu);
                sb.append('"');
                return;
            }
            if ((exu == null) || (exl.equals(exu))) {
                sb.append('"');
                quote0(sb, exl);
                sb.append('"');
                return;
            }
            if ("0".equals(exl) && "*".equals(exu)) {
                sb.append("\"*\"");
            } else {
                sb.append('"');
                quote0(sb, exl);
                sb.append("..");
                quote0(sb, exu);
                sb.append('"');
            }
        }
    }

    private void flushPRelations(StringBuilder sb) {
        List<PRelation> rest = new ArrayList<PRelation>();

        for (PRelation pr: pRelations) {
            if (((pr.src == null) || checkId(pr.src))
                && ((pr.dest == null) || checkId(pr.dest))) {
                if ((pr.src == null) && (pr.dest == null)) continue;
                addIdStr(sb, pr.src);

                // addMultiplicityString(sb, pr.src);
                
                sb.append(relString(pr.rel));

                addMultiplicityString(sb, pr.rel);

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
            addPRelation(c, e, c);
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

    private void closeBlock(StringBuilder sbParent, StringBuilder sbChild, String endStr) {
        if (sbChild.length() == 0) {
            sbParent.append('\n');
        } else {
            sbParent.append("{\n");
            sbParent.append(sbChild);
            sbParent.append(endStr);
            sbParent.append("}\n");
        }
    }

    private StringBuilder child2P(Element e) {
        StringBuilder sb = new StringBuilder();
        if (e instanceof Type) {
            Type parent = (Type) e;
            featureMembership2P(sb, parent);
        } else if (isPackage(e)) {
            membership2P(sb, (org.omg.sysml.lang.sysml.Package) e);
            flushTexts(sb);
        }
        return sb;
    }

    private void owned2P(StringBuilder sb, Element e, String endStr) {
        if (skipStructure()) {
            sb.append(child2P(e));
        } else {
            closeBlock(sb, child2P(e), endStr);
        }
    }

    private void addGeneralizations(StringBuilder sb, Type typ) {
        for (Generalization g: typ.getOwnedGeneralization()) {
            Type gt = g.getGeneral();
            if (gt.getName() == null) continue;
            addPRelation(typ, gt, g);
        }
    }

    private void addState(StringBuilder sb, StateUsage su) {
        if (su instanceof ExhibitStateUsage) return;
        sb.append("state ");
        addNameWithId(sb, su);
        addLink(sb, su);
        // PlantUML cannot properly render nested states if allow_mixing is enabled
        if (diagramMode == MODE.StateMachine) {
            addMembersInState(sb, su);
        }
        sb.append("\n");
    }

    private Element getEnd(Feature f) {
        if (f == null) return null;
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
                addTypeText(sb, "", f);
            }
        }
        if (sb.length() == 0) return null;
        return sb.toString();
    }

    private Redefinition getRedefinition(Feature f) {
        List<Redefinition> rs = f.getOwnedRedefinition();
        if (rs.isEmpty()) return null;
        return rs.get(0);
    }

    private String convertToDescription(StateSubactionMembership sam, PerformActionUsage pau) {
        StringBuilder sb = new StringBuilder();
        // Bold
        sb.append("**");
        sb.append(sam.getKind().getName());
        sb.append("**/ ");
        for (Subsetting ss: pau.getOwnedSubsetting()) {
            Feature f = ss.getSubsettedFeature();
            if (f instanceof ActionUsage) {
                if (!(ss instanceof Redefinition)) {
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
        return addPRelation(src, dest, ss);
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
            addPRelation(src, tgt, tu, description);
        }
    }

    private void addMembersInState(StringBuilder sb, StateUsage su) {
        StringBuilder sb2 = new StringBuilder();
        List<String> descriptions = null;
        for (FeatureMembership fm: su.getOwnedFeatureMembership()) {
            Feature f = fm.getMemberFeature();
            if (fm instanceof StateSubactionMembership) {
                if (f instanceof PerformActionUsage) {
                	StateSubactionMembership sam = (StateSubactionMembership) fm;
                    PerformActionUsage pau = (PerformActionUsage) f;
                    String desc = convertToDescription(sam, pau);
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
                closeBlock(sb, sb2, "");
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
            closeBlock(sb, sb2, "");
        }
    }

    private void addConnector(StringBuilder sb, Connector c) {
        List<Feature> ends = c.getConnectorEnd();
        int size = ends.size();
        if (size >= 2) {
            Element end1 = getEnd(ends.get(0));
            if (end1 == null) return;
            for (int i = 1; i < size; i++) {
                Element end2 = getEnd(ends.get(i));
                if (end2 == null) continue;
                addPRelation(end1, end2, c);
            }
        }
    }

    private String extractName(Element e) {
        if (!(e instanceof Feature)) {
            return e.getName();
        }
        Feature f = (Feature) e;
        String name = getFeatureName(f);
        List<Type> tt = f.getType();
        if (tt.isEmpty()) return name;
        Type typ = tt.get(0);
        if (typ == null) return name;
        String typeName = typ.getName();
        if (typeName == null) return typeName;
        return name + ": " + typeName;
    }

    private String getStereotypeName(Type typ) {
        String str = typ.eClass().getName();
        if (str == null) return "";
        if (str.isEmpty()) return str;

        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    private String styleString(Type typ) {
        String ret = getStereotypeStyle(typ);
        if (ret == null) {
            return " <<(T,blue)" + getStereotypeName(typ) + ">> ";
        }
        if (ret.endsWith(" ")) return ret;
        return ret + getStereotypeName(typ) + ">> ";
    }

    private void addType(StringBuilder sb, Type typ, Type parent) {
        if (typ instanceof StateUsage) {
            StateUsage su = (StateUsage) typ;
            if ((parent == null) || (su.isComposite())) {
                addState(sb, (StateUsage) typ);
            }
            return;
        }
        if (skipStructure()) {
            owned2P(sb, typ, "");
        } else {
            String keyword = "class ";
            String style = styleString(typ);
            String name = extractName(typ);
            if (typ instanceof Block) {
                if (diagramMode == MODE.Interconnection) {
                    keyword = "rectangle ";
                }
                addGeneralizations(sb, typ);
            } else if (typ instanceof Class) {
                if (diagramMode == MODE.Interconnection) {
                    keyword = "rectangle ";
                }
                addGeneralizations(sb, typ);
            } else if (typ instanceof PartProperty) {
                if (diagramMode == MODE.Interconnection) {
                    keyword = "rectangle ";
                }
                addGeneralizations(sb, typ);
            } else if (typ instanceof Connector) {
                addConnector(sb, (Connector) typ);
                return;
            } else if (typ instanceof PortUsage) {
                if (diagramMode == MODE.Interconnection) {
                    StringBuilder sb2 = child2P(typ);
                    if (sb2.length() > 0) {
                        keyword = "rectangle ";
                    } else {
                        keyword = "port ";
                    }

                    sb.append(keyword);
                    addNameWithId(sb, typ, name);
                    sb.append(style);
                    addLink(sb, typ);

                    closeBlock(sb, sb2, "");
                    return;
                }
            } else if (typ instanceof Feature) {
                addGeneralizations(sb, typ);
                if (diagramMode == MODE.Interconnection) {
                    if (!(typ instanceof Usage)) return;
                    if (name == null) return;
                    Feature f = (Feature) typ;
                    StringBuilder namesb = new StringBuilder();
                    addFeatureText(namesb, f);
                    if (namesb.length() == 0) return;
                    sb.append("rectangle ");
                    addNameWithId(sb, f, namesb.toString());
                    addLink(sb, f);
                    owned2P(sb, typ, "");
                    return;
                }
            } else {
                if (diagramMode == MODE.Interconnection) return;
            }
            if (name == null) return;
            sb.append(keyword);
            addNameWithId(sb, typ, name);
            sb.append(style);
            addLink(sb, typ);

            if (diagramMode == MODE.Interconnection) {
                owned2P(sb, typ, "");
            } else {
                owned2P(sb, typ, "--\n"); // Explicitly add class separator
            }
        }
    }

    private void addTypeText(StringBuilder sb, String prefix, Feature f) {
        List<Type> ts = f.getType();
        if (ts.isEmpty()) return;
        // getType() should return the most specific type but for the time being we use the first type only.
        Type t = ts.get(0);
        String name = t.getName();
        if (name == null) return;
        sb.append(prefix);
        sb.append(name);
    }

    private FeatureValue getFeatureValue(Feature f) {
        // TODO: Multiple Feature Value.
        for (FeatureMembership fm: f.getOwnedFeatureMembership()) {
            if (fm instanceof FeatureValue) return (FeatureValue) fm;
        }
        return null;
    }

    private boolean addFeatureValueText(StringBuilder sb, Feature f) {
        FeatureValue fv = getFeatureValue(f);
        if (fv == null) return false;
        String text = getText(fv);
        if (text == null) return false;
        sb.append('=');
        text = text.replace("\r", "");
        text = text.replace("\n", "\\n");
        sb.append(text);
        return true;
    }

    private Feature getRedefinedFeature(Feature f) {
        Redefinition rd = getRedefinition(f);
        if (rd == null) return null;
        return rd.getRedefinedFeature();
    }

    private boolean addRedefinedFeatureText(StringBuilder sb, Feature f) {
        Feature rf = getRedefinedFeature(f);
        if (rf == null) return false;
        String name = getFeatureName(rf);
        if (name == null) return false;

        org.omg.sysml.lang.sysml.Package pkg = rf.getOwningNamespace();
        String pkgName;
        if (pkg != null) {
            pkgName = pkg.getName();
        } else {
            pkgName = null;
        }

        // waved decoration for redefinition
        sb.append("\\n//:>>");
        if (pkgName != null) {
            sb.append(pkgName);
            sb.append("::");
        }
        sb.append(name);
        sb.append("// ");
        return true;
    }

    private String getFeatureName(Feature f) {
        while (f != null) {
            String name = f.getName();
            if (name != null) return name;
            f = getRedefinedFeature(f);
        }
        return null;
    }

    private boolean addFeatureText(StringBuilder sb, Feature f) {
        String name = getFeatureName(f);
        if (name == null) return false;
        sb.append(name);
        addTypeText(sb, ": ", f);
        addFeatureValueText(sb, f);
        addRedefinedFeatureText(sb, f);
        return true;
    }

    private void type2P(StringBuilder sb, Type typ, Type parent) {
        if (typ == null) return;

        if (diagramMode == MODE.Interconnection) {
            if (parent instanceof Step) return; // TODO
        } else if ((parent != null) && !skipStructure()) {
            if (typ instanceof PartProperty) {
                sb = newText();
                addPRelation(parent, typ, typ);
            } else if (typ instanceof ReferenceProperty) {
                ReferenceProperty rp = (ReferenceProperty) typ;
                for (FeatureTyping ft: rp.getTyping()) {
                    Type t = ft.getType();
                    if (t != null) {
                        addPRelation(parent, t, typ, typ.getName());
                    }
                }
                return;
            } else if (typ instanceof Classifier) {
                sb = newText();
                addPRelation(parent, typ, typ);
            } else if (typ instanceof Feature) {
                if (addFeatureText(sb, (Feature) typ)) sb.append('\n');

                return;
            }
        }

        addType(sb, typ, parent);
    }

    private void package2P(StringBuilder sb, org.omg.sysml.lang.sysml.Package pkg) {
        String name = pkg.getName();
        if (!((name == null) || skipStructure())) {
            sb.append("package ");
            quote(sb, name);
            sb.append(' ');
            addLink(sb, pkg);
        }
        owned2P(sb, pkg, "");
    }
}
