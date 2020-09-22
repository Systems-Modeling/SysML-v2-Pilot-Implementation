package 'Calculation Usages-2' {
	import 'Calculation Definitions'::*;
	
	attribute def DynamicState {
		attribute v: VelocityValue;
		attribute x: LengthValue;
	}
	
	part def VehicleDynamics {
		attribute C_d : Real;
		attribute C_f : Real;
		attribute wheelPower : PowerValue;
		attribute mass : MassValue;
		
		calc updateState(delta_t : TimeValue, currState : DynamicState) : DynamicState {
			attribute totalPower : PowerValue = Power(wheelPower, C_d, C_f, mass, currState::v);
			attribute newState : DynamicState {
				:>> v = Velocity(delta_t, currState::v, Acceleration(totalPower, mass, currState::v));
				:>> x = Position(delta_t, currState::x, currState::v);
			}
			
			newState
		}
	} 
	
}