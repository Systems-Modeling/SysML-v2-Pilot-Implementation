package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;

import java.util.Set;

import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.FeatureMembershipValidationChecker;

public class TransitionFeatureMembershipValidationChecker extends FeatureMembershipValidationChecker {
	
	public TransitionFeatureMembershipValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateTransitionFeatureMembershipEffectAction(element, messageAccepter);
		validateTransitionFeatureMembershipGuardExpression(element, messageAccepter);
		validateTransitionFeatureMembershipOwningType(element, messageAccepter);
		validateTransitionFeatureMembershipTriggerAction(element, messageAccepter);
	}
						
	public void validateTransitionFeatureMembershipEffectAction(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TransitionFeatureMembership mem) {
			var kind = mem.getKind(); 
			if (kind == TransitionFeatureKind.EFFECT) {
				if (!(mem.getTransitionFeature() instanceof ActionUsage)) {
					messageAccepter.error(mem, null, "validateTransitionFeatureMembershipEffectAction");
				}
			}
		}
	}
	
	public void validateTransitionFeatureMembershipGuardExpression(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TransitionFeatureMembership mem) {
			var kind = mem.getKind(); 
			if (kind == TransitionFeatureKind.GUARD) {
				var transitionFeature = mem.getTransitionFeature(); 
				if (!(transitionFeature instanceof Expression expression && ValidationUtil.isBoolean(expression))) {
					messageAccepter.error(mem, null, "validateTransitionFeatureMembershipGuardExpression");
				}
			}
		}
	}
	
	public void validateTransitionFeatureMembershipOwningType(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TransitionFeatureMembership mem) {
			var owningType = mem.getOwningType(); 
			if (owningType instanceof TransitionUsage transitionUsage) {
				var source = transitionUsage.getSource(); 
				if (source != null && !(source instanceof StateUsage) && !transitionUsage.getTriggerAction().isEmpty()) {
					messageAccepter.error(transitionUsage, null, "validateTransitionUsageTriggerActions");
				}
			}
		}
	}
	
	public void validateTransitionFeatureMembershipTriggerAction(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TransitionFeatureMembership mem) {
			var kind = mem.getKind(); 
			if (kind == TransitionFeatureKind.TRIGGER) {
				if (!(mem.getTransitionFeature() instanceof AcceptActionUsage)) {
					messageAccepter.error(mem, null, "validateTransitionFeatureMembershipTriggerAction");
				}
			}
		}
	}
}
