/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2024 Mgnite Inc.
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

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;

public class VPath extends VTraverser {
    public static Expression getRefTarget(Expression e) {
        if ((e instanceof FeatureChainExpression)
            || (e instanceof FeatureReferenceExpression)) return e;
        return null;
    }

    private boolean initialized;

    // PC (PathContext) management. 
    private abstract class PC {
        private final Element idTarget;

        // If it's true, PC does consider Redefinition when it match with idTarget.
        // This is used for Redefinition.
        protected final boolean noRedefine;

        private PC next;
        private PC prev;
        public void setPrev(PC prev) {
            this.prev = prev;
        }

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

        protected PC(PC prev) {
            this.prev = prev;
            this.idTarget = prev.idTarget;
            this.noRedefine = prev.noRedefine;
        }

        protected PC(Element idTarget, boolean noRedefine) {
            this.prev = null;
            this.idTarget = idTarget;
            this.noRedefine = noRedefine;
        }

        private boolean isSet;

        protected void setIdInternal(InheritKey ik, Element e, Integer id, boolean enable) {
            if (isSet) return;
            if (isTerminal()) return;
            if (!isMatching()) return;
            if (unmatched != 0) return;
            if (!match(e)) return;
            if (enable) {
                putPathIdMap(id, ik, idTarget);
            }
            isSet = true;
        }

        public void setId(InheritKey ik, Element e, Integer id) {
            setIdInternal(ik, e, id, true);
        }

        private int unmatched;

        protected abstract Element getTarget();

        private boolean match(Element e) {
            if (isTerminal()) return false;
            Element et = getTarget();
            if (noRedefine) {
                return e.equals(et);
            } else {
                return InheritKey.matchElementWithRedefined(e, et);
            }
        }

        public Element requiredElement() {
            if (isTerminal()) return null;
            if (!isMatching()) return null;
            if (isSet) return null;
            if (unmatched > 0) return null;
            return getTarget();
        }

