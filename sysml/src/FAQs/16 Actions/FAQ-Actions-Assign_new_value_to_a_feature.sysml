package 'FAQ-Actions-Assign_new_value_to_a_feature' {
	doc /*
	 * How do you assign a new value to a feature?
	 * (Based on "Assign attribute new value" by Kobi Kobiaszu 10 Aug 2023)
	 */
	 
	private import ScalarValues::Boolean;
	  
    item def Toggle;
     
    part def ModeSelector {
	    port lightShifter;
	    attribute lightsON : Boolean := true;
	         
	    state lightsMode {		           
			entry;
			then manual;
			
			state manual;
			transition
				first manual
				accept Toggle via lightShifter
		      	do action {
		      		assign lightsON := false;
		      	}
		        then automatic;
	        
			state automatic;
			transition
				first automatic
				accept Toggle via lightShifter
		      	do action { 
		      		assign lightsON := true;
		      	}
				then manual;
	    }      
	}
}
