package TransitionPerformances {
	private import Base::*;
	private import ScalarValues::*;
	private import Occurrences::*;
	private import Transfers::*;
	
	abstract behavior TransitionPerformance(in transitionLinkSource: Performance[1]) {
		feature trigger: Transfer[*];
		expr guard[*];
		step effect[*];

		feature transitionLink: HappensBefore[0..1] {
			end earlier redefines earlierOccurrence;
			end later redefines laterOccurrence;
		}
		
		binding transitionLink::earlier[0..1] = transitionLinkSource[1];
		succession transitionLinkSource[1] then effect[*]; 
		succession effect[*] then transitionLink::later[1];
		
		connector transitionLink[0..1] to trigger[1..*];
		connector all guardConstraint: TPCGuardConstraint[*] 
			from transitionLink[0..1] to guard[*];
			
		succession all trigger[*] then guard[*];
		succession all guard[*] then effect[*];
	}
	
	behavior NonStateTransitionPerformance specializes TransitionPerformance {
		succession transitionLinkSource[1] then trigger[*];
		succession transitionLinkSource[1] then guard[*];
		
		succession all guard[*] then transitionLink::later[0..1];
	}
	
	assoc TPCGuardConstraint {
		end feature constrainedHBLink: HappensBefore[0..1];
		end expr constrainedGuard: Evaluation[*] () result: Boolean;
		
		inv { constrainedGuard()->forAll result: Boolean (result) }		
	}	
}