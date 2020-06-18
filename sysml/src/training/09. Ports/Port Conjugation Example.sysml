package 'Port Conjugation Example' {
	
	value type Temp;
	
	block Fuel;
	
	port def FuelPort {
		value temperature : Temp;
		out ref fuelSupply : Fuel;
		in ref fuelReturn : Fuel;
	}
	
	block FuelTank {
		port fuelTankPort : FuelPort;
	}
	
	block Engine {
		port engineFuelPort : ~FuelPort;
	}
}