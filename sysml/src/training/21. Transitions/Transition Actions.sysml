package 'Transition Actions' {
	
	value type VehicleStartSignal;
	value type VehicleOnSignal;
	value type VehicleOffSignal;
	
	value type ControllerStartSignal;
	
	block Vehicle {
		brakePedalDepressed : ScalarValues::Boolean;
	}
	block VehicleController;
	
	action performSelfTest(in vehicle : Vehicle);
	
	state def VehicleStates (operatingVehicle : Vehicle);
		
	state vehicleStates : VehicleStates (
		operatingVehicle : Vehicle,
		controller : VehicleController) {

		entry; then off;
		
		state off;
		accept VehicleStartSignal 
			then starting;
			
		state starting;
		accept VehicleOnSignal
			if operatingVehicle::brakePedalDepressed
			do send ControllerStartSignal() to controller
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