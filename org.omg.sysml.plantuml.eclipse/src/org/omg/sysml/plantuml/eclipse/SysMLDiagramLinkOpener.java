/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020 Mgnite Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Hisashi Miyashita, Mgnite Inc.
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml.eclipse;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.XtextEditor;

import net.sourceforge.plantuml.eclipse.utils.ILinkOpener;
import net.sourceforge.plantuml.eclipse.utils.LinkData;

public class SysMLDiagramLinkOpener implements ILinkOpener {
    public static final String SYSML_PLINK_SCHEME = "psysml";

    private URI getURI(LinkData link) {
        try {
            return URI.createURI(link.href);
        } catch (IllegalArgumentException e) {
        }
        return null;
    }

    public static URI getEObjectLink(EObject eObj) {
        String id = Activator.registerEObject(eObj);
        if (id == null) return null;
        return URI.createGenericURI(SYSML_PLINK_SCHEME, id, null);
    }

    
    @Override
    public int supportsLink(LinkData link) {
        URI uri = getURI(link);
        if ((uri != null) && (SYSML_PLINK_SCHEME.equals(uri.scheme()))) {
            return CUSTOM_SUPPORT;
        }
        return NO_SUPPORT;
    }


    private IPath getPath(EObject eObj) {
        Resource r = eObj.eResource();
        if (r == null) return null;

        URI uri = r.getURI();
        uri = r.getResourceSet().getURIConverter().normalize(uri);
        int size = uri.segmentCount();
        if ((size > 1)
            && ("platform".equals(uri.scheme()))
            && ("resource".equals(uri.segment(0)))) {
            StringBuilder path = new StringBuilder();
            for (int i = 1; i < size; i++) {
                path.append('/');
                path.append(URI.decode(uri.segment(i)));
            }
            return new Path(path.toString());
        } else {
            return new Path(uri.devicePath());
        }
    }

    private EObject getEObject(URI uri) {
        String str = uri.opaquePart();
        if (str == null) return null;
        return Activator.findEObject(str);
    }

    @Override
    public void openLink(LinkData link) {
        URI uri = getURI(link);
        if (uri == null) return;
        EObject eObj = getEObject(uri);
        if (eObj == null) return;

        try {
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            IPath path = getPath(eObj);
            IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
            IEditorPart editor = IDE.openEditor(page, file);
            if (editor instanceof XtextEditor) {
                XtextEditor xeditor = (XtextEditor) editor;
                ICompositeNode node = NodeModelUtils.getNode(eObj);
                xeditor.selectAndReveal(node.getOffset(), node.getLength());
            }
        } catch (PartInitException e) {
        }
    }
}
