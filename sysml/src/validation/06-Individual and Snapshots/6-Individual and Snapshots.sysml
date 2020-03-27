package '6-Individual and Snapshots' {
	import ScalarValues::Real;
	import Time::DateTime;
	import ISQ::*;
	
	package 'Part Definitions' {	
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
			exhibit state vehicleStates {
				state on;
				state off;
			}
		}
		
		block Road {
			value angle : Real;
			value surfaceFriction : Real;
		}
	}
	
	package 'Individual Definitions' {
		import 'Part Definitions'::*;
		
		individual def 'Temporal-Spatial Reference_ID1' :> 'Temporal-Spatial Reference';
		individual def VehicleRoadContext_ID1 :> VehicleRoadContext;
		individual def VehicleA_ID1 :> VehicleA;
		individual def Road_ID1 :> Road;
	
	}
	
	package Values {	
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
	}
	
	package 'Individuals and Snapshots' {
		import 'Individual Definitions'::*;
		import Values::*;
		
		individual reference : 'Temporal-Spatial Reference_ID1' {
			snapshot context_t0 : VehicleRoadContext_ID1 {
				:>> t = t0;
				
				snapshot vehicle_ID1_t0 : VehicleA_ID1 {
					:>> mass = m;
					:>> position = p0;
					:>> velocity = v0;
					:>> acceleration = a0;
					
					exhibit vehicleStates::on;
				}
				
				snapshot road_ID1_t0 : Road_ID1 {
					:>> angle = theta0;
					:>> surfaceFriction = sf0;
				}
			}
			
			snapshot context_t1 : VehicleRoadContext_ID1 {
				:>> t = t1;
				
				snapshot vehicle_ID1_t1 : VehicleA_ID1 {
					:>> mass = m;
					:>> position = p1;
					:>> velocity = v1;
					:>> acceleration = a1;
					
					exhibit vehicleStates::on;
				}
				
				snapshot road_ID1_t1 : Road_ID1 {
					:>> angle = theta1;
					:>> surfaceFriction = sf1;
				}
			}
			
			// ...
			
			snapshot context_tn : VehicleRoadContext_ID1 {
				:>> t = tn;
				
				snapshot vehicle_ID1_tn : VehicleA_ID1 {
					:>> mass = m;
					:>> position = pn;
					:>> velocity = vn;
					:>> acceleration = an;
					
					exhibit vehicleStates::off;
				}
				
				snapshot road_ID1_tn : Road_ID1 {
					:>> angle = theta1;
					:>> surfaceFriction = sfn;
				}
			}
		}
	}
}