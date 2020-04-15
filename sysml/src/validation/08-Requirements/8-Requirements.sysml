package '8-Requirements' {
	import ISQ::*;
	import SI::*;
	import 'Vehicle Usages'::*;
	import 'Vehicle Requirements'::*;
	
	package 'Vehicle Definitions' {
		block Vehicle {
			value mass: MassValue;
			value fuelLevel: Real;
			value fuelTankCapacity: Real;
		}
		
		block Engine {
			port drivePwrPort: DrivePwrPort;
			perform action 'generate torque': 'Generate Torque';
		}
		
		block Transmission {
			port clutchPort: ClutchPort;
		}
		
		port def DrivePwrPort;
		port def ClutchPort;
		
		interface def EngineToTransmissionInterface {
			end drivePwrPort: DrivePwrPort;
			end clutchPort: ClutchPort;
		}
	
		activity 'Generate Torque';
	}
	
	package 'Vehicle Usages' {
		import 'Vehicle Definitions'::*;
		
		action 'provide power' {
			action 'generate torque' { /* ... */ }
			//...
		}
		
		part vehicle1_c1: Vehicle {
			value :>> mass = 2000@[kg];
			perform 'provide power';
				
			part engine_v1: Engine {
				port :>> drivePwrPort;
				perform 'provide power'::'generate torque' :>> 'generate torque';
			}
			
			part transmission: Transmission {
				port :>> clutchPort;
			}
			
			interface engineToTransmission: EngineToTransmissionInterface
				connect engine_v1::drivePwrPort to transmission::clutchPort;
		}
		
		part vehicle1_c2: Vehicle {
			value :>> mass = 2500@[kg];
		}
	}
	
	package 'Vehicle Requirements' {	
		import 'Vehicle Definitions'::*;
	
		// The optional requirement ID  of this requirement ('1') is given after the keyword "id" (using name syntax).
		// (Note: Full aliasing for the ID has not been implemented yet.)
		// Every requirement is parameterized by a "subject". The "subject" of this requirement is implicitly "Anything".
		requirement def id '1' MassLimitationRequirement {
			// The requirement text is given by the first comment in the requirement def body (this note doesn't count).
			/* The actual mass shall be less than or equal to the required mass. */
			
			value massActual: MassValue;
			value massReqd: MassValue;
			require constraint { massActual <= massReqd }
		}
		
		requirement def id '2' ReliabilityRequirement;
		
		// The subject of this requirement is redefined to be a "Vehicle".
		requirement id '1.1' vehicleMass1: MassLimitationRequirement (vehicle: Vehicle) {
			/* The vehicle mass shall be less than or equal to 2000 kg when the fuel tank is full. */
			
			// This redefinitions binds the vehicle mass to the actual mass.
			value :>> massActual: MassValue = vehicle::mass;
			
			// This redefinition sets the required mass to 2000 kg.
			value :>> massReqd = 2000@[kg];
			
			assume constraint fuelConstraint {
				/* full fuel tank */
				vehicle::fuelLevel >= vehicle::fuelTankCapacity
			}
		}
			
		requirement id '2.1' vehicleMass2: MassLimitationRequirement (vehicle: Vehicle) {
			/* The vehicle mass shall be less than or equal to 2500 kg when the fuel tank is empty. */
			
			value :>> massActual: MassValue = vehicle::mass;
			value :>> massReqd = 2500@[kg];
		
			assume constraint fuelConstraint {
				/* empty fuel tank */
				vehicle::fuelLevel == 0.0
			}
		}
		
		requirement id '2.2' vehicleReliability2: ReliabilityRequirement(vehicle: Vehicle);
			
		requirement id '3.1' drivePowerInterface (drivePwrPort: DrivePwrPort) {
			/* The engine shall transfer its generated torque to the transmission via the clutch interface. */
		}
		
		requirement id '3.2' torqueGeneration (generateTorque: 'Generate Torque') {
			/* The engine shall generate torque as a function of RPM as shown in Table 1. */
		}
			
	}
	
	part 'vehicle1_c1 Specification Context' {
		import 'vehicle1-c1 Specification'::*;
		import 'engine-v1 Specification'::*;
		
		// This models a "requirement group".
		requirement 'vehicle1-c1 Specification'(vehicle: Vehicle) {
			// This is a reference to a requirement defined outside the group.
			// By default, the subject of the requirement is bound to that of the group.
			require vehicleMass1;
			// ...
		}
		
		requirement 'engine-v1 Specification'(engine: Engine) {
			// Here the subjects of the referenced requirements are defined to be specific properties of the
			// subject of the group.
			require torqueGeneration(generateTorque = engine::'generate torque');
			require drivePowerInterface(drivePwrPort = engine::drivePwrPort);
		}
		
		satisfy 'vehicle1-c1 Specification' by vehicle1_c1;
		satisfy 'engine-v1 Specification' by vehicle1_c1::engine_v1;
	}
	
	part 'vehicle1_c2 Specification Context' {
		import 'vehicle1-c2 Specification'::*;
		
		requirement 'vehicle1-c2 Specification'(vehicle: Vehicle) {
			require vehicleMass2;
			require vehicleReliability2;
		}
		
		satisfy 'vehicle1-c2 Specification' by vehicle1_c2;
	}
}