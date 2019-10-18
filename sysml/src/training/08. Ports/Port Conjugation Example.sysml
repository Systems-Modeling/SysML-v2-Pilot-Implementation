package 'Port Conjugation Example' {
	
	value type Temp;
	
	block Fuel;
	
	port def FuelPort {
		value temperature : Temp;
		ref out fuelSupply : Fuel;
		ref in fuelReturn : Fuel;
	}
	
	block FuelTank {
		port fuelTankPort : FuelPort;
	}
	
	block Engine {
		port engineFuelPort : ~FuelPort;
	}
}