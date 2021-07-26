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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PathStepExpression;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Type;

public class VPath extends VTraverser {
    private class PathContext {
        private static final int SS_START_INDEX = -1;
        private static final int SS_END_INDEX = -2;

        private final PathStepExpression pse;

        private final Feature f;
        private final int index;

        private final Type typ;
        private final Subsetting ss;

        private PathContext next;
        private PathContext prev;

        private boolean isTerminal() {
            if (index == SS_END_INDEX) return true;
            if (index == SS_START_INDEX) return false;
            if (f != null) {
                return f.getOwnedFeatureChaining().size() <= index;
            } else {
                return pse == null;
            }
        }

        private boolean isMatching() {
            return prev != null;
        }

        public PathContext getNext() {
            if (next != null) return next;
            if (f != null) {
                if (index == SS_START_INDEX) {
                    if (typ == null) {
                        this.next = new PathContext(this, null, f, SS_END_INDEX, null, ss);
                    } else {
                        this.next = new PathContext(this, ss, null);
                    }
                } else {
                    this.next = new PathContext(this, f, index + 1);
                }
            } else {
                if (prev == null) {
                    this.next = new PathContext(this, pse, null, 0, null, ss);
                } else {
                    Type typ = pse.getOwningType();
                    if (typ instanceof PathStepExpression) {
                        this.next = new PathContext(this, (PathStepExpression) typ, null, 0, null, ss);
                    } else {
                        this.next = new PathContext(this, null, null, 0, null, ss);
                    }
                }
            }
            return this.next;
        }

        public PathContext getPrev() {
            return prev;
        }

        private PathContext(PathContext prev, PathStepExpression pse, Feature f, int index, Type typ, Subsetting ss) {
            this.prev = prev;
            this.pse = pse;
            this.f = f;
            this.index = index;
            this.typ = typ;
            this.ss = ss;
        }

        public PathContext(PathStepExpression pse) {
            this(null, pse, null, 0, null, null);
        }

        private PathContext(PathContext prev, Feature f, int index) {
            this(prev, null, f, index, null, null);
        }

        private PathContext(PathContext prev, Subsetting ss, Type typ) {
            this(prev, null, ss.getSubsettedFeature(), SS_START_INDEX, typ, ss);
        }

        public PathContext(Feature f) {
            this(null, null, f, 0, null, null);
        }
        
        public PathContext(Subsetting ss, Type typ) {
            this(null, ss, typ);
        }
        
        private boolean isSet;

        public void setId(Element e, Integer id) {
            if (isSet) return;
            if (isTerminal()) return;
            if (!isMatching()) return;
            if (unmatched != 0) return;
            if (match(e)) {
                if (ss != null) {
                    pathIdMap.put(ss, id);
                } else if (f != null) {
                    pathIdMap.put(f, id);
                } else {
                    pathIdMap.put(pse, id);
                }
                isSet = true;
            }
        }

        private int unmatched;

        private Expression getTargetExp() {
            List<Expression> ops = pse.getOperand();
            if (ops.size() < 2) return null;
            if (isMatching()) {
                return ops.get(1);
            } else {
                return ops.get(0);
            }
        }

        private Element getTarget() {
            if (ss != null) {
                if (typ == null) {
                    return f;
                } else {
                    return typ;
                }
            } else if (f != null) {
                FeatureChaining fc = f.getOwnedFeatureChaining().get(index);
                return fc.getChainingFeature();
            } else {
                Expression ex = getTargetExp();
                if (!(ex instanceof FeatureReferenceExpression)) return null;
                FeatureReferenceExpression fre = (FeatureReferenceExpression) ex;
                return fre.getReferent();
            }
        }

        public boolean match(Element e) {
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

        public PathContext enter(Element e) {
            if (unmatched == 0) {
                if (match(e)) {
                    return getNext();
                }
            }
            if (isMatching()) {
                unmatched++;
            }
            return this;
        }

        public PathContext leave() {
        	if (!isMatching()) return this;
            if (unmatched == 0) {
                return getPrev();
            } else {
                unmatched--;
            }
            return this;
        }

        
    }

    private class RefPathContext {
        private PathContext pc;

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

        RefPathContext(PathContext pc) {
            this.pc = pc;
        }
    }

    private final Map<Element, Integer> pathIdMap = new HashMap<Element, Integer>();
    private List<RefPathContext> current = new ArrayList<RefPathContext>();

    private Type typeOfInheriting(Type owningType, Feature f) {
        if (owningType == null) return null;
        if (owningType.getInheritedFeature().contains(f)) return owningType;
        if (owningType instanceof Feature) {
            Feature owningFeature = (Feature) owningType;
            return typeOfInheriting(owningFeature.getOwningType(), f);
        }
        return null;
    }

    private void addContext(Feature f) {
        for (Subsetting ss: f.getOwnedSubsetting()) {
            Feature sf = ss.getSubsettedFeature();
            List<FeatureChaining> fcs = sf.getOwnedFeatureChaining();
            if (fcs.isEmpty()) {
                Type typ = typeOfInheriting(f.getOwningType(), sf);
                if (typ != null) {
                    current.add(new RefPathContext(new PathContext(ss, typ)));
                }
            } else {
                current.add(new RefPathContext(new PathContext(sf)));
            }
        }
    }

    private static PathStepExpression head(PathStepExpression pse) {
        for (;;) {
            List<Expression> ops = pse.getOperand();
            if (ops.isEmpty()) return pse;
            Expression ex = ops.get(0);
            if (ex instanceof PathStepExpression) {
                pse = (PathStepExpression) ex;
            } else {
                return pse;
            }
        }
    }

    private void addContext(PathStepExpression pse) {
        pse = head(pse);
        if (pse == null) return;
        current.add(new RefPathContext(new PathContext(pse)));
    }

    public void setId(Element e, Integer id) {
        for (RefPathContext c: current) {
            c.setId(e, id);
        }
    }

    public void enter(Namespace ns) {
        for (RefPathContext c: current) {
            c.enter(ns);
        }
    }

    public Collection<Element> rest() {
        Set<Element> ret = new HashSet<Element>(current.size());
        for (RefPathContext c: current) {
            Element e = c.requiredElement();
            if (e != null) ret.add(e);
        }
        return ret;
    }

    public void leave(Namespace ns) {
        int size = current.size();
        RefPathContext[] cs = new RefPathContext[size];
        cs = current.toArray(cs);
        
        for (RefPathContext c: cs) {
            if (!c.leave()) {
                current.remove(c);
            }
        }
    }

    public Integer getId(Element e) {
        return pathIdMap.get(e);
    }

    VPath() {
    }

    @Override
    public String traverse(Namespace ns) {
        return super.traverse0(ns);
    }

    @Override
    public String caseFeature(Feature f) {
        addContext(f);
        return null;
    }

    @Override
    public String casePathStepExpression(PathStepExpression pse) {
        addContext(pse);
        return "";
    }
}
