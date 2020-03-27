package '8-Requirements' {
	import ISQ::*;
	import SI::*;
	import Requirements::*;
	
	// Definitions
	
	block Vehicle {
		value mass: MassValue;
	}
	
	port def DrivePwrPort;
	port def ClutchPort;
	
	interface def EngineToTransmissionInterface {
		end drivePwrPort: DrivePwrPort;
		end clutchPort: ClutchPort;
	}
	
	activity 'Generate Torque';
	
	// Usages
		
	part vehicle1_c1: Vehicle {
		redefines mass = 2000@[kg];
			
		part engine_v1 {
			port drivePwrPort: DrivePwrPort;
			perform action 'generate torque': 'Generate Torque';
		}
		
		part transmission {
			port clutchPort: ClutchPort;
		}
		
		interface engineToTransmission: EngineToTransmissionInterface
			connect engine_v1::drivePwrPort to transmission::clutchPort;
	}
	
	part vehicle1_c2: Vehicle {
		redefines mass = 2500@[kg];
	}
	
	// Requirements
	
	requirement def id '1' MassLimitationRequirement {
		value massActual: MassValue;
		value massReqd: MassValue;
		require constraint { massActual <= massReqd }
	}
	
	package 'vehicle1-c1 Specification' {
		requirement id '1.1' vehicleMass1: MassLimitationRequirement (vehicle: Vehicle) {
			/* The vehicle mass shall be less than or equal to 2000 kg. */
			
			redefines massActual: MassValue = vehicle::mass;
			redefines massReqd = 2500@[kg];
			
			assume constraint fuelConstraint {
				/* full fuel tank */
			}
		}		
	}
	
	package 'engine-v1 Specification' {
		requirement id '3.2' torqueGeneration: FunctionalRequirementCheck(subject: 'Generate Torque') {
			/* The engine shall generate torque as a function of RPM as shown in Table 1. */
		}
		
		requirement id '3.1' drivePowerInterface: InterfaceRequirementCheck(subject: EngineToTransmissionInterface) {
			/* The engine shall transfer its generated torque to the transmission via the clutch interface. */
		}
	}
	
	package 'vehicle1-c2 Specification' {
		requirement id '2.1' vehicleMass2: MassLimitationRequirement (vehicle: Vehicle) {
			/* The vehicle mass shall be less than or equal to 2500 kg. */
			
			redefines massActual: MassValue = vehicle::mass;
			redefines massReqd = 2500@[kg];
		
			assume constraint fuelConstraint {
				/* empty fuel tank */
			}
		}		
	}
	
	// Satisfactions
	
	part 'vehicle1_c1 Specification Context' {
		import 'vehicle1-c1 Specification'::*;
		import 'engine-v1 Specification'::*;
		
		satisfy vehicleMass1 by vehicle1_c1;
		satisfy torqueGeneration by vehicle1_c1::engine_v1::'generate torque';
		satisfy drivePowerInterface by vehicle1_c1::engineToTransmission;
	}
	
	part 'vehicle1_c2 Specification Context' {
		import 'vehicle1-c2 Specification'::*;
		
		satisfy vehicleMass2 by vehicle1_c2;				
	}
}