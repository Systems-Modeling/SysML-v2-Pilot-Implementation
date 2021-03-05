package org.omg.sysml.transformer;

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.impl.AcceptActionUsageImpl;
import org.omg.sysml.util.TransformationUtil;

public class AcceptActionUsageTransformer extends ElementTransformer {

	public AcceptActionUsageTransformer(AcceptActionUsage action) {
		super(action);
	}

	public AcceptActionUsage getElement() {
		return (AcceptActionUsage)super.getElement();
	}
	
	/**
	 * The default receiver is the outermost containing ActionUsage of this AcceptActionUsage
	 * (or this AcceptActionUsage if it is not contained in any other ActionUsage), unless that
	 * ActionUsage is itself owned by an ActionDefinition.
	 */
	// TODO: Determine the proper default receiver for an AcceptActionUsage contained in an 
	// ActionDefinition or performed by a PartDefinition or PartUsage.
	protected Feature getDefaultReceiver() {
		Feature receiver = getElement();
		Element owner = receiver.getOwner();
		while (owner instanceof ActionUsage) {
			receiver = (Feature)owner;
			owner = receiver.getOwner();
		}
		return owner instanceof ActionDefinition? getElement(): receiver;
	}
	
	public void addDefaultReceiverBinding() {
		AcceptActionUsageImpl action = (AcceptActionUsageImpl)getElement();
		if (action.getReceiverArgument() == null) {
			Feature receiverParameter = action.getReceiverParameter();
			if (receiverParameter != null) {
				TransformationUtil.addBindingConnectorTo(action, getDefaultReceiver(), receiverParameter);
			}
		}
	}
	
	@Override
	public void transform() {
		super.transform();
		addDefaultReceiverBinding();
	}
	
}
