package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.ClassifierValidationChecker;

public class DefinitionValidationChecker extends ClassifierValidationChecker {
	
	public DefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateDefinitionVariationIsAbstract(element, messageAccepter);
		validateDefinitionVariationOwnedFeatureMembership(element, messageAccepter);
		validateDefinitionVariationSpecialization(element, messageAccepter);
	}
						
	public void validateDefinitionVariationIsAbstract(Element element, ValidationMessageAccepter messageAccepter) {
		//no xtend code but ...
		if (element instanceof Definition definition) {
			if (definition.isVariation() && !definition.isAbstract()) {
				messageAccepter.error(definition, null, "validateDefinitionVariationIsAbstract");
			}
		}
	}
	
	public void validateDefinitionVariationOwnedFeatureMembership(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Definition definition) {
			if (definition.isVariation()) {
				for (var mem : definition.getOwnedFeatureMembership()) {
					messageAccepter.error(mem, null, "validateDefinitionVariationOwnedFeatureMembership");
				}	
			}
		}
	}
	
	public void validateDefinitionVariationSpecialization(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Definition definition) {
			if (definition.isVariation()) {
			    for (var ownedSpec : definition.getOwnedSpecialization()) {
			        var specific = ownedSpec.getSpecific();
			        if (specific instanceof Definition && ((Definition) specific).isVariation()) {
			        	messageAccepter.error(ownedSpec, SysMLPackage.eINSTANCE.getSpecialization_Specific(), "validateDefinitionVariationSpecialization");
			           
			        }
			    }
			}
			
		}
	}
}
