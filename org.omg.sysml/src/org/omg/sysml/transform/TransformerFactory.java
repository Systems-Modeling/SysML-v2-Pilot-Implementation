package org.omg.sysml.transform;

import org.omg.sysml.lang.sysml.*;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.util.SysMLSwitch;

public class TransformerFactory extends SysMLSwitch<Transformer> {
	
	public static final TransformerFactory INSTANCE = new TransformerFactory();
	
	public static Transformer createTransformer(Element element) {
		return INSTANCE.create(element);
	}
	
	public Transformer create(Element element) {
		return doSwitch(element);
	}
	
	@Override
	public Transformer caseAcceptActionUsage(AcceptActionUsage element) {
		return new AcceptActionUsageTransformer(element);
	}
	
	@Override
	public Transformer caseActionDefinition(ActionDefinition element) {
		return new ActionDefinitionTransformer(element);
	}
	
	@Override
	public Transformer caseActionUsage(ActionUsage element) {
		return new ActionUsageTransformer(element);
	}
	
	@Override
	public Transformer caseAnnotatingElement(AnnotatingElement element) {
		return new AnnotatingElementTransformer(element);
	}
	
	@Override
	public Transformer caseAnnotatingFeature(AnnotatingFeature element) {
		return new AnnotatingFeatureTransformer(element);
	}
	
	@Override
	public Transformer caseBehavior(Behavior element) {
		return new BehaviorTransformer(element);
	}
	
	@Override
	public Transformer caseBooleanExpression(BooleanExpression element) {
		return new BooleanExpressionTransformer(element);
	}
	
	@Override
	public Transformer caseBlockExpression(BlockExpression element) {
		return new BlockExpressionTransformer(element);
	}
	
	@Override
	public Transformer caseCalculationDefinition(CalculationDefinition element) {
		return new CalculationDefinitionTransformer(element);
	}
	
	@Override
	public Transformer caseCalculationUsage(CalculationUsage element) {
		return new CalculationUsageTransformer(element);
	}
	
	@Override
	public Transformer caseCaseDefinition(CaseDefinition element) {
		return new CaseDefinitionTransformer(element);
	}
	
	@Override
	public Transformer caseCaseUsage(CaseUsage element) {
		return new CaseUsageTransformer(element);
	}
	
	@Override
	public Transformer caseClass(Class element) {
		return new ClassTransformer(element);
	}
	
	@Override
	public Transformer caseClassifier(Classifier element) {
		return new ClassifierTransformer(element);
	}
	
	@Override
	public Transformer caseConnectionUsage(ConnectionUsage element) {
		return new ConnectionUsageTransformer(element);
	}
	
	@Override
	public Transformer caseConnector(Connector element) {
		return new ConnectorTransformer(element);
	}
	
	@Override
	public Transformer caseConstraintDefinition(ConstraintDefinition element) {
		return new ConstraintDefinitionTransformer(element);
	}
	
	@Override
	public Transformer caseConstraintUsage(ConstraintUsage element) {
		return new ConstraintUsageTransformer(element);
	}
	
	@Override
	public Transformer caseDefinition(Definition element) {
		return new DefinitionTransformer(element);
	}
	
	@Override
	public Transformer caseElement(Element element) {
		return new ElementTransformer(element);
	}
	
	@Override
	public Transformer caseExpression(Expression element) {
		return new ExpressionTransformer(element);
	}
	
	@Override
	public Transformer caseFeature(Feature element) {
		return new FeatureTransformer(element);
	}
	
	@Override
	public Transformer caseFeatureReferenceExpression(FeatureReferenceExpression element) {
		return new FeatureReferenceExpressionTransformer(element);
	}
	
	@Override
	public Transformer caseFunction(Function element) {
		return new FunctionTransformer(element);
	}
	
	@Override
	public Transformer caseInvariant(Invariant element) {
		return new InvariantTransformer(element);
	}
	
	@Override
	public Transformer caseInvocationExpression(InvocationExpression element) {
		return new InvocationExpressionTransformer(element);
	}
	
	@Override
	public Transformer caseItemFlow(ItemFlow element) {
		return new ItemFlowTransformer(element);
	}
	
	@Override
	public Transformer caseItemFlowEnd(ItemFlowEnd element) {
		return new ItemFlowEndTransformer(element);
	}
	
	@Override
	public Transformer caseItemUsage(ItemUsage element) {
		return new ItemUsageTransformer(element);
	}
	
	@Override
	public Transformer caseLifeClass(LifeClass element) {
		return new LifeClassTransformer(element);
	}
	
	@Override
	public Transformer caseMultiplicity(Multiplicity element) {
		return new MultiplicityTransformer(element);
	}
	
	@Override
	public Transformer caseNamespace(Namespace element) {
		return new NamespaceTransformer(element);
	}
	
	@Override
	public Transformer casePartUsage(PartUsage element) {
		return new PartUsageTransformer(element);
	}
	
	@Override
	public Transformer caseRequirementDefinition(RequirementDefinition element) {
		return new RequirementDefinitionTransformer(element);
	}
	
	@Override
	public Transformer caseRequirementUsage(RequirementUsage element) {
		return new RequirementUsageTransformer(element);
	}
	
	@Override
	public Transformer caseSatisfyRequirementUsage(SatisfyRequirementUsage element) {
		return new SatisfyRequirementUsageTransformer(element);
	}
	
	@Override
	public Transformer caseStep(Step element) {
		return new StepTransformer(element);
	}
	
	@Override
	public Transformer caseTransitionUsage(TransitionUsage element) {
		return new TransitionUsageTransformer(element);
	}
	
	@Override
	public Transformer caseType(Type element) {
		return new TypeTransformer(element);
	}
	
	@Override
	public Transformer caseUsage(Usage element) {
		return new UsageTransformer(element);
	}

}
