/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *******************************************************************************/
package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.util.ElementUtil;

public class CommentAdapter extends AnnotatingElementAdapter {
	
	public CommentAdapter(Comment element) {
		super(element);
	}
	
	@Override
	public Comment getTarget() {
		return (Comment)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		super.postProcess();
		Comment target = getTarget();
		target.setLocale(ElementUtil.unescapeString(target.getLocale()));
		target.setBody(ElementUtil.processCommentBody(target.getBody()));
	}
}
