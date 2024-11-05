package execution_unitcase_entry_actions {
	private import Execution::*;
	
	doc
	/*
	 * This test verifies that a model declaring _An Entry Action_ results in _Correct Assignment_.
	 * Model: Simple Behavior Execution
	 * Result: Instantiation of Behavior Steps
	 */
	
	package UnitCaseModel {
		private import ScalarValues::*;
		
		case def ExecutionContext {
			subject s : Context [1];
			
			state def Context {
				attribute x : Integer [0..1] = ();
				state operating {
					entry action doSomething {
						assign x := 1.0;
					}
				}
				
				first start then operating;
				transition tf
					first operating
					then done;
			}
		}
	}
	
	package ExpandedModel {
		private import UnitCaseModel::*;
		private import Occurrences::*;
		private import Time::*;
		private import SysML::*;
		private import StatePerformances::*;
		private import States::*;
		
		case def ExpandedContext :> ExecutionContext {
			subject s : Context [1];
			
			// Nothing to expand
		}
	}
	
	package UnitCaseTest {
		private import UnitCaseModel::*;
		private import Occurrences::*;
		private import Time::*;
		private import ScalarValues::*;
		private import SequenceFunctions::*;
		private import StatePerformances::*;
		private import States::*;
		private import SysML::*;
		private import VerificationCases::*;
		
		verification def Execution :> ExecutionContext {
			subject s : Context [1];
			
			objective {
				verify requirement expectation {
					doc
					/*
					 * Entry actions occur immediately after the start of the state and 
					 * before any other actions or transitions.
					 */
				}
			}
			
			attribute expectedValueX : Real [1] = 1.0;
			attribute actualInitialValueX : Real [0..1] = ();
			attribute actualFinalValueX : Real [0..1] = ();
				
			action captureInitial assign actualInitialValueX := s.x;
			action captureAfterEntry assign actualFinalValueX := s.x;

			ref state sMainOperatingEntry = s.operating.doSomething;
			
			succession afterInitialization : HappensJustBefore 
				first s.startShot
				then captureInitial;

			succession afterOperatingEntry : HappensJustBefore 
				first sMainOperatingEntry
				then captureAfterEntry;
				
			succession first s.endShot then endShot;
			
			return verdict : VerdictKind = PassIf(
				actualInitialValueX->isEmpty() and 
				actualFinalValueX == expectedValueX
			);
		}
	}
	
	package ExecutedTraces {
		
		private import UnitCaseModel::*;
		
		// #instance ?
		case def Trace :> ExecutionContext {
			// #instance ?			
			subject s : Context [1];
			
			// #instance ?			
			state operatingInstance :> s.operating [1];
			
			// ... etc?
		}
		
	}
}