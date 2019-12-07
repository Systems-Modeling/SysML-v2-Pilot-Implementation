/**
 * This package defines the actions of control nodes in activities.
 */
package ControlNodes {
	private import Activities::*;
	private import Occurrences::*;
	private import ControlPerformances::*;
	private import TransitionPerformances::*;
	
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
	 * A MergeAction is the ControlAction for a merge node.
	 * 
	 * Note: Incoming sucession connectors to a MergeAction must have source multiplicity 
	 * 0..1 and subset the incomingHBLink feature inherited from MergePerformance.
	 */
	activity MergeAction :> ControlAction, MergePerformance;
	
	/** 
	 * A DecisionAction is the ControlAction for a decision node.
	 * 
	 * Note: Outgoing succession connectors to a MergeAction must have target multiplicity
	 * 0..1 and subset the outgoingHBLink feature inherited from DecisionPerformance.
	 * If an outgoing succession has a guard, it should have a transitionStep typed by 
	 * DecisionTransition.
	 */
	activity DecisionAction :> ControlAction, DecisionPerformance;
	
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
	 * A DecisionTransitionPerformance is a NonStateTransitionPerformance that has a
	 * single guard, but no trigger or effects.
	 */
	activity DecisionTransition :> NonStateTransitionPerformance {
		ref action trigger[0..0] redefines NonStateTransitionPerformance::trigger;
		ref action guard[1] redefines NonStateTransitionPerformance::guard;
		ref action effect[0..0] redefines NonStateTransitionPerformance::effect;
	}
}