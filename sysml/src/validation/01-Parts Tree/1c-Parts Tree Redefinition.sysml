package '1c-Parts Tree Redefinition' {
	import SI::kg;
	
	package Definitions {	
		block Vehicle {
			value mass :> ISQ::mass;
		}		
		block AxleAssembly;		
		block Axle { 
			value mass :> ISQ::mass;
		}	
		block FrontAxle :> Axle { 
			value steeringAngle: ScalarValues::Real;
		}	
		block Wheel;	
	}
		
	package Usages {
		private import Definitions::*;
		
		part vehicle1: Vehicle {
			value mass redefines Vehicle::mass = 1750@[kg];
					
			part frontAxleAssembly: AxleAssembly {
				part frontAxle: Axle;			
				part frontWheel: Wheel[2] ordered;
			}		
			part rearAxleAssembly: AxleAssembly {
				part rearAxle: Axle;
				part rearWheel: Wheel[2] ordered;
			}		
		}
	
		/**
		 * 'vehicle1_c1' is a specialization of 'vehicle1' (technically 
		 * a subset). It inherits all the parts of 'vehicle1' and
		 * only needs to specify additional or redefined parts.
		 */
		part vehicle1_c1 :> vehicle1 {
			/**
			 * The mass is further redefined to give it a new value
			 * for 'vehicle1_c1'.
			 */
			value mass redefines vehicle1::mass = 2000@[kg];
					
			part frontAxleAssembly_c1 redefines frontAxleAssembly {
				/**
				 * 'frontAxle_c1' redefines 'frontAxleAssembly'::'frontAxle'
				 * to give it a new name and the specialized type
				 * 'FrontAxle'.
				 */
				part frontAxle_c1: FrontAxle redefines frontAxle;
				
				/*
				 * 'frontWheel' is inherited from 'vehicle1'::'frontAxleAssembly',
				 * allowing it to be used in the following part declarations.
				 */
				
				part frontWheel_1 subsets frontWheel = frontWheel[1];
				part frontWheel_2 subsets frontWheel = frontWheel[2];
			}
				
			part rearAxleAssembly_c1 redefines rearAxleAssembly {
				/**
				 * 'rearAxle_c1' redefines 'rearAxleAssembly'::'rearAxle'
				 * to give it a new name. It inherits the type 'Axle'
				 * from the redefined part.
				 */
				part rearAxle_c1 redefines rearAxle;
						
				part rearWheel_1 subsets rearWheel = rearWheel[1];
				part rearWheel_2 subsets rearWheel = rearWheel[2];
			}		
		}
		
	}
}