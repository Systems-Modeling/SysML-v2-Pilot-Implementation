/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2023 Mgnite Inc.
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleRelSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleStereotypeSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.SetMultimap;

public class VSwimlane extends VBehavior {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle
    ("VSwimlane",
      null,
     "skinparam roundcorner 20\n"
     + "skinparam BoxPadding 20\n"
     + "skinparam SequenceBoxBackgroundColor #white\n"
     + "skinparam style strictuml\n"
     + "skinparam maxMessageSize 100\n",
     new StyleSwitch(new StyleRelSwitch() {
		@Override
		public String caseConnector(Connector c) {
            return " ->> ";
		}
     },
     new StyleStereotypeSwitch() {
         @Override
         public String caseElement(Element e) {
             return "";
         }
     }));

    @Override 
    protected SysML2PlantUMLStyle getStyle() {
        return style;
    }

    private class Pair {
        public final PartUsage participant;
        public final OccurrenceUsage oc; // actually Action
        public final boolean isInherited;
        public final int id;
        public List<SLink> slinks;
        // public final Feature pin; // Parameter (or Port?)

        public boolean isSame(Pair p) {
            return oc.equals(p.oc);
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair p = (Pair) o;
            return id == p.id;
        }

        private Pair(PartUsage participant, OccurrenceUsage oc, boolean isInherited, Integer id) {
            this.participant = participant;
            this.oc = oc;
            this.isInherited = isInherited;
            this.id = id == null ? -1 : id;
        }

        private Pair(Pair ancestor, Pair unresolved) {
            this(ancestor.participant, unresolved.oc, false, unresolved.id);
        }
    }

    private SetMultimap<Integer, Pair> pairMap = MultimapBuilder.hashKeys().hashSetValues().build();

    private PartUsage findParticipant(OccurrenceUsage oc) {
        for (Namespace ns = oc.getOwningNamespace(); ns != null; ns = ns.getOwningNamespace()) {
            if (ns instanceof PartUsage) {
                return (PartUsage) ns;
            }
            if (ns instanceof org.omg.sysml.lang.sysml.Package) {
            	return null;
            }
        }
        return null;
    }

    private final List<Pair> pairs = new ArrayList<>();
    private final List<Pair> unresolvedPairs = new ArrayList<>();

    private void addPair(PartUsage participant, OccurrenceUsage ou, boolean isInherited, Integer id) {
        Pair p = new Pair(participant, ou, isInherited(), id);
        if (participant != null) {
            pairs.add(p);
        } else {
            unresolvedPairs.add(p);
        }
    }

    private static class SActionSlot {
        public final ActionUsage au;
        public final Integer id;
        public final SActionSlot parent;
        public Map<Integer, Feature> params = new HashMap<>();

        public void addParam(Feature f, Integer id) {
            params.put(id, f);
        }

        SActionSlot(SActionSlot parent, ActionUsage au, Integer id) {
            this.parent = parent;
            this.au = au;
            this.id = id;
        }
    }

    private Map<Integer, SActionSlot> sActionSlotMap = new HashMap<>();

    private SetMultimap<Pair, Integer> equivMap = MultimapBuilder.hashKeys().hashSetValues().build();

    private SActionSlot currentSlot;

    @Override
    public String caseFeature(Feature f) {
        FeatureDirectionKind fdk = f.getDirection();
        if (fdk == null) return null;
        if (currentSlot != null) {
            Integer id = newId(f);
            currentSlot.addParam(f, id);
        } else {
        	return null;
        }
        return "";
    }

    @Override
    public String caseActionUsage(ActionUsage au) {
        if (au instanceof TransitionUsage) return null;
        if (au instanceof FlowConnectionUsage) return null;

        Integer id = newId(au);

        addSpecializations(id, au);

        PartUsage participant = findParticipant(au);
        addPair(participant, au, isInherited(), id);

        SActionSlot sas = new SActionSlot(this.currentSlot, au, id);
        sActionSlotMap.put(id, sas);
        SActionSlot save = this.currentSlot;
        this.currentSlot = sas;
        //return null;
        traverse(au);
        this.currentSlot = save;
        return "";
    }

    private static boolean isSuccessionLike(Element e) {
        return (e instanceof Succession) || (e instanceof ItemFlow) || (e instanceof TransitionUsage);
    }

    private void buildEquivParam(Pair p1, ActionUsage au, Integer id) {
        SActionSlot sas = sActionSlotMap.get(id);
        if (sas == null) return;
        for (Map.Entry<Integer, Feature> param: sas.params.entrySet()) {
            Integer pid = param.getKey();
            buildEquiv(p1, param.getValue(), pid);
        }
    }

