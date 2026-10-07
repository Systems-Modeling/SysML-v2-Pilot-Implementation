package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class MetadataUsageValidationChecker extends ItemUsageValidationChecker {
	
	private final ValidationChecker metadatafeature;
	
	public MetadataUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		metadatafeature = factory.getValidationChecker(SysMLPackage.eINSTANCE.getMetadataFeature());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		metadatafeature.validate(element, messageAccepter, visited);
	}
						
}
