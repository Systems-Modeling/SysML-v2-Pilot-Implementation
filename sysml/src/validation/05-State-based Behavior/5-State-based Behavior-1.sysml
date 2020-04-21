package '5-State-based Behavior-1' {
	import ScalarValues::*;
	import ISQ::*;
	import '3a-Function-based Behavior-1'::*;
	
	package Definitions {
		block VehicleA {
			/*
			 * The following declare that 'VehicleA' performs a
			 * 'provide power' action and exhibits some 'vehicle states',
			 * without giving details about these behaviors.
			 */
			perform action 'provide power': 'Provide Power';
			exhibit state 'vehicle states': 'Vehicle States';
		}
		
		block VehicleController {
			exhibit state 'controller states': 'Controller States';
		}

		/*
		 * Black box specifications for state definitions may also have
		 * input and output parameters, like activities, though none
		 * are used here.
		 */

		state def 'Vehicle States';
		state def 'Controller States';	

		activity 'Perform Self Test';
		activity 'Apply Parking Brake';
		activity 'Sense Temperature'(out temp: TemperatureValue);
		
		value type 'Vehicle Start Signal';
		value type 'Vehicle On Signal';
		value type 'Vehicle Off Signal';
		
		value type 'Start Signal';
		value type 'Off Signal';
		value type 'Over Temp';
		value type 'Return to Normal';
		
		/*
		 * The following value types are used to fill in for the
		 * current lack of support for time events and change events,
		 * respectively.
		 */
		 
		value type 'at(vehicle::maintenanceTime)';
		value type 'when(temp>vehicle::Tmax)';
	}
	
	package Usages {
		import Definitions::*;
		
		/*
		 * These actions are used enabled in the state usage 
		 * 'vehicle states', in addition to 'provide power'.
		 */
		 
		action 'perform self test': 'Perform Self Test';
		action 'apply parking brake': 'Apply Parking Brake';
		action 'sense temperature': 'Sense Temperature';
		
		/**
		 * This is a usage of the state definition 'Vehicle States'.
		 * Note that it depends specifically on on the part 'vehicle1_c1'.
		 */
		state 'vehicle states': 'Vehicle States' {

			/**
			 * The state definition for this usage is implicit.
			 */
			state 'operational states' {
				/**
				 * This empty entry action acts like a start pseudo state.
				 */
				entry action initial;
				
				transition initial then off;
			    
				state off;
				
				/**
				 * The transition definition for a transition usage is always implicit.
				 * "accept" marks the trigger, "if" the guard and "do" the effect.
				 * 
				 * The notation "'Start Signal'()" constructs a specific instance of the
				 * 'Start Signal' value type to be sent to the 'vehicleController'. If the
				 * value type had properties, their values would be given as arguments
				 * inside the parhentheses.
				 */
				transition 'off-starting'
					first off
					accept 'Vehicle Start Signal' 
					if vehicle1_c1::'brake pedal depressed'
					do send 'Start Signal'() to vehicle1_c1::vehicleController
					then starting;
					
				state starting;
				
				transition 'starting-on'
					first starting
					accept 'Vehicle On Signal'
					then on;
				
				/**
				 * A state may have a "entry" action that is performed on entry into
				 * the state, a "do" action that is performed while in the state
				 * and an "exit" action that is performed on exit from the state.
				 */
				state on {
					entry 'perform self test';
					do 'provide power';
					exit 'apply parking brake';
				}
				
				transition 'on-off'
					first on
					accept 'Vehicle Off Signal'
					then off;
			}
			
			/**
			 * 'health states' is by default concurrent with 'operational states'.
			 */
			state 'health states' {
				entry action initial;
				/**
				 * State-behavior actions may have input and output parameters.
				 */
				do 'sense temperature' (out temp);
				
				transition initial then normal;
				
				state normal;
				
				transition 'normal-maintenance'
					first normal
					accept 'at(vehicle::maintenanceTime)' // Should be a time event trigger.
					then maintenance;
				
				transition 'normal-degraded'
					first normal
					accept 'when(temp>vehicle::Tmax)' // Should be a change event trigger.
					do send 'Over Temp'() to vehicle1_c1::vehicleController 
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

		part vehicle1_c1: VehicleA {
			port fuelCmdPort {
				in fuelCmd: FuelCmd;
			}
			
			/*
			 * These value properties are used in the specification for
			 * 'vehicle states'.
			 */
			value 'brake pedal depressed': Boolean;		
			value maintenanceTime: Time::DateTime;
			value Tmax: TemperatureValue;
			
			/**
			 * In the context of the 'vehicle1_c1' part, the 'provide power' action
			 * that is enabled in 'vehicle states' gets its input from the 'fuelCmdPort'.
			 */
			perform 'provide power' (in fuelCmd = fuelCmdPort::fuelCmd)
				:>> VehicleA::'provide power';
				
			/**
			 * This allocates the state usage 'vehicle states' as the detailed
			 * state-based behavior for 'vehicle1_c1' that fills in the generic
			 * declaration in 'VehicleA'.
			 */
			exhibit 'vehicle states' :>> VehicleA::'vehicle states';
				
			//*
			// The above is semantically equivalent to:
			
			ref state 'vehicle states' :> Usages::'vehicle states', enactedPerformances
				:>> VehicleA::'vehicle states';		
				
			// For a composite state performance within the vehicle, replace the above with:
			
			action 'vehicle states' :>> Usages::'vehicle states', VehicleA::'vehicle states';
			*/

			part vehicleController: VehicleController {
				exhibit 'controller states' :>> VehicleController::'controller states';
			}			
		}
	}
	
}