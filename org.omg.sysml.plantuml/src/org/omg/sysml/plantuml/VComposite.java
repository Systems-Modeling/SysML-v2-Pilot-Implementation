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

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleStereotypeSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

public class VComposite extends VStructure {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle
    ("VComposite",
      null,
     "skinparam ranksep 8\n"
     + "skinparam rectangle {\n backgroundColor<<block>> LightGreen\n}\n",
     new StyleSwitch(null, new StyleStereotypeSwitch() {
         @Override
         public String caseElement(Element object) {
             return defaultStr();
         }
         @Override
         public String caseItemUsage(ItemUsage object) {
             return " ";
         }

         @Override
         public String casePartUsage(PartUsage object) {
             return " ";
         }
     }));

    @Override 
    protected SysML2PlantUMLStyle getStyle() {
        return style;
    }

    private String getFeatureText(Feature f) {
        VComposite v = new VComposite(this);
        v.addFeatureText(f);
        return v.getString();
    }


	@Override
    public String caseUsage(Usage f) {
        String featureText = getFeatureText(f);
        if (featureText.isEmpty()) return "";
        addPUMLLine(f, "rectangle ", featureText);

        VComposite vc = new VComposite(this);
        vc.traverse(f);
        vc.closeBlock("");

        return "";
    }

	@Override
    public String caseStateUsage(StateUsage su) {
        String name = extractName(su);
        if (name == null) return "";
        addPUMLLine(su, "rectangle ", name);
        append('\n');
        return "";
    }

    @Override
    public String caseSuccession(Succession su) {
        return "";
    }

    @Override
    public String caseConnector(Connector c) {
        addConnector(c);
        return "";
    }

    @Override
    public String casePortUsage(PortUsage pu) {
        String name = extractName(pu);
        if (name == null) return "";

        VComposite vc = new VComposite(this);
        vc.traverse(pu);
        String ret = vc.getString();

        String keyword;
        if (ret.isEmpty()) {
            keyword = "portin ";
        } else {
            keyword = "rectangle ";
        }

        addPUMLLine(pu, keyword, name);
        vc.closeBlock("");

        return "";
    }

    private void addType(Type typ) {
        addType(typ, "rectangle ");
        append('\n');
    }


    @Override
    public String caseType(Type typ) {
        addType(typ);
        return "";
    }

    private VComposite(Visitor vt) {
        super(vt);
    }

    public VComposite() {
        super();
    }
}
