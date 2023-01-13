/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2022 Mgnite Inc.
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
import java.util.List;

import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EnumerationUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.SuccessionFlowConnectionUsage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

class CompartmentEntry implements Comparable<CompartmentEntry> {
    public final Feature f;
    public final OwningMembership om;
    public final String alias;
    public final String prefix;
    public final boolean isInherited;

    public String getParameterPrefix() {
        FeatureDirectionKind fdk = f.getDirection();
        if ((om instanceof SubjectMembership)
            || (om instanceof ActorMembership)
            || (om instanceof StakeholderMembership)) return "";  // Do not show `in' for subjects, actors, stakeholders
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

    private static class ToTitle extends SysMLSwitch<String> {
        public String caseBindingConnector(BindingConnector bc) {
            return "bindings";
        }
        public String caseFlowConnectionUsage(FlowConnectionUsage fcu) {
            return "flows";
        }
        public String caseSuccessionFlowConnectionUsage(SuccessionFlowConnectionUsage sfcu) {
            return "succession flows";
        }
    }
    private static ToTitle toTitle = new ToTitle();

    public String getTitle() {
        if (om instanceof FeatureValue) {
            return "values";
        }
        if (om instanceof SubjectMembership) {
            return "subject";
        }
        if (om instanceof ActorMembership) {
            return "actors";
        }
        if (om instanceof StakeholderMembership) {
            return "stakeholders";
        }
        if (om instanceof ObjectiveMembership) {
            return "objectives";
        }
        if (isParameter()) {
            return "parameters";
        }
        String s = toTitle.doSwitch(f);
        if (s != null) return s;
        s = SysML2PlantUMLText.getStereotypeName(f);
        if (s.endsWith("s")) {
            return s + "es";
        } else {
            return s + "s";
        }
    }

    private static int owningMembershipCompare(OwningMembership om1, OwningMembership om2) {
    	if (om1 == null) {
    		if (om2 == null) return 0;
    		return -1;
    	}
    	if (om2 == null) return 1;
        String ec1 = om1.eClass().getName();
        String ec2 = om2.eClass().getName();
        return ec1.compareTo(ec2);
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

    public int compareTo(CompartmentEntry o) {
        int v = owningMembershipCompare(om, o.om);
        if (v != 0) return v;
        v = featureCompare(f, o.f);
        if (v != 0) return v;
        if (alias == null) {
            if (o.alias == null) return 0;
            return -1;
        }
        if (o.alias == null) return 1;
        return alias.compareTo(o.alias);
    }

    public List<CompartmentEntry> children;
    public void add(CompartmentEntry fe) {
        if (children == null) {
            children = new ArrayList<CompartmentEntry>();
        }
        children.add(fe);
    }

    private CompartmentEntry(Feature f, OwningMembership om, String alias, String prefix, boolean isInherited) {
        this.f = f;
        this.om = om;
        this.alias = alias;
        this.prefix = prefix;
        this.isInherited = isInherited;
        this.children = null;
    }

    public static CompartmentEntry feature(OwningMembership om, String prefix, boolean isInherited) {
        Element e = om.getOwnedMemberElement();
        if (!(e instanceof Feature)) return null;
        return new CompartmentEntry((Feature)e, om, null, prefix, isInherited);
    }
        
    public static CompartmentEntry alias(Membership ms, boolean isInherited) {
        Element e = ms.getMemberElement();
        if (!(e instanceof Feature)) return null;
        return new CompartmentEntry((Feature) e, null, ms.getMemberName(), null, isInherited);
    }

    public static CompartmentEntry feature(Feature f, boolean isInherited) {
        return new CompartmentEntry(f, null, null, null, isInherited);
    }

}
