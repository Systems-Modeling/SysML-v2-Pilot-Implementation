package 'Binding Connectors Example-2' {
	import 'Port Example'::*;
	
	block Vehicle;
	block FuelPump;
	block FuelTank;
	
	part vehicle : Vehicle {	
		part tank : FuelTankAssembly {
			port redefines fuelTankPort {
				out ref redefines fuelSupply;
				in ref redefines fuelReturn;
			}
			
			part pump : FuelPump {
				out ref pumpOut : Fuel = fuelTankPort::fuelSupply;
				in ref pumpIn : Fuel;
			}
			
			part tank : FuelTank {
				out ref fuelOut : Fuel;
				in ref fuelIn : Fuel = fuelTankPort::fuelReturn;
			}
		}
	} 
}