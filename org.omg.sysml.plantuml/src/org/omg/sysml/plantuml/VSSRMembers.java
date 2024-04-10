/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2022-2022 Mgnite Inc.
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

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Type;

public class VSSRMembers extends VStructure {
    private static boolean isRedefining(Feature f, String prefix) {
        for (Redefinition rd: f.getOwnedRedefinition()) {
            Feature rf = rd.getRedefinedFeature();
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
