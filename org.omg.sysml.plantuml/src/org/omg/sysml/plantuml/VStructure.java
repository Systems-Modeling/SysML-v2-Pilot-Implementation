/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2022 Mgnite Inc.
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
import java.util.regex.Pattern;

import org.omg.sysml.execution.expressions.ExpressionEvaluator;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.PortioningFeature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

public abstract class VStructure extends VDefault {
    protected void appendText(String text, boolean unfold) {
        text = text.replace("\r", "");
        if (unfold) {
            text = text.replace("\n", "");
        } else {
            text = text.replace("\n", "\\n");
        }
        text = text.trim();
        if (text.endsWith(";")) {
        	append(text, 0, text.length() - 1);
        } else {
        	append(text);
        }
    }

    protected String getEvaluatedResults(Element elem, Element target) {
        if (styleValue("evalExp") == null) return null;
        if (!(elem instanceof Expression)) return null;

        List<Element> elems = ExpressionEvaluator.INSTANCE.evaluate((Expression) elem, target);
        StringBuilder sb = new StringBuilder();
        if (elems != null) {
            int size = elems.size();
            if (size == 1) {
                Element e = elems.get(0);
                if (e == null) return null;
                Object o = EvaluationUtil.valueOf(e);
                if (EvaluationUtil.valueOf(elem).equals(o)) return null;
                sb.append(" <&arrow-thick-right> ");
                if (o instanceof Element) {
                    sb.append(e.getEffectiveName());
                } else {
                    sb.append(o);
                }
                return sb.toString();
            } else if (size > 1) {
                sb.append(" <&arrow-thick-right> ");
                sb.append('(');
                boolean flag = false;
                for (Element e: elems) {
                    Object o = EvaluationUtil.valueOf(e);
                    if (flag) {
                        sb.append(", ");
                    } else {
                        flag = true;
                    }
                    if (o == e) {
                        sb.append(e.getEffectiveName());
                    } else {
                        sb.append(o);
                    }
                }
                sb.append(')');
                return sb.toString();
            }
        } 
        /* For target debugging
           sb.append(" <&caret-left> ");
           sb.append(elem.getName());
           sb.append('#');
           sb.append(target == null ? target : target.getName());
           return sb.toString();
        */
        return null;
    }

    protected boolean addEvaluatedResults(Element elem, Element target) {
        String str = getEvaluatedResults(elem, target);
        if (str == null) return false;
        append(str);
        return true;
    }

    private static Pattern patEq = Pattern.compile("^\\s*:?=");
    private boolean addFeatureMembershipText(Feature f) {
        boolean flag = false;
        for (Membership m: f.getOwnedMembership()) {
            if (m instanceof FeatureValue) {
                FeatureValue fv = (FeatureValue) m;
                String text = getText(fv);
                if (text != null) {
                    if (!patEq.matcher(text).lookingAt()) {
                        append('=');
                    }
                    appendText(text, true);
                    append("; ");
                    flag = true;
                }
                Expression ex = fv.getValue();
                Element evalTarget = getEvalTarget();
                flag = addEvaluatedResults(ex, evalTarget) || flag;
            } else if (m instanceof ResultExpressionMembership) {
                ResultExpressionMembership rem = (ResultExpressionMembership) m;
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
        return getNameWithNamespace(rf);
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

    private void addFeatureTextInternal(Feature f, String name, boolean isInherited) {
        if (isInherited) {
            append('^');
        }
        append(name);
        addFeatureTypeAndSubsettedText(f);
        addFeatureMembershipText(f);
    }
    
    protected boolean addFeatureText(Feature f, boolean isInherited) {
        String name = getFeatureName(f);
        if (name == null) return false;

        if (styleValue("decoratedRedefined") != null) {
            String rt = redefinedFeatureText(f);
            if (rt != null) {
                append("<&bar-trig> ");
                addFeatureTextInternal(f, name, isInherited);
                append(" <s>");
                append(rt);
                append("</s>");
            } else {
                addFeatureTextInternal(f, name, isInherited);
            }
        } else {
            addFeatureTextInternal(f, name, isInherited);
            addRedefinedFeatureText(f);
        }
        return true;
    }

    protected boolean addFeatureText(Feature f) {
        return addFeatureText(f, isInherited());
    }

    protected void addAnonymouseFeatureText(Feature f) {
        addFeatureTypeAndSubsettedText(f);
        addFeatureMembershipText(f);
    }

    private void insertActorLikeStyle(StringBuilder sb, Type typ) {
        Membership ms = typ.getOwningMembership();
        if (ms instanceof ActorMembership) {
            sb.insert(0, "<size:30><&person></size> ");
        } else if (ms instanceof StakeholderMembership) {
            sb.insert(0, "<size:30><&people></size> ");
        }
    }

    protected String extractTitleName(Element e) {
        String name = getNameAnyway(e);
        StringBuilder sb = new StringBuilder();

        if (e instanceof Feature) {
            Feature f = (Feature) e;
            boolean added = appendFeatureType(sb, ": ", f);
            sb.append(' ');
            added = appendSubsettingFeature(sb, ":> ", f) || added;
            sb.insert(0, name);
            /*
              if (f instanceof Usage) {
                  Usage u = (Usage) f;
                  if (u.isVariation()) {
                      sb.insert(0, "<size:20><&layers> </size>");
                  }
              }
            */
            insertActorLikeStyle(sb, f);

            if (e instanceof Expression) {
                Element target = getCurrentNamespace();
                if (!(target instanceof Usage)) {
                    target = e;
                }
                String str = getEvaluatedResults(e, target);
                if (str != null) {
                    sb.append(str);
                }
            }

        } else {
            sb.append(name);
        }
 
        return sb.toString();
    }

    protected boolean addType(Type typ, String keyword) {
        String name = extractTitleName(typ);
        if (name == null) return false;
        return addType(typ, name, keyword);
    }

    protected boolean addType(Type typ, String name, String keyword) {
        addPUMLLine(typ, keyword, name);
        addSpecializations(typ);
        return true;
    }

    @Override
    public String casePackage(org.omg.sysml.lang.sysml.Package pkg) {
        String name = getNameAnyway(pkg, true, false);
        flushContexts();
        append("package ");
        addNameWithId(pkg, name, true);
        append(' ');
        addLink(pkg);
        append(" {\n");
        pushIdMap();
        pushVisited();
        super.caseNamespace(pkg);
        popVisited();
        popIdMap(true);
        flushContexts();
        append("}\n");
        return "";
    }

    @Override
    public String caseSatisfyRequirementUsage(SatisfyRequirementUsage sru) {
        RequirementUsage ru = sru.getSatisfiedRequirement();
        Feature target = sru.getSatisfyingFeature();
        if ((ru != null) && (target != null)) {
            addPRelation(target, ru, sru, "<<satisfy>>");
        }
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
    public String casePortioningFeature(PortioningFeature tsf) {
        // Do not show portioning feature
        return "";
    }

    protected VStructure(Visitor prev) {
    	super(prev);
    }
    
    protected VStructure() {
    	super();
    }
}
