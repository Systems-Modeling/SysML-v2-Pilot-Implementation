package 'Requirement Usages' {
	import SI::*;
	import 'Requirement Definitions'::*;
	
	requirement id '1.1' fullVehicleMassLimit : VehicleMassLimitationRequirement {
		value :>> massReqd = 2000@[kg];
		
		assume constraint {
			/* Full tank is full. */
			vehicle::fuelMass == vehicle::fuelFullMass
		}
	}
	
	requirement id '1.2' emptyVehicleMassLimit : VehicleMassLimitationRequirement {
		value :>> massReqd = 1500@[kg];
		
		assume constraint {
			/* Full tank is empty. */
			vehicle::fuelMass == 0@[kg]
		}
	}
	
}