/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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

package org.omg.sysml.validation;

import org.omg.sysml.lang.sysml.util.SysMLSwitch;
import org.omg.sysml.validation.kerml.*;
import org.omg.sysml.validation.sysml.*;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.*;

/**
 * A factory class for creating the appropriate ValidationChecker instance for a specific
 * abstract syntax element. ValidationCheckers are actually created and cached per EClass,
 * and the same (stateless) ValidationChecker is used for all elements of the same
 * EClass.
 */
public class ValidationCheckerFactory extends SysMLSwitch<ValidationChecker> {
	
	private Map<EClass, ValidationChecker> validationCheckerCache = new HashMap<>();
	
	public ValidationChecker getValidationChecker(Element element) {
		EClass eClass = element.eClass();
		ValidationChecker checker = validationCheckerCache.get(eClass);
		if (checker == null) {
			checker = doSwitch(eClass, element);
			if (checker != null) {
				validationCheckerCache.put(eClass, checker);
			}
		}
		return checker;
	}
	
	public ValidationChecker createValidationChecker(Element element) {
		return doSwitch(element);
	}
	
	// KerML
	
	@Override
	public ValidationChecker caseAnnotatingElement(AnnotatingElement element) {
		return new AnnotatingElementValidationChecker();
	}

	@Override
	public ValidationChecker caseAnnotation(Annotation element) {
		return new AnnotationValidationChecker();
	}

	@Override
	public ValidationChecker caseAssociation(Association element) {
		return new AssociationValidationChecker();
	}

	@Override
	public ValidationChecker caseAssociationStructure(AssociationStructure element) {
		return new AssociationStructureValidationChecker();
	}

	@Override
	public ValidationChecker caseBehavior(Behavior element) {
		return new BehaviorValidationChecker();
	}

	@Override
	public ValidationChecker caseBindingConnector(BindingConnector element) {
		return new BindingConnectorValidationChecker();
	}

