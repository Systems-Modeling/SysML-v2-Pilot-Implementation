package execution_unitcase_abc_xyz {
	
	doc
	/*
	 * This case demonstrates that a model that:
	 * _____
	 * results in:
	 * _____.
	 * Model Description: Simple Declaration of Structure
	 * Expectation: Instantiation of Correct Values
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
	
	package ExecutedTraces {
		
		private import Execution::*;
		private import Occurrences::*;
		private import SuccessionFlow::*;

		doc
		/*
		 * A model that represents the M0 instantiation of the User's M1 model
		 * by using specially annotated model denoting each instance and all of its
		 * structural feature values and behavioral steps explicitly stated.	
		 * 
		 * Note - When instantiating usages, use a consistent naming scheme
		 *        that appends a monotonically increasing sequence number 
		 *        to the end of the existing name from the unit case model.		
		 */
		
		case def Trace :> ExecutionContext {
			
			occurrence TraceBehaviorSlice : BehaviorSlice {
				:>> that : Trace;
			}
			
			occurrence TraceValueSlice : ValueSlice {
				:>> that : Trace;
			}
			
			/* Flows come with 2 connectors that change in time, want to have 
			 * trace for them:
			 * 
			 * sourceOutputLink
			 * targetInputLink
			 */
			
			/* Only care about packet value when action is active. */
			
			timeslice x0 :> TraceValueSlice {
				:>> s.'Step 1'.pkt = s.set_pkt;
				:>> s.'Pass Packet'.payload = null;
				:>> s.'Step 2'.pkt = null;
				:>> valueStart = that.'Trace Frame 1'.startShot;
				/* output leaves the action */
				:>> valueEnd = that.'Trace Frame 2'.'Trace Frame 2.1'.endShot;
			}
			
			/* Is there a moment of overlap where payload is both in the transfer but
			 * also on the source feature?
			 * 
			 * end [1] feature transferSource references source;
			 * end [itemNum] feature transferPayload references item subsets transferSource.sourceOutput;
			 */
			 
			then timeslice x1_0 :> TraceValueSlice {
				:>> s.'Step 1'.pkt = s.set_pkt;
				:>> s.'Pass Packet'.payload = s.set_pkt;
				:>> s.'Step 2'.pkt = null;
				:>> valueStart = that.'Trace Frame 2'.'Trace Frame 2.1'.startShot;
				:>> valueEnd = that.'Trace Frame 2'.'Trace Frame 2.1'.endShot;
			}
			
			then timeslice x1_1 :> TraceValueSlice {
				:>> s.'Step 1'.pkt = null;
				:>> s.'Pass Packet'.payload = s.set_pkt;
				:>> s.'Step 2'.pkt = null;
				:>> valueStart = that.'Trace Frame 2'.'Trace Frame 2.2'.startShot;
				:>> valueEnd = that.'Trace Frame 2'.'Trace Frame 2.2'.endShot;
			}
			
			then timeslice x1_2 :> TraceValueSlice {
				:>> s.'Step 1'.pkt = null;
				:>> s.'Pass Packet'.payload = s.set_pkt;
				:>> s.'Step 2'.pkt = s.set_pkt;
				:>> valueStart = that.'Trace Frame 2'.'Trace Frame 2.3'.startShot;
				:>> valueEnd = that.'Trace Frame 2'.'Trace Frame 2.3'.endShot;
			}
			
			then timeslice x2 :> TraceValueSlice {
				:>> s.'Step 1'.pkt = null;
				:>> s.'Pass Packet'.payload = null;
				:>> s.'Step 2'.pkt = s.set_pkt;
				/* input arrives at the action */
				:>> valueStart = that.'Trace Frame 2'.'Trace Frame 2.3'.startShot;
				:>> valueEnd = that.'Trace Frame 3'.endShot;
			}
			
			// Timeslices below are a simple procession from each of the subactions of the 
			// verification subject action.
			
			timeslice 'Trace Frame 0' :> TraceBehaviorSlice {
				:>> activeSteps = s.start;
				:>> inactiveSteps = (s.'Step 1', s.'Pass Packet', s.'Step 2', s.done);
			}
			then timeslice 'Trace Frame 1' :> TraceBehaviorSlice {
				:>> activeSteps = s.'Step 1';
				:>> inactiveSteps = (s.start, s.'Pass Packet', s.'Step 2', s.done);
			}
			then timeslice 'Trace Frame 2' :> TraceBehaviorSlice {
				:>> activeSteps = s.'Pass Packet';
				:>> inactiveSteps = (s.start, s.'Step 1', s.done);
				
				// covers sending
				timeslice 'Trace Frame 2.1' :> TraceBehaviorSlice {
					/* Slice starts concurrently with parent */
					:>> start subsets that.start;
					:>> activeSteps = (s.'Pass Packet'.start, s.'Pass Packet'.sourceOutputLink);
					:>> inactiveSteps = (s.'Pass Packet'.targetInputLink);
				}
				// if move is true, and push is true, sourceOutputlink is coincident with transfer start shot
				snapshot 'Trace Frame 2.2' :> TraceBehaviorSlice {
					/* Transfer is active but the output and input aren't happening */
					:>> activeSteps = ();
					:>> inactiveSteps = (s.'Pass Packet'.sourceOutputLink, s.'Pass Packet'.targetInputLink);
				}
				
				// covers delivery - always coincident 
				snapshot 'Trace Frame 2.3' :> TraceBehaviorSlice {
					/* Slice ends concurrently with parent */
					:>> done subsets that.done;
					:>> activeSteps = (s.'Pass Packet'.done, s.'Pass Packet'.targetInputLink);
					:>> inactiveSteps = (s.'Pass Packet'.sourceOutputLink);
				}
			}
			then timeslice 'Trace Frame 3' :> TraceBehaviorSlice {
				:>> activeSteps = s.'Step 2';
				:>> inactiveSteps = (s.start, s.'Step 1', s.'Pass Packet', s.done);
			}
			then timeslice 'Trace Frame 4' :> TraceBehaviorSlice {
				:>> activeSteps = s.done;
				:>> inactiveSteps = (s.start, s.'Step 1', s.'Pass Packet', s.'Step 2');
			}
		}
		
	}
}

