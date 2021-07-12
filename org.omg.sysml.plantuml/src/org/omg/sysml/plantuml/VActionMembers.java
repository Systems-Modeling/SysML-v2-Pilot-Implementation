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

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.DecisionNode;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.ForkNode;
import org.omg.sysml.lang.sysml.JoinNode;
import org.omg.sysml.lang.sysml.MergeNode;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.Type;

public class VActionMembers extends VBehavior {

    private void addNode(Feature f, String type) {
        String name = f.getName();
        if (name == null) {
            name = "noname";
        }
        append(type);
        append(' ');
        addNameWithId(f, name, true);
        append(' ');
        addLink(f);
        append('\n');
    }

    public String caseParameterMembership(ParameterMembership pm) {
        Feature p = pm.getMemberParameter();
        FeatureDirectionKind fdk = p.getDirection();
       switch (fdk) {
        case IN:
            addNode(p, "portin");
            break;
        case OUT:
            addNode(p, "portout");
            break;
        default:
            addNode(p, "port");
            break;
        }
        return "";
    }

    public String startAction(Type typ) {
        traverse(typ);
        outputEntryExitTransitions();
        closeBlock();
        return "";
    }

    @Override
    public String caseDecisionNode(DecisionNode dn) {
        addNode(dn, "choice");
        return "";
    }

    @Override
    public String caseMergeNode(MergeNode mn) {
        addNode(mn, "choice");
        return "";
    }

    @Override
    public String caseJoinNode(JoinNode jn) {
        addNode(jn, "join");
        return "";
    }

    @Override
    public String caseForkNode(ForkNode fn) {
        addNode(fn, "fork");
        return "";
    }

    @Override
    public String caseActionUsage(ActionUsage au) {
        // Start action should be specially visualized as a black circle.
        if (isStartAction(au)) return "";
        VAction v = new VAction(this);
        String ret = v.visit(au);
        append(ret);
        return ret;
    }

    VActionMembers(Visitor v) {
        super(v);
    }
}
