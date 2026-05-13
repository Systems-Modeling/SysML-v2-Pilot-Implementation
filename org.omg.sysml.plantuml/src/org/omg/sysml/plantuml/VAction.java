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

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleRelSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

public class VAction extends VDefault {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle
    ("VAction",
      null,
     "skinparam ranksep 8\n",
     new StyleSwitch(new StyleRelSwitch() {
		@Override
		public String caseSuccession(Succession s) {
            return " ..> ";
		}
		@Override
		public String caseTransitionUsage(TransitionUsage tu) {
            return " ..> ";
		}
    }, null));

    @Override 
    protected SysML2PlantUMLStyle getStyle() {
        return style;
    }

    private void addAction(Type typ) {
        int id = addRecLine(typ, true);
        if (id < 0) return;
        addSpecializations(id, typ);
        VActionMembers v = new VActionMembers(this);
        v.startAction(typ);
        append("\n");
    }

    @Override
    public String caseActionDefinition(ActionDefinition ad) {
        addAction(ad);
        return getString();
    }

    @Override
    public String caseActionUsage(ActionUsage au) {
        addAction(au);
        return getString();
    }

    public VAction(Visitor prev) {
    	super(prev);
        setMultiplicityStyle(MultiplicityStyle.NONE);
    }

    public VAction() {
    	setMultiplicityStyle(MultiplicityStyle.NONE);
    }
}
