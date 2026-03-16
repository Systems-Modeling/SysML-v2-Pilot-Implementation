package 'FAQ-Requirements-Framed_concerns_and_derived_requirements' {
    doc 
    /* How do you model that some stakeholder concern is satisfied by one or more requirements.
     * (Based on "Tracing needs to requirements" by Jasper Bussemaker, 5 Dec 2024) */

    // Context: a system linked to a requirement

    part def System {
        // ...
    }
    
    part someStakeholder;
    
    concern someConcern {
    	subject system : System;
    	stakeholder someStakeholder;
    }

    // Option 1: concern framing

    requirement framingRequirement1 {
 		subject system : System;
        frame someConcern;

        //...
    }
    
    requirement framingRequirement2 {
 		subject system : System;
        frame someConcern;

        //...
    }
    
    // ...
    
    part system1 : System {
    	// ...
    	satisfy framingRequirement1;
    	satisfy framingRequirement2;
    	// ...
    }

    // Option 2: requirement derivation

	private import RequirementDerivation::*;

    requirement derivedRequirement1 {
        subject system : System;
        // ...
    }
    
    requirement derivedRequirement2 {
    	subject system : System;
    	// ...
    }

	requirement derivedRequirement3 {
		subject system : System;
		// ...
	}
	
	// ...

    #derivation connection {
        end #original references someConcern;
        end #derive references derivedRequirement1;
        end #derive references derivedRequirement2;
        // ...
    }
    
    part system2 : System {
    	//...
    	satisfy derivedRequirement1;
    	satisfy derivedRequirement2;
    	// ...    	
    }
    
    // Option 3
    
     requirement conjunctionRequirement {
     	subject system : System;
    	frame someConcern;
    	require systemRequirement1;
    	require systemRequirement2;
    	//...
    }
    
    requirement systemRequirement1 {
    	subject system : System;
    	// ...
    }
    requirement systemRequirement2 {
    	subject system : System;
    	// ...
    }
    // ...
    
    part system3 : System {
    	//...
    	satisfy conjunctionRequirement;
    	// ...    	
    }
    
}