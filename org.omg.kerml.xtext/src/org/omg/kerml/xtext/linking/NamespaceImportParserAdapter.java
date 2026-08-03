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

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.NamespaceImport;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Namespace;

public class NamespaceImportParserAdapter extends ImportParserAdapter {

	public NamespaceImportParserAdapter(NamespaceImport element) {
		super(element);
	}

	@Override
	public NamespaceImport getTarget() {
		return (NamespaceImport)super.getTarget();
	}

	@Override
	public void postProcess() {
		super.postProcess();
		
		NamespaceImport obj = getTarget();		
		// If importedNamespace is empty, then set it to the first ownedRelatedElement, if this is a namespace
		// (filling in the implicit import for a filter package). Otherwise, set it to the importOwningNamspace.
		Object importedNamespace = obj.eGet(SysMLPackage.Literals.NAMESPACE_IMPORT__IMPORTED_NAMESPACE, false);
		if (importedNamespace == null) {
			EList<Element> ownedRelatedElement = obj.getOwnedRelatedElement();
			if (!ownedRelatedElement.isEmpty() && ownedRelatedElement.get(0) instanceof Namespace) {
				// Fill in the implicit import for a filter package.
				obj.setImportedNamespace((Namespace)ownedRelatedElement.get(0));
			} else {
				obj.setImportedNamespace(obj.getImportOwningNamespace());
			}
		}
	}
}
