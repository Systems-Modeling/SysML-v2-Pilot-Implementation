/**
 * Example from the SysML 1.6 spec, subclause 8.4.1 Wheel Hub Assembly.
 */
package 'Wheel Package - Updated' {
	import ISQ::*;
	
	// Quantities
	
	pressure = force / length^2; 
	
	// Blocks
	
	block WheelHubAssembly;
	block WheelAssembly {
		inflationPressure :> pressure;
	}
	
	block Tire {
		tireSpecification : ScalarValues::String;		
		action mountTire; // Should be operation
	}
	
	block TireBead;
	
	assoc block PressureSeat {
		end : TireBead[1];
		end : TireMountingRim[1];
	}
	
	block Wheel {
		diameter :> length;
		width :> length;		
	}
	
	assoc block BandMount {
		end : Wheel[1];
		end : WirelessTirePressureMonitor[1];
	}
	
	block WirelessTirePressureMonitor {
		action transmitPressure; // Should be operation
	}
	
	block TireMountingRim;
	
	block InflationValve;
	
	block BalanceWeight;
	
	block LugBoltMountingHole {
		lugBoltSize :> length;
	}
	
	block LugBoltJoint {
		torque :> ISQ::torque;
		boltTension :> force;
	}
	
	block Hub;
	
	block LugBoltThreadableHole {
		lugBoltSize :> length;
		threadSize :> length;
	}
	
	// Parts
	
	part wheelHubAssembly: WheelHubAssembly {
		part wheel: WheelAssembly[1] {
			part t: Tire[1] {
				part bead : TireBead[2];			
			}
			part w: Wheel[1] {
				part rim : TireMountingRim[2];
				part v : InflationValve[1];
				part weight : BalanceWeight[0..6];
				part mountingHoles : LugBoltMountingHole[5];
			}						
			link : PressureSeat connect t::bead to w::rim;		
		}
		part lugBoltJoints: LugBoltJoint[5] {					
			ref mountingHole: LugBoltMountingHole[1] subsets hub::h;
			ref threadedHole: LugBoltThreadableHole[1] subsets wheel::w::mountingHoles;
		}
		part hub: Hub[1] {
			part h: LugBoltThreadableHole[5];
		}
	}
	
}