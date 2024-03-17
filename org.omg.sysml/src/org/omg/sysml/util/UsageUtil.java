/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2024 Model Driven Solutions, Inc.
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

package org.omg.sysml.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.adapter.UsageAdapter;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.ActorMembership;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.FramedConcernMembership;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilterMembership;
import org.omg.sysml.lang.sysml.Expose;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.FlowConnectionUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.RequirementVerificationMembership;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.StakeholderMembership;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.lang.sysml.ViewRenderingMembership;
import org.omg.sysml.lang.sysml.ViewUsage;

public class UsageUtil {
	
	private UsageUtil() {
	}

	protected static UsageAdapter getUsageAdapter(Usage usage) {
		return (UsageAdapter)ElementUtil.getElementAdapter(usage);
	}
	
	// References
	
	public static boolean isComposite(Usage usage, boolean isComposite) {
		return isComposite && !usage.getFeaturingType().isEmpty() && usage.getDirection() == null && !usage.isEnd();
	}
	
	// Variants
	
	public static boolean isVariant(Usage usage) {
		return usage.getOwningMembership() instanceof VariantMembership;
	}

	public static Definition getOwningVariationDefinitionFor(Usage usage) {
		Namespace owner = usage.getOwningNamespace();
		return owner instanceof Definition && ((Definition)owner).isVariation()? ((Definition)owner): null;
	}

	public static Usage getOwningVariationUsageFor(Usage usage) {
		Namespace owner = usage.getOwningNamespace();
		return owner instanceof Usage && ((Usage)owner).isVariation()? ((Usage)owner): null;
	}

	public static VariantMembership getOwningVariantMembershipFor(Usage usage) {
		Membership owningMembership = usage.getOwningMembership();
		return owningMembership instanceof VariantMembership? (VariantMembership)owningMembership: null;
	}
	
	// Results
	
	public static void addResultParameterTo(Type type) {
		TypeUtil.addResultParameterTo(type, SysMLFactory.eINSTANCE.createReferenceUsage());
	}
	
	// Subjects

	public static boolean isSubjectParameter(Usage usage) {
		return usage.getOwningFeatureMembership() instanceof SubjectMembership;
	}

	public static Usage getSubjectParameterOf(Type type) {
		NamespaceUtil.addAdditionalMembersTo(type);
		return (Usage)TypeUtil.getOwnedFeatureByMembershipIn(type, SubjectMembership.class);
	}

	public static boolean hasRelevantSubjectParameter(Usage usage) {
		return getUsageAdapter(usage).hasRelevantSubjectParameter();
	}

	public static FeatureValue getSatisfyingFeatureValueOf(SatisfyRequirementUsage usage) {
		Feature subject = usage.getSubjectParameter();
		return subject == null? null: FeatureUtil.getValuationFor(subject);
	}
	
	public static void addSubjectParameterTo(Type type) {
		if (type.getOwnedMembership().stream().noneMatch(SubjectMembership.class::isInstance)) {
			Usage parameter = SysMLFactory.eINSTANCE.createReferenceUsage();
			SubjectMembership membership = SysMLFactory.eINSTANCE.createSubjectMembership();
			membership.setOwnedSubjectParameter(parameter);
			type.getOwnedRelationship().add(0, membership);
		}
	}
	
	// Objectives

	public static RequirementUsage getObjectiveRequirementOf(Type type) {
		NamespaceUtil.addAdditionalMembersTo(type);
		return type instanceof CaseDefinition? ((CaseDefinition)type).getObjectiveRequirement():
			   type instanceof CaseUsage? ((CaseUsage)type).getObjectiveRequirement():
			   null;
	}

	public static void addObjectiveRequirementTo(Type type) {
		if (type.getOwnedRelationship().stream().noneMatch(ObjectiveMembership.class::isInstance)) {
			RequirementUsage objective = SysMLFactory.eINSTANCE.createRequirementUsage();
			ObjectiveMembership membership = SysMLFactory.eINSTANCE.createObjectiveMembership();
			membership.setOwnedObjectiveRequirement(objective);
			type.getOwnedRelationship().add(membership);
		}
	}

	// Actors
	
	public static boolean isActorParameter(Usage usage) {
		return usage.getOwningFeatureMembership() instanceof ActorMembership;
	}

	// Stakeholders
	
	public static boolean isStakeholderParameter(Usage usage) {
		return usage.getOwningFeatureMembership() instanceof StakeholderMembership;
	}	
	
	// Actions
	
	public static EList<Feature> getOwnedInputParametersOf(ActionUsage action) {
		EList<Feature> inputParameters = new BasicEList<>();
		action.getInput().stream().
			filter(f->f.getOwner() == action).
			forEachOrdered(inputParameters::add);
		return inputParameters;
	}
	
