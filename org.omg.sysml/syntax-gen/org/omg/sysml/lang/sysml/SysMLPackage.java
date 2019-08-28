/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.omg.sysml.lang.sysml.SysMLFactory
 * @model kind="package"
 * @generated
 */
public interface SysMLPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "sysml";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/SysML/2.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "sysml";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	SysMLPackage eINSTANCE = org.omg.sysml.lang.sysml.impl.SysMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ElementImpl
	 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ElementImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl
	 * <em>Relationship</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.RelationshipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.MembershipImpl <em>Membership</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.MembershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getMembership()
	 * @generated
	 */
	int MEMBERSHIP = 2;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl <em>Feature
	 * Membership</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureMembership()
	 * @generated
	 */
	int FEATURE_MEMBERSHIP = 12;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl <em>End
	 * Feature Membership</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getEndFeatureMembership()
	 * @generated
	 */
	int END_FEATURE_MEMBERSHIP = 25;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.PackageImpl
	 * <em>Package</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.PackageImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 4;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ImportImpl
	 * <em>Import</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ImportImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 5;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ClassImpl
	 * <em>Class</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ClassImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 33;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl
	 * <em>Behavior</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.BehaviorImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 8;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.FunctionImpl
	 * <em>Function</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.FunctionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 7;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.PredicateImpl <em>Predicate</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.PredicateImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 6;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl
	 * <em>Generalization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.GeneralizationImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 11;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.FeatureImpl
	 * <em>Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.FeatureImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 13;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.SubsettingImpl <em>Subsetting</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.SubsettingImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSubsetting()
	 * @generated
	 */
	int SUBSETTING = 15;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.RedefinitionImpl
	 * <em>Redefinition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.RedefinitionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getRedefinition()
	 * @generated
	 */
	int REDEFINITION = 14;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl <em>Feature
	 * Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.FeatureValueImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureValue()
	 * @generated
	 */
	int FEATURE_VALUE = 16;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.StepImpl
	 * <em>Step</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.StepImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 18;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ExpressionImpl <em>Expression</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 17;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl
	 * <em>Multiplicity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.MultiplicityImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 19;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.FeatureTypingImpl <em>Feature
	 * Typing</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.FeatureTypingImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureTyping()
	 * @generated
	 */
	int FEATURE_TYPING = 20;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.SuperclassingImpl
	 * <em>Superclassing</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.SuperclassingImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuperclassing()
	 * @generated
	 */
	int SUPERCLASSING = 21;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ParameterImpl <em>Parameter</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ParameterImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 22;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.AssociationImpl <em>Association</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.AssociationImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 32;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl <em>Connector</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ConnectorImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 31;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.OfSuccessionImpl <em>Of
	 * Succession</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.OfSuccessionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOfSuccession()
	 * @generated
	 */
	int OF_SUCCESSION = 60;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.StructuredFeatureImpl <em>Structured
	 * Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.StructuredFeatureImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getStructuredFeature()
	 * @generated
	 */
	int STRUCTURED_FEATURE = 59;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.OrderedFeatureImpl <em>Ordered
	 * Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.OrderedFeatureImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOrderedFeature()
	 * @generated
	 */
	int ORDERED_FEATURE = 58;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.BindingConnectorImpl <em>Binding
	 * Connector</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.BindingConnectorImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getBindingConnector()
	 * @generated
	 */
	int BINDING_CONNECTOR = 61;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.SuccessionImpl <em>Succession</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.SuccessionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuccession()
	 * @generated
	 */
	int SUCCESSION = 35;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.CommentImpl
	 * <em>Comment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.CommentImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 0;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl <em>Annotation</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.AnnotationImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 23;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.AtomicInteractionImpl <em>Atomic
	 * Interaction</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.AtomicInteractionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getAtomicInteraction()
	 * @generated
	 */
	int ATOMIC_INTERACTION = 29;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.InteractionImpl <em>Interaction</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.InteractionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 36;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.OwnershipImpl <em>Ownership</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.OwnershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOwnership()
	 * @generated
	 */
	int OWNERSHIP = 24;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl <em>Literal
	 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 46;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl <em>Literal
	 * Boolean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 52;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.LiteralRealImpl <em>Literal Real</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.LiteralRealImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralReal()
	 * @generated
	 */
	int LITERAL_REAL = 47;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.LiteralUnboundedImpl <em>Literal
	 * Unbounded</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.LiteralUnboundedImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralUnbounded()
	 * @generated
	 */
	int LITERAL_UNBOUNDED = 51;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl <em>Literal
	 * Integer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 50;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.LiteralStringImpl <em>Literal
	 * String</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.LiteralStringImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 49;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl
	 * <em>Item Flow</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ItemFlowImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFlow()
	 * @generated
	 */
	int ITEM_FLOW = 30;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl <em>Succession
	 * Item Flow</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuccessionItemFlow()
	 * @generated
	 */
	int SUCCESSION_ITEM_FLOW = 34;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl
	 * <em>Instance Creation Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getInstanceCreationExpression()
	 * @generated
	 */
	int INSTANCE_CREATION_EXPRESSION = 41;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.NullExpressionImpl <em>Null
	 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.NullExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getNullExpression()
	 * @generated
	 */
	int NULL_EXPRESSION = 48;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl
	 * <em>Sequence Construction Expression</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSequenceConstructionExpression()
	 * @generated
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION = 40;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl <em>Operator
	 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOperatorExpression()
	 * @generated
	 */
	int OPERATOR_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNING_MEMBERSHIP = 0;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNING_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNING_NAMESPACE = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNER = 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Element</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.TypeImpl
	 * <em>Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.TypeImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 10;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ClassifierImpl <em>Classifier</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ClassifierImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 9;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.FeatureReferenceExpressionImpl
	 * <em>Feature Reference Expression</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.FeatureReferenceExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureReferenceExpression()
	 * @generated
	 */
	int FEATURE_REFERENCE_EXPRESSION = 43;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl <em>Invocation
	 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getInvocationExpression()
	 * @generated
	 */
	int INVOCATION_EXPRESSION = 39;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.BlockExpressionImpl <em>Block
	 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.BlockExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getBlockExpression()
	 * @generated
	 */
	int BLOCK_EXPRESSION = 44;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl <em>Parameter
	 * Membership</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getParameterMembership()
	 * @generated
	 */
	int PARAMETER_MEMBERSHIP = 56;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ReturnParameterMembershipImpl
	 * <em>Return Parameter Membership</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ReturnParameterMembershipImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getReturnParameterMembership()
	 * @generated
	 */
	int RETURN_PARAMETER_MEMBERSHIP = 55;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNING_MEMBERSHIP = ELEMENT__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_RELATIONSHIP = ELEMENT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNING_RELATIONSHIP = ELEMENT__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNING_NAMESPACE = ELEMENT__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__IDENTIFIER = ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commented Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__COMMENTED_ELEMENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation For Comment</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT__ANNOTATION_FOR_COMMENT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comment</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comment</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNING_MEMBERSHIP = ELEMENT__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_RELATIONSHIP = ELEMENT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNING_RELATIONSHIP = ELEMENT__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNING_NAMESPACE = ELEMENT__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IDENTIFIER = ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATED_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNING_RELATED_ELEMENT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_RELATED_ELEMENT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Relationship</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNED_RELATIONSHIP = RELATIONSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNING_RELATIONSHIP = RELATIONSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNING_RELATED_ELEMENT = RELATIONSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNED_RELATED_ELEMENT = RELATIONSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__MEMBER_NAME = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__VISIBILITY = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__ALIASES = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__MEMBER_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Membership Owning Package</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP__OWNED_MEMBER_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Membership</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Membership</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEMBERSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNING_MEMBERSHIP = ELEMENT__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_RELATIONSHIP = ELEMENT__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNING_RELATIONSHIP = ELEMENT__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNING_NAMESPACE = ELEMENT__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IDENTIFIER = ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MEMBERSHIP = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_IMPORT_COMP = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MEMBER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_MEMBER = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IMPORTED_MEMBERSHIP = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_MEMBERSHIP_COMP = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_MEMBERSHIP = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_IMPORT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Package</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE___NAME_OF__ELEMENT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE___EXCLUDE_COLLISIONS__ELIST = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE___PUBLIC_MEMBERSHIPS = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNED_RELATIONSHIP = RELATIONSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNING_RELATIONSHIP = RELATIONSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNING_RELATED_ELEMENT = RELATIONSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__OWNED_RELATED_ELEMENT = RELATIONSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Imported Package</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_PACKAGE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selecter</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__SELECTER = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__VISIBILITY = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import Owning Package</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_OWNING_PACKAGE = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Import</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Imported Membership</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT___IMPORTED_MEMBERSHIP = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Import</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNING_MEMBERSHIP = PACKAGE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_RELATIONSHIP = PACKAGE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNING_RELATIONSHIP = PACKAGE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNING_NAMESPACE = PACKAGE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__IDENTIFIER = PACKAGE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNER = PACKAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_ELEMENT = PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__MEMBERSHIP = PACKAGE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_IMPORT_COMP = PACKAGE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__MEMBER = PACKAGE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_MEMBER = PACKAGE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__IMPORTED_MEMBERSHIP = PACKAGE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_MEMBERSHIP_COMP = PACKAGE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_MEMBERSHIP = PACKAGE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_IMPORT = PACKAGE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_GENERALIZATION = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_FEATURE_MEMBERSHIP = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_FEATURE = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_END_FEATURE = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__FEATURE = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__INPUT = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__OUTPUT = PACKAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_ABSTRACT = PACKAGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__INHERITED_MEMBERSHIP = PACKAGE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__END_FEATURE = PACKAGE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_SUFFICIENT = PACKAGE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE___NAME_OF__ELEMENT = PACKAGE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE___EXCLUDE_COLLISIONS__ELIST = PACKAGE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE___PUBLIC_MEMBERSHIPS = PACKAGE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Type</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNING_MEMBERSHIP = TYPE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_RELATIONSHIP = TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNING_RELATIONSHIP = TYPE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNING_NAMESPACE = TYPE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IDENTIFIER = TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNER = TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_ELEMENT = TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__MEMBERSHIP = TYPE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_IMPORT_COMP = TYPE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__MEMBER = TYPE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_MEMBER = TYPE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IMPORTED_MEMBERSHIP = TYPE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_MEMBERSHIP_COMP = TYPE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_MEMBERSHIP = TYPE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_IMPORT = TYPE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_GENERALIZATION = TYPE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_FEATURE_MEMBERSHIP = TYPE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_FEATURE = TYPE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_END_FEATURE = TYPE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FEATURE = TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__INPUT = TYPE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OUTPUT = TYPE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_ABSTRACT = TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__INHERITED_MEMBERSHIP = TYPE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__END_FEATURE = TYPE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_SUFFICIENT = TYPE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Owned Superclassing</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_SUPERCLASSING = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___NAME_OF__ELEMENT = TYPE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___EXCLUDE_COLLISIONS__ELIST = TYPE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___PUBLIC_MEMBERSHIPS = TYPE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Classifier</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNING_MEMBERSHIP = CLASSIFIER__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_RELATIONSHIP = CLASSIFIER__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNING_RELATIONSHIP = CLASSIFIER__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNING_NAMESPACE = CLASSIFIER__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IDENTIFIER = CLASSIFIER__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNER = CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_ELEMENT = CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__MEMBERSHIP = CLASSIFIER__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_IMPORT_COMP = CLASSIFIER__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__MEMBER = CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_MEMBER = CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IMPORTED_MEMBERSHIP = CLASSIFIER__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_MEMBERSHIP_COMP = CLASSIFIER__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_MEMBERSHIP = CLASSIFIER__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_IMPORT = CLASSIFIER__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_GENERALIZATION = CLASSIFIER__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_FEATURE_MEMBERSHIP = CLASSIFIER__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_FEATURE = CLASSIFIER__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_END_FEATURE = CLASSIFIER__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__FEATURE = CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__INPUT = CLASSIFIER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OUTPUT = CLASSIFIER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__INHERITED_MEMBERSHIP = CLASSIFIER__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__END_FEATURE = CLASSIFIER__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_SUFFICIENT = CLASSIFIER__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Owned Superclassing</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_SUPERCLASSING = CLASSIFIER__OWNED_SUPERCLASSING;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__STEP = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PARAMETER = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___NAME_OF__ELEMENT = CLASSIFIER___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___EXCLUDE_COLLISIONS__ELIST = CLASSIFIER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___PUBLIC_MEMBERSHIPS = CLASSIFIER___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Behavior</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNING_MEMBERSHIP = BEHAVIOR__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_RELATIONSHIP = BEHAVIOR__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNING_RELATIONSHIP = BEHAVIOR__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNING_NAMESPACE = BEHAVIOR__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IDENTIFIER = BEHAVIOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNER = BEHAVIOR__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_ELEMENT = BEHAVIOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MEMBERSHIP = BEHAVIOR__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_IMPORT_COMP = BEHAVIOR__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MEMBER = BEHAVIOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_MEMBER = BEHAVIOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IMPORTED_MEMBERSHIP = BEHAVIOR__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_MEMBERSHIP_COMP = BEHAVIOR__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_MEMBERSHIP = BEHAVIOR__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_IMPORT = BEHAVIOR__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_GENERALIZATION = BEHAVIOR__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_FEATURE_MEMBERSHIP = BEHAVIOR__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_FEATURE = BEHAVIOR__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_END_FEATURE = BEHAVIOR__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FEATURE = BEHAVIOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INPUT = BEHAVIOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OUTPUT = BEHAVIOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_ABSTRACT = BEHAVIOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INHERITED_MEMBERSHIP = BEHAVIOR__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__END_FEATURE = BEHAVIOR__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_SUFFICIENT = BEHAVIOR__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Owned Superclassing</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNED_SUPERCLASSING = BEHAVIOR__OWNED_SUPERCLASSING;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__STEP = BEHAVIOR__STEP;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETER = BEHAVIOR__PARAMETER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXPRESSION = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RESULT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION___NAME_OF__ELEMENT = BEHAVIOR___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION___EXCLUDE_COLLISIONS__ELIST = BEHAVIOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION___PUBLIC_MEMBERSHIPS = BEHAVIOR___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Function</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNING_MEMBERSHIP = FUNCTION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_RELATIONSHIP = FUNCTION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNING_RELATIONSHIP = FUNCTION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNING_NAMESPACE = FUNCTION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IDENTIFIER = FUNCTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNER = FUNCTION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_ELEMENT = FUNCTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__MEMBERSHIP = FUNCTION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_IMPORT_COMP = FUNCTION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__MEMBER = FUNCTION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_MEMBER = FUNCTION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IMPORTED_MEMBERSHIP = FUNCTION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_MEMBERSHIP_COMP = FUNCTION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_MEMBERSHIP = FUNCTION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_IMPORT = FUNCTION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_GENERALIZATION = FUNCTION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_FEATURE_MEMBERSHIP = FUNCTION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_FEATURE = FUNCTION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_END_FEATURE = FUNCTION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__FEATURE = FUNCTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__INPUT = FUNCTION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OUTPUT = FUNCTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IS_ABSTRACT = FUNCTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__INHERITED_MEMBERSHIP = FUNCTION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__END_FEATURE = FUNCTION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__IS_SUFFICIENT = FUNCTION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Owned Superclassing</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__OWNED_SUPERCLASSING = FUNCTION__OWNED_SUPERCLASSING;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__STEP = FUNCTION__STEP;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__PARAMETER = FUNCTION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__EXPRESSION = FUNCTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE__RESULT = FUNCTION__RESULT;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE___NAME_OF__ELEMENT = FUNCTION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE___EXCLUDE_COLLISIONS__ELIST = FUNCTION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE___PUBLIC_MEMBERSHIPS = FUNCTION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Predicate</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_RELATIONSHIP = RELATIONSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNING_RELATIONSHIP = RELATIONSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNING_RELATED_ELEMENT = RELATIONSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_RELATED_ELEMENT = RELATIONSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNING_TYPE = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generalization</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNING_MEMBERSHIP = MEMBERSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNED_RELATIONSHIP = MEMBERSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNING_RELATIONSHIP = MEMBERSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNING_NAMESPACE = MEMBERSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IDENTIFIER = MEMBERSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__NAME = MEMBERSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNER = MEMBERSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNED_ELEMENT = MEMBERSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__RELATED_ELEMENT = MEMBERSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__TARGET = MEMBERSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__SOURCE = MEMBERSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT = MEMBERSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNED_RELATED_ELEMENT = MEMBERSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__MEMBER_NAME = MEMBERSHIP__MEMBER_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__VISIBILITY = MEMBERSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__ALIASES = MEMBERSHIP__ALIASES;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__MEMBER_ELEMENT = MEMBERSHIP__MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership Owning Package</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT = MEMBERSHIP__OWNED_MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_DERIVED = MEMBERSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_READ_ONLY = MEMBERSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__MEMBER_FEATURE = MEMBERSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Member Feature</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE = MEMBERSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Part</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_PART = MEMBERSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Portion</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_PORTION = MEMBERSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__IS_PORT = MEMBERSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__DIRECTION = MEMBERSHIP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP__OWNING_TYPE = MEMBERSHIP_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Feature Membership</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP_FEATURE_COUNT = MEMBERSHIP_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP;

	/**
	 * The number of operations of the '<em>Feature Membership</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_MEMBERSHIP_OPERATION_COUNT = MEMBERSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_MEMBERSHIP = TYPE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_RELATIONSHIP = TYPE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_RELATIONSHIP = TYPE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_NAMESPACE = TYPE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IDENTIFIER = TYPE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNER = TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_ELEMENT = TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBERSHIP = TYPE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_IMPORT_COMP = TYPE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__MEMBER = TYPE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_MEMBER = TYPE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IMPORTED_MEMBERSHIP = TYPE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_MEMBERSHIP_COMP = TYPE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_MEMBERSHIP = TYPE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_IMPORT = TYPE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_GENERALIZATION = TYPE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_FEATURE_MEMBERSHIP = TYPE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_FEATURE = TYPE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_END_FEATURE = TYPE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE = TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__INPUT = TYPE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OUTPUT = TYPE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_ABSTRACT = TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__INHERITED_MEMBERSHIP = TYPE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__END_FEATURE = TYPE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_SUFFICIENT = TYPE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFERENCED_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_UNIQUE = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_ORDERED = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_TYPE = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_REDEFINITION = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_SUBSETTING = TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNING_FEATURE_MEMBERSHIP = TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_COMPOSITE = TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__VALUATION = TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__MULTIPLICITY = TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPING = TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_END = TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__END_OWNING_TYPE = TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_NONUNIQUE = TYPE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE___NAME_OF__ELEMENT = TYPE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE___EXCLUDE_COLLISIONS__ELIST = TYPE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE___PUBLIC_MEMBERSHIPS = TYPE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Feature</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNING_MEMBERSHIP = GENERALIZATION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNED_RELATIONSHIP = GENERALIZATION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNING_RELATIONSHIP = GENERALIZATION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNING_NAMESPACE = GENERALIZATION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__IDENTIFIER = GENERALIZATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__NAME = GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNER = GENERALIZATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNED_ELEMENT = GENERALIZATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__RELATED_ELEMENT = GENERALIZATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__TARGET = GENERALIZATION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__SOURCE = GENERALIZATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNING_RELATED_ELEMENT = GENERALIZATION__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNED_RELATED_ELEMENT = GENERALIZATION__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__GENERAL = GENERALIZATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__SPECIFIC = GENERALIZATION__SPECIFIC;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNING_TYPE = GENERALIZATION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__SUBSETTED_FEATURE = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subsetting Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__SUBSETTING_FEATURE = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING__OWNING_FEATURE = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subsetting</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Subsetting</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUBSETTING_OPERATION_COUNT = GENERALIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_MEMBERSHIP = SUBSETTING__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNED_RELATIONSHIP = SUBSETTING__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_RELATIONSHIP = SUBSETTING__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_NAMESPACE = SUBSETTING__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__IDENTIFIER = SUBSETTING__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__NAME = SUBSETTING__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNER = SUBSETTING__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNED_ELEMENT = SUBSETTING__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__RELATED_ELEMENT = SUBSETTING__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__TARGET = SUBSETTING__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__SOURCE = SUBSETTING__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_RELATED_ELEMENT = SUBSETTING__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNED_RELATED_ELEMENT = SUBSETTING__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__GENERAL = SUBSETTING__GENERAL;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__SPECIFIC = SUBSETTING__SPECIFIC;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_TYPE = SUBSETTING__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Subsetted Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__SUBSETTED_FEATURE = SUBSETTING__SUBSETTED_FEATURE;

	/**
	 * The feature id for the '<em><b>Subsetting Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__SUBSETTING_FEATURE = SUBSETTING__SUBSETTING_FEATURE;

	/**
	 * The feature id for the '<em><b>Owning Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__OWNING_FEATURE = SUBSETTING__OWNING_FEATURE;

	/**
	 * The feature id for the '<em><b>Redefining Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__REDEFINING_FEATURE = SUBSETTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION__REDEFINED_FEATURE = SUBSETTING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Redefinition</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION_FEATURE_COUNT = SUBSETTING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Redefinition</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REDEFINITION_OPERATION_COUNT = SUBSETTING_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__OWNED_RELATIONSHIP = RELATIONSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__OWNING_RELATIONSHIP = RELATIONSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__OWNING_RELATED_ELEMENT = RELATIONSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__OWNED_RELATED_ELEMENT = RELATIONSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__VALUE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature With Value</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__FEATURE_WITH_VALUE = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Value</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Value</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Step</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Step</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNING_MEMBERSHIP = STEP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_RELATIONSHIP = STEP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNING_RELATIONSHIP = STEP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNING_NAMESPACE = STEP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IDENTIFIER = STEP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNER = STEP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_ELEMENT = STEP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MEMBERSHIP = STEP__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_IMPORT_COMP = STEP__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MEMBER = STEP__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_MEMBER = STEP__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IMPORTED_MEMBERSHIP = STEP__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_MEMBERSHIP_COMP = STEP__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_MEMBERSHIP = STEP__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_IMPORT = STEP__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_GENERALIZATION = STEP__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_FEATURE_MEMBERSHIP = STEP__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_FEATURE = STEP__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_END_FEATURE = STEP__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__FEATURE = STEP__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OUTPUT = STEP__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_ABSTRACT = STEP__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__INHERITED_MEMBERSHIP = STEP__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__END_FEATURE = STEP__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_SUFFICIENT = STEP__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__REFERENCED_TYPE = STEP__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNING_TYPE = STEP__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_UNIQUE = STEP__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_ORDERED = STEP__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = STEP__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_TYPE = STEP__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_REDEFINITION = STEP__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_SUBSETTING = STEP__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNING_FEATURE_MEMBERSHIP = STEP__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_COMPOSITE = STEP__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUATION = STEP__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__MULTIPLICITY = STEP__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPING = STEP__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_END = STEP__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__END_OWNING_TYPE = STEP__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_NONUNIQUE = STEP__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___NAME_OF__ELEMENT = STEP___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___EXCLUDE_COLLISIONS__ELIST = STEP___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___PUBLIC_MEMBERSHIPS = STEP___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OWNED_RELATIONSHIP = RELATIONSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OWNING_RELATIONSHIP = RELATIONSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OWNING_RELATED_ELEMENT = RELATIONSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__OWNED_RELATED_ELEMENT = RELATIONSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__LOWER = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__UPPER = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature With Multiplicity</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__FEATURE_WITH_MULTIPLICITY = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiplicity</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Multiplicity</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNING_MEMBERSHIP = GENERALIZATION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNED_RELATIONSHIP = GENERALIZATION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNING_RELATIONSHIP = GENERALIZATION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNING_NAMESPACE = GENERALIZATION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__IDENTIFIER = GENERALIZATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__NAME = GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNER = GENERALIZATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNED_ELEMENT = GENERALIZATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__RELATED_ELEMENT = GENERALIZATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__TARGET = GENERALIZATION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__SOURCE = GENERALIZATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNING_RELATED_ELEMENT = GENERALIZATION__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNED_RELATED_ELEMENT = GENERALIZATION__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__GENERAL = GENERALIZATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__SPECIFIC = GENERALIZATION__SPECIFIC;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__OWNING_TYPE = GENERALIZATION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__TYPE = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Typed Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING__TYPED_FEATURE = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Typing</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Typing</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPING_OPERATION_COUNT = GENERALIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNING_MEMBERSHIP = GENERALIZATION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNED_RELATIONSHIP = GENERALIZATION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNING_RELATIONSHIP = GENERALIZATION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNING_NAMESPACE = GENERALIZATION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__IDENTIFIER = GENERALIZATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__NAME = GENERALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNER = GENERALIZATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNED_ELEMENT = GENERALIZATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__RELATED_ELEMENT = GENERALIZATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__TARGET = GENERALIZATION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__SOURCE = GENERALIZATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNING_RELATED_ELEMENT = GENERALIZATION__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNED_RELATED_ELEMENT = GENERALIZATION__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__GENERAL = GENERALIZATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__SPECIFIC = GENERALIZATION__SPECIFIC;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNING_TYPE = GENERALIZATION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Superclass</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__SUPERCLASS = GENERALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subclass</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__SUBCLASS = GENERALIZATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Classifier</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING__OWNING_CLASSIFIER = GENERALIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Superclassing</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING_FEATURE_COUNT = GENERALIZATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Superclassing</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUPERCLASSING_OPERATION_COUNT = GENERALIZATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Parameter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNED_RELATIONSHIP = RELATIONSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNING_RELATIONSHIP = RELATIONSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNING_RELATED_ELEMENT = RELATIONSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNED_RELATED_ELEMENT = RELATIONSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATED_ELEMENT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotating Comment</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATING_COMMENT = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNING_MEMBERSHIP = RELATIONSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNED_RELATIONSHIP = RELATIONSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNING_RELATIONSHIP = RELATIONSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNING_NAMESPACE = RELATIONSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__IDENTIFIER = RELATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNING_RELATED_ELEMENT = RELATIONSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNED_RELATED_ELEMENT = RELATIONSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Ownership</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ownership</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.impl.DataTypeImpl
	 * <em>Data Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.DataTypeImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 53;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.QueryPathStepExpressionImpl <em>Query
	 * Path Step Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.QueryPathStepExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getQueryPathStepExpression()
	 * @generated
	 */
	int QUERY_PATH_STEP_EXPRESSION = 37;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.QueryQualifierExpressionImpl <em>Query
	 * Qualifier Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.QueryQualifierExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getQueryQualifierExpression()
	 * @generated
	 */
	int QUERY_QUALIFIER_EXPRESSION = 45;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.QueryPathExpressionImpl <em>Query Path
	 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.QueryPathExpressionImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getQueryPathExpression()
	 * @generated
	 */
	int QUERY_PATH_EXPRESSION = 42;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ItemFlowEndImpl <em>Item Flow
	 * End</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ItemFlowEndImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFlowEnd()
	 * @generated
	 */
	int ITEM_FLOW_END = 26;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ItemFlowFeatureImpl <em>Item Flow
	 * Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ItemFlowFeatureImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFlowFeature()
	 * @generated
	 */
	int ITEM_FLOW_FEATURE = 27;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.ItemFeatureImpl <em>Item Feature</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.ItemFeatureImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFeature()
	 * @generated
	 */
	int ITEM_FEATURE = 28;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.SourceEndImpl <em>Source End</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.SourceEndImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSourceEnd()
	 * @generated
	 */
	int SOURCE_END = 57;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.impl.TargetEndImpl <em>Target End</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.impl.TargetEndImpl
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getTargetEnd()
	 * @generated
	 */
	int TARGET_END = 54;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_MEMBERSHIP = FEATURE_MEMBERSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNED_RELATIONSHIP = FEATURE_MEMBERSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_RELATIONSHIP = FEATURE_MEMBERSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_NAMESPACE = FEATURE_MEMBERSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IDENTIFIER = FEATURE_MEMBERSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__NAME = FEATURE_MEMBERSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNER = FEATURE_MEMBERSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNED_ELEMENT = FEATURE_MEMBERSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__RELATED_ELEMENT = FEATURE_MEMBERSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__TARGET = FEATURE_MEMBERSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__SOURCE = FEATURE_MEMBERSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT = FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNED_RELATED_ELEMENT = FEATURE_MEMBERSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__MEMBER_NAME = FEATURE_MEMBERSHIP__MEMBER_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__VISIBILITY = FEATURE_MEMBERSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__ALIASES = FEATURE_MEMBERSHIP__ALIASES;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__MEMBER_ELEMENT = FEATURE_MEMBERSHIP__MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership Owning Package</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT = FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_DERIVED = FEATURE_MEMBERSHIP__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_READ_ONLY = FEATURE_MEMBERSHIP__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Member Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__MEMBER_FEATURE = FEATURE_MEMBERSHIP__MEMBER_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned Member Feature</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE = FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Part</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_PART = FEATURE_MEMBERSHIP__IS_PART;

	/**
	 * The feature id for the '<em><b>Is Portion</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_PORTION = FEATURE_MEMBERSHIP__IS_PORTION;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__IS_PORT = FEATURE_MEMBERSHIP__IS_PORT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__DIRECTION = FEATURE_MEMBERSHIP__DIRECTION;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP__OWNING_TYPE = FEATURE_MEMBERSHIP__OWNING_TYPE;

	/**
	 * The number of structural features of the '<em>End Feature Membership</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP_FEATURE_COUNT = FEATURE_MEMBERSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = FEATURE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP;

	/**
	 * The number of operations of the '<em>End Feature Membership</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_MEMBERSHIP_OPERATION_COUNT = FEATURE_MEMBERSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Item Flow End</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Item Flow End</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_END_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Item Flow Feature</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Item Flow Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Item Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Item Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__ITEM_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Atomic Interaction</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Atomic Interaction</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__RELATED_ELEMENT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNING_RELATED_ELEMENT = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_RELATED_ELEMENT = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Related Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__RELATED_FEATURE = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ASSOCIATION = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNED_ASSOCIATION_TYPE = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_DIRECTED = FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR_END = FEATURE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Connector</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The operation id for the '<em>Path</em>' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR___PATH__FEATURE = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connector</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_MEMBERSHIP = CONNECTOR__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_RELATIONSHIP = CONNECTOR__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_RELATIONSHIP = CONNECTOR__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_NAMESPACE = CONNECTOR__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IDENTIFIER = CONNECTOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNER = CONNECTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_ELEMENT = CONNECTOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__MEMBERSHIP = CONNECTOR__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_IMPORT_COMP = CONNECTOR__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__MEMBER = CONNECTOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_MEMBER = CONNECTOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IMPORTED_MEMBERSHIP = CONNECTOR__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_MEMBERSHIP_COMP = CONNECTOR__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_MEMBERSHIP = CONNECTOR__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_IMPORT = CONNECTOR__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_GENERALIZATION = CONNECTOR__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_FEATURE_MEMBERSHIP = CONNECTOR__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_FEATURE = CONNECTOR__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_END_FEATURE = CONNECTOR__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__FEATURE = CONNECTOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__INPUT = CONNECTOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OUTPUT = CONNECTOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_ABSTRACT = CONNECTOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__INHERITED_MEMBERSHIP = CONNECTOR__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__END_FEATURE = CONNECTOR__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_SUFFICIENT = CONNECTOR__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__REFERENCED_TYPE = CONNECTOR__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_TYPE = CONNECTOR__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_UNIQUE = CONNECTOR__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_ORDERED = CONNECTOR__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__TYPE = CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_TYPE = CONNECTOR__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_REDEFINITION = CONNECTOR__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_SUBSETTING = CONNECTOR__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_FEATURE_MEMBERSHIP = CONNECTOR__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_COMPOSITE = CONNECTOR__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__VALUATION = CONNECTOR__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__MULTIPLICITY = CONNECTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__TYPING = CONNECTOR__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_END = CONNECTOR__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__END_OWNING_TYPE = CONNECTOR__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_NONUNIQUE = CONNECTOR__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__RELATED_ELEMENT = CONNECTOR__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__TARGET = CONNECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNING_RELATED_ELEMENT = CONNECTOR__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_RELATED_ELEMENT = CONNECTOR__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__RELATED_FEATURE = CONNECTOR__RELATED_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ASSOCIATION = CONNECTOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__OWNED_ASSOCIATION_TYPE = CONNECTOR__OWNED_ASSOCIATION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__IS_DIRECTED = CONNECTOR__IS_DIRECTED;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__CONNECTOR_END = CONNECTOR__CONNECTOR_END;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ITEM_TYPE = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Input Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__TARGET_INPUT_FEATURE = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Output Feature</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__SOURCE_OUTPUT_FEATURE = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Flow End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ITEM_FLOW_END = CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item Flow Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ITEM_FLOW_FEATURE = CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Item Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW__ITEM_FEATURE = CONNECTOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Item Flow</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW___NAME_OF__ELEMENT = CONNECTOR___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW___EXCLUDE_COLLISIONS__ELIST = CONNECTOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW___PUBLIC_MEMBERSHIPS = CONNECTOR___PUBLIC_MEMBERSHIPS;

	/**
	 * The operation id for the '<em>Path</em>' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW___PATH__FEATURE = CONNECTOR___PATH__FEATURE;

	/**
	 * The number of operations of the '<em>Item Flow</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITEM_FLOW_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNING_MEMBERSHIP = CLASSIFIER__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RELATIONSHIP = CLASSIFIER__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNING_RELATIONSHIP = CLASSIFIER__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNING_NAMESPACE = CLASSIFIER__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__IDENTIFIER = CLASSIFIER__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER = CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ELEMENT = CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBERSHIP = CLASSIFIER__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_IMPORT_COMP = CLASSIFIER__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBER = CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBER = CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTED_MEMBERSHIP = CLASSIFIER__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBERSHIP_COMP = CLASSIFIER__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBERSHIP = CLASSIFIER__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_IMPORT = CLASSIFIER__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_GENERALIZATION = CLASSIFIER__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_FEATURE_MEMBERSHIP = CLASSIFIER__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_FEATURE = CLASSIFIER__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_END_FEATURE = CLASSIFIER__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATURE = CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__INPUT = CLASSIFIER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OUTPUT = CLASSIFIER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERITED_MEMBERSHIP = CLASSIFIER__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__END_FEATURE = CLASSIFIER__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_SUFFICIENT = CLASSIFIER__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Owned Superclassing</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_SUPERCLASSING = CLASSIFIER__OWNED_SUPERCLASSING;

	/**
	 * The number of structural features of the '<em>Class</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS___NAME_OF__ELEMENT = CLASSIFIER___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS___EXCLUDE_COLLISIONS__ELIST = CLASSIFIER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS___PUBLIC_MEMBERSHIPS = CLASSIFIER___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Class</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNING_MEMBERSHIP = CLASS__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_RELATIONSHIP = CLASS__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNING_RELATIONSHIP = CLASS__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNING_NAMESPACE = CLASS__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IDENTIFIER = CLASS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNER = CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_ELEMENT = CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBERSHIP = CLASS__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_IMPORT_COMP = CLASS__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBER = CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_MEMBER = CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IMPORTED_MEMBERSHIP = CLASS__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_MEMBERSHIP_COMP = CLASS__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_MEMBERSHIP = CLASS__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_IMPORT = CLASS__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_GENERALIZATION = CLASS__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_FEATURE_MEMBERSHIP = CLASS__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_FEATURE = CLASS__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_END_FEATURE = CLASS__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FEATURE = CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INPUT = CLASS__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OUTPUT = CLASS__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_ABSTRACT = CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INHERITED_MEMBERSHIP = CLASS__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__END_FEATURE = CLASS__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_SUFFICIENT = CLASS__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Owned Superclassing</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_SUPERCLASSING = CLASS__OWNED_SUPERCLASSING;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATED_ELEMENT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNING_RELATED_ELEMENT = CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_RELATED_ELEMENT = CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Related Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATED_TYPE = CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owning Connector</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNING_CONNECTOR = CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_END = CLASS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Association</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CLASS_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___NAME_OF__ELEMENT = CLASS___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___EXCLUDE_COLLISIONS__ELIST = CLASS___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___PUBLIC_MEMBERSHIPS = CLASS___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Association</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_MEMBERSHIP = ITEM_FLOW__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_RELATIONSHIP = ITEM_FLOW__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_RELATIONSHIP = ITEM_FLOW__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_NAMESPACE = ITEM_FLOW__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IDENTIFIER = ITEM_FLOW__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__NAME = ITEM_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNER = ITEM_FLOW__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_ELEMENT = ITEM_FLOW__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__MEMBERSHIP = ITEM_FLOW__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_IMPORT_COMP = ITEM_FLOW__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__MEMBER = ITEM_FLOW__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_MEMBER = ITEM_FLOW__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IMPORTED_MEMBERSHIP = ITEM_FLOW__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_MEMBERSHIP_COMP = ITEM_FLOW__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_MEMBERSHIP = ITEM_FLOW__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_IMPORT = ITEM_FLOW__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_GENERALIZATION = ITEM_FLOW__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_FEATURE_MEMBERSHIP = ITEM_FLOW__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_FEATURE = ITEM_FLOW__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_END_FEATURE = ITEM_FLOW__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__FEATURE = ITEM_FLOW__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__INPUT = ITEM_FLOW__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OUTPUT = ITEM_FLOW__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_ABSTRACT = ITEM_FLOW__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__INHERITED_MEMBERSHIP = ITEM_FLOW__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__END_FEATURE = ITEM_FLOW__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_SUFFICIENT = ITEM_FLOW__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__REFERENCED_TYPE = ITEM_FLOW__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_TYPE = ITEM_FLOW__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_UNIQUE = ITEM_FLOW__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_ORDERED = ITEM_FLOW__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__TYPE = ITEM_FLOW__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_TYPE = ITEM_FLOW__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_REDEFINITION = ITEM_FLOW__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_SUBSETTING = ITEM_FLOW__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_FEATURE_MEMBERSHIP = ITEM_FLOW__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_COMPOSITE = ITEM_FLOW__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__VALUATION = ITEM_FLOW__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__MULTIPLICITY = ITEM_FLOW__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__TYPING = ITEM_FLOW__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_END = ITEM_FLOW__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__END_OWNING_TYPE = ITEM_FLOW__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_NONUNIQUE = ITEM_FLOW__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__RELATED_ELEMENT = ITEM_FLOW__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__TARGET = ITEM_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__SOURCE = ITEM_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNING_RELATED_ELEMENT = ITEM_FLOW__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_RELATED_ELEMENT = ITEM_FLOW__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__RELATED_FEATURE = ITEM_FLOW__RELATED_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__ASSOCIATION = ITEM_FLOW__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__OWNED_ASSOCIATION_TYPE = ITEM_FLOW__OWNED_ASSOCIATION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__IS_DIRECTED = ITEM_FLOW__IS_DIRECTED;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__CONNECTOR_END = ITEM_FLOW__CONNECTOR_END;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__ITEM_TYPE = ITEM_FLOW__ITEM_TYPE;

	/**
	 * The feature id for the '<em><b>Target Input Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__TARGET_INPUT_FEATURE = ITEM_FLOW__TARGET_INPUT_FEATURE;

	/**
	 * The feature id for the '<em><b>Source Output Feature</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__SOURCE_OUTPUT_FEATURE = ITEM_FLOW__SOURCE_OUTPUT_FEATURE;

	/**
	 * The feature id for the '<em><b>Item Flow End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__ITEM_FLOW_END = ITEM_FLOW__ITEM_FLOW_END;

	/**
	 * The feature id for the '<em><b>Item Flow Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__ITEM_FLOW_FEATURE = ITEM_FLOW__ITEM_FLOW_FEATURE;

	/**
	 * The feature id for the '<em><b>Item Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW__ITEM_FEATURE = ITEM_FLOW__ITEM_FEATURE;

	/**
	 * The number of structural features of the '<em>Succession Item Flow</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW_FEATURE_COUNT = ITEM_FLOW_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW___NAME_OF__ELEMENT = ITEM_FLOW___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW___EXCLUDE_COLLISIONS__ELIST = ITEM_FLOW___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW___PUBLIC_MEMBERSHIPS = ITEM_FLOW___PUBLIC_MEMBERSHIPS;

	/**
	 * The operation id for the '<em>Path</em>' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW___PATH__FEATURE = ITEM_FLOW___PATH__FEATURE;

	/**
	 * The number of operations of the '<em>Succession Item Flow</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_ITEM_FLOW_OPERATION_COUNT = ITEM_FLOW_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_MEMBERSHIP = CONNECTOR__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_RELATIONSHIP = CONNECTOR__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_RELATIONSHIP = CONNECTOR__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_NAMESPACE = CONNECTOR__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IDENTIFIER = CONNECTOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNER = CONNECTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_ELEMENT = CONNECTOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__MEMBERSHIP = CONNECTOR__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_IMPORT_COMP = CONNECTOR__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__MEMBER = CONNECTOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_MEMBER = CONNECTOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IMPORTED_MEMBERSHIP = CONNECTOR__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_MEMBERSHIP_COMP = CONNECTOR__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_MEMBERSHIP = CONNECTOR__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_IMPORT = CONNECTOR__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_GENERALIZATION = CONNECTOR__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_FEATURE_MEMBERSHIP = CONNECTOR__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_FEATURE = CONNECTOR__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_END_FEATURE = CONNECTOR__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__FEATURE = CONNECTOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__INPUT = CONNECTOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OUTPUT = CONNECTOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_ABSTRACT = CONNECTOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__INHERITED_MEMBERSHIP = CONNECTOR__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__END_FEATURE = CONNECTOR__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_SUFFICIENT = CONNECTOR__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__REFERENCED_TYPE = CONNECTOR__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_TYPE = CONNECTOR__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_UNIQUE = CONNECTOR__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_ORDERED = CONNECTOR__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__TYPE = CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_TYPE = CONNECTOR__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_REDEFINITION = CONNECTOR__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_SUBSETTING = CONNECTOR__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_FEATURE_MEMBERSHIP = CONNECTOR__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_COMPOSITE = CONNECTOR__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__VALUATION = CONNECTOR__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__MULTIPLICITY = CONNECTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__TYPING = CONNECTOR__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_END = CONNECTOR__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__END_OWNING_TYPE = CONNECTOR__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_NONUNIQUE = CONNECTOR__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__RELATED_ELEMENT = CONNECTOR__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__TARGET = CONNECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNING_RELATED_ELEMENT = CONNECTOR__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_RELATED_ELEMENT = CONNECTOR__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__RELATED_FEATURE = CONNECTOR__RELATED_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__ASSOCIATION = CONNECTOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__OWNED_ASSOCIATION_TYPE = CONNECTOR__OWNED_ASSOCIATION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__IS_DIRECTED = CONNECTOR__IS_DIRECTED;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION__CONNECTOR_END = CONNECTOR__CONNECTOR_END;

	/**
	 * The number of structural features of the '<em>Succession</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION___NAME_OF__ELEMENT = CONNECTOR___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION___EXCLUDE_COLLISIONS__ELIST = CONNECTOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION___PUBLIC_MEMBERSHIPS = CONNECTOR___PUBLIC_MEMBERSHIPS;

	/**
	 * The operation id for the '<em>Path</em>' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION___PATH__FEATURE = CONNECTOR___PATH__FEATURE;

	/**
	 * The number of operations of the '<em>Succession</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SUCCESSION_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNING_MEMBERSHIP = ASSOCIATION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_RELATIONSHIP = ASSOCIATION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNING_RELATIONSHIP = ASSOCIATION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNING_NAMESPACE = ASSOCIATION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IDENTIFIER = ASSOCIATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNER = ASSOCIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_ELEMENT = ASSOCIATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MEMBERSHIP = ASSOCIATION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_IMPORT_COMP = ASSOCIATION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MEMBER = ASSOCIATION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_MEMBER = ASSOCIATION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IMPORTED_MEMBERSHIP = ASSOCIATION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_MEMBERSHIP_COMP = ASSOCIATION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_MEMBERSHIP = ASSOCIATION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_IMPORT = ASSOCIATION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_GENERALIZATION = ASSOCIATION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_FEATURE_MEMBERSHIP = ASSOCIATION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_FEATURE = ASSOCIATION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_END_FEATURE = ASSOCIATION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FEATURE = ASSOCIATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INPUT = ASSOCIATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OUTPUT = ASSOCIATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_ABSTRACT = ASSOCIATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INHERITED_MEMBERSHIP = ASSOCIATION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__END_FEATURE = ASSOCIATION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_SUFFICIENT = ASSOCIATION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Owned Superclassing</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_SUPERCLASSING = ASSOCIATION__OWNED_SUPERCLASSING;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__RELATED_ELEMENT = ASSOCIATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TARGET = ASSOCIATION__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SOURCE = ASSOCIATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNING_RELATED_ELEMENT = ASSOCIATION__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_RELATED_ELEMENT = ASSOCIATION__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__RELATED_TYPE = ASSOCIATION__RELATED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Connector</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNING_CONNECTOR = ASSOCIATION__OWNING_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ASSOCIATION_END = ASSOCIATION__ASSOCIATION_END;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__STEP = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PARAMETER = ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION___NAME_OF__ELEMENT = ASSOCIATION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION___EXCLUDE_COLLISIONS__ELIST = ASSOCIATION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION___PUBLIC_MEMBERSHIPS = ASSOCIATION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Interaction</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_RELATIONSHIP = EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNING_RELATIONSHIP = EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_IMPORT_COMP = EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_MEMBERSHIP_COMP = EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_END_FEATURE = EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__INHERITED_MEMBERSHIP = EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__END_FEATURE = EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IS_SUFFICIENT = EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__REFERENCED_TYPE = EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNING_TYPE = EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IS_UNIQUE = EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IS_ORDERED = EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_TYPE = EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_REDEFINITION = EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNED_SUBSETTING = EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IS_COMPOSITE = EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__VALUATION = EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__MULTIPLICITY = EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__TYPING = EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IS_END = EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__END_OWNING_TYPE = EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION__IS_NONUNIQUE = EXPRESSION__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Invocation Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION___PUBLIC_MEMBERSHIPS = EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Invocation Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INVOCATION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNING_MEMBERSHIP = INVOCATION_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_RELATIONSHIP = INVOCATION_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNING_RELATIONSHIP = INVOCATION_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNING_NAMESPACE = INVOCATION_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IDENTIFIER = INVOCATION_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__NAME = INVOCATION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNER = INVOCATION_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_ELEMENT = INVOCATION_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__MEMBERSHIP = INVOCATION_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_IMPORT_COMP = INVOCATION_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__MEMBER = INVOCATION_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_MEMBER = INVOCATION_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IMPORTED_MEMBERSHIP = INVOCATION_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_MEMBERSHIP_COMP = INVOCATION_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_MEMBERSHIP = INVOCATION_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_IMPORT = INVOCATION_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_GENERALIZATION = INVOCATION_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = INVOCATION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_FEATURE = INVOCATION_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_END_FEATURE = INVOCATION_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__FEATURE = INVOCATION_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__INPUT = INVOCATION_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OUTPUT = INVOCATION_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_ABSTRACT = INVOCATION_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__INHERITED_MEMBERSHIP = INVOCATION_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__END_FEATURE = INVOCATION_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_SUFFICIENT = INVOCATION_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__REFERENCED_TYPE = INVOCATION_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNING_TYPE = INVOCATION_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_UNIQUE = INVOCATION_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_ORDERED = INVOCATION_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__TYPE = INVOCATION_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_TYPE = INVOCATION_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_REDEFINITION = INVOCATION_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNED_SUBSETTING = INVOCATION_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = INVOCATION_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_COMPOSITE = INVOCATION_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__VALUATION = INVOCATION_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__MULTIPLICITY = INVOCATION_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__TYPING = INVOCATION_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_END = INVOCATION_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__END_OWNING_TYPE = INVOCATION_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__IS_NONUNIQUE = INVOCATION_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OPERATOR = INVOCATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION__OPERAND = INVOCATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION_FEATURE_COUNT = INVOCATION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION___NAME_OF__ELEMENT = INVOCATION_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = INVOCATION_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION___PUBLIC_MEMBERSHIPS = INVOCATION_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Operator Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OPERATOR_EXPRESSION_OPERATION_COUNT = INVOCATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNING_MEMBERSHIP = OPERATOR_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_RELATIONSHIP = OPERATOR_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNING_RELATIONSHIP = OPERATOR_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNING_NAMESPACE = OPERATOR_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IDENTIFIER = OPERATOR_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__NAME = OPERATOR_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNER = OPERATOR_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_ELEMENT = OPERATOR_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__MEMBERSHIP = OPERATOR_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_IMPORT_COMP = OPERATOR_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__MEMBER = OPERATOR_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_MEMBER = OPERATOR_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IMPORTED_MEMBERSHIP = OPERATOR_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_MEMBERSHIP_COMP = OPERATOR_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_MEMBERSHIP = OPERATOR_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_IMPORT = OPERATOR_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_GENERALIZATION = OPERATOR_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = OPERATOR_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_FEATURE = OPERATOR_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_END_FEATURE = OPERATOR_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__FEATURE = OPERATOR_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__INPUT = OPERATOR_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OUTPUT = OPERATOR_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IS_ABSTRACT = OPERATOR_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__INHERITED_MEMBERSHIP = OPERATOR_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__END_FEATURE = OPERATOR_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IS_SUFFICIENT = OPERATOR_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__REFERENCED_TYPE = OPERATOR_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNING_TYPE = OPERATOR_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IS_UNIQUE = OPERATOR_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IS_ORDERED = OPERATOR_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__TYPE = OPERATOR_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_TYPE = OPERATOR_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_REDEFINITION = OPERATOR_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNED_SUBSETTING = OPERATOR_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = OPERATOR_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IS_COMPOSITE = OPERATOR_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__VALUATION = OPERATOR_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__MULTIPLICITY = OPERATOR_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__TYPING = OPERATOR_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IS_END = OPERATOR_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__END_OWNING_TYPE = OPERATOR_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__IS_NONUNIQUE = OPERATOR_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OPERATOR = OPERATOR_EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION__OPERAND = OPERATOR_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Query Path Step
	 * Expression</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION_FEATURE_COUNT = OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION___NAME_OF__ELEMENT = OPERATOR_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = OPERATOR_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION___PUBLIC_MEMBERSHIPS = OPERATOR_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Query Path Step Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_STEP_EXPRESSION_OPERATION_COUNT = OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_RELATIONSHIP = EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNING_RELATIONSHIP = EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_IMPORT_COMP = EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_MEMBERSHIP_COMP = EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_END_FEATURE = EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__INHERITED_MEMBERSHIP = EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__END_FEATURE = EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IS_SUFFICIENT = EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__REFERENCED_TYPE = EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNING_TYPE = EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IS_UNIQUE = EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IS_ORDERED = EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_TYPE = EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_REDEFINITION = EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNED_SUBSETTING = EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IS_COMPOSITE = EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__VALUATION = EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__MULTIPLICITY = EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__TYPING = EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IS_END = EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__END_OWNING_TYPE = EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__IS_NONUNIQUE = EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Construction
	 * Expression</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION___PUBLIC_MEMBERSHIPS = EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Sequence Construction Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_CONSTRUCTION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNING_MEMBERSHIP = INVOCATION_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_RELATIONSHIP = INVOCATION_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNING_RELATIONSHIP = INVOCATION_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNING_NAMESPACE = INVOCATION_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IDENTIFIER = INVOCATION_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__NAME = INVOCATION_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNER = INVOCATION_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_ELEMENT = INVOCATION_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__MEMBERSHIP = INVOCATION_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_IMPORT_COMP = INVOCATION_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__MEMBER = INVOCATION_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_MEMBER = INVOCATION_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IMPORTED_MEMBERSHIP = INVOCATION_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_MEMBERSHIP_COMP = INVOCATION_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_MEMBERSHIP = INVOCATION_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_IMPORT = INVOCATION_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_GENERALIZATION = INVOCATION_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = INVOCATION_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_FEATURE = INVOCATION_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_END_FEATURE = INVOCATION_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__FEATURE = INVOCATION_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__INPUT = INVOCATION_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OUTPUT = INVOCATION_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IS_ABSTRACT = INVOCATION_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__INHERITED_MEMBERSHIP = INVOCATION_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__END_FEATURE = INVOCATION_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IS_SUFFICIENT = INVOCATION_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__REFERENCED_TYPE = INVOCATION_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNING_TYPE = INVOCATION_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IS_UNIQUE = INVOCATION_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IS_ORDERED = INVOCATION_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__TYPE = INVOCATION_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_TYPE = INVOCATION_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_REDEFINITION = INVOCATION_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNED_SUBSETTING = INVOCATION_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = INVOCATION_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IS_COMPOSITE = INVOCATION_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__VALUATION = INVOCATION_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__MULTIPLICITY = INVOCATION_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__TYPING = INVOCATION_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IS_END = INVOCATION_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__END_OWNING_TYPE = INVOCATION_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__IS_NONUNIQUE = INVOCATION_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Instantiated Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE = INVOCATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Creation
	 * Expression</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION_FEATURE_COUNT = INVOCATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION___NAME_OF__ELEMENT = INVOCATION_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = INVOCATION_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION___PUBLIC_MEMBERSHIPS = INVOCATION_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Instance Creation Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CREATION_EXPRESSION_OPERATION_COUNT = INVOCATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_RELATIONSHIP = EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNING_RELATIONSHIP = EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_IMPORT_COMP = EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_MEMBERSHIP_COMP = EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_END_FEATURE = EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__INHERITED_MEMBERSHIP = EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__END_FEATURE = EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IS_SUFFICIENT = EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__REFERENCED_TYPE = EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNING_TYPE = EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IS_UNIQUE = EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IS_ORDERED = EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_TYPE = EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_REDEFINITION = EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNED_SUBSETTING = EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IS_COMPOSITE = EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__VALUATION = EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__MULTIPLICITY = EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__TYPING = EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IS_END = EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__END_OWNING_TYPE = EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__IS_NONUNIQUE = EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION__REFERENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Reference
	 * Expression</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION___PUBLIC_MEMBERSHIPS = EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Feature Reference Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FEATURE_REFERENCE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNING_MEMBERSHIP = FEATURE_REFERENCE_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_RELATIONSHIP = FEATURE_REFERENCE_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNING_RELATIONSHIP = FEATURE_REFERENCE_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNING_NAMESPACE = FEATURE_REFERENCE_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IDENTIFIER = FEATURE_REFERENCE_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__NAME = FEATURE_REFERENCE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNER = FEATURE_REFERENCE_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_ELEMENT = FEATURE_REFERENCE_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__MEMBERSHIP = FEATURE_REFERENCE_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_IMPORT_COMP = FEATURE_REFERENCE_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__MEMBER = FEATURE_REFERENCE_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_MEMBER = FEATURE_REFERENCE_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IMPORTED_MEMBERSHIP = FEATURE_REFERENCE_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_MEMBERSHIP_COMP = FEATURE_REFERENCE_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_MEMBERSHIP = FEATURE_REFERENCE_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_IMPORT = FEATURE_REFERENCE_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_GENERALIZATION = FEATURE_REFERENCE_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = FEATURE_REFERENCE_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_FEATURE = FEATURE_REFERENCE_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_END_FEATURE = FEATURE_REFERENCE_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__FEATURE = FEATURE_REFERENCE_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__INPUT = FEATURE_REFERENCE_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OUTPUT = FEATURE_REFERENCE_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IS_ABSTRACT = FEATURE_REFERENCE_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__INHERITED_MEMBERSHIP = FEATURE_REFERENCE_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__END_FEATURE = FEATURE_REFERENCE_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IS_SUFFICIENT = FEATURE_REFERENCE_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__REFERENCED_TYPE = FEATURE_REFERENCE_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNING_TYPE = FEATURE_REFERENCE_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IS_UNIQUE = FEATURE_REFERENCE_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IS_ORDERED = FEATURE_REFERENCE_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__TYPE = FEATURE_REFERENCE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_TYPE = FEATURE_REFERENCE_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_REDEFINITION = FEATURE_REFERENCE_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNED_SUBSETTING = FEATURE_REFERENCE_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = FEATURE_REFERENCE_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IS_COMPOSITE = FEATURE_REFERENCE_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__VALUATION = FEATURE_REFERENCE_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__MULTIPLICITY = FEATURE_REFERENCE_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__TYPING = FEATURE_REFERENCE_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IS_END = FEATURE_REFERENCE_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__END_OWNING_TYPE = FEATURE_REFERENCE_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__IS_NONUNIQUE = FEATURE_REFERENCE_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Referent</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION__REFERENT = FEATURE_REFERENCE_EXPRESSION__REFERENT;

	/**
	 * The number of structural features of the '<em>Query Path Expression</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION_FEATURE_COUNT = FEATURE_REFERENCE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION___NAME_OF__ELEMENT = FEATURE_REFERENCE_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = FEATURE_REFERENCE_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION___PUBLIC_MEMBERSHIPS = FEATURE_REFERENCE_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Query Path Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_PATH_EXPRESSION_OPERATION_COUNT = FEATURE_REFERENCE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_RELATIONSHIP = EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNING_RELATIONSHIP = EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_IMPORT_COMP = EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_MEMBERSHIP_COMP = EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_END_FEATURE = EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__INHERITED_MEMBERSHIP = EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__END_FEATURE = EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IS_SUFFICIENT = EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__REFERENCED_TYPE = EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNING_TYPE = EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IS_UNIQUE = EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IS_ORDERED = EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_TYPE = EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_REDEFINITION = EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNED_SUBSETTING = EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IS_COMPOSITE = EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__VALUATION = EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__MULTIPLICITY = EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__TYPING = EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IS_END = EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__END_OWNING_TYPE = EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__IS_NONUNIQUE = EXPRESSION__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Block Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION___PUBLIC_MEMBERSHIPS = EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Block Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNING_MEMBERSHIP = OPERATOR_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_RELATIONSHIP = OPERATOR_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNING_RELATIONSHIP = OPERATOR_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNING_NAMESPACE = OPERATOR_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IDENTIFIER = OPERATOR_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__NAME = OPERATOR_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNER = OPERATOR_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_ELEMENT = OPERATOR_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__MEMBERSHIP = OPERATOR_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_IMPORT_COMP = OPERATOR_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__MEMBER = OPERATOR_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_MEMBER = OPERATOR_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IMPORTED_MEMBERSHIP = OPERATOR_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_MEMBERSHIP_COMP = OPERATOR_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_MEMBERSHIP = OPERATOR_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_IMPORT = OPERATOR_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_GENERALIZATION = OPERATOR_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = OPERATOR_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_FEATURE = OPERATOR_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_END_FEATURE = OPERATOR_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__FEATURE = OPERATOR_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__INPUT = OPERATOR_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OUTPUT = OPERATOR_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IS_ABSTRACT = OPERATOR_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__INHERITED_MEMBERSHIP = OPERATOR_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__END_FEATURE = OPERATOR_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IS_SUFFICIENT = OPERATOR_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__REFERENCED_TYPE = OPERATOR_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNING_TYPE = OPERATOR_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IS_UNIQUE = OPERATOR_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IS_ORDERED = OPERATOR_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__TYPE = OPERATOR_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_TYPE = OPERATOR_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_REDEFINITION = OPERATOR_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNED_SUBSETTING = OPERATOR_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = OPERATOR_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IS_COMPOSITE = OPERATOR_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__VALUATION = OPERATOR_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__MULTIPLICITY = OPERATOR_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__TYPING = OPERATOR_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IS_END = OPERATOR_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__END_OWNING_TYPE = OPERATOR_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__IS_NONUNIQUE = OPERATOR_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OPERATOR = OPERATOR_EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION__OPERAND = OPERATOR_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Query Qualifier
	 * Expression</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION_FEATURE_COUNT = OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION___NAME_OF__ELEMENT = OPERATOR_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = OPERATOR_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION___PUBLIC_MEMBERSHIPS = OPERATOR_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Query Qualifier Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUERY_QUALIFIER_EXPRESSION_OPERATION_COUNT = OPERATOR_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_RELATIONSHIP = EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNING_RELATIONSHIP = EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_IMPORT_COMP = EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_MEMBERSHIP_COMP = EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_END_FEATURE = EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__INHERITED_MEMBERSHIP = EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__END_FEATURE = EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IS_SUFFICIENT = EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__REFERENCED_TYPE = EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNING_TYPE = EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IS_UNIQUE = EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IS_ORDERED = EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_TYPE = EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_REDEFINITION = EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNED_SUBSETTING = EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IS_COMPOSITE = EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__VALUATION = EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__MULTIPLICITY = EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__TYPING = EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IS_END = EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__END_OWNING_TYPE = EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__IS_NONUNIQUE = EXPRESSION__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION___PUBLIC_MEMBERSHIPS = EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Literal Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_RELATIONSHIP = LITERAL_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNING_RELATIONSHIP = LITERAL_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_IMPORT_COMP = LITERAL_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_MEMBERSHIP_COMP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_END_FEATURE = LITERAL_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__INHERITED_MEMBERSHIP = LITERAL_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__END_FEATURE = LITERAL_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IS_SUFFICIENT = LITERAL_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__REFERENCED_TYPE = LITERAL_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNING_TYPE = LITERAL_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IS_UNIQUE = LITERAL_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IS_ORDERED = LITERAL_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__TYPE = LITERAL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_TYPE = LITERAL_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_REDEFINITION = LITERAL_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_SUBSETTING = LITERAL_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNING_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IS_COMPOSITE = LITERAL_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__VALUATION = LITERAL_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__MULTIPLICITY = LITERAL_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__TYPING = LITERAL_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IS_END = LITERAL_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__END_OWNING_TYPE = LITERAL_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__IS_NONUNIQUE = LITERAL_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Real</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___PUBLIC_MEMBERSHIPS = LITERAL_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Literal Real</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNING_MEMBERSHIP = EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_RELATIONSHIP = EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNING_RELATIONSHIP = EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNING_NAMESPACE = EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IDENTIFIER = EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__MEMBERSHIP = EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_IMPORT_COMP = EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__MEMBER = EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_MEMBER = EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IMPORTED_MEMBERSHIP = EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_MEMBERSHIP_COMP = EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_MEMBERSHIP = EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_IMPORT = EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_GENERALIZATION = EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP = EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_FEATURE = EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_END_FEATURE = EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__INPUT = EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OUTPUT = EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IS_ABSTRACT = EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__INHERITED_MEMBERSHIP = EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__END_FEATURE = EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IS_SUFFICIENT = EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__REFERENCED_TYPE = EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNING_TYPE = EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IS_UNIQUE = EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IS_ORDERED = EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_TYPE = EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_REDEFINITION = EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNED_SUBSETTING = EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__OWNING_FEATURE_MEMBERSHIP = EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IS_COMPOSITE = EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__VALUATION = EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__MULTIPLICITY = EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__TYPING = EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IS_END = EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__END_OWNING_TYPE = EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__IS_NONUNIQUE = EXPRESSION__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Null Expression</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION___NAME_OF__ELEMENT = EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST = EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION___PUBLIC_MEMBERSHIPS = EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Null Expression</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_RELATIONSHIP = LITERAL_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNING_RELATIONSHIP = LITERAL_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_IMPORT_COMP = LITERAL_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_MEMBERSHIP_COMP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_END_FEATURE = LITERAL_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__INHERITED_MEMBERSHIP = LITERAL_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__END_FEATURE = LITERAL_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IS_SUFFICIENT = LITERAL_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__REFERENCED_TYPE = LITERAL_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNING_TYPE = LITERAL_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IS_UNIQUE = LITERAL_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IS_ORDERED = LITERAL_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__TYPE = LITERAL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_TYPE = LITERAL_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_REDEFINITION = LITERAL_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_SUBSETTING = LITERAL_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNING_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IS_COMPOSITE = LITERAL_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUATION = LITERAL_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__MULTIPLICITY = LITERAL_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__TYPING = LITERAL_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IS_END = LITERAL_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__END_OWNING_TYPE = LITERAL_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__IS_NONUNIQUE = LITERAL_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___PUBLIC_MEMBERSHIPS = LITERAL_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Literal String</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_RELATIONSHIP = LITERAL_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNING_RELATIONSHIP = LITERAL_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_IMPORT_COMP = LITERAL_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_MEMBERSHIP_COMP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_END_FEATURE = LITERAL_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__INHERITED_MEMBERSHIP = LITERAL_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__END_FEATURE = LITERAL_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IS_SUFFICIENT = LITERAL_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__REFERENCED_TYPE = LITERAL_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNING_TYPE = LITERAL_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IS_UNIQUE = LITERAL_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IS_ORDERED = LITERAL_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__TYPE = LITERAL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_TYPE = LITERAL_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_REDEFINITION = LITERAL_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_SUBSETTING = LITERAL_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNING_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IS_COMPOSITE = LITERAL_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUATION = LITERAL_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__MULTIPLICITY = LITERAL_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__TYPING = LITERAL_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IS_END = LITERAL_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__END_OWNING_TYPE = LITERAL_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__IS_NONUNIQUE = LITERAL_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___PUBLIC_MEMBERSHIPS = LITERAL_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Literal Integer</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_RELATIONSHIP = LITERAL_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNING_RELATIONSHIP = LITERAL_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_IMPORT_COMP = LITERAL_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_MEMBERSHIP_COMP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_END_FEATURE = LITERAL_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__INHERITED_MEMBERSHIP = LITERAL_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__END_FEATURE = LITERAL_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IS_SUFFICIENT = LITERAL_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__REFERENCED_TYPE = LITERAL_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNING_TYPE = LITERAL_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IS_UNIQUE = LITERAL_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IS_ORDERED = LITERAL_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__TYPE = LITERAL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_TYPE = LITERAL_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_REDEFINITION = LITERAL_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNED_SUBSETTING = LITERAL_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__OWNING_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IS_COMPOSITE = LITERAL_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__VALUATION = LITERAL_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__MULTIPLICITY = LITERAL_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__TYPING = LITERAL_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IS_END = LITERAL_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__END_OWNING_TYPE = LITERAL_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED__IS_NONUNIQUE = LITERAL_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Literal Unbounded</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED___PUBLIC_MEMBERSHIPS = LITERAL_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Literal Unbounded</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNBOUNDED_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNING_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_RELATIONSHIP = LITERAL_EXPRESSION__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNING_RELATIONSHIP = LITERAL_EXPRESSION__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNING_NAMESPACE = LITERAL_EXPRESSION__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IDENTIFIER = LITERAL_EXPRESSION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__NAME = LITERAL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNER = LITERAL_EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_ELEMENT = LITERAL_EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__MEMBERSHIP = LITERAL_EXPRESSION__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_IMPORT_COMP = LITERAL_EXPRESSION__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__MEMBER = LITERAL_EXPRESSION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_MEMBER = LITERAL_EXPRESSION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IMPORTED_MEMBERSHIP = LITERAL_EXPRESSION__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_MEMBERSHIP_COMP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_IMPORT = LITERAL_EXPRESSION__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_GENERALIZATION = LITERAL_EXPRESSION__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_FEATURE = LITERAL_EXPRESSION__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_END_FEATURE = LITERAL_EXPRESSION__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__FEATURE = LITERAL_EXPRESSION__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__INPUT = LITERAL_EXPRESSION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OUTPUT = LITERAL_EXPRESSION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IS_ABSTRACT = LITERAL_EXPRESSION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__INHERITED_MEMBERSHIP = LITERAL_EXPRESSION__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__END_FEATURE = LITERAL_EXPRESSION__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IS_SUFFICIENT = LITERAL_EXPRESSION__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__REFERENCED_TYPE = LITERAL_EXPRESSION__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNING_TYPE = LITERAL_EXPRESSION__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IS_UNIQUE = LITERAL_EXPRESSION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IS_ORDERED = LITERAL_EXPRESSION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__TYPE = LITERAL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_TYPE = LITERAL_EXPRESSION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_REDEFINITION = LITERAL_EXPRESSION__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_SUBSETTING = LITERAL_EXPRESSION__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNING_FEATURE_MEMBERSHIP = LITERAL_EXPRESSION__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IS_COMPOSITE = LITERAL_EXPRESSION__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUATION = LITERAL_EXPRESSION__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__MULTIPLICITY = LITERAL_EXPRESSION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__TYPING = LITERAL_EXPRESSION__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IS_END = LITERAL_EXPRESSION__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__END_OWNING_TYPE = LITERAL_EXPRESSION__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__IS_NONUNIQUE = LITERAL_EXPRESSION__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___NAME_OF__ELEMENT = LITERAL_EXPRESSION___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___EXCLUDE_COLLISIONS__ELIST = LITERAL_EXPRESSION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___PUBLIC_MEMBERSHIPS = LITERAL_EXPRESSION___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Literal Boolean</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_OPERATION_COUNT = LITERAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNING_MEMBERSHIP = CLASSIFIER__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_RELATIONSHIP = CLASSIFIER__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNING_RELATIONSHIP = CLASSIFIER__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNING_NAMESPACE = CLASSIFIER__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IDENTIFIER = CLASSIFIER__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNER = CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_ELEMENT = CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MEMBERSHIP = CLASSIFIER__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_IMPORT_COMP = CLASSIFIER__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MEMBER = CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_MEMBER = CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IMPORTED_MEMBERSHIP = CLASSIFIER__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_MEMBERSHIP_COMP = CLASSIFIER__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_MEMBERSHIP = CLASSIFIER__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_IMPORT = CLASSIFIER__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_GENERALIZATION = CLASSIFIER__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_FEATURE_MEMBERSHIP = CLASSIFIER__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_FEATURE = CLASSIFIER__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_END_FEATURE = CLASSIFIER__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FEATURE = CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INPUT = CLASSIFIER__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OUTPUT = CLASSIFIER__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INHERITED_MEMBERSHIP = CLASSIFIER__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__END_FEATURE = CLASSIFIER__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_SUFFICIENT = CLASSIFIER__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Owned Superclassing</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNED_SUPERCLASSING = CLASSIFIER__OWNED_SUPERCLASSING;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___NAME_OF__ELEMENT = CLASSIFIER___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___EXCLUDE_COLLISIONS__ELIST = CLASSIFIER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___PUBLIC_MEMBERSHIPS = CLASSIFIER___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Data Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Target End</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Target End</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TARGET_END_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNING_MEMBERSHIP = FEATURE_MEMBERSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNED_RELATIONSHIP = FEATURE_MEMBERSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNING_RELATIONSHIP = FEATURE_MEMBERSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNING_NAMESPACE = FEATURE_MEMBERSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__IDENTIFIER = FEATURE_MEMBERSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__NAME = FEATURE_MEMBERSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNER = FEATURE_MEMBERSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNED_ELEMENT = FEATURE_MEMBERSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__RELATED_ELEMENT = FEATURE_MEMBERSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__TARGET = FEATURE_MEMBERSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__SOURCE = FEATURE_MEMBERSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNING_RELATED_ELEMENT = FEATURE_MEMBERSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNED_RELATED_ELEMENT = FEATURE_MEMBERSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__MEMBER_NAME = FEATURE_MEMBERSHIP__MEMBER_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__VISIBILITY = FEATURE_MEMBERSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__ALIASES = FEATURE_MEMBERSHIP__ALIASES;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__MEMBER_ELEMENT = FEATURE_MEMBERSHIP__MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership Owning Package</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNED_MEMBER_ELEMENT = FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__IS_DERIVED = FEATURE_MEMBERSHIP__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__IS_READ_ONLY = FEATURE_MEMBERSHIP__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Member Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__MEMBER_FEATURE = FEATURE_MEMBERSHIP__MEMBER_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned Member Feature</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNED_MEMBER_FEATURE = FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Part</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__IS_PART = FEATURE_MEMBERSHIP__IS_PART;

	/**
	 * The feature id for the '<em><b>Is Portion</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__IS_PORTION = FEATURE_MEMBERSHIP__IS_PORTION;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__IS_PORT = FEATURE_MEMBERSHIP__IS_PORT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__DIRECTION = FEATURE_MEMBERSHIP__DIRECTION;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNING_TYPE = FEATURE_MEMBERSHIP__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Member Parameter</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__MEMBER_PARAMETER = FEATURE_MEMBERSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Member Parameter</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER = FEATURE_MEMBERSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Membership</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP_FEATURE_COUNT = FEATURE_MEMBERSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = FEATURE_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP;

	/**
	 * The number of operations of the '<em>Parameter Membership</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MEMBERSHIP_OPERATION_COUNT = FEATURE_MEMBERSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNING_MEMBERSHIP = PARAMETER_MEMBERSHIP__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNED_RELATIONSHIP = PARAMETER_MEMBERSHIP__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNING_RELATIONSHIP = PARAMETER_MEMBERSHIP__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNING_NAMESPACE = PARAMETER_MEMBERSHIP__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__IDENTIFIER = PARAMETER_MEMBERSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__NAME = PARAMETER_MEMBERSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNER = PARAMETER_MEMBERSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNED_ELEMENT = PARAMETER_MEMBERSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__RELATED_ELEMENT = PARAMETER_MEMBERSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__TARGET = PARAMETER_MEMBERSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__SOURCE = PARAMETER_MEMBERSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNING_RELATED_ELEMENT = PARAMETER_MEMBERSHIP__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNED_RELATED_ELEMENT = PARAMETER_MEMBERSHIP__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__MEMBER_NAME = PARAMETER_MEMBERSHIP__MEMBER_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__VISIBILITY = PARAMETER_MEMBERSHIP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__ALIASES = PARAMETER_MEMBERSHIP__ALIASES;

	/**
	 * The feature id for the '<em><b>Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__MEMBER_ELEMENT = PARAMETER_MEMBERSHIP__MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership Owning Package</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = PARAMETER_MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Member Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNED_MEMBER_ELEMENT = PARAMETER_MEMBERSHIP__OWNED_MEMBER_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__IS_DERIVED = PARAMETER_MEMBERSHIP__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__IS_READ_ONLY = PARAMETER_MEMBERSHIP__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Member Feature</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__MEMBER_FEATURE = PARAMETER_MEMBERSHIP__MEMBER_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned Member Feature</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNED_MEMBER_FEATURE = PARAMETER_MEMBERSHIP__OWNED_MEMBER_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Part</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__IS_PART = PARAMETER_MEMBERSHIP__IS_PART;

	/**
	 * The feature id for the '<em><b>Is Portion</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__IS_PORTION = PARAMETER_MEMBERSHIP__IS_PORTION;

	/**
	 * The feature id for the '<em><b>Is Port</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__IS_PORT = PARAMETER_MEMBERSHIP__IS_PORT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__DIRECTION = PARAMETER_MEMBERSHIP__DIRECTION;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNING_TYPE = PARAMETER_MEMBERSHIP__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Member Parameter</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__MEMBER_PARAMETER = PARAMETER_MEMBERSHIP__MEMBER_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Member Parameter</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER = PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER;

	/**
	 * The number of structural features of the '<em>Return Parameter
	 * Membership</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP_FEATURE_COUNT = PARAMETER_MEMBERSHIP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = PARAMETER_MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP;

	/**
	 * The number of operations of the '<em>Return Parameter Membership</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RETURN_PARAMETER_MEMBERSHIP_OPERATION_COUNT = PARAMETER_MEMBERSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Source End</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Source End</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SOURCE_END_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_MEMBERSHIP = FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_RELATIONSHIP = FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_RELATIONSHIP = FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_NAMESPACE = FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IDENTIFIER = FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__MEMBERSHIP = FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_IMPORT_COMP = FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__MEMBER = FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_MEMBER = FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IMPORTED_MEMBERSHIP = FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_MEMBERSHIP_COMP = FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_MEMBERSHIP = FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_IMPORT = FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_GENERALIZATION = FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_FEATURE_MEMBERSHIP = FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_FEATURE = FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_END_FEATURE = FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__FEATURE = FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__INPUT = FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OUTPUT = FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_ABSTRACT = FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__INHERITED_MEMBERSHIP = FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__END_FEATURE = FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_SUFFICIENT = FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__REFERENCED_TYPE = FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_TYPE = FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_UNIQUE = FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_ORDERED = FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__TYPE = FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_TYPE = FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_REDEFINITION = FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNED_SUBSETTING = FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__OWNING_FEATURE_MEMBERSHIP = FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_COMPOSITE = FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__VALUATION = FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__MULTIPLICITY = FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__TYPING = FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_END = FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__END_OWNING_TYPE = FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE__IS_NONUNIQUE = FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Structured Feature</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE___NAME_OF__ELEMENT = FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE___EXCLUDE_COLLISIONS__ELIST = FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE___PUBLIC_MEMBERSHIPS = FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Structured Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_MEMBERSHIP = STRUCTURED_FEATURE__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_RELATIONSHIP = STRUCTURED_FEATURE__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_RELATIONSHIP = STRUCTURED_FEATURE__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_NAMESPACE = STRUCTURED_FEATURE__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IDENTIFIER = STRUCTURED_FEATURE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__NAME = STRUCTURED_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNER = STRUCTURED_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_ELEMENT = STRUCTURED_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__MEMBERSHIP = STRUCTURED_FEATURE__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_IMPORT_COMP = STRUCTURED_FEATURE__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__MEMBER = STRUCTURED_FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_MEMBER = STRUCTURED_FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IMPORTED_MEMBERSHIP = STRUCTURED_FEATURE__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_MEMBERSHIP_COMP = STRUCTURED_FEATURE__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_MEMBERSHIP = STRUCTURED_FEATURE__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_IMPORT = STRUCTURED_FEATURE__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_GENERALIZATION = STRUCTURED_FEATURE__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_FEATURE_MEMBERSHIP = STRUCTURED_FEATURE__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_FEATURE = STRUCTURED_FEATURE__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_END_FEATURE = STRUCTURED_FEATURE__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__FEATURE = STRUCTURED_FEATURE__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__INPUT = STRUCTURED_FEATURE__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OUTPUT = STRUCTURED_FEATURE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_ABSTRACT = STRUCTURED_FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__INHERITED_MEMBERSHIP = STRUCTURED_FEATURE__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__END_FEATURE = STRUCTURED_FEATURE__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_SUFFICIENT = STRUCTURED_FEATURE__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__REFERENCED_TYPE = STRUCTURED_FEATURE__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_TYPE = STRUCTURED_FEATURE__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_UNIQUE = STRUCTURED_FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_ORDERED = STRUCTURED_FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__TYPE = STRUCTURED_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_TYPE = STRUCTURED_FEATURE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_REDEFINITION = STRUCTURED_FEATURE__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNED_SUBSETTING = STRUCTURED_FEATURE__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__OWNING_FEATURE_MEMBERSHIP = STRUCTURED_FEATURE__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_COMPOSITE = STRUCTURED_FEATURE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__VALUATION = STRUCTURED_FEATURE__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__MULTIPLICITY = STRUCTURED_FEATURE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__TYPING = STRUCTURED_FEATURE__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_END = STRUCTURED_FEATURE__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__END_OWNING_TYPE = STRUCTURED_FEATURE__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE__IS_NONUNIQUE = STRUCTURED_FEATURE__IS_NONUNIQUE;

	/**
	 * The number of structural features of the '<em>Ordered Feature</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE_FEATURE_COUNT = STRUCTURED_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE___NAME_OF__ELEMENT = STRUCTURED_FEATURE___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE___EXCLUDE_COLLISIONS__ELIST = STRUCTURED_FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE___PUBLIC_MEMBERSHIPS = STRUCTURED_FEATURE___PUBLIC_MEMBERSHIPS;

	/**
	 * The number of operations of the '<em>Ordered Feature</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ORDERED_FEATURE_OPERATION_COUNT = STRUCTURED_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OF_SUCCESSION__TO = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OF_SUCCESSION__FROM = 1;

	/**
	 * The number of structural features of the '<em>Of Succession</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OF_SUCCESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Of Succession</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OF_SUCCESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Owning Membership</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNING_MEMBERSHIP = CONNECTOR__OWNING_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_RELATIONSHIP = CONNECTOR__OWNED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Relationship</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNING_RELATIONSHIP = CONNECTOR__OWNING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Owning Namespace</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNING_NAMESPACE = CONNECTOR__OWNING_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IDENTIFIER = CONNECTOR__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNER = CONNECTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_ELEMENT = CONNECTOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__MEMBERSHIP = CONNECTOR__MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import comp</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_IMPORT_COMP = CONNECTOR__OWNED_IMPORT_COMP;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__MEMBER = CONNECTOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_MEMBER = CONNECTOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IMPORTED_MEMBERSHIP = CONNECTOR__IMPORTED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Membership comp</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_MEMBERSHIP_COMP = CONNECTOR__OWNED_MEMBERSHIP_COMP;

	/**
	 * The feature id for the '<em><b>Owned Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_MEMBERSHIP = CONNECTOR__OWNED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_IMPORT = CONNECTOR__OWNED_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_GENERALIZATION = CONNECTOR__OWNED_GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Feature Membership</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_FEATURE_MEMBERSHIP = CONNECTOR__OWNED_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Owned Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_FEATURE = CONNECTOR__OWNED_FEATURE;

	/**
	 * The feature id for the '<em><b>Owned End Feature</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_END_FEATURE = CONNECTOR__OWNED_END_FEATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__FEATURE = CONNECTOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__INPUT = CONNECTOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OUTPUT = CONNECTOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IS_ABSTRACT = CONNECTOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Inherited Membership</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__INHERITED_MEMBERSHIP = CONNECTOR__INHERITED_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>End Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__END_FEATURE = CONNECTOR__END_FEATURE;

	/**
	 * The feature id for the '<em><b>Is Sufficient</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IS_SUFFICIENT = CONNECTOR__IS_SUFFICIENT;

	/**
	 * The feature id for the '<em><b>Referenced Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__REFERENCED_TYPE = CONNECTOR__REFERENCED_TYPE;

	/**
	 * The feature id for the '<em><b>Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNING_TYPE = CONNECTOR__OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IS_UNIQUE = CONNECTOR__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IS_ORDERED = CONNECTOR__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__TYPE = CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_TYPE = CONNECTOR__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Redefinition</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_REDEFINITION = CONNECTOR__OWNED_REDEFINITION;

	/**
	 * The feature id for the '<em><b>Owned Subsetting</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_SUBSETTING = CONNECTOR__OWNED_SUBSETTING;

	/**
	 * The feature id for the '<em><b>Owning Feature Membership</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNING_FEATURE_MEMBERSHIP = CONNECTOR__OWNING_FEATURE_MEMBERSHIP;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IS_COMPOSITE = CONNECTOR__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Valuation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__VALUATION = CONNECTOR__VALUATION;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__MULTIPLICITY = CONNECTOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__TYPING = CONNECTOR__TYPING;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IS_END = CONNECTOR__IS_END;

	/**
	 * The feature id for the '<em><b>End Owning Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__END_OWNING_TYPE = CONNECTOR__END_OWNING_TYPE;

	/**
	 * The feature id for the '<em><b>Is Nonunique</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IS_NONUNIQUE = CONNECTOR__IS_NONUNIQUE;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__RELATED_ELEMENT = CONNECTOR__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__TARGET = CONNECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__SOURCE = CONNECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Owning Related Element</b></em>' container
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNING_RELATED_ELEMENT = CONNECTOR__OWNING_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Related Element</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_RELATED_ELEMENT = CONNECTOR__OWNED_RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Related Feature</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__RELATED_FEATURE = CONNECTOR__RELATED_FEATURE;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__ASSOCIATION = CONNECTOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Owned Association Type</b></em>' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__OWNED_ASSOCIATION_TYPE = CONNECTOR__OWNED_ASSOCIATION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Directed</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__IS_DIRECTED = CONNECTOR__IS_DIRECTED;

	/**
	 * The feature id for the '<em><b>Connector End</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR__CONNECTOR_END = CONNECTOR__CONNECTOR_END;

	/**
	 * The number of structural features of the '<em>Binding Connector</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Of</em>' operation. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR___NAME_OF__ELEMENT = CONNECTOR___NAME_OF__ELEMENT;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR___EXCLUDE_COLLISIONS__ELIST = CONNECTOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Public Memberships</em>' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR___PUBLIC_MEMBERSHIPS = CONNECTOR___PUBLIC_MEMBERSHIPS;

	/**
	 * The operation id for the '<em>Path</em>' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR___PATH__FEATURE = CONNECTOR___PATH__FEATURE;

	/**
	 * The number of operations of the '<em>Binding Connector</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BINDING_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.sysml.lang.sysml.VisibilityKind
	 * <em>Visibility Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 62;

	/**
	 * The meta object id for the
	 * '{@link org.omg.sysml.lang.sysml.FeatureDirectionKind <em>Feature Direction
	 * Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureDirectionKind()
	 * @generated
	 */
	int FEATURE_DIRECTION_KIND = 63;

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.EndFeatureMembership <em>End Feature
	 * Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>End Feature Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.EndFeatureMembership
	 * @generated
	 */
	EClass getEndFeatureMembership();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership <em>Feature
	 * Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Feature Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership
	 * @generated
	 */
	EClass getFeatureMembership();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature
	 * <em>Owned Member Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '<em>Owned Member
	 *         Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EReference getFeatureMembership_OwnedMemberFeature();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#isDerived <em>Is
	 * Derived</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isDerived()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsDerived();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#isReadOnly <em>Is Read
	 * Only</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isReadOnly()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsReadOnly();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature
	 * <em>Member Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Member Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EReference getFeatureMembership_MemberFeature();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPart <em>Is Part</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Part</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isPart()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsPart();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPortion <em>Is
	 * Portion</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Portion</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isPortion()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsPortion();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPort <em>Is Port</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Port</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#isPort()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_IsPort();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#getDirection
	 * <em>Direction</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getDirection()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EAttribute getFeatureMembership_Direction();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningType <em>Owning
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Type</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwningType()
	 * @see #getFeatureMembership()
	 * @generated
	 */
	EReference getFeatureMembership_OwningType();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Membership
	 * <em>Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership
	 * @generated
	 */
	EClass getMembership();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement <em>Owned
	 * Member Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owned Member Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_OwnedMemberElement();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage
	 * <em>Membership Owning Package</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Membership Owning
	 *         Package</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_MembershipOwningPackage();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Membership#getMemberName <em>Member
	 * Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getMemberName()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_MemberName();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Membership#getVisibility
	 * <em>Visibility</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getVisibility()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Visibility();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link org.omg.sysml.lang.sysml.Membership#getAliases <em>Aliases</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Aliases</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getAliases()
	 * @see #getMembership()
	 * @generated
	 */
	EAttribute getMembership_Aliases();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Membership#getMemberElement <em>Member
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Member Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Membership#getMemberElement()
	 * @see #getMembership()
	 * @generated
	 */
	EReference getMembership_MemberElement();

	/**
	 * Returns the meta object for the
	 * '{@link org.omg.sysml.lang.sysml.Membership#isDistinguishableFrom(org.omg.sysml.lang.sysml.Membership)
	 * <em>Is Distinguishable From</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Is Distinguishable From</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Membership#isDistinguishableFrom(org.omg.sysml.lang.sysml.Membership)
	 * @generated
	 */
	EOperation getMembership__IsDistinguishableFrom__Membership();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.Relationship <em>Relationship</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement
	 * <em>Owned Related Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '<em>Owned Related
	 *         Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_OwnedRelatedElement();

	/**
	 * Returns the meta object for the container reference
	 * '{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement
	 * <em>Owning Related Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the container reference '<em>Owning Related
	 *         Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_OwningRelatedElement();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement <em>Related
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Related Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship#getRelatedElement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelatedElement();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.omg.sysml.lang.sysml.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Element
	 * <em>Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning
	 * Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwningMembership()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwningMembership();

	/**
	 * Returns the meta object for the container reference
	 * '{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship <em>Owning
	 * Relationship</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Owning
	 *         Relationship</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwningRelationship()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwningRelationship();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Element#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getIdentifier()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Identifier();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning
	 * Namespace</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Namespace</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwningNamespace()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwningNamespace();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship <em>Owned
	 * Relationship</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Owned
	 *         Relationship</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedRelationship()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedRelationship();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwner()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Owner();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedElement();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Package
	 * <em>Package</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.omg.sysml.lang.sysml.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Package#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getMembership()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Membership();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Package#getOwnedImport_comp <em>Owned Import
	 * comp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Import comp</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedImport_comp()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedImport_comp();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Package#getOwnedImport <em>Owned
	 * Import</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Import</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedImport()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedImport();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Package#getMember <em>Member</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getMember()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Member();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Package#getOwnedMembership <em>Owned
	 * Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMembership()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedMembership();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Package#getImportedMembership <em>Imported
	 * Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Imported
	 *         Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getImportedMembership()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ImportedMembership();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Package#getOwnedMembership_comp <em>Owned
	 * Membership comp</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Membership
	 *         comp</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMembership_comp()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedMembership_comp();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Package#getOwnedMember <em>Owned
	 * Member</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Member</em>'.
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMember()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedMember();

	/**
	 * Returns the meta object for the
	 * '{@link org.omg.sysml.lang.sysml.Package#nameOf(org.omg.sysml.lang.sysml.Element)
	 * <em>Name Of</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Name Of</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Package#nameOf(org.omg.sysml.lang.sysml.Element)
	 * @generated
	 */
	EOperation getPackage__NameOf__Element();

	/**
	 * Returns the meta object for the
	 * '{@link org.omg.sysml.lang.sysml.Package#excludeCollisions(org.eclipse.emf.common.util.EList)
	 * <em>Exclude Collisions</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Exclude Collisions</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Package#excludeCollisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getPackage__ExcludeCollisions__EList();

	/**
	 * Returns the meta object for the
	 * '{@link org.omg.sysml.lang.sysml.Package#publicMemberships() <em>Public
	 * Memberships</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Public Memberships</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Package#publicMemberships()
	 * @generated
	 */
	EOperation getPackage__PublicMemberships();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Import
	 * <em>Import</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.omg.sysml.lang.sysml.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Import#getImportedPackage <em>Imported
	 * Package</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Imported Package</em>'.
	 * @see org.omg.sysml.lang.sysml.Import#getImportedPackage()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ImportedPackage();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Import#getSelecter <em>Selecter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Selecter</em>'.
	 * @see org.omg.sysml.lang.sysml.Import#getSelecter()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Selecter();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Import#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.omg.sysml.lang.sysml.Import#getVisibility()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Visibility();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Import#getImportOwningPackage <em>Import
	 * Owning Package</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Import Owning Package</em>'.
	 * @see org.omg.sysml.lang.sysml.Import#getImportOwningPackage()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_ImportOwningPackage();

	/**
	 * Returns the meta object for the
	 * '{@link org.omg.sysml.lang.sysml.Import#importedMembership() <em>Imported
	 * Membership</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Imported Membership</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Import#importedMembership()
	 * @generated
	 */
	EOperation getImport__ImportedMembership();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Predicate
	 * <em>Predicate</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see org.omg.sysml.lang.sysml.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Function
	 * <em>Function</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.omg.sysml.lang.sysml.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Function#getExpression
	 * <em>Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.Function#getExpression()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Expression();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Function#getResult <em>Result</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see org.omg.sysml.lang.sysml.Function#getResult()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Result();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Behavior
	 * <em>Behavior</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see org.omg.sysml.lang.sysml.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Behavior#getStep <em>Step</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Step</em>'.
	 * @see org.omg.sysml.lang.sysml.Behavior#getStep()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Step();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Behavior#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see org.omg.sysml.lang.sysml.Behavior#getParameter()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Parameter();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Classifier
	 * <em>Classifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see org.omg.sysml.lang.sysml.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Classifier#getOwnedSuperclassing <em>Owned
	 * Superclassing</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned
	 *         Superclassing</em>'.
	 * @see org.omg.sysml.lang.sysml.Classifier#getOwnedSuperclassing()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_OwnedSuperclassing();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Type
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getOwnedGeneralization <em>Owned
	 * Generalization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned
	 *         Generalization</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedGeneralization()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_OwnedGeneralization();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getOwnedFeatureMembership <em>Owned
	 * Feature Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Feature
	 *         Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedFeatureMembership()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_OwnedFeatureMembership();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getFeature <em>Feature</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getFeature()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Feature();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature <em>Owned
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedFeature()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_OwnedFeature();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getInput <em>Input</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getInput()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Input();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getOutput <em>Output</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getOutput()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Output();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Type#isAbstract <em>Is Abstract</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#isAbstract()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_IsAbstract();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getInheritedMembership <em>Inherited
	 * Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Inherited
	 *         Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getInheritedMembership()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_InheritedMembership();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getEndFeature <em>End Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>End Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getEndFeature()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_EndFeature();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Type#isSufficient <em>Is Sufficient</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Sufficient</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#isSufficient()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_IsSufficient();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Type#getOwnedEndFeature <em>Owned End
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned End Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedEndFeature()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_OwnedEndFeature();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see org.omg.sysml.lang.sysml.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Generalization#getGeneral
	 * <em>General</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see org.omg.sysml.lang.sysml.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Generalization#getSpecific
	 * <em>Specific</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Specific</em>'.
	 * @see org.omg.sysml.lang.sysml.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Generalization#getOwningType <em>Owning
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Generalization#getOwningType()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_OwningType();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Feature
	 * <em>Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Feature#getReferencedType <em>Referenced
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Referenced Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getReferencedType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ReferencedType();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Feature#getOwningType <em>Owning
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwningType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwningType();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Feature#isUnique <em>Is Unique</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isUnique()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsUnique();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Feature#isOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isOrdered()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsOrdered();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Feature#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Type();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Feature#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwnedType();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Feature#getOwnedRedefinition <em>Owned
	 * Redefinition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Redefinition</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedRedefinition()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwnedRedefinition();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting <em>Owned
	 * Subsetting</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Subsetting</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwnedSubsetting();

	/**
	 * Returns the meta object for the container reference
	 * '{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership
	 * <em>Owning Feature Membership</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Owning Feature
	 *         Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_OwningFeatureMembership();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Feature#isComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isComposite()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsComposite();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Feature#getValuation <em>Valuation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Valuation</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getValuation()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Valuation();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Feature#getMultiplicity
	 * <em>Multiplicity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Multiplicity</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getMultiplicity()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Multiplicity();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Feature#getTyping <em>Typing</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Typing</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getTyping()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Typing();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Feature#isEnd <em>Is End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is End</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isEnd()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsEnd();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Feature#getEndOwningType <em>End Owning
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>End Owning Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#getEndOwningType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_EndOwningType();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Feature#isNonunique <em>Is Nonunique</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Nonunique</em>'.
	 * @see org.omg.sysml.lang.sysml.Feature#isNonunique()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsNonunique();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.Redefinition <em>Redefinition</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Redefinition</em>'.
	 * @see org.omg.sysml.lang.sysml.Redefinition
	 * @generated
	 */
	EClass getRedefinition();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Redefinition#getRedefiningFeature
	 * <em>Redefining Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Redefining Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Redefinition#getRedefiningFeature()
	 * @see #getRedefinition()
	 * @generated
	 */
	EReference getRedefinition_RedefiningFeature();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Redefinition#getRedefinedFeature
	 * <em>Redefined Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Redefined Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Redefinition#getRedefinedFeature()
	 * @see #getRedefinition()
	 * @generated
	 */
	EReference getRedefinition_RedefinedFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Subsetting
	 * <em>Subsetting</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Subsetting</em>'.
	 * @see org.omg.sysml.lang.sysml.Subsetting
	 * @generated
	 */
	EClass getSubsetting();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature <em>Subsetted
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Subsetted Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature()
	 * @see #getSubsetting()
	 * @generated
	 */
	EReference getSubsetting_SubsettedFeature();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature
	 * <em>Subsetting Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Subsetting Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature()
	 * @see #getSubsetting()
	 * @generated
	 */
	EReference getSubsetting_SubsettingFeature();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature <em>Owning
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Subsetting#getOwningFeature()
	 * @see #getSubsetting()
	 * @generated
	 */
	EReference getSubsetting_OwningFeature();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.FeatureValue <em>Feature Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Feature Value</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureValue
	 * @generated
	 */
	EClass getFeatureValue();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.FeatureValue#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureValue#getValue()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Value();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue <em>Feature
	 * With Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Feature With Value</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_FeatureWithValue();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Expression
	 * <em>Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Step
	 * <em>Step</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.omg.sysml.lang.sysml.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.Multiplicity <em>Multiplicity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see org.omg.sysml.lang.sysml.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Multiplicity#getLower <em>Lower</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Lower</em>'.
	 * @see org.omg.sysml.lang.sysml.Multiplicity#getLower()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EReference getMultiplicity_Lower();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Multiplicity#getUpper <em>Upper</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Upper</em>'.
	 * @see org.omg.sysml.lang.sysml.Multiplicity#getUpper()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EReference getMultiplicity_Upper();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity
	 * <em>Feature With Multiplicity</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Feature With
	 *         Multiplicity</em>'.
	 * @see org.omg.sysml.lang.sysml.Multiplicity#getFeatureWithMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EReference getMultiplicity_FeatureWithMultiplicity();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.FeatureTyping <em>Feature Typing</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Feature Typing</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureTyping
	 * @generated
	 */
	EClass getFeatureTyping();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.FeatureTyping#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureTyping#getType()
	 * @see #getFeatureTyping()
	 * @generated
	 */
	EReference getFeatureTyping_Type();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature <em>Typed
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Typed Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature()
	 * @see #getFeatureTyping()
	 * @generated
	 */
	EReference getFeatureTyping_TypedFeature();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.Superclassing <em>Superclassing</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Superclassing</em>'.
	 * @see org.omg.sysml.lang.sysml.Superclassing
	 * @generated
	 */
	EClass getSuperclassing();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Superclassing#getSuperclass
	 * <em>Superclass</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Superclass</em>'.
	 * @see org.omg.sysml.lang.sysml.Superclassing#getSuperclass()
	 * @see #getSuperclassing()
	 * @generated
	 */
	EReference getSuperclassing_Superclass();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Superclassing#getSubclass
	 * <em>Subclass</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Subclass</em>'.
	 * @see org.omg.sysml.lang.sysml.Superclassing#getSubclass()
	 * @see #getSuperclassing()
	 * @generated
	 */
	EReference getSuperclassing_Subclass();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier <em>Owning
	 * Classifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Classifier</em>'.
	 * @see org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier()
	 * @see #getSuperclassing()
	 * @generated
	 */
	EReference getSuperclassing_OwningClassifier();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Parameter
	 * <em>Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.omg.sysml.lang.sysml.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.Association <em>Association</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.omg.sysml.lang.sysml.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Association#getRelatedType <em>Related
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Related Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Association#getRelatedType()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_RelatedType();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning
	 * Connector</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Owning Connector</em>'.
	 * @see org.omg.sysml.lang.sysml.Association#getOwningConnector()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_OwningConnector();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Association#getAssociationEnd
	 * <em>Association End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Association End</em>'.
	 * @see org.omg.sysml.lang.sysml.Association#getAssociationEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AssociationEnd();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Connector
	 * <em>Connector</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Connector#getRelatedFeature <em>Related
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Related Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#getRelatedFeature()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_RelatedFeature();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Connector#getAssociation
	 * <em>Association</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Association</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#getAssociation()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Association();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Connector#isDirected <em>Is Directed</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Is Directed</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#isDirected()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsDirected();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd <em>Connector
	 * End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Connector End</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#getConnectorEnd()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ConnectorEnd();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType <em>Owned
	 * Association Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Owned Association
	 *         Type</em>'.
	 * @see org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_OwnedAssociationType();

	/**
	 * Returns the meta object for the
	 * '{@link org.omg.sysml.lang.sysml.Connector#path(org.omg.sysml.lang.sysml.Feature)
	 * <em>Path</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the '<em>Path</em>' operation.
	 * @see org.omg.sysml.lang.sysml.Connector#path(org.omg.sysml.lang.sysml.Feature)
	 * @generated
	 */
	EOperation getConnector__Path__Feature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.DataType
	 * <em>Data Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.omg.sysml.lang.sysml.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Class
	 * <em>Class</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.omg.sysml.lang.sysml.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.OfSuccession <em>Of Succession</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Of Succession</em>'.
	 * @see org.omg.sysml.lang.sysml.OfSuccession
	 * @generated
	 */
	EClass getOfSuccession();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.OfSuccession#getTo <em>To</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.omg.sysml.lang.sysml.OfSuccession#getTo()
	 * @see #getOfSuccession()
	 * @generated
	 */
	EReference getOfSuccession_To();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.OfSuccession#getFrom <em>From</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.omg.sysml.lang.sysml.OfSuccession#getFrom()
	 * @see #getOfSuccession()
	 * @generated
	 */
	EReference getOfSuccession_From();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.OrderedFeature <em>Ordered Feature</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ordered Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.OrderedFeature
	 * @generated
	 */
	EClass getOrderedFeature();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.StructuredFeature <em>Structured
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Structured Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.StructuredFeature
	 * @generated
	 */
	EClass getStructuredFeature();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.BindingConnector <em>Binding
	 * Connector</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Binding Connector</em>'.
	 * @see org.omg.sysml.lang.sysml.BindingConnector
	 * @generated
	 */
	EClass getBindingConnector();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Succession
	 * <em>Succession</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Succession</em>'.
	 * @see org.omg.sysml.lang.sysml.Succession
	 * @generated
	 */
	EClass getSuccession();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Comment
	 * <em>Comment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.omg.sysml.lang.sysml.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.Comment#getBody <em>Body</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.omg.sysml.lang.sysml.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Comment#getCommentedElement <em>Commented
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Commented Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Comment#getCommentedElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CommentedElement();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Comment#getAnnotationForComment
	 * <em>Annotation For Comment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the reference '<em>Annotation For Comment</em>'.
	 * @see org.omg.sysml.lang.sysml.Comment#getAnnotationForComment()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_AnnotationForComment();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Annotation
	 * <em>Annotation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.omg.sysml.lang.sysml.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement <em>Annotated
	 * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Annotated Element</em>'.
	 * @see org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotatedElement();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingComment
	 * <em>Annotating Comment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Annotating Comment</em>'.
	 * @see org.omg.sysml.lang.sysml.Annotation#getAnnotatingComment()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotatingComment();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.AtomicInteraction <em>Atomic
	 * Interaction</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Atomic Interaction</em>'.
	 * @see org.omg.sysml.lang.sysml.AtomicInteraction
	 * @generated
	 */
	EClass getAtomicInteraction();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.AtomicInteraction#getItemType <em>Item
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Item Type</em>'.
	 * @see org.omg.sysml.lang.sysml.AtomicInteraction#getItemType()
	 * @see #getAtomicInteraction()
	 * @generated
	 */
	EReference getAtomicInteraction_ItemType();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.Interaction <em>Interaction</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see org.omg.sysml.lang.sysml.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.Ownership
	 * <em>Ownership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Ownership</em>'.
	 * @see org.omg.sysml.lang.sysml.Ownership
	 * @generated
	 */
	EClass getOwnership();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.LiteralBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralBoolean#isValue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Value();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.InvocationExpression <em>Invocation
	 * Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Invocation Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.InvocationExpression
	 * @generated
	 */
	EClass getInvocationExpression();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.BlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Block Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.BlockExpression
	 * @generated
	 */
	EClass getBlockExpression();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.ParameterMembership <em>Parameter
	 * Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.ParameterMembership
	 * @generated
	 */
	EClass getParameterMembership();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.ParameterMembership#getMemberParameter
	 * <em>Member Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Member Parameter</em>'.
	 * @see org.omg.sysml.lang.sysml.ParameterMembership#getMemberParameter()
	 * @see #getParameterMembership()
	 * @generated
	 */
	EReference getParameterMembership_MemberParameter();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter
	 * <em>Owned Member Parameter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference '<em>Owned Member
	 *         Parameter</em>'.
	 * @see org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter()
	 * @see #getParameterMembership()
	 * @generated
	 */
	EReference getParameterMembership_OwnedMemberParameter();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.ReturnParameterMembership <em>Return
	 * Parameter Membership</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Return Parameter Membership</em>'.
	 * @see org.omg.sysml.lang.sysml.ReturnParameterMembership
	 * @generated
	 */
	EClass getReturnParameterMembership();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.QueryPathStepExpression <em>Query Path Step
	 * Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Query Path Step Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.QueryPathStepExpression
	 * @generated
	 */
	EClass getQueryPathStepExpression();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.QueryQualifierExpression <em>Query Qualifier
	 * Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Query Qualifier Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.QueryQualifierExpression
	 * @generated
	 */
	EClass getQueryQualifierExpression();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.QueryPathExpression <em>Query Path
	 * Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Query Path Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.QueryPathExpression
	 * @generated
	 */
	EClass getQueryPathExpression();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.LiteralExpression <em>Literal
	 * Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.LiteralReal <em>Literal Real</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal Real</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralReal
	 * @generated
	 */
	EClass getLiteralReal();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.LiteralReal#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralReal#getValue()
	 * @see #getLiteralReal()
	 * @generated
	 */
	EAttribute getLiteralReal_Value();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.LiteralUnbounded <em>Literal
	 * Unbounded</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal Unbounded</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralUnbounded
	 * @generated
	 */
	EClass getLiteralUnbounded();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.LiteralInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralInteger#getValue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Value();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.ItemFlowEnd <em>Item Flow End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Item Flow End</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlowEnd
	 * @generated
	 */
	EClass getItemFlowEnd();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.ItemFlowFeature <em>Item Flow
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Item Flow Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlowFeature
	 * @generated
	 */
	EClass getItemFlowFeature();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.ItemFeature <em>Item Feature</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Item Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFeature
	 * @generated
	 */
	EClass getItemFeature();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.SourceEnd
	 * <em>Source End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Source End</em>'.
	 * @see org.omg.sysml.lang.sysml.SourceEnd
	 * @generated
	 */
	EClass getSourceEnd();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.TargetEnd
	 * <em>Target End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Target End</em>'.
	 * @see org.omg.sysml.lang.sysml.TargetEnd
	 * @generated
	 */
	EClass getTargetEnd();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.OperatorExpression <em>Operator
	 * Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Operator Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.OperatorExpression
	 * @generated
	 */
	EClass getOperatorExpression();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperator
	 * <em>Operator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.omg.sysml.lang.sysml.OperatorExpression#getOperator()
	 * @see #getOperatorExpression()
	 * @generated
	 */
	EAttribute getOperatorExpression_Operator();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperand
	 * <em>Operand</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Operand</em>'.
	 * @see org.omg.sysml.lang.sysml.OperatorExpression#getOperand()
	 * @see #getOperatorExpression()
	 * @generated
	 */
	EReference getOperatorExpression_Operand();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute
	 * '{@link org.omg.sysml.lang.sysml.LiteralString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.sysml.lang.sysml.LiteralString#getValue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.sysml.lang.sysml.ItemFlow
	 * <em>Item Flow</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Item Flow</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow
	 * @generated
	 */
	EClass getItemFlow();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.ItemFlow#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Item Type</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getItemType()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_ItemType();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.ItemFlow#getTargetInputFeature <em>Target
	 * Input Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Target Input
	 *         Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getTargetInputFeature()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_TargetInputFeature();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.ItemFlow#getSourceOutputFeature <em>Source
	 * Output Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Source Output
	 *         Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getSourceOutputFeature()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_SourceOutputFeature();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFlowEnd <em>Item Flow
	 * End</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Item Flow End</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getItemFlowEnd()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_ItemFlowEnd();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFlowFeature <em>Item Flow
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Item Flow Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getItemFlowFeature()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_ItemFlowFeature();

	/**
	 * Returns the meta object for the reference list
	 * '{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFeature <em>Item
	 * Feature</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Item Feature</em>'.
	 * @see org.omg.sysml.lang.sysml.ItemFlow#getItemFeature()
	 * @see #getItemFlow()
	 * @generated
	 */
	EReference getItemFlow_ItemFeature();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.SuccessionItemFlow <em>Succession Item
	 * Flow</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Succession Item Flow</em>'.
	 * @see org.omg.sysml.lang.sysml.SuccessionItemFlow
	 * @generated
	 */
	EClass getSuccessionItemFlow();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression <em>Instance
	 * Creation Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Instance Creation Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.InstanceCreationExpression
	 * @generated
	 */
	EClass getInstanceCreationExpression();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getInstantiatedType
	 * <em>Instantiated Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Instantiated Type</em>'.
	 * @see org.omg.sysml.lang.sysml.InstanceCreationExpression#getInstantiatedType()
	 * @see #getInstanceCreationExpression()
	 * @generated
	 */
	EReference getInstanceCreationExpression_InstantiatedType();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Null Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.NullExpression
	 * @generated
	 */
	EClass getNullExpression();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.SequenceConstructionExpression <em>Sequence
	 * Construction Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Sequence Construction
	 *         Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.SequenceConstructionExpression
	 * @generated
	 */
	EClass getSequenceConstructionExpression();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link org.omg.sysml.lang.sysml.SequenceConstructionExpression#getElement
	 * <em>Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Element</em>'.
	 * @see org.omg.sysml.lang.sysml.SequenceConstructionExpression#getElement()
	 * @see #getSequenceConstructionExpression()
	 * @generated
	 */
	EReference getSequenceConstructionExpression_Element();

	/**
	 * Returns the meta object for class
	 * '{@link org.omg.sysml.lang.sysml.FeatureReferenceExpression <em>Feature
	 * Reference Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Feature Reference Expression</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureReferenceExpression
	 * @generated
	 */
	EClass getFeatureReferenceExpression();

	/**
	 * Returns the meta object for the reference
	 * '{@link org.omg.sysml.lang.sysml.FeatureReferenceExpression#getReferent
	 * <em>Referent</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Referent</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureReferenceExpression#getReferent()
	 * @see #getFeatureReferenceExpression()
	 * @generated
	 */
	EReference getFeatureReferenceExpression_Referent();

	/**
	 * Returns the meta object for enum
	 * '{@link org.omg.sysml.lang.sysml.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the meta object for enum
	 * '{@link org.omg.sysml.lang.sysml.FeatureDirectionKind <em>Feature Direction
	 * Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Feature Direction Kind</em>'.
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @generated
	 */
	EEnum getFeatureDirectionKind();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SysMLFactory getSysMLFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl <em>End
		 * Feature Membership</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getEndFeatureMembership()
		 * @generated
		 */
		EClass END_FEATURE_MEMBERSHIP = eINSTANCE.getEndFeatureMembership();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl <em>Feature
		 * Membership</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureMembership()
		 * @generated
		 */
		EClass FEATURE_MEMBERSHIP = eINSTANCE.getFeatureMembership();

		/**
		 * The meta object literal for the '<em><b>Owned Member Feature</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE = eINSTANCE.getFeatureMembership_OwnedMemberFeature();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_DERIVED = eINSTANCE.getFeatureMembership_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_READ_ONLY = eINSTANCE.getFeatureMembership_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Member Feature</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE_MEMBERSHIP__MEMBER_FEATURE = eINSTANCE.getFeatureMembership_MemberFeature();

		/**
		 * The meta object literal for the '<em><b>Is Part</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_PART = eINSTANCE.getFeatureMembership_IsPart();

		/**
		 * The meta object literal for the '<em><b>Is Portion</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_PORTION = eINSTANCE.getFeatureMembership_IsPortion();

		/**
		 * The meta object literal for the '<em><b>Is Port</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__IS_PORT = eINSTANCE.getFeatureMembership_IsPort();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE_MEMBERSHIP__DIRECTION = eINSTANCE.getFeatureMembership_Direction();

		/**
		 * The meta object literal for the '<em><b>Owning Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE_MEMBERSHIP__OWNING_TYPE = eINSTANCE.getFeatureMembership_OwningType();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.MembershipImpl <em>Membership</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.MembershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getMembership()
		 * @generated
		 */
		EClass MEMBERSHIP = eINSTANCE.getMembership();

		/**
		 * The meta object literal for the '<em><b>Owned Member Element</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEMBERSHIP__OWNED_MEMBER_ELEMENT = eINSTANCE.getMembership_OwnedMemberElement();

		/**
		 * The meta object literal for the '<em><b>Membership Owning Package</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE = eINSTANCE.getMembership_MembershipOwningPackage();

		/**
		 * The meta object literal for the '<em><b>Member Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MEMBERSHIP__MEMBER_NAME = eINSTANCE.getMembership_MemberName();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MEMBERSHIP__VISIBILITY = eINSTANCE.getMembership_Visibility();

		/**
		 * The meta object literal for the '<em><b>Aliases</b></em>' attribute list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MEMBERSHIP__ALIASES = eINSTANCE.getMembership_Aliases();

		/**
		 * The meta object literal for the '<em><b>Member Element</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MEMBERSHIP__MEMBER_ELEMENT = eINSTANCE.getMembership_MemberElement();

		/**
		 * The meta object literal for the '<em><b>Is Distinguishable From</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP = eINSTANCE
				.getMembership__IsDistinguishableFrom__Membership();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.RelationshipImpl
		 * <em>Relationship</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.RelationshipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Owned Related Element</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference RELATIONSHIP__OWNED_RELATED_ELEMENT = eINSTANCE.getRelationship_OwnedRelatedElement();

		/**
		 * The meta object literal for the '<em><b>Owning Related Element</b></em>'
		 * container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELATIONSHIP__OWNING_RELATED_ELEMENT = eINSTANCE.getRelationship_OwningRelatedElement();

		/**
		 * The meta object literal for the '<em><b>Related Element</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELATIONSHIP__RELATED_ELEMENT = eINSTANCE.getRelationship_RelatedElement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ElementImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Owning Membership</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELEMENT__OWNING_MEMBERSHIP = eINSTANCE.getElement_OwningMembership();

		/**
		 * The meta object literal for the '<em><b>Owning Relationship</b></em>'
		 * container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELEMENT__OWNING_RELATIONSHIP = eINSTANCE.getElement_OwningRelationship();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT__IDENTIFIER = eINSTANCE.getElement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Owning Namespace</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELEMENT__OWNING_NAMESPACE = eINSTANCE.getElement_OwningNamespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Relationship</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference ELEMENT__OWNED_RELATIONSHIP = eINSTANCE.getElement_OwnedRelationship();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELEMENT__OWNER = eINSTANCE.getElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ELEMENT__OWNED_ELEMENT = eINSTANCE.getElement_OwnedElement();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.PackageImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__MEMBERSHIP = eINSTANCE.getPackage_Membership();

		/**
		 * The meta object literal for the '<em><b>Owned Import comp</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__OWNED_IMPORT_COMP = eINSTANCE.getPackage_OwnedImport_comp();

		/**
		 * The meta object literal for the '<em><b>Owned Import</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__OWNED_IMPORT = eINSTANCE.getPackage_OwnedImport();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__MEMBER = eINSTANCE.getPackage_Member();

		/**
		 * The meta object literal for the '<em><b>Owned Membership</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__OWNED_MEMBERSHIP = eINSTANCE.getPackage_OwnedMembership();

		/**
		 * The meta object literal for the '<em><b>Imported Membership</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__IMPORTED_MEMBERSHIP = eINSTANCE.getPackage_ImportedMembership();

		/**
		 * The meta object literal for the '<em><b>Owned Membership comp</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__OWNED_MEMBERSHIP_COMP = eINSTANCE.getPackage_OwnedMembership_comp();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PACKAGE__OWNED_MEMBER = eINSTANCE.getPackage_OwnedMember();

		/**
		 * The meta object literal for the '<em><b>Name Of</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation PACKAGE___NAME_OF__ELEMENT = eINSTANCE.getPackage__NameOf__Element();

		/**
		 * The meta object literal for the '<em><b>Exclude Collisions</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation PACKAGE___EXCLUDE_COLLISIONS__ELIST = eINSTANCE.getPackage__ExcludeCollisions__EList();

		/**
		 * The meta object literal for the '<em><b>Public Memberships</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation PACKAGE___PUBLIC_MEMBERSHIPS = eINSTANCE.getPackage__PublicMemberships();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ImportImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Package</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPORT__IMPORTED_PACKAGE = eINSTANCE.getImport_ImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Selecter</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPORT__SELECTER = eINSTANCE.getImport_Selecter();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IMPORT__VISIBILITY = eINSTANCE.getImport_Visibility();

		/**
		 * The meta object literal for the '<em><b>Import Owning Package</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IMPORT__IMPORT_OWNING_PACKAGE = eINSTANCE.getImport_ImportOwningPackage();

		/**
		 * The meta object literal for the '<em><b>Imported Membership</b></em>'
		 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation IMPORT___IMPORTED_MEMBERSHIP = eINSTANCE.getImport__ImportedMembership();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.PredicateImpl <em>Predicate</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.PredicateImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.FunctionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTION__EXPRESSION = eINSTANCE.getFunction_Expression();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FUNCTION__RESULT = eINSTANCE.getFunction_Result();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.BehaviorImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEHAVIOR__STEP = eINSTANCE.getBehavior_Step();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BEHAVIOR__PARAMETER = eINSTANCE.getBehavior_Parameter();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ClassifierImpl <em>Classifier</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ClassifierImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Owned Superclassing</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CLASSIFIER__OWNED_SUPERCLASSING = eINSTANCE.getClassifier_OwnedSuperclassing();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.TypeImpl <em>Type</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.TypeImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Owned Generalization</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__OWNED_GENERALIZATION = eINSTANCE.getType_OwnedGeneralization();

		/**
		 * The meta object literal for the '<em><b>Owned Feature Membership</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__OWNED_FEATURE_MEMBERSHIP = eINSTANCE.getType_OwnedFeatureMembership();

		/**
		 * The meta object literal for the '<em><b>Owned Feature</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__OWNED_FEATURE = eINSTANCE.getType_OwnedFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__FEATURE = eINSTANCE.getType_Feature();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__INPUT = eINSTANCE.getType_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__OUTPUT = eINSTANCE.getType_Output();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPE__IS_ABSTRACT = eINSTANCE.getType_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Inherited Membership</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__INHERITED_MEMBERSHIP = eINSTANCE.getType_InheritedMembership();

		/**
		 * The meta object literal for the '<em><b>End Feature</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__END_FEATURE = eINSTANCE.getType_EndFeature();

		/**
		 * The meta object literal for the '<em><b>Is Sufficient</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPE__IS_SUFFICIENT = eINSTANCE.getType_IsSufficient();

		/**
		 * The meta object literal for the '<em><b>Owned End Feature</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TYPE__OWNED_END_FEATURE = eINSTANCE.getType_OwnedEndFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ClassImpl <em>Class</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ClassImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl
		 * <em>Generalization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.GeneralizationImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '<em><b>Owning Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GENERALIZATION__OWNING_TYPE = eINSTANCE.getGeneralization_OwningType();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.FeatureImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Referenced Type</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__REFERENCED_TYPE = eINSTANCE.getFeature_ReferencedType();

		/**
		 * The meta object literal for the '<em><b>Owning Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__OWNING_TYPE = eINSTANCE.getFeature_OwningType();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE__IS_UNIQUE = eINSTANCE.getFeature_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE__IS_ORDERED = eINSTANCE.getFeature_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Owned Type</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__OWNED_TYPE = eINSTANCE.getFeature_OwnedType();

		/**
		 * The meta object literal for the '<em><b>Owned Redefinition</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__OWNED_REDEFINITION = eINSTANCE.getFeature_OwnedRedefinition();

		/**
		 * The meta object literal for the '<em><b>Owned Subsetting</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__OWNED_SUBSETTING = eINSTANCE.getFeature_OwnedSubsetting();

		/**
		 * The meta object literal for the '<em><b>Owning Feature Membership</b></em>'
		 * container reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__OWNING_FEATURE_MEMBERSHIP = eINSTANCE.getFeature_OwningFeatureMembership();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE__IS_COMPOSITE = eINSTANCE.getFeature_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Valuation</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__VALUATION = eINSTANCE.getFeature_Valuation();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__MULTIPLICITY = eINSTANCE.getFeature_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Typing</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__TYPING = eINSTANCE.getFeature_Typing();

		/**
		 * The meta object literal for the '<em><b>Is End</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE__IS_END = eINSTANCE.getFeature_IsEnd();

		/**
		 * The meta object literal for the '<em><b>End Owning Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE__END_OWNING_TYPE = eINSTANCE.getFeature_EndOwningType();

		/**
		 * The meta object literal for the '<em><b>Is Nonunique</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FEATURE__IS_NONUNIQUE = eINSTANCE.getFeature_IsNonunique();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.RedefinitionImpl
		 * <em>Redefinition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.RedefinitionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getRedefinition()
		 * @generated
		 */
		EClass REDEFINITION = eINSTANCE.getRedefinition();

		/**
		 * The meta object literal for the '<em><b>Redefining Feature</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REDEFINITION__REDEFINING_FEATURE = eINSTANCE.getRedefinition_RedefiningFeature();

		/**
		 * The meta object literal for the '<em><b>Redefined Feature</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference REDEFINITION__REDEFINED_FEATURE = eINSTANCE.getRedefinition_RedefinedFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.SubsettingImpl <em>Subsetting</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.SubsettingImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSubsetting()
		 * @generated
		 */
		EClass SUBSETTING = eINSTANCE.getSubsetting();

		/**
		 * The meta object literal for the '<em><b>Subsetted Feature</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SUBSETTING__SUBSETTED_FEATURE = eINSTANCE.getSubsetting_SubsettedFeature();

		/**
		 * The meta object literal for the '<em><b>Subsetting Feature</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SUBSETTING__SUBSETTING_FEATURE = eINSTANCE.getSubsetting_SubsettingFeature();

		/**
		 * The meta object literal for the '<em><b>Owning Feature</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SUBSETTING__OWNING_FEATURE = eINSTANCE.getSubsetting_OwningFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl <em>Feature
		 * Value</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.FeatureValueImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureValue()
		 * @generated
		 */
		EClass FEATURE_VALUE = eINSTANCE.getFeatureValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE_VALUE__VALUE = eINSTANCE.getFeatureValue_Value();

		/**
		 * The meta object literal for the '<em><b>Feature With Value</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE_VALUE__FEATURE_WITH_VALUE = eINSTANCE.getFeatureValue_FeatureWithValue();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ExpressionImpl <em>Expression</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.StepImpl <em>Step</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.StepImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl
		 * <em>Multiplicity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.MultiplicityImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MULTIPLICITY__LOWER = eINSTANCE.getMultiplicity_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MULTIPLICITY__UPPER = eINSTANCE.getMultiplicity_Upper();

		/**
		 * The meta object literal for the '<em><b>Feature With Multiplicity</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MULTIPLICITY__FEATURE_WITH_MULTIPLICITY = eINSTANCE.getMultiplicity_FeatureWithMultiplicity();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.FeatureTypingImpl <em>Feature
		 * Typing</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.FeatureTypingImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureTyping()
		 * @generated
		 */
		EClass FEATURE_TYPING = eINSTANCE.getFeatureTyping();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE_TYPING__TYPE = eINSTANCE.getFeatureTyping_Type();

		/**
		 * The meta object literal for the '<em><b>Typed Feature</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE_TYPING__TYPED_FEATURE = eINSTANCE.getFeatureTyping_TypedFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.SuperclassingImpl
		 * <em>Superclassing</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.SuperclassingImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuperclassing()
		 * @generated
		 */
		EClass SUPERCLASSING = eINSTANCE.getSuperclassing();

		/**
		 * The meta object literal for the '<em><b>Superclass</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SUPERCLASSING__SUPERCLASS = eINSTANCE.getSuperclassing_Superclass();

		/**
		 * The meta object literal for the '<em><b>Subclass</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SUPERCLASSING__SUBCLASS = eINSTANCE.getSuperclassing_Subclass();

		/**
		 * The meta object literal for the '<em><b>Owning Classifier</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SUPERCLASSING__OWNING_CLASSIFIER = eINSTANCE.getSuperclassing_OwningClassifier();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ParameterImpl <em>Parameter</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ParameterImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.AssociationImpl <em>Association</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.AssociationImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Related Type</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__RELATED_TYPE = eINSTANCE.getAssociation_RelatedType();

		/**
		 * The meta object literal for the '<em><b>Owning Connector</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__OWNING_CONNECTOR = eINSTANCE.getAssociation_OwningConnector();

		/**
		 * The meta object literal for the '<em><b>Association End</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ASSOCIATION__ASSOCIATION_END = eINSTANCE.getAssociation_AssociationEnd();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl <em>Connector</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ConnectorImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Related Feature</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONNECTOR__RELATED_FEATURE = eINSTANCE.getConnector_RelatedFeature();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONNECTOR__ASSOCIATION = eINSTANCE.getConnector_Association();

		/**
		 * The meta object literal for the '<em><b>Is Directed</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONNECTOR__IS_DIRECTED = eINSTANCE.getConnector_IsDirected();

		/**
		 * The meta object literal for the '<em><b>Connector End</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONNECTOR__CONNECTOR_END = eINSTANCE.getConnector_ConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Owned Association Type</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CONNECTOR__OWNED_ASSOCIATION_TYPE = eINSTANCE.getConnector_OwnedAssociationType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' operation. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EOperation CONNECTOR___PATH__FEATURE = eINSTANCE.getConnector__Path__Feature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.OfSuccessionImpl <em>Of
		 * Succession</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.OfSuccessionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOfSuccession()
		 * @generated
		 */
		EClass OF_SUCCESSION = eINSTANCE.getOfSuccession();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OF_SUCCESSION__TO = eINSTANCE.getOfSuccession_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OF_SUCCESSION__FROM = eINSTANCE.getOfSuccession_From();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.DataTypeImpl <em>Data Type</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.DataTypeImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.OrderedFeatureImpl <em>Ordered
		 * Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.OrderedFeatureImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOrderedFeature()
		 * @generated
		 */
		EClass ORDERED_FEATURE = eINSTANCE.getOrderedFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.StructuredFeatureImpl <em>Structured
		 * Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.StructuredFeatureImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getStructuredFeature()
		 * @generated
		 */
		EClass STRUCTURED_FEATURE = eINSTANCE.getStructuredFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.BindingConnectorImpl <em>Binding
		 * Connector</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.BindingConnectorImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getBindingConnector()
		 * @generated
		 */
		EClass BINDING_CONNECTOR = eINSTANCE.getBindingConnector();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.SuccessionImpl <em>Succession</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.SuccessionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuccession()
		 * @generated
		 */
		EClass SUCCESSION = eINSTANCE.getSuccession();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.CommentImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Commented Element</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMMENT__COMMENTED_ELEMENT = eINSTANCE.getComment_CommentedElement();

		/**
		 * The meta object literal for the '<em><b>Annotation For Comment</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COMMENT__ANNOTATION_FOR_COMMENT = eINSTANCE.getComment_AnnotationForComment();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl <em>Annotation</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.AnnotationImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATED_ELEMENT = eINSTANCE.getAnnotation_AnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Annotating Comment</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATING_COMMENT = eINSTANCE.getAnnotation_AnnotatingComment();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.AtomicInteractionImpl <em>Atomic
		 * Interaction</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.AtomicInteractionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getAtomicInteraction()
		 * @generated
		 */
		EClass ATOMIC_INTERACTION = eINSTANCE.getAtomicInteraction();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ATOMIC_INTERACTION__ITEM_TYPE = eINSTANCE.getAtomicInteraction_ItemType();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.InteractionImpl <em>Interaction</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.InteractionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.OwnershipImpl <em>Ownership</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.OwnershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOwnership()
		 * @generated
		 */
		EClass OWNERSHIP = eINSTANCE.getOwnership();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl <em>Literal
		 * Boolean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.LiteralBooleanImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralBoolean()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN__VALUE = eINSTANCE.getLiteralBoolean_Value();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl <em>Invocation
		 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getInvocationExpression()
		 * @generated
		 */
		EClass INVOCATION_EXPRESSION = eINSTANCE.getInvocationExpression();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.BlockExpressionImpl <em>Block
		 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.BlockExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getBlockExpression()
		 * @generated
		 */
		EClass BLOCK_EXPRESSION = eINSTANCE.getBlockExpression();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl <em>Parameter
		 * Membership</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getParameterMembership()
		 * @generated
		 */
		EClass PARAMETER_MEMBERSHIP = eINSTANCE.getParameterMembership();

		/**
		 * The meta object literal for the '<em><b>Member Parameter</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARAMETER_MEMBERSHIP__MEMBER_PARAMETER = eINSTANCE.getParameterMembership_MemberParameter();

		/**
		 * The meta object literal for the '<em><b>Owned Member Parameter</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER = eINSTANCE
				.getParameterMembership_OwnedMemberParameter();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ReturnParameterMembershipImpl
		 * <em>Return Parameter Membership</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ReturnParameterMembershipImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getReturnParameterMembership()
		 * @generated
		 */
		EClass RETURN_PARAMETER_MEMBERSHIP = eINSTANCE.getReturnParameterMembership();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.QueryPathStepExpressionImpl <em>Query
		 * Path Step Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.QueryPathStepExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getQueryPathStepExpression()
		 * @generated
		 */
		EClass QUERY_PATH_STEP_EXPRESSION = eINSTANCE.getQueryPathStepExpression();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.QueryQualifierExpressionImpl <em>Query
		 * Qualifier Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.QueryQualifierExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getQueryQualifierExpression()
		 * @generated
		 */
		EClass QUERY_QUALIFIER_EXPRESSION = eINSTANCE.getQueryQualifierExpression();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.QueryPathExpressionImpl <em>Query Path
		 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.QueryPathExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getQueryPathExpression()
		 * @generated
		 */
		EClass QUERY_PATH_EXPRESSION = eINSTANCE.getQueryPathExpression();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl <em>Literal
		 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.LiteralExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.LiteralRealImpl <em>Literal Real</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.LiteralRealImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralReal()
		 * @generated
		 */
		EClass LITERAL_REAL = eINSTANCE.getLiteralReal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LITERAL_REAL__VALUE = eINSTANCE.getLiteralReal_Value();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.LiteralUnboundedImpl <em>Literal
		 * Unbounded</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.LiteralUnboundedImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralUnbounded()
		 * @generated
		 */
		EClass LITERAL_UNBOUNDED = eINSTANCE.getLiteralUnbounded();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl <em>Literal
		 * Integer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.LiteralIntegerImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LITERAL_INTEGER__VALUE = eINSTANCE.getLiteralInteger_Value();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ItemFlowEndImpl <em>Item Flow
		 * End</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ItemFlowEndImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFlowEnd()
		 * @generated
		 */
		EClass ITEM_FLOW_END = eINSTANCE.getItemFlowEnd();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ItemFlowFeatureImpl <em>Item Flow
		 * Feature</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ItemFlowFeatureImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFlowFeature()
		 * @generated
		 */
		EClass ITEM_FLOW_FEATURE = eINSTANCE.getItemFlowFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ItemFeatureImpl <em>Item Feature</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ItemFeatureImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFeature()
		 * @generated
		 */
		EClass ITEM_FEATURE = eINSTANCE.getItemFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.SourceEndImpl <em>Source End</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.SourceEndImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSourceEnd()
		 * @generated
		 */
		EClass SOURCE_END = eINSTANCE.getSourceEnd();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.TargetEndImpl <em>Target End</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.TargetEndImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getTargetEnd()
		 * @generated
		 */
		EClass TARGET_END = eINSTANCE.getTargetEnd();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl <em>Operator
		 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getOperatorExpression()
		 * @generated
		 */
		EClass OPERATOR_EXPRESSION = eINSTANCE.getOperatorExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getOperatorExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OPERATOR_EXPRESSION__OPERAND = eINSTANCE.getOperatorExpression_Operand();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.LiteralStringImpl <em>Literal
		 * String</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.LiteralStringImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getLiteralString()
		 * @generated
		 */
		EClass LITERAL_STRING = eINSTANCE.getLiteralString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.ItemFlowImpl <em>Item Flow</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.ItemFlowImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getItemFlow()
		 * @generated
		 */
		EClass ITEM_FLOW = eINSTANCE.getItemFlow();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITEM_FLOW__ITEM_TYPE = eINSTANCE.getItemFlow_ItemType();

		/**
		 * The meta object literal for the '<em><b>Target Input Feature</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITEM_FLOW__TARGET_INPUT_FEATURE = eINSTANCE.getItemFlow_TargetInputFeature();

		/**
		 * The meta object literal for the '<em><b>Source Output Feature</b></em>'
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITEM_FLOW__SOURCE_OUTPUT_FEATURE = eINSTANCE.getItemFlow_SourceOutputFeature();

		/**
		 * The meta object literal for the '<em><b>Item Flow End</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITEM_FLOW__ITEM_FLOW_END = eINSTANCE.getItemFlow_ItemFlowEnd();

		/**
		 * The meta object literal for the '<em><b>Item Flow Feature</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITEM_FLOW__ITEM_FLOW_FEATURE = eINSTANCE.getItemFlow_ItemFlowFeature();

		/**
		 * The meta object literal for the '<em><b>Item Feature</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ITEM_FLOW__ITEM_FEATURE = eINSTANCE.getItemFlow_ItemFeature();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl <em>Succession
		 * Item Flow</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSuccessionItemFlow()
		 * @generated
		 */
		EClass SUCCESSION_ITEM_FLOW = eINSTANCE.getSuccessionItemFlow();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl
		 * <em>Instance Creation Expression</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getInstanceCreationExpression()
		 * @generated
		 */
		EClass INSTANCE_CREATION_EXPRESSION = eINSTANCE.getInstanceCreationExpression();

		/**
		 * The meta object literal for the '<em><b>Instantiated Type</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE = eINSTANCE
				.getInstanceCreationExpression_InstantiatedType();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.NullExpressionImpl <em>Null
		 * Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.NullExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getNullExpression()
		 * @generated
		 */
		EClass NULL_EXPRESSION = eINSTANCE.getNullExpression();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl
		 * <em>Sequence Construction Expression</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getSequenceConstructionExpression()
		 * @generated
		 */
		EClass SEQUENCE_CONSTRUCTION_EXPRESSION = eINSTANCE.getSequenceConstructionExpression();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT = eINSTANCE.getSequenceConstructionExpression_Element();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.impl.FeatureReferenceExpressionImpl
		 * <em>Feature Reference Expression</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.impl.FeatureReferenceExpressionImpl
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureReferenceExpression()
		 * @generated
		 */
		EClass FEATURE_REFERENCE_EXPRESSION = eINSTANCE.getFeatureReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Referent</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FEATURE_REFERENCE_EXPRESSION__REFERENT = eINSTANCE.getFeatureReferenceExpression_Referent();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.VisibilityKind <em>Visibility Kind</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.VisibilityKind
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

		/**
		 * The meta object literal for the
		 * '{@link org.omg.sysml.lang.sysml.FeatureDirectionKind <em>Feature Direction
		 * Kind</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
		 * @see org.omg.sysml.lang.sysml.impl.SysMLPackageImpl#getFeatureDirectionKind()
		 * @generated
		 */
		EEnum FEATURE_DIRECTION_KIND = eINSTANCE.getFeatureDirectionKind();

	}

} // SysMLPackage
