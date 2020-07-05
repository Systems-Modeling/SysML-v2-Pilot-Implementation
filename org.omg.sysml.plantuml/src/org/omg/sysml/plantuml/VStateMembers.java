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

import java.util.ArrayList;
import java.util.List;

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;

public class VStateMembers extends VDefault {
    private List<String> descriptions = null;
    private List<PRelation> initTransitions = null;

    private String convertToDescription(StateSubactionMembership sam,
                                        PerformActionUsage pau) {
        StringBuilder sb = new StringBuilder();
        // Bold
        sb.append("**");
        sb.append(sam.getKind().getName());
        sb.append("**/ ");

        String name = pau.getName();
        if ((name == null) || (name.isEmpty())) {
            for (Subsetting ss: pau.getOwnedSubsetting()) {
                Feature f = ss.getSubsettedFeature();
                if (f instanceof ActionUsage) {
                    if (!(ss instanceof Redefinition)) {
                        sb.append(f.getName());
                        sb.append(' ');
                    }
                }
            }
        } else {
            sb.append(name);
        }
        if (sb.length() == 0) return null;
        return sb.toString();
    }

    private void addDescription(StateSubactionMembership ssm,
                                PerformActionUsage pau) {
        String desc = convertToDescription(ssm, pau);
        if (desc == null) return;
        if (descriptions == null) {
            descriptions = new ArrayList<String>();
        }
        descriptions.add(desc);
    }

    @Override
    public String caseFeatureMembership(FeatureMembership fm) {
        return doSwitch(fm.getMemberFeature());
    }

    @Override
    public String caseStateSubactionMembership(StateSubactionMembership ssm) {
        ActionUsage au = ssm.getAction();
        if (au instanceof PerformActionUsage) {
            addDescription(ssm, (PerformActionUsage) au);
        }
        return "";
    }

    @Override
    public String caseStateUsage(StateUsage su) {
        VStateMachine v = new VStateMachine(this);
        String ret = v.visit(su);
        append(ret);
        return ret;
    }

    public String startStateUsage(Type typ) {
        traverse(typ);
        if (descriptions != null) {
            int size = descriptions.size();
            if (length() > 0) {
                outputPRelations(initTransitions);
                closeBlock("");
                append("state ");
                addNameWithId(typ);
            }
            int i = 0;
            for (;;) {
                append(" : ");
                append(descriptions.get(i));
                append('\n');
                i++;
                if (i >= size) break;

                append("state ");
                addNameWithId(typ);
            }
            flush();
        } else {
            outputPRelations(initTransitions);
            closeBlock("");
        }
        return "";
    }

    private String convertToDescription(TransitionUsage aau) {
        VTraverser v = new VTraverser(this) {
            public String caseItemFeature(ItemFeature itemFeature) {
                addTypeText("", itemFeature);
                return "";
            }
        };
        return v.traverse(aau);
    }

    @Override
    public String caseTransitionUsage(TransitionUsage tu) {
        String description = convertToDescription(tu);
        Feature src = tu.getSource();
        Feature tgt = tu.getTarget();
        if ((src != null) && (tgt != null)) {
            addPRelation(src, tgt, tu, description);
        }
        return "";
    }

    @Override
    public String caseSuccession(Succession su) {
        Element src = null;
        Element dest = null;
        for (FeatureMembership fm2: su.getOwnedFeatureMembership()) {
            Feature f2 = fm2.getMemberFeature();
            if (f2 instanceof SourceEnd) {
                if (src == null) {
                    src = getEnd(f2);
                }
            } else {
                if (dest == null) {
                    dest = getEnd(f2);
                }
            }
        }

        if (!(src instanceof StateUsage)) {
            src = null;
        }
        if (!(dest instanceof StateUsage)) {
            dest = null;
        }
        if ((src == null) && (dest == null)) return "";
        if ((src == null) || (dest == null)) {
            if (initTransitions == null) {
                initTransitions = new ArrayList<PRelation>();
            }
            initTransitions.add(new PRelation(src, dest, su, null));
        } else {
            addPRelation(src, dest, su);
        }
        return "";
    }

    VStateMembers(Visitor v) {
        super(v);
    }
}
