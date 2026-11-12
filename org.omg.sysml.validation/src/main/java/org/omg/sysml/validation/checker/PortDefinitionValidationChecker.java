package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.validation.util.SysmlValidationUtil;

import java.util.Set;
import java.util.stream.Collectors;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class PortDefinitionValidationChecker extends OccurrenceDefinitionValidationChecker {
	
	private final ValidationChecker structure;
	
	public PortDefinitionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		structure = factory.getValidationChecker(SysMLPackage.eINSTANCE.getStructure());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		structure.validate(element, messageAccepter, visited);
		validatePortDefinitionConjugatedPortDefinition(element, messageAccepter);
		validatePortDefinitionOwnedUsagesNotComposite(element, messageAccepter);
	}
						
	public void validatePortDefinitionConjugatedPortDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof PortDefinition pd) {
			if (!(pd instanceof ConjugatedPortDefinition)) {
				var n = pd.getOwnedMember().stream().filter(ConjugatedPortDefinition.class::isInstance).count(); 
				if (n != 1) {
					messageAccepter.error(pd, null, "validatePortDefinitionConjugatedPortDefinition");
				}
			}
		}
	}
	
	public void validatePortDefinitionOwnedUsagesNotComposite(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof PortDefinition pd) {
			var usages = pd.getOwnedUsage().stream().filter(u -> !(u instanceof PortUsage)).collect(Collectors.toList());
			SysmlValidationUtil.checkAllNotComposite(usages, messageAccepter, "validatePortDefinitionOwnedUsagesNotComposite");
		}
	}
}
