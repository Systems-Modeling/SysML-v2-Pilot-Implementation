package org.omg.kerml.xtext;

import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.omg.sysml.util.ElementUtil;

public class KerMLDerivedStateComputer implements IDerivedStateComputer {

	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		if (preLinkingPhase) {
			return;
		}
		ElementUtil.transformAll(resource, false);
	}
	
	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		// TODO Auto-generated method stub
		
	}

}
