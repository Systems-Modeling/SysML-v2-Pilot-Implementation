/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.omg.sysml.lang.sysml.*;

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
			case SysMLPackage.PART_PROPERTY: return createPartProperty();
			case SysMLPackage.FEATURE: return createFeature();
			case SysMLPackage.TYPE: return createType();
			case SysMLPackage.PACKAGE: return createPackage();
			case SysMLPackage.ELEMENT: return createElement();
			case SysMLPackage.MEMBERSHIP: return createMembership();
			case SysMLPackage.RELATIONSHIP: return createRelationship();
			case SysMLPackage.IMPORT: return createImport();
			case SysMLPackage.GENERALIZATION: return createGeneralization();
			case SysMLPackage.FEATURE_MEMBERSHIP: return createFeatureMembership();
			case SysMLPackage.CONJUGATION: return createConjugation();
			case SysMLPackage.MULTIPLICITY: return createMultiplicity();
			case SysMLPackage.REDEFINITION: return createRedefinition();
			case SysMLPackage.SUBSETTING: return createSubsetting();
			case SysMLPackage.FEATURE_TYPING: return createFeatureTyping();
			case SysMLPackage.CLASSIFIER: return createClassifier();
			case SysMLPackage.SUPERCLASSING: return createSuperclassing();
			case SysMLPackage.PORT_USAGE: return createPortUsage();
			case SysMLPackage.PORT_DEFINITION: return createPortDefinition();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION: return createConjugatedPortDefinition();
			case SysMLPackage.PORT_CONJUGATION: return createPortConjugation();
			case SysMLPackage.ACTION_USAGE: return createActionUsage();
			case SysMLPackage.STEP: return createStep();
			case SysMLPackage.BEHAVIOR: return createBehavior();
			case SysMLPackage.PARAMETER: return createParameter();
			case SysMLPackage.STATE_USAGE: return createStateUsage();
			case SysMLPackage.CONSTRAINT_USAGE: return createConstraintUsage();
			case SysMLPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case SysMLPackage.EXPRESSION: return createExpression();
			case SysMLPackage.FUNCTION: return createFunction();
			case SysMLPackage.PREDICATE: return createPredicate();
			case SysMLPackage.TRANSITION_USAGE: return createTransitionUsage();
			case SysMLPackage.ACCEPT_ACTION_USAGE: return createAcceptActionUsage();
			case SysMLPackage.SUCCESSION: return createSuccession();
			case SysMLPackage.CONNECTOR: return createConnector();
			case SysMLPackage.ASSOCIATION: return createAssociation();
			case SysMLPackage.CLASS: return createClass();
			case SysMLPackage.REQUIREMENT_USAGE: return createRequirementUsage();
			case SysMLPackage.REQUIREMENT_DEFINITION: return createRequirementDefinition();
			case SysMLPackage.CONSTRAINT_DEFINITION: return createConstraintDefinition();
			case SysMLPackage.ASSOCIATION_BLOCK: return createAssociationBlock();
			case SysMLPackage.BLOCK: return createBlock();
			case SysMLPackage.REFERENCE_PROPERTY: return createReferenceProperty();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE: return createSatisfyRequirementUsage();
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE: return createAssertConstraintUsage();
			case SysMLPackage.INVARIANT: return createInvariant();
			case SysMLPackage.BINDING_CONNECTOR: return createBindingConnector();
			case SysMLPackage.CONJUGATED_PORT_TYPING: return createConjugatedPortTyping();
			case SysMLPackage.JOIN_NODE: return createJoinNode();
			case SysMLPackage.DECISION_NODE: return createDecisionNode();
			case SysMLPackage.MERGE_NODE: return createMergeNode();
			case SysMLPackage.FORK_NODE: return createForkNode();
			case SysMLPackage.PERFORM_ACTION_USAGE: return createPerformActionUsage();
			case SysMLPackage.SEND_ACTION_USAGE: return createSendActionUsage();
			case SysMLPackage.ACTIVITY: return createActivity();
			case SysMLPackage.CONNECTION_USAGE: return createConnectionUsage();
			case SysMLPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
			case SysMLPackage.INTERFACE_USAGE: return createInterfaceUsage();
			case SysMLPackage.VALUE_PROPERTY: return createValueProperty();
			case SysMLPackage.DATA_TYPE: return createDataType();
			case SysMLPackage.VALUE_TYPE: return createValueType();
			case SysMLPackage.INDIVIDUAL_USAGE: return createIndividualUsage();
			case SysMLPackage.INDIVIDUAL_DEFINITION: return createIndividualDefinition();
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP: return createTransitionFeatureMembership();
			case SysMLPackage.STATE_DEFINITION: return createStateDefinition();
			case SysMLPackage.EXHIBIT_STATE_USAGE: return createExhibitStateUsage();
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP: return createStateSubactionMembership();
			case SysMLPackage.END_FEATURE_MEMBERSHIP: return createEndFeatureMembership();
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION: return createInstanceCreationExpression();
			case SysMLPackage.INVOCATION_EXPRESSION: return createInvocationExpression();
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION: return createSequenceConstructionExpression();
			case SysMLPackage.BLOCK_EXPRESSION: return createBlockExpression();
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION: return createFeatureReferenceExpression();
			case SysMLPackage.QUERY_PATH_STEP_EXPRESSION: return createQueryPathStepExpression();
			case SysMLPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
			case SysMLPackage.QUERY_QUALIFIER_EXPRESSION: return createQueryQualifierExpression();
			case SysMLPackage.QUERY_PATH_EXPRESSION: return createQueryPathExpression();
			case SysMLPackage.LITERAL_EXPRESSION: return createLiteralExpression();
			case SysMLPackage.LITERAL_UNBOUNDED: return createLiteralUnbounded();
			case SysMLPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
			case SysMLPackage.NULL_EXPRESSION: return createNullExpression();
			case SysMLPackage.LITERAL_INTEGER: return createLiteralInteger();
			case SysMLPackage.LITERAL_STRING: return createLiteralString();
			case SysMLPackage.LITERAL_REAL: return createLiteralReal();
			case SysMLPackage.MULTIPLICITY_RANGE: return createMultiplicityRange();
			case SysMLPackage.CONDITIONAL_IMPORT: return createConditionalImport();
			case SysMLPackage.IMPORT_CONDITION: return createImportCondition();
			case SysMLPackage.SOURCE_END: return createSourceEnd();
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP: return createReturnParameterMembership();
			case SysMLPackage.PARAMETER_MEMBERSHIP: return createParameterMembership();
			case SysMLPackage.TARGET_END: return createTargetEnd();
			case SysMLPackage.ITEM_FLOW_END: return createItemFlowEnd();
			case SysMLPackage.ITEM_FEATURE: return createItemFeature();
			case SysMLPackage.ITEM_FLOW_FEATURE: return createItemFlowFeature();
			case SysMLPackage.INTERACTION: return createInteraction();
			case SysMLPackage.ITEM_FLOW: return createItemFlow();
			case SysMLPackage.SUCCESSION_ITEM_FLOW: return createSuccessionItemFlow();
			case SysMLPackage.FEATURE_VALUE: return createFeatureValue();
			case SysMLPackage.ANNOTATION: return createAnnotation();
			case SysMLPackage.COMMENT: return createComment();
			case SysMLPackage.OWNERSHIP: return createOwnership();
			case SysMLPackage.LIFE_CLASS: return createLifeClass();
			case SysMLPackage.TIME_SLICE_FEATURE: return createTimeSliceFeature();
			case SysMLPackage.SNAPSHOT_FEATURE: return createSnapshotFeature();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP: return createRequirementConstraintMembership();
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
			case SysMLPackage.TRANSITION_FEATURE_KIND:
				return createTransitionFeatureKindFromString(eDataType, initialValue);
			case SysMLPackage.STATE_SUBACTION_KIND:
				return createStateSubactionKindFromString(eDataType, initialValue);
			case SysMLPackage.REQUIREMENT_CONSTRAINT_KIND:
				return createRequirementConstraintKindFromString(eDataType, initialValue);
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
			case SysMLPackage.TRANSITION_FEATURE_KIND:
				return convertTransitionFeatureKindToString(eDataType, instanceValue);
			case SysMLPackage.STATE_SUBACTION_KIND:
				return convertStateSubactionKindToString(eDataType, instanceValue);
			case SysMLPackage.REQUIREMENT_CONSTRAINT_KIND:
				return convertRequirementConstraintKindToString(eDataType, instanceValue);
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
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
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
	public Superclassing createSuperclassing() {
		SuperclassingImpl superclassing = new SuperclassingImpl();
		return superclassing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
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
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
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
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualUsage createIndividualUsage() {
		IndividualUsageImpl individualUsage = new IndividualUsageImpl();
		return individualUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualDefinition createIndividualDefinition() {
		IndividualDefinitionImpl individualDefinition = new IndividualDefinitionImpl();
		return individualDefinition;
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
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
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
	public AssociationBlock createAssociationBlock() {
		AssociationBlockImpl associationBlock = new AssociationBlockImpl();
		return associationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceProperty createReferenceProperty() {
		ReferencePropertyImpl referenceProperty = new ReferencePropertyImpl();
		return referenceProperty;
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
	public PartProperty createPartProperty() {
		PartPropertyImpl partProperty = new PartPropertyImpl();
		return partProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueProperty createValueProperty() {
		ValuePropertyImpl valueProperty = new ValuePropertyImpl();
		return valueProperty;
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
	public ImportCondition createImportCondition() {
		ImportConditionImpl importCondition = new ImportConditionImpl();
		return importCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalImport createConditionalImport() {
		ConditionalImportImpl conditionalImport = new ConditionalImportImpl();
		return conditionalImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ownership createOwnership() {
		OwnershipImpl ownership = new OwnershipImpl();
		return ownership;
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
	public TimeSliceFeature createTimeSliceFeature() {
		TimeSliceFeatureImpl timeSliceFeature = new TimeSliceFeatureImpl();
		return timeSliceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnapshotFeature createSnapshotFeature() {
		SnapshotFeatureImpl snapshotFeature = new SnapshotFeatureImpl();
		return snapshotFeature;
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
	public BlockExpression createBlockExpression() {
		BlockExpressionImpl blockExpression = new BlockExpressionImpl();
		return blockExpression;
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
	public QueryPathStepExpression createQueryPathStepExpression() {
		QueryPathStepExpressionImpl queryPathStepExpression = new QueryPathStepExpressionImpl();
		return queryPathStepExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryQualifierExpression createQueryQualifierExpression() {
		QueryQualifierExpressionImpl queryQualifierExpression = new QueryQualifierExpressionImpl();
		return queryQualifierExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryPathExpression createQueryPathExpression() {
		QueryPathExpressionImpl queryPathExpression = new QueryPathExpressionImpl();
		return queryPathExpression;
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
	public LiteralReal createLiteralReal() {
		LiteralRealImpl literalReal = new LiteralRealImpl();
		return literalReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralUnbounded createLiteralUnbounded() {
		LiteralUnboundedImpl literalUnbounded = new LiteralUnboundedImpl();
		return literalUnbounded;
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
	public InstanceCreationExpression createInstanceCreationExpression() {
		InstanceCreationExpressionImpl instanceCreationExpression = new InstanceCreationExpressionImpl();
		return instanceCreationExpression;
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
	public SequenceConstructionExpression createSequenceConstructionExpression() {
		SequenceConstructionExpressionImpl sequenceConstructionExpression = new SequenceConstructionExpressionImpl();
		return sequenceConstructionExpression;
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
