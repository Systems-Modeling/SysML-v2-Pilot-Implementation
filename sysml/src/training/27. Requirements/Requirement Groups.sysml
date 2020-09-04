package 'Requirement Groups' {
	import 'Requirement Definitions'::*;
	import 'Requirement Usages'::*;
	
	part def Engine {
		port clutchPort: ClutchPort;
		perform action generateTorque: GenerateTorque;
	}
	
	requirement vehicleSpecification(vehicle : Vehicle) {
		doc /* Overall vehicle requirements group */
		
		require fullVehicleMassLimit;
		require emptyVehicleMassLimit;
	}
	
	requirement engineSpecification(engine : Engine) {
		doc /* Engine power requirements group */
		
		requirement drivePowerInterface : DrivePowerInterface 
			(clutchPort = engine::clutchPort);
		
		requirement torqueGeneration : TorqueGeneration 
			(generateTorque = engine::generateTorque);
	}
	
}