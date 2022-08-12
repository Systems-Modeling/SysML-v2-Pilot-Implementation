package org.omg.sysml.uml.ecore.importer;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
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

	protected static final String ANNOTATION__SUBSETS = "subsets"; //$NON-NLS-1$
	protected static final String ANNOTATION__REDEFINES = "redefines"; //$NON-NLS-1$
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
				if (modelElement instanceof EReference && 
						AggregationKind.COMPOSITE_LITERAL.equals(property.getAggregation())) {
					EReference ref = (EReference)modelElement;
					EList<Property> subsets = property.getSubsettedProperties();
					EList<Property> redefines = property.getRedefinedProperties();
					if (property.isDerived()) {
						if (subsets.isEmpty() && redefines.isEmpty()) {
							System.out.println("Make containment: " + property.getQualifiedName());
							ref.setContainment(true);
						} else if (!property.isDerivedUnion()){
							System.out.println("Add annotation: " + property.getQualifiedName());
							addSysMLAnnotation(property, ref);			
						}
					} else if (!ref.isMany()) {
						if (subsets.stream().anyMatch(Property::isComposite) ||
								redefines.stream().anyMatch(Property::isComposite)) {
							makeDerived(property, ref);

							EReference opRef = ref.getEOpposite();
							if (opRef != null) {
								makeDerived(property.getOpposite(), opRef);
							}
						}
					}
				} else if (property.isDerived() && !property.isDerivedUnion()) {
					addSysMLAnnotation(property, (EStructuralFeature)modelElement);			
				}

			}
		}
	}
	
	private static void makeDerived(Property property, EReference ref) {
		System.out.println("Make derived: " + property.getQualifiedName());
		ref.setDerived(true);
		ref.setTransient(true);
		ref.setVolatile(true);
		ref.setContainment(false);							
		addSysMLAnnotation(property, ref);		
	}
	
	private static void addSysMLAnnotation(Property property, EStructuralFeature feature) {
		System.out.println("Add annotation: " + property.getQualifiedName());
		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource(ANNOTATION_SYSML);
		feature.getEAnnotations().add(annotation);
	}
	
}
