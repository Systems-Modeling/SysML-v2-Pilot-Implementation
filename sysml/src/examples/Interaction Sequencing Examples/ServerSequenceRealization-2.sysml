package ServerSequenceRealization_2 {
	import ServerSequenceModel::*;
	import Configuration::*;
	
	package Configuration {
		
		port def PublicationPort;
		
		port def SubscriptionPort;
		
		part producer_2[1] {
			attribute someTopic : String;
			private item somePublication;
			
			port publicationPort : ~PublicationPort;
			
			perform action producerBehavior {	
				/* Review: See SendAction note on "via" when sending out through ports. Avoids port forwarding. */
				action publish send Publish(someTopic, somePublication) to publicationPort;
			}
		}
		
		interface producer_2.publicationPort to server_2.publicationPort {
			  /* Review: What if more than one connector to/from these ports? */
			bind source::outgoingTransfersFromSelf = target::incomingTransfersToSelf;
		}
		
		part server_2[1] {
			port publicationPort : PublicationPort;
			port subscriptionPort : SubscriptionPort;
			
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
			
			port subscriptionPort : ~SubscriptionPort;
			
			perform action consumerBehavior {
				/* Review: This should send to subscriptionPort, right?
				 * See SendAction note on "via" when sending out through ports. Avoids port forwarding. */
				action subscribe send Subscribe(myTopic, consumer_2) to server_2;
				then action delivery accept Deliver via consumer_2;
			}
		}
		
	}
	
	part realization_2 : PubSubSequence {
		part :>> producer :> producer_2 {
			event producerBehavior.publish[1] :>> publish_source_event;
		}

		part :>> server :> server_2 {
			event serverBehavior.subscribing.accepter[1] :>> subscribe_target_event;
			event serverBehavior.delivering.accepter[1] :>> publish_target_event;
			event serverBehavior.delivering.effect[1] :>> deliver_source_event;
		}
		
		part :>> consumer :> consumer_2 {
			event consumerBehavior.subscribe[1] :>> subscribe_source_event;
			event consumerBehavior.delivery[1] :>> deliver_target_event;
		}

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
 		
 		/* Review: Binding sent/accept messages to spec model messages. */
		  /* Sends */
 		bind producer_2.producerBehavior.publish.sentMessage = publish_message;
 		bind consumer_2.consumerBehavior.subscribe.sentMessage = subscribe_message;
 		bind server_2.serverBehavior.delivering.effect.sentMessage = deliver_message;
 		  /* Accepts */
 		  /* Review: Maybe could shorten navigation by binding and specializing type of 
		   * events in parts, then these would be event.acceptedMessage. */
 		bind consumer_2.consumerBehavior.delivery.acceptedMessage = subscribe_message;
 		bind server_2.serverBehavior.subscribing.accepter.acceptedMessage = subscribe_message;
 		bind server_2.serverBehavior.delivering.accepter.acceptedMessage = publish_message;
	}
}