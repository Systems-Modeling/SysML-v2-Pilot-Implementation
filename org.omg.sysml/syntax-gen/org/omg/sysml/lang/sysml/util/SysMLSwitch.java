/**
 */
package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorEnd;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementReferenceExpression;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureAccessExpression;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.InstanceCreationExpression;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralNull;
import org.omg.sysml.lang.sysml.LiteralReal;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.LiteralUnbounded;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.OFSuccession;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.OrderedFeature;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SequenceAccessExpression;
import org.omg.sysml.lang.sysml.SequenceConstructionExpression;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.StructuredFeature;
import org.omg.sysml.lang.sysml.Subset;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.SysMLPackage;

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
 * @see org.omg.sysml.lang.sysml.SysMLPackage
 * @generated
 */
public class SysMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SysMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysMLSwitch() {
		if (modelPackage == null) {
			modelPackage = SysMLPackage.eINSTANCE;
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
			case SysMLPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseClass(association);
				if (result == null) result = caseCategory(association);
				if (result == null) result = casePackage(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseClass(behavior);
				if (result == null) result = caseCategory(behavior);
				if (result == null) result = casePackage(behavior);
				if (result == null) result = caseElement(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = casePackage(category);
				if (result == null) result = caseElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CLASS: {
				org.omg.sysml.lang.sysml.Class class_ = (org.omg.sysml.lang.sysml.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseCategory(class_);
				if (result == null) result = casePackage(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseRelationship(connector);
				if (result == null) result = caseFeature(connector);
				if (result == null) result = caseCategory(connector);
				if (result == null) result = casePackage(connector);
				if (result == null) result = caseElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONNECTOR_END: {
				ConnectorEnd connectorEnd = (ConnectorEnd)theEObject;
				T result = caseConnectorEnd(connectorEnd);
				if (result == null) result = caseRelationship(connectorEnd);
				if (result == null) result = caseElement(connectorEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION: {
				ElementReferenceExpression elementReferenceExpression = (ElementReferenceExpression)theEObject;
				T result = caseElementReferenceExpression(elementReferenceExpression);
				if (result == null) result = caseExpression(elementReferenceExpression);
				if (result == null) result = caseFunction(elementReferenceExpression);
				if (result == null) result = caseBehavior(elementReferenceExpression);
				if (result == null) result = caseClass(elementReferenceExpression);
				if (result == null) result = caseCategory(elementReferenceExpression);
				if (result == null) result = casePackage(elementReferenceExpression);
				if (result == null) result = caseElement(elementReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.END_FEATURE_MEMBERSHIP: {
				EndFeatureMembership endFeatureMembership = (EndFeatureMembership)theEObject;
				T result = caseEndFeatureMembership(endFeatureMembership);
				if (result == null) result = caseFeatureMembership(endFeatureMembership);
				if (result == null) result = caseMembership(endFeatureMembership);
				if (result == null) result = caseRelationship(endFeatureMembership);
				if (result == null) result = caseElement(endFeatureMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseFunction(expression);
				if (result == null) result = caseBehavior(expression);
				if (result == null) result = caseClass(expression);
				if (result == null) result = caseCategory(expression);
				if (result == null) result = casePackage(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseCategory(feature);
				if (result == null) result = casePackage(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION: {
				FeatureAccessExpression featureAccessExpression = (FeatureAccessExpression)theEObject;
				T result = caseFeatureAccessExpression(featureAccessExpression);
				if (result == null) result = caseExpression(featureAccessExpression);
				if (result == null) result = caseFunction(featureAccessExpression);
				if (result == null) result = caseBehavior(featureAccessExpression);
				if (result == null) result = caseClass(featureAccessExpression);
				if (result == null) result = caseCategory(featureAccessExpression);
				if (result == null) result = casePackage(featureAccessExpression);
				if (result == null) result = caseElement(featureAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_MEMBERSHIP: {
				FeatureMembership featureMembership = (FeatureMembership)theEObject;
				T result = caseFeatureMembership(featureMembership);
				if (result == null) result = caseMembership(featureMembership);
				if (result == null) result = caseRelationship(featureMembership);
				if (result == null) result = caseElement(featureMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseBehavior(function);
				if (result == null) result = caseClass(function);
				if (result == null) result = caseCategory(function);
				if (result == null) result = casePackage(function);
				if (result == null) result = caseElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseRelationship(generalization);
				if (result == null) result = caseElement(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseRelationship(import_);
				if (result == null) result = caseElement(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION: {
				InstanceCreationExpression instanceCreationExpression = (InstanceCreationExpression)theEObject;
				T result = caseInstanceCreationExpression(instanceCreationExpression);
				if (result == null) result = caseExpression(instanceCreationExpression);
				if (result == null) result = caseFunction(instanceCreationExpression);
				if (result == null) result = caseBehavior(instanceCreationExpression);
				if (result == null) result = caseClass(instanceCreationExpression);
				if (result == null) result = caseCategory(instanceCreationExpression);
				if (result == null) result = casePackage(instanceCreationExpression);
				if (result == null) result = caseElement(instanceCreationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FLOW: {
				ItemFlow itemFlow = (ItemFlow)theEObject;
				T result = caseItemFlow(itemFlow);
				if (result == null) result = caseConnector(itemFlow);
				if (result == null) result = caseStep(itemFlow);
				if (result == null) result = caseRelationship(itemFlow);
				if (result == null) result = caseFeature(itemFlow);
				if (result == null) result = caseCategory(itemFlow);
				if (result == null) result = casePackage(itemFlow);
				if (result == null) result = caseElement(itemFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_BOOLEAN: {
				LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
				T result = caseLiteralBoolean(literalBoolean);
				if (result == null) result = caseLiteralExpression(literalBoolean);
				if (result == null) result = caseExpression(literalBoolean);
				if (result == null) result = caseFunction(literalBoolean);
				if (result == null) result = caseBehavior(literalBoolean);
				if (result == null) result = caseClass(literalBoolean);
				if (result == null) result = caseCategory(literalBoolean);
				if (result == null) result = casePackage(literalBoolean);
				if (result == null) result = caseElement(literalBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_EXPRESSION: {
				LiteralExpression literalExpression = (LiteralExpression)theEObject;
				T result = caseLiteralExpression(literalExpression);
				if (result == null) result = caseExpression(literalExpression);
				if (result == null) result = caseFunction(literalExpression);
				if (result == null) result = caseBehavior(literalExpression);
				if (result == null) result = caseClass(literalExpression);
				if (result == null) result = caseCategory(literalExpression);
				if (result == null) result = casePackage(literalExpression);
				if (result == null) result = caseElement(literalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_INTEGER: {
				LiteralInteger literalInteger = (LiteralInteger)theEObject;
				T result = caseLiteralInteger(literalInteger);
				if (result == null) result = caseLiteralExpression(literalInteger);
				if (result == null) result = caseExpression(literalInteger);
				if (result == null) result = caseFunction(literalInteger);
				if (result == null) result = caseBehavior(literalInteger);
				if (result == null) result = caseClass(literalInteger);
				if (result == null) result = caseCategory(literalInteger);
				if (result == null) result = casePackage(literalInteger);
				if (result == null) result = caseElement(literalInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_NULL: {
				LiteralNull literalNull = (LiteralNull)theEObject;
				T result = caseLiteralNull(literalNull);
				if (result == null) result = caseLiteralExpression(literalNull);
				if (result == null) result = caseExpression(literalNull);
				if (result == null) result = caseFunction(literalNull);
				if (result == null) result = caseBehavior(literalNull);
				if (result == null) result = caseClass(literalNull);
				if (result == null) result = caseCategory(literalNull);
				if (result == null) result = casePackage(literalNull);
				if (result == null) result = caseElement(literalNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_REAL: {
				LiteralReal literalReal = (LiteralReal)theEObject;
				T result = caseLiteralReal(literalReal);
				if (result == null) result = caseLiteralExpression(literalReal);
				if (result == null) result = caseExpression(literalReal);
				if (result == null) result = caseFunction(literalReal);
				if (result == null) result = caseBehavior(literalReal);
				if (result == null) result = caseClass(literalReal);
				if (result == null) result = caseCategory(literalReal);
				if (result == null) result = casePackage(literalReal);
				if (result == null) result = caseElement(literalReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_STRING: {
				LiteralString literalString = (LiteralString)theEObject;
				T result = caseLiteralString(literalString);
				if (result == null) result = caseLiteralExpression(literalString);
				if (result == null) result = caseExpression(literalString);
				if (result == null) result = caseFunction(literalString);
				if (result == null) result = caseBehavior(literalString);
				if (result == null) result = caseClass(literalString);
				if (result == null) result = caseCategory(literalString);
				if (result == null) result = casePackage(literalString);
				if (result == null) result = caseElement(literalString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_UNBOUNDED: {
				LiteralUnbounded literalUnbounded = (LiteralUnbounded)theEObject;
				T result = caseLiteralUnbounded(literalUnbounded);
				if (result == null) result = caseLiteralExpression(literalUnbounded);
				if (result == null) result = caseExpression(literalUnbounded);
				if (result == null) result = caseFunction(literalUnbounded);
				if (result == null) result = caseBehavior(literalUnbounded);
				if (result == null) result = caseClass(literalUnbounded);
				if (result == null) result = caseCategory(literalUnbounded);
				if (result == null) result = casePackage(literalUnbounded);
				if (result == null) result = caseElement(literalUnbounded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.MEMBERSHIP: {
				Membership membership = (Membership)theEObject;
				T result = caseMembership(membership);
				if (result == null) result = caseRelationship(membership);
				if (result == null) result = caseElement(membership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.OF_SUCCESSION: {
				OFSuccession ofSuccession = (OFSuccession)theEObject;
				T result = caseOFSuccession(ofSuccession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.OPERATOR_EXPRESSION: {
				OperatorExpression operatorExpression = (OperatorExpression)theEObject;
				T result = caseOperatorExpression(operatorExpression);
				if (result == null) result = caseExpression(operatorExpression);
				if (result == null) result = caseFunction(operatorExpression);
				if (result == null) result = caseBehavior(operatorExpression);
				if (result == null) result = caseClass(operatorExpression);
				if (result == null) result = caseCategory(operatorExpression);
				if (result == null) result = casePackage(operatorExpression);
				if (result == null) result = caseElement(operatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ORDERED_FEATURE: {
				OrderedFeature orderedFeature = (OrderedFeature)theEObject;
				T result = caseOrderedFeature(orderedFeature);
				if (result == null) result = caseStructuredFeature(orderedFeature);
				if (result == null) result = caseFeature(orderedFeature);
				if (result == null) result = caseCategory(orderedFeature);
				if (result == null) result = casePackage(orderedFeature);
				if (result == null) result = caseElement(orderedFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PACKAGE: {
				org.omg.sysml.lang.sysml.Package package_ = (org.omg.sysml.lang.sysml.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = caseFunction(predicate);
				if (result == null) result = caseBehavior(predicate);
				if (result == null) result = caseClass(predicate);
				if (result == null) result = caseCategory(predicate);
				if (result == null) result = casePackage(predicate);
				if (result == null) result = caseElement(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.REDEFINITION: {
				Redefinition redefinition = (Redefinition)theEObject;
				T result = caseRedefinition(redefinition);
				if (result == null) result = caseSubset(redefinition);
				if (result == null) result = caseGeneralization(redefinition);
				if (result == null) result = caseRelationship(redefinition);
				if (result == null) result = caseElement(redefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION: {
				SequenceAccessExpression sequenceAccessExpression = (SequenceAccessExpression)theEObject;
				T result = caseSequenceAccessExpression(sequenceAccessExpression);
				if (result == null) result = caseExpression(sequenceAccessExpression);
				if (result == null) result = caseFunction(sequenceAccessExpression);
				if (result == null) result = caseBehavior(sequenceAccessExpression);
				if (result == null) result = caseClass(sequenceAccessExpression);
				if (result == null) result = caseCategory(sequenceAccessExpression);
				if (result == null) result = casePackage(sequenceAccessExpression);
				if (result == null) result = caseElement(sequenceAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION: {
				SequenceConstructionExpression sequenceConstructionExpression = (SequenceConstructionExpression)theEObject;
				T result = caseSequenceConstructionExpression(sequenceConstructionExpression);
				if (result == null) result = caseExpression(sequenceConstructionExpression);
				if (result == null) result = caseFunction(sequenceConstructionExpression);
				if (result == null) result = caseBehavior(sequenceConstructionExpression);
				if (result == null) result = caseClass(sequenceConstructionExpression);
				if (result == null) result = caseCategory(sequenceConstructionExpression);
				if (result == null) result = casePackage(sequenceConstructionExpression);
				if (result == null) result = caseElement(sequenceConstructionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseFeature(step);
				if (result == null) result = caseCategory(step);
				if (result == null) result = casePackage(step);
				if (result == null) result = caseElement(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.STRUCTURED_FEATURE: {
				StructuredFeature structuredFeature = (StructuredFeature)theEObject;
				T result = caseStructuredFeature(structuredFeature);
				if (result == null) result = caseFeature(structuredFeature);
				if (result == null) result = caseCategory(structuredFeature);
				if (result == null) result = casePackage(structuredFeature);
				if (result == null) result = caseElement(structuredFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUBSET: {
				Subset subset = (Subset)theEObject;
				T result = caseSubset(subset);
				if (result == null) result = caseGeneralization(subset);
				if (result == null) result = caseRelationship(subset);
				if (result == null) result = caseElement(subset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUCCESSION: {
				Succession succession = (Succession)theEObject;
				T result = caseSuccession(succession);
				if (result == null) result = caseConnector(succession);
				if (result == null) result = caseRelationship(succession);
				if (result == null) result = caseFeature(succession);
				if (result == null) result = caseCategory(succession);
				if (result == null) result = casePackage(succession);
				if (result == null) result = caseElement(succession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUCCESSION_ITEM_FLOW: {
				SuccessionItemFlow successionItemFlow = (SuccessionItemFlow)theEObject;
				T result = caseSuccessionItemFlow(successionItemFlow);
				if (result == null) result = caseItemFlow(successionItemFlow);
				if (result == null) result = caseSuccession(successionItemFlow);
				if (result == null) result = caseConnector(successionItemFlow);
				if (result == null) result = caseStep(successionItemFlow);
				if (result == null) result = caseRelationship(successionItemFlow);
				if (result == null) result = caseFeature(successionItemFlow);
				if (result == null) result = caseCategory(successionItemFlow);
				if (result == null) result = casePackage(successionItemFlow);
				if (result == null) result = caseElement(successionItemFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMembership(Membership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OF Succession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OF Succession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOFSuccession(OFSuccession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.omg.sysml.lang.sysml.Package object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Literal Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralReal(LiteralReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementReferenceExpression(ElementReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralNull(LiteralNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExpression(LiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Construction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Construction Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceConstructionExpression(SequenceConstructionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Instance Creation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Creation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceCreationExpression(InstanceCreationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFlow(ItemFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorExpression(OperatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedFeature(OrderedFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
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
	public T caseClass(org.omg.sysml.lang.sysml.Class object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Unbounded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Unbounded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralUnbounded(LiteralUnbounded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinition(Redefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubset(Subset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Succession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Succession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccession(Succession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Succession Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Succession Item Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessionItemFlow(SuccessionItemFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMembership(FeatureMembership object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Feature Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureAccessExpression(FeatureAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceAccessExpression(SequenceAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Feature Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndFeatureMembership(EndFeatureMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEnd(ConnectorEnd object) {
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

} //SysMLSwitch
