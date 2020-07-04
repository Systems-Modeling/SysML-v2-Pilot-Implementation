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

import java.util.List;

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

public class VComposite extends VStructure {
    private void addConnector(Connector c) {
        List<Feature> ends = c.getConnectorEnd();
        int size = ends.size();
        if (size >= 2) {
            Element end1 = getEnd(ends.get(0));
            if (end1 == null) return;
            for (int i = 1; i < size; i++) {
                Element end2 = getEnd(ends.get(i));
                if (end2 == null) continue;
                addPRelation(end1, end2, c);
            }
        }
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
        addPUMLLine(su, "state ", name);
        append('\n');
        return "";
    }

    @Override
    public String caseParameter(Parameter p) {
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
            keyword = "port ";
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
