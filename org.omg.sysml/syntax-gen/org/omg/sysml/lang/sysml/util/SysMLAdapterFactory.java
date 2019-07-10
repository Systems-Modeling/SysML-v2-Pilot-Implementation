/**
 */
package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.AtomicInteraction;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.BlockExpression;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.InstanceCreationExpression;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.ItemFlowFeature;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralReal;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.LiteralUnbounded;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.ObjectClass;
import org.omg.sysml.lang.sysml.OfSuccession;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.OrderedFeature;
import org.omg.sysml.lang.sysml.Ownership;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.QueryPathExpression;
import org.omg.sysml.lang.sysml.QueryPathStepExpression;
import org.omg.sysml.lang.sysml.QueryQualifierExpression;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.SequenceConstructionExpression;
import org.omg.sysml.lang.sysml.SourceEnd;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.StructuredFeature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TargetEnd;
import org.omg.sysml.lang.sysml.ValueClass;

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
			public Adapter caseObjectClass(ObjectClass object) {
				return createObjectClassAdapter();
			}
			@Override
			public Adapter caseClass(org.omg.sysml.lang.sysml.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter casePackage(org.omg.sysml.lang.sysml.Package object) {
				return createPackageAdapter();
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
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object) {
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseBehavior(Behavior object) {
				return createBehaviorAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
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
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseFeatureMembership(FeatureMembership object) {
				return createFeatureMembershipAdapter();
			}
			@Override
			public Adapter caseFeatureValue(FeatureValue object) {
				return createFeatureValueAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseMultiplicity(Multiplicity object) {
				return createMultiplicityAdapter();
			}
			@Override
			public Adapter caseFeatureTyping(FeatureTyping object) {
				return createFeatureTypingAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseSuperclassing(Superclassing object) {
				return createSuperclassingAdapter();
			}
			@Override
			public Adapter caseValueClass(ValueClass object) {
				return createValueClassAdapter();
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
			public Adapter caseEndFeatureMembership(EndFeatureMembership object) {
				return createEndFeatureMembershipAdapter();
			}
			@Override
			public Adapter caseBindingConnector(BindingConnector object) {
				return createBindingConnectorAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
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
			public Adapter caseReturnParameterMembership(ReturnParameterMembership object) {
				return createReturnParameterMembershipAdapter();
			}
			@Override
			public Adapter caseParameterMembership(ParameterMembership object) {
				return createParameterMembershipAdapter();
			}
			@Override
			public Adapter caseOfSuccession(OfSuccession object) {
				return createOfSuccessionAdapter();
			}
			@Override
			public Adapter caseOrderedFeature(OrderedFeature object) {
				return createOrderedFeatureAdapter();
			}
			@Override
			public Adapter caseStructuredFeature(StructuredFeature object) {
				return createStructuredFeatureAdapter();
			}
			@Override
			public Adapter caseSuccession(Succession object) {
				return createSuccessionAdapter();
			}
			@Override
			public Adapter caseAtomicInteraction(AtomicInteraction object) {
				return createAtomicInteractionAdapter();
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
			public Adapter caseOperatorExpression(OperatorExpression object) {
				return createOperatorExpressionAdapter();
			}
			@Override
			public Adapter caseInvocationExpression(InvocationExpression object) {
				return createInvocationExpressionAdapter();
			}
			@Override
			public Adapter caseQueryPathStepExpression(QueryPathStepExpression object) {
				return createQueryPathStepExpressionAdapter();
			}
			@Override
			public Adapter caseInstanceCreationExpression(InstanceCreationExpression object) {
				return createInstanceCreationExpressionAdapter();
			}
			@Override
			public Adapter caseFeatureReferenceExpression(FeatureReferenceExpression object) {
				return createFeatureReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseQueryPathExpression(QueryPathExpression object) {
				return createQueryPathExpressionAdapter();
			}
			@Override
			public Adapter caseBlockExpression(BlockExpression object) {
				return createBlockExpressionAdapter();
			}
			@Override
			public Adapter caseQueryQualifierExpression(QueryQualifierExpression object) {
				return createQueryQualifierExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralExpression(LiteralExpression object) {
				return createLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralReal(LiteralReal object) {
				return createLiteralRealAdapter();
			}
			@Override
			public Adapter caseLiteralUnbounded(LiteralUnbounded object) {
				return createLiteralUnboundedAdapter();
			}
			@Override
			public Adapter caseLiteralString(LiteralString object) {
				return createLiteralStringAdapter();
			}
			@Override
			public Adapter caseLiteralBoolean(LiteralBoolean object) {
				return createLiteralBooleanAdapter();
			}
			@Override
			public Adapter caseNullExpression(NullExpression object) {
				return createNullExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralInteger(LiteralInteger object) {
				return createLiteralIntegerAdapter();
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
			public Adapter caseItemFeature(ItemFeature object) {
				return createItemFeatureAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ValueClass <em>Value Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ValueClass
	 * @generated
	 */
	public Adapter createValueClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.ObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.ObjectClass
	 * @generated
	 */
	public Adapter createObjectClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.OfSuccession <em>Of Succession</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.OfSuccession
	 * @generated
	 */
	public Adapter createOfSuccessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.OrderedFeature <em>Ordered Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.OrderedFeature
	 * @generated
	 */
	public Adapter createOrderedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.StructuredFeature <em>Structured Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.StructuredFeature
	 * @generated
	 */
	public Adapter createStructuredFeatureAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.omg.sysml.lang.sysml.AtomicInteraction <em>Atomic Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.sysml.lang.sysml.AtomicInteraction
	 * @generated
	 */
	public Adapter createAtomicInteractionAdapter() {
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
