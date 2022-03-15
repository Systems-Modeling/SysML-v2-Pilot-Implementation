/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2022 Mgnite Inc.
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Type;

public class VPath extends VTraverser {
	// PC (PathContext) management. 
    private abstract class PC {
        private final Element idTarget;
        private PC next;
        private final PC prev;

        protected boolean isTerminal() {
            return false;
        }

        protected boolean isMatching() {
            return prev != null;
        }

        protected abstract PC getNext();

        private PC getNextI() {
            if (next != null) return next;
            this.next = getNext();
            return this.next;
        }

        protected PC getPrev() {
            return prev;
        }

        protected PC(PC prev) {
            this.prev = prev;
            this.idTarget = prev.idTarget;
        }

        protected PC(Element idTarget) {
            this.prev = null;
            this.idTarget = idTarget;
        }

        private boolean isSet;

        public void setId(Element e, Integer id) {
            if (isSet) return;
            if (isTerminal()) return;
            if (!isMatching()) return;
            if (unmatched != 0) return;
            if (match(e)) {
                putPathIdMap(id, idTarget);
                isSet = true;
            }
        }

        private int unmatched;

        protected abstract Element getTarget();

        private boolean match(Element e) {
            if (isTerminal()) return false;
            Element et = getTarget();
            return e.equals(et);
        }

        public Element requiredElement() {
            if (isTerminal()) return null;
            if (!isMatching()) return null;
            if (isSet) return null;
            if (unmatched > 0) return null;
            return getTarget();
        }

        public PC enter(Element e) {
            if (unmatched == 0) {
                if (match(e)) {
                    return getNextI();
                }
            }
            if (isMatching()) {
                unmatched++;
            }
            return this;
        }

        public PC leave() {
            if (!isMatching()) return this;
            if (unmatched == 0) {
                return getPrev();
            } else {
                unmatched--;
            }
            return this;
        }
    }
    
    private class PCFeatureChainExpression extends PC {
        private final FeatureChainExpression fce;

        private Expression getTargetExp() {
            List<Expression> ops = fce.getOperand();
            if (ops.isEmpty()) {
            	return null;
            } else {
            	return ops.get(0);
            }
        }

        @Override
        protected Element getTarget() {
            Expression ex = getTargetExp();
            if (!(ex instanceof FeatureReferenceExpression)) return null;
            FeatureReferenceExpression fre = (FeatureReferenceExpression) ex;
            return fre.getReferent();
        }

        private PCFeatureChain getPCFeatureChain() {
            Feature f = fce.getTargetFeature();
            if (f == null) return null;
            List<FeatureChaining> fcs = f.getOwnedFeatureChaining();
            if (fcs.isEmpty()) return null;
            return new PCFeatureChain(this, f);
        }

        @Override
        protected PC getNext() {
            PCFeatureChain pcf = getPCFeatureChain();
            if (pcf != null) return pcf;
            Feature f = fce.getTargetFeature();
            if (f == null) {
                return new PCTerminal(this);
            } else {
                return new PCFeature(this, f);
            }
        }

        private PCFeatureChainExpression(PCFeatureChainExpression prev, FeatureChainExpression fce) {
            super(prev);
            this.fce = fce;
        }

        public PCFeatureChainExpression(FeatureChainExpression target, FeatureChainExpression head) {
            super(target);
            this.fce = head;
        }
    }

    private class PCFeature extends PC {
        private final Feature f;

        @Override
        protected Element getTarget() {
            return f;
        }

        @Override
        protected PC getNext() {
            return new PCTerminal(this);
        }

        public PCFeature(PC prev, Feature f) {
            super(prev);
            this.f = f;
        }
    }

    private class PCFeatureChain extends PC {
        private final List<FeatureChaining> fcs;
        private final int index;

        @Override
        protected Element getTarget() {
            FeatureChaining fc = fcs.get(index);
            return fc.getChainingFeature();
        }

