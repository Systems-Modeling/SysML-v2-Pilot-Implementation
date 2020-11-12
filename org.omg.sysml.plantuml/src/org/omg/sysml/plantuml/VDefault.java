/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020 Mgnite Inc.
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Dependency;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;

public class VDefault extends VTraverser {
    protected static String getFeatureName(Feature f) {
        return ((FeatureImpl) f).getEffectiveName();
    }

    protected static String getName(Type typ) {
        if (typ instanceof Feature) {
            return getFeatureName((Feature) typ);
        } else {
            return typ.getName();
        }
    }

    protected void addConnector(Connector c) {
        List<Feature> ends = c.getConnectorEnd();
        int size = ends.size();
        if (size >= 2) {
            Element end1 = getEnd(ends.get(0));
            if (end1 == null) return;
            for (int i = 1; i < size; i++) {
                Element end2 = getEnd(ends.get(i));
                if (end2 == null) continue;
                addPRelation(end2, end1, c);
            }
        }
    }

    @Override
    public String caseAnnotation(Annotation a) {
        AnnotatingElement ae = a.getAnnotatingElement();
        if (ae instanceof Comment) {
            Comment c = (Comment) ae;
            VComment v = new VComment(this);
            v.addComment(c, a.getAnnotatedElement());
        }
        return "";
    }

    @Override
    public String caseComment(Comment c) {
        VComment v = new VComment(this);
        v.addComment(c);
        return "";
    }

    @Override
    public String caseDependency(Dependency dep) {
    	for (Element c: dep.getClient()) {
    		for (Element s: dep.getSupplier()) {
    			addPRelation(c, s, dep, "<<depend>>");
    		}
    	}
        return "";
    }

    VDefault(Visitor v) {
        super(v);
    }
    
    VDefault() {
    	super();
    }
}
