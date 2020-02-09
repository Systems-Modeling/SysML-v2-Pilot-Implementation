package HSUVDynamics {
	import ScalarValues::Real;
	import BaseFunctions::size;
	
	value type Horsepwr :> Real;
	value type Weight :> Real;
	value type Accel :> Real;
	value type Vel :> Real;
	value type Dist :> Real;
	value type Time :> Real;
	
	constraint def PowerEquation {
		value whlpwr : Horsepwr;
		value Cd : Real;
		value Cf : Real;
		value tw : Weight;
		value tp : Horsepwr;
		value v : Vel;
		
		tp == whlpwr - Cd * v - Cf * tw * v
	}
	
	constraint def PositionEquation {
		value dt : Time;
		value v : Vel[0..*] ordered;
		value x : Dist[0..*] ordered;
		
		{1..size(x)-1}->forAll n (x[n + 1] == x[n] + v[n] * (5280/3600) * dt)
	}
	
	constraint def VelocityEquation {
		value dt : Time;
		value v : Vel[0..*] ordered;
		value a : Accel;
		
		{1..size(v)-1}->forAll n (v[n + 1] == v[n] + a * 32 * (3600/5280) * dt)
	}
	
	constraint def AccelerationEquation {
		value tw : Weight;
		value dt : Time;
		value tp : Horsepwr;
		value a : Accel;
		
		a == (550/32) * tp * dt * tw
	}
	
	constraint def StraightLineVehicleDynamics {
		value dt : Time;
		value whlpwr : Horsepwr;
		value Cd : Real;
		value Cf: Real;
		value tw : Weight;
		value a : Accel;
		value v : Vel[0..*] ordered;
		value x : Dist[0..*] ordered;
		
		constraint pwr : PowerEquation {
			value redefines whlpwr = StraightLineVehicleDynamics::whlpwr;
			value redefines Cd = StraightLineVehicleDynamics::Cd;
			value redefines Cf = StraightLineVehicleDynamics::Cf;
			value redefines tw = StraightLineVehicleDynamics::tw;
			value redefines v = vel::v;
			value redefines tp;
		}
		
		constraint acc : AccelerationEquation {
			value redefines tp = pwr::tp;
			value redefines tw = StraightLineVehicleDynamics::tw;
			value redefines dt = StraightLineVehicleDynamics::dt;
			value redefines a = StraightLineVehicleDynamics::a;
		}
		
		constraint vel : VelocityEquation {
			value redefines a = acc::a;
			value redefines v = StraightLineVehicleDynamics::v;
			value redefines dt = StraightLineVehicleDynamics::dt;
		}
		
		constraint pos : PositionEquation {
			value redefines v = vel::v;
			value redefines x = StraightLineVehicleDynamics::x;
			value redefines dt = StraightLineVehicleDynamics::dt;
		}
	}
		
}