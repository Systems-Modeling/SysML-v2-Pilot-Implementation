package 'AnnexA.3.7.1' {
	
	import Atoms::*;
	import Links::*;
	import Performances::*;
	import StatePerformances::*;
	import ControlPerformances::*;
	import Occurrences::*;
	
	package user_model {
		
		behavior Manufacture {
			/* Before decision. */
			step admit : Admit [1];
			succession a_before_i first admit [1] then inspect [1];
			/* Decision. */
			step inspect : DecisionPerformance [*];
			/* Two decision branches. */
			succession i_before_f first inspect [1] then finish [0..1];
			step finish : Touchup [*];
			succession i_before_r first inspect [1] then recycle [0..1];
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
	

	package unrolled {	
		import user_model::*;
		
		/* Before decision. */
		#atom
		behavior MyAdmit :> Admit;
		
		/* Decision. */
		#atom
		behavior MyInspect :> DecisionPerformance;
		#atom
		assoc MyAdmit_Before_Inspect_Link :> HappensBefore {
			end :>> earlierOccurrence : MyAdmit;
			end :>> laterOccurrence : MyInspect;
		}
		/* One decision branch taken. */
		#atom
		behavior MyTouchup :> Touchup;
		#atom
		assoc MyInspect_Before_Touchup_Link :> HappensBefore {
			end :>> earlierOccurrence : MyInspect;
			end :>> laterOccurrence : MyTouchup;
		}
		/* One merge branch taken. Merge. */
		#atom
		behavior MyMergeToShip :> MergePerformance;
		#atom
		assoc MyTouchup_Before_Merge_Link :> HappensBefore {
			end :>> earlierOccurrence : MyTouchup;
			end :>> laterOccurrence : MyMergeToShip;
		}
		/* After merge. */
		#atom
		behavior MyShip :> Ship;
		#atom
		assoc MyMerge_Before_Ship_Link :> HappensBefore { 
			end :>> earlierOccurrence : MyMergeToShip; 
			end :>> laterOccurrence : Ship;
		}
		
		behavior MyManufactureSteps unions MyAdmit, MyInspect, MyTouchup, MyMergeToShip, MyShip;
		
		#atom
		assoc MergeBindIOHBL :> SelfLink {
			end :>> thisThing : MyTouchup_Before_Merge_Link;
			end :>> sameThing : MyTouchup_Before_Merge_Link;
		}
		
		#atom
		assoc InspectBindSIHBL :> SelfLink {
			end :>> thisThing : MyInspect_Before_Touchup_Link;
			end :>> sameThing : MyInspect_Before_Touchup_Link;
		}
		
		#atom
		behavior MyManufacture :> Manufacture {
			:>> timeEnclosedOccurrences : MyManufactureSteps [5];
			
			/* Before decision. */
			step :>> admit : MyAdmit [1];
			
			/* Decision. */
			step :>> inspect : MyInspect [1];
			succession :>> a_before_i : MyAdmit_Before_Inspect_Link [1]
			first admit then inspect;
			
			/* One decision branch taken. */
			step :>> finish : MyTouchup [1];
			succession :>> i_before_f : MyInspect_Before_Touchup_Link [1]
			first inspect then finish;
			
			/* One merge branch taken. */
			succession :>> f_before_ms : MyTouchup_Before_Merge_Link [1]
			first finish then mShip;
			
			/* Merge. */
			step :>> mShip: MyMergeToShip [1];
			
			/* After merge */
			step :>> ship : MyShip [1];
			succession :>> ms_before_s : MyMerge_Before_Ship_Link [1]
			first mShip then ship;
			
			/* Decision and merge timing constraints. */
			:>> inspectOutgoingHBLinks : MyInspect_Before_Touchup_Link;
			:>> mShipIncomingHBLinks : MyTouchup_Before_Merge_Link;
			
			connector :>> bindIOHBL : MergeBindIOHBL
				from mShipIncomingHBLinks [1] to mShip.incomingHBLink [1];
			connector :>> bindmSIHBL : InspectBindSIHBL 
				from inspectOutgoingHBLinks [1] to inspect.outgoingHBLink [1];
			
		}	
		
	}
}