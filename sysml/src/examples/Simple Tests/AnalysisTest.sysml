package AnalysisTest {

	part def V {
		m;
	}
	
	part vv : V;
	
	requirement def AnalysisObjective {
		/* ... */
	}

	analysis case def AnalysisCase(v : V) {
		
		obj objective : AnalysisObjective(
			subject = result
		);
		
		v::m
	}
	
	analysis case def AnalysisPlan(v : V) {
		
		obj {
			/* ... */
		}
		
		analysis case analysisCase : AnalysisCase () return mass;
	}
	
	part analysisContext {
		analysis case analysisPlan : AnalysisPlan (
			v = vv
		);
	}
}