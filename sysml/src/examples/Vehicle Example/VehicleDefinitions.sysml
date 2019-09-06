/**
 * Example vehicle definitions model.
 **/
package VehicleDefinitions {
	import ScalarValues::*;
	import Quantities::*;
	import UnitsAndScales::*;
	import ISQ::*;
	import SI::*;
	
	/* BLOCKS */
	
	block Vehicle;	
	block Transmission;	
	block AxleAssembly;
	block Axle;	
	block Wheel;
	block Lugbolt {
		value tighteningTorque is ISQ::torque;
	}
	
	/* INTERFACE BLOCKS */
	
	port def DriveIF { 
		in driveTorque:> ISQ::torque;
	}
	
	port def AxleMountIF { 
		out transferredTorque is ISQ::torque;
	}
	
	port def WheelHubIF { 
		in appliedTorque is ISQ::torque;
	}
	
	/* ASSOCIATION BLOCKS */
	
	/** An association intended to be used as the type of a connector
	 *  mounting a Wheel to an Axle.
	 **/
	interface def Mounting {
		end axleMount: AxleMountIF;
		end hub: WheelHubIF;
	}
}