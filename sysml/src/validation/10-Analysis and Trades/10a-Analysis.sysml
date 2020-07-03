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
	
		analysis case def MassAnalysisCase(vehicle : Vehicle) {
			
			obj objective : MassAnalysisObjective(
				mass = result
			);
			
			// Result
			vehicle::mass
		}
		
		analysis case def AnalysisPlan(vehicle : Vehicle) {
			
			obj {
				/* ... */
			}
			
			/**
			 * By default, the subject of a nested analysis case bound to that
			 * of its containing analysis case or analysis case definition.
			 */
			analysis case massAnalysisCase : MassAnalysisCase () return mass;
		}
		
		part massAnalysisContext {
			analysis case analysisPlan : AnalysisPlan (
				vehicle = VehicleDesignModel::vehicle
			);
		}
	}
}