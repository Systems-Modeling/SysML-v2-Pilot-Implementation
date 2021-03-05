package org.omg.sysml.transformer;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Relationship;

public class AnnotatingElementTransformer extends ElementTransformer {
	
	public AnnotatingElementTransformer(AnnotatingElement element) {
		super(element);
	}
	
	public AnnotatingElement getElement() {
		return (AnnotatingElement)super.getElement();
	}
	
	public static void transformAnnotatingElement(AnnotatingElement annotatingElement) {
		EList<Annotation> annotations = annotatingElement.getAnnotation();
		if (annotations.isEmpty()) {
			Relationship owningRelationship = annotatingElement.getOwningRelationship();
			if (owningRelationship instanceof Annotation) {
				annotations.add((Annotation)owningRelationship);
			} else {
				annotatingElement.getOwnedRelationship().stream().
					filter(rel->rel instanceof Annotation).
					map(Annotation.class::cast).
					forEachOrdered(annotations::add);
			}
		}
	}
	
	@Override
	public void transform() {
		super.transform();
		transformAnnotatingElement(getElement());
	}

}
