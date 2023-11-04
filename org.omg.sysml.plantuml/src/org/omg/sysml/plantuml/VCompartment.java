/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2023 Mgnite Inc.
 * Copyright (c) 2021-2023 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EnumerationDefinition;
import org.omg.sysml.lang.sysml.EnumerationUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.util.TypeUtil;

public class VCompartment extends VStructure {
    private List<VTree> subtrees = new ArrayList<VTree>();

    private VTree parent;

    private Type currentType;

    private final boolean compartmentMost;

    protected boolean isCompartmentMost() {
        return compartmentMost;
    }

    protected boolean rec(Namespace n, Membership m, Element e, boolean force) {
        if (parent == null) return false;
        VTree subtree = parent.subtree(n, m, e, force);
        if (subtree == null) return false;
        subtrees.add(subtree);
        return true;
    }

    protected boolean rec(Membership m, Element e, boolean force) {
        return rec(getCurrentNamespace(), m, e, force);
    }

    private Membership getMembership(Element e) {
        Membership ms = getCurrentMembership();
        if (ms != null) return ms;
        for (Membership m: currentType.getInheritedMembership()) {
            if (e.equals(m.getMemberElement())) return m;
        }
        return null;
    }

    private boolean recOrAddOwningMembership(OwningMembership ms) {
        if (!isCompartmentMost() && rec(ms, ms, false)) return true;
        add(CompartmentEntry.feature(ms, "", isInherited()), null, true);
        return false;
    }

    private boolean recCurrentMembership(Element e, boolean force) {
        Membership ms = getMembership(e);
        if (ms == null) return false;
        return rec(ms, e, force);
    }

    private String recCurrent(Element e, boolean force) {
        if (isCompartmentMost()) return null;
        if (recCurrentMembership(e, force)) return "";
        return null;
    }

    private List<CompartmentEntry> compartmentEntries = new ArrayList<CompartmentEntry>();

    private CompartmentEntry add(CompartmentEntry ce, CompartmentEntry parent, boolean norec) {
        Membership ms = getCurrentMembership();
        if (ms instanceof ReturnParameterMembership) {
            Element e = ms.getMemberElement();
             // To filter empty "result" parameter.
            if (e.getOwnedRelationship().isEmpty()) return null;
        }

        if (!norec) {
            if (recCurrentMembership(ce.f, false)) return null;
        }

        if (ce == null) return null;
        if (parent == null) {
            compartmentEntries.add(ce);
        } else {
            parent.add(ce);
        }
        return ce;
    }

    private CompartmentEntry addAlias(Membership ms) {
        return add(CompartmentEntry.alias(ms, isInherited()), null, true);
    }

    private CompartmentEntry addTreeItem(Membership ms, CompartmentEntry parent) {
        return add(CompartmentEntry.alias(ms, isInherited()), parent, true);
    }

    private CompartmentEntry addTreeRoot(Feature f) {
        return add(CompartmentEntry.feature(f, isInherited()), null, true);
    }

    protected CompartmentEntry addEntry(Feature f, boolean norec) {
        return add(CompartmentEntry.feature(f, isInherited()), null, norec);
    }

    protected CompartmentEntry addEntry(Feature f) {
        return addEntry(f, isCompartmentMost());
    }

    protected CompartmentEntry addEntry(OwningMembership om, String prefix) {
        return add(CompartmentEntry.feature(om, prefix, isInherited()), null, true);
    }

    @Override
    public String caseFeature(Feature f) {
        addEntry(f);
        return "";
    }
    
    @Override
    public String caseConnector(Connector c) {
    	addEntry(c);
    	return "";
    }

    @Override
    public String caseConnectionUsage(ConnectionUsage cu) {
    	addEntry(cu);
    	return "";
    }
    
    @Override
    public String caseItemFlow(ItemFlow itf) {
    	addEntry(itf);
    	return "";
    }

    @Override
    public String casePartUsage(PartUsage pu) {
        return recCurrent(pu, true);
    }

    private class CompTree {
        private final CompartmentEntry parent;

