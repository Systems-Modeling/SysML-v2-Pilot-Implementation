package '4a1-Functional Allocation' {
	import '2-Parts Interconnection'::*;
	import '3a-Function-based Behavior'::*;
	import '3a-Function-based Behavior'::'provide power'::*;
		
	part vehicle1_c1_functional_allocation :> vehicle1_c1 {
		// Note: The definitions of the port types in '2-Parts Interconnection' do not include 
		// input and output features.
		port fuelCmdPort redefines vehicle1_c1::fuelCmdPort {
			in fuelCmd: FuelCmd;
		}

		// This allocates the action '3a-Function-based Behavior'::'provide power' as an enacted 
		// performance of vehicle_c1_functional_allocation.
		perform 'provide power'  (
			// This assigns the fuelCmdPort to provide the input to 'provide power'.
			in fuelCmd = fuelCmdPort::fuelCmd
		);
		
		// The above is semantically equivalent to:
		//
		// ref action 'provide power' (in fuelCmd = fuelCmdPort::fuelCmd) 
		//	   subsets '3a-Function-based Behavior'::'provide power', enactedPerformances;		
			
		// For a composite enacted performance within the vehicle, replace the above with:
		//
		// action 'provide power' (in fuelCmd = fuelCmdPort::fuelCmd) 
		//	   redefines '3a-Function-based Behavior'::'provide power';		
		
		part engine redefines vehicle1_c1::engine {
			port fuelCmdPort redefines vehicle1_c1::engine::fuelCmdPort {
				in fuelCmd: FuelCmd;
			}
			
			// This allocates one of the sub-steps of 'provide power' to a sub-part of vehicle_c1.  
			perform 'generate torque' (
				in fuelCmd = fuelCmdPort::fuelCmd, 
				out engineTorque = drivePwrPort::engineTorque
			);
			
			port drivePwrPort redefines vehicle1_c1::engine::drivePwrPort {
				out engineTorque: Torque;
			}
		}
		
		part transmission redefines vehicle1_c1::transmission {
			port clutchPort redefines vehicle1_c1::transmission::clutchPort {
				value in engineTorque: Torque;
			}
			
			perform 'amplify torque' (
				in engineTorque = clutchPort::engineTorque, 
				out transmissionTorque = shaftPort_a::transmissionTorque
			);

			port shaftPort_a redefines vehicle1_c1::transmission::shaftPort_a {
				out transmissionTorque: Torque;
			}
		}
		
		part driveshaft redefines vehicle1_c1::driveshaft {
			port shaftPort_b redefines Driveshaft::shaftPort_b {
				in transmissionTorque: Torque;
			}

			perform 'transfer torque' (
				in transmissionTorque = shaftPort_b::transmissionTorque, 
				out driveshaftTorque = shaftPort_c::driveshaftTorque
			);

			port shaftPort_c redefines Driveshaft::shaftPort_c {
				out driveshaftTorque: Torque;
			}			
		}
		
		part rearAxleAssembly redefines vehicle1_c1::rearAxleAssembly {
			port shaftPort_d redefines vehicle1_c1::rearAxleAssembly::shaftPort_d {
				in driveshaftTorque: Torque;
			}
				
			perform 'distribute torque' (
				in driveshaftTorque = shaftPort_d::driveshaftTorque, 
				out wheelTorque1 = rearAxle::leftAxle::axleToWheelPort::wheelTorque, 
				out wheelTorque2 = rearAxle::rightAxle::axleToWheelPort::wheelTorque
			);
			
			part rearAxle redefines vehicle1_c1::rearAxleAssembly::rearAxle {
				part leftAxle redefines vehicle1_c1::rearAxleAssembly::rearAxle::leftAxle {
					port axleToWheelPort redefines vehicle1_c1::rearAxleAssembly::rearAxle::leftAxle::axleToWheelPort {
						out wheelTorque: Torque;
					}
				}
				part rightAxle redefines vehicle1_c1::rearAxleAssembly::rearAxle::rightAxle {
					port axleToWheelPort redefines vehicle1_c1::rearAxleAssembly::rearAxle::rightAxle::axleToWheelPort {
						out wheelTorque: Torque;
					}
				}
			}
		}
	}
}