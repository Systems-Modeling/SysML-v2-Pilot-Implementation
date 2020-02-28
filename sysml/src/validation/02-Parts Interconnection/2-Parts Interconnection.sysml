package '2-Parts Interconnection' {
	import '1a-Parts Tree'::*;
	
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
	import '1a-Parts Tree'::Wheel;
	
	// Port Definitions
	
	port def FuelCmdPort;
	
	port def DrivePwrPort;
	port def ClutchPort;
	
	port def ShaftPort_a;
	port def ShaftPort_b;
	port def ShaftPort_c;
	port def ShaftPort_d;
	
	port def DiffPort;
	port def AxlePort;
	port def AxleToWheelPort;
	port def WheelToAxlePort;
	port def WheelToRoadPort;
	
	port def VehicleToRoadPort { 
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
		
		ref driveshaft: Driveshaft {
			port shaftPort_b redefines Driveshaft::shaftPort_b;
			port shaftPort_c redefines Driveshaft::shaftPort_c;
		}
		
		connect shaftPort_a to driveshaft::shaftPort_b;
		connect driveshaft::shaftPort_c to shaftPort_d;
	}
		
	/* USAGES */
	
	part vehicle1_c1: VehicleA {
		port fuelCmdPort: FuelCmdPort redefines VehicleA::fuelCmdPort;
		
		bind fuelCmdPort = engine::fuelCmdPort;
		
		part engine: Engine {
			port fuelCmdPort redefines Engine::fuelCmdPort;
			port drivePwrPort redefines Engine::drivePwrPort;
		}
		
		interface :EngineToTransmissionInterface
			connect engine::drivePwrPort to transmission::clutchPort;
			
		part transmission: Transmission {
			port clutchPort redefines Transmission::clutchPort;
			port shaftPort_a: ShaftPort_a;	
		}
		
		part driveshaft: Driveshaft;
		
		interface :DriveshaftInterface
			connect transmission::shaftPort_a to rearAxleAssembly::shaftPort_d {
				ref driveshaft redefines DriveshaftInterface::driveshaft = 
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
					port axleToDiffPort redefines WheelAxle::axleToDiffPort;
					port axleToWheelPort redefines WheelAxle::axleToWheelPort;
				}
				part rightAxle: WheelAxle  {
					port axleToDiffPort redefines WheelAxle::axleToDiffPort;
					port axleToWheelPort redefines WheelAxle::axleToWheelPort;
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