        public void process(Feature f) {
            for (Membership m: f.getOwnedMembership()) {
                Element e = m.getMemberElement();
                if (e instanceof Expression) {
                    // Do not show it
                } else if (e instanceof Connector) {
                    // Do not show it
                } else if (e instanceof Feature) {
                	Feature f2 = (Feature) e;
                    CompartmentEntry fe = addTreeItem(m, parent);
                    CompTree ct = new CompTree(fe);
                    ct.process(f2);
                } else {
                    rec(f, m, e, true);
                }
            }
        }

        private CompTree(CompartmentEntry fe) {
            this.parent = fe;
        }
    }

    protected String tree(Feature f) {
        boolean compartmentTree = styleValue("compartmentTree") != null;

        if (!(isCompartmentMost() || compartmentTree)) return null;
        CompartmentEntry fe = addTreeRoot(f);
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
        addEntry(tu, true);
        return "";
    }

    @Override
    public String caseReferenceUsage(ReferenceUsage ru) {
        // ReferenceUsage should be processed by the parent VTree.
    	return null;
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
    public String caseOwningMembership(OwningMembership m) {
        Element e = m.getOwnedMemberElement();
        if (e instanceof Documentation) {
            return visitMembership(m);
        }
        rec(m, e, false);
        return "";
    }

    @Override
    public String caseMembership(Membership m) {
        if (addAlias(m) == null) return null;
        return "";
    }

    @Override
    public String caseVariantMembership(VariantMembership vm) {
        if (vm.getMembershipOwningNamespace() instanceof EnumerationDefinition) {
            Element e = vm.getMemberElement();
            if (e instanceof EnumerationUsage) {
                EnumerationUsage eu = (EnumerationUsage) e;
            	addEntry(eu, true);
                return "";
            }
        }
        rec(vm, vm, true);
        return "";
    }

    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        //rec(om, om, true);
        recOrAddOwningMembership(om);
        return "";
    }

    @Override
    public String caseActorMembership(ActorMembership am) {
        recOrAddOwningMembership(am);
        return "";
    }

    @Override
    public String caseStakeholderMembership(StakeholderMembership sm) {
        recOrAddOwningMembership(sm);
        return "";
    }

    private boolean isEmptySubject(SubjectMembership sm) {
        Usage u = sm.getOwnedSubjectParameter();
        if (!"subj".equals(u.getName())) return false;
        return u.getOwnedRelationship().isEmpty();
    }

    @Override
    public String caseSubjectMembership(SubjectMembership sm) {
        if (isEmptySubject(sm)) return "";
        recOrAddOwningMembership(sm);
        return "";
    }

    private String addTitle(String prev, CompartmentEntry ce) {
        String title = ce.getTitle();
        if (title.equals(prev)) return prev;

        if (prev != null) {
            append("--\n");
        }
        append("##//");
        append(title);
        append("//##\n");
        return title;
    }

    private void appendTextOfEnum(Element e) {
        append("<i>");
        appendText(getText(e), true);
        append("</i>");
    }

    private void addEnd(Feature f) {
        Element e = VPath.getRelatedFeatureOfEnd(f);
        if (e == null) return;
        // We should construct proper text from end but for the time being, we use just the text as it is.
        /*
        if (e instanceof Subsetting) {
            Subsetting ss = (Subsetting) e;
            e = ss.getSubsettedFeature();
        }*/
        appendText(getText(e), true);
    }

