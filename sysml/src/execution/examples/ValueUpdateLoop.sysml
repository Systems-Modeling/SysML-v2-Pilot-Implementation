package TrialLoopTestCase {
	import Execution::*;
	import Occurrences::*;
	import ScalarValues::Boolean;
	import ScalarValues::Integer;
	import VerificationCases::*;
	
	package LoopToExecute {
		import LoopTrace::*;

		action def L {
			attribute isFinished : Boolean := false;
			attribute x : Integer := 0;
			
			first start;
			then merge closeloop;
			then action 'Step 1' 
				assign x := x + 1;
			then action 'Step 2' 
				assign isFinished := (x >= 2);
			then decide 'loop done';
			if not isFinished then closeloop;
			else done;
			
		}
		
		case def 'Loop Master' {
			subject s : L [1];
		}
	}
	
	package LoopVerification {
		import LoopToExecute::*;
	
		verification def 'Check Loop Execution' :> 'Loop Master'{
			subject s : L [1];
			in reference : 'Loop Trace' [1];
			
			return verdict : VerdictKind = matches(s, reference.s);
		}
	}
	
	package LoopTrace {
		import LoopToExecute::*;
		
		case def 'Loop Trace' :> LoopToExecute::'Loop Master' {
			subject :>> s : L [1];
	
			occurrence LoopValueSlice : ValueSlice {
				:>> that : 'Loop Trace';
			}
			occurrence LoopTraceSlice : BehaviorSlice {
				:>> that : 'Loop Trace';
			}
			
			timeslice x0 :> LoopValueSlice {
				:>> s.x = 0;
				:>> valueStart = s.startShot;
				:>> valueEnd = that.'Loop Frame 2'.endShot;
			}
			then timeslice x1 :> LoopValueSlice {
				:>> s.x = 1;
				:>> valueStart = that.'Loop Frame 2'.endShot;
				:>> valueEnd = that.'Loop Frame 6'.endShot;
			}
			then timeslice x2 :> LoopValueSlice {
				:>> s.x = 2;
				:>> valueStart = that.'Loop Frame 6'.endShot;
				:>> valueEnd = that.endShot;
			}
			
			timeslice isFinished0 :> LoopValueSlice {
				:>> s.isFinished := false;
				:>> valueStart = s.startShot;
				:>> valueEnd = that.'Loop Frame 2'.endShot;
			}
			then timeslice isFinished1 :> LoopValueSlice {
				:>> s.isFinished := true;
				:>> valueStart = that.'Loop Frame 2'.endShot;
				:>> valueEnd = s.endShot;
			}
			
			
			timeslice 'Loop Frame 0' :> LoopTraceSlice {
				:>> activeSteps = (s.startShot);
				:>> inactiveSteps = (s.closeloop, s.'Step 1', s.'Step 2', s.'loop done', s.isFinished);
			}
			then timeslice 'Loop Frame 1' :> LoopTraceSlice {
				:>> activeSteps = s.closeloop#(1);
				:>> inactiveSteps = (s.'Step 1', s.'Step 2', s.'loop done', s.closeloop#(2));
			}
			then timeslice 'Loop Frame 2' :> LoopTraceSlice {
				:>> activeSteps = s.'Step 1'#(1);
				:>> inactiveSteps = (s.'Step 1'#(2), s.'Step 2', s.'loop done', s.closeloop);
			}
			then timeslice 'Loop Frame 3' :> LoopTraceSlice {
				:>> activeSteps = s.'Step 2'#(1);
				:>> inactiveSteps = (s.'Step 1', s.'Step 2'#(2), s.'loop done', s.closeloop);
			}
			then timeslice 'Loop Frame 4' :> LoopTraceSlice {
				:>> activeSteps = s.'loop done'#(1);
				:>> inactiveSteps = (s.'Step 1', s.'Step 2', s.'loop done'#(2), s.closeloop);
			}
			then timeslice 'Loop Frame 5' :> LoopTraceSlice {
				:>> activeSteps = s.closeloop#(2);
				:>> inactiveSteps = (s.'Step 1', s.'Step 2', s.'loop done', s.closeloop#(1));
			}
			then timeslice 'Loop Frame 6' :> LoopTraceSlice {
				:>> activeSteps = s.'Step 1'#(2);
				:>> inactiveSteps = (s.'Step 1'#(1), s.'Step 2', s.'loop done', s.closeloop);
			}
			then timeslice 'Loop Frame 7' :> LoopTraceSlice {
				:>> activeSteps = s.'Step 2'#(2);
				:>> inactiveSteps = (s.'Step 1', s.'Step 2'#(1), s.'loop done', s.closeloop);
			}
			then timeslice 'Loop Frame 8' :> LoopTraceSlice {
				:>> activeSteps = s.'loop done'#(2);
				:>> inactiveSteps = (s.'Step 1', s.'Step 2', s.'loop done'#(1), s.closeloop);
			}
			then timeslice 'Loop Frame 9' :> LoopTraceSlice {
				:>> activeSteps = done;
				:>> inactiveSteps = (s.'Step 1', s.'Step 2', s.'loop done', s.closeloop);
			}
		}
	}
}