package org.omg.kerml.validation.checker;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Feature;

public class EndFeatureMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateEndFeatureMembershipIsEnd(element, messageAccepter);
	}
						
	public void validateEndFeatureMembershipIsEnd(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof EndFeatureMembership efm) {
			Feature ownedMemberFeature = efm.getOwnedMemberFeature();
		    if (ownedMemberFeature != null && !ownedMemberFeature.isEnd()) {
		    	messageAccepter.error(ownedMemberFeature, null, "validateEndFeatureMembershpIsEnd");
		    }
		}	
	}	
}
