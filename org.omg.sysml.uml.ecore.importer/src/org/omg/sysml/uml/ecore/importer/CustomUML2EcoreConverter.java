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
 * TODO Check whether the changes made for ST6RI-61 are valid.
 * 
 * @author wpiers
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
				EAnnotation compSubsets = modelElement.getEAnnotation(ANNOTATION__SUBSETS);
				if (compSubsets != null) {
					EReference compRef = (EReference) modelElement;

					// get the base reference from the initial annotation
					EReference baseRef = null;
					for (EObject ref : compSubsets.getReferences()) {
						if (ref instanceof EReference && ((EReference) ref).isContainment()) {
							baseRef = (EReference) ref;
						}
					}

					if (baseRef != null) {
						// create a new EReference that will subset the base reference
						EReference normalRef = EcoreFactory.eINSTANCE.createEReference();
						normalRef.setName(compRef.getName());
						normalRef.setEType(compRef.getEType());
						normalRef.setLowerBound(compRef.getLowerBound());
						normalRef.setUpperBound(compRef.getUpperBound());

						// change the reference name
						compRef.setName(compRef.getName() + "_comp");
						
						// set the reference to be containment (even though the UML property was composite, 
						// the reference will not be, because the original property subsets a composite)
						compRef.setContainment(true);
						
						// Ensure the opposite containment reference is optional.
						EReference opRef = compRef.getEOpposite();
						if (opRef != null) {
							opRef.setLowerBound(0);
						}

						// add the normal ref, now that its name is not in use anymore
						EClass container = (EClass) ((EStructuralFeature) compRef).eContainer();
						container.getEStructuralFeatures().add(normalRef);

						// update the comp reference annotation
						compSubsets.getReferences().remove(baseRef);
						compSubsets.getReferences().add(normalRef);

						// update the normal reference annotation
						EAnnotation normalSubsets = normalRef.getEAnnotation(ANNOTATION__SUBSETS);
						if (normalSubsets == null) {
							normalSubsets = EcoreFactory.eINSTANCE.createEAnnotation();
							normalSubsets.setSource(ANNOTATION__SUBSETS);
							normalRef.getEAnnotations().add(normalSubsets);
						}
						normalSubsets.getReferences().add(baseRef);
					}
				}
			}
		}
	}

}
