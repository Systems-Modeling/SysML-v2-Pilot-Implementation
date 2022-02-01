/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2022 Mgnite Inc.
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

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.util.SysMLScopeUtil;

public class VImport extends Visitor {
    public VImport(Visitor v) {
    	super(v, true);
    }

    public void addImport(Import imp) {
        String name = imp.getImportedMemberName();
        Namespace nsOwn = imp.getImportOwningNamespace();

        if ("*".equals(name) || name == null) {
            addPRelation(nsOwn, imp.getImportedNamespace(), imp, "<<import>>*");
        } else if (imp.isRecursive()) {
            Collection<Membership> mss = SysMLScopeUtil.getMembershipsFor(imp, SysMLPackage.eINSTANCE.getImport_ImportOwningNamespace(),
                                                                          name, false);
            for (Membership ms: mss) {
                addPRelation(nsOwn, ms.getMemberElement(), imp, "<<import>>**");
            }
        } else {
            for (Membership ms: imp.importedMembership(new BasicEList<>())) {
                addPRelation(nsOwn, ms.getMemberElement(), imp, "<<import>>");
            }
        }
    }
}
