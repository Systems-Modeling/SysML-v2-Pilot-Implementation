package 'Analytical Constraints' {
	import 'Calculation Definitions'::*;
	
	activity StraightLineVehicleDynamics (
		in dt : TimeValue,
		in whlpwr : PowerValue,
		in Cd : Real,
		in Cf: Real,
		in tm : MassValue,
		in v_i : VelocityValue,
		in x_i : LengthValue,
		out a_f : AccelValue,
		out v_f : VelocityValue,
		out x_f : LengthValue ) {
			
		assert constraint {
			value tp : PowerValue;
			
			tp == Power(whlpwr, Cd, Cf, tm, (v_i + v_f)/2) &
			a_f == Acceleration(dt, tm, tp) &
			v_f == Velocity(dt, v_i, a_f) &
			x_f == Position(dt, x_i, v_i)
		}
	}
	
}