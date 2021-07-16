package RequirementTest {
	constraint def C;
	constraint c : C;
	import q::**;
	requirement def R {
		assume constraint c1 : C;
		require c;
		doc /* */
    	requirement;
    	requirement def id '1' A {
    		doc /* Text */
    		subject s;
    	}
	}
	requirement def R1 {
		require constraint c1 :>> c;
	}
	part q {
		part p;
		requirement r : R;
		satisfy r {
			subject = p; 
		}  
		bind r.subj = p;
	}
	
}