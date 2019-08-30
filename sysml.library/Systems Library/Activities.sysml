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
		 * Subperformances of this action that are actions. 
		 */
		action subactions: Action[0..*] :> subperformances;
		
		/**
		 * The ending snapshot of an action.
		 */
		action done: Action :>> endShot;
	}
	
	// Control Nodes
	 
	activity Merge :> Action {
		ref action predecessors: Action[1] :>> Performance::predecessors;
	}
	
	activity Decision :> Action {
		ref action successors: Action[1] :>> Performance::successors;
	}
	
	activity Join :> Action;
	
	activity Fork :> Action;
	
	//
	
	/**
	 * actions is the base feature for all Action usages.
	 */
	action actions: Action[0..*] :> performances;
	
}