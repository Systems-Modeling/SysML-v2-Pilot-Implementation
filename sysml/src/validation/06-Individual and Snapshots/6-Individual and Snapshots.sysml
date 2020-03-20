package '6-Individual and Snapshots' {
	import ScalarValues::Real;
	import Time::DateTime;
	import ISQ::*;
	
	// Blocks
	
	block 'Temporal-Spatial Reference' {
		value referenceTime : DateTime;
		value referenceCoordinateSystem;
	}
	
	block VehicleRoadContext {
		value t : TimeValue;
	}
	
	block VehicleA {
		value mass : MassValue;
		value position : Real;
		value velocity : Real;
		value acceleration : Real;
	}
	
	block Road {
		value angle : Real;
		value surfaceFriction : Real;
	}
	
	// Individual Definitions
	
	individual def 'Temporal-Spatial Reference_ID1' :> 'Temporal-Spatial Reference';
	individual def VehicleRoadContext_ID1 :> VehicleRoadContext;
	individual def VehicleA_ID1 :> VehicleA;
	individual def Road_ID1 :> Road;
	
	// Values
	
	value t0 : TimeValue;
	value t1 : TimeValue;
	value tn : TimeValue;
	
	value m : MassValue;
	
	value p0 : Real;
	value p1 : Real;
	value pn : Real;
	
	value v0 : Real;
	value v1 : Real;
	value vn : Real;
	
	value a0 : Real;
	value a1 : Real;
	value an : Real;
	
	value theta0 : Real;
	value theta1 : Real;
	value thetan : Real;
	
	value sf0 : Real;
	value sf1 : Real;
	value sfn : Real;
	
	// Individuals and Snapshots
	
	individual reference : 'Temporal-Spatial Reference_ID1' {
		snapshot context_t0 : VehicleRoadContext_ID1 {
			value t redefines VehicleRoadContext_ID1::t = t0;
			
			snapshot vehicle_ID1_t0 : VehicleA_ID1 {
				value mass redefines VehicleA_ID1::mass = m;
				value position redefines VehicleA_ID1::position = p0;
				value velocity redefines VehicleA_ID1::velocity = v0;
				value acceleration redefines VehicleA_ID1::acceleration = a0;
			}
			
			snapshot road_ID1_t0 : Road_ID1 {
				value angle redefines Road_ID1::angle = theta0;
				value surfaceFriction redefines Road_ID1::surfaceFriction = sf0;
			}
		}
		
		snapshot context_t1 : VehicleRoadContext_ID1 {
			value t redefines VehicleRoadContext_ID1::t = t1;
			
			snapshot vehicle_ID1_t1 : VehicleA_ID1 {
				value mass redefines VehicleA_ID1::mass = m;
				value position redefines VehicleA_ID1::position = p1;
				value velocity redefines VehicleA_ID1::velocity = v1;
				value acceleration redefines VehicleA_ID1::acceleration = a1;
			}
			
			snapshot road_ID1_t1 : Road_ID1 {
				value angle redefines Road_ID1::angle = theta1;
				value surfaceFriction redefines Road_ID1::surfaceFriction = sf1;
			}
		}
		
		// ...
		
		snapshot context_tn : VehicleRoadContext_ID1 {
			value t redefines VehicleRoadContext_ID1::t = tn;
			
			snapshot vehicle_ID1_tn : VehicleA_ID1 {
				value mass redefines VehicleA_ID1::mass = m;
				value position redefines VehicleA_ID1::position = pn;
				value velocity redefines VehicleA_ID1::velocity = vn;
				value acceleration redefines VehicleA_ID1::acceleration = an;
			}
			
			snapshot road_ID1_tn : Road_ID1 {
				value angle redefines Road_ID1::angle = theta1;
				value surfaceFriction redefines Road_ID1::surfaceFriction = sfn;
			}
		}
	}
}