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
import java.util.regex.Pattern;

import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SnapshotFeature;
import org.omg.sysml.lang.sysml.TimeSliceFeature;
import org.omg.sysml.lang.sysml.Type;

public abstract class VStructure extends VDefault {
    protected void appendText(String text, boolean unfold) {
        text = text.replace("\r", "");
        if (unfold) {
            text = text.replace("\n", "");
        } else {
            text = text.replace("\n", "\\n");
        }
        text = text.trim();
        append(text);
    }

    private static Pattern patEq = Pattern.compile("^\\s*=");
    private boolean addFeatureMembershipText(Feature f) {
        boolean flag = false;
        for (FeatureMembership fm: f.getOwnedFeatureMembership()) {
            if (fm instanceof FeatureValue) {
                FeatureValue fv = (FeatureValue) fm;
                String text = getText(fv);
                if (text == null) continue;
                if (!patEq.matcher(text).lookingAt()) {
                    append('=');
                }
                appendText(text, true);
                append("; ");
                flag = true;
            } else if (fm instanceof ResultExpressionMembership) {
                ResultExpressionMembership rem = (ResultExpressionMembership) fm;
                Expression ex = rem.getOwnedResultExpression();
                String text = getText(ex);
                if (text == null) continue;
                append(" { ");
                appendText(text, true);
                append(" }");
                flag = true;
            }
        }
        return flag;
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

    private String redefinedFeatureText(Feature f) {
        Feature rf = getRedefinedFeature(f);
        if (rf == null) return null;
        String name = getFeatureName(rf);
        if (name == null) return null;

        org.omg.sysml.lang.sysml.Package pkg = rf.getOwningNamespace();
        if (pkg == null) {
            return name;
        } else {
            return pkg.getName() + "::" + name;
        }
    }

    private boolean addRedefinedFeatureText(Feature f) {
        String rt = redefinedFeatureText(f);
        if (rt == null) return false;
        // waved decoration for redefinition
        append("\\n//:>>");
        append(rt);
        append("// ");
        return true;
    }

    private void addFeatureTextInternal(Feature f, String name) {
        append(name);
        addTypeText(": ", f);
        addFeatureMembershipText(f);
    }
    
    protected boolean addFeatureText(Feature f) {
        String name = getFeatureName(f);
        if (name == null) return false;

        if (styleValue("decoratedRedefined") != null) {
            String rt = redefinedFeatureText(f);
            if (rt != null) {
                append("<&bar-trig> ");
                addFeatureTextInternal(f, name);
                append(" <s>");
                append(rt);
                append("</s>");
            } else {
                addFeatureTextInternal(f, name);
            }
        } else {
            addFeatureTextInternal(f, name);
            addRedefinedFeatureText(f);
        }
        return true;
    }

    protected void addAnonymouseFeatureText(Feature f) {
        addTypeText(": ", f);
        addFeatureMembershipText(f);
    }


    protected String extractName(Element e) {
        if (!(e instanceof Feature)) {
            return e.getName();
        }
        Feature f = (Feature) e;
        String name = getFeatureName(f);
        if (name == null) {
        	// It should not happen but need to give some name for processing
        	name = "<s>noname</s>";
        }
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
        /*
        if (f instanceof Usage) {
            Usage u = (Usage) f;
            if (u.isVariation()) {
                sb.insert(0, "<size:20><&layers> </size>");
            }
        }
        */
        return sb.toString();
    }

    protected boolean addType(Type typ, String keyword) {
        String name = extractName(typ);
        if (name == null) return false;
        return addType(typ, name, keyword);
    }

    protected boolean addType(Type typ, String name, String keyword) {
        addPUMLLine(typ, keyword, name);
        addGeneralizations(typ);
        return true;
    }

    @Override
    public String casePackage(org.omg.sysml.lang.sysml.Package pkg) {
        String name = pkg.getName();
        if (name == null) return super.casePackage(pkg);

        flushContexts();
        append("package ");
        addNameWithId(pkg, name, true);
        append(' ');
        addLink(pkg);
        append(" {\n");
        pushIdMap();
        super.casePackage(pkg);
        popIdMap(true);
        flushContexts();
        append("}\n");
        return "";
    }

    @Override
    public String caseSatisfyRequirementUsage(SatisfyRequirementUsage sru) {
        addPRelation(sru.getSatisfiedRequirement(),
                     sru.getSatisfyingFeature(),
                     sru, "<<satisfy>>");
        return "";
    }
    
    @Override
    public String caseConjugatedPortDefinition(ConjugatedPortDefinition cpd) {
        // Do not show conjugated ports.
        return "";
    }

    @Override
    public String caseLifeClass(LifeClass lc) {
        // Do not show life classes
        return "";
    }

    @Override
    public String caseTimeSliceFeature(TimeSliceFeature tsf) {
        // Do not show life classes
        return "";
    }

    @Override
    public String caseSnapshotFeature(SnapshotFeature sf) {
        // Do not show life classes
        return "";
    }

    protected VStructure(Visitor prev) {
    	super(prev);
    }
    
    public VStructure() {
    	super();
    }
}
