package org.omg.sysml.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.omg.sysml.lang.sysml.Class
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Generalization

class InheritanceScopeTraversalFragment implements IScopeTraversalFragment {
	
	override traverseScope(Element context, (QualifiedName, Element)=>void visitor, (QualifiedName, Element)=>void follow) {
		if(context instanceof Class){
			context.ownedElement.filter(Generalization).filter[gen|gen.general?.name!==null].forEach[gen|
				follow.apply(QualifiedName.create(), gen.general)
			]
		}
	}
	
}