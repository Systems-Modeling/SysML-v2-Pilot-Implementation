/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2021 Mgnite Inc.
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

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleRelSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

public class VCase extends VTree {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle
    ("VCase",
     null,
     "",
     new StyleSwitch(new StyleRelSwitch() {
		@Override
		public String caseSuccession(Succession s) {
            return " ..> ";
		}
		@Override
		public String caseTransitionUsage(TransitionUsage tu) {
            return " ..> ";
		}
    }, null));

    @Override 
    protected SysML2PlantUMLStyle getStyle() {
        return style;
    }

    @Override
    protected VTree newVTree(Namespace namespace, Membership membership) {
        return new VCase(this, namespace, membership);
    }

    private String addCase(Type typ) {
        String name = getNameAnyway(typ);
        int id = addRecLine(name, typ, true);
        addSpecializations(id, typ);

        VCaseMembers v = new VCaseMembers(this);
        v.processCase(typ);

        return "";
    }

    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        RequirementUsage ru = om.getOwnedObjectiveRequirement();
        String name = ru.getEffectiveName();
        if ("obj".equals(name)) name = null;
        VRequirement vr = new VRequirement(this);
        List<VTree> subtrees = processCompartment(vr, ru);
        int id = -1;
        if (subtrees != null || name != null) {
            if (name == null) {
                id = addPUMLLine(ru, "comp usage ", " <U+00AB>objective<U+00BB> ", "");
            } else {
                id = addPUMLLine(ru, "comp usage ", name, " <<objective>> ");
            }
            processSubtrees(vr, subtrees);
        }
        addSpecializations(id, ru);
        return "";
    }

    @Override
    public String caseSubjectMembership(SubjectMembership sm) {
        addSubjectMembership(sm, true);
        return "";
    }

    @Override
    public String caseCaseUsage(CaseUsage ucu) {
        return addCase(ucu);
    }

    @Override
    public String caseCaseDefinition(CaseDefinition ucd) {
        return addCase(ucd);
    }

    VCase(Visitor vt, Namespace namespace, Membership membership) {
        super(vt, namespace, membership);
    }

    VCase(VCaseMembers vt) {
    	super(vt);
    }

    public VCase(VMixed vt) {
        super(vt);
    }

    public VCase() {
        super();
    }
}
