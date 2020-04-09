package 'Streaming Interface Example' {
	import 'Port Example'::*;
	
	block Vehicle;
	
	interface def FuelInterface {
		end supplierPort : FuelOutPort {
			ref out fuelSupply;
			ref in fuelReturn;			
		}
		end consumerPort : FuelInPort {
			ref in fuelSupply;
			ref out fuelReturn;
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