	public static Expression getArgumentOf(ActionUsage action, int i) {
		List<Feature> parameters = getOwnedInputParametersOf(action);
		return parameters.size() < i? null: FeatureUtil.getValueExpressionFor(parameters.get(i - 1));
	}
	
	// SuccessionAsUsages
	
	public static Feature getPreviousFeature(Feature feature) {
		Namespace owner = feature.getOwningNamespace();
		if (!(owner instanceof Type)) {
			return null;
		} else {
			Type type = (Type)owner;
			EList<Membership> memberships = type.getOwnedMembership();
			for (int i = memberships.indexOf(feature.getOwningMembership()) - 1; i >= 0; i--) {
				Element previousElement = memberships.get(i).getMemberElement();
				if (previousElement instanceof Feature &&
					!FeatureUtil.isParameter((Feature)previousElement) &&
					!(previousElement instanceof TransitionUsage) &&
					(!(previousElement instanceof Connector) ||
					 isMessageConnection((Feature)previousElement))) {
					return (Feature)previousElement;
				}
			}
			return null;
		}
	}

	// Flow Connections
	
	public static boolean isMessageConnection(Feature feature) {
		return feature instanceof FlowConnectionUsage &&
			   feature.getOwnedFeature().stream().noneMatch(Feature::isEnd);
	}
	
	// Constraints
	
	public static boolean isAssumptionConstraint(ConstraintUsage constraint) {
		return getRequirementConstraintKindOf(constraint) == RequirementConstraintKind.ASSUMPTION;
	}
	
	public static boolean isRequirementConstraint(ConstraintUsage constraint) {
		return getRequirementConstraintKindOf(constraint) == RequirementConstraintKind.REQUIREMENT;
	}
	
	public static RequirementConstraintKind getRequirementConstraintKindOf(ConstraintUsage constraint) {
		FeatureMembership owningMembership = constraint.getOwningFeatureMembership();
		return owningMembership instanceof RequirementConstraintMembership? 
				((RequirementConstraintMembership)owningMembership).getKind(): null;
	}
	
	// Requirements
	
	public static boolean isSubrequirement(RequirementUsage requirement) {
		Type owningType = requirement.getOwningType();
		return !isAssumptionConstraint(requirement) && requirement.isComposite() &&
			   (owningType instanceof RequirementDefinition || 
			    owningType instanceof RequirementUsage);
	}

	public static boolean isObjective(RequirementUsage requirement) {
		return requirement.getOwningFeatureMembership() instanceof ObjectiveMembership;
	}	

	public static boolean isVerifiedRequirement(RequirementUsage requirement) {
		FeatureMembership membership = requirement.getOwningFeatureMembership();
		return membership instanceof RequirementVerificationMembership &&
			   isLegalVerification((RequirementVerificationMembership)membership);
	}
	
	public static boolean isLegalVerification(RequirementVerificationMembership membership) {
		Type owningType = membership.getOwningType();
		if (owningType instanceof RequirementUsage && isObjective((RequirementUsage)owningType)) {
			owningType = ((RequirementUsage)owningType).getOwningType();
			return owningType instanceof VerificationCaseDefinition || 
				   owningType instanceof VerificationCaseUsage;
		} else {
			return false;
		}
	}
	
	public static boolean isFramedConcern(ConcernUsage concern) {
		return concern.getOwningFeatureMembership() instanceof FramedConcernMembership;
	}
	
	public static <T extends RequirementConstraintMembership> Stream<ConstraintUsage> getRequirementConstraints(Type owner, Class<T> membershipClass, RequirementConstraintKind kind) {
		return owner.getOwnedFeatureMembership().stream().
				filter(mem->membershipClass.isInstance(mem) && ((RequirementConstraintMembership)mem).getKind() == kind).
				map(mem->((RequirementConstraintMembership)mem).getOwnedConstraint()).
				filter(constraint->constraint != null);
	}

	public static Stream<ConstraintUsage> getRequirementConstraints(Type owner, RequirementConstraintKind kind) {
		return getRequirementConstraints(owner, RequirementConstraintMembership.class, kind);
	}
		
	public static Stream<RequirementUsage> getVerifiedRequirements(Type owner) {
		return owner.getOwnedFeatureMembership().stream().
				filter(RequirementVerificationMembership.class::isInstance).
				map(mem->((RequirementVerificationMembership)mem).getVerifiedRequirement()).
				filter(constraint->constraint != null);
	}
	
	// States
	
	public static boolean isParallelState(Type type) {
		return type instanceof StateDefinition && ((StateDefinition)type).isParallel() ||
			   type instanceof StateUsage && ((StateUsage)type).isParallel();
	}
	
	public static boolean isNonParallelState(Type type) {
		return type instanceof StateDefinition && !((StateDefinition)type).isParallel() ||
			   type instanceof StateUsage && !((StateUsage)type).isParallel();
	}
	
