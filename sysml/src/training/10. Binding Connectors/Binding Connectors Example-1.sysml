package 'Binding Connectors Example-1' {
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
			
			bind fuelTankPort::fuelSupply = pump::pumpOut;
			bind fuelTankPort::fuelReturn = tank::fuelIn;
			
			part pump : FuelPump {
				ref out pumpOut : Fuel;
				ref in pumpIn : Fuel;
			}
			
			part tank : FuelTank {
				ref in fuelOut : Fuel;
				ref in fuelIn : Fuel;
			}
		}
	} 
}