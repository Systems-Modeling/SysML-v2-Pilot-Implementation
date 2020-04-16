package 'Port Example' {
	
	value type Temp;
	
	block Fuel;
	
	port def FuelOutPort {
		value temperature : Temp;
		ref out fuelSupply : Fuel;
		ref in fuelReturn : Fuel;
	}
	
	port def FuelInPort {
		value temperature : Temp;
		ref out fuelSupply : Fuel;
		ref in fuelReturn : Fuel;
	}
	
	block FuelTankAssembly {
		port fuelTankPort : FuelOutPort;
	}
	
	block Engine {
		port engineFuelPort : FuelInPort;
	}
}