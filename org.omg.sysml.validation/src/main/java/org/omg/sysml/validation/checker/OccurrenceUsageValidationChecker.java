package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class OccurrenceUsageValidationChecker extends UsageValidationChecker {
	
	public OccurrenceUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateOccurrenceUsageIndividualDefinition(element, messageAccepter);
		validateOccurrenceUsageIndividualUsage(element, messageAccepter);
		validateOccurrenceUsageIsPortion(element, messageAccepter);
		validateOccurrenceUsagePortionKind(element, messageAccepter);
	}
	//do you not need a method to check that all OccurranceUsages are defined only by classes? 
	/* All types must be Classes - xtend code: 
			if (!(usg instanceof PortUsage || usg instanceof ConnectionUsage || usg instanceof MetadataUsage || usg instanceof Step))	
				checkAllTypes(usg, org.omg.sysml.lang.sysml.Class, INVALID_OCCURRENCE_USAGE_TYPE_MSG, SysMLPackage.eINSTANCE.occurrenceUsage_OccurrenceDefinition, INVALID_OCCURRENCE_USAGE_TYPE)
	*/
	public void validateOccurrenceUsageIndividualDefinition(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof OccurrenceUsage usg) {
			var nIndividualDefs = usg.getOccurrenceDefinition().stream().filter(d -> d instanceof OccurrenceDefinition && ((OccurrenceDefinition) d).isIndividual()).count();
			if (nIndividualDefs >1) {
				messageAccepter.error(usg, null, "validateOccurrenceUsageIndividualDefinition");
			}
		}
	}
	
	public void validateOccurrenceUsageIndividualUsage(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof OccurrenceUsage usg) {
			var nIndividualDefs = usg.getOccurrenceDefinition().stream().filter(d -> d instanceof OccurrenceDefinition && ((OccurrenceDefinition) d).isIndividual()).count();
			if (usg.isIndividual() && nIndividualDefs != 1) {
				messageAccepter.error(usg, SysMLPackage.eINSTANCE.getOccurrenceUsage_OccurrenceDefinition(), "validateOccurrenceUsageIndividualUsage");
			}
		}
	}
	
	public void validateOccurrenceUsageIsPortion(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof OccurrenceUsage usg) {
			var portionKind = usg.getPortionKind(); 
			if (!(portionKind == null || usg.isPortion())){
				messageAccepter.error(usg, null, "validateOccurrenceUsageIsPortion");
			}
		}
	}
	
	public void validateOccurrenceUsagePortionKind(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof OccurrenceUsage usg) {
			var owningType = usg.getOwningType(); 
			var portionKind = usg.getPortionKind(); 
			if (!(portionKind == null || owningType instanceof OccurrenceDefinition || owningType instanceof OccurrenceUsage)) {
				messageAccepter.error(usg, null, "validateOccurrenceUsagePortionKind");
			}
		}
	}
}