package '15_13-Discretely Sampled Function Value' {
	import NonScalarValues::SampledFunctionValue;
	import ISQ::*;
	import BasicGeometry::*;
	
	block AscentProfile :> SampledFunctionValue {
		/* Note: The multiplicity 0..* and ordering are automatically "inherited"
		 * from the redefined value properties. */
		value missionElapsedTime : TimeValue :>> domain;
		value locationAndVelocity : LocationAndVelocity :>> range;
	}
	
	value type LocationAndVelocity {
		value location : Location3DCartesian[1];
		value velocity : Velocity3DCartesian[1];
	}
	
	value type Velocity3DCartesian {
		value vX : SpeedValue[1];
		value vY : SpeedValue[1];
		value vZ : SpeedValue[1];
	}
}