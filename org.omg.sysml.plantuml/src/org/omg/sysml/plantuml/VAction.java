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

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Type;

public class VAction extends VDefault {
    private void addAction(Type typ) {
        append("state ");
        addNameWithId(typ);
        addLink(typ);
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
