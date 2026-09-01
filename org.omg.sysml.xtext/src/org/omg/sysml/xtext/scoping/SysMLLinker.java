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
package org.omg.sysml.xtext.scoping;

import org.omg.kerml.xtext.adapter.ElementParserAdapter;
import org.omg.kerml.xtext.scoping.KerMLLinker;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.xtext.adapter.SysMLParserAdapterFactory;

public class SysMLLinker extends KerMLLinker{
	
	@Override
	protected ElementParserAdapter doGetAdapter(Element element) {
		return SysMLParserAdapterFactory.getAdapter(element);
	}

}
