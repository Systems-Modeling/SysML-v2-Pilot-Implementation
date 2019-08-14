package Activities {	
	private import Base::*;
	
	abstract activity Execution() :> Performance {
		action start: Execution redefines startShot;
		action subexecutions: Execution[0..*] subsets subperformances;
		action done: Execution redefines endShot;
	}
	
	activity Merge() :> Execution {
		action predecessors: Execution[1] redefines Performance::predecessors; // Shouldn't be composite.
	}
	
	activity Decision() :> Execution {
		action successors: Execution[1] redefines Performance::successors; // Shouldn't be composite.
	}
	
	activity Join() :> Execution;
	
	activity Fork() :> Execution;
	
	action executions: Execution[0..*] subsets performances;
	
}