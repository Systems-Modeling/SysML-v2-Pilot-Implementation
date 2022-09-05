package ServerSequenceOutsideRealization_2 {
	import ServerSequenceModelOutside::*;
	import Configuration::*;
	
	package Configuration {
		
		port def PublicationPort;
		
		port def SubscriptionPort;
		
		part producer_2[1] {
			attribute someTopic : String;
			private item somePublication;
			/* Review: Requiring default sort (incoming transfers/events handled in order they arrive)
			 * to make arrival/leave ordering in ServerSequenceModelOutside.sysml equivalent to accept/send
			 * ordering in ServerSquenceRealization-2.sysml. Could bring back isAcceptFirst to
			 * make this less wordy. */
			feature :>> incomingTransferSort = Occurrences::earlierFirstIncomingTransferSort;
			
			port publicationPort : ~PublicationPort;
			
			perform action producerBehavior {
				action publish send Publish(someTopic, somePublication) to publicationPort;
			}
		}
		
		interface producer_2.publicationPort to server_2.publicationPort {
			bind source::outgoingTransfersFromSelf = target::incomingTransfersToSelf;
		}
		
		part server_2[1] {
			port publicationPort : PublicationPort;
			port subscriptionPort : SubscriptionPort;
			feature :>> incomingTransferSort = Occurrences::earlierFirstIncomingTransferSort;
			
			exhibit state serverBehavior {
				entry; then waitForSubscription;
				
				state waitForSubscription;
				/* Review: Assumes "via" keyword parses as binding Transition::triggerTarget to whatever's after it. */
				transition subscribing
					first waitForSubscription
					accept sub : Subscribe via subscriptionPort
					then waitForPublication;
					
				state waitForPublication;
				transition delivering
					first waitForPublication
					accept pub : Publish via publicationPort
					if pub.topic == subscribing.sub.topic
					do send Deliver(pub.publication) to subscribing.sub.subscriber
					then waitForPublication;
			}
		}
		
		interface consumer_2.subscriptionPort to server_2.subscriptionPort {
			bind source::outgoingTransfersFromSelf = target::incomingTransfersToSelf;
		}
		
		part consumer_2[1] {
			attribute myTopic : String;
			feature :>> incomingTransferSort = Occurrences::earlierFirstIncomingTransferSort;
			
			port subscriptionPort : ~SubscriptionPort;
			
			perform action consumerBehavior {
				action subscribe send Subscribe(myTopic, consumer_2) to server_2;
				then action delivery accept Deliver via consumer_2;
			}
		}
		
	}
	
	part realization_2 : PubSubSequence {

		/* Review: Setting source/target.
		 * Could avoid referring the kernel by possibly 1) have "message" parse to
		 * this additional type, with a new keyword for non-commit, eg, in ServerSequenceMpodel.sysml.
		 * 2) partitioning FlowConnection into messages and flows, like Transfer is, or
		 * 3) by collapsing Message/Flow Transfer into Transfer. */
		message :>> publish_message: Transfers::MessageTransfer {
 			end :>> source = producer;
 			end :>> target = server;
 		}
		message :>> subscribe_message: Transfers::MessageTransfer {
 			end :>> source = consumer;
 			end :>> target = server;
 		}
		message :>> deliver_message: Transfers::MessageTransfer {
 			end :>> source = server;
 			end :>> target = consumer;
 		}
 		
 		/* Review: Bindings that were here not needed with earlierFirstIncomingTransferSort 
 		 * required in participants above. */
	}
}