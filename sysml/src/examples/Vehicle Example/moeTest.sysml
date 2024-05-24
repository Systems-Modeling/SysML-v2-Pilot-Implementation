package init{
	import ParametersOfInterestMetadata::mop;
	attribute time :> ISQ::time;
	#mop attribute mass;
}

package SimpleVehicleModel{
	package GenericContext {
    	part def Context;
    	part transportPassenger;
    }
	 package MissionContext{
	 	import ParametersOfInterestMetadata::moe;
	 	
        package ContextDefinitions{
            part def MissionContext:>GenericContext::Context;
            
            use case def TransportPassenger{
            	actor environment;
            }
         
	        package TransportPassengerScenario{
	        	import ContextDefinitions::TransportPassenger;
	        	
	        	use case transportPassenger:TransportPassenger{
	        		first start; 
	        	}
	                   
	        	part missionContext:ContextDefinitions::MissionContext{
	            	#moe attribute transportTime :> ISQ::time;
	//            	perform transportPassenger;
	            }
	        }       
		}
	}
}
