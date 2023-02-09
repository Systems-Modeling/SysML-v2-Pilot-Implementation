package org.omg.sysml.uml.ecore.importer;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
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
				if (property.isDerived() && !property.isDerivedUnion()) {
					String qualifiedName = property.getQualifiedName();
					System.out.println("Add annotation: " + qualifiedName.substring(qualifiedName.indexOf("::") + 2));
					EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
					annotation.setSource(ANNOTATION_SYSML);
					modelElement.getEAnnotations().add(annotation);
				}
			} else if (element instanceof org.eclipse.uml2.uml.Class && modelElement instanceof EClass) {
				String name = ((org.eclipse.uml2.uml.Class)element).getName();
				EClass eClass = (EClass)modelElement;
				if ("Feature".equals(name)) {
					EClassifier booleanType = eClass.getEStructuralFeature("isUnique").getEType();
					addStructuralFeature(eClass, EcoreFactory.eINSTANCE.createEAttribute(), "isNonunique", booleanType, 1, 1, "false", false);
				} else if ("OperatorExpression".equals(name)) {
					EClassifier expressionClass = eClass.getEStructuralFeature("argument").getEType();
					addStructuralFeature(eClass, EcoreFactory.eINSTANCE.createEReference(), "operand", expressionClass, 0, -1, null, true);
				}
			}
		}
	}
	
	private void addStructuralFeature(EClass eClass, EStructuralFeature feature, String name, EClassifier type, int lower, int upper, String defaultValue, boolean isContainment) {
		System.out.println("Add feature:    " + eClass.getName() + "::" + name + ": " + (type == null? "<null>": type.getName()));
		feature.setName(name);
		feature.setEType(type);
		feature.setLowerBound(lower);
		feature.setUpperBound(upper);
		feature.setOrdered(upper == -1 || upper > 1);
		feature.setDerived(true);
		feature.setTransient(true);
		feature.setVolatile(true);
		if (defaultValue != null) {
			feature.setDefaultValueLiteral(defaultValue);
		}
		if (isContainment) {
			((EReference)feature).setContainment(true);
		}
		eClass.getEStructuralFeatures().add(feature);
	}
	
}
