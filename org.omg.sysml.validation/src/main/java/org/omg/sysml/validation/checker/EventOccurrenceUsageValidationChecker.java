package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.validation.util.SysmlValidationUtil;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class EventOccurrenceUsageValidationChecker extends OccurrenceUsageValidationChecker {
	
	public EventOccurrenceUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateEventOccurrenceUsageIsReference(element, messageAccepter);
		validateEventOccurrenceUsageReference(element, messageAccepter);
	}
						
	public void validateEventOccurrenceUsageIsReference(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof EventOccurrenceUsage usg) {
			if (!usg.isReference()) {
				if (usg instanceof OccurrenceUsage) {
					messageAccepter.error(usg, null, "validateEventOccurrenceUsageIsReference_1");
				}
				else if (usg instanceof ExhibitStateUsage) {
					messageAccepter.error(usg, null, "validateEventOccurrenceUsageIsReference_2");
				}
				else if (usg instanceof IncludeUseCaseUsage) {
					messageAccepter.error(usg, null, "validateEventOccurrenceUsageIsReference_3");
				}
				else if (usg instanceof PerformActionUsage) {
					messageAccepter.error(usg, null, "validateEventOccurrenceUsageIsReference_4");
				}
				else {
					messageAccepter.error(usg, null, "validateEventOccurrenceUsageReference");
				}
			}
		}
	}
	
	public void validateEventOccurrenceUsageReference(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof EventOccurrenceUsage usg) {
			if (!(usg instanceof PerformActionUsage || usg instanceof IncludeUseCaseUsage)) {
				SysmlValidationUtil.checkReferenceType(usg, OccurrenceUsage.class, messageAccepter, "validateEventOccurrenceUsageReference");
			}
		}
	}
}
