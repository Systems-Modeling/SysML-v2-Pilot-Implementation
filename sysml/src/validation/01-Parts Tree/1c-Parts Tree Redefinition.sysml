package '1c-Parts Tree Redefinition' {
	import Base::*;
	import ScalarValues::*;
	import SI::*;
	
	/* Definitions */
	
	block Vehicle {
		value mass :> ISQ::mass;
	}
	block AxleAssembly;
	block Axle { 
		value mass :> ISQ::mass;
	}
	block FrontAxle:> Axle {
		value steeringAngle: Real;
	}
	block Wheel;
	
	/* Usages */
	
	part vehicle1: Vehicle {
		value mass redefines Vehicle::mass = 1000@[kg];
				
		part frontAxleAssembly: AxleAssembly {
			part frontAxle: Axle;			
			part frontWheel: Wheel[2] ordered;
		}		
		part rearAxleAssembly: AxleAssembly {
			part rearAxle: Axle;
			part rearWheel: Wheel[2] ordered;
		}		
	}

	part vehicle1_c1:> vehicle1 {
		value mass redefines vehicle1::mass = 2000@[kg];
				
		part frontAxleAssembly_c1 redefines frontAxleAssembly {	
			part frontAxle_c1: FrontAxle redefines frontAxle;
						
			part frontWheel_1 subsets frontWheel = frontWheel[1];
			part frontWheel_2 subsets frontWheel = frontWheel[2];
		}
			
		part rearAxleAssembly_c1 redefines rearAxleAssembly {	
			part rearAxle_c1 redefines rearAxle;
					
			part rearWheel_1 subsets rearWheel = rearWheel[1];
			part rearWheel_2 subsets rearWheel = rearWheel[2];
		}		
	}	
}