/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2022 Mgnite Inc.
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

import com.google.inject.Inject;

public class SysML2PlantUMLText {
    public enum MODE {
        Default,
        Tree,
        State,
        Interconnection,
        Action,
        Sequence,
        Case,
        MIXED;
    }

    private final List<SysML2PlantUMLStyle> styles = new ArrayList<SysML2PlantUMLStyle>();
    private final Map<String, String> styleValueMap = new HashMap<String, String>();
    private StyleSwitch styleSwitch;
    private final StyleSwitch styleDefaultSwitch = new StyleSwitch(new SysML2PlantUMLStyle.StyleRelDefaultSwitch(),
                                                                   new SysML2PlantUMLStyle.StyleStereotypeDefaultSwitch());

    private void enableStyle() {
        styleSwitch = null;
        styleValueMap.clear();
        for (int i = 0; i < styles.size(); i++) {
            SysML2PlantUMLStyle style = styles.get(i);
            if (style.styleSwitch != null) {
                styleSwitch = style.styleSwitch;
            }
            if (style.options != null) {
                styleValueMap.putAll(style.options);
            }
        }
    }

    private void resetStyle(SysML2PlantUMLStyle style) {
        if (!style.isPrimary()) return;
        SysML2PlantUMLStyle[] ss = new SysML2PlantUMLStyle[styles.size()];
        ss = styles.toArray(ss);
        for (int i = 0; i < ss.length; i++) {
            SysML2PlantUMLStyle s = ss[i];
            if (s.isPrimary()) {
                styles.remove(i);
            }
        }
    }

    public void addStyle(SysML2PlantUMLStyle style) {
        resetStyle(style);
        styles.add(style);
        enableStyle();
    }

    public void removeStyle(SysML2PlantUMLStyle style) {
        resetStyle(style);
        styles.remove(style);
        enableStyle();
    }

    public boolean isStyleEnabled(SysML2PlantUMLStyle style) {
        initStyle();
    	return styles.contains(style);
    }

    public void clearStyle() {
        styles.clear();
        styleSwitch = null;
        styleValueMap.clear();
    }

    private SysML2PlantUMLStyle getVisitorStyle() {
        if (currentVisitor == null) return null;
        return currentVisitor.getStyle();
    }

    /* used by Visitor */
    String getRelStyle(Element e) {
        String ret;
        SysML2PlantUMLStyle vStyle = getVisitorStyle();
        if (vStyle != null) {
            StyleSwitch ss = vStyle.styleSwitch;
            if ((ss != null) && (ss.styleRelSwitch != null)) {
                ret = ss.styleRelSwitch.doSwitch(e);
                if (ret != null) return ret;
            }
        }
        if ((styleSwitch != null)
            && (styleSwitch.styleRelSwitch != null)) {
            ret = styleSwitch.styleRelSwitch.doSwitch(e);
            if (ret != null) return ret;
        }
        return styleDefaultSwitch.styleRelSwitch.doSwitch(e);
    }

    private String getStereotypeStyle(Element e) {
        String ret;
        SysML2PlantUMLStyle vStyle = getVisitorStyle();
        if (vStyle != null) {
            StyleSwitch ss = vStyle.styleSwitch;
            if ((ss != null) && (ss.styleStereotypeSwitch != null)) {
                ret = ss.styleStereotypeSwitch.doSwitch(e);
                if (ret != null) return ret;
            }
        }
        if ((styleSwitch != null)
            && (styleSwitch.styleStereotypeSwitch != null)) {
            ret = styleSwitch.styleStereotypeSwitch.doSwitch(e);
            if (ret != null) return ret;
        }
        return styleDefaultSwitch.styleStereotypeSwitch.doSwitch(e);
    }

    private static Pattern patCamelBoundary = Pattern.compile("(?<=[A-Z])(?=[A-Z][a-z])|(?<=[^A-Z])(?=[A-Z])|(?<=[A-Za-z])(?=[^A-Za-z])");
    private static String convertCamelName(String cName) {
        return patCamelBoundary.matcher(cName).replaceAll(" ").toLowerCase();
    }

    private static Pattern patMetaclassName = Pattern.compile("^((Enum)(?>eration)|(\\p{L}+?))(Definition|Usage|AsUsage)$");
    public static String getStereotypeName(Type typ) {
        EClass eCls = typ.eClass();
        String str = eCls.getName();
        if (str == null) return "";
        if (str.isEmpty()) return str;
        Matcher m = patMetaclassName.matcher(str);
        if (m.matches()) {
            str = m.group(2);
            if (str == null) {
                str = m.group(3);
            }
            if ("Definition".equals(m.group(4))) {
                str = str + " def";
            }
        }

        return convertCamelName(str);
    }

