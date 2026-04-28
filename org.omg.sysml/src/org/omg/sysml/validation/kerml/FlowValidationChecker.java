package org.omg.sysml.validation.kerml;

import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Flow;
import org.omg.sysml.lang.sysml.PayloadFeature;
import org.omg.sysml.validation.ValidationMessageAccepter;
import org.omg.sysml.util.ValidationUtil; 

public class FlowValidationChecker extends ConnectorValidationChecker {
	
	StepValidationChecker step = new StepValidationChecker();
	
	@Override
	public void validate(Element element, ValidationMessageAccepter messageAccepter) {
		super.validate(element, messageAccepter);
		step.validate(element, messageAccepter);
		validateFlowPayloadFeature(element, messageAccepter);
	}
	/*The previous java code sent the error message to the utility method.  Its more efficient to simply let the util method check the condition 
	 * and have leave the error logic in the validation method using the util - why send error messages when they don't need to be sent? */	
	
	public void validateFlowPayloadFeature(Element element, ValidationMessageAccepter messageAccepter) {
		if (element instanceof Flow ) {
			Flow flow = (Flow) element;
			List<? extends EObject> list = flow.getOwnedFeature().stream().filter(PayloadFeature.class::isInstance).collect(Collectors.toList());
			ValidationUtil util = new ValidationUtil(); 
			if (!util.checkAtMostOne(list)) {
				messageAccepter.error(element, null, "validateFlowItemFeature");
			}
		}
	}
}
