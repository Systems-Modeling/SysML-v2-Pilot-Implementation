package 'Port Example' {
	
	value type Temp;
	
	block Fuel;
	
	port def FuelOutPort {
		value temperature : Temp;
		out ref fuelSupply : Fuel;
		in ref fuelReturn : Fuel;
	}
	
	port def FuelInPort {
		value temperature : Temp;
		out ref fuelSupply : Fuel;
		in ref fuelReturn : Fuel;
	}
	
	block FuelTankAssembly {
		port fuelTankPort : FuelOutPort;
	}
	
	block Engine {
		port engineFuelPort : FuelInPort;
	}
}