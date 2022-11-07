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
 * <p>A Feature is a Type that classifies sequences of multiple things (in the universe). These must concatenate a sequence drawn from the intersection of the Feature&#39;s <code>featuringTypes</code> (<em>domain</em>) with a sequence drawn from the intersection of its <code>types</code> (<em>co-domain</em>), treating (co)domains as sets of sequences. The domain of Features that do not have any <code>featuringTypes</code> is the same as if it were the library Type Anything. A Feature&#39;s <code>types</code> include at least Anything, which can be narrowed to other Classifiers by Redefinition.</p>
 * 
 * <p>In the simplest cases, a Feature&#39;s <code>featuringTypes</code> and <code>types</code> are Classifiers, its sequences being pairs (length = 2), with the first element drawn from the Feature&#39;s domain and the second element from its co-domain (the Feature &quot;value&quot;). Examples include cars paired with wheels, people paired with other people, and cars paired with numbers&nbsp;representing the car length.</p>
 * 
 * <p>Since Features are Types, their <code>featuringTypes</code> and <code>types</code> can be Features. When both are, Features classify sequences of at least four elements (length &gt; 3), otherwise at least three (length &gt; 2). The <code>featuringTypes</code> of <em>nested</em> Features are Features.</p>
 * 
 * <p>The values of a Feature with <code>chainingFeatures</code> are the same as values of the last Feature in the chain, which can be found by starting with values of the first Feature, then from those values to values of the second feature, and so on, to values of the last feature.</p>
 * 
 * ownedRedefinition = ownedSubsetting->selectByKind(Redefinition)
 * ownedTypeFeaturing = ownedRelationship->selectByKind(TypeFeaturing)->
 *     select(tf | tf.featureOfType = self)
 * ownedSubsetting = ownedGeneralization->selectByKind(Subsetting)
 * isComposite = owningFeatureMembership <> null and owningFeatureMembership.isComposite
 * ownedTyping = ownedGeneralization->selectByKind(FeatureTyping)
 * isEnd = owningFeatureMembership <> null and owningFeatureMembership.oclIsKindOf(EndFeatureMembership)
 * multiplicity <> null implies multiplicity.featuringType = featuringType 
 * allSupertypes()->includes(resolve("Base::things"))
 * chainingFeatures->excludes(self)
 * ownedFeatureChaining = ownedRelationship->selectByKind(FeatureChaining)
 * chainingFeature = ownedFeatureChaining.chainingFeature
 * chainingFeatures->size() <> 1
 * inverseFeature = invertingFeatureInverting.featureInverse
 * invertedFeature = invertedFeatureInverting.featureInverted
 * ownedTyping.type->exists(selectByKind(Class)) implies
 *     allSupertypes()->includes(resolve("Occurrences::occurrences"))
 * ownedTyping.type->exists(selectByKind(DataType)) implies
 *     allSupertypes()->includes(resolve("Base::dataValues"))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting <em>Owned Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isEnd <em>Is End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getEndOwningType <em>End Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedTyping <em>Owned Typing</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedTypeFeaturing <em>Owned Type Featuring</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getChainingFeature <em>Chaining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedFeatureInverting <em>Owned Feature Inverting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedFeatureChaining <em>Owned Feature Chaining</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#isPortion <em>Is Portion</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Feature#getOwnedReferenceSubsetting <em>Owned Reference Subsetting</em>}</li>
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
	 * <p>The <code>ownedRelationships</code> of this Feature that are TypeFeaturings, for which the Feature is the <code>featureOfType</code>.</p>
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
	 * <p>The Features that are chained together to determine the values of this Feature, derived from the <code>chainingFeatures</code> of the <code>ownedFeatureChainings</code> of this Feature, in the same order. The values of a Feature with chainingFeatures are the same as values of the last Feature in the chain, which can be found by starting with the values of the first Feature (for each instance of the original Feature's domain), then on each of those to the values of the second Feature in chainingFeatures, and so on, to values of the last Feature. The Features related to a Feature by a FeatureChaining are identified as its chainingFeatures.</p>
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
	 * <p>The <code>ownedRelationships</code> of this Feature that are FeatureInvertings, for which the Feature is the <code>featureInverted</code>.</p>
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
	 * <p>The FeatureChainings that are among the <code>ownedRelationships</owned> of this Feature (identify their <code>featureChained</code> also as an <code>owningRelatedElement</code>).</p>
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
	 * <p>Whether the values of this Feature&nbsp;can always be computed from the values of other Features.</p>
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
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the values of this Feature can change over the lifetime of an instance of the domain.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeature_IsReadOnly()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Feature#isReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

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
	 * <p>The Type that is the <code>owningType</code> of the <code>owningFeatureMembership</code> of this Type.</p>
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
	 * <p>Whether or not values for this Feature must have no duplicates or not.</p>
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
	 * <p>Whether an order exists for the values of this Feature or not.</p>
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
	 * <p>Types that restrict the values of this Feature, such that the values must be instances of all the types. The types of a Feature are derived from its <code>ownedFeatureTypings</code> and the <code>types</code> of its <code>ownedSubsettings</code>.</p>
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
	 * <p>The <code>ownedSubsettings</code> of this Feature that are Redefinitions, for which the Feature is the <code>redefiningFeature</code>.</p>
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
	 * <p>The <code>ownedGeneralizations</code> of this Feature that are Subsettings, for which the Feature is the <code>subsettingFeature</code>.</p>
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
	 * <p>The <code>ownedGeneralizations</code> of this Feature that are FeatureTypings, for which the Feature is the <code>typedFeature</code>.</p>
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
	 * <p>Types that feature this Feature, such that any instance in the domain of the Feature must be classified by all of these Types, including at least all the <code>featuringTypes</code> of its <code>ownedTypeFeaturings</code>.</p>
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
	 * <p>The FeatureMembership that owns this Feature as an <code>ownedMemberFeature</code>, determining its <code>owningType</code>.</p>
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
	 * <p>Whether the Feature is a composite <code>feature</code> of its <code>featuringType</code>. If so, the values of the Feature cannot exist after the instance of the <code>featuringType</code> no longer does.</p>.
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
	 * <p>Whether the values of this Feature are contained in the space and time of instances of the Feature&#39;s domain.</p>
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
	 * Returns the value of the '<em><b>Is End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether or not the this Feature is an end Feature, requiring a different interpretation of the <code>multiplicity</code> of the Feature.</p>
	 * 
	 * <p>An end Feature is always considered to map each domain entity to a single co-domain entity, whether or not a Multiplicity is given for it. If a Multiplicity is given for an end Feature, rather than giving the co-domain cardinality for the Feature as usual, it specifies a cardinality constraint for <em>navigating</em> across the <code>endFeatures</code> of the <code>featuringType</code> of the end Feature. That is, if a Type has <em>n</em> <code>endFeatures</code>, then the Multiplicity of any one of those end Features constrains the cardinality of the set of values of that Feature when the values of the other <em>n-1</em> end Features are held fixed.</p>
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
	 * <p>Determines how values of this Feature are determined or used (see FeatureDirectionKind).</p>
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
	 * <p>The one <code>ownedSubsetting</code> of this Feature, if any, that is a ReferenceSubsetting, for which the Feature is the <code>referencingFeature</code>.</p>
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
	 * <p>The Type that is related to this Feature by an EndFeatureMembership in which the Feature is an <code>ownedMemberFeature</code>.</p>
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
	 * <p>Return the <code>directionOf</code> this Feature relative to the given <code>type</code>.</p>
	 * type.directionOf(self)
	 * <!-- end-model-doc -->
	 * @model ordered="false" typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	FeatureDirectionKind directionFor(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return whether this Feature has the given <code>type</code> as a direct or indirect <code>featuringType</code>. If <code>type</code> is null, then check if this Feature is implicitly directly or indirectly featured in <em>Base::Anything</em>.</p>
	 * type = null and feature.featuringType->isEmpty() or
	 *     type <> null and feature.featuringType->includes(type) or
	 *     feature.featuringType->exists(t |
	 *         t.oclIsKindOf(Feature) and
	 *         t.oclAsType(Feature).isFeaturedWithin(type)) 
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" typeOrdered="false"
	 * @generated
	 */
	boolean isFeaturedWithin(Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>By default, the naming feature of a Feature is given by its first redefined Feature, if any.</p>
	 * let redefinitions : Sequence(Redefinition) = ownedRedefinition in
	 * if redefinitions->isEmpty() then
	 *     null
	 * else
	 *     redefinitions->at(1).redefinedFeature
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	Feature namingFeature();

} // Feature
