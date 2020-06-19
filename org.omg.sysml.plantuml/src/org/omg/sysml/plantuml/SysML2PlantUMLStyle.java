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
import java.util.List;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.plantuml.SysML2PlantUMLText.StyleRelSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLText.StyleStereotypeSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLText.StyleSwitch;

public enum SysML2PlantUMLStyle {
    DEFAULT("Standard B&&W",
    		"skinparam monochrome true\n"
            + "skinparam classbackgroundcolor white\n"
            + "skinparam shadowing false\n"
            + "hide circle\n"),
    STDCOLOR("Standard style with colors",
             "hide circle\n",
             new StyleSwitch(new StyleRelSwitch() {
                 @Override
                 public String caseConnector(Connector object) {
                     return " -[thickness=3,#blue]- ";
                 }
                 @Override
                 public String caseBindingConnector(BindingConnector object) {
                     return " -[thickness=5,#red]- ";
                 }
             }, null)),
    PLANTUML("PlantUML Style", " ",
             new StyleSwitch(new StyleRelSwitch() {
                 @Override
                 public String caseConnector(Connector object) {
                     return " -[thickness=3,#blue]- ";
                 }
                 @Override
                 public String caseBindingConnector(BindingConnector object) {
                     return " -[thickness=5,#red]- ";
                 }
             },
             new StyleStereotypeSwitch() {
                 @Override
                 public String caseBehavior(Behavior object) {
                     if (isComposite) return defaultStr();
                     return " <<(B,lemonchiffon)";
                 }

                 @Override
                 public String caseFeature(Feature object) {
                     if (isComposite) return defaultStr();
                     return " <<(F,yellow)";
                 }

                 @Override
                 public String caseUsage(Usage object) {
                     if (isComposite) return defaultStr();
                     return " <<(U,orange)";
                 }

                 @Override
                 public String caseDefinition(Definition object) {
                     if (isComposite) return defaultStr();
                     return " <<(D,brown)";
                 }

                 @Override
                 public String caseItemDefinition(ItemDefinition object) {
                     if (isComposite) return defaultStr();
                     return " << (B,green) >> ";
                 }

                 @Override
                 public String caseItemUsage(ItemUsage object) {
                     if (isComposite) return "  ";
                     return " << (P,limegreen) >> ";
                 }

                 
                 @Override
                 public String casePartDefinition(PartDefinition object) {
                     if (isComposite) return defaultStr();
                     return " << (B,green) >> ";
                 }

                 @Override
                 public String casePortUsage(PortUsage object) {
                     if (isComposite) return " <<port>> ";
                     return " << (P,blue) port>> ";
                 }

                 @Override
                 public String casePartUsage(PartUsage object) {
                     if (isComposite) return " <<part>> ";
                     return " << (P,limegreen) part>> ";
                 }
             })),
    TB(null, "top to bottom direction\n"),
    LR(null, "left to right direction\n"),
    POLYLINE(null, "skinparam linetype polyline\n"),
    ORTHOLINE(null, "skinparam linetype ortho\n");

    public final String title;
    public final String commandStr;
    public final StyleSwitch styleSwitch;

    private SysML2PlantUMLStyle(String title, String commandStr, StyleSwitch styleSwitch) {
        this.title = title;
        this.commandStr = commandStr;
        this.styleSwitch = styleSwitch;
    }

    private SysML2PlantUMLStyle(String title, String commandStr) {
        this(title, commandStr, null);
    }

    public boolean isEntitled() {
        return title != null;
    }

    /* package */ static <T extends Enum<?>> String getPossibleValues(Class<T> en) {
        StringBuilder sb = new StringBuilder();
        for (T e : en.getEnumConstants()) {
            sb.append(e.name());
            sb.append(' ');
        }
        return sb.toString();
    }

    public static Collection<String> getStyleTitles() {
        List<String> titles = new ArrayList<String>(values().length);
        for (SysML2PlantUMLStyle s: values()) {
            if (s.title != null) {
                titles.add(s.title);
            }
        }
        return titles;
    }

    public static SysML2PlantUMLStyle getStyle(String title) {
        if (title == null) return null;
        for (SysML2PlantUMLStyle s: values()) {
            if (title.equals(s.title)) return s;
        }
        return null;
    }

    public static SysML2PlantUMLStyle get(String name) {
        for (SysML2PlantUMLStyle s: values()) {
            if (s.name().equalsIgnoreCase(name)) return s;
        }
        throw new IllegalArgumentException("Invalid Style: "
                                           + name
                                           + " Possible styles: "
                                           + getPossibleValues(SysML2PlantUMLStyle.class));
    }
}
