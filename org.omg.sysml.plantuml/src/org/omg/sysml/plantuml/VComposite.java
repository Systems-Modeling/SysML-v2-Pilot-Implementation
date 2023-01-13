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

import java.util.List;
import java.util.Set;

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
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
        int id = addPUMLLine(f, "rec usage ", featureText);
        addFeatureValueBindings(f);

        VComposite vc = new VComposite(this);
        vc.traverse(f);
        vc.closeBlock();
        addSpecializations(id, f);

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

    private Feature getEndFeature(Feature f) {
        while (!f.isEnd()) {
            Element e = f.getOwner();
            if (!(e instanceof Feature)) return null;
            f = (Feature) e;
        }
        return f;
    }

    private boolean isPortOut(int id) {
        Set<Element> paths = getVPath().getPaths(id);
        if (paths == null) return false;
        for (Element path: paths) {
            if (!(path instanceof Feature)) continue;
            Feature f = getEndFeature((Feature) path);
            if (f == null) continue;
            Type t = f.getOwningType();
            if (t instanceof Connector) {
                Connector c = (Connector) t;
                List<Feature> fs = c.getConnectorEnd();
                /* 
                   Currently we regard the first connector end as a source end, but it might be changed.
                   We can check it by extracting the sources of the relationship, but it does not work with ItemFlowEnd
                   and is not efficient.  So we will use the current solution for the time being.
                   if (rel.getSource().contains(path)) return true;
                 */
                if (f.equals(fs.get(0))) return true;
            }
        }
        return false;
    }

    @Override
    public String casePortUsage(PortUsage pu) {
        addFeatureValueBindings(pu);
        String name = extractTitleName(pu);
        if (name == null) return "";

        VComposite vc = new VComposite(this);
        vc.traverse(pu);
        String ret = vc.getString();

        if (ret.isEmpty()) {
            int pt = getCurrentLength();
            int id = addPUMLLine(pu, "", name);
            if (isPortOut(id)) {
                insert(pt, "portout ");
            } else {
                insert(pt, "portin ");
            }
            append('\n');
        } else {
            addPUMLLine(pu, "rec usage ", name);
            vc.closeBlock();
        }

        return "";
    }

    private void addTypeSimple(Type typ) {
        if (typ instanceof Feature) {
            Feature f = (Feature) typ;
            addFeatureValueBindings(f);
            FeatureDirectionKind fdk = f.getDirection();
            if (fdk != null) {
                String name = extractTitleName(f);
                if (name == null) return;

                VComposite vc = new VComposite(this);
                vc.traverse(f);
                String ret = vc.getString();

                if (ret.isEmpty() && !isEmpty()) {
                    if (fdk == FeatureDirectionKind.OUT) {
                        addPUMLLine(f, "portout ", name);
                    } else {
                        addPUMLLine(f, "portin ", name);
                    }
                } else {
                    addPUMLLine(f, "rec usage ", name);
                    vc.closeBlock();
                }
            } else {
                if (!addType(typ, "usage ")) return;
            }
        } else if (typ instanceof Usage) {
            if (!addType(typ, "usage ")) return;
        } else {
            if (!addType(typ, "def ")) return;
        }
        append('\n');
    }

    @Override
    public String caseReferenceUsage(ReferenceUsage ru) {
        addTypeSimple(ru);
        return "";
    }

    @Override
    public String caseType(Type typ) {
        addTypeSimple(typ);
        return "";
    }

    private VComposite(Visitor vt) {
        super(vt);
    }

    public VComposite() {
        super();
    }
}
