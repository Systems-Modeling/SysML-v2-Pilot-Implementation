/**
 */
package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage
 * @generated
 */
public class SysMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SysMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SysMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysMLSwitch<Adapter> modelSwitch =
		new SysMLSwitch<Adapter>() {
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseMembership(Membership object) {
				return createMembershipAdapter();
			}
			@Override
			public Adapter casePackage(org.omg.sysml.lang.sysml.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseOwnership(Ownership object) {
				return createOwnershipAdapter();
			}
			@Override
			public Adapter caseSuperclassing(Superclassing object) {
				return createSuperclassingAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseFeatureMembership(FeatureMembership object) {
				return createFeatureMembershipAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseRedefinition(Redefinition object) {
				return createRedefinitionAdapter();
			}
			@Override
			public Adapter caseSubsetting(Subsetting object) {
				return createSubsettingAdapter();
			}
			@Override
			public Adapter caseFeatureTyping(FeatureTyping object) {
				return createFeatureTypingAdapter();
			}
			@Override
			public Adapter caseConjugation(Conjugation object) {
				return createConjugationAdapter();
			}
			@Override
			public Adapter caseMultiplicity(Multiplicity object) {
				return createMultiplicityAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseEndFeatureMembership(EndFeatureMembership object) {
				return createEndFeatureMembershipAdapter();
			}
			@Override
			public Adapter caseMergeNode(MergeNode object) {
				return createMergeNodeAdapter();
			}
			@Override
			public Adapter caseControlNode(ControlNode object) {
				return createControlNodeAdapter();
			}
			@Override
			public Adapter caseActionUsage(ActionUsage object) {
				return createActionUsageAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseUsage(Usage object) {
				return createUsageAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter casePortUsage(PortUsage object) {
				return createPortUsageAdapter();
			}
			@Override
			public Adapter casePortDefinition(PortDefinition object) {
				return createPortDefinitionAdapter();
			}
			@Override
			public Adapter caseConjugatedPortDefinition(ConjugatedPortDefinition object) {
				return createConjugatedPortDefinitionAdapter();
			}
			@Override
			public Adapter casePortConjugation(PortConjugation object) {
				return createPortConjugationAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseStateUsage(StateUsage object) {
				return createStateUsageAdapter();
			}
			@Override
			public Adapter caseConstraintUsage(ConstraintUsage object) {
				return createConstraintUsageAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseTransitionUsage(TransitionUsage object) {
				return createTransitionUsageAdapter();
			}
			@Override
			public Adapter caseAcceptActionUsage(AcceptActionUsage object) {
				return createAcceptActionUsageAdapter();
			}
			@Override
			public Adapter caseTransferActionUsage(TransferActionUsage object) {
				return createTransferActionUsageAdapter();
			}
			@Override
			public Adapter caseSuccession(Succession object) {
				return createSuccessionAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseClass(org.omg.sysml.lang.sysml.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseRequirementUsage(RequirementUsage object) {
				return createRequirementUsageAdapter();
			}
			@Override
			public Adapter caseRequirementDefinition(RequirementDefinition object) {
				return createRequirementDefinitionAdapter();
			}
			@Override
			public Adapter caseConstraintDefinition(ConstraintDefinition object) {
				return createConstraintDefinitionAdapter();
			}
			@Override
			public Adapter caseForkNode(ForkNode object) {
				return createForkNodeAdapter();
			}
			@Override
			public Adapter caseDecisionNode(DecisionNode object) {
				return createDecisionNodeAdapter();
			}
			@Override
			public Adapter caseJoinNode(JoinNode object) {
				return createJoinNodeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseValueProperty(ValueProperty object) {
				return createValuePropertyAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseSendActionUsage(SendActionUsage object) {
				return createSendActionUsageAdapter();
			}
			@Override
			public Adapter casePerformActionUsage(PerformActionUsage object) {
				return createPerformActionUsageAdapter();
			}
			@Override
			public Adapter caseStateSubactionMembership(StateSubactionMembership object) {
				return createStateSubactionMembershipAdapter();
			}
			@Override
			public Adapter caseStateDefinition(StateDefinition object) {
				return createStateDefinitionAdapter();
			}
			@Override
			public Adapter caseExhibitStateUsage(ExhibitStateUsage object) {
				return createExhibitStateUsageAdapter();
			}
			@Override
			public Adapter caseTransitionFeatureMembership(TransitionFeatureMembership object) {
				return createTransitionFeatureMembershipAdapter();
			}
			@Override
			public Adapter caseTimeSliceFeature(TimeSliceFeature object) {
				return createTimeSliceFeatureAdapter();
			}
			@Override
			public Adapter caseReferenceProperty(ReferenceProperty object) {
				return createReferencePropertyAdapter();
			}
			@Override
			public Adapter caseBlockProperty(BlockProperty object) {
				return createBlockPropertyAdapter();
			}
			@Override
			public Adapter caseLifeClass(LifeClass object) {
				return createLifeClassAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseSnapshotFeature(SnapshotFeature object) {
				return createSnapshotFeatureAdapter();
			}
			@Override
			public Adapter caseIndividualDefinition(IndividualDefinition object) {
				return createIndividualDefinitionAdapter();
			}
			@Override
			public Adapter caseIndividualUsage(IndividualUsage object) {
				return createIndividualUsageAdapter();
			}
			@Override
			public Adapter caseInterfaceDefinition(InterfaceDefinition object) {
				return createInterfaceDefinitionAdapter();
			}
			@Override
			public Adapter caseAssociationBlock(AssociationBlock object) {
				return createAssociationBlockAdapter();
			}
			@Override
			public Adapter caseConnectionUsage(ConnectionUsage object) {
				return createConnectionUsageAdapter();
			}
			@Override
			public Adapter caseInterfaceUsage(InterfaceUsage object) {
				return createInterfaceUsageAdapter();
			}
			@Override
			public Adapter caseAssertConstraintUsage(AssertConstraintUsage object) {
				return createAssertConstraintUsageAdapter();
			}
			@Override
			public Adapter caseInvariant(Invariant object) {
				return createInvariantAdapter();
			}
			@Override
			public Adapter caseBindingConnector(BindingConnector object) {
				return createBindingConnectorAdapter();
			}
			@Override
			public Adapter casePartProperty(PartProperty object) {
				return createPartPropertyAdapter();
			}
			@Override
			public Adapter caseConjugatedPortTyping(ConjugatedPortTyping object) {
				return createConjugatedPortTypingAdapter();
			}
			@Override
			public Adapter caseSatisfyRequirementUsage(SatisfyRequirementUsage object) {
				return createSatisfyRequirementUsageAdapter();
			}
			@Override
			public Adapter caseRequirementConstraintMembership(RequirementConstraintMembership object) {
				return createRequirementConstraintMembershipAdapter();
			}
			@Override
			public Adapter caseMultiplicityRange(MultiplicityRange object) {
				return createMultiplicityRangeAdapter();
			}
			@Override
			public Adapter caseParameterMembership(ParameterMembership object) {
				return createParameterMembershipAdapter();
			}
			@Override
			public Adapter caseSourceEnd(SourceEnd object) {
				return createSourceEndAdapter();
			}
			@Override
			public Adapter caseTargetEnd(TargetEnd object) {
				return createTargetEndAdapter();
			}
			@Override
			public Adapter caseReturnParameterMembership(ReturnParameterMembership object) {
				return createReturnParameterMembershipAdapter();
			}
			@Override
			public Adapter caseImportCondition(ImportCondition object) {
				return createImportConditionAdapter();
			}
			@Override
			public Adapter caseConditionalImport(ConditionalImport object) {
				return createConditionalImportAdapter();
			}
			@Override
			public Adapter caseItemFeature(ItemFeature object) {
				return createItemFeatureAdapter();
			}
			@Override
			public Adapter caseItemFlowEnd(ItemFlowEnd object) {
				return createItemFlowEndAdapter();
			}
			@Override
			public Adapter caseItemFlowFeature(ItemFlowFeature object) {
				return createItemFlowFeatureAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseSuccessionItemFlow(SuccessionItemFlow object) {
				return createSuccessionItemFlowAdapter();
			}
			@Override
			public Adapter caseItemFlow(ItemFlow object) {
				return createItemFlowAdapter();
			}
			@Override
			public Adapter caseSequenceConstructionExpression(SequenceConstructionExpression object) {
				return createSequenceConstructionExpressionAdapter();
			}
			@Override
			public Adapter caseBlockExpression(BlockExpression object) {
				return createBlockExpressionAdapter();
			}
			@Override
			public Adapter caseInstanceCreationExpression(InstanceCreationExpression object) {
				return createInstanceCreationExpressionAdapter();
			}
			@Override
			public Adapter caseInvocationExpression(InvocationExpression object) {
				return createInvocationExpressionAdapter();
			}
			@Override
			public Adapter caseOperatorExpression(OperatorExpression object) {
				return createOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseQueryPathExpression(QueryPathExpression object) {
				return createQueryPathExpressionAdapter();
			}
			@Override
			public Adapter caseFeatureReferenceExpression(FeatureReferenceExpression object) {
				return createFeatureReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseQueryPathStepExpression(QueryPathStepExpression object) {
				return createQueryPathStepExpressionAdapter();
			}
			@Override
			public Adapter caseQueryQualifierExpression(QueryQualifierExpression object) {
				return createQueryQualifierExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralInteger(LiteralInteger object) {
				return createLiteralIntegerAdapter();
			}
			@Override
			public Adapter caseLiteralExpression(LiteralExpression object) {
				return createLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralBoolean(LiteralBoolean object) {
				return createLiteralBooleanAdapter();
			}
			@Override
			public Adapter caseLiteralUnbounded(LiteralUnbounded object) {
				return createLiteralUnboundedAdapter();
			}
			@Override
			public Adapter caseNullExpression(NullExpression object) {
				return createNullExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralString(LiteralString object) {
				return createLiteralStringAdapter();
			}
			@Override
			public Adapter caseLiteralReal(LiteralReal object) {
				return createLiteralRealAdapter();
			}
			@Override
			public Adapter caseFeatureValue(FeatureValue object) {
				return createFeatureValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.EndFeatureMembership <em>End Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.EndFeatureMembership
	 * @generated
	 */
	public Adapter createEndFeatureMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.TransferActionUsage <em>Transfer Action Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.TransferActionUsage
	 * @generated
	 */
	public Adapter createTransferActionUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.SendActionUsage <em>Send Action Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.SendActionUsage
	 * @generated
	 */
	public Adapter createSendActionUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.AssertConstraintUsage <em>Assert Constraint Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.AssertConstraintUsage
	 * @generated
	 */
	public Adapter createAssertConstraintUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.AcceptActionUsage <em>Accept Action Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.AcceptActionUsage
	 * @generated
	 */
	public Adapter createAcceptActionUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.PerformActionUsage <em>Perform Action Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.PerformActionUsage
	 * @generated
	 */
	public Adapter createPerformActionUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.DecisionNode
	 * @generated
	 */
	public Adapter createDecisionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.MergeNode
	 * @generated
	 */
	public Adapter createMergeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.StateDefinition <em>State Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.StateDefinition
	 * @generated
	 */
	public Adapter createStateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.FeatureMembership <em>Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership
	 * @generated
	 */
	public Adapter createFeatureMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Conjugation <em>Conjugation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Conjugation
	 * @generated
	 */
	public Adapter createConjugationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Membership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Membership
	 * @generated
	 */
	public Adapter createMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.TransitionUsage <em>Transition Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.TransitionUsage
	 * @generated
	 */
	public Adapter createTransitionUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Behavior
	 * @generated
	 */
	public Adapter createBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Redefinition <em>Redefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Redefinition
	 * @generated
	 */
	public Adapter createRedefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Subsetting <em>Subsetting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Subsetting
	 * @generated
	 */
	public Adapter createSubsettingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.FeatureValue
	 * @generated
	 */
	public Adapter createFeatureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Multiplicity
	 * @generated
	 */
	public Adapter createMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.FeatureTyping <em>Feature Typing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.FeatureTyping
	 * @generated
	 */
	public Adapter createFeatureTypingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Superclassing <em>Superclassing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Superclassing
	 * @generated
	 */
	public Adapter createSuperclassingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Usage
	 * @generated
	 */
	public Adapter createUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.PortUsage <em>Port Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.PortUsage
	 * @generated
	 */
	public Adapter createPortUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.PortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.PortDefinition
	 * @generated
	 */
	public Adapter createPortDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition <em>Conjugated Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ConjugatedPortDefinition
	 * @generated
	 */
	public Adapter createConjugatedPortDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.PortConjugation <em>Port Conjugation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.PortConjugation
	 * @generated
	 */
	public Adapter createPortConjugationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ActionUsage <em>Action Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ActionUsage
	 * @generated
	 */
	public Adapter createActionUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.StateUsage <em>State Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.StateUsage
	 * @generated
	 */
	public Adapter createStateUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ConstraintUsage <em>Constraint Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ConstraintUsage
	 * @generated
	 */
	public Adapter createConstraintUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Invariant
	 * @generated
	 */
	public Adapter createInvariantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ExhibitStateUsage <em>Exhibit State Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ExhibitStateUsage
	 * @generated
	 */
	public Adapter createExhibitStateUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.StateSubactionMembership <em>State Subaction Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.StateSubactionMembership
	 * @generated
	 */
	public Adapter createStateSubactionMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping <em>Conjugated Port Typing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ConjugatedPortTyping
	 * @generated
	 */
	public Adapter createConjugatedPortTypingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.IndividualUsage <em>Individual Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.IndividualUsage
	 * @generated
	 */
	public Adapter createIndividualUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.IndividualDefinition <em>Individual Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.IndividualDefinition
	 * @generated
	 */
	public Adapter createIndividualDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.InterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.InterfaceDefinition
	 * @generated
	 */
	public Adapter createInterfaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.InterfaceUsage <em>Interface Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.InterfaceUsage
	 * @generated
	 */
	public Adapter createInterfaceUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ConstraintDefinition <em>Constraint Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ConstraintDefinition
	 * @generated
	 */
	public Adapter createConstraintDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ConnectionUsage <em>Connection Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ConnectionUsage
	 * @generated
	 */
	public Adapter createConnectionUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.AssociationBlock <em>Association Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.AssociationBlock
	 * @generated
	 */
	public Adapter createAssociationBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.BlockProperty <em>Block Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.BlockProperty
	 * @generated
	 */
	public Adapter createBlockPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ReferenceProperty <em>Reference Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ReferenceProperty
	 * @generated
	 */
	public Adapter createReferencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage <em>Satisfy Requirement Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.SatisfyRequirementUsage
	 * @generated
	 */
	public Adapter createSatisfyRequirementUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.PartProperty <em>Part Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.PartProperty
	 * @generated
	 */
	public Adapter createPartPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ValueProperty <em>Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ValueProperty
	 * @generated
	 */
	public Adapter createValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.RequirementUsage <em>Requirement Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.RequirementUsage
	 * @generated
	 */
	public Adapter createRequirementUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.RequirementDefinition <em>Requirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.RequirementDefinition
	 * @generated
	 */
	public Adapter createRequirementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.BindingConnector <em>Binding Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.BindingConnector
	 * @generated
	 */
	public Adapter createBindingConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.MultiplicityRange <em>Multiplicity Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.MultiplicityRange
	 * @generated
	 */
	public Adapter createMultiplicityRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Succession <em>Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Succession
	 * @generated
	 */
	public Adapter createSuccessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ImportCondition <em>Import Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ImportCondition
	 * @generated
	 */
	public Adapter createImportConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ConditionalImport <em>Conditional Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ConditionalImport
	 * @generated
	 */
	public Adapter createConditionalImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Ownership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Ownership
	 * @generated
	 */
	public Adapter createOwnershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.LifeClass <em>Life Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.LifeClass
	 * @generated
	 */
	public Adapter createLifeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.TimeSliceFeature <em>Time Slice Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.TimeSliceFeature
	 * @generated
	 */
	public Adapter createTimeSliceFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.SnapshotFeature <em>Snapshot Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.SnapshotFeature
	 * @generated
	 */
	public Adapter createSnapshotFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership <em>Requirement Constraint Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.RequirementConstraintMembership
	 * @generated
	 */
	public Adapter createRequirementConstraintMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.InvocationExpression <em>Invocation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.InvocationExpression
	 * @generated
	 */
	public Adapter createInvocationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.BlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.BlockExpression
	 * @generated
	 */
	public Adapter createBlockExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ParameterMembership <em>Parameter Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ParameterMembership
	 * @generated
	 */
	public Adapter createParameterMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ReturnParameterMembership <em>Return Parameter Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ReturnParameterMembership
	 * @generated
	 */
	public Adapter createReturnParameterMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.QueryPathStepExpression <em>Query Path Step Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.QueryPathStepExpression
	 * @generated
	 */
	public Adapter createQueryPathStepExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.QueryQualifierExpression <em>Query Qualifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.QueryQualifierExpression
	 * @generated
	 */
	public Adapter createQueryQualifierExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.QueryPathExpression <em>Query Path Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.QueryPathExpression
	 * @generated
	 */
	public Adapter createQueryPathExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.LiteralExpression
	 * @generated
	 */
	public Adapter createLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.LiteralReal <em>Literal Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.LiteralReal
	 * @generated
	 */
	public Adapter createLiteralRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.LiteralUnbounded <em>Literal Unbounded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.LiteralUnbounded
	 * @generated
	 */
	public Adapter createLiteralUnboundedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.LiteralInteger
	 * @generated
	 */
	public Adapter createLiteralIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ItemFlowEnd <em>Item Flow End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ItemFlowEnd
	 * @generated
	 */
	public Adapter createItemFlowEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ItemFlowFeature <em>Item Flow Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ItemFlowFeature
	 * @generated
	 */
	public Adapter createItemFlowFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ItemFeature <em>Item Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ItemFeature
	 * @generated
	 */
	public Adapter createItemFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.SourceEnd <em>Source End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.SourceEnd
	 * @generated
	 */
	public Adapter createSourceEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.TargetEnd <em>Target End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.TargetEnd
	 * @generated
	 */
	public Adapter createTargetEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership <em>Transition Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.TransitionFeatureMembership
	 * @generated
	 */
	public Adapter createTransitionFeatureMembershipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.OperatorExpression <em>Operator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.OperatorExpression
	 * @generated
	 */
	public Adapter createOperatorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ItemFlow <em>Item Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ItemFlow
	 * @generated
	 */
	public Adapter createItemFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.SuccessionItemFlow <em>Succession Item Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.SuccessionItemFlow
	 * @generated
	 */
	public Adapter createSuccessionItemFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression <em>Instance Creation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.InstanceCreationExpression
	 * @generated
	 */
	public Adapter createInstanceCreationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.NullExpression
	 * @generated
	 */
	public Adapter createNullExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.SequenceConstructionExpression <em>Sequence Construction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.SequenceConstructionExpression
	 * @generated
	 */
	public Adapter createSequenceConstructionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.FeatureReferenceExpression <em>Feature Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.FeatureReferenceExpression
	 * @generated
	 */
	public Adapter createFeatureReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SysMLAdapterFactory
