package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.Element;

public class AcceptActionUsageAdapter extends ActionUsageAdapter {

	public AcceptActionUsageAdapter(AcceptActionUsage action) {
		super(action);
	}

	public AcceptActionUsage getTarget() {
		return (AcceptActionUsage)super.getTarget();
	}
	
	// Implicit Generalization
	
	@Override
	public void computeImplicitGeneralTypes() {
		addComputedRedefinitions(null);
	}
	
	// Computed Redefinition
	
	@Override
	public void addComputedRedefinitions(Element skip) {
		addDefaultGeneralType();
		super.addComputedRedefinitions(skip);
	}

}
