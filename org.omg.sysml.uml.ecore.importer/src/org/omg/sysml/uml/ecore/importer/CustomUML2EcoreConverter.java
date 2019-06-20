package org.omg.sysml.uml.ecore.importer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter;

/**
 * TODO Check whether the changes made for ST6RI-61 are valid.
 * 
 * @author wpiers
 *
 */
public class CustomUML2EcoreConverter extends UML2EcoreConverter {

	@Override
	public Object caseProperty(Property property) {
		Object res = super.caseProperty(property);
		
		// We only change the conversion of composite properties
		if (AggregationKind.COMPOSITE_LITERAL.equals(property.getAggregation()) && res instanceof EReference) {
			EReference containmentReference = (EReference) res;

			EReference normalReference = EcoreFactory.eINSTANCE.createEReference();
			normalReference.setName(property.getName());
			normalReference.setEType(containmentReference.getEType());
			normalReference.setLowerBound(containmentReference.getLowerBound());
			normalReference.setUpperBound(containmentReference.getUpperBound());

			containmentReference.setName(containmentReference.getName() + "_comp");
			EClass container = (EClass) ((EStructuralFeature) res).eContainer();
			container.getEStructuralFeatures().add(normalReference);
		}
		return res;
	}

}
