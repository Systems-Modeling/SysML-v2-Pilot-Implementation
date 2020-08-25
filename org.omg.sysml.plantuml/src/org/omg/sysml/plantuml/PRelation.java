package org.omg.sysml.plantuml;

import org.omg.sysml.lang.sysml.Element;

class PRelation {
    public final Element src;
    public final Element dest;
    public final Element rel;

    private String description;
    public String getDescription() {
        return description;
    }

    public PRelation(Element src, Element dest, Element rel, String description) {
        this.src = src;
        this.dest = dest;
        this.rel = rel;
        this.description = description;
    }
}
