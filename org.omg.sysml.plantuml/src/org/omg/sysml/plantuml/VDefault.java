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
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.PathStepExpression;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

public class VDefault extends VTraverser {
    protected static String getFeatureName(Feature f) {
        return f.getEffectiveName();
    }

    protected static String getName(Type typ) {
        if (typ instanceof Feature) {
            return getFeatureName((Feature) typ);
        } else {
            return typ.getName();
        }
    }

    protected Element getEnd(Feature f) {
        if (f == null) return null;
        for (Relationship rel: f.getOwnedRelationship()) {
            for (Element tgt: rel.getTarget()) {
                if (tgt instanceof Feature) {
                    Element r = resolveReference((Feature) tgt);
                    if (r != null) return r;
                    return tgt;
                }
            }
        }
        for (Subsetting ss: f.getOwnedSubsetting()) {
            return ss.getSubsettedFeature();
        }
        return null;
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

    protected void addGeneralizations(Type typ) {
        for (Generalization g: typ.getOwnedGeneralization()) {
            Type gt = g.getGeneral();
            if (gt == null || gt.getName() == null) continue;
            addPRelation(typ, gt, g);
        }
    }

    protected void addPUMLLine(Type typ, String keyword, String name, String style) {
        append(keyword);
        addNameWithId(typ, name, true);
        if (style != null) {
            append(style);
        }
        addLink(typ);
    }

    protected void addPUMLLine(Type typ, String keyword, String name) {
        addPUMLLine(typ, keyword, name, styleString(typ));
    }

    protected boolean addRecLine(Type typ, boolean withStyle) {
    	String name = getName(typ);
    	if (name == null) return false;
        String keyword;
        if (typ instanceof Usage) {
            keyword = "rec usage ";
        } else {
            keyword = "rec def ";
        }
        if (withStyle) {
            addPUMLLine(typ, keyword, name);
        } else {
            addPUMLLine(typ, keyword, name, null);
        }
        return true;
    }

    private Element resolvePathStepExpression(PathStepExpression pse, Element e) {
        for (Expression ex: pse.getOperand()) {
            if (ex instanceof FeatureReferenceExpression) {
                FeatureReferenceExpression fre = (FeatureReferenceExpression) ex;
                e = fre.getReferent();
            } else if (ex instanceof PathStepExpression) {
                PathStepExpression psec = (PathStepExpression) ex;
                return resolvePathStepExpression(psec, e);
            }
        }
        return e;
    }

    protected Element resolveReference(Feature f) {
        if (f instanceof PathStepExpression) {
            return resolvePathStepExpression((PathStepExpression) f, null);
        } else if (f instanceof FeatureReferenceExpression) {
            FeatureReferenceExpression fre = (FeatureReferenceExpression) f;
            return fre.getReferent();
        }
        return null;
    }

    private Element resolveItemFlowFeature(Feature f) {
        if (!(f instanceof ItemFlowFeature)) return f;
        for (FeatureMembership fm: f.getOwnedFeatureMembership()) {
            Feature f2 = fm.getMemberFeature();
            Element r = resolveReference(f2);
            if (r != null) return r;
        }
        return f;
    }

    @Override
    public String caseExpression(Expression e) {
        // Do not show Expression
        return "";
    }

    @Override
    public String caseConnector(Connector c) {
        addConnector(c);
        return "";
    }

    @Override
    public String caseItemFlow(ItemFlow itf) {
    	for (Feature src: itf.getSourceOutputFeature()) {
            Element s = resolveItemFlowFeature(src);
    		for (Feature tgt: itf.getTargetInputFeature()) {
                Element t = resolveItemFlowFeature(tgt);
    			addPRelation(s, t, itf, "");
    		}
    	}
        return "";
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
