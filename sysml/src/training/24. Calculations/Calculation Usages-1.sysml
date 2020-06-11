package 'Calculation Usages-1' {
	import 'Calculation Definitions'::*;
	
	block VehicleDynamics {
		value C_d : Real;
		value C_f : Real;
		value wheelPower : PowerValue;
		value mass : MassValue;
		
		action straightLineDynamics(
			in delta_t : TimeValue,
			in v_in : VelocityValue,
			in x_in : LengthValue,
			out v_out : VelocityValue,
			out x_out : LengthValue
		) {
			calc acc : Acceleration (
				dt = delta_t, 
				tm = mass, 
				tp = Power(wheelPower, C_d, C_f, mass, v_in)
			) return a;
			
			calc vel : Velocity (
				dt = delta_t, 
				v0 = v_in, 
				a = acc::a
			) return v = v_out;
			
			calc pos : Position (
				dt = delta_t, 
				x0 = x_in, 
				v0 = vel::v
			) return x = x_out;		
		}
	} 
	
}