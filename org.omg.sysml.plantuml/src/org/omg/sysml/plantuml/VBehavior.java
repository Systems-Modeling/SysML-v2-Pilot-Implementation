/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2022 Mgnite Inc.
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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;

public abstract class VBehavior extends VDefault {
    protected boolean isDoneAction(Feature f) {
        return "Actions::Action::done".equals(f.getQualifiedName());
    }

    protected boolean isStartAction(Feature f) {
        return "Actions::Action::start".equals(f.getQualifiedName());
    }

    protected boolean isEntryAction(ActionUsage au) {
        Membership ms = au.getOwningMembership();
        if (ms instanceof StateSubactionMembership) {
            StateSubactionMembership ssm = (StateSubactionMembership) ms;
            return (ssm.getKind() == StateSubactionKind.ENTRY);
        }
        return false;
    }

    protected boolean isExitAction(ActionUsage au) {
        Membership ms = au.getOwningMembership();
        if (ms instanceof StateSubactionMembership) {
            StateSubactionMembership ssm = (StateSubactionMembership) ms;
            return (ssm.getKind() == StateSubactionKind.EXIT);
        }
        return false;
    }

    private List<PRelation> entryExitTransitions = null;

    protected void addEntryExitTransitions(PRelation pr) {
        if (entryExitTransitions == null) {
            entryExitTransitions = new ArrayList<PRelation>();
        }
        entryExitTransitions.add(pr);
    }

    protected void outputEntryExitTransitions() {
        outputPRelations(entryExitTransitions);
    }

    private ActionUsage nullizeStartOrEntryAction(ActionUsage au) {
        if (isStartAction(au) || isEntryAction(au)) return null;
        return au;
    }

    private ActionUsage nullizeDoneOrExitAction(ActionUsage au) {
        if (isDoneAction(au) || isExitAction(au)) return null;
        return au;
    }

    private Element nullizeStartOrEntryAction(Element e) {
        if (!(e instanceof ActionUsage)) return e;
        return nullizeStartOrEntryAction((ActionUsage) e);
    }

    private Element nullizeDoneOrExitAction(Element e) {
        if (!(e instanceof ActionUsage)) return e;
        return nullizeDoneOrExitAction((ActionUsage) e);
    }

    @Override
    public String caseSuccession(Succession su) {
        for (Element src: su.getSource()) {
            src = nullizeStartOrEntryAction(src);
            for (Element dest: su.getTarget()) {
                dest = nullizeDoneOrExitAction(dest);
                if ((src == null) && (dest == null)) continue;
                if ((src == null) || (dest == null)) {
                    addEntryExitTransitions(new PRelation(makeInheritKey(su), src, dest, su, null));
                } else {
                    addPRelation(src, dest, su);
                }
            }
        }
        return "";
    }

    private boolean resolveReference(Feature f, ActionUsage au, boolean send) {
        if (!(f instanceof ReferenceUsage)) return false;
        boolean flag = true;
        for (Membership m: f.getOwnedMembership()) {
            if (m instanceof FeatureValue) {
                FeatureValue fv = (FeatureValue) m;
                Expression e = fv.getValue();
                Element r = resolveReference(e);
                if (r != null) {
                    addPRelation(au, r, au, send ? "<<send to>>" : "<<receive for>>");
                    continue;
                }
            }
            flag = false;
        }
        return flag;
    }

    private boolean addSendAcceptActionUsage(ActionUsage au, boolean send) {
        StringBuilder text = new StringBuilder();
        List<Feature> params = au.getParameter();
        final int size = params.size() - 1;
        if (size < 0) return false;
        for (int i = 0; i < size; i++) {
            Feature f = params.get(i);
            if (text.length() > 0) {
                text.append(", ");
            }
            text.append(getText(f));
        }

        Feature last = params.get(size);
        if (!resolveReference(last, au, send)) {
        	String lastStr = getText(last);
        	if ((lastStr != null) && !lastStr.isEmpty()) {
                text.append(send ? " to " : " for ");
                text.append(getText(last));
        	}
        }
        if (text.length() == 0) {
            String name = getNameAnyway(au);
            text.append(name);
        }
        addPUMLLine(au, send ? "send " : "accept ", text.toString());
        append('\n');
        return true;
    }

    @Override
    public String caseSendActionUsage(SendActionUsage sau) {
        if (addSendAcceptActionUsage(sau, true)) return "";
        return null;
    }

    @Override
    public String caseAcceptActionUsage(AcceptActionUsage aau) {
        if (addSendAcceptActionUsage(aau, false)) return "";
        return null;
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

    private String triggerToText(Step s) {
        Visitor v = new Visitor(this) {
            public String caseFeature(Feature f) {
                addFeatureTypeText("", f);
                return "";
            }
        };
        for (Feature f: s.getParameter()) {
            v.visit(f);
        }
        String str = v.getString();
        if (str.isEmpty()) {
            return getText(s);
        } else {
            return str;
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
                triggerString = triggerToText(s);
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
        ActionUsage src = tu.getSource();
        ActionUsage tgt = tu.getTarget();
        src = nullizeStartOrEntryAction(src);
        if (tgt == null) {
            if (src == null) return "";
        } else {
            tgt = nullizeDoneOrExitAction(tgt);
        }
        if ((src == null) || (tgt == null)) {
            addEntryExitTransitions(new PRelation(makeInheritKey(tu), src, tgt, tu, description));
        } else {
            addPRelation(src, tgt, tu, description);
        }
        return "";
    }

    VBehavior(Visitor v) {
        super(v);
    }
    
    VBehavior() {
    	super();
    }
}
