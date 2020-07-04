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

import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Type;

public class VDefault extends VTraverser {
    @Override
    public String caseAnnotation(Annotation a) {
        Comment c = a.getAnnotatingComment();
        if (c != null) {
            VComment v = new VComment(this);
            v.addComment(c, a);
        }
        return "";
    }

    @Override
    public String caseComment(Comment c) {
        VComment v = new VComment(this);
        v.addComment(c, null);
        return "";
    }

    @Override
    public String caseType(Type c) {
        return "";
    }

    VDefault(Visitor v) {
        super(v);
    }
    
    VDefault() {
    	super();
    }
}
