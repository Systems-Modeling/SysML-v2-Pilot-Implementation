package 'Binding Connectors Example-2' {
	import 'Port Example'::*;
	
	block Vehicle;
	block FuelPump;
	block FuelTank;
	
	part vehicle : Vehicle {	
		part tank : FuelTankAssembly {
			port redefines fuelTankPort {
				ref out redefines fuelSupply;
				ref in redefines fuelReturn;
			}
			
			part pump : FuelPump {
				ref out pumpOut : Fuel = fuelTankPort::fuelSupply;
				ref in pumpIn : Fuel;
			}
			
			part tank : FuelTank {
				ref in fuelOut : Fuel;
				ref in fuelIn : Fuel = fuelTankPort::fuelReturn;
			}
		}
	} 
}