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
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.IndividualUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;

public class VCompartment extends VStructure {
    private List<Element> rest = new ArrayList<Element>();
    private Element base;

    protected void putAside(Element e) {
        rest.add(e);
    }

    private static class FeatureEntry implements Comparable<FeatureEntry> {
        public final Feature f;
        public final String alias;
        public final String prefix;

        private static int featureMetaclassCompare(Feature f1, Feature f2) {
            if (f1 instanceof AttributeUsage) {
                if (!(f2 instanceof AttributeUsage)) {
                    return -1;
                }
            } else if (f1 instanceof Usage) {
                if (!(f2 instanceof Usage)) {
                    return -1;
                }
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

        public FeatureEntry(Feature f, String alias, String prefix) {
            this.f = f;
            this.alias = alias;
            this.prefix = prefix;
        }
    }

    private List<FeatureEntry> featureEntries = new ArrayList<FeatureEntry>();

    protected void addFeatureForce(Feature f, String alias, String prefix) {
        featureEntries.add(new FeatureEntry(f, alias, prefix));
    }

    protected void addFeature(Feature f, String alias, String prefix) {
        if (getFeatureName(f) == null) return;
        featureEntries.add(new FeatureEntry(f, alias, prefix));
    }


    @Override
    public String caseFeature(Feature f) {
        addFeature(f, null, null);
        return "";
    }

    @Override
    public String casePartUsage(PartUsage pu) {
        putAside(pu);
        return "";
    }

    @Override
    public String caseReferenceUsage(ReferenceUsage ru) {
        putAside(ru);
        return "";
    }

    @Override
    public String caseRequirementUsage(RequirementUsage ru) {
        putAside(ru);
        return "";
    }

    @Override
    public String caseIndividualUsage(IndividualUsage iu) {
        putAside(iu);
        return "";
    }

    @Override
    public String caseAnalysisCaseUsage(AnalysisCaseUsage au) {
        putAside(au);
        return "";
    }

    @Override
    public String caseDefinition(Definition d) {
        putAside(d);
        return "";
    }

    @Override
    public String caseMembership(Membership m) {
        Element e = m.getMemberElement();
        if (e instanceof Feature) {
            addFeature((Feature) e, m.getMemberName(), null);
        } else {
            putAside(e);
        }
        return "";
    }

    @Override
    public String caseVariantMembership(VariantMembership vm) {
        putAside(vm);
        return "";
    }

    @Override
    public String caseObjectiveMembership(ObjectiveMembership om) {
        putAside(om);
        return "";
    }

    @Override
    public String caseSubjectMembership(SubjectMembership sm) {
        Usage u = sm.getOwnedSubjectParameter();
        for (FeatureTyping ft: u.getOwnedTyping()) {
            Type typ = ft.getType();
            addPRelation(base, typ, sm, "<<subject>>");
        }
        return "";
    }

    private void addFeatures() {
        Collections.sort(featureEntries);
        
        final int size = featureEntries.size();
        EClass ec0 = null;
        for (int i = 0; i < size; i++) {
            FeatureEntry fe = featureEntries.get(i);
            EClass ec1 = fe.f.eClass();
            if (!ec1.equals(ec0)) {
                ec0 = ec1;
                if (!ec1.equals(SysMLPackage.Literals.ATTRIBUTE_USAGE)) {
                    append("--");
                    append(SysML2PlantUMLText.getStereotypeName(fe.f));
                    append("--\n");
                }
            }
            if (fe.prefix != null) {
                append(fe.prefix);
            }
            if (getFeatureName(fe.f) == null) {
                addAnonymouseFeatureText(fe.f);
                append('\n');
            } else if (addFeatureText(fe.f)) {
                boolean first = true;
                for (int j = i + 1; j < size; j++) {
                    FeatureEntry fe2 = featureEntries.get(j);
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
        }
    }

    public void startType(Type typ) {
        this.base = typ;
        traverse(typ);
        addFeatures();
        closeBlock("");
    }

    public List<Element> process(Type typ) {
        rest.clear();
        featureEntries.clear();
        startType(typ);
        return rest;
    }

    public VCompartment(Visitor prev) {
        super(prev);
    }
}
