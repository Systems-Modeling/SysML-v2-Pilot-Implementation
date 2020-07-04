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
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
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
		public String caseSuccession(Succession s) {
            return " --> ";
		}

		@Override
		public String caseConnectionUsage(ConnectionUsage object) {
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
		public String caseReferenceUsage(ReferenceUsage object) {
            return " o-- ";
		}

		@Override
		public String caseItemUsage(ItemUsage itemUsage) {
            return itemUsage.isComposite() ? " *-- ": " o-- ";
		}

		@Override
		public String casePartUsage(PartUsage partUsage) {
            return partUsage.isComposite() ? " *-- ": " o-- ";
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
		public String casePortUsage(PortUsage object) {
            return " <<port>> ";
		}

		@Override
		public String caseItemUsage(ItemUsage object) {
            if (isComposite) return " ";
            return " <<item>> ";
		}

		@Override
		public String casePartUsage(PartUsage object) {
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

    String getRelStyle(Element e) {
        String ret;
        if ((styleSwitch != null)
            && (styleSwitch.styleRelSwitch != null)) {
            ret = styleSwitch.styleRelSwitch.doSwitch(e);
            if (ret != null) return ret;
        }
        return styleDefaultSwitch.styleRelSwitch.doSwitch(e);
    }

    String getStereotypeStyle(Element e) {
        String ret;
        if ((styleSwitch != null)
            && (styleSwitch.styleStereotypeSwitch != null)) {
            ret = styleSwitch.styleStereotypeSwitch.doSwitch(e);
            if (ret != null) return ret;
        }
        return styleDefaultSwitch.styleStereotypeSwitch.doSwitch(e);
    }

    private String getStereotypeName(Type typ) {
        String str = typ.eClass().getName();
        if (str == null) return "";
        if (str.isEmpty()) return str;

        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    String styleString(Type typ) {
        String ret = getStereotypeStyle(typ);
        if (ret == null) {
            if (diagramMode == MODE.Interconnection) {
                return " <<" + getStereotypeName(typ) + ">> ";
            } else {
                return " <<(T,blue)" + getStereotypeName(typ) + ">> ";
            }
        }
        if (ret.endsWith(" ")) return ret;
        return ret + getStereotypeName(typ) + ">> ";
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

    private Visitor getVisitor() {
        switch (diagramMode) {
        case StateMachine:
            return new VStateMachine();
        case Interconnection:
            return new VComposite();
        case Tree:
			return new VTree();
		default:
			return new VTree();
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
        
        idMap.clear();

        Visitor v = getVisitor();
        v.setSysML2PlantUMLText(this);
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

    Integer getId(Element e) {
        Integer ii = idMap.get(e);
        
        if (ii == null) {
            ii = new Integer(idMap.size());
            idMap.put(e, ii);
        }

        return ii;
    }

    String relString(Element rel) {
        String val = getRelStyle(rel);
        if (val == null) {
            throw new IllegalArgumentException("The edge:" + rel + "is not supported.");
        }
        return val;
    }
}
