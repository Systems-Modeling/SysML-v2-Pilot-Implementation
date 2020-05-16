/**
 * This package defines the base types for states and related behavioral elements in the
 * SysML language.
 */
package States {
	private import Activities::Action;
	private import Activities::TransferAction;
	private import Activities::actions;
	private import StatePerformances::StatePerformance;
	private import StatePerformances::StateTransitionPerformance;
	
	/**
	 * A State is an Action that is also a StatePerformance.
	 */
	state def State :> Action, StatePerformance {
		entry action entryAction :> subactions :>> 'entry';
		do action doAction: Action :> subactions :>> 'do';
		exit action exitAction: Action :> subactions :>> 'exit';
		
		value :>> isTriggerDuring = true;
		value :>> isTriggerDuring = true;
		
		ref state self: State :>> Action::self;
		
		/**
		 * The subactions of this state that are states.
		 */
		state substates: State[0..*] :> states, subactions, middle;
	}
	
	/**
	 * A Transition is a StateTransitionPerformance whose transitionLinkSource is an Action.
	 */
	activity Transition :> Action, StateTransitionPerformance {
		ref action trigger: TransferAction :>> StateTransitionPerformance::trigger;
		ref action effect: Action :>> StateTransitionPerformance::effect;
		ref action transitionLinkSource: Action :>> StateTransitionPerformance::transitionLinkSource;
	}
	
	/**
	 * states is the base feature for all State usages.
	 */
	state states: State[0..*] nonunique :> actions;
	
	/**
	 * transitions is the base feature for all Transition usages.
	 */
	action transitions: Transition[0..*] nonunique :> actions;
}