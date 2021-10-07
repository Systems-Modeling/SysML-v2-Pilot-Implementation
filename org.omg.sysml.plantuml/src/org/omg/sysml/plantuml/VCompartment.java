/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020 Mgnite Inc.
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;

public class VCompartment extends VStructure {
    private List<VTree> subtrees = new ArrayList<VTree>();

    private VTree parent;

    private final boolean compartmentMost;

    protected boolean rec(Membership m, Element e, boolean force) {
        VTree subtree = parent.subtree(m, e, force);
        if (subtree == null) return false;
        subtrees.add(subtree);
        return true;
    }

    private boolean recCurrentMembership(Element e, boolean force) {
        Membership ms = getCurrentMembership();
        if (ms == null) return false;
        return rec(ms, e, force);
    }

    private String recCurrent(Element e, boolean force) {
        if (compartmentMost) return null;
        if (recCurrentMembership(e, force)) return "";
        return null;
    }

    protected static class FeatureEntry implements Comparable<FeatureEntry> {
        public final Feature f;
        public final String alias;
        public final String prefix;
        public final boolean isInherited;

        public String getParameterPrefix() {
            FeatureDirectionKind fdk = f.getDirection();
            if (fdk == null) return "";
            switch (fdk) {
            case IN:
                return "<b>in</b> ";
            case OUT:
                return "<b>out</b> ";
            case INOUT:
                return "<b>inout</b> ";
            }
            return null; // MUST NOT happen.
        }

        public boolean isParameter() {
            return f.getDirection() != null;
        }

        public String getTitle() {
            if (isParameter()) {
                return "parameters";
            }
            String s = SysML2PlantUMLText.getStereotypeName(f);
            if (s.endsWith("s")) {
                return s + "es";
            } else {
                return s + "s";
            }
        }

        private static int featureParameterCompare(Feature f1, Feature f2) {
            FeatureDirectionKind fdk1 = f1.getDirection();
            FeatureDirectionKind fdk2 = f2.getDirection();
            if (fdk1 == null) {
                if (fdk2 == null) return 0;
                return 1;
            }
            if (fdk2 == null) return -1;
            if (fdk1.ordinal() < fdk2.ordinal()) return -1;
            if (fdk1.ordinal() > fdk2.ordinal()) return 1;
            return 0;
        }

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
            int v = featureParameterCompare(f1, f2);
            if (v != 0) return v;
            v = featureMetaclassCompare(f1, f2);
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

        public FeatureEntry(Feature f, String alias, String prefix, boolean isInherited) {
            this.f = f;
            this.alias = alias;
            this.prefix = prefix;
            this.isInherited = isInherited;
            this.children = null;
        }
    }

    private List<FeatureEntry> featureEntries = new ArrayList<FeatureEntry>();

    protected FeatureEntry addFeature(Feature f,
                                      String alias,
                                      String prefix,
                                      boolean norec,
                                      FeatureEntry parent) {
        Membership ms = getCurrentMembership();
        if (ms instanceof ReturnParameterMembership) return null; // To filter "result" parameter out.

        if (!norec && (alias == null) && (prefix == null)) {
            if (recCurrentMembership(f, false)) return null;
        }
        FeatureEntry fe = new FeatureEntry(f, alias, prefix, isInherited());
        if (parent == null) {
            featureEntries.add(fe);
        } else {
            parent.add(fe);
        }
        return fe;
    }

    protected FeatureEntry addFeature(Feature f,
                                      String alias,
                                      String prefix,
                                      boolean norec) {
        return addFeature(f, alias, prefix, norec, null);
    }

    protected FeatureEntry addFeature(Feature f,
                                      String alias) {
        return addFeature(f, alias, null, compartmentMost);
    }


    @Override
    public String caseFeature(Feature f) {
        addFeature(f, null);
        return "";
    }
    
    @Override
    public String caseConnector(Connector c) {
    	addFeature(c, null);
    	return "";
    }
    
    @Override
    public String caseItemFlow(ItemFlow itf) {
    	addFeature(itf, null);
    	return "";
    }

