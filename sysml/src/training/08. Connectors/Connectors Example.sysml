package 'Connectors Example' {
	
	block WheelHubAssembly;
	block WheelAssembly;
	block Tire;
	block TireBead;
	block Wheel;
	block TireMountingRim;
	block LugBoltMountingHole;
	block Hub;
	block LugBoltThreadableHole;
	block LugBoltJoint;
	
	assoc block PressureSeat {
		end : TireBead[1];
		end : TireMountingRim[1];
	}
	
	part wheelHubAssembly : WheelHubAssembly {
		
		part wheel : WheelAssembly[1] {
			part t : Tire[1] {
				part bead : TireBead[2];			
			}
			part w: Wheel[1] {
				part rim : TireMountingRim[2];
				part mountingHoles : LugBoltMountingHole[5];
			}						
			link : PressureSeat connect t::bead to w::rim;		
		}
		
		part lugBoltJoints : LugBoltJoint[0..5];
		part hub : Hub[1] {
			part h : LugBoltThreadableHole[5];
		}
		connect lugBoltJoints[0..1] 
			 to mountingHole => wheel::w::mountingHoles[1];
		connect lugBoltJoints[0..1] 
			 to threadedHole => hub::h[1];
	}
	
}