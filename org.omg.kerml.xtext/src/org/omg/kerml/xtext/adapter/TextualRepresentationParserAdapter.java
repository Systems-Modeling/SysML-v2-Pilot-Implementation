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

import org.omg.sysml.lang.sysml.TextualRepresentation;
import org.omg.sysml.util.ElementUtil;

public class TextualRepresentationParserAdapter extends ElementParserAdapter {

	public TextualRepresentationParserAdapter(TextualRepresentation element) {
		super(element);
	}

	@Override
	public TextualRepresentation getTarget() {
		return (TextualRepresentation)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		TextualRepresentation target = getTarget();
		target.setLanguage(ElementUtil.unescapeString(target.getLanguage()));
		target.setBody(ElementUtil.processCommentBody(target.getBody()));
	}
}
