package org.omg.kerml.validation.checker;

import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Feature;

public class EndFeatureMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		validateEndFeatureMembershipIsEnd(element, messageAccepter);
	}
						
	public void validateEndFeatureMembershipIsEnd(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof EndFeatureMembership efm) {
			Feature ownedMemberFeature = efm.getOwnedMemberFeature();
		    if (ownedMemberFeature != null && !ownedMemberFeature.isEnd()) {
		    	messageAccepter.error(efm, null, "validateEndFeatureMembershpIsEnd");
		    }
		}	
	}	
}
