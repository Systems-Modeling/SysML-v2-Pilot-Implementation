/**
 */
package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.omg.sysml.lang.sysml.AcceptAction;
import org.omg.sysml.lang.sysml.Action;
import org.omg.sysml.lang.sysml.Activity;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.AssociationBlock;
import org.omg.sysml.lang.sysml.AtomicInteraction;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Block;
import org.omg.sysml.lang.sysml.BlockExpression;
import org.omg.sysml.lang.sysml.BlockProperty;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.ValueProperty;
import org.omg.sysml.lang.sysml.ValueType;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.InterfaceConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.ForkAction;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.InstanceCreationExpression;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.InterfaceDefinition;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.JoinAction;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralReal;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.LiteralUnbounded;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MergeAction;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.OfSuccession;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.OrderedFeature;
import org.omg.sysml.lang.sysml.Ownership;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.PartProperty;
import org.omg.sysml.lang.sysml.PerformAction;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.QueryPathExpression;
import org.omg.sysml.lang.sysml.QueryPathStepExpression;
import org.omg.sysml.lang.sysml.QueryQualifierExpression;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceProperty;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SendAction;
import org.omg.sysml.lang.sysml.SequenceConstructionExpression;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.StructuredFeature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TargetEnd;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.DecisionAction;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.DoAction;

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
			case SysMLPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
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
			case SysMLPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElement(relationship);
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
			case SysMLPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseRelationship(import_);
				if (result == null) result = caseElement(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = caseFunction(predicate);
				if (result == null) result = caseBehavior(predicate);
				if (result == null) result = caseClassifier(predicate);
				if (result == null) result = caseType(predicate);
				if (result == null) result = casePackage(predicate);
				if (result == null) result = caseElement(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseBehavior(function);
				if (result == null) result = caseClassifier(function);
				if (result == null) result = caseType(function);
				if (result == null) result = casePackage(function);
				if (result == null) result = caseElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BEHAVIOR: {
				Behavior behavior = (Behavior)theEObject;
				T result = caseBehavior(behavior);
				if (result == null) result = caseClassifier(behavior);
				if (result == null) result = caseType(behavior);
				if (result == null) result = casePackage(behavior);
				if (result == null) result = caseElement(behavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = casePackage(classifier);
				if (result == null) result = caseElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = casePackage(type);
				if (result == null) result = caseElement(type);
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
			case SysMLPackage.FEATURE_MEMBERSHIP: {
				FeatureMembership featureMembership = (FeatureMembership)theEObject;
				T result = caseFeatureMembership(featureMembership);
				if (result == null) result = caseMembership(featureMembership);
				if (result == null) result = caseRelationship(featureMembership);
				if (result == null) result = caseElement(featureMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseType(feature);
				if (result == null) result = casePackage(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.REDEFINITION: {
				Redefinition redefinition = (Redefinition)theEObject;
				T result = caseRedefinition(redefinition);
				if (result == null) result = caseSubsetting(redefinition);
				if (result == null) result = caseGeneralization(redefinition);
				if (result == null) result = caseRelationship(redefinition);
				if (result == null) result = caseElement(redefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUBSETTING: {
				Subsetting subsetting = (Subsetting)theEObject;
				T result = caseSubsetting(subsetting);
				if (result == null) result = caseGeneralization(subsetting);
				if (result == null) result = caseRelationship(subsetting);
				if (result == null) result = caseElement(subsetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_VALUE: {
				FeatureValue featureValue = (FeatureValue)theEObject;
				T result = caseFeatureValue(featureValue);
				if (result == null) result = caseRelationship(featureValue);
				if (result == null) result = caseElement(featureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseStep(expression);
				if (result == null) result = caseFeature(expression);
				if (result == null) result = caseType(expression);
				if (result == null) result = casePackage(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseFeature(step);
				if (result == null) result = caseType(step);
				if (result == null) result = casePackage(step);
				if (result == null) result = caseElement(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.MULTIPLICITY: {
				Multiplicity multiplicity = (Multiplicity)theEObject;
				T result = caseMultiplicity(multiplicity);
				if (result == null) result = caseRelationship(multiplicity);
				if (result == null) result = caseElement(multiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_TYPING: {
				FeatureTyping featureTyping = (FeatureTyping)theEObject;
				T result = caseFeatureTyping(featureTyping);
				if (result == null) result = caseGeneralization(featureTyping);
				if (result == null) result = caseRelationship(featureTyping);
				if (result == null) result = caseElement(featureTyping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUPERCLASSING: {
				Superclassing superclassing = (Superclassing)theEObject;
				T result = caseSuperclassing(superclassing);
				if (result == null) result = caseGeneralization(superclassing);
				if (result == null) result = caseRelationship(superclassing);
				if (result == null) result = caseElement(superclassing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseFeature(parameter);
				if (result == null) result = caseType(parameter);
				if (result == null) result = casePackage(parameter);
				if (result == null) result = caseElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.OWNERSHIP: {
				Ownership ownership = (Ownership)theEObject;
				T result = caseOwnership(ownership);
				if (result == null) result = caseRelationship(ownership);
				if (result == null) result = caseElement(ownership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseRelationship(annotation);
				if (result == null) result = caseElement(annotation);
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
			case SysMLPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseDefinition(activity);
				if (result == null) result = caseBehavior(activity);
				if (result == null) result = caseClassifier(activity);
				if (result == null) result = caseType(activity);
				if (result == null) result = casePackage(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseClassifier(definition);
				if (result == null) result = caseType(definition);
				if (result == null) result = casePackage(definition);
				if (result == null) result = caseElement(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.USAGE: {
				Usage usage = (Usage)theEObject;
				T result = caseUsage(usage);
				if (result == null) result = caseFeature(usage);
				if (result == null) result = caseType(usage);
				if (result == null) result = casePackage(usage);
				if (result == null) result = caseElement(usage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PORT_USAGE: {
				PortUsage portUsage = (PortUsage)theEObject;
				T result = casePortUsage(portUsage);
				if (result == null) result = caseUsage(portUsage);
				if (result == null) result = caseFeature(portUsage);
				if (result == null) result = caseType(portUsage);
				if (result == null) result = casePackage(portUsage);
				if (result == null) result = caseElement(portUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PORT_DEFINITION: {
				PortDefinition portDefinition = (PortDefinition)theEObject;
				T result = casePortDefinition(portDefinition);
				if (result == null) result = caseDefinition(portDefinition);
				if (result == null) result = caseClassifier(portDefinition);
				if (result == null) result = caseType(portDefinition);
				if (result == null) result = casePackage(portDefinition);
				if (result == null) result = caseElement(portDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseUsage(property);
				if (result == null) result = caseFeature(property);
				if (result == null) result = caseType(property);
				if (result == null) result = casePackage(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseUsage(action);
				if (result == null) result = caseStep(action);
				if (result == null) result = caseFeature(action);
				if (result == null) result = caseType(action);
				if (result == null) result = casePackage(action);
				if (result == null) result = caseElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BLOCK_PROPERTY: {
				BlockProperty blockProperty = (BlockProperty)theEObject;
				T result = caseBlockProperty(blockProperty);
				if (result == null) result = caseProperty(blockProperty);
				if (result == null) result = caseUsage(blockProperty);
				if (result == null) result = caseFeature(blockProperty);
				if (result == null) result = caseType(blockProperty);
				if (result == null) result = casePackage(blockProperty);
				if (result == null) result = caseElement(blockProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CLASS: {
				org.omg.sysml.lang.sysml.Class class_ = (org.omg.sysml.lang.sysml.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = casePackage(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseDefinition(block);
				if (result == null) result = caseClass(block);
				if (result == null) result = caseClassifier(block);
				if (result == null) result = caseType(block);
				if (result == null) result = casePackage(block);
				if (result == null) result = caseElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ASSOCIATION_BLOCK: {
				AssociationBlock associationBlock = (AssociationBlock)theEObject;
				T result = caseAssociationBlock(associationBlock);
				if (result == null) result = caseAssociation(associationBlock);
				if (result == null) result = caseBlock(associationBlock);
				if (result == null) result = caseClass(associationBlock);
				if (result == null) result = caseRelationship(associationBlock);
				if (result == null) result = caseDefinition(associationBlock);
				if (result == null) result = caseClassifier(associationBlock);
				if (result == null) result = caseType(associationBlock);
				if (result == null) result = casePackage(associationBlock);
				if (result == null) result = caseElement(associationBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseClass(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseClassifier(association);
				if (result == null) result = caseType(association);
				if (result == null) result = casePackage(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseFeature(connector);
				if (result == null) result = caseRelationship(connector);
				if (result == null) result = caseType(connector);
				if (result == null) result = casePackage(connector);
				if (result == null) result = caseElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PART_PROPERTY: {
				PartProperty partProperty = (PartProperty)theEObject;
				T result = casePartProperty(partProperty);
				if (result == null) result = caseBlockProperty(partProperty);
				if (result == null) result = caseProperty(partProperty);
				if (result == null) result = caseUsage(partProperty);
				if (result == null) result = caseFeature(partProperty);
				if (result == null) result = caseType(partProperty);
				if (result == null) result = casePackage(partProperty);
				if (result == null) result = caseElement(partProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INTERFACE_DEFINITION: {
				InterfaceDefinition interfaceDefinition = (InterfaceDefinition)theEObject;
				T result = caseInterfaceDefinition(interfaceDefinition);
				if (result == null) result = caseAssociationBlock(interfaceDefinition);
				if (result == null) result = caseAssociation(interfaceDefinition);
				if (result == null) result = caseBlock(interfaceDefinition);
				if (result == null) result = caseClass(interfaceDefinition);
				if (result == null) result = caseRelationship(interfaceDefinition);
				if (result == null) result = caseDefinition(interfaceDefinition);
				if (result == null) result = caseClassifier(interfaceDefinition);
				if (result == null) result = caseType(interfaceDefinition);
				if (result == null) result = casePackage(interfaceDefinition);
				if (result == null) result = caseElement(interfaceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.CONNECTOR_USAGE: {
				ConnectorUsage connectorUsage = (ConnectorUsage)theEObject;
				T result = caseConnectorUsage(connectorUsage);
				if (result == null) result = caseConnector(connectorUsage);
				if (result == null) result = caseUsage(connectorUsage);
				if (result == null) result = caseFeature(connectorUsage);
				if (result == null) result = caseRelationship(connectorUsage);
				if (result == null) result = caseType(connectorUsage);
				if (result == null) result = casePackage(connectorUsage);
				if (result == null) result = caseElement(connectorUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INTERFACE_CONNECTOR: {
				InterfaceConnector interfaceConnector = (InterfaceConnector)theEObject;
				T result = caseInterfaceConnector(interfaceConnector);
				if (result == null) result = caseConnectorUsage(interfaceConnector);
				if (result == null) result = caseConnector(interfaceConnector);
				if (result == null) result = caseUsage(interfaceConnector);
				if (result == null) result = caseFeature(interfaceConnector);
				if (result == null) result = caseRelationship(interfaceConnector);
				if (result == null) result = caseType(interfaceConnector);
				if (result == null) result = casePackage(interfaceConnector);
				if (result == null) result = caseElement(interfaceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.REFERENCE_PROPERTY: {
				ReferenceProperty referenceProperty = (ReferenceProperty)theEObject;
				T result = caseReferenceProperty(referenceProperty);
				if (result == null) result = caseBlockProperty(referenceProperty);
				if (result == null) result = caseProperty(referenceProperty);
				if (result == null) result = caseUsage(referenceProperty);
				if (result == null) result = caseFeature(referenceProperty);
				if (result == null) result = caseType(referenceProperty);
				if (result == null) result = casePackage(referenceProperty);
				if (result == null) result = caseElement(referenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.VALUE_PROPERTY: {
				ValueProperty valueProperty = (ValueProperty)theEObject;
				T result = caseValueProperty(valueProperty);
				if (result == null) result = caseProperty(valueProperty);
				if (result == null) result = caseUsage(valueProperty);
				if (result == null) result = caseFeature(valueProperty);
				if (result == null) result = caseType(valueProperty);
				if (result == null) result = casePackage(valueProperty);
				if (result == null) result = caseElement(valueProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseClassifier(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = casePackage(dataType);
				if (result == null) result = caseElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = caseDefinition(valueType);
				if (result == null) result = caseDataType(valueType);
				if (result == null) result = caseClassifier(valueType);
				if (result == null) result = caseType(valueType);
				if (result == null) result = casePackage(valueType);
				if (result == null) result = caseElement(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.JOIN_ACTION: {
				JoinAction joinAction = (JoinAction)theEObject;
				T result = caseJoinAction(joinAction);
				if (result == null) result = caseAction(joinAction);
				if (result == null) result = caseUsage(joinAction);
				if (result == null) result = caseStep(joinAction);
				if (result == null) result = caseFeature(joinAction);
				if (result == null) result = caseType(joinAction);
				if (result == null) result = casePackage(joinAction);
				if (result == null) result = caseElement(joinAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.DECISION_ACTION: {
				DecisionAction decisionAction = (DecisionAction)theEObject;
				T result = caseDecisionAction(decisionAction);
				if (result == null) result = caseAction(decisionAction);
				if (result == null) result = caseUsage(decisionAction);
				if (result == null) result = caseStep(decisionAction);
				if (result == null) result = caseFeature(decisionAction);
				if (result == null) result = caseType(decisionAction);
				if (result == null) result = casePackage(decisionAction);
				if (result == null) result = caseElement(decisionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PERFORM_ACTION: {
				PerformAction performAction = (PerformAction)theEObject;
				T result = casePerformAction(performAction);
				if (result == null) result = caseAction(performAction);
				if (result == null) result = caseUsage(performAction);
				if (result == null) result = caseStep(performAction);
				if (result == null) result = caseFeature(performAction);
				if (result == null) result = caseType(performAction);
				if (result == null) result = casePackage(performAction);
				if (result == null) result = caseElement(performAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ACCEPT_ACTION: {
				AcceptAction acceptAction = (AcceptAction)theEObject;
				T result = caseAcceptAction(acceptAction);
				if (result == null) result = caseAction(acceptAction);
				if (result == null) result = caseUsage(acceptAction);
				if (result == null) result = caseStep(acceptAction);
				if (result == null) result = caseFeature(acceptAction);
				if (result == null) result = caseType(acceptAction);
				if (result == null) result = casePackage(acceptAction);
				if (result == null) result = caseElement(acceptAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.MERGE_ACTION: {
				MergeAction mergeAction = (MergeAction)theEObject;
				T result = caseMergeAction(mergeAction);
				if (result == null) result = caseAction(mergeAction);
				if (result == null) result = caseUsage(mergeAction);
				if (result == null) result = caseStep(mergeAction);
				if (result == null) result = caseFeature(mergeAction);
				if (result == null) result = caseType(mergeAction);
				if (result == null) result = casePackage(mergeAction);
				if (result == null) result = caseElement(mergeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SEND_ACTION: {
				SendAction sendAction = (SendAction)theEObject;
				T result = caseSendAction(sendAction);
				if (result == null) result = caseAction(sendAction);
				if (result == null) result = caseUsage(sendAction);
				if (result == null) result = caseStep(sendAction);
				if (result == null) result = caseFeature(sendAction);
				if (result == null) result = caseType(sendAction);
				if (result == null) result = casePackage(sendAction);
				if (result == null) result = caseElement(sendAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FORK_ACTION: {
				ForkAction forkAction = (ForkAction)theEObject;
				T result = caseForkAction(forkAction);
				if (result == null) result = caseAction(forkAction);
				if (result == null) result = caseUsage(forkAction);
				if (result == null) result = caseStep(forkAction);
				if (result == null) result = caseFeature(forkAction);
				if (result == null) result = caseType(forkAction);
				if (result == null) result = casePackage(forkAction);
				if (result == null) result = caseElement(forkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.DO_ACTION: {
				DoAction doAction = (DoAction)theEObject;
				T result = caseDoAction(doAction);
				if (result == null) result = caseAction(doAction);
				if (result == null) result = caseUsage(doAction);
				if (result == null) result = caseStep(doAction);
				if (result == null) result = caseFeature(doAction);
				if (result == null) result = caseType(doAction);
				if (result == null) result = casePackage(doAction);
				if (result == null) result = caseElement(doAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INVOCATION_EXPRESSION: {
				InvocationExpression invocationExpression = (InvocationExpression)theEObject;
				T result = caseInvocationExpression(invocationExpression);
				if (result == null) result = caseExpression(invocationExpression);
				if (result == null) result = caseStep(invocationExpression);
				if (result == null) result = caseFeature(invocationExpression);
				if (result == null) result = caseType(invocationExpression);
				if (result == null) result = casePackage(invocationExpression);
				if (result == null) result = caseElement(invocationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BLOCK_EXPRESSION: {
				BlockExpression blockExpression = (BlockExpression)theEObject;
				T result = caseBlockExpression(blockExpression);
				if (result == null) result = caseExpression(blockExpression);
				if (result == null) result = caseStep(blockExpression);
				if (result == null) result = caseFeature(blockExpression);
				if (result == null) result = caseType(blockExpression);
				if (result == null) result = casePackage(blockExpression);
				if (result == null) result = caseElement(blockExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION: {
				InstanceCreationExpression instanceCreationExpression = (InstanceCreationExpression)theEObject;
				T result = caseInstanceCreationExpression(instanceCreationExpression);
				if (result == null) result = caseInvocationExpression(instanceCreationExpression);
				if (result == null) result = caseExpression(instanceCreationExpression);
				if (result == null) result = caseStep(instanceCreationExpression);
				if (result == null) result = caseFeature(instanceCreationExpression);
				if (result == null) result = caseType(instanceCreationExpression);
				if (result == null) result = casePackage(instanceCreationExpression);
				if (result == null) result = caseElement(instanceCreationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION: {
				QueryQualifierExpression queryQualifierExpression = (QueryQualifierExpression)theEObject;
				T result = caseQueryQualifierExpression(queryQualifierExpression);
				if (result == null) result = caseOperatorExpression(queryQualifierExpression);
				if (result == null) result = caseInvocationExpression(queryQualifierExpression);
				if (result == null) result = caseExpression(queryQualifierExpression);
				if (result == null) result = caseStep(queryQualifierExpression);
				if (result == null) result = caseFeature(queryQualifierExpression);
				if (result == null) result = caseType(queryQualifierExpression);
				if (result == null) result = casePackage(queryQualifierExpression);
				if (result == null) result = caseElement(queryQualifierExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.OPERATOR_EXPRESSION: {
				OperatorExpression operatorExpression = (OperatorExpression)theEObject;
				T result = caseOperatorExpression(operatorExpression);
				if (result == null) result = caseInvocationExpression(operatorExpression);
				if (result == null) result = caseExpression(operatorExpression);
				if (result == null) result = caseStep(operatorExpression);
				if (result == null) result = caseFeature(operatorExpression);
				if (result == null) result = caseType(operatorExpression);
				if (result == null) result = casePackage(operatorExpression);
				if (result == null) result = caseElement(operatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION: {
				FeatureReferenceExpression featureReferenceExpression = (FeatureReferenceExpression)theEObject;
				T result = caseFeatureReferenceExpression(featureReferenceExpression);
				if (result == null) result = caseExpression(featureReferenceExpression);
				if (result == null) result = caseStep(featureReferenceExpression);
				if (result == null) result = caseFeature(featureReferenceExpression);
				if (result == null) result = caseType(featureReferenceExpression);
				if (result == null) result = casePackage(featureReferenceExpression);
				if (result == null) result = caseElement(featureReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION: {
				SequenceConstructionExpression sequenceConstructionExpression = (SequenceConstructionExpression)theEObject;
				T result = caseSequenceConstructionExpression(sequenceConstructionExpression);
				if (result == null) result = caseExpression(sequenceConstructionExpression);
				if (result == null) result = caseStep(sequenceConstructionExpression);
				if (result == null) result = caseFeature(sequenceConstructionExpression);
				if (result == null) result = caseType(sequenceConstructionExpression);
				if (result == null) result = casePackage(sequenceConstructionExpression);
				if (result == null) result = caseElement(sequenceConstructionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.QUERY_PATH_EXPRESSION: {
				QueryPathExpression queryPathExpression = (QueryPathExpression)theEObject;
				T result = caseQueryPathExpression(queryPathExpression);
				if (result == null) result = caseFeatureReferenceExpression(queryPathExpression);
				if (result == null) result = caseExpression(queryPathExpression);
				if (result == null) result = caseStep(queryPathExpression);
				if (result == null) result = caseFeature(queryPathExpression);
				if (result == null) result = caseType(queryPathExpression);
				if (result == null) result = casePackage(queryPathExpression);
				if (result == null) result = caseElement(queryPathExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION: {
				QueryPathStepExpression queryPathStepExpression = (QueryPathStepExpression)theEObject;
				T result = caseQueryPathStepExpression(queryPathStepExpression);
				if (result == null) result = caseOperatorExpression(queryPathStepExpression);
				if (result == null) result = caseInvocationExpression(queryPathStepExpression);
				if (result == null) result = caseExpression(queryPathStepExpression);
				if (result == null) result = caseStep(queryPathStepExpression);
				if (result == null) result = caseFeature(queryPathStepExpression);
				if (result == null) result = caseType(queryPathStepExpression);
				if (result == null) result = casePackage(queryPathStepExpression);
				if (result == null) result = caseElement(queryPathStepExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_BOOLEAN: {
				LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
				T result = caseLiteralBoolean(literalBoolean);
				if (result == null) result = caseLiteralExpression(literalBoolean);
				if (result == null) result = caseExpression(literalBoolean);
				if (result == null) result = caseStep(literalBoolean);
				if (result == null) result = caseFeature(literalBoolean);
				if (result == null) result = caseType(literalBoolean);
				if (result == null) result = casePackage(literalBoolean);
				if (result == null) result = caseElement(literalBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_EXPRESSION: {
				LiteralExpression literalExpression = (LiteralExpression)theEObject;
				T result = caseLiteralExpression(literalExpression);
				if (result == null) result = caseExpression(literalExpression);
				if (result == null) result = caseStep(literalExpression);
				if (result == null) result = caseFeature(literalExpression);
				if (result == null) result = caseType(literalExpression);
				if (result == null) result = casePackage(literalExpression);
				if (result == null) result = caseElement(literalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_UNBOUNDED: {
				LiteralUnbounded literalUnbounded = (LiteralUnbounded)theEObject;
				T result = caseLiteralUnbounded(literalUnbounded);
				if (result == null) result = caseLiteralExpression(literalUnbounded);
				if (result == null) result = caseExpression(literalUnbounded);
				if (result == null) result = caseStep(literalUnbounded);
				if (result == null) result = caseFeature(literalUnbounded);
				if (result == null) result = caseType(literalUnbounded);
				if (result == null) result = casePackage(literalUnbounded);
				if (result == null) result = caseElement(literalUnbounded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_STRING: {
				LiteralString literalString = (LiteralString)theEObject;
				T result = caseLiteralString(literalString);
				if (result == null) result = caseLiteralExpression(literalString);
				if (result == null) result = caseExpression(literalString);
				if (result == null) result = caseStep(literalString);
				if (result == null) result = caseFeature(literalString);
				if (result == null) result = caseType(literalString);
				if (result == null) result = casePackage(literalString);
				if (result == null) result = caseElement(literalString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_REAL: {
				LiteralReal literalReal = (LiteralReal)theEObject;
				T result = caseLiteralReal(literalReal);
				if (result == null) result = caseLiteralExpression(literalReal);
				if (result == null) result = caseExpression(literalReal);
				if (result == null) result = caseStep(literalReal);
				if (result == null) result = caseFeature(literalReal);
				if (result == null) result = caseType(literalReal);
				if (result == null) result = casePackage(literalReal);
				if (result == null) result = caseElement(literalReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.NULL_EXPRESSION: {
				NullExpression nullExpression = (NullExpression)theEObject;
				T result = caseNullExpression(nullExpression);
				if (result == null) result = caseExpression(nullExpression);
				if (result == null) result = caseStep(nullExpression);
				if (result == null) result = caseFeature(nullExpression);
				if (result == null) result = caseType(nullExpression);
				if (result == null) result = casePackage(nullExpression);
				if (result == null) result = caseElement(nullExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.LITERAL_INTEGER: {
				LiteralInteger literalInteger = (LiteralInteger)theEObject;
				T result = caseLiteralInteger(literalInteger);
				if (result == null) result = caseLiteralExpression(literalInteger);
				if (result == null) result = caseExpression(literalInteger);
				if (result == null) result = caseStep(literalInteger);
				if (result == null) result = caseFeature(literalInteger);
				if (result == null) result = caseType(literalInteger);
				if (result == null) result = casePackage(literalInteger);
				if (result == null) result = caseElement(literalInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.BINDING_CONNECTOR: {
				BindingConnector bindingConnector = (BindingConnector)theEObject;
				T result = caseBindingConnector(bindingConnector);
				if (result == null) result = caseConnector(bindingConnector);
				if (result == null) result = caseFeature(bindingConnector);
				if (result == null) result = caseRelationship(bindingConnector);
				if (result == null) result = caseType(bindingConnector);
				if (result == null) result = casePackage(bindingConnector);
				if (result == null) result = caseElement(bindingConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FLOW_FEATURE: {
				ItemFlowFeature itemFlowFeature = (ItemFlowFeature)theEObject;
				T result = caseItemFlowFeature(itemFlowFeature);
				if (result == null) result = caseFeature(itemFlowFeature);
				if (result == null) result = caseType(itemFlowFeature);
				if (result == null) result = casePackage(itemFlowFeature);
				if (result == null) result = caseElement(itemFlowFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FLOW_END: {
				ItemFlowEnd itemFlowEnd = (ItemFlowEnd)theEObject;
				T result = caseItemFlowEnd(itemFlowEnd);
				if (result == null) result = caseFeature(itemFlowEnd);
				if (result == null) result = caseType(itemFlowEnd);
				if (result == null) result = casePackage(itemFlowEnd);
				if (result == null) result = caseElement(itemFlowEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ATOMIC_INTERACTION: {
				AtomicInteraction atomicInteraction = (AtomicInteraction)theEObject;
				T result = caseAtomicInteraction(atomicInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FEATURE: {
				ItemFeature itemFeature = (ItemFeature)theEObject;
				T result = caseItemFeature(itemFeature);
				if (result == null) result = caseFeature(itemFeature);
				if (result == null) result = caseType(itemFeature);
				if (result == null) result = casePackage(itemFeature);
				if (result == null) result = caseElement(itemFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ITEM_FLOW: {
				ItemFlow itemFlow = (ItemFlow)theEObject;
				T result = caseItemFlow(itemFlow);
				if (result == null) result = caseConnector(itemFlow);
				if (result == null) result = caseStep(itemFlow);
				if (result == null) result = caseFeature(itemFlow);
				if (result == null) result = caseRelationship(itemFlow);
				if (result == null) result = caseType(itemFlow);
				if (result == null) result = casePackage(itemFlow);
				if (result == null) result = caseElement(itemFlow);
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
				if (result == null) result = caseFeature(successionItemFlow);
				if (result == null) result = caseRelationship(successionItemFlow);
				if (result == null) result = caseType(successionItemFlow);
				if (result == null) result = casePackage(successionItemFlow);
				if (result == null) result = caseElement(successionItemFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SUCCESSION: {
				Succession succession = (Succession)theEObject;
				T result = caseSuccession(succession);
				if (result == null) result = caseConnector(succession);
				if (result == null) result = caseFeature(succession);
				if (result == null) result = caseRelationship(succession);
				if (result == null) result = caseType(succession);
				if (result == null) result = casePackage(succession);
				if (result == null) result = caseElement(succession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseAssociation(interaction);
				if (result == null) result = caseBehavior(interaction);
				if (result == null) result = caseClass(interaction);
				if (result == null) result = caseRelationship(interaction);
				if (result == null) result = caseClassifier(interaction);
				if (result == null) result = caseType(interaction);
				if (result == null) result = casePackage(interaction);
				if (result == null) result = caseElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.TARGET_END: {
				TargetEnd targetEnd = (TargetEnd)theEObject;
				T result = caseTargetEnd(targetEnd);
				if (result == null) result = caseFeature(targetEnd);
				if (result == null) result = caseType(targetEnd);
				if (result == null) result = casePackage(targetEnd);
				if (result == null) result = caseElement(targetEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.SOURCE_END: {
				SourceEnd sourceEnd = (SourceEnd)theEObject;
				T result = caseSourceEnd(sourceEnd);
				if (result == null) result = caseFeature(sourceEnd);
				if (result == null) result = caseType(sourceEnd);
				if (result == null) result = casePackage(sourceEnd);
				if (result == null) result = caseElement(sourceEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP: {
				ReturnParameterMembership returnParameterMembership = (ReturnParameterMembership)theEObject;
				T result = caseReturnParameterMembership(returnParameterMembership);
				if (result == null) result = caseParameterMembership(returnParameterMembership);
				if (result == null) result = caseFeatureMembership(returnParameterMembership);
				if (result == null) result = caseMembership(returnParameterMembership);
				if (result == null) result = caseRelationship(returnParameterMembership);
				if (result == null) result = caseElement(returnParameterMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.PARAMETER_MEMBERSHIP: {
				ParameterMembership parameterMembership = (ParameterMembership)theEObject;
				T result = caseParameterMembership(parameterMembership);
				if (result == null) result = caseFeatureMembership(parameterMembership);
				if (result == null) result = caseMembership(parameterMembership);
				if (result == null) result = caseRelationship(parameterMembership);
				if (result == null) result = caseElement(parameterMembership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.STRUCTURED_FEATURE: {
				StructuredFeature structuredFeature = (StructuredFeature)theEObject;
				T result = caseStructuredFeature(structuredFeature);
				if (result == null) result = caseFeature(structuredFeature);
				if (result == null) result = caseType(structuredFeature);
				if (result == null) result = casePackage(structuredFeature);
				if (result == null) result = caseElement(structuredFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.OF_SUCCESSION: {
				OfSuccession ofSuccession = (OfSuccession)theEObject;
				T result = caseOfSuccession(ofSuccession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysMLPackage.ORDERED_FEATURE: {
				OrderedFeature orderedFeature = (OrderedFeature)theEObject;
				T result = caseOrderedFeature(orderedFeature);
				if (result == null) result = caseStructuredFeature(orderedFeature);
				if (result == null) result = caseFeature(orderedFeature);
				if (result == null) result = caseType(orderedFeature);
				if (result == null) result = casePackage(orderedFeature);
				if (result == null) result = caseElement(orderedFeature);
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
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Subsetting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsetting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetting(Subsetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue(FeatureValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicity(Multiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Typing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Typing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTyping(FeatureTyping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Superclassing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Superclassing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperclassing(Superclassing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsage(Usage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortUsage(PortUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDefinition(PortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeAction(MergeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformAction(PerformAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoAction(DoAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptAction(AcceptAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkAction(ForkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinAction(JoinAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionAction(DecisionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendAction(SendAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefinition(InterfaceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorUsage(ConnectorUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceConnector(InterfaceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationBlock(AssociationBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockProperty(BlockProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceProperty(ReferenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartProperty(PartProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueProperty(ValueProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Of Succession</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Of Succession</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOfSuccession(OfSuccession object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Binding Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingConnector(BindingConnector object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicInteraction(AtomicInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ownership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ownership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnership(Ownership object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationExpression(InvocationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockExpression(BlockExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterMembership(ParameterMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Parameter Membership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Parameter Membership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnParameterMembership(ReturnParameterMembership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Path Step Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Path Step Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryPathStepExpression(QueryPathStepExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Qualifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Qualifier Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryQualifierExpression(QueryQualifierExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Path Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Path Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryPathExpression(QueryPathExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Item Flow End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Flow End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFlowEnd(ItemFlowEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Flow Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Flow Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFlowFeature(ItemFlowFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemFeature(ItemFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceEnd(SourceEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetEnd(TargetEnd object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullExpression(NullExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Feature Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureReferenceExpression(FeatureReferenceExpression object) {
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
