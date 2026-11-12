package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Element;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class ConjugatedPortDefinitionValidationChecker extends PortDefinitionValidationChecker {
	
	public ConjugatedPortDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateConjugatedPortDefinitionConjugatedPortDefinitionIsEmpty(element, messageAccepter);
		validateConjugatedPortDefinitionOriginalPortDefinition(element, messageAccepter);
	}
						
	public void validateConjugatedPortDefinitionConjugatedPortDefinitionIsEmpty(Element element, ValidationMessageAccepter messageAccepter) {
		//there is no "validateConjugatedPortDefinitionConjugatedPortDefinitionIsEmpty" rule in the properties file.  
	}
	
	public void validateConjugatedPortDefinitionOriginalPortDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof ConjugatedPortDefinition cpd) {
			 var portConjugator = cpd.getOwnedPortConjugator();
			 if (portConjugator != null && portConjugator.getOriginalPortDefinition() != cpd.getOriginalPortDefinition()) {
				 messageAccepter.error(cpd, null, "validateConjugatedPortDefinitionOriginalPortDefinition");
			 }	
		}
	}
}
