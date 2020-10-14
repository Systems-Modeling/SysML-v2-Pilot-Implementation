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

import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Type;

public class VRequirement extends VCompartment {

    private void addReqText(List<String> ss) {
        boolean added = false;
        for (String text: ss) {        	
            appendText(text, true);
            append('\n');
            added = true;
        }
        if (added) {
            append("--\n");
        }
    }

    private void addReqText(Type typ) {
        if (typ instanceof RequirementUsage) {
            addReqText(((RequirementUsage) typ).getText());
        } else if (typ instanceof RequirementDefinition) {
            addReqText(((RequirementDefinition) typ).getText());
        }
    }

    @Override
    public String caseRequirementConstraintMembership(RequirementConstraintMembership rcm) {
        ConstraintUsage c = rcm.getConstraint();
        if (rec(c, false)) {
            String desc;
            switch (rcm.getKind()) {
            case ASSUMPTION:
                desc = "<<assume>>";
                break;
            case REQUIREMENT:
                desc = "<<require>>";
                break;
            default:
                desc = null;
                break;
            }
            for (Subsetting s: c.getOwnedSubsetting()) {
                Feature sf = s.getSubsettedFeature();
                addPRelation(rcm.getMembershipOwningPackage(), sf, rcm, desc);
            }
        } else {
            String prefix;
            switch (rcm.getKind()) {
            case ASSUMPTION:
                prefix = "<i>assume</i> ";
                break;
            case REQUIREMENT:
                prefix = "<b>require</b> ";
                break;
            default:
                return "";
            }
            addFeature(rcm.getConstraint(), null, prefix, true, true);
        }
        return "";
    }

    @Override
    public List<VTree> process(VTree parent, Type typ) {
        addReqText(typ);
        return super.process(parent, typ);
    }

    public VRequirement(Visitor prev) {
        super(prev);
    }
}
