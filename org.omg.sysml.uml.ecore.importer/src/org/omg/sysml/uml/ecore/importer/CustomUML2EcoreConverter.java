package org.omg.sysml.uml.ecore.importer;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
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

	protected static final String ANNOTATION_SYSML = "http://www.omg.org/spec/SysML"; //$NON-NLS-1$

	@Override
	public Collection<? extends EObject> convert(Collection<? extends EObject> eObjects, Map<String, String> options,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		Collection<? extends EObject> res = super.convert(eObjects, options, diagnostics, context);
		customConvert(diagnostics);
		return res;
	}

	private void customConvert(DiagnosticChain diagnostics) {
		for (Entry<Element, EModelElement> entry : elementToEModelElementMap.entrySet()) {
			Element element = entry.getKey();
			EModelElement modelElement = entry.getValue();
			if (element instanceof Property && modelElement instanceof EStructuralFeature) {
				Property property = (Property)element;
				if (needsContainment(modelElement, property)) {
					System.out.println("Make containment: " + property.getQualifiedName());
					((EReference)modelElement).setContainment(true);
				} else if (property.isDerived() && !property.isDerivedUnion()) {
					System.out.println("Add annotation: " + property.getQualifiedName());
					EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
					annotation.setSource(ANNOTATION_SYSML);
					modelElement.getEAnnotations().add(annotation);
				}

			}
		}
	}
	
	private static boolean needsContainment(EModelElement modelElement, Property property) {
		return modelElement instanceof EReference && property.isDerived() && 
			   AggregationKind.COMPOSITE_LITERAL.equals(property.getAggregation()) &&
			   property.getSubsettedProperties().isEmpty() && property.getRedefinedProperties().isEmpty();
	}
	
}
