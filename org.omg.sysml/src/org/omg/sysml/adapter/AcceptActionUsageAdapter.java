package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.impl.AcceptActionUsageImpl;
import org.omg.sysml.util.TypeUtil;

public class AcceptActionUsageAdapter extends ActionUsageAdapter {

	public AcceptActionUsageAdapter(AcceptActionUsage action) {
		super(action);
	}

	public AcceptActionUsage getTarget() {
		return (AcceptActionUsage)super.getTarget();
	}
	
	/**
	 * The default receiver is the outermost containing ActionUsage of this AcceptActionUsage
	 * (or this AcceptActionUsage if it is not contained in any other ActionUsage), unless that
	 * ActionUsage is itself owned by an ActionDefinition.
	 */
	// TODO: Determine the proper default receiver for an AcceptActionUsage contained in an 
	// ActionDefinition or performed by a PartDefinition or PartUsage.
	protected Feature getDefaultReceiver() {
		Feature receiver = getTarget();
		Element owner = receiver.getOwner();
		while (owner instanceof ActionUsage) {
			receiver = (Feature)owner;
			owner = receiver.getOwner();
		}
		return owner instanceof ActionDefinition? getTarget(): receiver;
	}
	
	public void addDefaultReceiverBinding() {
		AcceptActionUsageImpl action = (AcceptActionUsageImpl)getTarget();
		if (action.getReceiverArgument() == null) {
			Feature receiverParameter = action.getReceiverParameter();
			if (receiverParameter != null) {
				TypeUtil.addBindingConnectorTo(action, getDefaultReceiver(), receiverParameter);
			}
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addDefaultReceiverBinding();
	}
	
}
