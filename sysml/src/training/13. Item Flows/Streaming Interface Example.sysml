package 'Streaming Interface Example' {
	import 'Port Example'::*;
	
	part def Vehicle;
	
	interface def FuelInterface {
		end supplierPort : FuelOutPort {
			out ref item fuelSupply;
			in ref fuelReturn;			
		}
		end consumerPort : FuelInPort {
			in ref item fuelSupply;
			out ref item fuelReturn;
		}
		
		stream supplierPort::fuelSupply to consumerPort::fuelSupply;			
		stream consumerPort::fuelReturn to supplierPort::fuelReturn;
	}
	
	part vehicle : Vehicle {	
		part tankAssy : FuelTankAssembly {
			port redefines fuelTankPort;
		}
		
		part eng : Engine {
			port redefines engineFuelPort;
		}
		
		interface : FuelInterface connect 
			supplierPort => tankAssy::fuelTankPort to 
			consumerPort => eng::engineFuelPort;
	} 
}