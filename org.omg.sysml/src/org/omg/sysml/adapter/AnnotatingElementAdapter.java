package org.omg.sysml.adapter;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Relationship;

public class AnnotatingElementAdapter extends ElementAdapter {
	
	public AnnotatingElementAdapter(AnnotatingElement element) {
		super(element);
	}
	
	public AnnotatingElement getTarget() {
		return (AnnotatingElement)super.getTarget();
	}
	
	public static void transformAnnotatingElement(AnnotatingElement annotatingElement) {
		EList<Annotation> annotations = annotatingElement.getAnnotation();
		if (annotations.isEmpty()) {
			Relationship owningRelationship = annotatingElement.getOwningRelationship();
			if (owningRelationship instanceof Annotation) {
				annotations.add((Annotation)owningRelationship);
			} else {
				annotatingElement.getOwnedRelationship().stream().
					filter(Annotation.class::isInstance).
					map(Annotation.class::cast).
					forEachOrdered(annotations::add);
			}
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		transformAnnotatingElement(getTarget());
	}

}
