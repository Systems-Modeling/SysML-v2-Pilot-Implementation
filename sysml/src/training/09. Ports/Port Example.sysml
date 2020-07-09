package 'Port Example' {
	
	attribute def Temp;
	
	part def Fuel;
	
	port def FuelOutPort {
		attribute temperature : Temp;
		out ref fuelSupply : Fuel;
		in ref fuelReturn : Fuel;
	}
	
	port def FuelInPort {
		attribute temperature : Temp;
		out ref fuelSupply : Fuel;
		in ref fuelReturn : Fuel;
	}
	
	part def FuelTankAssembly {
		port fuelTankPort : FuelOutPort;
	}
	
	part def Engine {
		port engineFuelPort : FuelInPort;
	}
}