    private Element resolveTarget(Element e) {
        if (e == null) return null;

        if (e instanceof FeatureChainExpression) {
        	FeatureChainExpression fce = (FeatureChainExpression) e;
            List<Expression> ops = fce.getOperand();
            int size = ops.size();
            if (size == 0) return e;
            Expression ex = ops.get(0);
            if (ex instanceof FeatureReferenceExpression) {
                FeatureReferenceExpression fre = (FeatureReferenceExpression) ex;
                return fre.getReferent();
            } else {
                return e;
            }
        } else if (e instanceof FeatureReferenceExpression) {
            FeatureReferenceExpression fre = (FeatureReferenceExpression) e;
            e = fre.getReferent();
        } else if (e instanceof Feature) {
        	Feature f = (Feature) e;
            List<FeatureChaining> fcs = f.getOwnedFeatureChaining();
            int size = fcs.size();
            if (size > 0) {
                FeatureChaining fc = fcs.get(size - 1);
                e = fc.getChainingFeature();
            }
        }
        return e;
    }


    private void buildEquiv(Pair p1, Element e, Integer id) {
        if (e instanceof ActionUsage) {
            buildEquivParam(p1, (ActionUsage) e, id);
        }
        Set<PRelation> prs = prMap.get(id);
        equivMap.put(p1, id);
        pairMap.put(id, p1);
        for (PRelation pr : prs) {
            if (pr.rel instanceof Specialization) {
                Specialization sp = (Specialization) pr.rel;
                Integer did = getDestId(pr);
                if (did == null) continue;
                equivMap.put(p1, did);
                pairMap.put(did, p1);
                Element tgt = resolveTarget(sp.getGeneral());
                buildEquiv(p1, tgt, did);
            }
        }
    }

    private void buildEquiv(List<Pair> ps) {
        for (Pair p : ps) {
            buildEquiv(p, p.oc, p.id);
        }
    }

    private void addUnresolvedPair(SActionSlot sas, Pair p, List<Pair> ret) {
        if (sas == null) return;
        int id = sas.id;
        boolean flag = false;
        for (PRelation pr: prRevMap.get(id)) {
            if (!(pr.rel instanceof Specialization)) continue;
            Integer sid = getDestId(pr);
            if (sid == null) continue;
            for (Pair ancestor: pairMap.get(sid)) {
                Pair p2 = new Pair(ancestor, p);
                ret.add(p2);
                flag = true;
            }
        }
        if (!flag) addUnresolvedPair(sas.parent, p, ret);
    }

    private void addUnresolvedPair(Pair p, List<Pair> ret) {
        int id = p.id;
        SActionSlot sas = sActionSlotMap.get(id);
        addUnresolvedPair(sas.parent, p, ret);
    }

    private List<Pair> addUnresolvedPairs() {
        List<Pair> ret = new ArrayList<>();
        for (Pair p : unresolvedPairs) {
            addUnresolvedPair(p, ret);
        }
        return ret;
    }

    private List<Pair> resolveAll() {
        Set<Pair> added = new HashSet<>();
        for (Pair p : pairs) {
            p.slinks = resolve(p, added);
        }
        List<Pair> ret = new ArrayList<>();
        for (Pair p : pairs) {
            // TODO: It effectively removes loops without incoming edges, another alogrithm is needed.
            if (added.contains(p)) continue;
            ret.add(p);
            added.add(p);
        }
        return ret;
    }

    private static class SLink {
        public final Pair p1;
        public final Pair p2;
        public final PRelation pr;

        public SLink(Pair p1, Pair p2, PRelation pr) {
            this.p1 = p1;
            this.p2 = p2;
            this.pr = pr;
        }
    }

    private List<SLink> resolve(Pair p1, Set<Pair> added) {
        List<SLink> ret = new ArrayList<>();
        for (Integer id : equivMap.get(p1)) {
            Set<PRelation> prs = prMap.get(id);
            for (PRelation pr: prs) {
                if (isSuccessionLike(pr.rel)) {
                    Integer did = getDestId(pr);
                    if (did == null) continue;
                    for (Pair p2 : pairMap.get(did)) {
                        ret.add(new SLink(p1, p2, pr));
                        if (!(added.contains(p1))) {
                        	added.add(p2);
                        }
                    }
                }
            }
        }
        return ret;
    }

    private static class Swimlane {
        public PartUsage pu = null;
        public boolean update(PartUsage pu2) {
            if (pu2.equals(pu)) return false;
            this.pu = pu2;
            return true;
        }
    }

