/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2021 Mgnite Inc.
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleRelSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleStereotypeSwitch;
import org.omg.sysml.plantuml.SysML2PlantUMLStyle.StyleSwitch;

import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.SetMultimap;

public class VSequence extends VDefault {
    private static final SysML2PlantUMLStyle style
    = new SysML2PlantUMLStyle
    ("VSequence",
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

    // private List<Type> participants = new ArrayList<Type>();

    private static boolean isThisOfFeature(Feature f, String qName) {
        return qName.equals(f.getQualifiedName());
    }

    private static boolean isOfFeature(Feature f, String qName) {
        if (isThisOfFeature(f, qName)) return true;
        for (Redefinition rd: f.getOwnedRedefinition()) {
            Feature rf = rd.getRedefinedFeature();
            if (isOfFeature(rf, qName)) return true;
        }
        return false;
    }

    private static boolean isSource(Feature f) {
        return isOfFeature(f, "Transfers::Transfer::source");
    }

    private static boolean isTarget(Feature f) {
        return isOfFeature(f, "Transfers::Transfer::target");
    }

    private Element next(FeatureChainExpression fce, boolean first) {
            List<Expression> ops = fce.getOperand();
            int size = ops.size();
            if (size == 0) return null;
            Expression ex = ops.get(0);
            if (first) {
                if (ex instanceof FeatureReferenceExpression) {
                    FeatureReferenceExpression fre = (FeatureReferenceExpression) ex;
                    return fre.getReferent();
                }
            } else {
                if (ex instanceof FeatureChainExpression) {
                    return next((FeatureChainExpression) ex, true);
                }
                return fce.getTargetFeature();
            }
            if (ex instanceof FeatureReferenceExpression) {
                FeatureReferenceExpression fre = (FeatureReferenceExpression) ex;
                return fre.getReferent();
            }
            return null;
    }

    private static class Pair {
        public final Type participant;
        public final EventOccurrenceUsage ev;

        public boolean isSame(Pair p) {
            return participant.equals(p.participant);
        }

        public static Pair create(Element participant, Element ev) {
            if (!(participant instanceof Type)) return null;
            if (!(ev instanceof EventOccurrenceUsage)) return null;
            return new Pair((Type) participant, (EventOccurrenceUsage) ev);
        }
        
        private Pair(Type participant, EventOccurrenceUsage ev2) {
            this.participant = participant;
            this.ev = ev2;
        }
    }

    private Pair getEventParticipant(Element e) {
        if (e == null) return null;
        if (e instanceof FeatureChainExpression) {
        	FeatureChainExpression fce = (FeatureChainExpression) e;
            e = next(fce, true);
            Element participant = next(fce, false);
            if (participant instanceof Type) {
                return Pair.create(participant, e);
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
                if (size > 1) {
                    FeatureChaining fc2 = fcs.get(size - 2);
                    Element participant = fc2.getChainingFeature();
                    return Pair.create(participant, e);
                }
            }
        }

        Namespace participant = e.getOwningNamespace();
        return Pair.create(participant, e);
    }

    private void addParticipant(Type participant) {
        if (checkId(participant)) return;
        addPUMLLine(participant, "participant ", getNameAnyway(participant));
        append('\n');
    }


    private class Message extends PRelation implements Comparable<Message> {
        private final Pair p1;
        private final Pair p2;
        Message(Pair p1, Pair p2, Element rel, String desc) {
            super(p1.participant, p2.participant, rel, desc);
            this.p1 = p1;
            this.p2 = p2;
        }

        private boolean consistent(int i1, int i2) {
            if (i1 > 0) return i2 >= 0;
            if (i1 < 0) return i2 <= 0;
            return true;
        }

        @Override
        public int compareTo(Message mes) {
            int r[] = new int[4];
            if (p1.isSame(mes.p1)) {
                r[0] = compare(p1.ev, mes.p1.ev);
            }
            if (p1.isSame(mes.p2)) {
                r[1] = compare(p1.ev, mes.p2.ev);
            }
            if (p2.isSame(mes.p1)) {
                r[2] = compare(p2.ev, mes.p1.ev);
            }
            if (p2.isSame(mes.p2)) {
                r[3] = compare(p2.ev, mes.p2.ev);
            }
            int ret = 0;
            for (int i = 0; i < r.length; i++) {
                int rr = r[i];
                if (!consistent(ret, rr)) {
                    setDescription("Disorder error! " + getDescription()); 
                    return 0;
                }
                if ((ret == 0) && (rr != 0)) {
                    ret = rr;
                }
            }
            return ret;
        }
    }
    private final List<Message> messages;

    private void addMessage(Pair p1, Pair p2, FlowConnectionUsage fcu) {
        addParticipant(p1.participant);
        addParticipant(p2.participant);
        messages.add(new Message(p1, p2, fcu, fcu.getEffectiveName()));
    }

    @Override
    protected String getString() {
        Collections.sort(messages);
        outputPRelations(messages);
        messages.clear();
        return super.getString();
    }

    @Override
    public String caseFlowConnectionUsage(FlowConnectionUsage fcu) {
        List<Feature> ends = fcu.getConnectorEnd();
        int size = ends.size();
        if (size < 2) return "";
        Element end1 = getEnd(ends.get(0));
        Pair p1 = getEventParticipant(end1);
        if (p1 == null) return "";
        for (int i = 1; i < size; i++) {
            Element end2 = getEnd(ends.get(i));
            Pair p2 = getEventParticipant(end2);
            if (p2 == null) return "";
            addMessage(p1, p2, fcu);
        }
        return "";
    }

    private SetMultimap<OccurrenceUsage, OccurrenceUsage> successionMM = MultimapBuilder.hashKeys().hashSetValues().build();

    private boolean fwdCompare(OccurrenceUsage oc1, OccurrenceUsage oc2) {
        Set<OccurrenceUsage> ocs = successionMM.get(oc1);
        if (ocs.contains(oc2)) return true;
        for (OccurrenceUsage oc11: ocs) {
            if (fwdCompare(oc11, oc2)) return true;
        }
        return false;
    }

    private int compare(OccurrenceUsage oc1, OccurrenceUsage oc2) {
        if (fwdCompare(oc1, oc2)) return -1;
        if (fwdCompare(oc2, oc1)) return 1;
        return 0;
    }

    @Override
    public String caseSuccession(Succession sc) {
        for (Element src: sc.getSource()) {
            if (!(src instanceof OccurrenceUsage)) continue;
            for (Element dest: sc.getTarget()) {
                if (!(dest instanceof OccurrenceUsage)) continue;
                successionMM.put((OccurrenceUsage) src, (OccurrenceUsage) dest);
            }
        }
        return null;
    }

    private static class FCMessage {
        public final boolean isSource;
        public final FlowConnectionUsage fcu;
        public final Feature[] chains;
        public final Type inheriting;

        private Element getTarget(int i) {
            if (i >= 0) return chains[i];
            Element e = chains[0];
            for (int k = 0; k > i; k--) {
                e = e.getOwner();
                if (e == null) return null;
            }
            return e;
        }

        @Override
        public int hashCode() {
            int code = fcu.hashCode();
            if (inheriting != null) {
                code ^= inheriting.hashCode();
            }
            for (int i = 0; i < chains.length; i++) {
                code ^= chains[i].hashCode();
            }
            return code;
        }
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof FCMessage)) return false;
            FCMessage fc = (FCMessage) o;
            if (!fcu.equals(fc.fcu)) return false;
            if (inheriting == null) {
                if (fc.inheriting != null) return false;
                int i = chains.length - 1;
                int j = fc.chains.length - 1;
                for (; ; i--, j--) {
                    if ((i < 0) && (j < 0)) break;
                    Element e1 = getTarget(i);
                    if (e1 == null) return false;
                    Element e2 = fc.getTarget(j);
                    if (e2 == null) return false;
                    if (!e1.equals(e2)) return false;
                }
            } else {
                if (!inheriting.equals(fc.inheriting)) return false;
                int len = chains.length;
                if (len != fc.chains.length) return false;
                for (int i = 0; i < len; i++) {
                    if (!chains[i].equals(fc.chains[i])) return false;
                }
            }
            return true;
        }

        private FCMessage(boolean isSource,
                          FlowConnectionUsage fcu,
                          Feature[] chains,
                          Type inheriting) {
            this.isSource = isSource;
            this.fcu = fcu;
            this.chains = chains;
            this.inheriting = inheriting;
        }

        private static List<FeatureChaining> getFC(EventOccurrenceUsage ocu) {
            for (Subsetting ss: ocu.getOwnedSubsetting()) {
                Feature sf = ss.getSubsettedFeature();
                List<FeatureChaining> fcs = sf.getOwnedFeatureChaining();
                if (!fcs.isEmpty()) return fcs;
            }
            return null;
        }

        public static FCMessage create(EventOccurrenceUsage eou) {
            List<FeatureChaining> fcs = getFC(eou);
            if (fcs == null) return null;
            int j = fcs.size() - 1;
            if (j < 1) return null;
            Feature tf = fcs.get(j).getChainingFeature();
            boolean isSource;
            if (isSource(tf)) {
                isSource = true;
            } else if (isTarget(tf)) {
                isSource = false;
            } else {
                return null;
            }

            j--;
            Feature mf = fcs.get(j).getChainingFeature();
            if (!(mf instanceof FlowConnectionUsage)) return null;
            FlowConnectionUsage fcu = (FlowConnectionUsage) mf;

            Feature[] chains = new Feature[j];
            for (int i = 0; i < j; i++) {
                chains[i] = fcs.get(i).getChainingFeature();
            }

            /* To checke the equi
            */
            Type inheriting = null;
            if (j > 0) {
                Type t = eou.getOwningType();
                Feature f = chains[0];
                if (t.getInheritedFeature().contains(f)) {
                    inheriting = t;
                }
            }
            
            return new FCMessage(isSource, fcu, chains, inheriting);
        }
    }

    private Map<FCMessage, Pair> messageMap = new HashMap<>();

    private boolean processEventFeatureChaining(EventOccurrenceUsage eou) {
        FCMessage fcm = FCMessage.create(eou);
        if (fcm == null) return false;
        Pair p1 = Pair.create(eou.getOwner(), eou);
        if (p1 == null) return false;
        
        Pair p2 = messageMap.get(fcm);
        if (p2 == null) {
            messageMap.put(fcm, p1);
        } else {
            if (fcm.isSource) {
                addMessage(p1, p2, fcm.fcu);
            } else {
                addMessage(p2, p1, fcm.fcu);
            }
        }
        return true;
    }

    @Override
    public String caseEventOccurrenceUsage(EventOccurrenceUsage eou) {
        if (!processEventFeatureChaining(eou)) return null;
        return "";
    }

    private final boolean isInBox;

        
    @Override
    public String caseOccurrenceDefinition(OccurrenceDefinition od) {
        if (isInBox) return null;
        VSequence vseq = new VSequence(this);
        vseq.traverse(od);
        if (vseq.isEmpty()) return "";
        String name = od.getEffectiveName();
        if (name != null) {
            append("box ");
            quote(name);
            append('\n');
            vseq.flush();
            append("end box\n");
        } else {
            vseq.flush();
        }
        return "";
    }

    /* Tentatively disable comments and annotations in sequence diagrams. */
    @Override
    public String caseAnnotation(Annotation a) { return ""; }
    @Override
    public String caseAnnotatingFeature(AnnotatingFeature af) { return ""; }
    @Override
    public String caseComment(Comment c) { return ""; }

    private VSequence(VSequence vseq) {
    	super(vseq);
        this.isInBox = true;
        this.messages = vseq.messages;
    }

    public VSequence() {
        setShowsMultiplicity(false);
        this.isInBox = false;
        this.messages = new ArrayList<Message>();
    }
}
