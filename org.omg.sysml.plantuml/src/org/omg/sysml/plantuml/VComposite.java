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
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleStereotypeSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

public class VComposite extends VMixed {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle
    ("VComposite",
      null,
     "skinparam ranksep 10\n"
     + "skinparam rectangle {\n backgroundColor<<block>> LightGreen\n}\n",
     new StyleSwitch(null, new StyleStereotypeSwitch() {
         @Override
         public String casePartUsage(PartUsage object) {
             /* Do not show stereotype for PartUsages */
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
        addPUMLLine(f, "rec usage ", featureText);

        VComposite vc = new VComposite(this);
        vc.traverse(f);
        vc.closeBlock();

        return "";
    }

	@Override
    public String casePartDefinition(PartDefinition pd) {
        addType(pd, "rec def ");

        VComposite vc = new VComposite(this);
        vc.traverse(pd);
        vc.closeBlock();

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
            addPUMLLine(pu, keyword, name);
            append('\n');
        } else {
            keyword = "rec usage ";
            addPUMLLine(pu, keyword, name);
            vc.closeBlock();
        }

        return "";
    }

    private void addType(Type typ) {
        if (typ instanceof Usage) {
            if (!addType(typ, "usage ")) return;
        } else {
            if (!addType(typ, "def ")) return;
        }
        append('\n');
    }


    @Override
    public String caseType(Type typ) {
        addType(typ);
        return "";
    }

    @Override
    public String caseMultiplicityRange(MultiplicityRange mr) {
        // Do not show MultiplicityRange
        return "";
    }

    @Override
    public String caseExpression(Expression e) {
        // Do not show Expression
        return "";
    }

    private VComposite(Visitor vt) {
        super(vt);
    }

    public VComposite() {
        super();
    }
}
