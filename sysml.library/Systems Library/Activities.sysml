package Activities {	
	private import Base::*;
	
	activity Action :> Performance {
		action start: Action :>> startShot;
		action subactions: Action[0..*] :>> subperformances;
		action done: Action :>> endShot;
	}
	
	activity Merge :> Action {
		ref action predecessors: Action[1] :>> Performance::predecessors;
	}
	
	activity Decision :> Action {
		ref action successors: Action[1] :>> Performance::successors;
	}
	
	activity Join :> Action;
	
	activity Fork :> Action;
	
	action actions: Action[0..*] :> performances;
	
}