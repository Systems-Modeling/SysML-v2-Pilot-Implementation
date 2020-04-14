package org.omg.kerml.xtext.postprocessor

import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.emf.ecore.EObject
import org.omg.sysml.lang.sysml.impl.TypeImpl

class KerMLDerivedStateComputer implements IDerivedStateComputer {

	override void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (preLinkingPhase) {
			// Do nothing in prelinking phase
			return;
		}
		resource.getAllContents().forEach[computeDerivedState]

	}

	protected def dispatch void computeDerivedState(EObject obj) {
		// By default do nothing
	}

	protected def dispatch void computeDerivedState(TypeImpl type) {
		type.computeImplicitGeneralization
	}

	override void discardDerivedState(DerivedStateAwareResource resource) {
		// No objects are explicitly removed here
	}

}
