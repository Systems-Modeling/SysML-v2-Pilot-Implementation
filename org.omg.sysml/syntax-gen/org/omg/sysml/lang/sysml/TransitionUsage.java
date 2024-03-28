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
 * A representation of the model object '<em><b>Transition Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>TransitionUsage</code> is an <code>ActionUsage</code> representing a triggered transition between <code>ActionUsages</code> or <code>StateUsages</code>. When triggered by a <code>triggerAction</code>, when its <code>guardExpression</code> is true, the <code>TransitionUsage</code> asserts that its <code>source</code> is exited, then its <code>effectAction</code> (if any) is performed, and then its <code>target</code> is entered.</p>
 * 
 * <p>A <code>TransitionUsage</code> can be related to some of its <code>ownedFeatures</code> using <code>TransitionFeatureMembership</code> <code>Relationships</code>, corresponding to the <code>triggerAction</code>, <code>guardExpression</code> and <code>effectAction</code> of the <code>TransitionUsage</code>.</p>
 * isComposite and owningType <> null and
 * (owningType.oclIsKindOf(ActionDefinition) or 
 *  owningType.oclIsKindOf(ActionUsage)) and
 * not (owningType.oclIsKindOf(StateDefinition) or
 *      owningType.oclIsKindOf(StateUsage)) implies
 *     specializesFromLibrary('Actions::Action::decisionTransitions')
 * isComposite and owningType <> null and
 * (owningType.oclIsKindOf(StateDefinition) or
 *  owningType.oclIsKindOf(StateUsage)) implies
 *     specializesFromLibrary('States::State::stateTransitions')
 * specializesFromLibrary('Actions::transitionActions')
 * source =
 *     if ownedMembership->isEmpty() then null
 *     else
 *         let member : Element = 
 *             ownedMembership->at(1).memberElement in 
 *         if not member.oclIsKindOf(ActionUsage) then null
 *         else member.oclAsKindOf(ActionUsage)
 *         endif
 *     endif
 * target =
 *     if succession.targetFeature->isEmpty() then null
 *     else
 *         let targetFeature : Feature = 
 *             succession.targetFeature->at(1) in
 *         if not targetFeature.oclIsKindOf(ActionUsage) then null
 *         else targetFeature.oclAsType(ActionUsage)
 *         endif
 *     endif
 * triggerAction = ownedFeatureMembership->
 *     selectByKind(TransitionFeatureMembership)->
 *     select(kind = TransitionFeatureKind::trigger).transitionFeature->
 *     selectByKind(AcceptActionUsage)
 * let successions : Sequence(Successions) = 
 *     ownedMember->selectByKind(Succession) in
 * successions->notEmpty() and
 * successions->at(1).targetFeature->
 *     forAll(oclIsKindOf(ActionUsage))
 * guardExpression = ownedFeatureMembership->
 *     selectByKind(TransitionFeatureMembership)->
 *     select(kind = TransitionFeatureKind::trigger).transitionFeature->
 *     selectByKind(Expression)
 * triggerAction->forAll(specializesFromLibrary('Actions::TransitionAction::accepter') and
 * guardExpression->forAll(specializesFromLibrary('Actions::TransitionAction::guard') and
 * effectAction->forAll(specializesFromLibrary('Actions::TransitionAction::effect'))
 * triggerAction = ownedFeatureMembership->
 *     selectByKind(TransitionFeatureMembership)->
 *     select(kind = TransitionFeatureKind::trigger).transitionFeatures->
 *     selectByKind(AcceptActionUsage)
 * succession.sourceFeature = source
 * ownedMember->selectByKind(BindingConnector)->exists(b |
 *     b.relatedFeatures->includes(source) and
 *     b.relatedFeatures->includes(inputParameter(1)))
 * triggerAction->notEmpty() implies
 *     let payloadParameter : Feature = inputParameter(2) in
 *     payloadParameter <> null and
 *     payloadParameter.subsetsChain(triggerAction->at(1), triggerPayloadParameter())
 * ownedMember->selectByKind(BindingConnector)->exists(b |
 *     b.relatedFeatures->includes(succession) and
 *     b.relatedFeatures->includes(resolveGlobal(
 *         'TransitionPerformances::TransitionPerformance::transitionLink')))
 * if triggerAction->isEmpty() then
 *     inputParameters()->size() >= 1
 * else
 *     inputParameters()->size() >= 2
 * endif
 *     
 * succession = ownedMember->selectByKind(Succession)->at(1)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTriggerAction <em>Trigger Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getEffectAction <em>Effect Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getSuccession <em>Succession</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage()
 * @model
 * @generated
 */
public interface TransitionUsage extends ActionUsage {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The source <code>ActionUsage</code> of this <code>TransitionUsage</code>, which becomes the <code>source</code> of the <code>succession</code> for the <code>TransitionUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Source()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='outgoingTransition'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getSource();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The target <code>ActionUsage</code> of this <code>TransitionUsage<code>, which is the <code>targetFeature</code> of the <code>succession</code> for the <code>TransitionUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Target()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='incomingTransition'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getTarget();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Trigger Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AcceptActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AcceptActionUsages</code> that define the triggers of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = trigger</code>, which must all be <code>AcceptActionUsages</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_TriggerAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='triggeredTransition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AcceptActionUsage> getTriggerAction();

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expressions</code> that define the guards of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = guard</code>, which must all be <code>Expressions</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard Expression</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_GuardExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='guardedTransition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Expression> getGuardExpression();

	/**
	 * Returns the value of the '<em><b>Effect Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsages</code> that define the effects of this <code>TransitionUsage</code>, which are the <code>ownedFeatures</code> of the <code>TransitionUsage</code> related to it by <code>TransitionFeatureMemberships</code> with <code>kind = effect</code>, which must all be <code>ActionUsages</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_EffectAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activeTransition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ActionUsage> getEffectAction();

	/**
	 * Returns the value of the '<em><b>Succession</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Succession</code> that is the <code>ownedFeature</code> of this <code>TransitionUsage</code>, which, if the <code>TransitionUsage</code> is triggered, asserts the temporal ordering of the <code>source</code> and <code>target</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Succession</em>' reference.
	 * @see #setSuccession(Succession)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Succession()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkedTransition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Succession getSuccession();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getSuccession <em>Succession</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succession</em>' reference.
	 * @see #getSuccession()
	 * @generated
	 */
	void setSuccession(Succession value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the <code>payloadParameter</code> of the <code>triggerAction</code> of this <code>TransitionUsage</code>, if it has one.</p>
	 * if triggerAction->isEmpty() then null
	 * else triggerAction->first().payloadParameter
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ReferenceUsage triggerPayloadParameter();
} // TransitionStep
