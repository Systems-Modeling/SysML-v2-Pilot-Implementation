package execution_unitcase_succession_flow {
	
	doc
	/*
	 * This case demonstrates that a model that:
	 * contains a default succession flow
	 * results in:
	 * A payload moved form source to target.
	 * Model Description: Simple succession flow between two steps.
	 * Expectation: Transfer occurs between steps and moves payload.
	 */
	
	package SuccessionFlow {
		private import ScalarValues::*;
		
		doc
		/* This example is illustration of a succession flow between two elements.
		 */
		
		case def ExecutionContext {
			subject s [1] : 'Simple Step Flow';
		}
		
		item def 'Packet' {
			doc /* Packet is a discrete piece of information to send. */
		}
		
		action def 'Simple Step Flow' {
			action 'Step 1' {
				/* Don't know semantics of setting this later */
				out pkt : 'Packet' [0..1] = set_pkt;
			}
			action 'Step 2' {
				in pkt : 'Packet' [0..1] = ();
			}
			
			item set_pkt : 'Packet' [1];
			
			first start then 'Step 1';
			/* Keep in mind this has Step 1 as first occurrence, Step 2 as second */
			
			/* Succession means that Step 1 ends before transfer, transfer ends before Step 2 because of
			 * private succession source then self;
	  	     * private succession self then target;
	  	     * inside TransferBefore
			 */
			succession flow 'Pass Packet' of 'Packet' [1] from 'Step 1'.pkt to 'Step 2'.pkt;
			first 'Step 2' then done;
		}
	}
}

