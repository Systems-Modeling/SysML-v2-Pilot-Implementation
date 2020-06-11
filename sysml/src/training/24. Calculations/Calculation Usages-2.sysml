package 'Calculation Usages-2' {
	import 'Calculation Definitions'::*;
	
	value type DynamicState {
		value v: VelocityValue;
		value x: LengthValue;
	}
	
	block VehicleDynamics {
		value C_d : Real;
		value C_f : Real;
		value wheelPower : PowerValue;
		value mass : MassValue;
		
		calc updateState(delta_t : TimeValue, currState : DynamicState) : DynamicState {
			value totalPower : PowerValue = Power(wheelPower, C_d, C_f, mass, currState::v);
			value newState : DynamicState {
				:>> v = Velocity(delta_t, currState::v, Acceleration(delta_t, mass, totalPower));
				:>> x = Position(delta_t, currState::x, currState::v);
			}
			
			newState
		}
	} 
	
}