    private boolean outputPair0(StringBuilder sb, Pair p, Swimlane sw) {
        PartUsage pu = p.participant;
        if (sw.update(pu)) {
            sb.append('|');
            sb.append(getNameAnyway(pu, true, p.isInherited));
            sb.append("|\n");
        }

        OccurrenceUsage oc = p.oc;
        sb.append(':');
        sb.append(getNameAnyway(oc, true, p.isInherited));
        sb.append(";\n");
        return true;
    }
    
    private static final int LEVEL_MAX = 5;

    private int level;

    private boolean outputPair(StringBuilder sb, Pair p, Swimlane sw, Set<Pair> added) {
        if (added.contains(p)) {
            if (level > LEVEL_MAX) return false;
            level += 3;
        }
        if (!outputPair0(sb, p, sw)) return false;
        added.add(p);
        List<SLink> sls = p.slinks;
        if (sls != null) {
            outputSLinks(sb, sls, sw, added);
        }
        return true;
    }

    private boolean outputSLink(StringBuilder sb, SLink sl, Swimlane sw, Set<Pair> added) {
        StringBuilder sb2 = new StringBuilder();
        if (!outputPair(sb2, sl.p2, sw, added)) return false;
        Element rel = sl.pr.rel;
        if (rel != null) {
            String text = getName(rel);
            if (text != null && text.length() > 0) {
                sb.append("-> ");
                sb.append(text);
                sb.append(";\n");
            }
        }
        sb.append(sb2);
        return true;
    }

    private boolean outputSLinks(StringBuilder sb, List<SLink> sls, Swimlane sw, Set<Pair> added) {
        int size = sls.size();
        if (size == 0) return false;
        if (size == 1) {
            return outputSLink(sb, sls.get(0), sw, added);
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean splitted = false;
            for (SLink sl: sls) {
                int pt = sb2.length();
                if (outputSLink(sb2, sl, sw, added)) {
                    if (pt > 0) {
                        splitted = true;
                        sb2.insert(pt, "split again\n");
                    }
                }
            }
            if (sb2.length() == 0) return false;
            if (splitted) {
                sb.append("split\n");
                sb.append(sb2);
                sb.append("end split\n");
            } else {
                sb.append(sb2);
            }
            return true;
        }
    }

    private SetMultimap<Integer, PRelation> prMap = MultimapBuilder.hashKeys().hashSetValues().build();
    private SetMultimap<Integer, PRelation> prRevMap = MultimapBuilder.hashKeys().hashSetValues().build();
    
    @Override
    protected boolean outputPRelation(StringBuilder ss, PRelation pr) {
        Integer srcId = getSrcId(pr);
        Integer destId = getDestId(pr);
        if (srcId == null || destId == null) {
            return false;
        }

        prMap.put(srcId, pr);
        prRevMap.put(destId, pr);

        return true;
    }

    private StringBuilder output(List<Pair> ps) {
        this.level = 0;
        StringBuilder sb = new StringBuilder();
        Swimlane sw = new Swimlane();

        int size = ps.size();
        if (size == 0) return sb;
        if (size == 1) {
            if (outputPair(sb, ps.get(0), sw, new HashSet<Pair>())) {
                sb.append("kill\n"); 
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean splitted = false;
            for (Pair p: ps) {
                int pt = sb2.length();
                if (outputPair(sb2, p, sw, new HashSet<Pair>())) {
                    if (pt > 0) {
                        splitted = true;
                        sb2.insert(pt, "split again\n-[hidden]->\n");
                    }
                    sb2.append("kill\n"); 
                }
            }
            if (sb2.length() == 0) return sb;
            if (splitted) {
                sb.append("split\n-[hidden]->\n");
                sb.append(sb2);
                sb.append("end split\n");
            } else {
                sb.append(sb2);
            }
            sb.append("kill\n"); 
        }
        return sb;
    }

    @Override
    protected String getString() {
        flushPRelations(true);
        buildEquiv(pairs);
        List<Pair> added = addUnresolvedPairs();
        buildEquiv(added);
        pairs.addAll(added);
        List<Pair> ps = resolveAll();
        StringBuilder sb = output(ps);
        return sb.toString();
    }

    /* Tentatively disable comments and annotations in sequence diagrams. */
    @Override
    public String casePackage(org.omg.sysml.lang.sysml.Package pkg) {
        return null;
    }
    @Override
    public String caseType(Type typ) {
        if (typ instanceof ActionUsage) return null;
        int id = newId(typ);
        addSpecializations(id, typ);
        return null;
    }
    @Override
    public String caseAnnotation(Annotation a) { return ""; }
    @Override
    public String caseMetadataFeature(MetadataFeature af) { return ""; }
    @Override
    public String caseComment(Comment c) { return ""; }

    public VSwimlane() {
        setShowsMultiplicity(false);
    }
}
