/**
 * Example from the SysML 1.6 spec, subclause 8.4.1 Wheel Hub Assembly.
 */
package 'Wheel Package' {
	import ISQ::*;
	
	pressure = force / length^2; 
	
	block WheelHubAssembly {
		part wheel: WheelAssembly[1];
		part lugBoltJoints: LugBoltJoint[5] {
			ref redefines threadedHole subsets hub::h;
			ref redefines mountingHole subsets wheel::w::mountingHoles;
		}
		part hub: Hub[1];
	}
	
	block WheelAssembly {
		inflationPressure :> pressure;
		
		part t: Tire[1] {
			part bead redefines Tire::bead;
		}
		part w: Wheel[1] {
			part rim redefines Wheel::rim;
		}		
				
		link : PressureSeat connect t::bead to w::rim;		
	}
	
	block Tire {
		tireSpecification : ScalarValues::String;
		
		part bead : TireBead[2];
		
		action mountTire;
	}
	
	block TireBead;
	
	assoc block PressureSeat {
		end : TireBead[1];
		end : TireMountingRim[1];
	}
	
	block Wheel {
		diameter :> length;
		width :> length;
		
		part rim : TireMountingRim[2];
		part v : InflationValve[1];
		part weight : BalanceWeight[0..6];
		part mountingHoles : LugBoltMountingHole[5];
	}
	
	assoc block BandMount {
		end : Wheel[1];
		end : WirelessTirePressureMonitor[1];
	}
	
	block WirelessTirePressureMonitor {
		action transmitPressure;
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
		
		ref mountingHole: LugBoltMountingHole[1];
		ref threadedHole: LugBoltThreadableHole[1];
	}
	
	block Hub {
		part h: LugBoltThreadableHole[5];
	}
	
	block LugBoltThreadableHole {
		lugBoltSize :> length;
		threadSize :> length;
	}
	
}