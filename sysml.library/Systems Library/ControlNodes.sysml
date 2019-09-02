/**
 * This package defines the actions of control nodes in activities.
 */
package ControlNodes {
	private import Activities::*;
	private import Occurrences::*;
	
	/**
	 * A ControlAction is the Action of a control node, which has no inherent behavior.
	 */
	abstract activity ControlAction :> Action {
		/**
		 * A ControlAction is instantaneous.
		 */
		bind start = done;
	}
	
	/**
	 * A MergeAction is the ControlAction for a merge node. It is constrained to have
	 * exactly one predecessor.
	 * 
	 * Note: If a MergeAction has multiple incoming sucession connectors with
	 * source multiplicity of 0..1, then the requirement of having exactly one
	 * predecessor has the effect of an "exclusive or" across these successions.
	 */
	activity MergeAction :> ControlAction {
		/**
		 * A MergeAction must have exactly one predecessor.
		 */
		ref action predecessor: Action[1] :>> Performance::predecessors;
	}
	
	/** 
	 * A DecisionAction is the ControlAction for a decision node. It is contrained to
	 * have exactly one successor, which must be from a conditional succession with
	 * a true guard.
	 * 
	 * Note: If a DecisionAction has multiple outgoing conditional succession
	 * connectors with target multiplicity of 0..1, then the requirement of
	 * having exactly one sucessor effectively requires a (non-deterministic)
	 * selection among those successor links with true guards.
	 */
	activity DecisionAction :> ControlAction {
		/**
		 * A DecisionAction must have exactly one successor.
		 */
		ref action successor: Action[1] :>> Performance::successors;
		
		/**
		 * The succession link for the sucessor of a DecisionAction must be an
		 * instance of ConditionalHappensBefore with a true guard.
		 */
		ref successionLink[1] = ConditionalHappensBefore.allInstances()->
			select l: ConditionalHappensBefore (
				l.earlierOccurrence == Base::self && l::guard::result == true
			);
	}
	
	/**
	 * A JoinAction is the ControlAction for a JoinNode.
	 * 
	 * Note: Join behavior results from requiring that the source multiplicity of all
	 * incoming succession connectors be 1..1.
	 */
	activity JoinAction :> ControlAction;
	
	/**
	 * A ForkAction is the ControlAction for a ForkNode.
	 * 
	 * Note: Fork behavior results from requiring that the target multiplicity of all
	 * outgoing succession connectors be 1..1.
	 */
	activity ForkAction :> ControlAction;
	
	/**
	 * ConditionalHappensBefore asserts a HappensBefore relationship that is conditional
	 * on a given guard action have a true result. 
	 */
	abstract assoc block ConditionalHappensBefore :> HappensBefore {
		abstract ref action guard(out result : ScalarValues::Boolean);
	}
	
	/**
	 * conditionalSuccessions is a specialization of successions with type restricted
	 * to ConditionalHappensBefore.
	 */
	abstract part conditionalSuccessions : ConditionalHappensBefore[0..*] :> successions;
}