package '10b-Trade-off Among Alternative Configurations' {
	import ScalarValues::Real;
	import ISQ::*;
	import TradeStudies::*;
	import Definitions::*;
	import Usages::*;
	
	package Definitions {
		
		part def Vehicle;
		
		part def Engine {
			power : PowerValue;
			mass : MassValue;
			efficiency : Real;
			reliability : Real;
			cost : Real;
		}
		
		part def Piston;
		part def Cylinder;
		part def ConnectingRod;
		part def CrankShaft;
		
		part def '4CylCrankShaft' :> CrankShaft;
		part def '6CylCrankShaft' :> CrankShaft;
		
	}
	
	package Usages {
		
		part engine : Engine {
			part cyl[*] : Cylinder {
				part p[1] : Piston;
				part rod[1] : ConnectingRod;
			}
			
			part cs : CrankShaft;
		}
		
		variation part engineChoice :> engine {
			variant part '4cylEngine' {
				part :>> cyl[4];
				part :>> cs : '4CylCrankShaft';
			}
			
			variant part '6cylEngine' {
				part :>> cyl[6];
				part :>> cs : '6CylCrankShaft';
			}
		}
		
		part vehicle : Vehicle {
			part engine[1] :> engineChoice = '6cylEngine' {
				assert constraint engineSelectionRational { 
					doc /* Selected the best engine based on the 'engineTradeStudy'. */
					engine == Analysis::engineTradeStudy::selectedAlternative
				}
			}
			
		}
	}
	
	package Analysis {

		/** Evaluation function with criteria power, mass, efficency and cost. */
		calc def EngineEvaluation 
			(power : PowerValue, mass : MassValue, efficiency : Real, cost : Real ) 
			evaluation : Real {
				// Compute evaluation...
			}
			
		analysis engineTradeStudy : TradeStudy {
			subject :>> studyAlternatives : Engine[1..*] = all engineChoice;
			objective :>> tradeStudyObjective : MaximizeObjective;

			calc :>> objectiveFunction {
				in part :>> alternative : Engine;
				return :>> result : Real = EngineEvaluation(
					alternative::power, alternative::mass, alternative::efficiency, alternative::cost
				);
			}
			
			return part :>> selectedAlternative : Engine;
		}
        
	}
	
}