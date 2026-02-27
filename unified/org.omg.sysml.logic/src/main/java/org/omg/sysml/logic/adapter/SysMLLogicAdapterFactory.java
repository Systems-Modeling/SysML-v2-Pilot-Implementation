/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *
 *******************************************************************************/
package org.omg.sysml.logic.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.util.SysMLSwitch;

/**
 * Generated adapter factory for SysML logic adapters.
 */
public class SysMLLogicAdapterFactory extends AdapterFactoryImpl {

    private final SysMLSwitch<Adapter> modelSwitch = new SysMLSwitch<>() {
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAcceptActionUsage(org.omg.sysml.model.sysml.AcceptActionUsage object) {
                return createAcceptActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseActionDefinition(org.omg.sysml.model.sysml.ActionDefinition object) {
                return createActionDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseActionUsage(org.omg.sysml.model.sysml.ActionUsage object) {
                return createActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseActorMembership(org.omg.sysml.model.sysml.ActorMembership object) {
                return createActorMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAllocationDefinition(org.omg.sysml.model.sysml.AllocationDefinition object) {
                return createAllocationDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAllocationUsage(org.omg.sysml.model.sysml.AllocationUsage object) {
                return createAllocationUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAnalysisCaseDefinition(org.omg.sysml.model.sysml.AnalysisCaseDefinition object) {
                return createAnalysisCaseDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAnalysisCaseUsage(org.omg.sysml.model.sysml.AnalysisCaseUsage object) {
                return createAnalysisCaseUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAnnotatingElement(org.omg.sysml.model.sysml.AnnotatingElement object) {
                return createAnnotatingElementAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAnnotation(org.omg.sysml.model.sysml.Annotation object) {
                return createAnnotationAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAssertConstraintUsage(org.omg.sysml.model.sysml.AssertConstraintUsage object) {
                return createAssertConstraintUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAssignmentActionUsage(org.omg.sysml.model.sysml.AssignmentActionUsage object) {
                return createAssignmentActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAssociation(org.omg.sysml.model.sysml.Association object) {
                return createAssociationAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAssociationStructure(org.omg.sysml.model.sysml.AssociationStructure object) {
                return createAssociationStructureAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAttributeDefinition(org.omg.sysml.model.sysml.AttributeDefinition object) {
                return createAttributeDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseAttributeUsage(org.omg.sysml.model.sysml.AttributeUsage object) {
                return createAttributeUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseBehavior(org.omg.sysml.model.sysml.Behavior object) {
                return createBehaviorAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseBindingConnector(org.omg.sysml.model.sysml.BindingConnector object) {
                return createBindingConnectorAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseBindingConnectorAsUsage(org.omg.sysml.model.sysml.BindingConnectorAsUsage object) {
                return createBindingConnectorAsUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseBooleanExpression(org.omg.sysml.model.sysml.BooleanExpression object) {
                return createBooleanExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseCalculationDefinition(org.omg.sysml.model.sysml.CalculationDefinition object) {
                return createCalculationDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseCalculationUsage(org.omg.sysml.model.sysml.CalculationUsage object) {
                return createCalculationUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseCaseDefinition(org.omg.sysml.model.sysml.CaseDefinition object) {
                return createCaseDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseCaseUsage(org.omg.sysml.model.sysml.CaseUsage object) {
                return createCaseUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseClass(org.omg.sysml.model.sysml.Class object) {
                return createClassAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseClassifier(org.omg.sysml.model.sysml.Classifier object) {
                return createClassifierAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseCollectExpression(org.omg.sysml.model.sysml.CollectExpression object) {
                return createCollectExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseComment(org.omg.sysml.model.sysml.Comment object) {
                return createCommentAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConcernDefinition(org.omg.sysml.model.sysml.ConcernDefinition object) {
                return createConcernDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConcernUsage(org.omg.sysml.model.sysml.ConcernUsage object) {
                return createConcernUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConjugatedPortDefinition(org.omg.sysml.model.sysml.ConjugatedPortDefinition object) {
                return createConjugatedPortDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConjugatedPortTyping(org.omg.sysml.model.sysml.ConjugatedPortTyping object) {
                return createConjugatedPortTypingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConjugation(org.omg.sysml.model.sysml.Conjugation object) {
                return createConjugationAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConnectionDefinition(org.omg.sysml.model.sysml.ConnectionDefinition object) {
                return createConnectionDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConnectionUsage(org.omg.sysml.model.sysml.ConnectionUsage object) {
                return createConnectionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConnector(org.omg.sysml.model.sysml.Connector object) {
                return createConnectorAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConnectorAsUsage(org.omg.sysml.model.sysml.ConnectorAsUsage object) {
                return createConnectorAsUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConstraintDefinition(org.omg.sysml.model.sysml.ConstraintDefinition object) {
                return createConstraintDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConstraintUsage(org.omg.sysml.model.sysml.ConstraintUsage object) {
                return createConstraintUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseConstructorExpression(org.omg.sysml.model.sysml.ConstructorExpression object) {
                return createConstructorExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseControlNode(org.omg.sysml.model.sysml.ControlNode object) {
                return createControlNodeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseCrossSubsetting(org.omg.sysml.model.sysml.CrossSubsetting object) {
                return createCrossSubsettingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseDataType(org.omg.sysml.model.sysml.DataType object) {
                return createDataTypeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseDecisionNode(org.omg.sysml.model.sysml.DecisionNode object) {
                return createDecisionNodeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseDefinition(org.omg.sysml.model.sysml.Definition object) {
                return createDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseDependency(org.omg.sysml.model.sysml.Dependency object) {
                return createDependencyAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseDifferencing(org.omg.sysml.model.sysml.Differencing object) {
                return createDifferencingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseDisjoining(org.omg.sysml.model.sysml.Disjoining object) {
                return createDisjoiningAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseDocumentation(org.omg.sysml.model.sysml.Documentation object) {
                return createDocumentationAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseElement(org.omg.sysml.model.sysml.Element object) {
                return createElementAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseElementFilterMembership(org.omg.sysml.model.sysml.ElementFilterMembership object) {
                return createElementFilterMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseEndFeatureMembership(org.omg.sysml.model.sysml.EndFeatureMembership object) {
                return createEndFeatureMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseEnumerationDefinition(org.omg.sysml.model.sysml.EnumerationDefinition object) {
                return createEnumerationDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseEnumerationUsage(org.omg.sysml.model.sysml.EnumerationUsage object) {
                return createEnumerationUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseEventOccurrenceUsage(org.omg.sysml.model.sysml.EventOccurrenceUsage object) {
                return createEventOccurrenceUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseExhibitStateUsage(org.omg.sysml.model.sysml.ExhibitStateUsage object) {
                return createExhibitStateUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseExpose(org.omg.sysml.model.sysml.Expose object) {
                return createExposeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseExpression(org.omg.sysml.model.sysml.Expression object) {
                return createExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFeature(org.omg.sysml.model.sysml.Feature object) {
                return createFeatureAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFeatureChainExpression(org.omg.sysml.model.sysml.FeatureChainExpression object) {
                return createFeatureChainExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFeatureChaining(org.omg.sysml.model.sysml.FeatureChaining object) {
                return createFeatureChainingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFeatureInverting(org.omg.sysml.model.sysml.FeatureInverting object) {
                return createFeatureInvertingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFeatureMembership(org.omg.sysml.model.sysml.FeatureMembership object) {
                return createFeatureMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFeatureReferenceExpression(org.omg.sysml.model.sysml.FeatureReferenceExpression object) {
                return createFeatureReferenceExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFeatureTyping(org.omg.sysml.model.sysml.FeatureTyping object) {
                return createFeatureTypingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFeatureValue(org.omg.sysml.model.sysml.FeatureValue object) {
                return createFeatureValueAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFlow(org.omg.sysml.model.sysml.Flow object) {
                return createFlowAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFlowDefinition(org.omg.sysml.model.sysml.FlowDefinition object) {
                return createFlowDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFlowEnd(org.omg.sysml.model.sysml.FlowEnd object) {
                return createFlowEndAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFlowUsage(org.omg.sysml.model.sysml.FlowUsage object) {
                return createFlowUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseForLoopActionUsage(org.omg.sysml.model.sysml.ForLoopActionUsage object) {
                return createForLoopActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseForkNode(org.omg.sysml.model.sysml.ForkNode object) {
                return createForkNodeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFramedConcernMembership(org.omg.sysml.model.sysml.FramedConcernMembership object) {
                return createFramedConcernMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseFunction(org.omg.sysml.model.sysml.Function object) {
                return createFunctionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseIfActionUsage(org.omg.sysml.model.sysml.IfActionUsage object) {
                return createIfActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseImport(org.omg.sysml.model.sysml.Import object) {
                return createImportAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseIncludeUseCaseUsage(org.omg.sysml.model.sysml.IncludeUseCaseUsage object) {
                return createIncludeUseCaseUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseIndexExpression(org.omg.sysml.model.sysml.IndexExpression object) {
                return createIndexExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseInstantiationExpression(org.omg.sysml.model.sysml.InstantiationExpression object) {
                return createInstantiationExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseInteraction(org.omg.sysml.model.sysml.Interaction object) {
                return createInteractionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseInterfaceDefinition(org.omg.sysml.model.sysml.InterfaceDefinition object) {
                return createInterfaceDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseInterfaceUsage(org.omg.sysml.model.sysml.InterfaceUsage object) {
                return createInterfaceUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseIntersecting(org.omg.sysml.model.sysml.Intersecting object) {
                return createIntersectingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseInvariant(org.omg.sysml.model.sysml.Invariant object) {
                return createInvariantAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseInvocationExpression(org.omg.sysml.model.sysml.InvocationExpression object) {
                return createInvocationExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseItemDefinition(org.omg.sysml.model.sysml.ItemDefinition object) {
                return createItemDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseItemUsage(org.omg.sysml.model.sysml.ItemUsage object) {
                return createItemUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseJoinNode(org.omg.sysml.model.sysml.JoinNode object) {
                return createJoinNodeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseLibraryPackage(org.omg.sysml.model.sysml.LibraryPackage object) {
                return createLibraryPackageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseLiteralBoolean(org.omg.sysml.model.sysml.LiteralBoolean object) {
                return createLiteralBooleanAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseLiteralExpression(org.omg.sysml.model.sysml.LiteralExpression object) {
                return createLiteralExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseLiteralInfinity(org.omg.sysml.model.sysml.LiteralInfinity object) {
                return createLiteralInfinityAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseLiteralInteger(org.omg.sysml.model.sysml.LiteralInteger object) {
                return createLiteralIntegerAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseLiteralRational(org.omg.sysml.model.sysml.LiteralRational object) {
                return createLiteralRationalAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseLiteralString(org.omg.sysml.model.sysml.LiteralString object) {
                return createLiteralStringAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseLoopActionUsage(org.omg.sysml.model.sysml.LoopActionUsage object) {
                return createLoopActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMembership(org.omg.sysml.model.sysml.Membership object) {
                return createMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMembershipExpose(org.omg.sysml.model.sysml.MembershipExpose object) {
                return createMembershipExposeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMembershipImport(org.omg.sysml.model.sysml.MembershipImport object) {
                return createMembershipImportAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMergeNode(org.omg.sysml.model.sysml.MergeNode object) {
                return createMergeNodeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMetaclass(org.omg.sysml.model.sysml.Metaclass object) {
                return createMetaclassAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMetadataAccessExpression(org.omg.sysml.model.sysml.MetadataAccessExpression object) {
                return createMetadataAccessExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMetadataDefinition(org.omg.sysml.model.sysml.MetadataDefinition object) {
                return createMetadataDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMetadataFeature(org.omg.sysml.model.sysml.MetadataFeature object) {
                return createMetadataFeatureAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMetadataUsage(org.omg.sysml.model.sysml.MetadataUsage object) {
                return createMetadataUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMultiplicity(org.omg.sysml.model.sysml.Multiplicity object) {
                return createMultiplicityAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseMultiplicityRange(org.omg.sysml.model.sysml.MultiplicityRange object) {
                return createMultiplicityRangeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseNamespace(org.omg.sysml.model.sysml.Namespace object) {
                return createNamespaceAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseNamespaceExpose(org.omg.sysml.model.sysml.NamespaceExpose object) {
                return createNamespaceExposeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseNamespaceImport(org.omg.sysml.model.sysml.NamespaceImport object) {
                return createNamespaceImportAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseNullExpression(org.omg.sysml.model.sysml.NullExpression object) {
                return createNullExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseObjectiveMembership(org.omg.sysml.model.sysml.ObjectiveMembership object) {
                return createObjectiveMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseOccurrenceDefinition(org.omg.sysml.model.sysml.OccurrenceDefinition object) {
                return createOccurrenceDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseOccurrenceUsage(org.omg.sysml.model.sysml.OccurrenceUsage object) {
                return createOccurrenceUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseOperatorExpression(org.omg.sysml.model.sysml.OperatorExpression object) {
                return createOperatorExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseOwningMembership(org.omg.sysml.model.sysml.OwningMembership object) {
                return createOwningMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePackage(org.omg.sysml.model.sysml.Package object) {
                return createPackageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseParameterMembership(org.omg.sysml.model.sysml.ParameterMembership object) {
                return createParameterMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePartDefinition(org.omg.sysml.model.sysml.PartDefinition object) {
                return createPartDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePartUsage(org.omg.sysml.model.sysml.PartUsage object) {
                return createPartUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePayloadFeature(org.omg.sysml.model.sysml.PayloadFeature object) {
                return createPayloadFeatureAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePerformActionUsage(org.omg.sysml.model.sysml.PerformActionUsage object) {
                return createPerformActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePortConjugation(org.omg.sysml.model.sysml.PortConjugation object) {
                return createPortConjugationAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePortDefinition(org.omg.sysml.model.sysml.PortDefinition object) {
                return createPortDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePortUsage(org.omg.sysml.model.sysml.PortUsage object) {
                return createPortUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter casePredicate(org.omg.sysml.model.sysml.Predicate object) {
                return createPredicateAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseRedefinition(org.omg.sysml.model.sysml.Redefinition object) {
                return createRedefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseReferenceSubsetting(org.omg.sysml.model.sysml.ReferenceSubsetting object) {
                return createReferenceSubsettingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseReferenceUsage(org.omg.sysml.model.sysml.ReferenceUsage object) {
                return createReferenceUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseRelationship(org.omg.sysml.model.sysml.Relationship object) {
                return createRelationshipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseRenderingDefinition(org.omg.sysml.model.sysml.RenderingDefinition object) {
                return createRenderingDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseRenderingUsage(org.omg.sysml.model.sysml.RenderingUsage object) {
                return createRenderingUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseRequirementConstraintMembership(org.omg.sysml.model.sysml.RequirementConstraintMembership object) {
                return createRequirementConstraintMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseRequirementDefinition(org.omg.sysml.model.sysml.RequirementDefinition object) {
                return createRequirementDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseRequirementUsage(org.omg.sysml.model.sysml.RequirementUsage object) {
                return createRequirementUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseRequirementVerificationMembership(org.omg.sysml.model.sysml.RequirementVerificationMembership object) {
                return createRequirementVerificationMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseResultExpressionMembership(org.omg.sysml.model.sysml.ResultExpressionMembership object) {
                return createResultExpressionMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseReturnParameterMembership(org.omg.sysml.model.sysml.ReturnParameterMembership object) {
                return createReturnParameterMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSatisfyRequirementUsage(org.omg.sysml.model.sysml.SatisfyRequirementUsage object) {
                return createSatisfyRequirementUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSelectExpression(org.omg.sysml.model.sysml.SelectExpression object) {
                return createSelectExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSendActionUsage(org.omg.sysml.model.sysml.SendActionUsage object) {
                return createSendActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSpecialization(org.omg.sysml.model.sysml.Specialization object) {
                return createSpecializationAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseStakeholderMembership(org.omg.sysml.model.sysml.StakeholderMembership object) {
                return createStakeholderMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseStateDefinition(org.omg.sysml.model.sysml.StateDefinition object) {
                return createStateDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseStateSubactionMembership(org.omg.sysml.model.sysml.StateSubactionMembership object) {
                return createStateSubactionMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseStateUsage(org.omg.sysml.model.sysml.StateUsage object) {
                return createStateUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseStep(org.omg.sysml.model.sysml.Step object) {
                return createStepAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseStructure(org.omg.sysml.model.sysml.Structure object) {
                return createStructureAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSubclassification(org.omg.sysml.model.sysml.Subclassification object) {
                return createSubclassificationAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSubjectMembership(org.omg.sysml.model.sysml.SubjectMembership object) {
                return createSubjectMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSubsetting(org.omg.sysml.model.sysml.Subsetting object) {
                return createSubsettingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSuccession(org.omg.sysml.model.sysml.Succession object) {
                return createSuccessionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSuccessionAsUsage(org.omg.sysml.model.sysml.SuccessionAsUsage object) {
                return createSuccessionAsUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSuccessionFlow(org.omg.sysml.model.sysml.SuccessionFlow object) {
                return createSuccessionFlowAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseSuccessionFlowUsage(org.omg.sysml.model.sysml.SuccessionFlowUsage object) {
                return createSuccessionFlowUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseTerminateActionUsage(org.omg.sysml.model.sysml.TerminateActionUsage object) {
                return createTerminateActionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseTextualRepresentation(org.omg.sysml.model.sysml.TextualRepresentation object) {
                return createTextualRepresentationAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseTransitionFeatureMembership(org.omg.sysml.model.sysml.TransitionFeatureMembership object) {
                return createTransitionFeatureMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseTransitionUsage(org.omg.sysml.model.sysml.TransitionUsage object) {
                return createTransitionUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseTriggerInvocationExpression(org.omg.sysml.model.sysml.TriggerInvocationExpression object) {
                return createTriggerInvocationExpressionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseType(org.omg.sysml.model.sysml.Type object) {
                return createTypeAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseTypeFeaturing(org.omg.sysml.model.sysml.TypeFeaturing object) {
                return createTypeFeaturingAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseUnioning(org.omg.sysml.model.sysml.Unioning object) {
                return createUnioningAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseUsage(org.omg.sysml.model.sysml.Usage object) {
                return createUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseUseCaseDefinition(org.omg.sysml.model.sysml.UseCaseDefinition object) {
                return createUseCaseDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseUseCaseUsage(org.omg.sysml.model.sysml.UseCaseUsage object) {
                return createUseCaseUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseVariantMembership(org.omg.sysml.model.sysml.VariantMembership object) {
                return createVariantMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseVerificationCaseDefinition(org.omg.sysml.model.sysml.VerificationCaseDefinition object) {
                return createVerificationCaseDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseVerificationCaseUsage(org.omg.sysml.model.sysml.VerificationCaseUsage object) {
                return createVerificationCaseUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseViewDefinition(org.omg.sysml.model.sysml.ViewDefinition object) {
                return createViewDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseViewRenderingMembership(org.omg.sysml.model.sysml.ViewRenderingMembership object) {
                return createViewRenderingMembershipAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseViewUsage(org.omg.sysml.model.sysml.ViewUsage object) {
                return createViewUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseViewpointDefinition(org.omg.sysml.model.sysml.ViewpointDefinition object) {
                return createViewpointDefinitionAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseViewpointUsage(org.omg.sysml.model.sysml.ViewpointUsage object) {
                return createViewpointUsageAdapter();
            }
            @Override
            public org.eclipse.emf.common.notify.Adapter caseWhileLoopActionUsage(org.omg.sysml.model.sysml.WhileLoopActionUsage object) {
                return createWhileLoopActionUsageAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return null;
            }
        };

    @Override
    public boolean isFactoryForType(Object object) {
        if (object == SysMLPackage.eINSTANCE) {
            return true;
        }
        if (object instanceof EObject eObject) {
            return eObject.eClass().getEPackage() == SysMLPackage.eINSTANCE;
        }
        return false;
    }

    @Override
    public Adapter createAdapter(Notifier target) {
        if (target instanceof EObject eObject) {
            return modelSwitch.doSwitch(eObject);
        }
        return null;
    }

    public org.eclipse.emf.common.notify.Adapter createAcceptActionUsageAdapter() {
        return new AcceptActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createActionDefinitionAdapter() {
        return new ActionDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createActionUsageAdapter() {
        return new ActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createActorMembershipAdapter() {
        return new ActorMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAllocationDefinitionAdapter() {
        return new AllocationDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAllocationUsageAdapter() {
        return new AllocationUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAnalysisCaseDefinitionAdapter() {
        return new AnalysisCaseDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAnalysisCaseUsageAdapter() {
        return new AnalysisCaseUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAnnotatingElementAdapter() {
        return new AnnotatingElementAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAnnotationAdapter() {
        return new AnnotationAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAssertConstraintUsageAdapter() {
        return new AssertConstraintUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAssignmentActionUsageAdapter() {
        return new AssignmentActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAssociationAdapter() {
        return new AssociationAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAssociationStructureAdapter() {
        return new AssociationStructureAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAttributeDefinitionAdapter() {
        return new AttributeDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createAttributeUsageAdapter() {
        return new AttributeUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createBehaviorAdapter() {
        return new BehaviorAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createBindingConnectorAdapter() {
        return new BindingConnectorAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createBindingConnectorAsUsageAdapter() {
        return new BindingConnectorAsUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createBooleanExpressionAdapter() {
        return new BooleanExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createCalculationDefinitionAdapter() {
        return new CalculationDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createCalculationUsageAdapter() {
        return new CalculationUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createCaseDefinitionAdapter() {
        return new CaseDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createCaseUsageAdapter() {
        return new CaseUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createClassAdapter() {
        return new ClassAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createClassifierAdapter() {
        return new ClassifierAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createCollectExpressionAdapter() {
        return new CollectExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createCommentAdapter() {
        return new CommentAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConcernDefinitionAdapter() {
        return new ConcernDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConcernUsageAdapter() {
        return new ConcernUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConjugatedPortDefinitionAdapter() {
        return new ConjugatedPortDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConjugatedPortTypingAdapter() {
        return new ConjugatedPortTypingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConjugationAdapter() {
        return new ConjugationAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConnectionDefinitionAdapter() {
        return new ConnectionDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConnectionUsageAdapter() {
        return new ConnectionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConnectorAdapter() {
        return new ConnectorAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConnectorAsUsageAdapter() {
        return new ConnectorAsUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConstraintDefinitionAdapter() {
        return new ConstraintDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConstraintUsageAdapter() {
        return new ConstraintUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createConstructorExpressionAdapter() {
        return new ConstructorExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createControlNodeAdapter() {
        return new ControlNodeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createCrossSubsettingAdapter() {
        return new CrossSubsettingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createDataTypeAdapter() {
        return new DataTypeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createDecisionNodeAdapter() {
        return new DecisionNodeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createDefinitionAdapter() {
        return new DefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createDependencyAdapter() {
        return new DependencyAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createDifferencingAdapter() {
        return new DifferencingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createDisjoiningAdapter() {
        return new DisjoiningAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createDocumentationAdapter() {
        return new DocumentationAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createElementAdapter() {
        return new ElementAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createElementFilterMembershipAdapter() {
        return new ElementFilterMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createEndFeatureMembershipAdapter() {
        return new EndFeatureMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createEnumerationDefinitionAdapter() {
        return new EnumerationDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createEnumerationUsageAdapter() {
        return new EnumerationUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createEventOccurrenceUsageAdapter() {
        return new EventOccurrenceUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createExhibitStateUsageAdapter() {
        return new ExhibitStateUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createExposeAdapter() {
        return new ExposeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createExpressionAdapter() {
        return new ExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFeatureAdapter() {
        return new FeatureAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFeatureChainExpressionAdapter() {
        return new FeatureChainExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFeatureChainingAdapter() {
        return new FeatureChainingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFeatureInvertingAdapter() {
        return new FeatureInvertingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFeatureMembershipAdapter() {
        return new FeatureMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFeatureReferenceExpressionAdapter() {
        return new FeatureReferenceExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFeatureTypingAdapter() {
        return new FeatureTypingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFeatureValueAdapter() {
        return new FeatureValueAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFlowAdapter() {
        return new FlowAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFlowDefinitionAdapter() {
        return new FlowDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFlowEndAdapter() {
        return new FlowEndAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFlowUsageAdapter() {
        return new FlowUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createForLoopActionUsageAdapter() {
        return new ForLoopActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createForkNodeAdapter() {
        return new ForkNodeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFramedConcernMembershipAdapter() {
        return new FramedConcernMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createFunctionAdapter() {
        return new FunctionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createIfActionUsageAdapter() {
        return new IfActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createImportAdapter() {
        return new ImportAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createIncludeUseCaseUsageAdapter() {
        return new IncludeUseCaseUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createIndexExpressionAdapter() {
        return new IndexExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createInstantiationExpressionAdapter() {
        return new InstantiationExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createInteractionAdapter() {
        return new InteractionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createInterfaceDefinitionAdapter() {
        return new InterfaceDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createInterfaceUsageAdapter() {
        return new InterfaceUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createIntersectingAdapter() {
        return new IntersectingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createInvariantAdapter() {
        return new InvariantAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createInvocationExpressionAdapter() {
        return new InvocationExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createItemDefinitionAdapter() {
        return new ItemDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createItemUsageAdapter() {
        return new ItemUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createJoinNodeAdapter() {
        return new JoinNodeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createLibraryPackageAdapter() {
        return new LibraryPackageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createLiteralBooleanAdapter() {
        return new LiteralBooleanAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createLiteralExpressionAdapter() {
        return new LiteralExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createLiteralInfinityAdapter() {
        return new LiteralInfinityAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createLiteralIntegerAdapter() {
        return new LiteralIntegerAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createLiteralRationalAdapter() {
        return new LiteralRationalAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createLiteralStringAdapter() {
        return new LiteralStringAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createLoopActionUsageAdapter() {
        return new LoopActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMembershipAdapter() {
        return new MembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMembershipExposeAdapter() {
        return new MembershipExposeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMembershipImportAdapter() {
        return new MembershipImportAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMergeNodeAdapter() {
        return new MergeNodeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMetaclassAdapter() {
        return new MetaclassAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMetadataAccessExpressionAdapter() {
        return new MetadataAccessExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMetadataDefinitionAdapter() {
        return new MetadataDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMetadataFeatureAdapter() {
        return new MetadataFeatureAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMetadataUsageAdapter() {
        return new MetadataUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMultiplicityAdapter() {
        return new MultiplicityAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createMultiplicityRangeAdapter() {
        return new MultiplicityRangeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createNamespaceAdapter() {
        return new NamespaceAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createNamespaceExposeAdapter() {
        return new NamespaceExposeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createNamespaceImportAdapter() {
        return new NamespaceImportAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createNullExpressionAdapter() {
        return new NullExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createObjectiveMembershipAdapter() {
        return new ObjectiveMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createOccurrenceDefinitionAdapter() {
        return new OccurrenceDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createOccurrenceUsageAdapter() {
        return new OccurrenceUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createOperatorExpressionAdapter() {
        return new OperatorExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createOwningMembershipAdapter() {
        return new OwningMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPackageAdapter() {
        return new PackageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createParameterMembershipAdapter() {
        return new ParameterMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPartDefinitionAdapter() {
        return new PartDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPartUsageAdapter() {
        return new PartUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPayloadFeatureAdapter() {
        return new PayloadFeatureAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPerformActionUsageAdapter() {
        return new PerformActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPortConjugationAdapter() {
        return new PortConjugationAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPortDefinitionAdapter() {
        return new PortDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPortUsageAdapter() {
        return new PortUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createPredicateAdapter() {
        return new PredicateAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createRedefinitionAdapter() {
        return new RedefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createReferenceSubsettingAdapter() {
        return new ReferenceSubsettingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createReferenceUsageAdapter() {
        return new ReferenceUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createRelationshipAdapter() {
        return new RelationshipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createRenderingDefinitionAdapter() {
        return new RenderingDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createRenderingUsageAdapter() {
        return new RenderingUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createRequirementConstraintMembershipAdapter() {
        return new RequirementConstraintMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createRequirementDefinitionAdapter() {
        return new RequirementDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createRequirementUsageAdapter() {
        return new RequirementUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createRequirementVerificationMembershipAdapter() {
        return new RequirementVerificationMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createResultExpressionMembershipAdapter() {
        return new ResultExpressionMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createReturnParameterMembershipAdapter() {
        return new ReturnParameterMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSatisfyRequirementUsageAdapter() {
        return new SatisfyRequirementUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSelectExpressionAdapter() {
        return new SelectExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSendActionUsageAdapter() {
        return new SendActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSpecializationAdapter() {
        return new SpecializationAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createStakeholderMembershipAdapter() {
        return new StakeholderMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createStateDefinitionAdapter() {
        return new StateDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createStateSubactionMembershipAdapter() {
        return new StateSubactionMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createStateUsageAdapter() {
        return new StateUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createStepAdapter() {
        return new StepAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createStructureAdapter() {
        return new StructureAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSubclassificationAdapter() {
        return new SubclassificationAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSubjectMembershipAdapter() {
        return new SubjectMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSubsettingAdapter() {
        return new SubsettingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSuccessionAdapter() {
        return new SuccessionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSuccessionAsUsageAdapter() {
        return new SuccessionAsUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSuccessionFlowAdapter() {
        return new SuccessionFlowAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createSuccessionFlowUsageAdapter() {
        return new SuccessionFlowUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createTerminateActionUsageAdapter() {
        return new TerminateActionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createTextualRepresentationAdapter() {
        return new TextualRepresentationAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createTransitionFeatureMembershipAdapter() {
        return new TransitionFeatureMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createTransitionUsageAdapter() {
        return new TransitionUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createTriggerInvocationExpressionAdapter() {
        return new TriggerInvocationExpressionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createTypeAdapter() {
        return new TypeAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createTypeFeaturingAdapter() {
        return new TypeFeaturingAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createUnioningAdapter() {
        return new UnioningAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createUsageAdapter() {
        return new UsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createUseCaseDefinitionAdapter() {
        return new UseCaseDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createUseCaseUsageAdapter() {
        return new UseCaseUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createVariantMembershipAdapter() {
        return new VariantMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createVerificationCaseDefinitionAdapter() {
        return new VerificationCaseDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createVerificationCaseUsageAdapter() {
        return new VerificationCaseUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createViewDefinitionAdapter() {
        return new ViewDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createViewRenderingMembershipAdapter() {
        return new ViewRenderingMembershipAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createViewUsageAdapter() {
        return new ViewUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createViewpointDefinitionAdapter() {
        return new ViewpointDefinitionAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createViewpointUsageAdapter() {
        return new ViewpointUsageAdapter();
    }

    public org.eclipse.emf.common.notify.Adapter createWhileLoopActionUsageAdapter() {
        return new WhileLoopActionUsageAdapter();
    }
}
