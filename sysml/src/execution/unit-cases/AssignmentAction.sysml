package execution_unitcase_assignment_actions {
	
	doc
	/*
	 * This case demonstrates that a model that a part with one attribute 
	 * and an action assigning to that attribute results in an updated
	 * value for that attribute.
	 */
	
	package UnitCaseModel {
		import ScalarValues::*;
		
		case def ExecutionContext {
			subject s : A [1];
			
			part def A {
				attribute x : Integer [1] := 0;
				
				action act [1] {
					action assignX assign x := 1;
					
					first start then assignX;
				}
				
				first startShot then act;
			}
		}
	}
	
	package UnitCaseTest {
		import Occurrences::*;
		import UnitCaseModel::*;
		import VerificationCases::*;
				 
		verification def Execution :> ExecutionContext {
			subject s : A [1]; 

			objective {
				verify requirement expectation {
					doc 
					/*
					 * The value of A.x shall change from 0 to 1 
					 * immediately after the assignment action.
					 */
				}
			}
			
			attribute initialX : Integer [0..1] = ();
			attribute finalX : Integer [0..1] = ();
			
			action captureInitialX {
				assign initialX := s.x;
			}
			action captureFinalX {
				assign finalX := s.x;
			}
			
			succession : HappensJustBefore first s.startShot then captureInitialX;
			succession : HappensJustBefore first s.act then captureFinalX;
						
			return verdict : VerdictKind = PassIf(
				initialX == 0 and finalX == 1
			);
		}
	}
}

