/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2021-2024 Mgnite Inc.
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml;

import java.util.List;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Metaclass;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.util.FeatureUtil;

public class VMetadata extends Visitor {
    private boolean hideMetadata;
    
    public VMetadata(Visitor v) {
    	super(v, true);
        hideMetadata = styleBooleanValue("hideMetadata");
	}
    
    private final String metadataTitle = "«metadata»";
    private final int INDENT = 2;

    private void indent(StringBuilder sb, int len) {
        for (int i = 0; i < len; i++) {
            sb.append(' ');
        }
    }

    private int addMetadataText(Feature mf, StringBuilder sb, int indent, int maxWidth) {
        boolean first = true;
        for (Feature f: mf.getOwnedFeature()) {
            String name = getFeatureChainName(f);
            if (first) {
                if (indent > 0) {
                    sb.append(" {\n");
                }
                first = false;
            }
            int sLen = sb.length();
            indent(sb, indent);
            int added = 0;
            if (name == null) {
                sb.append(getText(mf));
            } else {
                sb.append(name);
                FeatureValue fv = FeatureUtil.getValuationFor(f);
                if (fv != null) {
                    sb.append(" = ");
                    sb.append(getText(fv.getValue()));
                }
                int pos = sb.length();
                maxWidth = addMetadataText(f, sb, indent + INDENT, maxWidth);
                added = sb.length() - pos;
            }
            int eLen = sb.length() - added;
            int width = eLen - sLen;
            if (width > maxWidth) {
                maxWidth = width;
            }
            sb.append('\n');
        }
        if (indent > 0 && !first) {
            sb.append('}');
        }
        return maxWidth;
    }

    private void addMetadataFeatureInternal(MetadataFeature mf) {
        if (checkId(mf)) return;
        append("note as ");
        addIdStr(mf, true);
        append('\n');

        int maxWidth = metadataTitle.length() + 1;
        StringBuilder sb = new StringBuilder();
        maxWidth = addMetadataText(mf, sb, 0, maxWidth);

        int hWidth = (maxWidth - 1) / 2;
        // Determined by the wrap width.
        if (hWidth > 20) hWidth = 20;
        append("\"\"");
        for (float pos = metadataTitle.length() / 2.0F; pos < hWidth; pos += 1.1) {
            append(' ');
        }
        append("\"\"");
        addLink(mf, metadataTitle);
        append('\n');
        Metaclass dt = mf.getMetaclass();
        if (dt != null) {
            String name = dt.getName();
            if (name != null) {
                append("==== ");
                append("\"\"");
                for (float pos = name.length() / 2.0F; pos < hWidth; pos += 1.1) {
                    append(' ');
                }
                append("\"\"");
                append(name);
                append('\n');
            }
        }
        if (sb.length() > 0) {
        	append("--\n");
            append(sb.toString());
        }
        append("end note\n");
    }

	public void addMetadataFeature(MetadataFeature af) {
        if (hideMetadata) return;
        addMetadataFeatureInternal(af);
        List<Element> es = af.getAnnotatedElement();
        for (Element e: es) {
        	addPRelation(null, af, e, af, null);
        }
    }

	public void addMetadataFeature(MetadataFeature af, Element annotatedElement) {
        if (hideMetadata) return;
        addMetadataFeatureInternal(af);
        if (annotatedElement != null) {
        	addPRelation(null, af, annotatedElement, af, null);
        }
    }
}
