package org.omg.sysml.scoping

import org.omg.sysml.scoping.IScopeTraversalFragment
import org.omg.sysml.lang.sysml.Element
import org.eclipse.xtext.naming.QualifiedName

class MembershipScopeTraversalFragment implements IScopeTraversalFragment {
	
	override traverseScope(Element context, (QualifiedName, Element)=>void visitor, (QualifiedName, Element)=>void follow) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}