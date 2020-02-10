package '5-State-based Behavior' {
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
				value 'brake pedal depressed': Boolean;
				
				value maintenanceTime: Time::DateTime;
				value Tmax: ISQ::TemperatureValue;
				
				perform action 'perform self test': 'Perform Self Test';
				perform action 'provide power': 'Provide Power';
				perform action 'apply parking brake': 'Apply Parking Brake';
				
				perform action 'sense temperature': 'Sense Temperature'(out temp);
				
				exhibit state 'vehicle states': 'Vehicle States';
			}
			
			block VehicleController {
				exhibit state 'controller states': 'Controller States';
			}
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
			state 'vehicle states': 'Vehicle States' {
				ref vehicle : VehicleA;
				ref control : VehicleController;
					
				state 'operational states' {
					entry action initial;
					
					transition initial then off;
				    
					state off;
					
					transition 'off-starting'
						first off
						accept 'Vehicle Start Signal' 
						if vehicle::'brake pedal depressed'
						do send 'Start Signal'() to control
						then starting;
						
					state starting;
					
					transition 'starting-on'
						first starting
						accept 'Vehicle On Signal'
						then on;
						
					state on {
						entry vehicle::'perform self test';
						do vehicle::'provide power';
						exit vehicle::'apply parking brake';
					}
					
					transition 'on-off'
						first on
						accept 'Vehicle Off Signal'
						then off;
				}
				
				state 'health states' {
					entry action initial;
					do vehicle::'sense temperature' (out temp);
					
					transition initial then normal;
					
					state normal;
					
					transition 'normal-maintenance'
						first normal
						accept 'at(vehicle::maintenanceTime)'
						then maintenance;
					
					transition 'normal-degraded'
						first normal
						accept 'when(temp>vehicle::Tmax)' 
						do send 'Over Temp'() to control 
						then degraded;
					
					state maintenance;
					
					transition 'maintenance-normal'
						first maintenance
						accept 'Return to Normal'
						then normal;
					
					state degraded;
					
					transition 'degraded-normal'
						first degraded
						accept 'Return to Normal'
						then normal;
				}
			}
			
			state 'controller states': 'Controller States' {
				state 'operational controller states' {
					entry action initial; 
					
					transition initial then off;
					
					state off;
					
					transition 'off-on'
						first off
						accept 'Start Signal'
						then on;
					
					state on;
					
					transition 'on-off'
						first on
						accept 'Off Signal'
						then off;
				}
			}		
		}
		
		package Parts {
			part vehicle1_c1: VehicleA {
				perform Actions::'perform self test' redefines 'perform self test';
				perform Actions::'provide power' redefines 'provide power';
				perform Actions::'apply parking brake' redefines 'apply parking brake';
				
				perform Actions::'sense temperature' redefines 'sense temperature';
				
				exhibit States::'vehicle states' redefines 'vehicle states' {
					part redefines vehicle = vehicle1_c1::self;
					part redefines control = vehicleController;
				}
					
				part vehicleController: VehicleController {
					exhibit States::'controller states' redefines 'controller states';
				}			
			}
		}
	}
	
}