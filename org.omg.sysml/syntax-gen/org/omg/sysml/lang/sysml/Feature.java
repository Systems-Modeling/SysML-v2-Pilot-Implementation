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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Feature</code> is a <code>Type</code> that classifies relations between multiple things (in the universe). The domain of the relation is the intersection of the <code>featuringTypes</code> of the <code>Feature</code>. (The domain of a <code>Feature</code> with no <code>featuringTyps</code> is implicitly the most general <code>Type</code> <em><code>Base::Anything</code></em> from the Kernel Semantic Library.) The co-domain of the relation is the intersection of the <code>types</code> of the <code>Feature</code>.
 * 
 * <p>In the simplest cases, the <code>featuringTypes</code> and <code>types</code> are <code>Classifiers</code> and the <code>Feature</code> relates two things, one from the domain and one from the range. Examples include cars paired with wheels, people paired with other people, and cars paired with numbers representing the car length.</p>
 * 
 * <p>Since <code>Features</code> are <code>Types</code>, their <code>featuringTypes</code> and <code>types</code> can be <code>Features</code>. In this case, the <code>Feature</code> effectively classifies relations between relations, which can be interpreted as the sequence of things related by the domain <code>Feature</code> concatenated with the sequence of things related by the co-domain <code>Feature</code>.</p>
 * 
 * <p>The <em>values</em> of a <code>Feature</code> for a given instance of its domain are all the instances of its co-domain that are related to that domain instance by the <code>Feature</code>. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with values of the first <code>Feature</code>, then using those values as domain instances to obtain valus of the second <code>Feature</code>, and so on, to values of the last <code>Feature</code>.</p>
 * 
 * ownedRedefinition = ownedSubsetting->selectByKind(Redefinition)
 * ownedTypeFeaturing = ownedRelationship->selectByKind(TypeFeaturing)->
 *     select(tf | tf.featureOfType = self)
 * ownedSubsetting = ownedSpecialization->selectByKind(Subsetting)
 * ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)
 * type = 
 *     let types : OrderedSet(Types) = OrderedSet{self}->
 *         -- Note: The closure operation automatically handles circular relationships.
 *         closure(typingFeatures()).typing.type->asOrderedSet() in
 *     types->reject(t1 | types->exist(t2 | t2 <> t1 and t2.specializes(t1)))
 * multiplicity <> null implies multiplicity.featuringType = featuringType 
 * specializesFromLibrary('Base::things')
 * chainingFeature->excludes(self)
 * ownedFeatureChaining = ownedRelationship->selectByKind(FeatureChaining)
 * chainingFeature = ownedFeatureChaining.chainingFeature
 * chainingFeature->size() <> 1
 * isEnd and owningType <> null implies
 *     let i : Integer = 
 *         owningType.ownedEndFeature->indexOf(self) in
 *     owningType.ownedSpecialization.general->
 *         forAll(supertype |
 *              supertype.endFeature->size() >= i implies
 *                 redefines(supertype.endFeature->at(i))
 * direction = null and
 * ownedSpecializations->forAll(isImplied) implies
 *     ownedMembership->
 *         selectByKind(FeatureValue)->
 *         forAll(fv | specializes(fv.value.result))
 * isEnd and owningType <> null and
 * (owningType.oclIsKindOf(Association) or
 *  owningType.oclIsKindOf(Connector)) implies
 *     specializesFromLibrary('Links::Link::participant')
 * isComposite and
 * ownedTyping.type->includes(oclIsKindOf(Structure)) and
 * owningType <> null and
 * (owningType.oclIsKindOf(Structure) or
 *  owningType.type->includes(oclIsKindOf(Structure))) implies
 *     specializesFromLibrary('Occurrence::Occurrence::suboccurrences')
 * ownedTyping.type->exists(selectByKind(Class)) implies
 *     specializesFromLibrary('Occurrences::occurrences')
 * isComposite and
 * ownedTyping.type->includes(oclIsKindOf(Class)) and
 * owningType <> null and
 * (owningType.oclIsKindOf(Class) or
 *  owningType.oclIsKindOf(Feature) and
 *     owningType.oclAsType(Feature).type->
 *         exists(oclIsKindOf(Class))) implies
 *     specializesFromLibrary('Occurrence::Occurrence::suboccurrences')
 * ownedTyping.type->exists(selectByKind(DataType)) implies
 *     specializesFromLibrary('Base::dataValues')
 * owningType <> null and
 * owningType.oclIsKindOf(FlowEnd) and
 * owningType.ownedFeature->at(1) = self implies
 *     let flowType : Type = owningType.owningType in
 *     flowType <> null implies
 *         let i : Integer = 
 *             flowType.ownedFeature.indexOf(owningType) in
 *         (i = 1 implies 
 *             redefinesFromLibrary('Transfers::Transfer::source::sourceOutput')) and
 *         (i = 2 implies
 *             redefinesFromLibrary('Transfers::Transfer::source::targetInput'))
 *                  
 * owningType <> null and
 * not owningFeatureMembership.
 *     oclIsKindOf(ReturnParameterMembership) and
 * (owningType.oclIsKindOf(Behavior) or
 *  owningType.oclIsKindOf(Step) and
 *     (owningType.oclIsKindOf(InvocationExpression) implies
 *       not ownedRedefinition->exists(not isImplied)) 
 * implies
 *     let i : Integer =
 *         owningType.ownedFeature->select(direction <> null)->
 *             reject(owningFeatureMembership.
 *                 oclIsKindOf(ReturnParameterMembership))->
 *             indexOf(self) in
 *     owningType.ownedSpecialization.general->
 *         forAll(supertype |
 *             let ownedParameters : Sequence(Feature) =
 *                 supertype.ownedFeature->select(direction <> null)->
 *                      reject(owningFeatureMembership.
 *                          oclIsKindOf(ReturnParameterMembership)) in
 *             ownedParameters->size() >= i implies
 *                 redefines(ownedParameters->at(i))
 * ownedTyping.type->exists(selectByKind(Structure)) implies
 *     specializesFromLibary('Objects::objects')
 * owningType <> null and
 * (owningType.oclIsKindOf(Function) and
 *     self = owningType.oclAsType(Function).result or
 *  owningType.oclIsKindOf(Expression) and
 *     self = owningType.oclAsType(Expression).result) implies
 *     owningType.ownedSpecialization.general->
 *         select(oclIsKindOf(Function) or oclIsKindOf(Expression))->
 *         forAll(supertype |
 *             redefines(
 *                 if superType.oclIsKindOf(Function) then
 *                     superType.oclAsType(Function).result
 *                 else
 *                     superType.oclAsType(Expression).result
 *                 endif)
 * ownedFeatureInverting = ownedRelationship->selectByKind(FeatureInverting)->
 *     select(fi | fi.featureInverted = self)
 * featuringType =
 *     let featuringTypes : OrderedSet(Type) = 
 *         featuring.type->asOrderedSet() in
 *     if chainingFeature->isEmpty() then featuringTypes
 *     else
 *         featuringTypes->
 *             union(chainingFeature->first().featuringType)->
 *             asOrderedSet()
 *     endif
 * ownedReferenceSubsetting =
 *     let referenceSubsettings : OrderedSet(ReferenceSubsetting) =
 *         ownedSubsetting->selectByKind(ReferenceSubsetting) in
 *     if referenceSubsettings->isEmpty() then null
 *     else referenceSubsettings->first() endif
 * ownedSubsetting->selectByKind(ReferenceSubsetting)->size() <= 1
 * Sequence{2..chainingFeature->size()}->forAll(i |
 *     chainingFeature->at(i).isFeaturedWithin(chainingFeature->at(i-1)))
 * 
 * isPortion and
 * ownedTyping.type->includes(oclIsKindOf(Class)) and
 * owningType <> null and
 * (owningType.oclIsKindOf(Class) or
 *  owningType.oclIsKindOf(Feature) and
 *     owningType.oclAsType(Feature).type->
 *         exists(oclIsKindOf(Class))) implies
 *     specializesFromLibrary('Occurrence::Occurrence::portions')
 * featureTarget = if chainingFeature->isEmpty() then self else chainingFeature->last() endif
 * ownedCrossSubsetting =
 *     let crossSubsettings: Sequence(CrossSubsetting) = 
 *         ownedSubsetting->selectByKind(CrossSubsetting) in
 *     if crossSubsettings->isEmpty() then null
 *     else crossSubsettings->first()
 *     endif
 * isEnd implies 
 *     multiplicities().allSuperTypes()->flatten()->
 *     selectByKind(MultiplicityRange)->exists(hasBounds(1,1))
 * crossFeature <> null implies
 *     crossFeature.type->asSet() = type->asSet()
 * ownedSubsetting->selectByKind(CrossSubsetting)->size() <= 1
 * crossFeature =
 *     if ownedCrossSubsetting = null then null
 *     else 
 *         let chainingFeatures: Sequence(Feature) = 
 *             ownedCrossSubsetting.crossedFeature.chainingFeature in
 *         if chainingFeatures->size() < 2 then null
 *         else chainingFeatures->at(2)
 *     endif
 * isOwnedCrossFeature() implies
 *     owner.oclAsType(Feature).type->forAll(t | self.specializes(t))
 * isOwnedCrossFeature() implies
 *     ownedSubsetting.subsettedFeature->includesAll(
 *         owner.oclAsType(Feature).ownedRedefinition.redefinedFeature->
 *             select(crossFeature <> null).crossFeature)
 * crossFeature <> null implies
 *     ownedRedefinition.redefinedFeature.crossFeature->
 *             forAll(f | f <> null implies crossFeature.specializes(f))
 * ownedCrossFeature() <> null implies
 *     crossFeature = ownedCrossFeature()
 * isOwnedCrossFeature() implies
 *     let otherEnds : OrderedSet(Feature) = 
 *         owner.oclAsType(Feature).owningType.endFeature->excluding(self) in
 *     if (otherEnds->size() = 1) then
 *         featuringType = otherEnds->first().type
 *     else
 *         featuringType->size() = 1 and
 *         featuringType->first().isCartesianProduct() and
 *         featuringType->first().asCartesianProduct() = otherEnds.type and
 *         featuringType->first().allSupertypes()->includesAll(
 *             owner.oclAsType(Feature).ownedRedefinition.redefinedFeature->
 *                select(crossFeature() <> null).crossFeature().featuringType)      
 *     endif
 * isPortion implies not isVariable
 * isEnd implied direction = null
 * owningFeatureMembership <> null implies
 *     featuringTypes->exists(t | isFeaturingType(t))
 * isConstant implies isVariable
 * isVariable implies
 *     owningType <> null and 
 *     owningType.specializes('Occurrences::Occurrence')
 * isEnd implies not (isDerived or isAbstract or isComposite or isPortion)
 * isEnd and isVariable implies isConstant
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getEndOwningType <em>End Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting <em>Owned Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isEnd <em>Is End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedTyping <em>Owned Typing</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedTypeFeaturing <em>Owned Type Featuring</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getChainingFeature <em>Chaining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedFeatureInverting <em>Owned Feature Inverting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedFeatureChaining <em>Owned Feature Chaining</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isPortion <em>Is Portion</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isVariable <em>Is Variable</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isConstant <em>Is Constant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedReferenceSubsetting <em>Owned Reference Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getFeatureTarget <em>Feature Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getCrossFeature <em>Cross Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedCrossSubsetting <em>Owned Cross Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isNonunique <em>Is Nonunique</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Type {
	/**
	 * Returns the value of the '<em><b>Owned Type Featuring</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.TypeFeaturing}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.TypeFeaturing#getOwningFeatureOfType <em>Owning Feature Of Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>TypeFeaturings</code> and for which the <code>Feature</code> is the <code>featureOfType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Type Featuring</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedTypeFeaturing()
	 * @see org.omg.sysml.lang.sysml.TypeFeaturing#getOwningFeatureOfType
	 * @model opposite="owningFeatureOfType" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<TypeFeaturing> getOwnedTypeFeaturing();

	/**
	 * Returns the value of the '<em><b>Chaining Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that are chained together to determine the values of this <code>Feature</code>, derived from the <code>chainingFeatures</code> of the <code>ownedFeatureChainings</code> of this <code>Feature</code>, in the same order. The values of a <code>Feature</code> with <code>chainingFeatures</code> are the same as values of the last <code>Feature</code> in the chain, which can be found by starting with the values of the first <code>Feature</code> (for each instance of the domain of the original <code>Feature</code>), then using each of those as domain instances to find the values of the second <code>Feature</code> in chainingFeatures, and so on, to values of the last <code>Feature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chaining Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_ChainingFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='chainedFeature'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getChainingFeature();

	/**
	 * Returns the value of the '<em><b>Owned Feature Inverting</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureInverting}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureInverting#getOwningFeature <em>Owning Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureInvertings</code> and for which the <code>Feature</code> is the <code>featureInverted</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature Inverting</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedFeatureInverting()
	 * @see org.omg.sysml.lang.sysml.FeatureInverting#getOwningFeature
	 * @model opposite="owningFeature" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<FeatureInverting> getOwnedFeatureInverting();

	/**
	 * Returns the value of the '<em><b>Owned Feature Chaining</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureChaining}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureChaining#getFeatureChained <em>Feature Chained</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this <code>Feature</code> that are <code>FeatureChainings</code>, for which the <code>Feature</code> will be the <code>featureChained</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature Chaining</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedFeatureChaining()
	 * @see org.omg.sysml.lang.sysml.FeatureChaining#getFeatureChained
	 * @model opposite="featureChained" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<FeatureChaining> getOwnedFeatureChaining();

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the values of this <code>Feature</code> can always be computed from the values of other <code>Features</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsDerived()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Owning Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature <em>Owned Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace() <em>Owning Namespace</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getFeaturingType() <em>Featuring Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Type</code> that is the <code>owningType</code> of the <code>owningFeatureMembership</code> of this <code>Feature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Type</em>' reference.
	 * @see #setOwningType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwningType()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedFeature
	 * @model opposite="ownedFeature" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getOwningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getOwningType <em>Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Type</em>' reference.
	 * @see #getOwningType()
	 * @generated
	 */
	void setOwningType(Type value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether or not values for this <code>Feature</code> must have no duplicates or not.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsUnique()
	 * @model default="true" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether an order exists for the values of this <code>Feature</code> or not.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsOrdered()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Types</code> that restrict the values of this <code>Feature</code>, such that the values must be instances of all the <code>types</code>. The types of a <code>Feature</code> are derived from its <code>typings</code> and the <code>types</code> of its <code>subsettings</code>. If the <code>Feature</code> is chained, then the <code>types</code> of the last <code>Feature</code> in the chain are also <code>types</code> of the chained <code>Feature</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Type()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedFeature'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Type> getType();

	/**
	 * Returns the value of the '<em><b>Owned Redefinition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Redefinition}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting() <em>Owned Subsetting</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Redefinition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedSubsettings</code> of this <code>Feature</code> that are <code>Redefinitions</code>, for which the <code>Feature</code> is the <code>redefiningFeature</code>.</p>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Redefinition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedRedefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningFeature'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Redefinition> getOwnedRedefinition();

	/**
	 * Returns the value of the '<em><b>Owned Subsetting</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Subsetting}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature <em>Owning Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedSpecialization() <em>Owned Specialization</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subsetting</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>Subsettings</code>, for which the <code>Feature</code> is the <code>subsettingFeature</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subsetting</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedSubsetting()
	 * @see org.omg.sysml.lang.sysml.Subsetting#getOwningFeature
	 * @model opposite="owningFeature" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Subsetting> getOwnedSubsetting();

	/**
	 * Returns the value of the '<em><b>Owned Typing</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureTyping}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureTyping#getOwningFeature <em>Owning Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedSpecialization() <em>Owned Specialization</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Typing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedSpecializations</code> of this <code>Feature</code> that are <code>FeatureTypings</code>, for which the <code>Feature</code> is the <code>typedFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Typing</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedTyping()
	 * @see org.omg.sysml.lang.sysml.FeatureTyping#getOwningFeature
	 * @model opposite="owningFeature" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<FeatureTyping> getOwnedTyping();

	/**
	 * Returns the value of the '<em><b>Featuring Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Types</code> that feature this <code>Feature</code>, such that any instance in the domain of the <code>Feature</code> must be classified by all of these <code>Types</code>, including at least all the <code>featuringTypes</code> of its <code>typeFeaturings</code>.  If the <code>Feature</code> is chained, then the <code>featuringTypes</code> of the first <code>Feature</code> in the chain are also <code>featuringTypes</code> of the chained <code>Feature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Featuring Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_FeaturingType()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featureOfType'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Type> getFeaturingType();

	/**
	 * Returns the value of the '<em><b>Owning Feature Membership</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature <em>Owned Member Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwningMembership() <em>Owning Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature Membership</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>FeatureMembership</code> that owns this <code>Feature</code> as an <code>ownedMemberFeature</code>, determining its <code>owningType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Feature Membership</em>' reference.
	 * @see #setOwningFeatureMembership(FeatureMembership)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwningFeatureMembership()
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature
	 * @model opposite="ownedMemberFeature" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	FeatureMembership getOwningFeatureMembership();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature Membership</em>' reference.
	 * @see #getOwningFeatureMembership()
	 * @generated
	 */
	void setOwningFeatureMembership(FeatureMembership value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the <code>Feature</code> is a composite <code>feature</code> of its <code>featuringType</code>. If so, the values of the <code>Feature</code> cannot exist after its featuring instance no longer does and cannot be values of another composite feature that is not on the same featuring instance.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsComposite()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Portion</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the values of this <code>Feature</code> are contained in the space and time of instances of the domain of the <code>Feature</code> and represent the same thing as those instances.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Portion</em>' attribute.
	 * @see #setIsPortion(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsPortion()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPortion();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isPortion <em>Is Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Portion</em>' attribute.
	 * @see #isPortion()
	 * @generated
	 */
	void setIsPortion(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Variable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the value of this <code>Feature</code> might vary over time. That is, whether the <code>Feature</code> may have a different value for each <em><code>snapshot</code></em> of an <code>owningType</code> that is an <em><code>Occurrence</code></em>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Variable</em>' attribute.
	 * @see #setIsVariable(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsVariable()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVariable();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isVariable <em>Is Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variable</em>' attribute.
	 * @see #isVariable()
	 * @generated
	 */
	void setIsVariable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Constant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If <code>isVariable</code> is true, then whether the value of this <code>Feature</code> nevertheless does not change over all <code><em>snapshots</em></code> of its <code>owningType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Constant</em>' attribute.
	 * @see #setIsConstant(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsConstant()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isConstant <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setIsConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Is End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether or not this <code>Feature</code> is an end <code>Feature</code>. An end <code>Feature</code> always has multiplicity 1, mapping each of its domain instances to a single co-domain instance. However, it may have a <code>crossFeature</code>, in which case values of the <code>crossFeature</code> must be the same as those found by navigation across instances of the <code>owningType</code> from values of other end <code>Features</code> to values of this Feature. If the <code>owningType</code> has <em>n</em> end <code>Features</code>, then the multiplicity, ordering, and uniqueness declared for the <code>crossFeature</code> of any one of these end <code>Features</code> constrains the cardinality, ordering, and uniqueness of the collection of values of that <code>Feature</code> reached by navigation when the values of the other <em>n-1</em> end <code>Features</code> are held fixed.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is End</em>' attribute.
	 * @see #setIsEnd(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsEnd()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEnd();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isEnd <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is End</em>' attribute.
	 * @see #isEnd()
	 * @generated
	 */
	void setIsEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.FeatureDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates how values of this <code>Feature</code> are determined or used (as specified for the <code>FeatureDirectionKind</code>).</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @see #setDirection(FeatureDirectionKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_Direction()
	 * @model ordered="false"
	 * @generated
	 */
	FeatureDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FeatureDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Owned Reference Subsetting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ReferenceSubsetting#getReferencingFeature <em>Referencing Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting() <em>Owned Subsetting</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The one <code>ownedSubsetting</code> of this <code>Feature</code>, if any, that is a <code>ReferenceSubsetting</code>, for which the <code>Feature</code> is the <code>referencingFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reference Subsetting</em>' reference.
	 * @see #setOwnedReferenceSubsetting(ReferenceSubsetting)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedReferenceSubsetting()
	 * @see org.omg.sysml.lang.sysml.ReferenceSubsetting#getReferencingFeature
	 * @model opposite="referencingFeature" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ReferenceSubsetting getOwnedReferenceSubsetting();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getOwnedReferenceSubsetting <em>Owned Reference Subsetting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Reference Subsetting</em>' reference.
	 * @see #getOwnedReferenceSubsetting()
	 * @generated
	 */
	void setOwnedReferenceSubsetting(ReferenceSubsetting value);

	/**
	 * Returns the value of the '<em><b>Cross Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The second <code>chainingFeature</code> of the <code>crossedFeature</code> of the <code>ownedCrossSubsetting</code> of this <code>Feature</code>, if it has one. Semantically, the values of the <code>crossFeature</code> of an end <code>Feature</code> must include all values of the end <code>Feature</code> obtained when navigating from values of the other end <code>Features</code> of the same <code>owningType</code>.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Feature</em>' reference.
	 * @see #setCrossFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_CrossFeature()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featureCrossing'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getCrossFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getCrossFeature <em>Cross Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Feature</em>' reference.
	 * @see #getCrossFeature()
	 * @generated
	 */
	void setCrossFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owned Cross Subsetting</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.CrossSubsetting#getCrossingFeature <em>Crossing Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting() <em>Owned Subsetting</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The one <code>ownedSubsetting</code> of this <code>Feature</code>, if any, that is a <code>CrossSubsetting}, for which the <code>Feature</code> is the <code>crossingFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Cross Subsetting</em>' reference.
	 * @see #setOwnedCrossSubsetting(CrossSubsetting)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_OwnedCrossSubsetting()
	 * @see org.omg.sysml.lang.sysml.CrossSubsetting#getCrossingFeature
	 * @model opposite="crossingFeature" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	CrossSubsetting getOwnedCrossSubsetting();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getOwnedCrossSubsetting <em>Owned Cross Subsetting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Cross Subsetting</em>' reference.
	 * @see #getOwnedCrossSubsetting()
	 * @generated
	 */
	void setOwnedCrossSubsetting(CrossSubsetting value);

	/**
	 * Returns the value of the '<em><b>Feature Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The last of the <code>chainingFeatures</code> of this <code>Feature</code>, if it has any. Otherwise, this <code>Feature</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Target</em>' reference.
	 * @see #setFeatureTarget(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_FeatureTarget()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='baseFeature'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getFeatureTarget();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getFeatureTarget <em>Feature Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Target</em>' reference.
	 * @see #getFeatureTarget()
	 * @generated
	 */
	void setFeatureTarget(Feature value);

	/**
	 * Returns the value of the '<em><b>End Owning Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedEndFeature <em>Owned End Feature</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Owning Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Type</code> that is related to this <code>Feature</code> by an <code>EndFeatureMembership</code> in which the <code>Feature</code> is an <code>ownedMemberFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Owning Type</em>' reference.
	 * @see #setEndOwningType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_EndOwningType()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedEndFeature
	 * @model opposite="ownedEndFeature" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getEndOwningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#getEndOwningType <em>End Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Owning Type</em>' reference.
	 * @see #getEndOwningType()
	 * @generated
	 */
	void setEndOwningType(Type value);

	/**
	 * Returns the value of the '<em><b>Is Nonunique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Nonunique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nonunique</em>' attribute.
	 * @see #setIsNonunique(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsNonunique()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isNonunique();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isNonunique <em>Is Nonunique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nonunique</em>' attribute.
	 * @see #isNonunique()
	 * @generated
	 */
	void setIsNonunique(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the <code>directionOf</code> this <code>Feature</code> relative to the given <code>type</code>.</p>
	 * type.directionOf(self)
	 * <!-- end-model-doc -->
	 * @model ordered="false" typeRequired="true" typeOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	FeatureDirectionKind directionFor(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return if the <code>featuringTypes</code> of this <code>Feature</code> are compatible with the given <code>type</code>. If <code>type</code> is null, then check if this <code>Feature</code> is explicitly or implicitly featured by <em><code>Base::Anything</code></em>. If this <code>Feature</code> has <code>isVariable = true</code>, then also consider it to be featured within its <code>owningType</code>. If this <code>Feature</code> is a feature chain whose first <code>chainingFeature</code> has <code>isVariable = true</code>, then also consider it to be featured within the <code>owningType</code> of its first <code>chainingFeature</code>.</p>
	 * if type = null then
	 *     featuringType->forAll(f | f = resolveGlobal('Base::Anything').memberElement)
	 * else
	 *     featuringType->forAll(f | type.isCompatibleWith(f)) or
	 *     isVariable and type.specializes(owningType) or
	 *     chainingFeature->notEmpty() and chainingFeature->first().isVariable and
	 *         type.specializes(chainingFeature->first().owningType)
	 * endif
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" typeOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isFeaturedWithin(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>Feature</code> can access another <code>feature</code> if the other <code>feature</code> is featured within one of the direct or indirect <code>featuringTypes</code> of this <code>Feature</code>.</p>
	 * let anythingType: Element =
	 *     subsettingFeature.resolveGlobal('Base::Anything').memberElement in
	 * let allFeaturingTypes : Sequence(Type) =
	 *     featuringTypes->closure(t |
	 *         if not t.oclIsKindOf(Feature) then Sequence{}
	 *         else
	 *             let featuringTypes : OrderedSet(Type) = t.oclAsType(Feature).featuringType in
	 *             if featuringTypes->isEmpty() then Sequence{anythingType}
	 *             else featuringTypes
	 *             endif 
	 *         endif) in
	 * allFeaturingTypes->exists(t | feature.isFeaturedWithin(t))
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" featureRequired="true" featureOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean canAccess(Feature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return whether the given <code>type</code> must be a <code>featuringType</code> of this <code>Feature</code>. If this <code>Feature</code> has <code>isVariable = false</code>, then return true if the <code>type</code> is the <code>owningType</code> of the <code>Feature</code>. If <code>isVariable = true</code>, then return true if the <code>type</code> is a <code>Feature</code> representing the <em><code>snapshots</code></em> of the <code>owningType</code> of this <code>Feature</code>.</p>
	 * owningType <> null and
	 * if not isVariable then type = owningType
	 * else if owningType = resolveGlobal('Occurrences::Occurrence').memberElement then
	 *     type = resolveGlobal('Occurrences::Occurrence::snapshots').memberElement 
	 * else 
	 *     type.oclIsKindOf(Feature) and
	 *     let feature : Feature = type.oclAsType(Feature) in
	 *     feature.featuringType->includes(owningType) and
	 *     feature.redefinesFromLibrary('Occurrences::Occurrence::snapshots')
	 * endif
	 * 
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" typeRequired="true" typeOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isFeaturingType(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>By default, the naming <code>Feature</code> of a <code>Feature</code> is given by its first <code>redefinedFeature</code> of its first <code>ownedRedefinition</code>, if any.</p>
	 * if ownedRedefinition->isEmpty() then
	 *     null
	 * else
	 *     ownedRedefinition->at(1).redefinedFeature
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature namingFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check whether this <code>Feature</code> <em>directly</em> redefines the given <code>redefinedFeature</code>.</p>
	 * ownedRedefinition.redefinedFeature->includes(redefinedFeature)
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" redefinedFeatureRequired="true" redefinedFeatureOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean redefines(Feature redefinedFeature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check whether this <code>Feature</code> <em>directly</em> redefines the named library <code>Feature</code>. <code>libraryFeatureName</code> must conform to the syntax of a KerML qualified name and must resolve to a <code>Feature</code> in global scope.</p>
	 * let mem: Membership = resolveGlobal(libraryFeatureName) in
	 * mem <> null and mem.memberElement.oclIsKindOf(Feature) and
	 * redefines(mem.memberElement.oclAsType(Feature))
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" libraryFeatureNameDataType="org.omg.sysml.lang.types.String" libraryFeatureNameRequired="true" libraryFeatureNameOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean redefinesFromLibrary(String libraryFeatureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check whether this <code>Feature</code> directly or indirectly specializes a <code>Feature</code> whose last two <code>chainingFeatures</code> are the given <code>Features</code> <code>first</code> and <code>second</code>.</p>
	 * allSuperTypes()->selectAsKind(Feature)->
	 *     exists(f | let n: Integer = f.chainingFeature->size() in
	 *         n >= 2 and
	 *         f.chainingFeature->at(n-1) = first and
	 *         f.chainingFeature->at(n) = second)
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" firstRequired="true" firstOrdered="false" secondRequired="true" secondOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean subsetsChain(Feature first, Feature second);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the <code>Features</code> used to determine the <code>types</code> of this <code>Feature</code> (other than this <code>Feature</code> itself). If this <code>Feature</code> is <em>not</em> conjugated, then the <code>typingFeatures</code> consist of all subsetted <code>Features</code>, <em>except</em> from <code>CrossSubsetting</code>, and the last <code>chainingFeature</code> (if any). If this <code>Feature</code> <em>is</em> conjugated, then the <code>typingFeatures</code> are only its <code>originalType</code> (if the <code>originalType</code> is a <code>Feature</code>).</p>
	 * 
	 * <p><strong>Note.</strong> <code>CrossSubsetting</code> is excluded from the determination of the <code>type</code> of a <code>Feature</code> in order to avoid circularity in the construction of implied <code>CrossSubsetting</code> relationships. The <code>validateFeatureCrossFeatureType</code> requires that the <code>crossFeature</code> of a <code>Feature</code> have the same <code>type</code> as the <code>Feature</code>.</p>
	 * 
	 * if not isConjugated then
	 *     let subsettedFeatures : OrderedSet(Feature) = 
	 *         subsetting->reject(s | s.oclIsKindOf(CrossSubsetting)).subsettedFeatures in 
	 *     if chainingFeature->isEmpty() or
	 *        subsettedFeature->includes(chainingFeature->last())
	 *     then subsettedFeatures
	 *     else subsettedFeatures->append(chainingFeature->last())
	 *     endif
	 * else if conjugator.originalType.oclIsKindOf(Feature) then
	 *     OrderedSet{conjugator.originalType.oclAsType(Feature)}
	 * else OrderedSet{}
	 * endif endif
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> typingFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If <code>isCartesianProduct</code> is true, then return the list of <code>Types</code> whose Cartesian product can be represented by this <code>Feature</code>. (If <code>isCartesianProduct</code> is not true, the operation will still return a valid value, it will just not represent anything useful.)</p>
	 * featuringType->select(t | t.owner <> self)->
	 *     union(featuringType->select(t | t.owner = self)->
	 *         selectByKind(Feature).asCartesianProduct())->
	 *     union(type)
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Type> asCartesianProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check whether this <code>Feature</code> can be used to represent a Cartesian product of <code>Types</code>.</p>
	 * type->size() = 1 and
	 * featuringType.size() = 1 and
	 * (featuringType.first().owner = self implies
	 *     featuringType.first().oclIsKindOf(Feature) and
	 *     featuringType.first().oclAsType(Feature).isCartesianProduct())
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isCartesianProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return whether this <code>Feature</code> is an owned cross <code>Feature</code> of an end <code>Feature</code>.</p>
	 * owningNamespace <> null and 
	 * owningNamespace.oclIsKindOf(Feature) and 
	 * owningNamespace.oclAsType(Feature).ownedCrossFeature() = self
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isOwnedCrossFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If this <code>Feature</code> is an end <code>Feature</code> of its <code>owningType</code>, then return the first <code>ownedMember</code> of the <code>Feature</code> that is a <code>Feature</code>, but not a <code>Multiplicity</code> or a <code>MetadataFeature</code>, and whose <code>owningMembership</code> is <em>not</em> a <code>FeatureMembership</code>. If this exists, it is the <code>crossFeature</code> of the end <code>Feature</code>.</p>
	 * if not isEnd or owningType = null then null
	 * else
	 *     let ownedMemberFeatures: Sequence(Feature) =
	 *         ownedMember->selectByKind(Feature)->
	 *             reject(oclIsKindOf(Multiplicity) or 
	 *                    oclIsKindOf(MetadataFeature) or
	 *                    oclIsKindOf(FeatureValue))->
	 *             reject(owningMembership.oclIsKindOf(FeatureMembership)) in
	 *     if ownedMemberFeatures.isEmpty() then null
	 *     else ownedMemberFeatures->first()
	 *     endif
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature ownedCrossFeature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return this <code>Feature</code> and all the <code>Features</code> that are directly or indirectly <code>Redefined</code> by this <code>Feature</code>.</p>
	 * ownedRedefinition.redefinedFeature->
	 *     closure(ownedRedefinition.redefinedFeature)->
	 *     asOrderedSet()->prepend(self)
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> allRedefinedFeatures();

} // Feature
