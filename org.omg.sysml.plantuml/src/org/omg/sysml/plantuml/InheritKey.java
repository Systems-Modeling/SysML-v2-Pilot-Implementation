/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2022-2024 Mgnite Inc.
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
import java.util.Set;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;


/* InheritKey identifies a feature or a membership with the context of inheriting.
 * The target feature to be identified must be "connectors" owning ends
 * or "types" owning features referring to others. */
class InheritKey {
    public final Type[] keys;
    /* If isDirect, the last key directly owns the target feature.
       Otherwise, the last key is denoted as ^ow. */
    private final boolean isDirect;

    private static boolean containsWithRedefined(List<Feature> fs, Feature ft) {
        for (Feature f : fs) {
            if (f.equals(ft)) return true;
            if (matchRedefined(f, ft)) return true;
        }
        return false;
    }

    private static List<Feature> belongingFeatures(Type typ) {
        List<Feature> fs = new ArrayList<>();
        for (Relationship rel : Visitor.toOwnedRelationshipArray(typ)) {
            if (rel instanceof FeatureMembership
                || rel instanceof FeatureValue) {
                for (Element tgt: rel.getTarget()) {
                    fs.add((Feature) tgt);
                }
            }
        }
        return fs;
    }

    private static boolean isBelonging(Type typ, Feature f) {
        if (containsWithRedefined(belongingFeatures(typ), f)) return true;
        // if (typ.getOwnedFeature().contains(f)) return true;
        if (containsWithRedefined(typ.getInheritedFeature(), f)) return true;
        // if (typ.getInheritedFeature().contains(f)) return true;
        return false;
    }

