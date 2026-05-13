/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2023 Mgnite Inc.
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

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Subsetting;
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
        sb.append("** ");

        String name;
        if ((au instanceof SendActionUsage)
            || (au instanceof AcceptActionUsage)) {
            name = getText(au);
        } else {
            name = au.getDeclaredName();
        }
        if ((name == null) || (name.isEmpty())) {
            for (Subsetting ss: au.getOwnedSubsetting()) {
                Feature f = ss.getSubsettedFeature();
                if (f instanceof ActionUsage) {
                    if (!(ss instanceof Redefinition)) {
                        String name2 = getName(f);
                        if (name2 != null) {
                            sb.append(name2);
                            sb.append(' ');
                        }
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
        return doSwitch(fm.getOwnedMemberFeature());
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
            String name = getNameAnyway(typ);
            int size = descriptions.size();
            for (int i = 0; i < size; i++) {
                append("desc ");
                addNameWithId(typ, name, false);
                append(" : ");
                append(descriptions.get(i));
                append('\n');
            }
        }
        outputEntryExitTransitions();
        closeBlock();
        return "";
    }

    VStateMembers(VStateMachine v) {
        super(v);
    }
}
