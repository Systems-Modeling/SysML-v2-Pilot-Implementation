/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage
 * @generated
 */
public interface SysMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysMLFactory eINSTANCE = org.omg.sysml.lang.sysml.impl.SysMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>End Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Feature Membership</em>'.
	 * @generated
	 */
	EndFeatureMembership createEndFeatureMembership();

	/**
	 * Returns a new object of class '<em>Conjugated Port Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjugated Port Membership</em>'.
	 * @generated
	 */
	ConjugatedPortMembership createConjugatedPortMembership();

	/**
	 * Returns a new object of class '<em>Port Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Membership</em>'.
	 * @generated
	 */
	PortMembership createPortMembership();

	/**
	 * Returns a new object of class '<em>Send Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Action Usage</em>'.
	 * @generated
	 */
	SendActionUsage createSendActionUsage();

	/**
	 * Returns a new object of class '<em>Accept Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Action Usage</em>'.
	 * @generated
	 */
	AcceptActionUsage createAcceptActionUsage();

	/**
	 * Returns a new object of class '<em>Perform Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Action Usage</em>'.
	 * @generated
	 */
	PerformActionUsage createPerformActionUsage();

	/**
	 * Returns a new object of class '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Node</em>'.
	 * @generated
	 */
	ForkNode createForkNode();

	/**
	 * Returns a new object of class '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Node</em>'.
	 * @generated
	 */
	DecisionNode createDecisionNode();

	/**
	 * Returns a new object of class '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Node</em>'.
	 * @generated
	 */
	JoinNode createJoinNode();

	/**
	 * Returns a new object of class '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node</em>'.
	 * @generated
	 */
	MergeNode createMergeNode();

	/**
	 * Returns a new object of class '<em>Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Membership</em>'.
	 * @generated
	 */
	FeatureMembership createFeatureMembership();

	/**
	 * Returns a new object of class '<em>Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Membership</em>'.
	 * @generated
	 */
	Membership createMembership();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate</em>'.
	 * @generated
	 */
	Predicate createPredicate();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior</em>'.
	 * @generated
	 */
	Behavior createBehavior();

	/**
	 * Returns a new object of class '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier</em>'.
	 * @generated
	 */
	Classifier createClassifier();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Redefinition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinition</em>'.
	 * @generated
	 */
	Redefinition createRedefinition();

	/**
	 * Returns a new object of class '<em>Subsetting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsetting</em>'.
	 * @generated
	 */
	Subsetting createSubsetting();

	/**
	 * Returns a new object of class '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Value</em>'.
	 * @generated
	 */
	FeatureValue createFeatureValue();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity</em>'.
	 * @generated
	 */
	Multiplicity createMultiplicity();

	/**
	 * Returns a new object of class '<em>Feature Typing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Typing</em>'.
	 * @generated
	 */
	FeatureTyping createFeatureTyping();

	/**
	 * Returns a new object of class '<em>Superclassing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Superclassing</em>'.
	 * @generated
	 */
	Superclassing createSuperclassing();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Port Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Usage</em>'.
	 * @generated
	 */
	PortUsage createPortUsage();

	/**
	 * Returns a new object of class '<em>Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Definition</em>'.
	 * @generated
	 */
	PortDefinition createPortDefinition();

	/**
	 * Returns a new object of class '<em>Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Usage</em>'.
	 * @generated
	 */
	ActionUsage createActionUsage();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Type</em>'.
	 * @generated
	 */
	ValueType createValueType();

	/**
	 * Returns a new object of class '<em>Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Definition</em>'.
	 * @generated
	 */
	InterfaceDefinition createInterfaceDefinition();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Interface Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Usage</em>'.
	 * @generated
	 */
	InterfaceUsage createInterfaceUsage();

	/**
	 * Returns a new object of class '<em>Connection Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Usage</em>'.
	 * @generated
	 */
	ConnectionUsage createConnectionUsage();

	/**
	 * Returns a new object of class '<em>Association Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Block</em>'.
	 * @generated
	 */
	AssociationBlock createAssociationBlock();

	/**
	 * Returns a new object of class '<em>Reference Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Property</em>'.
	 * @generated
	 */
	ReferenceProperty createReferenceProperty();

	/**
	 * Returns a new object of class '<em>Part Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Property</em>'.
	 * @generated
	 */
	PartProperty createPartProperty();

	/**
	 * Returns a new object of class '<em>Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Property</em>'.
	 * @generated
	 */
	ValueProperty createValueProperty();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Binding Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Connector</em>'.
	 * @generated
	 */
	BindingConnector createBindingConnector();

	/**
	 * Returns a new object of class '<em>Multiplicity Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Range</em>'.
	 * @generated
	 */
	MultiplicityRange createMultiplicityRange();

	/**
	 * Returns a new object of class '<em>Succession</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Succession</em>'.
	 * @generated
	 */
	Succession createSuccession();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Atomic Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Interaction</em>'.
	 * @generated
	 */
	AtomicInteraction createAtomicInteraction();

	/**
	 * Returns a new object of class '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction</em>'.
	 * @generated
	 */
	Interaction createInteraction();

	/**
	 * Returns a new object of class '<em>Import Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Condition</em>'.
	 * @generated
	 */
	ImportCondition createImportCondition();

	/**
	 * Returns a new object of class '<em>Conditional Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Import</em>'.
	 * @generated
	 */
	ConditionalImport createConditionalImport();

	/**
	 * Returns a new object of class '<em>Ownership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ownership</em>'.
	 * @generated
	 */
	Ownership createOwnership();

	/**
	 * Returns a new object of class '<em>Conditional Succession</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Succession</em>'.
	 * @generated
	 */
	ConditionalSuccession createConditionalSuccession();

	/**
	 * Returns a new object of class '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Boolean</em>'.
	 * @generated
	 */
	LiteralBoolean createLiteralBoolean();

	/**
	 * Returns a new object of class '<em>Invocation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocation Expression</em>'.
	 * @generated
	 */
	InvocationExpression createInvocationExpression();

	/**
	 * Returns a new object of class '<em>Block Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Expression</em>'.
	 * @generated
	 */
	BlockExpression createBlockExpression();

	/**
	 * Returns a new object of class '<em>Parameter Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Membership</em>'.
	 * @generated
	 */
	ParameterMembership createParameterMembership();

	/**
	 * Returns a new object of class '<em>Return Parameter Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Parameter Membership</em>'.
	 * @generated
	 */
	ReturnParameterMembership createReturnParameterMembership();

	/**
	 * Returns a new object of class '<em>Query Path Step Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Path Step Expression</em>'.
	 * @generated
	 */
	QueryPathStepExpression createQueryPathStepExpression();

	/**
	 * Returns a new object of class '<em>Query Qualifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Qualifier Expression</em>'.
	 * @generated
	 */
	QueryQualifierExpression createQueryQualifierExpression();

	/**
	 * Returns a new object of class '<em>Query Path Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Path Expression</em>'.
	 * @generated
	 */
	QueryPathExpression createQueryPathExpression();

	/**
	 * Returns a new object of class '<em>Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Expression</em>'.
	 * @generated
	 */
	LiteralExpression createLiteralExpression();

	/**
	 * Returns a new object of class '<em>Literal Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Real</em>'.
	 * @generated
	 */
	LiteralReal createLiteralReal();

	/**
	 * Returns a new object of class '<em>Literal Unbounded</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Unbounded</em>'.
	 * @generated
	 */
	LiteralUnbounded createLiteralUnbounded();

	/**
	 * Returns a new object of class '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Integer</em>'.
	 * @generated
	 */
	LiteralInteger createLiteralInteger();

	/**
	 * Returns a new object of class '<em>Item Flow End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Flow End</em>'.
	 * @generated
	 */
	ItemFlowEnd createItemFlowEnd();

	/**
	 * Returns a new object of class '<em>Item Flow Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Flow Feature</em>'.
	 * @generated
	 */
	ItemFlowFeature createItemFlowFeature();

	/**
	 * Returns a new object of class '<em>Item Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Feature</em>'.
	 * @generated
	 */
	ItemFeature createItemFeature();

	/**
	 * Returns a new object of class '<em>Source End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source End</em>'.
	 * @generated
	 */
	SourceEnd createSourceEnd();

	/**
	 * Returns a new object of class '<em>Target End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target End</em>'.
	 * @generated
	 */
	TargetEnd createTargetEnd();

	/**
	 * Returns a new object of class '<em>Operator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator Expression</em>'.
	 * @generated
	 */
	OperatorExpression createOperatorExpression();

	/**
	 * Returns a new object of class '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal String</em>'.
	 * @generated
	 */
	LiteralString createLiteralString();

	/**
	 * Returns a new object of class '<em>Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Flow</em>'.
	 * @generated
	 */
	ItemFlow createItemFlow();

	/**
	 * Returns a new object of class '<em>Succession Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Succession Item Flow</em>'.
	 * @generated
	 */
	SuccessionItemFlow createSuccessionItemFlow();

	/**
	 * Returns a new object of class '<em>Instance Creation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Creation Expression</em>'.
	 * @generated
	 */
	InstanceCreationExpression createInstanceCreationExpression();

	/**
	 * Returns a new object of class '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Expression</em>'.
	 * @generated
	 */
	NullExpression createNullExpression();

	/**
	 * Returns a new object of class '<em>Sequence Construction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Construction Expression</em>'.
	 * @generated
	 */
	SequenceConstructionExpression createSequenceConstructionExpression();

	/**
	 * Returns a new object of class '<em>Feature Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Reference Expression</em>'.
	 * @generated
	 */
	FeatureReferenceExpression createFeatureReferenceExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SysMLPackage getSysMLPackage();

} //SysMLFactory