    private static boolean isBelonging(Type typ, Membership ms) {
        if (typ.getOwnedMembership().contains(ms)) return true;
        if (typ.getInheritedMembership().contains(ms)) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int code = 0;
        for (Type t: keys) {
            code ^= t.hashCode();
        }
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof InheritKey)) return false;
        InheritKey ki = (InheritKey) o;
        int len = keys.length;
        if (len != ki.keys.length) return false;
        for (int i = 0; i < len; i++) {
            if (!keys[i].equals(ki.keys[i])) return false;
        }
        return true;
    }

    // where ctx is (n1, n2, ..., nk), keyType is the nearest enclosing type owning `ref' feature;
    private static int findKeyType(List<Namespace> ctx, Feature ref) {
        for (int i = ctx.size() - 1; i >=0; i--) {
            Namespace ns = ctx.get(i);
            if (!(ns instanceof Type)) continue;
            Type typ = (Type) ns;
            if (isBelonging(typ, ref)) return i;
        }
        return -1;
    }
    
    private static int findKeyType(List<Namespace> ctx, Membership ref) {
        for (int i = ctx.size() - 1; i >=0; i--) {
            Namespace ns = ctx.get(i);
            if (!(ns instanceof Type)) continue;
            Type typ = (Type) ns;
            if (isBelonging(typ, ref)) return i;
        }
        return -1;
    }

    private static void fill(Type[] keys, List<Namespace> ctx, List<Integer> inheritIdices, int i) {
        for (int k = 0; k < i; k++) {
            int idx = inheritIdices.get(k);
            // It must not cause ClassCastException
            Type typ = (Type) ctx.get(idx);
            keys[k] = typ;
        }
    }

    private InheritKey(List<Namespace> ctx, List<Integer> inheritIdices, int i) {
        Type[] keys = new Type[i];
        fill(keys, ctx, inheritIdices, i);
        this.keys = keys;
        this.isDirect = true;
    }

    private InheritKey(List<Namespace> ctx, List<Integer> inheritIdices, int i, Type tail) {
        Type[] keys = new Type[i + 1];
        fill(keys, ctx, inheritIdices, i);
        keys[i] = tail;
        this.keys = keys;
        this.isDirect = false;
    }

    private InheritKey(Type tail) {
        Type[] keys = new Type[1];
        keys[0] = tail;
        this.keys = keys;
        this.isDirect = false;
    }

    private InheritKey(InheritKey base, boolean isDirect) {
        this.keys = base.keys;
        this.isDirect = isDirect;
    }

    private InheritKey(InheritKey base, int len) {
        this.keys = new Type[len];
        this.isDirect = base.isDirect;
        System.arraycopy(base.keys, 0, keys, 0, len);
    }

    public static InheritKey makeTargetKey(Type tgt, Feature ref) {
        if (isBelonging(tgt, ref)) {
            return new InheritKey(tgt);
        }
        return null;
    }

    // Create an indirect InheritKey so that redefined elements can be referred by
    // inherited connectors
    public static InheritKey makeIndirect(InheritKey ik) {
    	if (ik == null) return null;
        return new InheritKey(ik, false);
    }

    public static InheritKey findTop(InheritKey ik, Feature f) {
    	if (ik == null) return null;
        int end = ik.keys.length - 1;
        for (int i = end; i >= 0; i--) {
            if (isBelonging(ik.keys[i], f)) {
                if (i == end) return ik;
                return new InheritKey(ik, i + 1);
            }
        }
        return null;
    }


    // Identify what type owns redefining feature.
    private static Type identifyRedefiningTargetOwner(Type redefinedOwner, Feature f, boolean showInherited) {
        for (Specialization sp: redefinedOwner.getOwnedSpecialization()) {
            Type g = sp.getGeneral();
            if (showInherited) {
                if (isBelonging(g, f)) return g;
            } else {
                if (containsWithRedefined(belongingFeatures(g), f)) return g;
            }
        }
        return null;
    }

    private InheritKey(InheritKey base, int len, Type tail) {
        if (len > 0) {
            this.keys = new Type[len + 1];
            System.arraycopy(base.keys, 0, keys, 0, len);
            this.keys[len] = tail;
        } else {
            Type[] keys = new Type[1];
            keys[0] = tail;
            this.keys = keys;
        }
        this.isDirect = false;
    }
    // Make an inherit key by identifying what type owns redefining feature.
    public static InheritKey makeInheritKeyForRedefiningTarget(InheritKey ik, Feature f, boolean showInherited) {
        if (ik == null) return null; // It must be invalid model
        Type[] keys = ik.keys;
        for (int i = keys.length - 1; i >= 0; i--) {
            Type typ = keys[i];
            Type tgt = identifyRedefiningTargetOwner(typ, f, showInherited);
            if (tgt != null) {
                return new InheritKey(ik, i, tgt);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (keys.length == 0) return "Empty InherityKey";
        sb.append("InheritKey: [");
        sb.append(keys[0].getDeclaredName());
        for (int i = 1; i < keys.length; i++) {
            sb.append(", ");
            sb.append(keys[i].getDeclaredName());
        }
        sb.append(isDirect ? ']' : ')');
        return sb.toString();
    }
    
    private static InheritKey constructInternal(List<Namespace> ctx, List<Integer> inheritIdices, int idx) {
        if (idx < 0) return null;
        for (int i = inheritIdices.size(); i > 0; i--) {
            int idx2 = inheritIdices.get(i - 1);
            if (idx2 == idx) {
                // case of [t0, t1, ..., t_idx2 == ^ow]
                return new InheritKey(ctx, inheritIdices, i);
            } else if (idx2 < idx) {
                // case of [t0, t1, ..., t_idx2, ^ow)
                Type typ = (Type) ctx.get(idx);
                return new InheritKey(ctx, inheritIdices, i, typ);
            }
        }
        {
            // case of (^ow)
            Type typ = (Type) ctx.get(idx);
            return new InheritKey(typ);
        }
    }
    
    public static InheritKey construct(List<Namespace> ctx, List<Integer> inheritIdices, Feature ref) {
        int idx = findKeyType(ctx, ref);
        return constructInternal(ctx, inheritIdices, idx);
    }

    public static InheritKey construct(List<Namespace> ctx, List<Integer> inheritIdices, Membership ref) {
        int idx = findKeyType(ctx, ref);
        return constructInternal(ctx, inheritIdices, idx);
    }

    private static boolean matchRedefined(Feature f, Feature ft) {
        Set<Feature> redefs = FeatureUtil.getAllRedefinedFeaturesOf(f);
        return redefs.contains(ft);
    }

    public static boolean matchElementWithRedefined(Element e, Element et) {
        if (e.equals(et)) return true;
        if ((e instanceof Feature) && (et instanceof Feature)) {
            return matchRedefined((Feature) e, (Feature) et);
        }
        return false;
    }

    public static boolean match(InheritKey ik, List<Namespace> ctx, List<Integer> inheritIdices) {
        if (ik == null) {
            return inheritIdices.isEmpty();
        } else {
            int ctxSize = ctx.size();
            if (ctxSize == 0) {
                return false;
            }
            int iSize = inheritIdices.size();
            int kLen = ik.keys.length;
            int diff = kLen - iSize;

            if (!(diff == 0 || diff == 1)) return false;
            for (int i = 0; i < iSize; i++) {
                int idx = inheritIdices.get(i);
                Namespace ns = ctx.get(idx);
                if (!matchElementWithRedefined(ns, ik.keys[i])) return false;
            }
            if (diff == 0) return true;

            // diff must be 1
            if (ik.isDirect) return false;
            // case ^ow)
            return matchElementWithRedefined(ctx.get(ctxSize - 1), ik.keys[kLen - 1]);
        }
    }

    public static boolean isDirectInherit(InheritKey ik) {
        if (ik == null) return false;
        return ik.isDirect;
    }
}
