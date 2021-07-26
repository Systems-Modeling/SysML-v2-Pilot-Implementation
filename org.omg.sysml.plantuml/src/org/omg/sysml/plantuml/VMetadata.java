/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2021 Mgnite Inc.
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

package org.omg.sysml.plantuml;

import java.util.List;

import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.MetadataFeatureValue;

public class VMetadata extends Visitor {
    public VMetadata(Visitor v) {
    	super(v, true);
	}

    private final String metadataTitle = "«metadata»";
    private void addAnnotatingFeatureInternal(AnnotatingFeature af) {
        if (checkId(af)) return;
        append("note as ");
        addIdStr(af, true);
        append('\n');

        int maxWidth = metadataTitle.length() + 1;
        StringBuilder sb = new StringBuilder();
        for (MetadataFeature mf: af.getOwnedMetadata()) {
            int sLen = sb.length();
            sb.append(mf.getEffectiveName());
            MetadataFeatureValue mfv = mf.getMetadataFeatureValue();
            if (mfv == null) continue;
            sb.append(" = ");
            sb.append(getText(mfv.getMetadataValue()));
            int eLen = sb.length();
            int width = eLen - sLen;
            if (width > maxWidth) {
                maxWidth = width;
            }
            sb.append('\n');
        }

        int hWidth = (maxWidth - 1) / 2;
        append("\"\"");
        for (int pos = metadataTitle.length() / 2; pos < hWidth; pos++) {
            append(' ');
        }
        append("\"\"");
        addLink(af, metadataTitle);
        append('\n');
        DataType dt = af.getMetadataType();
        if (dt != null) {
            String name = dt.getEffectiveName();
            if (name != null) {
                append("==== ");
                append("\"\"");
                for (int pos = name.length() / 2; pos < hWidth; pos++) {
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

	public void addAnnotatingFeature(AnnotatingFeature af) {
        addAnnotatingFeatureInternal(af);
        List<Element> es = af.getAnnotatedElement();
        for (Element e: es) {
        	addPRelation(af, e, af);
        }
    }

	public void addAnnotatingFeature(AnnotatingFeature af, Element annotatedElement) {
        addAnnotatingFeatureInternal(af);
        if (annotatedElement != null) {
        	addPRelation(af, annotatedElement, af);
        }
    }
}
