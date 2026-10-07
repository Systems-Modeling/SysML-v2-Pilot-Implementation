package org.omg.kerml.validation.checker;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.PayloadFeature;
import org.omg.sysml.lang.sysml.SysMLPackage; 

public class FlowValidationChecker extends ConnectorValidationChecker {
	
	private final ValidationChecker step;
	
	public FlowValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
		step = factory.getValidationChecker(SysMLPackage.eINSTANCE.getStep());
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.doValidate(element, messageAccepter, visited);
		step.validate(element, messageAccepter, visited);
		validateFlowPayloadFeature(element, messageAccepter);
	}
	
	public void validateFlowPayloadFeature(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Flow flow) {
			List<? extends EObject> list = flow.getOwnedFeature().stream().filter(PayloadFeature.class::isInstance).toList();	
			ValidationUtil.checkAtMostOne(list, messageAccepter, null, "validateFlowPayloadFeature");
		}
	}
}
