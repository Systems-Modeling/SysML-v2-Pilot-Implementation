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
import org.omg.sysml.lang.sysml.*;
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
	private EClass transferActionUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendActionUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertConstraintUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptActionUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performActionUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateDefinitionEClass = null;

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
	private EClass conjugationEClass = null;

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
	private EClass transitionUsageEClass = null;

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
	private EClass requirementUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementDefinitionEClass = null;

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
	private EClass dataTypeEClass = null;

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
	private EClass conjugatedPortDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConjugationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionUsageEClass = null;

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
	private EClass stateUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanExpressionEClass = null;

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
	private EClass exhibitStateUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateSubactionMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjugatedPortTypingEClass = null;

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
	private EClass individualUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualDefinitionEClass = null;

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
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionUsageEClass = null;

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
	private EClass satisfyRequirementUsageEClass = null;

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
	private EClass bindingConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityRangeEClass = null;

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
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalImportEClass = null;

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
	private EClass lifeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSliceFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snapshotFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementConstraintMembershipEClass = null;

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
	private EClass transitionFeatureMembershipEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionFeatureKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateSubactionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requirementConstraintKindEEnum = null;

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
	public EClass getTransferActionUsage() {
		return transferActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferActionUsage_Context() {
		return (EReference)transferActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendActionUsage() {
		return sendActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendActionUsage_Target() {
		return (EReference)sendActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertConstraintUsage() {
		return assertConstraintUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertConstraintUsage_AssertedConstraint() {
		return (EReference)assertConstraintUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcceptActionUsage() {
		return acceptActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformActionUsage() {
		return performActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformActionUsage_PerformedAction() {
		return (EReference)performActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionDefinition() {
		return functionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionDefinition_FunctionInvocation() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateDefinition() {
		return stateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateDefinition_State() {
		return (EReference)stateDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateDefinition_EntryAction() {
		return (EReference)stateDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateDefinition_DoAction() {
		return (EReference)stateDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateDefinition_ExitAction() {
		return (EReference)stateDefinitionEClass.getEStructuralFeatures().get(3);
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
		return (EReference)featureMembershipEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConjugation() {
		return conjugationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConjugation_OriginalType() {
		return (EReference)conjugationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConjugation_ConjugatedType() {
		return (EReference)conjugationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConjugation_OwningType() {
		return (EReference)conjugationEClass.getEStructuralFeatures().get(2);
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
	public EReference getFeatureMembership_OwnedMemberFeature_comp() {
		return (EReference)featureMembershipEClass.getEStructuralFeatures().get(3);
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
		return (EReference)membershipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMembership_OwnedMemberElement_comp() {
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
	public EReference getMembership_MemberElement() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(2);
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
		return (EReference)relationshipEClass.getEStructuralFeatures().get(5);
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
	public EReference getRelationship_OwnedRelatedElement_comp() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
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
	public EReference getElement_OwnedRelationship_comp() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
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
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwningNamespace() {
		return (EReference)elementEClass.getEStructuralFeatures().get(4);
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
		return (EReference)elementEClass.getEStructuralFeatures().get(8);
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
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_OwnedImport_comp() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_OwnedImport() {
		return (EReference)packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackage__NamesOf__Element() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Member() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_OwnedMembership() {
		return (EReference)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_ImportedMembership() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_OwnedMembership_comp() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_OwnedMember() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getImport_Visibility() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_ImportOwningPackage() {
		return (EReference)importEClass.getEStructuralFeatures().get(2);
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
	public EClass getTransitionUsage() {
		return transitionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_Source() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_Target() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_TriggerAction() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_GuardExpression() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_EffectAction() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_Succession() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_TransitionOwningUsage() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(0);
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
	public EReference getType_OwnedFeatureMembership_comp() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedFeatureMembership() {
		return (EReference)typeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getType__DirectionOf__Feature() {
		return typeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Feature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Input() {
		return (EReference)typeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Output() {
		return (EReference)typeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getType_IsAbstract() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_InheritedMembership() {
		return (EReference)typeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_EndFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(8);
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
	public EReference getType_OwnedConjugator() {
		return (EReference)typeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Conjugator() {
		return (EReference)typeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getType_IsConjugated() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_FeatureMembership() {
		return (EReference)typeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_InheritedFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Multiplicity() {
		return (EReference)typeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedEndFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(9);
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
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
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
		return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsOrdered() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Type() {
		return (EReference)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedRedefinition() {
		return (EReference)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedSubsetting() {
		return (EReference)featureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwningFeatureMembership() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsComposite() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Typing() {
		return (EReference)featureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsEnd() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_EndOwningType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsNonunique() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__DirectionFor__Type() {
		return featureEClass.getEOperations().get(0);
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
	public EReference getFeatureValue_Value_comp() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureValue_Value() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureValue_FeatureWithValue() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureValue_ValueConnector() {
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
	public EReference getExpression_Result() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(1);
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
	public EReference getStep_Parameter() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
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
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_ConnectorEnd() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_OwnedAssociationType() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
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
		return (EReference)usageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedPort() {
		return (EReference)usageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedProperty() {
		return (EReference)usageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedState() {
		return (EReference)usageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedConstraint() {
		return (EReference)usageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedTransition() {
		return (EReference)usageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedRequirement() {
		return (EReference)usageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedFunction() {
		return (EReference)usageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_Property() {
		return (EReference)usageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedAction() {
		return (EReference)usageEClass.getEStructuralFeatures().get(11);
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
		return (EReference)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_FlowProperty() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(1);
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
		return (EReference)definitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedAction() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedState() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedConstraint() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedTransition() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedRequirement() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedFunction() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedUsage() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(10);
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
		return (EReference)portUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortUsage_PortOwningDefinition() {
		return (EReference)portUsageEClass.getEStructuralFeatures().get(2);
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
	public EReference getPortDefinition_ConjugatedPortDefinition() {
		return (EReference)portDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConjugatedPortDefinition() {
		return conjugatedPortDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConjugatedPortDefinition_OwnedPortConjugator() {
		return (EReference)conjugatedPortDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConjugatedPortDefinition_OriginalPortDefinition() {
		return (EReference)conjugatedPortDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortConjugation() {
		return portConjugationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortConjugation_OriginalPortDefinition() {
		return (EReference)portConjugationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPortConjugation_ConjugatedPortDefinition() {
		return (EReference)portConjugationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionUsage() {
		return actionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionUsage_Activity() {
		return (EReference)actionUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionUsage_ActionOwningUsage() {
		return (EReference)actionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionUsage_ActionOwningDefinition() {
		return (EReference)actionUsageEClass.getEStructuralFeatures().get(0);
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
	public EClass getStateUsage() {
		return stateUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_StateOwningUsage() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_StateDefinition() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_EntryAction() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_DoAction() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_ExitAction() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_StateOwningDefinition() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraintUsage() {
		return constraintUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintUsage_ConstraintDefinition() {
		return (EReference)constraintUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintUsage_ConstraintOwningUsage() {
		return (EReference)constraintUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintUsage_ConstraintOwningDefinition() {
		return (EReference)constraintUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvariant() {
		return invariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvariant_AssertionConnector() {
		return (EReference)invariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanExpression() {
		return booleanExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanExpression_Predicate() {
		return (EReference)booleanExpressionEClass.getEStructuralFeatures().get(0);
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
	public EClass getExhibitStateUsage() {
		return exhibitStateUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExhibitStateUsage_ExhibitedState() {
		return (EReference)exhibitStateUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateSubactionMembership() {
		return stateSubactionMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateSubactionMembership_Kind() {
		return (EAttribute)stateSubactionMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateSubactionMembership_Action_comp() {
		return (EReference)stateSubactionMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateSubactionMembership_Action() {
		return (EReference)stateSubactionMembershipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConjugatedPortTyping() {
		return conjugatedPortTypingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConjugatedPortTyping_PortDefinition() {
		return (EReference)conjugatedPortTypingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConjugatedPortTyping_ConjugatedPortDefinition() {
		return (EReference)conjugatedPortTypingEClass.getEStructuralFeatures().get(1);
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
	public EClass getIndividualUsage() {
		return individualUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualUsage_IndividualDefinition() {
		return (EReference)individualUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndividualUsage_IsTimeSlice() {
		return (EAttribute)individualUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndividualUsage_IsSnapshot() {
		return (EAttribute)individualUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualUsage_TimeSliceFeature() {
		return (EReference)individualUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualUsage_SnapshotFeature() {
		return (EReference)individualUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividualDefinition() {
		return individualDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualDefinition_LifeClass() {
		return (EReference)individualDefinitionEClass.getEStructuralFeatures().get(0);
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
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceUsage() {
		return interfaceUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceUsage_InterfaceDefinition() {
		return (EReference)interfaceUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraintDefinition() {
		return constraintDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionUsage() {
		return functionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionUsage_FunctionDefinition() {
		return (EReference)functionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionUsage_FunctionOwningUsage() {
		return (EReference)functionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionUsage_FunctionOwningDefinition() {
		return (EReference)functionUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionUsage() {
		return connectionUsageEClass;
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
	public EClass getSatisfyRequirementUsage() {
		return satisfyRequirementUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfyRequirementUsage_SatisfiedRequirement() {
		return (EReference)satisfyRequirementUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfyRequirementUsage_SatisfyingFeature() {
		return (EReference)satisfyRequirementUsageEClass.getEStructuralFeatures().get(1);
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
	public EClass getRequirementUsage() {
		return requirementUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_RequirementDefinition() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_RequirementOwningUsage() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_SubjectParameter() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementUsage_ReqId() {
		return (EAttribute)requirementUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementUsage_Text() {
		return (EAttribute)requirementUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_RequiredConstraint() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_AssumedConstraint() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_RequirementOwningDefinition() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementDefinition() {
		return requirementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDefinition_SubjectParameter() {
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementDefinition_ReqId() {
		return (EAttribute)requirementDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementDefinition_Text() {
		return (EAttribute)requirementDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDefinition_AssumedConstraint() {
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDefinition_RequiredConstraint() {
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(4);
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
	public EClass getMultiplicityRange() {
		return multiplicityRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicityRange_LowerBound() {
		return (EReference)multiplicityRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicityRange_UpperBound() {
		return (EReference)multiplicityRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiplicityRange_Bound() {
		return (EReference)multiplicityRangeEClass.getEStructuralFeatures().get(2);
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
	public EReference getSuccession_TriggerStep() {
		return (EReference)successionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccession_EffectStep() {
		return (EReference)successionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccession_GuardExpression() {
		return (EReference)successionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccession_TransitionStep() {
		return (EReference)successionEClass.getEStructuralFeatures().get(0);
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
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_AnnotatingComment() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
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
	public EClass getImportCondition() {
		return importConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportCondition_ConditionalImport() {
		return (EReference)importConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportCondition_Predicate_comp() {
		return (EReference)importConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportCondition_Predicate() {
		return (EReference)importConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalImport() {
		return conditionalImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalImport_Selector() {
		return (EReference)conditionalImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalImport_Condition_comp() {
		return (EReference)conditionalImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalImport_Condition() {
		return (EReference)conditionalImportEClass.getEStructuralFeatures().get(2);
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
	public EReference getOwnership_OwnedTarget_comp() {
		return (EReference)ownershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOwnership_OwnedTarget() {
		return (EReference)ownershipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifeClass() {
		return lifeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeSliceFeature() {
		return timeSliceFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSnapshotFeature() {
		return snapshotFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementConstraintMembership() {
		return requirementConstraintMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementConstraintMembership_Kind() {
		return (EAttribute)requirementConstraintMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementConstraintMembership_Constraint_comp() {
		return (EReference)requirementConstraintMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementConstraintMembership_Constraint() {
		return (EReference)requirementConstraintMembershipEClass.getEStructuralFeatures().get(2);
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
	public EReference getInvocationExpression_Argument() {
		return (EReference)invocationExpressionEClass.getEStructuralFeatures().get(0);
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
	public EReference getParameterMembership_OwnedMemberParameter_comp() {
		return (EReference)parameterMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMembership_OwnedMemberParameter() {
		return (EReference)parameterMembershipEClass.getEStructuralFeatures().get(2);
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
	public EClass getTransitionFeatureMembership() {
		return transitionFeatureMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransitionFeatureMembership_Kind() {
		return (EAttribute)transitionFeatureMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionFeatureMembership_TransitionFeature_comp() {
		return (EReference)transitionFeatureMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionFeatureMembership_TransitionFeature() {
		return (EReference)transitionFeatureMembershipEClass.getEStructuralFeatures().get(2);
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
	public EReference getOperatorExpression_Operand_comp() {
		return (EReference)operatorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperatorExpression_Operand() {
		return (EReference)operatorExpressionEClass.getEStructuralFeatures().get(2);
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
	public EEnum getTransitionFeatureKind() {
		return transitionFeatureKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStateSubactionKind() {
		return stateSubactionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRequirementConstraintKind() {
		return requirementConstraintKindEEnum;
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
		blockExpressionEClass = createEClass(BLOCK_EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__FUNCTION);
		createEReference(expressionEClass, EXPRESSION__RESULT);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__BEHAVIOR);
		createEReference(stepEClass, STEP__PARAMETER);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__OWNING_FEATURE_MEMBERSHIP);
		createEReference(featureEClass, FEATURE__OWNING_TYPE);
		createEReference(featureEClass, FEATURE__END_OWNING_TYPE);
		createEReference(featureEClass, FEATURE__REFERENCED_TYPE);
		createEAttribute(featureEClass, FEATURE__IS_UNIQUE);
		createEAttribute(featureEClass, FEATURE__IS_ORDERED);
		createEReference(featureEClass, FEATURE__TYPE);
		createEReference(featureEClass, FEATURE__OWNED_TYPE);
		createEReference(featureEClass, FEATURE__OWNED_REDEFINITION);
		createEReference(featureEClass, FEATURE__OWNED_SUBSETTING);
		createEAttribute(featureEClass, FEATURE__IS_COMPOSITE);
		createEReference(featureEClass, FEATURE__TYPING);
		createEAttribute(featureEClass, FEATURE__IS_END);
		createEAttribute(featureEClass, FEATURE__IS_NONUNIQUE);
		createEOperation(featureEClass, FEATURE___DIRECTION_FOR__TYPE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__OWNED_GENERALIZATION);
		createEReference(typeEClass, TYPE__OWNED_FEATURE_MEMBERSHIP_COMP);
		createEReference(typeEClass, TYPE__FEATURE);
		createEReference(typeEClass, TYPE__OWNED_FEATURE);
		createEReference(typeEClass, TYPE__INPUT);
		createEReference(typeEClass, TYPE__OUTPUT);
		createEAttribute(typeEClass, TYPE__IS_ABSTRACT);
		createEReference(typeEClass, TYPE__INHERITED_MEMBERSHIP);
		createEReference(typeEClass, TYPE__END_FEATURE);
		createEReference(typeEClass, TYPE__OWNED_END_FEATURE);
		createEAttribute(typeEClass, TYPE__IS_SUFFICIENT);
		createEReference(typeEClass, TYPE__OWNED_CONJUGATOR);
		createEReference(typeEClass, TYPE__CONJUGATOR);
		createEAttribute(typeEClass, TYPE__IS_CONJUGATED);
		createEReference(typeEClass, TYPE__FEATURE_MEMBERSHIP);
		createEReference(typeEClass, TYPE__INHERITED_FEATURE);
		createEReference(typeEClass, TYPE__MULTIPLICITY);
		createEReference(typeEClass, TYPE__OWNED_FEATURE_MEMBERSHIP);
		createEOperation(typeEClass, TYPE___DIRECTION_OF__FEATURE);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__OWNED_MEMBERSHIP_COMP);
		createEReference(packageEClass, PACKAGE__OWNED_MEMBER);
		createEReference(packageEClass, PACKAGE__MEMBERSHIP);
		createEReference(packageEClass, PACKAGE__OWNED_IMPORT_COMP);
		createEReference(packageEClass, PACKAGE__MEMBER);
		createEReference(packageEClass, PACKAGE__IMPORTED_MEMBERSHIP);
		createEReference(packageEClass, PACKAGE__OWNED_MEMBERSHIP);
		createEReference(packageEClass, PACKAGE__OWNED_IMPORT);
		createEOperation(packageEClass, PACKAGE___NAMES_OF__ELEMENT);
		createEOperation(packageEClass, PACKAGE___EXCLUDE_COLLISIONS__ELIST);
		createEOperation(packageEClass, PACKAGE___PUBLIC_MEMBERSHIPS);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNING_MEMBERSHIP);
		createEReference(elementEClass, ELEMENT__OWNED_RELATIONSHIP_COMP);
		createEReference(elementEClass, ELEMENT__OWNING_RELATIONSHIP);
		createEAttribute(elementEClass, ELEMENT__IDENTIFIER);
		createEReference(elementEClass, ELEMENT__OWNING_NAMESPACE);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__OWNER);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_RELATIONSHIP);

		membershipEClass = createEClass(MEMBERSHIP);
		createEAttribute(membershipEClass, MEMBERSHIP__MEMBER_NAME);
		createEAttribute(membershipEClass, MEMBERSHIP__VISIBILITY);
		createEReference(membershipEClass, MEMBERSHIP__MEMBER_ELEMENT);
		createEReference(membershipEClass, MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE);
		createEReference(membershipEClass, MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP);
		createEReference(membershipEClass, MEMBERSHIP__OWNED_MEMBER_ELEMENT);
		createEOperation(membershipEClass, MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__OWNING_RELATED_ELEMENT);
		createEReference(relationshipEClass, RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP);
		createEReference(relationshipEClass, RELATIONSHIP__OWNED_RELATED_ELEMENT);

		importEClass = createEClass(IMPORT);
		createEReference(importEClass, IMPORT__IMPORTED_PACKAGE);
		createEAttribute(importEClass, IMPORT__VISIBILITY);
		createEReference(importEClass, IMPORT__IMPORT_OWNING_PACKAGE);
		createEOperation(importEClass, IMPORT___IMPORTED_MEMBERSHIP);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
		createEReference(generalizationEClass, GENERALIZATION__OWNING_TYPE);

		featureMembershipEClass = createEClass(FEATURE_MEMBERSHIP);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_DERIVED);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_READ_ONLY);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__MEMBER_FEATURE);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_COMPOSITE);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_PORTION);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__IS_PORT);
		createEAttribute(featureMembershipEClass, FEATURE_MEMBERSHIP__DIRECTION);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__OWNING_TYPE);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE);

		conjugationEClass = createEClass(CONJUGATION);
		createEReference(conjugationEClass, CONJUGATION__ORIGINAL_TYPE);
		createEReference(conjugationEClass, CONJUGATION__CONJUGATED_TYPE);
		createEReference(conjugationEClass, CONJUGATION__OWNING_TYPE);

		multiplicityEClass = createEClass(MULTIPLICITY);

		redefinitionEClass = createEClass(REDEFINITION);
		createEReference(redefinitionEClass, REDEFINITION__REDEFINING_FEATURE);
		createEReference(redefinitionEClass, REDEFINITION__REDEFINED_FEATURE);

		subsettingEClass = createEClass(SUBSETTING);
		createEReference(subsettingEClass, SUBSETTING__SUBSETTED_FEATURE);
		createEReference(subsettingEClass, SUBSETTING__SUBSETTING_FEATURE);
		createEReference(subsettingEClass, SUBSETTING__OWNING_FEATURE);

		featureTypingEClass = createEClass(FEATURE_TYPING);
		createEReference(featureTypingEClass, FEATURE_TYPING__TYPE);
		createEReference(featureTypingEClass, FEATURE_TYPING__TYPED_FEATURE);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__STEP);
		createEReference(behaviorEClass, BEHAVIOR__PARAMETER);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__OWNED_SUPERCLASSING);

		superclassingEClass = createEClass(SUPERCLASSING);
		createEReference(superclassingEClass, SUPERCLASSING__SUPERCLASS);
		createEReference(superclassingEClass, SUPERCLASSING__SUBCLASS);
		createEReference(superclassingEClass, SUPERCLASSING__OWNING_CLASSIFIER);

		parameterEClass = createEClass(PARAMETER);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__EXPRESSION);
		createEReference(functionEClass, FUNCTION__RESULT);

		queryQualifierExpressionEClass = createEClass(QUERY_QUALIFIER_EXPRESSION);

		operatorExpressionEClass = createEClass(OPERATOR_EXPRESSION);
		createEAttribute(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERATOR);
		createEReference(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERAND_COMP);
		createEReference(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERAND);

		invocationExpressionEClass = createEClass(INVOCATION_EXPRESSION);
		createEReference(invocationExpressionEClass, INVOCATION_EXPRESSION__ARGUMENT);

		instanceCreationExpressionEClass = createEClass(INSTANCE_CREATION_EXPRESSION);
		createEReference(instanceCreationExpressionEClass, INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE);

		queryPathStepExpressionEClass = createEClass(QUERY_PATH_STEP_EXPRESSION);

		queryPathExpressionEClass = createEClass(QUERY_PATH_EXPRESSION);

		featureReferenceExpressionEClass = createEClass(FEATURE_REFERENCE_EXPRESSION);
		createEReference(featureReferenceExpressionEClass, FEATURE_REFERENCE_EXPRESSION__REFERENT);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);

		invariantEClass = createEClass(INVARIANT);
		createEReference(invariantEClass, INVARIANT__ASSERTION_CONNECTOR);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__PREDICATE);

		predicateEClass = createEClass(PREDICATE);

		bindingConnectorEClass = createEClass(BINDING_CONNECTOR);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__RELATED_FEATURE);
		createEReference(connectorEClass, CONNECTOR__ASSOCIATION);
		createEReference(connectorEClass, CONNECTOR__OWNED_ASSOCIATION_TYPE);
		createEAttribute(connectorEClass, CONNECTOR__IS_DIRECTED);
		createEReference(connectorEClass, CONNECTOR__CONNECTOR_END);
		createEOperation(connectorEClass, CONNECTOR___PATH__FEATURE);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__RELATED_TYPE);
		createEReference(associationEClass, ASSOCIATION__OWNING_CONNECTOR);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_END);

		classEClass = createEClass(CLASS);

		literalRealEClass = createEClass(LITERAL_REAL);
		createEAttribute(literalRealEClass, LITERAL_REAL__VALUE);

		nullExpressionEClass = createEClass(NULL_EXPRESSION);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalUnboundedEClass = createEClass(LITERAL_UNBOUNDED);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		conditionalImportEClass = createEClass(CONDITIONAL_IMPORT);
		createEReference(conditionalImportEClass, CONDITIONAL_IMPORT__CONDITION_COMP);
		createEReference(conditionalImportEClass, CONDITIONAL_IMPORT__SELECTOR);
		createEReference(conditionalImportEClass, CONDITIONAL_IMPORT__CONDITION);

		importConditionEClass = createEClass(IMPORT_CONDITION);
		createEReference(importConditionEClass, IMPORT_CONDITION__PREDICATE_COMP);
		createEReference(importConditionEClass, IMPORT_CONDITION__CONDITIONAL_IMPORT);
		createEReference(importConditionEClass, IMPORT_CONDITION__PREDICATE);

		itemFeatureEClass = createEClass(ITEM_FEATURE);

		itemFlowEndEClass = createEClass(ITEM_FLOW_END);

		itemFlowFeatureEClass = createEClass(ITEM_FLOW_FEATURE);

		successionItemFlowEClass = createEClass(SUCCESSION_ITEM_FLOW);

		successionEClass = createEClass(SUCCESSION);
		createEReference(successionEClass, SUCCESSION__TRANSITION_STEP);
		createEReference(successionEClass, SUCCESSION__TRIGGER_STEP);
		createEReference(successionEClass, SUCCESSION__EFFECT_STEP);
		createEReference(successionEClass, SUCCESSION__GUARD_EXPRESSION);

		itemFlowEClass = createEClass(ITEM_FLOW);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_TYPE);
		createEReference(itemFlowEClass, ITEM_FLOW__TARGET_INPUT_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__SOURCE_OUTPUT_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_FLOW_END);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_FLOW_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_FEATURE);

		interactionEClass = createEClass(INTERACTION);

		dataTypeEClass = createEClass(DATA_TYPE);

		featureValueEClass = createEClass(FEATURE_VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__FEATURE_WITH_VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__VALUE_CONNECTOR);
		createEReference(featureValueEClass, FEATURE_VALUE__VALUE_COMP);
		createEReference(featureValueEClass, FEATURE_VALUE__VALUE);

		targetEndEClass = createEClass(TARGET_END);

		returnParameterMembershipEClass = createEClass(RETURN_PARAMETER_MEMBERSHIP);

		parameterMembershipEClass = createEClass(PARAMETER_MEMBERSHIP);
		createEReference(parameterMembershipEClass, PARAMETER_MEMBERSHIP__MEMBER_PARAMETER);
		createEReference(parameterMembershipEClass, PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP);
		createEReference(parameterMembershipEClass, PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER);

		sourceEndEClass = createEClass(SOURCE_END);

		multiplicityRangeEClass = createEClass(MULTIPLICITY_RANGE);
		createEReference(multiplicityRangeEClass, MULTIPLICITY_RANGE__LOWER_BOUND);
		createEReference(multiplicityRangeEClass, MULTIPLICITY_RANGE__UPPER_BOUND);
		createEReference(multiplicityRangeEClass, MULTIPLICITY_RANGE__BOUND);

		ownershipEClass = createEClass(OWNERSHIP);
		createEReference(ownershipEClass, OWNERSHIP__OWNING_SOURCE);
		createEReference(ownershipEClass, OWNERSHIP__OWNED_TARGET_COMP);
		createEReference(ownershipEClass, OWNERSHIP__OWNED_TARGET);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);
		createEReference(commentEClass, COMMENT__COMMENTED_ELEMENT);
		createEReference(commentEClass, COMMENT__ANNOTATION_FOR_COMMENT);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__ANNOTATED_ELEMENT);
		createEReference(annotationEClass, ANNOTATION__ANNOTATING_COMMENT);

		endFeatureMembershipEClass = createEClass(END_FEATURE_MEMBERSHIP);

		actionUsageEClass = createEClass(ACTION_USAGE);
		createEReference(actionUsageEClass, ACTION_USAGE__ACTION_OWNING_DEFINITION);
		createEReference(actionUsageEClass, ACTION_USAGE__ACTION_OWNING_USAGE);
		createEReference(actionUsageEClass, ACTION_USAGE__ACTIVITY);

		usageEClass = createEClass(USAGE);
		createEReference(usageEClass, USAGE__NESTED_USAGE);
		createEReference(usageEClass, USAGE__OWNING_USAGE);
		createEReference(usageEClass, USAGE__OWNING_DEFINITION);
		createEReference(usageEClass, USAGE__NESTED_PORT);
		createEReference(usageEClass, USAGE__NESTED_PROPERTY);
		createEReference(usageEClass, USAGE__NESTED_STATE);
		createEReference(usageEClass, USAGE__NESTED_CONSTRAINT);
		createEReference(usageEClass, USAGE__NESTED_TRANSITION);
		createEReference(usageEClass, USAGE__NESTED_REQUIREMENT);
		createEReference(usageEClass, USAGE__NESTED_FUNCTION);
		createEReference(usageEClass, USAGE__PROPERTY);
		createEReference(usageEClass, USAGE__NESTED_ACTION);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__OWNED_PORT);
		createEReference(definitionEClass, DEFINITION__FLOW_PROPERTY);
		createEReference(definitionEClass, DEFINITION__OWNED_PROPERTY);
		createEReference(definitionEClass, DEFINITION__PROPERTY);
		createEReference(definitionEClass, DEFINITION__OWNED_ACTION);
		createEReference(definitionEClass, DEFINITION__OWNED_STATE);
		createEReference(definitionEClass, DEFINITION__OWNED_CONSTRAINT);
		createEReference(definitionEClass, DEFINITION__OWNED_TRANSITION);
		createEReference(definitionEClass, DEFINITION__OWNED_REQUIREMENT);
		createEReference(definitionEClass, DEFINITION__OWNED_FUNCTION);
		createEReference(definitionEClass, DEFINITION__OWNED_USAGE);

		portUsageEClass = createEClass(PORT_USAGE);
		createEReference(portUsageEClass, PORT_USAGE__PORT_DEFINITION);
		createEReference(portUsageEClass, PORT_USAGE__PORT_OWNING_USAGE);
		createEReference(portUsageEClass, PORT_USAGE__PORT_OWNING_DEFINITION);

		portDefinitionEClass = createEClass(PORT_DEFINITION);
		createEReference(portDefinitionEClass, PORT_DEFINITION__CONJUGATED_PORT_DEFINITION);

		conjugatedPortDefinitionEClass = createEClass(CONJUGATED_PORT_DEFINITION);
		createEReference(conjugatedPortDefinitionEClass, CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR);
		createEReference(conjugatedPortDefinitionEClass, CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION);

		portConjugationEClass = createEClass(PORT_CONJUGATION);
		createEReference(portConjugationEClass, PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION);
		createEReference(portConjugationEClass, PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__PROPERTY_OWNING_DEFINITION);
		createEReference(propertyEClass, PROPERTY__PROPERTY_OWNING_USAGE);

		stateUsageEClass = createEClass(STATE_USAGE);
		createEReference(stateUsageEClass, STATE_USAGE__STATE_OWNING_USAGE);
		createEReference(stateUsageEClass, STATE_USAGE__STATE_DEFINITION);
		createEReference(stateUsageEClass, STATE_USAGE__ENTRY_ACTION);
		createEReference(stateUsageEClass, STATE_USAGE__DO_ACTION);
		createEReference(stateUsageEClass, STATE_USAGE__EXIT_ACTION);
		createEReference(stateUsageEClass, STATE_USAGE__STATE_OWNING_DEFINITION);

		constraintUsageEClass = createEClass(CONSTRAINT_USAGE);
		createEReference(constraintUsageEClass, CONSTRAINT_USAGE__CONSTRAINT_DEFINITION);
		createEReference(constraintUsageEClass, CONSTRAINT_USAGE__CONSTRAINT_OWNING_USAGE);
		createEReference(constraintUsageEClass, CONSTRAINT_USAGE__CONSTRAINT_OWNING_DEFINITION);

		transitionUsageEClass = createEClass(TRANSITION_USAGE);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__TRANSITION_OWNING_USAGE);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__SOURCE);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__TARGET);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__TRIGGER_ACTION);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__GUARD_EXPRESSION);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__EFFECT_ACTION);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__SUCCESSION);

		acceptActionUsageEClass = createEClass(ACCEPT_ACTION_USAGE);

		transferActionUsageEClass = createEClass(TRANSFER_ACTION_USAGE);
		createEReference(transferActionUsageEClass, TRANSFER_ACTION_USAGE__CONTEXT);

		requirementUsageEClass = createEClass(REQUIREMENT_USAGE);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__REQUIREMENT_DEFINITION);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__REQUIREMENT_OWNING_USAGE);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__SUBJECT_PARAMETER);
		createEAttribute(requirementUsageEClass, REQUIREMENT_USAGE__REQ_ID);
		createEAttribute(requirementUsageEClass, REQUIREMENT_USAGE__TEXT);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__REQUIRED_CONSTRAINT);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__ASSUMED_CONSTRAINT);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__REQUIREMENT_OWNING_DEFINITION);

		requirementDefinitionEClass = createEClass(REQUIREMENT_DEFINITION);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__SUBJECT_PARAMETER);
		createEAttribute(requirementDefinitionEClass, REQUIREMENT_DEFINITION__REQ_ID);
		createEAttribute(requirementDefinitionEClass, REQUIREMENT_DEFINITION__TEXT);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__ASSUMED_CONSTRAINT);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__REQUIRED_CONSTRAINT);

		constraintDefinitionEClass = createEClass(CONSTRAINT_DEFINITION);

		functionUsageEClass = createEClass(FUNCTION_USAGE);
		createEReference(functionUsageEClass, FUNCTION_USAGE__FUNCTION_DEFINITION);
		createEReference(functionUsageEClass, FUNCTION_USAGE__FUNCTION_OWNING_USAGE);
		createEReference(functionUsageEClass, FUNCTION_USAGE__FUNCTION_OWNING_DEFINITION);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__ACTION);

		valueTypeEClass = createEClass(VALUE_TYPE);

		valuePropertyEClass = createEClass(VALUE_PROPERTY);
		createEReference(valuePropertyEClass, VALUE_PROPERTY__VALUE_TYPE);

		sendActionUsageEClass = createEClass(SEND_ACTION_USAGE);
		createEReference(sendActionUsageEClass, SEND_ACTION_USAGE__TARGET);

		performActionUsageEClass = createEClass(PERFORM_ACTION_USAGE);
		createEReference(performActionUsageEClass, PERFORM_ACTION_USAGE__PERFORMED_ACTION);

		connectionUsageEClass = createEClass(CONNECTION_USAGE);

		interfaceDefinitionEClass = createEClass(INTERFACE_DEFINITION);
		createEReference(interfaceDefinitionEClass, INTERFACE_DEFINITION__INTERFACE_END);

		associationBlockEClass = createEClass(ASSOCIATION_BLOCK);

		blockEClass = createEClass(BLOCK);

		interfaceUsageEClass = createEClass(INTERFACE_USAGE);
		createEReference(interfaceUsageEClass, INTERFACE_USAGE__INTERFACE_DEFINITION);

		conjugatedPortTypingEClass = createEClass(CONJUGATED_PORT_TYPING);
		createEReference(conjugatedPortTypingEClass, CONJUGATED_PORT_TYPING__PORT_DEFINITION);
		createEReference(conjugatedPortTypingEClass, CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION);

		transitionFeatureMembershipEClass = createEClass(TRANSITION_FEATURE_MEMBERSHIP);
		createEAttribute(transitionFeatureMembershipEClass, TRANSITION_FEATURE_MEMBERSHIP__KIND);
		createEReference(transitionFeatureMembershipEClass, TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE_COMP);
		createEReference(transitionFeatureMembershipEClass, TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE);

		exhibitStateUsageEClass = createEClass(EXHIBIT_STATE_USAGE);
		createEReference(exhibitStateUsageEClass, EXHIBIT_STATE_USAGE__EXHIBITED_STATE);

		stateSubactionMembershipEClass = createEClass(STATE_SUBACTION_MEMBERSHIP);
		createEAttribute(stateSubactionMembershipEClass, STATE_SUBACTION_MEMBERSHIP__KIND);
		createEReference(stateSubactionMembershipEClass, STATE_SUBACTION_MEMBERSHIP__ACTION_COMP);
		createEReference(stateSubactionMembershipEClass, STATE_SUBACTION_MEMBERSHIP__ACTION);

		stateDefinitionEClass = createEClass(STATE_DEFINITION);
		createEReference(stateDefinitionEClass, STATE_DEFINITION__STATE);
		createEReference(stateDefinitionEClass, STATE_DEFINITION__ENTRY_ACTION);
		createEReference(stateDefinitionEClass, STATE_DEFINITION__DO_ACTION);
		createEReference(stateDefinitionEClass, STATE_DEFINITION__EXIT_ACTION);

		assertConstraintUsageEClass = createEClass(ASSERT_CONSTRAINT_USAGE);
		createEReference(assertConstraintUsageEClass, ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT);

		blockPropertyEClass = createEClass(BLOCK_PROPERTY);
		createEReference(blockPropertyEClass, BLOCK_PROPERTY__BLOCK);

		partPropertyEClass = createEClass(PART_PROPERTY);

		referencePropertyEClass = createEClass(REFERENCE_PROPERTY);

		controlNodeEClass = createEClass(CONTROL_NODE);

		mergeNodeEClass = createEClass(MERGE_NODE);

		forkNodeEClass = createEClass(FORK_NODE);

		joinNodeEClass = createEClass(JOIN_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);

		functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__FUNCTION_INVOCATION);

		requirementConstraintMembershipEClass = createEClass(REQUIREMENT_CONSTRAINT_MEMBERSHIP);
		createEAttribute(requirementConstraintMembershipEClass, REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND);
		createEReference(requirementConstraintMembershipEClass, REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP);
		createEReference(requirementConstraintMembershipEClass, REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT);

		satisfyRequirementUsageEClass = createEClass(SATISFY_REQUIREMENT_USAGE);
		createEReference(satisfyRequirementUsageEClass, SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT);
		createEReference(satisfyRequirementUsageEClass, SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE);

		lifeClassEClass = createEClass(LIFE_CLASS);

		timeSliceFeatureEClass = createEClass(TIME_SLICE_FEATURE);

		snapshotFeatureEClass = createEClass(SNAPSHOT_FEATURE);

		individualDefinitionEClass = createEClass(INDIVIDUAL_DEFINITION);
		createEReference(individualDefinitionEClass, INDIVIDUAL_DEFINITION__LIFE_CLASS);

		individualUsageEClass = createEClass(INDIVIDUAL_USAGE);
		createEReference(individualUsageEClass, INDIVIDUAL_USAGE__INDIVIDUAL_DEFINITION);
		createEAttribute(individualUsageEClass, INDIVIDUAL_USAGE__IS_TIME_SLICE);
		createEAttribute(individualUsageEClass, INDIVIDUAL_USAGE__IS_SNAPSHOT);
		createEReference(individualUsageEClass, INDIVIDUAL_USAGE__TIME_SLICE_FEATURE);
		createEReference(individualUsageEClass, INDIVIDUAL_USAGE__SNAPSHOT_FEATURE);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		featureDirectionKindEEnum = createEEnum(FEATURE_DIRECTION_KIND);
		transitionFeatureKindEEnum = createEEnum(TRANSITION_FEATURE_KIND);
		stateSubactionKindEEnum = createEEnum(STATE_SUBACTION_KIND);
		requirementConstraintKindEEnum = createEEnum(REQUIREMENT_CONSTRAINT_KIND);
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
		blockExpressionEClass.getESuperTypes().add(this.getExpression());
		expressionEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(this.getFeature());
		featureEClass.getESuperTypes().add(this.getType());
		typeEClass.getESuperTypes().add(this.getPackage());
		packageEClass.getESuperTypes().add(this.getElement());
		membershipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		importEClass.getESuperTypes().add(this.getRelationship());
		generalizationEClass.getESuperTypes().add(this.getRelationship());
		featureMembershipEClass.getESuperTypes().add(this.getMembership());
		conjugationEClass.getESuperTypes().add(this.getRelationship());
		multiplicityEClass.getESuperTypes().add(this.getFeature());
		redefinitionEClass.getESuperTypes().add(this.getSubsetting());
		subsettingEClass.getESuperTypes().add(this.getGeneralization());
		featureTypingEClass.getESuperTypes().add(this.getGeneralization());
		behaviorEClass.getESuperTypes().add(this.getClassifier());
		classifierEClass.getESuperTypes().add(this.getType());
		superclassingEClass.getESuperTypes().add(this.getGeneralization());
		parameterEClass.getESuperTypes().add(this.getFeature());
		functionEClass.getESuperTypes().add(this.getBehavior());
		queryQualifierExpressionEClass.getESuperTypes().add(this.getOperatorExpression());
		operatorExpressionEClass.getESuperTypes().add(this.getInvocationExpression());
		invocationExpressionEClass.getESuperTypes().add(this.getExpression());
		instanceCreationExpressionEClass.getESuperTypes().add(this.getInvocationExpression());
		queryPathStepExpressionEClass.getESuperTypes().add(this.getOperatorExpression());
		queryPathExpressionEClass.getESuperTypes().add(this.getFeatureReferenceExpression());
		featureReferenceExpressionEClass.getESuperTypes().add(this.getExpression());
		literalStringEClass.getESuperTypes().add(this.getLiteralExpression());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		invariantEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		predicateEClass.getESuperTypes().add(this.getFunction());
		bindingConnectorEClass.getESuperTypes().add(this.getConnector());
		connectorEClass.getESuperTypes().add(this.getFeature());
		connectorEClass.getESuperTypes().add(this.getRelationship());
		associationEClass.getESuperTypes().add(this.getClass_());
		associationEClass.getESuperTypes().add(this.getRelationship());
		classEClass.getESuperTypes().add(this.getClassifier());
		literalRealEClass.getESuperTypes().add(this.getLiteralExpression());
		nullExpressionEClass.getESuperTypes().add(this.getExpression());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralExpression());
		literalUnboundedEClass.getESuperTypes().add(this.getLiteralExpression());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralExpression());
		conditionalImportEClass.getESuperTypes().add(this.getImport());
		importConditionEClass.getESuperTypes().add(this.getRelationship());
		itemFeatureEClass.getESuperTypes().add(this.getFeature());
		itemFlowEndEClass.getESuperTypes().add(this.getFeature());
		itemFlowFeatureEClass.getESuperTypes().add(this.getFeature());
		successionItemFlowEClass.getESuperTypes().add(this.getItemFlow());
		successionItemFlowEClass.getESuperTypes().add(this.getSuccession());
		successionEClass.getESuperTypes().add(this.getConnector());
		itemFlowEClass.getESuperTypes().add(this.getConnector());
		itemFlowEClass.getESuperTypes().add(this.getStep());
		interactionEClass.getESuperTypes().add(this.getAssociation());
		interactionEClass.getESuperTypes().add(this.getBehavior());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		featureValueEClass.getESuperTypes().add(this.getFeatureMembership());
		targetEndEClass.getESuperTypes().add(this.getFeature());
		returnParameterMembershipEClass.getESuperTypes().add(this.getParameterMembership());
		parameterMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		sourceEndEClass.getESuperTypes().add(this.getFeature());
		multiplicityRangeEClass.getESuperTypes().add(this.getMultiplicity());
		ownershipEClass.getESuperTypes().add(this.getRelationship());
		commentEClass.getESuperTypes().add(this.getElement());
		annotationEClass.getESuperTypes().add(this.getRelationship());
		endFeatureMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		actionUsageEClass.getESuperTypes().add(this.getUsage());
		actionUsageEClass.getESuperTypes().add(this.getStep());
		usageEClass.getESuperTypes().add(this.getFeature());
		definitionEClass.getESuperTypes().add(this.getClassifier());
		portUsageEClass.getESuperTypes().add(this.getUsage());
		portDefinitionEClass.getESuperTypes().add(this.getDefinition());
		conjugatedPortDefinitionEClass.getESuperTypes().add(this.getPortDefinition());
		portConjugationEClass.getESuperTypes().add(this.getConjugation());
		propertyEClass.getESuperTypes().add(this.getUsage());
		stateUsageEClass.getESuperTypes().add(this.getActionUsage());
		constraintUsageEClass.getESuperTypes().add(this.getUsage());
		constraintUsageEClass.getESuperTypes().add(this.getBooleanExpression());
		transitionUsageEClass.getESuperTypes().add(this.getActionUsage());
		acceptActionUsageEClass.getESuperTypes().add(this.getTransferActionUsage());
		transferActionUsageEClass.getESuperTypes().add(this.getActionUsage());
		requirementUsageEClass.getESuperTypes().add(this.getConstraintUsage());
		requirementDefinitionEClass.getESuperTypes().add(this.getConstraintDefinition());
		constraintDefinitionEClass.getESuperTypes().add(this.getDefinition());
		constraintDefinitionEClass.getESuperTypes().add(this.getPredicate());
		functionUsageEClass.getESuperTypes().add(this.getActionUsage());
		functionUsageEClass.getESuperTypes().add(this.getExpression());
		activityEClass.getESuperTypes().add(this.getDefinition());
		activityEClass.getESuperTypes().add(this.getBehavior());
		valueTypeEClass.getESuperTypes().add(this.getDefinition());
		valueTypeEClass.getESuperTypes().add(this.getDataType());
		valuePropertyEClass.getESuperTypes().add(this.getProperty());
		sendActionUsageEClass.getESuperTypes().add(this.getTransferActionUsage());
		performActionUsageEClass.getESuperTypes().add(this.getActionUsage());
		connectionUsageEClass.getESuperTypes().add(this.getUsage());
		connectionUsageEClass.getESuperTypes().add(this.getConnector());
		interfaceDefinitionEClass.getESuperTypes().add(this.getAssociationBlock());
		associationBlockEClass.getESuperTypes().add(this.getBlock());
		associationBlockEClass.getESuperTypes().add(this.getAssociation());
		blockEClass.getESuperTypes().add(this.getDefinition());
		blockEClass.getESuperTypes().add(this.getClass_());
		interfaceUsageEClass.getESuperTypes().add(this.getConnectionUsage());
		conjugatedPortTypingEClass.getESuperTypes().add(this.getFeatureTyping());
		transitionFeatureMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		exhibitStateUsageEClass.getESuperTypes().add(this.getStateUsage());
		stateSubactionMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		stateDefinitionEClass.getESuperTypes().add(this.getActivity());
		assertConstraintUsageEClass.getESuperTypes().add(this.getConstraintUsage());
		assertConstraintUsageEClass.getESuperTypes().add(this.getInvariant());
		blockPropertyEClass.getESuperTypes().add(this.getProperty());
		partPropertyEClass.getESuperTypes().add(this.getBlockProperty());
		referencePropertyEClass.getESuperTypes().add(this.getBlockProperty());
		controlNodeEClass.getESuperTypes().add(this.getActionUsage());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		functionDefinitionEClass.getESuperTypes().add(this.getActivity());
		functionDefinitionEClass.getESuperTypes().add(this.getFunction());
		requirementConstraintMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		satisfyRequirementUsageEClass.getESuperTypes().add(this.getRequirementUsage());
		satisfyRequirementUsageEClass.getESuperTypes().add(this.getAssertConstraintUsage());
		lifeClassEClass.getESuperTypes().add(this.getClass_());
		timeSliceFeatureEClass.getESuperTypes().add(this.getFeature());
		snapshotFeatureEClass.getESuperTypes().add(this.getFeature());
		individualDefinitionEClass.getESuperTypes().add(this.getBlock());
		individualUsageEClass.getESuperTypes().add(this.getBlockProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(blockExpressionEClass, BlockExpression.class, "BlockExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Function(), this.getFunction(), null, "function", null, 1, 1, Expression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExpression_Result(), this.getParameter(), null, "result", null, 1, 1, Expression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Behavior(), this.getBehavior(), null, "behavior", null, 1, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStep_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_OwningFeatureMembership(), this.getFeatureMembership(), this.getFeatureMembership_OwnedMemberFeature_comp(), "owningFeatureMembership", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwningType(), this.getType(), this.getType_OwnedFeature(), "owningType", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_EndOwningType(), this.getType(), this.getType_OwnedEndFeature(), "endOwningType", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_ReferencedType(), this.getType(), null, "referencedType", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsUnique(), theTypesPackage.getBoolean(), "isUnique", "true", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsOrdered(), theTypesPackage.getBoolean(), "isOrdered", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Type(), this.getType(), null, "type", null, 1, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedType(), this.getType(), null, "ownedType", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedRedefinition(), this.getRedefinition(), null, "ownedRedefinition", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedSubsetting(), this.getSubsetting(), this.getSubsetting_OwningFeature(), "ownedSubsetting", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsComposite(), theTypesPackage.getBoolean(), "isComposite", null, 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Typing(), this.getFeatureTyping(), this.getFeatureTyping_TypedFeature(), "typing", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsEnd(), theTypesPackage.getBoolean(), "isEnd", null, 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsNonunique(), theTypesPackage.getBoolean(), "isNonunique", "false", 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getFeature__DirectionFor__Type(), this.getFeatureDirectionKind(), "directionFor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_OwnedGeneralization(), this.getGeneralization(), this.getGeneralization_OwningType(), "ownedGeneralization", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedFeatureMembership_comp(), this.getFeatureMembership(), this.getFeatureMembership_OwningType(), "ownedFeatureMembership_comp", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Feature(), this.getFeature(), null, "feature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_OwnedFeature(), this.getFeature(), this.getFeature_OwningType(), "ownedFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Input(), this.getFeature(), null, "input", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Output(), this.getFeature(), null, "output", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getType_IsAbstract(), theTypesPackage.getBoolean(), "isAbstract", "false", 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_InheritedMembership(), this.getMembership(), null, "inheritedMembership", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_EndFeature(), this.getFeature(), null, "endFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_OwnedEndFeature(), this.getFeature(), this.getFeature_EndOwningType(), "ownedEndFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getType_IsSufficient(), theTypesPackage.getBoolean(), "isSufficient", "false", 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_OwnedConjugator(), this.getConjugation(), this.getConjugation_OwningType(), "ownedConjugator", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Conjugator(), this.getConjugation(), this.getConjugation_ConjugatedType(), "conjugator", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getType_IsConjugated(), theTypesPackage.getBoolean(), "isConjugated", null, 1, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_FeatureMembership(), this.getFeatureMembership(), null, "featureMembership", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_InheritedFeature(), this.getFeature(), null, "inheritedFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_OwnedFeatureMembership(), this.getFeatureMembership(), null, "ownedFeatureMembership", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getType__DirectionOf__Feature(), this.getFeatureDirectionKind(), "directionOf", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(packageEClass, org.omg.sysml.lang.sysml.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_OwnedMembership_comp(), this.getMembership(), this.getMembership_MembershipOwningPackage(), "ownedMembership_comp", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedMember(), this.getElement(), this.getElement_OwningNamespace(), "ownedMember", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Membership(), this.getMembership(), null, "membership", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedImport_comp(), this.getImport(), this.getImport_ImportOwningPackage(), "ownedImport_comp", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Member(), this.getElement(), null, "member", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_ImportedMembership(), this.getMembership(), null, "importedMembership", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedMembership(), this.getMembership(), null, "ownedMembership", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_OwnedImport(), this.getImport(), null, "ownedImport", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPackage__NamesOf__Element(), theTypesPackage.getString(), "namesOf", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__ExcludeCollisions__EList(), this.getMembership(), "excludeCollisions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMembership(), "mem", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__PublicMemberships(), this.getMembership(), "publicMemberships", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwningMembership(), this.getMembership(), this.getMembership_OwnedMemberElement_comp(), "owningMembership", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedRelationship_comp(), this.getRelationship(), this.getRelationship_OwningRelatedElement(), "ownedRelationship_comp", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwningRelationship(), this.getRelationship(), this.getRelationship_OwnedRelatedElement_comp(), "owningRelationship", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwningNamespace(), this.getPackage(), this.getPackage_OwnedMember(), "owningNamespace", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Name(), theTypesPackage.getString(), "name", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedRelationship(), this.getRelationship(), null, "ownedRelationship", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(membershipEClass, Membership.class, "Membership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMembership_MemberName(), theTypesPackage.getString(), "memberName", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMembership_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_MemberElement(), this.getElement(), null, "memberElement", null, 1, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_MembershipOwningPackage(), this.getPackage(), this.getPackage_OwnedMembership_comp(), "membershipOwningPackage", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_OwnedMemberElement_comp(), this.getElement(), this.getElement_OwningMembership(), "ownedMemberElement_comp", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_OwnedMemberElement(), this.getElement(), null, "ownedMemberElement", null, 0, 1, Membership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMembership__IsDistinguishableFrom__Membership(), theTypesPackage.getBoolean(), "isDistinguishableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMembership(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 2, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_Target(), this.getElement(), null, "target", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_Source(), this.getElement(), null, "source", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_OwningRelatedElement(), this.getElement(), this.getElement_OwnedRelationship_comp(), "owningRelatedElement", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_OwnedRelatedElement_comp(), this.getElement(), this.getElement_OwningRelationship(), "ownedRelatedElement_comp", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_OwnedRelatedElement(), this.getElement(), null, "ownedRelatedElement", null, 0, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImport_ImportedPackage(), this.getPackage(), null, "importedPackage", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImport_ImportOwningPackage(), this.getPackage(), this.getPackage_OwnedImport_comp(), "importOwningPackage", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getImport__ImportedMembership(), this.getMembership(), "importedMembership", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_General(), this.getType(), null, "general", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_Specific(), this.getType(), null, "specific", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_OwningType(), this.getType(), this.getType_OwnedGeneralization(), "owningType", null, 0, 1, Generalization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureMembershipEClass, FeatureMembership.class, "FeatureMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureMembership_IsDerived(), theTypesPackage.getBoolean(), "isDerived", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_IsReadOnly(), theTypesPackage.getBoolean(), "isReadOnly", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureMembership_MemberFeature(), this.getFeature(), null, "memberFeature", null, 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureMembership_OwnedMemberFeature_comp(), this.getFeature(), this.getFeature_OwningFeatureMembership(), "ownedMemberFeature_comp", null, 0, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_IsComposite(), theTypesPackage.getBoolean(), "isComposite", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_IsPortion(), theTypesPackage.getBoolean(), "isPortion", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_IsPort(), theTypesPackage.getBoolean(), "isPort", "false", 1, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureMembership_Direction(), this.getFeatureDirectionKind(), "direction", null, 0, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureMembership_OwningType(), this.getType(), this.getType_OwnedFeatureMembership_comp(), "owningType", null, 0, 1, FeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureMembership_OwnedMemberFeature(), this.getFeature(), null, "ownedMemberFeature", null, 0, 1, FeatureMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(conjugationEClass, Conjugation.class, "Conjugation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjugation_OriginalType(), this.getType(), null, "originalType", null, 1, 1, Conjugation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConjugation_ConjugatedType(), this.getType(), this.getType_Conjugator(), "conjugatedType", null, 1, 1, Conjugation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConjugation_OwningType(), this.getType(), this.getType_OwnedConjugator(), "owningType", null, 0, 1, Conjugation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(redefinitionEClass, Redefinition.class, "Redefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedefinition_RedefiningFeature(), this.getFeature(), null, "redefiningFeature", null, 1, 1, Redefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinition_RedefinedFeature(), this.getFeature(), null, "redefinedFeature", null, 1, 1, Redefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subsettingEClass, Subsetting.class, "Subsetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubsetting_SubsettedFeature(), this.getFeature(), null, "subsettedFeature", null, 1, 1, Subsetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubsetting_SubsettingFeature(), this.getFeature(), null, "subsettingFeature", null, 1, 1, Subsetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubsetting_OwningFeature(), this.getFeature(), this.getFeature_OwnedSubsetting(), "owningFeature", null, 0, 1, Subsetting.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureTypingEClass, FeatureTyping.class, "FeatureTyping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureTyping_Type(), this.getType(), null, "type", null, 1, 1, FeatureTyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureTyping_TypedFeature(), this.getFeature(), this.getFeature_Typing(), "typedFeature", null, 1, 1, FeatureTyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Step(), this.getStep(), null, "step", null, 0, -1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_OwnedSuperclassing(), this.getSuperclassing(), this.getSuperclassing_OwningClassifier(), "ownedSuperclassing", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(superclassingEClass, Superclassing.class, "Superclassing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperclassing_Superclass(), this.getClassifier(), null, "superclass", null, 1, 1, Superclassing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSuperclassing_Subclass(), this.getClassifier(), null, "subclass", null, 1, 1, Superclassing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSuperclassing_OwningClassifier(), this.getClassifier(), this.getClassifier_OwnedSuperclassing(), "owningClassifier", null, 0, 1, Superclassing.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Expression(), this.getExpression(), null, "expression", null, 0, -1, Function.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFunction_Result(), this.getParameter(), null, "result", null, 1, 1, Function.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(queryQualifierExpressionEClass, QueryQualifierExpression.class, "QueryQualifierExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorExpressionEClass, OperatorExpression.class, "OperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatorExpression_Operator(), theTypesPackage.getString(), "operator", null, 1, 1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperatorExpression_Operand_comp(), this.getExpression(), null, "operand_comp", null, 0, -1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatorExpression_Operand(), this.getExpression(), null, "operand", null, 0, -1, OperatorExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(invocationExpressionEClass, InvocationExpression.class, "InvocationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationExpression_Argument(), this.getExpression(), null, "argument", null, 0, -1, InvocationExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(instanceCreationExpressionEClass, InstanceCreationExpression.class, "InstanceCreationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceCreationExpression_InstantiatedType(), this.getType(), null, "instantiatedType", null, 1, 1, InstanceCreationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(queryPathStepExpressionEClass, QueryPathStepExpression.class, "QueryPathStepExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryPathExpressionEClass, QueryPathExpression.class, "QueryPathExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureReferenceExpressionEClass, FeatureReferenceExpression.class, "FeatureReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureReferenceExpression_Referent(), this.getFeature(), null, "referent", null, 1, 1, FeatureReferenceExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralString_Value(), theTypesPackage.getString(), "value", null, 1, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invariantEClass, Invariant.class, "Invariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvariant_AssertionConnector(), this.getBindingConnector(), null, "assertionConnector", null, 1, 1, Invariant.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpression_Predicate(), this.getPredicate(), null, "predicate", null, 1, 1, BooleanExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingConnectorEClass, BindingConnector.class, "BindingConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_RelatedFeature(), this.getFeature(), null, "relatedFeature", null, 2, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_Association(), this.getAssociation(), null, "association", null, 1, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_OwnedAssociationType(), this.getAssociation(), this.getAssociation_OwningConnector(), "ownedAssociationType", null, 0, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnector_IsDirected(), theTypesPackage.getBoolean(), "isDirected", "false", 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_ConnectorEnd(), this.getFeature(), null, "connectorEnd", null, 2, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConnector__Path__Feature(), this.getFeature(), "path", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "relatedFeature", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_RelatedType(), this.getType(), null, "relatedType", null, 2, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_OwningConnector(), this.getConnector(), this.getConnector_OwnedAssociationType(), "owningConnector", null, 0, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_AssociationEnd(), this.getFeature(), null, "associationEnd", null, 2, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(classEClass, org.omg.sysml.lang.sysml.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalRealEClass, LiteralReal.class, "LiteralReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralReal_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, LiteralReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nullExpressionEClass, NullExpression.class, "NullExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), theTypesPackage.getBoolean(), "value", null, 1, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalUnboundedEClass, LiteralUnbounded.class, "LiteralUnbounded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralInteger_Value(), theTypesPackage.getInteger(), "value", null, 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conditionalImportEClass, ConditionalImport.class, "ConditionalImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalImport_Condition_comp(), this.getImportCondition(), this.getImportCondition_ConditionalImport(), "condition_comp", null, 1, 1, ConditionalImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionalImport_Selector(), this.getPredicate(), null, "selector", null, 1, 1, ConditionalImport.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionalImport_Condition(), this.getImportCondition(), null, "condition", null, 1, 1, ConditionalImport.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(importConditionEClass, ImportCondition.class, "ImportCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportCondition_Predicate_comp(), this.getPredicate(), null, "predicate_comp", null, 1, 1, ImportCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImportCondition_ConditionalImport(), this.getConditionalImport(), this.getConditionalImport_Condition_comp(), "conditionalImport", null, 0, 1, ImportCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImportCondition_Predicate(), this.getPredicate(), null, "predicate", null, 1, 1, ImportCondition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itemFeatureEClass, ItemFeature.class, "ItemFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemFlowEndEClass, ItemFlowEnd.class, "ItemFlowEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemFlowFeatureEClass, ItemFlowFeature.class, "ItemFlowFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(successionItemFlowEClass, SuccessionItemFlow.class, "SuccessionItemFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(successionEClass, Succession.class, "Succession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuccession_TransitionStep(), this.getStep(), null, "transitionStep", null, 0, 1, Succession.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSuccession_TriggerStep(), this.getStep(), null, "triggerStep", null, 0, -1, Succession.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSuccession_EffectStep(), this.getStep(), null, "effectStep", null, 0, -1, Succession.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSuccession_GuardExpression(), this.getExpression(), null, "guardExpression", null, 0, -1, Succession.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(itemFlowEClass, ItemFlow.class, "ItemFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemFlow_ItemType(), this.getClassifier(), null, "itemType", null, 1, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_TargetInputFeature(), this.getFeature(), null, "targetInputFeature", null, 1, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_SourceOutputFeature(), this.getFeature(), null, "sourceOutputFeature", null, 1, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_ItemFlowEnd(), this.getItemFlowEnd(), null, "itemFlowEnd", null, 2, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getItemFlow_ItemFlowFeature(), this.getItemFlowFeature(), null, "itemFlowFeature", null, 2, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getItemFlow_ItemFeature(), this.getItemFeature(), null, "itemFeature", null, 1, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureValueEClass, FeatureValue.class, "FeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_FeatureWithValue(), this.getFeature(), null, "featureWithValue", null, 1, 1, FeatureValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureValue_ValueConnector(), this.getBindingConnector(), null, "valueConnector", null, 1, 1, FeatureValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureValue_Value_comp(), this.getExpression(), null, "value_comp", null, 1, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureValue_Value(), this.getExpression(), null, "value", null, 1, 1, FeatureValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(targetEndEClass, TargetEnd.class, "TargetEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnParameterMembershipEClass, ReturnParameterMembership.class, "ReturnParameterMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterMembershipEClass, ParameterMembership.class, "ParameterMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterMembership_MemberParameter(), this.getParameter(), null, "memberParameter", null, 1, 1, ParameterMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterMembership_OwnedMemberParameter_comp(), this.getParameter(), null, "ownedMemberParameter_comp", null, 1, 1, ParameterMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterMembership_OwnedMemberParameter(), this.getParameter(), null, "ownedMemberParameter", null, 1, 1, ParameterMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sourceEndEClass, SourceEnd.class, "SourceEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicityRangeEClass, MultiplicityRange.class, "MultiplicityRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityRange_LowerBound(), this.getExpression(), null, "lowerBound", null, 0, 1, MultiplicityRange.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityRange_UpperBound(), this.getExpression(), null, "upperBound", null, 1, 1, MultiplicityRange.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityRange_Bound(), this.getExpression(), null, "bound", null, 1, 2, MultiplicityRange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ownershipEClass, Ownership.class, "Ownership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwnership_OwningSource(), this.getElement(), null, "owningSource", null, 1, 1, Ownership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOwnership_OwnedTarget_comp(), this.getElement(), null, "ownedTarget_comp", null, 1, 1, Ownership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOwnership_OwnedTarget(), this.getElement(), null, "ownedTarget", null, 1, 1, Ownership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Body(), theTypesPackage.getString(), "body", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComment_CommentedElement(), this.getElement(), null, "commentedElement", null, 1, 1, Comment.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComment_AnnotationForComment(), this.getAnnotation(), this.getAnnotation_AnnotatingComment(), "annotationForComment", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotation_AnnotatingComment(), this.getComment(), this.getComment_AnnotationForComment(), "annotatingComment", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(endFeatureMembershipEClass, EndFeatureMembership.class, "EndFeatureMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionUsageEClass, ActionUsage.class, "ActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionUsage_ActionOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedAction(), "actionOwningDefinition", null, 0, 1, ActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActionUsage_ActionOwningUsage(), this.getUsage(), this.getUsage_NestedAction(), "actionOwningUsage", null, 0, 1, ActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActionUsage_Activity(), this.getBehavior(), null, "activity", null, 1, -1, ActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(usageEClass, Usage.class, "Usage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsage_NestedUsage(), this.getUsage(), this.getUsage_OwningUsage(), "nestedUsage", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_OwningUsage(), this.getUsage(), this.getUsage_NestedUsage(), "owningUsage", null, 0, 1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_OwningDefinition(), this.getDefinition(), this.getDefinition_OwnedUsage(), "owningDefinition", null, 0, 1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedPort(), this.getPortUsage(), this.getPortUsage_PortOwningUsage(), "nestedPort", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedProperty(), this.getProperty(), this.getProperty_PropertyOwningUsage(), "nestedProperty", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedState(), this.getStateUsage(), this.getStateUsage_StateOwningUsage(), "nestedState", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedConstraint(), this.getConstraintUsage(), this.getConstraintUsage_ConstraintOwningUsage(), "nestedConstraint", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedTransition(), this.getTransitionUsage(), this.getTransitionUsage_TransitionOwningUsage(), "nestedTransition", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedRequirement(), this.getRequirementUsage(), this.getRequirementUsage_RequirementOwningUsage(), "nestedRequirement", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedFunction(), this.getFunctionUsage(), this.getFunctionUsage_FunctionOwningUsage(), "nestedFunction", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_Property(), this.getProperty(), null, "property", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedAction(), this.getActionUsage(), this.getActionUsage_ActionOwningUsage(), "nestedAction", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinition_OwnedPort(), this.getPortUsage(), this.getPortUsage_PortOwningDefinition(), "ownedPort", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_FlowProperty(), this.getProperty(), null, "flowProperty", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedProperty(), this.getProperty(), this.getProperty_PropertyOwningDefinition(), "ownedProperty", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_Property(), this.getProperty(), null, "property", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedAction(), this.getActionUsage(), this.getActionUsage_ActionOwningDefinition(), "ownedAction", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedState(), this.getStateUsage(), this.getStateUsage_StateOwningDefinition(), "ownedState", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedConstraint(), this.getConstraintUsage(), this.getConstraintUsage_ConstraintOwningDefinition(), "ownedConstraint", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedTransition(), this.getTransitionUsage(), null, "ownedTransition", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedRequirement(), this.getRequirementUsage(), this.getRequirementUsage_RequirementOwningDefinition(), "ownedRequirement", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedFunction(), this.getFunctionUsage(), this.getFunctionUsage_FunctionOwningDefinition(), "ownedFunction", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedUsage(), this.getUsage(), this.getUsage_OwningDefinition(), "ownedUsage", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(portUsageEClass, PortUsage.class, "PortUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortUsage_PortDefinition(), this.getPortDefinition(), null, "portDefinition", null, 1, 1, PortUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPortUsage_PortOwningUsage(), this.getUsage(), this.getUsage_NestedPort(), "portOwningUsage", null, 0, 1, PortUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPortUsage_PortOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedPort(), "portOwningDefinition", null, 0, 1, PortUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(portDefinitionEClass, PortDefinition.class, "PortDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortDefinition_ConjugatedPortDefinition(), this.getConjugatedPortDefinition(), this.getConjugatedPortDefinition_OriginalPortDefinition(), "conjugatedPortDefinition", null, 0, 1, PortDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(conjugatedPortDefinitionEClass, ConjugatedPortDefinition.class, "ConjugatedPortDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjugatedPortDefinition_OwnedPortConjugator(), this.getPortConjugation(), this.getPortConjugation_ConjugatedPortDefinition(), "ownedPortConjugator", null, 1, 1, ConjugatedPortDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConjugatedPortDefinition_OriginalPortDefinition(), this.getPortDefinition(), this.getPortDefinition_ConjugatedPortDefinition(), "originalPortDefinition", null, 1, 1, ConjugatedPortDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(portConjugationEClass, PortConjugation.class, "PortConjugation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConjugation_OriginalPortDefinition(), this.getPortDefinition(), null, "originalPortDefinition", null, 1, 1, PortConjugation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPortConjugation_ConjugatedPortDefinition(), this.getConjugatedPortDefinition(), this.getConjugatedPortDefinition_OwnedPortConjugator(), "conjugatedPortDefinition", null, 1, 1, PortConjugation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_PropertyOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedProperty(), "propertyOwningDefinition", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_PropertyOwningUsage(), this.getUsage(), this.getUsage_NestedProperty(), "propertyOwningUsage", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(stateUsageEClass, StateUsage.class, "StateUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateUsage_StateOwningUsage(), this.getUsage(), this.getUsage_NestedState(), "stateOwningUsage", null, 0, 1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateUsage_StateDefinition(), this.getBehavior(), null, "stateDefinition", null, 1, -1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateUsage_EntryAction(), this.getActionUsage(), null, "entryAction", null, 0, 1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateUsage_DoAction(), this.getActionUsage(), null, "doAction", null, 0, 1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateUsage_ExitAction(), this.getActionUsage(), null, "exitAction", null, 0, 1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateUsage_StateOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedState(), "stateOwningDefinition", null, 0, 1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(constraintUsageEClass, ConstraintUsage.class, "ConstraintUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintUsage_ConstraintDefinition(), this.getPredicate(), null, "constraintDefinition", null, 1, 1, ConstraintUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraintUsage_ConstraintOwningUsage(), this.getUsage(), this.getUsage_NestedConstraint(), "constraintOwningUsage", null, 0, 1, ConstraintUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraintUsage_ConstraintOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedConstraint(), "constraintOwningDefinition", null, 0, 1, ConstraintUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(transitionUsageEClass, TransitionUsage.class, "TransitionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionUsage_TransitionOwningUsage(), this.getUsage(), this.getUsage_NestedTransition(), "transitionOwningUsage", null, 0, 1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_Source(), this.getActionUsage(), null, "source", null, 1, 1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_Target(), this.getActionUsage(), null, "target", null, 1, 1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_TriggerAction(), this.getAcceptActionUsage(), null, "triggerAction", null, 0, -1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_GuardExpression(), this.getExpression(), null, "guardExpression", null, 0, -1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_EffectAction(), this.getActionUsage(), null, "effectAction", null, 0, -1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_Succession(), this.getSuccession(), null, "succession", null, 1, 1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(acceptActionUsageEClass, AcceptActionUsage.class, "AcceptActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transferActionUsageEClass, TransferActionUsage.class, "TransferActionUsage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferActionUsage_Context(), this.getFeature(), null, "context", null, 1, 1, TransferActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(requirementUsageEClass, RequirementUsage.class, "RequirementUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementUsage_RequirementDefinition(), this.getRequirementDefinition(), null, "requirementDefinition", null, 1, 1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementUsage_RequirementOwningUsage(), this.getUsage(), this.getUsage_NestedRequirement(), "requirementOwningUsage", null, 0, 1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementUsage_SubjectParameter(), this.getParameter(), null, "subjectParameter", null, 1, 1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirementUsage_ReqId(), theTypesPackage.getString(), "reqId", null, 0, 1, RequirementUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirementUsage_Text(), theTypesPackage.getString(), "text", null, 0, 1, RequirementUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementUsage_RequiredConstraint(), this.getConstraintUsage(), null, "requiredConstraint", null, 0, -1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementUsage_AssumedConstraint(), this.getConstraintUsage(), null, "assumedConstraint", null, 0, -1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementUsage_RequirementOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedRequirement(), "requirementOwningDefinition", null, 0, 1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(requirementDefinitionEClass, RequirementDefinition.class, "RequirementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementDefinition_SubjectParameter(), this.getParameter(), null, "subjectParameter", null, 1, 1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirementDefinition_ReqId(), theTypesPackage.getString(), "reqId", null, 0, 1, RequirementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirementDefinition_Text(), theTypesPackage.getString(), "text", null, 0, 1, RequirementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementDefinition_AssumedConstraint(), this.getConstraintUsage(), null, "assumedConstraint", null, 0, -1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementDefinition_RequiredConstraint(), this.getConstraintUsage(), null, "requiredConstraint", null, 0, -1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(constraintDefinitionEClass, ConstraintDefinition.class, "ConstraintDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionUsageEClass, FunctionUsage.class, "FunctionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionUsage_FunctionDefinition(), this.getFunction(), null, "functionDefinition", null, 1, 1, FunctionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionUsage_FunctionOwningUsage(), this.getUsage(), this.getUsage_NestedFunction(), "functionOwningUsage", null, 0, 1, FunctionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFunctionUsage_FunctionOwningDefinition(), this.getDefinition(), this.getDefinition_OwnedFunction(), "functionOwningDefinition", null, 0, 1, FunctionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Action(), this.getActionUsage(), null, "action", null, 0, -1, Activity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuePropertyEClass, ValueProperty.class, "ValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueProperty_ValueType(), this.getDataType(), null, "valueType", null, 1, -1, ValueProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(sendActionUsageEClass, SendActionUsage.class, "SendActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendActionUsage_Target(), this.getExpression(), null, "target", null, 1, 1, SendActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(performActionUsageEClass, PerformActionUsage.class, "PerformActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformActionUsage_PerformedAction(), this.getActionUsage(), null, "performedAction", null, 1, 1, PerformActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(connectionUsageEClass, ConnectionUsage.class, "ConnectionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceDefinitionEClass, InterfaceDefinition.class, "InterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDefinition_InterfaceEnd(), this.getPortUsage(), null, "interfaceEnd", null, 2, -1, InterfaceDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(associationBlockEClass, AssociationBlock.class, "AssociationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceUsageEClass, InterfaceUsage.class, "InterfaceUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceUsage_InterfaceDefinition(), this.getInterfaceDefinition(), null, "interfaceDefinition", null, 1, 1, InterfaceUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(conjugatedPortTypingEClass, ConjugatedPortTyping.class, "ConjugatedPortTyping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjugatedPortTyping_PortDefinition(), this.getPortDefinition(), null, "portDefinition", null, 1, 1, ConjugatedPortTyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConjugatedPortTyping_ConjugatedPortDefinition(), this.getConjugatedPortDefinition(), null, "conjugatedPortDefinition", null, 1, 1, ConjugatedPortTyping.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(transitionFeatureMembershipEClass, TransitionFeatureMembership.class, "TransitionFeatureMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionFeatureMembership_Kind(), this.getTransitionFeatureKind(), "kind", null, 1, 1, TransitionFeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionFeatureMembership_TransitionFeature_comp(), this.getStep(), null, "transitionFeature_comp", null, 1, 1, TransitionFeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionFeatureMembership_TransitionFeature(), this.getStep(), null, "transitionFeature", null, 1, 1, TransitionFeatureMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exhibitStateUsageEClass, ExhibitStateUsage.class, "ExhibitStateUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExhibitStateUsage_ExhibitedState(), this.getStateUsage(), null, "exhibitedState", null, 1, 1, ExhibitStateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(stateSubactionMembershipEClass, StateSubactionMembership.class, "StateSubactionMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateSubactionMembership_Kind(), this.getStateSubactionKind(), "kind", null, 1, 1, StateSubactionMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateSubactionMembership_Action_comp(), this.getActionUsage(), null, "action_comp", null, 1, 1, StateSubactionMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateSubactionMembership_Action(), this.getActionUsage(), null, "action", null, 1, 1, StateSubactionMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateDefinitionEClass, StateDefinition.class, "StateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateDefinition_State(), this.getStateUsage(), null, "state", null, 0, -1, StateDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateDefinition_EntryAction(), this.getActionUsage(), null, "entryAction", null, 0, 1, StateDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateDefinition_DoAction(), this.getActionUsage(), null, "doAction", null, 0, 1, StateDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateDefinition_ExitAction(), this.getActionUsage(), null, "exitAction", null, 0, 1, StateDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(assertConstraintUsageEClass, AssertConstraintUsage.class, "AssertConstraintUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertConstraintUsage_AssertedConstraint(), this.getConstraintUsage(), null, "assertedConstraint", null, 1, 1, AssertConstraintUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(blockPropertyEClass, BlockProperty.class, "BlockProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockProperty_Block(), this.getClass_(), null, "block", null, 1, -1, BlockProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(partPropertyEClass, PartProperty.class, "PartProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referencePropertyEClass, ReferenceProperty.class, "ReferenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionDefinition_FunctionInvocation(), this.getFunctionUsage(), null, "functionInvocation", null, 0, -1, FunctionDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(requirementConstraintMembershipEClass, RequirementConstraintMembership.class, "RequirementConstraintMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementConstraintMembership_Kind(), this.getRequirementConstraintKind(), "kind", null, 1, 1, RequirementConstraintMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementConstraintMembership_Constraint_comp(), this.getConstraintUsage(), null, "constraint_comp", null, 1, 1, RequirementConstraintMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementConstraintMembership_Constraint(), this.getConstraintUsage(), null, "constraint", null, 1, 1, RequirementConstraintMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(satisfyRequirementUsageEClass, SatisfyRequirementUsage.class, "SatisfyRequirementUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatisfyRequirementUsage_SatisfiedRequirement(), this.getRequirementUsage(), null, "satisfiedRequirement", null, 1, 1, SatisfyRequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSatisfyRequirementUsage_SatisfyingFeature(), this.getFeature(), null, "satisfyingFeature", null, 1, 1, SatisfyRequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(lifeClassEClass, LifeClass.class, "LifeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeSliceFeatureEClass, TimeSliceFeature.class, "TimeSliceFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(snapshotFeatureEClass, SnapshotFeature.class, "SnapshotFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(individualDefinitionEClass, IndividualDefinition.class, "IndividualDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualDefinition_LifeClass(), this.getClass_(), null, "lifeClass", null, 1, 1, IndividualDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(individualUsageEClass, IndividualUsage.class, "IndividualUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualUsage_IndividualDefinition(), this.getIndividualDefinition(), null, "individualDefinition", null, 1, 1, IndividualUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndividualUsage_IsTimeSlice(), theTypesPackage.getBoolean(), "isTimeSlice", null, 1, 1, IndividualUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndividualUsage_IsSnapshot(), theTypesPackage.getBoolean(), "isSnapshot", null, 1, 1, IndividualUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getIndividualUsage_TimeSliceFeature(), this.getFeature(), null, "timeSliceFeature", null, 0, 1, IndividualUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getIndividualUsage_SnapshotFeature(), this.getFeature(), null, "snapshotFeature", null, 0, 1, IndividualUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

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

		initEEnum(transitionFeatureKindEEnum, TransitionFeatureKind.class, "TransitionFeatureKind");
		addEEnumLiteral(transitionFeatureKindEEnum, TransitionFeatureKind.TRIGGER);
		addEEnumLiteral(transitionFeatureKindEEnum, TransitionFeatureKind.GUARD);
		addEEnumLiteral(transitionFeatureKindEEnum, TransitionFeatureKind.EFFECT);

		initEEnum(stateSubactionKindEEnum, StateSubactionKind.class, "StateSubactionKind");
		addEEnumLiteral(stateSubactionKindEEnum, StateSubactionKind.ENTRY);
		addEEnumLiteral(stateSubactionKindEEnum, StateSubactionKind.DO);
		addEEnumLiteral(stateSubactionKindEEnum, StateSubactionKind.EXIT);

		initEEnum(requirementConstraintKindEEnum, RequirementConstraintKind.class, "RequirementConstraintKind");
		addEEnumLiteral(requirementConstraintKindEEnum, RequirementConstraintKind.ASSUMPTION);
		addEEnumLiteral(requirementConstraintKindEEnum, RequirementConstraintKind.REQUIREMENT);

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
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getImport_ImportOwningPackage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
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
		  (getFeatureMembership_OwnedMemberFeature_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/ownedMemberElement_comp")
		   });
		addAnnotation
		  (getFeatureMembership_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/membershipOwningPackage")
		   });
		addAnnotation
		  (getConjugation_OriginalType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getConjugation_ConjugatedType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
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
		  (getFunction_Expression(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/step")
		   });
		addAnnotation
		  (getOperatorExpression_Operand_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InvocationExpression/argument")
		   });
		addAnnotation
		  (getBooleanExpression_Predicate(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Expression/function")
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
		  (getImportCondition_Predicate_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/ownedRelatedElement_comp"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getImportCondition_ConditionalImport(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
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
		  (getFeatureValue_Value_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature_comp")
		   });
		addAnnotation
		  (getParameterMembership_MemberParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/memberFeature")
		   });
		addAnnotation
		  (getParameterMembership_OwnedMemberParameter_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature_comp")
		   });
		addAnnotation
		  (getMultiplicityRange_Bound(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
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
		  (getOwnership_OwnedTarget_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
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
		  (getAnnotation_AnnotatingComment(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getActionUsage_ActionOwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningDefinition")
		   });
		addAnnotation
		  (getActionUsage_ActionOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningUsage")
		   });
		addAnnotation
		  (getActionUsage_Activity(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/behavior")
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
		  (getPortUsage_PortOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningUsage")
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
		  (getConjugatedPortDefinition_OwnedPortConjugator(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedConjugator")
		   });
		addAnnotation
		  (getConjugatedPortDefinition_OriginalPortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owningNamespace")
		   });
		addAnnotation
		  (getPortConjugation_OriginalPortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Conjugation/originalType")
		   });
		addAnnotation
		  (getPortConjugation_ConjugatedPortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Conjugation/owningType")
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
		  (getStateUsage_StateOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionUsage/actionOwningUsage")
		   });
		addAnnotation
		  (getStateUsage_StateDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/behavior")
		   });
		addAnnotation
		  (getStateUsage_StateOwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningDefinition")
		   });
		addAnnotation
		  (getConstraintUsage_ConstraintDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BooleanExpression/predicate")
		   });
		addAnnotation
		  (getConstraintUsage_ConstraintOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningUsage")
		   });
		addAnnotation
		  (getConstraintUsage_ConstraintOwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningDefinition")
		   });
		addAnnotation
		  (getTransitionUsage_TransitionOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/owningUsage")
		   });
		addAnnotation
		  (getRequirementUsage_RequirementDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConstraintUsage/constraintDefinition")
		   });
		addAnnotation
		  (getRequirementUsage_RequirementOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConstraintUsage/constraintOwningUsage")
		   });
		addAnnotation
		  (getRequirementUsage_RequirementOwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConstraintUsage/constraintOwningDefinition")
		   });
		addAnnotation
		  (getFunctionUsage_FunctionDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Expression/function"),
			 URI.createURI(eNS_URI).appendFragment("//ActionUsage/activity")
		   });
		addAnnotation
		  (getFunctionUsage_FunctionOwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionUsage/actionOwningUsage")
		   });
		addAnnotation
		  (getFunctionUsage_FunctionOwningDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionUsage/actionOwningDefinition")
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
		  (getInterfaceDefinition_InterfaceEnd(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Association/associationEnd")
		   });
		addAnnotation
		  (getInterfaceUsage_InterfaceDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Connector/association")
		   });
		addAnnotation
		  (getConjugatedPortTyping_ConjugatedPortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureTyping/type")
		   });
		addAnnotation
		  (getTransitionFeatureMembership_TransitionFeature_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature_comp")
		   });
		addAnnotation
		  (getStateSubactionMembership_Action_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature_comp")
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
		  (getRequirementConstraintMembership_Constraint_comp(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature_comp")
		   });
		addAnnotation
		  (getSatisfyRequirementUsage_SatisfiedRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AssertConstraintUsage/assertedConstraint")
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
		  (getExpression_Result(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Type/output")
		   });
		addAnnotation
		  (getStep_Parameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getFeature_OwningFeatureMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owningMembership")
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
		  (getFeature_EndOwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/owningType")
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
		  (getType_OwnedGeneralization(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship_comp")
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
		  (getType_OwnedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Package/ownedMember")
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
		  (getType_OwnedEndFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/endFeature"),
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getType_OwnedConjugator(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship_comp"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement"),
			 URI.createURI(eNS_URI).appendFragment("//Type/conjugator")
		   });
		addAnnotation
		  (getType_InheritedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getType_Multiplicity(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getType_OwnedFeatureMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/ownedMembership_comp"),
			 URI.createURI(eNS_URI).appendFragment("//Type/featureMembership")
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
			 URI.createURI(eNS_URI).appendFragment("//Package/membership"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship_comp")
		   });
		addAnnotation
		  (getPackage_OwnedImport(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship_comp")
		   });
		addAnnotation
		  (getElement_OwningMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owningRelationship")
		   });
		addAnnotation
		  (getMembership_OwnedMemberElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/memberElement"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/ownedRelatedElement_comp")
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
		  (getImport_ImportedPackage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
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
		  (getConjugation_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Conjugation/conjugatedType"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/ownedRelatedElement_comp"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
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
		  (getFunction_Result(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Type/output")
		   });
		addAnnotation
		  (getInvocationExpression_Argument(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getFeatureReferenceExpression_Referent(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/member")
		   });
		addAnnotation
		  (getInvariant_AssertionConnector(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
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
		  (getConditionalImport_Condition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship_comp")
		   });
		addAnnotation
		  (getSuccession_TransitionStep(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
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
		  (getFeatureValue_FeatureWithValue(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/owningType")
		   });
		addAnnotation
		  (getParameterMembership_OwnedMemberParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ParameterMembership/memberParameter")
		   });
		addAnnotation
		  (getMultiplicityRange_LowerBound(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MultiplicityRange/bound")
		   });
		addAnnotation
		  (getMultiplicityRange_UpperBound(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//MultiplicityRange/bound")
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
		  (getOwnership_OwnedTarget(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/ownedRelatedElement_comp")
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
		  (getUsage_OwningDefinition(),
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
		  (getUsage_NestedState(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedAction")
		   });
		addAnnotation
		  (getUsage_NestedConstraint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_NestedTransition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_NestedRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedConstraint")
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
		  (getDefinition_OwnedPort(),
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
		  (getDefinition_OwnedProperty(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
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
		  (getDefinition_OwnedAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedState(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedConstraint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedTransition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedConstraint")
		   });
		addAnnotation
		  (getDefinition_OwnedFunction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedAction")
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
		  (getPortDefinition_ConjugatedPortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/ownedMember")
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
		  (getTransitionUsage_TriggerAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getTransitionUsage_GuardExpression(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getTransitionUsage_EffectAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getTransitionUsage_Succession(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getRequirementUsage_SubjectParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter")
		   });
		addAnnotation
		  (getRequirementUsage_RequiredConstraint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getRequirementUsage_AssumedConstraint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getRequirementDefinition_SubjectParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter")
		   });
		addAnnotation
		  (getRequirementDefinition_AssumedConstraint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getRequirementDefinition_RequiredConstraint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
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
		  (getConjugatedPortTyping_PortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getStateDefinition_State(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/step")
		   });
		addAnnotation
		  (getFunctionDefinition_FunctionInvocation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Activity/action"),
			 URI.createURI(eNS_URI).appendFragment("//Function/expression")
		   });
		addAnnotation
		  (getIndividualDefinition_LifeClass(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/ownedMember")
		   });
		addAnnotation
		  (getIndividualUsage_IndividualDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BlockProperty/block")
		   });
		addAnnotation
		  (getIndividualUsage_TimeSliceFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getIndividualUsage_SnapshotFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
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
		  (getExpression_Function(),
		   source,
		   new String[] {
			   "body", "typedExpression"
		   });
		addAnnotation
		  (getExpression_Result(),
		   source,
		   new String[] {
			   "body", "computingExpresion"
		   });
		addAnnotation
		  (getStep_Behavior(),
		   source,
		   new String[] {
			   "body", "typedStep"
		   });
		addAnnotation
		  (getStep_Parameter(),
		   source,
		   new String[] {
			   "body", "parameteredStep"
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
			   "body", "inheritingType"
		   });
		addAnnotation
		  (getType_EndFeature(),
		   source,
		   new String[] {
			   "body", "endFeaturingType"
		   });
		addAnnotation
		  (getType_FeatureMembership(),
		   source,
		   new String[] {
			   "body", "type"
		   });
		addAnnotation
		  (getType_InheritedFeature(),
		   source,
		   new String[] {
			   "body", "inheritingType"
		   });
		addAnnotation
		  (getType_Multiplicity(),
		   source,
		   new String[] {
			   "body", "typeWithMultiplicity"
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
		  (getImport_ImportedPackage(),
		   source,
		   new String[] {
			   "body", "import"
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
		  (getConjugation_OriginalType(),
		   source,
		   new String[] {
			   "body", "conjugation"
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
		  (getFeatureTyping_Type(),
		   source,
		   new String[] {
			   "body", "typingByType"
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
		  (getOperatorExpression_Operand_comp(),
		   source,
		   new String[] {
			   "body", "operatorExpression"
		   });
		addAnnotation
		  (getInvocationExpression_Argument(),
		   source,
		   new String[] {
			   "body", "invocation"
		   });
		addAnnotation
		  (getFeatureReferenceExpression_Referent(),
		   source,
		   new String[] {
			   "body", "reference"
		   });
		addAnnotation
		  (getInvariant_AssertionConnector(),
		   source,
		   new String[] {
			   "body", "invariant"
		   });
		addAnnotation
		  (getBooleanExpression_Predicate(),
		   source,
		   new String[] {
			   "body", "typedBooleanExpression"
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
		  (getConditionalImport_Selector(),
		   source,
		   new String[] {
			   "body", "import"
		   });
		addAnnotation
		  (getImportCondition_Predicate_comp(),
		   source,
		   new String[] {
			   "body", "condition"
		   });
		addAnnotation
		  (getSuccession_TransitionStep(),
		   source,
		   new String[] {
			   "body", "succession"
		   });
		addAnnotation
		  (getSuccession_TriggerStep(),
		   source,
		   new String[] {
			   "body", "succession"
		   });
		addAnnotation
		  (getSuccession_EffectStep(),
		   source,
		   new String[] {
			   "body", "succession"
		   });
		addAnnotation
		  (getSuccession_GuardExpression(),
		   source,
		   new String[] {
			   "body", "succession"
		   });
		addAnnotation
		  (getFeatureValue_FeatureWithValue(),
		   source,
		   new String[] {
			   "body", "valuation"
		   });
		addAnnotation
		  (getFeatureValue_ValueConnector(),
		   source,
		   new String[] {
			   "body", "featureValue"
		   });
		addAnnotation
		  (getFeatureValue_Value_comp(),
		   source,
		   new String[] {
			   "body", "expressedValuation"
		   });
		addAnnotation
		  (getParameterMembership_MemberParameter(),
		   source,
		   new String[] {
			   "body", "parameterMembership"
		   });
		addAnnotation
		  (getParameterMembership_OwnedMemberParameter_comp(),
		   source,
		   new String[] {
			   "body", "owningParameterMembership"
		   });
		addAnnotation
		  (getMultiplicityRange_LowerBound(),
		   source,
		   new String[] {
			   "body", "multiplicity"
		   });
		addAnnotation
		  (getMultiplicityRange_UpperBound(),
		   source,
		   new String[] {
			   "body", "multiplicity"
		   });
		addAnnotation
		  (getMultiplicityRange_Bound(),
		   source,
		   new String[] {
			   "body", "multiplicity"
		   });
		addAnnotation
		  (getOwnership_OwningSource(),
		   source,
		   new String[] {
			   "body", "sourceOwnership"
		   });
		addAnnotation
		  (getOwnership_OwnedTarget_comp(),
		   source,
		   new String[] {
			   "body", "targetOwnership"
		   });
		addAnnotation
		  (getComment_CommentedElement(),
		   source,
		   new String[] {
			   "body", "comment"
		   });
		addAnnotation
		  (getAnnotation_AnnotatedElement(),
		   source,
		   new String[] {
			   "body", "annotation"
		   });
		addAnnotation
		  (getActionUsage_Activity(),
		   source,
		   new String[] {
			   "body", "definedAction"
		   });
		addAnnotation
		  (getUsage_Property(),
		   source,
		   new String[] {
			   "body", "usageWithProperty"
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
		  (getPortUsage_PortDefinition(),
		   source,
		   new String[] {
			   "body", "definedPort"
		   });
		addAnnotation
		  (getPortConjugation_OriginalPortDefinition(),
		   source,
		   new String[] {
			   "body", "portConjugation"
		   });
		addAnnotation
		  (getStateUsage_StateDefinition(),
		   source,
		   new String[] {
			   "body", "definedState"
		   });
		addAnnotation
		  (getStateUsage_EntryAction(),
		   source,
		   new String[] {
			   "body", "enteredState"
		   });
		addAnnotation
		  (getStateUsage_DoAction(),
		   source,
		   new String[] {
			   "body", "activeState"
		   });
		addAnnotation
		  (getStateUsage_ExitAction(),
		   source,
		   new String[] {
			   "body", "exitedState"
		   });
		addAnnotation
		  (getConstraintUsage_ConstraintDefinition(),
		   source,
		   new String[] {
			   "body", "definedConstraint"
		   });
		addAnnotation
		  (getTransitionUsage_Source(),
		   source,
		   new String[] {
			   "body", "outgoingTransition"
		   });
		addAnnotation
		  (getTransitionUsage_Target(),
		   source,
		   new String[] {
			   "body", "incomingTransition"
		   });
		addAnnotation
		  (getTransitionUsage_TriggerAction(),
		   source,
		   new String[] {
			   "body", "triggeredTransition"
		   });
		addAnnotation
		  (getTransitionUsage_GuardExpression(),
		   source,
		   new String[] {
			   "body", "guardedTransition"
		   });
		addAnnotation
		  (getTransitionUsage_EffectAction(),
		   source,
		   new String[] {
			   "body", "activeTransition"
		   });
		addAnnotation
		  (getTransitionUsage_Succession(),
		   source,
		   new String[] {
			   "body", "linkedTransition"
		   });
		addAnnotation
		  (getTransferActionUsage_Context(),
		   source,
		   new String[] {
			   "body", "transferActionUsage"
		   });
		addAnnotation
		  (getRequirementUsage_RequirementDefinition(),
		   source,
		   new String[] {
			   "body", "definedRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_SubjectParameter(),
		   source,
		   new String[] {
			   "body", "parameteredRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_RequiredConstraint(),
		   source,
		   new String[] {
			   "body", "requringRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_AssumedConstraint(),
		   source,
		   new String[] {
			   "body", "assumingRequirement"
		   });
		addAnnotation
		  (getRequirementDefinition_SubjectParameter(),
		   source,
		   new String[] {
			   "body", "parameteredRequirementDefinition"
		   });
		addAnnotation
		  (getRequirementDefinition_AssumedConstraint(),
		   source,
		   new String[] {
			   "body", "assumingRequirementDefinition"
		   });
		addAnnotation
		  (getRequirementDefinition_RequiredConstraint(),
		   source,
		   new String[] {
			   "body", "requiringRequirementDefinition"
		   });
		addAnnotation
		  (getFunctionUsage_FunctionDefinition(),
		   source,
		   new String[] {
			   "body", "functionIUsage"
		   });
		addAnnotation
		  (getActivity_Action(),
		   source,
		   new String[] {
			   "body", "featuringActivity"
		   });
		addAnnotation
		  (getValueProperty_ValueType(),
		   source,
		   new String[] {
			   "body", "typedProperty"
		   });
		addAnnotation
		  (getSendActionUsage_Target(),
		   source,
		   new String[] {
			   "body", "sendActionUsage"
		   });
		addAnnotation
		  (getPerformActionUsage_PerformedAction(),
		   source,
		   new String[] {
			   "body", "actionPerformance"
		   });
		addAnnotation
		  (getInterfaceDefinition_InterfaceEnd(),
		   source,
		   new String[] {
			   "body", "interfaceDefinitionWithEnd"
		   });
		addAnnotation
		  (getInterfaceUsage_InterfaceDefinition(),
		   source,
		   new String[] {
			   "body", "interfaceUsage"
		   });
		addAnnotation
		  (getConjugatedPortTyping_PortDefinition(),
		   source,
		   new String[] {
			   "body", "conjugatedPortTyping"
		   });
		addAnnotation
		  (getConjugatedPortTyping_ConjugatedPortDefinition(),
		   source,
		   new String[] {
			   "body", "typingByConjugatedPort"
		   });
		addAnnotation
		  (getTransitionFeatureMembership_TransitionFeature_comp(),
		   source,
		   new String[] {
			   "body", "transitionFeatureMembership"
		   });
		addAnnotation
		  (getExhibitStateUsage_ExhibitedState(),
		   source,
		   new String[] {
			   "body", "stateExhibition"
		   });
		addAnnotation
		  (getStateSubactionMembership_Action_comp(),
		   source,
		   new String[] {
			   "body", "stateSubactionMembership"
		   });
		addAnnotation
		  (getStateDefinition_State(),
		   source,
		   new String[] {
			   "body", "featuringStateDefinition"
		   });
		addAnnotation
		  (getStateDefinition_EntryAction(),
		   source,
		   new String[] {
			   "body", "enteredStateDefinition"
		   });
		addAnnotation
		  (getStateDefinition_DoAction(),
		   source,
		   new String[] {
			   "body", "activeStateDefintion"
		   });
		addAnnotation
		  (getStateDefinition_ExitAction(),
		   source,
		   new String[] {
			   "body", "exitedStateDefinition"
		   });
		addAnnotation
		  (getAssertConstraintUsage_AssertedConstraint(),
		   source,
		   new String[] {
			   "body", "constraintAssertion"
		   });
		addAnnotation
		  (getBlockProperty_Block(),
		   source,
		   new String[] {
			   "body", "typedProperty"
		   });
		addAnnotation
		  (getFunctionDefinition_FunctionInvocation(),
		   source,
		   new String[] {
			   "body", "featuringFunctionDefinition"
		   });
		addAnnotation
		  (getRequirementConstraintMembership_Constraint_comp(),
		   source,
		   new String[] {
			   "body", "requirementConstraintMembership"
		   });
		addAnnotation
		  (getSatisfyRequirementUsage_SatisfiedRequirement(),
		   source,
		   new String[] {
			   "body", "requirementSatisfaction"
		   });
		addAnnotation
		  (getSatisfyRequirementUsage_SatisfyingFeature(),
		   source,
		   new String[] {
			   "body", "satisfiedRequirement"
		   });
		addAnnotation
		  (getIndividualDefinition_LifeClass(),
		   source,
		   new String[] {
			   "body", "individualWithLife"
		   });
		addAnnotation
		  (getIndividualUsage_IndividualDefinition(),
		   source,
		   new String[] {
			   "body", "individualUsage"
		   });
		addAnnotation
		  (getIndividualUsage_TimeSliceFeature(),
		   source,
		   new String[] {
			   "body", "timeSliceUsage"
		   });
		addAnnotation
		  (getIndividualUsage_SnapshotFeature(),
		   source,
		   new String[] {
			   "body", "snapshotUsage"
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
		  (getPackage_Membership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRelationship_RelatedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMultiplicityRange_Bound(),
		   source,
		   new String[] {
		   });
	}

} //SysMLPackageImpl
