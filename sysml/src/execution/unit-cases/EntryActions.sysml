package execution_unitcase_entry_actions {
	import Execution::*;
	
	doc
	/*
	 * This test verifies that a model declaring _An Entry Action_ results in _Correct Assignment_.
	 * Model: Simple Behavior Execution
	 * Result: Instantiation of Behavior Steps
	 */
	
	package UnitCaseModel {
		import ScalarValues::*;
		
		case def ExecutionContext {
			subject s : ContextState [1];
			
			state def ContextState {
				attribute x : Integer [0..1] = ();
				state operating {
					entry action assignX assign x := 1.0;
				}
				
				first start then operating;
				transition tf
					first operating
					then done;
			}
		}
	}
	
	package UnitCaseTest {
		import UnitCaseModel::*;
		import Occurrences::*;
		import Time::*;
		import SequenceFunctions::*;
		import StatePerformances::*;
		import States::*;
		import SysML::*;
		import VerificationCases::*;
		
		verification def Execution :> ExecutionContext {
			subject s : ContextState [1];
			
			objective {
				verify requirement expectation {
					doc
					/*
					 * The Entry action shall occur immediately after the start of the state and 
					 * before any other actions or transitions.
					 */
				}
			}
			
			attribute expectedValueX : Real [1] = 1.0;
			attribute actualInitialValueX : Real [0..1] = ();
			attribute actualFinalValueX : Real [0..1] = ();
				
			action captureInitial assign actualInitialValueX := s.x;
			action captureAfterEntry assign actualFinalValueX := s.x;

			succession afterInitialization : HappensJustBefore 
				first s.startShot
				then captureInitial;

			succession afterOperatingEntry : HappensJustBefore 
				first s.operating
				then captureAfterEntry;
				
			succession first s.endShot then endShot;
			
			return verdict : VerdictKind = PassIf(
				actualInitialValueX->isEmpty() and 
				actualFinalValueX == expectedValueX
			);
		}
	}
}