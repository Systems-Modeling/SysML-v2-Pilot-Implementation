/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.AllocationDefinition;
import org.omg.sysml.lang.sysml.AllocationUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseDefinition;
import org.omg.sysml.lang.sysml.AnalysisCaseUsage;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.AssertConstraintUsage;
import org.omg.sysml.lang.sysml.AssignmentActionUsage;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.AssociationStructure;
import org.omg.sysml.lang.sysml.AttributeDefinition;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.BindingConnectorAsUsage;
import org.omg.sysml.lang.sysml.BooleanExpression;
import org.omg.sysml.lang.sysml.CalculationDefinition;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.CollectExpression;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConcernDefinition;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.ConjugatedPortTyping;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.ConnectionDefinition;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConstraintDefinition;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.DecisionNode;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Dependency;
import org.omg.sysml.lang.sysml.Disjoining;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilterMembership;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.EnumerationDefinition;
import org.omg.sysml.lang.sysml.EnumerationUsage;
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.Expose;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChainExpression;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.ForLoopActionUsage;
import org.omg.sysml.lang.sysml.ForkNode;
import org.omg.sysml.lang.sysml.FramedConcernMembership;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.IfActionUsage;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.InterfaceDefinition;
import org.omg.sysml.lang.sysml.InterfaceUsage;
import org.omg.sysml.lang.sysml.Invariant;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.JoinNode;
import org.omg.sysml.lang.sysml.LifeClass;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInfinity;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MergeNode;
import org.omg.sysml.lang.sysml.Metaclass;
import org.omg.sysml.lang.sysml.MetadataDefinition;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.MetadataUsage;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.PortioningFeature;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.RenderingDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.RequirementVerificationMembership;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SelectExpression;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.Subclassification;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.SuccessionFlowConnectionUsage;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TargetEnd;
import org.omg.sysml.lang.sysml.TextualRepresentation;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.lang.sysml.TriggerKind;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.UseCaseDefinition;
import org.omg.sysml.lang.sysml.UseCaseUsage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.lang.sysml.ViewDefinition;
import org.omg.sysml.lang.sysml.ViewRenderingMembership;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointDefinition;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.WhileLoopActionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysMLFactoryImpl extends EFactoryImpl implements SysMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SysMLFactory init() {
		try {
			SysMLFactory theSysMLFactory = (SysMLFactory)EPackage.Registry.INSTANCE.getEFactory(SysMLPackage.eNS_URI);
			if (theSysMLFactory != null) {
				return theSysMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SysMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SysMLPackage.CONJUGATION: return createConjugation();
			case SysMLPackage.RELATIONSHIP: return createRelationship();
			case SysMLPackage.ELEMENT: return createElement();
			case SysMLPackage.MEMBERSHIP: return createMembership();
			case SysMLPackage.NAMESPACE: return createNamespace();
			case SysMLPackage.IMPORT: return createImport();
			case SysMLPackage.DOCUMENTATION: return createDocumentation();
			case SysMLPackage.COMMENT: return createComment();
			case SysMLPackage.ANNOTATING_ELEMENT: return createAnnotatingElement();
			case SysMLPackage.ANNOTATION: return createAnnotation();
			case SysMLPackage.TEXTUAL_REPRESENTATION: return createTextualRepresentation();
			case SysMLPackage.TYPE: return createType();
			case SysMLPackage.SPECIALIZATION: return createSpecialization();
			case SysMLPackage.FEATURE_MEMBERSHIP: return createFeatureMembership();
			case SysMLPackage.TYPE_FEATURING: return createTypeFeaturing();
			case SysMLPackage.FEATURE: return createFeature();
			case SysMLPackage.REDEFINITION: return createRedefinition();
			case SysMLPackage.SUBSETTING: return createSubsetting();
			case SysMLPackage.FEATURE_TYPING: return createFeatureTyping();
			case SysMLPackage.FEATURE_CHAINING: return createFeatureChaining();
			case SysMLPackage.MULTIPLICITY: return createMultiplicity();
			case SysMLPackage.DISJOINING: return createDisjoining();
			case SysMLPackage.END_FEATURE_MEMBERSHIP: return createEndFeatureMembership();
			case SysMLPackage.CLASSIFIER: return createClassifier();
			case SysMLPackage.SUBCLASSIFICATION: return createSubclassification();
			case SysMLPackage.STEP: return createStep();
			case SysMLPackage.BEHAVIOR: return createBehavior();
			case SysMLPackage.CLASS: return createClass();
			case SysMLPackage.PARAMETER_MEMBERSHIP: return createParameterMembership();
			case SysMLPackage.ASSOCIATION: return createAssociation();
			case SysMLPackage.ASSOCIATION_STRUCTURE: return createAssociationStructure();
			case SysMLPackage.STRUCTURE: return createStructure();
			case SysMLPackage.METADATA_FEATURE: return createMetadataFeature();
			case SysMLPackage.METACLASS: return createMetaclass();
			case SysMLPackage.EXPRESSION: return createExpression();
			case SysMLPackage.FUNCTION: return createFunction();
			case SysMLPackage.PREDICATE: return createPredicate();
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP: return createReturnParameterMembership();
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP: return createResultExpressionMembership();
			case SysMLPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case SysMLPackage.INVARIANT: return createInvariant();
			case SysMLPackage.MULTIPLICITY_RANGE: return createMultiplicityRange();
			case SysMLPackage.ITEM_FLOW_FEATURE: return createItemFlowFeature();
			case SysMLPackage.ITEM_FLOW_END: return createItemFlowEnd();
			case SysMLPackage.ITEM_FEATURE: return createItemFeature();
			case SysMLPackage.SUCCESSION_ITEM_FLOW: return createSuccessionItemFlow();
			case SysMLPackage.SUCCESSION: return createSuccession();
			case SysMLPackage.CONNECTOR: return createConnector();
			case SysMLPackage.ITEM_FLOW: return createItemFlow();
			case SysMLPackage.INTERACTION: return createInteraction();
			case SysMLPackage.FEATURE_VALUE: return createFeatureValue();
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP: return createElementFilterMembership();
			case SysMLPackage.PACKAGE: return createPackage();
			case SysMLPackage.LITERAL_INFINITY: return createLiteralInfinity();
			case SysMLPackage.LITERAL_EXPRESSION: return createLiteralExpression();
			case SysMLPackage.LITERAL_STRING: return createLiteralString();
			case SysMLPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
			case SysMLPackage.COLLECT_EXPRESSION: return createCollectExpression();
			case SysMLPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
			case SysMLPackage.INVOCATION_EXPRESSION: return createInvocationExpression();
			case SysMLPackage.FEATURE_CHAIN_EXPRESSION: return createFeatureChainExpression();
			case SysMLPackage.LITERAL_RATIONAL: return createLiteralRational();
			case SysMLPackage.LITERAL_INTEGER: return createLiteralInteger();
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION: return createFeatureReferenceExpression();
			case SysMLPackage.NULL_EXPRESSION: return createNullExpression();
			case SysMLPackage.SELECT_EXPRESSION: return createSelectExpression();
			case SysMLPackage.TARGET_END: return createTargetEnd();
			case SysMLPackage.SOURCE_END: return createSourceEnd();
			case SysMLPackage.BINDING_CONNECTOR: return createBindingConnector();
			case SysMLPackage.DATA_TYPE: return createDataType();
			case SysMLPackage.PART_DEFINITION: return createPartDefinition();
			case SysMLPackage.ITEM_DEFINITION: return createItemDefinition();
			case SysMLPackage.OCCURRENCE_DEFINITION: return createOccurrenceDefinition();
			case SysMLPackage.DEFINITION: return createDefinition();
			case SysMLPackage.USAGE: return createUsage();
			case SysMLPackage.PORT_USAGE: return createPortUsage();
			case SysMLPackage.OCCURRENCE_USAGE: return createOccurrenceUsage();
			case SysMLPackage.PORTIONING_FEATURE: return createPortioningFeature();
			case SysMLPackage.PORT_DEFINITION: return createPortDefinition();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION: return createConjugatedPortDefinition();
			case SysMLPackage.PORT_CONJUGATION: return createPortConjugation();
			case SysMLPackage.ACTION_USAGE: return createActionUsage();
			case SysMLPackage.STATE_USAGE: return createStateUsage();
			case SysMLPackage.CONSTRAINT_USAGE: return createConstraintUsage();
			case SysMLPackage.TRANSITION_USAGE: return createTransitionUsage();
			case SysMLPackage.ACCEPT_ACTION_USAGE: return createAcceptActionUsage();
			case SysMLPackage.REFERENCE_USAGE: return createReferenceUsage();
			case SysMLPackage.REQUIREMENT_USAGE: return createRequirementUsage();
			case SysMLPackage.REQUIREMENT_DEFINITION: return createRequirementDefinition();
			case SysMLPackage.CONSTRAINT_DEFINITION: return createConstraintDefinition();
			case SysMLPackage.CONCERN_USAGE: return createConcernUsage();
			case SysMLPackage.CONCERN_DEFINITION: return createConcernDefinition();
			case SysMLPackage.PART_USAGE: return createPartUsage();
			case SysMLPackage.ITEM_USAGE: return createItemUsage();
			case SysMLPackage.CALCULATION_USAGE: return createCalculationUsage();
			case SysMLPackage.CASE_USAGE: return createCaseUsage();
			case SysMLPackage.CASE_DEFINITION: return createCaseDefinition();
			case SysMLPackage.CALCULATION_DEFINITION: return createCalculationDefinition();
			case SysMLPackage.ACTION_DEFINITION: return createActionDefinition();
			case SysMLPackage.ANALYSIS_CASE_USAGE: return createAnalysisCaseUsage();
			case SysMLPackage.ANALYSIS_CASE_DEFINITION: return createAnalysisCaseDefinition();
			case SysMLPackage.VARIANT_MEMBERSHIP: return createVariantMembership();
			case SysMLPackage.INTERFACE_USAGE: return createInterfaceUsage();
			case SysMLPackage.CONNECTION_USAGE: return createConnectionUsage();
			case SysMLPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
			case SysMLPackage.CONNECTION_DEFINITION: return createConnectionDefinition();
			case SysMLPackage.ATTRIBUTE_USAGE: return createAttributeUsage();
			case SysMLPackage.VIEW_USAGE: return createViewUsage();
			case SysMLPackage.VIEW_DEFINITION: return createViewDefinition();
			case SysMLPackage.VIEWPOINT_USAGE: return createViewpointUsage();
			case SysMLPackage.VIEWPOINT_DEFINITION: return createViewpointDefinition();
			case SysMLPackage.RENDERING_USAGE: return createRenderingUsage();
			case SysMLPackage.RENDERING_DEFINITION: return createRenderingDefinition();
			case SysMLPackage.VERIFICATION_CASE_USAGE: return createVerificationCaseUsage();
			case SysMLPackage.VERIFICATION_CASE_DEFINITION: return createVerificationCaseDefinition();
			case SysMLPackage.ENUMERATION_USAGE: return createEnumerationUsage();
			case SysMLPackage.ENUMERATION_DEFINITION: return createEnumerationDefinition();
			case SysMLPackage.ATTRIBUTE_DEFINITION: return createAttributeDefinition();
			case SysMLPackage.ALLOCATION_USAGE: return createAllocationUsage();
			case SysMLPackage.ALLOCATION_DEFINITION: return createAllocationDefinition();
			case SysMLPackage.USE_CASE_USAGE: return createUseCaseUsage();
			case SysMLPackage.USE_CASE_DEFINITION: return createUseCaseDefinition();
			case SysMLPackage.FLOW_CONNECTION_USAGE: return createFlowConnectionUsage();
			case SysMLPackage.LIFE_CLASS: return createLifeClass();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP: return createRequirementVerificationMembership();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP: return createRequirementConstraintMembership();
			case SysMLPackage.DEPENDENCY: return createDependency();
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP: return createTransitionFeatureMembership();
			case SysMLPackage.EXHIBIT_STATE_USAGE: return createExhibitStateUsage();
			case SysMLPackage.PERFORM_ACTION_USAGE: return createPerformActionUsage();
			case SysMLPackage.EVENT_OCCURRENCE_USAGE: return createEventOccurrenceUsage();
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP: return createStateSubactionMembership();
			case SysMLPackage.STATE_DEFINITION: return createStateDefinition();
			case SysMLPackage.METADATA_DEFINITION: return createMetadataDefinition();
			case SysMLPackage.METADATA_USAGE: return createMetadataUsage();
			case SysMLPackage.SUCCESSION_AS_USAGE: return createSuccessionAsUsage();
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE: return createSuccessionFlowConnectionUsage();
			case SysMLPackage.BINDING_CONNECTOR_AS_USAGE: return createBindingConnectorAsUsage();
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP: return createViewRenderingMembership();
			case SysMLPackage.EXPOSE: return createExpose();
			case SysMLPackage.OBJECTIVE_MEMBERSHIP: return createObjectiveMembership();
			case SysMLPackage.TRIGGER_INVOCATION_EXPRESSION: return createTriggerInvocationExpression();
			case SysMLPackage.FOR_LOOP_ACTION_USAGE: return createForLoopActionUsage();
			case SysMLPackage.JOIN_NODE: return createJoinNode();
			case SysMLPackage.FORK_NODE: return createForkNode();
			case SysMLPackage.DECISION_NODE: return createDecisionNode();
			case SysMLPackage.ASSIGNMENT_ACTION_USAGE: return createAssignmentActionUsage();
			case SysMLPackage.IF_ACTION_USAGE: return createIfActionUsage();
			case SysMLPackage.SEND_ACTION_USAGE: return createSendActionUsage();
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE: return createWhileLoopActionUsage();
			case SysMLPackage.MERGE_NODE: return createMergeNode();
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE: return createAssertConstraintUsage();
			case SysMLPackage.SUBJECT_MEMBERSHIP: return createSubjectMembership();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE: return createSatisfyRequirementUsage();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP: return createFramedConcernMembership();
			case SysMLPackage.ACTOR_MEMBERSHIP: return createActorMembership();
			case SysMLPackage.STAKEHOLDER_MEMBERSHIP: return createStakeholderMembership();
			case SysMLPackage.CONJUGATED_PORT_TYPING: return createConjugatedPortTyping();
			case SysMLPackage.INCLUDE_USE_CASE_USAGE: return createIncludeUseCaseUsage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SysMLPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case SysMLPackage.FEATURE_DIRECTION_KIND:
				return createFeatureDirectionKindFromString(eDataType, initialValue);
			case SysMLPackage.PORTION_KIND:
				return createPortionKindFromString(eDataType, initialValue);
			case SysMLPackage.REQUIREMENT_CONSTRAINT_KIND:
				return createRequirementConstraintKindFromString(eDataType, initialValue);
			case SysMLPackage.STATE_SUBACTION_KIND:
				return createStateSubactionKindFromString(eDataType, initialValue);
			case SysMLPackage.TRANSITION_FEATURE_KIND:
				return createTransitionFeatureKindFromString(eDataType, initialValue);
			case SysMLPackage.TRIGGER_KIND:
				return createTriggerKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SysMLPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case SysMLPackage.FEATURE_DIRECTION_KIND:
				return convertFeatureDirectionKindToString(eDataType, instanceValue);
			case SysMLPackage.PORTION_KIND:
				return convertPortionKindToString(eDataType, instanceValue);
			case SysMLPackage.REQUIREMENT_CONSTRAINT_KIND:
				return convertRequirementConstraintKindToString(eDataType, instanceValue);
			case SysMLPackage.STATE_SUBACTION_KIND:
				return convertStateSubactionKindToString(eDataType, instanceValue);
			case SysMLPackage.TRANSITION_FEATURE_KIND:
				return convertTransitionFeatureKindToString(eDataType, instanceValue);
			case SysMLPackage.TRIGGER_KIND:
				return convertTriggerKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subclassification createSubclassification() {
		SubclassificationImpl subclassification = new SubclassificationImpl();
		return subclassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SendActionUsage createSendActionUsage() {
		SendActionUsageImpl sendActionUsage = new SendActionUsageImpl();
		return sendActionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForLoopActionUsage createForLoopActionUsage() {
		ForLoopActionUsageImpl forLoopActionUsage = new ForLoopActionUsageImpl();
		return forLoopActionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertConstraintUsage createAssertConstraintUsage() {
		AssertConstraintUsageImpl assertConstraintUsage = new AssertConstraintUsageImpl();
		return assertConstraintUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expose createExpose() {
		ExposeImpl expose = new ExposeImpl();
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewRenderingMembership createViewRenderingMembership() {
		ViewRenderingMembershipImpl viewRenderingMembership = new ViewRenderingMembershipImpl();
		return viewRenderingMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventOccurrenceUsage createEventOccurrenceUsage() {
		EventOccurrenceUsageImpl eventOccurrenceUsage = new EventOccurrenceUsageImpl();
		return eventOccurrenceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementVerificationMembership createRequirementVerificationMembership() {
		RequirementVerificationMembershipImpl requirementVerificationMembership = new RequirementVerificationMembershipImpl();
		return requirementVerificationMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectMembership createSubjectMembership() {
		SubjectMembershipImpl subjectMembership = new SubjectMembershipImpl();
		return subjectMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveMembership createObjectiveMembership() {
		ObjectiveMembershipImpl objectiveMembership = new ObjectiveMembershipImpl();
		return objectiveMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptActionUsage createAcceptActionUsage() {
		AcceptActionUsageImpl acceptActionUsage = new AcceptActionUsageImpl();
		return acceptActionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformActionUsage createPerformActionUsage() {
		PerformActionUsageImpl performActionUsage = new PerformActionUsageImpl();
		return performActionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerInvocationExpression createTriggerInvocationExpression() {
		TriggerInvocationExpressionImpl triggerInvocationExpression = new TriggerInvocationExpressionImpl();
		return triggerInvocationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileLoopActionUsage createWhileLoopActionUsage() {
		WhileLoopActionUsageImpl whileLoopActionUsage = new WhileLoopActionUsageImpl();
		return whileLoopActionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignmentActionUsage createAssignmentActionUsage() {
		AssignmentActionUsageImpl assignmentActionUsage = new AssignmentActionUsageImpl();
		return assignmentActionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfActionUsage createIfActionUsage() {
		IfActionUsageImpl ifActionUsage = new IfActionUsageImpl();
		return ifActionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateDefinition createStateDefinition() {
		StateDefinitionImpl stateDefinition = new StateDefinitionImpl();
		return stateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataDefinition createMetadataDefinition() {
		MetadataDefinitionImpl metadataDefinition = new MetadataDefinitionImpl();
		return metadataDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataUsage createMetadataUsage() {
		MetadataUsageImpl metadataUsage = new MetadataUsageImpl();
		return metadataUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMembership createFeatureMembership() {
		FeatureMembershipImpl featureMembership = new FeatureMembershipImpl();
		return featureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeFeaturing createTypeFeaturing() {
		TypeFeaturingImpl typeFeaturing = new TypeFeaturingImpl();
		return typeFeaturing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjugation createConjugation() {
		ConjugationImpl conjugation = new ConjugationImpl();
		return conjugation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Membership createMembership() {
		MembershipImpl membership = new MembershipImpl();
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultExpressionMembership createResultExpressionMembership() {
		ResultExpressionMembershipImpl resultExpressionMembership = new ResultExpressionMembershipImpl();
		return resultExpressionMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionUsage createTransitionUsage() {
		TransitionUsageImpl transitionUsage = new TransitionUsageImpl();
		return transitionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior createBehavior() {
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Classifier createClassifier() {
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Redefinition createRedefinition() {
		RedefinitionImpl redefinition = new RedefinitionImpl();
		return redefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subsetting createSubsetting() {
		SubsettingImpl subsetting = new SubsettingImpl();
		return subsetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureValue createFeatureValue() {
		FeatureValueImpl featureValue = new FeatureValueImpl();
		return featureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity createMultiplicity() {
		MultiplicityImpl multiplicity = new MultiplicityImpl();
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disjoining createDisjoining() {
		DisjoiningImpl disjoining = new DisjoiningImpl();
		return disjoining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureTyping createFeatureTyping() {
		FeatureTypingImpl featureTyping = new FeatureTypingImpl();
		return featureTyping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureChaining createFeatureChaining() {
		FeatureChainingImpl featureChaining = new FeatureChainingImpl();
		return featureChaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationStructure createAssociationStructure() {
		AssociationStructureImpl associationStructure = new AssociationStructureImpl();
		return associationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementFilterMembership createElementFilterMembership() {
		ElementFilterMembershipImpl elementFilterMembership = new ElementFilterMembershipImpl();
		return elementFilterMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortUsage createPortUsage() {
		PortUsageImpl portUsage = new PortUsageImpl();
		return portUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDefinition createPortDefinition() {
		PortDefinitionImpl portDefinition = new PortDefinitionImpl();
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugatedPortDefinition createConjugatedPortDefinition() {
		ConjugatedPortDefinitionImpl conjugatedPortDefinition = new ConjugatedPortDefinitionImpl();
		return conjugatedPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortConjugation createPortConjugation() {
		PortConjugationImpl portConjugation = new PortConjugationImpl();
		return portConjugation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateUsage createStateUsage() {
		StateUsageImpl stateUsage = new StateUsageImpl();
		return stateUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage createConstraintUsage() {
		ConstraintUsageImpl constraintUsage = new ConstraintUsageImpl();
		return constraintUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invariant createInvariant() {
		InvariantImpl invariant = new InvariantImpl();
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncludeUseCaseUsage createIncludeUseCaseUsage() {
		IncludeUseCaseUsageImpl includeUseCaseUsage = new IncludeUseCaseUsageImpl();
		return includeUseCaseUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanExpression createBooleanExpression() {
		BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
		return booleanExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage createActionUsage() {
		ActionUsageImpl actionUsage = new ActionUsageImpl();
		return actionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceUsage createOccurrenceUsage() {
		OccurrenceUsageImpl occurrenceUsage = new OccurrenceUsageImpl();
		return occurrenceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortioningFeature createPortioningFeature() {
		PortioningFeatureImpl portioningFeature = new PortioningFeatureImpl();
		return portioningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExhibitStateUsage createExhibitStateUsage() {
		ExhibitStateUsageImpl exhibitStateUsage = new ExhibitStateUsageImpl();
		return exhibitStateUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionImpl();
		return attributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllocationUsage createAllocationUsage() {
		AllocationUsageImpl allocationUsage = new AllocationUsageImpl();
		return allocationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllocationDefinition createAllocationDefinition() {
		AllocationDefinitionImpl allocationDefinition = new AllocationDefinitionImpl();
		return allocationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCaseUsage createUseCaseUsage() {
		UseCaseUsageImpl useCaseUsage = new UseCaseUsageImpl();
		return useCaseUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCaseDefinition createUseCaseDefinition() {
		UseCaseDefinitionImpl useCaseDefinition = new UseCaseDefinitionImpl();
		return useCaseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowConnectionUsage createFlowConnectionUsage() {
		FlowConnectionUsageImpl flowConnectionUsage = new FlowConnectionUsageImpl();
		return flowConnectionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateSubactionMembership createStateSubactionMembership() {
		StateSubactionMembershipImpl stateSubactionMembership = new StateSubactionMembershipImpl();
		return stateSubactionMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugatedPortTyping createConjugatedPortTyping() {
		ConjugatedPortTypingImpl conjugatedPortTyping = new ConjugatedPortTypingImpl();
		return conjugatedPortTyping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingConnectorAsUsage createBindingConnectorAsUsage() {
		BindingConnectorAsUsageImpl bindingConnectorAsUsage = new BindingConnectorAsUsageImpl();
		return bindingConnectorAsUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemDefinition createItemDefinition() {
		ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceDefinition createOccurrenceDefinition() {
		OccurrenceDefinitionImpl occurrenceDefinition = new OccurrenceDefinitionImpl();
		return occurrenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage createUsage() {
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDefinition createInterfaceDefinition() {
		InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionImpl();
		return interfaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionDefinition createConnectionDefinition() {
		ConnectionDefinitionImpl connectionDefinition = new ConnectionDefinitionImpl();
		return connectionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeUsage createAttributeUsage() {
		AttributeUsageImpl attributeUsage = new AttributeUsageImpl();
		return attributeUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewUsage createViewUsage() {
		ViewUsageImpl viewUsage = new ViewUsageImpl();
		return viewUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewDefinition createViewDefinition() {
		ViewDefinitionImpl viewDefinition = new ViewDefinitionImpl();
		return viewDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewpointUsage createViewpointUsage() {
		ViewpointUsageImpl viewpointUsage = new ViewpointUsageImpl();
		return viewpointUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewpointDefinition createViewpointDefinition() {
		ViewpointDefinitionImpl viewpointDefinition = new ViewpointDefinitionImpl();
		return viewpointDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingUsage createRenderingUsage() {
		RenderingUsageImpl renderingUsage = new RenderingUsageImpl();
		return renderingUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingDefinition createRenderingDefinition() {
		RenderingDefinitionImpl renderingDefinition = new RenderingDefinitionImpl();
		return renderingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationCaseUsage createVerificationCaseUsage() {
		VerificationCaseUsageImpl verificationCaseUsage = new VerificationCaseUsageImpl();
		return verificationCaseUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationCaseDefinition createVerificationCaseDefinition() {
		VerificationCaseDefinitionImpl verificationCaseDefinition = new VerificationCaseDefinitionImpl();
		return verificationCaseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationUsage createEnumerationUsage() {
		EnumerationUsageImpl enumerationUsage = new EnumerationUsageImpl();
		return enumerationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationDefinition createEnumerationDefinition() {
		EnumerationDefinitionImpl enumerationDefinition = new EnumerationDefinitionImpl();
		return enumerationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceUsage createInterfaceUsage() {
		InterfaceUsageImpl interfaceUsage = new InterfaceUsageImpl();
		return interfaceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintDefinition createConstraintDefinition() {
		ConstraintDefinitionImpl constraintDefinition = new ConstraintDefinitionImpl();
		return constraintDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernUsage createConcernUsage() {
		ConcernUsageImpl concernUsage = new ConcernUsageImpl();
		return concernUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernDefinition createConcernDefinition() {
		ConcernDefinitionImpl concernDefinition = new ConcernDefinitionImpl();
		return concernDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseDefinition createCaseDefinition() {
		CaseDefinitionImpl caseDefinition = new CaseDefinitionImpl();
		return caseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculationDefinition createCalculationDefinition() {
		CalculationDefinitionImpl calculationDefinition = new CalculationDefinitionImpl();
		return calculationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionDefinition createActionDefinition() {
		ActionDefinitionImpl actionDefinition = new ActionDefinitionImpl();
		return actionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculationUsage createCalculationUsage() {
		CalculationUsageImpl calculationUsage = new CalculationUsageImpl();
		return calculationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseUsage createCaseUsage() {
		CaseUsageImpl caseUsage = new CaseUsageImpl();
		return caseUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariantMembership createVariantMembership() {
		VariantMembershipImpl variantMembership = new VariantMembershipImpl();
		return variantMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisCaseUsage createAnalysisCaseUsage() {
		AnalysisCaseUsageImpl analysisCaseUsage = new AnalysisCaseUsageImpl();
		return analysisCaseUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisCaseDefinition createAnalysisCaseDefinition() {
		AnalysisCaseDefinitionImpl analysisCaseDefinition = new AnalysisCaseDefinitionImpl();
		return analysisCaseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceUsage createReferenceUsage() {
		ReferenceUsageImpl referenceUsage = new ReferenceUsageImpl();
		return referenceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionUsage createConnectionUsage() {
		ConnectionUsageImpl connectionUsage = new ConnectionUsageImpl();
		return connectionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartUsage createPartUsage() {
		PartUsageImpl partUsage = new PartUsageImpl();
		return partUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemUsage createItemUsage() {
		ItemUsageImpl itemUsage = new ItemUsageImpl();
		return itemUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartDefinition createPartDefinition() {
		PartDefinitionImpl partDefinition = new PartDefinitionImpl();
		return partDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SatisfyRequirementUsage createSatisfyRequirementUsage() {
		SatisfyRequirementUsageImpl satisfyRequirementUsage = new SatisfyRequirementUsageImpl();
		return satisfyRequirementUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramedConcernMembership createFramedConcernMembership() {
		FramedConcernMembershipImpl framedConcernMembership = new FramedConcernMembershipImpl();
		return framedConcernMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage createRequirementUsage() {
		RequirementUsageImpl requirementUsage = new RequirementUsageImpl();
		return requirementUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementDefinition createRequirementDefinition() {
		RequirementDefinitionImpl requirementDefinition = new RequirementDefinitionImpl();
		return requirementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingConnector createBindingConnector() {
		BindingConnectorImpl bindingConnector = new BindingConnectorImpl();
		return bindingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessionFlowConnectionUsage createSuccessionFlowConnectionUsage() {
		SuccessionFlowConnectionUsageImpl successionFlowConnectionUsage = new SuccessionFlowConnectionUsageImpl();
		return successionFlowConnectionUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityRange createMultiplicityRange() {
		MultiplicityRangeImpl multiplicityRange = new MultiplicityRangeImpl();
		return multiplicityRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataFeature createMetadataFeature() {
		MetadataFeatureImpl metadataFeature = new MetadataFeatureImpl();
		return metadataFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metaclass createMetaclass() {
		MetaclassImpl metaclass = new MetaclassImpl();
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Succession createSuccession() {
		SuccessionImpl succession = new SuccessionImpl();
		return succession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextualRepresentation createTextualRepresentation() {
		TextualRepresentationImpl textualRepresentation = new TextualRepresentationImpl();
		return textualRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement createAnnotatingElement() {
		AnnotatingElementImpl annotatingElement = new AnnotatingElementImpl();
		return annotatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifeClass createLifeClass() {
		LifeClassImpl lifeClass = new LifeClassImpl();
		return lifeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementConstraintMembership createRequirementConstraintMembership() {
		RequirementConstraintMembershipImpl requirementConstraintMembership = new RequirementConstraintMembershipImpl();
		return requirementConstraintMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralBoolean createLiteralBoolean() {
		LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
		return literalBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectExpression createSelectExpression() {
		SelectExpressionImpl selectExpression = new SelectExpressionImpl();
		return selectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvocationExpression createInvocationExpression() {
		InvocationExpressionImpl invocationExpression = new InvocationExpressionImpl();
		return invocationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralInfinity createLiteralInfinity() {
		LiteralInfinityImpl literalInfinity = new LiteralInfinityImpl();
		return literalInfinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterMembership createParameterMembership() {
		ParameterMembershipImpl parameterMembership = new ParameterMembershipImpl();
		return parameterMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StakeholderMembership createStakeholderMembership() {
		StakeholderMembershipImpl stakeholderMembership = new StakeholderMembershipImpl();
		return stakeholderMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActorMembership createActorMembership() {
		ActorMembershipImpl actorMembership = new ActorMembershipImpl();
		return actorMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnParameterMembership createReturnParameterMembership() {
		ReturnParameterMembershipImpl returnParameterMembership = new ReturnParameterMembershipImpl();
		return returnParameterMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralExpression createLiteralExpression() {
		LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
		return literalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralRational createLiteralRational() {
		LiteralRationalImpl literalRational = new LiteralRationalImpl();
		return literalRational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemFlowEnd createItemFlowEnd() {
		ItemFlowEndImpl itemFlowEnd = new ItemFlowEndImpl();
		return itemFlowEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemFeature createItemFeature() {
		ItemFeatureImpl itemFeature = new ItemFeatureImpl();
		return itemFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceEnd createSourceEnd() {
		SourceEndImpl sourceEnd = new SourceEndImpl();
		return sourceEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetEnd createTargetEnd() {
		TargetEndImpl targetEnd = new TargetEndImpl();
		return targetEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndFeatureMembership createEndFeatureMembership() {
		EndFeatureMembershipImpl endFeatureMembership = new EndFeatureMembershipImpl();
		return endFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransitionFeatureMembership createTransitionFeatureMembership() {
		TransitionFeatureMembershipImpl transitionFeatureMembership = new TransitionFeatureMembershipImpl();
		return transitionFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatorExpression createOperatorExpression() {
		OperatorExpressionImpl operatorExpression = new OperatorExpressionImpl();
		return operatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralString createLiteralString() {
		LiteralStringImpl literalString = new LiteralStringImpl();
		return literalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureChainExpression createFeatureChainExpression() {
		FeatureChainExpressionImpl featureChainExpression = new FeatureChainExpressionImpl();
		return featureChainExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemFlow createItemFlow() {
		ItemFlowImpl itemFlow = new ItemFlowImpl();
		return itemFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemFlowFeature createItemFlowFeature() {
		ItemFlowFeatureImpl itemFlowFeature = new ItemFlowFeatureImpl();
		return itemFlowFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessionItemFlow createSuccessionItemFlow() {
		SuccessionItemFlowImpl successionItemFlow = new SuccessionItemFlowImpl();
		return successionItemFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessionAsUsage createSuccessionAsUsage() {
		SuccessionAsUsageImpl successionAsUsage = new SuccessionAsUsageImpl();
		return successionAsUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullExpression createNullExpression() {
		NullExpressionImpl nullExpression = new NullExpressionImpl();
		return nullExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectExpression createCollectExpression() {
		CollectExpressionImpl collectExpression = new CollectExpressionImpl();
		return collectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureReferenceExpression createFeatureReferenceExpression() {
		FeatureReferenceExpressionImpl featureReferenceExpression = new FeatureReferenceExpressionImpl();
		return featureReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralInteger createLiteralInteger() {
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDirectionKind createFeatureDirectionKindFromString(EDataType eDataType, String initialValue) {
		FeatureDirectionKind result = FeatureDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeatureDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerKind createTriggerKindFromString(EDataType eDataType, String initialValue) {
		TriggerKind result = TriggerKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortionKind createPortionKindFromString(EDataType eDataType, String initialValue) {
		PortionKind result = PortionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionFeatureKind createTransitionFeatureKindFromString(EDataType eDataType, String initialValue) {
		TransitionFeatureKind result = TransitionFeatureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionFeatureKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSubactionKind createStateSubactionKindFromString(EDataType eDataType, String initialValue) {
		StateSubactionKind result = StateSubactionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateSubactionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementConstraintKind createRequirementConstraintKindFromString(EDataType eDataType, String initialValue) {
		RequirementConstraintKind result = RequirementConstraintKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequirementConstraintKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SysMLPackage getSysMLPackage() {
		return (SysMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SysMLPackage getPackage() {
		return SysMLPackage.eINSTANCE;
	}

} //SysMLFactoryImpl
