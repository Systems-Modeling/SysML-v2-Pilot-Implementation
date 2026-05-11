/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2022 Mgnite Inc.
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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

import java.util.List;

import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Element;

public class VComment extends Visitor {
    public VComment(Visitor v) {
    	super(v, true);
	}

    private void addTrimmedBody(String str) {
        int len = str.length();
        int st = -1;
        int end = -1;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                if (end < 0) end = i;
            } else {
                if (st < 0) st = i;
                end = -1;
            }
            if (c == '\n') {
                if (st >= 0) {
                    if (end < 0) end = i;
                    append(str, st, end);
                }
                append('\n');
                st = end = -1;
            }
        }
        if (st >= 0) {
            if (end < 0) end = len;
            append(str, st, end);
        }
    }

    private void addCommentInternal(Comment c) {
        if (checkId(c)) return;
        append("note as ");
        addIdStr(c, true);
        append('\n');
        addLink(c, "@");
        addTrimmedBody(c.getBody());
        append("\nend note ");
        append('\n');
    }

	public void addComment(Comment c) {
        addCommentInternal(c);
        List<Element> es = c.getAnnotatedElement();
        for (Element e: es) {
        	addPRelation(null, c, e, c, null);
        }
    }

	public void addComment(Comment c, Element annotatedElement) {
        addCommentInternal(c);
        if (annotatedElement != null) {
        	addPRelation(null, c, annotatedElement, c, null);
        }
    }
}
