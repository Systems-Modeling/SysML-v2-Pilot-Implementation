package org.omg.sysml.uml.ecore.importer;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
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
			if (element instanceof Property && modelElement instanceof EStructuralFeature && 
					(((Property)element).isDerived() && !((Property)element).isDerivedUnion() || 
					"elementId".equals(((Property)element).getName())) ||
				element instanceof Operation && modelElement instanceof EOperation) {
				// Add SysML EAnnotation to derived properties (but not derived unions) and all operations
				String qualifiedName = ((NamedElement)element).getQualifiedName();
				addSysMLAnnotation(qualifiedName.substring(qualifiedName.indexOf("::") + 2), modelElement);
				if (element instanceof Property && "elementId".equals(((Property)element).getName())) {
					// Since elementId is to be treated as effectively derived, don't use it as an ID
					// internally to Eclipse.
					((EAttribute)modelElement).setID(false);
				}
			} else if (element instanceof org.eclipse.uml2.uml.Class && modelElement instanceof EClass) {
				String name = ((org.eclipse.uml2.uml.Class)element).getName();
				EClass eClass = (EClass)modelElement;
				if ("Feature".equals(name)) {
					// Add the "isNonunique" attribute as the effective logical inverse of "isUnique".
					EClassifier booleanType = eClass.getEStructuralFeature("isUnique").getEType();
					EAttribute isNonUniqueAttribute = EcoreFactory.eINSTANCE.createEAttribute();
					addStructuralFeature(eClass, isNonUniqueAttribute, "isNonunique", booleanType, 1, 1, "false", false);
					addSysMLAnnotation("Feature::isNonUnique", isNonUniqueAttribute);
				} else if ("InvocationExpression".equals(name)) {
					// Add the "operand" reference as a workaround for parsing operator expression arguments.
					EClassifier expressionClass = eClass.getEStructuralFeature("argument").getEType();
					EReference operandReference = EcoreFactory.eINSTANCE.createEReference();
					addStructuralFeature(eClass, operandReference, "operand", expressionClass, 0, -1, null, true);
					addSysMLAnnotation("InvocationExpression::operand", operandReference);
				}
			}
		}
	}
	
	private void addSysMLAnnotation(String qualifiedName, EModelElement modelElement) {
		System.out.println("Add annotation: " + qualifiedName);
		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource(ANNOTATION_SYSML);		
		modelElement.getEAnnotations().add(annotation);
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
