package VehicleUsages {

	T1: VehicleDefinitions.Torque = 10.0 N-m;
	T2: VehicleDefinitions.Torque = 20.0 N-m;
	
	part narrowRimWheel: VehicleDefinitions.Wheel {
		part lugbolt: Lugbolt[4..5];
	}

	part wideRimWheel: VehicleDefinitions.Wheel {
		part lugbolt: Lugbolt[4..6];
	}

	part vehicle_C1: VehicleDefinitions.Vehicle {
		part frontAssembly: AxleAssembly {
			part frontWheel is narrowRimWheel[2] {
				part is lugbolt[4] {
					torque = T1;
				}
			}
			part frontAxle: Axle {
				out leftMountingPoint: WheelHub;
				out rightMountingPoint: WheelHub;
			}
		}
		
		part rearAssembly: AxleAssembly {
			part rearWheel is wideRimWheel[2] {
				part is lugbolt[4] {
					torque = T2;
				}
			}
			part rearAxle: Axle {
				out leftMountingPoint: WheelHub;
				out rightMountingPoint: WheelHub;
			}			
		}
	}
	
	part vehicle_C2 is vehicle_C1 {
		part is frontAssembly {
			part leftFrontWheel is frontWheel[1] {
				in hub: WheelHub;
			}
			part rightFrontWheel is frontWheel[1] {
				in hub: WheelHub;
			}
			
			connector frontAxle.leftMountingPoint => leftFrontWheel.hub;
			connector frontAxle.rightMountingPoint => rightFrontWheel.hub;
		}
		
		part is rearAssembly {
			part leftRearWheel is rearWheel[1] {
				in hub: WheelHub;
			}
			part rightRearWheel is rearWheel[1] {
				in hub: WheelHub;
			}

			connector rearAxle.leftMountingPoint => leftRearWheel.hub;
			connector rearAxle.rightMountingPoint => rightRearWheel.hub;
		}
		
	}

}