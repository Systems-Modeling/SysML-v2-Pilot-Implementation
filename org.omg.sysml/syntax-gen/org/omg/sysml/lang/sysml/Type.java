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
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Type is a Namespace that is the most general kind of Element supporting the semantics of classification. A Type may be a Classifier or a Feature, defining conditions on what is classified by the Type (see also the description of <code>isSufficient</code>).</p>
 * 
 * ownedSpecialization = ownedRelationship->selectByKind(Specialization)->
 *     select(g | g.special = self)
 *     
 * multiplicity = feature->select(oclIsKindOf(Multiplicity))
 * ownedFeatureMembership = ownedRelationship->selectByKind(FeatureMembership)
 * let ownedConjugators: Sequence(Conjugator) = 
 *     ownedRelationship->selectByKind(Conjugation) in
 *     ownedConjugator = 
 *         if ownedConjugators->isEmpty() then null 
 *         else ownedConjugators->at(1) endif
 * output =
 *     if isConjugated then 
 *         conjugator.originalType.input
 *     else 
 *         feature->select(direction = out or direction = inout)
 *     endif
 * input = 
 *     if isConjugated then 
 *         conjugator.originalType.output
 *     else 
 *         feature->select(direction = _'in' or direction = inout)
 *     endif
 * inheritedMembership = inheritedMemberships(Set{})
 * disjointType = disjoiningTypeDisjoining.disjoiningType
 * allSupertypes()->includes(resolve("Base::Anything"))
 * directedFeature = feature->select(direction <> null)
 * feature = featureMembership.ownedMemberFeature
 * featureMembership = ownedMembership->union(
 *     inheritedMembership->selectByKind(FeatureMembership))
 * ownedFeature = ownedFeatureMembership.ownedMemberFeature
 * intersectingType->excludes(self)
 * unioningType->excludes(self)
 * differencingType->excludes(self)
 * differencingType = ownedDifferencing.differencingType
 * unioningType = ownedUnioning.unioningType
 * intersectingType = ownedIntersecting.intersectingType
 * ownedRelationship->selectByKind(Conjugator)->size() <= 1
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedSpecialization <em>Owned Specialization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedEndFeature <em>Owned End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getInheritedMembership <em>Inherited Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getEndFeature <em>End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#isSufficient <em>Is Sufficient</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedConjugator <em>Owned Conjugator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#isConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getInheritedFeature <em>Inherited Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getUnioningType <em>Unioning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getIntersectingType <em>Intersecting Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedUnioning <em>Owned Unioning</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedDisjoining <em>Owned Disjoining</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getFeatureMembership <em>Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getDifferencingType <em>Differencing Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedDifferencing <em>Owned Differencing</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getDirectedFeature <em>Directed Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Type#getOwnedIntersecting <em>Owned Intersecting</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType()
 * @model
 * @generated
 */
