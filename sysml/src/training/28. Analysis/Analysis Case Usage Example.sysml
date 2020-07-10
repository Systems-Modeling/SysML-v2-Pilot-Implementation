package 'Analysis Case Usage Example' {
	import 'Analysis Case Definition Example'::*;
	
	part vehicleFuelEconomyAnalysisContext {
		requirement vehicleFuelEconomyRequirements (vehicle : Vehicle) {
			// ...
		}
		
		attribute cityScenario :> FuelEconomyAnalysis::scenario = { //* ... */ };
		attribute highwayScenario :> FuelEconomyAnalysis::scenario = { //* ... */ };
		
		analysis cityFuelEconomyAnalysis : FuelEconomyAnalysis {
			part :>> vehicle = vehicle;
			attribute :>> scenario = cityScenario;
		} cityFuelEconomy;
		
		analysis highwayFuelEconomyAnalysis : FuelEconomyAnalysis {
			part :>> vehicle = vehicle;
			attribute :>> scenario = highwayScenario;
		} highwayFuelEconomy;
		
		part vehicle : Vehicle {
			// ...
			
			attribute :>> fuelEconomy_city = cityFuelEconomy;
			attribute :>> fuelEconomy_highway = highwayFuelEconomy;
		}
		
		satisfy vehicleFuelEconomyRequirements by vehicle;
	}

}