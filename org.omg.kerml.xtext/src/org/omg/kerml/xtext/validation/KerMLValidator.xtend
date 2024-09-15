/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018-2024 Model Driven Solutions, Inc.
 * Copyright (c) 2020 California Institute of Technology/Jet Propulsion Laboratory
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Ed Seidewitz, MDS
 *  Miyako Wilson, JPL
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.validation

import java.util.List
import org.eclipse.xtext.validation.Check
import org.omg.sysml.lang.sysml.Type
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Connector
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.BindingConnector
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.InvocationExpression
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.FeatureReferenceExpression
import org.omg.sysml.lang.sysml.LiteralExpression
import org.omg.sysml.lang.sysml.NullExpression
import org.omg.sysml.lang.sysml.ElementFilterMembership
import org.omg.sysml.lang.sysml.ItemFlow
import org.omg.sysml.util.TypeUtil
import org.omg.sysml.util.ElementUtil
import org.omg.sysml.util.ExpressionUtil
import org.omg.sysml.util.FeatureUtil
import org.omg.sysml.util.NamespaceUtil
import org.eclipse.emf.ecore.EClass
import org.omg.sysml.lang.sysml.Classifier
import org.omg.sysml.lang.sysml.FeatureChaining
import org.omg.sysml.lang.sysml.Subsetting
import org.omg.sysml.lang.sysml.Redefinition
import org.omg.sysml.lang.sysml.LiteralInfinity
import org.omg.sysml.lang.sysml.LiteralInteger
import org.omg.sysml.lang.sysml.Multiplicity
import org.omg.sysml.lang.sysml.FeatureChainExpression
import org.omg.sysml.lang.sysml.MetadataFeature
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil
import org.omg.sysml.util.ImplicitGeneralizationMap
import org.omg.sysml.lang.sysml.OwningMembership
import org.omg.sysml.lang.sysml.ReferenceSubsetting
import org.eclipse.emf.ecore.EObject
import org.omg.sysml.lang.sysml.LiteralBoolean
import org.omg.sysml.lang.sysml.Expression
import org.omg.sysml.lang.sysml.OperatorExpression
import org.omg.sysml.expressions.util.EvaluationUtil
import org.omg.sysml.lang.sysml.LibraryPackage
import org.omg.sysml.lang.sysml.ItemFlowEnd
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.Association
import org.omg.sysml.lang.sysml.Specialization
import org.omg.sysml.lang.sysml.Conjugation
import org.omg.sysml.lang.sysml.Relationship
import org.omg.sysml.lang.sysml.DataType
import org.omg.sysml.lang.sysml.ParameterMembership
import org.omg.sysml.lang.sysml.Behavior
import org.omg.sysml.lang.sysml.Step
import org.omg.sysml.lang.sysml.ReturnParameterMembership
import org.omg.sysml.lang.sysml.Function
import org.omg.sysml.lang.sysml.ResultExpressionMembership
import org.omg.sysml.lang.sysml.ItemFeature
import org.eclipse.emf.ecore.EStructuralFeature
import org.omg.sysml.lang.sysml.FeatureValue
import org.omg.sysml.lang.sysml.MultiplicityRange
import org.eclipse.emf.ecore.resource.Resource
import org.omg.sysml.lang.sysml.FeatureDirectionKind
import org.omg.sysml.lang.sysml.Metaclass
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.VisibilityKind

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class KerMLValidator extends AbstractKerMLValidator {
	
	// ROOT //
	
	public static val INVALID_ELEMENT_IS_IMPLIED_INCLUDED = "validateElementIsImpliedIncluded"
	public static val INVALID_ELEMENT_IS_IMPLIED_INCLUDED_MSG = "Element cannot have implied relationships included"

	public static val INVALID_NAMESPACE_DISTINGUISHABILITY = "validateNamespaceDistinguishablity"
	public static val INVALID_NAMESPACE_DISTINGUISHABILITY_MSG = "Duplicate of other owned member name"
	public static val INVALID_NAMESPACE_DISTINGUISHABILITY_MSG_0 = "Duplicate of owned member name"
	public static val INVALID_NAMESPACE_DISTINGUISHABILITY_MSG_1 = "Duplicate of other alias name"
	public static val INVALID_NAMESPACE_DISTINGUISHABILITY_MSG_2 = "Duplicate of inherited member name"
	
	public static val INVALID_IMPORT_TOP_LEVEL_VISIBILITY = "validateImportTopLevelVisibility"
	public static val INVALID_IMPORT_TOP_LEVEL_VISIBILITY_MSG = "Top level import must be private"
	
	// CORE //
	
	public static val INVALID_SPECIALIZATION_SPECIFIC_NOT_CONJUGATED = "validateSpecializationSpecificNotConjugated"
	public static val INVALID_SPECIALIZATION_SPECIFIC_NOT_CONJUGATED_MSG = "Conjugated type cannot be a specialized type"	
	
	public static val INVALID_TYPE_AT_MOST_ONE_CONJUGATOR = "validateTypeAtMostOneConjugator"
	public static val INVALID_TYPE_AT_MOST_ONE_CONJUGATOR_MSG = "Cannot have more than one conjugator"
	public static val INVALID_TYPE_DIFFERENCING_TYPES_NOT_SELF = "validateTypeDifferencingTypesNotSelf"
	public static val INVALID_TYPE_DIFFERENCING_TYPES_NOT_SELF_MSG = "Type cannot difference with itself"		
	public static val INVALID_TYPE_INTERSECTING_TYPES_NOT_SELF = "validateTypeIntersectingTypesNotSelf"
	public static val INVALID_TYPE_INTERSECTING_TYPES_NOT_SELF_MSG = "Type cannot intersect with itself"
	public static val INVALID_TYPE_OWNED_DIFFERENCING_NOT_ONE = 'validateOwnedDifferencingNotOne'
	public static val INVALID_TYPE_OWNED_DIFFERENCING_NOT_ONE_MSG = 'Cannot have only one differencing'
	public static val INVALID_TYPE_OWNED_INTERSECTING_NOT_ONE = 'validateOwnedIntersectingNotOne'
	public static val INVALID_TYPE_OWNED_INTERSECTING_NOT_ONE_MSG = 'Cannot have only one intersecting'
	public static val INVALID_TYPE_OWNED_MULTIPLICITY = "validateTypeOwnedMultiplicity"
	public static val INVALID_TYPE_OWNED_MULTIPLICITY_MSG = "Only one multiplicity is allowed"
	public static val INVALID_TYPE_OWNED_UNIONING_NOT_ONE = 'validateOwnedUnioningNotOne'
	public static val INVALID_TYPE_OWNED_UNIONING_NOT_ONE_MSG = 'Cannot have only one unioning'
	public static val INVALID_TYPE_UNIONING_TYPES_NOT_SELF = "validateTypeUnioningTypesNotSelf"
	public static val INVALID_TYPE_UNIONING_TYPES_NOT_SELF_MSG = "Type cannot union with itself"	

	// Note: validateClassifierDefaultSupertype is not in the spec, but it is implied by semantic constraints on classifiers.
	public static val INVALID_CLASSIFIER_DEFAULT_SUPERTYPE = 'validateClassifierDefaultSupertype_'
	public static val INVALID_CLASSIFIER_DEFAULT_SUPERTYPE_MSG = "Must directly or indirectly specialize {supertype}"

	public static val INVALID_CLASSIFIER_MULTIPLICITY_DOMAIN = "validateClassifierMultiplicityDomain"
	public static val INVALID_CLASSIFIER_MULTIPLICITY_DOMAIN_MSG = "Multiplicity must not have a featuring type"

	// Note: validateFeatureHasType is not in the spec, but it is implied by semantic constraints on features.
	public static val INVALID_FEATURE_HAS_TYPE = 'validateFeatureHasType_'
	public static val INVALID_FEATURE_HAS_TYPE_MSG = "Features must have at least one type"

	public static val INVALID_FEATURE_CHAINING_FEATURES_NOT_SELF = "validateFeatureChainingFeaturesNotSelf"
	public static val INVALID_FEATURE_CHAINING_FEATURES_NOT_SELF_MSG = "Feature cannot have itself in a feature chain"
	public static val INVALID_FEATURE_CHAINING_FEATURE_NOT_ONE = "validateFeatureChainingFeatureNotOne"
	public static val INVALID_FEATURE_CHAINING_FEATURE_NOT_ONE_MSG = "Cannot have only one chaining feature"
	public static val INVALID_FEATURE_MULTIPLICITY_DOMAIN = "validateFeatureMultiplicityDomain"
	public static val INVALID_FEATURE_MULTIPLICITY_DOMAIN_MSG = "Multiplicity must have same featuring types as it feature"
	public static val INVALID_FEATURE_OWNED_REFERENCE_SUBSETTING = "validateFeatureOwnedReferenceSubsetting"
	public static val INVALID_FEATURE_OWNED_REFERENCE_SUBSETTING_MSG = "At most one reference subsetting is allowed"				

	public static val INVALID_FEATURE_CHAINING_FEATURE_CONFORMANCE = "validateFeatureChainingFeatureConformance"
	public static val INVALID_FEATURE_CHAINING__FEATURE_CONFORMANCE_MSG = "Must be a valid feature"

	public static val INVALID_REDEFINITION_DIRECTION_CONFORMANCE = "validateRedefinitionDirectionConformance"
	public static val INVALID_REDEFINITION_DIRECTION_CONFORMANCE_MSG = "Redefining feature must have a compatible direction"
	public static val INVALID_REDEFINITION_FEATURING_TYPES = 'validateRedefinitionFeaturingTypes'
	public static val INVALID_REDEFINITION_FEATURING_TYPES_MSG_1 = "A package-level feature cannot be redefined"
	public static val INVALID_REDEFINITION_FEATURING_TYPES_MSG_2 = "Owner of redefining feature cannot be the same as owner of redefined feature"
	public static val INVALID_REDEFINITION_MULTIPLICITY_CONFORMANCE = "validateRedefinitionMultiplicityConformance"
	public static val INVALID_REDEFINITION_MULTIPLICITY_CONFORMANCE_MSG = "Redefining feature should not have smaller multiplicity lower bound"

	public static val INVALID_SUBSETTING_FEATURING_TYPES = "validateSubsettingFeaturingTypes"
	public static val INVALID_SUBSETTING_FEATURING_TYPES_MSG = "Must be an accessible feature (use dot notation for nesting)"
	public static val INVALID_SUBSETTING_MULTIPLICITY_CONFORMANCE = "validateSubsettingMultiplicityConformance"
	public static val INVALID_SUBSETTING_MULTIPLICITY_CONFORMANCE_MSG = "Subsetting/redefining feature should not have larger multiplicity upper bound"
	public static val INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE = "validateSubsettingUniquenessConformance"
	public static val INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE_MSG = "Subsetting/redefining feature cannot be nonunique if subsetted/redefined feature is unique"
	
	// KERNEL //
	
	public static val INVALID_DATA_TYPE_SPECIALIZATION = "validateDataTypeSpecialization"
	public static val INVALID_DATA_TYPE_SPECIALIZATION_MSG = "Cannot specialize class or association"    
	
	public static val INVALID_CLASS_SPECIALIZATION = "validateClassSpecialization"
	public static val INVALID_CLASS_SPECIALIZATION_MSG = "Cannot specialize data type or association"    
	
	public static val INVALID_ASSOCIATION_BINARY_SPECIALIZATION = "validateAssociationBinarySpecialization"
	public static val INVALID_ASSOCIATION_BINARY_SPECIALIZATION_MSG = "Cannot have more than two ends"
	public static val INVALID_ASSOCIATION_RELATED_TYPES = "validateAssociationRelatedTypes"
	public static val INVALID_ASSOCIATION_RELATED_TYPES_MSG = "Must have at least two related elements"
	public static val INVALID_ASSOCIATION_STRUCTURE_INTERSECTION = "validateAssociationStructureIntersection"
	public static val INVALID_ASSOCIATION_STRUCTURE_INTERSECTION_MSG = "Must be an association structure"
		
	public static val INVALID_BINDING_CONNECTOR_TYPE_CONFORMANCE = "validateBindingConnectorTypeConformance"
	public static val INVALID_BINDING_CONNECTOR_TYPE_CONFORMANCE_MSG = "Bound features should have conforming types"
	public static val INVALID_BINDING_CONNECTOR_IS_BINARY = "validateBindingConnectorIsBinary"
	public static val INVALID_BINDING_CONNECTOR_IS_BINARY_MSG = "Binding connector must be binary"

	// Note: This check is not currently implemented.
	public static val INVALID_BINDING_CONNECTOR_ARGUMENT_TYPE_CONFORMANCE = "validateBindingConnectorArgumentTypeConformance"
	public static val INVALID_BINDING_CONNECTOR_ARGUMENT_TYPE_CONFORMANCE_MSG = "Output feature must conform to input feature"

	public static val INVALID_CONNECTOR_BINARY_SPECIALIZATION = "validateConnectorBinarySpecialization"
	public static val INVALID_CONNECTOR_BINARY_SPECIALIZATION_MSG = "Cannot have more than two ends"
	public static val INVALID_CONNECTOR_RELATED_FEATURES = "validateConnectorRelatedFeatures"
	public static val INVALID_CONNECTOR_RELATED_FEATURES_MSG = "Must have at least two related elements"
	public static val INVALID_CONNECTOR_TYPE_FEATURING = "validateConnectorTypeFeaturing"
	public static val INVALID_CONNECTOR_TYPE_FEATURING_MSG = "Should be an accessible feature (use dot notation for nesting)"
	
	public static val INVALID_PARAMETER_MEMBERSHIP_OWNING_TYPE = "validateParameterMembershipOwningType"
	public static val INVALID_PARAMETER_MEMBERSHIP_OWNING_TYPE_MSG = "Parameter membership not allowed"	
		
	public static val INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP = "validateExpressionResultExpressionMembership"
	public static val INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP_MSG = "Only one (owned or inherited) result expression is allowed"	
	public static val INVALID_EXPRESSION_RESULT_PARAMETER_MEMBERSHIP = "validateExpressionResultParameterMembership"
	public static val INVALID_EXPRESSION_RESULT_PARAMETER_MEMBERSHIP_MSG = "Only one return parameter is allowed"	
		
	public static val INVALID_FUNCTION_RESULT_EXPRESSION_MEMBERSHIP = "validateFunctionResultExpressionMembership"
	public static val INVALID_FUNCTION_RESULT_EXPRESSION_MEMBERSHIP_MSG = "Only one (owned or inherited) result expression is allowed"	
	public static val INVALID_FUNCTION_RESULT_PARAMETER_MEMBERSHIP = "validateFunctionResultParameterMembership"
	public static val INVALID_FUNCTION_RESULT_PARAMETER_MEMBERSHIP_MSG = "Only one return parameter is allowed"	
		
	public static val INVALID_RETURN_PARAMETER_MEMBERSHIP_OWNING_TYPE = "validateReturnParameterMembershipOwningType"
	public static val INVALID_RETURN_PARAMETER_MEMBERSHIP_OWNING_TYPE_MSG = "Return parameter membership not allowed"	
		
	public static val INVALID_RESULT_EXPRESSION_MEMBERSHIP_OWNING_TYPE = "validateResultExpressionMembershipOwningType"
	public static val INVALID_RESULT_EXPRESSION_MEMBERSHIP_OWNING_TYPE_MSG = "Result expression not allowed"	
		
	public static val INVALID_FEATURE_CHAIN_EXPRESSION_FEATURE_CONFORMANCE = "validateFeatureChainExpressionFeatureConformance"
	public static val INVALID_FEATURE_CHAIN_EXPRESSION_FEATURE_CONFORMANCE_MSG = "Must be a valid feature"

	public static val INVALID_FEATURE_REFERENCE_EXPRESSION_REFERENT_IS_FEATURE = "validateFeatureReferenceExpressionReferentIsFeature"
	public static val INVALID_FEATURE_REFERENCE_EXPRESSION_REFERENT_IS_FEATURE_MSG = "Must be a valid feature"

	public static val INVALID_INVOCATION_EXPRESSION_PARAMETER_REDEFINITION = "validateInvocationExpressionParameterRedefinition"
	public static val INVALID_INVOCATION_EXPRESSION_PARAMETER_REDEFINITION_MSG = "Must name an input or undirected feature"
	public static val INVALID_INVOCATION_EXPRESSION_NO_DUPLICATE_PARAMETER_REDEFINITION = "validateInvocationExpressionNoDuplicateParameterRedefinition"
	public static val INVALID_INVOCATION_EXPRESSION_NO_DUPLICATE_PARAMETER_REDEFINITION_MSG = "Feature already bound"

	public static val INVALID_OPERATOR_EXPRESSION_CAST_CONFORMANCE_TYPE = "validateOperatorExpressionCastConformance"
	public static val INVALID_OPERATOR_EXPRESSION_CAST_CONFORMANCE_MSG = "Cast argument should have conforming types"

	// Note: This validation is not in the spec.
	public static val INVALID_OPERATOR_EXPRESSION_BRACKET_OPERATOR = "validateOperatorExpressionBracketOperator_"
	public static val INVALID_OPERATOR_EXPRESSION_BRACKET_OPERATOR_MSG = "Use #(...) for indexing"
	
	public static val INVALID_ITEM_FLOW_ITEM_FEATURE = "validateItemFlowItemFeature"
	public static val INVALID_ITEM_FLOW_ITEM_FEATURE_MSG = "Only one item feature is allowed"	
		
	public static val INVALID_ITEM_FLOW_END_OWNING_TYPE = "validateItemFlowEndOwningType"
	public static val INVALID_ITEM_FLOW_END_OWNING_TYPE_MSG = "Item flow end not allowed"
	public static val INVALID_ITEM_FLOW_END_NESTED_FEATURE = "validateItemFlowEndNestedFeature"
	public static val INVALID_ITEM_FLOW_END_NESTED_FEATURE_MSG = "Item flow end must have a nested input or output feature"
	public static val INVALID_ITEM_FLOW_END_SUBSETTING = 'validateItemFlowEndSubsetting'
	public static val INVALID_ITEM_FLOW_END_SUBSETTING_MSG = "Cannot identify item flow end (use dot notation)"
	public static val INVALID_ITEM_FLOW_END_IMPLICIT_SUBSETTING = "validateItemFlowEndImplicitSubsetting"
	public static val INVALID_ITEM_FLOW_END_IMPLICIT_SUBSETTING_MSG = "Flow ends should use dot notation"
	
	public static val INVALID_FEATURE_VALUE_OVERRIDING = "validateFeatureValueOverriding"
	public static val INVALID_FEATURE_VALUE_OVERRIDING_MSG = "Cannot override a binding feature value"
	
	public static val INVALID_MULTIPLICITY_RANGE_BOUND_RESULT_TYPES = "validateMultiplicityRangeResultTypes"
	public static val INVALID_MULTIPLICITY_RANGE_BOUND_RESULT_TYPES_MSG = "Must have a Natural value"

	public static val INVALID_METADATA_FEATURE_ANNOTATED_ELEMENT = "validateMetadataFeatureAnnotatedElement"
	public static val INVALID_METADATA_FEATURE_ANNOTATED_ELEMENT_MSG = "Cannot annotate {metaclass}"
	public static val INVALID_METADATA_FEATURE_BODY = "invalidateMetadataFeatureBody"
	public static val INVALID_METADATA_FEATURE_BODY_MSG_1 = "Must redefine an owning-type feature"
	public static val INVALID_METADATA_FEATURE_BODY_MSG_2 = "Must be model-level evaluable"
	public static val INVALID_METADATA_FEATURE_METACLASS = "validateMetadataFeatureMetadata"
	public static val INVALID_METADATA_FEATURE_METACLASS_MSG = "Must have exactly one metaclass"
	public static val INVALID_METADATA_FEATURE_METACLASS_NOT_ABSTRACT = "validateMetadataFeatureMetadataNotAbstract"
	public static val INVALID_METADATA_FEATURE_METACLASS_NOT_ABSTRACT_MSG = "Must have a concrete type"

	public static val INVALID_ELEMENT_FILTER_MEMBERSHIP_IS_BOOLEAN = "validateElementFilterMembershipIsBoolean"
	public static val INVALID_ELEMENT_FILTER_MEMBERSHIP_IS_BOOLEAN_MSG = "Must have a Boolean result"
	public static val INVALID_ELEMENT_FILTER_MEMBERSHIP_IS_MODEL_LEVEL_EVALUABLE = "validateElementFilterMembershipIsModelLevelEvaluable"
	public static val INVALID_ELEMENT_FILTER_MEMBERSHIP_IS_MODEL_LEVEL_EVALUABLE_MSG = "Must be model-level evaluable"

	// Note: This validation is not formalized in the spec.
	public static val INVALID_LIBRARY_PACKAGE_NOT_STANDARD = "validateLibraryPackageNotStandard_"
	public static val INVALID_LIBRARY_PACKAGE_NOT_STANDARD_MSG = "User library packages should not be marked as standard"

	/* ROOT */
	
	@Check
	def checkElement(Element elm) {
		// validateElementIsImpliedIncluded	
		if (!elm.isImpliedIncluded) {
			if (elm.ownedRelationship.exists[isImplied]) {
				error(INVALID_ELEMENT_IS_IMPLIED_INCLUDED_MSG, elm, null, INVALID_ELEMENT_IS_IMPLIED_INCLUDED)
			}
		}
	}
	
	@Check
	def checkNamespace(Namespace namesp) {
		// validateNamespaceDistinguishability
		// Do not check distinguishability for automatically constructed expressions and binding connectors (to improve performance).
		if (!(namesp instanceof InvocationExpression || namesp instanceof FeatureReferenceExpression || namesp instanceof LiteralExpression || 
				namesp instanceof NullExpression || namesp instanceof BindingConnector)) {
			// NOTE: Does not check distinguishibility for imported Memberships.
			val ownedMemberships = namesp.ownedMembership
			val owningMemberships = ownedMemberships.filter[m | m instanceof OwningMembership]
			val aliasMemberships = ownedMemberships.filter[m | !(m instanceof OwningMembership)]
			for (mem: owningMemberships) {
				checkDistinguishibility(mem, owningMemberships, INVALID_NAMESPACE_DISTINGUISHABILITY_MSG)				
			}
			for (mem: aliasMemberships) {
				checkDistinguishibility(mem, owningMemberships, INVALID_NAMESPACE_DISTINGUISHABILITY_MSG_0)
				checkDistinguishibility(mem, aliasMemberships, INVALID_NAMESPACE_DISTINGUISHABILITY_MSG_1)
			}
			if (namesp instanceof Type) {
				ElementUtil.clearCachesOf(namesp) // Force recomputation of inherited memberships.
				val inheritedMemberships = namesp.inheritedMembership
				for (mem: ownedMemberships) {
					checkDistinguishibility(mem, inheritedMemberships, INVALID_NAMESPACE_DISTINGUISHABILITY_MSG_2)
				}
			}
		}		
	}
	
	def checkDistinguishibility(Membership mem, Iterable<Membership> others, String msg) {
		val memShortName = mem.memberShortName
		val memName = mem.memberName
		
		val distinctOthers = others.filter[other | mem.memberElement !== other.memberElement]
		if (memShortName !== null && distinctOthers.exists[other | memShortName == other.memberShortName || memShortName == other.memberName]) {
				if (mem instanceof OwningMembership) {
					warning(msg, mem.ownedMemberElement, SysMLPackage.eINSTANCE.element_DeclaredShortName, INVALID_NAMESPACE_DISTINGUISHABILITY)
				} else {
					warning(msg, mem, SysMLPackage.eINSTANCE.membership_MemberShortName, INVALID_NAMESPACE_DISTINGUISHABILITY)
				}
		}
		if (memName !== null && distinctOthers.exists[other | memName == other.memberShortName || memName == other.memberName]) {
				if (mem instanceof OwningMembership) {
					warning(msg, mem.ownedMemberElement, SysMLPackage.eINSTANCE.element_DeclaredName, INVALID_NAMESPACE_DISTINGUISHABILITY)
				} else {
					warning(msg, mem, SysMLPackage.eINSTANCE.membership_MemberName, INVALID_NAMESPACE_DISTINGUISHABILITY)
				}
		}
	}
	
	@Check
	def checkImport(Import import_) {
		// validateImportTopLevelVisibility
		if (import_.importOwningNamespace !== null && import_.importOwningNamespace.owner === null && 
			import_.visibility !== VisibilityKind.PRIVATE) {
			error(INVALID_IMPORT_TOP_LEVEL_VISIBILITY_MSG, import_, null, INVALID_IMPORT_TOP_LEVEL_VISIBILITY)			
		}
	}
	
	/* CORE */
	
	@Check
	def checkSpecialization(Specialization s) {
		// validateSpecializationSpecificNotConjugated
		if (s.specific.isConjugated) {
			error(INVALID_SPECIALIZATION_SPECIFIC_NOT_CONJUGATED_MSG, s, SysMLPackage.eINSTANCE.specialization_Specific, INVALID_SPECIALIZATION_SPECIFIC_NOT_CONJUGATED)
		}
	}
	
	@Check
	def checkType(Type t) {
		// validateTypeAtMostOneConjugator
		if (t.ownedRelationship.filter[r | r instanceof Conjugation].size() > 1) {
			error(INVALID_TYPE_AT_MOST_ONE_CONJUGATOR_MSG, t, null, INVALID_TYPE_AT_MOST_ONE_CONJUGATOR)
		}

		// validateTypeOwnedDifferencingNotOne
		checkNotOne(t.ownedDifferencing, INVALID_TYPE_OWNED_DIFFERENCING_NOT_ONE_MSG, INVALID_TYPE_OWNED_DIFFERENCING_NOT_ONE)
		// validateDifferencingTypesNotSelf
		checkTargetNotObject(t, t.ownedDifferencing, INVALID_TYPE_DIFFERENCING_TYPES_NOT_SELF_MSG, INVALID_TYPE_DIFFERENCING_TYPES_NOT_SELF)
		
		// validateTypeOwnedIntersectingNotOne
		checkNotOne(t.ownedIntersecting, INVALID_TYPE_OWNED_INTERSECTING_NOT_ONE_MSG, INVALID_TYPE_OWNED_INTERSECTING_NOT_ONE)
		// validateTypeIntersectingTypesNotSelf
		checkTargetNotObject(t, t.ownedIntersecting, INVALID_TYPE_INTERSECTING_TYPES_NOT_SELF_MSG, INVALID_TYPE_INTERSECTING_TYPES_NOT_SELF)
		
		// validateTypeOwnedUnioningNotOne
		checkNotOne(t.ownedUnioning, INVALID_TYPE_OWNED_UNIONING_NOT_ONE_MSG, INVALID_TYPE_OWNED_UNIONING_NOT_ONE)
		// validateTypeUnioningTypesNotSelf
		checkTargetNotObject(t, t.ownedUnioning, INVALID_TYPE_UNIONING_TYPES_NOT_SELF_MSG, INVALID_TYPE_UNIONING_TYPES_NOT_SELF)
		
		// validateTypeOwnedMultiplicity
		var multiplicityMemberships = t.ownedMembership.filter[memberElement instanceof Multiplicity];
		checkAtMostOne(multiplicityMemberships, INVALID_TYPE_OWNED_MULTIPLICITY_MSG, SysMLPackage.eINSTANCE.membership_MemberElement, INVALID_TYPE_OWNED_MULTIPLICITY)
	}
	
	
	// Check default supertype (semantic constraint)
	// Note: This check is not in the spec as a single constraint.
	@Check
	def checkClassifier(Classifier c){
		val defaultSupertype = ImplicitGeneralizationMap.getDefaultSupertypeFor(c.getClass())
		if (!TypeUtil.conforms(c, SysMLLibraryUtil.getLibraryType(c, defaultSupertype)))
			error(INVALID_CLASSIFIER_DEFAULT_SUPERTYPE_MSG.replace("{supertype}", defaultSupertype), c, SysMLPackage.eINSTANCE.classifier_OwnedSubclassification, INVALID_CLASSIFIER_DEFAULT_SUPERTYPE)
			
		// validateClassifierMultiplicityDomain
		val m = c.multiplicity;
		if (m !== null && !m.multiplicity.featuringType.empty) {
			error(INVALID_CLASSIFIER_MULTIPLICITY_DOMAIN_MSG, c, SysMLPackage.eINSTANCE.type_Multiplicity, INVALID_CLASSIFIER_MULTIPLICITY_DOMAIN)
		}
	}
	
	// @Check
	// def checkEndFeatureMembership(EndFeatureMembership m) {
	//    // validateEndFeatureMembershipIsEnd is automatically satisfied
	// }
	
	@Check
	def checkFeature(Feature f){
		// TODO: Remove?
		val types = f.type;
		if (types !== null && types.isEmpty)
			error(INVALID_FEATURE_HAS_TYPE_MSG, f, SysMLPackage.eINSTANCE.feature_Type, INVALID_FEATURE_HAS_TYPE)
			
		// validateFeatureChainingFeatureNotOne
		checkNotOne(f.ownedFeatureChaining, INVALID_FEATURE_CHAINING_FEATURE_NOT_ONE_MSG, INVALID_FEATURE_CHAINING_FEATURE_NOT_ONE)
		// validateFeatureChainingFeaturesNotSelf
		checkTargetNotObject(f, f.ownedFeatureChaining, INVALID_FEATURE_CHAINING_FEATURES_NOT_SELF_MSG, INVALID_FEATURE_CHAINING_FEATURES_NOT_SELF)

		// validateFeatureOwnedReferenceSubsetting
		val refSubsettings = f.ownedRelationship.filter[r | r instanceof ReferenceSubsetting].toList
		if (refSubsettings.size > 1) {
			for (var i = 1; i < refSubsettings.size; i++)
				error(INVALID_FEATURE_OWNED_REFERENCE_SUBSETTING_MSG, refSubsettings.get(i), null, INVALID_FEATURE_OWNED_REFERENCE_SUBSETTING)
		}
		
		// validateFeatureMultiplicityDomain
		val m = f.multiplicity;
		if (m !== null && f.featuringType.toSet != m.featuringType.toSet) {
			error(INVALID_FEATURE_MULTIPLICITY_DOMAIN_MSG, f, SysMLPackage.eINSTANCE.type_Multiplicity, INVALID_FEATURE_MULTIPLICITY_DOMAIN)
		}
		
		// validateRedefinitionDirectionConformance (for implicit Redefinitions)
		val direction = f.direction
		val featuringTypes = f.featuringType
		for (redefinedFeature: TypeUtil.getImplicitGeneralTypesOnly(f, SysMLPackage.eINSTANCE.redefinition)) {
			checkRedefinitionDirection(direction, featuringTypes, redefinedFeature as Feature, f)
		}
	}
		
	@Check
	def checkFeatureChaining(FeatureChaining fc) {
		// Add validateFeatureChainingFeatureConformance
		val featureChainings = fc.featureChained.ownedFeatureChaining;
		val i = featureChainings.indexOf(fc);
		if (i > 0) {
			val prev = featureChainings.get(i-1).chainingFeature;
			if (!fc.chainingFeature.featuringType.forall[t2 | prev.conformsTo(t2)]) {
				error(INVALID_FEATURE_CHAINING__FEATURE_CONFORMANCE_MSG, fc, SysMLPackage.eINSTANCE.featureChaining_ChainingFeature, INVALID_FEATURE_CHAINING_FEATURE_CONFORMANCE)
			}
		}
	}
	
	@Check
	def checkRedefinition(Redefinition redef) {
		val redefiningFeature = redef.redefiningFeature
		val redefinedFeature = redef.redefinedFeature

		if (redefiningFeature !== null && redefinedFeature !== null) {
			val redefiningFeaturingTypes = redefiningFeature.featuringType
			val redefinedFeaturingTypes = redefinedFeature.featuringType
			
			// validateRedefinitionDirectionConformance
			checkRedefinitionDirection(redefiningFeature.direction, redefiningFeaturingTypes, redefinedFeature, redef)
			
			// validateRedefinitionFeaturingTypes
			if (redefinedFeature.owningRelationship != redef &&
				redefinedFeaturingTypes.toSet == redefiningFeaturingTypes.toSet){
				if (redefiningFeaturingTypes.isEmpty) {
					error(INVALID_REDEFINITION_FEATURING_TYPES_MSG_1, redef, 
						SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, INVALID_REDEFINITION_FEATURING_TYPES)
				} else {
					error(INVALID_REDEFINITION_FEATURING_TYPES_MSG_2, redef, 
						SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, INVALID_REDEFINITION_FEATURING_TYPES)
				}
			}
		}		
	}
	
	def checkRedefinitionDirection(FeatureDirectionKind redefiningDirection, List<Type> featuringTypes, Feature redefinedFeature, Element source) {
		for (featuringType: featuringTypes) {
			val redefinedDirection = featuringType.directionOf(redefinedFeature)
			if ((redefinedDirection === FeatureDirectionKind.IN ||
				redefinedDirection === FeatureDirectionKind.OUT) &&
				redefiningDirection !== redefinedDirection ||
				redefinedDirection === FeatureDirectionKind.INOUT &&
				redefiningDirection === null) {
					if (source instanceof Redefinition) {
						error(INVALID_REDEFINITION_DIRECTION_CONFORMANCE_MSG, source, SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, INVALID_REDEFINITION_DIRECTION_CONFORMANCE)
					} else {
						error(INVALID_REDEFINITION_DIRECTION_CONFORMANCE_MSG, source, null, INVALID_REDEFINITION_DIRECTION_CONFORMANCE)
					}
			}
		}
	}
	
	@Check
	def checkSubsetting(Subsetting sub) { 
		
		// Due to how connector is implemented, no validation is performed if the owner is a Connector.
		if ( sub.subsettingFeature.owningType instanceof Connector || sub.subsettedFeature.owningType instanceof Connector ) 
			return;

		val subsettingFeature = sub.subsettingFeature
		val subsettedFeature = sub.subsettedFeature

		// Multiplicity conformance
		
		var setted_m = FeatureUtil.getMultiplicityRangeOf(subsettedFeature?.multiplicity)
		var setting_m = FeatureUtil.getMultiplicityRangeOf(subsettingFeature?.multiplicity)
		
		// Only check multiplicity conformance if the subsettedFeature and subsettingFeature multiplicity elements are not the same, 
		// and the subsettingFeature and subsettedFeature either both are, or both are not, end Features.
		if (setted_m !== null && setting_m !== null && setted_m !== setting_m &&
			subsettingFeature.isEnd() == subsettedFeature.isEnd()) {
			var setted_m_l = setted_m.lowerBound
			val setted_m_u = setted_m.upperBound
			
			if (setted_m_l === null) {
				setted_m_l = setted_m_u
			}
			
			var setting_m_l = setting_m.lowerBound
			val setting_m_u = setting_m.upperBound
			
			if (setting_m_l === null) {
				setting_m_l = setting_m_u
			}
			
			// TODO: Add validateRedefinitionMultiplicityConformance
		
			// Lower bound (only check if the Subsetting is a Redefinition and Features are not ends): setting must be >= setted
			if (sub instanceof Redefinition && !subsettingFeature.isEnd()) {
				if (setting_m_l instanceof LiteralInteger && setted_m_l instanceof LiteralInteger && (setting_m_l as LiteralInteger).getValue < (setted_m_l as LiteralInteger).getValue ||
					setting_m_l instanceof LiteralInfinity && setted_m_l instanceof LiteralInteger && 0 < (setted_m_l as LiteralInteger).getValue) {
					warning(INVALID_REDEFINITION_MULTIPLICITY_CONFORMANCE_MSG, sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefiningFeature, INVALID_REDEFINITION_MULTIPLICITY_CONFORMANCE)
				}
			}
			
			// TODO: Add validateSubsettingMultiplicityConformance
		
			// Upper bound: setting must be <= setted
			if (setting_m_u instanceof LiteralInfinity && !(setted_m_u instanceof LiteralInfinity) ||
				setting_m_u instanceof LiteralInteger && setted_m_u instanceof LiteralInteger && (setting_m_u as LiteralInteger).getValue > (setted_m_u as LiteralInteger).getValue) {
				warning(INVALID_SUBSETTING_MULTIPLICITY_CONFORMANCE_MSG, sub, SysMLPackage.eINSTANCE.subsetting_SubsettingFeature, INVALID_SUBSETTING_MULTIPLICITY_CONFORMANCE)
			}
		}
		
		// validateSubsettingUniquenessConformance
		if (subsettedFeature !== null && subsettedFeature.unique && subsettingFeature !== null && !subsettingFeature.unique){
			error(INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE_MSG, sub, SysMLPackage.eINSTANCE.subsetting_SubsettingFeature, INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE)
		}
					
		// validateSubsettingFeaturingTypes
		if (subsettingFeature !== null && subsettedFeature !== null) {
			val subsettedFeaturingTypes = subsettedFeature.featuringType
						
			if (!subsettedFeaturingTypes.isEmpty() && 
				!subsettedFeaturingTypes.forall[t | subsettingFeature.isAccessibleFrom(t)]) {
				if (subsettingFeature.owningType instanceof ItemFlowEnd) {
					error(INVALID_SUBSETTING_FEATURING_TYPES_MSG, sub, SysMLPackage.eINSTANCE.subsetting_SubsettedFeature, INVALID_SUBSETTING_FEATURING_TYPES)
				} else {
					warning(INVALID_SUBSETTING_FEATURING_TYPES_MSG, sub, SysMLPackage.eINSTANCE.subsetting_SubsettedFeature, INVALID_SUBSETTING_FEATURING_TYPES)
				}
			}
		}
	}
	
	def boolean isAccessibleFrom(Feature feature, Type type) {
		val featuringTypes = feature.featuringType
		featuringTypes.empty && type == getLibraryType(feature, "Base::Anything") ||
		feature.featuringType.exists[featuringType | 
				featuringType.conformsTo(type) ||
				
				// TODO: Add this to spec OCL for validateSubsettingFeaturingType?
				featuringType instanceof Feature &&
				(featuringType as Feature).isAccessibleFrom(type)];
	}
	
	/* KERNEL */
	
	@Check
	def checkDataType(DataType d) {
		// validateDataTypeSpecialization
		for (s: d.ownedSpecialization) {
			if (s.general instanceof org.omg.sysml.lang.sysml.Class || s.general instanceof Association) {
				error(INVALID_DATA_TYPE_SPECIALIZATION_MSG, s, SysMLPackage.eINSTANCE.specialization_General, INVALID_DATA_TYPE_SPECIALIZATION)
			}
		}
	}
	
	@Check
	def checkClass(org.omg.sysml.lang.sysml.Class c) {
		// validateClassSpecialization
		for (s: c.ownedSpecialization) {
			if (s.general instanceof DataType || s.general instanceof Association && !(c instanceof Association)) {
				error(INVALID_CLASS_SPECIALIZATION_MSG, s, SysMLPackage.eINSTANCE.specialization_General, INVALID_CLASS_SPECIALIZATION)
			}
		}
	}
	
	@Check
	def checkAssociation(Association a){
		// validateAssociationBinarySpecialization
		// NOTE: It is sufficient to check owned ends, since they will redefine ends from any supertypes.
		val associationEnds = TypeUtil.getOwnedEndFeaturesOf(a);
		if (associationEnds.size() > 2) {
			val binaryLinkType = SysMLLibraryUtil.getLibraryElement(a, "Links::BinaryLink") as Type
			if (a.conformsTo(binaryLinkType)) {
				for (var i = 2; i < associationEnds.size(); i++) {
					error(INVALID_ASSOCIATION_BINARY_SPECIALIZATION_MSG, associationEnds.get(i), null, INVALID_ASSOCIATION_BINARY_SPECIALIZATION)	
				}
			}
		}

		// validateAssociationRelatedTypes
		if (!a.isAbstract) {
			val relatedElements = a.getRelatedElement
			if (relatedElements !== null && relatedElements.size < 2)
				error(INVALID_ASSOCIATION_RELATED_TYPES_MSG, a, SysMLPackage.eINSTANCE.relationship_RelatedElement, INVALID_ASSOCIATION_RELATED_TYPES)	
		}
		
		// validateAssociationStructureIntersection is automatically satisfied
	}
		
	@Check
	def checkBindingConnector(BindingConnector bc){
		// validateBindingConnectorIsBinary
		if (bc.relatedFeature.length != 2) {
			error(INVALID_BINDING_CONNECTOR_IS_BINARY_MSG, bc, null, INVALID_BINDING_CONNECTOR_IS_BINARY)
		} else {		
			doCheckBindingConnector(bc, bc)
		}
	}
	
	@Check
	def checkImplicitBindingConnectors(Type type) {
		TypeUtil.forEachImplicitBindingConnectorOf(type, [connector, kind | 
			if (type instanceof FeatureReferenceExpression) {
				connector.doCheckConnector(type, kind) 
			}
			// Ignore ill-formed implicit binding connectors.
			if (connector.relatedFeature.length >= 2) {
				connector.doCheckBindingConnector(type)
			}
		])
	}
	
	private def doCheckBindingConnector(BindingConnector bc, Element location) {
		val rf = bc.relatedFeature
		
//		val inFeature = rf.map[owningFeatureMembership].filter[m|m !== null && m.direction == FeatureDirectionKind.IN].map[ownedMemberFeature_comp].findFirst[true]
//		val outFeature = rf.map[owningFeatureMembership].filter[m|m !== null && m.direction == FeatureDirectionKind.OUT].map[ownedMemberFeature_comp].findFirst[true]
//		
//		if (inFeature !== null && outFeature !== null){
//			//Argument type conformance
//			val inTypes = inFeature.type
//			val outTypes = outFeature.type
//			val outConformsToIn = inTypes.map[conformsFrom(outTypes)]
//			if (outConformsToIn.filter[!empty].length != inTypes.length)		
//				error(INVALID_BINDING_CONNECTOR_ARGUMENT_TYPE_CONFORMANCE_MSG, bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDING_CONNECTOR_ARGUMENT_TYPE_CONFORMANCE)
//		} else { 
			// TODO: Add validateBindingConnectorTypeConformance
			//Binding type conformance
			val f1types = rf.get(0).type
			val f2types = rf.get(1).type
			val boolType = getLibraryType(location, "Performances::BooleanEvaluation")
						 
			if (!(typesConform(f1types, f2types) ||
				  // Consider the result of an expression returning a Boolean-valued Expression to conform to BooleanEvaluation.
				  isBooleanExpression(rf.get(0).getOwningType()) && !conformsFrom(boolType, f2types).isEmpty ||
				  isBooleanExpression(rf.get(1).getOwningType()) && !conformsFrom(boolType, f1types).isEmpty)
			) {				
				warning(INVALID_BINDING_CONNECTOR_TYPE_CONFORMANCE_MSG, location, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDING_CONNECTOR_TYPE_CONFORMANCE)
			}
//		}
	}
	
	
	@Check
	def checkConnector(Connector c){		
		// validateConnectorRelatedFeatures
		if (!c.isAbstract) {
			val relatedFeatures = c.getRelatedFeature
			if (relatedFeatures !== null && relatedFeatures.size < 2) {
				error(INVALID_CONNECTOR_RELATED_FEATURES_MSG, c, SysMLPackage.eINSTANCE.relationship_RelatedElement, INVALID_CONNECTOR_RELATED_FEATURES)
			}
		}		
		
		// validateConnectorBinarySpecialization
		val connectorEnds = TypeUtil.getAllEndFeaturesOf(c)
		if (connectorEnds.size() > 2) {
			val binaryLinkType = SysMLLibraryUtil.getLibraryElement(c, "Links::BinaryLink") as Type
			if (c.conformsTo(binaryLinkType)) {
				val ownedConnectorEnds = TypeUtil.getOwnedEndFeaturesOf(c)
				if (ownedConnectorEnds.size() <= 2) {
					error(INVALID_CONNECTOR_BINARY_SPECIALIZATION_MSG, c, null, INVALID_CONNECTOR_BINARY_SPECIALIZATION)
				} else {
					for (var i = 2; i < connectorEnds.size(); i++) {
						error(INVALID_CONNECTOR_BINARY_SPECIALIZATION_MSG, connectorEnds.get(i), null, INVALID_CONNECTOR_BINARY_SPECIALIZATION)
					}
				}
			}
		}

		doCheckConnector(c, c, null)
	}
	
	private def doCheckConnector(Connector c, Type location, EClass kind) {
		ElementUtil.transform(c)
		val cFeaturingTypes = c.featuringType
		
		if (kind == SysMLPackage.Literals.FEATURE_MEMBERSHIP) {
			cFeaturingTypes.add(location);
		}

		// checkConnectorTypeFeaturing
		val relatedFeatures = c.relatedFeature				
		val connectorEnds = TypeUtil.getOwnedEndFeaturesOf(c)
		for (var i = 0; i < relatedFeatures.size; i++) {
			val relatedFeature = relatedFeatures.get(i)
			if (!((if (cFeaturingTypes.empty) relatedFeature.isFeaturedWithin(null)
				  else cFeaturingTypes.forall[t | relatedFeature.isFeaturedWithin(t)]) ||
				  
				// TODO: Be able to remove these special cases
				(location instanceof FeatureReferenceExpression || location instanceof FeatureChainExpression) && 
					relatedFeature.getOwningType() == location ||
				c instanceof ItemFlow && c.owningNamespace instanceof Feature && c.owningType === null)) {
					
				warning(INVALID_CONNECTOR_TYPE_FEATURING_MSG, 
					if (location === c && i < connectorEnds.size) connectorEnds.get(i) else location, 
					null, INVALID_CONNECTOR_TYPE_FEATURING)
			}
		}
	}
	
	@Check
	def checkParameterMembership(ParameterMembership m) {
		if (!(m instanceof ReturnParameterMembership)) {
			// validateParameterMembershipOwningType
			val owningType = m.owningType
			if (!(owningType instanceof Behavior || owningType instanceof Step)) {
				error(INVALID_PARAMETER_MEMBERSHIP_OWNING_TYPE_MSG, m, SysMLPackage.eINSTANCE.parameterMembership_OwnedMemberParameter, INVALID_PARAMETER_MEMBERSHIP_OWNING_TYPE)
			}
			
			// validateParameterMembershipParameterHasDirection is automatically satisfied
		}
	}
	
	@Check
	def checkExpression(Expression e) {
		// validateExpressionResultParameterMembership
		val mems = e.ownedFeatureMembership.filter[m | m instanceof ReturnParameterMembership]
		checkAtMostOne(mems, INVALID_EXPRESSION_RESULT_PARAMETER_MEMBERSHIP_MSG, SysMLPackage.eINSTANCE.parameterMembership_OwnedMemberParameter, INVALID_EXPRESSION_RESULT_PARAMETER_MEMBERSHIP)
		
		// validateExpressionResultExpressionMembership
		val reMems = e.membership.filter[m | m instanceof ResultExpressionMembership]
	    if (reMems.size() > 1) {
	    	val ownedMem = reMems.filter[m | m.membershipOwningNamespace === e]
	    	if (!ownedMem.isEmpty) {
	    		error(INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP_MSG, ownedMem.get(0), SysMLPackage.eINSTANCE.resultExpressionMembership_OwnedResultExpression, INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP)
	    	} else {
	    		error(INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP_MSG, e, null, INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP)	    		
	    	}
	    }
	}
		
	@Check
	def checkFunction(Function f) {
		// validateFunctionResultParameterMembership
		val mems = f.ownedFeatureMembership.filter[m | m instanceof ReturnParameterMembership]
		checkAtMostOne(mems, INVALID_FUNCTION_RESULT_PARAMETER_MEMBERSHIP_MSG, SysMLPackage.eINSTANCE.parameterMembership_OwnedMemberParameter, INVALID_FUNCTION_RESULT_PARAMETER_MEMBERSHIP)
		
		// validateFunctionResultExpressionMembership
		val reMems = f.membership.filter[m | m instanceof ResultExpressionMembership]
	    if (reMems.size() > 1) {
	    	val ownedMem = reMems.filter[m | m.membershipOwningNamespace === f]
	    	if (!ownedMem.isEmpty) {
	    		error(INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP_MSG, ownedMem.get(0), SysMLPackage.eINSTANCE.resultExpressionMembership_OwnedResultExpression, INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP)
	    	} else {
	    		error(INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP_MSG, f, null, INVALID_EXPRESSION_RESULT_EXPRESSION_MEMBERSHIP)	    		
	    	}
	    }
	}
		
	@Check
	def checkReturnParameterMembership(ReturnParameterMembership m) {
		// validateReturnParameterMembershipOwningType
		val owningType = m.owningType
		if (!(owningType instanceof Function || owningType instanceof Expression)) {
			error(INVALID_RETURN_PARAMETER_MEMBERSHIP_OWNING_TYPE_MSG, m, SysMLPackage.eINSTANCE.parameterMembership_OwnedMemberParameter, INVALID_RETURN_PARAMETER_MEMBERSHIP_OWNING_TYPE)
		}
		
		// validateReturnParameterMembershipParameterHasDirectionOut is automatically satisfied
	}
	
	@Check
	def checkResultExpressionMembership(ResultExpressionMembership m) {
		// validateResultExpressionMembershipOwningType
		val owningType = m.owningType
		if (!(owningType instanceof Function || owningType instanceof Expression)) {
			error(INVALID_RESULT_EXPRESSION_MEMBERSHIP_OWNING_TYPE_MSG, m, SysMLPackage.eINSTANCE.parameterMembership_OwnedMemberParameter, INVALID_RESULT_EXPRESSION_MEMBERSHIP_OWNING_TYPE)
		}
		
		// validateReturnParameterMembershipParameterHasDirectionOut is automatically satisfied
	}
	
	// @Check
	// def checkReturnParameterMembership(ReturnParameterMembership m) {
	//     // validateReturnParameterMembershipParameterHasDirection is automatically satisfied
	// }
	
	// @Check
	// def checkCollectExpression(CollectExpression e) {
	//     // validateCollectExpressionOperator is automatically satisfied
	// }
	
	@Check
	def checkFeatureChainExpression(FeatureChainExpression e) {
		// validateFeatureChainExpressionConformance
		val feature = ExpressionUtil.getTargetFeatureFor(e)
		val rel = NamespaceUtil.getRelativeNamespaceFor(e)
		if (feature !== null &&
			(!(feature instanceof Feature) || 
				rel instanceof Type &&
				!(feature as Feature).featuringType.isEmpty &&
				!(feature as Feature).featuringType.exists[t | (rel as Type).conformsTo(t)]
			)) {
			error(INVALID_FEATURE_CHAIN_EXPRESSION_FEATURE_CONFORMANCE_MSG, e.ownedMembership.get(1), SysMLPackage.eINSTANCE.membership_MemberElement, INVALID_FEATURE_CHAIN_EXPRESSION_FEATURE_CONFORMANCE)
		}
	}
	
	@Check
	def checkFeatureReferenceExpression(FeatureReferenceExpression e) {
		// validateFeatureReferenceExpressionReferentIsFeature
		val feature = ExpressionUtil.getReferentFor(e)
		if (feature !== null && !(feature instanceof Feature)) {
			error(INVALID_FEATURE_REFERENCE_EXPRESSION_REFERENT_IS_FEATURE_MSG, e, null, INVALID_FEATURE_REFERENCE_EXPRESSION_REFERENT_IS_FEATURE)
		}
	}
	
	@Check
	def checkInvocationExpression(InvocationExpression e) {
		val type = ExpressionUtil.getExpressionTypeOf(e)
		if (type !== null) {
			val typeParams = type.feature.filter[p | FeatureUtil.getDirection(p) === null || FeatureUtil.isInputParameter(p)]
			val exprParams = e.ownedFeature.filter[p | FeatureUtil.isInputParameter(p)]
			val usedParams = newHashSet
			for (p: exprParams) {
				val redefinitions = p.ownedRedefinition
				if (!redefinitions.empty) {
					val redefParams = redefinitions.map[redefinedFeature].filter[f | typeParams.contains(f)]
					if (redefParams.empty) {
						// validateInvocationExpressionParameterRedefinition
						// Input parameter must redefine a parameter of the expression type
						error(INVALID_INVOCATION_EXPRESSION_PARAMETER_REDEFINITION_MSG, p, null, INVALID_INVOCATION_EXPRESSION_PARAMETER_REDEFINITION)
					} else if (redefParams.exists[f | usedParams.contains(f)]) {
						// validateInvocationExpressionNoDuplicateParameterRedefinition
						// Two parameters cannot redefine the same type parameter 
						error(INVALID_INVOCATION_EXPRESSION_NO_DUPLICATE_PARAMETER_REDEFINITION_MSG, p, null, INVALID_INVOCATION_EXPRESSION_NO_DUPLICATE_PARAMETER_REDEFINITION)
					}
					usedParams.addAll(redefParams)
				}
			}
		}
	}
	
	@Check
	def checkOperatorExpression(OperatorExpression e) {
		// TODO: Add validateOperatorExpressionCastConformance
		if (e.operator == "as") {
			val params = TypeUtil.getOwnedParametersOf(e)
			if (params.length >= 2) {
				val arg = FeatureUtil.getValueExpressionFor(params.get(0))
				if (arg !== null) {
					val argTypes = arg.result.type
					val targetTypes = params.get(1).type
					if (!typesConform(argTypes, targetTypes))
						warning(INVALID_OPERATOR_EXPRESSION_CAST_CONFORMANCE_MSG, e, null, INVALID_OPERATOR_EXPRESSION_CAST_CONFORMANCE_TYPE)
					}
			}
		} else if (e.operator == '[') {
			warning(INVALID_OPERATOR_EXPRESSION_BRACKET_OPERATOR_MSG, e, null, INVALID_OPERATOR_EXPRESSION_BRACKET_OPERATOR)
		}
	}
	
	// @Check
	// def checkSelectExpression(SelectExpression e) {
	//     // validateSelectExpressionOperator is automatically satisfied
	// }
	
	
	@Check
	def checkItemFlow(ItemFlow flow) {
		// validateItemFlowItemFeature
		val items = flow.ownedFeature.filter[f | f instanceof ItemFeature]
		checkAtMostOne(items, INVALID_ITEM_FLOW_ITEM_FEATURE_MSG, null, INVALID_ITEM_FLOW_ITEM_FEATURE)
	}
	
	@Check
	def checkItemFlowEnd(ItemFlowEnd flowEnd) {
		// validateItemFlowEndIsEnd is automatically satisfied
		
		// validateItemFlowEndNestedFeature
		if (flowEnd.ownedFeature.size != 1) {
			error(INVALID_ITEM_FLOW_END_NESTED_FEATURE_MSG, flowEnd, null, INVALID_ITEM_FLOW_END_NESTED_FEATURE)
		}
		
		// validateItemFlowEndOwningType
		if (!(flowEnd.owningType instanceof ItemFlow)) {
			error(INVALID_ITEM_FLOW_END_OWNING_TYPE_MSG, flowEnd, null, INVALID_ITEM_FLOW_END_OWNING_TYPE)
		}
	
		// TODO: Add validateItemFlowEndSubsetting? validateItemFlowEndImplicitSubsetting?
		if (FeatureUtil.getSubsettedNotRedefinedFeaturesOf(flowEnd).isEmpty) {
			error(INVALID_ITEM_FLOW_END_SUBSETTING_MSG, flowEnd, null, INVALID_ITEM_FLOW_END_SUBSETTING)
		} else if (flowEnd.ownedSubsetting.isEmpty) {
			val features = flowEnd.ownedFeature
			if (!features.isEmpty && !features.get(0).ownedRedefinition.isEmpty) {
				warning(INVALID_ITEM_FLOW_END_IMPLICIT_SUBSETTING_MSG, flowEnd, null, INVALID_ITEM_FLOW_END_IMPLICIT_SUBSETTING)
			}
		}
	}
	
	@Check
	def checkFeatureValue(FeatureValue fv) {
		// validateFeatureValueOverriding
		val f = fv.featureWithValue;
		if (f !== null) {
			val redefs = FeatureUtil.getAllRedefinedFeaturesOf(f);
			if (redefs.map[r | FeatureUtil.getValuationFor(r)].exists[v | v !== null && v != fv && !v.isDefault]) {
				error(INVALID_FEATURE_VALUE_OVERRIDING_MSG, fv, null, INVALID_FEATURE_VALUE_OVERRIDING);
			}
		}
	}
	
	@Check
	def checkMultiplicityRange(MultiplicityRange mult) {
		// TODO: Correct validateMultiplicityBoundResults OCL from KERML-199.
		// validateMultiplicityRangeBoundResultTypes
		for (b: mult.bound) {
			if (if (b.isModelLevelEvaluable) mult.valueOf(b) == -2 else !b.isInteger) {
				error(INVALID_MULTIPLICITY_RANGE_BOUND_RESULT_TYPES_MSG, b, null, INVALID_MULTIPLICITY_RANGE_BOUND_RESULT_TYPES)
			}
		}
	}
	
	@Check
	def checkMetadataFeature(MetadataFeature mf) {
		
		// TODO: Submit new issue to revise this to actually fix the problem KERML-90 was trying to address.
		// validateMetadataFeatureMetaclass
		if (mf.type.filter(Metaclass).size() != 1) {
			error(INVALID_METADATA_FEATURE_METACLASS_MSG, mf, null, INVALID_METADATA_FEATURE_METACLASS)
		}
		
		// validateMetadataFeatureMetaclassNotAbstract
		if (mf.type.exists[abstract]) {
			error(INVALID_METADATA_FEATURE_METACLASS_NOT_ABSTRACT_MSG, mf, null, INVALID_METADATA_FEATURE_METACLASS_NOT_ABSTRACT)
		}
		
		// validateMetadataFeatureAnnotatedElement
		var annotatedElementFeatures = FeatureUtil.getAllSubsettingFeaturesIn(mf, EvaluationUtil.getAnnotatedElementFeature(mf));
		if (annotatedElementFeatures.exists[!abstract]) {
			annotatedElementFeatures = annotatedElementFeatures.filter[!abstract].toList
		}
		if (!annotatedElementFeatures.empty) {
			for (element: mf.annotatedElement) {
				val metaclass = ElementUtil.getMetaclassOf(element)
				if (metaclass !== null && !annotatedElementFeatures.exists[f | f.type.forall[t | TypeUtil.conforms(metaclass, t)]]) {
					error(INVALID_METADATA_FEATURE_ANNOTATED_ELEMENT_MSG.replace("{metaclass}", metaclass.declaredName), mf, null, INVALID_METADATA_FEATURE_ANNOTATED_ELEMENT)
				}
			}
		}
		
		// validateMetadataFeatureBody
		checkMetadataBody(mf)
	}
	
	
	def void checkMetadataBody(Feature t) {
		for (f: t.ownedFeature) {
			checkMetadataBodyFeature(f)
		}
	}
	
	def checkMetadataBodyFeature(Feature f) {
		// Must redefine a feature owned by a supertype of its owner.
		if (!f.ownedRedefinition.map[redefinedFeature?.owningType].exists[t | t !== null && TypeUtil.conforms(f.owningType, t)]) {
			error(INVALID_METADATA_FEATURE_BODY_MSG_1, f, null, INVALID_METADATA_FEATURE_BODY)
		}
		
		// Feature value, if any, must be model-level evaluable.
		val fv = FeatureUtil.getValuationFor(f)
		val value = fv?.value
		if (value !== null && !value.isModelLevelEvaluable) {
			error(INVALID_METADATA_FEATURE_BODY_MSG_2, fv, SysMLPackage.eINSTANCE.featureValue_Value, INVALID_METADATA_FEATURE_BODY)
		}
		
		// Must have a valid metadata body.
		checkMetadataBody(f)		
	}
	
	@Check
	def checkElementFilterMembership(ElementFilterMembership efm) {
		val condition = efm.condition
		if (condition !== null)
			// validateElementFilterMembershipIsModelLevelEvaluable
			if (!condition.isModelLevelEvaluable)
				error(INVALID_ELEMENT_FILTER_MEMBERSHIP_IS_MODEL_LEVEL_EVALUABLE_MSG, efm, SysMLPackage.eINSTANCE.elementFilterMembership_Condition, INVALID_ELEMENT_FILTER_MEMBERSHIP_IS_MODEL_LEVEL_EVALUABLE)
				
			// validateElementFilterMembershipIsBoolean
			else if (!condition.isBoolean)
				error(INVALID_ELEMENT_FILTER_MEMBERSHIP_IS_BOOLEAN_MSG, efm, SysMLPackage.eINSTANCE.elementFilterMembership_Condition, INVALID_ELEMENT_FILTER_MEMBERSHIP_IS_BOOLEAN)
	}
	
	@Check
	def checkLibraryPackage(LibraryPackage pkg) {
		if (pkg.isStandard && !pkg.eResource.isModelLibrary) {
			warning(INVALID_LIBRARY_PACKAGE_NOT_STANDARD_MSG, pkg, SysMLPackage.eINSTANCE.libraryPackage_IsStandard, INVALID_LIBRARY_PACKAGE_NOT_STANDARD)
		}
	}
	
	/* Utility Methods */
	
	private def static boolean isModelLibrary(Resource resource) {
		if (resource === null) {
			return false;
		} else {
			val path = resource.URI.devicePath ?: resource.URI.path;
			return path !== null && path.contains(SysMLLibraryUtil.modelLibraryPath);
		}
	}
	
	def static boolean isBoolean(Expression condition) {
		specializesFromLibrary(condition, condition.result, "ScalarValues::Boolean") ||
		// LiteralBooleans currently don't have an inferred Boolean result type.
		condition instanceof LiteralBoolean ||
		// Non-conditional "Boolean" operations in DataFunctions actually have result DataValue.
		// This infers that they are actually BooleanFunctions if their arguments are Boolean.
		condition instanceof OperatorExpression && 
			(condition as OperatorExpression).operator.booleanOperator && 
			(condition as OperatorExpression).argument.forall[isBoolean]
	}
	
	def static isBooleanOperator(String operator) {
		newArrayList("not", "xor", "&", "|").contains(operator)
	}
	
	def static boolean isBooleanExpression(Type expr) {
		if (expr instanceof Expression) {
			val result = expr.result;
			if (result !== null && specializesFromLibrary(expr, result, "Performances::BooleanEvaluation")) {
				return true
			} else if (expr instanceof FeatureReferenceExpression) {
				val referent = expr.referent
				if (referent instanceof Expression) {
					if (referent.isBoolean) {
						return true
					} else {
						val resultExpr = ExpressionUtil.getResultExpressionOf(referent);
				        return resultExpr !== null && resultExpr.isBoolean 
					}
				}			
			}
		}
		return false;
	}
	
	def static boolean isInteger(Expression expr) {
		expr instanceof LiteralInteger || expr instanceof LiteralInfinity ||
		specializesFromLibrary(expr, expr.result, "ScalarValues::Integer") ||
		// Arithmetic operations in DataFunctions actually have result DataValue.
		// This infers that operations other than division are actually at least IntegerFunctions if their arguments are Integer.
		expr instanceof OperatorExpression && 
			(expr as OperatorExpression).operator.integerOperator && 
			(expr as OperatorExpression).argument.forall[isInteger]
	}
	
	def static isIntegerOperator(String operator) {
		newArrayList("-", "+", "*", "%", "^", "**").contains(operator)
	}
	
	def static specializesFromLibrary(Element context, Type type, String qualifiedName) {
		TypeUtil.conforms(type, getLibraryType(context, qualifiedName))
	}
	
	def static getLibraryType(Element context, String qualifiedName) {
		SysMLLibraryUtil.getLibraryElement(context, qualifiedName) as Type
	}
	
	protected def checkAtMostOne(Iterable<? extends EObject> list, String msg, EStructuralFeature feature, String code) {
		if (list.size() > 1) {
			for (var i = 1; i < list.size(); i++) {
				error(msg, list.get(i), feature, code)
			}
		}
	}

	protected def checkNotOne(Iterable<? extends EObject> list, String msg, String code) {
		if (list.size == 1) {
			error(msg, list.get(0), null, code)
		}
	}
	
	protected def checkTargetNotObject(EObject obj, List<? extends Relationship> rels, String msg, String code) {
		for (r: rels) {
			if (r.target.contains(obj))
				error(msg, r, null, code)
		}
	}
	
	protected def static typesConform(List<Type> t1, List<Type> t2) {
		t1.exists[tt1 | t2.exists[tt2 | tt2.conformsTo(tt1)]] ||
		t2.exists[tt2 | t1.exists[tt1 | tt1.conformsTo(tt2)]]
	}
	
	// Return conforming subtypes
	protected static def Iterable<Type> conformsFrom(Type supertype, List<Type> subtypes) 
	{
		subtypes.filter[subtype|subtype.conformsTo(supertype)]
	}
	
	// Return conformed supertypes
    protected static def Iterable<Type> conformsTo(Type subtype, List<Type> supertypes) 
	{
		supertypes.filter[supertype|subtype.conformsTo(supertype)]
	}

	protected static def boolean conformsTo(Type subtype, Type supertype) {
		supertype === null || TypeUtil.conforms(subtype, supertype) ||
			subtype instanceof Expression &&
			isBooleanExpression(subtype as Expression) && 
			specializesFromLibrary(subtype, supertype, "Performances::BooleanExpression")
	}
	
}
