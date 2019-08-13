package '3a-Function-based Behavior-1' {
	import Transfers::Transfer;
	import ControlNodes::Merge;
	import Base::Occurrence::startShot;
	import Base::Occurrence::incomingTransfers;
	
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
		action 'generate torque': 'Generate Torque'(
			in fuelCmd = 'Provide Power'::fuelCmd, 
			out engineTorque
		);
		
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
			out wheelTorque1 = 'provide power'::wheelTorque1, 
			out wheelTorque2 = 'provide power'::wheelTorque2
		); 
	}
	
	action 'provide power with control': 'Provide Power With Control'(
		in fuelCmd: FuelCmd, 
		out wheelTorque1: Torque, 
		out wheelTorque2: Torque
	) {
		succession first startShot[0..1] then merge[1];
		
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
		
		action 'do provide power'[*] (
			in fuelCmd = 'provide power with control'::fuelCmd, 
			out wheelTorque1 = 'provide power with control'::wheelTorque1,
			out wheelTorque2 = 'provide power with control'::wheelTorque2
		) redefines 'provide power';
		
		succession first 'provide power'[1] then engineOff[1];		
	}
}