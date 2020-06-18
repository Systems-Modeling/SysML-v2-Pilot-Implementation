/** This is the Norwegian use-case for Arrowhead Framework */
package AHFNorway {
	// The use-case is for Productive4.0 and Arrowhead Tools
	// The system is taken from a chemical factory
	// This is focusing on the monitoring of products when delivered
	import AHFProfileLib::*;
	import AHFCoreLib::*;
	import ScalarValues::*;
	
	port def APISService :> SD{
		serviceDefinition = "APISPullService";
		intrfce_protocol = "{JSON}";
		serviceURL = "pull";
		// functionalities 
		out ref action getAllItems; // referring to generic functionality
	}
	
	value type Subscribe_getAllItems;
	value type Return_AllItems {itms:String;}
	
	block AHFNorway_SoSD :> ArrowheadCore_SoSDD {
		
		block APISConsumer :> SysDD{
			port serviceDiscovery:~ServiceDiscovery subsets services; // communicating with ServiceRegistry
			port apis:~APISService subsets services; // consuming the APISService
			systemname = "UngerApisClient";
			address = "Unger_network_ip"; 
			portno = 0;
			
			// Now calling the remote behavior through the port functionality
			consumeditems:String;
			perform apis::getAllItems(out consumeditems);
		}
		
		block APISProducer :> SysDD{
			port serviceDiscovery:~ServiceDiscovery subsets services; // communicating with ServiceRegistry
			port apis:APISService subsets services { // providing the APISService
				out ref action :>> getAllItems;
			}
			port tellu:APISService subsets services { // talking to TellU
				out ref action :>> getAllItems;
			}
			
			// specializing the functionality implementation towards REST
			activity RESTGetAllItems(allitms:String) {/* Getting all items into the String by REST */}
			private action restGetAllItems:RESTGetAllItems subsets ServiceMethod;
			bind apis::getAllItems = restGetAllItems;
			
			// specializing the functionality implementation towards MQTT
			state def MQTTGetAllItems {/* Getting all items into the String by MQTT */}
			private state mqttGetAllItems:MQTTGetAllItems();
			bind tellu::getAllItems = mqttGetAllItems;			
			
			systemname = "PrediktorApisServer";
			address = "Prediktor_network_ip";
			portno = 6565;
		}
		
		block TellUConsumer :> SysDD{
			port serviceDiscovery:~ServiceDiscovery subsets services; // communicating with ServiceRegistry
			port tellu:~APISService subsets services;
			systemname = "TellUClient";
			address = "Prediktor_network_ip";
			portno = 1;
			
			// Now sending signal to the remote behavior through the port functionality
			state MQTT_TellU {
				entry;
				then Init;		
				state Init;
					do send Subscribe_getAllItems() to tellu 
					then Idle;					
				state Idle;
					accept Return_AllItems
					// Get the items and do something with them
					then Idle;				
			}
		}

 		part telluc:TellUConsumer subsets systems {
 			port redefines serviceDiscovery;
 			port redefines tellu;
 		}
 		part apisp:APISProducer subsets systems {
  			port redefines serviceDiscovery;
 			port redefines apis;
 			port redefines tellu;
 		}
 		part apisc:APISConsumer subsets systems {
 			port redefines serviceDiscovery;
 			port redefines apis;
 		}
 		part service_registry redefines service_registry {
 			port redefines serviceDiscovery;
 		}
 		
 		connect apisp::tellu to telluc::tellu; // from TelluCloud to APIS at Prediktor
 		connect apisp::apis to apisc::apis; // from Prediktor to Unger
 		
 		// Then we need to connect the application systems to the mandatory systems
 		connect apisp::serviceDiscovery to service_registry::serviceDiscovery; 
 		connect apisc::serviceDiscovery to service_registry::serviceDiscovery;
 		connect telluc::serviceDiscovery to service_registry::serviceDiscovery;
 		
 		// Same procedure for the other mandatory services
		
	}
	
}