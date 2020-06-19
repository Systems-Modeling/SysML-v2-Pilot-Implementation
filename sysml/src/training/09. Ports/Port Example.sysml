package 'Port Example' {
	
	attribute def Temp;
	
	part def Fuel;
	
	port def FuelOutPort {
		attribute temperature : Temp;
		ref out fuelSupply : Fuel;
		ref in fuelReturn : Fuel;
	}
	
	port def FuelInPort {
		attribute temperature : Temp;
		ref out fuelSupply : Fuel;
		ref in fuelReturn : Fuel;
	}
	
	part def FuelTankAssembly {
		port fuelTankPort : FuelOutPort;
	}
	
	part def Engine {
		port engineFuelPort : FuelInPort;
	}
}