    private String individualPrefix(Type typ) {
        if (typ instanceof OccurrenceUsage) {
            OccurrenceUsage ou = (OccurrenceUsage) typ;
            String str;
            PortionKind pk = ou.getPortionKind();
            if (pk == PortionKind.TIMESLICE) {
                str = " timeslice";
            } else if (pk == PortionKind.SNAPSHOT) {
                str = " snapshot";
            } else {
                str = "";
            }
            if (ou.isIndividual()) {
                return " individual" + str;
            } else {
                return str;
            }
        } else if (typ instanceof OccurrenceDefinition) {
            OccurrenceDefinition od = (OccurrenceDefinition) typ;
            if (od.isIndividual()) {
                return " individual";
            }
        }
        return "";
    }

    String styleString(Type typ) {
        String ret = getStereotypeStyle(typ);
        if (ret == null) {
            ret = " <<(T,blue)" + individualPrefix(typ);
        } else if (" ".equals(ret)) {
            return ret;
        } else if (!ret.startsWith("<<")) {
            ret = "<<" + individualPrefix(typ) + ret;
        }

        if (typ instanceof Usage) {
            Usage u = (Usage) typ;
            if (u.isVariation()) {
                if (ret.equals(" ")) {
                    return " <<variation>> ";
                }
                ret = " <<variation>>\\n" + ret;
            }
        }
        if (ret.endsWith(" ")) return ret;
        return ret + " " + getStereotypeName(typ) + ">> ";
    }

    String styleValue(String key) {
        return styleValueMap.get(key);
    }

    @Inject
    public SysML2PlantUMLText(SysML2PlantUMLLinkProvider linkProvider) {
        this.linkProvider = linkProvider;
    }

    private final SysML2PlantUMLLinkProvider linkProvider;

    String getLinkStr(EObject eObj) {
        if (linkProvider == null) return null;
        return linkProvider.getLinkString(eObj);
    }

    String getText(EObject eObj) {
        if (eObj == null) return null;
        if (linkProvider == null) {
            return eObj.toString();
        }
        return linkProvider.getText(eObj);
    }

    private MODE diagramMode = MODE.Default;

    public void setMode(MODE m) {
        if ((m != null) && (m != MODE.Default)) {
            this.diagramMode = m;
        }
    }

    private Visitor createVisitor() {
        switch (diagramMode) {
        case State:
            return new VStateMachine();
        case Interconnection:
            return new VComposite();
        case Tree:
			return new VTree();
        case Action:
			return new VAction();
        case Sequence:
        	return new VSequence();
        case Case:
            return new VCase();
        case MIXED:
        	return new VMixed();
		default:
			return new VTree();
        }
    }

    private Visitor currentVisitor;
    private Visitor initVisitor() {
        Visitor v = createVisitor();
        this.currentVisitor = v;
        SysML2PlantUMLStyle vStyle = getVisitorStyle();
        if (vStyle != null) {
            if (vStyle.options != null) {
                styleValueMap.putAll(vStyle.options);
            }
        }
        return v;
    }

    private MODE getMode(EObject eObj) {
        if ((eObj instanceof CaseUsage)
            || (eObj instanceof CaseDefinition)) {
            return MODE.Case; 
        } else if (eObj instanceof StateUsage) {
            return MODE.State;
        } else if (eObj instanceof ActionUsage) {
            return MODE.Action;
        } else if ((eObj instanceof OccurrenceDefinition)
                   && !(eObj instanceof ActionDefinition)
                   && !(eObj instanceof ItemDefinition)
                   && !(eObj instanceof PortDefinition)) {
            return MODE.Sequence;
        } else {
            return MODE.MIXED;
        }
    }

    private void initStyle() {
        if (styles.isEmpty()) {
            clearStyle();
            addStyle(SysML2PlantUMLStyle.getDefault());
        }
    }

    private static boolean isNamespace(EObject eObj) {
        return eObj instanceof org.omg.sysml.lang.sysml.Namespace;
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
        while (eObjParent != null && !isNamespace(eObjParent)) {
            eObjParent = eObjParent.eContainer();
        }
        if (eObjParent != null) {
            return matchMode(eObjParent);
            // return setupVisualizationMode(eObjParent);
        }

        if (!isNamespace(eObj)) return null;
        return setupVisualizationMode(eObj);
    }

