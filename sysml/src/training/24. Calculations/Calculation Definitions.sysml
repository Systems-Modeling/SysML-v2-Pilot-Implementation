package 'Calculation Definitions' {
	import ScalarValues::Real;
	import RealFunctions::Sqrt;
	
	value type PowerValue :> Real;
	value type MassValue :> Real;
	value type AccelValue :> Real;
	value type VelocityValue :> Real;
	value type LengthValue :> Real;
	value type TimeValue :> Real;
	
	calc def Power (whlpwr : PowerValue, Cd : Real, Cf : Real, tm : MassValue, v : VelocityValue ) : PowerValue {
		value drag = Cd * v;
		value friction = Cf * tm * v;
		
		whlpwr - drag - friction
	}
	
	calc def Acceleration (dt : TimeValue, tm : MassValue, tp: PowerValue) : AccelValue { 
		Sqrt(tp / (2 * tm * dt))
	}
	
	calc def Velocity (dt : TimeValue, v0 : VelocityValue, a : AccelValue) : VelocityValue = v0 + a * dt;
 	
	calc def Position (dt : TimeValue, x0 : LengthValue, v : VelocityValue) : LengthValue = x0 + v * dt;
}