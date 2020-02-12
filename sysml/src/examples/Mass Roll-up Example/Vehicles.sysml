package VehicleMasses {
	import ScalarValues::*;
	import MassRollup::*;
	
	block CarPart :> MassedThing {			
		value serialNumber: String;
	}
	
	part car: CarPart :> compositeThing {	
		value vin redefines serialNumber;
		
		part carParts: CarPart[*] redefines subcomponents;
		
		part engine :> simpleThing, carParts {
			//...
		}
		
		part transmission :> simpleThing, carParts {
			//...
		}
	}

	// Example usage
	import SI::*;	
	part c :> car {
		redefines car::mass = 1000@[kg];
		part redefines engine {
			redefines engine::mass = 100@[kg];
		}
		
		part redefines transmission {
			redefines transmission::mass = 50@[kg];
		}	
	}
	
	// c::totalMass --> 1150.0@[kg]
}