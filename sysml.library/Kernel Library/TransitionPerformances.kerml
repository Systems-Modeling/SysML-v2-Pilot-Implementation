package TransitionPerformances {
	import Base::*;
	import ScalarValues::*;
	import Occurrences::*;
	import Transfers::*;
	
	abstract behavior TransitionPerformance(in transitionLinkSource: Performance[1]) {
		feature trigger: Transfer[*];
		expr guard[*];
		step effect[*];

		feature transitionLink: HappensBefore[0..1] {
			feature earlier redefines earlierOccurrence;
			feature later redefines laterOccurrence;
		}
		
		binding transitionLink::earlier[0..1] = transitionLinkSource[1];
		succession transitionLinkSource[1] then effect[*]; 
		succession effect[*] then transitionLink::later[1];
		
		connector transitionLink[0..1] to trigger[1..*];
		connector guardConstraint: all TPCGuardConstraint[*] 
			from transitionLink[0..1] to guard[*];
			
		succession :all HappensBefore 
			first trigger[*] then guard[*];
		succession :all HappensBefore 
			first guard[*] then effect[*];
	}
	
	behavior NonStateTransitionPerformance specializes TransitionPerformance {
		succession transitionLinkSource[1] then trigger[*];
		succession transitionLinkSource[1] then guard[*];
		
		succession :all HappensBefore 
			first guard[*] then transitionLink::later[0..1];
	}
	
	assoc TPCGuardConstraint {
		end feature constrainedHBLink: HappensBefore[0..1];
		end expr constrainedGuard: Evaluation[*] () result: Boolean;
		
		binding constrainedGuard::result = trueResult {
			feature trueResult: ScalarValues::Boolean = true;
		}
		
	}	
}