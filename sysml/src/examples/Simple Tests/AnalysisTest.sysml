package AnalysisTest {

	part def V {
		m;
	}
	
	part vv : V;
	
	requirement def AnalysisObjective {
		/* ... */
	}

	analysis def AnalysisCase(v : V) {
		
		objective obj : AnalysisObjective(
			subject = result
		);
		
		v::m
	}
	
	analysis def AnalysisPlan(v : V) {
		
		objective {
			/* ... */
		}
		
		analysis analysisCase : AnalysisCase () return mass;
	}
	
	part analysisContext {
		analysis analysisPlan : AnalysisPlan (
			v = vv
		);
	}
}