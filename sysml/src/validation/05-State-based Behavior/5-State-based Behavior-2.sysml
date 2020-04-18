package '5-State-based Behavior-1' {
	import ScalarValues::*;
	
	package Definitions {
		import ActionDefinitions::*;
		import StateDefinitions::*;
		import SignalDefinitions::*;
		import PartDefinitions::*;
		
		package ActionDefinitions {	
			activity 'Perform Self Test';
			activity 'Provide Power';
			activity 'Apply Parking Brake';
			activity 'Sense Temperature'(out temp: ISQ::TemperatureValue);
		}
		
		package StateDefinitions {
			state def 'Vehicle States';
			state def 'Controller States';			
		}
		
		package SignalDefinitions {
			value type 'Vehicle Start Signal';
			value type 'Vehicle On Signal';
			value type 'Vehicle Off Signal';
			
			value type 'Start Signal';
			value type 'Off Signal';
			value type 'Over Temp';
			value type 'Return to Normal';
			
			value type 'at(vehicle::maintenanceTime)';
			value type 'when(temp>vehicle::Tmax)';
		}
		
		package PartDefinitions {
			block VehicleA {
				perform action 'provide power': 'Provide Power';
				exhibit state 'vehicle states': 'Vehicle States';
			}
			
			block VehicleController;
		}		
	}
	
	package Usages {
		import Definitions::*;
		
		package Actions {
			action 'perform self test': 'Perform Self Test';
			action 'provide power': 'Provide Power';
			action 'apply parking brake': 'Apply Parking Brake';
			action 'sense temperature': 'Sense Temperature';
		}
		
		package States {
			import Actions::*;
			import Parts::*;
			
			/**
			 * This is a usage of the state definition 'Vehicle States'.
			 */
			state 'vehicle states': 'Vehicle States' {

				state 'operational states' {
					entry; then off;
					
					/**
					 * This is a shorthad for a state servinf as th source for
					 * one or more immediately following transitions.
					 */
					state off;
					accept 'Vehicle Start Signal' 
						if vehicle1_c1::'brake pedal depressed'
						do send 'Start Signal'() to vehicle1_c1::vehicleController
						then starting;
						
					state starting;
					accept 'Vehicle On Signal'
						then on;
						
					state on {
						entry 'perform self test';
						do 'provide power';
						exit 'apply parking brake';
					}
					accept 'Vehicle Off Signal'
						then off;
				}
				
				state 'health states' {
					entry; then normal;
					do 'sense temperature' (out temp);
					
					state normal;
					accept 'at(vehicle::maintenanceTime)'
						then maintenance;
					accept 'when(temp>vehicle::Tmax)' 
						do send 'Over Temp'() to vehicle1_c1::vehicleController 
						then degraded;
					
					state maintenance;
					accept 'Return to Normal'
						then normal;
					
					state degraded;
					accept 'Return to Normal'
						then normal;
				}
			}
			
			state 'controller states': 'Controller States' {
				state 'operational controller states' {
					entry; then off;
					
					state off;
					accept 'Start Signal'
						then on;
					
					state on;
					accept 'Off Signal'
						then off;
				}
			}		
		}
		
		package Parts {
			import States::*;
			
			part vehicle1_c1: VehicleA {
				value 'brake pedal depressed': Boolean;
				
				value maintenanceTime: Time::DateTime;
				value Tmax: ISQ::TemperatureValue;
				
				perform 'provide power' :>> VehicleA::'provide power';
				exhibit 'vehicle states' :>> VehicleA::'vehicle states';
					
				part vehicleController: VehicleController {
					exhibit 'controller states';
				}			
			}
		}
	}
	
}