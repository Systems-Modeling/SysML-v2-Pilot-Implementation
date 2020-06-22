package 'Binding Connectors Example-1' {
	import 'Port Example'::*;
	
	part def Vehicle;
	part def FuelPump;
	part def FuelTank;
	
	part vehicle : Vehicle {	
		part tank : FuelTankAssembly {
			port redefines fuelTankPort {
				out ref redefines fuelSupply;
				in ref redefines fuelReturn;
			}
			
			bind fuelTankPort::fuelSupply = pump::pumpOut;
			bind fuelTankPort::fuelReturn = tank::fuelIn;
			
			part pump : FuelPump {
				out ref pumpOut : Fuel;
				in ref pumpIn : Fuel;
			}
			
			part tank : FuelTank {
				out ref fuelOut : Fuel;
				in ref fuelIn : Fuel;
			}
		}
	} 
}