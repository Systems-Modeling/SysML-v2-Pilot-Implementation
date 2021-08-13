/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020 Mgnite Inc.
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
 *  Ed Seideiwtz, MDS
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.AllocationUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseDefinition;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Dependency;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public class SysML2PlantUMLStyle {
    private static Map<String, SysML2PlantUMLStyle> styleMap = new HashMap<String, SysML2PlantUMLStyle>();
    private static List<SysML2PlantUMLStyle> styles = new ArrayList<SysML2PlantUMLStyle>();
    private static SysML2PlantUMLStyle defaultStyle;

    static {
        addp(null,
             "Standard B&&W",
             "skinparam monochrome true\n"
             + "skinparam classbackgroundcolor white\n"
             + "skinparam shadowing false\n"
             + "skinparam wrapWidth 300\n"
             + "hide circle\n", null,
             "classic", "true");
        addp("STDCOLOR",
             "Standard style with colors",
             "skinparam wrapWidth 300\n"
             + "hide circle\n",
             new StyleSwitch(new StyleRelDefaultSwitch() {
                 @Override
                 public String caseConnector(Connector object) {
                     return " -[thickness=3,#blue]- ";
                 }
                 @Override
                 public String caseBindingConnector(BindingConnector object) {
                     return " -[thickness=5,#red]- ";
                 }
             }, null),
             "decoratedRedefined", "true");
        addp("PLANTUML",
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
        add("COMPTREE", "Show nested ports in a compartment", " ", "compartmentTree", "true");
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

    private final boolean isPrimary;
    public final String name;
    public final String title;
    public final String commandStr;
    public final StyleSwitch styleSwitch;
    public final Map<String, String> options;

    private SysML2PlantUMLStyle(boolean isPrimary, String name, String title, String commandStr, StyleSwitch styleSwitch, Map<String, String> options) {
        this.isPrimary = isPrimary;
    	this.name = name;
        this.title = title;
        this.commandStr = commandStr;
        this.styleSwitch = styleSwitch;
        this.options = options;
    }

    public SysML2PlantUMLStyle(String name, String title, String commandStr, StyleSwitch styleSwitch, String... options) {
        this(false, name, title, commandStr, styleSwitch, convOptions(options));
    }

    private static Map<String, String> convOptions(String[] options) {
        if (options == null) return null;
        int size = options.length / 2;
        Map<String, String> map = new HashMap<String, String>(size);
        for (int i = 0; i < options.length;) {
            map.put(options[i], options[i + 1]);
            i += 2;
        }
        return map;
    }

    private static void add(boolean isPrimary, String name, String title, String commandStr, StyleSwitch styleSwitch, String... options) {
        SysML2PlantUMLStyle s;
        Map<String, String> map = convOptions(options);
        if (name == null) {
            s = new SysML2PlantUMLStyle(true, "DEFAULT", title, commandStr, styleSwitch, map);
            defaultStyle = s;
        } else {
            s = new SysML2PlantUMLStyle(isPrimary, name, title, commandStr, styleSwitch, map);
        }
        styleMap.put(s.name, s);
        styles.add(s);
    }

    private static void addp(String name, String title, String commandStr, StyleSwitch styleSwitch, String... options) {
        add(true, name, title, commandStr, styleSwitch, options);
    }

    private static void add(String name, String title, String commandStr, String... options) {
        add(false, name, title, commandStr, null, options);
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public static Collection<String> getStyleTitles() {
        List<String> titles = new ArrayList<String>(styles.size());
        for (SysML2PlantUMLStyle s: styles) {
            if (s.title != null) {
                titles.add(s.title);
            }
        }
        return titles;
    }

    public static SysML2PlantUMLStyle getStyle(String title) {
        if (title == null) return null;
        Collection<SysML2PlantUMLStyle> ss = styleMap.values();
        for (SysML2PlantUMLStyle s: ss) {
            if (title.equals(s.title)) return s;
        }
        return null;
    }

    private static String getAvailableStyles() {
        return String.join(", ", styleMap.keySet());
    }

    public static SysML2PlantUMLStyle getDefault() {
        return defaultStyle;
    }

    public static SysML2PlantUMLStyle get(String name) {
        SysML2PlantUMLStyle s = styleMap.get(name.toUpperCase());
        if (s != null) return s;

        throw new IllegalArgumentException("Invalid Style: "
                                           + name
                                           + " Possible styles: "
                                           + getAvailableStyles());
    }


    public static class StyleRelDefaultSwitch extends StyleRelSwitch {

		@Override
        public String caseMembership(Membership m) {
            if (m.getOwnedMemberElement() == null) {
                return " +.. ";
            } else {
                return " +-- ";
            }
        }


		@Override
        public String caseFeatureMembership(FeatureMembership fm) {
			Feature feature = fm.getMemberFeature();
			return feature != null && feature.isComposite() ? " *-- ": " o-- ";
        }

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
		public String caseComment(Comment c) {
            return " .. ";
		}

		@Override
		public String caseAnnotatingFeature(AnnotatingFeature af) {
            return " ..@ ";
		}

		@Override
		public String caseTransitionUsage(TransitionUsage object) {
            return "  --> ";
		}

		@Override
		public String caseNamespace(Namespace p) {
            return " +-- ";
		}

		@Override
		public String caseClassifier(Classifier object) {
            return " +-- ";
		}

		@Override
		public String caseFeature(Feature f) {
            return f.isComposite() ? " *-- ": " o-- ";
		}

		@Override
		public String caseReferenceUsage(ReferenceUsage object) {
            return " o-- ";
		}

		@Override
		public String caseItemFlow(ItemFlow itemFlow) {
            return " --> ";
		}

		@Override
		public String caseFlowConnectionUsage(FlowConnectionUsage fcu) {
            return " --> ";
		}

		@Override
		public String caseAllocationUsage(AllocationUsage au) {
            return " --> ";
		}

		@Override
		public String caseSendActionUsage(SendActionUsage sau) {
            // Send a message to object
            return " ..>> ";
		}

		@Override
		public String caseAcceptActionUsage(AcceptActionUsage sau) {
            // Send a message to object
            return " <<.. ";
		}

		@Override
		public String caseDependency(Dependency dep) {
            return " ..>> ";
		}

		@Override
		public String caseRequirementConstraintMembership(RequirementConstraintMembership requirementConstraintMembership) {
            return " ..> ";
		}

		@Override
		public String caseSatisfyRequirementUsage(SatisfyRequirementUsage satisfyRequirementUsage) {
            return " ..> ";
		}

		@Override
		public String caseBindingConnector(BindingConnector object) {
            return " -[thickness=5]- ";
		}

		@Override
		public String caseSpecialization(Specialization object) {
            return " --|> ";
		}

		@Override
		public String caseSubjectMembership(SubjectMembership sm) {
            return " ..> ";
		}

		@Override
		public String caseVariantMembership(VariantMembership vm) {
            return " )-->> ";
		}

		@Override
		public String caseObjectiveMembership(ObjectiveMembership vm) {
            return " -->> ";
		}
    }

    public static class StyleStereotypeDefaultSwitch extends StyleStereotypeSwitch {
		@Override
		public String caseClass(Class object) {
            if (SysMLPackage.Literals.CLASS.equals(object.eClass())) return " ";
            return null;
		}

		@Override
		public String caseExhibitStateUsage(ExhibitStateUsage esu) {
            return "<<exhibit state>> ";
		}

		@Override
		public String casePerformActionUsage(PerformActionUsage pau) {
            return " perform action>> ";
		}

		@Override
		public String caseAcceptActionUsage(AcceptActionUsage aau) {
            return " accept action>> ";
		}

		@Override
		public String caseSendActionUsage(SendActionUsage sau) {
            return " send action>> ";
		}

		@Override
		public String caseAnalysisCaseUsage(AnalysisCaseUsage acu) {
            return " analysis>> ";
		}

		@Override
		public String caseAnalysisCaseDefinition(AnalysisCaseDefinition acd) {
            return " analysis def>> ";
		}

		@Override
		public String caseEventOccurrenceUsage(EventOccurrenceUsage eou) {
            return " event occurrence>> ";
		}
    }

}
