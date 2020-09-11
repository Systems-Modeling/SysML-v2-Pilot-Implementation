package 'Streaming Example' {
	import 'Port Example'::*;
	
	part def Vehicle;
	
	interface def FuelInterface {
		end supplierPort : FuelOutPort;
		end consumerPort : FuelInPort;
	}
	
	part vehicle : Vehicle {
		part tankAssy : FuelTankAssembly {
			port :>> fuelTankPort {
				out item :>> fuelSupply;
				in item :>> fuelReturn;
			}
		}
		
		part eng : Engine {
			port :>> engineFuelPort {
				in item :>> fuelSupply;
				out item :>> fuelReturn;
			}
		}
		
		stream of Fuel
		  from tankAssy::fuelTankPort::fuelSupply
			to eng::engineFuelPort::fuelSupply;
			
		stream of Fuel
		  from eng::engineFuelPort::fuelReturn
			to tankAssy::fuelTankPort::fuelReturn;
	} 
}