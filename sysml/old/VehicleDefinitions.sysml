package VehicleDefinitions {
	
	valuetype Torque = PrimitiveTypes.Real N-m;
		
	block Vehicle {}
	
	block AxleAssembly {}
	
	block WheelHub {	}
	
	block Wheel {
		in hub: WheelHub; 
	}
	
	block Axle {
		out leftMountingPoint: WheelHub;
		out rightMountingPoint: WheelHub;
	}
	
	block Lugbolt {
		torque: Torque;
	}
	
}
