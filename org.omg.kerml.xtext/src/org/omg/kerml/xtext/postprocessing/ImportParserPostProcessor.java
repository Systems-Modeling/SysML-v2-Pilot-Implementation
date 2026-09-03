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

import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.NamespaceImport;
import org.omg.sysml.lang.sysml.VisibilityKind;

public class ImportParserPostProcessor extends ElementParserPostProcessor {

	public ImportParserPostProcessor(Import element) {
		super(element);
	}

	@Override
	public Import getTarget() {
		return (Import)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		
		// If the target Import is for a filtered import package, set its visibility to PUBLIC.
		Import target = getTarget();
		Namespace owningNamespace = target.getImportOwningNamespace();
		if (owningNamespace != null && owningNamespace.getOwningRelationship() instanceof NamespaceImport) {
			target.setVisibility(VisibilityKind.PUBLIC);
		}
	}
}
