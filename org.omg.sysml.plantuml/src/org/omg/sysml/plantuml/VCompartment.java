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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EnumerationDefinition;
import org.omg.sysml.lang.sysml.EnumerationUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.IndividualUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;

public class VCompartment extends VStructure {
    private List<VTree> subtrees = new ArrayList<VTree>();

    private Element base;
    private VTree parent;

    protected boolean rec(Element e, boolean force) {
        VTree subtree = parent.subtree(base, e, force);
        if (subtree == null) return false;
        subtrees.add(subtree);
        return true;
    }

    protected static class FeatureEntry implements Comparable<FeatureEntry> {
        public final Feature f;
        public final String alias;
        public final String prefix;

        private static int featureMetaclassCompare(Feature f1, Feature f2) {
            if (f1 instanceof AttributeUsage) {
                if (!(f2 instanceof AttributeUsage)) {
                    return -1;
                }
            } else if (f2 instanceof AttributeUsage) {
                return 1;
            } else if (f1 instanceof Usage) {
                if (!(f2 instanceof Usage)) {
                    return -1;
                }
            } else if (f2 instanceof Usage) {
                return 1;
            }
            
            String ec1 = f1.eClass().getName();
            String ec2 = f2.eClass().getName();
            return ec1.compareTo(ec2);
        }

        /*
        private static int featureTypeCompare(Feature f1, Feature f2) {
            List<Type> ts1 = f1.getType();
            List<Type> ts2 = f2.getType();
        }
        */

        private static int featureNameCompare(Feature f1, Feature f2) {
            String name1 = f1.getName();
            String name2 = f2.getName();
            if (name1 == null) {
                if (name2 == null) return 0;
                return -1;
            }
            if (name2 == null) return 1;
            return name1.compareTo(name2);
        }

        private static int featureCompare(Feature f1, Feature f2) {
            int v = featureMetaclassCompare(f1, f2);
            if (v != 0) return v;
            // The order or EnumerationUsage needs to be stable.
            if (f1 instanceof EnumerationUsage) return 0;
            return featureNameCompare(f1, f2);
        }

        public int compareTo(FeatureEntry o) {
            int v = featureCompare(f, o.f);
            if (v != 0) return v;
            if (alias == null) {
                if (o.alias == null) return 0;
                return -1;
            }
            if (o.alias == null) return 1;
            return alias.compareTo(o.alias);
        }

        public List<FeatureEntry> children;
        public void add(FeatureEntry fe) {
            if (children == null) {
                children = new ArrayList<FeatureEntry>();
            }
            children.add(fe);
        }

        public FeatureEntry(Feature f, String alias, String prefix) {
            this.f = f;
            this.alias = alias;
            this.prefix = prefix;
            this.children = null;
        }
    }

    private List<FeatureEntry> featureEntries = new ArrayList<FeatureEntry>();

    protected FeatureEntry addFeature(Feature f,
                                      String alias,
                                      String prefix,
                                      boolean nocheck,
                                      boolean norec,
                                      FeatureEntry parent) {
        if (!nocheck && getFeatureName(f) == null) return null;
        if (!norec && (alias == null) && (prefix == null)) {
            if (rec(f, false)) return null;
        }
        FeatureEntry fe = new FeatureEntry(f, alias, prefix);
        if (parent == null) {
            featureEntries.add(fe);
        } else {
            parent.add(fe);
        }
        return fe;
    }

    protected void addFeature(Feature f,
                              String alias,
                              String prefix,
                              boolean nocheck,
                              boolean norec) {
        addFeature(f, alias, prefix, nocheck, norec, null);
    }

    protected void addFeature(Feature f,
                              String alias) {
        addFeature(f, alias, null, false, false);
    }


    @Override
    public String caseFeature(Feature f) {
        addFeature(f, null);
        return "";
    }

    @Override
    public String casePartUsage(PartUsage pu) {
        rec(pu, true);
        return "";
    }

    private class CompTree {
        private final FeatureEntry parent;

        public void process(Feature f) {
            for (Membership m: f.getOwnedMembership()) {
                Element e = m.getMemberElement();
                if (e instanceof Expression) {
                    // Do not show it
                } else if (e instanceof Connector) {
                    // Do not show it
                } else if (e instanceof Feature) {
                	Feature f2 = (Feature) e;
                    FeatureEntry fe = addFeature(f2, m.getMemberName(), null, false, true, parent);
                    CompTree ct = new CompTree(fe);
                    ct.process(f2);
                } else {
                    rec(e, true);
                }
            }
        }

        private CompTree(FeatureEntry fe) {
            this.parent = fe;
        }
    }

    protected String tree(Feature f) {
        if (styleValue("compartmentTree") == null) return null; 
        FeatureEntry fe = addFeature(f, null, null, false, true, null);
        CompTree ct = new CompTree(fe);
        ct.process(f);
        return "";
    }

    @Override
    public String casePortUsage(PortUsage pu) {
        return tree(pu);
    }

    @Override
    public String caseTransitionUsage(TransitionUsage tu) {
        addFeature(tu, null, null, false, true);
        return "";
    }

    @Override
    public String caseReferenceUsage(ReferenceUsage ru) {
        rec(ru, false);
        return "";
    }

    @Override
    public String caseRequirementUsage(RequirementUsage ru) {
        rec(ru, true);
        return "";
    }

