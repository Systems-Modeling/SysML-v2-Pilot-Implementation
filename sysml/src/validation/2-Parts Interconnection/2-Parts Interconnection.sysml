package '2-Parts Interconnection - SysML' {
	import '1a-Parts Tree - SysML'::*;
	
	/* DEFINITIONS */

	// Blocks
	
	block VehicleA:> Vehicle { 
		port fuelCmdPort: FuelCmdPort;
		port vehicleToRoadPort: VehicleToRoadPort;
	}
	
	block RearAxleAssembly:> AxleAssembly { 
		port shaftPort_d: ShaftPort_d;
	}
	
	block RearAxle:> Axle;
	
	/**
	 * Note: This block is used for both the left and
	 * right axles within a RearAxle.
	 */
	block WheelAxle { 
		port axleToDiffPort: AxlePort;
		port axleToWheelPort: AxleToWheelPort;
	}
	
	block Engine { 
		port fuelCmdPort: FuelCmdPort;
		port drivePwrPort: DrivePwrPort;
	}
	
	/**
	 * Block Transmission has one of the two ports its usage has.
	 */	
	block Transmission { 
		port clutchPort: ClutchPort;
	}	
	block Driveshaft { 
		port shaftPort_b: ShaftPort_b;
		port shaftPort_c: ShaftPort_c;
	}	
	block Differential;
	
	/**
	 * Block Wheel does not include the ports its usages have.
	 */
	block Wheel is '1a-Parts Tree'::Wheel;
	
	// Port Definitions
	
	block FuelCmdPort; // Change to port def
	
	block DrivePwrPort;
	block ClutchPort;
	
	block ShaftPort_a;
	block ShaftPort_b;
	block ShaftPort_c;
	block ShaftPort_d;
	
	block DiffPort;
	block AxlePort;
	block AxleToWheelPort;
	block WheelToAxlePort;
	block WheelToRoadPort;
	
	block VehicleToRoadPort { 
		port wheelToRoadPort: WheelToRoadPort[2];
	}

	// Interface Definitions
	
	interface def EngineToTransmissionInterface {
		end drivePwrPort: DrivePwrPort;
		end clutchPort: ClutchPort;
	}
	
	interface def DriveshaftInterface {
		end shaftPort_a: ShaftPort_a;
		end shaftPort_d: ShaftPort_d;
		
		part driveshaft: Driveshaft {
			port shaftPort_b: ShaftPort_b redefines Driveshaft::shaftPort_b;
			port shaftPort_c: ShaftPort_c redefines Driveshaft::shaftPort_c;
		}
		
		connect shaftPort_a to driveshaft::shaftPort_b; // Change to connect
		connect driveshaft::shaftPort_c to shaftPort_d;
	}
		
	/* USAGES */
	
	part vehicle1_c1: VehicleA {
		port fuelCmdPort: FuelCmdPort redefines VehicleA::fuelCmdPort;
		
		bind fuelCmdPort = engine::fuelCmdPort; // Change to bind.
		
		part engine: Engine {
			port fuelCmdPort: FuelCmdPort redefines Engine::fuelCmdPort;
			port drivePwrPort: DrivePwrPort redefines Engine::drivePwrPort;
		}
		
		connect :EngineToTransmissionInterface from // Change to interface ... connect
			engine::drivePwrPort to transmission::clutchPort;
			
		part transmission: Transmission {
			port clutchPort: ClutchPort redefines Transmission::clutchPort;
			port shaftPort_a: ShaftPort_a;	
		}
		
		part driveshaft: Driveshaft;
		
		connect :DriveshaftInterface from
			transmission::shaftPort_a to rearAxleAssembly::shaftPort_d {
				part driveshaft redefines DriveshaftInterface::driveshaft = 
					vehicle1_c1::driveshaft;
			}

		part rearAxleAssembly: RearAxleAssembly {
			port shaftPort_d: ShaftPort_d redefines RearAxleAssembly::shaftPort_d;

			bind shaftPort_d = differential::shaftPort_d;
			
			/**
			 * Untyped part.
			 */
			part differential {
				port shaftPort_d: ShaftPort_d;
				port leftDiffPort: DiffPort;
				port rightDiffPort: DiffPort;
			}
			
			connect differential::leftDiffPort to rearAxle::leftAxle::axleToDiffPort;
			connect differential::rightDiffPort to rearAxle::rightAxle::axleToDiffPort;
	
			part rearAxle: RearAxle {
				part leftAxle: WheelAxle {
					port axleToDiffPort: AxlePort redefines WheelAxle::axleToDiffPort;
					port axleToWheelPort: AxleToWheelPort redefines WheelAxle::axleToWheelPort;
				}
				part rightAxle: WheelAxle  {
					port axleToDiffPort: AxlePort redefines WheelAxle::axleToDiffPort;
					port axleToWheelPort: AxleToWheelPort redefines WheelAxle::axleToWheelPort;
				}
			}
			
			connect rearAxle::leftAxle::axleToWheelPort to leftWheel::wheelToAxlePort;
			connect rearAxle::rightAxle::axleToWheelPort to rightWheel::wheelToAxlePort;

			part rearWheel: Wheel[2] ordered;
			
			part leftWheel subsets rearWheel = rearWheel[1] {
				port wheelToAxlePort: WheelToAxlePort;
				port wheelToRoadPort: WheelToRoadPort;
			}
			
			part rightWheel subsets rearWheel = rearWheel[2] {
				port wheelToAxlePort: WheelToAxlePort;
				port wheelToRoadPort: WheelToRoadPort;
			}
			
		}
		
		bind rearAxleAssembly::leftWheel::wheelToRoadPort = 
			vehicleToRoadPort::leftWheelToRoadPort;
		bind rearAxleAssembly::rightWheel::wheelToRoadPort = 
			vehicleToRoadPort::rightWheelToRoadPort;
			
		port vehicleToRoadPort redefines VehicleA::vehicleToRoadPort {
			port leftWheelToRoadPort subsets wheelToRoadPort = wheelToRoadPort[1];
			port rightWheelToRoadPort subsets wheelToRoadPort = wheelToRoadPort[2];
		}
		
	}
	
}