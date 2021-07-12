/**
 * This package defines the base types for states and related behavioral elements in the
 * SysML language.
 */
package States {
	private import Occurrences::Occurrence;
	private import StatePerformances::StatePerformance;
	private import StatePerformances::StateTransitionPerformance;
	private import Actions::Action;
	private import Actions::TransitionAction;
	private import Actions::transitionActions;
	private import Actions::AcceptAction;
	private import Actions::actions;
	
	/**
	 * A StateAction is a kind of Action that is also a StatePerformance. It is the base type for all
	 * StateDefinitions.
	 */
	abstract state def StateAction :> Action, StatePerformance {
		entry action entryAction :>> 'entry';
		do action doAction: Action :>> 'do' :> subactions;
		exit action exitAction: Action :>> 'exit';
		
		attribute :>> isTriggerDuring = true;
		attribute :>> isAcceptFirst = true;
		
		ref state self: StateAction :>> Action::self, StatePerformance::self;
		
		/**
		 * The subperformances of this StateAction that are Actions, other than the entry and exit Actions. 
		 * These subactions all take place in the "middle" of the StatePerformance, that is, after the 
		 * entry Action and before the exit Action. 
		 */
		action :>> subactions :> middle;
		
		/**
		 * The subactions of this state that are states.
		 */
		abstract state substates: StateAction[0..*] :> stateActions, subactions;
		
		/**
		 * The transitions of this state that are state transitions.
		 */
		abstract action stateTransitions: StateTransitionAction[0..*] :> transitions;
	}
	
	/**
	 * A StateTransitionAction is a TransitionAction and a StateTransitionPerformance whose transitionLinkSource 
	 * is a State. It is the base type of TransitionUsages used transitions in state models.
	 */
	action def StateTransitionAction :> TransitionAction, StateTransitionPerformance {
		in transitionLinkSource[1]: StateAction :>> 
			TransitionAction::transitionLinkSource, StateTransitionPerformance::transitionLinkSource;
			
		out triggerPayload[0..*];
		in receiver : Occurrence[1];
		
		bind triggerPayload = accepter.items;
		bind receiver = accepter.receiver;
	}
	
	/**
	 * stateActions is the base feature for all StateUsages.
	 */
	abstract state stateActions: StateAction[0..*] nonunique :> actions;
	
}