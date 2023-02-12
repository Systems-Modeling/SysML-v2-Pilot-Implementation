/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2023 Mgnite Inc.
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
        setShowsMultiplicity(false);
    }

    public VAction() {
        setShowsMultiplicity(false);
    }
}