    @Override
    public String caseIndividualUsage(IndividualUsage iu) {
        rec(iu, true);
        return "";
    }

    @Override
    public String caseAnalysisCaseUsage(AnalysisCaseUsage au) {
        rec(au, true);
        return "";
    }

    @Override
    public String caseDefinition(Definition d) {
        rec(d, true);
        return "";
    }

    @Override
    public String caseMembership(Membership m) {
        Element e = m.getMemberElement();
        if (e instanceof Feature) {
            addFeature((Feature) e, m.getMemberName());
        } else {
            rec(e, true);
        }
        return "";
    }

    @Override
    public String caseVariantMembership(VariantMembership vm) {
        if (base instanceof EnumerationDefinition) {
            Element e = vm.getMemberElement();
            if (e instanceof EnumerationUsage) {
                EnumerationUsage eu = (EnumerationUsage) e;
            	addFeature(eu, null, null, true, true, null);
                return "";
            }
        }
        rec(vm, true);
        return "";
    }

    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        rec(om, true);
        return "";
    }

    private static boolean isEmptyFeature(Feature f) {
        for (FeatureMembership fm: f.getOwnedFeatureMembership()) {
            if (fm.getMemberFeature() instanceof BindingConnector) continue;
            return false;
        }
        return true;
    }

    @Override
    public String caseSubjectMembership(SubjectMembership sm) {
        Usage u = sm.getOwnedSubjectParameter();
        boolean added = false;
        for (FeatureTyping ft: u.getOwnedTyping()) {
            Type typ = ft.getType();
            addPRelation(base, typ, sm, "<<subject>>");
            added = true;
        }
        if (!added) {
            if (u instanceof ReferenceUsage) {
                // Do not show empty ReferenceUsage.
                if (isEmptyFeature(u)) return "";
            }
            addFeature(u, null);
        }
        return "";
    }

    private static String getTitle(Feature f) {
        String s = SysML2PlantUMLText.getStereotypeName(f);
        if (s.endsWith("s")) {
            return s + "es";
        } else {
            return s + "s";
        }
    }

    private EClass addTitle(EClass prev, FeatureEntry fe, boolean isClassic) {
        EClass ec1 = fe.f.eClass();
        if (ec1.equals(prev)) return prev;
        if (ec1.equals(SysMLPackage.Literals.ATTRIBUTE_USAGE)) {
            if (isClassic) {
                append("-- attributes --\n");
            }
        } else {
            append("-- ");
            append(getTitle(fe.f));
            append(" --\n");
        }
        return ec1;
    }

    private void appendTextOfEnum(Element e) {
        append("<i>");
        appendText(getText(e), true);
        append("</i>");
    }

    private void addFeatures(List<FeatureEntry> es, int level) {
        Collections.sort(es);
        final boolean isClassic = styleValue("classic") != null;
        
        final int size = es.size();
        EClass ec0 = null;
        for (int i = 0; i < size; i++) {
            FeatureEntry fe = es.get(i);
            if (level == 0) {
                ec0 = addTitle(ec0, fe, isClassic);
            } else {
                for (int j = 0; j < level; j++) {
                    append("|_");
                }
                append(' ');
            }
            if (fe.prefix != null) {
                append(fe.prefix);
            }
            if (fe.f instanceof EnumerationUsage) {
                if (getFeatureName(fe.f) == null) {
                    appendTextOfEnum(fe.f);
                } else {
                    addFeatureText(fe.f);
                }
                append('\n');
            } else if (getFeatureName(fe.f) == null) {
                addAnonymouseFeatureText(fe.f);
                append('\n');
            } else if (addFeatureText(fe.f)) {
                boolean first = true;
                for (int j = i + 1; j < size; j++) {
                    FeatureEntry fe2 = es.get(j);
                    if (fe.f.equals(fe2.f)) {
                        if (fe2.alias != null) {
                            if (first) append(" <b>as</b> ");
                            append(fe2.alias);
                            append(' ');
                            first = false;
                        }
                        i = j;
                    } else {
                        break;
                    }
                }
                append('\n');
            }

            if (fe.children != null) {
                addFeatures(fe.children, level + 1);
            }
        }
    }

    public void startType(Type typ) {
        this.base = typ;
        traverse(typ);
        addFeatures(featureEntries, 0);
    }

    public List<VTree> process(VTree parent, Type typ) {
        this.parent = parent;
        subtrees.clear();
        featureEntries.clear();
        startType(typ);
        return subtrees;
    }

    public VCompartment(Visitor prev) {
        super(prev);
    }


    private boolean mixedMode = false;

    void setMixedMode(boolean flag) {
        this.mixedMode = flag;
    }

    @Override
    public String caseStateDefinition(StateDefinition sd) {
        if (!mixedMode) return null;
        rec(sd, true);
        return "";
    }

    @Override
    public String caseStateUsage(StateUsage su) {
        if (!mixedMode) return null;
        rec(su, true);
        return "";
    }

    @Override
    public String caseActionDefinition(ActionDefinition ad) {
        if (!mixedMode) return null;
        rec(ad, true);
        return "";
    }

    @Override
    public String caseActionUsage(ActionUsage au) {
        if (!mixedMode) return null;
        rec(au, true);
        return "";
    }
}
