/**
 */
package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorEnd;
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
			case SysMLPackage.ASSOCIATION:
				notifyAssociationChanged(notification, eClass);
				break;
			case SysMLPackage.RELATIONSHIP:
				notifyRelationshipChanged(notification, eClass);
				break;
			case SysMLPackage.MEMBERSHIP:
				notifyMembershipChanged(notification, eClass);
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
			case SysMLPackage.CLASS:
				notifyClassChanged(notification, eClass);
				break;
			case SysMLPackage.CATEGORY:
				notifyCategoryChanged(notification, eClass);
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
			case SysMLPackage.EXPRESSION:
				notifyExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.REDEFINITION:
				notifyRedefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.SUBSET:
				notifySubsetChanged(notification, eClass);
				break;
			case SysMLPackage.STEP:
				notifyStepChanged(notification, eClass);
				break;
			case SysMLPackage.END_FEATURE_MEMBERSHIP:
				notifyEndFeatureMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.CONNECTOR:
				notifyConnectorChanged(notification, eClass);
				break;
			case SysMLPackage.CONNECTOR_END:
				notifyConnectorEndChanged(notification, eClass);
				break;
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION:
				notifyElementReferenceExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION:
				notifyFeatureAccessExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION:
				notifyInstanceCreationExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FLOW:
				notifyItemFlowChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_BOOLEAN:
				notifyLiteralBooleanChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_EXPRESSION:
				notifyLiteralExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_INTEGER:
				notifyLiteralIntegerChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_NULL:
				notifyLiteralNullChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_REAL:
				notifyLiteralRealChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_STRING:
				notifyLiteralStringChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED:
				notifyLiteralUnboundedChanged(notification, eClass);
				break;
			case SysMLPackage.ORDERED_FEATURE:
				notifyOrderedFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.STRUCTURED_FEATURE:
				notifyStructuredFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION:
				notifyOperatorExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION:
				notifySequenceAccessExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION:
				notifySequenceConstructionExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.SUCCESSION:
				notifySuccessionChanged(notification, eClass);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW:
				notifySuccessionItemFlowChanged(notification, eClass);
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
	protected void notifyAssociationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Association.class)) {
			case SysMLPackage.ASSOCIATION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ASSOCIATION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ASSOCIATION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.ASSOCIATION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
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
	protected void notifyRelationshipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Relationship.class)) {
			case SysMLPackage.RELATIONSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.RELATIONSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
			case SysMLPackage.PACKAGE__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.IMPORT__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
			case SysMLPackage.PREDICATE__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.PREDICATE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PREDICATE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PREDICATE__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.PREDICATE__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.PREDICATE__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.PREDICATE__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.FUNCTION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FUNCTION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FUNCTION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FUNCTION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FUNCTION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FUNCTION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FUNCTION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.BEHAVIOR__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.BEHAVIOR__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BEHAVIOR__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BEHAVIOR__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.BEHAVIOR__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.BEHAVIOR__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.BEHAVIOR__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.CLASS__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CLASS__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASS__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASS__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CLASS__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASS__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CLASS__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
	protected void notifyCategoryChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Category.class)) {
			case SysMLPackage.CATEGORY__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CATEGORY__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CATEGORY__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CATEGORY__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CATEGORY__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CATEGORY__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CATEGORY__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.GENERALIZATION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.FEATURE_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
			case SysMLPackage.FEATURE__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE__OWNED_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE__OWNED_SUBSET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.EXPRESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.EXPRESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.EXPRESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.EXPRESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.EXPRESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.REDEFINITION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
	protected void notifySubsetChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Subset.class)) {
			case SysMLPackage.SUBSET__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.SUBSET__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
			case SysMLPackage.STEP__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STEP__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STEP__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STEP__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STEP__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STEP__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STEP__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STEP__OWNED_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STEP__OWNED_REDEFINITION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STEP__OWNED_SUBSET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
	protected void notifyEndFeatureMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(EndFeatureMembership.class)) {
			case SysMLPackage.END_FEATURE_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.END_FEATURE_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
			case SysMLPackage.CONNECTOR__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CONNECTOR__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTOR__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTOR__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CONNECTOR__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CONNECTOR__OWNED_REDEFINITION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CONNECTOR__OWNED_SUBSET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.CONNECTOR__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.CONNECTOR__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.CONNECTOR__RELATED_FEATURES:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
	protected void notifyConnectorEndChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConnectorEnd.class)) {
			case SysMLPackage.CONNECTOR_END__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.CONNECTOR_END__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
	protected void notifyElementReferenceExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ElementReferenceExpression.class)) {
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ELEMENT_REFERENCE_EXPRESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
	protected void notifyFeatureAccessExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(FeatureAccessExpression.class)) {
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.FEATURE_ACCESS_EXPRESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.ITEM_FLOW__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ITEM_FLOW__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ITEM_FLOW__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_REDEFINITION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_SUBSET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ITEM_FLOW__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.ITEM_FLOW__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.ITEM_FLOW__RELATED_FEATURES:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
			case SysMLPackage.LITERAL_BOOLEAN__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.LITERAL_EXPRESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.LITERAL_INTEGER__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_INTEGER__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_INTEGER__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_INTEGER__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_INTEGER__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_INTEGER__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_INTEGER__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
	protected void notifyLiteralNullChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LiteralNull.class)) {
			case SysMLPackage.LITERAL_NULL__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_NULL__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_NULL__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_NULL__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_NULL__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_NULL__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_NULL__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.LITERAL_REAL__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_REAL__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_REAL__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_REAL__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_REAL__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_REAL__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_REAL__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.LITERAL_STRING__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_STRING__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_STRING__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_STRING__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_STRING__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_STRING__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_STRING__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.LITERAL_UNBOUNDED__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.ORDERED_FEATURE__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ORDERED_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ORDERED_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ORDERED_FEATURE__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ORDERED_FEATURE__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.ORDERED_FEATURE__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ORDERED_FEATURE__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ORDERED_FEATURE__OWNED_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ORDERED_FEATURE__OWNED_REDEFINITION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.ORDERED_FEATURE__OWNED_SUBSET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_REDEFINITION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.STRUCTURED_FEATURE__OWNED_SUBSET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.OPERATOR_EXPRESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
	protected void notifySequenceAccessExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SequenceAccessExpression.class)) {
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
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
			case SysMLPackage.SUCCESSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION__OWNED_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION__OWNED_REDEFINITION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION__OWNED_SUBSET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.SUCCESSION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.SUCCESSION__RELATED_FEATURES:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
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
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_MEMBER:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_GENERALIZATION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_FEATURE_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_REDEFINITION:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_SUBSET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.PACKAGE__MEMBER);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__RELATED_FEATURES:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED);
				break;
		}
	}

} //SysMLDerivedUnionAdapter
