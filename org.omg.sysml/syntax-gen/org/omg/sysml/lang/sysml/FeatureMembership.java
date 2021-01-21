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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>FeatureMembership is a Membership for a Feature in a Type that is also a TypeFeaturing Relationship between the Feature and the Type.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature <em>Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp <em>Owned Member Feature comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isPortion <em>Is Portion</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#isPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature <em>Owned Member Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership()
 * @model
 * @generated
 */
public interface FeatureMembership extends Membership, TypeFeaturing {
	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the values of the Feature&nbsp;can always be computed from the values of other Features.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsDerived()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isDerived <em>Is Derived</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the values of the Feature can change over the lifetime of an instance of the domain.&nbsp;</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsReadOnly()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Member Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberElement() <em>Member Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.TypeFeaturing#getFeatureOfType() <em>Feature Of Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that this FeatureMembership relates to its <code>owningType, making it a <code>feature</code> of the <code>owningType<code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Feature</em>' reference.
	 * @see #setMemberFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_MemberFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featureMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getMemberFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature <em>Member Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Feature</em>' reference.
	 * @see #getMemberFeature()
	 * @generated
	 */
	void setMemberFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owned Member Feature comp</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership <em>Owning Feature Membership</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp() <em>Owned Member Element comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Feature comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>memberFeature</code> that is owned by this FeatureMembership and hence an <code>ownedFeature</code> of the <code>owningType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Feature comp</em>' containment reference.
	 * @see #setOwnedMemberFeature_comp(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_OwnedMemberFeature_comp()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwningFeatureMembership
	 * @model opposite="owningFeatureMembership" containment="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getOwnedMemberFeature_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp <em>Owned Member Feature comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Feature comp</em>' containment reference.
	 * @see #getOwnedMemberFeature_comp()
	 * @generated
	 */
	void setOwnedMemberFeature_comp(Feature value);

	/**
	 * Returns the value of the '<em><b>Is Portion</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Portion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the values of the Feature are contained in the space and time of instances of the Feature&#39;s domain.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Portion</em>' attribute.
	 * @see #setIsPortion(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsPortion()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPortion();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPortion <em>Is Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Portion</em>' attribute.
	 * @see #isPortion()
	 * @generated
	 */
	void setIsPortion(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the Feature is visible externally to instances of the Feature&#39;s domain.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Port</em>' attribute.
	 * @see #setIsPort(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsPort()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPort();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isPort <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Port</em>' attribute.
	 * @see #isPort()
	 * @generated
	 */
	void setIsPort(boolean value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.FeatureDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Determines how values of the Feature are determined or used, see&nbsp;FeatureDirectionKind.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @see #setDirection(FeatureDirectionKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_Direction()
	 * @model ordered="false"
	 * @generated
	 */
	FeatureDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.FeatureDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(FeatureDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Owning Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedFeatureMembership_comp <em>Owned Feature Membership comp</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace() <em>Membership Owning Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Type that owns this FeatureMembership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Type</em>' container reference.
	 * @see #setOwningType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_OwningType()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedFeatureMembership_comp
	 * @model opposite="ownedFeatureMembership_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getOwningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwningType <em>Owning Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Type</em>' container reference.
	 * @see #getOwningType()
	 * @generated
	 */
	void setOwningType(Type value);

	/**
	 * Returns the value of the '<em><b>Owned Member Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature() <em>Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member Feature</em>' reference.
	 * @see #setOwnedMemberFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_OwnedMemberFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getOwnedMemberFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature <em>Owned Member Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Feature</em>' reference.
	 * @see #getOwnedMemberFeature()
	 * @generated
	 */
	void setOwnedMemberFeature(Feature value);

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
	 * <p>Whether the values of the Feature can exist after the instance of the domain no longer does.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureMembership_IsComposite()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureMembership#isComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

} // FeatureMembership
