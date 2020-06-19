package 'Requirement Definitions' {
	import ISQ::*;
	import SI::*;

	requirement def MassLimitationRequirement {
		/* The actual mass shall be less than or equal to the required mass. */
		
		attribute massActual: MassValue;
		attribute massReqd: MassValue;
		
		require constraint { massActual <= massReqd }
	}
	
	part def Vehicle {
		attribute dryMass: MassValue;
		attribute fuelMass: MassValue;
		attribute fuelFullMass: MassValue;
	}
	
	requirement def id '1' VehicleMassLimitationRequirement :> MassLimitationRequirement (vehicle : Vehicle) {
		/* The total mass of a vehicle shall be less than or equal to the required mass. */
		
		attribute redefines massActual = vehicle::dryMass + vehicle::fuelMass;
		
		assume constraint { vehicle::fuelMass > 0@[kg] }
	}
	
	port def ClutchPort;
	action def GenerateTorque;
	
	requirement def id '2' DrivePowerInterface (clutchPort: ClutchPort) {
		/* The engine shall transfer its generated torque to the transmission via the clutch interface. */
	}
		
	requirement def id '3' TorqueGeneration (generateTorque: GenerateTorque) {
		/* The engine shall generate torque as a function of RPM as shown in Table 1. */
	}
}