        @Override
        protected PC getNext() {
            if (fcs.size() <= index + 1) return new PCTerminal(this);
            return new PCFeatureChain(this);
        }

        private PCFeatureChain(PCFeatureChain prev) {
            super(prev);
            this.fcs = prev.fcs;
            this.index = prev.index + 1;
        }

        public PCFeatureChain(Feature f) {
            super(f);
            this.fcs = f.getOwnedFeatureChaining();
            this.index = 0;
        }

        public PCFeatureChain(PC prev, Feature f) {
            super(prev);
            this.fcs = f.getOwnedFeatureChaining();
            this.index = 0;
        }
    }

    private class PCTerminal extends PC {
        @Override
        protected boolean isTerminal() {
            return true;
        }
        @Override
        protected Element getTarget() {
            return null;
        }
        @Override
        protected PC getNext() {
            return null;
        }
        public PCTerminal(PC prev) {
            super(prev);
        }
    }

    private class PCInherited extends PC {
        private final Type typ;
        private final Subsetting ss;

        @Override
        protected Element getTarget() {
            if (typ == null) {
                return ss.getSubsettedFeature();
            } else {
                return typ;
            }
        }
        @Override
        protected PC getNext() {
            if (typ != null) {
                return new PCInherited(this);
            } else {
                return new PCTerminal(this);
            }
        }

        private PCInherited(PCInherited prev) {
            super(prev);
            this.typ = null;
            this.ss = prev.ss;
        }

        public PCInherited(Subsetting ss, Type typ) {
            super(ss);
            this.typ = typ;
            this.ss = ss;
        }
    }


    /*
      ife : ItemFlowEnd :> baseTarget (e.g. action) {
           // ReferenceUsage
           iff : ItemFlowFeature :>> ioTarget: ReferenceUsage;
      }
    */
    private static Feature getIOTarget(ItemFlowEnd ife) {
        for (FeatureMembership fm: ife.getOwnedFeatureMembership()) {
            Feature f = fm.getMemberFeature();
            if (f instanceof ItemFlowFeature) {
                for (Redefinition rd: f.getOwnedRedefinition()) {
                    return rd.getRedefinedFeature();
                }
            }
        }
        return null;
    }
    
    public PCItemFlowEnd createPCItemFlowEnd(ItemFlowEnd ife) {
        Feature ioTarget = getIOTarget(ife);
        PC basePC = makePC(ife, true);
        if (basePC == null) return null;
        return new PCItemFlowEnd(ife, basePC, ioTarget);
    }

    private class PCItemFlowEnd extends PC {
        private final Feature ioTarget;
        private final PC basePC;

        public PCItemFlowEnd(ItemFlowEnd ife, PC basePC, Feature ioTarget) {
            super(ife);
            this.basePC = basePC;
            this.ioTarget = ioTarget;
        }

        private PCItemFlowEnd(PCItemFlowEnd prev, PC basePC) {
            super(prev);
            this.basePC = basePC;
            this.ioTarget = prev.ioTarget;
        }

        @Override
        protected Element getTarget() {
            if (basePC == null) return ioTarget;
            return basePC.getTarget();
        }

        @Override
        protected PC getNext() {
            if (basePC == null) return new PCTerminal(this);
            PC ret = basePC.getNext();
            if (!ret.isTerminal()) {
                return new PCItemFlowEnd(this, ret);
            }
            if (ioTarget == null) {
                return new PCTerminal(this);
            } else {
                return new PCItemFlowEnd(this, null);
            }
        }
    }


    private class RefPC {
        private PC pc;

        public void enter(Element e) {
            pc = pc.enter(e);
        }
        
        public boolean leave() {
            pc = pc.leave();
            return pc != null;
        }

        public Element requiredElement() {
            return pc.requiredElement();
        }

        public void setId(Element e, Integer id) {
            pc.setId(e, id);
        }

        RefPC(PC pc) {
            this.pc = pc;
        }
    }

