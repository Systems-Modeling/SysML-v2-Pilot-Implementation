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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.Succession;

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

    @Override
    public String caseSuccession(Succession su) {
        for (Element src: su.getSource()) {
            if (!(src instanceof ActionUsage) 
                || (isStartAction((ActionUsage) src)) 
                || (isEntryAction((ActionUsage) src))) {
                src = null;
            }
            for (Element dest: su.getTarget()) {
                if (!(dest instanceof ActionUsage)
                    || (isDoneAction((ActionUsage) dest))) {
                    dest = null;
                }
                if ((src == null) && (dest == null)) continue;
                if ((src == null) || (dest == null)) {
                    addEntryExitTransitions(new PRelation(src, dest, su, null));
                } else {
                    addPRelation(src, dest, su);
                }
            }
        }
        return "";
    }

    @Override
    public String caseSendActionUsage(SendActionUsage sau) {
        String text = null;
        for (FeatureMembership fm: sau.getOwnedFeatureMembership()) {
            Feature f = fm.getMemberFeature();
            if (f instanceof InvocationExpression) {
                text = getText(f);
            } else if (f instanceof FeatureReferenceExpression) {
                FeatureReferenceExpression ref = (FeatureReferenceExpression) f;
                addPRelation(sau, ref.getReferent(), sau, "<<send to>>");
            }
        }
        if (text == null) {
            text = getName(sau);
            if (text == null) {
                text = "noname";
            }
        }
        addPUMLLine(sau, "send ", text);
        append('\n');
        return "";
    }

    // TODO: It should be refactored with caseSendActionUsage
    @Override
    public String caseAcceptActionUsage(AcceptActionUsage aau) {
        String text = null;
        for (FeatureMembership fm: aau.getOwnedFeatureMembership()) {
            Feature f = fm.getMemberFeature();
            if (f instanceof InvocationExpression) {
                text = getText(f);
            } else if (f instanceof FeatureReferenceExpression) {
                FeatureReferenceExpression ref = (FeatureReferenceExpression) f;
                addPRelation(ref.getReferent(), aau, aau, "<<receive from>>");
            }
        }
        if (text == null) {
            text = getName(aau);
            if (text == null) {
                text = "noname";
            }
        }
        addPUMLLine(aau, "accept ", text);
        append('\n');
        return "";
    }


    VBehavior(Visitor v) {
        super(v);
    }
    
    VBehavior() {
    	super();
    }
}
