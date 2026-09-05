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

package org.omg.kerml.xtext.postprocessing;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.ElementUtil;

public class ElementParserPostProcessor {

	private final Element target;

	public ElementParserPostProcessor(Element element) {
		target = element;
	}

	public Element getTarget() {
		return target;
	}

	public void postProcess() {
		Element target = getTarget();
		target.setDeclaredName(ElementUtil.unescapeString(target.getDeclaredName()));
		target.setDeclaredShortName(ElementUtil.unescapeString(target.getDeclaredShortName()));
	}
}