    private void addStyleHeader(StringBuilder sb) {
        SysML2PlantUMLStyle s = getVisitorStyle();
        if (s != null) {
            sb.append(s.commandStr);
        }
        for (SysML2PlantUMLStyle style: styles) {
            sb.append(style.commandStr);
        }
        sb.append('\n');
    }

    public String sysML2PUML(List<? extends EObject> eObjs) {
        initStyle();
        this.vpath = new VPath();
        vpath.setSysML2PlantUMLText(this);
        Visitor v = initVisitor();
        v.setSysML2PlantUMLText(this);
        StringBuilder sb = new StringBuilder();

        addStyleHeader(sb);
        
        init();

        for (EObject eObj : eObjs) {
            if (eObj instanceof Element) {
                Element e = (Element) eObj;
                vpath.visit(e);
            }
        }
        vpath.init();
        for (EObject eObj : eObjs) {
            if (eObj instanceof Element) {
                Element e = (Element) eObj;
                setInherited(false);
                v.visit(e);
            }
        }
        sb.append(v.getString());
        return sb.toString();
    }

    private VPath vpath;

    VPath getVPath() {
        return vpath;
    }
    
    private int idCounter;
    private IDMap idMap;

    // element 1<-* id 1<-* path(feature, featureChain, featureChainExpression, ItemFlowEnd)
    private class IDMap {    	
        private final Map<Element, Integer> idMap = new HashMap<Element, Integer>();
        private final IDMap prev;

        boolean checkId(Element e) {
            if (idMap.containsKey(e)) return true;
            if (prev == null) return false;
            return prev.checkId(e);
        }

        private Integer lookupId(Element e) {
            Integer ii = idMap.get(e);
            if (ii != null) return ii;
            if (prev == null) return null;
            return prev.lookupId(e);
        }

        Integer newId(Element e) {
            Integer ii = idCounter++;
            idMap.put(e, ii);
            if (vpath != null) {
                vpath.setId(e, ii);
            }
            return ii;
        }

        Integer getId(Element e) {
            Integer ii = lookupId(e);
            if (ii == null) return newId(e);
            return ii;
        }

        IDMap push() {
            return new IDMap(this);
        }

        IDMap pop(boolean keep) {
            if (prev == null) {
                throw new IllegalStateException();
            }
            if (keep) {
                Map<Element, Integer> idMap2 = prev.idMap;
                for (Map.Entry<Element, Integer> ent : idMap.entrySet()) {
                    Element e = ent.getKey();
                    if (idMap2.containsKey(e)) continue;
                    idMap2.put(e, ent.getValue());
                }
            }
            return prev;
        }

        private IDMap(IDMap prev) {
            this.prev = prev;
        }

        IDMap() {
            this.prev = null;
        }
    }

    boolean checkId(Element e) {
        return idMap.checkId(e);
    }

    void pushIdMap() {
        idMap = idMap.push();
    }

    void popIdMap(boolean keep) {
        idMap = idMap.pop(keep);
    }

    Integer newId(Element e) {
        return idMap.newId(e);
    }

    Integer getId(Element e) {
        return idMap.getId(e);
    }

    private boolean inherited;
    void setInherited(boolean flag) {
        this.inherited = flag;
    }
    boolean isInherited() {
        return inherited;
    }

    private void init() {
        idCounter = 1;
        this.idMap = new IDMap();
        this.namespaces = new ArrayList<>();
        this.inheritingIdices = new ArrayList<>();
    }

    private List<Namespace> namespaces;
    private List<Integer> inheritingIdices;

    
    void pushNamespace(Namespace ns) {
        namespaces.add(ns);
    }

    void inheriting() {
        inheritingIdices.add(namespaces.size() - 1);
    }

    void popNamespace() {
        int idx = namespaces.size() - 1;
        namespaces.remove(idx);
        int sizeI = inheritingIdices.size();
        if (sizeI == 0) return;
        sizeI--;
        int idxI = inheritingIdices.get(sizeI);
        if (idxI == idx) {
            inheritingIdices.remove(sizeI);
        }
    }

    InheritKey makeInheritKey(Feature ref) {
        return InheritKey.construct(namespaces, inheritingIdices, ref);
    }

    InheritKey makeInheritKey(Membership ref) {
        return InheritKey.construct(namespaces, inheritingIdices, ref);
    }

    boolean matchCurrentInheritings(InheritKey ik) {
        return InheritKey.match(ik, namespaces, inheritingIdices);
    }
}
