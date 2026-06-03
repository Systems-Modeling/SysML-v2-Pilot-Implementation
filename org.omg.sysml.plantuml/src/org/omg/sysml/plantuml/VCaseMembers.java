/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2021 Mgnite Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
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

import java.util.ArrayList;
import java.util.List;

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Type;

public class VCaseMembers extends VBehavior {
    private List<VCase> queue = new ArrayList<>();
    
    public void processCase(Type typ) {
        traverse(typ);
        outputEntryExitTransitions();
        closeBlock();
        for (VCase v: queue) {
            v.flush();
        }
        flush();
    }

    private void rec(VCase v, Element e, boolean inside) {
        v.visit(e);
        if (inside) {
            v.flush();
        } else {
            queue.add(v);
        }
    }

    private void recMembership(Membership ms, boolean inside) {
        rec(new VCase(this, getCurrentNamespace(), ms), ms, inside);
    }

    private void recElement(Element e, boolean inside) {
        rec(new VCase(this), e, inside);
    }
    
    private String addAction(Type typ) {
        recElement(typ, true);
        return "";
    }

    @Override
    public String caseActionUsage(ActionUsage ucu) {
        return addAction(ucu);
    }

    @Override
    public String caseMembership(Membership m) {
        Element e = m.getMemberElement();
        if ((e instanceof ActionUsage)  // Action-like elements are recursively rendered.
            || (e instanceof Relationship)) {
            return super.caseMembership(m);
        }
        recMembership(m, false);
        return "";
    }

    @Override
    public String caseSubjectMembership(SubjectMembership sm) {
        recMembership(sm, false);
        return "";
    }

    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        recMembership(om, true);
        return "";
    }

    VCaseMembers(VCase vt) {
    	super(vt);
    }
}
