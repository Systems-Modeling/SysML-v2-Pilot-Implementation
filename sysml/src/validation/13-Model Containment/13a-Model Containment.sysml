package '13a-Model Containment' {
	import '2-Parts Interconnection'::*;
	// import '8-Requirements';
	
	/**
	 * This package is used to represent a top-level "model".
	 * There is no specific syntax for identifying a package
	 * used in this way.
	 */
	package 'Vehicle Model' {
		
		package 'Vehicle1-Configuration' {			
			part 'Sports Sedan' is vehicle1_c1;
			
			// Alternate (Alf-legacy) syntax.
			import vehicle1_c1 as 'Sports Sedan';
			
			// import 'vehicle-c1 Specification';		
		}
		
		/**
		 * This package is used to represent a "model library.
		 * There is no specific syntax for identifying a package
		 * used in this way.
		 */
		package 'Vehicle Reference Model' {
			block is VehicleA;
			package is VehicleSubsystems;
			
			// Alternate syntax.
			import VehicleA;			
			import VehicleSubsystems;
			
			// The following would transitively import all the
			// members of the VehicleSubsystems package, rather
			// then importing the package itself.
			// import VehicleSubsystems::*;
		}
		
		package VehicleSubsystems {
			import 'Body&Interior';
			import 'PowerTrain';
		}
		
		package 'Body&Interior' {
			// import 'Body&Interior Requirements';			
		}
		
		package PowerTrain {
			import Engine;
			import Transmission;
			// import PowerTrainRequirments;			
		}
	}
	
}