    private final Map<Element, Integer> pathIdMap = new HashMap<Element, Integer>();
    private final Map<Integer, Set<Element>> pathIdRevMap = new HashMap<Integer, Set<Element>>();

    private void putPathIdMap(Integer id, Element e) {
        pathIdMap.put(e, id);
        Set<Element> es = pathIdRevMap.get(id);
        if (es == null) {
            es = new HashSet<Element>(1);
            es.add(e);
            pathIdRevMap.put(id, es);
        } else {
            es.add(e);
        }
    }

    private List<RefPC> current = new ArrayList<RefPC>();

    private static Type typeOfInheriting(Type owningType, Feature f) {
        if (owningType == null) return null;
        if (owningType.getOwnedFeature().contains(f)) return owningType;
        if (owningType.getInheritedFeature().contains(f)) return owningType;
        if (owningType instanceof Feature) {
            Feature owningFeature = (Feature) owningType;
            return typeOfInheriting(owningFeature.getOwningType(), f);
        }
        return null;
    }

    private PC makePC(Feature f, boolean force) {
        for (Subsetting ss: f.getOwnedSubsetting()) {
            Feature sf = ss.getSubsettedFeature();
            List<FeatureChaining> fcs = sf.getOwnedFeatureChaining();
            if (fcs.isEmpty()) {
                Type typ = typeOfInheriting(f.getOwningType(), sf);
                if (force) {
                    return new PCInherited(ss, typ);
                }
                if (typ != null) {
                    return new PCInherited(ss, typ);
                }
            } else {
                return new PCFeatureChain(sf);
            }
        }
        return null;
    }
    

    private void addContext(PC pc) {
        current.add(new RefPC(pc));
    }

    private String addContext(Feature f) {
        if (!f.isEnd()) return null;
        PC pc = makePC(f, false);
        if (pc == null) {
            return null;
        } else {
            addContext(pc);
            return "";
        }
    }

    private String addContext(ItemFlowEnd ife) {
        PC pc = createPCItemFlowEnd(ife);
        if (pc == null) return null;
        addContext(pc);
        return "";
    }

    private static FeatureChainExpression head(FeatureChainExpression fce) {
        for (;;) {
            List<Expression> ops = fce.getOperand();
            if (ops.isEmpty()) return fce;
            Expression ex = ops.get(0);
            if (ex instanceof FeatureChainExpression) {
                fce = (FeatureChainExpression) ex;
            } else {
                return fce;
            }
        }
    }

    private String addContext(FeatureChainExpression fce) {
    	FeatureChainExpression head = head(fce);
        if (head == null) return null;
        addContext(new PCFeatureChainExpression(fce, head));
        return "";
    }

    public void setId(Element e, Integer id) {
        for (RefPC c: current) {
            c.setId(e, id);
        }
    }

    public void enter(Namespace ns) {
        for (RefPC c: current) {
            c.enter(ns);
        }
    }

    public Collection<Element> rest() {
        Set<Element> ret = new HashSet<Element>(current.size());
        for (RefPC c: current) {
            Element e = c.requiredElement();
            if (e != null) ret.add(e);
        }
        return ret;
    }

    public void leave(Namespace ns) {
        int size = current.size();
        RefPC[] cs = new RefPC[size];
        cs = current.toArray(cs);
        
        for (RefPC c: cs) {
            if (!c.leave()) {
                current.remove(c);
            }
        }
    }

    public Integer getId(Element e) {
        return pathIdMap.get(e);
    }

    public Set<Element> getPaths(Integer id) {
    	return pathIdRevMap.get(id);
    }

    VPath() {
    }

    @Override
    public String traverse(Namespace ns) {
        return super.traverse0(ns);
    }

    @Override
    public String caseFeature(Feature f) {
        return addContext(f);
    }

    @Override
    public String caseFeatureChainExpression(FeatureChainExpression fce) {
        return addContext(fce);
    }

    @Override
    public String caseItemFlowEnd(ItemFlowEnd ife) {
        return addContext(ife);
    }
}
