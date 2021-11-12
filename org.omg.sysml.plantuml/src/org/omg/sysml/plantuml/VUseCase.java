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

import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.UseCaseDefinition;
import org.omg.sysml.lang.sysml.UseCaseUsage;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleRelSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

public class VUseCase extends VTree {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle
    ("VUseCase",
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
    protected VTree newVTree(Membership membership) {
        return new VUseCase(this, membership);
    }

    private String addActorLikeStyle(Type typ, String name) {
        Membership ms = typ.getOwningMembership();
        if (ms instanceof ActorMembership) {
            return "<size:30><&person></size> " + name;
        } else if (ms instanceof StakeholderMembership) {
            return "<size:30><&people></size> " + name;
        } else {
            return name;
        }
    }

    private String addUseCase(String name, Type typ) {
        addRecLine(name, typ, true);
        addSpecializations(typ);

        VUseCaseMembers v = new VUseCaseMembers(this);
        v.processUseCase(typ);

        return "";
    }

    private String addUseCaseUsage(UseCaseUsage ucu) {
        String name = ucu.getEffectiveName();
        if (name == null) {
            name = getNameAnyway(ucu, true);
        }
        return addUseCase(name, ucu);
    }

    private String addUseCaseDefinition(UseCaseDefinition ucd) {
        String name = getNameAnyway(ucd, true);
        return addUseCase(name, ucd);
    }

    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        RequirementUsage ru = om.getOwnedObjectiveRequirement();
        String name = ru.getEffectiveName();
        if ("obj".equals(name)) name = null;
        VRequirement vr = new VRequirement(this);
        List<VTree> subtrees = processCompartment(vr, ru);
        if (subtrees != null || name != null) {
            if (name == null) {
                addPUMLLine(ru, "comp usage ", " <U+00AB>objective<U+00BB> ", "");
            } else {
                addPUMLLine(ru, "comp usage ", name, " <<objective>> ");
            }
            processSubtrees(vr, subtrees);
        }
        addSpecializations(ru);
        return "";
    }

    private void addMembershipPRelation(Membership ms) {
        Element owner = ms.getMembershipOwningNamespace();
        Element tgt = ms.getMemberElement();
        if (owner == null || tgt == null) return;
        addPRelation(owner, tgt, ms);
    }

    @Override
    public String caseParameterMembership(ParameterMembership pm) {
        addMembershipPRelation(pm);
        return null;
    }

    private void addType(Type typ) {
    	if (checkVisited(typ)) return;
        String keyword;
        if (typ instanceof Usage) {
            keyword = "comp usage ";
        } else {
            keyword = "comp def ";
        }
        String name = addActorLikeStyle(typ, extractTitleName(typ));
        addType(typ, name, keyword);
        process(new VCompartment(this), typ);
    }

    @Override 
    public String caseType(Type typ) {
        addType(typ);
        return "";
    }

    @Override
    public String caseUseCaseUsage(UseCaseUsage ucu) {
        return addUseCaseUsage(ucu);
    }

    @Override
    public String caseUseCaseDefinition(UseCaseDefinition ucd) {
        return addUseCaseDefinition(ucd);
    }

    @Override
    protected String getString() {
        return super.getString();
    }

    private VUseCase(VUseCase vt, Membership membership) {
        super(vt, membership);
    }

    VUseCase(VUseCaseMembers vt) {
    	super(vt);
    }

    public VUseCase(VMixed vt) {
        super(vt);
    }

    public VUseCase() {
        super();
    }
}
