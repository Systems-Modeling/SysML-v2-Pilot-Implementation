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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Subsetting;
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
     "skinparam ranksep 8\n",
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

    private String addActorStyle(Type typ, String name) {
        Membership ms = typ.getOwningMembership();
        if (ms instanceof ActorMembership) {
            return "<size:30><&person></size> " + name;
        } else {
            return name;
        }
    }

    private List<VTree> subtrees = new ArrayList<VTree>();

    @Override
    protected void flush() {
        for (VTree vt: subtrees) {
            vt.flush();
        }
        subtrees.clear();
        super.flush();
    }
    
    private static String getUseCaseName(Feature f, Set<Feature> visited) {
        if (visited.contains(f)) return null;
        visited.add(f);
        String name = f.getEffectiveName();
        if (name != null) return name;
        for (Subsetting ss: f.getOwnedSubsetting()) {
            Feature sf = ss.getSubsettedFeature();
            name = getUseCaseName(sf, visited);
            if (name != null) return name;
        }
        return null;
    }

    private static String getUseCaseName(Feature f) {
        String name = f.getEffectiveName();
        if (name != null) return name;
        return getUseCaseName(f, new HashSet<>());
    }

    private String addUseCase(String name, Type typ) {
        addRecLine(name, typ, true);
        addSpecializations(typ);

        VUseCaseMembers v = new VUseCaseMembers(this);
        v.processUseCase(typ);

        return "";
    }

    private String addUseCaseUsage(UseCaseUsage ucu) {
        String name = getUseCaseName(ucu);
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
        return "";
    }

    private void addType(Type typ) {
    	if (checkVisited(typ)) return;
        String keyword;
        if (typ instanceof Usage) {
            keyword = "comp usage ";
        } else {
            keyword = "comp def ";
        }
        String name = addActorStyle(typ, extractTitleName(typ));
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
        flush();
        return super.getString();
    }

    private VUseCase(VUseCase vt, Membership membership) {
        super(vt, membership);
    }

    VUseCase(VUseCaseMembers vt) {
    	super(vt);
    }

    public VUseCase() {
        super();
    }
}
