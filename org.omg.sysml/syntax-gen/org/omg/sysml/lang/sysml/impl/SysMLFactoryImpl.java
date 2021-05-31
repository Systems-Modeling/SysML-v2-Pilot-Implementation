/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
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
			case SysMLPackage.PATH_STEP_EXPRESSION: return createPathStepExpression();
			case SysMLPackage.OPERATOR_EXPRESSION: return createOperatorExpression();
			case SysMLPackage.INVOCATION_EXPRESSION: return createInvocationExpression();
			case SysMLPackage.EXPRESSION: return createExpression();
			case SysMLPackage.STEP: return createStep();
			case SysMLPackage.FEATURE: return createFeature();
			case SysMLPackage.TYPE: return createType();
			case SysMLPackage.NAMESPACE: return createNamespace();
			case SysMLPackage.ELEMENT: return createElement();
			case SysMLPackage.MEMBERSHIP: return createMembership();
			case SysMLPackage.RELATIONSHIP: return createRelationship();
			case SysMLPackage.DOCUMENTATION: return createDocumentation();
			case SysMLPackage.ANNOTATION: return createAnnotation();
			case SysMLPackage.ANNOTATING_ELEMENT: return createAnnotatingElement();
			case SysMLPackage.COMMENT: return createComment();
			case SysMLPackage.TEXTUAL_REPRESENTATION: return createTextualRepresentation();
			case SysMLPackage.IMPORT: return createImport();
			case SysMLPackage.GENERALIZATION: return createGeneralization();
			case SysMLPackage.FEATURE_MEMBERSHIP: return createFeatureMembership();
			case SysMLPackage.TYPE_FEATURING: return createTypeFeaturing();
			case SysMLPackage.CONJUGATION: return createConjugation();
			case SysMLPackage.MULTIPLICITY: return createMultiplicity();
			case SysMLPackage.REDEFINITION: return createRedefinition();
			case SysMLPackage.SUBSETTING: return createSubsetting();
			case SysMLPackage.FEATURE_TYPING: return createFeatureTyping();
			case SysMLPackage.BEHAVIOR: return createBehavior();
			case SysMLPackage.CLASS: return createClass();
			case SysMLPackage.CLASSIFIER: return createClassifier();
			case SysMLPackage.SUPERCLASSING: return createSuperclassing();
			case SysMLPackage.FUNCTION: return createFunction();
			case SysMLPackage.PATH_SELECT_EXPRESSION: return createPathSelectExpression();
			case SysMLPackage.NULL_EXPRESSION: return createNullExpression();
			case SysMLPackage.LITERAL_REAL: return createLiteralReal();
			case SysMLPackage.LITERAL_EXPRESSION: return createLiteralExpression();
			case SysMLPackage.LITERAL_INTEGER: return createLiteralInteger();
			case SysMLPackage.LITERAL_UNBOUNDED: return createLiteralUnbounded();
			case SysMLPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
			case SysMLPackage.LITERAL_STRING: return createLiteralString();
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION: return createFeatureReferenceExpression();
			case SysMLPackage.ASSOCIATION_STRUCTURE: return createAssociationStructure();
			case SysMLPackage.STRUCTURE: return createStructure();
			case SysMLPackage.ASSOCIATION: return createAssociation();
			case SysMLPackage.FEATURE_VALUE: return createFeatureValue();
			case SysMLPackage.BINDING_CONNECTOR: return createBindingConnector();
			case SysMLPackage.CONNECTOR: return createConnector();
			case SysMLPackage.PARAMETER_MEMBERSHIP: return createParameterMembership();
			case SysMLPackage.PACKAGE: return createPackage();
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP: return createElementFilterMembership();
			case SysMLPackage.MULTIPLICITY_RANGE: return createMultiplicityRange();
			case SysMLPackage.SOURCE_END: return createSourceEnd();
			case SysMLPackage.TARGET_END: return createTargetEnd();
			case SysMLPackage.SUCCESSION: return createSuccession();
			case SysMLPackage.DATA_TYPE: return createDataType();
			case SysMLPackage.INVARIANT: return createInvariant();
			case SysMLPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
			case SysMLPackage.PREDICATE: return createPredicate();
			case SysMLPackage.RETURN_PARAMETER_MEMBERSHIP: return createReturnParameterMembership();
			case SysMLPackage.RESULT_EXPRESSION_MEMBERSHIP: return createResultExpressionMembership();
			case SysMLPackage.ANNOTATING_FEATURE: return createAnnotatingFeature();
			case SysMLPackage.METADATA_FEATURE: return createMetadataFeature();
			case SysMLPackage.METADATA_FEATURE_VALUE: return createMetadataFeatureValue();
			case SysMLPackage.ITEM_FEATURE: return createItemFeature();
			case SysMLPackage.ITEM_FLOW_END: return createItemFlowEnd();
			case SysMLPackage.ITEM_FLOW_FEATURE: return createItemFlowFeature();
			case SysMLPackage.INTERACTION: return createInteraction();
			case SysMLPackage.SUCCESSION_ITEM_FLOW: return createSuccessionItemFlow();
			case SysMLPackage.ITEM_FLOW: return createItemFlow();
			case SysMLPackage.END_FEATURE_MEMBERSHIP: return createEndFeatureMembership();
			case SysMLPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
			case SysMLPackage.CONNECTION_DEFINITION: return createConnectionDefinition();
			case SysMLPackage.PART_DEFINITION: return createPartDefinition();
			case SysMLPackage.ITEM_DEFINITION: return createItemDefinition();
			case SysMLPackage.OCCURRENCE_DEFINITION: return createOccurrenceDefinition();
			case SysMLPackage.PORT_USAGE: return createPortUsage();
			case SysMLPackage.PORT_DEFINITION: return createPortDefinition();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION: return createConjugatedPortDefinition();
			case SysMLPackage.PORT_CONJUGATION: return createPortConjugation();
			case SysMLPackage.ACTION_USAGE: return createActionUsage();
			case SysMLPackage.OCCURRENCE_USAGE: return createOccurrenceUsage();
			case SysMLPackage.PORTIONING_FEATURE: return createPortioningFeature();
			case SysMLPackage.STATE_USAGE: return createStateUsage();
			case SysMLPackage.CONSTRAINT_USAGE: return createConstraintUsage();
			case SysMLPackage.TRANSITION_USAGE: return createTransitionUsage();
			case SysMLPackage.ACCEPT_ACTION_USAGE: return createAcceptActionUsage();
			case SysMLPackage.REQUIREMENT_USAGE: return createRequirementUsage();
			case SysMLPackage.REQUIREMENT_DEFINITION: return createRequirementDefinition();
			case SysMLPackage.CONSTRAINT_DEFINITION: return createConstraintDefinition();
			case SysMLPackage.CONCERN_USAGE: return createConcernUsage();
			case SysMLPackage.CONCERN_DEFINITION: return createConcernDefinition();
			case SysMLPackage.CALCULATION_USAGE: return createCalculationUsage();
			case SysMLPackage.CASE_USAGE: return createCaseUsage();
			case SysMLPackage.CASE_DEFINITION: return createCaseDefinition();
			case SysMLPackage.CALCULATION_DEFINITION: return createCalculationDefinition();
			case SysMLPackage.ACTION_DEFINITION: return createActionDefinition();
			case SysMLPackage.ANALYSIS_CASE_USAGE: return createAnalysisCaseUsage();
			case SysMLPackage.ANALYSIS_CASE_DEFINITION: return createAnalysisCaseDefinition();
			case SysMLPackage.VARIANT_MEMBERSHIP: return createVariantMembership();
			case SysMLPackage.REFERENCE_USAGE: return createReferenceUsage();
			case SysMLPackage.CONNECTION_USAGE: return createConnectionUsage();
			case SysMLPackage.PART_USAGE: return createPartUsage();
			case SysMLPackage.ITEM_USAGE: return createItemUsage();
			case SysMLPackage.INTERFACE_USAGE: return createInterfaceUsage();
			case SysMLPackage.ATTRIBUTE_USAGE: return createAttributeUsage();
			case SysMLPackage.VIEW_USAGE: return createViewUsage();
			case SysMLPackage.VIEW_DEFINITION: return createViewDefinition();
			case SysMLPackage.VIEWPOINT_USAGE: return createViewpointUsage();
			case SysMLPackage.VIEWPOINT_DEFINITION: return createViewpointDefinition();
			case SysMLPackage.STAKEHOLDER_USAGE: return createStakeholderUsage();
			case SysMLPackage.STAKEHOLDER_DEFINITION: return createStakeholderDefinition();
			case SysMLPackage.RENDERING_USAGE: return createRenderingUsage();
			case SysMLPackage.RENDERING_DEFINITION: return createRenderingDefinition();
			case SysMLPackage.VERIFICATION_CASE_USAGE: return createVerificationCaseUsage();
			case SysMLPackage.VERIFICATION_CASE_DEFINITION: return createVerificationCaseDefinition();
			case SysMLPackage.ENUMERATION_USAGE: return createEnumerationUsage();
			case SysMLPackage.ENUMERATION_DEFINITION: return createEnumerationDefinition();
			case SysMLPackage.ATTRIBUTE_DEFINITION: return createAttributeDefinition();
			case SysMLPackage.ALLOCATION_USAGE: return createAllocationUsage();
			case SysMLPackage.ALLOCATION_DEFINITION: return createAllocationDefinition();
			case SysMLPackage.LIFE_CLASS: return createLifeClass();
			case SysMLPackage.CONJUGATED_PORT_TYPING: return createConjugatedPortTyping();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP: return createRequirementConstraintMembership();
			case SysMLPackage.SUBJECT_MEMBERSHIP: return createSubjectMembership();
			case SysMLPackage.ADDRESSED_CONCERN_MEMBERSHIP: return createAddressedConcernMembership();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE: return createSatisfyRequirementUsage();
			case SysMLPackage.ASSERT_CONSTRAINT_USAGE: return createAssertConstraintUsage();
			case SysMLPackage.OBJECTIVE_MEMBERSHIP: return createObjectiveMembership();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP: return createRequirementVerificationMembership();
			case SysMLPackage.STATE_DEFINITION: return createStateDefinition();
			case SysMLPackage.EXHIBIT_STATE_USAGE: return createExhibitStateUsage();
			case SysMLPackage.TRANSITION_FEATURE_MEMBERSHIP: return createTransitionFeatureMembership();
			case SysMLPackage.STATE_SUBACTION_MEMBERSHIP: return createStateSubactionMembership();
			case SysMLPackage.PERFORM_ACTION_USAGE: return createPerformActionUsage();
			case SysMLPackage.SEND_ACTION_USAGE: return createSendActionUsage();
			case SysMLPackage.JOIN_NODE: return createJoinNode();
			case SysMLPackage.DECISION_NODE: return createDecisionNode();
			case SysMLPackage.MERGE_NODE: return createMergeNode();
			case SysMLPackage.FORK_NODE: return createForkNode();
			case SysMLPackage.DEPENDENCY: return createDependency();
			case SysMLPackage.EXPOSE: return createExpose();
			case SysMLPackage.VIEW_RENDERING_MEMBERSHIP: return createViewRenderingMembership();
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
			case SysMLPackage.PORTION_KIND:
				return createPortionKindFromString(eDataType, initialValue);
			case SysMLPackage.REQUIREMENT_CONSTRAINT_KIND:
				return createRequirementConstraintKindFromString(eDataType, initialValue);
			case SysMLPackage.TRANSITION_FEATURE_KIND:
				return createTransitionFeatureKindFromString(eDataType, initialValue);
			case SysMLPackage.STATE_SUBACTION_KIND:
				return createStateSubactionKindFromString(eDataType, initialValue);
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
			case SysMLPackage.PORTION_KIND:
				return convertPortionKindToString(eDataType, instanceValue);
			case SysMLPackage.REQUIREMENT_CONSTRAINT_KIND:
				return convertRequirementConstraintKindToString(eDataType, instanceValue);
			case SysMLPackage.TRANSITION_FEATURE_KIND:
				return convertTransitionFeatureKindToString(eDataType, instanceValue);
			case SysMLPackage.STATE_SUBACTION_KIND:
				return convertStateSubactionKindToString(eDataType, instanceValue);
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
	public Expose createExpose() {
		ExposeImpl expose = new ExposeImpl();
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewRenderingMembership createViewRenderingMembership() {
		ViewRenderingMembershipImpl viewRenderingMembership = new ViewRenderingMembershipImpl();
		return viewRenderingMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementVerificationMembership createRequirementVerificationMembership() {
		RequirementVerificationMembershipImpl requirementVerificationMembership = new RequirementVerificationMembershipImpl();
		return requirementVerificationMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectMembership createSubjectMembership() {
		SubjectMembershipImpl subjectMembership = new SubjectMembershipImpl();
		return subjectMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveMembership createObjectiveMembership() {
		ObjectiveMembershipImpl objectiveMembership = new ObjectiveMembershipImpl();
		return objectiveMembership;
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
	public TypeFeaturing createTypeFeaturing() {
		TypeFeaturingImpl typeFeaturing = new TypeFeaturingImpl();
		return typeFeaturing;
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
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
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
	public ResultExpressionMembership createResultExpressionMembership() {
		ResultExpressionMembershipImpl resultExpressionMembership = new ResultExpressionMembershipImpl();
		return resultExpressionMembership;
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
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
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
	public AssociationStructure createAssociationStructure() {
		AssociationStructureImpl associationStructure = new AssociationStructureImpl();
		return associationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
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
	public ElementFilterMembership createElementFilterMembership() {
		ElementFilterMembershipImpl elementFilterMembership = new ElementFilterMembershipImpl();
		return elementFilterMembership;
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
	public OccurrenceUsage createOccurrenceUsage() {
		OccurrenceUsageImpl occurrenceUsage = new OccurrenceUsageImpl();
		return occurrenceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortioningFeature createPortioningFeature() {
		PortioningFeatureImpl portioningFeature = new PortioningFeatureImpl();
		return portioningFeature;
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
	public AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionImpl();
		return attributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllocationUsage createAllocationUsage() {
		AllocationUsageImpl allocationUsage = new AllocationUsageImpl();
		return allocationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllocationDefinition createAllocationDefinition() {
		AllocationDefinitionImpl allocationDefinition = new AllocationDefinitionImpl();
		return allocationDefinition;
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
	public AddressedConcernMembership createAddressedConcernMembership() {
		AddressedConcernMembershipImpl addressedConcernMembership = new AddressedConcernMembershipImpl();
		return addressedConcernMembership;
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
	public ItemDefinition createItemDefinition() {
		ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceDefinition createOccurrenceDefinition() {
		OccurrenceDefinitionImpl occurrenceDefinition = new OccurrenceDefinitionImpl();
		return occurrenceDefinition;
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
	public ConnectionDefinition createConnectionDefinition() {
		ConnectionDefinitionImpl connectionDefinition = new ConnectionDefinitionImpl();
		return connectionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeUsage createAttributeUsage() {
		AttributeUsageImpl attributeUsage = new AttributeUsageImpl();
		return attributeUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewUsage createViewUsage() {
		ViewUsageImpl viewUsage = new ViewUsageImpl();
		return viewUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewDefinition createViewDefinition() {
		ViewDefinitionImpl viewDefinition = new ViewDefinitionImpl();
		return viewDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewpointUsage createViewpointUsage() {
		ViewpointUsageImpl viewpointUsage = new ViewpointUsageImpl();
		return viewpointUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewpointDefinition createViewpointDefinition() {
		ViewpointDefinitionImpl viewpointDefinition = new ViewpointDefinitionImpl();
		return viewpointDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StakeholderUsage createStakeholderUsage() {
		StakeholderUsageImpl stakeholderUsage = new StakeholderUsageImpl();
		return stakeholderUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StakeholderDefinition createStakeholderDefinition() {
		StakeholderDefinitionImpl stakeholderDefinition = new StakeholderDefinitionImpl();
		return stakeholderDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingUsage createRenderingUsage() {
		RenderingUsageImpl renderingUsage = new RenderingUsageImpl();
		return renderingUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingDefinition createRenderingDefinition() {
		RenderingDefinitionImpl renderingDefinition = new RenderingDefinitionImpl();
		return renderingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationCaseUsage createVerificationCaseUsage() {
		VerificationCaseUsageImpl verificationCaseUsage = new VerificationCaseUsageImpl();
		return verificationCaseUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationCaseDefinition createVerificationCaseDefinition() {
		VerificationCaseDefinitionImpl verificationCaseDefinition = new VerificationCaseDefinitionImpl();
		return verificationCaseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationUsage createEnumerationUsage() {
		EnumerationUsageImpl enumerationUsage = new EnumerationUsageImpl();
		return enumerationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationDefinition createEnumerationDefinition() {
		EnumerationDefinitionImpl enumerationDefinition = new EnumerationDefinitionImpl();
		return enumerationDefinition;
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
	public ConcernUsage createConcernUsage() {
		ConcernUsageImpl concernUsage = new ConcernUsageImpl();
		return concernUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernDefinition createConcernDefinition() {
		ConcernDefinitionImpl concernDefinition = new ConcernDefinitionImpl();
		return concernDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseDefinition createCaseDefinition() {
		CaseDefinitionImpl caseDefinition = new CaseDefinitionImpl();
		return caseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculationDefinition createCalculationDefinition() {
		CalculationDefinitionImpl calculationDefinition = new CalculationDefinitionImpl();
		return calculationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionDefinition createActionDefinition() {
		ActionDefinitionImpl actionDefinition = new ActionDefinitionImpl();
		return actionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalculationUsage createCalculationUsage() {
		CalculationUsageImpl calculationUsage = new CalculationUsageImpl();
		return calculationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseUsage createCaseUsage() {
		CaseUsageImpl caseUsage = new CaseUsageImpl();
		return caseUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariantMembership createVariantMembership() {
		VariantMembershipImpl variantMembership = new VariantMembershipImpl();
		return variantMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisCaseUsage createAnalysisCaseUsage() {
		AnalysisCaseUsageImpl analysisCaseUsage = new AnalysisCaseUsageImpl();
		return analysisCaseUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisCaseDefinition createAnalysisCaseDefinition() {
		AnalysisCaseDefinitionImpl analysisCaseDefinition = new AnalysisCaseDefinitionImpl();
		return analysisCaseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceUsage createReferenceUsage() {
		ReferenceUsageImpl referenceUsage = new ReferenceUsageImpl();
		return referenceUsage;
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
	public PartUsage createPartUsage() {
		PartUsageImpl partUsage = new PartUsageImpl();
		return partUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemUsage createItemUsage() {
		ItemUsageImpl itemUsage = new ItemUsageImpl();
		return itemUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartDefinition createPartDefinition() {
		PartDefinitionImpl partDefinition = new PartDefinitionImpl();
		return partDefinition;
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
	public AnnotatingFeature createAnnotatingFeature() {
		AnnotatingFeatureImpl annotatingFeature = new AnnotatingFeatureImpl();
		return annotatingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataFeature createMetadataFeature() {
		MetadataFeatureImpl metadataFeature = new MetadataFeatureImpl();
		return metadataFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataFeatureValue createMetadataFeatureValue() {
		MetadataFeatureValueImpl metadataFeatureValue = new MetadataFeatureValueImpl();
		return metadataFeatureValue;
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
	public TextualRepresentation createTextualRepresentation() {
		TextualRepresentationImpl textualRepresentation = new TextualRepresentationImpl();
		return textualRepresentation;
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
	public AnnotatingElement createAnnotatingElement() {
		AnnotatingElementImpl annotatingElement = new AnnotatingElementImpl();
		return annotatingElement;
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
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
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
	public PathSelectExpression createPathSelectExpression() {
		PathSelectExpressionImpl pathSelectExpression = new PathSelectExpressionImpl();
		return pathSelectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathStepExpression createPathStepExpression() {
		PathStepExpressionImpl pathStepExpression = new PathStepExpressionImpl();
		return pathStepExpression;
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
	public PortionKind createPortionKindFromString(EDataType eDataType, String initialValue) {
		PortionKind result = PortionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortionKindToString(EDataType eDataType, Object instanceValue) {
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
