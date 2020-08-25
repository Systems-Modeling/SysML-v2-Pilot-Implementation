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
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.ForkNode;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.JoinNode;
import org.omg.sysml.lang.sysml.MergeNode;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.Type;

public class VActionMembers extends VDefault {

    private void addNode(Feature f, String stereotype) {
        String name = f.getName();
        if (name == null) return;
        append("state ");
        addNameWithId(f, name);
        append(stereotype);
        append(' ');
        addLink(f);
        append('\n');
    }

    public String caseParameterMembership(ParameterMembership pm) {
        FeatureDirectionKind fdk = pm.getDirection();
        Feature p = pm.getMemberParameter();
        switch (fdk) {
        case IN:
            addNode(p, "<<inputpin>>");
            break;
        case OUT:
            addNode(p, "<<outputpin>>");
            break;
        default:
            addNode(p, "<<port>>");
            break;
        }
        return "";
    }

    public String startAction(Type typ) {
        traverse(typ);
        closeBlock("");
        return "";
    }


    private Feature resolveItemFlowFeature(Feature f) {
        if (!(f instanceof ItemFlowFeature)) return f;
        ItemFlowFeature iff = (ItemFlowFeature) f;
        for (Redefinition r: iff.getOwnedRedefinition()) {
            Feature f2 = r.getRedefinedFeature();
            if (f2 != null) return f2;
        }
        return f;
    }

    @Override
    public String caseSuccession(Succession su) {
        Element src = null;
        Element dest = null;
        // We should use getSource() and getTarget() but they are not work so far.
        for (FeatureMembership fm2: su.getOwnedFeatureMembership()) {
            Feature f2 = fm2.getMemberFeature();
            if (src == null) {
                src = getEnd(f2);
            } else if (dest == null) {
                dest = getEnd(f2);
            } else {
                break;
            }
        }
        if ((src == null) || (dest == null)) return "";
        addPRelation(src, dest, su);
        return "";
    }

    @Override
    public String caseConnector(Connector c) {
        addConnector(c);
        return "";
    }

    @Override
    public String caseMergeNode(MergeNode mn) {
        addNode(mn, "<<choice>>");
        return "";
    }

    @Override
    public String caseJoinNode(JoinNode jn) {
        addNode(jn, "<<join>>");
        return "";
    }

    @Override
    public String caseForkNode(ForkNode fn) {
        addNode(fn, "<<fork>>");
        return "";
    }

    @Override
    public String caseItemFlow(ItemFlow itf) {
    	for (Feature src: itf.getSourceOutputFeature()) {
            Feature s = resolveItemFlowFeature(src);
    		for (Feature tgt: itf.getTargetInputFeature()) {
                Feature t = resolveItemFlowFeature(tgt);
    			addPRelation(s, t, itf, "");
    		}
    	}
        return "";
    }

    @Override
    public String caseActionUsage(ActionUsage su) {
        VAction v = new VAction(this);
        String ret = v.visit(su);
        append(ret);
        return ret;
    }

    VActionMembers(Visitor v) {
        super(v);
    }
}
