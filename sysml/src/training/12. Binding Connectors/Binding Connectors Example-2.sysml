package 'Binding Connectors Example-2' {
	import 'Port Example'::*;
	
	part def Vehicle;
	part def FuelPump;
	part def FuelTank;
	
	part vehicle : Vehicle {	
		part tank : FuelTankAssembly {
			port redefines fuelTankPort {
				out ref item redefines fuelSupply;
				in ref item redefines fuelReturn;
			}
			
			part pump : FuelPump {
				out ref item pumpOut : Fuel = fuelTankPort::fuelSupply;
				in ref item pumpIn : Fuel;
			}
			
			part tank : FuelTank {
				out ref item fuelOut : Fuel;
				in ref item fuelIn : Fuel = fuelTankPort::fuelReturn;
			}
		}
	} 
}