package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureValidationChecker;

public class UsageValidationChecker extends FeatureValidationChecker {
	
	public UsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateUsageIsReferential(element, messageAccepter);
		validateUsageVariationIsAbstract(element, messageAccepter);
		validateUsageVariationOwnedFeatureMembership(element, messageAccepter);
		validateUsageVariationSpecialization(element, messageAccepter);
	}
						
	public void validateUsageIsReferential(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Usage usg) {
			if (!usg.isReference()) {
				if (usg.getDirection()!= null)){
					messageAccepter.error(usg, null, "validateUsageIsReferential_1");
				}
				else if (usg.isEnd()) {
					messageAccepter.error(usg, null, "validateUsageIsReferential_2");
				}
				else if (usg.getFeaturingType().isEmpty()) {
					messageAccepter.error(usg, null, "validateUsageIsReferential_3");
				}
			}
		}
	}
	
	public void validateUsageVariationIsAbstract(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Usage usg) {
			if (usg.isVariation()) {
				if (usg.isAbstract()) {
					messageAccepter.error(usg, null, "validateUsageVariationIsAbstract");
				}
			}
		}
	}
	
	public void validateUsageVariationOwnedFeatureMembership(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Usage usg) {
			/*
			 * for (mem: usage.ownedFeatureMembership) {
					// NOTE: Need to allow parameters and objectives because they are currently physically inserted by transform implementation.
					// TODO: Add allowance of parameters and objectives in variations to spec? Or remove when possible?
					if (!(mem instanceof ParameterMembership || mem instanceof ObjectiveMembership)) {
						error(INVALID_USAGE_VARIATION_MEMBERSHIP_MSG, mem, null, INVALID_USAGE_VARIATION_MEMBERSHIP)							
					}
				}
			 * */
		}
	}
	
	public void validateUsageVariationSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Usage usg) {
			for (var ownedSpec : usg.getOwnedSpecialization()) {
			    if (ownedSpec.getGeneral().isVariation()) {
			        messageAccepter.error(ownedSpec, SysMLPackage.eINSTANCE.getSpecialization_General(), "validateUsageVariationSpecialization");
			    }
			}
		}
	}
}
