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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Setting semantics tests for Definition and Definition-derived metaclasses.
 */
public class SettingSemanticsDefinitionTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void useCaseDefinitionIncludedUseCaseSettingRule() {
        var useCaseDefinition = SysMLFactory.eINSTANCE.createUseCaseDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting(
                "UseCaseDefinition", "includedUseCase", useCaseDefinition);
        assertTrue(result.isEmpty());
        assertTrue(useCaseDefinition.getIncludedUseCase().isEmpty());
    }

    @Test
    void caseDefinitionSubjectParameterSettingRule() {
        var caseDefinition = SysMLFactory.eINSTANCE.createCaseDefinition();
        assertNull(semantics.evaluateSetting("CaseDefinition", "subjectParameter", caseDefinition));
        assertNull(caseDefinition.getSubjectParameter());
    }

    @Test
    void allocationDefinitionAllocationSettingRule() {
        var allocationDefinition = SysMLFactory.eINSTANCE.createAllocationDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting(
                "AllocationDefinition", "allocation", allocationDefinition);
        assertTrue(result.isEmpty());
        assertTrue(allocationDefinition.getAllocation().isEmpty());
    }

    @Test
    void requirementDefinitionStakeholderParameterSettingRule() {
        var requirementDefinition = SysMLFactory.eINSTANCE.createRequirementDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting(
                "RequirementDefinition", "stakeholderParameter", requirementDefinition);
        assertTrue(result.isEmpty());
        assertTrue(requirementDefinition.getStakeholderParameter().isEmpty());
    }

    @Test
    void viewpointDefinitionViewpointStakeholderSettingRule() {
        var viewpointDefinition = SysMLFactory.eINSTANCE.createViewpointDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting(
                "ViewpointDefinition", "viewpointStakeholder", viewpointDefinition);
        assertTrue(result.isEmpty());
        assertTrue(viewpointDefinition.getViewpointStakeholder().isEmpty());
    }

    @Test
    void viewDefinitionViewConditionSettingRule() {
        var viewDefinition = SysMLFactory.eINSTANCE.createViewDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting("ViewDefinition", "viewCondition", viewDefinition);
        assertTrue(result.isEmpty());
        assertTrue(viewDefinition.getViewCondition().isEmpty());
    }

    @Test
    void requirementDefinitionAssumedConstraintSettingRule() {
        var requirementDefinition = SysMLFactory.eINSTANCE.createRequirementDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting(
                "RequirementDefinition", "assumedConstraint", requirementDefinition);
        assertTrue(result.isEmpty());
        assertTrue(requirementDefinition.getAssumedConstraint().isEmpty());
    }

    @Test
    void caseDefinitionActorParameterSettingRule() {
        var caseDefinition = SysMLFactory.eINSTANCE.createCaseDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting("CaseDefinition", "actorParameter", caseDefinition);
        assertTrue(result.isEmpty());
        assertTrue(caseDefinition.getActorParameter().isEmpty());
    }

    @Test
    void caseDefinitionObjectiveRequirementSettingRule() {
        var caseDefinition = SysMLFactory.eINSTANCE.createCaseDefinition();
        assertNull(semantics.evaluateSetting("CaseDefinition", "objectiveRequirement", caseDefinition));
        assertNull(caseDefinition.getObjectiveRequirement());
    }

    @Test
    void stateDefinitionDoActionSettingRule() {
        var stateDefinition = SysMLFactory.eINSTANCE.createStateDefinition();
        assertNull(semantics.evaluateSetting("StateDefinition", "doAction", stateDefinition));
        assertNull(stateDefinition.getDoAction());
    }

    @Test
    void stateDefinitionExitActionSettingRule() {
        var stateDefinition = SysMLFactory.eINSTANCE.createStateDefinition();
        assertNull(semantics.evaluateSetting("StateDefinition", "exitAction", stateDefinition));
        assertNull(stateDefinition.getExitAction());
    }

    @Test
    void stateDefinitionStateSettingRule() {
        var stateDefinition = SysMLFactory.eINSTANCE.createStateDefinition();
        var result = (EList<?>) semantics.evaluateSetting("StateDefinition", "state", stateDefinition);
        assertTrue(result.isEmpty());
        assertTrue(stateDefinition.getState().isEmpty());
    }

    @Test
    void definitionOwnedRenderingSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Definition", "ownedRendering", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedRendering().isEmpty());
    }

    @Test
    void definitionOwnedUsageSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        EList<?> result = (EList<?>) semantics.evaluateSetting("Definition", "ownedUsage", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedUsage().isEmpty());
    }

    @Test
    void definitionOwnedActionSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedAction", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedAction().isEmpty());
    }

    @Test
    void definitionOwnedAnalysisCaseSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedAnalysisCase", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedAnalysisCase().isEmpty());
    }

    @Test
    void definitionOwnedAllocationSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedAllocation", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedAllocation().isEmpty());
    }

    @Test
    void definitionOwnedAttributeSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedAttribute", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedAttribute().isEmpty());
    }

    @Test
    void definitionOwnedCalculationSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedCalculation", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedCalculation().isEmpty());
    }

    @Test
    void definitionOwnedCaseSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedCase", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedCase().isEmpty());
    }

    @Test
    void definitionOwnedConcernSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedConcern", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedConcern().isEmpty());
    }

    @Test
    void definitionOwnedConnectionSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedConnection", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedConnection().isEmpty());
    }

    @Test
    void definitionOwnedConstraintSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedConstraint", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedConstraint().isEmpty());
    }

    @Test
    void definitionOwnedInterfaceSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedInterface", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedInterface().isEmpty());
    }

    @Test
    void definitionOwnedEnumerationSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedEnumeration", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedEnumeration().isEmpty());
    }

    @Test
    void definitionOwnedFlowSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedFlow", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedFlow().isEmpty());
    }

    @Test
    void definitionOwnedItemSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedItem", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedItem().isEmpty());
    }

    @Test
    void definitionOwnedMetadataSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedMetadata", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedMetadata().isEmpty());
    }

    @Test
    void definitionOwnedOccurrenceSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedOccurrence", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedOccurrence().isEmpty());
    }

    @Test
    void definitionOwnedPartSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedPart", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedPart().isEmpty());
    }

    @Test
    void definitionOwnedPortSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedPort", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedPort().isEmpty());
    }

    @Test
    void definitionOwnedReferenceSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedReference", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedReference().isEmpty());
    }

    @Test
    void definitionOwnedRequirementSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedRequirement", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedRequirement().isEmpty());
    }

    @Test
    void definitionOwnedStateSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedState", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedState().isEmpty());
    }

    @Test
    void definitionOwnedTransitionSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedTransition", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedTransition().isEmpty());
    }

    @Test
    void definitionOwnedUseCaseSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedUseCase", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedUseCase().isEmpty());
    }

    @Test
    void definitionOwnedVerificationCaseSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedVerificationCase", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedVerificationCase().isEmpty());
    }

    @Test
    void definitionOwnedViewSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedView", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedView().isEmpty());
    }

    @Test
    void definitionOwnedViewpointSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "ownedViewpoint", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getOwnedViewpoint().isEmpty());
    }

    @Test
    void definitionUsageSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "usage", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getUsage().isEmpty());
    }

    @Test
    void definitionDirectedUsageSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "directedUsage", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getDirectedUsage().isEmpty());
    }

    @Test
    void definitionVariantMembershipSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "variantMembership", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getVariantMembership().isEmpty());
    }

    @Test
    void definitionVariantSettingRule() {
        var definition = SysMLFactory.eINSTANCE.createPartDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Definition", "variant", definition);
        assertTrue(result.isEmpty());
        assertTrue(definition.getVariant().isEmpty());
    }

    @Test
    void enumerationDefinitionEnumeratedValueSettingRule() {
        var enumerationDefinition = SysMLFactory.eINSTANCE.createEnumerationDefinition();

        var enumVariantMembership = SysMLFactory.eINSTANCE.createVariantMembership();
        var enumeratedValue = SysMLFactory.eINSTANCE.createEnumerationUsage();
        enumVariantMembership.setMemberElement(enumeratedValue);
        enumerationDefinition.getOwnedRelationship().add(enumVariantMembership);

        var nonEnumVariantMembership = SysMLFactory.eINSTANCE.createVariantMembership();
        nonEnumVariantMembership.setMemberElement(SysMLFactory.eINSTANCE.createPartUsage());
        enumerationDefinition.getOwnedRelationship().add(nonEnumVariantMembership);

        var result = (EList<?>) semantics.evaluateSetting(
                "EnumerationDefinition", "enumeratedValue", enumerationDefinition);
        assertEquals(1, result.size());
        assertSame(enumeratedValue, result.getFirst());
    }

    @Test
    void viewDefinitionViewSettingRule() {
        var viewDefinition = SysMLFactory.eINSTANCE.createViewDefinition();
        var result = (EList<?>) semantics.evaluateSetting("ViewDefinition", "view", viewDefinition);
        assertTrue(result.isEmpty());
        assertTrue(viewDefinition.getView().isEmpty());
    }

    @Test
    void requirementDefinitionActorParameterSettingRule() {
        var requirementDefinition = SysMLFactory.eINSTANCE.createRequirementDefinition();
        var result = (EList<?>) semantics.evaluateSetting("RequirementDefinition", "actorParameter", requirementDefinition);
        assertTrue(result.isEmpty());
        assertTrue(requirementDefinition.getActorParameter().isEmpty());
    }

    @Test
    void requirementDefinitionRequiredConstraintSettingRule() {
        var requirementDefinition = SysMLFactory.eINSTANCE.createRequirementDefinition();
        var result = (EList<?>) semantics.evaluateSetting(
                "RequirementDefinition", "requiredConstraint", requirementDefinition);
        assertTrue(result.isEmpty());
        assertTrue(requirementDefinition.getRequiredConstraint().isEmpty());
    }

    @Test
    void requirementDefinitionSubjectParameterSettingRule() {
        var requirementDefinition = SysMLFactory.eINSTANCE.createRequirementDefinition();
        assertNull(semantics.evaluateSetting("RequirementDefinition", "subjectParameter", requirementDefinition));
        assertNull(requirementDefinition.getSubjectParameter());
    }

    @Test
    void requirementDefinitionFramedConcernSettingRule() {
        var requirementDefinition = SysMLFactory.eINSTANCE.createRequirementDefinition();
        var result = (EList<?>) semantics.evaluateSetting("RequirementDefinition", "framedConcern", requirementDefinition);
        assertTrue(result.isEmpty());
        assertTrue(requirementDefinition.getFramedConcern().isEmpty());
    }

    @Test
    void requirementDefinitionTextSettingRule() {
        var requirementDefinition = SysMLFactory.eINSTANCE.createRequirementDefinition();
        var result = (EList<?>) semantics.evaluateSetting("RequirementDefinition", "text", requirementDefinition);
        assertTrue(result.isEmpty());
        assertTrue(requirementDefinition.getText().isEmpty());
    }

    @Test
    void viewDefinitionSatisfiedViewpointSettingRule() {
        var viewDefinition = SysMLFactory.eINSTANCE.createViewDefinition();
        var result = (EList<?>) semantics.evaluateSetting("ViewDefinition", "satisfiedViewpoint", viewDefinition);
        assertTrue(result.isEmpty());
        assertTrue(viewDefinition.getSatisfiedViewpoint().isEmpty());
    }

    @Test
    void viewDefinitionViewRenderingSettingRule() {
        var viewDefinition = SysMLFactory.eINSTANCE.createViewDefinition();
        assertNull(semantics.evaluateSetting("ViewDefinition", "viewRendering", viewDefinition));
        assertNull(viewDefinition.getViewRendering());
    }

    @Test
    void analysisCaseDefinitionResultExpressionSettingRule() {
        var analysisCaseDefinition = SysMLFactory.eINSTANCE.createAnalysisCaseDefinition();
        assertNull(semantics.evaluateSetting("AnalysisCaseDefinition", "resultExpression", analysisCaseDefinition));
        assertNull(analysisCaseDefinition.getResultExpression());
    }

    @Test
    void verificationCaseDefinitionVerifiedRequirementSettingRule() {
        var verificationCaseDefinition = SysMLFactory.eINSTANCE.createVerificationCaseDefinition();
        var result = (EList<?>) semantics.evaluateSetting(
                "VerificationCaseDefinition", "verifiedRequirement", verificationCaseDefinition);
        assertTrue(result.isEmpty());
        assertTrue(verificationCaseDefinition.getVerifiedRequirement().isEmpty());
    }

    @Test
    void actionDefinitionActionSettingRule() {
        var actionDefinition = SysMLFactory.eINSTANCE.createActionDefinition();
        var result = (EList<?>) semantics.evaluateSetting("ActionDefinition", "action", actionDefinition);
        assertTrue(result.isEmpty());
        assertTrue(actionDefinition.getAction().isEmpty());
    }

    @Test
    void behaviorStepSettingRule() {
        var behavior = SysMLFactory.eINSTANCE.createActionDefinition();
        var result = (EList<?>) semantics.evaluateSetting("Behavior", "step", behavior);
        assertTrue(result.isEmpty());
        assertTrue(behavior.getStep().isEmpty());
    }

    @Test
    void requirementConstraintMembershipReferencedConstraintSettingRule() {
        var requirementConstraintMembership = SysMLFactory.eINSTANCE.createRequirementConstraintMembership();
        assertNull(semantics.evaluateSetting(
                "RequirementConstraintMembership", "referencedConstraint", requirementConstraintMembership));
        assertNull(requirementConstraintMembership.getReferencedConstraint());
    }

    @Test
    void framedConcernMembershipReferencedConcernSettingRule() {
        var framedConcernMembership = SysMLFactory.eINSTANCE.createFramedConcernMembership();
        var concernUsage = SysMLFactory.eINSTANCE.createConcernUsage();
        framedConcernMembership.setMemberElement(concernUsage);

        assertSame(concernUsage, semantics.evaluateSetting(
                "FramedConcernMembership", "referencedConcern", framedConcernMembership));
        assertSame(concernUsage, framedConcernMembership.getReferencedConcern());
    }

    @Test
    void interfaceDefinitionInterfaceEndSettingRule() {
        var interfaceDefinition = SysMLFactory.eINSTANCE.createInterfaceDefinition();
        var portUsage = SysMLFactory.eINSTANCE.createPortUsage();
        var partUsage = SysMLFactory.eINSTANCE.createPartUsage();

        var portMembership = SysMLFactory.eINSTANCE.createFeatureMembership();
        portMembership.setOwningRelatedElement(interfaceDefinition);
        portMembership.setMemberElement(portUsage);

        var partMembership = SysMLFactory.eINSTANCE.createFeatureMembership();
        partMembership.setOwningRelatedElement(interfaceDefinition);
        partMembership.setMemberElement(partUsage);

        var result = (EList<?>) semantics.evaluateSetting(
                "InterfaceDefinition", "interfaceEnd", interfaceDefinition);
        assertTrue(result.contains(portUsage));
        assertFalse(result.contains(partUsage));
    }

    @Test
    void stateDefinitionEntryActionSettingRule() {
        var stateDefinition = SysMLFactory.eINSTANCE.createStateDefinition();
        assertNull(semantics.evaluateSetting("StateDefinition", "entryAction", stateDefinition));
        assertNull(stateDefinition.getEntryAction());
    }

    @Test
    void renderingDefinitionRenderingSettingRule() {
        var renderingDefinition = SysMLFactory.eINSTANCE.createRenderingDefinition();
        var result = (EList<?>) semantics.evaluateSetting("RenderingDefinition", "rendering", renderingDefinition);
        assertTrue(result.isEmpty());
        assertTrue(renderingDefinition.getRendering().isEmpty());
    }
}
