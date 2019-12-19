package org.omg.sysml.uml.ecore.importer;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLUtil.UML2EcoreConverter;

/**
 * 
 * @author William Piers, Obeo
 * @author Ed Seidewitz, Model Driven Solutions
 *
 */
public class CustomUML2EcoreConverter extends UML2EcoreConverter {

	protected static final String ANNOTATION__SUBSETS = "subsets"; //$NON-NLS-1$

	@Override
	public Collection<? extends EObject> convert(Collection<? extends EObject> eObjects, Map<String, String> options,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		Collection<? extends EObject> res = super.convert(eObjects, options, diagnostics, context);
		processReferences();
		return res;
	}

	private void processReferences() {
		for (Entry<Element, EModelElement> entry : elementToEModelElementMap.entrySet()) {
			Element element = entry.getKey();
			EModelElement modelElement = entry.getValue();
			if (element instanceof Property && modelElement instanceof EReference
					&& AggregationKind.COMPOSITE_LITERAL.equals(((Property) element).getAggregation())) {
				EReference compRef = (EReference) modelElement;

				// create a new EReference that will not be composite
				EReference normalRef = EcoreFactory.eINSTANCE.createEReference();
				normalRef.setName(compRef.getName());
				normalRef.setEType(compRef.getEType());
				normalRef.setLowerBound(compRef.getLowerBound());
				normalRef.setUpperBound(compRef.getUpperBound());

				// set the new reference to be derived, because the generated subsetting mechanism
				// does not work with Xtext lazy linking.
				normalRef.setDerived(true);
				normalRef.setTransient(true);
				normalRef.setVolatile(true);

				// change the reference name
				compRef.setName(compRef.getName() + "_comp");

				// set the old reference to be containment (even though the UML property was composite, 
				// the reference will not be, because the original property subsets a composite)
				compRef.setContainment(true);

				// Ensure the opposite container reference is optional.
				EReference opRef = compRef.getEOpposite();
				if (opRef != null) {
					opRef.setLowerBound(0);
				}

				// add the normal ref, now that its name is not in use anymore
				EClass container = (EClass) ((EStructuralFeature) compRef).eContainer();
				container.getEStructuralFeatures().add(normalRef);

				// move all subsetting to the new reference
				EAnnotation compSubsets = compRef.getEAnnotation(ANNOTATION__SUBSETS);
				if (compSubsets != null) {
					EAnnotation normalSubsets = EcoreFactory.eINSTANCE.createEAnnotation();
					normalSubsets.setSource(ANNOTATION__SUBSETS);
					normalRef.getEAnnotations().add(normalSubsets);
					normalSubsets.getReferences().addAll(compSubsets.getReferences());
					compRef.getEAnnotations().remove(compSubsets);
				}
			}
		}
	}

}
