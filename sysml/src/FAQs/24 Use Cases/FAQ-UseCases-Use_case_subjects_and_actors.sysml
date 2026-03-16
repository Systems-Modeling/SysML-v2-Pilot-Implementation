package 'FAQ-UseCases-Use_case_subjects_and_actors' {
	doc /*
	 * How do you modl use cases that have the same values for subject and actor parameters?
	 * (Based on "2 usecases/ same actor" 
	 * by Patrick F, 30 Oct 2024)
	 */
	 
    part def RTS;
    part def Operator; // This is like an Actor classifier in UML/SysML v1.

    use case def Perform_Surveillance {
        subject rts : RTS;
        actor operator : Operator; // This is like the association between a UseCase and an Actor in UML/SysMLv1.       
        objective {
             doc /*
                  * The Operator performs surveillance operations.
                  */
        }
    }  

    use case def Perform_Search {
        subject rts : RTS;
        actor operator : Operator;
        objective {
             doc /*
                  * The Operator performs search operations.
                  */
        }
    }	

	part singleOperatorContext {
	    part rts1 : RTS;   // Note: default multiplicity is [1] here.
	    part operator1 : Operator;
	
	    use case perform_surveillance : Perform_Surveillance {
	        subject :>> rts = rts1;
	        actor :>> operator = operator1;
	    }
	
	    use case perform_search : Perform_Search {
	        subject :>> rts = rts1;
	        actor :>> operator = operator1;
	    }
	}

}