package 'Streaming Example' {
	import 'Port Example'::*;
	
	part def Vehicle;
	
	interface def FuelInterface {
		end supplierPort : FuelOutPort;
		end consumerPort : FuelInPort;
	}
	
	part vehicle : Vehicle {
		part tankAssy : FuelTankAssembly {
			port fuelTankPort {
				out ref fuelSupply;
				in ref fuelReturn;
			}
		}
		
		part eng : Engine {
			port engineFuelPort {
				in ref fuelSupply;
				out ref fuelReturn;
			}
		}
		
		stream Fuel
		  from tankAssy::fuelTankPort::fuelSupply
			to eng::engineFuelPort::fuelSupply;
			
		stream Fuel
		  from eng::engineFuelPort::fuelReturn
			to tankAssy::fuelTankPort::fuelReturn;
	} 
}