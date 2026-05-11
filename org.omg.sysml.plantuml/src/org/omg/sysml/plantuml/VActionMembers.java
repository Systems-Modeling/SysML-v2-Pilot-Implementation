/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2024 Mgnite Inc.
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

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.DecisionNode;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.ForkNode;
import org.omg.sysml.lang.sysml.JoinNode;
import org.omg.sysml.lang.sysml.MergeNode;
import org.omg.sysml.lang.sysml.Type;

public class VActionMembers extends VBehavior {

    private int addNode(Feature f, String type) {
        String name = getNameAnyway(f);
        append(type);
        append(' ');
        int id = addNameWithId(f, name, true);
        append(' ');
        addLink(f);
        append('\n');
        return id;
    }

    public String caseFeature(Feature f) {
        if (VSSRMembers.isStateSpaceMember(f)) {
            if (addRecLine(f, true) < 0) return null;
            VSSRMembers vs = new VSSRMembers(this);
            return vs.start(f);
        }
        FeatureDirectionKind fdk = f.getDirection();
        if (fdk == null) return null;
        String nodeKind;
        switch (fdk) {
        case IN:
            nodeKind = "portin";
            break;
        case OUT:
            nodeKind = "portout";
            break;
        case INOUT:
            nodeKind = "port";
            break;
        default:
            return null;
        }
        int id = addNode(f, nodeKind);
        addFeatureValueBindings(id, f);
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
        // Start or done action should be specially visualized
    	// as a black circle or a white and black concentric circles.
        if (isStartAction(au) || isDoneAction(au) || isEntryAction(au) || isExitAction(au)) return "";
        VAction v = new VAction(this);
        String ret = v.visit(au);
        append(ret);
        return ret;
    }

    VActionMembers(Visitor v) {
        super(v);
    }
}
