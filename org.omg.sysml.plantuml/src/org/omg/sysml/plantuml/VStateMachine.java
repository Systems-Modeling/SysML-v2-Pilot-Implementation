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

import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Type;

public class VStateMachine extends VDefault {
    private final boolean showStereotype;

    private void addState(Type typ, boolean isParallel, boolean withStyle) {
        String name = getNameAnyway(typ);
        if (isParallel) {
            name = name + "\\n" + "<b>parallel</b>";
        }
        int id = addRecLine(name, typ, withStyle);
        addSpecializations(id, typ);
        VStateMembers v = new VStateMembers(this);
        v.startStateUsage(typ);
        append("\n");
    }

    @Override
    public String caseStateUsage(StateUsage su) {
        addState(su, su.isParallel(), showStereotype);
        return getString();
    }
    
    @Override
    public String caseExhibitStateUsage(ExhibitStateUsage esu) {
        addState(esu, esu.isParallel(), true);
        return getString();
    }
    

    @Override
    public String caseStateDefinition(StateDefinition sd) {
        addState(sd, sd.isParallel(), true);
        return getString();
    }
    
    public VStateMachine(Visitor prev) {
    	super(prev);
        setMultiplicityStyle(MultiplicityStyle.NONE);
        this.showStereotype = true;
    }

    public VStateMachine() {
        setMultiplicityStyle(MultiplicityStyle.NONE);
        this.showStereotype = false;
    }
}
