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

import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;

public abstract class VTraverser extends Visitor {
    public String traverse(org.omg.sysml.lang.sysml.Package p) {
        for (Membership m: p.getOwnedMembership()) {
            // if (visit(m) == null) return null;
            visit(m);
            for (Relationship r: m.getOwnedRelationship()) {
                visit(r);
            }
        }
        return getString();
    }

    @Override
    public String caseMembership(Membership m) {
        return visit(m.getMemberElement());
    }

    @Override
    public String casePackage(org.omg.sysml.lang.sysml.Package p) {
        return traverse(p);
    }
    
    protected VTraverser(Visitor prev, boolean block) {
    	super(prev, block);
    }
    
    protected VTraverser(Visitor prev) {
    	super(prev);
    }
    
    protected VTraverser() {
    	super();
    }
}
