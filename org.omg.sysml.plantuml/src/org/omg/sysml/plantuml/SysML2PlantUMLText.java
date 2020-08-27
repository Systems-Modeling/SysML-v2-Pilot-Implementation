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

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.ItemFlow;
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
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleRelSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleStereotypeSwitch;
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
            return " .. ";
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
		public String caseItemFlow(ItemFlow itemFlow) {
            return " --> ";
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
            if (SysMLPackage.Literals.CLASS.equals(object.eClass())) return " ";
            return null;
		}

		@Override
		public String casePortUsage(PortUsage object) {
            return " <<port>> ";
		}

		@Override
		public String caseItemUsage(ItemUsage object) {
            return " <<item>> ";
		}

		@Override
		public String casePartUsage(PartUsage object) {
            return " <<part>> ";
		}
    }

    private final Collection<SysML2PlantUMLStyle> styles = new ArrayList<SysML2PlantUMLStyle>();
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

    /* used by Visitor */
    String getStereotypeStyle(Element e) {
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
		default:
			return new VTree();
        }
    }

    private Visitor currentVisitor;
    private Visitor initVisitor() {
        Visitor v = createVisitor();
        this.currentVisitor = v;
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

    Integer getId(Element e) {
        Integer ii = idMap.get(e);
        
        if (ii == null) {
            ii = new Integer(idMap.size());
            idMap.put(e, ii);
        }

        return ii;
    }
}
