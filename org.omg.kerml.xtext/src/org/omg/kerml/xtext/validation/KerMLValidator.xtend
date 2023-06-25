/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018-2023 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Relationship
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

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class KerMLValidator extends AbstractKerMLValidator {

	public static val INVALID_MULTIPLICITY_ILLEGALLOWERBOUND = 'Invalid Multiplicity - Illegal lower bound'
	public static val INVALID_SUBSETTING_OWNINGTYPECONFORMANCE = 'Invalid Subsetting - OwningType conformance'
	public static val INVALID_REDEFINITION_OWNINGTYPECONFORMANCE = 'Invalid Redefinition - OwningType conformance'
	public static val INVALID_SUBSETTING_MULTIPLICITYCONFORMANCE = 'Invalid Subsetting - Multiplicity conformance'
	public static val INVALID_REDEFINITION_MULTIPLICITYCONFORMANCE = 'Invalid Redefinition - Multiplicity conformance'
	public static val INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE = 'Invalid Subsetting - Uniqueness conformance'
	
	public static val INVALID_REFERENCESUBSETTING_TOO_MANY = 'Invalid ReferenceSubsetting - Too many'
	public static val INVALID_REFERENCESUBSETTING_TOO_MANY_MSG = 'At most one reference subsetting is allowed'

	public static val INVALID_FEATURECHAINING_TOO_FEW = 'Invalid FeatureChaining - Too few'
	public static val INVALID_FEATURECHAINING_TOO_FEW_MSG = 'Cannot have only one feature chaining'
	public static val INVALID_UNIONING_TOO_FEW = 'Invalid Unioning - Too few'
	public static val INVALID_UNIONING_TOO_FEW_MSG = 'Cannot have only one unioning'
	public static val INVALID_INTERSECTING_TOO_FEW = 'Invalid Intersecting - Too few'
	public static val INVALID_INTERSECTING_TOO_FEW_MSG = 'Cannot have only one intersecting'
	public static val INVALID_DIFFERENCING_TOO_FEW = 'Invalid Differencing - Too few'
	public static val INVALID_DIFFERENCING_TOO_FEW_MSG = 'Cannot have only one differencing'
	
	public static val INVALID_CONNECTOR_END__CONTEXT = 'Invalid Connector end - Context'
	public static val INVALID_CONNECTOR_END__CONTEXT_MSG = "Should be an accessible feature (use dot notation for nesting)"
	public static val INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE = 'Invalid BindingConnector - Argument type conformance'
	public static val INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE_MSG = "Output feature must conform to input feature"
	public static val INVALID_BINDINGCONNECTOR__BINDING_TYPE = 'Invalid BindingConnector - Binding type conformance'
	public static val INVALID_BINDINGCONNECTOR__BINDING_TYPE_MSG = "Bound features should have conforming types"
	public static val INVALID_ITEMFLOW__INVALID_END = 'Invalid ItemFlow end - No subsetting'
	public static val INVALID_ITEMFLOW__INVALID_END_MSG = "Cannot identify item flow end (use dot notation)"
	public static val INVALID_ITEMFLOW__IMPLICIT_END = 'Invalid ItemFlow end - Implicit subsetting'
	public static val INVALID_ITEMFLOW__IMPLICIT_END_MSG = "Flow ends should use dot notation"
	public static val INVALID_CLASSIFIER__DEFAULT_SUPERTYPE = 'Invalid Classifier - Default supertype conformance'
	public static val INVALID_CLASSIFIER__DEFAULT_SUPERTYPE_MSG = "Must directly or indirectly specialize {supertype}"
	public static val INVALID_FEATURE__NO_TYPE = 'Invalid Feature - Mandatory typing'
	public static val INVALID_FEATURE__NO_TYPE_MSG = "Features must have at least one type"
	public static val INVALID_RELATIONSHIP__RELATED_ELEMENTS = 'Invalid Relationship - Related element minimum validation'
	public static val INVALID_RELATIONSHIP__RELATED_ELEMENTS_MSG = "Relationships must have at least two related elements"
	public static val INVALID_MEMBERSHIP__DISTINGUISHABILITY = "Invalid Membership - Distinguishablity"
	public static val INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_0 = "Duplicate of owned element name"
	public static val INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_1 = "Duplicate of other alias name"
	public static val INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_2 = "Duplicate of inherited member name"
	public static val INVALID_ELEMENT__DISTINGUISHABILITY = "Invalid Element - Distinguishability"
	public static val INVALID_ELEMENT__DISTINGUISHABILITY_MSG = "Duplicate of other element name"
	public static val INVALID_ELEMENT_FILTER_MEMBERSHIP__NOT_MODEL_LEVEL = "Invalid ElementFilterMembership - Not model-level"
	public static val INVALID_ELEMENT_FILTER_MEMBERSHIP__NOT_MODEL_LEVEL_MSG = "Must be model-level evaluable"
	public static val INVALID_ELEMENT_FILTER_MEMBERSHIP__FEATURE_VALUE_NOT_BOOLEAN = "Invalid ElementFilterMembership - Condition not Boolean"
	public static val INVALID_ELEMENT_FILTER_MEMBERSHIP__FEATURE_VALUE_NOT_BOOLEAN_MSG = "Must have a Boolean result"
	public static val INVALID_METADATA_FEATURE__ABSTRACT_TYPE = "Invalid MetadataFeature - Abstract type"
	public static val INVALID_METADATA_FEATURE__ABSTRACT_TYPE_MSG = "Must have a concrete type"
	public static val INVALID_METADATA_FEATURE__BAD_ELEMENT = "Invalid MetadataFeature - Bad annotated element"
	public static val INVALID_METADATA_FEATURE__BAD_ELEMENT_MSG = "Cannot annotate {metaclass}"
	public static val INVALID_METADATA_FEATURE__BAD_REDEFINITION = "Invalid MetadataFeature - Bad redefinition"
	public static val INVALID_METADATA_FEATURE__BAD_REDEFINITION_MSG = "Must redefine an owning-type feature"
	public static val INVALID_METADATA_FEATURE__FEATURE_VALUE_NOT_MODEL_LEVEL = "Invalid MetadataFeature - FeatureValue not model-level"
	public static val INVALID_METADATA_FEATURE__FEATURE_VALUE_NOT_MODEL_LEVEL_MSG = "Must be model-level evaluable"
	public static val INVALID_FEATURE_CHAINING__INVALID_FEATURE = "Invalid FeatureChaining - Invalid feature"
	public static val INVALID_FEATURE_CHAINING__INVALID_FEATURE_MSG = "Must be a valid feature"
	public static val INVALID_FEATURE_REFERENCE_EXPRESSION__INVALID_FEATURE = "Invalid FeatureReferenceExpression - Invalid feature"
	public static val INVALID_FEATURE_REFERENCE_EXPRESSION__INVALID_FEATURE_MSG = "Must be a valid feature"
	public static val INVALID_FEATURE_CHAIN_EXPRESSION__INVALID_FEATURE = "Invalid FeatureChainExpression - Invalid feature"
	public static val INVALID_FEATURE_CHAIN_EXPRESSION__INVALID_FEATURE_MSG = "Must be a valid feature"
	public static val INVALID_INVOCATION_EXPRESSION__BAD_REDEFINITION = "Invalid InvocationExpression - Bad redefinition"
	public static val INVALID_INVOCATION_EXPRESSION__BAD_REDEFINITION_MSG = "Must name an input or undirected feature"
	public static val INVALID_INVOCATION_EXPRESSION__DUPLICATE_REDEFINITION = "Invalid InvocationExpression - Duplicate redefinition"
	public static val INVALID_INVOCATION_EXPRESSION__DUPLICATE_REDEFINITION_MSG = "Feature already bound"
	public static val INVALID_TYPE_MULTIPLICITY__TOO_MANY = "Invalid Type - Too many multiplicities"
	public static val INVALID_TYPE_MULTIPLICITY__TOO_MANY_MSG = "Only one multiplicity is allowed"
	public static val INVALID_CAST_EXPRESSION__CAST_TYPE = "Invalid cast Expression - Cast type conformance"
	public static val INVALID_CAST_EXPRESSION__CAST_TYPE_MSG = "Cast argument should have conforming types"
	public static val INVALID_LIBRARY_PACKAGE__NOT_STANDARD = "Invalid LibraryPackage - Bad isStandard"
	public static val INVALID_LIBRARY_PACKAGE__NOT_STANDARD_MSG = "User library packages should not be marked as standard"
	
	public static val INVALID_INDEX_EXPRESSION__BRACKET_OPERATOR = "Invalid index Expression - Bracket operator"
	public static val INVALID_INDEX_EXPRESSION__BRACKET_OPERATOR_MSG = "Use #(...) for indexing"
	
	/* ROOT */
	
	@Check
	def checkElement(Element elm) {
		// TODO: Remove
		if (elm.declaredShortName !== null || elm.getName !== null) {
			val owner = elm.owner;
			if (owner !== null && 
				// Do not check distinguishability for automatically constructed expressions and binding connectors (to improve performance).
			    !(owner instanceof InvocationExpression || owner instanceof FeatureReferenceExpression || owner instanceof LiteralExpression || 
			    	owner instanceof NullExpression || owner instanceof BindingConnector)) {
				for (e: owner.ownedElement) {
					if (e != elm) {
						if (elm.declaredShortName !== null && (elm.declaredShortName == e.declaredShortName || elm.declaredShortName == e.getName)) {
							warning(INVALID_ELEMENT__DISTINGUISHABILITY_MSG, elm, SysMLPackage.eINSTANCE.element_DeclaredShortName, INVALID_ELEMENT__DISTINGUISHABILITY)
							return						
						} else if (elm.getName !== null && (elm.getName == e.declaredShortName || elm.getName == e.getName)) {
							warning(INVALID_ELEMENT__DISTINGUISHABILITY_MSG, elm, if (e.declaredName !== null) SysMLPackage.eINSTANCE.element_DeclaredName else null, INVALID_ELEMENT__DISTINGUISHABILITY)
							return														
						}												
					}
				}
			}
		}
	}
	
	// TODO: Check validateElementIsImpliedIncluded
	
	@Check
	def checkRelationship(Relationship r){
		// Allow abstract associations and connectors to have less than two ends.
		// validateAssociationRelatedTypes
		if (!(r instanceof Type && (r as Type).isAbstract)) {
			val relatedElements = r.getRelatedElement
			if (relatedElements !== null && relatedElements.size < 2)
				error(INVALID_RELATIONSHIP__RELATED_ELEMENTS_MSG, r, SysMLPackage.eINSTANCE.relationship_RelatedElement, INVALID_RELATIONSHIP__RELATED_ELEMENTS)	
		}
	}
	 
	// validateNamespaceDistinguishability
	@Check
	def checkMembership(Membership mem){
		val namesp = mem.membershipOwningNamespace;	
		// Do not check distinguishability for automatically constructed expressions and binding connectors (to improve performance).
		if (!(namesp instanceof InvocationExpression || namesp instanceof FeatureReferenceExpression || namesp instanceof LiteralExpression || 
				namesp instanceof NullExpression || namesp instanceof BindingConnector)) {
			if (!(mem instanceof OwningMembership)) {
				for (e: namesp.ownedElement) {
					if (mem.memberShortName !== null && (mem.memberShortName == e.declaredShortName || mem.memberShortName == e.getName)) {
						warning(INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_0, mem, SysMLPackage.eINSTANCE.membership_MemberShortName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
					} else if (mem.memberName !== null && (mem.memberName == e.declaredShortName || mem.memberName == e.getName)) {
						warning(INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_0, mem, SysMLPackage.eINSTANCE.membership_MemberName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
					}
				}
				for (m: namesp.ownedMembership) {
					checkDistinguishibility(mem, m, INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_1)							
				}
			}
			if (namesp instanceof Type){
				ElementUtil.clearCachesOf(namesp) // Force recomputation of inherited memberships.
				for (m : namesp.inheritedMembership) {
					checkDistinguishibility(mem, m, INVALID_MEMBERSHIP__DISTINGUISHABILITY_MSG_2)
				}
			}
		}
		
	}
	
	def checkDistinguishibility(Membership mem, Membership other, String msg) {
		val memShortName = mem.memberShortName
		val memName = mem.memberName
		val otherShortName = other.memberShortName
		val otherName = other.memberName
		
		if (mem.memberElement !== other.memberElement) {
			if (memShortName !== null && (memShortName == otherShortName || memShortName == otherName)) {
				if (mem instanceof OwningMembership) {
					warning(msg, mem.ownedMemberElement, SysMLPackage.eINSTANCE.element_DeclaredShortName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
				} else {
					warning(msg, mem, SysMLPackage.eINSTANCE.membership_MemberShortName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
				}
			} else if (memName !== null && (memName == otherShortName || memName == otherName)) {
				if (mem instanceof OwningMembership) {
					warning(msg, mem.ownedMemberElement, SysMLPackage.eINSTANCE.element_DeclaredName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
				} else {
					warning(msg, mem, SysMLPackage.eINSTANCE.membership_MemberName, INVALID_MEMBERSHIP__DISTINGUISHABILITY)
				}
			}
		}
	}
	
	/* CORE */
	
	// TODO: Check validateSpecializationSpecificNotConjugated
	
	// TODO: Check validateTypeAtMostOneConjugator
	// TODO: Check validateTypeDifferencingTypesNotSelf
	// TODO: Check validateTypeIntersectingTypesNotSelf
	// TODO: Check validateTypeUnioningTypesNotSelf
	
	@Check
	def checkType(Type t) {
		// TODO: Add validateTypeUnioningTypeNotOne
		checkNotOne(t.ownedUnioning, INVALID_UNIONING_TOO_FEW_MSG, INVALID_UNIONING_TOO_FEW)
		// TODO: Add validateTypeIntersectingTypeNotOne
		checkNotOne(t.ownedIntersecting, INVALID_INTERSECTING_TOO_FEW_MSG, INVALID_INTERSECTING_TOO_FEW)
		// TODO: Add validateTypeDifferencingTypeNotOne
		checkNotOne(t.ownedDifferencing, INVALID_DIFFERENCING_TOO_FEW_MSG, INVALID_DIFFERENCING_TOO_FEW)
	}
	
	// validateTypeOwnedMultiplicity
	@Check
	def checkTypeMultiplicity(Type t) {
		var multiplicityMemberships = t.ownedMembership.filter[memberElement instanceof Multiplicity];
		if (multiplicityMemberships.size > 1) {
			for (var i = 1; i < multiplicityMemberships.size; i++) {
				error(INVALID_TYPE_MULTIPLICITY__TOO_MANY_MSG, multiplicityMemberships.get(i), SysMLPackage.eINSTANCE.membership_MemberElement, INVALID_TYPE_MULTIPLICITY__TOO_MANY);			
			}
		}
	}
	
	// Check default supertype (semantic constraint)
	@Check
	def checkClassifier(Classifier c){
		val defaultSupertype = ImplicitGeneralizationMap.getDefaultSupertypeFor(c.getClass())
		if (!TypeUtil.conforms(c, SysMLLibraryUtil.getLibraryType(c, defaultSupertype)))
			error(INVALID_CLASSIFIER__DEFAULT_SUPERTYPE_MSG.replace("{supertype}", defaultSupertype), c, SysMLPackage.eINSTANCE.classifier_OwnedSubclassification, INVALID_CLASSIFIER__DEFAULT_SUPERTYPE)
	}
	
	// validateEndFeatureMembershipEnd is automatically satisfied
	
	@Check
	def checkFeature(Feature f){
		val types = f.type;
		
		// TODO: Remove?
		if (types !== null && types.isEmpty)
			error(INVALID_FEATURE__NO_TYPE_MSG, f, SysMLPackage.eINSTANCE.feature_Type, INVALID_FEATURE__NO_TYPE)
			
		// validateFeatureOwnedReferenceSubsetting
		val refSubsettings = f.ownedRelationship.filter[r | r instanceof ReferenceSubsetting].toList
		if (refSubsettings.size > 1) {
			for (var i = 1; i < refSubsettings.size; i++)
				error(INVALID_REFERENCESUBSETTING_TOO_MANY_MSG, refSubsettings.get(i), null, INVALID_REFERENCESUBSETTING_TOO_MANY)
		}
		
		// validateFeatureChainingFeatureNotOne
		checkNotOne(f.ownedFeatureChaining, INVALID_FEATURECHAINING_TOO_FEW_MSG, INVALID_FEATURECHAINING_TOO_FEW)
	}
		
	// TODO: Check validateFeatureChainingFeaturesNotSelf
	// TODO: Check validateFeatureMultiplicityDomain

	// TODO: Add validateFeatureChainingFeatureConformance
	@Check
	def checkFeatureChaining(FeatureChaining fc) {
		val featureChainings = fc.featureChained.ownedFeatureChaining;
		val i = featureChainings.indexOf(fc);
		if (i > 0) {
			val prev = featureChainings.get(i-1).chainingFeature;
			if (!fc.chainingFeature.featuringType.forall[t2 | prev.conformsTo(t2)]) {
				error(INVALID_FEATURE_CHAINING__INVALID_FEATURE_MSG, fc, SysMLPackage.eINSTANCE.featureChaining_ChainingFeature, INVALID_FEATURE_CHAINING__INVALID_FEATURE)
			}
		}
	}
	
	// TODO: Add/check validateRedefinitionDirectionConformance
	
	@Check
	def checkSubsettingConformance(Subsetting sub) { 
		
		// Due to how connector is implemented, no validation is performed if the owner is a Connector.
		if ( sub.subsettingFeature.owningType instanceof Connector || sub.subsettedFeature.owningType instanceof Connector ) 
			return;

		val subsettingFeature = sub.subsettingFeature
		val subsettedFeature = sub.subsettedFeature

		// Multiplicity conformance
		
		var setted_m = FeatureUtil.getMultiplicityRangeOf(subsettedFeature?.multiplicity)
		var setting_m = FeatureUtil.getMultiplicityRangeOf(subsettingFeature?.multiplicity)
		
		// TODO: Add validateSubsettingMultiplicityConformance
		
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
			
			// Lower bound (only check if the Subsetting is a Redefinition and Features are not ends): setting must be >= setted
			if (sub instanceof Redefinition && !subsettingFeature.isEnd()) {
				if (setting_m_l instanceof LiteralInteger && setted_m_l instanceof LiteralInteger && (setting_m_l as LiteralInteger).getValue < (setted_m_l as LiteralInteger).getValue ||
					setting_m_l instanceof LiteralInfinity && setted_m_l instanceof LiteralInteger && 0 < (setted_m_l as LiteralInteger).getValue) {
					warning("Redefining feature should not have smaller multiplicity lower bound", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefiningFeature, INVALID_REDEFINITION_MULTIPLICITYCONFORMANCE)
				}
			}
			
			// Upper bound: setting must be <= setted
			if (setting_m_u instanceof LiteralInfinity && !(setted_m_u instanceof LiteralInfinity) ||
				setting_m_u instanceof LiteralInteger && setted_m_u instanceof LiteralInteger && (setting_m_u as LiteralInteger).getValue > (setted_m_u as LiteralInteger).getValue) {
				warning("Subsetting/redefining feature should not have larger multiplicity upper bound", sub, 
						SysMLPackage.eINSTANCE.subsetting_SubsettingFeature, INVALID_SUBSETTING_MULTIPLICITYCONFORMANCE)
			}
		}
		
		// TODO: Add validateSubsettingUniquenessConformance

		// Uniqueness conformance
		if (subsettedFeature !== null && subsettedFeature.unique && subsettingFeature !== null && !subsettingFeature.unique){
			warning("Subsetting/redefining feature should not be nonunique if subsetted/redefined feature is unique", sub, 
					SysMLPackage.eINSTANCE.subsetting_SubsettingFeature, INVALID_SUBSETTING_UNIQUENESS_CONFORMANCE)
		}
					
		// Featuring type conformance
		if (subsettingFeature !== null && subsettedFeature !== null) {
			val subsettingFeaturingTypes = subsettingFeature.featuringType
			val subsettedFeaturingTypes = subsettedFeature.featuringType
			
			// validateRedefinitionFeaturingTypes
			if (sub instanceof Redefinition && subsettedFeature.owningRelationship != sub &&
				subsettedFeaturingTypes.containsAll(subsettingFeaturingTypes) && 
				subsettedFeaturingTypes.size == subsettingFeaturingTypes.size){
				if (subsettingFeaturingTypes.isEmpty) {
					warning("A package-level feature should not be redefined", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
				} else {
					warning("Owner of redefining feature should not be the same as owner of redefined feature", sub, 
						SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, INVALID_REDEFINITION_OWNINGTYPECONFORMANCE)
				}
			}
			
			// validateSubsettingFeaturingTypes
			else if (!subsettedFeaturingTypes.isEmpty() && 
					!subsettedFeaturingTypes.forall[t | 
						subsettingFeaturingTypes.exists[ f | 
							// TODO: Remove "isFeaturedWithin" when possible
							f.conformsTo(t) || f instanceof Feature && (f as Feature).isFeaturedWithin(t)]]) {
				if (subsettingFeature.owningType instanceof ItemFlowEnd) {
					error("Must be an accessible feature (use dot notation for nesting)", sub, 
					SysMLPackage.eINSTANCE.subsetting_SubsettedFeature, INVALID_SUBSETTING_OWNINGTYPECONFORMANCE)
				} else {
					warning("Must be an accessible feature (use dot notation for nesting)", sub, 
					SysMLPackage.eINSTANCE.subsetting_SubsettedFeature, INVALID_SUBSETTING_OWNINGTYPECONFORMANCE)
				}
			}
		}
	}
	
	/* KERNEL */
	
	// TODO: Check validateDataTypeSpecialization
	
	// TODO: Check validateClassSpecialization
	
	// TODO: Check validateAssociationBinarySpecialization
	// TODO: Check validateAssociationStructureIntersection
	
	// validateAssociationRelatedTypes checked in checkRelationship
	
	@Check
	def checkBindingConnector(BindingConnector bc){
		doCheckBindingConnector(bc, bc)
	}
	
	// TODO: Remove?
	@Check
	def checkImplicitBindingConnectors(Type type) {
		TypeUtil.forEachImplicitBindingConnectorOf(type, [connector, kind | 
			if (type instanceof FeatureReferenceExpression) {
				connector.doCheckConnector(type, kind) 
			}
			connector.doCheckBindingConnector(type)
		])
	}
	
	private def doCheckBindingConnector(BindingConnector bc, Element location) {
		val rf = bc.relatedFeature
		
		// TODO: Check validateBindingConnectorIsBinary
		if (rf.length !== 2) {
			return //ignore binding connectors with invalid syntax
		}
		
//		val inFeature = rf.map[owningFeatureMembership].filter[m|m !== null && m.direction == FeatureDirectionKind.IN].map[ownedMemberFeature_comp].findFirst[true]
//		val outFeature = rf.map[owningFeatureMembership].filter[m|m !== null && m.direction == FeatureDirectionKind.OUT].map[ownedMemberFeature_comp].findFirst[true]
//		
//		if (inFeature !== null && outFeature !== null){
//			//Argument type conformance
//			val inTypes = inFeature.type
//			val outTypes = outFeature.type
//			val outConformsToIn = inTypes.map[conformsFrom(outTypes)]
//			if (outConformsToIn.filter[!empty].length != inTypes.length)		
//				error(INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE_MSG, bc, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__ARGUMENT_TYPE)
//		} else { 
			// TODO: Add validateBindingConnectorTypeConformance
			//Binding type conformance
			val f1types = rf.get(0).type
			val f2types = rf.get(1).type
						 
			if (!typesConform(f1types, f2types))
				warning(INVALID_BINDINGCONNECTOR__BINDING_TYPE_MSG, location, SysMLPackage.eINSTANCE.type_EndFeature, INVALID_BINDINGCONNECTOR__BINDING_TYPE)
//		}
	}
	
	// TODO: Check validateConnectorBinarySpecialization
	
	@Check
	def checkConnector(Connector c){		
		doCheckConnector(c, c, null)
	}
	
	private def doCheckConnector(Connector c, Type location, EClass kind) {
		ElementUtil.transform(c)
		val cFeaturingTypes = c.featuringType
		
		if (kind == SysMLPackage.Literals.FEATURE_MEMBERSHIP) {
			cFeaturingTypes.add(location);
		}

		// checkConnectorTypeFeaturing
		// TODO: Add validation for type featuring?
		val relatedFeatures = c.relatedFeature				
		val connectorEnds = c.connectorEnd
		for (var i = 0; i < relatedFeatures.size; i++) {
			val relatedFeature = relatedFeatures.get(i)
			if (!(relatedFeature.featuringType.empty || 
				cFeaturingTypes.exists[featuringType |
					relatedFeature.featuringType.exists[f | featuringType.conformsTo(f)]] ||
				(location instanceof FeatureReferenceExpression || location instanceof FeatureChainExpression) && 
					relatedFeature.getOwningType() == location ||
				c instanceof ItemFlow && c.owningNamespace instanceof Feature && c.owningType === null)) {
				warning(INVALID_CONNECTOR_END__CONTEXT_MSG, 
					if (location === c && i < connectorEnds.size) connectorEnds.get(i) else location, 
					null, INVALID_CONNECTOR_END__CONTEXT)
			}
		}
	}
	
	// TODO: Check validateParameterMembershipOwningType
	// validateParameterMembershipParameterHasDirection is automatically satisfied
	
	// TODO: Check validateExpressionResultParameterMembership
	
	// TODO: Check validateFunctionResultParameterMembership
	
	// TODO: Check validateResultExpressionMembershipOwningType
	
	// validateReturnParameterMembershipParameterHasDirection is automatically satisfied
	
	// validateCollectExpressionOperator is automatically satisfied
	
	// TODO: Add validateFeatureChainExpressionFeatureConformance
	@Check
	def checkFeatureChainExpression(FeatureChainExpression e) {
		val feature = ExpressionUtil.getTargetFeatureFor(e)
		val rel = NamespaceUtil.getRelativeNamespaceFor(e)
		if (feature !== null &&
			(!(feature instanceof Feature) || 
				rel instanceof Type &&
				!(feature as Feature).featuringType.isEmpty &&
				!(feature as Feature).featuringType.exists[t | (rel as Type).conformsTo(t)]
			)) {
			error(INVALID_FEATURE_CHAIN_EXPRESSION__INVALID_FEATURE_MSG, e.ownedMembership.get(1), SysMLPackage.eINSTANCE.membership_MemberElement, INVALID_FEATURE_CHAIN_EXPRESSION__INVALID_FEATURE)
		}
	}
	
	// TODO: Add validateFeatureReferenceExpressionReferentIsFeature
	@Check
	def checkFeatureReferenceExpression(FeatureReferenceExpression e) {
		val feature = ExpressionUtil.getReferentFor(e)
		if (feature !== null && !(feature instanceof Feature)) {
			error(INVALID_FEATURE_REFERENCE_EXPRESSION__INVALID_FEATURE_MSG, e, null, INVALID_FEATURE_REFERENCE_EXPRESSION__INVALID_FEATURE)
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
						// TODO: Add validateInvocationExpressionParameterRedefinition
						// Input parameter must redefine a parameter of the expression type
						error(INVALID_INVOCATION_EXPRESSION__BAD_REDEFINITION_MSG, p, null, INVALID_INVOCATION_EXPRESSION__BAD_REDEFINITION)
					} else if (redefParams.exists[f | usedParams.contains(f)]) {
						// TODO: Add validateInvocationExpressionNoDuplicateParameterRedefinition
						// Two parameters cannot redefine the same type parameter 
						error(INVALID_INVOCATION_EXPRESSION__DUPLICATE_REDEFINITION_MSG, p, null, INVALID_INVOCATION_EXPRESSION__DUPLICATE_REDEFINITION)
					}
					usedParams.addAll(redefParams)
				}
			}
		}
	}
	
	// TODO: Add validateOperatorExpressionCastConformance
	@Check
	def checkCastExpression(OperatorExpression e) {
		if (e.operator == "as") {
			val params = TypeUtil.getOwnedParametersOf(e)
			if (params.length >= 2) {
				val arg = FeatureUtil.getValueExpressionFor(params.get(0))
				if (arg !== null) {
					val argTypes = arg.result.type
					val targetTypes = params.get(1).type
					if (!typesConform(argTypes, targetTypes))
						warning(INVALID_CAST_EXPRESSION__CAST_TYPE_MSG, e, null, INVALID_CAST_EXPRESSION__CAST_TYPE)
					}
			}
		}
	}
	
	@Check
	def checkOperatorExpression(OperatorExpression e) {
		if (e.operator == '[') {
			warning(org.omg.kerml.xtext.validation.KerMLValidator.INVALID_INDEX_EXPRESSION__BRACKET_OPERATOR_MSG, e, null, org.omg.kerml.xtext.validation.KerMLValidator.INVALID_INDEX_EXPRESSION__BRACKET_OPERATOR)
		}
	}
	
	// TODO: Add validateSelectExpressionOperator
	
	// TODO: Check validateItemFlowItemFeature
	
	// TODO: Add validateItemFlowEnds?
	@Check 
	def checkItemFlow(ItemFlow flow) {
		for (flowEnd: flow.itemFlowEnd) {
			if (FeatureUtil.getSubsettedNotRedefinedFeaturesOf(flowEnd).isEmpty) {
				error(INVALID_ITEMFLOW__INVALID_END_MSG, flowEnd, null, INVALID_ITEMFLOW__INVALID_END)
			} else if (flowEnd.ownedSubsetting.isEmpty) {
				val features = flowEnd.ownedFeature
				if (!features.isEmpty && !features.get(0).ownedRedefinition.isEmpty) {
					warning(INVALID_ITEMFLOW__IMPLICIT_END_MSG, flowEnd, null, INVALID_ITEMFLOW__IMPLICIT_END)
				}
			}
		}
	}
	
	// validateItemFlowEndIsEnd is automatically satisfied
	// TODO: Check validateItemFlowEndNestedFeature
	// TODO: Check validateItemFlowEndOwningType
	
	// TODO: Add (and check) validateFeatureValueOverriding
	
	// TODO: Check validateMultiplicityRangeBoundResultTypes (need type inference first?)
	
	@Check
	def checkMetadataFeature(MetadataFeature mf) {
		checkMetadataType(mf)
		checkMetadataAnnotatedElements(mf)
		checkMetadataBody(mf)
	}
	
	// TODO: Add validateMetadataFeatureMetaclassNotAbstract
	def void checkMetadataType(MetadataFeature mf) {
		if (mf.type.exists[abstract]) {
			error(INVALID_METADATA_FEATURE__ABSTRACT_TYPE_MSG, mf, null, INVALID_METADATA_FEATURE__ABSTRACT_TYPE)
		}
	}
	
	// TODO: Add validateMetadataFeatureAnnotatedElement
	def void checkMetadataAnnotatedElements(MetadataFeature mf) {
		var annotatedElementFeatures = FeatureUtil.getAllSubsettingFeaturesIn(mf, EvaluationUtil.getAnnotatedElementFeature(mf));
		if (annotatedElementFeatures.exists[!abstract]) {
			annotatedElementFeatures = annotatedElementFeatures.filter[!abstract].toList
		}
		if (!annotatedElementFeatures.empty) {
			for (element: mf.annotatedElement) {
				val metaclass = ElementUtil.getMetaclassOf(element)
				if (metaclass !== null && !annotatedElementFeatures.exists[f | f.type.forall[t | TypeUtil.conforms(metaclass, t)]]) {
					error(INVALID_METADATA_FEATURE__BAD_ELEMENT_MSG.replace("{metaclass}", metaclass.declaredName), mf, null, INVALID_METADATA_FEATURE__BAD_ELEMENT)
				}
			}
		}
	}
	
	// TODO: Add validateMetadataFeatureBody
	def void checkMetadataBody(Feature t) {
		for (f: t.ownedFeature) {
			checkMetadataBodyFeature(f)
		}
	}
	
	def checkMetadataBodyFeature(Feature f) {
		// Must redefine a feature owned by a supertype of its owner.
		if (!f.ownedRedefinition.map[redefinedFeature?.owningType].exists[t | t !== null && TypeUtil.conforms(f.owningType, t)]) {
			error(INVALID_METADATA_FEATURE__BAD_REDEFINITION_MSG, f, null, INVALID_METADATA_FEATURE__BAD_REDEFINITION)
		}
		
		// Feature value, if any, must be model-level evaluable.
		val fv = FeatureUtil.getValuationFor(f)
		val value = fv?.value
		if (value !== null && !value.isModelLevelEvaluable) {
			error(INVALID_METADATA_FEATURE__FEATURE_VALUE_NOT_MODEL_LEVEL_MSG, fv, SysMLPackage.eINSTANCE.featureValue_Value, INVALID_METADATA_FEATURE__FEATURE_VALUE_NOT_MODEL_LEVEL)
		}
		
		// Must have a valid metadata body.
		checkMetadataBody(f)		
	}
	
	@Check
	def checkElementFilterMembership(ElementFilterMembership efm) {
		val condition = efm.condition
		if (condition !== null)
			if (!condition.isModelLevelEvaluable)
				// validateElementFilterMembershipIsModelLevelEvaluable
				error(INVALID_ELEMENT_FILTER_MEMBERSHIP__NOT_MODEL_LEVEL_MSG, efm, SysMLPackage.eINSTANCE.elementFilterMembership_Condition, INVALID_ELEMENT_FILTER_MEMBERSHIP__NOT_MODEL_LEVEL)
			else if (!condition.isBoolean)
				// validateElementFilterMembershipIsBoolean
				error(INVALID_ELEMENT_FILTER_MEMBERSHIP__FEATURE_VALUE_NOT_BOOLEAN_MSG, efm, SysMLPackage.eINSTANCE.elementFilterMembership_Condition, INVALID_ELEMENT_FILTER_MEMBERSHIP__FEATURE_VALUE_NOT_BOOLEAN)
	}
	
	@Check
	def checkLibraryPackage(LibraryPackage pkg) {
		// Note: Can't suppress the warning in Xtend.
		if (pkg.isStandard && !SysMLLibraryUtil.isModelLibrary(pkg.eResource)) {
			warning(INVALID_LIBRARY_PACKAGE__NOT_STANDARD_MSG, pkg, SysMLPackage.eINSTANCE.libraryPackage_IsStandard, INVALID_LIBRARY_PACKAGE__NOT_STANDARD)
		}
	}
	
	def boolean isBoolean(Expression condition) {
		TypeUtil.conforms(condition.result, getBooleanType(condition)) ||
		// LiteralBooleans currently don't have an inferred Boolean result type.
		condition instanceof LiteralBoolean ||
		// Non-conditional "Boolean" operations in DataFunctions actually have result DataValue.
		// This infers that they are actually BooleanFunctions if their arguments are Boolean.
		condition instanceof OperatorExpression && 
			(condition as OperatorExpression).operator.booleanOperator && 
			(condition as OperatorExpression).argument.forall[isBoolean]
	}
	
	def getBooleanType(Element context) {
		SysMLLibraryUtil.getLibraryElement(context, "ScalarValues::Boolean") as Type
	}
	
	def isBooleanOperator(String operator) {
		newArrayList("not", "xor", "&", "|").contains(operator)
	}
	
	def checkNotOne( List<? extends EObject> list, String msg, String code) {
		if (list.size == 1) {
			error(msg, list.get(0), null, code)
		}
	}
	
	def typesConform(List<Type> t1, List<Type> t2) {
		val t1ConformsTot2 = t2.map[conformsFrom(t1)]
		val t2ConformsTot1 = t1.map[conformsFrom(t2)]
		t1ConformsTot2.filter[!empty].length == t2.length ||
			t2ConformsTot1.filter[!empty].length == t1.length
	}
	
	//return related subtypes
	protected def Iterable<Type> conformsFrom(Type supertype, List<Type> subtypes) 
	{
		subtypes.filter[subtype|subtype.conformsTo(supertype)]
	}
	
	//return related supertypes
    protected def Iterable<Type> conformsTo(Type subtype, List<Type> supertypes) 
	{
		supertypes.filter[supertype|subtype.conformsTo(supertype)]
	}

	protected def boolean conformsTo(Type subtype, Type supertype) {
		supertype === null || TypeUtil.conforms(subtype, supertype);
	}
	
}
