package org.omg.sysml.validation.checker;

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.MergeNode;
import org.w3c.dom.Node;

import java.util.Set;

import org.omg.kerml.validation.ValidationChecker;
import org.omg.kerml.validation.ValidationCheckerFactory;
import org.omg.kerml.validation.ValidationMessageAccepter;

public class MergeNodeValidationChecker extends ControlNodeValidationChecker {
	
	public MergeNodeValidationChecker(ValidationCheckerFactory factory) {
		super(factory);
	}

	@Override
	protected void doValidate(Element element, ValidationMessageAccepter messageAccepter, Set<ValidationChecker> visited) {
		super.validate(element, messageAccepter, visited);
		validateMergeNodeIncomingSuccessions(element, messageAccepter);
		validateMergeNodeOutgoingSuccessions(element, messageAccepter);
	}
						
	public void validateMergeNodeIncomingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		/*
		 * All incoming Successions to a MergeNode must have a source multiplicity of 0..1.
			targetConnector->selectByKind(Succession)->collect(connectorEnd->at(1))->forAll(sourceMult |multiplicityHasBounds(sourceMult, 0, 1))
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		if (element instanceof MergeNode node) {
			if (node != null) {
				List<Connector> targetConnectors = node.getTargetConnector(); 
			}
		}
		
	}
	
	public void validateMergeNodeOutgoingSuccessions(Element element, ValidationMessageAccepter messageAccepter) {
		
	}
	
}
