package PortionModelingBehavior {
	
	private import Occurrences::Occurrence;
	
	behavior TakePicture {
 		step focus [1];
  		step shoot [*];
  		succession fs first focus [1] then shoot [1];
  		:>> snapshots;  //Not domain of above features.
  	}
 
	struct Camera {
		feature focus : F [*];
 		feature shoot : S [*];
		succession fs first focus [1] then shoot [0..1];
		:>> snapshots; //Not domain of above features.
	}

	behavior F {
		in c: Camera [1];
	}
	
	behavior S {
		in c: Camera [1];
	}
	
	  /* [Vince] Identifying steps happening during snapshots. [CB] Adapted. */
	  
	behavior Shopping {  //CB: Specializing Life, presumably.
		step steps;  //CB: step multiplicity default is [0..*], I think.
    	step browse subsets steps;
    	step checkout subsets steps;
    	step pay subsets steps;

    	:>> snapshots {  //CB: ↓↓ Not time enclosed under behavior -> not steps
    		feature thatShopping : Shopping [1] :> that; 
    		feature all currentSteps [0..*] subsets thatShopping.steps {
    			              //CB: ↑↑ Unlimited bc the steps above are not mandatory or ordered in time.
    			feature thatSnapshot : Occurrence [1] :> that, timeEnclosedOccurrences;
    	    }
		}
	}
	
	behavior ShoppingOrdered :> Shopping {  //CB: Specializing Life, presumably.
		:>> browse [1];
		:>> checkout [0..1]; //CB: Prevents multiple checkouts for the single browse.
    	succession first browse [1] then checkout [0..1];
    	succession first checkout [1] then pay [1];

    	:>> snapshots {
    		:>> thatShopping : ShoppingOrdered; 
    		:>> currentSteps [0..1];
    	}                 //CB: ↑↑ At most one step happens at a time (assuming no others added in specializations)
	}
	
		  /* Timeslices for steps. */
	
	behavior ShoppingStepTS :> ShoppingOrdered {  //CB: Specializing Life, presumably.
		
		feature step_ts :> timeSlices {
			feature thatShopping : ShoppingStepTS [1] :> that;
		}

    	feature all browse_ts :> step_ts [1] {  //CB: Assuming browsing happens in one timeslice, could be more if non-overlapping.
    		:>> startShot :> thatShopping.browse.startShot.timeCoincidentOccurrences;
    		:>> endShot :> thatShopping.browse.endShot.timeCoincidentOccurrences;
    	}
    	
    	feature all checkout_ts :> step_ts [0..1] {  //CB: Assuming checkout happens in one timeslice, could be more if non-overlapping.
    		:>> startShot :> thatShopping.checkout.startShot.timeCoincidentOccurrences;
    		:>> endShot :> thatShopping.checkout.endShot.timeCoincidentOccurrences;
    	}
    	
    	feature all pay_ts :> step_ts [0..1] {  //CB: Assuming paying happens in one timeslice, could be more if non-overlapping.
    		:>> startShot :> thatShopping.checkout.startShot.timeCoincidentOccurrences;
    		:>> endShot :> thatShopping.checkout.endShot.timeCoincidentOccurrences;
    	}
    }
	
		  /* Timeslices for steps using currentSteps, could make it work semantically. */
	
	behavior ShoppingStepTScS :> ShoppingOrdered {  //CB: Specializing Life, presumably.
		
		:>> timeSlices {
			:>> snapshots : ShoppingStepTScS::snapshots; //CB: Typed to find features of snapshots of timeslices.
		}

			/* TBD: Need "maximal" timeslice, ie, that cover all and only each step.*/
    	feature all browse_ts :> timeSlices [1] {  //CB: Assuming browsing happens in one timeslice, could be more if non-overlapping.
    		:>> snapshots {
    			:>> currentSteps :> thatShopping.browse;
    		}
    	}
    	
    	feature all checkout_ts :> timeSlices [0..1] {  //CB: Assuming checkout happens in one timeslice, could be more if non-overlapping.
    		:>> snapshots {
    			:>> currentSteps :> thatShopping.checkout;
    		}
    	}
    	
    	feature all pay_ts :> timeSlices [0..1] {  //CB: Assuming paying happens in one timeslice, could be more if non-overlapping.
    		:>> snapshots {
    			:>> currentSteps :> thatShopping.pay;
    		}
    	}
	}
}