	public static ActionUsage getEntryActionOf(Type type) {
		return type instanceof StateDefinition? ((StateDefinition)type).getEntryAction():
			   type instanceof StateUsage? ((StateUsage)type).getEntryAction():
			   null;
	}
	
	public static ActionUsage getStateSubaction(Type owner, StateSubactionKind kind) {
		return getStateSubactionMembershipsOf(owner, kind).stream().
				map(StateSubactionMembership::getAction).
				filter(action->action != null).
				findAny().orElse(null);
	}

	public static List<StateSubactionMembership> getStateSubactionMembershipsOf(Type type, StateSubactionKind kind) {
		return type.getOwnedFeatureMembership().stream().
				filter(StateSubactionMembership.class::isInstance).
				map(StateSubactionMembership.class::cast).
				filter(m->m.getKind() == kind).
				collect(Collectors.toList());				
	}
	
	public static boolean hasInitialTransition(Type type) {
		Feature entryAction = getEntryActionOf(type);
		return entryAction != null &&
			   type.getOwnedFeature().stream().
				map(f->f instanceof Succession? 
						((Succession)f).getSourceFeature(): 
					   f instanceof TransitionUsage? 
						((TransitionUsage)f).getSource(): null).
				anyMatch(source->source == entryAction);
	}
	
	public static boolean hasIncomingTransitions(StateUsage state) {
		return hasIncomingTransitions(state, state.getOwningType());
	}
	
	private static boolean hasIncomingTransitions(StateUsage state, Type container) {
		return container instanceof StateDefinition &&
						hasIncomingTransitionsIn(container, state) ||
			   container instanceof StateUsage &&
					   	(hasIncomingTransitionsIn(container, state) ||
					     hasIncomingTransitions(state, ((StateUsage)container).getOwningType()));

	}
	
	private static boolean hasIncomingTransitionsIn(Type container, StateUsage state) {
		return container.getOwnedFeature().stream().
				map(UsageUtil::getTransitionTargetOf).
				anyMatch(target->target == state);
	}
	
	// Transitions
	
	public static Feature getTransitionSourceOf(Feature transition) {
		Feature source= transition instanceof TransitionUsage? ((TransitionUsage)transition).getSource():
			   transition instanceof Succession? ((Succession)transition).getSourceFeature():
			   null;
		return FeatureUtil.getBasicFeatureOf(source);
	}
	
	public static Feature getTransitionTargetOf(Feature transition) {
		Feature target =
			transition instanceof TransitionUsage? ((TransitionUsage)transition).getTarget():
			transition instanceof Succession? ((Succession)transition).getTargetFeature().stream().findFirst().orElse(null):
			null;
		return FeatureUtil.getBasicFeatureOf(target);
	}
	
	public static Stream<Feature> getTransitionFeaturesOf(TransitionUsage usage, TransitionFeatureKind kind) {
		return usage.getOwnedFeatureMembership().stream().
				filter(mem->(mem instanceof TransitionFeatureMembership) && ((TransitionFeatureMembership)mem).getKind() == kind).
				map(mem->mem.getOwnedMemberFeature()).
				filter(f->f != null);
	}
	
	public static Feature getPayloadParameterOf(TransitionUsage transition) {
		return TypeUtil.getFeaturesByMembershipIn(transition, ParameterMembership.class).skip(1).findFirst().orElse(null);
	}
	
	public static Feature getAccepterPayloadParameterOf(TransitionUsage transition) {
		List<AcceptActionUsage> triggers = transition.getTriggerAction();
		if (triggers.isEmpty()) {
			return null;
		} else {
			AcceptActionUsage accepter = triggers.get(0);
			return TypeUtil.getOwnedParametersOf(accepter).stream().findFirst().orElse(null);
		}
	}
	
	public static Feature getTransitionLinkFeatureOf(TransitionUsage transition) {
		return transition.getOwnedFeatureMembership().stream().
				filter(m->!(m instanceof TransitionFeatureMembership || m instanceof ParameterMembership)).
				map(FeatureMembership::getOwnedMemberFeature).
				findFirst().orElse(null);
	}
	
	// Views
	
	public static RenderingUsage getViewRenderingOf(Type view) {
		return view.getOwnedMembership().stream().
				filter(ViewRenderingMembership.class::isInstance).
				map(ViewRenderingMembership.class::cast).
				map(ViewRenderingMembership::getReferencedRendering).
				findFirst().
				orElse(null);
	}

	public static Stream<Expose> getExposeImportsOf(Type view) {
		return view.getOwnedImport().stream().
				filter(Expose.class::isInstance).
				map(Expose.class::cast);
	}

	public static EList<Expression> getAllViewConditionsOf(ViewUsage view) {
		EList<Expression> viewConditions = view.getViewCondition();
		TypeUtil.getInheritedMembersByMembershipIn(view, ElementFilterMembership.class, Expression.class).forEachOrdered(viewConditions::add);
		return viewConditions;
	}

}
