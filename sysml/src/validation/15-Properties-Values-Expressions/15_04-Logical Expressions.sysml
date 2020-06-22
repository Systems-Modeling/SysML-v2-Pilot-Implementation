package '15_04-Logical Expressions' {
	import ScalarValues::*;
	
	part def Engine;
	part def '4CylEngine' :> Engine;
	part def '6CylEngine' :> Engine;
	
	part def Transmission;
	part def ManualTransmission :> Transmission;
	part def AutomaticTransmission :> Transmission;
	
	part def Vehicle {
		attribute isHighPerformance: Boolean;
		
		part engine: Engine[1];
		part transmission: Transmission[1];
		
		assert constraint {
			/**
			 * This is the ternary expression notation for 
			 * "if...then...else".
			 */
			isHighPerformance? 
				engine instanceof '6CylEngine': 
				engine instanceof '4CylEngine'
		}
		
		assert constraint {
			/**
			 * The "&" operator is logical "and".
			 * The "^" operator is logical "exclusive or".
			 * Other operators are "|" (or) and "!" (not).
			 * Equality ("==") can be used for "if and only if".
			 */
			(engine instanceof '4CylEngine' & 
			 transmission instanceof ManualTransmission) ^
			(engine instanceof '6CylEngine' &
			 transmission instanceof AutomaticTransmission)
		}
	}
}