package StatePerformances {
	doc
	/*
	 * This package contains a library model of the semantics of state-based behavior,
	 * including the performance of (behavioral) states and the transitions between them.
	 */

	private import ScalarValues::Boolean;
	private import ScalarValues::Natural;
	private import TransitionPerformances::TransitionPerformance;
	private import Occurrences::HappensDuring;
	private import Transfers::Transfer;
	private import Performances::Performance;
	private import ControlPerformances::DecisionPerformance;
	private import ControlFunctions::forAll;
	private import ControlFunctions::select;
	private import ControlFunctions::collect;
	private import SequenceFunctions::*;
	
	behavior StatePerformance specializes DecisionPerformance {
		feature isTriggerDuring: Boolean default true;

		abstract step middle[1..*] {
			doc
			/*
			 * All modeler-defined steps must subset this.
			 */
		}
		
		/* 
		 * Note: All steps are implicitly considered to be enclosedPerformances,
		 * and hence happening during the state performance.
		 */
		
		step entry[1];
		step do[1] subsets middle;
		step exit[1];
		
		step nonDoMiddle[*] subsets middle = middle->excluding(do);

		private succession entry[1] then middle[*];
		private succession do.startShot[1] then nonDoMiddle.startShot[*];
		private succession nonDoMiddle.endShot[*] then do.endShot[1];
		private succession middle[*] then exit[1];

		private inv { isEmpty(accepted) == isEmpty(acceptable) }
		feature accepted: Transfer[0..1] subsets acceptable;
		feature deferrable: Transfer[0..*] subsets acceptable;
		abstract feature acceptable: Transfer[*] {
			feature thatSP : StatePerformance [1] = that as StatePerformance;
			feature accableT : Transfer redefines self;
			feature accT : Transfer = thatSP.accepted;
			  /* Review: accepted must be “earlier” than rest of acceptable in sort order.
		 	   * TBD: Transfers arriving at same time. */
			inv { accableT == accT | incomingTransferSort(accT, accableT) }
   
   	  			    /* Review: Ignore oSPs that start exiting later in time than thatSP,
				     * taking exist.start as end of matching. */
			   		/* Review:
	       			 * 1) acceptable must not be accepted by any oSPs (earlier in
	       			 *    time, see above) and must be later in sort order than any
	       			 *    accepted of those, treating them as dispatched already, …
	       			 * 2) … except if they were deferrable. */ 
			inv { isDispatch implies
				     allSubstatePerformances(dispatchScope)->forAll{in oSP : StatePerformance;						
						  oSP == thatSP | isEmpty(oSP.accepted) |
	   					  includes(thatSP.exit.startShot.successors, oSP.exit.startShot) |
						  ( oSP.accepted != accableT & 
							( incomingTransferSort(oSP.accepted, accableT) |
							  includes(oSP.deferrable, accableT) ) ) } }
		}
		
		function allSubstatePerformances {
			in p : Performance [1];
			feature substatePerformances: StatePerformance [*] =
				p.subperformances->select{in subp:Performance; subp istype StatePerformance};
				/* Review: Check recursion. Use ( , ) instead of union? */
			return  : StatePerformance [*] =
				union(substatePerformances,  
					  substatePerformances->collect{in sp:StatePerformance; allSubstatePerformances(sp) } );
		}
		
		private succession do[1] then accepted.endShot[0..1];
		
		private succession acceptable[*] then exit[1];
		
		feature redefines isRunToCompletion default this.isRunToCompletion;
		feature redefines runToCompletionScope default this.runToCompletionScope; 
		/* RTC taken as preventing all trans perfs in scope from overlapping entry
	 	 * performances in time. */
		inv { isRunToCompletion implies
			     allSubtransitionPerformances(runToCompletionScope)->forAll{in tp : TransitionPerformance;
				    includes(tp.successors, entry) | includes(tp.predecessors, entry) }
		}
		
		function allSubtransitionPerformances { /* Review: Assumes NonStateTransitionPerformances are also under RTC. */
			in p : Performance [1];
			feature subtransitionPerformances: TransitionPerformance [*] =
	 			 p.subperformances->select{in subp:Performance;
		 			   subp istype StateTransitionPerformance };
			/* Review: Check recursion. Use ( , ) instead of union? */
			return  : TransitionPerformance [*] =
				union(subtransitionPerformances,  
		      		subtransitionPerformances->collect{in sp:TransitionPerformance; 
							 		allSubtransitionPerformances(sp) } ); }
		}
	
	behavior StateTransitionPerformance specializes TransitionPerformance {
		feature isTriggerDuring: Boolean[1];
		inv { not transitionLinkSource.isTriggerDuring | isTriggerDuring  }

		in feature transitionLinkSource: StatePerformance redefines TransitionPerformance::transitionLinkSource {
			feature redefines accepted;
			feature redefines StatePerformance::acceptable;
		}
		private succession transitionLinkSource.nonDoMiddle[*] then Performance::self[1];
		
		feature acceptable: Transfer [*] subsets transitionLinkSource.acceptable, triggerTarget.incomingTransfersToSelf;

		feature trigger redefines TransitionPerformance::trigger subsets acceptable, transitionLinkSource.accepted {
			feature redefines endShot;
		}
		
		private feature tdNum: Natural [1] = if not isTriggerDuring ? 0 else size(trigger);
		private connector linkTriggerDuring: HappensDuring[tdNum] from trigger.endShot[*] to transitionLinkSource[0..1];
		
		private succession all transitionLinkSource.middle[1..*] then guard[*];
		private succession guard[*] then transitionLinkSource.exit[1];
	}
}