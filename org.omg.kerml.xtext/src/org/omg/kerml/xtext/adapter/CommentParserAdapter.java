/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.omg.kerml.xtext.adapter;

import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.util.ElementUtil;

public class CommentParserAdapter extends ElementParserAdapter {

	public CommentParserAdapter(Comment element) {
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
