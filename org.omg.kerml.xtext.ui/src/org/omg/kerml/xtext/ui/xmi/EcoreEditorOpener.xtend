/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.kerml.xtext.ui.xmi

import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener
import org.eclipse.ui.IEditorPart
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.presentation.EcoreEditor

class EcoreEditorOpener extends LanguageSpecificURIEditorOpener {
	
	
	override protected selectAndReveal(IEditorPart openEditor, URI uri, EReference crossReference, int indexInList, boolean select) {
		if (uri.fragment !== null){
			val editor = openEditor.getAdapter(EcoreEditor)
			val eObject = editor.editingDomain.resourceSet.getEObject(uri, false)
			editor.selectionToViewer = #[eObject]
		}
	}
	
	override protected getEditorId() {
		'org.omg.sysml.lang.sysml.presentation.KerMLxEditorID'
	}
	
}