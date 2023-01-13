/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020-2022 Mgnite Inc.
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

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Subsetting;

class PRelation {
    public final InheritKey ik;
    private final Object src;
    private final Object dest;
    public final Element rel;

    public Element getSrcElement() {
        if (src instanceof Element) {
            return (Element) src;
        } else {
            return null;
        }
    }

    public Element getDestElement() {
        if (dest instanceof Element) {
            return (Element) dest;
        } else {
            return null;
        }
    }

    public boolean isInvalid() {
        return src == null && dest == null;
    }

    private String description;
    public String getDescription() {
        return description;
    }
    protected void setDescription(String desc) {
    	this.description = desc;
    }

    private static String makeIdStr(Integer ii) {
        return 'E' + ii.toString();
    }

    private Integer getElemId(SysML2PlantUMLText s2p, Element e) {
        Integer ii = s2p.getVPath().getId(ik, e);
        if (ii != null) return ii;
        if (!s2p.checkId(e)) {
            if (e instanceof Subsetting) {
                Subsetting ss = (Subsetting) e;
                e = ss.getSubsettedFeature();
                if (!s2p.checkId(e)) return null;
            } else {
                return null;
            }
        }
        return s2p.getId(e);
    }

    private String compElemId(SysML2PlantUMLText s2p, Element e) {
        if (e == null) return "[*]";
        Integer ii = getElemId(s2p, e);
        if (ii == null) return null;
        return makeIdStr(ii);
    }

    private String compId(SysML2PlantUMLText s2p, Object o) {
        if (o instanceof Element) {
            return compElemId(s2p, (Element) o);
        } else if (o instanceof Integer) {
            return makeIdStr((Integer) o);
        } else if (o == null) {
            return "[*]";
        } else {
            return null;
        }
    }

    private Integer getId(SysML2PlantUMLText s2p, Object o) {
        if (o instanceof Element) {
            return getElemId(s2p, (Element) o);
        } else if (o instanceof Integer) {
            return (Integer) o;
        } 
        return null;
    }

    public String compSrcId(SysML2PlantUMLText s2p) {
        return compId(s2p, src);
    }

    public Integer getSrcId(SysML2PlantUMLText s2p) {
        return getId(s2p, src);
    }

    public String compDestId(SysML2PlantUMLText s2p) {
        return compId(s2p, dest);
    }

    public Integer getDestId(SysML2PlantUMLText s2p) {
        return getId(s2p, dest);
    }

    public PRelation(InheritKey ik, Element src, Element dest, Element rel, String description) {
        this.ik = ik;
        this.src = src;
        this.dest = dest;
        this.rel = rel;
        this.description = description;
    }

    public PRelation(InheritKey ik, Object src, Object dest, Element rel, String description) {
        this.ik = null;
        this.src = src;
        this.dest = dest;
        this.rel = rel;
        this.description = description;
    }
}
