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
import org.omg.sysml.lang.sysml.Element;

public class VComment extends Visitor {
    public VComment(Visitor v) {
    	super(v, true);
	}

	public void addComment(Comment c, Annotation a) {
        if (checkId(c)) return;
        append("note as ");
        addIdStr(c);
        append('\n');
        addLink(c, "@");
        addTrimmedBody(c.getBody());
        append("\nend note ");
        append('\n');

        Element e = c.getCommentedElement();
        if (e == null) {
            if (a != null) {
                e = a.getAnnotatedElement();
            }
        }
        if (e != null) {
            addPRelation(c, e, c);
        }
    }
}
