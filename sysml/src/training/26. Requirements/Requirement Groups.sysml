package 'Requirement Groups' {
	import 'Requirement Definitions'::*;
	import 'Requirement Usages'::*;
	
	block Engine {
		port clutchPort: ClutchPort;
		perform action generateTorque: GenerateTorque;
	}
	
	requirement vehicleSpecification(vehicle : Vehicle) {
		/* Overall vehicle requirements group */
		
		require fullVehicleMassLimit;
		require emptyVehicleMassLimit;
	}
	
	requirement engineSpecification(engine : Engine) {
		/* Engine power requirements group */
		
		requirement drivePowerInterface : DrivePowerInterface 
			(clutchPort = engine::clutchPort);
		
		requirement torqueGeneration : TorqueGeneration 
			(generateTorque = engine::generateTorque);
	}
	
}