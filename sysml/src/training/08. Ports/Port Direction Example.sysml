package 'Port Direction Example' {
	
	value type Temp;
	
	block Fuel;
	
	port def FuelPort {
		value temperature : Temp;
		ref out fuelSupply : Fuel;
		ref in fuelReturn : Fuel;
	}
	
	block FuelTank {
		port out fuelTankPort : FuelPort;
	}
	
	block Engine {
		port in engineFuelPort : FuelPort;
	}
}