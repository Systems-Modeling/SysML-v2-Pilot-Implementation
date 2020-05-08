/** This is the very start of a library for Arrowhead Framework
 * I will be experimenting
 */

package AHFProfileLib {
	/** Services and (later) functionalities */
	import Performances::Performance;
	import ScalarValues::*;
	
	port def SD{
		/* operation service1  
		 * operations do not seem to be included yet*/
		serviceDefinition:String;
		serviceURL:String;
		intrfce_protocol:String; // which may be "REST" or "MQTT" etc.		 
	}
	
	/** System of Systems */
	
	block Arrowhead_SoSD {
	
		/** System definitions */
	
		block SysD {
			port services: SD[1..*];
			systemname: String;
			address: String;
			portno: Integer;
		}
		
		block SysDD :> SysD{
			ServiceMethod:Performance[1..*]; //means behaviors
		}
	}
	
	block LocalCloud_SoSDD :> Arrowhead_SoSD {
		part systems:SysD[1..*];
	}	

}
