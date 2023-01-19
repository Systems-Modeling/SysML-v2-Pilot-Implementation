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


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.omg.sysml.plantuml.SysML2PlantUMLLinkProvider;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle;
import org.omg.sysml.plantuml.SysML2PlantUMLText;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProviderS3;
import net.sourceforge.plantuml.ecore.AbstractEcoreClassDiagramTextProvider;

public class SysMLDiagramTextProvider extends AbstractEcoreClassDiagramTextProvider implements DiagramTextProviderS3 {
    public SysMLDiagramTextProvider() {
        super(IEditorPart.class);
    }

    @Override
    public boolean supportsSelection(final ISelection selection) {
        return selection instanceof ITextSelection || selection instanceof IStructuredSelection;
    }
    
    // @Override
    public boolean supportsPath(IPath path) {
        String ext = path.getFileExtension();
        return "sysml".equals(ext) || "sysmlx".equals(ext);
    }

    private static class LinkProvider implements SysML2PlantUMLLinkProvider {
        @Override
        public String getLinkString(EObject eObj) {
            URI uri = SysMLDiagramLinkOpener.getEObjectLink(eObj);
            if (uri == null) return null;
            return uri.toString();
        }

        @Override
        public String getText(EObject eObj) {
            ICompositeNode node = NodeModelUtils.getNode(eObj);
            if (node == null) return null;
            return node.getText();
        }
    }

    private final SysML2PlantUMLText sysml2PlantUMLText = new SysML2PlantUMLText(new LinkProvider());

    private final EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();

    private static List<String> getModeNames() {
        SysML2PlantUMLText.MODE[] modes = SysML2PlantUMLText.MODE.values();
        int len = modes.length;
        ArrayList<String> ret = new ArrayList<String>(len);
        for (int i = 0; i < len; i++) {
            ret.add(modes[i].name());
        }
        return ret;
    }

    private static final List<String> supportedViews = getModeNames();

    @Override
    public Collection<String> getViews() {
        return supportedViews;
    }

    private SysML2PlantUMLText.MODE mode;

	@Override
	public void setView(String view) {
		mode = SysML2PlantUMLText.MODE.valueOf(view);
	}

    private String getDiagramXtext(XtextEditor xe, ISelection selection, Map<String, Object> markerAttributes) {
        XtextResource res = xe.getDocument().readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
            @Override
            public XtextResource exec(XtextResource st) {
                return st;
            }
        });

        if (selection instanceof ITextSelection) {
            ITextSelection its = (ITextSelection) selection;
            int offset = its.getOffset();
            EObject eObj = eObjectAtOffsetHelper.resolveElementAt(res, offset);
            List<? extends EObject> eObjs = sysml2PlantUMLText.setupVisualizationEObjects(eObj);
            if (eObjs != null) {
                sysml2PlantUMLText.setMode(mode);
                return sysml2PlantUMLText.sysML2PUML(eObjs);
            }
        }

        sysml2PlantUMLText.setMode(mode);
        return sysml2PlantUMLText.sysML2PUML(res.getContents());
    }

    private String getDiagram(List<? extends EObject> eObjs) {
        if (eObjs == null) return null;
        sysml2PlantUMLText.setMode(mode);
        return sysml2PlantUMLText.sysML2PUML(eObjs);
    }

    private String getDiagramFromSelection(IStructuredSelection selection, Map<String, Object> markerAttributes) {
        final Object obj = selection.getFirstElement();
        if (obj instanceof EObject) {
            EObject eObj = (EObject) obj;
            if (markerAttributes != null) {
                markerAttributes.put("eObjectUri", EcoreUtil.getURI(eObj).toString());
            }
            sysml2PlantUMLText.setupVisualizationEObjects(eObj);
            // Visualize eObj only.
            return getDiagram(Arrays.asList(eObj));
		} else if (obj instanceof Resource) {
            Resource res = (Resource) obj;
            List<EObject> eObjs = res.getContents();
            return getDiagram(eObjs);
        }
		return null;
    }

    private String getDiagramFromEditingDomain(IEditingDomainProvider provider, Map<String, Object> markerAttributes) {
		ResourceSet rset = provider.getEditingDomain().getResourceSet();
        sysml2PlantUMLText.setMode(mode);
        List<EObject> eObjs = new ArrayList<>();
        Iterator<Notifier> it = rset.getAllContents();
        while (it.hasNext()) {
            Notifier n = it.next();
            if (n instanceof EObject) {
                eObjs.add((EObject) n);
            }
        }
        return sysml2PlantUMLText.sysML2PUML(eObjs);
    }

    @Override
    public String getDiagramText(IEditorPart editorPart, ISelection selection, Map<String, Object> markerAttributes) {
        if (editorPart instanceof XtextEditor) {
            return getDiagramXtext((XtextEditor) editorPart, selection, markerAttributes);
        } 

        String ret = null;
        if (selection instanceof IStructuredSelection) {
            ret = getDiagramFromSelection((IStructuredSelection) selection, markerAttributes);
        }
        if (ret != null) return ret;
        if (editorPart instanceof IEditingDomainProvider) {
            return getDiagramFromEditingDomain((IEditingDomainProvider) editorPart, markerAttributes);
        }
        return null;
    }

    //@Override
    public String getDiagramText(IPath path) {
        URI uri = URI.createPlatformResourceURI(path.toString(), true);
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource res = resourceSet.getResource(uri, true);
        return sysml2PlantUMLText.sysML2PUML(res.getContents());
    }

	@Override
	public Collection<String> getStyles() {
		return SysML2PlantUMLStyle.getStyleTitles();
	}

	@Override
	public boolean isStyleEnabled(String style) {
        SysML2PlantUMLStyle s = SysML2PlantUMLStyle.getStyle(style);
        if (s == null) return false;
        return sysml2PlantUMLText.isStyleEnabled(s);
	}

	@Override
	public void setStyle(String style) {
		SysML2PlantUMLStyle s = SysML2PlantUMLStyle.getStyle(style);
        if (s == null) return;
        //sysml2PlantUMLText.clearStyle();
        sysml2PlantUMLText.addStyle(s);
	}

	@Override
	public void disableStyle(String style) {
		SysML2PlantUMLStyle s = SysML2PlantUMLStyle.getStyle(style);
        if (s == null) return;
        //sysml2PlantUMLText.clearStyle();
        sysml2PlantUMLText.removeStyle(s);
	}
}
