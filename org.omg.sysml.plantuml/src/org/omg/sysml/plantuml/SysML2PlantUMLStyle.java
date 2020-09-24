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

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public class SysML2PlantUMLStyle {
    private static Map<String, SysML2PlantUMLStyle> styles = new HashMap<String, SysML2PlantUMLStyle>();
    private static SysML2PlantUMLStyle defaultStyle;

    static {
        add(null,
            "Standard B&&W",
    		"skinparam monochrome true\n"
            + "skinparam classbackgroundcolor white\n"
            + "skinparam shadowing false\n"
            + "hide circle\n");
        add("STDCOLOR",
            "Standard style with colors",
            "hide circle\n",
            new StyleSwitch(new StyleRelDefaultSwitch() {
                @Override
                public String caseConnector(Connector object) {
                    return " -[thickness=3,#blue]- ";
                }
                @Override
                public String caseBindingConnector(BindingConnector object) {
                    return " -[thickness=5,#red]- ";
                }
            }, null));
        add("PLANTUML",
            "PlantUML Style", " ",
             new StyleSwitch(new StyleRelDefaultSwitch() {
                 @Override
                 public String caseConnector(Connector object) {
                     return " -[thickness=3,#blue]- ";
                 }
                 @Override
                 public String caseBindingConnector(BindingConnector object) {
                     return " -[thickness=5,#red]- ";
                 }
             },
             new StyleStereotypeDefaultSwitch() {
                 @Override
                 public String caseBehavior(Behavior object) {
                     return " <<(B,lemonchiffon)";
                 }

                 @Override
                 public String caseFeature(Feature object) {
                     return " <<(F,yellow)";
                 }

                 @Override
                 public String caseUsage(Usage object) {
                     return " <<(U,orange)";
                 }

                 @Override
                 public String caseDefinition(Definition object) {
                     return " <<(D,brown)";
                 }

                 @Override
                 public String caseItemDefinition(ItemDefinition object) {
                     return " << (B,green) >> ";
                 }

                 @Override
                 public String caseItemUsage(ItemUsage object) {
                     return " << (P,limegreen) >> ";
                 }

                 @Override
                 public String casePartDefinition(PartDefinition object) {
                     return " << (B,green) >> ";
                 }

                 @Override
                 public String casePortUsage(PortUsage object) {
                     return " << (P,blue) port>> ";
                 }

                 @Override
                 public String casePartUsage(PartUsage object) {
                     return " << (P,limegreen) part>> ";
                 }
             }));
        add("TB", null, "top to bottom direction\n");
        add("LR", null, "left to right direction\n");
        add("POLYLINE", null, "skinparam linetype polyline\n");
        add("ORTHOLINE", null, "skinparam linetype ortho\n");
    }

    public static class StyleSwitch {
        public final StyleRelSwitch styleRelSwitch;
        public final StyleStereotypeSwitch styleStereotypeSwitch;

        public StyleSwitch(StyleRelSwitch styleRelSwitch,
                           StyleStereotypeSwitch styleStereotypeSwitch) {
            this.styleRelSwitch = styleRelSwitch;
            this.styleStereotypeSwitch = styleStereotypeSwitch;
        }
    }

    public static abstract class StyleRelSwitch extends SysMLSwitch<String> {
    }

    public static abstract class StyleStereotypeSwitch extends SysMLSwitch<String> {
        protected String defaultStr() {
            return " <<";
        }
    }

    public final String name;
    public final String title;
    public final String commandStr;
    public final StyleSwitch styleSwitch;

    SysML2PlantUMLStyle(String name, String title, String commandStr, StyleSwitch styleSwitch) {
    	this.name = name;
        this.title = title;
        this.commandStr = commandStr;
        this.styleSwitch = styleSwitch;
    }

    private static void add(String name, String title, String commandStr, StyleSwitch styleSwitch) {
        SysML2PlantUMLStyle s;
        if (name == null) {
            s = new SysML2PlantUMLStyle("DEFAULT", title, commandStr, styleSwitch);
            defaultStyle = s;
        } else {
            s = new SysML2PlantUMLStyle(name, title, commandStr, styleSwitch);
        }
        styles.put(s.name, s);
    }

    private static void add(String name, String title, String commandStr) {
        add(name, title, commandStr, null);
    }

    public boolean isEntitled() {
        return title != null;
    }

    public static Collection<String> getStyleTitles() {
        Collection<SysML2PlantUMLStyle> ss = styles.values();
        List<String> titles = new ArrayList<String>(ss.size());
        for (SysML2PlantUMLStyle s: ss) {
            if (s.title != null) {
                titles.add(s.title);
            }
        }
        return titles;
    }

    public static SysML2PlantUMLStyle getStyle(String title) {
        if (title == null) return null;
        Collection<SysML2PlantUMLStyle> ss = styles.values();
        for (SysML2PlantUMLStyle s: ss) {
            if (title.equals(s.title)) return s;
        }
        return null;
    }

    private static String getAvailableStyles() {
        return String.join(", ", styles.keySet());
    }

    public static SysML2PlantUMLStyle getDefault() {
        return defaultStyle;
    }

    public static SysML2PlantUMLStyle get(String name) {
        SysML2PlantUMLStyle s = styles.get(name.toUpperCase());
        if (s != null) return s;

        throw new IllegalArgumentException("Invalid Style: "
                                           + name
                                           + " Possible styles: "
                                           + getAvailableStyles());
    }


    public static class StyleRelDefaultSwitch extends StyleRelSwitch {
		@Override
        public String caseFeatureTyping(FeatureTyping e) {
            return " --:|> ";
        }

		@Override
		public String caseRedefinition(Redefinition object) {
            return " --||> ";
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

    public static class StyleStereotypeDefaultSwitch extends StyleStereotypeSwitch {
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

}