    private void addConnectorText(Connector c, boolean isInherited) {
        boolean hasPrefix = false;
        hasPrefix = addFeatureText(c, isInherited);
        List<Feature> ends = TypeUtil.getOwnedEndFeaturesOf(c);
        if (ends.size() == 2) {
            Feature f1 = ends.get(0);
            Feature f2 = ends.get(1);
            if (c instanceof ItemFlow) {
                ItemFlow itf = (ItemFlow) c;
                String desc = itemFlowDesc(itf);
                if (desc != null) {
                    if (hasPrefix) {
                        append(' ');
                    }
                    append("of ");
                    append(desc);
                    hasPrefix = true;
                }
            }
            if (hasPrefix) {
                if (c instanceof BindingConnector) {
                    append(" bind ");
                } else if (c instanceof ItemFlow) {
                    append(" from ");
                } else if (c instanceof Succession) {
                    append(" first ");
                } else {
                    append(" connect ");
                }
            }
            addEnd(f1);
            if (c instanceof BindingConnector) {
                append(" = ");
            } else if ((c instanceof Succession)
                       && !(c instanceof SuccessionItemFlow)) {
                append(" then ");
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

    private boolean appendFeatureText(Feature f, String toBeRemoved) {
        String text = getText(f);
        if (text == null) return false;
        text = text.trim();
        if (text.startsWith(toBeRemoved)) {
            text = text.substring(toBeRemoved.length()).trim();
        }
        appendText(text, false);
        addEvaluatedResults(f);
        return true;
    }

    private boolean addCompartmentEntry(CompartmentEntry ce) {
        if (ce.f instanceof EnumerationUsage) {
            if (getFeatureName(ce.f) == null) {
                appendTextOfEnum(ce.f);
            } else {
                return addFeatureText(ce.f, ce.isInherited);
            }
        } else if (ce.f instanceof Connector) {
            addConnectorText((Connector) ce.f, ce.isInherited);
        } else if (ce.f instanceof RequirementUsage) {
            return addFeatureText(ce.f, ce.isInherited);
        } else if (ce.f instanceof ConstraintUsage) {
            return appendFeatureText(ce.f, "constraint");
        } else if (ce.om instanceof FeatureValue) {
            return appendFeatureValue((FeatureValue) ce.om);
        } else if (ce.f instanceof Expression) {
            String name = getFeatureName(ce.f);
            if (name != null) {
                append(name);
            }
            String text = getText(ce.f);
            if (text == null) {
                if (name == null) {
                    return false;
                }
            } else {
                append(" { ");
                appendText(text, true);
                append(" }");
                addEvaluatedResults(ce.f);
            }
        } else if (getFeatureName(ce.f) == null) {
            addAnonymouseFeatureText(ce.f);
        } else {
            return addFeatureText(ce.f, ce.isInherited);
        }
        return true;
    }

    private void addCompartmentEntries(List<CompartmentEntry> es, int level) {
        Collections.sort(es);
        final int size = es.size();
        String title = null;
        if (documentations != null) {
            title = "";
        }
        for (int i = 0; i < size; i++) {
            CompartmentEntry ce = es.get(i);
            if (level == 0) {
                title = addTitle(title, ce);
            } else {
                for (int j = 0; j < level; j++) {
                    append("|_");
                }
                append(' ');
            }
            append(ce.getParameterPrefix());
            if (ce.prefix != null) {
                append(ce.prefix);
            }

            if (addCompartmentEntry(ce)) {
                // Aliases
                boolean first = true;
                for (int j = i + 1; j < size; j++) {
                    CompartmentEntry fe2 = es.get(j);
                    if (ce.f.equals(fe2.f)) {
                        if (fe2.alias != null) {
                            if (first) append(" <b>alias</b> ");
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

            if (ce.children != null) {
                addCompartmentEntries(ce.children, level + 1);
            }
        }
    }

    private List<Documentation> documentations;
    private boolean addDocumentation(Documentation doc) {
        if (!currentType.equals(doc.getDocumentedElement())) return false;
        if (documentations == null) {
            documentations = new ArrayList<>(1);
        }
        documentations.add(doc);
        return true;
    }

    private void addDocumentations() {
    	if (documentations == null) return;

        boolean flag = false;
        append("##//doc//##\n");
        for (Documentation doc: documentations) {
            String name = doc.getDeclaredName();
            if (name != null && !name.isEmpty()) {
                append("\"\"");
                appendText(name, true);
                append("\"\": ");
            }
            if (flag) {
                append(".. ..\n");
            } else {
                flag = true;
            }
            String body = doc.getBody();
            if (body != null) {
                appendText(body.trim(), false);
            }
            append('\n');
        }
    }

    public void startType(Type typ) {
        this.currentType = typ;
        traverse(typ, false, true);
        addDocumentations();
        addCompartmentEntries(compartmentEntries, 0);
        popNamespace();
    }

    public List<VTree> process(VTree parent, Type typ) {
        this.parent = parent;
        subtrees.clear();
        compartmentEntries.clear();
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

    @Override
    public String caseFeatureValue(FeatureValue fv) {
        addEntry(fv, null);
        return "";
    }

    @Override
    public String caseDocumentation(Documentation doc) {
        if (addDocumentation(doc)) return "";
        return null;
    }
    
}
