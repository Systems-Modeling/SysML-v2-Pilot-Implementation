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
import java.util.List;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.UseCaseDefinition;
import org.omg.sysml.lang.sysml.UseCaseUsage;

public class VUseCaseMembers extends VBehavior {
    private List<VUseCase> queue = new ArrayList<>();
    
    public void processUseCase(Type typ) {
        traverse(typ);
        outputEntryExitTransitions();
        closeBlock();
        for (VUseCase v: queue) {
            v.flush();
        }
        flush();
    }

    private void rec(Element e, boolean inside) {
        VUseCase v = new VUseCase(this);
        v.visit(e);
        if (inside) {
            v.flush();
        } else {
            queue.add(v);
        }
    }
    
    private String addUseCase(Type typ) {
        rec(typ, true);
        return "";
    }

    @Override
    public String caseUseCaseUsage(UseCaseUsage ucu) {
        return addUseCase(ucu);
    }

    @Override
    public String caseUseCaseDefinition(UseCaseDefinition ucd) {
        return addUseCase(ucd);
    }

    @Override
    public String caseIncludeUseCaseUsage(IncludeUseCaseUsage iucu) {
        return addUseCase(iucu);
    }

    @Override
    public String caseMembership(Membership m) {
        Element e = m.getMemberElement();
        if ((e instanceof UseCaseUsage)
            || (e instanceof Relationship)) {
            return super.caseMembership(m);
        }
        rec(m, false);
        return "";
    }

    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        rec(om, true);
        return "";
    }

    @Override
    public String caseSubjectMembership(SubjectMembership sm) {
        Usage u = sm.getOwnedSubjectParameter();
        for (FeatureTyping ft: u.getOwnedTyping()) {
            Type typ = ft.getType();
            addPRelation(sm.getMembershipOwningNamespace(), typ, sm, "<<subject>>");
        }
        return "";
    }

    VUseCaseMembers(VUseCase vt) {
    	super(vt);
    }
}
