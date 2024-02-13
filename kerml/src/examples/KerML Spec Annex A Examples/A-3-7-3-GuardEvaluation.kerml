package Option2_GuardExpression {
	doc
	/*
	 * In this version, we put the decision logic inside the decision node.
	 */
	
	import ScalarValues::*;
	import ControlPerformances::*;
	import Performances::*;
	import Occurrences::*;
	import Links::*;
	import TransitionPerformances::*;
	
	function DecideGood {
		in quality_rating : Real;
		return : Boolean default = (quality_rating > 2.0);
	}
	
	function DecideBad {
		in quality_rating : Real;
		return : Boolean default = (quality_rating <= 2.0);
	}
	
	behavior Manufacture {
		
		bool decideGood : DecideGood;
		
		/* Before decision. */
		step admit : Admit [1];
		succession a_before_i first admit [1] then inspect [1];
		
		/* Decision. */
		step inspect : DecisionPerformance [*];
		
		/* Two decision branches. */
		/* Inspection passes. */
		succession i_before_f first inspect [1]  then finish [0..1];
		
		step test_i_before_f : NonStateTransitionPerformance {
			bool :>> guard : DecideGood [1];
			:>> transitionLink default = i_before_f;
		}
		
		step finish : Touchup [*];
		
		/* Inspection fails. */
		succession i_before_r first inspect [1] then recycle [0..1];
		
		step test_i_before_r : NonStateTransitionPerformance {
			:>> guard : DecideBad [1];
			:>> transitionLink default = i_before_r;
		}
		step recycle : MarkForRecycling [*];
		
		/* Two merge branches. */
		succession f_before_ms first finish [0..1] then mShip [1];
		succession r_before_ms first recycle [0..1] then mShip [1];
		
		/* Merge */
		step mShip : MergePerformance [*];
		
		/* After merge */
		succession ms_before_s first mShip [1] then ship [1];
		step ship : Ship [*];
		
		/* Decision and merge timing constraints. */
		feature inspectOutgoingHBLinks : HappensBefore [*] unions i_before_f, i_before_r;
		connector bindIOHBL : SelfLink
			from inspectOutgoingHBLinks [1] to inspect.outgoingHBLink [1];
		feature mShipIncomingHBLinks : HappensBefore [*] unions f_before_ms, r_before_ms;
		connector bindmSIHBL : SelfLink
			from mShipIncomingHBLinks [1] to mShip.incomingHBLink [1];
	
	}
	
	behavior Admit;
	behavior Touchup;
	behavior MarkForRecycling;
	behavior Ship;
	
}

package Option2_GuardExpression_Solved {
	import Atoms::*;
	import Option2_GuardExpression::*;
	
	/* Atoms for decisions made */
	function DecidedItGood :> DecideGood {
		in :>> quality_rating : Real = 2.5;
		return :>> result : Boolean = true;
		//portion :>> startShot = endShot;
	}
	
	function DecidedItBad :> DecideBad {
		in :>> quality_rating : Real = 2.5;
		return :>> result : Boolean = false;
		//portion :>> startShot = endShot;
	}
	
	behavior MyAdmit [1] specializes Admit;
	behavior MyInspect [1] specializes DecisionPerformance;
	behavior MyTouchup [1] specializes Touchup;
	behavior MyMarkForRecycling [1] specializes MarkForRecycling;
	behavior MyMergeToShip [1] specializes MergePerformance;
	behavior MyShip [1] specializes Ship;
	
	assoc MyAdmit_Before_Inspect_Link [1] specializes HappensBefore {
		end :>> earlierOccurrence : MyAdmit;
		end :>> laterOccurrence : MyInspect;
	}
	
	assoc MyInspect_Before_Touchup_Link [1] specializes HappensBefore {
		end :>> earlierOccurrence : MyInspect;
		end :>> laterOccurrence : MyTouchup;
	}
	
	assoc MyRecycling_Before_Merge_Link [1] specializes HappensBefore {
		end :>> earlierOccurrence : MyMarkForRecycling;
		end :>> laterOccurrence : MyMergeToShip;
	}
	
	assoc MyTouchup_Before_Merge_Link [1] specializes HappensBefore {
		end :>> earlierOccurrence : MyTouchup;
		end :>> laterOccurrence : MyMergeToShip;
	}
	
	assoc MyMerge_Before_Ship_Link [1] specializes HappensBefore {
		end :>> earlierOccurrence : MyMergeToShip;
		end :>> laterOccurrence : MyShip;
	}
	
	#atom behavior MyTest_I_Before_F [1] specializes NonStateTransitionPerformance {
		:>> guard : DecidedItGood [1];
		:>> transitionLink : MyInspect_Before_Touchup_Link [1];
		portion :>> startShot = endShot;
		
		:>> isTriggerAfter = true;
	}
	
	#atom behavior MyTest_I_Before_R [1] specializes NonStateTransitionPerformance {
		:>> guard : DecidedItBad [1];
		:>> transitionLink [0];
		portion :>> startShot = endShot;
		
		:>> isTriggerAfter = true;
	}
	
	#atom
	behavior MyManufacture specializes Manufacture {
		/* Before decision. */
		step :>> admit : MyAdmit [1];
		
		succession :>> a_before_i : MyAdmit_Before_Inspect_Link [1]
			first admit [1] then inspect [1];
		
		/* Decision. */
		step :>> inspect : MyInspect [1] {
			:>> outgoingHBLink : MyInspect_Before_Touchup_Link [1];
		}
		
		/* Two decision branches and their guard evaluations. */
		step :>> test_i_before_f : MyTest_I_Before_F {
			:>> guard : DecidedItGood [1];
			:>> transitionLink = i_before_f;
		}
		
		succession :>> i_before_f : MyInspect_Before_Touchup_Link [1]
			first inspect [1] then finish [1];
			
		
			
		step :>> finish : MyTouchup [1];
		
		succession :>> i_before_r [0]
			first inspect [1] then recycle [1];
			
		step :>> test_i_before_r : MyTest_I_Before_R {
			:>> guard : DecidedItBad [1];
			:>> transitionLink = i_before_r;
		}
			
		step :>> recycle [0];
		
		/* Two merge branches. */
		succession :>> f_before_ms : MyTouchup_Before_Merge_Link [1]
			first finish [1] then mShip [1];
		succession :>> r_before_ms : MyRecycling_Before_Merge_Link [0]
			first recycle [1] then mShip [1];
		
		/* Merge */
		step :>> mShip : MyMergeToShip [1] {
			:>> incomingHBLink : MyRecycling_Before_Merge_Link [1];
		}
		
		/* After merge */
		succession :>> ms_before_s : MyMerge_Before_Ship_Link [1]
			first mShip [1] then ship [1];
		step :>> ship : MyShip [1];
		
		/* Decision and merge timing constraints. */
		feature inspectOutgoingHBLinks : HappensBefore [1] unions i_before_f, i_before_r;
		connector bindIOHBL : SelfLink
			from inspectOutgoingHBLinks [1] to inspect.outgoingHBLink [1];
			
		feature mShipIncomingHBLinks : HappensBefore [1] unions f_before_ms, r_before_ms;
		connector bindmSIHBL : SelfLink
			from mShipIncomingHBLinks [1] to mShip.incomingHBLink [1];
	}
	
	
	
}