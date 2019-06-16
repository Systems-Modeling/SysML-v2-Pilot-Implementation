package org.omg.sysml.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractScope

class AlfLambdaScope extends AbstractScope {
	
	EObject lazy
	
	(EObject, EReference , QualifiedName)=>Iterable<IEObjectDescription> lambda
	
	EReference reference
	
	protected new(IScope parent, boolean ignoreCase) {
		super(parent, ignoreCase)
	}
	
     new(IScope parent, EReference ref, EObject lazy, (EObject, EReference, QualifiedName ) => Iterable<IEObjectDescription> lambda ) {
		super(parent, false);
		
		this.lazy = lazy
		this.lambda = lambda
		this.reference = ref
	}
	
	override getSingleElement(QualifiedName qn) {
		println("Got called for "+qn)
		val ge = getElements(qn)
		if(ge !== null)
			ge.head
		else 
			null
	}
	
	override getElements(QualifiedName qn) {
			println("Got called for "+qn)
		lambda.apply(lazy, reference, qn)
	}
	override protected getAllLocalElements() {
		println("unsoop") 
		getElements(QualifiedName.create("#"))
	}
	
}