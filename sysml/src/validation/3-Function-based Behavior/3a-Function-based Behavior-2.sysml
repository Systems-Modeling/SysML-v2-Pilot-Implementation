package '3a-Function-based Behavior-2' {
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
		first startShot;
		then[0..1] action merge: Merge[*];
		then accept engineStart (EngineStart);
		then accept engineOff (EngineOff);
		then[0..1] merge;
		
		first engineStart;
		then action redefines 'provide power' (
			in fuelCmd = 'Provide Power With Control'::fuelCmd, 
			out wheelTorque1 = 'Provide Power With Control'::wheelTorque1,
			out wheelTorque2 = 'Provide Power With Control'::wheelTorque2
		);
		then engineOff;
	}
}