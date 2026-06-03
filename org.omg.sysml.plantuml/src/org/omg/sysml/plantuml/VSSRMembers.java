/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2022 Mgnite Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Hisashi Miyashita, Mgnite Inc.
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;

public class VSSRMembers extends VStructure {
    private static boolean isRedefining(Feature f, String prefix) {
        for (Feature rf: FeatureUtil.getAllRedefinedFeaturesOf(f)) {
            String qName = rf.getQualifiedName();
            if (qName != null) {
                if (qName.startsWith(prefix)) return true;
            }
        }
        return false;
    }

    public static boolean isStateSpaceMember(Feature f) {
        return isRedefining(f, "StateSpaceRepresentation::StateSpaceDynamics::");
    }

    @Override
    public String caseFeature(Feature f) {
        addType(f, "comp usage ");
        VCompartment vc = new VCompartment(this);
        vc.startType(f);
        vc.closeBlock();
        return "";
    }

    public String start(Type typ) {
        traverse(typ);
        closeBlock();
        return "";
    }

    VSSRMembers(Visitor v) {
        super(v);
    }
}
