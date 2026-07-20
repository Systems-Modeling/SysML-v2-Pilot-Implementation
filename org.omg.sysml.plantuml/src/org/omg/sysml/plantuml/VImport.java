/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2022 Mgnite Inc.
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml;

import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.MembershipImport;
import org.omg.sysml.lang.sysml.Namespace;

public class VImport extends Visitor {
    public VImport(Visitor v) {
    	super(v, true);
    }

    public void addImport(Import imp) {
        Namespace nsOwn = imp.getImportOwningNamespace();
        
        String description = imp instanceof MembershipImport? 
        		imp.isRecursive()? "<<import>>**": "<<import>>":
        		imp.isRecursive()? "<<import>>*::**": "<<import>>*";
        		
        addPRelation(null, nsOwn, imp.getImportedElement(), imp, description);
   }
}