    @Override
    public String casePartUsage(PartUsage pu) {
        return recCurrent(pu, true);
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
                    FeatureEntry fe = addFeature(f2, m.getMemberName(), null, true, parent);
                    CompTree ct = new CompTree(fe);
                    ct.process(f2);
                } else {
                    rec(m, e, true);
                }
            }
        }

        private CompTree(FeatureEntry fe) {
            this.parent = fe;
        }
    }

    protected String tree(Feature f) {
        boolean compartmentTree = styleValue("compartmentTree") != null;

        if (!(compartmentMost || compartmentTree)) return null;
        FeatureEntry fe = addFeature(f, null, null, true);
        if (compartmentTree) {
            CompTree ct = new CompTree(fe);
            ct.process(f);
        }
        return "";
    }

    @Override
    public String casePortUsage(PortUsage pu) {
        return tree(pu);
    }

    @Override
    public String caseTransitionUsage(TransitionUsage tu) {
        addFeature(tu, null, null, true);
        return "";
    }

    @Override
    public String caseReferenceUsage(ReferenceUsage ru) {
        return recCurrent(ru, false);
    }

    @Override
    public String caseRequirementUsage(RequirementUsage ru) {
        return recCurrent(ru, true);
    }

    @Override
    public String caseOccurrenceUsage(OccurrenceUsage ou) {
        return recCurrent(ou, true);
    }

    @Override
    public String caseAnalysisCaseUsage(AnalysisCaseUsage au) {
        return recCurrent(au, true);
    }

    @Override
    public String caseDefinition(Definition d) {
        return recCurrent(d, true);
    }

    @Override
    public String caseFeatureMembership(FeatureMembership fm) {
        return visitMembership(fm);
    }

    @Override
    public String caseMembership(Membership m) {
        Element e = m.getMemberElement();
        rec(m, e, true);
        return "";
    }

    @Override
    public String caseVariantMembership(VariantMembership vm) {
        if (vm.getMembershipOwningNamespace() instanceof EnumerationDefinition) {
            Element e = vm.getMemberElement();
            if (e instanceof EnumerationUsage) {
                EnumerationUsage eu = (EnumerationUsage) e;
            	addFeature(eu, null, null, true);
                return "";
            }
        }
        rec(vm, vm, true);
        return "";
    }

    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        rec(om, om, true);
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
            addPRelation(sm.getMembershipOwningNamespace(), typ, sm, "<<subject>>");
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

    private String addTitle(String prev, FeatureEntry fe) {
        String title = fe.getTitle();
        if (title.equals(prev)) return prev;
        append("-- ");
        append(title);
        append(" --\n");
        return title;
    }

    private void appendTextOfEnum(Element e) {
        append("<i>");
        appendText(getText(e), true);
        append("</i>");
    }

    private void addEnd(Feature f) {
        Element e = getEnd(f);
        if (e == null) return;
        // We should construct proper text from end but for the time being, we use just the text as it is.
        /*
        if (e instanceof Subsetting) {
            Subsetting ss = (Subsetting) e;
            e = ss.getSubsettedFeature();
        }*/
        append(getText(e));
    }

    private void addConnectorText(Connector c, boolean isInherited) {
        addFeatureText(c, isInherited);
        List<Feature> ends = c.getConnectorEnd();
        if (ends.size() == 2) {
            Feature f1 = ends.get(0);
            Feature f2 = ends.get(1);
            addEnd(f1);
            if (c instanceof BindingConnector) {
                append(" = ");
            } else {
                append(" to ");
            }
            addEnd(f2);
        } else {
            boolean delim = false;
            for (Feature end: ends) {
                if (delim) {
                    if (c instanceof BindingConnector) {
                        append(" = ");
                    } else {
                        append(", ");
                    }
                } else {
                    delim = true;
                }
                addEnd(end);
            }
        }
    }

    private void addFeatures(List<FeatureEntry> es, int level) {
        Collections.sort(es);
        final int size = es.size();
        String title = null;
        for (int i = 0; i < size; i++) {
            FeatureEntry fe = es.get(i);
            if (level == 0) {
                title = addTitle(title, fe);
            } else {
                for (int j = 0; j < level; j++) {
                    append("|_");
                }
                append(' ');
            }
            append(fe.getParameterPrefix());
            if (fe.isInherited) {
                append('^');
            }
            if (fe.prefix != null) {
                append(fe.prefix);
            }
            if (fe.f instanceof EnumerationUsage) {
                if (getFeatureName(fe.f) == null) {
                    appendTextOfEnum(fe.f);
                } else {
                    addFeatureText(fe.f, fe.isInherited);
                }
                append('\n');
            } else if (fe.f instanceof Connector) {
                addConnectorText((Connector) fe.f, fe.isInherited);
                append('\n');
            } else if (fe.f instanceof Expression) {
                String name = getFeatureName(fe.f);
                if (name != null) {
                    append(name);
                }
                String text = getText(fe.f);
                if (text == null) continue;
                append(" { ");
                appendText(text, true);
                append(" }\n");
            } else if (getFeatureName(fe.f) == null) {
                addAnonymouseFeatureText(fe.f);
                append('\n');
            } else if (addFeatureText(fe.f, false)) {
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

    private void startType(Type typ) {
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
        this.compartmentMost = styleValue("compartmentMost") != null;
    }


    @Override
    public String caseExpression(Expression e) {
        return null;
    }

    private boolean mixedMode = false;

    void setMixedMode(boolean flag) {
        this.mixedMode = flag;
    }

    @Override
    public String caseStateDefinition(StateDefinition sd) {
        if (!mixedMode) return null;
        return recCurrent(sd, true);
    }

    @Override
    public String caseStateUsage(StateUsage su) {
        if (!mixedMode) return null;
        return recCurrent(su, true);
    }

    @Override
    public String caseActionDefinition(ActionDefinition ad) {
        if (!mixedMode) return null;
        return recCurrent(ad, true);
    }

    @Override
    public String caseActionUsage(ActionUsage au) {
        if (!mixedMode) return null;
        return recCurrent(au, true);
    }
}
