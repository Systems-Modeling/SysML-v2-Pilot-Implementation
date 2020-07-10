package 'Port Example' {
	
	attribute def Temp;
	
	part def Fuel;
	
	port def FuelOutPort {
		attribute temperature : Temp;
		out ref item fuelSupply : Fuel;
		in ref item fuelReturn : Fuel;
	}
	
	port def FuelInPort {
		attribute temperature : Temp;
		out ref item fuelSupply : Fuel;
		in ref item fuelReturn : Fuel;
	}
	
	part def FuelTankAssembly {
		port fuelTankPort : FuelOutPort;
	}
	
	part def Engine {
		port engineFuelPort : FuelInPort;
	}
}