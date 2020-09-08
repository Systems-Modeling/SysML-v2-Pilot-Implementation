package VerificationTest {

	part def V {
		m : ScalarValues::Integer;
	}
	
	part vv : V;
	
	requirement def VerificationObjective {
		/* ... */
	}

	verification def VerificationCase {
		
		subject v : V;
		
		objective : VerificationObjective {
			subject = v;
		}
		
		v::m == 0
	}
	
	verification def VerificationPlan(v : V) {
		
		objective {
			/* ... */
		}
		
		verification verificationCase : VerificationCase () return mass;
	}
	
	part verificationContext {
		verification verificationPlan : VerificationPlan (
			v = vv
		);
	}
}