package 'Streaming Example' {
	import 'Port Example'::*;
	
	block Vehicle;
	
	interface def FuelInterface {
		end supplierPort : FuelOutPort;
		end consumerPort : FuelInPort;
	}
	
	part vehicle : Vehicle {
		part tankAssy : FuelTankAssembly {
			port fuelTankPort {
				ref out fuelSupply;
				ref in fuelReturn;
			}
		}
		
		part eng : Engine {
			port engineFuelPort {
				ref in fuelSupply;
				ref out fuelReturn;
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