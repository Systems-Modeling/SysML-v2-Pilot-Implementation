package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.util.FeatureUtil;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class TransitionUsageValidationChecker extends ActionUsageValidationChecker {
	
	public TransitionUsageValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateTransitionUsageParameters(element, messageAccepter);
		validateTransitionUsageSuccession(element, messageAccepter);
		validateTransitionUsageTriggerActions(element, messageAccepter);
	}
						
	public void validateTransitionUsageParameters(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TransitionUsage usg) {
			var n = usg.inputParameters().size(); 
			var triggerAction = usg.getTriggerAction(); 
			if (triggerAction.isEmpty()) {
				if (n < 1) {
					messageAccepter.error(usg, null, "validateTransitionUsageParameters_1");
				}
				else if ( n < 2) {
					messageAccepter.error(usg, null, "validateTransitionUsageParameters_2");
				}
			}
		}
	}
	
	public void validateTransitionUsageSuccession(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TransitionUsage usg) {
			var successions = usg.getOwnedMember().stream().filter(Succession.class::isInstance).map(Succession.class::cast).collect(Collectors.toList()); 
			if (successions.isEmpty() || !successions.get(0).getTargetFeature().stream().allMatch(f -> FeatureUtil.getBasicFeatureOf(f) instanceof ActionUsage)) {
				messageAccepter.error(usg, null, "validateTransitionUsageSuccession	");	
			}
		}
	}
	
	public void validateTransitionUsageTriggerActions(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TransitionUsage usg) {
			var source = usg.getSource();
			var mem = usg.getOwnedMembership().stream().filter(TransitionFeatureMembership.class::isInstance).map(TransitionFeatureMembership.class::cast)
				    .filter(m -> m.getKind() == TransitionFeatureKind.TRIGGER).findFirst().orElseThrow();
			if (source != null && !(source instanceof StateUsage) && mem != null) {
				messageAccepter.error(usg, null, "validateTransitionUsageTriggerActions");
			}
		}	
	}
}
