/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2022 Mgnite Inc.
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Dependency;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

public class VDefault extends VTraverser {
    protected Element getEnd(Feature f) {
        if (f == null) return null;
        if (f instanceof ItemFlowEnd) return f;
        for (Relationship rel: f.getOwnedRelationship()) {
        	if (rel instanceof OwningMembership) continue;
            for (Element tgt: rel.getTarget()) {
                if (tgt instanceof Feature) {
                    Element r = resolveReference((Feature) tgt);
                    if (r != null) return r;
                    return rel;
                }
            }
        }
        for (Subsetting ss: f.getOwnedSubsetting()) {
            return ss.getSubsettedFeature();
        }
        return null;
    }

    private void addConnector(Connector c, String desc) {
        List<Feature> ends = c.getConnectorEnd();
        int size = ends.size();
        if (size >= 2) {
            Element end1 = getEnd(ends.get(0));
            if (end1 == null) return;
            for (int i = 1; i < size; i++) {
                Element end2 = getEnd(ends.get(i));
                if (end2 == null) continue;
                addPRelation(end1, end2, c, desc);
            }
        }
    }

    protected String itemFlowDesc(ItemFlow itf) {
        StringBuilder sb = new StringBuilder();
        Feature f = itf.getItemFeature();
        if (f != null) {
            /* We do not use the effective name because it always get "item" for it.
               Use getName() instead. */
            String name = f.getName();
            if (name != null) {
                sb.append(name);
            }
            appendFeatureType(sb, ": ", f);
        }
        if (sb.length() == 0) return null;
        return sb.toString();        
    }

    protected void addFeatureValueBindings(Feature f) {
        for (Membership m: f.getOwnedMembership()) {
            if (m instanceof FeatureValue) {
                FeatureValue fv = (FeatureValue) m;
                Expression v = fv.getValue();
                Element tgt = resolveReference(v);
                if (tgt != null) {
                    addPRelation(f, tgt, fv, "=");
                }
            }
        }
    }

    protected void addSpecializations(int typId, Type typ) {
        if (typId < 0) return;
        for (Specialization s: typ.getOwnedSpecialization()) {
            Type gt = s.getGeneral();
            if (gt == null) continue;
            PRelation pr = new PRelation(typId, gt, s, null);
            addPRelation(pr);
        }
    }

    protected int addPUMLLine(Type typ, String keyword, String name, String style) {
        append(keyword);
        int id = addNameWithId(typ, name, true);
        if (style != null) {
            append(style);
        }
        addLink(typ);
        return id;
    }

    protected int addPUMLLine(Type typ, String keyword, String name) {
        return addPUMLLine(typ, keyword, name, styleString(typ));
    }

    protected int addRecLine(String name, Type typ, boolean withStyle) {
        String keyword;
        if (typ instanceof Usage) {
            keyword = "rec usage ";
        } else {
            keyword = "rec def ";
        }
        if (withStyle) {
            return addPUMLLine(typ, keyword, name);
        } else {
            return addPUMLLine(typ, keyword, name, null);
        }
    }

    protected int addRecLine(Type typ, boolean withStyle) {
    	String name = getNameAnyway(typ);
        return addRecLine(name, typ, withStyle);
    }

    protected Element resolveReference(Feature f) {
        if (f instanceof FeatureChainExpression) {
            // return resolvePathStepExpression((PathStepExpression) f, null);
            return f;
        } else if (f instanceof FeatureReferenceExpression) {
            FeatureReferenceExpression fre = (FeatureReferenceExpression) f;
            return fre.getReferent();
        } else if (!f.getOwnedFeatureChaining().isEmpty()) {
            return f;
        }
        return null;
    }

    @Override
    public String caseExpression(Expression e) {
        // Do not show Expression
        return "";
    }

    @Override
    public String caseConnector(Connector c) {
        addConnector(c, c.getName());
        return "";
    }

    @Override
    public String caseConnectionUsage(ConnectionUsage cu) {
    	addConnector(cu, null);
    	return "";
    }

    @Override
    public String caseItemFlow(ItemFlow itf) {
        String desc = itemFlowDesc(itf);
        addConnector(itf, desc);
        return "";
    }

    @Override
    public String caseAnnotation(Annotation a) {
        AnnotatingElement ae = a.getAnnotatingElement();
        if (ae instanceof Comment) {
            Comment c = (Comment) ae;
            VComment v = new VComment(this);
            v.addComment(c, a.getAnnotatedElement());
        } else if (ae instanceof MetadataFeature) {
            MetadataFeature af = (MetadataFeature) ae;
            VMetadata v = new VMetadata(this);
            v.addMetadataFeature(af, a.getAnnotatedElement());
        }
        return "";
    }

    @Override
    public String caseMetadataFeature(MetadataFeature af) {
        VMetadata v = new VMetadata(this);
        v.addMetadataFeature(af);
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

    @Override
    public String caseImport(Import imp) {
        VImport v = new VImport(this);
        v.addImport(imp);
        return "";
    }

    @Override
    public String caseAssignmentActionUsage(AssignmentActionUsage aau) {
        // TO be ignored.
        return "";
    }

    VDefault(Visitor v) {
        super(v);
    }
    
    VDefault() {
    	super();
    }
}
