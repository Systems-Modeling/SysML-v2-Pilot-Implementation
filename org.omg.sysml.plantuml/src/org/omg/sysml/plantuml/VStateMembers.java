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

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;

public class VStateMembers extends VBehavior {
    private List<String> descriptions = null;

    private String convertToDescription(StateSubactionMembership sam) {
        ActionUsage au = sam.getAction();
        if (au == null) return null;

        StringBuilder sb = new StringBuilder();
        // Bold
        sb.append("**");
        sb.append(sam.getKind().getName());
        sb.append("**/ ");

        String name;
        if ((au instanceof SendActionUsage)
            || (au instanceof AcceptActionUsage)) {
            name = getText(au);
        } else {
            name = au.getName();
        }
        if ((name == null) || (name.isEmpty())) {
            for (Subsetting ss: au.getOwnedSubsetting()) {
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

    private void addDescription(StateSubactionMembership ssm) {
        String desc = convertToDescription(ssm);
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
        addDescription(ssm);
        return "";
    }

    private String visitState(Type stateType) {
        VStateMachine v = new VStateMachine(this);
        String ret = v.visit(stateType);
        append(ret);
        return ret;
    }

    @Override
    public String caseStateUsage(StateUsage su) {
        return visitState(su);
    }

    @Override
    public String caseStateDefinition(StateDefinition sd) {
        return visitState(sd);
    }

    public String startStateUsage(Type typ) {
        traverse(typ);
        if (descriptions != null) {
            String name = getName(typ);
            if (name != null) {
                int size = descriptions.size();
                for (int i = 0; i < size; i++) {
                    append("desc ");
                    addNameWithId(typ, name, false);
                    append(" : ");
                    append(descriptions.get(i));
                    append('\n');
                }
            }
        }
        outputEntryExitTransitions();
        closeBlock();
        return "";
    }

    private static class LineFoldStringBuilder {
    	private StringBuilder sb = new StringBuilder();
        private static int LINEFOLD_LEN = 20;
        private int curLen;
        public void fold() {
            if (curLen <= LINEFOLD_LEN) return;
            sb.append("\\n");
            curLen = 0;
        }

        public void append(String s) {
            curLen += s.length();
            sb.append(s);
        }

        public void append(char ch) {
            curLen++;
            sb.append(ch);
        }
        
        @Override
        public String toString() {
        	return sb.toString();
        }
    }

    private String convertToDescription(TransitionUsage tu) {
        String triggerString = null;
        String guardString = null;
        String effectString = null;

        for (FeatureMembership fm: tu.getOwnedFeatureMembership()) {
            if (!(fm instanceof TransitionFeatureMembership)) continue;
            TransitionFeatureMembership tfm = (TransitionFeatureMembership) fm;
            Step s = tfm.getTransitionFeature();
            if (s == null) continue;
            switch (tfm.getKind()) {
            case TRIGGER:
                VTraverser v = new VTraverser(this) {
                    public String caseItemFeature(ItemFeature itemFeature) {
                        addFeatureTypeText("", itemFeature);
                        return "";
                    }
                };
                triggerString = v.traverse(s);
                break;
            case GUARD:
                guardString = getText(s);
                break;
            case EFFECT:
                effectString = getText(s);
                break;
            }
        }

        LineFoldStringBuilder ls = new LineFoldStringBuilder();
        if (triggerString != null) {
            triggerString = triggerString.trim();
            if (!(triggerString.isEmpty())) {
                ls.append(triggerString);
                ls.append(' ');
            }
        }
        if (guardString != null) {
            guardString = guardString.trim();
            if (!guardString.isEmpty()) {
                ls.fold();
                ls.append('[');
                ls.append(guardString);
                ls.append(']');
            }
        }
        if (effectString != null) {
            effectString = effectString.trim();
            if (!effectString.isEmpty()) {
                ls.fold();
                ls.append('/');
                ls.append(effectString);
            }
        }

        return ls.toString();
    }

    @Override
    public String caseTransitionUsage(TransitionUsage tu) {
        String description = convertToDescription(tu);
        Feature src = tu.getSource();
        Feature tgt = tu.getTarget();
    	if (isDoneAction(tgt)) tgt = null;
        if ((src == null) && (tgt == null)) return "";
        if ((src == null) || (tgt == null)) {
            addEntryExitTransitions(new PRelation(src, tgt, tu, description));
        } else {
            addPRelation(src, tgt, tu, description);
        }
        return "";
    }

    VStateMembers(Visitor v) {
        super(v);
    }
}
