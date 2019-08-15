/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.omg.sysml.lang.sysml.AcceptAction;
import org.omg.sysml.lang.sysml.Action;
import org.omg.sysml.lang.sysml.Activity;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.AssociationBlock;
import org.omg.sysml.lang.sysml.AtomicInteraction;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Block;
import org.omg.sysml.lang.sysml.BlockExpression;
import org.omg.sysml.lang.sysml.BlockProperty;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.ValueProperty;
import org.omg.sysml.lang.sysml.ValueType;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.InterfaceConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.ForkAction;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.InstanceCreationExpression;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.InterfaceDefinition;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.JoinAction;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralReal;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.LiteralUnbounded;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.MergeAction;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.OfSuccession;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.OrderedFeature;
import org.omg.sysml.lang.sysml.Ownership;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.PartProperty;
import org.omg.sysml.lang.sysml.PerformAction;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.QueryPathExpression;
import org.omg.sysml.lang.sysml.QueryPathStepExpression;
import org.omg.sysml.lang.sysml.QueryQualifierExpression;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReferenceProperty;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SendAction;
import org.omg.sysml.lang.sysml.SequenceConstructionExpression;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.StructuredFeature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TargetEnd;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.DecisionAction;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.DoAction;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.types.TypesPackage;
import org.omg.sysml.lang.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysMLPackageImpl extends EPackageImpl implements SysMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endFeatureMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superclassingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ofSuccessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnParameterMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryPathStepExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryQualifierExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryPathExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUnboundedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemFlowEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemFlowFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successionItemFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceCreationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceConstructionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureReferenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureDirectionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SysMLPackageImpl() {
		super(eNS_URI, SysMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SysMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SysMLPackage init() {
		if (isInited) return (SysMLPackage)EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSysMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SysMLPackageImpl theSysMLPackage = registeredSysMLPackage instanceof SysMLPackageImpl ? (SysMLPackageImpl)registeredSysMLPackage : new SysMLPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theSysMLPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theSysMLPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSysMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, theSysMLPackage);
		return theSysMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndFeatureMembership() {
		return endFeatureMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureMembership() {
		return featureMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureMembership_OwnedMemberFeature() {
		return (EReference)featureMembershipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureMembership_IsComposite() {
		return (EAttribute)featureMembershipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureMembership_IsDerived() {
		return (EAttribute)featureMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureMembership_IsReadOnly() {
		return (EAttribute)featureMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureMembership_MemberFeature() {
		return (EReference)featureMembershipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureMembership_IsPortion() {
		return (EAttribute)featureMembershipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureMembership_IsPort() {
		return (EAttribute)featureMembershipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureMembership_Direction() {
		return (EAttribute)featureMembershipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureMembership_OwningType() {
		return (EReference)featureMembershipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMembership() {
		return membershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMembership_OwnedMemberElement() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMembership_MembershipOwningPackage() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembership_MemberName() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembership_Visibility() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembership_Aliases() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMembership_MemberElement() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMembership__IsDistinguishableFrom__Membership() {
		return membershipEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_OwnedRelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_OwningRelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_RelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwningMembership() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwningRelationship() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Identifier() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwningNamespace() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedRelationship() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Owner() {
		return (EReference)elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Membership() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_OwnedImport() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Member() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_OwnedMembership() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_ImportedMembership() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_OwnedMember() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackage__NameOf__Element() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackage__ExcludeCollisions__EList() {
		return packageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackage__PublicMemberships() {
		return packageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_ImportedPackage() {
		return (EReference)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_Selecter() {
		return (EReference)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_Visibility() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_ImportOwningPackage() {
		return (EReference)importEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImport__ImportedMembership() {
		return importEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Expression() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Result() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavior_Step() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehavior_Parameter() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassifier_OwnedSuperclassing() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedGeneralization() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedFeatureMembership() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Feature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Input() {
		return (EReference)typeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Output() {
		return (EReference)typeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getType_IsAbstract() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_InheritedMembership() {
		return (EReference)typeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_EndFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getType_IsSufficient() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedEndFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_General() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_Specific() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeneralization_OwningType() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_ReferencedType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwningType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsUnique() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsOrdered() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Type() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedRedefinition() {
		return (EReference)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedSubsetting() {
		return (EReference)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwningFeatureMembership() {
		return (EReference)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsComposite() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Valuation() {
		return (EReference)featureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Multiplicity() {
		return (EReference)featureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Typing() {
		return (EReference)featureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsEnd() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_EndOwningType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsNonunique() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRedefinition() {
		return redefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRedefinition_RedefiningFeature() {
		return (EReference)redefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRedefinition_RedefinedFeature() {
		return (EReference)redefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubsetting() {
		return subsettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubsetting_SubsettedFeature() {
		return (EReference)subsettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubsetting_SubsettingFeature() {
		return (EReference)subsettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubsetting_OwningFeature() {
		return (EReference)subsettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureValue() {
		return featureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureValue_Value() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureValue_FeatureWithValue() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Function() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Behavior() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplicity() {
		return multiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicity_Lower() {
		return (EReference)multiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicity_Upper() {
		return (EReference)multiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicity_FeatureWithMultiplicity() {
		return (EReference)multiplicityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureTyping() {
		return featureTypingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTyping_Type() {
		return (EReference)featureTypingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTyping_TypedFeature() {
		return (EReference)featureTypingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperclassing() {
		return superclassingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperclassing_Superclass() {
		return (EReference)superclassingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperclassing_Subclass() {
		return (EReference)superclassingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperclassing_OwningClassifier() {
		return (EReference)superclassingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_RelatedType() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_OwningConnector() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_AssociationEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_RelatedFeature() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Association() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_IsDirected() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_ConnectorEnd() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_OwnedAssociationType() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__Path__Feature() {
		return connectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_ActionOwningDefinition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_ActionOwningUsage() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Activity() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsage() {
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedUsage() {
		return (EReference)usageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_OwningUsage() {
		return (EReference)usageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_OwningDefinition() {
		return (EReference)usageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedPort() {
		return (EReference)usageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedProperty() {
		return (EReference)usageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_Property() {
		return (EReference)usageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedAction() {
		return (EReference)usageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedPort() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_FlowProperty() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedProperty() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_Property() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedAction() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedUsage() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortUsage() {
		return portUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortUsage_PortDefinition() {
		return (EReference)portUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortUsage_PortOwningUsage() {
		return (EReference)portUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortUsage_PortOwningDefinition() {
		return (EReference)portUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortDefinition() {
		return portDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_PropertyOwningDefinition() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_PropertyOwningUsage() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Action() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergeAction() {
		return mergeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformAction() {
		return performActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoAction() {
		return doActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcceptAction() {
		return acceptActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForkAction() {
		return forkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoinAction() {
		return joinActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionAction() {
		return decisionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendAction() {
		return sendActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceDefinition() {
		return interfaceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceDefinition_InterfaceEnd() {
		return (EReference)interfaceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorUsage() {
		return connectorUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceConnector() {
		return interfaceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceConnector_InterfaceDefinition() {
		return (EReference)interfaceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationBlock() {
		return associationBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockProperty() {
		return blockPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockProperty_Block() {
		return (EReference)blockPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceProperty() {
		return referencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartProperty() {
		return partPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueProperty() {
		return valuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValueProperty_ValueType() {
		return (EReference)valuePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfSuccession() {
		return ofSuccessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfSuccession_To() {
		return (EReference)ofSuccessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfSuccession_From() {
		return (EReference)ofSuccessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderedFeature() {
		return orderedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructuredFeature() {
		return structuredFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBindingConnector() {
		return bindingConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccession() {
		return successionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_CommentedElement() {
		return (EReference)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_AnnotationForComment() {
		return (EReference)commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_AnnotatedElement() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_AnnotatingComment() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtomicInteraction() {
		return atomicInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtomicInteraction_ItemType() {
		return (EReference)atomicInteractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOwnership() {
		return ownershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOwnership_OwningSource() {
		return (EReference)ownershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOwnership_OwnedTarget() {
		return (EReference)ownershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvocationExpression() {
		return invocationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockExpression() {
		return blockExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterMembership() {
		return parameterMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMembership_MemberParameter() {
		return (EReference)parameterMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMembership_OwnedMemberParameter() {
		return (EReference)parameterMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnParameterMembership() {
		return returnParameterMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryPathStepExpression() {
		return queryPathStepExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryQualifierExpression() {
		return queryQualifierExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryPathExpression() {
		return queryPathExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralReal() {
		return literalRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralReal_Value() {
		return (EAttribute)literalRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralUnbounded() {
		return literalUnboundedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralInteger() {
		return literalIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralInteger_Value() {
		return (EAttribute)literalIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemFlowEnd() {
		return itemFlowEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemFlowFeature() {
		return itemFlowFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemFeature() {
		return itemFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceEnd() {
		return sourceEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetEnd() {
		return targetEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatorExpression() {
		return operatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperatorExpression_Operator() {
		return (EAttribute)operatorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatorExpression_Operand() {
		return (EReference)operatorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralString() {
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralString_Value() {
		return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemFlow() {
		return itemFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_ItemType() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_TargetInputFeature() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_SourceOutputFeature() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_ItemFlowEnd() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_ItemFlowFeature() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_ItemFeature() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessionItemFlow() {
		return successionItemFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceCreationExpression() {
		return instanceCreationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceCreationExpression_InstantiatedType() {
		return (EReference)instanceCreationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullExpression() {
		return nullExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceConstructionExpression() {
		return sequenceConstructionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceConstructionExpression_Element() {
		return (EReference)sequenceConstructionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureReferenceExpression() {
		return featureReferenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureReferenceExpression_Referent() {
		return (EReference)featureReferenceExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeatureDirectionKind() {
		return featureDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SysMLFactory getSysMLFactory() {
		return (SysMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNING_MEMBERSHIP);
		createEReference(elementEClass, ELEMENT__OWNED_RELATIONSHIP);
		createEReference(elementEClass, ELEMENT__OWNING_RELATIONSHIP);
		createEReference(elementEClass, ELEMENT__OWNING_NAMESPACE);
		createEAttribute(elementEClass, ELEMENT__IDENTIFIER);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__OWNER);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);

		membershipEClass = createEClass(MEMBERSHIP);
		createEAttribute(membershipEClass, MEMBERSHIP__MEMBER_NAME);
		createEAttribute(membershipEClass, MEMBERSHIP__VISIBILITY);
		createEAttribute(membershipEClass, MEMBERSHIP__ALIASES);
		createEReference(membershipEClass, MEMBERSHIP__MEMBER_ELEMENT);
		createEReference(membershipEClass, MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE);
		createEReference(membershipEClass, MEMBERSHIP__OWNED_MEMBER_ELEMENT);
		createEOperation(membershipEClass, MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__OWNING_RELATED_ELEMENT);
		createEReference(relationshipEClass, RELATIONSHIP__OWNED_RELATED_ELEMENT);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__MEMBERSHIP);
		createEReference(packageEClass, PACKAGE__OWNED_IMPORT);
		createEReference(packageEClass, PACKAGE__MEMBER);
		createEReference(packageEClass, PACKAGE__OWNED_MEMBER);
		createEReference(packageEClass, PACKAGE__IMPORTED_MEMBERSHIP);
		createEReference(packageEClass, PACKAGE__OWNED_MEMBERSHIP);
		createEOperation(packageEClass, PACKAGE___NAME_OF__ELEMENT);
		createEOperation(packageEClass, PACKAGE___EXCLUDE_COLLISIONS__ELIST);
		createEOperation(packageEClass, PACKAGE___PUBLIC_MEMBERSHIPS);

		importEClass = createEClass(IMPORT);
		createEReference(importEClass, IMPORT__IMPORTED_PACKAGE);
		createEReference(importEClass, IMPORT__SELECTER);
		createEAttribute(importEClass, IMPORT__VISIBILITY);
		createEReference(importEClass, IMPORT__IMPORT_OWNING_PACKAGE);
		createEOperation(importEClass, IMPORT___IMPORTED_MEMBERSHIP);

		predicateEClass = createEClass(PREDICATE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__EXPRESSION);
		createEReference(functionEClass, FUNCTION__RESULT);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__STEP);
		createEReference(behaviorEClass, BEHAVIOR__PARAMETER);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__OWNED_SUPERCLASSING);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__OWNED_GENERALIZATION);
		createEReference(typeEClass, TYPE__OWNED_FEATURE_MEMBERSHIP);
		createEReference(typeEClass, TYPE__OWNED_FEATURE);
		createEReference(typeEClass, TYPE__OWNED_END_FEATURE);
		createEReference(typeEClass, TYPE__FEATURE);
		createEReference(typeEClass, TYPE__INPUT);
		createEReference(typeEClass, TYPE__OUTPUT);
		createEAttribute(typeEClass, TYPE__IS_ABSTRACT);
		createEReference(typeEClass, TYPE__INHERITED_MEMBERSHIP);
		createEReference(typeEClass, TYPE__END_FEATURE);
		createEAttribute(typeEClass, TYPE__IS_SUFFICIENT);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
		createEReference(generalizationEClass, GENERALIZATION__OWNING_TYPE);

		featureMembershipEClass = createEClass(FEATURE_MEMBERSHIP);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_DERIVED);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_READ_ONLY);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__MEMBER_FEATURE);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_COMPOSITE);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_PORTION);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_PORT);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__DIRECTION);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__OWNING_TYPE);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__REFERENCED_TYPE);
		createEReference(featureEClass, FEATURE__OWNING_TYPE);
		createEAttribute(featureEClass, FEATURE__IS_UNIQUE);
		createEAttribute(featureEClass, FEATURE__IS_ORDERED);
		createEReference(featureEClass, FEATURE__TYPE);
		createEReference(featureEClass, FEATURE__OWNED_TYPE);
		createEReference(featureEClass, FEATURE__OWNED_REDEFINITION);
		createEReference(featureEClass, FEATURE__OWNED_SUBSETTING);
		createEReference(featureEClass, FEATURE__OWNING_FEATURE_MEMBERSHIP);
		createEAttribute(featureEClass, FEATURE__IS_COMPOSITE);
		createEReference(featureEClass, FEATURE__VALUATION);
		createEReference(featureEClass, FEATURE__MULTIPLICITY);
		createEReference(featureEClass, FEATURE__TYPING);
		createEAttribute(featureEClass, FEATURE__IS_END);
		createEReference(featureEClass, FEATURE__END_OWNING_TYPE);
		createEAttribute(featureEClass, FEATURE__IS_NONUNIQUE);

		redefinitionEClass = createEClass(REDEFINITION);
		createEReference(redefinitionEClass, REDEFINITION__REDEFINING_FEATURE);
		createEReference(redefinitionEClass, REDEFINITION__REDEFINED_FEATURE);

		subsettingEClass = createEClass(SUBSETTING);
		createEReference(subsettingEClass, SUBSETTING__SUBSETTED_FEATURE);
		createEReference(subsettingEClass, SUBSETTING__SUBSETTING_FEATURE);
		createEReference(subsettingEClass, SUBSETTING__OWNING_FEATURE);

		featureValueEClass = createEClass(FEATURE_VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__FEATURE_WITH_VALUE);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__FUNCTION);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__BEHAVIOR);

		multiplicityEClass = createEClass(MULTIPLICITY);
		createEReference(multiplicityEClass, MULTIPLICITY__LOWER);
		createEReference(multiplicityEClass, MULTIPLICITY__UPPER);
		createEReference(multiplicityEClass, MULTIPLICITY__FEATURE_WITH_MULTIPLICITY);

		featureTypingEClass = createEClass(FEATURE_TYPING);
		createEReference(featureTypingEClass, FEATURE_TYPING__TYPE);
		createEReference(featureTypingEClass, FEATURE_TYPING__TYPED_FEATURE);

		superclassingEClass = createEClass(SUPERCLASSING);
		createEReference(superclassingEClass, SUPERCLASSING__SUPERCLASS);
		createEReference(superclassingEClass, SUPERCLASSING__SUBCLASS);
		createEReference(superclassingEClass, SUPERCLASSING__OWNING_CLASSIFIER);

		parameterEClass = createEClass(PARAMETER);

		ownershipEClass = createEClass(OWNERSHIP);
		createEReference(ownershipEClass, OWNERSHIP__OWNING_SOURCE);
		createEReference(ownershipEClass, OWNERSHIP__OWNED_TARGET);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__ANNOTATING_COMMENT);
		createEReference(annotationEClass, ANNOTATION__ANNOTATED_ELEMENT);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEReference(commentEClass, COMMENT__COMMENTED_ELEMENT);
		createEReference(commentEClass, COMMENT__ANNOTATION_FOR_COMMENT);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__ACTION);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__OWNED_USAGE);
		createEReference(definitionEClass, DEFINITION__OWNED_PORT);
		createEReference(definitionEClass, DEFINITION__OWNED_PROPERTY);
		createEReference(definitionEClass, DEFINITION__OWNED_ACTION);
		createEReference(definitionEClass, DEFINITION__FLOW_PROPERTY);
		createEReference(definitionEClass, DEFINITION__PROPERTY);

		usageEClass = createEClass(USAGE);
		createEReference(usageEClass, USAGE__NESTED_USAGE);
		createEReference(usageEClass, USAGE__OWNING_USAGE);
		createEReference(usageEClass, USAGE__NESTED_PORT);
		createEReference(usageEClass, USAGE__NESTED_PROPERTY);
		createEReference(usageEClass, USAGE__PROPERTY);
		createEReference(usageEClass, USAGE__NESTED_ACTION);
		createEReference(usageEClass, USAGE__OWNING_DEFINITION);

		portUsageEClass = createEClass(PORT_USAGE);
		createEReference(portUsageEClass, PORT_USAGE__PORT_DEFINITION);
		createEReference(portUsageEClass, PORT_USAGE__PORT_OWNING_DEFINITION);
		createEReference(portUsageEClass, PORT_USAGE__PORT_OWNING_USAGE);

		portDefinitionEClass = createEClass(PORT_DEFINITION);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__PROPERTY_OWNING_DEFINITION);
		createEReference(propertyEClass, PROPERTY__PROPERTY_OWNING_USAGE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__ACTIVITY);
		createEReference(actionEClass, ACTION__ACTION_OWNING_DEFINITION);
		createEReference(actionEClass, ACTION__ACTION_OWNING_USAGE);

		blockPropertyEClass = createEClass(BLOCK_PROPERTY);
		createEReference(blockPropertyEClass, BLOCK_PROPERTY__BLOCK);

		classEClass = createEClass(CLASS);

		blockEClass = createEClass(BLOCK);

		associationBlockEClass = createEClass(ASSOCIATION_BLOCK);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__RELATED_TYPE);
		createEReference(associationEClass, ASSOCIATION__OWNING_CONNECTOR);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_END);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__RELATED_FEATURE);
		createEReference(connectorEClass, CONNECTOR__ASSOCIATION);
		createEAttribute(connectorEClass, CONNECTOR__IS_DIRECTED);
		createEReference(connectorEClass, CONNECTOR__CONNECTOR_END);
		createEReference(connectorEClass, CONNECTOR__OWNED_ASSOCIATION_TYPE);
		createEOperation(connectorEClass, CONNECTOR___PATH__FEATURE);

		partPropertyEClass = createEClass(PART_PROPERTY);

		interfaceDefinitionEClass = createEClass(INTERFACE_DEFINITION);
		createEReference(interfaceDefinitionEClass, INTERFACE_DEFINITION__INTERFACE_END);

		connectorUsageEClass = createEClass(CONNECTOR_USAGE);

		interfaceConnectorEClass = createEClass(INTERFACE_CONNECTOR);
		createEReference(interfaceConnectorEClass, INTERFACE_CONNECTOR__INTERFACE_DEFINITION);

		referencePropertyEClass = createEClass(REFERENCE_PROPERTY);

		valuePropertyEClass = createEClass(VALUE_PROPERTY);
		createEReference(valuePropertyEClass, VALUE_PROPERTY__VALUE_TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);

		valueTypeEClass = createEClass(VALUE_TYPE);

		joinActionEClass = createEClass(JOIN_ACTION);

		decisionActionEClass = createEClass(DECISION_ACTION);

		performActionEClass = createEClass(PERFORM_ACTION);

		acceptActionEClass = createEClass(ACCEPT_ACTION);

		mergeActionEClass = createEClass(MERGE_ACTION);

		sendActionEClass = createEClass(SEND_ACTION);

		forkActionEClass = createEClass(FORK_ACTION);

		doActionEClass = createEClass(DO_ACTION);

		invocationExpressionEClass = createEClass(INVOCATION_EXPRESSION);

		blockExpressionEClass = createEClass(BLOCK_EXPRESSION);

		instanceCreationExpressionEClass = createEClass(INSTANCE_CREATION_EXPRESSION);
		createEReference(instanceCreationExpressionEClass, INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE);

		queryQualifierExpressionEClass = createEClass(QUERY_QUALIFIER_EXPRESSION);

		operatorExpressionEClass = createEClass(OPERATOR_EXPRESSION);
		createEAttribute(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERATOR);
		createEReference(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERAND);

		featureReferenceExpressionEClass = createEClass(FEATURE_REFERENCE_EXPRESSION);
		createEReference(featureReferenceExpressionEClass, FEATURE_REFERENCE_EXPRESSION__REFERENT);

		sequenceConstructionExpressionEClass = createEClass(SEQUENCE_CONSTRUCTION_EXPRESSION);
		createEReference(sequenceConstructionExpressionEClass, SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT);

		queryPathExpressionEClass = createEClass(QUERY_PATH_EXPRESSION);

		queryPathStepExpressionEClass = createEClass(QUERY_PATH_STEP_EXPRESSION);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);

		literalUnboundedEClass = createEClass(LITERAL_UNBOUNDED);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		literalRealEClass = createEClass(LITERAL_REAL);
		createEAttribute(literalRealEClass, LITERAL_REAL__VALUE);

		nullExpressionEClass = createEClass(NULL_EXPRESSION);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		bindingConnectorEClass = createEClass(BINDING_CONNECTOR);

		itemFlowFeatureEClass = createEClass(ITEM_FLOW_FEATURE);

		itemFlowEndEClass = createEClass(ITEM_FLOW_END);

		atomicInteractionEClass = createEClass(ATOMIC_INTERACTION);
		createEReference(atomicInteractionEClass, ATOMIC_INTERACTION__ITEM_TYPE);

		itemFeatureEClass = createEClass(ITEM_FEATURE);

		itemFlowEClass = createEClass(ITEM_FLOW);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_TYPE);
		createEReference(itemFlowEClass, ITEM_FLOW__TARGET_INPUT_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__SOURCE_OUTPUT_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_FLOW_END);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_FLOW_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_FEATURE);

		successionItemFlowEClass = createEClass(SUCCESSION_ITEM_FLOW);

		successionEClass = createEClass(SUCCESSION);

		interactionEClass = createEClass(INTERACTION);

		targetEndEClass = createEClass(TARGET_END);

		sourceEndEClass = createEClass(SOURCE_END);

		returnParameterMembershipEClass = createEClass(RETURN_PARAMETER_MEMBERSHIP);

		parameterMembershipEClass = createEClass(PARAMETER_MEMBERSHIP);
		createEReference(parameterMembershipEClass, PARAMETER_MEMBERSHIP__MEMBER_PARAMETER);
		createEReference(parameterMembershipEClass, PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER);

		structuredFeatureEClass = createEClass(STRUCTURED_FEATURE);

		ofSuccessionEClass = createEClass(OF_SUCCESSION);
		createEReference(ofSuccessionEClass, OF_SUCCESSION__TO);
		createEReference(ofSuccessionEClass, OF_SUCCESSION__FROM);

		orderedFeatureEClass = createEClass(ORDERED_FEATURE);

		endFeatureMembershipEClass = createEClass(END_FEATURE_MEMBERSHIP);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		featureDirectionKindEEnum = createEEnum(FEATURE_DIRECTION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		membershipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		packageEClass.getESuperTypes().add(this.getElement());
		importEClass.getESuperTypes().add(this.getRelationship());
		predicateEClass.getESuperTypes().add(this.getFunction());
		functionEClass.getESuperTypes().add(this.getBehavior());
		behaviorEClass.getESuperTypes().add(this.getClassifier());
		classifierEClass.getESuperTypes().add(this.getType());
		typeEClass.getESuperTypes().add(this.getPackage());
		generalizationEClass.getESuperTypes().add(this.getRelationship());
		featureMembershipEClass.getESuperTypes().add(this.getMembership());
		featureEClass.getESuperTypes().add(this.getType());
		redefinitionEClass.getESuperTypes().add(this.getSubsetting());
		subsettingEClass.getESuperTypes().add(this.getGeneralization());
		featureValueEClass.getESuperTypes().add(this.getRelationship());
		expressionEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(this.getFeature());
		multiplicityEClass.getESuperTypes().add(this.getRelationship());
		featureTypingEClass.getESuperTypes().add(this.getGeneralization());
		superclassingEClass.getESuperTypes().add(this.getGeneralization());
		parameterEClass.getESuperTypes().add(this.getFeature());
		ownershipEClass.getESuperTypes().add(this.getRelationship());
		annotationEClass.getESuperTypes().add(this.getRelationship());
		commentEClass.getESuperTypes().add(this.getElement());
		activityEClass.getESuperTypes().add(this.getDefinition());
		activityEClass.getESuperTypes().add(this.getBehavior());
		definitionEClass.getESuperTypes().add(this.getClassifier());
		usageEClass.getESuperTypes().add(this.getFeature());
		portUsageEClass.getESuperTypes().add(this.getUsage());
		portDefinitionEClass.getESuperTypes().add(this.getDefinition());
		propertyEClass.getESuperTypes().add(this.getUsage());
		actionEClass.getESuperTypes().add(this.getUsage());
		actionEClass.getESuperTypes().add(this.getStep());
		blockPropertyEClass.getESuperTypes().add(this.getProperty());
		classEClass.getESuperTypes().add(this.getClassifier());
		blockEClass.getESuperTypes().add(this.getDefinition());
		blockEClass.getESuperTypes().add(this.getClass_());
		associationBlockEClass.getESuperTypes().add(this.getAssociation());
		associationBlockEClass.getESuperTypes().add(this.getBlock());
		associationEClass.getESuperTypes().add(this.getClass_());
		associationEClass.getESuperTypes().add(this.getRelationship());
		connectorEClass.getESuperTypes().add(this.getFeature());
		connectorEClass.getESuperTypes().add(this.getRelationship());
		partPropertyEClass.getESuperTypes().add(this.getBlockProperty());
		interfaceDefinitionEClass.getESuperTypes().add(this.getAssociationBlock());
		connectorUsageEClass.getESuperTypes().add(this.getConnector());
		connectorUsageEClass.getESuperTypes().add(this.getUsage());
		interfaceConnectorEClass.getESuperTypes().add(this.getConnectorUsage());
		referencePropertyEClass.getESuperTypes().add(this.getBlockProperty());
		valuePropertyEClass.getESuperTypes().add(this.getProperty());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		valueTypeEClass.getESuperTypes().add(this.getDefinition());
		valueTypeEClass.getESuperTypes().add(this.getDataType());
		joinActionEClass.getESuperTypes().add(this.getAction());
		decisionActionEClass.getESuperTypes().add(this.getAction());
		performActionEClass.getESuperTypes().add(this.getAction());
		acceptActionEClass.getESuperTypes().add(this.getAction());
		mergeActionEClass.getESuperTypes().add(this.getAction());
		sendActionEClass.getESuperTypes().add(this.getAction());
		forkActionEClass.getESuperTypes().add(this.getAction());
		doActionEClass.getESuperTypes().add(this.getAction());
		invocationExpressionEClass.getESuperTypes().add(this.getExpression());
		blockExpressionEClass.getESuperTypes().add(this.getExpression());
		instanceCreationExpressionEClass.getESuperTypes().add(this.getInvocationExpression());
		queryQualifierExpressionEClass.getESuperTypes().add(this.getOperatorExpression());
		operatorExpressionEClass.getESuperTypes().add(this.getInvocationExpression());
		featureReferenceExpressionEClass.getESuperTypes().add(this.getExpression());
		sequenceConstructionExpressionEClass.getESuperTypes().add(this.getExpression());
		queryPathExpressionEClass.getESuperTypes().add(this.getFeatureReferenceExpression());
		queryPathStepExpressionEClass.getESuperTypes().add(this.getOperatorExpression());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralExpression());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		literalUnboundedEClass.getESuperTypes().add(this.getLiteralExpression());
		literalStringEClass.getESuperTypes().add(this.getLiteralExpression());
		literalRealEClass.getESuperTypes().add(this.getLiteralExpression());
		nullExpressionEClass.getESuperTypes().add(this.getExpression());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralExpression());
		bindingConnectorEClass.getESuperTypes().add(this.getConnector());
		itemFlowFeatureEClass.getESuperTypes().add(this.getFeature());
		itemFlowEndEClass.getESuperTypes().add(this.getFeature());
		itemFeatureEClass.getESuperTypes().add(this.getFeature());
		itemFlowEClass.getESuperTypes().add(this.getConnector());
		itemFlowEClass.getESuperTypes().add(this.getStep());
		successionItemFlowEClass.getESuperTypes().add(this.getItemFlow());
		successionItemFlowEClass.getESuperTypes().add(this.getSuccession());
		successionEClass.getESuperTypes().add(this.getConnector());
		interactionEClass.getESuperTypes().add(this.getAssociation());
		interactionEClass.getESuperTypes().add(this.getBehavior());
		targetEndEClass.getESuperTypes().add(this.getFeature());
		sourceEndEClass.getESuperTypes().add(this.getFeature());
		returnParameterMembershipEClass.getESuperTypes().add(this.getParameterMembership());
		parameterMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		structuredFeatureEClass.getESuperTypes().add(this.getFeature());
		orderedFeatureEClass.getESuperTypes().add(this.getStructuredFeature());
		endFeatureMembershipEClass.getESuperTypes().add(this.getFeatureMembership());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwningMembership(), this.getMembership(), this.getMembership_OwnedMemberElement(), "owningMembership", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedRelationship(), this.getRelationship(), this.getRelationship_OwningRelatedElement(), "ownedRelationship", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwningRelationship(), this.getRelationship(), this.getRelationship_OwnedRelatedElement(), "owningRelationship", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwningNamespace(), this.getPackage(), this.getPackage_OwnedMember(), "owningNamespace", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Name(), theTypesPackage.getString(), "name", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(membershipEClass, Membership.class, "Membership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMembership_MemberName(), theTypesPackage.getString(), "memberName", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMembership_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMembership_Aliases(), theTypesPackage.getString(), "aliases", null, 0, -1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_MemberElement(), this.getElement(), null, "memberElement", null, 1, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_MembershipOwningPackage(), this.getPackage(), this.getPackage_OwnedMembership(), "membershipOwningPackage", null, 1, 1, Membership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_OwnedMemberElement(), this.getElement(), this.getElement_OwningMembership(), "ownedMemberElement", null, 0, 1, Membership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getMembership__IsDistinguishableFrom__Membership(), theTypesPackage.getBoolean(), "isDistinguishableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMembership(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 2, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_Target(), this.getElement(), null, "target", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_Source(), this.getElement(), null, "source", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_OwningRelatedElement(), this.getElement(), this.getElement_OwnedRelationship(), "owningRelatedElement", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_OwnedRelatedElement(), this.getElement(), this.getElement_OwningRelationship(), "ownedRelatedElement", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageEClass, org.omg.sysml.lang.sysml.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Membership(), this.getMembership(), null, "membership", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedImport(), this.getImport(), this.getImport_ImportOwningPackage(), "ownedImport", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Member(), this.getElement(), null, "member", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedMember(), this.getElement(), this.getElement_OwningNamespace(), "ownedMember", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_ImportedMembership(), this.getMembership(), null, "importedMembership", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedMembership(), this.getMembership(), this.getMembership_MembershipOwningPackage(), "ownedMembership", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPackage__NameOf__Element(), theTypesPackage.getString(), "nameOf", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__ExcludeCollisions__EList(), this.getMembership(), "excludeCollisions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMembership(), "mem", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__PublicMemberships(), this.getMembership(), "publicMemberships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImport_ImportedPackage(), this.getPackage(), null, "importedPackage", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImport_Selecter(), this.getPredicate(), null, "selecter", null, 0, 1, Import.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImport_ImportOwningPackage(), this.getPackage(), this.getPackage_OwnedImport(), "importOwningPackage", null, 1, 1, Import.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getImport__ImportedMembership(), this.getMembership(), "importedMembership", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Expression(), this.getExpression(), null, "expression", null, 0, -1, Function.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFunction_Result(), this.getParameter(), null, "result", null, 1, 1, Function.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Step(), this.getStep(), null, "step", null, 0, -1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_OwnedSuperclassing(), this.getSuperclassing(), this.getSuperclassing_OwningClassifier(), "ownedSuperclassing", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_OwnedGeneralization(), this.getGeneralization(), this.getGeneralization_OwningType(), "ownedGeneralization", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedFeatureMembership(), this.getFeatureMembership(), this.getFeatureMembership_OwningType(), "ownedFeatureMembership", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedFeature(), this.getFeature(), this.getFeature_OwningType(), "ownedFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_OwnedEndFeature(), this.getFeature(), this.getFeature_EndOwningType(), "ownedEndFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Feature(), this.getFeature(), null, "feature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Input(), this.getFeature(), null, "input", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Output(), this.getFeature(), null, "output", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getType_IsAbstract(), theTypesPackage.getBoolean(), "isAbstract", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_InheritedMembership(), this.getMembership(), null, "inheritedMembership", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_EndFeature(), this.getFeature(), null, "endFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getType_IsSufficient(), theTypesPackage.getBoolean(), "isSufficient", "false", 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_General(), this.getType(), null, "general", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_Specific(), this.getType(), null, "specific", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_OwningType(), this.getType(), this.getType_OwnedGeneralization(), "owningType", null, 0, 1, Generalization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureMembershipEClass, FeatureMembership.class, "FeatureMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureMembership_IsDerived(), theTypesPackage.getBoolean(), "isDerived", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_IsReadOnly(), theTypesPackage.getBoolean(), "isReadOnly", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureMembership_MemberFeature(), this.getFeature(), null, "memberFeature", null, 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureMembership_OwnedMemberFeature(), this.getFeature(), this.getFeature_OwningFeatureMembership(), "ownedMemberFeature", null, 0, 1, FeatureMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_IsComposite(), theTypesPackage.getBoolean(), "isComposite", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_IsPortion(), theTypesPackage.getBoolean(), "isPortion", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_IsPort(), theTypesPackage.getBoolean(), "isPort", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_Direction(), this.getFeatureDirectionKind(), "direction", null, 0, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureMembership_OwningType(), this.getType(), this.getType_OwnedFeatureMembership(), "owningType", null, 1, 1, FeatureMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_ReferencedType(), this.getType(), null, "referencedType", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwningType(), this.getType(), this.getType_OwnedFeature(), "owningType", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsUnique(), theTypesPackage.getBoolean(), "isUnique", "true", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsOrdered(), theTypesPackage.getBoolean(), "isOrdered", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Type(), this.getType(), null, "type", null, 1, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedType(), this.getType(), null, "ownedType", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedRedefinition(), this.getRedefinition(), null, "ownedRedefinition", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedSubsetting(), this.getSubsetting(), this.getSubsetting_OwningFeature(), "ownedSubsetting", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwningFeatureMembership(), this.getFeatureMembership(), this.getFeatureMembership_OwnedMemberFeature(), "owningFeatureMembership", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsComposite(), theTypesPackage.getBoolean(), "isComposite", null, 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Valuation(), this.getFeatureValue(), this.getFeatureValue_FeatureWithValue(), "valuation", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Multiplicity(), this.getMultiplicity(), this.getMultiplicity_FeatureWithMultiplicity(), "multiplicity", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Typing(), this.getFeatureTyping(), this.getFeatureTyping_TypedFeature(), "typing", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsEnd(), theTypesPackage.getBoolean(), "isEnd", null, 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_EndOwningType(), this.getType(), this.getType_OwnedEndFeature(), "endOwningType", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsNonunique(), theTypesPackage.getBoolean(), "isNonunique", "false", 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(redefinitionEClass, Redefinition.class, "Redefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedefinition_RedefiningFeature(), this.getFeature(), null, "redefiningFeature", null, 1, 1, Redefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinition_RedefinedFeature(), this.getFeature(), null, "redefinedFeature", null, 1, 1, Redefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subsettingEClass, Subsetting.class, "Subsetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubsetting_SubsettedFeature(), this.getFeature(), null, "subsettedFeature", null, 1, 1, Subsetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubsetting_SubsettingFeature(), this.getFeature(), null, "subsettingFeature", null, 1, 1, Subsetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubsetting_OwningFeature(), this.getFeature(), this.getFeature_OwnedSubsetting(), "owningFeature", null, 0, 1, Subsetting.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureValueEClass, FeatureValue.class, "FeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_Value(), this.getExpression(), null, "value", null, 0, 1, FeatureValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureValue_FeatureWithValue(), this.getFeature(), this.getFeature_Valuation(), "featureWithValue", null, 1, 1, FeatureValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Function(), this.getFunction(), null, "function", null, 1, 1, Expression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Behavior(), this.getBehavior(), null, "behavior", null, 1, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicity_Lower(), this.getExpression(), null, "lower", null, 0, 1, Multiplicity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicity_Upper(), this.getExpression(), null, "upper", null, 1, 1, Multiplicity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicity_FeatureWithMultiplicity(), this.getFeature(), this.getFeature_Multiplicity(), "featureWithMultiplicity", null, 0, 1, Multiplicity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureTypingEClass, FeatureTyping.class, "FeatureTyping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureTyping_Type(), this.getType(), null, "type", null, 1, 1, FeatureTyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureTyping_TypedFeature(), this.getFeature(), this.getFeature_Typing(), "typedFeature", null, 1, 1, FeatureTyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(superclassingEClass, Superclassing.class, "Superclassing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperclassing_Superclass(), this.getClassifier(), null, "superclass", null, 1, 1, Superclassing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSuperclassing_Subclass(), this.getClassifier(), null, "subclass", null, 1, 1, Superclassing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSuperclassing_OwningClassifier(), this.getClassifier(), this.getClassifier_OwnedSuperclassing(), "owningClassifier", null, 0, 1, Superclassing.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ownershipEClass, Ownership.class, "Ownership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwnership_OwningSource(), this.getElement(), null, "owningSource", null, 1, 1, Ownership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOwnership_OwnedTarget(), this.getElement(), null, "ownedTarget", null, 1, 1, Ownership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_AnnotatingComment(), this.getComment(), this.getComment_AnnotationForComment(), "annotatingComment", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotation_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Body(), theTypesPackage.getString(), "body", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComment_CommentedElement(), this.getElement(), null, "commentedElement", null, 1, 1, Comment.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComment_AnnotationForComment(), this.getAnnotation(), this.getAnnotation_AnnotatingComment(), "annotationForComment", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Action(), this.getAction(), null, "action", null, 0, -1, Activity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinition_OwnedUsage(), this.getUsage(), this.getUsage_OwningDefinition(), "ownedUsage", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedPort(), this.getPortUsage(), this.getPortUsage_PortOwningDefinition(), "ownedPort", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedProperty(), this.getProperty(), this.getProperty_PropertyOwningDefinition(), "ownedProperty", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedAction(), this.getAction(), this.getAction_ActionOwningDefinition(), "ownedAction", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_FlowProperty(), this.getProperty(), null, "flowProperty", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_Property(), this.getProperty(), null, "property", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(usageEClass, Usage.class, "Usage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsage_NestedUsage(), this.getUsage(), this.getUsage_OwningUsage(), "nestedUsage", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_OwningUsage(), this.getUsage(), this.getUsage_NestedUsage(), "owningUsage", null, 0, 1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedPort(), this.getPortUsage(), this.getPortUsage_PortOwningUsage(), "nestedPort", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedProperty(), this.getProperty(), this.getProperty_PropertyOwningUsage(), "nestedProperty", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_Property(), this.getProperty(), null, "property", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedAction(), this.getAction(), this.getAction_ActionOwningUsage(), "nestedAction", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_OwningDefinition(), this.getDefinition(), this.getDefinition_OwnedUsage(), "owningDefinition", null, 0, 1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(portUsageEClass, PortUsage.class, "PortUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortUsage_PortDefinition(), this.getPortDefinition(), null, "portDefinition", null, 1, 1, PortUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPortUsage_PortOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedPort(), "portOwningDefinition", null, 0, 1, PortUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPortUsage_PortOwningUsage(), this.getUsage(), this.getUsage_NestedPort(), "portOwningUsage", null, 0, 1, PortUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(portDefinitionEClass, PortDefinition.class, "PortDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_PropertyOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedProperty(), "propertyOwningDefinition", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_PropertyOwningUsage(), this.getUsage(), this.getUsage_NestedProperty(), "propertyOwningUsage", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Activity(), this.getBehavior(), null, "activity", null, 1, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_ActionOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedAction(), "actionOwningDefinition", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_ActionOwningUsage(), this.getUsage(), this.getUsage_NestedAction(), "actionOwningUsage", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(blockPropertyEClass, BlockProperty.class, "BlockProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockProperty_Block(), this.getClass_(), null, "block", null, 1, 1, BlockProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(classEClass, org.omg.sysml.lang.sysml.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationBlockEClass, AssociationBlock.class, "AssociationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_RelatedType(), this.getType(), null, "relatedType", null, 2, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_OwningConnector(), this.getConnector(), this.getConnector_OwnedAssociationType(), "owningConnector", null, 0, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_AssociationEnd(), this.getFeature(), null, "associationEnd", null, 2, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_RelatedFeature(), this.getFeature(), null, "relatedFeature", null, 2, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_Association(), this.getAssociation(), null, "association", null, 1, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnector_IsDirected(), theTypesPackage.getBoolean(), "isDirected", "false", 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_ConnectorEnd(), this.getFeature(), null, "connectorEnd", null, 2, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_OwnedAssociationType(), this.getAssociation(), this.getAssociation_OwningConnector(), "ownedAssociationType", null, 0, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConnector__Path__Feature(), this.getFeature(), "path", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "relatedFeature", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(partPropertyEClass, PartProperty.class, "PartProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceDefinitionEClass, InterfaceDefinition.class, "InterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDefinition_InterfaceEnd(), this.getPortUsage(), null, "interfaceEnd", null, 2, -1, InterfaceDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(connectorUsageEClass, ConnectorUsage.class, "ConnectorUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceConnectorEClass, InterfaceConnector.class, "InterfaceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceConnector_InterfaceDefinition(), this.getInterfaceDefinition(), null, "interfaceDefinition", null, 1, 1, InterfaceConnector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(referencePropertyEClass, ReferenceProperty.class, "ReferenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuePropertyEClass, ValueProperty.class, "ValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueProperty_ValueType(), this.getDataType(), null, "valueType", null, 1, 1, ValueProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinActionEClass, JoinAction.class, "JoinAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionActionEClass, DecisionAction.class, "DecisionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(performActionEClass, PerformAction.class, "PerformAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(acceptActionEClass, AcceptAction.class, "AcceptAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeActionEClass, MergeAction.class, "MergeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendActionEClass, SendAction.class, "SendAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkActionEClass, ForkAction.class, "ForkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doActionEClass, DoAction.class, "DoAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invocationExpressionEClass, InvocationExpression.class, "InvocationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockExpressionEClass, BlockExpression.class, "BlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceCreationExpressionEClass, InstanceCreationExpression.class, "InstanceCreationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceCreationExpression_InstantiatedType(), this.getType(), null, "instantiatedType", null, 1, 1, InstanceCreationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(queryQualifierExpressionEClass, QueryQualifierExpression.class, "QueryQualifierExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorExpressionEClass, OperatorExpression.class, "OperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatorExpression_Operator(), theTypesPackage.getString(), "operator", null, 1, 1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperatorExpression_Operand(), this.getExpression(), null, "operand", null, 0, -1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureReferenceExpressionEClass, FeatureReferenceExpression.class, "FeatureReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureReferenceExpression_Referent(), this.getFeature(), null, "referent", null, 1, 1, FeatureReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sequenceConstructionExpressionEClass, SequenceConstructionExpression.class, "SequenceConstructionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceConstructionExpression_Element(), this.getExpression(), null, "element", null, 0, -1, SequenceConstructionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryPathExpressionEClass, QueryPathExpression.class, "QueryPathExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryPathStepExpressionEClass, QueryPathStepExpression.class, "QueryPathStepExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), theTypesPackage.getBoolean(), "value", null, 1, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalUnboundedEClass, LiteralUnbounded.class, "LiteralUnbounded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralString_Value(), theTypesPackage.getString(), "value", null, 1, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalRealEClass, LiteralReal.class, "LiteralReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralReal_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, LiteralReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nullExpressionEClass, NullExpression.class, "NullExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralInteger_Value(), theTypesPackage.getInteger(), "value", null, 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bindingConnectorEClass, BindingConnector.class, "BindingConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemFlowFeatureEClass, ItemFlowFeature.class, "ItemFlowFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemFlowEndEClass, ItemFlowEnd.class, "ItemFlowEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicInteractionEClass, AtomicInteraction.class, "AtomicInteraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicInteraction_ItemType(), this.getClassifier(), null, "itemType", null, 1, -1, AtomicInteraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(itemFeatureEClass, ItemFeature.class, "ItemFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemFlowEClass, ItemFlow.class, "ItemFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemFlow_ItemType(), this.getClassifier(), null, "itemType", null, 1, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_TargetInputFeature(), this.getFeature(), null, "targetInputFeature", null, 1, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_SourceOutputFeature(), this.getFeature(), null, "sourceOutputFeature", null, 1, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_ItemFlowEnd(), this.getItemFlowEnd(), null, "itemFlowEnd", null, 2, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getItemFlow_ItemFlowFeature(), this.getItemFlowFeature(), null, "itemFlowFeature", null, 2, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getItemFlow_ItemFeature(), this.getItemFeature(), null, "itemFeature", null, 1, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(successionItemFlowEClass, SuccessionItemFlow.class, "SuccessionItemFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(successionEClass, Succession.class, "Succession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetEndEClass, TargetEnd.class, "TargetEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEndEClass, SourceEnd.class, "SourceEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnParameterMembershipEClass, ReturnParameterMembership.class, "ReturnParameterMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterMembershipEClass, ParameterMembership.class, "ParameterMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterMembership_MemberParameter(), this.getParameter(), null, "memberParameter", null, 1, 1, ParameterMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterMembership_OwnedMemberParameter(), this.getParameter(), null, "ownedMemberParameter", null, 1, 1, ParameterMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(structuredFeatureEClass, StructuredFeature.class, "StructuredFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ofSuccessionEClass, OfSuccession.class, "OfSuccession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOfSuccession_To(), this.getOrderedFeature(), null, "to", null, 1, 1, OfSuccession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOfSuccession_From(), this.getOrderedFeature(), null, "from", null, 1, 1, OfSuccession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(orderedFeatureEClass, OrderedFeature.class, "OrderedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endFeatureMembershipEClass, EndFeatureMembership.class, "EndFeatureMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);

		initEEnum(featureDirectionKindEEnum, FeatureDirectionKind.class, "FeatureDirectionKind");
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.IN);
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.INOUT);
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.OUT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// redefines
		createRedefinesAnnotations();
		// subsets
		createSubsetsAnnotations();
		// union
		createUnionAnnotations();
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";
		addAnnotation
		  (getMembership_MemberElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getMembership_MembershipOwningPackage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getImport_ImportOwningPackage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getFunction_Expression(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/step")
		   });
		addAnnotation
		  (getGeneralization_General(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getGeneralization_Specific(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getFeatureMembership_MemberFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/memberElement")
		   });
		addAnnotation
		  (getRedefinition_RedefiningFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Subsetting/subsettingFeature")
		   });
		addAnnotation
		  (getRedefinition_RedefinedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Subsetting/subsettedFeature")
		   });
		addAnnotation
		  (getSubsetting_SubsettedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/general")
		   });
		addAnnotation
		  (getSubsetting_SubsettingFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/specific")
		   });
		addAnnotation
		  (getSubsetting_OwningFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/owningType")
		   });
		addAnnotation
		  (getFeatureValue_Value(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getFeatureValue_FeatureWithValue(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getExpression_Function(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/behavior")
		   });
		addAnnotation
		  (getStep_Behavior(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/type")
		   });
		addAnnotation
		  (getMultiplicity_FeatureWithMultiplicity(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getFeatureTyping_Type(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/general")
		   });
		addAnnotation
		  (getFeatureTyping_TypedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/specific")
		   });
		addAnnotation
		  (getSuperclassing_Superclass(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/general")
		   });
		addAnnotation
		  (getSuperclassing_Subclass(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/specific")
		   });
		addAnnotation
		  (getSuperclassing_OwningClassifier(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/owningType")
		   });
		addAnnotation
		  (getOwnership_OwningSource(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getOwnership_OwnedTarget(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getAnnotation_AnnotatingComment(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getAnnotation_AnnotatedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getPortUsage_PortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/type")
		   });
		addAnnotation
		  (getPortUsage_PortOwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningDefinition")
		   });
		addAnnotation
		  (getPortUsage_PortOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningUsage")
		   });
		addAnnotation
		  (getProperty_PropertyOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningUsage")
		   });
		addAnnotation
		  (getAction_Activity(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/behavior")
		   });
		addAnnotation
		  (getAction_ActionOwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningDefinition")
		   });
		addAnnotation
		  (getAction_ActionOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningUsage")
		   });
		addAnnotation
		  (getBlockProperty_Block(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/type")
		   });
		addAnnotation
		  (getAssociation_RelatedType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getAssociation_AssociationEnd(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/endFeature")
		   });
		addAnnotation
		  (getConnector_Association(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/type")
		   });
		addAnnotation
		  (getConnector_OwnedAssociationType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/ownedType")
		   });
		addAnnotation
		  (getInterfaceDefinition_InterfaceEnd(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Association/associationEnd")
		   });
		addAnnotation
		  (getInterfaceConnector_InterfaceDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Connector/association")
		   });
		addAnnotation
		  (getValueProperty_ValueType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/type")
		   });
		addAnnotation
		  (getItemFlow_ItemFlowEnd(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Connector/connectorEnd")
		   });
		addAnnotation
		  (getParameterMembership_MemberParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/memberFeature")
		   });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		addAnnotation
		  (getMembership_OwnedMemberElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/memberElement")
		   });
		addAnnotation
		  (getRelationship_Target(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getRelationship_Source(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getRelationship_OwningRelatedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getRelationship_OwnedRelatedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getPackage_OwnedMember(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/member")
		   });
		addAnnotation
		  (getPackage_ImportedMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/membership")
		   });
		addAnnotation
		  (getPackage_OwnedMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/membership")
		   });
		addAnnotation
		  (getImport_ImportedPackage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getImport_Selecter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getFunction_Result(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Type/output")
		   });
		addAnnotation
		  (getBehavior_Step(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getBehavior_Parameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getClassifier_OwnedSuperclassing(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedGeneralization")
		   });
		addAnnotation
		  (getType_OwnedGeneralization(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getType_OwnedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Package/ownedMember")
		   });
		addAnnotation
		  (getType_OwnedEndFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/endFeature"),
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getType_Feature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/member")
		   });
		addAnnotation
		  (getType_Input(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getType_Output(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getType_InheritedMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/membership")
		   });
		addAnnotation
		  (getType_EndFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getGeneralization_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Generalization/specific"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getFeatureMembership_OwnedMemberFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/memberFeature")
		   });
		addAnnotation
		  (getFeature_ReferencedType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/type")
		   });
		addAnnotation
		  (getFeature_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owningNamespace")
		   });
		addAnnotation
		  (getFeature_OwnedType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/type"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getFeature_OwnedRedefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/ownedSubsetting")
		   });
		addAnnotation
		  (getFeature_OwnedSubsetting(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedGeneralization")
		   });
		addAnnotation
		  (getFeature_EndOwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/owningType")
		   });
		addAnnotation
		  (getMultiplicity_Lower(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getMultiplicity_Upper(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getOwnership_OwningSource(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getActivity_Action(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/step")
		   });
		addAnnotation
		  (getDefinition_OwnedUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getDefinition_OwnedPort(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedProperty(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_FlowProperty(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/property")
		   });
		addAnnotation
		  (getDefinition_Property(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getUsage_NestedUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getUsage_OwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/owningType")
		   });
		addAnnotation
		  (getUsage_NestedPort(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_NestedProperty(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_Property(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getUsage_NestedAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_OwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/owningType")
		   });
		addAnnotation
		  (getProperty_PropertyOwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningDefinition")
		   });
		addAnnotation
		  (getConnector_RelatedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getConnector_ConnectorEnd(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getItemFlow_ItemFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getParameterMembership_OwnedMemberParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ParameterMembership/memberParameter")
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getMembership_MemberElement(),
		   source,
		   new String[] {
			   "body", "membership"
		   });
		addAnnotation
		  (getRelationship_RelatedElement(),
		   source,
		   new String[] {
			   "body", "relationship"
		   });
		addAnnotation
		  (getRelationship_Target(),
		   source,
		   new String[] {
			   "body", "targetRelationship"
		   });
		addAnnotation
		  (getRelationship_Source(),
		   source,
		   new String[] {
			   "body", "sourceRelationship"
		   });
		addAnnotation
		  (getPackage_Membership(),
		   source,
		   new String[] {
			   "body", "package"
		   });
		addAnnotation
		  (getPackage_Member(),
		   source,
		   new String[] {
			   "body", "namespace"
		   });
		addAnnotation
		  (getPackage_ImportedMembership(),
		   source,
		   new String[] {
			   "body", "importingPackage"
		   });
		addAnnotation
		  (getImport_ImportedPackage(),
		   source,
		   new String[] {
			   "body", "import"
		   });
		addAnnotation
		  (getImport_Selecter(),
		   source,
		   new String[] {
			   "body", "import"
		   });
		addAnnotation
		  (getFunction_Expression(),
		   source,
		   new String[] {
			   "body", "computedFunction"
		   });
		addAnnotation
		  (getFunction_Result(),
		   source,
		   new String[] {
			   "body", "computingFunction"
		   });
		addAnnotation
		  (getBehavior_Step(),
		   source,
		   new String[] {
			   "body", "featuringBehavior"
		   });
		addAnnotation
		  (getBehavior_Parameter(),
		   source,
		   new String[] {
			   "body", "parameteredBehavior"
		   });
		addAnnotation
		  (getType_Feature(),
		   source,
		   new String[] {
			   "body", "featuringType"
		   });
		addAnnotation
		  (getType_Input(),
		   source,
		   new String[] {
			   "body", "typeWithInput"
		   });
		addAnnotation
		  (getType_Output(),
		   source,
		   new String[] {
			   "body", "typeWithOutput"
		   });
		addAnnotation
		  (getType_InheritedMembership(),
		   source,
		   new String[] {
			   "body", "inheritingtype"
		   });
		addAnnotation
		  (getType_EndFeature(),
		   source,
		   new String[] {
			   "body", "endFeaturingType"
		   });
		addAnnotation
		  (getGeneralization_General(),
		   source,
		   new String[] {
			   "body", "speciallization"
		   });
		addAnnotation
		  (getGeneralization_Specific(),
		   source,
		   new String[] {
			   "body", "generalization"
		   });
		addAnnotation
		  (getFeatureMembership_MemberFeature(),
		   source,
		   new String[] {
			   "body", "featureMembership"
		   });
		addAnnotation
		  (getFeature_ReferencedType(),
		   source,
		   new String[] {
			   "body", "referencingFeature"
		   });
		addAnnotation
		  (getFeature_Type(),
		   source,
		   new String[] {
			   "body", "typedFeature"
		   });
		addAnnotation
		  (getFeature_OwnedType(),
		   source,
		   new String[] {
			   "body", "owningFeature"
		   });
		addAnnotation
		  (getFeature_OwnedRedefinition(),
		   source,
		   new String[] {
			   "body", "owningFeature"
		   });
		addAnnotation
		  (getRedefinition_RedefiningFeature(),
		   source,
		   new String[] {
			   "body", "redefinition"
		   });
		addAnnotation
		  (getRedefinition_RedefinedFeature(),
		   source,
		   new String[] {
			   "body", "redefining"
		   });
		addAnnotation
		  (getSubsetting_SubsettedFeature(),
		   source,
		   new String[] {
			   "body", "subsetting"
		   });
		addAnnotation
		  (getSubsetting_SubsettingFeature(),
		   source,
		   new String[] {
			   "body", "supersetting"
		   });
		addAnnotation
		  (getFeatureValue_Value(),
		   source,
		   new String[] {
			   "body", "expressedValuation"
		   });
		addAnnotation
		  (getExpression_Function(),
		   source,
		   new String[] {
			   "body", "typedExpression"
		   });
		addAnnotation
		  (getStep_Behavior(),
		   source,
		   new String[] {
			   "body", "typedStep"
		   });
		addAnnotation
		  (getMultiplicity_Lower(),
		   source,
		   new String[] {
			   "body", "lowerMultiplicity"
		   });
		addAnnotation
		  (getMultiplicity_Upper(),
		   source,
		   new String[] {
			   "body", "upperMultiplicity"
		   });
		addAnnotation
		  (getFeatureTyping_Type(),
		   source,
		   new String[] {
			   "body", "typingByType"
		   });
		addAnnotation
		  (getSuperclassing_Superclass(),
		   source,
		   new String[] {
			   "body", "subclassing"
		   });
		addAnnotation
		  (getSuperclassing_Subclass(),
		   source,
		   new String[] {
			   "body", "superclassing"
		   });
		addAnnotation
		  (getOwnership_OwningSource(),
		   source,
		   new String[] {
			   "body", "sourceOwnership"
		   });
		addAnnotation
		  (getOwnership_OwnedTarget(),
		   source,
		   new String[] {
			   "body", "targetOwnership"
		   });
		addAnnotation
		  (getAnnotation_AnnotatedElement(),
		   source,
		   new String[] {
			   "body", "annotation"
		   });
		addAnnotation
		  (getComment_CommentedElement(),
		   source,
		   new String[] {
			   "body", "comment"
		   });
		addAnnotation
		  (getActivity_Action(),
		   source,
		   new String[] {
			   "body", "featuringActivity"
		   });
		addAnnotation
		  (getDefinition_FlowProperty(),
		   source,
		   new String[] {
			   "body", "definitionWithFlow"
		   });
		addAnnotation
		  (getDefinition_Property(),
		   source,
		   new String[] {
			   "body", "definitionWithProperty"
		   });
		addAnnotation
		  (getUsage_Property(),
		   source,
		   new String[] {
			   "body", "usageWithProperty"
		   });
		addAnnotation
		  (getPortUsage_PortDefinition(),
		   source,
		   new String[] {
			   "body", "definedPort"
		   });
		addAnnotation
		  (getAction_Activity(),
		   source,
		   new String[] {
			   "body", "definedAction"
		   });
		addAnnotation
		  (getBlockProperty_Block(),
		   source,
		   new String[] {
			   "body", "typedProperty"
		   });
		addAnnotation
		  (getAssociation_RelatedType(),
		   source,
		   new String[] {
			   "body", "association"
		   });
		addAnnotation
		  (getAssociation_AssociationEnd(),
		   source,
		   new String[] {
			   "body", "associationWithEnd"
		   });
		addAnnotation
		  (getConnector_RelatedFeature(),
		   source,
		   new String[] {
			   "body", "connector"
		   });
		addAnnotation
		  (getConnector_Association(),
		   source,
		   new String[] {
			   "body", "typedConnector"
		   });
		addAnnotation
		  (getConnector_ConnectorEnd(),
		   source,
		   new String[] {
			   "body", "featuringConnector"
		   });
		addAnnotation
		  (getInterfaceDefinition_InterfaceEnd(),
		   source,
		   new String[] {
			   "body", "interfaceDefinitionWithEnd"
		   });
		addAnnotation
		  (getInterfaceConnector_InterfaceDefinition(),
		   source,
		   new String[] {
			   "body", "interfaceConnector"
		   });
		addAnnotation
		  (getValueProperty_ValueType(),
		   source,
		   new String[] {
			   "body", "typedProperty"
		   });
		addAnnotation
		  (getOperatorExpression_Operand(),
		   source,
		   new String[] {
			   "body", "operatorExpression"
		   });
		addAnnotation
		  (getSequenceConstructionExpression_Element(),
		   source,
		   new String[] {
			   "body", "sequenceConstructionExpression"
		   });
		addAnnotation
		  (getParameterMembership_MemberParameter(),
		   source,
		   new String[] {
			   "body", "parameterMembership"
		   });
		addAnnotation
		  (getParameterMembership_OwnedMemberParameter(),
		   source,
		   new String[] {
			   "body", "owningParameterMembership"
		   });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";
		addAnnotation
		  (getRelationship_RelatedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPackage_Membership(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (ofSuccessionEClass,
		   source,
		   new String[] {
			   "originalName", "OFSuccession"
		   });
	}

} //SysMLPackageImpl
