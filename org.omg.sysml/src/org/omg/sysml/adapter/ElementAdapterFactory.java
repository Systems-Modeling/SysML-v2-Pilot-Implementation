package org.omg.sysml.adapter;

import java.util.Optional;

import org.omg.sysml.lang.sysml.*;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public class ElementAdapterFactory {
		
	public static ElementAdapter getAdapter(Element element) {
		return getExistingAdapter(element).orElseGet(()->createAdapter(element));
	}
	
	public static void removeAdapter(Element target) {
		getExistingAdapter(target).ifPresent(target.eAdapters()::remove);
	}
	
	protected static Optional<ElementAdapter> getExistingAdapter(Element target) {
		return target.eAdapters()
				.stream()
				.filter(ElementAdapter.class::isInstance)
				.map(ElementAdapter.class::cast)
				.findFirst();
	}
	
	protected static ElementAdapter createAdapter(Element element) {
		ElementAdapter adapter = SWITCH.doSwitch(element);
		if (adapter != null) {
			element.eAdapters().add(adapter);
		}
		return adapter;
	}
	
	private ElementAdapterFactory() {
	}
	
	private static final SysMLSwitch<ElementAdapter> SWITCH = new SysMLSwitch<ElementAdapter>() {
		@Override
		public ElementAdapter caseAcceptActionUsage(AcceptActionUsage element) {
			return new AcceptActionUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseActionDefinition(ActionDefinition element) {
			return new ActionDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseActionUsage(ActionUsage element) {
			return new ActionUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseAnnotatingElement(AnnotatingElement element) {
			return new AnnotatingElementAdapter(element);
		}
		
		@Override
		public ElementAdapter caseAnnotatingFeature(AnnotatingFeature element) {
			return new AnnotatingFeatureAdapter(element);
		}
		
		@Override
		public ElementAdapter caseAssertConstraintUsage(AssertConstraintUsage element) {
			return new AssertConstraintUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseAssociation(Association element) {
			return new AssociationAdapter(element);
		}
		
		@Override
		public ElementAdapter caseBehavior(Behavior element) {
			return new BehaviorAdapter(element);
		}
		
		@Override
		public ElementAdapter caseBooleanExpression(BooleanExpression element) {
			return new BooleanExpressionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseCalculationDefinition(CalculationDefinition element) {
			return new CalculationDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseCalculationUsage(CalculationUsage element) {
			return new CalculationUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseCaseDefinition(CaseDefinition element) {
			return new CaseDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseCaseUsage(CaseUsage element) {
			return new CaseUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseClass(Class element) {
			return new ClassAdapter(element);
		}
		
		@Override
		public ElementAdapter caseClassifier(Classifier element) {
			return new ClassifierAdapter(element);
		}
		
		@Override
		public ElementAdapter caseConcernUsage(ConcernUsage element) {
			return new ConcernUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseConnectionDefinition(ConnectionDefinition element) {
			return new ConnectionDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseConnectionUsage(ConnectionUsage element) {
			return new ConnectionUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseConnector(Connector element) {
			return new ConnectorAdapter(element);
		}
		
		@Override
		public ElementAdapter caseConstraintDefinition(ConstraintDefinition element) {
			return new ConstraintDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseConstraintUsage(ConstraintUsage element) {
			return new ConstraintUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseDataType(DataType element) {
			return new DataTypeAdapter(element);
		}
		
		@Override
		public ElementAdapter caseDefinition(Definition element) {
			return new DefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseElement(Element element) {
			return new ElementAdapter(element);
		}
		
		@Override
		public ElementAdapter caseExhibitStateUsage(ExhibitStateUsage element) {
			return new ExhibitStateUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseExpression(Expression element) {
			return new ExpressionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseFeature(Feature element) {
			return new FeatureAdapter(element);
		}
		
		@Override
		public ElementAdapter caseFeatureReferenceExpression(FeatureReferenceExpression element) {
			return new FeatureReferenceExpressionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseFunction(Function element) {
			return new FunctionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseInvariant(Invariant element) {
			return new InvariantAdapter(element);
		}
		
		@Override
		public ElementAdapter caseInvocationExpression(InvocationExpression element) {
			return new InvocationExpressionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseItemDefinition(ItemDefinition element) {
			return new ItemDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseItemFeature(ItemFeature element) {
			return new ItemFeatureAdapter(element);
		}
		
		@Override
		public ElementAdapter caseItemFlow(ItemFlow element) {
			return new ItemFlowAdapter(element);
		}
		
		@Override
		public ElementAdapter caseItemFlowEnd(ItemFlowEnd element) {
			return new ItemFlowEndAdapter(element);
		}
		
		@Override
		public ElementAdapter caseItemFlowFeature(ItemFlowFeature element) {
			return new ItemFlowFeatureAdapter(element);
		}
		
		@Override
		public ElementAdapter caseItemUsage(ItemUsage element) {
			return new ItemUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseLifeClass(LifeClass element) {
			return new LifeClassAdapter(element);
		}
		
		@Override
		public ElementAdapter caseMultiplicity(Multiplicity element) {
			return new MultiplicityAdapter(element);
		}
		
		@Override
		public ElementAdapter caseNamespace(Namespace element) {
			return new NamespaceAdapter(element);
		}
		
		@Override
		public ElementAdapter caseOccurrenceDefinition(OccurrenceDefinition element) {
			return new OccurrenceDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseOccurrenceUsage(OccurrenceUsage element) {
			return new OccurrenceUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseOperatorExpression(OperatorExpression element) {
			return new OperatorExpressionAdapter(element);
		}
		
		@Override
		public ElementAdapter casePartDefinition(PartDefinition element) {
			return new PartDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter casePartUsage(PartUsage element) {
			return new PartUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter casePerformActionUsage(PerformActionUsage element) {
			return new PerformActionUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter casePortDefinition(PortDefinition element) {
			return new PortDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter casePortUsage(PortUsage element) {
			return new PortUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter casePortioningFeature(PortioningFeature element) {
			return new PortioningFeatureAdapter(element);
		}
		
		@Override
		public ElementAdapter caseRenderingUsage(RenderingUsage element) {
			return new RenderingUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseRequirementDefinition(RequirementDefinition element) {
			return new RequirementDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseRequirementUsage(RequirementUsage element) {
			return new RequirementUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseSatisfyRequirementUsage(SatisfyRequirementUsage element) {
			return new SatisfyRequirementUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseSendActionUsage(SendActionUsage element) {
			return new SendActionUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseSourceEnd(SourceEnd element) {
			return new SourceEndAdapter(element);
		}
		
		@Override
		public ElementAdapter caseStakeholderUsage(StakeholderUsage element) {
			return new StakeholderUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseStateDefinition(StateDefinition element) {
			return new StateDefinitionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseStateUsage(StateUsage element) {
			return new StateUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseStep(Step element) {
			return new StepAdapter(element);
		}
		
		@Override
		public ElementAdapter caseStructure(Structure element) {
			return new StructureAdapter(element);
		}
		
		@Override
		public ElementAdapter caseSuccession(Succession element) {
			return new SuccessionAdapter(element);
		}
		
		@Override
		public ElementAdapter caseSuccessionItemFlow(SuccessionItemFlow element) {
			return new SuccessionItemFlowAdapter(element);
		}
		
		@Override
		public ElementAdapter caseTargetEnd(TargetEnd element) {
			return new TargetEndAdapter(element);
		}
		
		@Override
		public ElementAdapter caseTransitionUsage(TransitionUsage element) {
			return new TransitionUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseType(Type element) {
			return new TypeAdapter(element);
		}
		
		@Override
		public ElementAdapter caseUsage(Usage element) {
			return new UsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseViewUsage(ViewUsage element) {
			return new ViewUsageAdapter(element);
		}
		
		@Override
		public ElementAdapter caseViewpointUsage(ViewpointUsage element) {
			return new ViewpointUsageAdapter(element);
		}
	};

}
