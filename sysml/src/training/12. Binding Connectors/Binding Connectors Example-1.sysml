package 'Binding Connectors Example-1' {
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
			
			bind fuelTankPort::fuelSupply = pump::pumpOut;
			bind fuelTankPort::fuelReturn = tank::fuelIn;
			
			part pump : FuelPump {
				out ref item pumpOut : Fuel;
				in ref item pumpIn : Fuel;
			}
			
			part tank : FuelTank {
				out ref item fuelOut : Fuel;
				in ref item fuelIn : Fuel;
			}
		}
	} 
}