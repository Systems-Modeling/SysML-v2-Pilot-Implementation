/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2024 Model Driven Solutions, Inc.
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
 * An implementation of the model <b>Namespace</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysMLPackageImpl extends EPackageImpl implements SysMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subclassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationEClass = null;

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
	private EClass forLoopActionUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopActionUsageEClass = null;

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
	private EClass exposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membershipExposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewRenderingMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceExposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventOccurrenceUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementVerificationMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveMembershipEClass = null;

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
	private EClass triggerInvocationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifActionUsageEClass = null;

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
	private EClass whileLoopActionUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentActionUsageEClass = null;

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
	private EClass metadataDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataUsageEClass = null;

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
	private EClass featuringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeFeaturingEClass = null;

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
	private EClass documentationEClass = null;

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
	private EClass owningMembershipEClass = null;

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
	private EClass libraryPackageEClass = null;

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
	private EClass resultExpressionMembershipEClass = null;

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
	private EClass namespaceEClass = null;

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
	private EClass intersectingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unioningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disjoiningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass differencingEClass = null;

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
	private EClass featureInvertingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureChainingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSubsettingEClass = null;

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
	private EClass associationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

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
	private EClass elementFilterMembershipEClass = null;

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
	private EClass occurrenceUsageEClass = null;

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
	private EClass includeUseCaseUsageEClass = null;

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
	private EClass exhibitStateUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowConnectionUsageEClass = null;

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
	private EClass bindingConnectorAsUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceDefinitionEClass = null;

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
	private EClass connectionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewpointDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderingUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderingDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationCaseUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationCaseDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationDefinitionEClass = null;

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
	private EClass concernUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculationUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisCaseUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisCaseDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorAsUsageEClass = null;

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
	private EClass partUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDefinitionEClass = null;

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
	private EClass framedConcernMembershipEClass = null;

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
	private EClass flowConnectionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successionFlowConnectionUsageEClass = null;

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
	private EClass metadataFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaclassEClass = null;

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
	private EClass textualRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass membershipImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceImportEClass = null;

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
	private EClass annotatingElementEClass = null;

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
	private EClass lifeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

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
	private EClass selectExpressionEClass = null;

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
	private EClass literalInfinityEClass = null;

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
	private EClass stakeholderMembershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorMembershipEClass = null;

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
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRationalEClass = null;

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
	private EClass itemFeatureEClass = null;

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
	private EClass featureChainExpressionEClass = null;

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
	private EClass successionAsUsageEClass = null;

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
	private EClass metadataAccessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectExpressionEClass = null;

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
	private EClass literalIntegerEClass = null;

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
	private EEnum triggerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portionKindEEnum = null;

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
	public EClass getSubclassification() {
		return subclassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubclassification_Superclassifier() {
		return (EReference)subclassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubclassification_OwningClassifier() {
		return (EReference)subclassificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubclassification_Subclassifier() {
		return (EReference)subclassificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialization() {
		return specializationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_OwningType() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_General() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialization_Specific() {
		return (EReference)specializationEClass.getEStructuralFeatures().get(1);
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
	public EReference getSendActionUsage_ReceiverArgument() {
		return (EReference)sendActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendActionUsage_PayloadArgument() {
		return (EReference)sendActionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendActionUsage_SenderArgument() {
		return (EReference)sendActionUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForLoopActionUsage() {
		return forLoopActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForLoopActionUsage_LoopVariable() {
		return (EReference)forLoopActionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForLoopActionUsage_SeqArgument() {
		return (EReference)forLoopActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoopActionUsage() {
		return loopActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoopActionUsage_BodyAction() {
		return (EReference)loopActionUsageEClass.getEStructuralFeatures().get(0);
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
	public EClass getExpose() {
		return exposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMembershipExpose() {
		return membershipExposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewRenderingMembership() {
		return viewRenderingMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewRenderingMembership_OwnedRendering() {
		return (EReference)viewRenderingMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewRenderingMembership_ReferencedRendering() {
		return (EReference)viewRenderingMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespaceExpose() {
		return namespaceExposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventOccurrenceUsage() {
		return eventOccurrenceUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventOccurrenceUsage_EventOccurrence() {
		return (EReference)eventOccurrenceUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementVerificationMembership() {
		return requirementVerificationMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementVerificationMembership_VerifiedRequirement() {
		return (EReference)requirementVerificationMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementVerificationMembership_OwnedRequirement() {
		return (EReference)requirementVerificationMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectMembership() {
		return subjectMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubjectMembership_OwnedSubjectParameter() {
		return (EReference)subjectMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectiveMembership() {
		return objectiveMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectiveMembership_OwnedObjectiveRequirement() {
		return (EReference)objectiveMembershipEClass.getEStructuralFeatures().get(0);
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
	public EReference getAcceptActionUsage_ReceiverArgument() {
		return (EReference)acceptActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcceptActionUsage_PayloadParameter() {
		return (EReference)acceptActionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAcceptActionUsage_PayloadArgument() {
		return (EReference)acceptActionUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAcceptActionUsage__IsTriggerAction() {
		return acceptActionUsageEClass.getEOperations().get(0);
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
	public EOperation getControlNode__MultiplicityHasBounds__Multiplicity_int_int() {
		return controlNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerInvocationExpression() {
		return triggerInvocationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerInvocationExpression_Kind() {
		return (EAttribute)triggerInvocationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfActionUsage() {
		return ifActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfActionUsage_ElseAction() {
		return (EReference)ifActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfActionUsage_ThenAction() {
		return (EReference)ifActionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfActionUsage_IfArgument() {
		return (EReference)ifActionUsageEClass.getEStructuralFeatures().get(2);
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
	public EClass getWhileLoopActionUsage() {
		return whileLoopActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhileLoopActionUsage_WhileArgument() {
		return (EReference)whileLoopActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhileLoopActionUsage_UntilArgument() {
		return (EReference)whileLoopActionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignmentActionUsage() {
		return assignmentActionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentActionUsage_TargetArgument() {
		return (EReference)assignmentActionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentActionUsage_ValueExpression() {
		return (EReference)assignmentActionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignmentActionUsage_Referent() {
		return (EReference)assignmentActionUsageEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getStateDefinition_IsParallel() {
		return (EAttribute)stateDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadataDefinition() {
		return metadataDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadataUsage() {
		return metadataUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadataUsage_MetadataDefinition() {
		return (EReference)metadataUsageEClass.getEStructuralFeatures().get(0);
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
		return (EReference)featureMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeFeaturing() {
		return typeFeaturingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeFeaturing_FeatureOfType() {
		return (EReference)typeFeaturingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeFeaturing_FeaturingType() {
		return (EReference)typeFeaturingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeFeaturing_OwningFeatureOfType() {
		return (EReference)typeFeaturingEClass.getEStructuralFeatures().get(2);
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
	public EReference getFeatureMembership_OwningType() {
		return (EReference)featureMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeaturing() {
		return featuringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturing_Type() {
		return (EReference)featuringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeaturing_Feature() {
		return (EReference)featuringEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMembership_MemberElementId() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembership_Visibility() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getMembership_MemberName() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMembership_MembershipOwningNamespace() {
		return (EReference)membershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMembership_MemberShortName() {
		return (EAttribute)membershipEClass.getEStructuralFeatures().get(2);
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
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_IsImplied() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentation_DocumentedElement() {
		return (EReference)documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_OwningRelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_RelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
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
	public EReference getElement_OwningNamespace() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_ElementId() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedRelationship() {
		return (EReference)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Documentation() {
		return (EReference)elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedAnnotation() {
		return (EReference)elementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_TextualRepresentation() {
		return (EReference)elementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_AliasIds() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_DeclaredShortName() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_DeclaredName() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_ShortName() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__EscapedName() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__EffectiveShortName() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__EffectiveName() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__LibraryNamespace() {
		return elementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOwningMembership() {
		return owningMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOwningMembership_OwnedMemberElementId() {
		return (EAttribute)owningMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOwningMembership_OwnedMemberShortName() {
		return (EAttribute)owningMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOwningMembership_OwnedMemberName() {
		return (EAttribute)owningMembershipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOwningMembership_OwnedMemberElement() {
		return (EReference)owningMembershipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Owner() {
		return (EReference)elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_QualifiedName() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_IsImpliedIncluded() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_IsLibraryElement() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(17);
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
	public EReference getPackage_FilterCondition() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackage__IncludeAsMember__Element() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibraryPackage() {
		return libraryPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibraryPackage_IsStandard() {
		return (EAttribute)libraryPackageEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getImport_Visibility() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_IsRecursive() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_IsImportAll() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_ImportedElement() {
		return (EReference)importEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_ImportOwningNamespace() {
		return (EReference)importEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImport__ImportedMemberships__EList() {
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
	public EClass getResultExpressionMembership() {
		return resultExpressionMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResultExpressionMembership_OwnedResultExpression() {
		return (EReference)resultExpressionMembershipEClass.getEStructuralFeatures().get(0);
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
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_Target() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_TriggerAction() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_GuardExpression() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_EffectAction() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransitionUsage_Succession() {
		return (EReference)transitionUsageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransitionUsage__TriggerPayloadParameter() {
		return transitionUsageEClass.getEOperations().get(0);
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
	public EAttribute getFunction_IsModelLevelEvaluable() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
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
	public EReference getClassifier_OwnedSubclassification() {
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
	public EReference getType_OwnedFeatureMembership() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getType__DirectionOf__Feature() {
		return typeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getType__DirectionOfExcluding__Feature_EList() {
		return typeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getType__AllSupertypes() {
		return typeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getType__Specializes__Type() {
		return typeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getType__SpecializesFromLibrary__String() {
		return typeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_OwnedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Membership() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_Member() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_ImportedMembership() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_OwnedMembership() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_OwnedImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__NamesOf__Element() {
		return namespaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__VisibilityOf__Membership() {
		return namespaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__VisibleMemberships__EList_boolean_boolean() {
		return namespaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__ImportedMemberships__EList() {
		return namespaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__Resolve__String() {
		return namespaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__ResolveGlobal__String() {
		return namespaceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__ResolveLocal__String() {
		return namespaceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__ResolveVisible__String() {
		return namespaceEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__QualificationOf__String() {
		return namespaceEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNamespace__UnqualifiedNameOf__String() {
		return namespaceEClass.getEOperations().get(9);
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
	public EReference getType_OwnedConjugator() {
		return (EReference)typeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getType_IsConjugated() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_FeatureMembership() {
		return (EReference)typeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_DifferencingType() {
		return (EReference)typeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedDifferencing() {
		return (EReference)typeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_InheritedFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_Multiplicity() {
		return (EReference)typeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_UnioningType() {
		return (EReference)typeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedIntersecting() {
		return (EReference)typeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_IntersectingType() {
		return (EReference)typeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedUnioning() {
		return (EReference)typeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_DirectedFeature() {
		return (EReference)typeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedDisjoining() {
		return (EReference)typeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_OwnedSpecialization() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getType__InheritedMemberships__EList() {
		return typeEClass.getEOperations().get(0);
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
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedTypeFeaturing() {
		return (EReference)featureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_ChainingFeature() {
		return (EReference)featureEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedFeatureInverting() {
		return (EReference)featureEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedFeatureChaining() {
		return (EReference)featureEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsDerived() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsReadOnly() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwningType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsUnique() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsOrdered() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_Type() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedRedefinition() {
		return (EReference)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedSubsetting() {
		return (EReference)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedTyping() {
		return (EReference)featureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_FeaturingType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwningFeatureMembership() {
		return (EReference)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsComposite() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsPortion() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsEnd() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Direction() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_OwnedReferenceSubsetting() {
		return (EReference)featureEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_EndOwningType() {
		return (EReference)featureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_IsNonunique() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(21);
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
	public EOperation getFeature__IsFeaturedWithin__Type() {
		return featureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__NamingFeature() {
		return featureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__Redefines__Feature() {
		return featureEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__RedefinesFromLibrary__String() {
		return featureEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__SubsetsChain__Feature_Feature() {
		return featureEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__TypingFeatures() {
		return featureEClass.getEOperations().get(6);
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
		return (EReference)featureValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureValue_IsInitial() {
		return (EAttribute)featureValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureValue_IsDefault() {
		return (EAttribute)featureValueEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getExpression_IsModelLevelEvaluable() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExpression__ModelLevelEvaluable__EList() {
		return expressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExpression__Evaluate__Element() {
		return expressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExpression__CheckCondition__Element() {
		return expressionEClass.getEOperations().get(2);
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
	public EClass getIntersecting() {
		return intersectingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersecting_IntersectingType() {
		return (EReference)intersectingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntersecting_TypeIntersected() {
		return (EReference)intersectingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnioning() {
		return unioningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnioning_UnioningType() {
		return (EReference)unioningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnioning_TypeUnioned() {
		return (EReference)unioningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisjoining() {
		return disjoiningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisjoining_DisjoiningType() {
		return (EReference)disjoiningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisjoining_OwningType() {
		return (EReference)disjoiningEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDifferencing() {
		return differencingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifferencing_DifferencingType() {
		return (EReference)differencingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifferencing_TypeDifferenced() {
		return (EReference)differencingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisjoining_TypeDisjoined() {
		return (EReference)disjoiningEClass.getEStructuralFeatures().get(0);
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
		return (EReference)featureTypingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTyping_OwningFeature() {
		return (EReference)featureTypingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureInverting() {
		return featureInvertingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureInverting_FeatureInverted() {
		return (EReference)featureInvertingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureInverting_InvertingFeature() {
		return (EReference)featureInvertingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureInverting_OwningFeature() {
		return (EReference)featureInvertingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureChaining() {
		return featureChainingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureChaining_ChainingFeature() {
		return (EReference)featureChainingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureChaining_FeatureChained() {
		return (EReference)featureChainingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceSubsetting() {
		return referenceSubsettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceSubsetting_ReferencedFeature() {
		return (EReference)referenceSubsettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceSubsetting_ReferencingFeature() {
		return (EReference)referenceSubsettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTyping_TypedFeature() {
		return (EReference)featureTypingEClass.getEStructuralFeatures().get(0);
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
	public EReference getAssociation_SourceType() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_TargetType() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_AssociationEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(3);
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
	public EReference getConnector_ConnectorEnd() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_SourceFeature() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_TargetFeature() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationStructure() {
		return associationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructure() {
		return structureEClass;
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
	public EClass getElementFilterMembership() {
		return elementFilterMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementFilterMembership_Condition() {
		return (EReference)elementFilterMembershipEClass.getEStructuralFeatures().get(0);
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
		return (EReference)usageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_OwningUsage() {
		return (EReference)usageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_OwningDefinition() {
		return (EReference)usageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_VariantMembership() {
		return (EReference)usageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedPort() {
		return (EReference)usageEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedState() {
		return (EReference)usageEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedConstraint() {
		return (EReference)usageEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedTransition() {
		return (EReference)usageEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedRequirement() {
		return (EReference)usageEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedCalculation() {
		return (EReference)usageEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsage_IsVariation() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_DirectedUsage() {
		return (EReference)usageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedCase() {
		return (EReference)usageEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_Variant() {
		return (EReference)usageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedAnalysisCase() {
		return (EReference)usageEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_Usage() {
		return (EReference)usageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedReference() {
		return (EReference)usageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedConnection() {
		return (EReference)usageEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedItem() {
		return (EReference)usageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedPart() {
		return (EReference)usageEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedInterface() {
		return (EReference)usageEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedAttribute() {
		return (EReference)usageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedView() {
		return (EReference)usageEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedViewpoint() {
		return (EReference)usageEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedRendering() {
		return (EReference)usageEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedVerificationCase() {
		return (EReference)usageEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedEnumeration() {
		return (EReference)usageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedAllocation() {
		return (EReference)usageEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedConcern() {
		return (EReference)usageEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedOccurrence() {
		return (EReference)usageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_Definition() {
		return (EReference)usageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedUseCase() {
		return (EReference)usageEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsage_IsReference() {
		return (EAttribute)usageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedFlow() {
		return (EReference)usageEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedMetadata() {
		return (EReference)usageEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsage_NestedAction() {
		return (EReference)usageEClass.getEStructuralFeatures().get(21);
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
		return (EReference)definitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_DirectedUsage() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_Usage() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedAction() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedConnection() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedItem() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedPart() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedInterface() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedAttribute() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedView() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedViewpoint() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedRendering() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedVerificationCase() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedEnumeration() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedAllocation() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedConcern() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedOccurrence() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedUseCase() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedFlow() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedMetadata() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_VariantMembership() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedState() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedConstraint() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedTransition() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedRequirement() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedCalculation() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinition_IsVariation() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedAnalysisCase() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedCase() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedReference() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_OwnedUsage() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_Variant() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(1);
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
	public EReference getActionUsage_ActionDefinition() {
		return (EReference)actionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionUsage__InputParameters() {
		return actionUsageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionUsage__InputParameter__int() {
		return actionUsageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionUsage__Argument__int() {
		return actionUsageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActionUsage__IsSubactionUsage() {
		return actionUsageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOccurrenceUsage() {
		return occurrenceUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOccurrenceUsage_OccurrenceDefinition() {
		return (EReference)occurrenceUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOccurrenceUsage_IndividualDefinition() {
		return (EReference)occurrenceUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceUsage_IsIndividual() {
		return (EAttribute)occurrenceUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceUsage_PortionKind() {
		return (EAttribute)occurrenceUsageEClass.getEStructuralFeatures().get(3);
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
	public EReference getStateUsage_StateDefinition() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_EntryAction() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_DoAction() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateUsage_ExitAction() {
		return (EReference)stateUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateUsage_IsParallel() {
		return (EAttribute)stateUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStateUsage__IsSubstateUsage__boolean() {
		return stateUsageEClass.getEOperations().get(0);
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
	public EClass getInvariant() {
		return invariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvariant_IsNegated() {
		return (EAttribute)invariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncludeUseCaseUsage() {
		return includeUseCaseUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncludeUseCaseUsage_UseCaseIncluded() {
		return (EReference)includeUseCaseUsageEClass.getEStructuralFeatures().get(0);
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
	public EClass getAttributeDefinition() {
		return attributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocationUsage() {
		return allocationUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocationUsage_AllocationDefinition() {
		return (EReference)allocationUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocationDefinition() {
		return allocationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocationDefinition_Allocation() {
		return (EReference)allocationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseCaseUsage() {
		return useCaseUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCaseUsage_UseCaseDefinition() {
		return (EReference)useCaseUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCaseUsage_IncludedUseCase() {
		return (EReference)useCaseUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseCaseDefinition() {
		return useCaseDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCaseDefinition_IncludedUseCase() {
		return (EReference)useCaseDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowConnectionUsage() {
		return flowConnectionUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowConnectionUsage_FlowConnectionDefinition() {
		return (EReference)flowConnectionUsageEClass.getEStructuralFeatures().get(0);
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
	public EReference getStateSubactionMembership_Action() {
		return (EReference)stateSubactionMembershipEClass.getEStructuralFeatures().get(1);
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
	public EClass getBindingConnectorAsUsage() {
		return bindingConnectorAsUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemDefinition() {
		return itemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOccurrenceDefinition() {
		return occurrenceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOccurrenceDefinition_LifeClass() {
		return (EReference)occurrenceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceDefinition_IsIndividual() {
		return (EAttribute)occurrenceDefinitionEClass.getEStructuralFeatures().get(1);
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
	public EClass getConnectionDefinition() {
		return connectionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionDefinition_ConnectionEnd() {
		return (EReference)connectionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeUsage() {
		return attributeUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeUsage_AttributeDefinition() {
		return (EReference)attributeUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewUsage() {
		return viewUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewUsage_ViewDefinition() {
		return (EReference)viewUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewUsage_SatisfiedViewpoint() {
		return (EReference)viewUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewUsage_ExposedElement() {
		return (EReference)viewUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewUsage_ViewRendering() {
		return (EReference)viewUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewUsage_ViewCondition() {
		return (EReference)viewUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getViewUsage__IncludeAsExposed__Element() {
		return viewUsageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewDefinition() {
		return viewDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewDefinition_View() {
		return (EReference)viewDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewDefinition_SatisfiedViewpoint() {
		return (EReference)viewDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewDefinition_ViewRendering() {
		return (EReference)viewDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewDefinition_ViewCondition() {
		return (EReference)viewDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewpointUsage() {
		return viewpointUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewpointUsage_ViewpointDefinition() {
		return (EReference)viewpointUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewpointUsage_ViewpointStakeholder() {
		return (EReference)viewpointUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewpointDefinition() {
		return viewpointDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewpointDefinition_ViewpointStakeholder() {
		return (EReference)viewpointDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRenderingUsage() {
		return renderingUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRenderingUsage_RenderingDefinition() {
		return (EReference)renderingUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRenderingDefinition() {
		return renderingDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRenderingDefinition_Rendering() {
		return (EReference)renderingDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerificationCaseUsage() {
		return verificationCaseUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerificationCaseUsage_VerificationCaseDefinition() {
		return (EReference)verificationCaseUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerificationCaseUsage_VerifiedRequirement() {
		return (EReference)verificationCaseUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerificationCaseDefinition() {
		return verificationCaseDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerificationCaseDefinition_VerifiedRequirement() {
		return (EReference)verificationCaseDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationUsage() {
		return enumerationUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationUsage_EnumerationDefinition() {
		return (EReference)enumerationUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationDefinition() {
		return enumerationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationDefinition_EnumeratedValue() {
		return (EReference)enumerationDefinitionEClass.getEStructuralFeatures().get(0);
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
	public EClass getConcernUsage() {
		return concernUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcernUsage_ConcernDefinition() {
		return (EReference)concernUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcernDefinition() {
		return concernDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaseDefinition() {
		return caseDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseDefinition_SubjectParameter() {
		return (EReference)caseDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseDefinition_ActorParameter() {
		return (EReference)caseDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseDefinition_ObjectiveRequirement() {
		return (EReference)caseDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculationDefinition() {
		return calculationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculationDefinition_Calculation() {
		return (EReference)calculationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionDefinition() {
		return actionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionDefinition_Action() {
		return (EReference)actionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalculationUsage() {
		return calculationUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCalculationUsage_CalculationDefinition() {
		return (EReference)calculationUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaseUsage() {
		return caseUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseUsage_ObjectiveRequirement() {
		return (EReference)caseUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseUsage_SubjectParameter() {
		return (EReference)caseUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseUsage_ActorParameter() {
		return (EReference)caseUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseUsage_CaseDefinition() {
		return (EReference)caseUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariantMembership() {
		return variantMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantMembership_OwnedVariantUsage() {
		return (EReference)variantMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysisCaseUsage() {
		return analysisCaseUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisCaseUsage_AnalysisAction() {
		return (EReference)analysisCaseUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisCaseUsage_AnalysisCaseDefinition() {
		return (EReference)analysisCaseUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisCaseUsage_ResultExpression() {
		return (EReference)analysisCaseUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysisCaseDefinition() {
		return analysisCaseDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisCaseDefinition_AnalysisAction() {
		return (EReference)analysisCaseDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisCaseDefinition_ResultExpression() {
		return (EReference)analysisCaseDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceUsage() {
		return referenceUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorAsUsage() {
		return connectorAsUsageEClass;
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
	public EReference getConnectionUsage_ConnectionDefinition() {
		return (EReference)connectionUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartUsage() {
		return partUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartUsage_PartDefinition() {
		return (EReference)partUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemUsage() {
		return itemUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemUsage_ItemDefinition() {
		return (EReference)itemUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartDefinition() {
		return partDefinitionEClass;
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
	public EClass getFramedConcernMembership() {
		return framedConcernMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFramedConcernMembership_OwnedConcern() {
		return (EReference)framedConcernMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFramedConcernMembership_ReferencedConcern() {
		return (EReference)framedConcernMembershipEClass.getEStructuralFeatures().get(1);
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
	public EReference getRequirementUsage_SubjectParameter() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_FramedConcern() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_ActorParameter() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_StakeholderParameter() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementUsage_ReqId() {
		return (EAttribute)requirementUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementUsage_Text() {
		return (EAttribute)requirementUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_RequiredConstraint() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementUsage_AssumedConstraint() {
		return (EReference)requirementUsageEClass.getEStructuralFeatures().get(4);
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
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDefinition_FramedConcern() {
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDefinition_ActorParameter() {
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDefinition_StakeholderParameter() {
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementDefinition_ReqId() {
		return (EAttribute)requirementDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementDefinition_Text() {
		return (EAttribute)requirementDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDefinition_AssumedConstraint() {
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementDefinition_RequiredConstraint() {
		return (EReference)requirementDefinitionEClass.getEStructuralFeatures().get(6);
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
	public EClass getFlowConnectionDefinition() {
		return flowConnectionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessionFlowConnectionUsage() {
		return successionFlowConnectionUsageEClass;
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
	public EOperation getMultiplicityRange__HasBounds__int_int() {
		return multiplicityRangeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMultiplicityRange__ValueOf__Expression() {
		return multiplicityRangeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadataFeature() {
		return metadataFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadataFeature_Metaclass() {
		return (EReference)metadataFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMetadataFeature__EvaluateFeature__Feature() {
		return metadataFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMetadataFeature__IsSemantic() {
		return metadataFeatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMetadataFeature__IsSyntactic() {
		return metadataFeatureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMetadataFeature__SyntaxElement() {
		return metadataFeatureEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaclass() {
		return metaclassEClass;
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
	public EAttribute getComment_Locale() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextualRepresentation() {
		return textualRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextualRepresentation_Language() {
		return (EAttribute)textualRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextualRepresentation_Body() {
		return (EAttribute)textualRepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextualRepresentation_RepresentedElement() {
		return (EReference)textualRepresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMembershipImport() {
		return membershipImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMembershipImport_ImportedMembership() {
		return (EReference)membershipImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespaceImport() {
		return namespaceImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespaceImport_ImportedNamespace() {
		return (EReference)namespaceImportEClass.getEStructuralFeatures().get(0);
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
	public EReference getAnnotation_AnnotatingElement() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
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
	public EReference getAnnotation_OwningAnnotatedElement() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_OwningAnnotatingElement() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotatingElement() {
		return annotatingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatingElement_AnnotatedElement() {
		return (EReference)annotatingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatingElement_OwnedAnnotatingRelationship() {
		return (EReference)annotatingElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatingElement_Annotation() {
		return (EReference)annotatingElementEClass.getEStructuralFeatures().get(2);
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
	public EClass getLifeClass() {
		return lifeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Client() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Supplier() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
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
	public EReference getRequirementConstraintMembership_OwnedConstraint() {
		return (EReference)requirementConstraintMembershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementConstraintMembership_ReferencedConstraint() {
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
	public EClass getSelectExpression() {
		return selectExpressionEClass;
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
	public EReference getInvocationExpression_Operand() {
		return (EReference)invocationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralInfinity() {
		return literalInfinityEClass;
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
	public EClass getStakeholderMembership() {
		return stakeholderMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStakeholderMembership_OwnedStakeholderParameter() {
		return (EReference)stakeholderMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActorMembership() {
		return actorMembershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActorMembership_OwnedActorParameter() {
		return (EReference)actorMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterMembership_OwnedMemberParameter() {
		return (EReference)parameterMembershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterMembership__ParameterDirection() {
		return parameterMembershipEClass.getEOperations().get(0);
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
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralRational() {
		return literalRationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralRational_Value() {
		return (EAttribute)literalRationalEClass.getEStructuralFeatures().get(0);
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
	public EClass getItemFeature() {
		return itemFeatureEClass;
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
	public EReference getTransitionFeatureMembership_TransitionFeature() {
		return (EReference)transitionFeatureMembershipEClass.getEStructuralFeatures().get(1);
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
	public EClass getFeatureChainExpression() {
		return featureChainExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureChainExpression_TargetFeature() {
		return (EReference)featureChainExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeatureChainExpression__SourceTargetFeature() {
		return featureChainExpressionEClass.getEOperations().get(0);
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
	public EReference getItemFlow_ItemFeature() {
		return (EReference)itemFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemFlow_Interaction() {
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
	public EClass getSuccessionAsUsage() {
		return successionAsUsageEClass;
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
	public EClass getMetadataAccessExpression() {
		return metadataAccessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadataAccessExpression_ReferencedElement() {
		return (EReference)metadataAccessExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMetadataAccessExpression__MetaclassFeature() {
		return metadataAccessExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectExpression() {
		return collectExpressionEClass;
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
	public EEnum getTriggerKind() {
		return triggerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortionKind() {
		return portionKindEEnum;
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
		unioningEClass = createEClass(UNIONING);
		createEReference(unioningEClass, UNIONING__TYPE_UNIONED);
		createEReference(unioningEClass, UNIONING__UNIONING_TYPE);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__OWNED_RELATED_ELEMENT);
		createEReference(relationshipEClass, RELATIONSHIP__OWNING_RELATED_ELEMENT);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEAttribute(relationshipEClass, RELATIONSHIP__IS_IMPLIED);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNING_MEMBERSHIP);
		createEReference(elementEClass, ELEMENT__OWNING_NAMESPACE);
		createEReference(elementEClass, ELEMENT__OWNING_RELATIONSHIP);
		createEAttribute(elementEClass, ELEMENT__ELEMENT_ID);
		createEReference(elementEClass, ELEMENT__OWNED_RELATIONSHIP);
		createEReference(elementEClass, ELEMENT__OWNER);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__DOCUMENTATION);
		createEReference(elementEClass, ELEMENT__OWNED_ANNOTATION);
		createEReference(elementEClass, ELEMENT__TEXTUAL_REPRESENTATION);
		createEAttribute(elementEClass, ELEMENT__ALIAS_IDS);
		createEAttribute(elementEClass, ELEMENT__DECLARED_SHORT_NAME);
		createEAttribute(elementEClass, ELEMENT__DECLARED_NAME);
		createEAttribute(elementEClass, ELEMENT__SHORT_NAME);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__QUALIFIED_NAME);
		createEAttribute(elementEClass, ELEMENT__IS_IMPLIED_INCLUDED);
		createEAttribute(elementEClass, ELEMENT__IS_LIBRARY_ELEMENT);
		createEOperation(elementEClass, ELEMENT___ESCAPED_NAME);
		createEOperation(elementEClass, ELEMENT___EFFECTIVE_SHORT_NAME);
		createEOperation(elementEClass, ELEMENT___EFFECTIVE_NAME);
		createEOperation(elementEClass, ELEMENT___LIBRARY_NAMESPACE);

		owningMembershipEClass = createEClass(OWNING_MEMBERSHIP);
		createEAttribute(owningMembershipEClass, OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID);
		createEAttribute(owningMembershipEClass, OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME);
		createEAttribute(owningMembershipEClass, OWNING_MEMBERSHIP__OWNED_MEMBER_NAME);
		createEReference(owningMembershipEClass, OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT);

		membershipEClass = createEClass(MEMBERSHIP);
		createEAttribute(membershipEClass, MEMBERSHIP__MEMBER_ELEMENT_ID);
		createEReference(membershipEClass, MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE);
		createEAttribute(membershipEClass, MEMBERSHIP__MEMBER_SHORT_NAME);
		createEReference(membershipEClass, MEMBERSHIP__MEMBER_ELEMENT);
		createEAttribute(membershipEClass, MEMBERSHIP__MEMBER_NAME);
		createEAttribute(membershipEClass, MEMBERSHIP__VISIBILITY);
		createEOperation(membershipEClass, MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__MEMBERSHIP);
		createEReference(namespaceEClass, NAMESPACE__OWNED_IMPORT);
		createEReference(namespaceEClass, NAMESPACE__MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__IMPORTED_MEMBERSHIP);
		createEReference(namespaceEClass, NAMESPACE__OWNED_MEMBERSHIP);
		createEOperation(namespaceEClass, NAMESPACE___NAMES_OF__ELEMENT);
		createEOperation(namespaceEClass, NAMESPACE___VISIBILITY_OF__MEMBERSHIP);
		createEOperation(namespaceEClass, NAMESPACE___VISIBLE_MEMBERSHIPS__ELIST_BOOLEAN_BOOLEAN);
		createEOperation(namespaceEClass, NAMESPACE___IMPORTED_MEMBERSHIPS__ELIST);
		createEOperation(namespaceEClass, NAMESPACE___RESOLVE__STRING);
		createEOperation(namespaceEClass, NAMESPACE___RESOLVE_GLOBAL__STRING);
		createEOperation(namespaceEClass, NAMESPACE___RESOLVE_LOCAL__STRING);
		createEOperation(namespaceEClass, NAMESPACE___RESOLVE_VISIBLE__STRING);
		createEOperation(namespaceEClass, NAMESPACE___QUALIFICATION_OF__STRING);
		createEOperation(namespaceEClass, NAMESPACE___UNQUALIFIED_NAME_OF__STRING);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__VISIBILITY);
		createEAttribute(importEClass, IMPORT__IS_RECURSIVE);
		createEAttribute(importEClass, IMPORT__IS_IMPORT_ALL);
		createEReference(importEClass, IMPORT__IMPORTED_ELEMENT);
		createEReference(importEClass, IMPORT__IMPORT_OWNING_NAMESPACE);
		createEOperation(importEClass, IMPORT___IMPORTED_MEMBERSHIPS__ELIST);

		documentationEClass = createEClass(DOCUMENTATION);
		createEReference(documentationEClass, DOCUMENTATION__DOCUMENTED_ELEMENT);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__LOCALE);
		createEAttribute(commentEClass, COMMENT__BODY);

		annotatingElementEClass = createEClass(ANNOTATING_ELEMENT);
		createEReference(annotatingElementEClass, ANNOTATING_ELEMENT__ANNOTATED_ELEMENT);
		createEReference(annotatingElementEClass, ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP);
		createEReference(annotatingElementEClass, ANNOTATING_ELEMENT__ANNOTATION);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__ANNOTATING_ELEMENT);
		createEReference(annotationEClass, ANNOTATION__ANNOTATED_ELEMENT);
		createEReference(annotationEClass, ANNOTATION__OWNING_ANNOTATED_ELEMENT);
		createEReference(annotationEClass, ANNOTATION__OWNING_ANNOTATING_ELEMENT);

		textualRepresentationEClass = createEClass(TEXTUAL_REPRESENTATION);
		createEAttribute(textualRepresentationEClass, TEXTUAL_REPRESENTATION__LANGUAGE);
		createEAttribute(textualRepresentationEClass, TEXTUAL_REPRESENTATION__BODY);
		createEReference(textualRepresentationEClass, TEXTUAL_REPRESENTATION__REPRESENTED_ELEMENT);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__OWNED_SPECIALIZATION);
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
		createEReference(typeEClass, TYPE__OWNED_CONJUGATOR);
		createEAttribute(typeEClass, TYPE__IS_CONJUGATED);
		createEReference(typeEClass, TYPE__INHERITED_FEATURE);
		createEReference(typeEClass, TYPE__MULTIPLICITY);
		createEReference(typeEClass, TYPE__UNIONING_TYPE);
		createEReference(typeEClass, TYPE__OWNED_INTERSECTING);
		createEReference(typeEClass, TYPE__INTERSECTING_TYPE);
		createEReference(typeEClass, TYPE__OWNED_DISJOINING);
		createEReference(typeEClass, TYPE__FEATURE_MEMBERSHIP);
		createEReference(typeEClass, TYPE__DIFFERENCING_TYPE);
		createEReference(typeEClass, TYPE__OWNED_DIFFERENCING);
		createEReference(typeEClass, TYPE__DIRECTED_FEATURE);
		createEReference(typeEClass, TYPE__OWNED_UNIONING);
		createEOperation(typeEClass, TYPE___INHERITED_MEMBERSHIPS__ELIST);
		createEOperation(typeEClass, TYPE___DIRECTION_OF__FEATURE);
		createEOperation(typeEClass, TYPE___DIRECTION_OF_EXCLUDING__FEATURE_ELIST);
		createEOperation(typeEClass, TYPE___ALL_SUPERTYPES);
		createEOperation(typeEClass, TYPE___SPECIALIZES__TYPE);
		createEOperation(typeEClass, TYPE___SPECIALIZES_FROM_LIBRARY__STRING);

		specializationEClass = createEClass(SPECIALIZATION);
		createEReference(specializationEClass, SPECIALIZATION__GENERAL);
		createEReference(specializationEClass, SPECIALIZATION__SPECIFIC);
		createEReference(specializationEClass, SPECIALIZATION__OWNING_TYPE);

		featureMembershipEClass = createEClass(FEATURE_MEMBERSHIP);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE);
		createEReference(featureMembershipEClass, FEATURE_MEMBERSHIP__OWNING_TYPE);

		featuringEClass = createEClass(FEATURING);
		createEReference(featuringEClass, FEATURING__TYPE);
		createEReference(featuringEClass, FEATURING__FEATURE);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__OWNING_TYPE);
		createEAttribute(featureEClass, FEATURE__IS_UNIQUE);
		createEAttribute(featureEClass, FEATURE__IS_ORDERED);
		createEReference(featureEClass, FEATURE__TYPE);
		createEReference(featureEClass, FEATURE__OWNED_REDEFINITION);
		createEReference(featureEClass, FEATURE__OWNED_SUBSETTING);
		createEReference(featureEClass, FEATURE__OWNING_FEATURE_MEMBERSHIP);
		createEAttribute(featureEClass, FEATURE__IS_COMPOSITE);
		createEAttribute(featureEClass, FEATURE__IS_END);
		createEReference(featureEClass, FEATURE__END_OWNING_TYPE);
		createEReference(featureEClass, FEATURE__OWNED_TYPING);
		createEReference(featureEClass, FEATURE__FEATURING_TYPE);
		createEReference(featureEClass, FEATURE__OWNED_TYPE_FEATURING);
		createEAttribute(featureEClass, FEATURE__IS_DERIVED);
		createEReference(featureEClass, FEATURE__CHAINING_FEATURE);
		createEReference(featureEClass, FEATURE__OWNED_FEATURE_INVERTING);
		createEReference(featureEClass, FEATURE__OWNED_FEATURE_CHAINING);
		createEAttribute(featureEClass, FEATURE__IS_READ_ONLY);
		createEAttribute(featureEClass, FEATURE__IS_PORTION);
		createEAttribute(featureEClass, FEATURE__DIRECTION);
		createEReference(featureEClass, FEATURE__OWNED_REFERENCE_SUBSETTING);
		createEAttribute(featureEClass, FEATURE__IS_NONUNIQUE);
		createEOperation(featureEClass, FEATURE___DIRECTION_FOR__TYPE);
		createEOperation(featureEClass, FEATURE___IS_FEATURED_WITHIN__TYPE);
		createEOperation(featureEClass, FEATURE___NAMING_FEATURE);
		createEOperation(featureEClass, FEATURE___REDEFINES__FEATURE);
		createEOperation(featureEClass, FEATURE___REDEFINES_FROM_LIBRARY__STRING);
		createEOperation(featureEClass, FEATURE___SUBSETS_CHAIN__FEATURE_FEATURE);
		createEOperation(featureEClass, FEATURE___TYPING_FEATURES);

		redefinitionEClass = createEClass(REDEFINITION);
		createEReference(redefinitionEClass, REDEFINITION__REDEFINING_FEATURE);
		createEReference(redefinitionEClass, REDEFINITION__REDEFINED_FEATURE);

		subsettingEClass = createEClass(SUBSETTING);
		createEReference(subsettingEClass, SUBSETTING__SUBSETTED_FEATURE);
		createEReference(subsettingEClass, SUBSETTING__SUBSETTING_FEATURE);
		createEReference(subsettingEClass, SUBSETTING__OWNING_FEATURE);

		featureTypingEClass = createEClass(FEATURE_TYPING);
		createEReference(featureTypingEClass, FEATURE_TYPING__TYPED_FEATURE);
		createEReference(featureTypingEClass, FEATURE_TYPING__TYPE);
		createEReference(featureTypingEClass, FEATURE_TYPING__OWNING_FEATURE);

		typeFeaturingEClass = createEClass(TYPE_FEATURING);
		createEReference(typeFeaturingEClass, TYPE_FEATURING__FEATURE_OF_TYPE);
		createEReference(typeFeaturingEClass, TYPE_FEATURING__FEATURING_TYPE);
		createEReference(typeFeaturingEClass, TYPE_FEATURING__OWNING_FEATURE_OF_TYPE);

		featureInvertingEClass = createEClass(FEATURE_INVERTING);
		createEReference(featureInvertingEClass, FEATURE_INVERTING__FEATURE_INVERTED);
		createEReference(featureInvertingEClass, FEATURE_INVERTING__INVERTING_FEATURE);
		createEReference(featureInvertingEClass, FEATURE_INVERTING__OWNING_FEATURE);

		featureChainingEClass = createEClass(FEATURE_CHAINING);
		createEReference(featureChainingEClass, FEATURE_CHAINING__CHAINING_FEATURE);
		createEReference(featureChainingEClass, FEATURE_CHAINING__FEATURE_CHAINED);

		referenceSubsettingEClass = createEClass(REFERENCE_SUBSETTING);
		createEReference(referenceSubsettingEClass, REFERENCE_SUBSETTING__REFERENCED_FEATURE);
		createEReference(referenceSubsettingEClass, REFERENCE_SUBSETTING__REFERENCING_FEATURE);

		conjugationEClass = createEClass(CONJUGATION);
		createEReference(conjugationEClass, CONJUGATION__ORIGINAL_TYPE);
		createEReference(conjugationEClass, CONJUGATION__CONJUGATED_TYPE);
		createEReference(conjugationEClass, CONJUGATION__OWNING_TYPE);

		multiplicityEClass = createEClass(MULTIPLICITY);

		intersectingEClass = createEClass(INTERSECTING);
		createEReference(intersectingEClass, INTERSECTING__INTERSECTING_TYPE);
		createEReference(intersectingEClass, INTERSECTING__TYPE_INTERSECTED);

		disjoiningEClass = createEClass(DISJOINING);
		createEReference(disjoiningEClass, DISJOINING__TYPE_DISJOINED);
		createEReference(disjoiningEClass, DISJOINING__DISJOINING_TYPE);
		createEReference(disjoiningEClass, DISJOINING__OWNING_TYPE);

		differencingEClass = createEClass(DIFFERENCING);
		createEReference(differencingEClass, DIFFERENCING__DIFFERENCING_TYPE);
		createEReference(differencingEClass, DIFFERENCING__TYPE_DIFFERENCED);

		subclassificationEClass = createEClass(SUBCLASSIFICATION);
		createEReference(subclassificationEClass, SUBCLASSIFICATION__SUPERCLASSIFIER);
		createEReference(subclassificationEClass, SUBCLASSIFICATION__OWNING_CLASSIFIER);
		createEReference(subclassificationEClass, SUBCLASSIFICATION__SUBCLASSIFIER);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__OWNED_SUBCLASSIFICATION);

		endFeatureMembershipEClass = createEClass(END_FEATURE_MEMBERSHIP);

		successionEClass = createEClass(SUCCESSION);
		createEReference(successionEClass, SUCCESSION__TRANSITION_STEP);
		createEReference(successionEClass, SUCCESSION__TRIGGER_STEP);
		createEReference(successionEClass, SUCCESSION__EFFECT_STEP);
		createEReference(successionEClass, SUCCESSION__GUARD_EXPRESSION);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__RELATED_FEATURE);
		createEReference(connectorEClass, CONNECTOR__ASSOCIATION);
		createEReference(connectorEClass, CONNECTOR__CONNECTOR_END);
		createEReference(connectorEClass, CONNECTOR__SOURCE_FEATURE);
		createEReference(connectorEClass, CONNECTOR__TARGET_FEATURE);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__RELATED_TYPE);
		createEReference(associationEClass, ASSOCIATION__SOURCE_TYPE);
		createEReference(associationEClass, ASSOCIATION__TARGET_TYPE);
		createEReference(associationEClass, ASSOCIATION__ASSOCIATION_END);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__BEHAVIOR);
		createEReference(stepEClass, STEP__PARAMETER);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__STEP);
		createEReference(behaviorEClass, BEHAVIOR__PARAMETER);

		classEClass = createEClass(CLASS);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__FUNCTION);
		createEReference(expressionEClass, EXPRESSION__RESULT);
		createEAttribute(expressionEClass, EXPRESSION__IS_MODEL_LEVEL_EVALUABLE);
		createEOperation(expressionEClass, EXPRESSION___MODEL_LEVEL_EVALUABLE__ELIST);
		createEOperation(expressionEClass, EXPRESSION___EVALUATE__ELEMENT);
		createEOperation(expressionEClass, EXPRESSION___CHECK_CONDITION__ELEMENT);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__EXPRESSION);
		createEReference(functionEClass, FUNCTION__RESULT);
		createEAttribute(functionEClass, FUNCTION__IS_MODEL_LEVEL_EVALUABLE);

		bindingConnectorEClass = createEClass(BINDING_CONNECTOR);

		featureValueEClass = createEClass(FEATURE_VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__FEATURE_WITH_VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__VALUE);
		createEAttribute(featureValueEClass, FEATURE_VALUE__IS_INITIAL);
		createEAttribute(featureValueEClass, FEATURE_VALUE__IS_DEFAULT);

		elementFilterMembershipEClass = createEClass(ELEMENT_FILTER_MEMBERSHIP);
		createEReference(elementFilterMembershipEClass, ELEMENT_FILTER_MEMBERSHIP__CONDITION);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__FILTER_CONDITION);
		createEOperation(packageEClass, PACKAGE___INCLUDE_AS_MEMBER__ELEMENT);

		libraryPackageEClass = createEClass(LIBRARY_PACKAGE);
		createEAttribute(libraryPackageEClass, LIBRARY_PACKAGE__IS_STANDARD);

		multiplicityRangeEClass = createEClass(MULTIPLICITY_RANGE);
		createEReference(multiplicityRangeEClass, MULTIPLICITY_RANGE__LOWER_BOUND);
		createEReference(multiplicityRangeEClass, MULTIPLICITY_RANGE__UPPER_BOUND);
		createEReference(multiplicityRangeEClass, MULTIPLICITY_RANGE__BOUND);
		createEOperation(multiplicityRangeEClass, MULTIPLICITY_RANGE___HAS_BOUNDS__INT_INT);
		createEOperation(multiplicityRangeEClass, MULTIPLICITY_RANGE___VALUE_OF__EXPRESSION);

		parameterMembershipEClass = createEClass(PARAMETER_MEMBERSHIP);
		createEReference(parameterMembershipEClass, PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER);
		createEOperation(parameterMembershipEClass, PARAMETER_MEMBERSHIP___PARAMETER_DIRECTION);

		dataTypeEClass = createEClass(DATA_TYPE);

		returnParameterMembershipEClass = createEClass(RETURN_PARAMETER_MEMBERSHIP);

		invariantEClass = createEClass(INVARIANT);
		createEAttribute(invariantEClass, INVARIANT__IS_NEGATED);

		booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);
		createEReference(booleanExpressionEClass, BOOLEAN_EXPRESSION__PREDICATE);

		predicateEClass = createEClass(PREDICATE);

		resultExpressionMembershipEClass = createEClass(RESULT_EXPRESSION_MEMBERSHIP);
		createEReference(resultExpressionMembershipEClass, RESULT_EXPRESSION_MEMBERSHIP__OWNED_RESULT_EXPRESSION);

		metaclassEClass = createEClass(METACLASS);

		structureEClass = createEClass(STRUCTURE);

		metadataFeatureEClass = createEClass(METADATA_FEATURE);
		createEReference(metadataFeatureEClass, METADATA_FEATURE__METACLASS);
		createEOperation(metadataFeatureEClass, METADATA_FEATURE___EVALUATE_FEATURE__FEATURE);
		createEOperation(metadataFeatureEClass, METADATA_FEATURE___IS_SEMANTIC);
		createEOperation(metadataFeatureEClass, METADATA_FEATURE___IS_SYNTACTIC);
		createEOperation(metadataFeatureEClass, METADATA_FEATURE___SYNTAX_ELEMENT);

		itemFlowEClass = createEClass(ITEM_FLOW);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_TYPE);
		createEReference(itemFlowEClass, ITEM_FLOW__TARGET_INPUT_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__SOURCE_OUTPUT_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_FLOW_END);
		createEReference(itemFlowEClass, ITEM_FLOW__ITEM_FEATURE);
		createEReference(itemFlowEClass, ITEM_FLOW__INTERACTION);

		itemFlowEndEClass = createEClass(ITEM_FLOW_END);

		itemFeatureEClass = createEClass(ITEM_FEATURE);

		interactionEClass = createEClass(INTERACTION);

		successionItemFlowEClass = createEClass(SUCCESSION_ITEM_FLOW);

		associationStructureEClass = createEClass(ASSOCIATION_STRUCTURE);

		nullExpressionEClass = createEClass(NULL_EXPRESSION);

		literalRationalEClass = createEClass(LITERAL_RATIONAL);
		createEAttribute(literalRationalEClass, LITERAL_RATIONAL__VALUE);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);

		selectExpressionEClass = createEClass(SELECT_EXPRESSION);

		operatorExpressionEClass = createEClass(OPERATOR_EXPRESSION);
		createEAttribute(operatorExpressionEClass, OPERATOR_EXPRESSION__OPERATOR);

		invocationExpressionEClass = createEClass(INVOCATION_EXPRESSION);
		createEReference(invocationExpressionEClass, INVOCATION_EXPRESSION__ARGUMENT);
		createEReference(invocationExpressionEClass, INVOCATION_EXPRESSION__OPERAND);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		collectExpressionEClass = createEClass(COLLECT_EXPRESSION);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		featureReferenceExpressionEClass = createEClass(FEATURE_REFERENCE_EXPRESSION);
		createEReference(featureReferenceExpressionEClass, FEATURE_REFERENCE_EXPRESSION__REFERENT);

		metadataAccessExpressionEClass = createEClass(METADATA_ACCESS_EXPRESSION);
		createEReference(metadataAccessExpressionEClass, METADATA_ACCESS_EXPRESSION__REFERENCED_ELEMENT);
		createEOperation(metadataAccessExpressionEClass, METADATA_ACCESS_EXPRESSION___METACLASS_FEATURE);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalInfinityEClass = createEClass(LITERAL_INFINITY);

		featureChainExpressionEClass = createEClass(FEATURE_CHAIN_EXPRESSION);
		createEReference(featureChainExpressionEClass, FEATURE_CHAIN_EXPRESSION__TARGET_FEATURE);
		createEOperation(featureChainExpressionEClass, FEATURE_CHAIN_EXPRESSION___SOURCE_TARGET_FEATURE);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__CLIENT);
		createEReference(dependencyEClass, DEPENDENCY__SUPPLIER);

		membershipImportEClass = createEClass(MEMBERSHIP_IMPORT);
		createEReference(membershipImportEClass, MEMBERSHIP_IMPORT__IMPORTED_MEMBERSHIP);

		namespaceImportEClass = createEClass(NAMESPACE_IMPORT);
		createEReference(namespaceImportEClass, NAMESPACE_IMPORT__IMPORTED_NAMESPACE);

		transitionUsageEClass = createEClass(TRANSITION_USAGE);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__SOURCE);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__TARGET);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__TRIGGER_ACTION);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__GUARD_EXPRESSION);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__EFFECT_ACTION);
		createEReference(transitionUsageEClass, TRANSITION_USAGE__SUCCESSION);
		createEOperation(transitionUsageEClass, TRANSITION_USAGE___TRIGGER_PAYLOAD_PARAMETER);

		actionUsageEClass = createEClass(ACTION_USAGE);
		createEReference(actionUsageEClass, ACTION_USAGE__ACTION_DEFINITION);
		createEOperation(actionUsageEClass, ACTION_USAGE___INPUT_PARAMETERS);
		createEOperation(actionUsageEClass, ACTION_USAGE___INPUT_PARAMETER__INT);
		createEOperation(actionUsageEClass, ACTION_USAGE___ARGUMENT__INT);
		createEOperation(actionUsageEClass, ACTION_USAGE___IS_SUBACTION_USAGE);

		occurrenceUsageEClass = createEClass(OCCURRENCE_USAGE);
		createEReference(occurrenceUsageEClass, OCCURRENCE_USAGE__OCCURRENCE_DEFINITION);
		createEReference(occurrenceUsageEClass, OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION);
		createEAttribute(occurrenceUsageEClass, OCCURRENCE_USAGE__IS_INDIVIDUAL);
		createEAttribute(occurrenceUsageEClass, OCCURRENCE_USAGE__PORTION_KIND);

		usageEClass = createEClass(USAGE);
		createEAttribute(usageEClass, USAGE__IS_REFERENCE);
		createEAttribute(usageEClass, USAGE__IS_VARIATION);
		createEReference(usageEClass, USAGE__VARIANT);
		createEReference(usageEClass, USAGE__VARIANT_MEMBERSHIP);
		createEReference(usageEClass, USAGE__OWNING_DEFINITION);
		createEReference(usageEClass, USAGE__OWNING_USAGE);
		createEReference(usageEClass, USAGE__NESTED_USAGE);
		createEReference(usageEClass, USAGE__DEFINITION);
		createEReference(usageEClass, USAGE__USAGE);
		createEReference(usageEClass, USAGE__DIRECTED_USAGE);
		createEReference(usageEClass, USAGE__NESTED_REFERENCE);
		createEReference(usageEClass, USAGE__NESTED_ATTRIBUTE);
		createEReference(usageEClass, USAGE__NESTED_ENUMERATION);
		createEReference(usageEClass, USAGE__NESTED_OCCURRENCE);
		createEReference(usageEClass, USAGE__NESTED_ITEM);
		createEReference(usageEClass, USAGE__NESTED_PART);
		createEReference(usageEClass, USAGE__NESTED_PORT);
		createEReference(usageEClass, USAGE__NESTED_CONNECTION);
		createEReference(usageEClass, USAGE__NESTED_FLOW);
		createEReference(usageEClass, USAGE__NESTED_INTERFACE);
		createEReference(usageEClass, USAGE__NESTED_ALLOCATION);
		createEReference(usageEClass, USAGE__NESTED_ACTION);
		createEReference(usageEClass, USAGE__NESTED_STATE);
		createEReference(usageEClass, USAGE__NESTED_TRANSITION);
		createEReference(usageEClass, USAGE__NESTED_CALCULATION);
		createEReference(usageEClass, USAGE__NESTED_CONSTRAINT);
		createEReference(usageEClass, USAGE__NESTED_REQUIREMENT);
		createEReference(usageEClass, USAGE__NESTED_CONCERN);
		createEReference(usageEClass, USAGE__NESTED_CASE);
		createEReference(usageEClass, USAGE__NESTED_ANALYSIS_CASE);
		createEReference(usageEClass, USAGE__NESTED_VERIFICATION_CASE);
		createEReference(usageEClass, USAGE__NESTED_USE_CASE);
		createEReference(usageEClass, USAGE__NESTED_VIEW);
		createEReference(usageEClass, USAGE__NESTED_VIEWPOINT);
		createEReference(usageEClass, USAGE__NESTED_RENDERING);
		createEReference(usageEClass, USAGE__NESTED_METADATA);

		variantMembershipEClass = createEClass(VARIANT_MEMBERSHIP);
		createEReference(variantMembershipEClass, VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE);

		definitionEClass = createEClass(DEFINITION);
		createEAttribute(definitionEClass, DEFINITION__IS_VARIATION);
		createEReference(definitionEClass, DEFINITION__VARIANT);
		createEReference(definitionEClass, DEFINITION__VARIANT_MEMBERSHIP);
		createEReference(definitionEClass, DEFINITION__USAGE);
		createEReference(definitionEClass, DEFINITION__DIRECTED_USAGE);
		createEReference(definitionEClass, DEFINITION__OWNED_REFERENCE);
		createEReference(definitionEClass, DEFINITION__OWNED_ATTRIBUTE);
		createEReference(definitionEClass, DEFINITION__OWNED_ENUMERATION);
		createEReference(definitionEClass, DEFINITION__OWNED_OCCURRENCE);
		createEReference(definitionEClass, DEFINITION__OWNED_ITEM);
		createEReference(definitionEClass, DEFINITION__OWNED_PART);
		createEReference(definitionEClass, DEFINITION__OWNED_PORT);
		createEReference(definitionEClass, DEFINITION__OWNED_CONNECTION);
		createEReference(definitionEClass, DEFINITION__OWNED_FLOW);
		createEReference(definitionEClass, DEFINITION__OWNED_INTERFACE);
		createEReference(definitionEClass, DEFINITION__OWNED_ALLOCATION);
		createEReference(definitionEClass, DEFINITION__OWNED_ACTION);
		createEReference(definitionEClass, DEFINITION__OWNED_STATE);
		createEReference(definitionEClass, DEFINITION__OWNED_TRANSITION);
		createEReference(definitionEClass, DEFINITION__OWNED_CALCULATION);
		createEReference(definitionEClass, DEFINITION__OWNED_CONSTRAINT);
		createEReference(definitionEClass, DEFINITION__OWNED_REQUIREMENT);
		createEReference(definitionEClass, DEFINITION__OWNED_CONCERN);
		createEReference(definitionEClass, DEFINITION__OWNED_CASE);
		createEReference(definitionEClass, DEFINITION__OWNED_ANALYSIS_CASE);
		createEReference(definitionEClass, DEFINITION__OWNED_VERIFICATION_CASE);
		createEReference(definitionEClass, DEFINITION__OWNED_USE_CASE);
		createEReference(definitionEClass, DEFINITION__OWNED_VIEW);
		createEReference(definitionEClass, DEFINITION__OWNED_VIEWPOINT);
		createEReference(definitionEClass, DEFINITION__OWNED_RENDERING);
		createEReference(definitionEClass, DEFINITION__OWNED_METADATA);
		createEReference(definitionEClass, DEFINITION__OWNED_USAGE);

		referenceUsageEClass = createEClass(REFERENCE_USAGE);

		attributeUsageEClass = createEClass(ATTRIBUTE_USAGE);
		createEReference(attributeUsageEClass, ATTRIBUTE_USAGE__ATTRIBUTE_DEFINITION);

		enumerationUsageEClass = createEClass(ENUMERATION_USAGE);
		createEReference(enumerationUsageEClass, ENUMERATION_USAGE__ENUMERATION_DEFINITION);

		enumerationDefinitionEClass = createEClass(ENUMERATION_DEFINITION);
		createEReference(enumerationDefinitionEClass, ENUMERATION_DEFINITION__ENUMERATED_VALUE);

		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);

		itemUsageEClass = createEClass(ITEM_USAGE);
		createEReference(itemUsageEClass, ITEM_USAGE__ITEM_DEFINITION);

		partUsageEClass = createEClass(PART_USAGE);
		createEReference(partUsageEClass, PART_USAGE__PART_DEFINITION);

		partDefinitionEClass = createEClass(PART_DEFINITION);

		itemDefinitionEClass = createEClass(ITEM_DEFINITION);

		occurrenceDefinitionEClass = createEClass(OCCURRENCE_DEFINITION);
		createEReference(occurrenceDefinitionEClass, OCCURRENCE_DEFINITION__LIFE_CLASS);
		createEAttribute(occurrenceDefinitionEClass, OCCURRENCE_DEFINITION__IS_INDIVIDUAL);

		lifeClassEClass = createEClass(LIFE_CLASS);

		portUsageEClass = createEClass(PORT_USAGE);
		createEReference(portUsageEClass, PORT_USAGE__PORT_DEFINITION);

		portDefinitionEClass = createEClass(PORT_DEFINITION);
		createEReference(portDefinitionEClass, PORT_DEFINITION__CONJUGATED_PORT_DEFINITION);

		conjugatedPortDefinitionEClass = createEClass(CONJUGATED_PORT_DEFINITION);
		createEReference(conjugatedPortDefinitionEClass, CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR);
		createEReference(conjugatedPortDefinitionEClass, CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION);

		portConjugationEClass = createEClass(PORT_CONJUGATION);
		createEReference(portConjugationEClass, PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION);
		createEReference(portConjugationEClass, PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION);

		connectorAsUsageEClass = createEClass(CONNECTOR_AS_USAGE);

		flowConnectionUsageEClass = createEClass(FLOW_CONNECTION_USAGE);
		createEReference(flowConnectionUsageEClass, FLOW_CONNECTION_USAGE__FLOW_CONNECTION_DEFINITION);

		connectionUsageEClass = createEClass(CONNECTION_USAGE);
		createEReference(connectionUsageEClass, CONNECTION_USAGE__CONNECTION_DEFINITION);

		interfaceUsageEClass = createEClass(INTERFACE_USAGE);
		createEReference(interfaceUsageEClass, INTERFACE_USAGE__INTERFACE_DEFINITION);

		interfaceDefinitionEClass = createEClass(INTERFACE_DEFINITION);
		createEReference(interfaceDefinitionEClass, INTERFACE_DEFINITION__INTERFACE_END);

		connectionDefinitionEClass = createEClass(CONNECTION_DEFINITION);
		createEReference(connectionDefinitionEClass, CONNECTION_DEFINITION__CONNECTION_END);

		allocationUsageEClass = createEClass(ALLOCATION_USAGE);
		createEReference(allocationUsageEClass, ALLOCATION_USAGE__ALLOCATION_DEFINITION);

		allocationDefinitionEClass = createEClass(ALLOCATION_DEFINITION);
		createEReference(allocationDefinitionEClass, ALLOCATION_DEFINITION__ALLOCATION);

		stateUsageEClass = createEClass(STATE_USAGE);
		createEReference(stateUsageEClass, STATE_USAGE__STATE_DEFINITION);
		createEReference(stateUsageEClass, STATE_USAGE__ENTRY_ACTION);
		createEReference(stateUsageEClass, STATE_USAGE__DO_ACTION);
		createEReference(stateUsageEClass, STATE_USAGE__EXIT_ACTION);
		createEAttribute(stateUsageEClass, STATE_USAGE__IS_PARALLEL);
		createEOperation(stateUsageEClass, STATE_USAGE___IS_SUBSTATE_USAGE__BOOLEAN);

		calculationUsageEClass = createEClass(CALCULATION_USAGE);
		createEReference(calculationUsageEClass, CALCULATION_USAGE__CALCULATION_DEFINITION);

		constraintUsageEClass = createEClass(CONSTRAINT_USAGE);
		createEReference(constraintUsageEClass, CONSTRAINT_USAGE__CONSTRAINT_DEFINITION);

		requirementUsageEClass = createEClass(REQUIREMENT_USAGE);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__REQUIREMENT_DEFINITION);
		createEAttribute(requirementUsageEClass, REQUIREMENT_USAGE__REQ_ID);
		createEAttribute(requirementUsageEClass, REQUIREMENT_USAGE__TEXT);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__REQUIRED_CONSTRAINT);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__ASSUMED_CONSTRAINT);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__SUBJECT_PARAMETER);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__FRAMED_CONCERN);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__ACTOR_PARAMETER);
		createEReference(requirementUsageEClass, REQUIREMENT_USAGE__STAKEHOLDER_PARAMETER);

		requirementDefinitionEClass = createEClass(REQUIREMENT_DEFINITION);
		createEAttribute(requirementDefinitionEClass, REQUIREMENT_DEFINITION__REQ_ID);
		createEAttribute(requirementDefinitionEClass, REQUIREMENT_DEFINITION__TEXT);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__SUBJECT_PARAMETER);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__ACTOR_PARAMETER);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__STAKEHOLDER_PARAMETER);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__ASSUMED_CONSTRAINT);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__REQUIRED_CONSTRAINT);
		createEReference(requirementDefinitionEClass, REQUIREMENT_DEFINITION__FRAMED_CONCERN);

		constraintDefinitionEClass = createEClass(CONSTRAINT_DEFINITION);

		concernUsageEClass = createEClass(CONCERN_USAGE);
		createEReference(concernUsageEClass, CONCERN_USAGE__CONCERN_DEFINITION);

		concernDefinitionEClass = createEClass(CONCERN_DEFINITION);

		caseUsageEClass = createEClass(CASE_USAGE);
		createEReference(caseUsageEClass, CASE_USAGE__OBJECTIVE_REQUIREMENT);
		createEReference(caseUsageEClass, CASE_USAGE__CASE_DEFINITION);
		createEReference(caseUsageEClass, CASE_USAGE__SUBJECT_PARAMETER);
		createEReference(caseUsageEClass, CASE_USAGE__ACTOR_PARAMETER);

		caseDefinitionEClass = createEClass(CASE_DEFINITION);
		createEReference(caseDefinitionEClass, CASE_DEFINITION__OBJECTIVE_REQUIREMENT);
		createEReference(caseDefinitionEClass, CASE_DEFINITION__SUBJECT_PARAMETER);
		createEReference(caseDefinitionEClass, CASE_DEFINITION__ACTOR_PARAMETER);

		calculationDefinitionEClass = createEClass(CALCULATION_DEFINITION);
		createEReference(calculationDefinitionEClass, CALCULATION_DEFINITION__CALCULATION);

		actionDefinitionEClass = createEClass(ACTION_DEFINITION);
		createEReference(actionDefinitionEClass, ACTION_DEFINITION__ACTION);

		analysisCaseUsageEClass = createEClass(ANALYSIS_CASE_USAGE);
		createEReference(analysisCaseUsageEClass, ANALYSIS_CASE_USAGE__ANALYSIS_ACTION);
		createEReference(analysisCaseUsageEClass, ANALYSIS_CASE_USAGE__ANALYSIS_CASE_DEFINITION);
		createEReference(analysisCaseUsageEClass, ANALYSIS_CASE_USAGE__RESULT_EXPRESSION);

		analysisCaseDefinitionEClass = createEClass(ANALYSIS_CASE_DEFINITION);
		createEReference(analysisCaseDefinitionEClass, ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION);
		createEReference(analysisCaseDefinitionEClass, ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION);

		verificationCaseUsageEClass = createEClass(VERIFICATION_CASE_USAGE);
		createEReference(verificationCaseUsageEClass, VERIFICATION_CASE_USAGE__VERIFICATION_CASE_DEFINITION);
		createEReference(verificationCaseUsageEClass, VERIFICATION_CASE_USAGE__VERIFIED_REQUIREMENT);

		verificationCaseDefinitionEClass = createEClass(VERIFICATION_CASE_DEFINITION);
		createEReference(verificationCaseDefinitionEClass, VERIFICATION_CASE_DEFINITION__VERIFIED_REQUIREMENT);

		useCaseUsageEClass = createEClass(USE_CASE_USAGE);
		createEReference(useCaseUsageEClass, USE_CASE_USAGE__USE_CASE_DEFINITION);
		createEReference(useCaseUsageEClass, USE_CASE_USAGE__INCLUDED_USE_CASE);

		useCaseDefinitionEClass = createEClass(USE_CASE_DEFINITION);
		createEReference(useCaseDefinitionEClass, USE_CASE_DEFINITION__INCLUDED_USE_CASE);

		viewUsageEClass = createEClass(VIEW_USAGE);
		createEReference(viewUsageEClass, VIEW_USAGE__VIEW_DEFINITION);
		createEReference(viewUsageEClass, VIEW_USAGE__SATISFIED_VIEWPOINT);
		createEReference(viewUsageEClass, VIEW_USAGE__EXPOSED_ELEMENT);
		createEReference(viewUsageEClass, VIEW_USAGE__VIEW_RENDERING);
		createEReference(viewUsageEClass, VIEW_USAGE__VIEW_CONDITION);
		createEOperation(viewUsageEClass, VIEW_USAGE___INCLUDE_AS_EXPOSED__ELEMENT);

		viewDefinitionEClass = createEClass(VIEW_DEFINITION);
		createEReference(viewDefinitionEClass, VIEW_DEFINITION__VIEW);
		createEReference(viewDefinitionEClass, VIEW_DEFINITION__SATISFIED_VIEWPOINT);
		createEReference(viewDefinitionEClass, VIEW_DEFINITION__VIEW_RENDERING);
		createEReference(viewDefinitionEClass, VIEW_DEFINITION__VIEW_CONDITION);

		viewpointUsageEClass = createEClass(VIEWPOINT_USAGE);
		createEReference(viewpointUsageEClass, VIEWPOINT_USAGE__VIEWPOINT_DEFINITION);
		createEReference(viewpointUsageEClass, VIEWPOINT_USAGE__VIEWPOINT_STAKEHOLDER);

		viewpointDefinitionEClass = createEClass(VIEWPOINT_DEFINITION);
		createEReference(viewpointDefinitionEClass, VIEWPOINT_DEFINITION__VIEWPOINT_STAKEHOLDER);

		renderingUsageEClass = createEClass(RENDERING_USAGE);
		createEReference(renderingUsageEClass, RENDERING_USAGE__RENDERING_DEFINITION);

		renderingDefinitionEClass = createEClass(RENDERING_DEFINITION);
		createEReference(renderingDefinitionEClass, RENDERING_DEFINITION__RENDERING);

		metadataUsageEClass = createEClass(METADATA_USAGE);
		createEReference(metadataUsageEClass, METADATA_USAGE__METADATA_DEFINITION);

		acceptActionUsageEClass = createEClass(ACCEPT_ACTION_USAGE);
		createEReference(acceptActionUsageEClass, ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT);
		createEReference(acceptActionUsageEClass, ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER);
		createEReference(acceptActionUsageEClass, ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT);
		createEOperation(acceptActionUsageEClass, ACCEPT_ACTION_USAGE___IS_TRIGGER_ACTION);

		stateSubactionMembershipEClass = createEClass(STATE_SUBACTION_MEMBERSHIP);
		createEAttribute(stateSubactionMembershipEClass, STATE_SUBACTION_MEMBERSHIP__KIND);
		createEReference(stateSubactionMembershipEClass, STATE_SUBACTION_MEMBERSHIP__ACTION);

		exhibitStateUsageEClass = createEClass(EXHIBIT_STATE_USAGE);
		createEReference(exhibitStateUsageEClass, EXHIBIT_STATE_USAGE__EXHIBITED_STATE);

		performActionUsageEClass = createEClass(PERFORM_ACTION_USAGE);
		createEReference(performActionUsageEClass, PERFORM_ACTION_USAGE__PERFORMED_ACTION);

		eventOccurrenceUsageEClass = createEClass(EVENT_OCCURRENCE_USAGE);
		createEReference(eventOccurrenceUsageEClass, EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE);

		stateDefinitionEClass = createEClass(STATE_DEFINITION);
		createEReference(stateDefinitionEClass, STATE_DEFINITION__STATE);
		createEReference(stateDefinitionEClass, STATE_DEFINITION__ENTRY_ACTION);
		createEReference(stateDefinitionEClass, STATE_DEFINITION__DO_ACTION);
		createEReference(stateDefinitionEClass, STATE_DEFINITION__EXIT_ACTION);
		createEAttribute(stateDefinitionEClass, STATE_DEFINITION__IS_PARALLEL);

		transitionFeatureMembershipEClass = createEClass(TRANSITION_FEATURE_MEMBERSHIP);
		createEAttribute(transitionFeatureMembershipEClass, TRANSITION_FEATURE_MEMBERSHIP__KIND);
		createEReference(transitionFeatureMembershipEClass, TRANSITION_FEATURE_MEMBERSHIP__TRANSITION_FEATURE);

		objectiveMembershipEClass = createEClass(OBJECTIVE_MEMBERSHIP);
		createEReference(objectiveMembershipEClass, OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT);

		controlNodeEClass = createEClass(CONTROL_NODE);
		createEOperation(controlNodeEClass, CONTROL_NODE___MULTIPLICITY_HAS_BOUNDS__MULTIPLICITY_INT_INT);

		mergeNodeEClass = createEClass(MERGE_NODE);

		ifActionUsageEClass = createEClass(IF_ACTION_USAGE);
		createEReference(ifActionUsageEClass, IF_ACTION_USAGE__ELSE_ACTION);
		createEReference(ifActionUsageEClass, IF_ACTION_USAGE__THEN_ACTION);
		createEReference(ifActionUsageEClass, IF_ACTION_USAGE__IF_ARGUMENT);

		decisionNodeEClass = createEClass(DECISION_NODE);

		forLoopActionUsageEClass = createEClass(FOR_LOOP_ACTION_USAGE);
		createEReference(forLoopActionUsageEClass, FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT);
		createEReference(forLoopActionUsageEClass, FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE);

		loopActionUsageEClass = createEClass(LOOP_ACTION_USAGE);
		createEReference(loopActionUsageEClass, LOOP_ACTION_USAGE__BODY_ACTION);

		forkNodeEClass = createEClass(FORK_NODE);

		assignmentActionUsageEClass = createEClass(ASSIGNMENT_ACTION_USAGE);
		createEReference(assignmentActionUsageEClass, ASSIGNMENT_ACTION_USAGE__TARGET_ARGUMENT);
		createEReference(assignmentActionUsageEClass, ASSIGNMENT_ACTION_USAGE__VALUE_EXPRESSION);
		createEReference(assignmentActionUsageEClass, ASSIGNMENT_ACTION_USAGE__REFERENT);

		sendActionUsageEClass = createEClass(SEND_ACTION_USAGE);
		createEReference(sendActionUsageEClass, SEND_ACTION_USAGE__RECEIVER_ARGUMENT);
		createEReference(sendActionUsageEClass, SEND_ACTION_USAGE__PAYLOAD_ARGUMENT);
		createEReference(sendActionUsageEClass, SEND_ACTION_USAGE__SENDER_ARGUMENT);

		triggerInvocationExpressionEClass = createEClass(TRIGGER_INVOCATION_EXPRESSION);
		createEAttribute(triggerInvocationExpressionEClass, TRIGGER_INVOCATION_EXPRESSION__KIND);

		whileLoopActionUsageEClass = createEClass(WHILE_LOOP_ACTION_USAGE);
		createEReference(whileLoopActionUsageEClass, WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT);
		createEReference(whileLoopActionUsageEClass, WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT);

		joinNodeEClass = createEClass(JOIN_NODE);

		includeUseCaseUsageEClass = createEClass(INCLUDE_USE_CASE_USAGE);
		createEReference(includeUseCaseUsageEClass, INCLUDE_USE_CASE_USAGE__USE_CASE_INCLUDED);

		satisfyRequirementUsageEClass = createEClass(SATISFY_REQUIREMENT_USAGE);
		createEReference(satisfyRequirementUsageEClass, SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT);
		createEReference(satisfyRequirementUsageEClass, SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE);

		assertConstraintUsageEClass = createEClass(ASSERT_CONSTRAINT_USAGE);
		createEReference(assertConstraintUsageEClass, ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT);

		actorMembershipEClass = createEClass(ACTOR_MEMBERSHIP);
		createEReference(actorMembershipEClass, ACTOR_MEMBERSHIP__OWNED_ACTOR_PARAMETER);

		requirementConstraintMembershipEClass = createEClass(REQUIREMENT_CONSTRAINT_MEMBERSHIP);
		createEAttribute(requirementConstraintMembershipEClass, REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND);
		createEReference(requirementConstraintMembershipEClass, REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_CONSTRAINT);
		createEReference(requirementConstraintMembershipEClass, REQUIREMENT_CONSTRAINT_MEMBERSHIP__REFERENCED_CONSTRAINT);

		subjectMembershipEClass = createEClass(SUBJECT_MEMBERSHIP);
		createEReference(subjectMembershipEClass, SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER);

		framedConcernMembershipEClass = createEClass(FRAMED_CONCERN_MEMBERSHIP);
		createEReference(framedConcernMembershipEClass, FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN);
		createEReference(framedConcernMembershipEClass, FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN);

		stakeholderMembershipEClass = createEClass(STAKEHOLDER_MEMBERSHIP);
		createEReference(stakeholderMembershipEClass, STAKEHOLDER_MEMBERSHIP__OWNED_STAKEHOLDER_PARAMETER);

		successionFlowConnectionUsageEClass = createEClass(SUCCESSION_FLOW_CONNECTION_USAGE);

		successionAsUsageEClass = createEClass(SUCCESSION_AS_USAGE);

		flowConnectionDefinitionEClass = createEClass(FLOW_CONNECTION_DEFINITION);

		bindingConnectorAsUsageEClass = createEClass(BINDING_CONNECTOR_AS_USAGE);

		conjugatedPortTypingEClass = createEClass(CONJUGATED_PORT_TYPING);
		createEReference(conjugatedPortTypingEClass, CONJUGATED_PORT_TYPING__PORT_DEFINITION);
		createEReference(conjugatedPortTypingEClass, CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION);

		requirementVerificationMembershipEClass = createEClass(REQUIREMENT_VERIFICATION_MEMBERSHIP);
		createEReference(requirementVerificationMembershipEClass, REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT);
		createEReference(requirementVerificationMembershipEClass, REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT);

		exposeEClass = createEClass(EXPOSE);

		membershipExposeEClass = createEClass(MEMBERSHIP_EXPOSE);

		viewRenderingMembershipEClass = createEClass(VIEW_RENDERING_MEMBERSHIP);
		createEReference(viewRenderingMembershipEClass, VIEW_RENDERING_MEMBERSHIP__OWNED_RENDERING);
		createEReference(viewRenderingMembershipEClass, VIEW_RENDERING_MEMBERSHIP__REFERENCED_RENDERING);

		namespaceExposeEClass = createEClass(NAMESPACE_EXPOSE);

		metadataDefinitionEClass = createEClass(METADATA_DEFINITION);

		// Create enums
		featureDirectionKindEEnum = createEEnum(FEATURE_DIRECTION_KIND);
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		portionKindEEnum = createEEnum(PORTION_KIND);
		stateSubactionKindEEnum = createEEnum(STATE_SUBACTION_KIND);
		transitionFeatureKindEEnum = createEEnum(TRANSITION_FEATURE_KIND);
		triggerKindEEnum = createEEnum(TRIGGER_KIND);
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
		unioningEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		owningMembershipEClass.getESuperTypes().add(this.getMembership());
		membershipEClass.getESuperTypes().add(this.getRelationship());
		namespaceEClass.getESuperTypes().add(this.getElement());
		importEClass.getESuperTypes().add(this.getRelationship());
		documentationEClass.getESuperTypes().add(this.getComment());
		commentEClass.getESuperTypes().add(this.getAnnotatingElement());
		annotatingElementEClass.getESuperTypes().add(this.getElement());
		annotationEClass.getESuperTypes().add(this.getRelationship());
		textualRepresentationEClass.getESuperTypes().add(this.getAnnotatingElement());
		typeEClass.getESuperTypes().add(this.getNamespace());
		specializationEClass.getESuperTypes().add(this.getRelationship());
		featureMembershipEClass.getESuperTypes().add(this.getOwningMembership());
		featureMembershipEClass.getESuperTypes().add(this.getFeaturing());
		featuringEClass.getESuperTypes().add(this.getRelationship());
		featureEClass.getESuperTypes().add(this.getType());
		redefinitionEClass.getESuperTypes().add(this.getSubsetting());
		subsettingEClass.getESuperTypes().add(this.getSpecialization());
		featureTypingEClass.getESuperTypes().add(this.getSpecialization());
		typeFeaturingEClass.getESuperTypes().add(this.getFeaturing());
		featureInvertingEClass.getESuperTypes().add(this.getRelationship());
		featureChainingEClass.getESuperTypes().add(this.getRelationship());
		referenceSubsettingEClass.getESuperTypes().add(this.getSubsetting());
		conjugationEClass.getESuperTypes().add(this.getRelationship());
		multiplicityEClass.getESuperTypes().add(this.getFeature());
		intersectingEClass.getESuperTypes().add(this.getRelationship());
		disjoiningEClass.getESuperTypes().add(this.getRelationship());
		differencingEClass.getESuperTypes().add(this.getRelationship());
		subclassificationEClass.getESuperTypes().add(this.getSpecialization());
		classifierEClass.getESuperTypes().add(this.getType());
		endFeatureMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		successionEClass.getESuperTypes().add(this.getConnector());
		connectorEClass.getESuperTypes().add(this.getFeature());
		connectorEClass.getESuperTypes().add(this.getRelationship());
		associationEClass.getESuperTypes().add(this.getClassifier());
		associationEClass.getESuperTypes().add(this.getRelationship());
		stepEClass.getESuperTypes().add(this.getFeature());
		behaviorEClass.getESuperTypes().add(this.getClass_());
		classEClass.getESuperTypes().add(this.getClassifier());
		expressionEClass.getESuperTypes().add(this.getStep());
		functionEClass.getESuperTypes().add(this.getBehavior());
		bindingConnectorEClass.getESuperTypes().add(this.getConnector());
		featureValueEClass.getESuperTypes().add(this.getOwningMembership());
		elementFilterMembershipEClass.getESuperTypes().add(this.getOwningMembership());
		packageEClass.getESuperTypes().add(this.getNamespace());
		libraryPackageEClass.getESuperTypes().add(this.getPackage());
		multiplicityRangeEClass.getESuperTypes().add(this.getMultiplicity());
		parameterMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		returnParameterMembershipEClass.getESuperTypes().add(this.getParameterMembership());
		invariantEClass.getESuperTypes().add(this.getBooleanExpression());
		booleanExpressionEClass.getESuperTypes().add(this.getExpression());
		predicateEClass.getESuperTypes().add(this.getFunction());
		resultExpressionMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		metaclassEClass.getESuperTypes().add(this.getStructure());
		structureEClass.getESuperTypes().add(this.getClass_());
		metadataFeatureEClass.getESuperTypes().add(this.getFeature());
		metadataFeatureEClass.getESuperTypes().add(this.getAnnotatingElement());
		itemFlowEClass.getESuperTypes().add(this.getConnector());
		itemFlowEClass.getESuperTypes().add(this.getStep());
		itemFlowEndEClass.getESuperTypes().add(this.getFeature());
		itemFeatureEClass.getESuperTypes().add(this.getFeature());
		interactionEClass.getESuperTypes().add(this.getAssociation());
		interactionEClass.getESuperTypes().add(this.getBehavior());
		successionItemFlowEClass.getESuperTypes().add(this.getItemFlow());
		successionItemFlowEClass.getESuperTypes().add(this.getSuccession());
		associationStructureEClass.getESuperTypes().add(this.getAssociation());
		associationStructureEClass.getESuperTypes().add(this.getStructure());
		nullExpressionEClass.getESuperTypes().add(this.getExpression());
		literalRationalEClass.getESuperTypes().add(this.getLiteralExpression());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		selectExpressionEClass.getESuperTypes().add(this.getOperatorExpression());
		operatorExpressionEClass.getESuperTypes().add(this.getInvocationExpression());
		invocationExpressionEClass.getESuperTypes().add(this.getExpression());
		literalStringEClass.getESuperTypes().add(this.getLiteralExpression());
		collectExpressionEClass.getESuperTypes().add(this.getOperatorExpression());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralExpression());
		featureReferenceExpressionEClass.getESuperTypes().add(this.getExpression());
		metadataAccessExpressionEClass.getESuperTypes().add(this.getExpression());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralExpression());
		literalInfinityEClass.getESuperTypes().add(this.getLiteralExpression());
		featureChainExpressionEClass.getESuperTypes().add(this.getOperatorExpression());
		dependencyEClass.getESuperTypes().add(this.getRelationship());
		membershipImportEClass.getESuperTypes().add(this.getImport());
		namespaceImportEClass.getESuperTypes().add(this.getImport());
		transitionUsageEClass.getESuperTypes().add(this.getActionUsage());
		actionUsageEClass.getESuperTypes().add(this.getOccurrenceUsage());
		actionUsageEClass.getESuperTypes().add(this.getStep());
		occurrenceUsageEClass.getESuperTypes().add(this.getUsage());
		usageEClass.getESuperTypes().add(this.getFeature());
		variantMembershipEClass.getESuperTypes().add(this.getOwningMembership());
		definitionEClass.getESuperTypes().add(this.getClassifier());
		referenceUsageEClass.getESuperTypes().add(this.getUsage());
		attributeUsageEClass.getESuperTypes().add(this.getUsage());
		enumerationUsageEClass.getESuperTypes().add(this.getAttributeUsage());
		enumerationDefinitionEClass.getESuperTypes().add(this.getAttributeDefinition());
		attributeDefinitionEClass.getESuperTypes().add(this.getDefinition());
		attributeDefinitionEClass.getESuperTypes().add(this.getDataType());
		itemUsageEClass.getESuperTypes().add(this.getOccurrenceUsage());
		partUsageEClass.getESuperTypes().add(this.getItemUsage());
		partDefinitionEClass.getESuperTypes().add(this.getItemDefinition());
		itemDefinitionEClass.getESuperTypes().add(this.getOccurrenceDefinition());
		itemDefinitionEClass.getESuperTypes().add(this.getStructure());
		occurrenceDefinitionEClass.getESuperTypes().add(this.getDefinition());
		occurrenceDefinitionEClass.getESuperTypes().add(this.getClass_());
		lifeClassEClass.getESuperTypes().add(this.getClass_());
		portUsageEClass.getESuperTypes().add(this.getOccurrenceUsage());
		portDefinitionEClass.getESuperTypes().add(this.getOccurrenceDefinition());
		portDefinitionEClass.getESuperTypes().add(this.getStructure());
		conjugatedPortDefinitionEClass.getESuperTypes().add(this.getPortDefinition());
		portConjugationEClass.getESuperTypes().add(this.getConjugation());
		connectorAsUsageEClass.getESuperTypes().add(this.getUsage());
		connectorAsUsageEClass.getESuperTypes().add(this.getConnector());
		flowConnectionUsageEClass.getESuperTypes().add(this.getConnectionUsage());
		flowConnectionUsageEClass.getESuperTypes().add(this.getActionUsage());
		flowConnectionUsageEClass.getESuperTypes().add(this.getItemFlow());
		connectionUsageEClass.getESuperTypes().add(this.getConnectorAsUsage());
		connectionUsageEClass.getESuperTypes().add(this.getPartUsage());
		interfaceUsageEClass.getESuperTypes().add(this.getConnectionUsage());
		interfaceDefinitionEClass.getESuperTypes().add(this.getConnectionDefinition());
		connectionDefinitionEClass.getESuperTypes().add(this.getPartDefinition());
		connectionDefinitionEClass.getESuperTypes().add(this.getAssociationStructure());
		allocationUsageEClass.getESuperTypes().add(this.getConnectionUsage());
		allocationDefinitionEClass.getESuperTypes().add(this.getConnectionDefinition());
		stateUsageEClass.getESuperTypes().add(this.getActionUsage());
		calculationUsageEClass.getESuperTypes().add(this.getActionUsage());
		calculationUsageEClass.getESuperTypes().add(this.getExpression());
		constraintUsageEClass.getESuperTypes().add(this.getOccurrenceUsage());
		constraintUsageEClass.getESuperTypes().add(this.getBooleanExpression());
		requirementUsageEClass.getESuperTypes().add(this.getConstraintUsage());
		requirementDefinitionEClass.getESuperTypes().add(this.getConstraintDefinition());
		constraintDefinitionEClass.getESuperTypes().add(this.getOccurrenceDefinition());
		constraintDefinitionEClass.getESuperTypes().add(this.getPredicate());
		concernUsageEClass.getESuperTypes().add(this.getRequirementUsage());
		concernDefinitionEClass.getESuperTypes().add(this.getRequirementDefinition());
		caseUsageEClass.getESuperTypes().add(this.getCalculationUsage());
		caseDefinitionEClass.getESuperTypes().add(this.getCalculationDefinition());
		calculationDefinitionEClass.getESuperTypes().add(this.getActionDefinition());
		calculationDefinitionEClass.getESuperTypes().add(this.getFunction());
		actionDefinitionEClass.getESuperTypes().add(this.getOccurrenceDefinition());
		actionDefinitionEClass.getESuperTypes().add(this.getBehavior());
		analysisCaseUsageEClass.getESuperTypes().add(this.getCaseUsage());
		analysisCaseDefinitionEClass.getESuperTypes().add(this.getCaseDefinition());
		verificationCaseUsageEClass.getESuperTypes().add(this.getCaseUsage());
		verificationCaseDefinitionEClass.getESuperTypes().add(this.getCaseDefinition());
		useCaseUsageEClass.getESuperTypes().add(this.getCaseUsage());
		useCaseDefinitionEClass.getESuperTypes().add(this.getCaseDefinition());
		viewUsageEClass.getESuperTypes().add(this.getPartUsage());
		viewDefinitionEClass.getESuperTypes().add(this.getPartDefinition());
		viewpointUsageEClass.getESuperTypes().add(this.getRequirementUsage());
		viewpointDefinitionEClass.getESuperTypes().add(this.getRequirementDefinition());
		renderingUsageEClass.getESuperTypes().add(this.getPartUsage());
		renderingDefinitionEClass.getESuperTypes().add(this.getPartDefinition());
		metadataUsageEClass.getESuperTypes().add(this.getItemUsage());
		metadataUsageEClass.getESuperTypes().add(this.getMetadataFeature());
		acceptActionUsageEClass.getESuperTypes().add(this.getActionUsage());
		stateSubactionMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		exhibitStateUsageEClass.getESuperTypes().add(this.getStateUsage());
		exhibitStateUsageEClass.getESuperTypes().add(this.getPerformActionUsage());
		performActionUsageEClass.getESuperTypes().add(this.getActionUsage());
		performActionUsageEClass.getESuperTypes().add(this.getEventOccurrenceUsage());
		eventOccurrenceUsageEClass.getESuperTypes().add(this.getOccurrenceUsage());
		stateDefinitionEClass.getESuperTypes().add(this.getActionDefinition());
		transitionFeatureMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		objectiveMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		controlNodeEClass.getESuperTypes().add(this.getActionUsage());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		ifActionUsageEClass.getESuperTypes().add(this.getActionUsage());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		forLoopActionUsageEClass.getESuperTypes().add(this.getLoopActionUsage());
		loopActionUsageEClass.getESuperTypes().add(this.getActionUsage());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		assignmentActionUsageEClass.getESuperTypes().add(this.getActionUsage());
		sendActionUsageEClass.getESuperTypes().add(this.getActionUsage());
		triggerInvocationExpressionEClass.getESuperTypes().add(this.getInvocationExpression());
		whileLoopActionUsageEClass.getESuperTypes().add(this.getLoopActionUsage());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		includeUseCaseUsageEClass.getESuperTypes().add(this.getUseCaseUsage());
		includeUseCaseUsageEClass.getESuperTypes().add(this.getPerformActionUsage());
		satisfyRequirementUsageEClass.getESuperTypes().add(this.getRequirementUsage());
		satisfyRequirementUsageEClass.getESuperTypes().add(this.getAssertConstraintUsage());
		assertConstraintUsageEClass.getESuperTypes().add(this.getConstraintUsage());
		assertConstraintUsageEClass.getESuperTypes().add(this.getInvariant());
		actorMembershipEClass.getESuperTypes().add(this.getParameterMembership());
		requirementConstraintMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		subjectMembershipEClass.getESuperTypes().add(this.getParameterMembership());
		framedConcernMembershipEClass.getESuperTypes().add(this.getRequirementConstraintMembership());
		stakeholderMembershipEClass.getESuperTypes().add(this.getParameterMembership());
		successionFlowConnectionUsageEClass.getESuperTypes().add(this.getFlowConnectionUsage());
		successionFlowConnectionUsageEClass.getESuperTypes().add(this.getSuccessionItemFlow());
		successionAsUsageEClass.getESuperTypes().add(this.getConnectorAsUsage());
		successionAsUsageEClass.getESuperTypes().add(this.getSuccession());
		flowConnectionDefinitionEClass.getESuperTypes().add(this.getConnectionDefinition());
		flowConnectionDefinitionEClass.getESuperTypes().add(this.getActionDefinition());
		flowConnectionDefinitionEClass.getESuperTypes().add(this.getInteraction());
		bindingConnectorAsUsageEClass.getESuperTypes().add(this.getConnectorAsUsage());
		bindingConnectorAsUsageEClass.getESuperTypes().add(this.getBindingConnector());
		conjugatedPortTypingEClass.getESuperTypes().add(this.getFeatureTyping());
		requirementVerificationMembershipEClass.getESuperTypes().add(this.getRequirementConstraintMembership());
		exposeEClass.getESuperTypes().add(this.getImport());
		membershipExposeEClass.getESuperTypes().add(this.getMembershipImport());
		membershipExposeEClass.getESuperTypes().add(this.getExpose());
		viewRenderingMembershipEClass.getESuperTypes().add(this.getFeatureMembership());
		namespaceExposeEClass.getESuperTypes().add(this.getNamespaceImport());
		namespaceExposeEClass.getESuperTypes().add(this.getExpose());
		metadataDefinitionEClass.getESuperTypes().add(this.getItemDefinition());
		metadataDefinitionEClass.getESuperTypes().add(this.getMetaclass());

		// Initialize classes, features, and operations; add parameters
		initEClass(unioningEClass, Unioning.class, "Unioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnioning_TypeUnioned(), this.getType(), this.getType_OwnedUnioning(), "typeUnioned", null, 1, 1, Unioning.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUnioning_UnioningType(), this.getType(), null, "unioningType", null, 1, 1, Unioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_OwnedRelatedElement(), this.getElement(), this.getElement_OwningRelationship(), "ownedRelatedElement", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_OwningRelatedElement(), this.getElement(), this.getElement_OwnedRelationship(), "owningRelatedElement", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 0, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getElement(), null, "target", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Source(), this.getElement(), null, "source", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_IsImplied(), theTypesPackage.getBoolean(), "isImplied", "false", 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwningMembership(), this.getOwningMembership(), this.getOwningMembership_OwnedMemberElement(), "owningMembership", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwningNamespace(), this.getNamespace(), this.getNamespace_OwnedMember(), "owningNamespace", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwningRelationship(), this.getRelationship(), this.getRelationship_OwnedRelatedElement(), "owningRelationship", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_ElementId(), theTypesPackage.getString(), "elementId", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedRelationship(), this.getRelationship(), this.getRelationship_OwningRelatedElement(), "ownedRelationship", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Documentation(), this.getDocumentation(), this.getDocumentation_DocumentedElement(), "documentation", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_OwnedAnnotation(), this.getAnnotation(), this.getAnnotation_OwningAnnotatedElement(), "ownedAnnotation", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getElement_TextualRepresentation(), this.getTextualRepresentation(), this.getTextualRepresentation_RepresentedElement(), "textualRepresentation", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_AliasIds(), theTypesPackage.getString(), "aliasIds", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_DeclaredShortName(), theTypesPackage.getString(), "declaredShortName", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_DeclaredName(), theTypesPackage.getString(), "declaredName", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_ShortName(), theTypesPackage.getString(), "shortName", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Name(), theTypesPackage.getString(), "name", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_QualifiedName(), theTypesPackage.getString(), "qualifiedName", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_IsImpliedIncluded(), theTypesPackage.getBoolean(), "isImpliedIncluded", "false", 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_IsLibraryElement(), theTypesPackage.getBoolean(), "isLibraryElement", null, 1, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getElement__EscapedName(), theTypesPackage.getString(), "escapedName", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__EffectiveShortName(), theTypesPackage.getString(), "effectiveShortName", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__EffectiveName(), theTypesPackage.getString(), "effectiveName", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__LibraryNamespace(), this.getNamespace(), "libraryNamespace", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(owningMembershipEClass, OwningMembership.class, "OwningMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwningMembership_OwnedMemberElementId(), theTypesPackage.getString(), "ownedMemberElementId", null, 1, 1, OwningMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOwningMembership_OwnedMemberShortName(), theTypesPackage.getString(), "ownedMemberShortName", null, 0, 1, OwningMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOwningMembership_OwnedMemberName(), theTypesPackage.getString(), "ownedMemberName", null, 0, 1, OwningMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOwningMembership_OwnedMemberElement(), this.getElement(), this.getElement_OwningMembership(), "ownedMemberElement", null, 1, 1, OwningMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(membershipEClass, Membership.class, "Membership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMembership_MemberElementId(), theTypesPackage.getString(), "memberElementId", null, 1, 1, Membership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_MembershipOwningNamespace(), this.getNamespace(), this.getNamespace_OwnedMembership(), "membershipOwningNamespace", null, 1, 1, Membership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMembership_MemberShortName(), theTypesPackage.getString(), "memberShortName", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMembership_MemberElement(), this.getElement(), null, "memberElement", null, 1, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMembership_MemberName(), theTypesPackage.getString(), "memberName", null, 0, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMembership_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, Membership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getMembership__IsDistinguishableFrom__Membership(), theTypesPackage.getBoolean(), "isDistinguishableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMembership(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_Membership(), this.getMembership(), null, "membership", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_OwnedImport(), this.getImport(), this.getImport_ImportOwningNamespace(), "ownedImport", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_Member(), this.getElement(), null, "member", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_OwnedMember(), this.getElement(), this.getElement_OwningNamespace(), "ownedMember", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_ImportedMembership(), this.getMembership(), null, "importedMembership", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_OwnedMembership(), this.getMembership(), this.getMembership_MembershipOwningNamespace(), "ownedMembership", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNamespace__NamesOf__Element(), theTypesPackage.getString(), "namesOf", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__VisibilityOf__Membership(), this.getVisibilityKind(), "visibilityOf", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMembership(), "mem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__VisibleMemberships__EList_boolean_boolean(), this.getMembership(), "visibleMemberships", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNamespace(), "excluded", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isRecursive", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "includeAll", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__ImportedMemberships__EList(), this.getMembership(), "importedMemberships", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNamespace(), "excluded", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__Resolve__String(), this.getMembership(), "resolve", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__ResolveGlobal__String(), this.getMembership(), "resolveGlobal", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__ResolveLocal__String(), this.getMembership(), "resolveLocal", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__ResolveVisible__String(), this.getMembership(), "resolveVisible", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__QualificationOf__String(), theTypesPackage.getString(), "qualificationOf", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__UnqualifiedNameOf__String(), theTypesPackage.getString(), "unqualifiedNameOf", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImport_IsRecursive(), theTypesPackage.getBoolean(), "isRecursive", "false", 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImport_IsImportAll(), theTypesPackage.getBoolean(), "isImportAll", "false", 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getImport_ImportedElement(), this.getElement(), null, "importedElement", null, 1, 1, Import.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getImport_ImportOwningNamespace(), this.getNamespace(), this.getNamespace_OwnedImport(), "importOwningNamespace", null, 1, 1, Import.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getImport__ImportedMemberships__EList(), this.getMembership(), "importedMemberships", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNamespace(), "excluded", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentation_DocumentedElement(), this.getElement(), this.getElement_Documentation(), "documentedElement", null, 1, 1, Documentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Locale(), theTypesPackage.getString(), "locale", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComment_Body(), theTypesPackage.getString(), "body", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(annotatingElementEClass, AnnotatingElement.class, "AnnotatingElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatingElement_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 1, -1, AnnotatingElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotatingElement_OwnedAnnotatingRelationship(), this.getAnnotation(), this.getAnnotation_OwningAnnotatingElement(), "ownedAnnotatingRelationship", null, 0, -1, AnnotatingElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotatingElement_Annotation(), this.getAnnotation(), this.getAnnotation_AnnotatingElement(), "annotation", null, 0, -1, AnnotatingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_AnnotatingElement(), this.getAnnotatingElement(), this.getAnnotatingElement_Annotation(), "annotatingElement", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotation_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotation_OwningAnnotatedElement(), this.getElement(), this.getElement_OwnedAnnotation(), "owningAnnotatedElement", null, 0, 1, Annotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAnnotation_OwningAnnotatingElement(), this.getAnnotatingElement(), this.getAnnotatingElement_OwnedAnnotatingRelationship(), "owningAnnotatingElement", null, 0, 1, Annotation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(textualRepresentationEClass, TextualRepresentation.class, "TextualRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextualRepresentation_Language(), theTypesPackage.getString(), "language", null, 1, 1, TextualRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTextualRepresentation_Body(), theTypesPackage.getString(), "body", null, 1, 1, TextualRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTextualRepresentation_RepresentedElement(), this.getElement(), this.getElement_TextualRepresentation(), "representedElement", null, 1, 1, TextualRepresentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_OwnedSpecialization(), this.getSpecialization(), this.getSpecialization_OwningType(), "ownedSpecialization", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedFeatureMembership(), this.getFeatureMembership(), this.getFeatureMembership_OwningType(), "ownedFeatureMembership", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedFeature(), this.getFeature(), this.getFeature_OwningType(), "ownedFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedEndFeature(), this.getFeature(), this.getFeature_EndOwningType(), "ownedEndFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_Feature(), this.getFeature(), null, "feature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_Input(), this.getFeature(), null, "input", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_Output(), this.getFeature(), null, "output", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_IsAbstract(), theTypesPackage.getBoolean(), "isAbstract", "false", 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_InheritedMembership(), this.getMembership(), null, "inheritedMembership", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_EndFeature(), this.getFeature(), null, "endFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_IsSufficient(), theTypesPackage.getBoolean(), "isSufficient", "false", 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getType_OwnedConjugator(), this.getConjugation(), this.getConjugation_OwningType(), "ownedConjugator", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getType_IsConjugated(), theTypesPackage.getBoolean(), "isConjugated", null, 1, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_InheritedFeature(), this.getFeature(), null, "inheritedFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_UnioningType(), this.getType(), null, "unioningType", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedIntersecting(), this.getIntersecting(), this.getIntersecting_TypeIntersected(), "ownedIntersecting", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_IntersectingType(), this.getType(), null, "intersectingType", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedDisjoining(), this.getDisjoining(), this.getDisjoining_OwningType(), "ownedDisjoining", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getType_FeatureMembership(), this.getFeatureMembership(), null, "featureMembership", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_DifferencingType(), this.getType(), null, "differencingType", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedDifferencing(), this.getDifferencing(), this.getDifferencing_TypeDifferenced(), "ownedDifferencing", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_DirectedFeature(), this.getFeature(), null, "directedFeature", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getType_OwnedUnioning(), this.getUnioning(), this.getUnioning_TypeUnioned(), "ownedUnioning", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getType__InheritedMemberships__EList(), this.getMembership(), "inheritedMemberships", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "excluded", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getType__DirectionOf__Feature(), this.getFeatureDirectionKind(), "directionOf", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getType__DirectionOfExcluding__Feature_EList(), this.getFeatureDirectionKind(), "directionOfExcluding", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "feature", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "excluded", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getType__AllSupertypes(), this.getType(), "allSupertypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getType__Specializes__Type(), theTypesPackage.getBoolean(), "specializes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "supertype", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getType__SpecializesFromLibrary__String(), theTypesPackage.getBoolean(), "specializesFromLibrary", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "libraryTypeName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(specializationEClass, Specialization.class, "Specialization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialization_General(), this.getType(), null, "general", null, 1, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecialization_Specific(), this.getType(), null, "specific", null, 1, 1, Specialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecialization_OwningType(), this.getType(), this.getType_OwnedSpecialization(), "owningType", null, 0, 1, Specialization.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureMembershipEClass, FeatureMembership.class, "FeatureMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureMembership_OwnedMemberFeature(), this.getFeature(), this.getFeature_OwningFeatureMembership(), "ownedMemberFeature", null, 1, 1, FeatureMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureMembership_OwningType(), this.getType(), this.getType_OwnedFeatureMembership(), "owningType", null, 1, 1, FeatureMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featuringEClass, Featuring.class, "Featuring", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturing_Type(), this.getType(), null, "type", null, 1, 1, Featuring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeaturing_Feature(), this.getFeature(), null, "feature", null, 1, 1, Featuring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_OwningType(), this.getType(), this.getType_OwnedFeature(), "owningType", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsUnique(), theTypesPackage.getBoolean(), "isUnique", "true", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsOrdered(), theTypesPackage.getBoolean(), "isOrdered", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_Type(), this.getType(), null, "type", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_OwnedRedefinition(), this.getRedefinition(), null, "ownedRedefinition", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedSubsetting(), this.getSubsetting(), this.getSubsetting_OwningFeature(), "ownedSubsetting", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwningFeatureMembership(), this.getFeatureMembership(), this.getFeatureMembership_OwnedMemberFeature(), "owningFeatureMembership", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsComposite(), theTypesPackage.getBoolean(), "isComposite", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsEnd(), theTypesPackage.getBoolean(), "isEnd", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_EndOwningType(), this.getType(), this.getType_OwnedEndFeature(), "endOwningType", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedTyping(), this.getFeatureTyping(), this.getFeatureTyping_OwningFeature(), "ownedTyping", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_FeaturingType(), this.getType(), null, "featuringType", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_OwnedTypeFeaturing(), this.getTypeFeaturing(), this.getTypeFeaturing_OwningFeatureOfType(), "ownedTypeFeaturing", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_IsDerived(), theTypesPackage.getBoolean(), "isDerived", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_ChainingFeature(), this.getFeature(), null, "chainingFeature", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_OwnedFeatureInverting(), this.getFeatureInverting(), this.getFeatureInverting_OwningFeature(), "ownedFeatureInverting", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedFeatureChaining(), this.getFeatureChaining(), this.getFeatureChaining_FeatureChained(), "ownedFeatureChaining", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_IsReadOnly(), theTypesPackage.getBoolean(), "isReadOnly", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsPortion(), theTypesPackage.getBoolean(), "isPortion", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_Direction(), this.getFeatureDirectionKind(), "direction", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeature_OwnedReferenceSubsetting(), this.getReferenceSubsetting(), this.getReferenceSubsetting_ReferencingFeature(), "ownedReferenceSubsetting", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsNonunique(), theTypesPackage.getBoolean(), "isNonunique", "false", 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getFeature__DirectionFor__Type(), this.getFeatureDirectionKind(), "directionFor", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFeature__IsFeaturedWithin__Type(), theTypesPackage.getBoolean(), "isFeaturedWithin", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getFeature__NamingFeature(), this.getFeature(), "namingFeature", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFeature__Redefines__Feature(), theTypesPackage.getBoolean(), "redefines", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "redefinedFeature", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFeature__RedefinesFromLibrary__String(), theTypesPackage.getBoolean(), "redefinesFromLibrary", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "libraryFeatureName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFeature__SubsetsChain__Feature_Feature(), theTypesPackage.getBoolean(), "subsetsChain", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "first", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "second", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getFeature__TypingFeatures(), this.getFeature(), "typingFeatures", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(redefinitionEClass, Redefinition.class, "Redefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedefinition_RedefiningFeature(), this.getFeature(), null, "redefiningFeature", null, 1, 1, Redefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinition_RedefinedFeature(), this.getFeature(), null, "redefinedFeature", null, 1, 1, Redefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subsettingEClass, Subsetting.class, "Subsetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubsetting_SubsettedFeature(), this.getFeature(), null, "subsettedFeature", null, 1, 1, Subsetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubsetting_SubsettingFeature(), this.getFeature(), null, "subsettingFeature", null, 1, 1, Subsetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubsetting_OwningFeature(), this.getFeature(), this.getFeature_OwnedSubsetting(), "owningFeature", null, 0, 1, Subsetting.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureTypingEClass, FeatureTyping.class, "FeatureTyping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureTyping_TypedFeature(), this.getFeature(), null, "typedFeature", null, 1, 1, FeatureTyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureTyping_Type(), this.getType(), null, "type", null, 1, 1, FeatureTyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureTyping_OwningFeature(), this.getFeature(), this.getFeature_OwnedTyping(), "owningFeature", null, 0, 1, FeatureTyping.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(typeFeaturingEClass, TypeFeaturing.class, "TypeFeaturing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeFeaturing_FeatureOfType(), this.getFeature(), null, "featureOfType", null, 1, 1, TypeFeaturing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeFeaturing_FeaturingType(), this.getType(), null, "featuringType", null, 1, 1, TypeFeaturing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypeFeaturing_OwningFeatureOfType(), this.getFeature(), this.getFeature_OwnedTypeFeaturing(), "owningFeatureOfType", null, 0, 1, TypeFeaturing.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureInvertingEClass, FeatureInverting.class, "FeatureInverting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureInverting_FeatureInverted(), this.getFeature(), null, "featureInverted", null, 1, 1, FeatureInverting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureInverting_InvertingFeature(), this.getFeature(), null, "invertingFeature", null, 1, 1, FeatureInverting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureInverting_OwningFeature(), this.getFeature(), this.getFeature_OwnedFeatureInverting(), "owningFeature", null, 0, 1, FeatureInverting.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(featureChainingEClass, FeatureChaining.class, "FeatureChaining", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureChaining_ChainingFeature(), this.getFeature(), null, "chainingFeature", null, 1, 1, FeatureChaining.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureChaining_FeatureChained(), this.getFeature(), this.getFeature_OwnedFeatureChaining(), "featureChained", null, 1, 1, FeatureChaining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(referenceSubsettingEClass, ReferenceSubsetting.class, "ReferenceSubsetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceSubsetting_ReferencedFeature(), this.getFeature(), null, "referencedFeature", null, 1, 1, ReferenceSubsetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceSubsetting_ReferencingFeature(), this.getFeature(), this.getFeature_OwnedReferenceSubsetting(), "referencingFeature", null, 1, 1, ReferenceSubsetting.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(conjugationEClass, Conjugation.class, "Conjugation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjugation_OriginalType(), this.getType(), null, "originalType", null, 1, 1, Conjugation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConjugation_ConjugatedType(), this.getType(), null, "conjugatedType", null, 1, 1, Conjugation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConjugation_OwningType(), this.getType(), this.getType_OwnedConjugator(), "owningType", null, 0, 1, Conjugation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intersectingEClass, Intersecting.class, "Intersecting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntersecting_IntersectingType(), this.getType(), null, "intersectingType", null, 1, 1, Intersecting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIntersecting_TypeIntersected(), this.getType(), this.getType_OwnedIntersecting(), "typeIntersected", null, 1, 1, Intersecting.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(disjoiningEClass, Disjoining.class, "Disjoining", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisjoining_TypeDisjoined(), this.getType(), null, "typeDisjoined", null, 1, 1, Disjoining.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDisjoining_DisjoiningType(), this.getType(), null, "disjoiningType", null, 1, 1, Disjoining.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDisjoining_OwningType(), this.getType(), this.getType_OwnedDisjoining(), "owningType", null, 0, 1, Disjoining.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(differencingEClass, Differencing.class, "Differencing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDifferencing_DifferencingType(), this.getType(), null, "differencingType", null, 1, 1, Differencing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDifferencing_TypeDifferenced(), this.getType(), this.getType_OwnedDifferencing(), "typeDifferenced", null, 1, 1, Differencing.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subclassificationEClass, Subclassification.class, "Subclassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubclassification_Superclassifier(), this.getClassifier(), null, "superclassifier", null, 1, 1, Subclassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubclassification_OwningClassifier(), this.getClassifier(), this.getClassifier_OwnedSubclassification(), "owningClassifier", null, 0, 1, Subclassification.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSubclassification_Subclassifier(), this.getClassifier(), null, "subclassifier", null, 1, 1, Subclassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_OwnedSubclassification(), this.getSubclassification(), this.getSubclassification_OwningClassifier(), "ownedSubclassification", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(endFeatureMembershipEClass, EndFeatureMembership.class, "EndFeatureMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(successionEClass, Succession.class, "Succession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuccession_TransitionStep(), this.getStep(), null, "transitionStep", null, 0, 1, Succession.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSuccession_TriggerStep(), this.getStep(), null, "triggerStep", null, 0, -1, Succession.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSuccession_EffectStep(), this.getStep(), null, "effectStep", null, 0, -1, Succession.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSuccession_GuardExpression(), this.getExpression(), null, "guardExpression", null, 0, -1, Succession.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_RelatedFeature(), this.getFeature(), null, "relatedFeature", null, 0, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Association(), this.getAssociation(), null, "association", null, 0, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_ConnectorEnd(), this.getFeature(), null, "connectorEnd", null, 0, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_SourceFeature(), this.getFeature(), null, "sourceFeature", null, 0, 1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_TargetFeature(), this.getFeature(), null, "targetFeature", null, 0, -1, Connector.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_RelatedType(), this.getType(), null, "relatedType", null, 0, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_SourceType(), this.getType(), null, "sourceType", null, 0, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_TargetType(), this.getType(), null, "targetType", null, 0, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_AssociationEnd(), this.getFeature(), null, "associationEnd", null, 0, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Behavior(), this.getBehavior(), null, "behavior", null, 0, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Parameter(), this.getFeature(), null, "parameter", null, 0, -1, Step.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Step(), this.getStep(), null, "step", null, 0, -1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Parameter(), this.getFeature(), null, "parameter", null, 0, -1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.omg.sysml.lang.sysml.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Function(), this.getFunction(), null, "function", null, 0, 1, Expression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExpression_Result(), this.getFeature(), null, "result", null, 1, 1, Expression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExpression_IsModelLevelEvaluable(), theTypesPackage.getBoolean(), "isModelLevelEvaluable", null, 1, 1, Expression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExpression__ModelLevelEvaluable__EList(), theTypesPackage.getBoolean(), "modelLevelEvaluable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "visited", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExpression__Evaluate__Element(), this.getElement(), "evaluate", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getExpression__CheckCondition__Element(), theTypesPackage.getBoolean(), "checkCondition", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getElement(), "target", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Expression(), this.getExpression(), null, "expression", null, 0, -1, Function.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFunction_Result(), this.getFeature(), null, "result", null, 1, 1, Function.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFunction_IsModelLevelEvaluable(), theTypesPackage.getBoolean(), "isModelLevelEvaluable", null, 1, 1, Function.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(bindingConnectorEClass, BindingConnector.class, "BindingConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureValueEClass, FeatureValue.class, "FeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_FeatureWithValue(), this.getFeature(), null, "featureWithValue", null, 1, 1, FeatureValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureValue_Value(), this.getExpression(), null, "value", null, 1, 1, FeatureValue.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureValue_IsInitial(), theTypesPackage.getBoolean(), "isInitial", "false", 1, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeatureValue_IsDefault(), theTypesPackage.getBoolean(), "isDefault", "false", 1, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementFilterMembershipEClass, ElementFilterMembership.class, "ElementFilterMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementFilterMembership_Condition(), this.getExpression(), null, "condition", null, 1, 1, ElementFilterMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(packageEClass, org.omg.sysml.lang.sysml.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_FilterCondition(), this.getExpression(), null, "filterCondition", null, 0, -1, org.omg.sysml.lang.sysml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPackage__IncludeAsMember__Element(), theTypesPackage.getBoolean(), "includeAsMember", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(libraryPackageEClass, LibraryPackage.class, "LibraryPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibraryPackage_IsStandard(), theTypesPackage.getBoolean(), "isStandard", "false", 1, 1, LibraryPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(multiplicityRangeEClass, MultiplicityRange.class, "MultiplicityRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiplicityRange_LowerBound(), this.getExpression(), null, "lowerBound", null, 0, 1, MultiplicityRange.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityRange_UpperBound(), this.getExpression(), null, "upperBound", null, 1, 1, MultiplicityRange.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityRange_Bound(), this.getExpression(), null, "bound", null, 1, 2, MultiplicityRange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMultiplicityRange__HasBounds__int_int(), theTypesPackage.getBoolean(), "hasBounds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "lower", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityRange__ValueOf__Expression(), theTypesPackage.getUnlimitedNatural(), "valueOf", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExpression(), "bound", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(parameterMembershipEClass, ParameterMembership.class, "ParameterMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterMembership_OwnedMemberParameter(), this.getFeature(), null, "ownedMemberParameter", null, 1, 1, ParameterMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getParameterMembership__ParameterDirection(), this.getFeatureDirectionKind(), "parameterDirection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnParameterMembershipEClass, ReturnParameterMembership.class, "ReturnParameterMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(invariantEClass, Invariant.class, "Invariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvariant_IsNegated(), theTypesPackage.getBoolean(), "isNegated", "false", 1, 1, Invariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanExpression_Predicate(), this.getPredicate(), null, "predicate", null, 0, 1, BooleanExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultExpressionMembershipEClass, ResultExpressionMembership.class, "ResultExpressionMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultExpressionMembership_OwnedResultExpression(), this.getExpression(), null, "ownedResultExpression", null, 1, 1, ResultExpressionMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(metaclassEClass, Metaclass.class, "Metaclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metadataFeatureEClass, MetadataFeature.class, "MetadataFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadataFeature_Metaclass(), this.getMetaclass(), null, "metaclass", null, 0, 1, MetadataFeature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMetadataFeature__EvaluateFeature__Feature(), this.getElement(), "evaluateFeature", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFeature(), "baseFeature", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMetadataFeature__IsSemantic(), theTypesPackage.getBoolean(), "isSemantic", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMetadataFeature__IsSyntactic(), theTypesPackage.getBoolean(), "isSyntactic", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMetadataFeature__SyntaxElement(), this.getElement(), "syntaxElement", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(itemFlowEClass, ItemFlow.class, "ItemFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemFlow_ItemType(), this.getClassifier(), null, "itemType", null, 0, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_TargetInputFeature(), this.getFeature(), null, "targetInputFeature", null, 0, 1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_SourceOutputFeature(), this.getFeature(), null, "sourceOutputFeature", null, 0, 1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_ItemFlowEnd(), this.getItemFlowEnd(), null, "itemFlowEnd", null, 0, 2, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItemFlow_ItemFeature(), this.getItemFeature(), null, "itemFeature", null, 0, 1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getItemFlow_Interaction(), this.getInteraction(), null, "interaction", null, 0, -1, ItemFlow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itemFlowEndEClass, ItemFlowEnd.class, "ItemFlowEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemFeatureEClass, ItemFeature.class, "ItemFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(successionItemFlowEClass, SuccessionItemFlow.class, "SuccessionItemFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationStructureEClass, AssociationStructure.class, "AssociationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullExpressionEClass, NullExpression.class, "NullExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalRationalEClass, LiteralRational.class, "LiteralRational", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralRational_Value(), theTypesPackage.getReal(), "value", null, 1, 1, LiteralRational.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectExpressionEClass, SelectExpression.class, "SelectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorExpressionEClass, OperatorExpression.class, "OperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatorExpression_Operator(), theTypesPackage.getString(), "operator", null, 1, 1, OperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(invocationExpressionEClass, InvocationExpression.class, "InvocationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationExpression_Argument(), this.getExpression(), null, "argument", null, 0, -1, InvocationExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInvocationExpression_Operand(), this.getExpression(), null, "operand", null, 0, -1, InvocationExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralString_Value(), theTypesPackage.getString(), "value", null, 1, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collectExpressionEClass, CollectExpression.class, "CollectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralInteger_Value(), theTypesPackage.getInteger(), "value", null, 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureReferenceExpressionEClass, FeatureReferenceExpression.class, "FeatureReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureReferenceExpression_Referent(), this.getFeature(), null, "referent", null, 1, 1, FeatureReferenceExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(metadataAccessExpressionEClass, MetadataAccessExpression.class, "MetadataAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadataAccessExpression_ReferencedElement(), this.getElement(), null, "referencedElement", null, 1, 1, MetadataAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getMetadataAccessExpression__MetaclassFeature(), this.getMetadataFeature(), "metaclassFeature", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), theTypesPackage.getBoolean(), "value", null, 1, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalInfinityEClass, LiteralInfinity.class, "LiteralInfinity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureChainExpressionEClass, FeatureChainExpression.class, "FeatureChainExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureChainExpression_TargetFeature(), this.getFeature(), null, "targetFeature", null, 1, 1, FeatureChainExpression.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getFeatureChainExpression__SourceTargetFeature(), this.getFeature(), "sourceTargetFeature", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Client(), this.getElement(), null, "client", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Supplier(), this.getElement(), null, "supplier", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(membershipImportEClass, MembershipImport.class, "MembershipImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMembershipImport_ImportedMembership(), this.getMembership(), null, "importedMembership", null, 1, 1, MembershipImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namespaceImportEClass, NamespaceImport.class, "NamespaceImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespaceImport_ImportedNamespace(), this.getNamespace(), null, "importedNamespace", null, 1, 1, NamespaceImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transitionUsageEClass, TransitionUsage.class, "TransitionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionUsage_Source(), this.getActionUsage(), null, "source", null, 1, 1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_Target(), this.getActionUsage(), null, "target", null, 1, 1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_TriggerAction(), this.getAcceptActionUsage(), null, "triggerAction", null, 0, -1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_GuardExpression(), this.getExpression(), null, "guardExpression", null, 0, -1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_EffectAction(), this.getActionUsage(), null, "effectAction", null, 0, -1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionUsage_Succession(), this.getSuccession(), null, "succession", null, 1, 1, TransitionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getTransitionUsage__TriggerPayloadParameter(), this.getReferenceUsage(), "triggerPayloadParameter", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(actionUsageEClass, ActionUsage.class, "ActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionUsage_ActionDefinition(), this.getBehavior(), null, "actionDefinition", null, 0, -1, ActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getActionUsage__InputParameters(), this.getFeature(), "inputParameters", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getActionUsage__InputParameter__int(), this.getFeature(), "inputParameter", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "i", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getActionUsage__Argument__int(), this.getExpression(), "argument", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "i", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getActionUsage__IsSubactionUsage(), theTypesPackage.getBoolean(), "isSubactionUsage", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(occurrenceUsageEClass, OccurrenceUsage.class, "OccurrenceUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOccurrenceUsage_OccurrenceDefinition(), this.getClass_(), null, "occurrenceDefinition", null, 0, -1, OccurrenceUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOccurrenceUsage_IndividualDefinition(), this.getOccurrenceDefinition(), null, "individualDefinition", null, 0, 1, OccurrenceUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccurrenceUsage_IsIndividual(), theTypesPackage.getBoolean(), "isIndividual", "false", 1, 1, OccurrenceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccurrenceUsage_PortionKind(), this.getPortionKind(), "portionKind", null, 0, 1, OccurrenceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsage_IsReference(), theTypesPackage.getBoolean(), "isReference", null, 1, 1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsage_IsVariation(), theTypesPackage.getBoolean(), "isVariation", null, 1, 1, Usage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_Variant(), this.getUsage(), null, "variant", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_VariantMembership(), this.getVariantMembership(), null, "variantMembership", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_OwningDefinition(), this.getDefinition(), this.getDefinition_OwnedUsage(), "owningDefinition", null, 0, 1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_OwningUsage(), this.getUsage(), this.getUsage_NestedUsage(), "owningUsage", null, 0, 1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedUsage(), this.getUsage(), this.getUsage_OwningUsage(), "nestedUsage", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_Definition(), this.getClassifier(), null, "definition", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_Usage(), this.getUsage(), null, "usage", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_DirectedUsage(), this.getUsage(), null, "directedUsage", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedReference(), this.getReferenceUsage(), null, "nestedReference", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedAttribute(), this.getAttributeUsage(), null, "nestedAttribute", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedEnumeration(), this.getEnumerationUsage(), null, "nestedEnumeration", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedOccurrence(), this.getOccurrenceUsage(), null, "nestedOccurrence", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedItem(), this.getItemUsage(), null, "nestedItem", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedPart(), this.getPartUsage(), null, "nestedPart", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedPort(), this.getPortUsage(), null, "nestedPort", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedConnection(), this.getConnectorAsUsage(), null, "nestedConnection", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedFlow(), this.getFlowConnectionUsage(), null, "nestedFlow", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedInterface(), this.getInterfaceUsage(), null, "nestedInterface", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedAllocation(), this.getAllocationUsage(), null, "nestedAllocation", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedAction(), this.getActionUsage(), null, "nestedAction", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedState(), this.getStateUsage(), null, "nestedState", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedTransition(), this.getTransitionUsage(), null, "nestedTransition", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedCalculation(), this.getCalculationUsage(), null, "nestedCalculation", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedConstraint(), this.getConstraintUsage(), null, "nestedConstraint", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedRequirement(), this.getRequirementUsage(), null, "nestedRequirement", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedConcern(), this.getConcernUsage(), null, "nestedConcern", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUsage_NestedCase(), this.getCaseUsage(), null, "nestedCase", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedAnalysisCase(), this.getAnalysisCaseUsage(), null, "nestedAnalysisCase", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedVerificationCase(), this.getVerificationCaseUsage(), null, "nestedVerificationCase", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedUseCase(), this.getUseCaseUsage(), null, "nestedUseCase", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedView(), this.getViewUsage(), null, "nestedView", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedViewpoint(), this.getViewpointUsage(), null, "nestedViewpoint", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedRendering(), this.getRenderingUsage(), null, "nestedRendering", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUsage_NestedMetadata(), this.getMetadataUsage(), null, "nestedMetadata", null, 0, -1, Usage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(variantMembershipEClass, VariantMembership.class, "VariantMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariantMembership_OwnedVariantUsage(), this.getUsage(), null, "ownedVariantUsage", null, 1, 1, VariantMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinition_IsVariation(), theTypesPackage.getBoolean(), "isVariation", null, 1, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_Variant(), this.getUsage(), null, "variant", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_VariantMembership(), this.getVariantMembership(), null, "variantMembership", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_Usage(), this.getUsage(), null, "usage", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_DirectedUsage(), this.getUsage(), null, "directedUsage", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedReference(), this.getReferenceUsage(), null, "ownedReference", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedAttribute(), this.getAttributeUsage(), null, "ownedAttribute", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedEnumeration(), this.getEnumerationUsage(), null, "ownedEnumeration", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedOccurrence(), this.getOccurrenceUsage(), null, "ownedOccurrence", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedItem(), this.getItemUsage(), null, "ownedItem", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedPart(), this.getPartUsage(), null, "ownedPart", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedPort(), this.getPortUsage(), null, "ownedPort", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedConnection(), this.getConnectorAsUsage(), null, "ownedConnection", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedFlow(), this.getFlowConnectionUsage(), null, "ownedFlow", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedInterface(), this.getInterfaceUsage(), null, "ownedInterface", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedAllocation(), this.getAllocationUsage(), null, "ownedAllocation", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedAction(), this.getActionUsage(), null, "ownedAction", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedState(), this.getStateUsage(), null, "ownedState", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedTransition(), this.getTransitionUsage(), null, "ownedTransition", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedCalculation(), this.getCalculationUsage(), null, "ownedCalculation", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedConstraint(), this.getConstraintUsage(), null, "ownedConstraint", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedRequirement(), this.getRequirementUsage(), null, "ownedRequirement", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedConcern(), this.getConcernUsage(), null, "ownedConcern", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDefinition_OwnedCase(), this.getCaseUsage(), null, "ownedCase", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedAnalysisCase(), this.getAnalysisCaseUsage(), null, "ownedAnalysisCase", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedVerificationCase(), this.getVerificationCaseUsage(), null, "ownedVerificationCase", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedUseCase(), this.getUseCaseUsage(), null, "ownedUseCase", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedView(), this.getViewUsage(), null, "ownedView", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedViewpoint(), this.getViewpointUsage(), null, "ownedViewpoint", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedRendering(), this.getRenderingUsage(), null, "ownedRendering", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedMetadata(), this.getMetadataUsage(), null, "ownedMetadata", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_OwnedUsage(), this.getUsage(), this.getUsage_OwningDefinition(), "ownedUsage", null, 0, -1, Definition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(referenceUsageEClass, ReferenceUsage.class, "ReferenceUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeUsageEClass, AttributeUsage.class, "AttributeUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeUsage_AttributeDefinition(), this.getDataType(), null, "attributeDefinition", null, 0, -1, AttributeUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(enumerationUsageEClass, EnumerationUsage.class, "EnumerationUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationUsage_EnumerationDefinition(), this.getEnumerationDefinition(), null, "enumerationDefinition", null, 1, 1, EnumerationUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationDefinitionEClass, EnumerationDefinition.class, "EnumerationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationDefinition_EnumeratedValue(), this.getEnumerationUsage(), null, "enumeratedValue", null, 0, -1, EnumerationDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(attributeDefinitionEClass, AttributeDefinition.class, "AttributeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemUsageEClass, ItemUsage.class, "ItemUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemUsage_ItemDefinition(), this.getStructure(), null, "itemDefinition", null, 0, -1, ItemUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(partUsageEClass, PartUsage.class, "PartUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartUsage_PartDefinition(), this.getPartDefinition(), null, "partDefinition", null, 0, -1, PartUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(partDefinitionEClass, PartDefinition.class, "PartDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemDefinitionEClass, ItemDefinition.class, "ItemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(occurrenceDefinitionEClass, OccurrenceDefinition.class, "OccurrenceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOccurrenceDefinition_LifeClass(), this.getLifeClass(), null, "lifeClass", null, 0, 1, OccurrenceDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOccurrenceDefinition_IsIndividual(), theTypesPackage.getBoolean(), "isIndividual", "false", 1, 1, OccurrenceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lifeClassEClass, LifeClass.class, "LifeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portUsageEClass, PortUsage.class, "PortUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortUsage_PortDefinition(), this.getPortDefinition(), null, "portDefinition", null, 0, -1, PortUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portDefinitionEClass, PortDefinition.class, "PortDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortDefinition_ConjugatedPortDefinition(), this.getConjugatedPortDefinition(), this.getConjugatedPortDefinition_OriginalPortDefinition(), "conjugatedPortDefinition", null, 0, 1, PortDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(conjugatedPortDefinitionEClass, ConjugatedPortDefinition.class, "ConjugatedPortDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjugatedPortDefinition_OwnedPortConjugator(), this.getPortConjugation(), this.getPortConjugation_ConjugatedPortDefinition(), "ownedPortConjugator", null, 1, 1, ConjugatedPortDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConjugatedPortDefinition_OriginalPortDefinition(), this.getPortDefinition(), this.getPortDefinition_ConjugatedPortDefinition(), "originalPortDefinition", null, 1, 1, ConjugatedPortDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(portConjugationEClass, PortConjugation.class, "PortConjugation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConjugation_OriginalPortDefinition(), this.getPortDefinition(), null, "originalPortDefinition", null, 1, 1, PortConjugation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPortConjugation_ConjugatedPortDefinition(), this.getConjugatedPortDefinition(), this.getConjugatedPortDefinition_OwnedPortConjugator(), "conjugatedPortDefinition", null, 1, 1, PortConjugation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(connectorAsUsageEClass, ConnectorAsUsage.class, "ConnectorAsUsage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowConnectionUsageEClass, FlowConnectionUsage.class, "FlowConnectionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowConnectionUsage_FlowConnectionDefinition(), this.getInteraction(), null, "flowConnectionDefinition", null, 0, -1, FlowConnectionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(connectionUsageEClass, ConnectionUsage.class, "ConnectionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionUsage_ConnectionDefinition(), this.getAssociationStructure(), null, "connectionDefinition", null, 0, -1, ConnectionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interfaceUsageEClass, InterfaceUsage.class, "InterfaceUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceUsage_InterfaceDefinition(), this.getInterfaceDefinition(), null, "interfaceDefinition", null, 0, -1, InterfaceUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceDefinitionEClass, InterfaceDefinition.class, "InterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDefinition_InterfaceEnd(), this.getPortUsage(), null, "interfaceEnd", null, 0, -1, InterfaceDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(connectionDefinitionEClass, ConnectionDefinition.class, "ConnectionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionDefinition_ConnectionEnd(), this.getUsage(), null, "connectionEnd", null, 0, -1, ConnectionDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(allocationUsageEClass, AllocationUsage.class, "AllocationUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationUsage_AllocationDefinition(), this.getAllocationDefinition(), null, "allocationDefinition", null, 0, -1, AllocationUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(allocationDefinitionEClass, AllocationDefinition.class, "AllocationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationDefinition_Allocation(), this.getAllocationUsage(), null, "allocation", null, 0, -1, AllocationDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateUsageEClass, StateUsage.class, "StateUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateUsage_StateDefinition(), this.getBehavior(), null, "stateDefinition", null, 0, -1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStateUsage_EntryAction(), this.getActionUsage(), null, "entryAction", null, 0, 1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateUsage_DoAction(), this.getActionUsage(), null, "doAction", null, 0, 1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateUsage_ExitAction(), this.getActionUsage(), null, "exitAction", null, 0, 1, StateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStateUsage_IsParallel(), theTypesPackage.getBoolean(), "isParallel", "false", 1, 1, StateUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStateUsage__IsSubstateUsage__boolean(), theTypesPackage.getBoolean(), "isSubstateUsage", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isParallel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(calculationUsageEClass, CalculationUsage.class, "CalculationUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculationUsage_CalculationDefinition(), this.getFunction(), null, "calculationDefinition", null, 0, 1, CalculationUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(constraintUsageEClass, ConstraintUsage.class, "ConstraintUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintUsage_ConstraintDefinition(), this.getPredicate(), null, "constraintDefinition", null, 0, 1, ConstraintUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(requirementUsageEClass, RequirementUsage.class, "RequirementUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementUsage_RequirementDefinition(), this.getRequirementDefinition(), null, "requirementDefinition", null, 0, 1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirementUsage_ReqId(), theTypesPackage.getString(), "reqId", null, 0, 1, RequirementUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirementUsage_Text(), theTypesPackage.getString(), "text", null, 0, -1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementUsage_RequiredConstraint(), this.getConstraintUsage(), null, "requiredConstraint", null, 0, -1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementUsage_AssumedConstraint(), this.getConstraintUsage(), null, "assumedConstraint", null, 0, -1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementUsage_SubjectParameter(), this.getUsage(), null, "subjectParameter", null, 1, 1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementUsage_FramedConcern(), this.getConcernUsage(), null, "framedConcern", null, 0, -1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementUsage_ActorParameter(), this.getPartUsage(), null, "actorParameter", null, 0, -1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementUsage_StakeholderParameter(), this.getPartUsage(), null, "stakeholderParameter", null, 0, -1, RequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(requirementDefinitionEClass, RequirementDefinition.class, "RequirementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementDefinition_ReqId(), theTypesPackage.getString(), "reqId", null, 0, 1, RequirementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequirementDefinition_Text(), theTypesPackage.getString(), "text", null, 0, -1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementDefinition_SubjectParameter(), this.getUsage(), null, "subjectParameter", null, 1, 1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementDefinition_ActorParameter(), this.getPartUsage(), null, "actorParameter", null, 0, -1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDefinition_StakeholderParameter(), this.getPartUsage(), null, "stakeholderParameter", null, 0, -1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDefinition_AssumedConstraint(), this.getConstraintUsage(), null, "assumedConstraint", null, 0, -1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDefinition_RequiredConstraint(), this.getConstraintUsage(), null, "requiredConstraint", null, 0, -1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDefinition_FramedConcern(), this.getConcernUsage(), null, "framedConcern", null, 0, -1, RequirementDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(constraintDefinitionEClass, ConstraintDefinition.class, "ConstraintDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concernUsageEClass, ConcernUsage.class, "ConcernUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcernUsage_ConcernDefinition(), this.getConcernDefinition(), null, "concernDefinition", null, 0, 1, ConcernUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(concernDefinitionEClass, ConcernDefinition.class, "ConcernDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(caseUsageEClass, CaseUsage.class, "CaseUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseUsage_ObjectiveRequirement(), this.getRequirementUsage(), null, "objectiveRequirement", null, 0, 1, CaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseUsage_CaseDefinition(), this.getCaseDefinition(), null, "caseDefinition", null, 0, 1, CaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getCaseUsage_SubjectParameter(), this.getUsage(), null, "subjectParameter", null, 1, 1, CaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getCaseUsage_ActorParameter(), this.getPartUsage(), null, "actorParameter", null, 0, -1, CaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(caseDefinitionEClass, CaseDefinition.class, "CaseDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseDefinition_ObjectiveRequirement(), this.getRequirementUsage(), null, "objectiveRequirement", null, 0, 1, CaseDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseDefinition_SubjectParameter(), this.getUsage(), null, "subjectParameter", null, 1, 1, CaseDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getCaseDefinition_ActorParameter(), this.getPartUsage(), null, "actorParameter", null, 0, -1, CaseDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(calculationDefinitionEClass, CalculationDefinition.class, "CalculationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCalculationDefinition_Calculation(), this.getCalculationUsage(), null, "calculation", null, 0, -1, CalculationDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(actionDefinitionEClass, ActionDefinition.class, "ActionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionDefinition_Action(), this.getActionUsage(), null, "action", null, 0, -1, ActionDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(analysisCaseUsageEClass, AnalysisCaseUsage.class, "AnalysisCaseUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisCaseUsage_AnalysisAction(), this.getActionUsage(), null, "analysisAction", null, 0, -1, AnalysisCaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisCaseUsage_AnalysisCaseDefinition(), this.getAnalysisCaseDefinition(), null, "analysisCaseDefinition", null, 0, 1, AnalysisCaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAnalysisCaseUsage_ResultExpression(), this.getExpression(), null, "resultExpression", null, 0, 1, AnalysisCaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(analysisCaseDefinitionEClass, AnalysisCaseDefinition.class, "AnalysisCaseDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisCaseDefinition_AnalysisAction(), this.getActionUsage(), null, "analysisAction", null, 0, -1, AnalysisCaseDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisCaseDefinition_ResultExpression(), this.getExpression(), null, "resultExpression", null, 0, 1, AnalysisCaseDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(verificationCaseUsageEClass, VerificationCaseUsage.class, "VerificationCaseUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerificationCaseUsage_VerificationCaseDefinition(), this.getVerificationCaseDefinition(), null, "verificationCaseDefinition", null, 0, 1, VerificationCaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getVerificationCaseUsage_VerifiedRequirement(), this.getRequirementUsage(), null, "verifiedRequirement", null, 0, -1, VerificationCaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(verificationCaseDefinitionEClass, VerificationCaseDefinition.class, "VerificationCaseDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerificationCaseDefinition_VerifiedRequirement(), this.getRequirementUsage(), null, "verifiedRequirement", null, 0, -1, VerificationCaseDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(useCaseUsageEClass, UseCaseUsage.class, "UseCaseUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCaseUsage_UseCaseDefinition(), this.getUseCaseDefinition(), null, "useCaseDefinition", null, 0, 1, UseCaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCaseUsage_IncludedUseCase(), this.getUseCaseUsage(), null, "includedUseCase", null, 0, -1, UseCaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(useCaseDefinitionEClass, UseCaseDefinition.class, "UseCaseDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCaseDefinition_IncludedUseCase(), this.getUseCaseUsage(), null, "includedUseCase", null, 0, -1, UseCaseDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(viewUsageEClass, ViewUsage.class, "ViewUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewUsage_ViewDefinition(), this.getViewDefinition(), null, "viewDefinition", null, 0, 1, ViewUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getViewUsage_SatisfiedViewpoint(), this.getViewpointUsage(), null, "satisfiedViewpoint", null, 0, -1, ViewUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getViewUsage_ExposedElement(), this.getElement(), null, "exposedElement", null, 0, -1, ViewUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getViewUsage_ViewRendering(), this.getRenderingUsage(), null, "viewRendering", null, 0, 1, ViewUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getViewUsage_ViewCondition(), this.getExpression(), null, "viewCondition", null, 0, -1, ViewUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getViewUsage__IncludeAsExposed__Element(), theTypesPackage.getBoolean(), "includeAsExposed", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(viewDefinitionEClass, ViewDefinition.class, "ViewDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewDefinition_View(), this.getViewUsage(), null, "view", null, 0, -1, ViewDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getViewDefinition_SatisfiedViewpoint(), this.getViewpointUsage(), null, "satisfiedViewpoint", null, 0, -1, ViewDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getViewDefinition_ViewRendering(), this.getRenderingUsage(), null, "viewRendering", null, 0, 1, ViewDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getViewDefinition_ViewCondition(), this.getExpression(), null, "viewCondition", null, 0, -1, ViewDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(viewpointUsageEClass, ViewpointUsage.class, "ViewpointUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpointUsage_ViewpointDefinition(), this.getViewpointDefinition(), null, "viewpointDefinition", null, 0, 1, ViewpointUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getViewpointUsage_ViewpointStakeholder(), this.getPartUsage(), null, "viewpointStakeholder", null, 0, -1, ViewpointUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(viewpointDefinitionEClass, ViewpointDefinition.class, "ViewpointDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewpointDefinition_ViewpointStakeholder(), this.getPartUsage(), null, "viewpointStakeholder", null, 0, -1, ViewpointDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(renderingUsageEClass, RenderingUsage.class, "RenderingUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenderingUsage_RenderingDefinition(), this.getRenderingDefinition(), null, "renderingDefinition", null, 0, 1, RenderingUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(renderingDefinitionEClass, RenderingDefinition.class, "RenderingDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenderingDefinition_Rendering(), this.getRenderingUsage(), null, "rendering", null, 0, -1, RenderingDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(metadataUsageEClass, MetadataUsage.class, "MetadataUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadataUsage_MetadataDefinition(), this.getMetaclass(), null, "metadataDefinition", null, 0, 1, MetadataUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(acceptActionUsageEClass, AcceptActionUsage.class, "AcceptActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptActionUsage_ReceiverArgument(), this.getExpression(), null, "receiverArgument", null, 0, 1, AcceptActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptActionUsage_PayloadParameter(), this.getReferenceUsage(), null, "payloadParameter", null, 1, 1, AcceptActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptActionUsage_PayloadArgument(), this.getExpression(), null, "payloadArgument", null, 0, 1, AcceptActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getAcceptActionUsage__IsTriggerAction(), theTypesPackage.getBoolean(), "isTriggerAction", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(stateSubactionMembershipEClass, StateSubactionMembership.class, "StateSubactionMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateSubactionMembership_Kind(), this.getStateSubactionKind(), "kind", null, 1, 1, StateSubactionMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateSubactionMembership_Action(), this.getActionUsage(), null, "action", null, 1, 1, StateSubactionMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(exhibitStateUsageEClass, ExhibitStateUsage.class, "ExhibitStateUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExhibitStateUsage_ExhibitedState(), this.getStateUsage(), null, "exhibitedState", null, 1, 1, ExhibitStateUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(performActionUsageEClass, PerformActionUsage.class, "PerformActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformActionUsage_PerformedAction(), this.getActionUsage(), null, "performedAction", null, 1, 1, PerformActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(eventOccurrenceUsageEClass, EventOccurrenceUsage.class, "EventOccurrenceUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventOccurrenceUsage_EventOccurrence(), this.getOccurrenceUsage(), null, "eventOccurrence", null, 1, 1, EventOccurrenceUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(stateDefinitionEClass, StateDefinition.class, "StateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateDefinition_State(), this.getStateUsage(), null, "state", null, 0, -1, StateDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStateDefinition_EntryAction(), this.getActionUsage(), null, "entryAction", null, 0, 1, StateDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateDefinition_DoAction(), this.getActionUsage(), null, "doAction", null, 0, 1, StateDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStateDefinition_ExitAction(), this.getActionUsage(), null, "exitAction", null, 0, 1, StateDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStateDefinition_IsParallel(), theTypesPackage.getBoolean(), "isParallel", "false", 1, 1, StateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transitionFeatureMembershipEClass, TransitionFeatureMembership.class, "TransitionFeatureMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionFeatureMembership_Kind(), this.getTransitionFeatureKind(), "kind", null, 1, 1, TransitionFeatureMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransitionFeatureMembership_TransitionFeature(), this.getStep(), null, "transitionFeature", null, 1, 1, TransitionFeatureMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(objectiveMembershipEClass, ObjectiveMembership.class, "ObjectiveMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectiveMembership_OwnedObjectiveRequirement(), this.getRequirementUsage(), null, "ownedObjectiveRequirement", null, 1, 1, ObjectiveMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getControlNode__MultiplicityHasBounds__Multiplicity_int_int(), theTypesPackage.getBoolean(), "multiplicityHasBounds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicity(), "mult", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "lower", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifActionUsageEClass, IfActionUsage.class, "IfActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfActionUsage_ElseAction(), this.getActionUsage(), null, "elseAction", null, 0, 1, IfActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getIfActionUsage_ThenAction(), this.getActionUsage(), null, "thenAction", null, 1, 1, IfActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getIfActionUsage_IfArgument(), this.getExpression(), null, "ifArgument", null, 1, 1, IfActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forLoopActionUsageEClass, ForLoopActionUsage.class, "ForLoopActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForLoopActionUsage_SeqArgument(), this.getExpression(), null, "seqArgument", null, 1, 1, ForLoopActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getForLoopActionUsage_LoopVariable(), this.getReferenceUsage(), null, "loopVariable", null, 1, 1, ForLoopActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(loopActionUsageEClass, LoopActionUsage.class, "LoopActionUsage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopActionUsage_BodyAction(), this.getActionUsage(), null, "bodyAction", null, 1, 1, LoopActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assignmentActionUsageEClass, AssignmentActionUsage.class, "AssignmentActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentActionUsage_TargetArgument(), this.getExpression(), null, "targetArgument", null, 0, 1, AssignmentActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssignmentActionUsage_ValueExpression(), this.getExpression(), null, "valueExpression", null, 0, 1, AssignmentActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAssignmentActionUsage_Referent(), this.getFeature(), null, "referent", null, 1, 1, AssignmentActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(sendActionUsageEClass, SendActionUsage.class, "SendActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendActionUsage_ReceiverArgument(), this.getExpression(), null, "receiverArgument", null, 0, 1, SendActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSendActionUsage_PayloadArgument(), this.getExpression(), null, "payloadArgument", null, 1, 1, SendActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSendActionUsage_SenderArgument(), this.getExpression(), null, "senderArgument", null, 0, 1, SendActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(triggerInvocationExpressionEClass, TriggerInvocationExpression.class, "TriggerInvocationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerInvocationExpression_Kind(), this.getTriggerKind(), "kind", null, 1, 1, TriggerInvocationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(whileLoopActionUsageEClass, WhileLoopActionUsage.class, "WhileLoopActionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileLoopActionUsage_WhileArgument(), this.getExpression(), null, "whileArgument", null, 1, 1, WhileLoopActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getWhileLoopActionUsage_UntilArgument(), this.getExpression(), null, "untilArgument", null, 0, 1, WhileLoopActionUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includeUseCaseUsageEClass, IncludeUseCaseUsage.class, "IncludeUseCaseUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludeUseCaseUsage_UseCaseIncluded(), this.getUseCaseUsage(), null, "useCaseIncluded", null, 1, 1, IncludeUseCaseUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(satisfyRequirementUsageEClass, SatisfyRequirementUsage.class, "SatisfyRequirementUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatisfyRequirementUsage_SatisfiedRequirement(), this.getRequirementUsage(), null, "satisfiedRequirement", null, 1, 1, SatisfyRequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSatisfyRequirementUsage_SatisfyingFeature(), this.getFeature(), null, "satisfyingFeature", null, 1, 1, SatisfyRequirementUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(assertConstraintUsageEClass, AssertConstraintUsage.class, "AssertConstraintUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertConstraintUsage_AssertedConstraint(), this.getConstraintUsage(), null, "assertedConstraint", null, 1, 1, AssertConstraintUsage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(actorMembershipEClass, ActorMembership.class, "ActorMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorMembership_OwnedActorParameter(), this.getPartUsage(), null, "ownedActorParameter", null, 1, 1, ActorMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(requirementConstraintMembershipEClass, RequirementConstraintMembership.class, "RequirementConstraintMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementConstraintMembership_Kind(), this.getRequirementConstraintKind(), "kind", null, 1, 1, RequirementConstraintMembership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementConstraintMembership_OwnedConstraint(), this.getConstraintUsage(), null, "ownedConstraint", null, 1, 1, RequirementConstraintMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementConstraintMembership_ReferencedConstraint(), this.getConstraintUsage(), null, "referencedConstraint", null, 1, 1, RequirementConstraintMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(subjectMembershipEClass, SubjectMembership.class, "SubjectMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubjectMembership_OwnedSubjectParameter(), this.getUsage(), null, "ownedSubjectParameter", null, 1, 1, SubjectMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(framedConcernMembershipEClass, FramedConcernMembership.class, "FramedConcernMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFramedConcernMembership_OwnedConcern(), this.getConcernUsage(), null, "ownedConcern", null, 1, 1, FramedConcernMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFramedConcernMembership_ReferencedConcern(), this.getConcernUsage(), null, "referencedConcern", null, 1, 1, FramedConcernMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(stakeholderMembershipEClass, StakeholderMembership.class, "StakeholderMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeholderMembership_OwnedStakeholderParameter(), this.getPartUsage(), null, "ownedStakeholderParameter", null, 1, 1, StakeholderMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(successionFlowConnectionUsageEClass, SuccessionFlowConnectionUsage.class, "SuccessionFlowConnectionUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(successionAsUsageEClass, SuccessionAsUsage.class, "SuccessionAsUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowConnectionDefinitionEClass, FlowConnectionDefinition.class, "FlowConnectionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bindingConnectorAsUsageEClass, BindingConnectorAsUsage.class, "BindingConnectorAsUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjugatedPortTypingEClass, ConjugatedPortTyping.class, "ConjugatedPortTyping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjugatedPortTyping_PortDefinition(), this.getPortDefinition(), null, "portDefinition", null, 1, 1, ConjugatedPortTyping.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConjugatedPortTyping_ConjugatedPortDefinition(), this.getConjugatedPortDefinition(), null, "conjugatedPortDefinition", null, 1, 1, ConjugatedPortTyping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requirementVerificationMembershipEClass, RequirementVerificationMembership.class, "RequirementVerificationMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementVerificationMembership_OwnedRequirement(), this.getRequirementUsage(), null, "ownedRequirement", null, 1, 1, RequirementVerificationMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementVerificationMembership_VerifiedRequirement(), this.getRequirementUsage(), null, "verifiedRequirement", null, 1, 1, RequirementVerificationMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(exposeEClass, Expose.class, "Expose", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(membershipExposeEClass, MembershipExpose.class, "MembershipExpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewRenderingMembershipEClass, ViewRenderingMembership.class, "ViewRenderingMembership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewRenderingMembership_OwnedRendering(), this.getRenderingUsage(), null, "ownedRendering", null, 1, 1, ViewRenderingMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getViewRenderingMembership_ReferencedRendering(), this.getRenderingUsage(), null, "referencedRendering", null, 1, 1, ViewRenderingMembership.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(namespaceExposeEClass, NamespaceExpose.class, "NamespaceExpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metadataDefinitionEClass, MetadataDefinition.class, "MetadataDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(featureDirectionKindEEnum, FeatureDirectionKind.class, "FeatureDirectionKind");
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.IN);
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.INOUT);
		addEEnumLiteral(featureDirectionKindEEnum, FeatureDirectionKind.OUT);

		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);

		initEEnum(portionKindEEnum, PortionKind.class, "PortionKind");
		addEEnumLiteral(portionKindEEnum, PortionKind.TIMESLICE);
		addEEnumLiteral(portionKindEEnum, PortionKind.SNAPSHOT);

		initEEnum(stateSubactionKindEEnum, StateSubactionKind.class, "StateSubactionKind");
		addEEnumLiteral(stateSubactionKindEEnum, StateSubactionKind.ENTRY);
		addEEnumLiteral(stateSubactionKindEEnum, StateSubactionKind.DO);
		addEEnumLiteral(stateSubactionKindEEnum, StateSubactionKind.EXIT);

		initEEnum(transitionFeatureKindEEnum, TransitionFeatureKind.class, "TransitionFeatureKind");
		addEEnumLiteral(transitionFeatureKindEEnum, TransitionFeatureKind.TRIGGER);
		addEEnumLiteral(transitionFeatureKindEEnum, TransitionFeatureKind.GUARD);
		addEEnumLiteral(transitionFeatureKindEEnum, TransitionFeatureKind.EFFECT);

		initEEnum(triggerKindEEnum, TriggerKind.class, "TriggerKind");
		addEEnumLiteral(triggerKindEEnum, TriggerKind.WHEN);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.AT);
		addEEnumLiteral(triggerKindEEnum, TriggerKind.AFTER);

		initEEnum(requirementConstraintKindEEnum, RequirementConstraintKind.class, "RequirementConstraintKind");
		addEEnumLiteral(requirementConstraintKindEEnum, RequirementConstraintKind.ASSUMPTION);
		addEEnumLiteral(requirementConstraintKindEEnum, RequirementConstraintKind.REQUIREMENT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// redefines
		createRedefinesAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http://www.omg.org/spec/SysML
		createSysMLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// union
		createUnionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "settingDelegates", "http://www.omg.org/spec/SysML",
			   "invocationDelegates", "http://www.omg.org/spec/SysML"
		   });
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
		  (getUnioning_TypeUnioned(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getUnioning_UnioningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberElementId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/memberElementId")
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberShortName(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/memberShortName")
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberName(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/memberName")
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/memberElement")
		   });
		addAnnotation
		  (getMembership_MembershipOwningNamespace(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
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
		  (getImport_ImportOwningNamespace(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getDocumentation_DocumentedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AnnotatingElement/annotatedElement")
		   });
		addAnnotation
		  (getAnnotation_AnnotatingElement(),
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
		  (getTextualRepresentation_RepresentedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AnnotatingElement/annotatedElement")
		   });
		addAnnotation
		  (getSpecialization_General(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getSpecialization_Specific(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getFeatureMembership_OwnedMemberFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OwningMembership/ownedMemberElement"),
			 URI.createURI(eNS_URI).appendFragment("//Featuring/feature")
		   });
		addAnnotation
		  (getFeatureMembership_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/membershipOwningNamespace"),
			 URI.createURI(eNS_URI).appendFragment("//Featuring/type")
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
			 URI.createURI(eNS_URI).appendFragment("//Specialization/general")
		   });
		addAnnotation
		  (getSubsetting_SubsettingFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/specific")
		   });
		addAnnotation
		  (getSubsetting_OwningFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/owningType")
		   });
		addAnnotation
		  (getFeatureTyping_TypedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/specific")
		   });
		addAnnotation
		  (getFeatureTyping_Type(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/general")
		   });
		addAnnotation
		  (getFeatureTyping_OwningFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/owningType")
		   });
		addAnnotation
		  (getTypeFeaturing_FeatureOfType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Featuring/feature")
		   });
		addAnnotation
		  (getTypeFeaturing_FeaturingType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target"),
			 URI.createURI(eNS_URI).appendFragment("//Featuring/type")
		   });
		addAnnotation
		  (getFeatureInverting_FeatureInverted(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getFeatureInverting_InvertingFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getFeatureChaining_ChainingFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getFeatureChaining_FeatureChained(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getReferenceSubsetting_ReferencedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Subsetting/subsettedFeature")
		   });
		addAnnotation
		  (getReferenceSubsetting_ReferencingFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Subsetting/subsettingFeature"),
			 URI.createURI(eNS_URI).appendFragment("//Subsetting/owningFeature")
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
		  (getIntersecting_IntersectingType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getIntersecting_TypeIntersected(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getDisjoining_TypeDisjoined(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getDisjoining_DisjoiningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getDifferencing_DifferencingType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getDifferencing_TypeDifferenced(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getSubclassification_Superclassifier(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/general")
		   });
		addAnnotation
		  (getSubclassification_OwningClassifier(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/owningType")
		   });
		addAnnotation
		  (getSubclassification_Subclassifier(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/specific")
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
		  (getConnector_ConnectorEnd(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/endFeature")
		   });
		addAnnotation
		  (getConnector_SourceFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getConnector_TargetFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
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
		  (getAssociation_SourceType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getAssociation_TargetType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
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
		  (getStep_Parameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/directedFeature")
		   });
		addAnnotation
		  (getBehavior_Parameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/directedFeature")
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
		  (getFeatureValue_Value(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OwningMembership/ownedMemberElement")
		   });
		addAnnotation
		  (getElementFilterMembership_Condition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OwningMembership/ownedMemberElement")
		   });
		addAnnotation
		  (getMultiplicityRange_Bound(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getParameterMembership_OwnedMemberParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature")
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
		  (getResultExpressionMembership_OwnedResultExpression(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature")
		   });
		addAnnotation
		  (getItemFlow_Interaction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Connector/association"),
			 URI.createURI(eNS_URI).appendFragment("//Step/behavior")
		   });
		addAnnotation
		  (getDependency_Client(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/source")
		   });
		addAnnotation
		  (getDependency_Supplier(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getMembershipImport_ImportedMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getNamespaceImport_ImportedNamespace(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/target")
		   });
		addAnnotation
		  (getActionUsage_ActionDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/behavior"),
			 URI.createURI(eNS_URI).appendFragment("//OccurrenceUsage/occurrenceDefinition")
		   });
		addAnnotation
		  (getOccurrenceUsage_OccurrenceDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/definition")
		   });
		addAnnotation
		  (getUsage_Definition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/type")
		   });
		addAnnotation
		  (getVariantMembership_OwnedVariantUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OwningMembership/ownedMemberElement")
		   });
		addAnnotation
		  (getAttributeUsage_AttributeDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/definition")
		   });
		addAnnotation
		  (getEnumerationUsage_EnumerationDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AttributeUsage/attributeDefinition")
		   });
		addAnnotation
		  (getEnumerationDefinition_EnumeratedValue(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/variant")
		   });
		addAnnotation
		  (getPortUsage_PortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OccurrenceUsage/occurrenceDefinition")
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
		  (getFlowConnectionUsage_FlowConnectionDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionUsage/actionDefinition"),
			 URI.createURI(eNS_URI).appendFragment("//ConnectionUsage/connectionDefinition"),
			 URI.createURI(eNS_URI).appendFragment("//ItemFlow/interaction")
		   });
		addAnnotation
		  (getConnectionUsage_ConnectionDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Connector/association")
		   });
		addAnnotation
		  (getInterfaceUsage_InterfaceDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConnectionUsage/connectionDefinition")
		   });
		addAnnotation
		  (getInterfaceDefinition_InterfaceEnd(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConnectionDefinition/connectionEnd")
		   });
		addAnnotation
		  (getConnectionDefinition_ConnectionEnd(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Association/associationEnd")
		   });
		addAnnotation
		  (getAllocationUsage_AllocationDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConnectionUsage/connectionDefinition")
		   });
		addAnnotation
		  (getStateUsage_StateDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionUsage/actionDefinition")
		   });
		addAnnotation
		  (getCalculationUsage_CalculationDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Expression/function"),
			 URI.createURI(eNS_URI).appendFragment("//ActionUsage/actionDefinition")
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
		  (getRequirementUsage_RequirementDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ConstraintUsage/constraintDefinition")
		   });
		addAnnotation
		  (getRequirementUsage_ReqId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/declaredShortName")
		   });
		addAnnotation
		  (getRequirementDefinition_ReqId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/declaredShortName")
		   });
		addAnnotation
		  (getConcernUsage_ConcernDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RequirementUsage/requirementDefinition")
		   });
		addAnnotation
		  (getCaseUsage_CaseDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CalculationUsage/calculationDefinition")
		   });
		addAnnotation
		  (getAnalysisCaseUsage_AnalysisCaseDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CaseUsage/caseDefinition")
		   });
		addAnnotation
		  (getUseCaseUsage_UseCaseDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CaseUsage/caseDefinition")
		   });
		addAnnotation
		  (getViewUsage_ViewDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PartUsage/partDefinition")
		   });
		addAnnotation
		  (getViewpointUsage_ViewpointDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RequirementUsage/requirementDefinition")
		   });
		addAnnotation
		  (getRenderingUsage_RenderingDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PartUsage/partDefinition")
		   });
		addAnnotation
		  (getMetadataUsage_MetadataDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ItemUsage/itemDefinition"),
			 URI.createURI(eNS_URI).appendFragment("//MetadataFeature/metaclass")
		   });
		addAnnotation
		  (getStateSubactionMembership_Action(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature")
		   });
		addAnnotation
		  (getExhibitStateUsage_ExhibitedState(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PerformActionUsage/performedAction")
		   });
		addAnnotation
		  (getPerformActionUsage_PerformedAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//EventOccurrenceUsage/eventOccurrence")
		   });
		addAnnotation
		  (getTransitionFeatureMembership_TransitionFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature")
		   });
		addAnnotation
		  (getObjectiveMembership_OwnedObjectiveRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature")
		   });
		addAnnotation
		  (getIncludeUseCaseUsage_UseCaseIncluded(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PerformActionUsage/performedAction")
		   });
		addAnnotation
		  (getSatisfyRequirementUsage_SatisfiedRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AssertConstraintUsage/assertedConstraint")
		   });
		addAnnotation
		  (getActorMembership_OwnedActorParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ParameterMembership/ownedMemberParameter")
		   });
		addAnnotation
		  (getRequirementConstraintMembership_OwnedConstraint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature")
		   });
		addAnnotation
		  (getSubjectMembership_OwnedSubjectParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ParameterMembership/ownedMemberParameter")
		   });
		addAnnotation
		  (getFramedConcernMembership_OwnedConcern(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RequirementConstraintMembership/ownedConstraint")
		   });
		addAnnotation
		  (getFramedConcernMembership_ReferencedConcern(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RequirementConstraintMembership/referencedConstraint")
		   });
		addAnnotation
		  (getStakeholderMembership_OwnedStakeholderParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ParameterMembership/ownedMemberParameter")
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
		  (getRequirementVerificationMembership_OwnedRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RequirementConstraintMembership/ownedConstraint")
		   });
		addAnnotation
		  (getRequirementVerificationMembership_VerifiedRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RequirementConstraintMembership/referencedConstraint")
		   });
		addAnnotation
		  (getViewRenderingMembership_OwnedRendering(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureMembership/ownedMemberFeature")
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
		  (getUnioning_TypeUnioned(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
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
		  (getRelationship_OwningRelatedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
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
		  (getElement_OwningMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owningRelationship")
		   });
		addAnnotation
		  (getElement_Documentation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getElement_OwnedAnnotation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getElement_TextualRepresentation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/ownedRelatedElement")
		   });
		addAnnotation
		  (getMembership_MembershipOwningNamespace(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getNamespace_OwnedImport(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getNamespace_OwnedMember(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });
		addAnnotation
		  (getNamespace_ImportedMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/membership")
		   });
		addAnnotation
		  (getNamespace_OwnedMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/membership"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getImport_ImportOwningNamespace(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getDocumentation_DocumentedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getAnnotatingElement_OwnedAnnotatingRelationship(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//AnnotatingElement/annotation"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getAnnotation_OwningAnnotatedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Annotation/annotatedElement"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getAnnotation_OwningAnnotatingElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Annotation/annotatingElement"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getTextualRepresentation_RepresentedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getType_OwnedSpecialization(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getType_OwnedFeatureMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMembership"),
			 URI.createURI(eNS_URI).appendFragment("//Type/featureMembership")
		   });
		addAnnotation
		  (getType_OwnedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
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
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });
		addAnnotation
		  (getType_Input(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/directedFeature")
		   });
		addAnnotation
		  (getType_Output(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/directedFeature")
		   });
		addAnnotation
		  (getType_InheritedMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/membership")
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
		  (getType_OwnedConjugator(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
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
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getType_OwnedIntersecting(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getType_OwnedDisjoining(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getType_OwnedDifferencing(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getType_DirectedFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getType_OwnedUnioning(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getSpecialization_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Specialization/specific"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getFeaturing_Type(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getFeaturing_Feature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getFeature_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owningNamespace"),
			 URI.createURI(eNS_URI).appendFragment("//Feature/featuringType")
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
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedSpecialization")
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
		  (getFeature_EndOwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/owningType")
		   });
		addAnnotation
		  (getFeature_OwnedTyping(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedSpecialization")
		   });
		addAnnotation
		  (getFeature_OwnedTypeFeaturing(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getFeature_OwnedFeatureInverting(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getFeature_OwnedFeatureChaining(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedRelationship")
		   });
		addAnnotation
		  (getFeature_OwnedReferenceSubsetting(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/ownedSubsetting")
		   });
		addAnnotation
		  (getSubsetting_OwningFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Subsetting/subsettingFeature")
		   });
		addAnnotation
		  (getFeatureTyping_OwningFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FeatureTyping/typedFeature")
		   });
		addAnnotation
		  (getTypeFeaturing_OwningFeatureOfType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//TypeFeaturing/featureOfType"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getFeatureInverting_OwningFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement"),
			 URI.createURI(eNS_URI).appendFragment("//FeatureInverting/featureInverted")
		   });
		addAnnotation
		  (getFeatureChaining_FeatureChained(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getConjugation_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Conjugation/conjugatedType"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getIntersecting_TypeIntersected(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getDisjoining_OwningType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Disjoining/typeDisjoined"),
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getDifferencing_TypeDifferenced(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/owningRelatedElement")
		   });
		addAnnotation
		  (getClassifier_OwnedSubclassification(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedSpecialization")
		   });
		addAnnotation
		  (getConnector_SourceFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Connector/relatedFeature")
		   });
		addAnnotation
		  (getConnector_TargetFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Connector/relatedFeature")
		   });
		addAnnotation
		  (getAssociation_SourceType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Association/relatedType")
		   });
		addAnnotation
		  (getAssociation_TargetType(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Association/relatedType")
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
		  (getBehavior_Step(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
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
		  (getFunction_Expression(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/step")
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
		  (getFeatureValue_FeatureWithValue(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Membership/membershipOwningNamespace")
		   });
		addAnnotation
		  (getPackage_FilterCondition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
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
		  (getMetadataFeature_Metaclass(),
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
		  (getItemFlow_ItemFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
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
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });
		addAnnotation
		  (getFeatureChainExpression_TargetFeature(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
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
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getOccurrenceUsage_IndividualDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OccurrenceUsage/occurrenceDefinition")
		   });
		addAnnotation
		  (getUsage_Variant(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getUsage_VariantMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMembership")
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
		  (getUsage_OwningUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Feature/owningType")
		   });
		addAnnotation
		  (getUsage_NestedUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature"),
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage")
		   });
		addAnnotation
		  (getUsage_Usage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getUsage_DirectedUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage"),
			 URI.createURI(eNS_URI).appendFragment("//Type/directedFeature")
		   });
		addAnnotation
		  (getUsage_NestedReference(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_NestedAttribute(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_NestedEnumeration(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedAttribute")
		   });
		addAnnotation
		  (getUsage_NestedOccurrence(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_NestedItem(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedOccurrence")
		   });
		addAnnotation
		  (getUsage_NestedPart(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedItem")
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
		  (getUsage_NestedConnection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedPart")
		   });
		addAnnotation
		  (getUsage_NestedFlow(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedConnection")
		   });
		addAnnotation
		  (getUsage_NestedInterface(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedConnection")
		   });
		addAnnotation
		  (getUsage_NestedAllocation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedConnection")
		   });
		addAnnotation
		  (getUsage_NestedAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedOccurrence")
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
		  (getUsage_NestedTransition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedUsage")
		   });
		addAnnotation
		  (getUsage_NestedCalculation(),
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
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedOccurrence")
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
		  (getUsage_NestedConcern(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedRequirement")
		   });
		addAnnotation
		  (getUsage_NestedCase(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedCalculation")
		   });
		addAnnotation
		  (getUsage_NestedAnalysisCase(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedCase")
		   });
		addAnnotation
		  (getUsage_NestedVerificationCase(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedCase")
		   });
		addAnnotation
		  (getUsage_NestedUseCase(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedCase")
		   });
		addAnnotation
		  (getUsage_NestedView(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedPart")
		   });
		addAnnotation
		  (getUsage_NestedViewpoint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedRequirement")
		   });
		addAnnotation
		  (getUsage_NestedRendering(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedPart")
		   });
		addAnnotation
		  (getUsage_NestedMetadata(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedItem")
		   });
		addAnnotation
		  (getDefinition_Variant(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getDefinition_VariantMembership(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMembership")
		   });
		addAnnotation
		  (getDefinition_Usage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/feature")
		   });
		addAnnotation
		  (getDefinition_DirectedUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage"),
			 URI.createURI(eNS_URI).appendFragment("//Type/directedFeature")
		   });
		addAnnotation
		  (getDefinition_OwnedReference(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedAttribute(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedEnumeration(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedAttribute")
		   });
		addAnnotation
		  (getDefinition_OwnedOccurrence(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedUsage")
		   });
		addAnnotation
		  (getDefinition_OwnedItem(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedOccurrence")
		   });
		addAnnotation
		  (getDefinition_OwnedPart(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedItem")
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
		  (getDefinition_OwnedConnection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedPart")
		   });
		addAnnotation
		  (getDefinition_OwnedFlow(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedConnection")
		   });
		addAnnotation
		  (getDefinition_OwnedInterface(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedConnection")
		   });
		addAnnotation
		  (getDefinition_OwnedAllocation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedConnection")
		   });
		addAnnotation
		  (getDefinition_OwnedAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedOccurrence")
		   });
		addAnnotation
		  (getDefinition_OwnedState(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedAction")
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
		  (getDefinition_OwnedCalculation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedAction")
		   });
		addAnnotation
		  (getDefinition_OwnedConstraint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedOccurrence")
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
		  (getDefinition_OwnedConcern(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedRequirement")
		   });
		addAnnotation
		  (getDefinition_OwnedCase(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedCalculation")
		   });
		addAnnotation
		  (getDefinition_OwnedAnalysisCase(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedCase")
		   });
		addAnnotation
		  (getDefinition_OwnedVerificationCase(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedCase")
		   });
		addAnnotation
		  (getDefinition_OwnedUseCase(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedCase")
		   });
		addAnnotation
		  (getDefinition_OwnedView(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedPart")
		   });
		addAnnotation
		  (getDefinition_OwnedViewpoint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedRequirement")
		   });
		addAnnotation
		  (getDefinition_OwnedRendering(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedPart")
		   });
		addAnnotation
		  (getDefinition_OwnedMetadata(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedItem")
		   });
		addAnnotation
		  (getDefinition_OwnedUsage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature"),
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
		   });
		addAnnotation
		  (getItemUsage_ItemDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//OccurrenceUsage/occurrenceDefinition")
		   });
		addAnnotation
		  (getPartUsage_PartDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ItemUsage/itemDefinition")
		   });
		addAnnotation
		  (getOccurrenceDefinition_LifeClass(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getPortDefinition_ConjugatedPortDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getConnectionUsage_ConnectionDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ItemUsage/itemDefinition")
		   });
		addAnnotation
		  (getAllocationDefinition_Allocation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
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
		  (getRequirementUsage_SubjectParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage")
		   });
		addAnnotation
		  (getRequirementUsage_FramedConcern(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RequirementUsage/requiredConstraint")
		   });
		addAnnotation
		  (getRequirementUsage_ActorParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage"),
			 URI.createURI(eNS_URI).appendFragment("//Step/parameter")
		   });
		addAnnotation
		  (getRequirementUsage_StakeholderParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage")
		   });
		addAnnotation
		  (getRequirementDefinition_SubjectParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
		   });
		addAnnotation
		  (getRequirementDefinition_ActorParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage"),
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter")
		   });
		addAnnotation
		  (getRequirementDefinition_StakeholderParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
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
		  (getRequirementDefinition_FramedConcern(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RequirementDefinition/requiredConstraint")
		   });
		addAnnotation
		  (getCaseUsage_ObjectiveRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage")
		   });
		addAnnotation
		  (getCaseUsage_SubjectParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage")
		   });
		addAnnotation
		  (getCaseUsage_ActorParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Step/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage")
		   });
		addAnnotation
		  (getCaseDefinition_ObjectiveRequirement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
		   });
		addAnnotation
		  (getCaseDefinition_SubjectParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
		   });
		addAnnotation
		  (getCaseDefinition_ActorParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
		   });
		addAnnotation
		  (getCalculationDefinition_Calculation(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionDefinition/action"),
			 URI.createURI(eNS_URI).appendFragment("//Function/expression")
		   });
		addAnnotation
		  (getActionDefinition_Action(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/step"),
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
		   });
		addAnnotation
		  (getAnalysisCaseUsage_AnalysisAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/usage")
		   });
		addAnnotation
		  (getAnalysisCaseUsage_ResultExpression(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getAnalysisCaseDefinition_AnalysisAction(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionDefinition/action")
		   });
		addAnnotation
		  (getAnalysisCaseDefinition_ResultExpression(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Function/expression"),
			 URI.createURI(eNS_URI).appendFragment("//Type/ownedFeature")
		   });
		addAnnotation
		  (getVerificationCaseUsage_VerificationCaseDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//CaseUsage/caseDefinition")
		   });
		addAnnotation
		  (getViewUsage_SatisfiedViewpoint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedRequirement")
		   });
		addAnnotation
		  (getViewUsage_ExposedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });
		addAnnotation
		  (getViewUsage_ViewCondition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getViewDefinition_View(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
		   });
		addAnnotation
		  (getViewDefinition_SatisfiedViewpoint(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/ownedRequirement")
		   });
		addAnnotation
		  (getViewDefinition_ViewCondition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getRenderingDefinition_Rendering(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Definition/usage")
		   });
		addAnnotation
		  (getAcceptActionUsage_PayloadParameter(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Usage/nestedReference"),
			 URI.createURI(eNS_URI).appendFragment("//Step/parameter")
		   });
		addAnnotation
		  (getStateDefinition_State(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActionDefinition/action")
		   });
		addAnnotation
		  (getAssignmentActionUsage_Referent(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
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
		  (getUnioning_UnioningType(),
		   source,
		   new String[] {
			   "body", "unionedUnioning"
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
		  (getMembership_MemberElement(),
		   source,
		   new String[] {
			   "body", "membership"
		   });
		addAnnotation
		  (getNamespace_Membership(),
		   source,
		   new String[] {
			   "body", "membershipNamespace"
		   });
		addAnnotation
		  (getNamespace_Member(),
		   source,
		   new String[] {
			   "body", "namespace"
		   });
		addAnnotation
		  (getNamespace_ImportedMembership(),
		   source,
		   new String[] {
			   "body", "importingNamespace"
		   });
		addAnnotation
		  (getImport_ImportedElement(),
		   source,
		   new String[] {
			   "body", "membershipImport"
		   });
		addAnnotation
		  (getAnnotatingElement_AnnotatedElement(),
		   source,
		   new String[] {
			   "body", "annotatingElement"
		   });
		addAnnotation
		  (getAnnotation_AnnotatedElement(),
		   source,
		   new String[] {
			   "body", "annotation"
		   });
		addAnnotation
		  (getType_Feature(),
		   source,
		   new String[] {
			   "body", "typeWithFeature"
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
			   "body", "typeWithEndFeature"
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
		  (getType_UnioningType(),
		   source,
		   new String[] {
			   "body", "unionedType"
		   });
		addAnnotation
		  (getType_IntersectingType(),
		   source,
		   new String[] {
			   "body", "intersectedType"
		   });
		addAnnotation
		  (getType_FeatureMembership(),
		   source,
		   new String[] {
			   "body", "type"
		   });
		addAnnotation
		  (getType_DifferencingType(),
		   source,
		   new String[] {
			   "body", "differencedType"
		   });
		addAnnotation
		  (getType_DirectedFeature(),
		   source,
		   new String[] {
			   "body", "typeWithDirectedFeature"
		   });
		addAnnotation
		  (getSpecialization_General(),
		   source,
		   new String[] {
			   "body", "generalization"
		   });
		addAnnotation
		  (getSpecialization_Specific(),
		   source,
		   new String[] {
			   "body", "specialization"
		   });
		addAnnotation
		  (getFeaturing_Type(),
		   source,
		   new String[] {
			   "body", "featuringOfType"
		   });
		addAnnotation
		  (getFeaturing_Feature(),
		   source,
		   new String[] {
			   "body", "featuring"
		   });
		addAnnotation
		  (getFeature_Type(),
		   source,
		   new String[] {
			   "body", "typedFeature"
		   });
		addAnnotation
		  (getFeature_OwnedRedefinition(),
		   source,
		   new String[] {
			   "body", "owningFeature"
		   });
		addAnnotation
		  (getFeature_FeaturingType(),
		   source,
		   new String[] {
			   "body", "featureOfType"
		   });
		addAnnotation
		  (getFeature_ChainingFeature(),
		   source,
		   new String[] {
			   "body", "chainedFeature"
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
			   "body", "supersetting"
		   });
		addAnnotation
		  (getSubsetting_SubsettingFeature(),
		   source,
		   new String[] {
			   "body", "subsetting"
		   });
		addAnnotation
		  (getFeatureTyping_TypedFeature(),
		   source,
		   new String[] {
			   "body", "typing"
		   });
		addAnnotation
		  (getFeatureTyping_Type(),
		   source,
		   new String[] {
			   "body", "typingByType"
		   });
		addAnnotation
		  (getTypeFeaturing_FeatureOfType(),
		   source,
		   new String[] {
			   "body", "typeFeaturing"
		   });
		addAnnotation
		  (getTypeFeaturing_FeaturingType(),
		   source,
		   new String[] {
			   "body", "typeFeaturingOfType"
		   });
		addAnnotation
		  (getFeatureInverting_FeatureInverted(),
		   source,
		   new String[] {
			   "body", "invertingFeatureInverting"
		   });
		addAnnotation
		  (getFeatureInverting_InvertingFeature(),
		   source,
		   new String[] {
			   "body", "invertedFeatureInverting"
		   });
		addAnnotation
		  (getFeatureChaining_ChainingFeature(),
		   source,
		   new String[] {
			   "body", "chainedFeatureChaining"
		   });
		addAnnotation
		  (getReferenceSubsetting_ReferencedFeature(),
		   source,
		   new String[] {
			   "body", "referencing"
		   });
		addAnnotation
		  (getConjugation_OriginalType(),
		   source,
		   new String[] {
			   "body", "conjugation"
		   });
		addAnnotation
		  (getConjugation_ConjugatedType(),
		   source,
		   new String[] {
			   "body", "conjugator"
		   });
		addAnnotation
		  (getIntersecting_IntersectingType(),
		   source,
		   new String[] {
			   "body", "intersectedIntersecting"
		   });
		addAnnotation
		  (getDisjoining_TypeDisjoined(),
		   source,
		   new String[] {
			   "body", "disjoiningTypeDisjoining"
		   });
		addAnnotation
		  (getDisjoining_DisjoiningType(),
		   source,
		   new String[] {
			   "body", "disjoinedTypeDisjoining"
		   });
		addAnnotation
		  (getDifferencing_DifferencingType(),
		   source,
		   new String[] {
			   "body", "differencedDifferencing"
		   });
		addAnnotation
		  (getSubclassification_Superclassifier(),
		   source,
		   new String[] {
			   "body", "superclassification"
		   });
		addAnnotation
		  (getSubclassification_Subclassifier(),
		   source,
		   new String[] {
			   "body", "subclassification"
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
		  (getConnector_SourceFeature(),
		   source,
		   new String[] {
			   "body", "sourceConnector"
		   });
		addAnnotation
		  (getConnector_TargetFeature(),
		   source,
		   new String[] {
			   "body", "targetConnector"
		   });
		addAnnotation
		  (getAssociation_RelatedType(),
		   source,
		   new String[] {
			   "body", "association"
		   });
		addAnnotation
		  (getAssociation_SourceType(),
		   source,
		   new String[] {
			   "body", "sourceAssociation"
		   });
		addAnnotation
		  (getAssociation_TargetType(),
		   source,
		   new String[] {
			   "body", "targetAssociation"
		   });
		addAnnotation
		  (getAssociation_AssociationEnd(),
		   source,
		   new String[] {
			   "body", "associationWithEnd"
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
		  (getExpression_Function(),
		   source,
		   new String[] {
			   "body", "typedExpression"
		   });
		addAnnotation
		  (getExpression_Result(),
		   source,
		   new String[] {
			   "body", "computingExpression"
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
		  (getFeatureValue_FeatureWithValue(),
		   source,
		   new String[] {
			   "body", "valuation"
		   });
		addAnnotation
		  (getFeatureValue_Value(),
		   source,
		   new String[] {
			   "body", "expressedValuation"
		   });
		addAnnotation
		  (getElementFilterMembership_Condition(),
		   source,
		   new String[] {
			   "body", "owningFilter"
		   });
		addAnnotation
		  (getPackage_FilterCondition(),
		   source,
		   new String[] {
			   "body", "conditionedPackage"
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
		  (getParameterMembership_OwnedMemberParameter(),
		   source,
		   new String[] {
			   "body", "owningParameterMembership"
		   });
		addAnnotation
		  (getBooleanExpression_Predicate(),
		   source,
		   new String[] {
			   "body", "typedBooleanExpression"
		   });
		addAnnotation
		  (getResultExpressionMembership_OwnedResultExpression(),
		   source,
		   new String[] {
			   "body", "owningResultExpressionMembership"
		   });
		addAnnotation
		  (getMetadataFeature_Metaclass(),
		   source,
		   new String[] {
			   "body", "typedMetadata"
		   });
		addAnnotation
		  (getItemFlow_ItemType(),
		   source,
		   new String[] {
			   "body", "itemFlowForType"
		   });
		addAnnotation
		  (getItemFlow_TargetInputFeature(),
		   source,
		   new String[] {
			   "body", "itemFlowToInput"
		   });
		addAnnotation
		  (getItemFlow_SourceOutputFeature(),
		   source,
		   new String[] {
			   "body", "itemFlowFromOutput"
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
			   "body", "referenceExpression"
		   });
		addAnnotation
		  (getMetadataAccessExpression_ReferencedElement(),
		   source,
		   new String[] {
			   "body", "accessExpression"
		   });
		addAnnotation
		  (getFeatureChainExpression_TargetFeature(),
		   source,
		   new String[] {
			   "body", "chainExpression"
		   });
		addAnnotation
		  (getDependency_Client(),
		   source,
		   new String[] {
			   "body", "clientDependency"
		   });
		addAnnotation
		  (getDependency_Supplier(),
		   source,
		   new String[] {
			   "body", "supplierDependency"
		   });
		addAnnotation
		  (getMembershipImport_ImportedMembership(),
		   source,
		   new String[] {
			   "body", "import"
		   });
		addAnnotation
		  (getNamespaceImport_ImportedNamespace(),
		   source,
		   new String[] {
			   "body", "import"
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
		  (getActionUsage_ActionDefinition(),
		   source,
		   new String[] {
			   "body", "definedAction"
		   });
		addAnnotation
		  (getOccurrenceUsage_OccurrenceDefinition(),
		   source,
		   new String[] {
			   "body", "definedOccurrence"
		   });
		addAnnotation
		  (getOccurrenceUsage_IndividualDefinition(),
		   source,
		   new String[] {
			   "body", "individualUsage"
		   });
		addAnnotation
		  (getUsage_Variant(),
		   source,
		   new String[] {
			   "body", "owningVariationUsage"
		   });
		addAnnotation
		  (getUsage_VariantMembership(),
		   source,
		   new String[] {
			   "body", "owningVariationUsage"
		   });
		addAnnotation
		  (getUsage_Definition(),
		   source,
		   new String[] {
			   "body", "definedUsage"
		   });
		addAnnotation
		  (getUsage_Usage(),
		   source,
		   new String[] {
			   "body", "featuringUsage"
		   });
		addAnnotation
		  (getUsage_DirectedUsage(),
		   source,
		   new String[] {
			   "body", "usageWithDirectedUsage"
		   });
		addAnnotation
		  (getUsage_NestedReference(),
		   source,
		   new String[] {
			   "body", "referenceOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedAttribute(),
		   source,
		   new String[] {
			   "body", "attributeOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedEnumeration(),
		   source,
		   new String[] {
			   "body", "enumerationOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedOccurrence(),
		   source,
		   new String[] {
			   "body", "occurrenceOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedItem(),
		   source,
		   new String[] {
			   "body", "itemOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedPart(),
		   source,
		   new String[] {
			   "body", "partOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedPort(),
		   source,
		   new String[] {
			   "body", "portOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedConnection(),
		   source,
		   new String[] {
			   "body", "connectionOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedFlow(),
		   source,
		   new String[] {
			   "body", "flowOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedInterface(),
		   source,
		   new String[] {
			   "body", "interfaceOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedAllocation(),
		   source,
		   new String[] {
			   "body", "allocationOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedAction(),
		   source,
		   new String[] {
			   "body", "actionOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedState(),
		   source,
		   new String[] {
			   "body", "stateOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedTransition(),
		   source,
		   new String[] {
			   "body", "transitionOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedCalculation(),
		   source,
		   new String[] {
			   "body", "calculationOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedConstraint(),
		   source,
		   new String[] {
			   "body", "constraintOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedRequirement(),
		   source,
		   new String[] {
			   "body", "requirementOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedConcern(),
		   source,
		   new String[] {
			   "body", "concernOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedCase(),
		   source,
		   new String[] {
			   "body", "caseOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedAnalysisCase(),
		   source,
		   new String[] {
			   "body", "analysisCaseOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedVerificationCase(),
		   source,
		   new String[] {
			   "body", "verificationCaseOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedUseCase(),
		   source,
		   new String[] {
			   "body", "useCaseOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedView(),
		   source,
		   new String[] {
			   "body", "viewOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedViewpoint(),
		   source,
		   new String[] {
			   "body", "viewpointOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedRendering(),
		   source,
		   new String[] {
			   "body", "renderingOwningUsage"
		   });
		addAnnotation
		  (getUsage_NestedMetadata(),
		   source,
		   new String[] {
			   "body", "metadataOwningUsage"
		   });
		addAnnotation
		  (getVariantMembership_OwnedVariantUsage(),
		   source,
		   new String[] {
			   "body", "owningVariantMembership"
		   });
		addAnnotation
		  (getDefinition_Variant(),
		   source,
		   new String[] {
			   "body", "owningVariationDefinition"
		   });
		addAnnotation
		  (getDefinition_VariantMembership(),
		   source,
		   new String[] {
			   "body", "owningVariationDefinition"
		   });
		addAnnotation
		  (getDefinition_Usage(),
		   source,
		   new String[] {
			   "body", "featuringDefinition"
		   });
		addAnnotation
		  (getDefinition_DirectedUsage(),
		   source,
		   new String[] {
			   "body", "definitionWithDirectedUsage"
		   });
		addAnnotation
		  (getDefinition_OwnedReference(),
		   source,
		   new String[] {
			   "body", "referenceOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedAttribute(),
		   source,
		   new String[] {
			   "body", "attributeOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedEnumeration(),
		   source,
		   new String[] {
			   "body", "enumerationOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedOccurrence(),
		   source,
		   new String[] {
			   "body", "occurrenceOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedItem(),
		   source,
		   new String[] {
			   "body", "itemOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedPart(),
		   source,
		   new String[] {
			   "body", "partOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedPort(),
		   source,
		   new String[] {
			   "body", "portOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedConnection(),
		   source,
		   new String[] {
			   "body", "connectionOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedFlow(),
		   source,
		   new String[] {
			   "body", "flowOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedInterface(),
		   source,
		   new String[] {
			   "body", "interfaceOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedAllocation(),
		   source,
		   new String[] {
			   "body", "allocationOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedAction(),
		   source,
		   new String[] {
			   "body", "actionOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedState(),
		   source,
		   new String[] {
			   "body", "stateOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedTransition(),
		   source,
		   new String[] {
			   "body", "transitionOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedCalculation(),
		   source,
		   new String[] {
			   "body", "calculationOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedConstraint(),
		   source,
		   new String[] {
			   "body", "constraintOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedRequirement(),
		   source,
		   new String[] {
			   "body", "requirementOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedConcern(),
		   source,
		   new String[] {
			   "body", "concernOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedCase(),
		   source,
		   new String[] {
			   "body", "caseOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedAnalysisCase(),
		   source,
		   new String[] {
			   "body", "analysisCaseOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedVerificationCase(),
		   source,
		   new String[] {
			   "body", "verificationCaseOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedUseCase(),
		   source,
		   new String[] {
			   "body", "useCaseOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedView(),
		   source,
		   new String[] {
			   "body", "viewOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedViewpoint(),
		   source,
		   new String[] {
			   "body", "viewpointOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedRendering(),
		   source,
		   new String[] {
			   "body", "redenderingOwningDefinition"
		   });
		addAnnotation
		  (getDefinition_OwnedMetadata(),
		   source,
		   new String[] {
			   "body", "metadataOwningDefinition"
		   });
		addAnnotation
		  (getAttributeUsage_AttributeDefinition(),
		   source,
		   new String[] {
			   "body", "definedAttribute"
		   });
		addAnnotation
		  (getEnumerationUsage_EnumerationDefinition(),
		   source,
		   new String[] {
			   "body", "definedEnumeration"
		   });
		addAnnotation
		  (getEnumerationDefinition_EnumeratedValue(),
		   source,
		   new String[] {
			   "body", "owningEnumerationDefinition"
		   });
		addAnnotation
		  (getItemUsage_ItemDefinition(),
		   source,
		   new String[] {
			   "body", "definedItem"
		   });
		addAnnotation
		  (getPartUsage_PartDefinition(),
		   source,
		   new String[] {
			   "body", "definedPart"
		   });
		addAnnotation
		  (getOccurrenceDefinition_LifeClass(),
		   source,
		   new String[] {
			   "body", "individualDefinition"
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
		  (getFlowConnectionUsage_FlowConnectionDefinition(),
		   source,
		   new String[] {
			   "body", "definedFlowConnection"
		   });
		addAnnotation
		  (getConnectionUsage_ConnectionDefinition(),
		   source,
		   new String[] {
			   "body", "definedConnection"
		   });
		addAnnotation
		  (getInterfaceUsage_InterfaceDefinition(),
		   source,
		   new String[] {
			   "body", "definedInterface"
		   });
		addAnnotation
		  (getInterfaceDefinition_InterfaceEnd(),
		   source,
		   new String[] {
			   "body", "interfaceDefinitionWithEnd"
		   });
		addAnnotation
		  (getConnectionDefinition_ConnectionEnd(),
		   source,
		   new String[] {
			   "body", "connectionDefinitionWithEnd"
		   });
		addAnnotation
		  (getAllocationUsage_AllocationDefinition(),
		   source,
		   new String[] {
			   "body", "definedAllocation"
		   });
		addAnnotation
		  (getAllocationDefinition_Allocation(),
		   source,
		   new String[] {
			   "body", "featuringAllocationDefinition"
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
		  (getCalculationUsage_CalculationDefinition(),
		   source,
		   new String[] {
			   "body", "definedCalculation"
		   });
		addAnnotation
		  (getConstraintUsage_ConstraintDefinition(),
		   source,
		   new String[] {
			   "body", "definedConstraint"
		   });
		addAnnotation
		  (getRequirementUsage_RequirementDefinition(),
		   source,
		   new String[] {
			   "body", "definedRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_RequiredConstraint(),
		   source,
		   new String[] {
			   "body", "requiringRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_AssumedConstraint(),
		   source,
		   new String[] {
			   "body", "assumingRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_SubjectParameter(),
		   source,
		   new String[] {
			   "body", "subjectOwningRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_FramedConcern(),
		   source,
		   new String[] {
			   "body", "framingRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_ActorParameter(),
		   source,
		   new String[] {
			   "body", "actorOwningRequirement"
		   });
		addAnnotation
		  (getRequirementUsage_StakeholderParameter(),
		   source,
		   new String[] {
			   "body", "stakholderOwningRequirement"
		   });
		addAnnotation
		  (getRequirementDefinition_SubjectParameter(),
		   source,
		   new String[] {
			   "body", "subjectOwningRequirementDefinition"
		   });
		addAnnotation
		  (getRequirementDefinition_ActorParameter(),
		   source,
		   new String[] {
			   "body", "actorOwningRequirementDefinition"
		   });
		addAnnotation
		  (getRequirementDefinition_StakeholderParameter(),
		   source,
		   new String[] {
			   "body", "stakholderOwiningRequirementDefinition"
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
		  (getRequirementDefinition_FramedConcern(),
		   source,
		   new String[] {
			   "body", "framingRequirementDefinition"
		   });
		addAnnotation
		  (getConcernUsage_ConcernDefinition(),
		   source,
		   new String[] {
			   "body", "definedConcern"
		   });
		addAnnotation
		  (getCaseUsage_ObjectiveRequirement(),
		   source,
		   new String[] {
			   "body", "objectiveOwningCase"
		   });
		addAnnotation
		  (getCaseUsage_CaseDefinition(),
		   source,
		   new String[] {
			   "body", "definedCase"
		   });
		addAnnotation
		  (getCaseUsage_SubjectParameter(),
		   source,
		   new String[] {
			   "body", "subjectOwningCase"
		   });
		addAnnotation
		  (getCaseUsage_ActorParameter(),
		   source,
		   new String[] {
			   "body", "actorOwningCase"
		   });
		addAnnotation
		  (getCaseDefinition_ObjectiveRequirement(),
		   source,
		   new String[] {
			   "body", "objectiveOwningCaseDefinition"
		   });
		addAnnotation
		  (getCaseDefinition_SubjectParameter(),
		   source,
		   new String[] {
			   "body", "subjectOwningCaseDefinition"
		   });
		addAnnotation
		  (getCaseDefinition_ActorParameter(),
		   source,
		   new String[] {
			   "body", "actorOwningCaseDefinition"
		   });
		addAnnotation
		  (getCalculationDefinition_Calculation(),
		   source,
		   new String[] {
			   "body", "featuringCalculationDefinition"
		   });
		addAnnotation
		  (getActionDefinition_Action(),
		   source,
		   new String[] {
			   "body", "featuringActionDefinition"
		   });
		addAnnotation
		  (getAnalysisCaseUsage_AnalysisAction(),
		   source,
		   new String[] {
			   "body", "featuringAnalysisCase"
		   });
		addAnnotation
		  (getAnalysisCaseUsage_AnalysisCaseDefinition(),
		   source,
		   new String[] {
			   "body", "definedAnalysisCase"
		   });
		addAnnotation
		  (getAnalysisCaseUsage_ResultExpression(),
		   source,
		   new String[] {
			   "body", "analysisCase"
		   });
		addAnnotation
		  (getAnalysisCaseDefinition_AnalysisAction(),
		   source,
		   new String[] {
			   "body", "featuringAnalysisCaseDefinition"
		   });
		addAnnotation
		  (getAnalysisCaseDefinition_ResultExpression(),
		   source,
		   new String[] {
			   "body", "analysisCaseDefintion"
		   });
		addAnnotation
		  (getVerificationCaseUsage_VerificationCaseDefinition(),
		   source,
		   new String[] {
			   "body", "definedVerificationCase"
		   });
		addAnnotation
		  (getVerificationCaseUsage_VerifiedRequirement(),
		   source,
		   new String[] {
			   "body", "verifyingCase"
		   });
		addAnnotation
		  (getVerificationCaseDefinition_VerifiedRequirement(),
		   source,
		   new String[] {
			   "body", "verifyingCaseDefinition"
		   });
		addAnnotation
		  (getUseCaseUsage_UseCaseDefinition(),
		   source,
		   new String[] {
			   "body", "definedUseCase"
		   });
		addAnnotation
		  (getUseCaseUsage_IncludedUseCase(),
		   source,
		   new String[] {
			   "body", "includingUseCase"
		   });
		addAnnotation
		  (getUseCaseDefinition_IncludedUseCase(),
		   source,
		   new String[] {
			   "body", "includingUseCaseDefinition"
		   });
		addAnnotation
		  (getViewUsage_ViewDefinition(),
		   source,
		   new String[] {
			   "body", "definedView"
		   });
		addAnnotation
		  (getViewUsage_SatisfiedViewpoint(),
		   source,
		   new String[] {
			   "body", "viewpointSatisfyingView"
		   });
		addAnnotation
		  (getViewUsage_ExposedElement(),
		   source,
		   new String[] {
			   "body", "exposingView"
		   });
		addAnnotation
		  (getViewUsage_ViewRendering(),
		   source,
		   new String[] {
			   "body", "renderingOwningView"
		   });
		addAnnotation
		  (getViewUsage_ViewCondition(),
		   source,
		   new String[] {
			   "body", "owningView"
		   });
		addAnnotation
		  (getViewDefinition_View(),
		   source,
		   new String[] {
			   "body", "featuringView"
		   });
		addAnnotation
		  (getViewDefinition_SatisfiedViewpoint(),
		   source,
		   new String[] {
			   "body", "viewpointSatisfyingViewDefinition"
		   });
		addAnnotation
		  (getViewDefinition_ViewRendering(),
		   source,
		   new String[] {
			   "body", "renderingOwningViewDefinition"
		   });
		addAnnotation
		  (getViewDefinition_ViewCondition(),
		   source,
		   new String[] {
			   "body", "owningViewDefinition"
		   });
		addAnnotation
		  (getViewpointUsage_ViewpointDefinition(),
		   source,
		   new String[] {
			   "body", "definedViewpoint"
		   });
		addAnnotation
		  (getViewpointUsage_ViewpointStakeholder(),
		   source,
		   new String[] {
			   "body", "viewpointForStakeholder"
		   });
		addAnnotation
		  (getViewpointDefinition_ViewpointStakeholder(),
		   source,
		   new String[] {
			   "body", "viewpointDefinitionForStakeholder"
		   });
		addAnnotation
		  (getRenderingUsage_RenderingDefinition(),
		   source,
		   new String[] {
			   "body", "definedRendering"
		   });
		addAnnotation
		  (getRenderingDefinition_Rendering(),
		   source,
		   new String[] {
			   "body", "featuringRenderingDefinition"
		   });
		addAnnotation
		  (getMetadataUsage_MetadataDefinition(),
		   source,
		   new String[] {
			   "body", "definedMetadata"
		   });
		addAnnotation
		  (getAcceptActionUsage_ReceiverArgument(),
		   source,
		   new String[] {
			   "body", "acceptActionUsage"
		   });
		addAnnotation
		  (getAcceptActionUsage_PayloadParameter(),
		   source,
		   new String[] {
			   "body", "owningAcceptActionUsage"
		   });
		addAnnotation
		  (getAcceptActionUsage_PayloadArgument(),
		   source,
		   new String[] {
			   "body", "acceptingActionUsage"
		   });
		addAnnotation
		  (getStateSubactionMembership_Action(),
		   source,
		   new String[] {
			   "body", "stateSubactionMembership"
		   });
		addAnnotation
		  (getExhibitStateUsage_ExhibitedState(),
		   source,
		   new String[] {
			   "body", "exhibitingState"
		   });
		addAnnotation
		  (getPerformActionUsage_PerformedAction(),
		   source,
		   new String[] {
			   "body", "performingAction"
		   });
		addAnnotation
		  (getEventOccurrenceUsage_EventOccurrence(),
		   source,
		   new String[] {
			   "body", "referencingOccurrence"
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
		  (getTransitionFeatureMembership_TransitionFeature(),
		   source,
		   new String[] {
			   "body", "transitionFeatureMembership"
		   });
		addAnnotation
		  (getObjectiveMembership_OwnedObjectiveRequirement(),
		   source,
		   new String[] {
			   "body", "owningObjectiveMembership"
		   });
		addAnnotation
		  (getIfActionUsage_ElseAction(),
		   source,
		   new String[] {
			   "body", "ifElseAction"
		   });
		addAnnotation
		  (getIfActionUsage_ThenAction(),
		   source,
		   new String[] {
			   "body", "ifThenAction"
		   });
		addAnnotation
		  (getIfActionUsage_IfArgument(),
		   source,
		   new String[] {
			   "body", "ifAction"
		   });
		addAnnotation
		  (getForLoopActionUsage_SeqArgument(),
		   source,
		   new String[] {
			   "body", "forLoopAction"
		   });
		addAnnotation
		  (getForLoopActionUsage_LoopVariable(),
		   source,
		   new String[] {
			   "body", "forLoopAction"
		   });
		addAnnotation
		  (getLoopActionUsage_BodyAction(),
		   source,
		   new String[] {
			   "body", "loopAction"
		   });
		addAnnotation
		  (getAssignmentActionUsage_TargetArgument(),
		   source,
		   new String[] {
			   "body", "assignmentAction"
		   });
		addAnnotation
		  (getAssignmentActionUsage_ValueExpression(),
		   source,
		   new String[] {
			   "body", "assigningAction"
		   });
		addAnnotation
		  (getAssignmentActionUsage_Referent(),
		   source,
		   new String[] {
			   "body", "assignment"
		   });
		addAnnotation
		  (getSendActionUsage_ReceiverArgument(),
		   source,
		   new String[] {
			   "body", "sendActionUsage"
		   });
		addAnnotation
		  (getSendActionUsage_PayloadArgument(),
		   source,
		   new String[] {
			   "body", "sendingActionUsage"
		   });
		addAnnotation
		  (getSendActionUsage_SenderArgument(),
		   source,
		   new String[] {
			   "body", "senderActionUsage"
		   });
		addAnnotation
		  (getWhileLoopActionUsage_WhileArgument(),
		   source,
		   new String[] {
			   "body", "whileLoopAction"
		   });
		addAnnotation
		  (getWhileLoopActionUsage_UntilArgument(),
		   source,
		   new String[] {
			   "body", "untilLoopAction"
		   });
		addAnnotation
		  (getIncludeUseCaseUsage_UseCaseIncluded(),
		   source,
		   new String[] {
			   "body", "useCaseInclusion"
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
		  (getAssertConstraintUsage_AssertedConstraint(),
		   source,
		   new String[] {
			   "body", "constraintAssertion"
		   });
		addAnnotation
		  (getActorMembership_OwnedActorParameter(),
		   source,
		   new String[] {
			   "body", "owningActorMembership"
		   });
		addAnnotation
		  (getRequirementConstraintMembership_OwnedConstraint(),
		   source,
		   new String[] {
			   "body", "requirementConstraintMembership"
		   });
		addAnnotation
		  (getRequirementConstraintMembership_ReferencedConstraint(),
		   source,
		   new String[] {
			   "body", "referencingConstraintMembership"
		   });
		addAnnotation
		  (getSubjectMembership_OwnedSubjectParameter(),
		   source,
		   new String[] {
			   "body", "owningSubjectMembership"
		   });
		addAnnotation
		  (getFramedConcernMembership_OwnedConcern(),
		   source,
		   new String[] {
			   "body", "framedConstraintMembership"
		   });
		addAnnotation
		  (getFramedConcernMembership_ReferencedConcern(),
		   source,
		   new String[] {
			   "body", "referencingConcernMembership"
		   });
		addAnnotation
		  (getStakeholderMembership_OwnedStakeholderParameter(),
		   source,
		   new String[] {
			   "body", "owningStakeholderMembership"
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
		  (getRequirementVerificationMembership_OwnedRequirement(),
		   source,
		   new String[] {
			   "body", "requirementVerificationMembership"
		   });
		addAnnotation
		  (getRequirementVerificationMembership_VerifiedRequirement(),
		   source,
		   new String[] {
			   "body", "requirementVerification"
		   });
		addAnnotation
		  (getViewRenderingMembership_OwnedRendering(),
		   source,
		   new String[] {
			   "body", "viewRenderingMembership"
		   });
		addAnnotation
		  (getViewRenderingMembership_ReferencedRendering(),
		   source,
		   new String[] {
			   "body", "referencingRenderingMembership"
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
		  (getNamespace_Membership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMultiplicityRange_Bound(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.omg.org/spec/SysML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSysMLAnnotations() {
		String source = "http://www.omg.org/spec/SysML";
		addAnnotation
		  (getUnioning_TypeUnioned(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRelationship_RelatedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement__EscapedName(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement__EffectiveShortName(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement__EffectiveName(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement__LibraryNamespace(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_OwningMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_OwningNamespace(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_Owner(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_OwnedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_Documentation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_OwnedAnnotation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_TextualRepresentation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_ShortName(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_Name(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_QualifiedName(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_IsLibraryElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberElementId(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberShortName(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberName(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getOwningMembership_OwnedMemberElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMembership__IsDistinguishableFrom__Membership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMembership_MemberElementId(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMembership_MembershipOwningNamespace(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__NamesOf__Element(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__VisibilityOf__Membership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__VisibleMemberships__EList_boolean_boolean(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__ImportedMemberships__EList(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__Resolve__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__ResolveGlobal__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__ResolveLocal__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__ResolveVisible__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__QualificationOf__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace__UnqualifiedNameOf__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace_OwnedImport(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace_Member(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace_OwnedMember(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace_ImportedMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getNamespace_OwnedMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getImport__ImportedMemberships__EList(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getImport_ImportedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getImport_ImportOwningNamespace(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDocumentation_DocumentedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnnotatingElement_AnnotatedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnnotatingElement_OwnedAnnotatingRelationship(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnnotation_OwningAnnotatedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnnotation_OwningAnnotatingElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTextualRepresentation_RepresentedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType__InheritedMemberships__EList(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType__DirectionOf__Feature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType__DirectionOfExcluding__Feature_EList(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType__AllSupertypes(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType__Specializes__Type(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType__SpecializesFromLibrary__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedSpecialization(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedFeatureMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedEndFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_Feature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_Input(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_Output(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_InheritedMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_EndFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedConjugator(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_IsConjugated(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_InheritedFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_Multiplicity(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_UnioningType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedIntersecting(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_IntersectingType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedDisjoining(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_FeatureMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_DifferencingType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedDifferencing(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_DirectedFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getType_OwnedUnioning(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSpecialization_OwningType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureMembership_OwnedMemberFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureMembership_OwningType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature__DirectionFor__Type(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature__IsFeaturedWithin__Type(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature__NamingFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature__Redefines__Feature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature__RedefinesFromLibrary__String(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature__SubsetsChain__Feature_Feature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature__TypingFeatures(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwningType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_Type(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwnedRedefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwnedSubsetting(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwningFeatureMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_EndOwningType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwnedTyping(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_FeaturingType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwnedTypeFeaturing(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_ChainingFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwnedFeatureInverting(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwnedFeatureChaining(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeature_OwnedReferenceSubsetting(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSubsetting_OwningFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureTyping_OwningFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTypeFeaturing_OwningFeatureOfType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureInverting_OwningFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureChaining_FeatureChained(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getReferenceSubsetting_ReferencingFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConjugation_OwningType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getIntersecting_TypeIntersected(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDisjoining_OwningType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDifferencing_TypeDifferenced(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSubclassification_OwningClassifier(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getClassifier_OwnedSubclassification(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSuccession_TransitionStep(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSuccession_TriggerStep(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSuccession_EffectStep(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSuccession_GuardExpression(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConnector_RelatedFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConnector_Association(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConnector_ConnectorEnd(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConnector_SourceFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConnector_TargetFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAssociation_RelatedType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAssociation_SourceType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAssociation_TargetType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAssociation_AssociationEnd(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStep_Behavior(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStep_Parameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getBehavior_Step(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getBehavior_Parameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getExpression__ModelLevelEvaluable__EList(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getExpression__Evaluate__Element(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getExpression__CheckCondition__Element(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getExpression_Function(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getExpression_Result(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getExpression_IsModelLevelEvaluable(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFunction_Expression(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFunction_Result(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFunction_IsModelLevelEvaluable(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureValue_FeatureWithValue(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureValue_Value(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElementFilterMembership_Condition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPackage__IncludeAsMember__Element(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPackage_FilterCondition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMultiplicityRange__HasBounds__int_int(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMultiplicityRange__ValueOf__Expression(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMultiplicityRange_LowerBound(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMultiplicityRange_UpperBound(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getParameterMembership__ParameterDirection(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getParameterMembership_OwnedMemberParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getBooleanExpression_Predicate(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getResultExpressionMembership_OwnedResultExpression(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMetadataFeature__EvaluateFeature__Feature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMetadataFeature__IsSemantic(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMetadataFeature__IsSyntactic(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMetadataFeature__SyntaxElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMetadataFeature_Metaclass(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getItemFlow_ItemType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getItemFlow_TargetInputFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getItemFlow_SourceOutputFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getItemFlow_ItemFlowEnd(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getItemFlow_ItemFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getItemFlow_Interaction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getInvocationExpression_Argument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureReferenceExpression_Referent(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMetadataAccessExpression__MetaclassFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureChainExpression__SourceTargetFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFeatureChainExpression_TargetFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTransitionUsage__TriggerPayloadParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTransitionUsage_Source(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTransitionUsage_Target(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTransitionUsage_TriggerAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTransitionUsage_GuardExpression(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTransitionUsage_EffectAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTransitionUsage_Succession(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getActionUsage__InputParameters(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getActionUsage__InputParameter__int(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getActionUsage__Argument__int(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getActionUsage__IsSubactionUsage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getActionUsage_ActionDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getOccurrenceUsage_OccurrenceDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getOccurrenceUsage_IndividualDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_IsReference(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_Variant(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_VariantMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_OwningDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_OwningUsage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedUsage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_Definition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_Usage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_DirectedUsage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedReference(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedAttribute(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedEnumeration(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedOccurrence(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedItem(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedPart(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedPort(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedConnection(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedFlow(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedInterface(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedAllocation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedState(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedTransition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedCalculation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedConcern(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedAnalysisCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedVerificationCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedUseCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedView(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedViewpoint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedRendering(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUsage_NestedMetadata(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getVariantMembership_OwnedVariantUsage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_Variant(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_VariantMembership(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_Usage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_DirectedUsage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedReference(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedAttribute(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedEnumeration(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedOccurrence(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedItem(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedPart(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedPort(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedConnection(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedFlow(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedInterface(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedAllocation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedState(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedTransition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedCalculation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedConcern(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedAnalysisCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedVerificationCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedUseCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedView(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedViewpoint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedRendering(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedMetadata(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDefinition_OwnedUsage(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAttributeUsage_AttributeDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEnumerationUsage_EnumerationDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEnumerationDefinition_EnumeratedValue(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getItemUsage_ItemDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPartUsage_PartDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getOccurrenceDefinition_LifeClass(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPortUsage_PortDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPortDefinition_ConjugatedPortDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConjugatedPortDefinition_OwnedPortConjugator(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConjugatedPortDefinition_OriginalPortDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPortConjugation_ConjugatedPortDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFlowConnectionUsage_FlowConnectionDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConnectionUsage_ConnectionDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getInterfaceUsage_InterfaceDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getInterfaceDefinition_InterfaceEnd(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConnectionDefinition_ConnectionEnd(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAllocationUsage_AllocationDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAllocationDefinition_Allocation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateUsage__IsSubstateUsage__boolean(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateUsage_StateDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateUsage_EntryAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateUsage_DoAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateUsage_ExitAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCalculationUsage_CalculationDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConstraintUsage_ConstraintDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementUsage_RequirementDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementUsage_Text(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementUsage_RequiredConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementUsage_AssumedConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementUsage_SubjectParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementUsage_FramedConcern(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementUsage_ActorParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementUsage_StakeholderParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementDefinition_Text(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementDefinition_SubjectParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementDefinition_ActorParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementDefinition_StakeholderParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementDefinition_AssumedConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementDefinition_RequiredConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementDefinition_FramedConcern(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConcernUsage_ConcernDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCaseUsage_ObjectiveRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCaseUsage_CaseDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCaseUsage_SubjectParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCaseUsage_ActorParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCaseDefinition_ObjectiveRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCaseDefinition_SubjectParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCaseDefinition_ActorParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getCalculationDefinition_Calculation(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getActionDefinition_Action(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnalysisCaseUsage_AnalysisAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnalysisCaseUsage_AnalysisCaseDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnalysisCaseUsage_ResultExpression(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnalysisCaseDefinition_AnalysisAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAnalysisCaseDefinition_ResultExpression(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getVerificationCaseUsage_VerificationCaseDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getVerificationCaseUsage_VerifiedRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getVerificationCaseDefinition_VerifiedRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUseCaseUsage_UseCaseDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUseCaseUsage_IncludedUseCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUseCaseDefinition_IncludedUseCase(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewUsage__IncludeAsExposed__Element(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewUsage_ViewDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewUsage_SatisfiedViewpoint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewUsage_ExposedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewUsage_ViewRendering(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewUsage_ViewCondition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewDefinition_View(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewDefinition_SatisfiedViewpoint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewDefinition_ViewRendering(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewDefinition_ViewCondition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewpointUsage_ViewpointDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewpointUsage_ViewpointStakeholder(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewpointDefinition_ViewpointStakeholder(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRenderingUsage_RenderingDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRenderingDefinition_Rendering(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMetadataUsage_MetadataDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAcceptActionUsage__IsTriggerAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAcceptActionUsage_ReceiverArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAcceptActionUsage_PayloadParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAcceptActionUsage_PayloadArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateSubactionMembership_Action(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getExhibitStateUsage_ExhibitedState(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getPerformActionUsage_PerformedAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getEventOccurrenceUsage_EventOccurrence(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateDefinition_State(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateDefinition_EntryAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateDefinition_DoAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStateDefinition_ExitAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTransitionFeatureMembership_TransitionFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getObjectiveMembership_OwnedObjectiveRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getControlNode__MultiplicityHasBounds__Multiplicity_int_int(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getIfActionUsage_ElseAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getIfActionUsage_ThenAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getIfActionUsage_IfArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getForLoopActionUsage_SeqArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getForLoopActionUsage_LoopVariable(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getLoopActionUsage_BodyAction(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAssignmentActionUsage_TargetArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAssignmentActionUsage_ValueExpression(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAssignmentActionUsage_Referent(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSendActionUsage_ReceiverArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSendActionUsage_PayloadArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSendActionUsage_SenderArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getWhileLoopActionUsage_WhileArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getWhileLoopActionUsage_UntilArgument(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getIncludeUseCaseUsage_UseCaseIncluded(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSatisfyRequirementUsage_SatisfiedRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSatisfyRequirementUsage_SatisfyingFeature(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getAssertConstraintUsage_AssertedConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getActorMembership_OwnedActorParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementConstraintMembership_OwnedConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementConstraintMembership_ReferencedConstraint(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSubjectMembership_OwnedSubjectParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFramedConcernMembership_OwnedConcern(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getFramedConcernMembership_ReferencedConcern(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getStakeholderMembership_OwnedStakeholderParameter(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getConjugatedPortTyping_PortDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementVerificationMembership_OwnedRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRequirementVerificationMembership_VerifiedRequirement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewRenderingMembership_OwnedRendering(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getViewRenderingMembership_ReferencedRendering(),
		   source,
		   new String[] {
		   });
	}

} //SysMLPackageImpl
