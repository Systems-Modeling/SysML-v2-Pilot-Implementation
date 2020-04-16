package 'Blocks Example' {
	import ScalarValues::*;
	
	block Vehicle {
		value mass : Real;
		value status : VehicleStatus;
		
		part eng : Engine;
		
		ref driver : Person;
	}
	
	value type VehicleStatus {
		gearSetting : Integer;
		acceleratorPosition : Real;
	}
	
	block Engine;	
	block Person;
}