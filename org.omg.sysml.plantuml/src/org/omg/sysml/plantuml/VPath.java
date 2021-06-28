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
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.PathStepExpression;
import org.omg.sysml.lang.sysml.Type;

public class VPath extends VTraverser {
    private class PathContext {
        private PathContext next;
        private PathContext prev;

        public boolean isMatching() {
            return prev != null;
        }

        public PathContext getNext() {
            if (next != null) return next;
            if (prev == null) {
                this.next = new PathContext(this, pse);
            } else {
                Type typ = pse.getOwningType();
                if (typ instanceof PathStepExpression) {
                    this.next = new PathContext(this, (PathStepExpression) typ);
                } else {
                    this.next = new PathContext(this, null);
                }
            }
            return this.next;
        }

        public PathContext getPrev() {
            return prev;
        }

        private PathContext(PathContext prev, PathStepExpression pse) {
            this.prev = prev;
            this.pse = pse;
        }

        public PathContext(PathStepExpression pse) {
            this.pse = pse;
        }
        
        private boolean isSet;

        public void setId(Element e, Integer id) {
            if (pse == null) return;
            if (!isMatching()) return;
            if (match(e)) {
                pathIdMap.put(pse, id);
                isSet = true;
            }
        }

        private PathStepExpression pse;
        private int unmatched;

        public Expression getTargetExp() {
            List<Expression> ops = pse.getOperand();
            if (ops.size() < 2) return null;
            if (isMatching()) {
                return ops.get(1);
            } else {
                return ops.get(0);
            }
        }

        private Element getTarget() {
            Expression ex = getTargetExp();
            if (!(ex instanceof FeatureReferenceExpression)) return null;
            FeatureReferenceExpression fre = (FeatureReferenceExpression) ex;
            return fre.getReferent();
        }

        public boolean match(Element e) {
            if (pse == null) return false;
            Element et = getTarget();
            return e.equals(et);
        }

        public Element requiredElement() {
            if (pse == null) return null;
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

        private PathStepExpression head(PathStepExpression pse) {
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

        RefPathContext(PathStepExpression pse) {
            this.pc = new PathContext(head(pse));
        }
    }

    private final Map<PathStepExpression, Integer> pathIdMap = new HashMap<PathStepExpression, Integer>();
    private List<RefPathContext> current = new ArrayList<RefPathContext>();

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
        if (!(e instanceof PathStepExpression)) return null;
        PathStepExpression pse = (PathStepExpression) e;
        return pathIdMap.get(pse);
    }

    VPath() {
    }

    @Override
    public String traverse(Namespace ns) {
        return super.traverse0(ns);
    }

    @Override
    public String casePathStepExpression(PathStepExpression pse) {
        current.add(new RefPathContext(pse));
        return "";
    }
}
