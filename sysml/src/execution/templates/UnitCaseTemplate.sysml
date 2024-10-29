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
	
	package UnitCaseModel {
		import ScalarValues::*;
		
		doc
		/* The M1 user model as a system architect would create when using the language.
		 * This includes the *smallest* possible model to demonstrate the intended 
		 * 'unit' of the language specification.
		 * Examples shall be abstract and general to illustrate the syntax and semantics 
		 * without any indication of methodology or domain-specific engineering concepts.
		 * 
		 * Note - Unnamed features unfortunately limit further redefinition
		 *        and subsetting for verification cases and traces.
		 *        Ensure that all features here have declared names.
		 */
		
		case def ExecutionContext {
			subject s [1];
		}
	}
	
	package UnitCaseTest {
		import Occurrences::*;
		import UnitCaseModel::*;
		import VerificationCases::*;
		
		doc
		/*
		 * A verification case that executes the "ExecutioContext" from the "UserModel"
		 * and performs a test whether the result meets expectations for the specified 
		 * execution rule outlined in the language specification.
		 */
		 
		verification def ExecutionVerification :> ExecutionContext {
			subject s : Occurrence [1]; // Replace "Occurrence" with the type of the subject
		
			objective {
				verify requirement expectation {
					doc 
					/*
					 * Explanation of the expectations during and after execution.
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
	
	package ExpandedModel {
		import UnitCaseModel::*;

		doc
		/*
		 * An equivalent M1 model that expands on the "UserModel" by further declaring
		 * all implicit syntax elements explicitly and completely.
		 * This serves to show the "long hand" for any "short hand" notation used
		 * in the "UserModel".	
		 * 
		 * Provide redefinitions, subsets, or other expansions of expressions 
		 * for all declared elements and an "ExpandedContext" that makes use of them.
		 */

		case def ExpandedContext :> ExecutionContext {
			subject expandedSubject [1];
			// Use the other expanded elements here
		}
	}
	
	package ExecutedTraces {
		
		import Execution::*;
		import UnitCaseModel::*;
		import UnitCaseTest::*;

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
			subject s : Occurrence [1] {
				// Redefine and fully specify any usages.
				// Document any assumptions that were made that 
				// are not explicitly declared in the User Model.
				
				attribute x;
				attribute y;
				
				action a;
				action b;
			}
			
			occurrence TraceValueSlice : ValueSlice {
				:>> that : Trace;
			}
			occurrence TraceBehaviorSlice : BehaviorSlice {
				:>> that : Trace;
			}
			
			// For each feature, create a set of 'TraceValueSlices' that denote 
			// the piecewise time intervals of differing feature values.
			// Note that the timeslices for different features do not need to coincide and can overlap.
			
			timeslice x0 :> TraceValueSlice {
				:>> s.x = 0;
				:>> valueStart = s.startShot;
				:>> valueEnd = that.'Trace Frame 0'.endShot;
			}
			then timeslice x1 :> TraceValueSlice {
				:>> s.x = 1;
				:>> valueStart = that.'Trace Frame 0'.endShot;
				:>> valueEnd = that.'Trace Frame 1'.endShot;
			}
			
			timeslice y0 :> TraceValueSlice {
				:>> s.y = 0;
				:>> valueStart = s.startShot;
				:>> valueEnd = that.'Trace Frame 0'.endShot;
			}
			then timeslice y1 :> TraceValueSlice {
				:>> s.y = 1;
				:>> valueStart = that.'Trace Frame 0'.endShot;
				:>> valueEnd = that.'Trace Frame 1'.endShot;
			}
			
			// For each behavior, create a set of 'TraceBehaviorSlices' that denote 
			// which are performed over what intervals.
			
			timeslice 'Trace Frame 0' :> TraceBehaviorSlice {
				:>> activeSteps = s.startShot;
				:>> inactiveSteps = (s.a, s.b);
			}
			then timeslice 'Trace Frame 1' :> TraceBehaviorSlice {
				:>> activeSteps = s.a;
				:>> inactiveSteps = (s.b);
			}
		}
		
		// Multiple traces can exist to demonstrate alternative valid traces.
		
	}
}

