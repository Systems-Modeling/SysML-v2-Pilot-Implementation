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
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;

public class VStateMembers extends VDefault {
    private List<String> descriptions = null;
    private List<PRelation> entryExitTransitions = null;

    private void addEntryExitTransitions(PRelation pr) {
        if (entryExitTransitions == null) {
            entryExitTransitions = new ArrayList<PRelation>();
        }
        entryExitTransitions.add(pr);
    }

    private String convertToDescription(StateSubactionMembership sam) {
        ActionUsage au = sam.getAction();
        if (au == null) return null;

        StringBuilder sb = new StringBuilder();
        // Bold
        sb.append("**");
        sb.append(sam.getKind().getName());
        sb.append("**/ ");

        String name = au.getName();
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

    @Override
    public String caseStateUsage(StateUsage su) {
        VStateMachine v = new VStateMachine(this);
        String ret = v.visit(su);
        append(ret);
        return ret;
    }

    public String startStateUsage(Type typ) {
        traverse(typ);
        String name = getName(typ);
        if ((name != null) && (descriptions != null)) {
            int size = descriptions.size();
            if (length() > 0) {
                outputPRelations(entryExitTransitions);
                closeBlock("");
                append("state ");
                addNameWithId(typ, name);
            }
            int i = 0;
            for (;;) {
                append(" : ");
                append(descriptions.get(i));
                append('\n');
                i++;
                if (i >= size) break;

                append("state ");
                addNameWithId(typ, name);
            }
            flush();
        } else {
            outputPRelations(entryExitTransitions);
            closeBlock("");
        }
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
                triggerString = getText(s);
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
            ls.append(triggerString);
        }
        if (guardString != null) {
            ls.fold();
            ls.append('[');
            ls.append(guardString);
            ls.append(']');
        }
        if (effectString != null) {
            ls.fold();
            ls.append('/');
            ls.append(effectString);
        }

        return ls.toString();
    }

    private boolean isDoneAction(Feature f) {
        if (!(f instanceof ActionUsage)) return false;
        if (!("done".equals(f.getName()))) return false;
        ActionUsage au = (ActionUsage) f;
        for (Behavior b: au.getActionDefinition()) {
            if ("Action".equals(b.getName())) return true;
        }
        return false;
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
            addEntryExitTransitions(new PRelation(src, dest, su, null));
        } else {
            addPRelation(src, dest, su);
        }
        return "";
    }

    VStateMembers(Visitor v) {
        super(v);
    }
}
