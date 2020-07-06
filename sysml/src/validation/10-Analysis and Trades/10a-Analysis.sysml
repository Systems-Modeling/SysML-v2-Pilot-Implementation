package '10a-Analysis' {
	import ISQ::*;
	import SI::*;
	import ScalarFunctions::*;
	
	package VehicleDesignModel {
		part def Vehicle {
			mass : MassValue;
		}
		
		part vehicle {
			:>> mass : MassValue = sum({
				vehicle::engine::mass, 
				vehicle::transmission::mass, 
				vehicle::frontAxleAssembly::mass, 
				vehicle::rearAxleAssembly::mass
			});
			
			part engine {
				mass : MassValue;
			}
			
			part transmission {
			    mass : MassValue;
			}
			
			part frontAxleAssembly {
				mass : MassValue;
			}
			
			part rearAxleAssembly {
				mass : MassValue;
			}
		}
	}
	
	package VehicleAnalysisModel {
		import VehicleDesignModel::Vehicle;
		
		requirement def MassAnalysisObjective(mass : MassValue) {
			/* ... */
		}
	
		analysis def MassAnalysisCase(vehicle : Vehicle) {
			
			objective : MassAnalysisObjective(
				mass = result
			);
			
			// Result
			vehicle::mass
		}
		
		analysis def AnalysisPlan(vehicle : Vehicle) {
			
			objective {
				/* ... */
			}
			
			/**
			 * By default, the subject of a nested analysis case bound to that
			 * of its containing analysis case or analysis case definition.
			 */
			analysis massAnalysisCase : MassAnalysisCase () return mass;
		}
		
		part massAnalysisContext {
			analysis analysisPlan : AnalysisPlan (
				vehicle = VehicleDesignModel::vehicle
			);
		}
	}
}