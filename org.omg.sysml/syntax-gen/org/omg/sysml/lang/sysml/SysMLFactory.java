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
	 * Returns a new object of class '<em>Send Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Action Usage</em>'.
	 * @generated
	 */
	SendActionUsage createSendActionUsage();

	/**
	 * Returns a new object of class '<em>Assert Constraint Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Constraint Usage</em>'.
	 * @generated
	 */
	AssertConstraintUsage createAssertConstraintUsage();

	/**
	 * Returns a new object of class '<em>Expose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expose</em>'.
	 * @generated
	 */
	Expose createExpose();

	/**
	 * Returns a new object of class '<em>View Rendering Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Rendering Membership</em>'.
	 * @generated
	 */
	ViewRenderingMembership createViewRenderingMembership();

	/**
	 * Returns a new object of class '<em>Event Occurrence Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Occurrence Usage</em>'.
	 * @generated
	 */
	EventOccurrenceUsage createEventOccurrenceUsage();

	/**
	 * Returns a new object of class '<em>Requirement Verification Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Verification Membership</em>'.
	 * @generated
	 */
	RequirementVerificationMembership createRequirementVerificationMembership();

	/**
	 * Returns a new object of class '<em>Subject Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject Membership</em>'.
	 * @generated
	 */
	SubjectMembership createSubjectMembership();

	/**
	 * Returns a new object of class '<em>Objective Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Membership</em>'.
	 * @generated
	 */
	ObjectiveMembership createObjectiveMembership();

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
	 * Returns a new object of class '<em>State Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Definition</em>'.
	 * @generated
	 */
	StateDefinition createStateDefinition();

	/**
	 * Returns a new object of class '<em>Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Membership</em>'.
	 * @generated
	 */
	FeatureMembership createFeatureMembership();

	/**
	 * Returns a new object of class '<em>Type Featuring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Featuring</em>'.
	 * @generated
	 */
	TypeFeaturing createTypeFeaturing();

	/**
	 * Returns a new object of class '<em>Conjugation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjugation</em>'.
	 * @generated
	 */
	Conjugation createConjugation();

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
	 * Returns a new object of class '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation</em>'.
	 * @generated
	 */
	Documentation createDocumentation();

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
	 * Returns a new object of class '<em>Result Expression Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Expression Membership</em>'.
	 * @generated
	 */
	ResultExpressionMembership createResultExpressionMembership();

	/**
	 * Returns a new object of class '<em>Transition Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Usage</em>'.
	 * @generated
	 */
	TransitionUsage createTransitionUsage();

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
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

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
	 * Returns a new object of class '<em>Association Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Structure</em>'.
	 * @generated
	 */
	AssociationStructure createAssociationStructure();

	/**
	 * Returns a new object of class '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure</em>'.
	 * @generated
	 */
	Structure createStructure();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Element Filter Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Filter Membership</em>'.
	 * @generated
	 */
	ElementFilterMembership createElementFilterMembership();

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
	 * Returns a new object of class '<em>Conjugated Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjugated Port Definition</em>'.
	 * @generated
	 */
	ConjugatedPortDefinition createConjugatedPortDefinition();

	/**
	 * Returns a new object of class '<em>Port Conjugation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Conjugation</em>'.
	 * @generated
	 */
	PortConjugation createPortConjugation();

	/**
	 * Returns a new object of class '<em>State Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Usage</em>'.
	 * @generated
	 */
	StateUsage createStateUsage();

	/**
	 * Returns a new object of class '<em>Constraint Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Usage</em>'.
	 * @generated
	 */
	ConstraintUsage createConstraintUsage();

	/**
	 * Returns a new object of class '<em>Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariant</em>'.
	 * @generated
	 */
	Invariant createInvariant();

	/**
	 * Returns a new object of class '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Expression</em>'.
	 * @generated
	 */
	BooleanExpression createBooleanExpression();

	/**
	 * Returns a new object of class '<em>Action Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Usage</em>'.
	 * @generated
	 */
	ActionUsage createActionUsage();

	/**
	 * Returns a new object of class '<em>Occurrence Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurrence Usage</em>'.
	 * @generated
	 */
	OccurrenceUsage createOccurrenceUsage();

	/**
	 * Returns a new object of class '<em>Portioning Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portioning Feature</em>'.
	 * @generated
	 */
	PortioningFeature createPortioningFeature();

	/**
	 * Returns a new object of class '<em>Exhibit State Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exhibit State Usage</em>'.
	 * @generated
	 */
	ExhibitStateUsage createExhibitStateUsage();

	/**
	 * Returns a new object of class '<em>Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition</em>'.
	 * @generated
	 */
	AttributeDefinition createAttributeDefinition();

	/**
	 * Returns a new object of class '<em>Allocation Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Usage</em>'.
	 * @generated
	 */
	AllocationUsage createAllocationUsage();

	/**
	 * Returns a new object of class '<em>Allocation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Definition</em>'.
	 * @generated
	 */
	AllocationDefinition createAllocationDefinition();

	/**
	 * Returns a new object of class '<em>State Subaction Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Subaction Membership</em>'.
	 * @generated
	 */
	StateSubactionMembership createStateSubactionMembership();

	/**
	 * Returns a new object of class '<em>Addressed Concern Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addressed Concern Membership</em>'.
	 * @generated
	 */
	AddressedConcernMembership createAddressedConcernMembership();

	/**
	 * Returns a new object of class '<em>Conjugated Port Typing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjugated Port Typing</em>'.
	 * @generated
	 */
	ConjugatedPortTyping createConjugatedPortTyping();

	/**
	 * Returns a new object of class '<em>Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Definition</em>'.
	 * @generated
	 */
	ItemDefinition createItemDefinition();

	/**
	 * Returns a new object of class '<em>Occurrence Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurrence Definition</em>'.
	 * @generated
	 */
	OccurrenceDefinition createOccurrenceDefinition();

	/**
	 * Returns a new object of class '<em>Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Definition</em>'.
	 * @generated
	 */
	InterfaceDefinition createInterfaceDefinition();

	/**
	 * Returns a new object of class '<em>Connection Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Definition</em>'.
	 * @generated
	 */
	ConnectionDefinition createConnectionDefinition();

	/**
	 * Returns a new object of class '<em>Attribute Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Usage</em>'.
	 * @generated
	 */
	AttributeUsage createAttributeUsage();

	/**
	 * Returns a new object of class '<em>View Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Usage</em>'.
	 * @generated
	 */
	ViewUsage createViewUsage();

	/**
	 * Returns a new object of class '<em>View Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Definition</em>'.
	 * @generated
	 */
	ViewDefinition createViewDefinition();

	/**
	 * Returns a new object of class '<em>Viewpoint Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viewpoint Usage</em>'.
	 * @generated
	 */
	ViewpointUsage createViewpointUsage();

	/**
	 * Returns a new object of class '<em>Viewpoint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Viewpoint Definition</em>'.
	 * @generated
	 */
	ViewpointDefinition createViewpointDefinition();

	/**
	 * Returns a new object of class '<em>Stakeholder Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder Usage</em>'.
	 * @generated
	 */
	StakeholderUsage createStakeholderUsage();

	/**
	 * Returns a new object of class '<em>Stakeholder Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder Definition</em>'.
	 * @generated
	 */
	StakeholderDefinition createStakeholderDefinition();

	/**
	 * Returns a new object of class '<em>Rendering Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rendering Usage</em>'.
	 * @generated
	 */
	RenderingUsage createRenderingUsage();

	/**
	 * Returns a new object of class '<em>Rendering Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rendering Definition</em>'.
	 * @generated
	 */
	RenderingDefinition createRenderingDefinition();

	/**
	 * Returns a new object of class '<em>Verification Case Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Case Usage</em>'.
	 * @generated
	 */
	VerificationCaseUsage createVerificationCaseUsage();

	/**
	 * Returns a new object of class '<em>Verification Case Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verification Case Definition</em>'.
	 * @generated
	 */
	VerificationCaseDefinition createVerificationCaseDefinition();

	/**
	 * Returns a new object of class '<em>Enumeration Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Usage</em>'.
	 * @generated
	 */
	EnumerationUsage createEnumerationUsage();

	/**
	 * Returns a new object of class '<em>Enumeration Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Definition</em>'.
	 * @generated
	 */
	EnumerationDefinition createEnumerationDefinition();

	/**
	 * Returns a new object of class '<em>Interface Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Usage</em>'.
	 * @generated
	 */
	InterfaceUsage createInterfaceUsage();

	/**
	 * Returns a new object of class '<em>Constraint Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Definition</em>'.
	 * @generated
	 */
	ConstraintDefinition createConstraintDefinition();

	/**
	 * Returns a new object of class '<em>Concern Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern Usage</em>'.
	 * @generated
	 */
	ConcernUsage createConcernUsage();

	/**
	 * Returns a new object of class '<em>Concern Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern Definition</em>'.
	 * @generated
	 */
	ConcernDefinition createConcernDefinition();

	/**
	 * Returns a new object of class '<em>Case Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Definition</em>'.
	 * @generated
	 */
	CaseDefinition createCaseDefinition();

	/**
	 * Returns a new object of class '<em>Calculation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculation Definition</em>'.
	 * @generated
	 */
	CalculationDefinition createCalculationDefinition();

	/**
	 * Returns a new object of class '<em>Action Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Definition</em>'.
	 * @generated
	 */
	ActionDefinition createActionDefinition();

	/**
	 * Returns a new object of class '<em>Calculation Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calculation Usage</em>'.
	 * @generated
	 */
	CalculationUsage createCalculationUsage();

	/**
	 * Returns a new object of class '<em>Case Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Usage</em>'.
	 * @generated
	 */
	CaseUsage createCaseUsage();

	/**
	 * Returns a new object of class '<em>Variant Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant Membership</em>'.
	 * @generated
	 */
	VariantMembership createVariantMembership();

	/**
	 * Returns a new object of class '<em>Analysis Case Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Case Usage</em>'.
	 * @generated
	 */
	AnalysisCaseUsage createAnalysisCaseUsage();

	/**
	 * Returns a new object of class '<em>Analysis Case Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Case Definition</em>'.
	 * @generated
	 */
	AnalysisCaseDefinition createAnalysisCaseDefinition();

	/**
	 * Returns a new object of class '<em>Reference Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Usage</em>'.
	 * @generated
	 */
	ReferenceUsage createReferenceUsage();

	/**
	 * Returns a new object of class '<em>Connection Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Usage</em>'.
	 * @generated
	 */
	ConnectionUsage createConnectionUsage();

	/**
	 * Returns a new object of class '<em>Part Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Usage</em>'.
	 * @generated
	 */
	PartUsage createPartUsage();

	/**
	 * Returns a new object of class '<em>Item Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Usage</em>'.
	 * @generated
	 */
	ItemUsage createItemUsage();

	/**
	 * Returns a new object of class '<em>Part Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Definition</em>'.
	 * @generated
	 */
	PartDefinition createPartDefinition();

	/**
	 * Returns a new object of class '<em>Satisfy Requirement Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfy Requirement Usage</em>'.
	 * @generated
	 */
	SatisfyRequirementUsage createSatisfyRequirementUsage();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Requirement Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Usage</em>'.
	 * @generated
	 */
	RequirementUsage createRequirementUsage();

	/**
	 * Returns a new object of class '<em>Requirement Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Definition</em>'.
	 * @generated
	 */
	RequirementDefinition createRequirementDefinition();

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
	 * Returns a new object of class '<em>Annotating Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotating Feature</em>'.
	 * @generated
	 */
	AnnotatingFeature createAnnotatingFeature();

	/**
	 * Returns a new object of class '<em>Metadata Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Feature</em>'.
	 * @generated
	 */
	MetadataFeature createMetadataFeature();

	/**
	 * Returns a new object of class '<em>Metadata Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Feature Value</em>'.
	 * @generated
	 */
	MetadataFeatureValue createMetadataFeatureValue();

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
	 * Returns a new object of class '<em>Textual Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual Representation</em>'.
	 * @generated
	 */
	TextualRepresentation createTextualRepresentation();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Annotating Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotating Element</em>'.
	 * @generated
	 */
	AnnotatingElement createAnnotatingElement();

	/**
	 * Returns a new object of class '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction</em>'.
	 * @generated
	 */
	Interaction createInteraction();

	/**
	 * Returns a new object of class '<em>Life Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Life Class</em>'.
	 * @generated
	 */
	LifeClass createLifeClass();

	/**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
	Dependency createDependency();

	/**
	 * Returns a new object of class '<em>Requirement Constraint Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Constraint Membership</em>'.
	 * @generated
	 */
	RequirementConstraintMembership createRequirementConstraintMembership();

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
	 * Returns a new object of class '<em>Path Select Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Select Expression</em>'.
	 * @generated
	 */
	PathSelectExpression createPathSelectExpression();

	/**
	 * Returns a new object of class '<em>Path Step Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Step Expression</em>'.
	 * @generated
	 */
	PathStepExpression createPathStepExpression();

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
	 * Returns a new object of class '<em>Transition Feature Membership</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Feature Membership</em>'.
	 * @generated
	 */
	TransitionFeatureMembership createTransitionFeatureMembership();

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
	 * Returns a new object of class '<em>Item Flow Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Flow Feature</em>'.
	 * @generated
	 */
	ItemFlowFeature createItemFlowFeature();

	/**
	 * Returns a new object of class '<em>Succession Item Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Succession Item Flow</em>'.
	 * @generated
	 */
	SuccessionItemFlow createSuccessionItemFlow();

	/**
	 * Returns a new object of class '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Expression</em>'.
	 * @generated
	 */
	NullExpression createNullExpression();

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
