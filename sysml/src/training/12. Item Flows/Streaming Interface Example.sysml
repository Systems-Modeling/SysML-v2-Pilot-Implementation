package 'Streaming Interface Example' {
	import 'Port Example'::*;
	
	block Vehicle;
	
	interface def FuelInterface {
		end supplierPort : FuelOutPort {
			out ref fuelSupply;
			in ref fuelReturn;			
		}
		end consumerPort : FuelInPort {
			in ref fuelSupply;
			out ref fuelReturn;
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