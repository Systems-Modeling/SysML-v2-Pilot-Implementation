package org.omg.kerml.xtext;

import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl;

import com.google.common.collect.Iterators;

public class KerMLDerivedStateComputer implements IDerivedStateComputer {

	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (preLinkingPhase) {
			return;
		}
		Iterators.filter(resource.getAllContents(), InvocationExpressionImpl.class)
			.forEachRemaining(InvocationExpressionImpl::transform);
	}

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		// TODO Auto-generated method stub
		
	}

}
