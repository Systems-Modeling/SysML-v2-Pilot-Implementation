/**
 */
package org.omg.sysml.kerml.structure.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.omg.sysml.kerml.core.Container;
import org.omg.sysml.kerml.core.ElementRecord;
import org.omg.sysml.kerml.core.Relationship;

import org.omg.sysml.kerml.structure.Association;
import org.omg.sysml.kerml.structure.Binding;
import org.omg.sysml.kerml.structure.Connector;
import org.omg.sysml.kerml.structure.DataFeature;
import org.omg.sysml.kerml.structure.DataType;
import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.FeaturePathNode;
import org.omg.sysml.kerml.structure.Generalization;
import org.omg.sysml.kerml.structure.GeneralizationSet;
import org.omg.sysml.kerml.structure.Individual;
import org.omg.sysml.kerml.structure.RefinedAssociation;
import org.omg.sysml.kerml.structure.Restricts;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.kerml.structure.StructuredClass;
import org.omg.sysml.kerml.structure.StructuredFeature;
import org.omg.sysml.kerml.structure.ValueOption;
import org.omg.sysml.kerml.structure.ValueRestriction;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.omg.sysml.kerml.structure.StructurePackage
 * @generated
 */
public class StructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureSwitch() {
		if (modelPackage == null) {
			modelPackage = StructurePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StructurePackage.CLASS: {
				org.omg.sysml.kerml.structure.Class class_ = (org.omg.sysml.kerml.structure.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseContainer(class_);
				if (result == null) result = caseElementRecord(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseStructuredClass(association);
				if (result == null) result = caseClass(association);
				if (result == null) result = caseContainer(association);
				if (result == null) result = caseElementRecord(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseContainer(feature);
				if (result == null) result = caseElementRecord(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseRelationship(generalization);
				if (result == null) result = caseElementRecord(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseRelationship(connector);
				if (result == null) result = caseStructuredFeature(connector);
				if (result == null) result = caseFeature(connector);
				if (result == null) result = caseContainer(connector);
				if (result == null) result = caseElementRecord(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.STRUCTURED_FEATURE: {
				StructuredFeature structuredFeature = (StructuredFeature)theEObject;
				T result = caseStructuredFeature(structuredFeature);
				if (result == null) result = caseFeature(structuredFeature);
				if (result == null) result = caseContainer(structuredFeature);
				if (result == null) result = caseElementRecord(structuredFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.REFINED_ASSOCIATION: {
				RefinedAssociation refinedAssociation = (RefinedAssociation)theEObject;
				T result = caseRefinedAssociation(refinedAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.VALUE_OPTION: {
				ValueOption valueOption = (ValueOption)theEObject;
				T result = caseValueOption(valueOption);
				if (result == null) result = caseRelationship(valueOption);
				if (result == null) result = caseClass(valueOption);
				if (result == null) result = caseContainer(valueOption);
				if (result == null) result = caseElementRecord(valueOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.DATA_FEATURE: {
				DataFeature dataFeature = (DataFeature)theEObject;
				T result = caseDataFeature(dataFeature);
				if (result == null) result = caseFeature(dataFeature);
				if (result == null) result = caseContainer(dataFeature);
				if (result == null) result = caseElementRecord(dataFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.STRUCTURED_CLASS: {
				StructuredClass structuredClass = (StructuredClass)theEObject;
				T result = caseStructuredClass(structuredClass);
				if (result == null) result = caseClass(structuredClass);
				if (result == null) result = caseContainer(structuredClass);
				if (result == null) result = caseElementRecord(structuredClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.GENERALIZATION_SET: {
				GeneralizationSet generalizationSet = (GeneralizationSet)theEObject;
				T result = caseGeneralizationSet(generalizationSet);
				if (result == null) result = caseRelationship(generalizationSet);
				if (result == null) result = caseElementRecord(generalizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseConnector(binding);
				if (result == null) result = caseRelationship(binding);
				if (result == null) result = caseStructuredFeature(binding);
				if (result == null) result = caseFeature(binding);
				if (result == null) result = caseContainer(binding);
				if (result == null) result = caseElementRecord(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.VALUE_RESTRICTION: {
				ValueRestriction valueRestriction = (ValueRestriction)theEObject;
				T result = caseValueRestriction(valueRestriction);
				if (result == null) result = caseClass(valueRestriction);
				if (result == null) result = caseContainer(valueRestriction);
				if (result == null) result = caseElementRecord(valueRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClass(dataType);
				if (result == null) result = caseContainer(dataType);
				if (result == null) result = caseElementRecord(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.FEATURE_PATH_NODE: {
				FeaturePathNode featurePathNode = (FeaturePathNode)theEObject;
				T result = caseFeaturePathNode(featurePathNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurePackage.RESTRICTS: {
				Restricts restricts = (Restricts)theEObject;
				T result = caseRestricts(restricts);
				if (result == null) result = caseGeneralization(restricts);
				if (result == null) result = caseRelationship(restricts);
				if (result == null) result = caseElementRecord(restricts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.omg.sysml.kerml.structure.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredFeature(StructuredFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refined Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refined Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinedAssociation(RefinedAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueOption(ValueOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFeature(DataFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClass(StructuredClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSet(GeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRestriction(ValueRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Path Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Path Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePathNode(FeaturePathNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestricts(Restricts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRecord(ElementRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StructureSwitch
