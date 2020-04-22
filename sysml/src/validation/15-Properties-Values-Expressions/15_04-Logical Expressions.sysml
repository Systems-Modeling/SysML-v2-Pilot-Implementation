package '15_04-Logical Expressions' {
	import ScalarValues::*;
	
	block Engine;
	block '4CylEngine' :> Engine;
	block '6CylEngine' :> Engine;
	
	block Transmission;
	block ManualTransmission :> Transmission;
	block AutomaticTransmission :> Transmission;
	
	block Vehicle {
		value isHighPerformance: Boolean;
		
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