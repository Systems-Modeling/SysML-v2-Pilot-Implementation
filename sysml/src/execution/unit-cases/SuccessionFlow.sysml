package execution_unitcase_abc_xyz {
	
	doc
	/*
	 * This case demonstrates that a model that:
	 * _____
	 * results in:
	 * _____.
	 * Model Description: Simple Declaration of Structure
	 * Expectation: Instantiation of Correct Values
	 */
	
	package SimpleSuccession {
		private import ScalarValues::*;
		
		doc
		/* This example is illustration of the basic succession ordering.
		 */
		
		case def ExecutionContext {
			subject s [1] : 'Simple Step';
		}
		
		action def 'Simple Step' {
			action 'Step 1';
			action 'Step 2';
			
			first start then 'Step 1';
			first 'Step 1' then 'Step 2';
			first 'Step 2' then done;
		}
	}
	
	package UnitCaseTest {
		private import Occurrences::*;
		private import SimpleSuccession::*;
		private import VerificationCases::*;
		
		doc
		/*
		 * A verification case that executes the "ExecutionContext" from the "UserModel"
		 * and performs a test whether the result meets expectations for the specified 
		 * execution rule outlined in the language specification.
		 */
		 
		verification def ExecutionVerification :> ExecutionContext {
			subject s : Occurrence [1]; // Replace "Occurrence" with the type of the subject
		
			objective {
				verify requirement expectation {
					doc 
					/*
					 * We expect no overlap in time between Step 1 and Step 2 and for the 
					 * frame containing Step 1 to occur before Step 2.
					 */
				}
			}
						
			action testExpectation {
				out verdict : VerdictKind;
			}
			first s.endShot then testExpectation;
			
			return verdict : VerdictKind = testExpectation.verdict;
		}
	}
	
	package ExecutedTraces {
		
		private import Execution::*;
		private import Occurrences::*;
		private import SimpleSuccession::*;
		private import UnitCaseTest::*;

		doc
		/*
		 * A model that represents the M0 instantiation of the User's M1 model
		 * by using specially annotated model denoting each instance and all of its
		 * structural feature values and behavioral steps explicitly stated.	
		 * 
		 * Note - When instantiating usages, use a consistent naming scheme
		 *        that appends a monotonically increasing sequence number 
		 *        to the end of the existing name from the unit case model.		
		 */
		
		case def Trace :> ExecutionContext {
			
			occurrence TraceBehaviorSlice : BehaviorSlice {
				:>> that : Trace;
			}
			
			// Timeslices below are a simple procession from each of the subactions of the 
			// verification subject action.
			
			timeslice 'Trace Frame 0' :> TraceBehaviorSlice {
				:>> activeSteps = s.start;
				:>> inactiveSteps = (s.'Step 1', s.'Step 2', s.done);
			}
			then timeslice 'Trace Frame 1' :> TraceBehaviorSlice {
				:>> activeSteps = s.'Step 1';
				:>> inactiveSteps = (s.start, s.'Step 2', s.done);
			}
			then timeslice 'Trace Frame 2' :> TraceBehaviorSlice {
				:>> activeSteps = s.'Step 2';
				:>> inactiveSteps = (s.start, s.'Step 1', s.done);
			}
			then timeslice 'Trace Frame 3' :> TraceBehaviorSlice {
				:>> activeSteps = s.done;
				:>> inactiveSteps = (s.start, s.'Step 1', s.'Step 2');
			}
		}
		
	}
}

