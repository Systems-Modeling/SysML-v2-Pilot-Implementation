package '3a-Function-based Behavior-1' {
	import Transfers::Transfer;
	import Activities::Merge;
	
	// ITEMS
	
	value type FuelCmd;
	value type Torque is ISQ::TorqueValue;
	
	// SIGNALS
	
	value type EngineStart;
	value type EngineOff;
	
	// ACTIVITIES
	
	activity 'Generate Torque'(in fuelCmd: FuelCmd, out engineTorque: Torque);
	activity 'Amplify Torque'(in engineTorque: Torque, out transmissionTorque: Torque);
	activity 'Transfer Torque'(in transmissionTorque: Torque, out driveshaftTorque: Torque);
	activity 'Distribute Torque'(in driveShaftTorque: Torque, out wheelTorque1: Torque, out wheelTorque2: Torque);
	
	activity 'Provide Power'(in fuelCmd: FuelCmd, out wheelTorque1: Torque, out wheelTorque2: Torque);
	activity 'Provide Power With Control'(in fuelCmd: FuelCmd, out wheelTorque1: Torque, out wheelTorque2: Torque);
	
	// ACTIONS
	
	action 'provide power': 'Provide Power'(
		in fuelCmd: FuelCmd, 
		out wheelTorque1: Torque, 
		out wheelTorque2: Torque
	) {
		bind 'generate torque'::fuelCmd = fuelCmd;
		
		action 'generate torque': 'Generate Torque'(
			in fuelCmd: Torque, 
			out engineTorque: Torque
		);
		
		stream of Torque 
			from 'generate torque'::engineTorque 
			  to 'amplify torque'::engineTorque;
		
		action 'amplify torque': 'Amplify Torque'(
			in engineTorque: Torque, 
			out transmissionTorque: Torque
		);
		
		stream of Torque 
			from 'amplify torque'::transmissionTorque 
			  to 'transfer torque'::transmissionTorque;
		
		action 'transfer torque': 'Transfer Torque'(
			in transmissionTorque: Torque, 
			out driveshaftTorque: Torque
		);
		
		stream of Torque 
			from 'transfer torque'::driveshaftTorque 
			  to 'distribute torque'::driveshaftTorque;
		
		action 'distribute torque': 'Distribute Torque'(
			in driveshaftTorque: Torque, 
			out wheelTorque1: Torque, 
			out wheelTorque2: Torque
		);
		
		bind wheelTorque1 = 'distribute torque'::wheelTorque1;
		bind wheelTorque2 = 'distribute torque'::wheelTorque2;
	}
	
	action 'provide power with control': 'Provide Power With Control' (
		in fuelCmd: FuelCmd, 
		out wheelTorque1: Torque, 
		out wheelTorque2: Torque
	) {		
		succession first start[0..1] then merge[1];
				
		action merge: Merge[*];
		
		succession first merge[1] then engineStart[1];
			
		action engineStart subsets incomingTransfers {
			item: EngineStart[1] redefines Transfer::item;
		}
		
		succession first engineStart[1] then engineOff[1];
		
		action engineOff subsets incomingTransfers {
			item: EngineOff[1] redefines Transfer::item;
		}
			
		succession first engineOff[0..1] then merge[1];
				
		succession first engineStart[1] then 'provide power'[1];
			
		bind 'provide power'::fuelCmd = fuelCmd;
		action 'do provide power'[*] (
			in fuelCmd, 
			out wheelTorque1, 
			out wheelTorque2
		) subsets 'provide power';
		bind wheelTorque1 = 'provide power'::wheelTorque1;
		bind wheelTorque2 = 'provide power'::wheelTorque2;
				
		succession first 'provide power'[1] then engineOff[1];		
	}
}