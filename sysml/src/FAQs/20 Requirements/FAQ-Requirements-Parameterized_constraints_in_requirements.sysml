package 'FAQ-Requirements-Parameterized_constraints_in_requirements' {
	doc /*
	 * How do you parameterize constraints in requirements?
	 * (Based on "Clarification of Textual Notation for Constraints and Requirements" 
	 * by Jaime Smith, 30 Nov 2023)
	 */
	 
    private import ScalarValues::Integer;
   
    part def Subject {
        attribute a;
        attribute b;
    }
       
    constraint def Balance {
        in a : Integer;
        in b : Integer;
        a == b
    }
    
    requirement subjectBalanceRequirement {
        subject aSubject : Subject ;
        require constraint balance : Balance {
        	in a = aSubject.a;
        	in b = aSubject.b;
        }
    }
    
    part mySubject : Subject {
        attribute :>> a : Integer := 2;
        attribute :>> b : Integer := 2;
        
        satisfy subjectBalanceRequirement;
    }
       
    constraint subjectBalance : Balance {
    	part aSubject :> mySubject;
        in a = aSubject.a;
        in b = aSubject.b;
    }
   
    requirement mySubjectBalanceRequirement {
        subject :> mySubject;
        require subjectBalance {
        	:>> aSubject = subj;
        }
    }
    
    satisfy mySubjectBalanceRequirement by mySubject;    
}