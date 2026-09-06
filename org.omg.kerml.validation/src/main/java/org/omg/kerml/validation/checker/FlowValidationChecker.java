package org.omg.kerml.validation.checker;

import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EObject;
import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.PayloadFeature; 

public class FlowValidationChecker extends ConnectorValidationChecker {
	
	StepValidationChecker step = new StepValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		step.validate(element, messageAccepter);
		validateFlowPayloadFeature(element, messageAccepter);
	}
	
	public void validateFlowPayloadFeature(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Flow flow) {
			List<? extends EObject> list = flow.getOwnedFeature().stream().filter(PayloadFeature.class::isInstance).collect(Collectors.toList());	
			ValidationUtil.checkAtMostOne(list, messageAccepter, null, "validateFlowItemFeature");
		}
	}
}
