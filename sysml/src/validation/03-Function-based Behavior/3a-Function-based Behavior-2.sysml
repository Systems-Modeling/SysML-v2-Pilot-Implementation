package '3a-Function-based Behavior-2' {
	import Definitions::*;
	import Usages::*;

	package Definitions {
		import ISQ::TorqueValue as Torque;
		
		// VALUE TYPES
		
		value type FuelCmd;
		
		value type EngineStart;
		value type EngineOff;
		
		// ACTIVITIES
		
		activity 'Generate Torque'(in fuelCmd: FuelCmd, out engineTorque: Torque);
		activity 'Amplify Torque'(in engineTorque: Torque, out transmissionTorque: Torque);
		activity 'Transfer Torque'(in transmissionTorque: Torque, out driveshaftTorque: Torque);
		activity 'Distribute Torque'(in driveShaftTorque: Torque, out wheelTorque1: Torque, out wheelTorque2: Torque);
		
		activity 'Provide Power'(in fuelCmd: FuelCmd, out wheelTorque1: Torque, out wheelTorque2: Torque);
	
	}
	
	package Usages {
	
		action 'provide power': 'Provide Power'(
			in fuelCmd: FuelCmd, 
			out wheelTorque1: Torque, 
			out wheelTorque2: Torque
		) {
			// ITEM FLOW PART
			
			/**
			 * The binding connector shorthand can be used on action parameters.
			 */
			action 'generate torque': 'Generate Torque'(
				in fuelCmd = 'provide power'::fuelCmd,
				out engineTorque: Torque
			);
			
			/**
			 * There is also a shorthand for streaming into a input parameter.
			 */
			action 'amplify torque': 'Amplify Torque'(
				in engineTorque stream from 'generate torque'::engineTorque, 
				out transmissionTorque
			);
			
			action 'transfer torque': 'Transfer Torque'(
				in transmissionTorque stream from 'amplify torque'::transmissionTorque, 
				out driveshaftTorque
			);
						
			action 'distribute torque': 'Distribute Torque'(
				in driveshaftTorque stream from 'transfer torque'::driveshaftTorque, 
				out wheelTorque1 = 'distribute torque'::wheelTorque1, 
				out wheelTorque2 = 'distribute torque'::wheelTorque2
			);
			
			// CONTROL FLOW PART

			/*
			 * The following uses a shorthand for a sequence of successions.
			 * The source of the first succession is given by "first start",
			 * and the target of each succeeding succession is indicated by
			 * using the "then" keyword.
			 */
			first start;
			then merge continue;	
			then accept engineStarted (engineStart: EngineStart);			
			then accept engineStopped (engineOff: EngineOff);	
			then continue;
			
			/* Enable torque generation. */
			succession engineStarted then 'generate torque';
			succession engineStarted then 'amplify torque';
			succession engineStarted then 'transfer torque';
			succession engineStarted then 'distribute torque';
			
			/* Disable torque generation. */
			succession 'generate torque' then engineStopped;		
			succession 'amplify torque' then engineStopped;		
			succession 'transfer torque' then engineStopped;		
			succession 'distribute torque' then engineStopped;		
		}
	
	}
}