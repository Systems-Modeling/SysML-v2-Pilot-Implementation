/**
 */
package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Activity;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.AssociationBlock;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Block;
import org.omg.sysml.lang.sysml.BlockExpression;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.ConditionalSuccession;
import org.omg.sysml.lang.sysml.ConjugatedPortMembership;
import org.omg.sysml.lang.sysml.InterfaceUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ValueProperty;
import org.omg.sysml.lang.sysml.ValueType;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.ForkNode;
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
import org.omg.sysml.lang.sysml.JoinNode;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralReal;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.LiteralUnbounded;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MergeNode;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.OrderedFeature;
import org.omg.sysml.lang.sysml.Ownership;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.PartProperty;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortMembership;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.QueryPathExpression;
import org.omg.sysml.lang.sysml.QueryPathStepExpression;
import org.omg.sysml.lang.sysml.QueryQualifierExpression;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceProperty;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SendActionUsage;
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
import org.omg.sysml.lang.sysml.DecisionNode;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage
 * @generated
 */
public class SysMLDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SysMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysMLDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = SysMLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject)notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SysMLPackage.MEMBERSHIP:
				notifyMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.RELATIONSHIP:
				notifyRelationshipChanged(notification, eClass);
				break;
			case SysMLPackage.PACKAGE:
				notifyPackageChanged(notification, eClass);
				break;
			case SysMLPackage.IMPORT:
				notifyImportChanged(notification, eClass);
				break;
			case SysMLPackage.PREDICATE:
				notifyPredicateChanged(notification, eClass);
				break;
			case SysMLPackage.FUNCTION:
				notifyFunctionChanged(notification, eClass);
				break;
			case SysMLPackage.BEHAVIOR:
				notifyBehaviorChanged(notification, eClass);
				break;
			case SysMLPackage.CLASSIFIER:
				notifyClassifierChanged(notification, eClass);
				break;
			case SysMLPackage.TYPE:
				notifyTypeChanged(notification, eClass);
				break;
			case SysMLPackage.GENERALIZATION:
				notifyGeneralizationChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_MEMBERSHIP:
				notifyFeatureMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE:
				notifyFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.REDEFINITION:
				notifyRedefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.SUBSETTING:
				notifySubsettingChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_VALUE:
				notifyFeatureValueChanged(notification, eClass);
				break;
			case SysMLPackage.EXPRESSION:
				notifyExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.STEP:
				notifyStepChanged(notification, eClass);
				break;
			case SysMLPackage.MULTIPLICITY:
				notifyMultiplicityChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_TYPING:
				notifyFeatureTypingChanged(notification, eClass);
				break;
			case SysMLPackage.SUPERCLASSING:
				notifySuperclassingChanged(notification, eClass);
				break;
			case SysMLPackage.PARAMETER:
				notifyParameterChanged(notification, eClass);
				break;
			case SysMLPackage.ANNOTATION:
				notifyAnnotationChanged(notification, eClass);
				break;
			case SysMLPackage.OWNERSHIP:
				notifyOwnershipChanged(notification, eClass);
				break;
			case SysMLPackage.PORT_USAGE:
				notifyPortUsageChanged(notification, eClass);
				break;
			case SysMLPackage.PORT_DEFINITION:
				notifyPortDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.ACTION_USAGE:
				notifyActionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.CLASS:
				notifyClassChanged(notification, eClass);
				break;
			case SysMLPackage.PART_PROPERTY:
				notifyPartPropertyChanged(notification, eClass);
				break;
			case SysMLPackage.BLOCK:
				notifyBlockChanged(notification, eClass);
				break;
			case SysMLPackage.ASSOCIATION_BLOCK:
				notifyAssociationBlockChanged(notification, eClass);
				break;
			case SysMLPackage.ASSOCIATION:
				notifyAssociationChanged(notification, eClass);
				break;
			case SysMLPackage.CONNECTOR:
				notifyConnectorChanged(notification, eClass);
				break;
			case SysMLPackage.CONNECTION_USAGE:
				notifyConnectionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.INTERFACE_DEFINITION:
				notifyInterfaceDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.INTERFACE_USAGE:
				notifyInterfaceUsageChanged(notification, eClass);
				break;
			case SysMLPackage.VALUE_TYPE:
				notifyValueTypeChanged(notification, eClass);
				break;
			case SysMLPackage.DATA_TYPE:
				notifyDataTypeChanged(notification, eClass);
				break;
			case SysMLPackage.ACCEPT_ACTION_USAGE:
				notifyAcceptActionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.PERFORM_ACTION_USAGE:
				notifyPerformActionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.SEND_ACTION_USAGE:
				notifySendActionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.VALUE_PROPERTY:
				notifyValuePropertyChanged(notification, eClass);
				break;
			case SysMLPackage.REFERENCE_PROPERTY:
				notifyReferencePropertyChanged(notification, eClass);
				break;
			case SysMLPackage.MERGE_NODE:
				notifyMergeNodeChanged(notification, eClass);
				break;
			case SysMLPackage.FORK_NODE:
				notifyForkNodeChanged(notification, eClass);
				break;
			case SysMLPackage.DECISION_NODE:
				notifyDecisionNodeChanged(notification, eClass);
				break;
			case SysMLPackage.JOIN_NODE:
				notifyJoinNodeChanged(notification, eClass);
				break;
			case SysMLPackage.CONDITIONAL_SUCCESSION:
				notifyConditionalSuccessionChanged(notification, eClass);
				break;
			case SysMLPackage.SUCCESSION:
				notifySuccessionChanged(notification, eClass);
				break;
			case SysMLPackage.CONJUGATED_PORT_MEMBERSHIP:
				notifyConjugatedPortMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.PORT_MEMBERSHIP:
				notifyPortMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.ACTIVITY:
				notifyActivityChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FLOW_END:
				notifyItemFlowEndChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FEATURE:
				notifyItemFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FLOW_FEATURE:
				notifyItemFlowFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FLOW:
				notifyItemFlowChanged(notification, eClass);
				break;
			case SysMLPackage.INTERACTION:
				notifyInteractionChanged(notification, eClass);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW:
				notifySuccessionItemFlowChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION:
				notifyFeatureReferenceExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION:
				notifySequenceConstructionExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.BLOCK_EXPRESSION:
				notifyBlockExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION:
				notifyQueryPathStepExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION:
				notifyOperatorExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.INVOCATION_EXPRESSION:
				notifyInvocationExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION:
				notifyQueryQualifierExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.QUERY_PATH_EXPRESSION:
				notifyQueryPathExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION:
				notifyInstanceCreationExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_BOOLEAN:
				notifyLiteralBooleanChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_EXPRESSION:
				notifyLiteralExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_REAL:
				notifyLiteralRealChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_INTEGER:
				notifyLiteralIntegerChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_STRING:
				notifyLiteralStringChanged(notification, eClass);
				break;
			case SysMLPackage.NULL_EXPRESSION:
				notifyNullExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED:
				notifyLiteralUnboundedChanged(notification, eClass);
				break;
			case SysMLPackage.PARAMETER_MEMBERSHIP:
				notifyParameterMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.TARGET_END:
				notifyTargetEndChanged(notification, eClass);
				break;
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP:
				notifyReturnParameterMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.SOURCE_END:
				notifySourceEndChanged(notification, eClass);
				break;
			case SysMLPackage.ORDERED_FEATURE:
				notifyOrderedFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.STRUCTURED_FEATURE:
				notifyStructuredFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.BINDING_CONNECTOR:
				notifyBindingConnectorChanged(notification, eClass);
				break;
			case SysMLPackage.END_FEATURE_MEMBERSHIP:
				notifyEndFeatureMembershipChanged(notification, eClass);
				break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @param derivedUnion the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass, EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyEndFeatureMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(EndFeatureMembership.class)) {
			case SysMLPackage.END_FEATURE_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.END_FEATURE_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConjugatedPortMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConjugatedPortMembership.class)) {
			case SysMLPackage.CONJUGATED_PORT_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATED_PORT_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATED_PORT_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATED_PORT_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPortMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PortMembership.class)) {
			case SysMLPackage.PORT_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PORT_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PORT_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PORT_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySendActionUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SendActionUsage.class)) {
			case SysMLPackage.SEND_ACTION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEND_ACTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEND_ACTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAcceptActionUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AcceptActionUsage.class)) {
			case SysMLPackage.ACCEPT_ACTION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ACCEPT_ACTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ACCEPT_ACTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPerformActionUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PerformActionUsage.class)) {
			case SysMLPackage.PERFORM_ACTION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PERFORM_ACTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PERFORM_ACTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyForkNodeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ForkNode.class)) {
			case SysMLPackage.FORK_NODE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FORK_NODE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FORK_NODE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDecisionNodeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(DecisionNode.class)) {
			case SysMLPackage.DECISION_NODE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.DECISION_NODE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.DECISION_NODE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyJoinNodeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(JoinNode.class)) {
			case SysMLPackage.JOIN_NODE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.JOIN_NODE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.JOIN_NODE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyMergeNodeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(MergeNode.class)) {
			case SysMLPackage.MERGE_NODE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.MERGE_NODE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.MERGE_NODE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFeatureMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(FeatureMembership.class)) {
			case SysMLPackage.FEATURE_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Membership.class)) {
			case SysMLPackage.MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRelationshipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Relationship.class)) {
			case SysMLPackage.RELATIONSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RELATIONSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPackageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(org.omg.sysml.lang.sysml.Package.class)) {
			case SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyImportChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Import.class)) {
			case SysMLPackage.IMPORT__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.IMPORT__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.IMPORT__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.IMPORT__SELECTER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPredicateChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Predicate.class)) {
			case SysMLPackage.PREDICATE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PREDICATE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PREDICATE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFunctionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Function.class)) {
			case SysMLPackage.FUNCTION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FUNCTION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FUNCTION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyBehaviorChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Behavior.class)) {
			case SysMLPackage.BEHAVIOR__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BEHAVIOR__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BEHAVIOR__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClassifierChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Classifier.class)) {
			case SysMLPackage.CLASSIFIER__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASSIFIER__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASSIFIER__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTypeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Type.class)) {
			case SysMLPackage.TYPE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.TYPE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.TYPE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClassChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(org.omg.sysml.lang.sysml.Class.class)) {
			case SysMLPackage.CLASS__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASS__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASS__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyGeneralizationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Generalization.class)) {
			case SysMLPackage.GENERALIZATION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.GENERALIZATION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.GENERALIZATION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.GENERALIZATION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.GENERALIZATION__OWNING_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Feature.class)) {
			case SysMLPackage.FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRedefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Redefinition.class)) {
			case SysMLPackage.REDEFINITION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REDEFINITION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REDEFINITION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REDEFINITION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REDEFINITION__OWNING_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySubsettingChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Subsetting.class)) {
			case SysMLPackage.SUBSETTING__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUBSETTING__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUBSETTING__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUBSETTING__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUBSETTING__OWNING_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFeatureValueChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(FeatureValue.class)) {
			case SysMLPackage.FEATURE_VALUE__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_VALUE__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_VALUE__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_VALUE__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Expression.class)) {
			case SysMLPackage.EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStepChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Step.class)) {
			case SysMLPackage.STEP__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STEP__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STEP__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyMultiplicityChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Multiplicity.class)) {
			case SysMLPackage.MULTIPLICITY__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.MULTIPLICITY__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.MULTIPLICITY__LOWER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.MULTIPLICITY__UPPER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFeatureTypingChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(FeatureTyping.class)) {
			case SysMLPackage.FEATURE_TYPING__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_TYPING__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_TYPING__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_TYPING__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.FEATURE_TYPING__OWNING_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySuperclassingChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Superclassing.class)) {
			case SysMLPackage.SUPERCLASSING__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUPERCLASSING__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUPERCLASSING__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUPERCLASSING__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUPERCLASSING__OWNING_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyParameterChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Parameter.class)) {
			case SysMLPackage.PARAMETER__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PARAMETER__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PARAMETER__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAssociationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Association.class)) {
			case SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConnectorChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Connector.class)) {
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTOR__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTOR__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTOR__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOrderedFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(OrderedFeature.class)) {
			case SysMLPackage.ORDERED_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ORDERED_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ORDERED_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyStructuredFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(StructuredFeature.class)) {
			case SysMLPackage.STRUCTURED_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDataTypeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(DataType.class)) {
			case SysMLPackage.DATA_TYPE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.DATA_TYPE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.DATA_TYPE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPortUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PortUsage.class)) {
			case SysMLPackage.PORT_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PORT_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PORT_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPortDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PortDefinition.class)) {
			case SysMLPackage.PORT_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PORT_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PORT_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActionUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ActionUsage.class)) {
			case SysMLPackage.ACTION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ACTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ACTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyActivityChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Activity.class)) {
			case SysMLPackage.ACTIVITY__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ACTIVITY__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ACTIVITY__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyValueTypeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ValueType.class)) {
			case SysMLPackage.VALUE_TYPE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.VALUE_TYPE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.VALUE_TYPE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInterfaceDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(InterfaceDefinition.class)) {
			case SysMLPackage.INTERFACE_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyBlockChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Block.class)) {
			case SysMLPackage.BLOCK__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BLOCK__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BLOCK__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInterfaceUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(InterfaceUsage.class)) {
			case SysMLPackage.INTERFACE_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_USAGE__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERFACE_USAGE__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERFACE_USAGE__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERFACE_USAGE__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConnectionUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConnectionUsage.class)) {
			case SysMLPackage.CONNECTION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTION_USAGE__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTION_USAGE__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAssociationBlockChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AssociationBlock.class)) {
			case SysMLPackage.ASSOCIATION_BLOCK__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION_BLOCK__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION_BLOCK__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION_BLOCK__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReferencePropertyChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ReferenceProperty.class)) {
			case SysMLPackage.REFERENCE_PROPERTY__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.REFERENCE_PROPERTY__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.REFERENCE_PROPERTY__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyPartPropertyChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PartProperty.class)) {
			case SysMLPackage.PART_PROPERTY__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PART_PROPERTY__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PART_PROPERTY__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyValuePropertyChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ValueProperty.class)) {
			case SysMLPackage.VALUE_PROPERTY__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.VALUE_PROPERTY__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.VALUE_PROPERTY__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyBindingConnectorChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(BindingConnector.class)) {
			case SysMLPackage.BINDING_CONNECTOR__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BINDING_CONNECTOR__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BINDING_CONNECTOR__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BINDING_CONNECTOR__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.BINDING_CONNECTOR__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.BINDING_CONNECTOR__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.BINDING_CONNECTOR__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySuccessionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Succession.class)) {
			case SysMLPackage.SUCCESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUCCESSION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUCCESSION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUCCESSION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyAnnotationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Annotation.class)) {
			case SysMLPackage.ANNOTATION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ANNOTATION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ANNOTATION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ANNOTATION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInteractionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Interaction.class)) {
			case SysMLPackage.INTERACTION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERACTION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERACTION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERACTION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERACTION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERACTION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.INTERACTION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOwnershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Ownership.class)) {
			case SysMLPackage.OWNERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.OWNERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.OWNERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.OWNERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.OWNERSHIP__OWNING_SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyConditionalSuccessionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConditionalSuccession.class)) {
			case SysMLPackage.CONDITIONAL_SUCCESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONDITIONAL_SUCCESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONDITIONAL_SUCCESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONDITIONAL_SUCCESSION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONDITIONAL_SUCCESSION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONDITIONAL_SUCCESSION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONDITIONAL_SUCCESSION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralBooleanChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LiteralBoolean.class)) {
			case SysMLPackage.LITERAL_BOOLEAN__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInvocationExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(InvocationExpression.class)) {
			case SysMLPackage.INVOCATION_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INVOCATION_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INVOCATION_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyBlockExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(BlockExpression.class)) {
			case SysMLPackage.BLOCK_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BLOCK_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BLOCK_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyParameterMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ParameterMembership.class)) {
			case SysMLPackage.PARAMETER_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PARAMETER_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyReturnParameterMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ReturnParameterMembership.class)) {
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyQueryPathStepExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QueryPathStepExpression.class)) {
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyQueryQualifierExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QueryQualifierExpression.class)) {
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyQueryPathExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QueryPathExpression.class)) {
			case SysMLPackage.QUERY_PATH_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_PATH_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_PATH_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LiteralExpression.class)) {
			case SysMLPackage.LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralRealChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LiteralReal.class)) {
			case SysMLPackage.LITERAL_REAL__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_REAL__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_REAL__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralUnboundedChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LiteralUnbounded.class)) {
			case SysMLPackage.LITERAL_UNBOUNDED__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralIntegerChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LiteralInteger.class)) {
			case SysMLPackage.LITERAL_INTEGER__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_INTEGER__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_INTEGER__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyItemFlowEndChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ItemFlowEnd.class)) {
			case SysMLPackage.ITEM_FLOW_END__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW_END__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW_END__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyItemFlowFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ItemFlowFeature.class)) {
			case SysMLPackage.ITEM_FLOW_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyItemFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ItemFeature.class)) {
			case SysMLPackage.ITEM_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySourceEndChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SourceEnd.class)) {
			case SysMLPackage.SOURCE_END__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SOURCE_END__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SOURCE_END__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyTargetEndChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(TargetEnd.class)) {
			case SysMLPackage.TARGET_END__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.TARGET_END__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.TARGET_END__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyOperatorExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(OperatorExpression.class)) {
			case SysMLPackage.OPERATOR_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyLiteralStringChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LiteralString.class)) {
			case SysMLPackage.LITERAL_STRING__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_STRING__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_STRING__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyItemFlowChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ItemFlow.class)) {
			case SysMLPackage.ITEM_FLOW__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ITEM_FLOW__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ITEM_FLOW__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySuccessionItemFlowChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SuccessionItemFlow.class)) {
			case SysMLPackage.SUCCESSION_ITEM_FLOW__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyInstanceCreationExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(InstanceCreationExpression.class)) {
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyNullExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(NullExpression.class)) {
			case SysMLPackage.NULL_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.NULL_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.NULL_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySequenceConstructionExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SequenceConstructionExpression.class)) {
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyFeatureReferenceExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(FeatureReferenceExpression.class)) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
		}
	}

} //SysMLDerivedUnionAdapter
