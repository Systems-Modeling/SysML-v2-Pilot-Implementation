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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.Type;

public class VCompartment extends VStructure {
    private List<Element> rest = new ArrayList<Element>();
    private Map<Feature, List<String>> features = new HashMap<Feature, List<String>>();

    @Override
    public String caseFeature(Feature f) {
        if (features.containsKey(f)) return "";
        features.put(f, null);
        return "";
    }

    @Override
    public String casePartUsage(PartUsage pu) {
        rest.add(pu);
        return "";
    }

    @Override
    public String caseReferenceUsage(ReferenceUsage pu) {
        rest.add(pu);
        return "";
    }

    @Override
    public String caseMembership(Membership m) {
        Element e = m.getMemberElement();
        if (e instanceof Feature) {
            // alias
            Feature f = (Feature) e;
            List<String> aliases = features.get(f);
            if (aliases == null) {
                aliases = new ArrayList<String>(1);
                features.put(f, aliases);
            }
            aliases.add(m.getMemberName());
            return "";
        } else {
            rest.add(e);
            return "";
        }
    }

    private void addFeatures() {
        for (Map.Entry<Feature, List<String>> entry: features.entrySet()) {
            Feature f = entry.getKey();
            List<String> aliases = entry.getValue();
            if (addFeatureText(f)) {
                if (aliases != null) {
                    append(" <b>as</b> ");
                    for (String alias: aliases) {
                        append(alias);
                        append(' ');
                    }
                }
                append('\n');
            }
        }
    }

    public void startType(Type typ) {
        traverse(typ);
        addFeatures();
        closeBlock("--\n"); // Explicitly add class separator
    }

    public List<Element> process(Type typ) {
        rest.clear();
        features.clear();
        startType(typ);
        return rest;
    }

    public VCompartment(Visitor prev) {
        super(prev);
    }
}
