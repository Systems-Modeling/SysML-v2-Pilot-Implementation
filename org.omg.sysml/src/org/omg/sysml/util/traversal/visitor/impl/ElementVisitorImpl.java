package org.omg.sysml.util.traversal.visitor.impl;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

public class ElementVisitorImpl extends VisitorImpl<Element> {

	public ElementVisitorImpl(Element element, Traversal traversal, ElementProcessingFacade facade) {
		super(element, traversal, facade);
	}

	protected Object process() {
		return this.getFacade().processElement(this.getElement());
	}

}
