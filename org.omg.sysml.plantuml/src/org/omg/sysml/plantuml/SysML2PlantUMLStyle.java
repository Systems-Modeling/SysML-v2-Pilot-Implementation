/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2023 Mgnite Inc.
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.AllocationUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseDefinition;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
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
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.OwningMembership;
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
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionFlowConnectionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public class SysML2PlantUMLStyle {
    private static Map<String, SysML2PlantUMLStyle> styleMap = new HashMap<String, SysML2PlantUMLStyle>();
    private static List<SysML2PlantUMLStyle> styles = new ArrayList<SysML2PlantUMLStyle>();
    private static SysML2PlantUMLStyle defaultStyle;

    static {
        addp(null,
             "Standard B&&W",
             "skin sysmlbw\n"
             + "skinparam monochrome true\n"
             + "skinparam wrapWidth 300\n"
             + "hide circle\n", null,
             "classic", "true");
        addp("STDCOLOR",
             "Standard style with colors",
             "skin sysmlc\n"
             + "skinparam wrapWidth 300\n"
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
                 @Override
                 public String caseFeatureValue(FeatureValue fv) {
                     return " -[thickness=5,#red]- ";
                 }
             }, null),
             "decoratedRedefined", "true");
        addp("PLANTUML",
             "PlantUML Style",
             " ",
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
        addn("TB", "\tTop-to-Bottom orientation", "top to bottom direction\n");
        addn("LR", "\tLeft-to-Right orientation", "left to right direction\n");
        addn("POLYLINE", "Polyline style", "skinparam linetype polyline\n");
        addn("ORTHOLINE", "Orthogonal line style", "skinparam linetype ortho\n");
        add("SHOWLIB", "Show elements of the standard libraries", " ", "showLib", "true");
        add("SHOWINHERITED", "Show inherited members", " ", "showInherited", "true");
        add("COMPMOST", "Show as many memberships in a compartment as possible", " ", "compartmentMost", "true");
        add("COMPTREE", "Show nested attributes and ports in a compartment", " ", "compartmentTree", "true");
        add("SHOWIMPORTED", "Show imported elements", " ", "showImported", "true");
        add("HIDEMETADATA", "Hide metadata", " ", "hideMetadata", "true");
        add("SHOWMETACLASS", "Show metaclasses of metaobjects", " ", "showMetaclass", "true");
        add("EVAL", "Evaluate expressions", " ", "evalExp", "true");
        add("NODEMULTIPLICITY", "Show multiplicities in nodes", " ", "nodeMultiplicity", "true");
        add("EDGEMULTIPLICITY", "Show multiplicities on edges", " ", "edgeMultiplicity", "true");
        add("IMPLICITMULTIPLICITY", "Show implicit multiplicities", " ", "implicitMultiplicity", "true");
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

    private enum Kind {
        PRIMARY,
        NO_MENU,
        NORMAL;
    }

    private final Kind kind;
    public final String name;
    public final String title;
    public final String commandStr;
    public final StyleSwitch styleSwitch;
    public final Map<String, String> options;

    private SysML2PlantUMLStyle(Kind kind, String name, String title, String commandStr, StyleSwitch styleSwitch, Map<String, String> options) {
        this.kind = kind;
    	this.name = name;
        this.title = title;
        this.commandStr = commandStr;
        this.styleSwitch = styleSwitch;
        this.options = options;
    }

    public SysML2PlantUMLStyle(String name, String title, String commandStr, StyleSwitch styleSwitch, String... options) {
        this(Kind.NORMAL, name, title, commandStr, styleSwitch, convOptions(options));
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

    private static void add(Kind kind, String name, String title, String commandStr, StyleSwitch styleSwitch, String... options) {
        SysML2PlantUMLStyle s;
        Map<String, String> map = convOptions(options);
        if (name == null) {
            s = new SysML2PlantUMLStyle(kind, "DEFAULT", title, commandStr, styleSwitch, map);
            defaultStyle = s;
        } else {
            s = new SysML2PlantUMLStyle(kind, name, title, commandStr, styleSwitch, map);
        }
        styleMap.put(s.name, s);
        styles.add(s);
    }

    private static void addp(String name, String title, String commandStr, StyleSwitch styleSwitch, String... options) {
        add(Kind.PRIMARY, name, title, commandStr, styleSwitch, options);
    }

    private static void addn(String name, String title, String commandStr, String... options) {
        add(Kind.NO_MENU, name, title, commandStr, null, options);
    }

    private static void add(String name, String title, String commandStr, String... options) {
        add(Kind.NORMAL, name, title, commandStr, null, options);
    }

    public boolean isPrimary() {
        return kind == Kind.PRIMARY;
    }

    public boolean isMenu() {
        return kind != Kind.NO_MENU;
    }

    public static Collection<String> getStyleTitles() {
        List<String> titles = new ArrayList<String>(styles.size());
        for (SysML2PlantUMLStyle s: styles) {
            if (s.isMenu()) {
                titles.add(s.title);
            }
        }
        return titles;
    }

    public static String getStyleHelp() {
        StringBuilder sb = new StringBuilder();
        for (SysML2PlantUMLStyle s: styles) {
            String name = s.name;
            if (name == null) {
                name = "DEFAULT";
            }
            sb.append("  ");
            sb.append(name);
            sb.append("\t\t");
            sb.append(s.title);
            sb.append('\n');
        }
        return sb.toString();
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
        public String caseOwningMembership(OwningMembership m) {
            return " +-- ";
        }

		@Override
        public String caseMembership(Membership m) {
            return " +.. ";
        }

        @Override
        public String caseActorMembership(ActorMembership m) {
            return " -- ";
        }

        @Override
        public String caseStakeholderMembership(StakeholderMembership m) {
            return " -- ";
        }

		@Override
        public String caseFeatureMembership(FeatureMembership fm) {
			Feature feature = fm.getOwnedMemberFeature();
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
		public String caseConnectionUsage(ConnectionUsage cu) {
            String mName = SysML2PlantUMLText.getMetadataUsageName(cu);
            if (mName != null) {
                return " -[thickness=3]-> ";
            } else {
                return " -[thickness=3]- ";
            }
		}

		@Override
		public String caseComment(Comment c) {
            return " .. ";
		}

		@Override
		public String caseMetadataFeature(MetadataFeature af) {
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
        public String caseSuccessionFlowConnectionUsage(SuccessionFlowConnectionUsage sfcu) {
            return " ..> ";
        }

		@Override
		public String caseAllocationUsage(AllocationUsage au) {
            return " -[thickness=5,dotted]-> ";
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
		public String caseFeatureValue(FeatureValue fv) {
            return " -[thickness=5]- ";
		}

		@Override
		public String caseSpecialization(Specialization object) {
            return " --|> ";
		}

		@Override
		public String caseSubjectMembership(SubjectMembership sm) {
            return " o-- ";
		}

		@Override
		public String caseVariantMembership(VariantMembership vm) {
            return " +--- ";
		}

		@Override
		public String caseObjectiveMembership(ObjectiveMembership vm) {
            return " -->> ";
		}

		@Override
		public String caseImport(Import imp) {
            return " ..> ";
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
            if (VStructure.hasRefSubsettingWithoutDeclaredName(esu)) {
                return " exhibit>> ";
            } else {
                return " exhibit state>> ";
            }
		}

		@Override
		public String caseSatisfyRequirementUsage(SatisfyRequirementUsage sru) {
            return "<<requirement>> ";
		}

        @Override
        public String caseIncludeUseCaseUsage(IncludeUseCaseUsage iucu) {
            return " include use case>> ";
		}

		@Override
		public String casePerformActionUsage(PerformActionUsage pau) {
            if (VStructure.hasRefSubsettingWithoutDeclaredName(pau)) {
                return " perform>> ";
            } else {
                return " perform action>> ";
            }
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
		public String caseVerificationCaseUsage(VerificationCaseUsage acu) {
            return " verification>> ";
		}

		@Override
		public String caseVerificationCaseDefinition(VerificationCaseDefinition acd) {
            return " verification def>> ";
		}

		@Override
		public String caseEventOccurrenceUsage(EventOccurrenceUsage eou) {
            return " event occurrence>> ";
		}
    }

}
