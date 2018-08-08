package org.omg.sysml.scoping

import org.omg.sysml.scoping.IScopeTraversalFragment
import org.omg.sysml.lang.sysml.Element
import org.eclipse.xtext.naming.QualifiedName

class MembershipScopeTraversalFragment implements IScopeTraversalFragment {
	
	override traverseScope(Element context, (QualifiedName, Element)=>void visitor, (QualifiedName, Element)=>void follow) {
		if (context instanceof org.omg.sysml.lang.sysml.Package){
			context.ownedMembership.forEach[m|
				val element = m.memberElement
				
				//val superclass = m.owningPackage
				if (element !== null && !element.eIsProxy){
					val name = if (m.memberName === null) element.name else m.memberName
					//there was a test where name was null
					if(name===null)
						println(".")
					val qn = QualifiedName.create(name)
					visitor.apply(qn, element)
					follow.apply(qn, element)
				} 
			]
		}
	}
	
}