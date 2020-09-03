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
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.Type;

public class VTree extends VStructure {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle
    ("VTree",
      null,
     "allow_mixing\n", null);

    @Override 
    protected SysML2PlantUMLStyle getStyle() {
        return style;
    }

    private final Element parent;

    private void addRel(Type typ, Element rel, String text) {
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
    public String caseMultiplicity(Multiplicity m) {
        return "";
    }

    private void addType(Type typ) {
        addType(typ, "class ");
        addRel(typ, typ, null);
        VCompartment v = new VCompartment(this);
        List<Element> es = v.process(typ);
        VTree vt = new VTree(this, typ);
        for (Element e: es) {
            vt.visit(e);
        }
        vt.flush();
    }


    @Override
    public String caseType(Type typ) {
        addType(typ);
        return "";
    }

    private VTree(VTree vt, Element parent) {
        super(vt);
        this.parent = parent;
    }

    public VTree() {
        super();
        this.parent = null;
    }
}
