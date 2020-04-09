package 'State Actions' {
	
	value type VehicleStartSignal;
	value type VehicleOnSignal;
	value type VehicleOffSignal;
	
	block Vehicle;
	
	action performSelfTest(in vehicle : Vehicle);
	
	state def VehicleStates (operatingVehicle : Vehicle);
		
	state vehicleStates : VehicleStates 
		(operatingVehicle : Vehicle) {
			
		entry; then off;
		
		state off;
		accept VehicleStartSignal 
			then starting;
			
		state starting;
		accept VehicleOnSignal
			then on;
			
		state on {
			entry performSelfTest(in vehicle = operatingVehicle);
			do action providePower { /* ... */ }
			exit action applyParkingBrake { /* ... */ }
		}
		accept VehicleOffSignal
			then off;
	}
	
}