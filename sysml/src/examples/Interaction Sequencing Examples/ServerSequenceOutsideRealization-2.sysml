package ServerSequenceOutsideRealization_2 {
	import ServerSequenceModelOutside::*;
	import Configuration::*;
	
	package Configuration {
		
		port def PublicationPort;
		
		port def SubscriptionPort;
		
		part producer_2[1] {
			attribute someTopic : String;
			private item somePublication;
			/* Requiring FIFO sort (as opposed to just default) to make arrival/leave ordering
			 * in ServerSequenceModelOutside.sysml equivalent to accept/send ordering in
			 * ServerSquenceRealization-2.sysml. */
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
		part :>> producer :> producer_2;
		part :>> server :> server_2;
		part :>> consumer :> consumer_2;

		message :>> publish_message: Transfers::MessageTransfer {
 			end :>> source = producer.publicationPort;
 			end :>> target = server.publicationPort;
 		}
		message :>> subscribe_message: Transfers::MessageTransfer {
 			end :>> source = consumer.subscriptionPort;
 			end :>> target = server.subscriptionPort;
 		}
		message :>> deliver_message: Transfers::MessageTransfer {
 			end :>> source = server;
 			end :>> target = consumer;
 		}
 		
 		/* Review: Bindings that were here not needed with earlierFirstIncomingTransferSort 
 		 * required in participants above. */
	}
}