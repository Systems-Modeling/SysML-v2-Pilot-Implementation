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

package org.omg.sysml.plantuml;

import java.util.List;

import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
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

    private Element parent;

    protected void addRel(Element typ, Element rel, String text) {
        if (parent == null) return;
        addPRelation(parent, typ, rel, text);
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
        if (parent == null) {
            addType(au);
        }
        return "";
    }

    @Override
    public String caseConnector(Connector c) {
        return "";
    }

    @Override
    public String caseExpression(Expression e) {
        return "";
    }

    @Override
    public String caseCalculationUsage(CalculationUsage cu) {
        addType(cu);
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
        	name = extractName(u);
        }
        if (name == null) {
        	name = "variant";
        }

        addPUMLLine(u, "comp usage ", name);
        addRel(u, vm, "<<variant>>");
        process(new VCompartment(this), u);

        return "";
    }


    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        RequirementUsage ru = om.getOwnedObjectiveRequirement();
        addRel(ru, om, "<<objective>>");
        addReq("comp usage ", ru, ru.getReqId());
        return "";
    }

    @Override
    public String caseRequirementConstraintMembership(RequirementConstraintMembership rcm) {
        ConstraintUsage c = rcm.getConstraint();
        switch (rcm.getKind()) {
        case ASSUMPTION:
            addRel(c, c, "<<assume>>");
            break;
        case REQUIREMENT:
            addRel(c, c, "<<require>>");
            break;
        default:
            addRel(c, c, null);
            break;
        }
        addType(c, "comp usage ");
        process(new VCompartment(this), c);
        return "";
    }

    private boolean hasItems = false;

    protected void process(VCompartment v, Type typ) {
        List<VTree> subtrees = v.process(this, typ);
        if (v.isEmpty() && subtrees.isEmpty()) {
            v.closeBlock();
            return;
        } else {
            hasItems = true;
            v.closeBlock();
            for (VTree vt: subtrees) {
                vt.flush();
            }
        }
    }

    /* VCompartment uses */
    VTree subtree(Element parent, Element e, boolean force) {
        VTree vt = newVTree(parent);
        vt.pushIdMap();
        vt.visit(e);
        if (!(force || vt.hasItems)) {
            vt.popIdMap(false);
            return null;
        }
        vt.popIdMap(true);
        return vt;
    }

    private void addType(Type typ) {
        if (typ instanceof Usage) {
            addType(typ, "comp usage ");
        } else {
            addType(typ, "comp def ");
        }
        addRel(typ, typ, null);
        process(new VCompartment(this), typ);
    }


    // To prevent caseExpression()
    @Override
    public String caseConstraintUsage(ConstraintUsage cu) {
        addType(cu);
        return "";
    }

    @Override
    public String caseType(Type typ) {
        addType(typ);
        return "";
    }

    @Override
    public String caseNamespace(org.omg.sysml.lang.sysml.Namespace p) {
        addRel(p, p, null);
        this.parent = null;
        return super.caseNamespace(p);
    }

    private void addReq(String keyword, Type typ, String reqId) {
        String name = extractName(typ);
        if (name == null) return;
        if (reqId != null) {
            name = " [<b>" + reqId + "</b>] " + name;
        }
        addType(typ, name, keyword);
        process(new VRequirement(this), typ);
    }

    @Override
    public String caseRequirementDefinition(RequirementDefinition rd) {
        addRel(rd, rd, null);
        addReq("comp def ", rd, rd.getReqId());
        return "";
    }

    @Override
    public String caseRequirementUsage(RequirementUsage ru) {
        addRel(ru, ru, null);
        addReq("comp usage ", ru, ru.getReqId());
        return "";
    }

    protected VTree newVTree(Element parent) {
        return new VTree(this, parent);
    }

    protected VTree(VTree vt, Element parent) {
        super(vt);
        this.parent = parent;
    }

    public VTree() {
        super();
        this.parent = null;
    }
}
