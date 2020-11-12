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

import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

public class VStateMachine extends VDefault {
    private void addState(Type typ) {
    	String name = getName(typ);
    	if (name == null) return;
        if (typ instanceof Usage) {
            append("rec usage ");
        } else {
            append("rec def ");
        }
        addNameWithId(typ, name, true);
        addLink(typ);
        VStateMembers v = new VStateMembers(this);
        v.startStateUsage(typ);
        append("\n");
    }

    @Override
    public String caseStateUsage(StateUsage su) {
        if (su instanceof ExhibitStateUsage) return "";
        addState(su);
        return getString();
    }
    

    @Override
    public String caseStateDefinition(StateDefinition sd) {
        addState(sd);
        return getString();
    }
    
    public VStateMachine(Visitor prev) {
    	super(prev);
        setShowsMultiplicity(false);
    }

    public VStateMachine() {
        setShowsMultiplicity(false);
    }
}
