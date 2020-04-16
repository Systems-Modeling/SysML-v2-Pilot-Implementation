/**
 * This package defines the base types for activities and related behavioral elements in the
 * SysML language.
 */
package Activities {	
	private import Base::*;
	private import ControlNodes::*;
	
	/**
	 * Action is the most general class of performances of activities in a system or 
	 * part of a system. Action is the base class of all activities.
	 */
	activity Action :> Performance {
		ref action self: Action :>> Base::self;
		ref action incomingTransfers :>> Performance::incomingTransfers;
			
		/**
		 * The starting snapshot of an action. 
		 */
		action start: Action :>> startShot;
		
		/**
		 * The ending snapshot of an action.
		 */
		action done: Action :>> endShot;

		/**
		 * The subperformances of this action that are actions. 
		 */
		action subactions: Action[0..*] :> actions, subperformances;
	
		/**
		 * The subactions of this actvity that are control actions.
		 */
		abstract action controls : ControlAction[0..*] :> subactions;
		
		/**
		 * The control actions of this activity that are merge actions.
		 */
		abstract action merges : MergeAction[0..*] :> controls;
		
		/**
		 * The control actions of this activity that are decision actions.
		 */
		abstract action decisions : DecisionAction :> controls;
		
		/**
		 * The control actions of this activity that are join actions.
		 */
		abstract action joins: JoinAction :> controls;
		
		/**
		 * The control actions of this activity that are fork actions.
		 */
		abstract action forks: ForkAction :> controls;		
	}
	
	/**
	 * A TransferAction is an Action that is also a Transfer in a given context.
	 */
	abstract activity TransferAction (context: Occurrence) :> Transfers::Transfer, Action;
	
	/**
	 * actions is the base feature for all Action usages.
	 */
	action actions: Action[0..*] nonunique :> performances;
	
	/**
	 * transferActions is the base feature for all TransferAction usages.
	 * transferActions is a subset of the incomingTransfers of its context.
	 */
	abstract action transferActions: TransferAction[0..*] (context: Occurrence) :> 
		Transfers::transfers, actions, transferActions::context::incomingTransfers;
	
}