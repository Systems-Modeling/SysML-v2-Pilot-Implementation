package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.MetadataFeature;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class AssignmentActionUsageValidationChecker extends ActionUsageValidationChecker {
	
	public AssignmentActionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateAssignmentActionUsage(element, messageAccepter);
		validateAssignmentActionUsageReferent(element, messageAccepter);
	}
						
	public void validateAssignmentActionUsage(Element element, ValidationMessageAccepter messageAccepter) {
		//No xtend code for this one. See sysmlv2 spec section 8.3.17.5
		if (element instanceof AssignmentActionUsage usg) {
			if (usg.getReferent() == null) {
				messageAccepter.error(usg, null, "validateAssignmentActionUsage");
			}
		}
	}
	
	public void validateAssignmentActionUsageReferent(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof AssignmentActionUsage usg) {
			boolean hasValidReferent = usg.getOwnedMembership().stream().anyMatch(m-> !(m instanceof FeatureMembership) && m.getMemberElement() instanceof Feature && !(m.getMemberElement() instanceof MetadataFeature));
			if (!hasValidReferent) {
				messageAccepter.error(usg.getOwnedRelationship().get(1), null, "validateAssignmentActionUsage");
			}
		}
	}
}
