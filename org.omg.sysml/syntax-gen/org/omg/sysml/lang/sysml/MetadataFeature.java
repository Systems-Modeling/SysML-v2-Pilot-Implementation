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
 * A representation of the model object '<em><b>Annotating Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>MetadataFeature</code> is a <code>Feature</code> that is an <code>AnnotatingElement</code> used to annotate another <code>Element</code> with metadata. It is typed by a <code>Metaclass</code>. All its <code>ownedFeatures</code> must redefine <code>features</code> of its <code>metaclass</code> and any feature bindings must be model-level evaluable.</p>
 * 
 * 
 * specializesFromLibrary('Metaobjects::metaobjects')
 * isSemantic() implies
 *     let annotatedTypes : Sequence(Type) = 
 *         annotatedElement->selectAsKind(Type) in
 *     let baseTypes : Sequence(MetadataFeature) = 
 *         evaluateFeature(resolveGlobal(
 *             'Metaobjects::SemanticMetadata::baseType').
 *             memberElement.
 *             oclAsType(Feature))->
 *         selectAsKind(MetadataFeature) in
 *     annotatedTypes->notEmpty() and 
 *     baseTypes()->notEmpty() and 
 *     baseTypes()->first().isSyntactic() implies
 *         let annotatedType : Type = annotatedTypes->first() in
 *         let baseType : Element = baseTypes->first().syntaxElement() in
 *         if annotatedType.oclIsKindOf(Classifier) and 
 *             baseType.oclIsKindOf(Feature) then
 *             baseType.oclAsType(Feature).type->
 *                 forAll(t | annotatedType.specializes(t))
 *         else if baseType.oclIsKindOf(Type) then
 *             annotatedType.specializes(baseType.oclAsType(Type))
 *         else
 *             true
 *         endif
 * not metaclass.isAbstract
 * let baseAnnotatedElementFeature : Feature =
 *     resolveGlobal('Metaobjects::Metaobject::annotatedElement').memberElement.
 *     oclAsType(Feature) in
 * let annotatedElementFeatures : OrderedSet(Feature) = feature->
 *     select(specializes(baseAnnotatedElementFeature))->
 *     excluding(baseAnnotatedElementFeature) in
 * annotatedElementFeatures->notEmpty() implies
 *     let annotatedElementTypes : Set(Feature) =
 *         annotatedElementFeatures.typing.type->asSet() in
 *     let metaclasses : Set(Metaclass) =
 *         annotatedElement.oclType().qualifiedName->collect(qn | 
 *             resolveGlobal(qn).memberElement.oclAsType(Metaclass)) in
 *    metaclasses->forAll(m | annotatedElementTypes->exists(t | m.specializes(t)))
 * ownedFeature->closure(ownedFeature)->forAll(f |
 *     f.declaredName = null and f.declaredShortName = null and
 *     f.valuation <> null implies f.valuation.value.isModelLevelEvaluable and
 *     f.redefinition.redefinedFeature->size() = 1)
 * metaclass = 
 *     let metaclassTypes : Sequence(Type) = type->selectByKind(Metaclass) in
 *     if metaclassTypes->isEmpty() then null
 *     else metaClassTypes->first()
 *     endif
 * type->selectByKind(Metaclass).size() = 1
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature()
 * @model
 * @generated
 */
public interface MetadataFeature extends Feature, AnnotatingElement {
	/**
	 * Returns the value of the '<em><b>Metaclass</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>type</code> of this <code>MetadataFeature</code>, which must be a <code>Metaclass</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass</em>' reference.
	 * @see #setMetaclass(Metaclass)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature_Metaclass()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedMetadata'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Metaclass getMetaclass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetaclass <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass</em>' reference.
	 * @see #getMetaclass()
	 * @generated
	 */
	void setMetaclass(Metaclass value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If the given <code>baseFeature</code> is a <code>feature</code> of this <code>MetadataFeature</code>, or is directly or indirectly redefined by a <code>feature</code>, then return the result of evaluating the appropriate (model-level evaluable) <code>value</code> <code>Expression</code> for it (if any), with the <code>MetadataFeature</code> as the target.</p>
	 * let selectedFeatures : Sequence(Feature) = feature->
	 *     select(closure(ownedRedefinition.redefinedFeature)->
	 *            includes(baseFeature)) in
	 * if selectedFeatures->isEmpty() then null
	 * else
	 *     let selectedFeature : Feature = selectedFeatures->first() in
	 *     let featureValues : FeatureValue = selectedFeature->
	 *         closure(ownedRedefinition.redefinedFeature).ownedMember->
	 *         selectAsKind(FeatureValue) in
	 *     if featureValues->isEmpty() then null
	 *     else featureValues->first().value.evaluate(self)
	 *     endif
	 * <!-- end-model-doc -->
	 * @model ordered="false" baseFeatureRequired="true" baseFeatureOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Element> evaluateFeature(Feature baseFeature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check if this <code>MetadataFeature</code> has a <code>metaclass</code> which is a kind of <code><em>SemanticMetadata</code>.<p>
	 * specializesFromLibrary('Metaobjects::SemanticMetadata')
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isSemantic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check if this <code>MetadataFeature</code> has a <code>metaclass</code> that is a kind of <code><em>KerML::Element</em></code> (that is, it is from the reflective abstract syntax model).</p>
	 * specializesFromLibrary('KerML::Element')
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isSyntactic();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If this <code>MetadataFeature</code> reflectively represents a model element, then return the corresponding <code>Element</code> instance from the MOF abstract syntax representation of the model.</p>
	 * isSyntactic()
	 * No OCL
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Element syntaxElement();

} // AnnotatingFeature
