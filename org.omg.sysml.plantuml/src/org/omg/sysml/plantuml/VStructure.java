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

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Type;

public abstract class VStructure extends VDefault {
    private static FeatureValue getFeatureValue(Feature f) {
        // TODO: Multiple Feature Value.
        for (FeatureMembership fm: f.getOwnedFeatureMembership()) {
            if (fm instanceof FeatureValue) return (FeatureValue) fm;
        }
        return null;
    }

    private boolean addFeatureValueText(Feature f) {
        FeatureValue fv = getFeatureValue(f);
        if (fv == null) return false;
        String text = getText(fv);
        if (text == null) return false;
        append('=');
        text = text.replace("\r", "");
        text = text.replace("\n", "\\n");
        append(text);
        return true;
    }

    private static Redefinition getRedefinition(Feature f) {
        List<Redefinition> rs = f.getOwnedRedefinition();
        if (rs.isEmpty()) return null;
        return rs.get(0);
    }

    private Feature getRedefinedFeature(Feature f) {
        Redefinition rd = getRedefinition(f);
        if (rd == null) return null;
        return rd.getRedefinedFeature();
    }

    private boolean addRedefinedFeatureText(Feature f) {
        Feature rf = getRedefinedFeature(f);
        if (rf == null) return false;
        String name = getFeatureName(rf);
        if (name == null) return false;

        org.omg.sysml.lang.sysml.Package pkg = rf.getOwningNamespace();
        String pkgName;
        if (pkg != null) {
            pkgName = pkg.getName();
        } else {
            pkgName = null;
        }

        // waved decoration for redefinition
        append("\\n//:>>");
        if (pkgName != null) {
            append(pkgName);
            append("::");
        }
        append(name);
        append("// ");
        return true;
    }

    protected boolean addFeatureText(Feature f) {
        String name = getFeatureName(f);
        if (name == null) return false;
        append(name);
        addTypeText(": ", f);
        addFeatureValueText(f);
        addRedefinedFeatureText(f);
        return true;
    }

    protected String extractName(Element e) {
        if (!(e instanceof Feature)) {
            return e.getName();
        }
        Feature f = (Feature) e;
        String name = getFeatureName(f);
        List<Type> tt = f.getType();
        if (tt.isEmpty()) return name;
        StringBuilder sb = new StringBuilder();
        for (Type typ: tt) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (typ == null) continue;
            String typeName = typ.getName();
            if (typeName == null) continue;
            sb.append(typeName);
        }
        if (sb.length() == 0) return name;
        sb.insert(0, ": ");
        sb.insert(0, name);
        return sb.toString();
    }

    protected void addGeneralizations(Type typ) {
        for (Generalization g: typ.getOwnedGeneralization()) {
            Type gt = g.getGeneral();
            if (gt.getName() == null) continue;
            addPRelation(typ, gt, g);
        }
    }

    protected void addPUMLLine(Type typ, String keyword, String name) {
        append(keyword);
        addNameWithId(typ, name);
        String style = styleString(typ);
        append(style);
        addLink(typ);
    }

    protected void addType(Type typ, String keyword) {
        String name = extractName(typ);
        if (name == null) return;
        addPUMLLine(typ, keyword, name);
        addGeneralizations(typ);
    }

    @Override
    public String casePackage(org.omg.sysml.lang.sysml.Package pkg) {
        String name = pkg.getName();
        if (name == null) return super.casePackage(pkg);

        append("package ");
        quote(name);
        append(' ');
        addLink(pkg);
        append(" {\n");
        super.casePackage(pkg);
        append("}\n");
        return "";
    }
    
    VStructure(Visitor prev) {
    	super(prev);
    }
    
    public VStructure() {
    	super();
    }
}
