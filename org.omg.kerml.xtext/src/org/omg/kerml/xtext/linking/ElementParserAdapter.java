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

package org.omg.kerml.xtext.linking;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.ElementUtil;

public class ElementParserAdapter extends AdapterImpl {

	protected Class<?> kind;

	public ElementParserAdapter(Element element) {
		super();
		kind = element.getClass();
	}

	public Element getTarget() {
		return (Element)super.getTarget();
	}

	@Override
	public boolean isAdapterForType(Object object) {
		return kind.isInstance(object);
	}

	public void postProcess() {
		Element target = getTarget();
		target.setDeclaredName(ElementUtil.unescapeString(target.getDeclaredName()));
		target.setDeclaredShortName(ElementUtil.unescapeString(target.getDeclaredShortName()));
	}
}
