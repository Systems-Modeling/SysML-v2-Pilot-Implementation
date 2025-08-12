library package Execution {
	
	private import Metaobjects::*;
	private import Occurrences::*;
	private import SysML::Systems::*;	
	private import VerificationCases::*;
	
	doc
	/* This package defines a keyword (instance) for occurrences with
	 * exactly one instance and are disjoint from any others
	 * marked with this keyword.
	 */
	
	abstract occurrence Instance;
	//occurrence instances : Instance [0..*]; // unique!
 	metadata def <instance> InstanceMetadata specializes Metaobject {
		baseType = Instance meta Occurrence;
	}		
	
	calc def matches{
		doc 
		/*
		 * A calculation that compares two actions to determine whether the represent identical executions.
		 */
		in occurrence referenceAction [1];
		in occurrence executedAction [1];
		
		return verdict : VerdictKind [0..1];
	}
	
	occurrence def ValueSlice {
		:>> startShot = valueStart;
		ref snapshot valueStart;
		ref snapshot valueEnd;
		
		connection : HappensJustBefore connect valueEnd to endShot;
	}
	
	occurrence def BehaviorSlice {
		ref action activeSteps [1..*]; // note for states and parallel actions there may be more than one.
		ref action inactiveSteps [0..*];
		connection 'frame during' : HappensWhile connect self to activeSteps;
		connection 'not during' : Without connect self to inactiveSteps;
	}
}