        public PC enter(Namespace ns) {
            if (unmatched == 0) {
                if (match(ns)) {
                    PC next = getNextI();
                    return next;
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
                return prev;
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

        public PCFeatureChainExpression(FeatureChainExpression fce) {
            super(fce, false);
            this.fce = fce;
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
        
        public PCFeature(Element tgt, Feature f, boolean noRedefine) {
            super(tgt, noRedefine);
            this.f = f;
        }

        protected PCFeature(PCFeature pc) {
            super(pc);
            this.f = pc.f;
        }
    }

    private class PCFeatureTop extends PCFeature {
        @Override
        public PC enter(Namespace ns) {
            return this;
        }

        @Override
        public Element requiredElement() {
            // no target inherit.
            return null;
        }

        @Override
        public PC leave() {
            return this;
        }

        public PCFeatureTop(PCFeature pc) {
            super(pc);
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

        @Override
        public void setId(InheritKey ik, Element e, Integer id) {
            if (index < fcs.size() - 1) {
                super.setIdInternal(ik, e, id, false);
            } else {
                super.setIdInternal(ik, e, id, true);
            }
        }

        private PCFeatureChain(PCFeatureChain prev) {
            super(prev);
            this.fcs = prev.fcs;
            this.index = prev.index + 1;
        }

        public PCFeatureChain(Element tgt, Feature f, boolean noRedefine) {
            super(tgt, noRedefine);
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

    // Make an InheritKey for ref, which is either a connector end or FeatureReferenceExpression or FeatureChainExpression.
    // These are (indirectly) owned by the innermost feature, which effectively determines the target scope.
    private InheritKey makeInheritKeyForReferer(PC pc) {
    	if (pc == null) return null;
        Element e = pc.getTarget();
        if (!(e instanceof Feature)) return null;
        Feature ref = (Feature) e;

        Namespace ns = getCurrentNamespace();
        if (!(ns instanceof Type)) return null;

        if (ns instanceof Feature) {
            Feature tgt = (Feature) ns;
            InheritKey ik = makeInheritKey(tgt);
            if (ik != null) {
                // Make the inherit key indirect in order to refer to redefined targets as well as inherited ones.
                ik = InheritKey.makeIndirect(ik);
                ik = InheritKey.findTop(ik, ref);
                if (ik != null) return ik;
            }
        }

        // In case that tgt inherits ref, we need to make an InheritKey for tgt.
        Type tgt = (Type) ns;
        return InheritKey.makeTargetKey(tgt, ref);
    }


    /*
      ife : ItemFlowEnd :> baseTarget (e.g. action) {
           // ReferenceUsage
           iff : Feature :>> ioTarget: ReferenceUsage;
      }
    */
    private static Feature getIOTarget(ItemFlowEnd ife) {
        for (FeatureMembership fm: toOwnedFeatureMembershipArray(ife)) {
            Feature f = fm.getOwnedMemberFeature();
            for (Redefinition rd: f.getOwnedRedefinition()) {
                return rd.getRedefinedFeature();
            }
        }
        return null;
    }
    
    private class PCItemFlowEnd extends PC {
        private final Feature ioTarget;
        private final PC basePC;

        public PCItemFlowEnd(ItemFlowEnd ife, PC basePC, Feature ioTarget) {
            super(ife, false);
            this.basePC = basePC;
            this.ioTarget = ioTarget;
        }

        private PCItemFlowEnd(PCItemFlowEnd prev, PC basePC) {
            super(prev);
            this.basePC = basePC;
            this.ioTarget = prev.ioTarget;
        }

        @Override
        public void setId(InheritKey ik, Element e, Integer id) {
            // When we support item flow connection, we setId() if basePC is non-null.
            if (basePC == null) {
                super.setIdInternal(ik, e, id, true);
            } else {
                super.setIdInternal(ik, e, id, false);
            }
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

    private class PCInheritKey extends PC {
        public final InheritKey ik;
        private final PC pc;

        @Override
        protected PC getNext() {
            return pc;
        }

        @Override
        public PC enter(Namespace ns) {
            if (matchCurrentInheritings(ik)) {
                return pc;
            } else {
                return this;
            }
        }

        public PCInheritKey(InheritKey ik, PC pc) {
            super((Element) null, pc.noRedefine);
            this.ik = ik;
            this.pc = pc;
            pc.setPrev(this);
        }

        @Override
        protected Element getTarget() {
            throw new UnsupportedOperationException();
        }
    }

    private class RefPC {
        private PC pc;
        private final InheritKey ik;

        public void enter(Namespace ns) {
            pc = pc.enter(ns);
        }
        
        public boolean leave() {
            pc = pc.leave();
            if (pc != null) return true;
            return false;
        }

        public Element requiredElement() {
            return pc.requiredElement();
        }

        public void setId(Element e, Integer id) {
            pc.setId(ik, e, id);
        }

        RefPC(PC pc, InheritKey ik) {
            if (ik == null) {
                if (pc instanceof PCFeature) {
                    this.pc = new PCFeatureTop((PCFeature) pc);
                } else {
                    this.pc = pc;
                }
            } else {
                this.pc = new PCInheritKey(ik, pc);
            }
            this.ik = ik;
        }
    }

    // InheritKey->Element->ID
    private final Map<InheritKey, Map<Element, Integer>> inheritedPathIdMap = new HashMap<>();
    // ID -> Elements
    private final Map<Integer, Set<Element>> pathIdRevMap = new HashMap<Integer, Set<Element>>();

    private void putPathIdMap(Integer id, InheritKey ik, Element pt) {
        Map<Element, Integer> ikPathIdMap = inheritedPathIdMap.get(ik);
        if (ikPathIdMap == null) {
            ikPathIdMap = new HashMap<>();
            inheritedPathIdMap.put(ik, ikPathIdMap);
        }
        ikPathIdMap.put(pt, id);
        
        Set<Element> es = pathIdRevMap.get(id);
        if (es == null) {
            es = new HashSet<Element>(1);
            es.add(pt);
            pathIdRevMap.put(id, es);
        } else {
            es.add(pt);
        }
    }

    private List<RefPC> current = new ArrayList<RefPC>();

    private PC makeFeaturePC(Element tgt, Feature f, boolean noRedefine) {
        List<FeatureChaining> fcs = f.getOwnedFeatureChaining();
        if (fcs.isEmpty()) {
            return new PCFeature(tgt, f, noRedefine);
        } else {
            return new PCFeatureChain(tgt, f, noRedefine);
        }
    }

    private PC makeEndFeaturePC(Feature end) {
        Feature sf = ConnectorUtil.getRelatedFeatureOfEnd(end);
        if (sf == null) return null;
        return makeFeaturePC(end, sf, false);
    }

    private RefPC createRefPC(InheritKey ik, PC pc) {
        if (pc == null) return null;
        RefPC rpc = new RefPC(pc, ik);
        current.add(rpc);
        return rpc;
    }

    private String addContextForFeature(Feature f, boolean isRedefinition) {
        PC pc = makeFeaturePC(f, f, isRedefinition);
        InheritKey ik = makeInheritKeyForReferer(pc);
        if (isRedefinition) {
            ik = InheritKey.makeInheritKeyForRedefiningTarget(ik, f);
        }
        if (createRefPC(ik, pc) == null) return null;
        return "";
    }

    private String addContextForEnd(Feature f) {
        if (f instanceof ItemFlowEnd) {
            return addContextForItemFlowEnd((ItemFlowEnd) f);
        }
        PC pc = makeEndFeaturePC(f);
        InheritKey ik = makeInheritKeyForReferer(pc);
        if (createRefPC(ik, pc) == null) return null;
        return "";
    }

    private String addContextForTransitionUsageEnd(Feature tu, Feature end) {
        PC pc = makeEndFeaturePC(end);
        InheritKey ik = makeInheritKey(tu);
        if (createRefPC(ik, pc) == null) return null;
        return "";
    }

    private String addContextForItemFlowEnd(ItemFlowEnd ife) {
        PC pc = makeEndFeaturePC(ife);
        if (pc == null) return null;
        Feature ioTarget = getIOTarget(ife);
        pc = new PCItemFlowEnd(ife, pc, ioTarget);
        InheritKey ik = makeInheritKeyForReferer(pc);
        if (createRefPC(ik, pc) == null) return null;
        return "";
    }

    private String addContextForFeatureChainExpression(FeatureChainExpression fce) {
        PC pc = new PCFeatureChainExpression(fce);
        InheritKey ik = makeInheritKeyForReferer(pc);
        createRefPC(ik, pc);
        return "";
    }

    private String addContextForFeatureReferenceExpression(FeatureReferenceExpression fre) {
        Feature f = fre.getReferent();
        if (f == null) return "";
        PC pc = new PCFeature(fre, f, false);
        InheritKey ik = makeInheritKeyForReferer(pc);
        createRefPC(ik, pc);
        return "";
    }

    public void setId(Element e, Integer id) {
        for (RefPC c: current) {
            c.setId(e, id);
        }
    }

    public void enter(Namespace ns) {
        if (!initialized) return;
        for (RefPC c: current) {
            c.enter(ns);
        }
    }

    public Collection<Element> rest() {
        Set<Element> ret = new HashSet<Element>(current.size());
        if (!initialized) return ret;
        for (RefPC c: current) {
            Element e = c.requiredElement();
            if (e != null) ret.add(e);
        }
        return ret;
    }

    public void leave(Namespace ns) {
        if (!initialized) return;
        int size = current.size();
        RefPC[] cs = new RefPC[size];
        cs = current.toArray(cs);
        
        for (RefPC c: cs) {
            if (!c.leave()) {
                current.remove(c);
            }
        }
    }

    public Integer getId(InheritKey ik, Element e) {
        Map<Element, Integer> ikPathIdMap = inheritedPathIdMap.get(ik);
        if (ik != null) {
            if (ikPathIdMap != null) {
                Integer ret = ikPathIdMap.get(e);
                if (ret != null) return ret;
            }
            ikPathIdMap = inheritedPathIdMap.get(null);
        }
        if (ikPathIdMap == null) return null;
        return ikPathIdMap.get(e);
    }

    public Set<Element> getPaths(Integer id) {
    	return pathIdRevMap.get(id);
    }

    public void init() {
        initialized = true;
    }

    VPath() {
    }

    @Override
    public String caseType(Type typ) {
        for (Specialization sp: typ.getOwnedSpecialization()) {
            Type g = sp.getGeneral();
            // Type s = sp.getSpecific();
            if (g == null) continue;
            if (isHidden(g)) continue;
            if (g instanceof Feature) {
                addContextForFeature((Feature) g, sp instanceof Redefinition);
            }
            if (checkVisited(g)) continue;
            visit(g);
            traverse(g);
            // visit(s); // Typically this will cause double traverse but checkVisit() stops it..
        }
        return null;
    }

    @Override
    public String caseFeatureChainExpression(FeatureChainExpression fce) {
        return addContextForFeatureChainExpression(fce);
    }

    @Override
    public String caseFeatureReferenceExpression(FeatureReferenceExpression fre) {
        return addContextForFeatureReferenceExpression(fre);
    }

    @Override
    public String caseItemFlowEnd(ItemFlowEnd ife) {
        return addContextForItemFlowEnd(ife);
    }

    @Override
    public String caseConnector(Connector c) {
        /* VTraverser.traverse() do not duplicatedly traverse features already visited.
           Thus VPath visits ends without counting on traverse(). */
        for (Feature end: c.getConnectorEnd()) {
            addContextForEnd(end);
        }
        return "";
    }

    @Override
    public String caseTransitionUsage(TransitionUsage tu) {
        Succession su = tu.getSuccession();
        for (Feature end: su.getConnectorEnd()) {
            addContextForTransitionUsageEnd(tu, end);
        }
        return "";
    }
}
