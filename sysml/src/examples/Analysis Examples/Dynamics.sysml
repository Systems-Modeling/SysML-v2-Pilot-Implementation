package Dynamics {
	import ScalarValues::Real;
	
	value type PowerValue :> Real;
	value type MassValue :> Real;
	value type AccelValue :> Real;
	value type VelocityValue :> Real;
	value type LengthValue :> Real;
	value type TimeValue :> Real;
	
	// Function definitions
	
	function def Power
		(in whlpwr : PowerValue, in Cd : Real, in Cf : Real, in tm : MassValue, in v : VelocityValue )
		return tp : PowerValue {
			
		whlpwr - Cd * v - Cf * tm * v
	}
	
	function def Acceleration (dt : TimeValue, tm : MassValue, tp: PowerValue) a : AccelValue { 
		tp * dt * tp
	}
	
	function def Velocity (dt : TimeValue, v0 : VelocityValue, a : AccelValue) v : VelocityValue = v0 + a * dt;
 	
	function def Position (dt : TimeValue, x0 : LengthValue, v : VelocityValue) : LengthValue = x0 + v * dt;
	

	// Analysis activity
	
	activity StraightLineVehicleDynamics (
		in dt : TimeValue,
		in whlpwr : PowerValue,
		in Cd : Real,
		in Cf: Real,
		in tm : MassValue,
		in v_in : VelocityValue,
		in x_in : LengthValue,
		out a_out : AccelValue,
		out v_out : VelocityValue,
		out x_out : LengthValue ) {
			
		assert constraint {
			value tp : PowerValue;
			
			tp == Power(whlpwr, Cd, Cf, tm, v_in) &
			a_out == Acceleration(dt, tm, tp) &
			v_out == Velocity(dt, v_in, a_out) &
			x_out == Position(dt, x_in, v_in)
		}
	}
	

	// Analysis actions
	
	action dyn1 : StraightLineVehicleDynamics {
		value tp : PowerValue = Power(whlpwr, Cd, Cf, tm, v_in);
		value a : AccelValue = Acceleration(dt, tm, tp);
		value v : VelocityValue = Velocity(dt, v_in, a);
		value x : LengthValue = Position(dt, x_in, v_in);
		
		bind a_out = a;
		bind v_out = v;
		bind x_out = x;
	}	
	
	action dyn2 : StraightLineVehicleDynamics {
		function acc : Acceleration (
			dt = dyn2::dt, 
			tm = dyn2::tm, 
			tp = Power(whlpwr, Cd, Cf, tm, v_in)
		) return a = a_out;
		
		function vel : Velocity (
			dt = dyn2::dt, 
			v0 = dyn2::v_in, 
			a = acc::a
		) return v = v_out;
		
		function pos : Position (
			dt = dyn2::dt, 
			x0 = dyn2::x_in, 
			v0 = vel::v
		) return x = x_out;		
	}
	
	action dyn3 : StraightLineVehicleDynamics {
		calc acc : Acceleration (
			dt = dyn3::dt, 
			tm = dyn3::tm, 
			tp = Power(whlpwr, Cd, Cf, tm, v_in)
		) return a = a_out;
		
		calc vel : Velocity (
			dt = dyn3::dt, 
			v0 = dyn3::v_in, 
			a = acc::a
		) return v = v_out;
		
		calc pos : Position (
			dt = dyn3::dt, 
			x0 = dyn3::x_in, 
			v0 = vel::v
		) return x = x_out;		
	}
}