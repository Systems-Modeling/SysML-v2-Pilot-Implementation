/** Mandatory Services and Systems */
package AHFCoreLib {
	import AHFProfileLib::*;
	import ScalarValues::*;
	
	port def ServiceDiscovery :> SD{
		// The functionalities as Requests (Operations) cannot be defined yet
		// We could consider using flows to designate the functionalities
	}
		
	port def Authorize :> SD{
		publickey:String; // just as examples
	}
	
	block ArrowheadCore_SoSDD :> LocalCloud_SoSDD{
		block ServiceRegistry :> SysDD {
			port serviceDiscovery:ServiceDiscovery subsets services;
			ServiceRegistration subsets ServiceMethod;
		}
		
		block Authorization :> SysDD {
			port autorize:Authorize subsets services;
		}
		
		block Orchestration :> SysDD; // short for now
		
		part service_registry:ServiceRegistry subsets systems;
		part authorization:Authorization subsets systems;
		part orchestration:Orchestration subsets systems;
	}
}