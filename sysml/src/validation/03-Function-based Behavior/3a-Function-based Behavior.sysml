package '3a-Function-based Behavior' {
			
	// ITEMS
	
	value type FuelCmd;
	import ISQ::TorqueValue as Torque;
	
	// SIGNALS
	
	value type EngineStart;
	value type EngineOff;
	
	// ACTIVITIES
	
	activity 'Generate Torque'(in fuelCmd: FuelCmd, out engineTorque: Torque);
	activity 'Amplify Torque'(in engineTorque: Torque, out transmissionTorque: Torque);
	activity 'Transfer Torque'(in transmissionTorque: Torque, out driveshaftTorque: Torque);
	activity 'Distribute Torque'(in driveShaftTorque: Torque, out wheelTorque1: Torque, out wheelTorque2: Torque);
	
	activity 'Provide Power'(in fuelCmd: FuelCmd, out wheelTorque1: Torque, out wheelTorque2: Torque);
	
	// ACTIONS
	
	action 'provide power': 'Provide Power'(
		in fuelCmd: FuelCmd, 
		out wheelTorque1: Torque, 
		out wheelTorque2: Torque
	) {
		action 'generate torque': 'Generate Torque'(
			in fuelCmd = 'provide power'::fuelCmd,
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
	
	action 'provide power with control': 'Provide Power'(
		in fuelCmd: FuelCmd, 
		out wheelTorque1: Torque, 
		out wheelTorque2: Torque
	) {
		first start;
		then merge continue;
		then accept engineStart (EngineStart);
		then accept engineOff (EngineOff);
		then continue;
		
		first engineStart;
		then perform 'provide power' (
			in fuelCmd = 'provide power with control'::fuelCmd, 
			out wheelTorque1 = 'provide power with control'::wheelTorque1,
			out wheelTorque2 = 'provide power with control'::wheelTorque2
		);
		then engineOff;
	}
}