	@Override
	public ValidationChecker caseBooleanExpression(BooleanExpression element) {
		return new BooleanExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseClass(org.omg.sysml.lang.sysml.Class element) {
		return new ClassValidationChecker();
	}

	@Override
	public ValidationChecker caseClassifier(Classifier element) {
		return new ClassifierValidationChecker();
	}

	@Override
	public ValidationChecker caseCollectExpression(CollectExpression element) {
		return new CollectExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseComment(Comment element) {
		return new CommentValidationChecker();
	}

	@Override
	public ValidationChecker caseConjugation(Conjugation element) {
		return new ConjugationValidationChecker();
	}

	@Override
	public ValidationChecker caseConnector(Connector element) {
		return new ConnectorValidationChecker();
	}

	@Override
	public ValidationChecker caseConstructorExpression(ConstructorExpression element) {
		return new ConstructorExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseCrossSubsetting(CrossSubsetting element) {
		return new CrossSubsettingValidationChecker();
	}

	@Override
	public ValidationChecker caseDataType(DataType element) {
		return new DataTypeValidationChecker();
	}

	@Override
	public ValidationChecker caseDependency(Dependency element) {
		return new DependencyValidationChecker();
	}

	@Override
	public ValidationChecker caseDifferencing(Differencing element) {
		return new DifferencingValidationChecker();
	}

	@Override
	public ValidationChecker caseDisjoining(Disjoining element) {
		return new DisjoiningValidationChecker();
	}

	@Override
	public ValidationChecker caseDocumentation(Documentation element) {
		return new DocumentationValidationChecker();
	}

	@Override
	public ValidationChecker caseElement(Element element) {
		return new ElementValidationChecker();
	}

	@Override
	public ValidationChecker caseElementFilterMembership(ElementFilterMembership element) {
		return new ElementFilterMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseEndFeatureMembership(EndFeatureMembership element) {
		return new EndFeatureMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseExpression(Expression element) {
		return new ExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseFeature(Feature element) {
		return new FeatureValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureChainExpression(FeatureChainExpression element) {
		return new FeatureChainExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureChaining(FeatureChaining element) {
		return new FeatureChainingValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureInverting(FeatureInverting element) {
		return new FeatureInvertingValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureMembership(FeatureMembership element) {
		return new FeatureMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureReferenceExpression(FeatureReferenceExpression element) {
		return new FeatureReferenceExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureTyping(FeatureTyping element) {
		return new FeatureTypingValidationChecker();
	}

	@Override
	public ValidationChecker caseFeatureValue(FeatureValue element) {
		return new FeatureValueValidationChecker();
	}

	@Override
	public ValidationChecker caseFlow(Flow element) {
		return new FlowValidationChecker();
	}

	@Override
	public ValidationChecker caseFlowEnd(FlowEnd element) {
		return new FlowEndValidationChecker();
	}

	@Override
	public ValidationChecker caseFunction(Function element) {
		return new FunctionValidationChecker();
	}

	@Override
	public ValidationChecker caseImport(Import element) {
		return new ImportValidationChecker();
	}

	@Override
	public ValidationChecker caseIndexExpression(IndexExpression element) {
		return new IndexExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseInstantiationExpression(InstantiationExpression element) {
		return new InstantiationExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseInteraction(Interaction element) {
		return new InteractionValidationChecker();
	}

	@Override
	public ValidationChecker caseIntersecting(Intersecting element) {
		return new IntersectingValidationChecker();
	}

	@Override
	public ValidationChecker caseInvariant(Invariant element) {
		return new InvariantValidationChecker();
	}

	@Override
	public ValidationChecker caseInvocationExpression(InvocationExpression element) {
		return new InvocationExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseLibraryPackage(LibraryPackage element) {
		return new LibraryPackageValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralBoolean(LiteralBoolean element) {
		return new LiteralBooleanValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralExpression(LiteralExpression element) {
		return new LiteralExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralInfinity(LiteralInfinity element) {
		return new LiteralInfinityValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralInteger(LiteralInteger element) {
		return new LiteralIntegerValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralRational(LiteralRational element) {
		return new LiteralRationalValidationChecker();
	}

	@Override
	public ValidationChecker caseLiteralString(LiteralString element) {
		return new LiteralStringValidationChecker();
	}

	@Override
	public ValidationChecker caseMembership(Membership element) {
		return new MembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseMembershipImport(MembershipImport element) {
		return new MembershipImportValidationChecker();
	}

	@Override
	public ValidationChecker caseMetaclass(Metaclass element) {
		return new MetaclassValidationChecker();
	}

	@Override
	public ValidationChecker caseMetadataAccessExpression(MetadataAccessExpression element) {
		return new MetadataAccessExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseMetadataFeature(MetadataFeature element) {
		return new MetadataFeatureValidationChecker();
	}

	@Override
	public ValidationChecker caseMultiplicity(Multiplicity element) {
		return new MultiplicityValidationChecker();
	}

	@Override
	public ValidationChecker caseMultiplicityRange(MultiplicityRange element) {
		return new MultiplicityRangeValidationChecker();
	}

	@Override
	public ValidationChecker caseNamespace(Namespace element) {
		return new NamespaceValidationChecker();
	}

	@Override
	public ValidationChecker caseNamespaceImport(NamespaceImport element) {
		return new NamespaceImportValidationChecker();
	}

	@Override
	public ValidationChecker caseNullExpression(NullExpression element) {
		return new NullExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseOperatorExpression(OperatorExpression element) {
		return new OperatorExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseOwningMembership(OwningMembership element) {
		return new OwningMembershipValidationChecker();
	}

	@Override
	public ValidationChecker casePackage(org.omg.sysml.lang.sysml.Package element) {
		return new PackageValidationChecker();
	}

	@Override
	public ValidationChecker caseParameterMembership(ParameterMembership element) {
		return new ParameterMembershipValidationChecker();
	}

	@Override
	public ValidationChecker casePayloadFeature(PayloadFeature element) {
		return new PayloadFeatureValidationChecker();
	}

	@Override
	public ValidationChecker casePredicate(Predicate element) {
		return new PredicateValidationChecker();
	}

	@Override
	public ValidationChecker caseRedefinition(Redefinition element) {
		return new RedefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseReferenceSubsetting(ReferenceSubsetting element) {
		return new ReferenceSubsettingValidationChecker();
	}

	@Override
	public ValidationChecker caseRelationship(Relationship element) {
		return new RelationshipValidationChecker();
	}

	@Override
	public ValidationChecker caseResultExpressionMembership(ResultExpressionMembership element) {
		return new ResultExpressionMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseReturnParameterMembership(ReturnParameterMembership element) {
		return new ReturnParameterMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseSelectExpression(SelectExpression element) {
		return new SelectExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseSpecialization(Specialization element) {
		return new SpecializationValidationChecker();
	}

	@Override
	public ValidationChecker caseStep(Step element) {
		return new StepValidationChecker();
	}

	@Override
	public ValidationChecker caseStructure(Structure element) {
		return new StructureValidationChecker();
	}

	@Override
	public ValidationChecker caseSubclassification(Subclassification element) {
		return new SubclassificationValidationChecker();
	}

	@Override
	public ValidationChecker caseSubsetting(Subsetting element) {
		return new SubsettingValidationChecker();
	}

	@Override
	public ValidationChecker caseSuccession(Succession element) {
		return new SuccessionValidationChecker();
	}

	@Override
	public ValidationChecker caseSuccessionFlow(SuccessionFlow element) {
		return new SuccessionFlowValidationChecker();
	}

	@Override
	public ValidationChecker caseTextualRepresentation(TextualRepresentation element) {
		return new TextualRepresentationValidationChecker();
	}

	@Override
	public ValidationChecker caseType(Type element) {
		return new TypeValidationChecker();
	}

	@Override
	public ValidationChecker caseTypeFeaturing(TypeFeaturing element) {
		return new TypeFeaturingValidationChecker();
	}

	@Override
	public ValidationChecker caseUnioning(Unioning element) {
		return new UnioningValidationChecker();
	}
	
	// SysML
	
	@Override
	public ValidationChecker caseAcceptActionUsage(AcceptActionUsage element) {
		return new AcceptActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseActionDefinition(ActionDefinition element) {
		return new ActionDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseActionUsage(ActionUsage element) {
		return new ActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseActorMembership(ActorMembership element) {
		return new ActorMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseAllocationDefinition(AllocationDefinition element) {
		return new AllocationDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseAllocationUsage(AllocationUsage element) {
		return new AllocationUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseAnalysisCaseDefinition(AnalysisCaseDefinition element) {
		return new AnalysisCaseDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseAnalysisCaseUsage(AnalysisCaseUsage element) {
		return new AnalysisCaseUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseAssertConstraintUsage(AssertConstraintUsage element) {
		return new AssertConstraintUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseAssignmentActionUsage(AssignmentActionUsage element) {
		return new AssignmentActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseAttributeDefinition(AttributeDefinition element) {
		return new AttributeDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseAttributeUsage(AttributeUsage element) {
		return new AttributeUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseBindingConnectorAsUsage(BindingConnectorAsUsage element) {
		return new BindingConnectorAsUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseCalculationDefinition(CalculationDefinition element) {
		return new CalculationDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseCalculationUsage(CalculationUsage element) {
		return new CalculationUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseCaseDefinition(CaseDefinition element) {
		return new CaseDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseCaseUsage(CaseUsage element) {
		return new CaseUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseConcernDefinition(ConcernDefinition element) {
		return new ConcernDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseConcernUsage(ConcernUsage element) {
		return new ConcernUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseConjugatedPortDefinition(ConjugatedPortDefinition element) {
		return new ConjugatedPortDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseConjugatedPortTyping(ConjugatedPortTyping element) {
		return new ConjugatedPortTypingValidationChecker();
	}

	@Override
	public ValidationChecker caseConnectionDefinition(ConnectionDefinition element) {
		return new ConnectionDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseConnectionUsage(ConnectionUsage element) {
		return new ConnectionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseConnectorAsUsage(ConnectorAsUsage element) {
		return new ConnectorAsUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseConstraintDefinition(ConstraintDefinition element) {
		return new ConstraintDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseConstraintUsage(ConstraintUsage element) {
		return new ConstraintUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseControlNode(ControlNode element) {
		return new ControlNodeValidationChecker();
	}

	@Override
	public ValidationChecker caseDecisionNode(DecisionNode element) {
		return new DecisionNodeValidationChecker();
	}

	@Override
	public ValidationChecker caseDefinition(Definition element) {
		return new DefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseEnumerationDefinition(EnumerationDefinition element) {
		return new EnumerationDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseEnumerationUsage(EnumerationUsage element) {
		return new EnumerationUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseEventOccurrenceUsage(EventOccurrenceUsage element) {
		return new EventOccurrenceUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseExhibitStateUsage(ExhibitStateUsage element) {
		return new ExhibitStateUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseExpose(Expose element) {
		return new ExposeValidationChecker();
	}

	@Override
	public ValidationChecker caseFlowDefinition(FlowDefinition element) {
		return new FlowDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseFlowUsage(FlowUsage element) {
		return new FlowUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseForLoopActionUsage(ForLoopActionUsage element) {
		return new ForLoopActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseForkNode(ForkNode element) {
		return new ForkNodeValidationChecker();
	}

	@Override
	public ValidationChecker caseFramedConcernMembership(FramedConcernMembership element) {
		return new FramedConcernMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseIfActionUsage(IfActionUsage element) {
		return new IfActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseIncludeUseCaseUsage(IncludeUseCaseUsage element) {
		return new IncludeUseCaseUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseInterfaceDefinition(InterfaceDefinition element) {
		return new InterfaceDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseInterfaceUsage(InterfaceUsage element) {
		return new InterfaceUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseItemDefinition(ItemDefinition element) {
		return new ItemDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseItemUsage(ItemUsage element) {
		return new ItemUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseJoinNode(JoinNode element) {
		return new JoinNodeValidationChecker();
	}

	@Override
	public ValidationChecker caseLoopActionUsage(LoopActionUsage element) {
		return new LoopActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseMembershipExpose(MembershipExpose element) {
		return new MembershipExposeValidationChecker();
	}

	@Override
	public ValidationChecker caseMergeNode(MergeNode element) {
		return new MergeNodeValidationChecker();
	}

	@Override
	public ValidationChecker caseMetadataDefinition(MetadataDefinition element) {
		return new MetadataDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseMetadataUsage(MetadataUsage element) {
		return new MetadataUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseNamespaceExpose(NamespaceExpose element) {
		return new NamespaceExposeValidationChecker();
	}

	@Override
	public ValidationChecker caseObjectiveMembership(ObjectiveMembership element) {
		return new ObjectiveMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseOccurrenceDefinition(OccurrenceDefinition element) {
		return new OccurrenceDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseOccurrenceUsage(OccurrenceUsage element) {
		return new OccurrenceUsageValidationChecker();
	}

	@Override
	public ValidationChecker casePartDefinition(PartDefinition element) {
		return new PartDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker casePartUsage(PartUsage element) {
		return new PartUsageValidationChecker();
	}

	@Override
	public ValidationChecker casePerformActionUsage(PerformActionUsage element) {
		return new PerformActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker casePortConjugation(PortConjugation element) {
		return new PortConjugationValidationChecker();
	}

	@Override
	public ValidationChecker casePortDefinition(PortDefinition element) {
		return new PortDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker casePortUsage(PortUsage element) {
		return new PortUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseReferenceUsage(ReferenceUsage element) {
		return new ReferenceUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseRenderingDefinition(RenderingDefinition element) {
		return new RenderingDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseRenderingUsage(RenderingUsage element) {
		return new RenderingUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseRequirementConstraintMembership(RequirementConstraintMembership element) {
		return new RequirementConstraintMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseRequirementDefinition(RequirementDefinition element) {
		return new RequirementDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseRequirementUsage(RequirementUsage element) {
		return new RequirementUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseRequirementVerificationMembership(RequirementVerificationMembership element) {
		return new RequirementVerificationMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseSatisfyRequirementUsage(SatisfyRequirementUsage element) {
		return new SatisfyRequirementUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseSendActionUsage(SendActionUsage element) {
		return new SendActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseStakeholderMembership(StakeholderMembership element) {
		return new StakeholderMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseStateDefinition(StateDefinition element) {
		return new StateDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseStateSubactionMembership(StateSubactionMembership element) {
		return new StateSubactionMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseStateUsage(StateUsage element) {
		return new StateUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseSubjectMembership(SubjectMembership element) {
		return new SubjectMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseSuccessionAsUsage(SuccessionAsUsage element) {
		return new SuccessionAsUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseSuccessionFlowUsage(SuccessionFlowUsage element) {
		return new SuccessionFlowUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseTerminateActionUsage(TerminateActionUsage element) {
		return new TerminateActionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseTransitionFeatureMembership(TransitionFeatureMembership element) {
		return new TransitionFeatureMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseTransitionUsage(TransitionUsage element) {
		return new TransitionUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseTriggerInvocationExpression(TriggerInvocationExpression element) {
		return new TriggerInvocationExpressionValidationChecker();
	}

	@Override
	public ValidationChecker caseUsage(Usage element) {
		return new UsageValidationChecker();
	}

	@Override
	public ValidationChecker caseUseCaseDefinition(UseCaseDefinition element) {
		return new UseCaseDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseUseCaseUsage(UseCaseUsage element) {
		return new UseCaseUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseVariantMembership(VariantMembership element) {
		return new VariantMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseVerificationCaseDefinition(VerificationCaseDefinition element) {
		return new VerificationCaseDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseVerificationCaseUsage(VerificationCaseUsage element) {
		return new VerificationCaseUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseViewDefinition(ViewDefinition element) {
		return new ViewDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseViewRenderingMembership(ViewRenderingMembership element) {
		return new ViewRenderingMembershipValidationChecker();
	}

	@Override
	public ValidationChecker caseViewUsage(ViewUsage element) {
		return new ViewUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseViewpointDefinition(ViewpointDefinition element) {
		return new ViewpointDefinitionValidationChecker();
	}

	@Override
	public ValidationChecker caseViewpointUsage(ViewpointUsage element) {
		return new ViewpointUsageValidationChecker();
	}

	@Override
	public ValidationChecker caseWhileLoopActionUsage(WhileLoopActionUsage element) {
		return new WhileLoopActionUsageValidationChecker();
	}

}
