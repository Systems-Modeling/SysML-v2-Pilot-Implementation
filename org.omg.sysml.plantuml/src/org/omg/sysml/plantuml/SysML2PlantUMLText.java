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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

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

    private final Collection<SysML2PlantUMLStyle> styles = new ArrayList<SysML2PlantUMLStyle>();
    private final Map<String, String> styleValueMap = new HashMap<String, String>();
    private StyleSwitch styleSwitch;
    private final StyleSwitch styleDefaultSwitch = new StyleSwitch(new SysML2PlantUMLStyle.StyleRelDefaultSwitch(),
                                                                   new SysML2PlantUMLStyle.StyleStereotypeDefaultSwitch());

    public void addStyle(SysML2PlantUMLStyle style) {
        styles.add(style);
        if (style.styleSwitch != null) {
            styleSwitch = style.styleSwitch;
        }
        if (style.options != null) {
            styleValueMap.putAll(style.options);
        }
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

    private static Pattern patMetaclassName = Pattern.compile("^(\\p{L}+?)(Definition|Usage)$");
    public static String getStereotypeName(Type typ) {
        String str = typ.eClass().getName();
        if (str == null) return "";
        if (str.isEmpty()) return str;
        Matcher m = patMetaclassName.matcher(str);
        if (m.matches()) {
            if ("Definition".equals(m.group(2))) {
                str = m.group(1) + " def";
            } else {
                str = m.group(1);
            }
        }

        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    String styleString(Type typ) {
        String ret = getStereotypeStyle(typ);
        if (ret == null) {
            if (diagramMode == MODE.Interconnection) {
                ret = " <<";
            } else {
                ret = " <<(T,blue)";
            }
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
        return ret + getStereotypeName(typ) + ">> ";
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
        case StateMachine:
            return new VStateMachine();
        case Interconnection:
            return new VComposite();
        case Tree:
			return new VTree();
        case Activity:
			return new VAction();
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
        if (eObj instanceof StateUsage) {
            return MODE.StateMachine;
        } else if (eObj instanceof ActionUsage) {
            return MODE.Activity;
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
        Visitor v = initVisitor();
        v.setSysML2PlantUMLText(this);
        StringBuilder sb = new StringBuilder();

        addStyleHeader(sb);
        
        idMap.clear();

        for (EObject eObj : eObjs) {
            if (eObj instanceof Element) {
                v.visit((Element) eObj);
            }
        }
        sb.append(v.getString());
        return sb.toString();
    }
    
    private Map<Element, Integer> idMap = new HashMap<Element, Integer>();

    boolean checkId(Element e) {
        return idMap.containsKey(e);
    }

    void removeId(Element e) {
        idMap.remove(e);
    }

    private int idCounter = 1;

    Integer getId(Element e) {
        Integer ii = idMap.get(e);
        
        if (ii == null) {
            ii = new Integer(idCounter++);
            idMap.put(e, ii);
        }

        return ii;
    }
}
