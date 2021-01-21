/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.*;

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
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION:
				notifyQueryPathStepExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION:
				notifyOperatorExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.INVOCATION_EXPRESSION:
				notifyInvocationExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.EXPRESSION:
				notifyExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.STEP:
				notifyStepChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE:
				notifyFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.TYPE:
				notifyTypeChanged(notification, eClass);
				break;
			case SysMLPackage.NAMESPACE:
				notifyNamespaceChanged(notification, eClass);
				break;
			case SysMLPackage.MEMBERSHIP:
				notifyMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.RELATIONSHIP:
				notifyRelationshipChanged(notification, eClass);
				break;
			case SysMLPackage.DOCUMENTATION:
				notifyDocumentationChanged(notification, eClass);
				break;
			case SysMLPackage.ANNOTATION:
				notifyAnnotationChanged(notification, eClass);
				break;
			case SysMLPackage.IMPORT:
				notifyImportChanged(notification, eClass);
				break;
			case SysMLPackage.GENERALIZATION:
				notifyGeneralizationChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_MEMBERSHIP:
				notifyFeatureMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.TYPE_FEATURING:
				notifyTypeFeaturingChanged(notification, eClass);
				break;
			case SysMLPackage.CONJUGATION:
				notifyConjugationChanged(notification, eClass);
				break;
			case SysMLPackage.MULTIPLICITY:
				notifyMultiplicityChanged(notification, eClass);
				break;
			case SysMLPackage.REDEFINITION:
				notifyRedefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.SUBSETTING:
				notifySubsettingChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_TYPING:
				notifyFeatureTypingChanged(notification, eClass);
				break;
			case SysMLPackage.BEHAVIOR:
				notifyBehaviorChanged(notification, eClass);
				break;
			case SysMLPackage.CLASS:
				notifyClassChanged(notification, eClass);
				break;
			case SysMLPackage.CLASSIFIER:
				notifyClassifierChanged(notification, eClass);
				break;
			case SysMLPackage.SUPERCLASSING:
				notifySuperclassingChanged(notification, eClass);
				break;
			case SysMLPackage.FUNCTION:
				notifyFunctionChanged(notification, eClass);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION:
				notifyInstanceCreationExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION:
				notifyQueryQualifierExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.BLOCK_EXPRESSION:
				notifyBlockExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.QUERY_PATH_EXPRESSION:
				notifyQueryPathExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION:
				notifyFeatureReferenceExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED:
				notifyLiteralUnboundedChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_EXPRESSION:
				notifyLiteralExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_INTEGER:
				notifyLiteralIntegerChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_STRING:
				notifyLiteralStringChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_REAL:
				notifyLiteralRealChanged(notification, eClass);
				break;
			case SysMLPackage.LITERAL_BOOLEAN:
				notifyLiteralBooleanChanged(notification, eClass);
				break;
			case SysMLPackage.NULL_EXPRESSION:
				notifyNullExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.FEATURE_VALUE:
				notifyFeatureValueChanged(notification, eClass);
				break;
			case SysMLPackage.BINDING_CONNECTOR:
				notifyBindingConnectorChanged(notification, eClass);
				break;
			case SysMLPackage.CONNECTOR:
				notifyConnectorChanged(notification, eClass);
				break;
			case SysMLPackage.ASSOCIATION:
				notifyAssociationChanged(notification, eClass);
				break;
			case SysMLPackage.STRUCTURE:
				notifyStructureChanged(notification, eClass);
				break;
			case SysMLPackage.SOURCE_END:
				notifySourceEndChanged(notification, eClass);
				break;
			case SysMLPackage.TARGET_END:
				notifyTargetEndChanged(notification, eClass);
				break;
			case SysMLPackage.SUCCESSION:
				notifySuccessionChanged(notification, eClass);
				break;
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP:
				notifyResultExpressionMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.BOOLEAN_EXPRESSION:
				notifyBooleanExpressionChanged(notification, eClass);
				break;
			case SysMLPackage.PREDICATE:
				notifyPredicateChanged(notification, eClass);
				break;
			case SysMLPackage.INVARIANT:
				notifyInvariantChanged(notification, eClass);
				break;
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP:
				notifyReturnParameterMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.PARAMETER_MEMBERSHIP:
				notifyParameterMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.MULTIPLICITY_RANGE:
				notifyMultiplicityRangeChanged(notification, eClass);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE:
				notifyAssociationStructureChanged(notification, eClass);
				break;
			case SysMLPackage.DATA_TYPE:
				notifyDataTypeChanged(notification, eClass);
				break;
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP:
				notifyElementFilterMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.PACKAGE:
				notifyPackageChanged(notification, eClass);
				break;
			case SysMLPackage.ANNOTATING_FEATURE:
				notifyAnnotatingFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.METADATA_FEATURE:
				notifyMetadataFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.METADATA_FEATURE_VALUE:
				notifyMetadataFeatureValueChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FLOW_FEATURE:
				notifyItemFlowFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FLOW_END:
				notifyItemFlowEndChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FEATURE:
				notifyItemFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.INTERACTION:
				notifyInteractionChanged(notification, eClass);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW:
				notifySuccessionItemFlowChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_FLOW:
				notifyItemFlowChanged(notification, eClass);
				break;
			case SysMLPackage.END_FEATURE_MEMBERSHIP:
				notifyEndFeatureMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.REQUIREMENT_DEFINITION:
				notifyRequirementDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.CONSTRAINT_DEFINITION:
				notifyConstraintDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.PORT_USAGE:
				notifyPortUsageChanged(notification, eClass);
				break;
			case SysMLPackage.PORT_DEFINITION:
				notifyPortDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION:
				notifyConjugatedPortDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.PORT_CONJUGATION:
				notifyPortConjugationChanged(notification, eClass);
				break;
			case SysMLPackage.ACTION_USAGE:
				notifyActionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.STATE_USAGE:
				notifyStateUsageChanged(notification, eClass);
				break;
			case SysMLPackage.CONSTRAINT_USAGE:
				notifyConstraintUsageChanged(notification, eClass);
				break;
			case SysMLPackage.TRANSITION_USAGE:
				notifyTransitionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.ACCEPT_ACTION_USAGE:
				notifyAcceptActionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.REQUIREMENT_USAGE:
				notifyRequirementUsageChanged(notification, eClass);
				break;
			case SysMLPackage.CALCULATION_USAGE:
				notifyCalculationUsageChanged(notification, eClass);
				break;
			case SysMLPackage.CASE_USAGE:
				notifyCaseUsageChanged(notification, eClass);
				break;
			case SysMLPackage.CASE_DEFINITION:
				notifyCaseDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.CALCULATION_DEFINITION:
				notifyCalculationDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.ACTION_DEFINITION:
				notifyActionDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.ANALYSIS_CASE_USAGE:
				notifyAnalysisCaseUsageChanged(notification, eClass);
				break;
			case SysMLPackage.ANALYSIS_CASE_DEFINITION:
				notifyAnalysisCaseDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.VARIANT_MEMBERSHIP:
				notifyVariantMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.REFERENCE_USAGE:
				notifyReferenceUsageChanged(notification, eClass);
				break;
			case SysMLPackage.CONNECTION_USAGE:
				notifyConnectionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.PART_USAGE:
				notifyPartUsageChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_USAGE:
				notifyItemUsageChanged(notification, eClass);
				break;
			case SysMLPackage.PART_DEFINITION:
				notifyPartDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.ITEM_DEFINITION:
				notifyItemDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.INDIVIDUAL_USAGE:
				notifyIndividualUsageChanged(notification, eClass);
				break;
			case SysMLPackage.INDIVIDUAL_DEFINITION:
				notifyIndividualDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.INTERFACE_USAGE:
				notifyInterfaceUsageChanged(notification, eClass);
				break;
			case SysMLPackage.INTERFACE_DEFINITION:
				notifyInterfaceDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.CONNECTION_DEFINITION:
				notifyConnectionDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.ATTRIBUTE_USAGE:
				notifyAttributeUsageChanged(notification, eClass);
				break;
			case SysMLPackage.VIEW_USAGE:
				notifyViewUsageChanged(notification, eClass);
				break;
			case SysMLPackage.VIEW_DEFINITION:
				notifyViewDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.VIEWPOINT_USAGE:
				notifyViewpointUsageChanged(notification, eClass);
				break;
			case SysMLPackage.VIEWPOINT_DEFINITION:
				notifyViewpointDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.RENDERING_USAGE:
				notifyRenderingUsageChanged(notification, eClass);
				break;
			case SysMLPackage.RENDERING_DEFINITION:
				notifyRenderingDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.VERIFICATION_CASE_USAGE:
				notifyVerificationCaseUsageChanged(notification, eClass);
				break;
			case SysMLPackage.VERIFICATION_CASE_DEFINITION:
				notifyVerificationCaseDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.ENUMERATION_USAGE:
				notifyEnumerationUsageChanged(notification, eClass);
				break;
			case SysMLPackage.ENUMERATION_DEFINITION:
				notifyEnumerationDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.ATTRIBUTE_DEFINITION:
				notifyAttributeDefinitionChanged(notification, eClass);
				break;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP:
				notifyRequirementConstraintMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.SUBJECT_MEMBERSHIP:
				notifySubjectMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE:
				notifySatisfyRequirementUsageChanged(notification, eClass);
				break;
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE:
				notifyAssertConstraintUsageChanged(notification, eClass);
				break;
			case SysMLPackage.OBJECTIVE_MEMBERSHIP:
				notifyObjectiveMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.CONJUGATED_PORT_TYPING:
				notifyConjugatedPortTypingChanged(notification, eClass);
				break;
			case SysMLPackage.DECISION_NODE:
				notifyDecisionNodeChanged(notification, eClass);
				break;
			case SysMLPackage.FORK_NODE:
				notifyForkNodeChanged(notification, eClass);
				break;
			case SysMLPackage.SEND_ACTION_USAGE:
				notifySendActionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.JOIN_NODE:
				notifyJoinNodeChanged(notification, eClass);
				break;
			case SysMLPackage.PERFORM_ACTION_USAGE:
				notifyPerformActionUsageChanged(notification, eClass);
				break;
			case SysMLPackage.MERGE_NODE:
				notifyMergeNodeChanged(notification, eClass);
				break;
			case SysMLPackage.TIME_SLICE_FEATURE:
				notifyTimeSliceFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.SNAPSHOT_FEATURE:
				notifySnapshotFeatureChanged(notification, eClass);
				break;
			case SysMLPackage.LIFE_CLASS:
				notifyLifeClassChanged(notification, eClass);
				break;
			case SysMLPackage.DEPENDENCY:
				notifyDependencyChanged(notification, eClass);
				break;
			case SysMLPackage.EXPOSE:
				notifyExposeChanged(notification, eClass);
				break;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP:
				notifyRequirementVerificationMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.EXHIBIT_STATE_USAGE:
				notifyExhibitStateUsageChanged(notification, eClass);
				break;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP:
				notifyStateSubactionMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP:
				notifyTransitionFeatureMembershipChanged(notification, eClass);
				break;
			case SysMLPackage.STATE_DEFINITION:
				notifyStateDefinitionChanged(notification, eClass);
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
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SEND_ACTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SEND_ACTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyAssertConstraintUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AssertConstraintUsage.class)) {
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyExposeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Expose.class)) {
			case SysMLPackage.EXPOSE__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.EXPOSE__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.EXPOSE__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.EXPOSE__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.EXPOSE__IMPORTED_NAMESPACE:
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
	protected void notifyRequirementVerificationMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RequirementVerificationMembership.class)) {
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
	protected void notifySubjectMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SubjectMembership.class)) {
			case SysMLPackage.SUBJECT_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUBJECT_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
	protected void notifyObjectiveMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ObjectiveMembership.class)) {
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
	protected void notifyAcceptActionUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AcceptActionUsage.class)) {
			case SysMLPackage.ACCEPT_ACTION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ACCEPT_ACTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ACCEPT_ACTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PERFORM_ACTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PERFORM_ACTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.FORK_NODE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.FORK_NODE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.DECISION_NODE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.DECISION_NODE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.JOIN_NODE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.JOIN_NODE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.MERGE_NODE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.MERGE_NODE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyStateDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(StateDefinition.class)) {
			case SysMLPackage.STATE_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.STATE_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.STATE_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
	protected void notifyTypeFeaturingChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(TypeFeaturing.class)) {
			case SysMLPackage.TYPE_FEATURING__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.TYPE_FEATURING__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.TYPE_FEATURING__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.TYPE_FEATURING__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.TYPE_FEATURING__OWNING_FEATURE_OF_TYPE:
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
	protected void notifyConjugationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Conjugation.class)) {
			case SysMLPackage.CONJUGATION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATION__OWNING_TYPE:
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
	protected void notifyDocumentationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Documentation.class)) {
			case SysMLPackage.DOCUMENTATION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.DOCUMENTATION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.DOCUMENTATION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.DOCUMENTATION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.DOCUMENTATION__OWNING_ANNOTATED_ELEMENT:
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.IMPORT__IMPORTED_NAMESPACE:
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PREDICATE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PREDICATE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyResultExpressionMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ResultExpressionMembership.class)) {
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
	protected void notifyTransitionUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(TransitionUsage.class)) {
			case SysMLPackage.TRANSITION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.TRANSITION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.TRANSITION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.FUNCTION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.FUNCTION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.BEHAVIOR__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.BEHAVIOR__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASSIFIER__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASSIFIER__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.TYPE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.TYPE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyNamespaceChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Namespace.class)) {
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASS__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CLASS__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyRequirementUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RequirementUsage.class)) {
			case SysMLPackage.REQUIREMENT_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.REQUIREMENT_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.REQUIREMENT_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyRequirementDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RequirementDefinition.class)) {
			case SysMLPackage.REQUIREMENT_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.REQUIREMENT_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.REQUIREMENT_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.STEP__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.STEP__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.MULTIPLICITY__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.MULTIPLICITY__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.MULTIPLICITY__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyAssociationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Association.class)) {
			case SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
				break;
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTOR__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTOR__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
				break;
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
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
	protected void notifyAssociationStructureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AssociationStructure.class)) {
			case SysMLPackage.ASSOCIATION_STRUCTURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE__SOURCE_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
				break;
			case SysMLPackage.ASSOCIATION_STRUCTURE__TARGET_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
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
	protected void notifyStructureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Structure.class)) {
			case SysMLPackage.STRUCTURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.STRUCTURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.STRUCTURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.DATA_TYPE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.DATA_TYPE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyElementFilterMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ElementFilterMembership.class)) {
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__OWNED_RELATED_ELEMENT:
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
	protected void notifyPortUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PortUsage.class)) {
			case SysMLPackage.PORT_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PORT_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PORT_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PORT_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PORT_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyConjugatedPortDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConjugatedPortDefinition.class)) {
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyPortConjugationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PortConjugation.class)) {
			case SysMLPackage.PORT_CONJUGATION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PORT_CONJUGATION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PORT_CONJUGATION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PORT_CONJUGATION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.PORT_CONJUGATION__OWNING_TYPE:
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
	protected void notifyStateUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(StateUsage.class)) {
			case SysMLPackage.STATE_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.STATE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.STATE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyConstraintUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConstraintUsage.class)) {
			case SysMLPackage.CONSTRAINT_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONSTRAINT_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONSTRAINT_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyInvariantChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Invariant.class)) {
			case SysMLPackage.INVARIANT__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INVARIANT__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INVARIANT__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyBooleanExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(BooleanExpression.class)) {
			case SysMLPackage.BOOLEAN_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.BOOLEAN_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.BOOLEAN_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ACTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ACTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyExhibitStateUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ExhibitStateUsage.class)) {
			case SysMLPackage.EXHIBIT_STATE_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.EXHIBIT_STATE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.EXHIBIT_STATE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyAttributeDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AttributeDefinition.class)) {
			case SysMLPackage.ATTRIBUTE_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ATTRIBUTE_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ATTRIBUTE_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyStateSubactionMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(StateSubactionMembership.class)) {
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
	protected void notifyConjugatedPortTypingChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConjugatedPortTyping.class)) {
			case SysMLPackage.CONJUGATED_PORT_TYPING__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATED_PORT_TYPING__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATED_PORT_TYPING__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATED_PORT_TYPING__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATED_PORT_TYPING__OWNING_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONJUGATED_PORT_TYPING__PORT_DEFINITION:
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
	protected void notifyIndividualUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(IndividualUsage.class)) {
			case SysMLPackage.INDIVIDUAL_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INDIVIDUAL_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INDIVIDUAL_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyIndividualDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(IndividualDefinition.class)) {
			case SysMLPackage.INDIVIDUAL_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INDIVIDUAL_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INDIVIDUAL_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyItemDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ItemDefinition.class)) {
			case SysMLPackage.ITEM_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.INTERFACE_DEFINITION__SOURCE_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
				break;
			case SysMLPackage.INTERFACE_DEFINITION__TARGET_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
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
	protected void notifyConnectionDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConnectionDefinition.class)) {
			case SysMLPackage.CONNECTION_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTION_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTION_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTION_DEFINITION__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTION_DEFINITION__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.CONNECTION_DEFINITION__SOURCE_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
				break;
			case SysMLPackage.CONNECTION_DEFINITION__TARGET_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
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
	protected void notifyAttributeUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AttributeUsage.class)) {
			case SysMLPackage.ATTRIBUTE_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ATTRIBUTE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ATTRIBUTE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyViewUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ViewUsage.class)) {
			case SysMLPackage.VIEW_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VIEW_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VIEW_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyViewDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ViewDefinition.class)) {
			case SysMLPackage.VIEW_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VIEW_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VIEW_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyViewpointUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ViewpointUsage.class)) {
			case SysMLPackage.VIEWPOINT_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VIEWPOINT_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VIEWPOINT_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyViewpointDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ViewpointDefinition.class)) {
			case SysMLPackage.VIEWPOINT_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VIEWPOINT_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VIEWPOINT_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyRenderingUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RenderingUsage.class)) {
			case SysMLPackage.RENDERING_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.RENDERING_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.RENDERING_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyRenderingDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RenderingDefinition.class)) {
			case SysMLPackage.RENDERING_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.RENDERING_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.RENDERING_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyVerificationCaseUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(VerificationCaseUsage.class)) {
			case SysMLPackage.VERIFICATION_CASE_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VERIFICATION_CASE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VERIFICATION_CASE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyVerificationCaseDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(VerificationCaseDefinition.class)) {
			case SysMLPackage.VERIFICATION_CASE_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VERIFICATION_CASE_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.VERIFICATION_CASE_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyEnumerationUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(EnumerationUsage.class)) {
			case SysMLPackage.ENUMERATION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ENUMERATION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ENUMERATION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyEnumerationDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(EnumerationDefinition.class)) {
			case SysMLPackage.ENUMERATION_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ENUMERATION_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ENUMERATION_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERFACE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.INTERFACE_USAGE__SOURCE_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
				break;
			case SysMLPackage.INTERFACE_USAGE__TARGET_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
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
	protected void notifyConstraintDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ConstraintDefinition.class)) {
			case SysMLPackage.CONSTRAINT_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONSTRAINT_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONSTRAINT_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyCaseDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(CaseDefinition.class)) {
			case SysMLPackage.CASE_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CASE_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CASE_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyCalculationDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(CalculationDefinition.class)) {
			case SysMLPackage.CALCULATION_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CALCULATION_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CALCULATION_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyActionDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ActionDefinition.class)) {
			case SysMLPackage.ACTION_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ACTION_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ACTION_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyCalculationUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(CalculationUsage.class)) {
			case SysMLPackage.CALCULATION_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CALCULATION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CALCULATION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyCaseUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(CaseUsage.class)) {
			case SysMLPackage.CASE_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CASE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CASE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyVariantMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(VariantMembership.class)) {
			case SysMLPackage.VARIANT_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.VARIANT_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_RELATED_ELEMENT:
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
	protected void notifyAnalysisCaseUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AnalysisCaseUsage.class)) {
			case SysMLPackage.ANALYSIS_CASE_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ANALYSIS_CASE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ANALYSIS_CASE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyAnalysisCaseDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AnalysisCaseDefinition.class)) {
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyReferenceUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ReferenceUsage.class)) {
			case SysMLPackage.REFERENCE_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.REFERENCE_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.REFERENCE_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTION_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.CONNECTION_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.CONNECTION_USAGE__SOURCE_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
				break;
			case SysMLPackage.CONNECTION_USAGE__TARGET_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
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
	protected void notifyPartUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PartUsage.class)) {
			case SysMLPackage.PART_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PART_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PART_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyItemUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ItemUsage.class)) {
			case SysMLPackage.ITEM_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyPartDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(PartDefinition.class)) {
			case SysMLPackage.PART_DEFINITION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PART_DEFINITION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.PART_DEFINITION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifySatisfyRequirementUsageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SatisfyRequirementUsage.class)) {
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.BINDING_CONNECTOR__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.BINDING_CONNECTOR__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.BINDING_CONNECTOR__SOURCE_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
				break;
			case SysMLPackage.BINDING_CONNECTOR__TARGET_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
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
	protected void notifyMultiplicityRangeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(MultiplicityRange.class)) {
			case SysMLPackage.MULTIPLICITY_RANGE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.MULTIPLICITY_RANGE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.MULTIPLICITY_RANGE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.MULTIPLICITY_RANGE__LOWER_BOUND:
				notifyChanged(notification, eClass, SysMLPackage.Literals.MULTIPLICITY_RANGE__BOUND);
				break;
			case SysMLPackage.MULTIPLICITY_RANGE__UPPER_BOUND:
				notifyChanged(notification, eClass, SysMLPackage.Literals.MULTIPLICITY_RANGE__BOUND);
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
	protected void notifyAnnotatingFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(AnnotatingFeature.class)) {
			case SysMLPackage.ANNOTATING_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ANNOTATING_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ANNOTATING_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyMetadataFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(MetadataFeature.class)) {
			case SysMLPackage.METADATA_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.METADATA_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.METADATA_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyMetadataFeatureValueChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(MetadataFeatureValue.class)) {
			case SysMLPackage.METADATA_FEATURE_VALUE__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.METADATA_FEATURE_VALUE__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.METADATA_FEATURE_VALUE__OWNED_RELATED_ELEMENT:
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.SUCCESSION__SOURCE_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
				break;
			case SysMLPackage.SUCCESSION__TARGET_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
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
			case SysMLPackage.ANNOTATION__OWNING_ANNOTATED_ELEMENT:
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERACTION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INTERACTION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.INTERACTION__SOURCE_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
				break;
			case SysMLPackage.INTERACTION__TARGET_TYPE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE);
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
	protected void notifyLifeClassChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(LifeClass.class)) {
			case SysMLPackage.LIFE_CLASS__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LIFE_CLASS__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LIFE_CLASS__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyDependencyChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Dependency.class)) {
			case SysMLPackage.DEPENDENCY__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.DEPENDENCY__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.DEPENDENCY__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.DEPENDENCY__OWNED_RELATED_ELEMENT:
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
	protected void notifyTimeSliceFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(TimeSliceFeature.class)) {
			case SysMLPackage.TIME_SLICE_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.TIME_SLICE_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.TIME_SLICE_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifySnapshotFeatureChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SnapshotFeature.class)) {
			case SysMLPackage.SNAPSHOT_FEATURE__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SNAPSHOT_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SNAPSHOT_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyRequirementConstraintMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RequirementConstraintMembership.class)) {
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_BOOLEAN__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INVOCATION_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INVOCATION_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.BLOCK_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.BLOCK_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_PATH_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.QUERY_PATH_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_REAL__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_REAL__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_UNBOUNDED__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_INTEGER__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_INTEGER__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW_END__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW_END__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SOURCE_END__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SOURCE_END__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.TARGET_END__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.TARGET_END__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
	protected void notifyTransitionFeatureMembershipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(TransitionFeatureMembership.class)) {
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__TARGET:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__SOURCE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				notifyChanged(notification, eClass, SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP__OWNING_FEATURE_OF_TYPE:
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
	protected void notifyOperatorExpressionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(OperatorExpression.class)) {
			case SysMLPackage.OPERATOR_EXPRESSION__IMPORTED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.OPERATOR_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_STRING__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.LITERAL_STRING__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.ITEM_FLOW__SOURCE_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
				break;
			case SysMLPackage.ITEM_FLOW__TARGET_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW_FEATURE__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.ITEM_FLOW_FEATURE__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
			case SysMLPackage.SUCCESSION_ITEM_FLOW__SOURCE_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
				break;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TARGET_FEATURE:
				notifyChanged(notification, eClass, SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.NULL_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.NULL_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
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
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__OWNED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__INHERITED_MEMBERSHIP:
				notifyChanged(notification, eClass, SysMLPackage.Literals.NAMESPACE__MEMBERSHIP);
				break;
		}
	}

} //SysMLDerivedUnionAdapter
