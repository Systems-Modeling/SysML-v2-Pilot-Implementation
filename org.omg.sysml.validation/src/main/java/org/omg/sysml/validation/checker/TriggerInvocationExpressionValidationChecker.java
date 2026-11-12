package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.InstantiationExpression;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.lang.sysml.TriggerKind;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.kerml.validation.checker.InvocationExpressionValidationChecker;

public class TriggerInvocationExpressionValidationChecker extends InvocationExpressionValidationChecker {
	
	public TriggerInvocationExpressionValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateTriggerInvocationExpressionAfterArgument(element, messageAccepter);
		validateTriggerInvocationExpressionAtArgument(element, messageAccepter);
		validateTriggerInvocationExpressionWhenArgument(element, messageAccepter);
	}
						
	public void validateTriggerInvocationExpressionAfterArgument(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TriggerInvocationExpression expr) {	
			var kind = expr.getKind(); 
			EList<Expression> arguments = expr.getArgument();
			var argument = arguments.isEmpty() ? null : arguments.get(0);
			if (kind == TriggerKind.AFTER && !(argument != null && isDuration(argument))) {
				messageAccepter.error(expr, null, "validateTriggerInvocationExpressionAfterArgument");
			}
		}
		
	}
	
	

	public void validateTriggerInvocationExpressionAtArgument(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TriggerInvocationExpression expr) {
			var kind = expr.getKind(); 
			EList<Expression> arguments = expr.getArgument();
			var argument = arguments.isEmpty() ? null : arguments.get(0);
			if (kind == TriggerKind.AT && !(argument != null && isTime(argument))) {
				messageAccepter.error(expr, null, "validateTriggerInvocationExpressionAtArgument");
			}	
		}	
	}

	public void validateTriggerInvocationExpressionWhenArgument(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof TriggerInvocationExpression expr) {
			var kind = expr.getKind(); 
			EList<Expression> arguments = expr.getArgument();
			var argument = arguments.isEmpty() ? null : arguments.get(0);
			if (kind == TriggerKind.WHEN && !(argument != null && ValidationUtil.isBooleanExpression(argument))) {
				messageAccepter.error(expr, null, "validateTriggerInvocationExpressionWhenArgument");
			}
		}
	}
	private boolean isDuration(Expression argument) {
		// TODO method stub to go into SysMLValidationUtil 
		return false;
	}
	private boolean isTime(Expression argument) {
		// TODO method stub to go into SysMLValidationUtil 
		return false;
	}
}