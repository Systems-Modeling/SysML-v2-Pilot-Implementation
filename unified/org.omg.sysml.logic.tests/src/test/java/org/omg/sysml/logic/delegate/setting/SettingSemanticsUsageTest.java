/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 *******************************************************************************/
package org.omg.sysml.logic.delegate.setting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.CaseUsage;
import org.omg.sysml.model.sysml.FeatureDirectionKind;
import org.omg.sysml.model.sysml.ItemUsage;
import org.omg.sysml.model.sysml.PartUsage;
import org.omg.sysml.model.sysml.PortDefinition;
import org.omg.sysml.model.sysml.PortUsage;
import org.omg.sysml.model.sysml.RequirementUsage;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.TerminateActionUsage;
import org.omg.sysml.model.sysml.TransitionUsage;
import org.omg.sysml.model.sysml.VerificationCaseUsage;
import org.omg.sysml.model.sysml.ViewUsage;

/**
 * Setting semantics tests for Usage and Usage-derived metaclasses.
 */
public class SettingSemanticsUsageTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void usageNestedAnalysisCaseSettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Usage", "nestedAnalysisCase", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedAnalysisCase().isEmpty());
    }

    @Test
    void usageVariantSettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Usage", "variant", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getVariant().isEmpty());
    }

    @Test
    void terminateActionUsageTerminatedOccurrenceArgumentSettingRule() {
        TerminateActionUsage terminateActionUsage = SysMLFactory.eINSTANCE.createTerminateActionUsage();
        assertNull(semantics.evaluateSetting(
                "TerminateActionUsage", "terminatedOccurrenceArgument", terminateActionUsage));
        assertNull(terminateActionUsage.getTerminatedOccurrenceArgument());
    }

    @Test
    void assignmentActionUsageReferentSettingRule() {
        var assignmentActionUsage = SysMLFactory.eINSTANCE.createAssignmentActionUsage();
        assertNull(semantics.evaluateSetting("AssignmentActionUsage", "referent", assignmentActionUsage));
        assertNull(assignmentActionUsage.getReferent());
    }

    @Test
    void viewUsageExposedElementSettingRule() {
        ViewUsage viewUsage = SysMLFactory.eINSTANCE.createViewUsage();
        assertTrue(((EList<?>) semantics.evaluateSetting("ViewUsage", "exposedElement", viewUsage)).isEmpty());
    }

    @Test
    void requirementUsageSubjectParameterSettingRule() {
        RequirementUsage requirementUsage = SysMLFactory.eINSTANCE.createRequirementUsage();
        assertNull(semantics.evaluateSetting("RequirementUsage", "subjectParameter", requirementUsage));
        assertNull(requirementUsage.getSubjectParameter());
    }

    @Test
    void usageNestedUseCaseSettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Usage", "nestedUseCase", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedUseCase().isEmpty());
    }

    @Test
    void usageNestedEnumerationSettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Usage", "nestedEnumeration", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedEnumeration().isEmpty());
    }

    @Test
    void usageNestedReferenceSettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Usage", "nestedReference", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedReference().isEmpty());
    }

    @Test
    void usageNestedFlowSettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Usage", "nestedFlow", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedFlow().isEmpty());
    }

    @Test
    void usageMayTimeVarySettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.evaluateSetting("Usage", "mayTimeVary", usage));
        assertFalse(usage.isMayTimeVary());
    }

    @Test
    void verificationCaseUsageVerifiedRequirementSettingRule() {
        VerificationCaseUsage verificationCaseUsage = SysMLFactory.eINSTANCE.createVerificationCaseUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting(
                "VerificationCaseUsage", "verifiedRequirement", verificationCaseUsage);
        assertTrue(result.isEmpty());
        assertTrue(verificationCaseUsage.getVerifiedRequirement().isEmpty());
    }

    @Test
    void verificationCaseUsageVerificationCaseDefinitionSubsetsFallbackSettingRule() {
        var verificationCaseUsage = SysMLFactory.eINSTANCE.createVerificationCaseUsage();
        assertNull(semantics.evaluateSetting(
                "VerificationCaseUsage", "verificationCaseDefinition", verificationCaseUsage));
        assertNull(verificationCaseUsage.getVerificationCaseDefinition());
    }

    @Test
    void usageNestedConnectionSettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Usage", "nestedConnection", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedConnection().isEmpty());
    }

    @Test
    void caseUsageSubjectParameterSettingRule() {
        CaseUsage caseUsage = SysMLFactory.eINSTANCE.createCaseUsage();
        assertNull(semantics.evaluateSetting("CaseUsage", "subjectParameter", caseUsage));
        assertNull(caseUsage.getSubjectParameter());
    }

    @Test
    void transitionUsageSourceSettingRule() {
        TransitionUsage transitionUsage = SysMLFactory.eINSTANCE.createTransitionUsage();
        assertNull(semantics.evaluateSetting("TransitionUsage", "source", transitionUsage));
        assertNull(transitionUsage.getSource());
    }

    @Test
    void usageNestedRenderingSettingRule() {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Usage", "nestedRendering", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedRendering().isEmpty());
    }

    @Test
    void requirementUsageRequiredConstraintSettingRule() {
        RequirementUsage requirementUsage = SysMLFactory.eINSTANCE.createRequirementUsage();
        EList<?> result = (EList<?>) semantics.evaluateSetting("RequirementUsage", "requiredConstraint", requirementUsage);
        assertTrue(result.isEmpty());
        assertTrue(requirementUsage.getRequiredConstraint().isEmpty());
    }

    @Test
    void usageNestedPartSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedPart", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedPart().isEmpty());
    }

    @Test
    void usageNestedItemSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedItem", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedItem().isEmpty());
    }

    @Test
    void usageNestedViewSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedView", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedView().isEmpty());
    }

    @Test
    void usageNestedViewpointSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedViewpoint", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedViewpoint().isEmpty());
    }

    @Test
    void usageNestedOccurrenceSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedOccurrence", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedOccurrence().isEmpty());
    }

    @Test
    void usageNestedTransitionSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedTransition", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedTransition().isEmpty());
    }

    @Test
    void usageNestedCalculationSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedCalculation", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedCalculation().isEmpty());
    }

    @Test
    void usageNestedMetadataSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedMetadata", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedMetadata().isEmpty());
    }

    @Test
    void usageNestedStateSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedState", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedState().isEmpty());
    }

    @Test
    void usageNestedAttributeSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedAttribute", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedAttribute().isEmpty());
    }

    @Test
    void usageNestedCaseSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedCase", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedCase().isEmpty());
    }

    @Test
    void usageNestedActionSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedAction", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedAction().isEmpty());
    }

    @Test
    void usageNestedConcernSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedConcern", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedConcern().isEmpty());
    }

    @Test
    void usageNestedRequirementSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedRequirement", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedRequirement().isEmpty());
    }

    @Test
    void usageNestedConstraintSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedConstraint", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedConstraint().isEmpty());
    }

    @Test
    void usageNestedInterfaceSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedInterface", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedInterface().isEmpty());
    }

    @Test
    void usageNestedAllocationSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedAllocation", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedAllocation().isEmpty());
    }

    @Test
    void usageNestedVerificationCaseSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedVerificationCase", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedVerificationCase().isEmpty());
    }

    @Test
    void usageNestedUsageSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedUsage", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedUsage().isEmpty());
    }

    @Test
    void usageNestedPortSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "nestedPort", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getNestedPort().isEmpty());
    }

    @Test
    void requirementUsageActorParameterSettingRule() {
        var requirementUsage = SysMLFactory.eINSTANCE.createRequirementUsage();
        var result = (EList<?>) semantics.evaluateSetting("RequirementUsage", "actorParameter", requirementUsage);
        assertTrue(result.isEmpty());
        assertTrue(requirementUsage.getActorParameter().isEmpty());
    }

    @Test
    void requirementUsageAssumedConstraintSettingRule() {
        var requirementUsage = SysMLFactory.eINSTANCE.createRequirementUsage();
        var result = (EList<?>) semantics.evaluateSetting("RequirementUsage", "assumedConstraint", requirementUsage);
        assertTrue(result.isEmpty());
        assertTrue(requirementUsage.getAssumedConstraint().isEmpty());
    }

    @Test
    void requirementUsageFramedConcernSettingRule() {
        var requirementUsage = SysMLFactory.eINSTANCE.createRequirementUsage();
        var result = (EList<?>) semantics.evaluateSetting("RequirementUsage", "framedConcern", requirementUsage);
        assertTrue(result.isEmpty());
        assertTrue(requirementUsage.getFramedConcern().isEmpty());
    }

    @Test
    void requirementUsageStakeholderParameterSettingRule() {
        var requirementUsage = SysMLFactory.eINSTANCE.createRequirementUsage();
        var result = (EList<?>) semantics.evaluateSetting(
                "RequirementUsage", "stakeholderParameter", requirementUsage);
        assertTrue(result.isEmpty());
        assertTrue(requirementUsage.getStakeholderParameter().isEmpty());
    }

    @Test
    void requirementUsageTextSettingRule() {
        var requirementUsage = SysMLFactory.eINSTANCE.createRequirementUsage();
        var result = (EList<?>) semantics.evaluateSetting("RequirementUsage", "text", requirementUsage);
        assertTrue(result.isEmpty());
        assertTrue(requirementUsage.getText().isEmpty());
    }

    @Test
    void viewUsageViewConditionSettingRule() {
        var viewUsage = SysMLFactory.eINSTANCE.createViewUsage();
        var result = (EList<?>) semantics.evaluateSetting("ViewUsage", "viewCondition", viewUsage);
        assertTrue(result.isEmpty());
        assertTrue(viewUsage.getViewCondition().isEmpty());
    }

    @Test
    void viewUsageSatisfiedViewpointSettingRule() {
        var viewUsage = SysMLFactory.eINSTANCE.createViewUsage();
        var result = (EList<?>) semantics.evaluateSetting("ViewUsage", "satisfiedViewpoint", viewUsage);
        assertTrue(result.isEmpty());
        assertTrue(viewUsage.getSatisfiedViewpoint().isEmpty());
    }

    @Test
    void viewUsageViewRenderingSettingRule() {
        var viewUsage = SysMLFactory.eINSTANCE.createViewUsage();
        assertNull(semantics.evaluateSetting("ViewUsage", "viewRendering", viewUsage));
        assertNull(viewUsage.getViewRendering());
    }

    @Test
    void viewpointUsageViewpointStakeholderSettingRule() {
        var viewpointUsage = SysMLFactory.eINSTANCE.createViewpointUsage();
        var result = (EList<?>) semantics.evaluateSetting("ViewpointUsage", "viewpointStakeholder", viewpointUsage);
        assertTrue(result.isEmpty());
        assertTrue(viewpointUsage.getViewpointStakeholder().isEmpty());
    }

    @Test
    void useCaseUsageIncludedUseCaseSettingRule() {
        var useCaseUsage = SysMLFactory.eINSTANCE.createUseCaseUsage();
        var result = (EList<?>) semantics.evaluateSetting("UseCaseUsage", "includedUseCase", useCaseUsage);
        assertTrue(result.isEmpty());
        assertTrue(useCaseUsage.getIncludedUseCase().isEmpty());
    }

    @Test
    void includeUseCaseUsageUseCaseIncludedSettingRule() {
        var includeUseCaseUsage = SysMLFactory.eINSTANCE.createIncludeUseCaseUsage();
        assertSame(includeUseCaseUsage, semantics.evaluateSetting(
                "IncludeUseCaseUsage", "useCaseIncluded", includeUseCaseUsage));
        assertSame(includeUseCaseUsage, includeUseCaseUsage.getUseCaseIncluded());
    }

    @Test
    void analysisCaseUsageResultExpressionSettingRule() {
        var analysisCaseUsage = SysMLFactory.eINSTANCE.createAnalysisCaseUsage();
        assertNull(semantics.evaluateSetting("AnalysisCaseUsage", "resultExpression", analysisCaseUsage));
        assertNull(analysisCaseUsage.getResultExpression());
    }

    @Test
    void forLoopActionUsageSeqArgumentSettingRule() {
        var forLoopActionUsage = SysMLFactory.eINSTANCE.createForLoopActionUsage();
        assertNull(semantics.evaluateSetting("ForLoopActionUsage", "seqArgument", forLoopActionUsage));
        assertNull(forLoopActionUsage.getSeqArgument());
    }

    @Test
    void stateUsageExitActionSettingRule() {
        var stateUsage = SysMLFactory.eINSTANCE.createStateUsage();
        assertNull(semantics.evaluateSetting("StateUsage", "exitAction", stateUsage));
        assertNull(stateUsage.getExitAction());
    }

    @Test
    void transitionUsageGuardExpressionSettingRule() {
        var transitionUsage = SysMLFactory.eINSTANCE.createTransitionUsage();
        var result = (EList<?>) semantics.evaluateSetting("TransitionUsage", "guardExpression", transitionUsage);
        assertTrue(result.isEmpty());
        assertTrue(transitionUsage.getGuardExpression().isEmpty());
    }

    @Test
    void sendActionUsageReceiverArgumentSettingRule() {
        var sendActionUsage = SysMLFactory.eINSTANCE.createSendActionUsage();
        assertNull(semantics.evaluateSetting("SendActionUsage", "receiverArgument", sendActionUsage));
        assertNull(sendActionUsage.getReceiverArgument());
    }

    @Test
    void transitionUsageTargetSettingRule() {
        var transitionUsage = SysMLFactory.eINSTANCE.createTransitionUsage();
        assertNull(semantics.evaluateSetting("TransitionUsage", "target", transitionUsage));
        assertNull(transitionUsage.getTarget());
    }

    @Test
    void forLoopActionUsageLoopVariableSettingRule() {
        var forLoopActionUsage = SysMLFactory.eINSTANCE.createForLoopActionUsage();
        assertNull(semantics.evaluateSetting("ForLoopActionUsage", "loopVariable", forLoopActionUsage));
        assertNull(forLoopActionUsage.getLoopVariable());
    }

    @Test
    void whileLoopActionUsageWhileArgumentSettingRule() {
        var whileLoopActionUsage = SysMLFactory.eINSTANCE.createWhileLoopActionUsage();
        assertNull(semantics.evaluateSetting("WhileLoopActionUsage", "whileArgument", whileLoopActionUsage));
        assertNull(whileLoopActionUsage.getWhileArgument());
    }

    @Test
    void whileLoopActionUsageUntilArgumentSettingRule() {
        var whileLoopActionUsage = SysMLFactory.eINSTANCE.createWhileLoopActionUsage();
        assertNull(semantics.evaluateSetting("WhileLoopActionUsage", "untilArgument", whileLoopActionUsage));
        assertNull(whileLoopActionUsage.getUntilArgument());
    }

    @Test
    void occurrenceUsageIndividualDefinitionSettingRule() {
        var occurrenceUsage = SysMLFactory.eINSTANCE.createOccurrenceUsage();
        assertNull(semantics.evaluateSetting("OccurrenceUsage", "individualDefinition", occurrenceUsage));
        assertNull(occurrenceUsage.getIndividualDefinition());
    }

    @Test
    void stepBehaviorSettingRule() {
        var step = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Step", "behavior", step);
        assertTrue(result.isEmpty());
        assertTrue(step.getBehavior().isEmpty());
    }

    @Test
    void stepParameterSettingRule() {
        var step = SysMLFactory.eINSTANCE.createActionUsage();
        var parameter = SysMLFactory.eINSTANCE.createPartUsage();
        parameter.setDirection(FeatureDirectionKind.IN);
        var parameterMembership = SysMLFactory.eINSTANCE.createParameterMembership();
        parameterMembership.setMemberElement(parameter);
        step.getOwnedRelationship().add(parameterMembership);
        var result = (EList<?>) semantics.evaluateSetting("Step", "parameter", step);
        assertEquals(1, result.size());
        assertSame(parameter, result.get(0));
    }

    @Test
    void acceptActionUsagePayloadParameterSettingRule() {
        var acceptActionUsage = SysMLFactory.eINSTANCE.createAcceptActionUsage();
        assertNull(semantics.evaluateSetting("AcceptActionUsage", "payloadParameter", acceptActionUsage));
        assertNull(acceptActionUsage.getPayloadParameter());
    }

    @Test
    void satisfyRequirementUsageSatisfyingFeatureSettingRule() {
        var satisfyRequirementUsage = SysMLFactory.eINSTANCE.createSatisfyRequirementUsage();
        assertNull(semantics.evaluateSetting(
                "SatisfyRequirementUsage", "satisfyingFeature", satisfyRequirementUsage));
        assertNull(satisfyRequirementUsage.getSatisfyingFeature());
    }

    @Test
    void satisfyRequirementUsageSatisfiedRequirementSettingRule() {
        var satisfyRequirementUsage = SysMLFactory.eINSTANCE.createSatisfyRequirementUsage();
        assertSame(satisfyRequirementUsage, semantics.evaluateSetting(
                "SatisfyRequirementUsage", "satisfiedRequirement", satisfyRequirementUsage));
        assertSame(satisfyRequirementUsage, satisfyRequirementUsage.getSatisfiedRequirement());
    }

    @Test
    void transitionUsageSuccessionSettingRule() {
        var transitionUsage = SysMLFactory.eINSTANCE.createTransitionUsage();
        assertNull(semantics.evaluateSetting("TransitionUsage", "succession", transitionUsage));
        assertNull(transitionUsage.getSuccession());
    }

    @Test
    void usageIsReferenceSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue((Boolean) semantics.evaluateSetting("Usage", "isReference", usage));
        assertTrue(usage.isIsReference());
    }

    @Test
    void acceptActionUsageReceiverArgumentSettingRule() {
        var acceptActionUsage = SysMLFactory.eINSTANCE.createAcceptActionUsage();
        assertNull(semantics.evaluateSetting("AcceptActionUsage", "receiverArgument", acceptActionUsage));
        assertNull(acceptActionUsage.getReceiverArgument());
    }

    @Test
    void eventOccurrenceUsageEventOccurrenceSettingRule() {
        var eventOccurrenceUsage = SysMLFactory.eINSTANCE.createEventOccurrenceUsage();
        assertSame(eventOccurrenceUsage, semantics.evaluateSetting(
                "EventOccurrenceUsage", "eventOccurrence", eventOccurrenceUsage));
        assertSame(eventOccurrenceUsage, eventOccurrenceUsage.getEventOccurrence());
    }

    @Test
    void performActionUsagePerformedActionSettingRule() {
        var performActionUsage = SysMLFactory.eINSTANCE.createPerformActionUsage();
        assertSame(performActionUsage, semantics.evaluateSetting(
                "PerformActionUsage", "performedAction", performActionUsage));
        assertSame(performActionUsage, performActionUsage.getPerformedAction());
    }

    @Test
    void exhibitStateUsageExhibitedStateSettingRule() {
        var exhibitStateUsage = SysMLFactory.eINSTANCE.createExhibitStateUsage();
        assertSame(exhibitStateUsage, semantics.evaluateSetting(
                "ExhibitStateUsage", "exhibitedState", exhibitStateUsage));
        assertSame(exhibitStateUsage, exhibitStateUsage.getExhibitedState());
    }

    @Test
    void stateUsageEntryActionSettingRule() {
        var stateUsage = SysMLFactory.eINSTANCE.createStateUsage();
        assertNull(semantics.evaluateSetting("StateUsage", "entryAction", stateUsage));
        assertNull(stateUsage.getEntryAction());
    }

    @Test
    void stateUsageDoActionSettingRule() {
        var stateUsage = SysMLFactory.eINSTANCE.createStateUsage();
        assertNull(semantics.evaluateSetting("StateUsage", "doAction", stateUsage));
        assertNull(stateUsage.getDoAction());
    }

    @Test
    void caseUsageActorParameterSettingRule() {
        var caseUsage = SysMLFactory.eINSTANCE.createCaseUsage();
        var result = (EList<?>) semantics.evaluateSetting("CaseUsage", "actorParameter", caseUsage);
        assertTrue(result.isEmpty());
        assertTrue(caseUsage.getActorParameter().isEmpty());
    }

    @Test
    void caseUsageObjectiveRequirementSettingRule() {
        var caseUsage = SysMLFactory.eINSTANCE.createCaseUsage();
        assertNull(semantics.evaluateSetting("CaseUsage", "objectiveRequirement", caseUsage));
        assertNull(caseUsage.getObjectiveRequirement());
    }

    @Test
    void ifActionUsageIfArgumentSettingRule() {
        var ifActionUsage = SysMLFactory.eINSTANCE.createIfActionUsage();
        assertNull(semantics.evaluateSetting("IfActionUsage", "ifArgument", ifActionUsage));
        assertNull(ifActionUsage.getIfArgument());
    }

    @Test
    void sendActionUsagePayloadArgumentSettingRule() {
        var sendActionUsage = SysMLFactory.eINSTANCE.createSendActionUsage();
        assertNull(semantics.evaluateSetting("SendActionUsage", "payloadArgument", sendActionUsage));
        assertNull(sendActionUsage.getPayloadArgument());
    }

    @Test
    void acceptActionUsagePayloadArgumentSettingRule() {
        var acceptActionUsage = SysMLFactory.eINSTANCE.createAcceptActionUsage();
        assertNull(semantics.evaluateSetting("AcceptActionUsage", "payloadArgument", acceptActionUsage));
        assertNull(acceptActionUsage.getPayloadArgument());
    }

    @Test
    void usageVariantMembershipSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "variantMembership", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getVariantMembership().isEmpty());
    }

    @Test
    void ifActionUsageThenActionSettingRule() {
        var ifActionUsage = SysMLFactory.eINSTANCE.createIfActionUsage();
        assertNull(semantics.evaluateSetting("IfActionUsage", "thenAction", ifActionUsage));
        assertNull(ifActionUsage.getThenAction());
    }

    @Test
    void ifActionUsageElseActionSettingRule() {
        var ifActionUsage = SysMLFactory.eINSTANCE.createIfActionUsage();
        assertNull(semantics.evaluateSetting("IfActionUsage", "elseAction", ifActionUsage));
        assertNull(ifActionUsage.getElseAction());
    }

    @Test
    void usageDirectedUsageSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "directedUsage", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getDirectedUsage().isEmpty());
    }

    @Test
    void loopActionUsageBodyActionSettingRule() {
        var loopActionUsage = SysMLFactory.eINSTANCE.createWhileLoopActionUsage();
        assertNull(semantics.evaluateSetting("LoopActionUsage", "bodyAction", loopActionUsage));
        assertNull(loopActionUsage.getBodyAction());
    }

    @Test
    void transitionUsageTriggerActionSettingRule() {
        var transitionUsage = SysMLFactory.eINSTANCE.createTransitionUsage();
        var result = (EList<?>) semantics.evaluateSetting("TransitionUsage", "triggerAction", transitionUsage);
        assertTrue(result.isEmpty());
        assertTrue(transitionUsage.getTriggerAction().isEmpty());
    }

    @Test
    void transitionUsageEffectActionSettingRule() {
        var transitionUsage = SysMLFactory.eINSTANCE.createTransitionUsage();
        var result = (EList<?>) semantics.evaluateSetting("TransitionUsage", "effectAction", transitionUsage);
        assertTrue(result.isEmpty());
        assertTrue(transitionUsage.getEffectAction().isEmpty());
    }

    @Test
    void assignmentActionUsageValueExpressionSettingRule() {
        var assignmentActionUsage = SysMLFactory.eINSTANCE.createAssignmentActionUsage();
        assertNull(semantics.evaluateSetting("AssignmentActionUsage", "valueExpression", assignmentActionUsage));
        assertNull(assignmentActionUsage.getValueExpression());
    }

    @Test
    void sendActionUsageSenderArgumentSettingRule() {
        var sendActionUsage = SysMLFactory.eINSTANCE.createSendActionUsage();
        assertNull(semantics.evaluateSetting("SendActionUsage", "senderArgument", sendActionUsage));
        assertNull(sendActionUsage.getSenderArgument());
    }

    @Test
    void assertConstraintUsageAssertedConstraintSettingRule() {
        var assertConstraintUsage = SysMLFactory.eINSTANCE.createAssertConstraintUsage();
        assertSame(
                assertConstraintUsage,
                semantics.evaluateSetting("AssertConstraintUsage", "assertedConstraint", assertConstraintUsage));
        assertSame(
                assertConstraintUsage, assertConstraintUsage.getAssertedConstraint());
    }

    @Test
    void itemUsageItemDefinitionSettingRule() {
        ItemUsage itemUsage = SysMLFactory.eINSTANCE.createItemUsage();
        var result = (EList<?>) semantics.evaluateSetting("ItemUsage", "itemDefinition", itemUsage);
        assertTrue(result.isEmpty());
        assertTrue(itemUsage.getItemDefinition().isEmpty());
    }

    @Test
    void partUsagePartDefinitionSettingRule() {
        PartUsage partUsage = SysMLFactory.eINSTANCE.createPartUsage();
        var result = (EList<?>) semantics.evaluateSetting("PartUsage", "partDefinition", partUsage);
        assertTrue(result.isEmpty());
        assertTrue(partUsage.getPartDefinition().isEmpty());
    }

    @Test
    void portUsagePortDefinitionSettingRule() {
        PortUsage portUsage = SysMLFactory.eINSTANCE.createPortUsage();
        PortDefinition portDefinition = SysMLFactory.eINSTANCE.createPortDefinition();
        var nonPortType = SysMLFactory.eINSTANCE.createActionUsage();
        var validTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
        validTyping.setTypedFeature(portUsage);
        validTyping.setType(portDefinition);
        var invalidTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
        invalidTyping.setTypedFeature(portUsage);
        invalidTyping.setType(nonPortType);
        portUsage.getOwnedRelationship().add(validTyping);
        portUsage.getOwnedRelationship().add(invalidTyping);
        var result = (EList<?>) semantics.evaluateSetting("PortUsage", "portDefinition", portUsage);
        assertEquals(1, result.size());
        assertSame(portDefinition, result.get(0));
    }

    @Test
    void usageUsageSettingRule() {
        var usage = SysMLFactory.eINSTANCE.createActionUsage();
        var result = (EList<?>) semantics.evaluateSetting("Usage", "usage", usage);
        assertTrue(result.isEmpty());
        assertTrue(usage.getUsage().isEmpty());
    }
}
