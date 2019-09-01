/**
 * This package defines the base types for activities and related behavioral elements in the
 * SysML language.
 */
package Activities {	
	private import Base::*;
	
	/**
	 * Action is the most general class of performances of activities in a system or 
	 * part of a system. Action is the base class of all activities.
	 */
	activity Action :> Performance {
		/**
		 * The starting snapshot of an action. 
		 */
		action start: Action :>> startShot;
		
		/**
		 * The subperformances of this action that are actions. 
		 */
		action subactions: Action[0..*] :> subperformances;
		
		/**
		 * The ending snapshot of an action.
		 */
		action done: Action :>> endShot;
	}
	
	/**
	 * A TransferAction is an Action that is also a Transfer in a given context.
	 */
	abstract activity TransferAction (context: Occurrence) :> Transfers::Transfer, Action;
	
	/**
	 * An AcceptAction is a TransferAction that is an incomingTransfer of its context.
	 * It effectively accepts transfered items from some source.
	 */
	activity AcceptAction (context: Occurrence) :> TransferAction;
	
	/**
	 * A SendAction is a TransferAction that is initiated in one context and becomes
	 * an incomingTransfer of its target. It effectively sends transferred items to
	 * the target.
	 * 
	 * Note that the same Transfer that is a SendAction in the source context will also
	 * act as an AcceptAction in the target context.
	 */
	activity SendAction (target: Occurrence) :> TransferAction;
	
	/**
	 * actions is the base feature for all Action usages.
	 */
	action actions: Action[0..*] nonunique :> performances;
	
	/**
	 * transferActions is the base feature for all TransferAction usages.
	 * transferActions is a subset of the incomingTransfers of its context.
	 */
	abstract action transferActions: TransferAction[0..*] nonunique (context: Occurrence) :> 
		Transfers::transfers, actions, transferActions::context::incomingTransfers;
	
}