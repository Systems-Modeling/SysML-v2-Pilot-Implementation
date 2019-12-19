package 'Generalization Example' {

	abstract block Vehicle;
	
	block HumanDrivenVehicle specializes Vehicle {
		ref driver : Person;
	}
	
	block PoweredVehicle :> Vehicle {
		part eng : Engine;
	}
	
	block HumanDrivenPoweredVehicle :> 
		HumanDrivenVehicle, PoweredVehicle;
	
	block Engine;	
	block Person;
	
}