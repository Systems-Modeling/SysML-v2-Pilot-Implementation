package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.validation.util.SysmlValidationUtil;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class PortUsageValidationChecker extends OccurrenceUsageValidationChecker {
	
	public PortUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validatePortUsageIsReference(element, messageAccepter);
		validatePortUsageNestedUsagesNotComposite(element, messageAccepter);
	}
						
	public void validatePortUsageIsReference(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof PortUsage usg) {
			var owningType = usg.getOwningType(); 
			if (!(owningType instanceof PortDefinition || owningType instanceof PortUsage || usg.isReference())) {
				messageAccepter.error(usg, null, "validatePortUsageIsReference");
			}
		}
	}
	
	public void validatePortUsageNestedUsagesNotComposite(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof PortUsage usg) {
			var usages = usg.getNestedUsage().stream().filter(u -> !(u instanceof PortUsage)).toList();
			SysmlValidationUtil.checkAllNotComposite(usages, messageAccepter, "validatePortUsageNestedUsagesNotComposite");
		}
	}
}