public interface Type extends Namespace {
	/**
	 * Returns the value of the '<em><b>Owned Feature Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureMembership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningType <em>Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership() <em>Owned Membership</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeatureMembership() <em>Feature Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedMemberships</code> of this Type that are FeatureMemberships, for which the Type is the <code>owningType</code>. Each such FeatureMembership identifies an <code>ownedFeature</code> of the Type.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedFeatureMembership()
	 * @see org.omg.sysml.lang.sysml.FeatureMembership#getOwningType
	 * @model opposite="owningType" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<FeatureMembership> getOwnedFeatureMembership();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If the given feature is a feature of this type, then return its direction relative to this type, taking conjugation into account.</p>
	 * 
	 * if input->includes(feature) and output->includes(feature) then 
	 *     FeatureDirectionKind::inout
	 * else if input->includes(feature) then 
	 *     FeatureDirectionKind::_'in'
	 * else if output->includes(feature) then 
	 *     FeatureDirectionKind::out
	 * else 
	 *     null 
	 * endif endif endif
	 * <!-- end-model-doc -->
	 * @model ordered="false" featureRequired="true" featureOrdered="false"
	 * @generated
	 */
	FeatureDirectionKind directionOf(Feature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return all Types related to this Type as supertypes directly or transitively by Generalization Relationships.</p>
	 * ownedSpecialization->
	 *     closure(general.ownedSpecialization).general->
	 *     including(self)
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Type> allSupertypes();

	/**
	 * Returns the value of the '<em><b>Owned Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwningType <em>Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedMemberFeatures</code> of the <code>ownedFeatureMemberships</code> of this Type.</code>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwningType
	 * @model opposite="owningType" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getOwnedFeature();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedMemberFeatures</code> of the <code>featureMemberships</code> of this Type.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_Feature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeWithFeature'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getDirectedFeature() <em>Directed Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>All <code>features</code> related to this Type by FeatureMemberships that have <code>direction</code> <code>in<code> or <code>inout<code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_Input()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeWithInput'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getDirectedFeature() <em>Directed Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>All <code>features</code> related to this Type by FeatureMemberships that have <code>direction</code> <code>out<code> or <code>inout<code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_Output()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeWithOutput'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getOutput();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates whether instances of this Type must also be instances of at least one of its specialized Types.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_IsAbstract()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Type#isAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Inherited Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Membership}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMembership() <em>Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>All Memberships inherited by this Type via Generalization or Conjugation. These are included in the derived union for the <code>memberships</code> of the Type.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_InheritedMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='inheritingType'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Membership> getInheritedMembership();

	/**
	 * Returns the value of the '<em><b>End Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>All <code>features</code> related to this Type by EndFeatureMemberships.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_EndFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeWithEndFeature'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getEndFeature();

	/**
	 * Returns the value of the '<em><b>Is Sufficient</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sufficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether all things that meet the classification conditions of this Type must be classified by the Type.</p>
	 * 
	 * <p>(A Type&nbsp;gives conditions that must be met by whatever it classifies, but when <code>isSufficient</code> is false, things may meet those conditions but still not be classified by the Type. For example, a Type <code><em>Car</em></code> that is not sufficient could require everything it classifies to have four wheels, but not all four wheeled things would need to be cars. However, if the type <code><em>Car</em></code> were sufficient, it would classify all four-wheeled things.)</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Sufficient</em>' attribute.
	 * @see #setIsSufficient(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_IsSufficient()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSufficient();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Type#isSufficient <em>Is Sufficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sufficient</em>' attribute.
	 * @see #isSufficient()
	 * @generated
	 */
	void setIsSufficient(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Conjugator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Conjugation#getOwningType <em>Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Conjugator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A Conjugation owned by this Type for which the Type is the <code>originalType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Conjugator</em>' reference.
	 * @see #setOwnedConjugator(Conjugation)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedConjugator()
	 * @see org.omg.sysml.lang.sysml.Conjugation#getOwningType
	 * @model opposite="owningType" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Conjugation getOwnedConjugator();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Type#getOwnedConjugator <em>Owned Conjugator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Conjugator</em>' reference.
	 * @see #getOwnedConjugator()
	 * @generated
	 */
	void setOwnedConjugator(Conjugation value);

	/**
	 * Returns the value of the '<em><b>Is Conjugated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Conjugated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates whether this Type has an <code>ownedConjugator</code>. (See Conjugation.)</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Conjugated</em>' attribute.
	 * @see #setIsConjugated(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_IsConjugated()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isConjugated();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Type#isConjugated <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Conjugated</em>' attribute.
	 * @see #isConjugated()
	 * @generated
	 */
	void setIsConjugated(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureMembership}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The FeatureMemberships for <code>features</code> of this Type, which include all <code>ownedFeatureMemberships</code> and those <code>inheritedMemberships</code> that are FeatureMemberships (but does <em>not</em> include any <code>importedMemberships</code>).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_FeatureMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='type'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<FeatureMembership> getFeatureMembership();

	/**
	 * Returns the value of the '<em><b>Differencing Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The interpretations of a Type with <code>differencingTypes</code> are asserted to be those of the first of those Types, but not including those of the remaining types. For example, a Classifier might be the difference of a Classifier for people and another for people of a particular nationality, leaving people who are not of that nationality. Similarly, a feature of people might be the difference between a feature for their children and a Classifier for people of a particular sex, identifying their children not of that sex (because the interpretations of the children feature that identify those of that sex are also interpretations of the Classifier for that sex).<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Differencing Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_DifferencingType()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='differencedType'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Type> getDifferencingType();

	/**
	 * Returns the value of the '<em><b>Owned Differencing</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Differencing}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Differencing#getTypeDifferenced <em>Type Differenced</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this Type that are Differencings, having this Type as their <code>typeDifferenced</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Differencing</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedDifferencing()
	 * @see org.omg.sysml.lang.sysml.Differencing#getTypeDifferenced
	 * @model opposite="typeDifferenced" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Differencing> getOwnedDifferencing();

	/**
	 * Returns the value of the '<em><b>Inherited Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>All the <code>memberFeatures</code> of the <code>inheritedMemberships</code> of this Type.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_InheritedFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='inheritingType'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getInheritedFeature();

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The one <code>member</code> (at most) of this Type that is a Multiplicity, which constrains the cardinality of the Type. A <code>multiplicity</code> can be owned or inherited. If it is owned, the <code>multiplicity</code> must redefine the <code>multiplicity</code> (if it has one) of any <code>general</code> Type of a <code>Generalization</code> of this Type.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiplicity</em>' reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_Multiplicity()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeWithMultiplicity'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Type#getMultiplicity <em>Multiplicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Unioning Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The interpretations of a Type with code>unioningTypes</code> are asserted to be the same as those of all the <code>unioningTypes</code> together, which are the Types  derived from the <code>unioningType</code> of the <code>ownedUnionings</code> of this Type.  For example, a Classifier for people might be the union of Classifiers for all the sexes. Similarly, a feature for people's children might be the union of features dividing them in the same ways as people in general.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unioning Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_UnioningType()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='unionedType'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Type> getUnioningType();

	/**
	 * Returns the value of the '<em><b>Owned Intersecting</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Intersecting}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Intersecting#getTypeIntersected <em>Type Intersected</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this Type that are Intersectings, have the Type as their <code>typeIntersected</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Intersecting</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedIntersecting()
	 * @see org.omg.sysml.lang.sysml.Intersecting#getTypeIntersected
	 * @model opposite="typeIntersected" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Intersecting> getOwnedIntersecting();

	/**
	 * Returns the value of the '<em><b>Intersecting Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The interpretations of a Type with code>intersectingTypes</code> are asserted to be those in common among the <code>intersectingTypes</code>, which are the Types derived from the <code>intersectingType</code> of the <code>ownedIntersectings</code> of this Type.  For example, a Classifier might be an intersection of Classifiers for people of a particular sex and of a particular nationality.  Similarly, a feature for people's children of a particular sex might be the intersection of a feature for their children and a Classifier for people of that sex (because the interpretations of the children feature that identify those of that sex are also interpretations of the Classifier for that sex).<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intersecting Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_IntersectingType()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='intersectedType'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Type> getIntersectingType();

	/**
	 * Returns the value of the '<em><b>Owned Unioning</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Unioning}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Unioning#getTypeUnioned <em>Type Unioned</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this Type that are Unionings, having the Type as their <code>typeUnioned</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Unioning</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedUnioning()
	 * @see org.omg.sysml.lang.sysml.Unioning#getTypeUnioned
	 * @model opposite="typeUnioned" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Unioning> getOwnedUnioning();

	/**
	 * Returns the value of the '<em><b>Directed Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>features</code> of this Type that have a non-null <code>direction</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_DirectedFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeWithDirectedFeature'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getDirectedFeature();

	/**
	 * Returns the value of the '<em><b>Owned Disjoining</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Disjoining}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Disjoining#getOwningType <em>Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this Type that are Disjoinings, for which the Type is the <code>typeDisjoined</code> Type.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Disjoining</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedDisjoining()
	 * @see org.omg.sysml.lang.sysml.Disjoining#getOwningType
	 * @model opposite="owningType" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Disjoining> getOwnedDisjoining();

	/**
	 * Returns the value of the '<em><b>Owned Specialization</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Specialization}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Specialization#getOwningType <em>Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this Type that are Specializations, for which the Type is the <code>specific</code> Type.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Specialization</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedSpecialization()
	 * @see org.omg.sysml.lang.sysml.Specialization#getOwningType
	 * @model opposite="owningType" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Specialization> getOwnedSpecialization();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the inherited Memberships of this Type, excluding those supertypes in the <code>excluded</code> set.</code>
	 * <!-- end-model-doc -->
	 * @model excludedMany="true" excludedOrdered="false"
	 * @generated
	 */
	EList<Membership> inheritedMemberships(EList<Type> excluded);

	/**
	 * Returns the value of the '<em><b>Owned End Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getEndOwningType <em>End Owning Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getEndFeature() <em>End Feature</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>All <code>endFeatures</code> of this Type that are <code>ownedFeatures</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned End Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getType_OwnedEndFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getEndOwningType
	 * @model opposite="endOwningType" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getOwnedEndFeature();

} // Type
