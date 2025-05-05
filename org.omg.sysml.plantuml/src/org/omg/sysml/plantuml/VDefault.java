/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2024 Mgnite Inc.
 * Copyright (c) 2020-2023 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.BindingConnectorAsUsage;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Dependency;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.FlowUsage;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

public class VDefault extends VTraverser {
    protected void addConnector(Element rel, Connector c, String desc) {
        List<Feature> ends = c.getConnectorEnd();
        int size = ends.size();
        if (size >= 2) {
            Feature end1 = ends.get(0);
            if (end1 == null) return;
            for (int i = 1; i < size; i++) {
                Feature end2 = ends.get(i);
                if (end2 == null) continue;
                addPRelation(end1, end2, rel, desc);
            }
        }
    }

    protected void addConnector(Connector c, String desc) {
        addConnector(c, c, desc);
    }

    protected String itemFlowDesc(Flow itf) {
        StringBuilder sb = new StringBuilder();
        Feature f = itf.getPayloadFeature();
        if (f != null) {
            /* We do not use the effective name because it always get "item" for it.
               Use getName() instead. */
            String name = f.getDeclaredName();
            if (name != null) {
                sb.append(name);
            }
            appendFeatureType(sb, ": ", f);
        }
        if (sb.length() == 0) return null;
        return sb.toString();        
    }

    protected void addFeatureValueBindings(int typId, Type typ) {
        // To properly process inheritings, use VTraverser.
        VTraverser vt = new VTraverser(this) {
            @Override
            public String caseFeatureValue(FeatureValue fv) {
                Expression v = fv.getValue();
                Element tgt = resolveReference(v);
                if (tgt != null) {
                	InheritKey ik = makeInheritKey((Feature) typ);
                    PRelation pr = new PRelation(ik, typId, tgt, fv, "=");
                    addPRelation(pr);
                }
                return "";
            }
            @Override
            public String caseNamespace(Namespace ns) {
                return "";
            }
        };
        vt.traverse(typ);
    }

    protected void addSpecializations(int typId, Type typ) {
        if (typId < 0) return;
        InheritKey ik;
        if (typ instanceof Feature) {
            ik = makeInheritKey((Feature) typ);
        } else {
            ik = null;
        }
        for (Specialization s: typ.getOwnedSpecialization()) {
            Type gt = s.getGeneral();
            if (gt == null) continue;
            InheritKey ik2;
            if (s instanceof Redefinition && gt instanceof Feature) {
                ik2 = InheritKey.makeInheritKeyForRedefiningTarget(ik, (Feature) gt, showInherited());
            } else {
                ik2 = ik;
            }
            PRelation pr = new PRelation(ik2, typId, gt, s, null);
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
            //FeatureReferenceExpression fre = (FeatureReferenceExpression) f;
            return f;
        } else if (!f.getOwnedFeatureChaining().isEmpty()) {
            return f;
        }
        return null;
    }

    protected Element resolveRelatedElement(Element tgt) {
        if (tgt instanceof FeatureReferenceExpression) {
            FeatureReferenceExpression fre = (FeatureReferenceExpression) tgt;
            return fre.getReferent();
        }
        return tgt;
    }

    @Override
    public String caseExpression(Expression e) {
        // Do not show Expression
        return "";
    }

    @Override
    public String caseConnector(Connector c) {
        addConnector(c, c.getDeclaredName());
        return "";
    }

    @Override
    public String caseBindingConnectorAsUsage(BindingConnectorAsUsage bcau) {
        addConnector(bcau, "=");
        return "";
    }

    @Override
    public String caseConnectionUsage(ConnectionUsage cu) {
    	addConnector(cu, null);
    	return "";
    }

    @Override
    public String caseFlowUsage(FlowUsage fcu) {
        String desc = itemFlowDesc(fcu);
        addConnector(fcu, desc);
        return "";
    }

    private VMetadata vMetadata;
    protected VMetadata getVMetadata() {
        if (this.vMetadata == null) {
            this.vMetadata = new VMetadata(this);
        }
        return vMetadata;
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
            VMetadata v = getVMetadata();
            v.addMetadataFeature(af, a.getAnnotatedElement());
        }
        return "";
    }

    @Override
    public String caseMetadataFeature(MetadataFeature af) {
        VMetadata v = getVMetadata();
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

    protected static boolean isEmptyFeature(Feature f) {
        for (FeatureMembership fm: toOwnedFeatureMembershipArray(f)) {
            if (fm.getOwnedMemberFeature() instanceof BindingConnector) continue;
            return false;
        }
        return true;
    }

    protected Relationship findBindingLikeRel(Feature f) {
        Relationship ret = null;
        for (Relationship rel : toOwnedRelationshipArray(f)) {
            if (rel instanceof FeatureValue) {
                // first priority
                return rel;
            } else if (rel instanceof Subsetting) {
                // second priority
                ret = rel;
            } else if (rel instanceof FeatureTyping) {
                if (ret != null) continue;
                ret = rel;
            }
        }
        return ret;
    }

    protected static boolean isEmptySubject(SubjectMembership sm) {
        Usage u = sm.getOwnedSubjectParameter();
        if (!"subj".equals(u.getName())) return false;
        return u.getOwnedRelationship().isEmpty();
    }

    protected static boolean isEmptyObjective(ObjectiveMembership om) {
        Usage u = om.getOwnedObjectiveRequirement();
        if (!"obj".equals(u.getName())) return false;
        return isEmpty(u);
    }

    private static boolean isEmpty(Feature f) {
        for (Membership ms: toOwnedMembershipArray(f)) {
            if (!(ms instanceof OwningMembership)) continue;
            if (ms instanceof SubjectMembership) {
                if (isEmptySubject((SubjectMembership) ms)) continue;
                return false;
            }
            if (ms instanceof ObjectiveMembership) {
                if (isEmptyObjective((ObjectiveMembership) ms)) continue;
                return false;
            }
            return false;
        }
        return true;
    }

    // Shorthand notation
    private boolean addShorthandRelation(Usage u, String title) {
        if (u.getDeclaredName() != null) return false;
        if (u.getDeclaredShortName() != null) return false;
        ReferenceSubsetting rs = u.getOwnedReferenceSubsetting();
        if (rs == null) return false;

        if (!isEmpty(u)) return false;

        if (isReferred(u)) return false;

        Element owner = u.getOwner();
        if (!(owner instanceof Type)) return false;
        if (!checkId(owner)) return false;

        addPRelation(owner, rs.getReferencedFeature(), u, title);

        return true;
    }

    @Override
    public String casePerformActionUsage(PerformActionUsage pau) {
        if (addShorthandRelation(pau, "<<perform>>")) return "";
        return null;
    }

    @Override
    public String caseExhibitStateUsage(ExhibitStateUsage esu) {
        if (addShorthandRelation(esu, "<<exhibit>>")) return "";
        return null;
    }

    @Override
    public String caseEventOccurrenceUsage(EventOccurrenceUsage eou) {
        if (addShorthandRelation(eou, "<<event>>")) return "";
        return null;
    }

    @Override
    public String caseIncludeUseCaseUsage(IncludeUseCaseUsage iuc) {
        if (addShorthandRelation(iuc, "<<include>>")) return "";
        return null;
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

    @Override
    public String caseMembership(Membership m) {
        // Ignore unnamed alias memberships.
        if ((m instanceof OwningMembership)
            || m.getMemberName() != null) {
            return super.caseMembership(m);
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
