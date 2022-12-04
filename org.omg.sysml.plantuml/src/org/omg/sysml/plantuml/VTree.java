/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2022 Mgnite Inc.
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

import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;

public class VTree extends VStructure {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle("VTree", null, "", null);

    @Override 
    protected SysML2PlantUMLStyle getStyle() {
        return style;
    }

    private Namespace namespace;
    private Membership membership;

    private Namespace getNamespace() {
        if (namespace != null) return namespace;
        if (membership != null) return membership.getMembershipOwningNamespace();
        return null;
    }

    protected void addRel(Element typ, Element rel, String text) {
        hasItems = true;
        Namespace tgt = getNamespace();
        if (tgt == null) return;
        addPRelation(tgt, typ, rel, text);
    }
    
    protected void addRel(Element typ, String text) {
        addRel(typ, membership, text);
    }

    @Override
    public String caseReferenceUsage(ReferenceUsage ru) {
        for (FeatureTyping ft: ru.getOwnedTyping()) {
            Type typ = ft.getType();
            if (typ != null) {
                addRel(typ, ru, ru.getName());
            }
        }
        return "";
    }

    @Override
    public String caseAttributeUsage(AttributeUsage au) {
        if (membership == null) {
            addCompartmentType(au);
        }
        return "";
    }

    @Override
    public String caseCalculationUsage(CalculationUsage cu) {
        addCompartmentType(cu);
        return "";
    }

    @Override
    public String caseMultiplicity(Multiplicity m) {
        return "";
    }

    @Override
    public String caseVariantMembership(VariantMembership vm) {
        Usage u = vm.getOwnedVariantUsage();

        String name = vm.getName();
        if (name == null) {
        	name = extractTitleName(u);
        }
        if (name == null) {
        	name = "variant";
        }

        addRel(u, vm, null);
    	if (checkVisited(u)) return "";

        String style = styleString(u);
        style = "<<variant>>\\n" + style;

        addPUMLLine(u, "comp usage ", name, style);
        process(new VCompartment(this), u);

        return "";
    }


    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        RequirementUsage ru = om.getOwnedObjectiveRequirement();
        addRel(ru, om, "<<objective>>");
        addReq("comp usage ", ru);
        return "";
    }

    protected boolean addSubjectMembership(SubjectMembership sm, boolean force) {
        Usage u = sm.getOwnedSubjectParameter();
        Relationship rel = findBindingLikeRel(u);
        if (force || (u.getName() != null && rel != null)) {
            addRel(u, sm, null);
            String name = getNameAnyway(u);
            int id = addPUMLLine(u, "comp usage ", name, "<<subject>>");
            process(new VCompartment(this), u);
            addSpecializations(id, u);
            addFeatureValueBindings(u);
            return true;
        }
        return false;
    }

    @Override
    public String caseSubjectMembership(SubjectMembership sm) {
        addSubjectMembership(sm, false);
        return "";
    }

    @Override
    public String caseRequirementConstraintMembership(RequirementConstraintMembership rcm) {
        ConstraintUsage c = rcm.getOwnedConstraint();

        switch (rcm.getKind()) {
        case ASSUMPTION:
            addRel(c, "<<assume>>");
            break;
        case REQUIREMENT:
            addRel(c, "<<require>>");
            break;
        default:
            addRel(c, null);
            break;
        }
    	if (checkVisited(c)) return "";
        addType(c, "comp usage ");
        process(new VCompartment(this), c);
        return "";
    }

    private boolean hasItems = false;

    protected List<VTree> processCompartment(VCompartment v, Type typ) {
        List<VTree> subtrees = v.process(this, typ);
        if  (v.isEmpty() && subtrees.isEmpty()) return null;
        return subtrees;
    }

    protected void processSubtrees(VCompartment v, List<VTree> subtrees) {
        if (subtrees == null) {
            v.closeBlock();
        } else {
            hasItems = true;
            v.closeBlock();
            for (VTree vt: subtrees) {
                vt.flush();
            }
        }
    }

    protected void process(VCompartment v, Type typ) {
        List<VTree> subtrees = processCompartment(v, typ);
        processSubtrees(v, subtrees);
    }

    /* VCompartment uses */
    VTree subtree(Namespace namespace, Membership membership, Element e, boolean force) {
        VTree vt = newVTree(namespace, membership);
        vt.pushIdMap();
        vt.visit(e);
        if (!(force || vt.hasItems)) {
            vt.popIdMap(false);
            return null;
        }
        vt.popIdMap(true);
        return vt;
    }

    protected void addCompartmentType(Type typ) {
        addRel(typ, null);
        if (typ instanceof Usage) {
            addType(typ, "comp usage ");
        } else {
            addType(typ, "comp def ");
        }
        process(new VCompartment(this), typ);
    }


    // To prevent caseExpression()
    @Override
    public String caseConstraintUsage(ConstraintUsage cu) {
        addCompartmentType(cu);
        return "";
    }

    @Override
    public String caseType(Type typ) {
        addCompartmentType(typ);
        return "";
    }

    @Override
    public String caseNamespace(org.omg.sysml.lang.sysml.Namespace p) {
        addRel(p, null);
        this.membership = null;
        return super.caseNamespace(p);
    }

    private void addReq(String keyword, Type typ) {
    	if (checkVisited(typ)) return;
        String name = extractTitleName(typ);
        if (name == null) return;
        addType(typ, name, keyword);
        process(new VRequirement(this), typ);
    }

    @Override
    public String caseRequirementDefinition(RequirementDefinition rd) {
        addRel(rd, null);
        addReq("comp def ", rd);
        return "";
    }

    @Override
    public String caseRequirementUsage(RequirementUsage ru) {
        addRel(ru, null);
        addReq("comp usage ", ru);
        return "";
    }

    protected VTree newVTree(Namespace namespace, Membership membership) {
        return new VTree(this, namespace, membership);
    }

    protected VTree(Visitor vt, Namespace namespace, Membership membership) {
        super(vt);
        this.namespace = namespace;
        this.membership = membership;
    }
    
    public VTree(Visitor vt) {
    	super(vt);
    }

    public VTree() {
        super();
        this.namespace = null;
        this.membership = null;
    }
}
