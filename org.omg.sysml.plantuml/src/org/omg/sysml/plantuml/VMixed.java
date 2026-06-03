/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2024 Mgnite Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Hisashi Miyashita, Mgnite Inc.
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml;

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Type;

public class VMixed extends VTree {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle("VMixed", null, "", null);

    @Override
    protected void process(VCompartment v, Type typ) {
        v.setMixedMode(true);
        super.process(v, typ);
    }

    @Override 
    protected SysML2PlantUMLStyle getStyle() {
        return style;
    }

    @Override
    protected VTree newVTree(Namespace namespace, Membership membership) {
        return new VMixed(this, namespace, membership);
    }

    private String process(Visitor v, Element e) {
        v.visit(e);
        addRel(e, null);
        v.flush();
        return "";
    }

    /***************************************************
     * Delegation Methods for VAction
     ***************************************************/

    @Override
    public String caseActionDefinition(ActionDefinition ad) {
        VAction va = new VAction(this);
        return process(va, ad);
    }

    @Override
    public String caseActionUsage(ActionUsage au) {
        VAction va = new VAction(this);
        return process(va, au);
    }

    /***************************************************
     * Delegation Methods for VStateMachine
     ***************************************************/

    @Override
    public String caseStateUsage(StateUsage su) {
        VStateMachine vs = new VStateMachine(this);
        return process(vs, su);
    }
    
    @Override
    public String caseStateDefinition(StateDefinition sd) {
        VStateMachine vs = new VStateMachine(this);
        return process(vs, sd);
    }

    /***************************************************
     * Delegation Methods for VCase
     ***************************************************/
    @Override
    public String caseCaseUsage(CaseUsage ucu) {
        VCase vu = new VCase(this);
        return process(vu, ucu);
    }

    @Override
    public String caseCaseDefinition(CaseDefinition ucd) {
    	addCompartmentType(ucd);
    	return "";
    }


    protected VMixed(Visitor vt, Namespace namespace, Membership membership) {
        super(vt, namespace, membership);
    }

    public VMixed(Visitor vt) {
        super(vt);
    }

    @Override
    protected MultiplicityStyle getDefaultMultiplicityStyle() {
        return MultiplicityStyle.DEFAULT;
    }

    public VMixed() {
        super();
    }
}
