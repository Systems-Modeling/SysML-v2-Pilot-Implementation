package States {
	private import Activities::*;
	private import StatePerformances::*;
	
	/**
	 * A State is an Action that is also a StatePerformance.
	 */
	state def State :> Action, StatePerformance {
		value isTriggerDuring redefines StatePerformance::isTriggerDuring = true;
		value isAcceptFirst redefines StatePerformance::isTriggerDuring = true;
		
		ref state self: State :>> Action::self;
		
		/**
		 * The subactions of this state that are states.
		 */
		state substates: State[0..*] :> states, subactions;
	}
	
	/**
	 * A Transition is a StateTransitionPerformance whose transitionLinkSource is an Action.
	 */
	activity Transition :> StateTransitionPerformance {
		ref action transitionLinkSource: Action :>> StateTransitionPerformance::transitionLinkSource;
	}
	
	/**
	 * states is the base feature for all State usages.
	 */
	state states: State[0..*] nonunique :> actions;
}