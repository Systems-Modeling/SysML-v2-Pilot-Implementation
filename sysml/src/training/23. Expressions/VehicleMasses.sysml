package Vehicles {
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
	
	part c :> car {
		import SI::*;
		redefines mass = 1000@[kg];
		part redefines engine {
			redefines mass = 100@[kg];
		}
		
		part redefines transmission {
			redefines mass = 50@[kg];
		}	
	}
	
	// c::totalMass --> 1150.0@[kg]
}