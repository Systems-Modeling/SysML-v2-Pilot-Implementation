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
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Connector</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Connector</code> is a usage of <code>Associations</code>, with links restricted according to instances of the <code>Type</code> in which they are used (domain of the <code>Connector</code>). The <code>associations</code> of the <code>Connector</code> restrict what kinds of things might be linked. The <code>Connector</code> further restricts these links to be between values of <code>Features</code> on instances of its domain.</p>
 * 
 * relatedFeature = connectorEnd.ownedReferenceSubsetting->
 *     select(s | s <> null).subsettedFeature
 * relatedFeature->forAll(f | 
 *     if featuringType->isEmpty() then f.isFeaturedWithin(null)
 *     else featuringType->forAll(t | f.isFeaturedWithin(t))
 *     endif)
 * sourceFeature = 
 *     if relatedFeature->isEmpty() then null 
 *     else relatedFeature->first() 
 *     endif
 * targetFeature =
 *     if relatedFeature->size() < 2 then OrderedSet{}
 *     else 
 *         relatedFeature->
 *             subSequence(2, relatedFeature->size())->
 *             asOrderedSet()
 *     endif
 * not isAbstract implies relatedFeature->size() >= 2
 * specializesFromLibrary('Links::links')
 * association->exists(oclIsKindOf(AssociationStructure)) implies
 *     specializesFromLibrary('Objects::linkObjects')
 * connectorEnds->size() = 2 and
 * association->exists(oclIsKindOf(AssocationStructure)) implies
 *     specializesFromLibrary('Objects::binaryLinkObjects')
 * connectorEnd->size() = 2 implies
 *     specializesFromLibrary('Links::binaryLinks')
 * connectorEnds->size() > 2 implies
 *     not specializesFromLibrary('Links::BinaryLink')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getRelatedFeature <em>Related Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd <em>Connector End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Feature, Relationship {
	/**
	 * Returns the value of the '<em><b>Related Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Features</code> that are related by this <code>Connector</code> considered as a <code>Relationship</code> and that restrict the links it identifies, given by the referenced <code>Features</code> of the <code>connectorEnds</code> of the <code>Connector</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_RelatedFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connector'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getRelatedFeature();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Association}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Associations</code> that type the <code>Connector</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_Association()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedConnector'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Association> getAssociation();

	/**
	 * Returns the value of the '<em><b>Connector End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getEndFeature() <em>End Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>endFeatures</code> of a <code>Connector</code>, which redefine the <code>endFeatures</code> of the <code>associations</code> of the <code>Connector</code>. The <code>connectorEnds</code> determine via <code>ReferenceSubsetting</code> <code>Relationships</code> which <code>Features</code> are related by the <code>Connector</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_ConnectorEnd()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringConnector'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getConnectorEnd();

	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getRelatedFeature() <em>Related Feature</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The source <code>relatedFeature</code> for this <code>Connector</code>. It is the first <code>relatedFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Feature</em>' reference.
	 * @see #setSourceFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_SourceFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sourceConnector'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getSourceFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getSourceFeature <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' reference.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getRelatedFeature() <em>Related Feature</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The target <code>relatedFeatures</code> for this <code>Connector</code>. This includes all the <code>relatedFeatures</code> other than the <code>sourceFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_TargetFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='targetConnector'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> getTargetFeature();

} // Connector
