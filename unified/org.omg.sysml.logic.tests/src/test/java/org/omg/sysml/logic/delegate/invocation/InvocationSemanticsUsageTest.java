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
package org.omg.sysml.logic.delegate.invocation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.AcceptActionUsage;
import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.CalculationUsage;
import org.omg.sysml.model.sysml.Comment;
import org.omg.sysml.model.sysml.ConstraintUsage;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.PerformActionUsage;
import org.omg.sysml.model.sysml.ReferenceUsage;
import org.omg.sysml.model.sysml.StateUsage;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.TransitionUsage;
import org.omg.sysml.model.sysml.ViewUsage;

/**
 * Invocation semantics tests for Usage and Usage-derived metaclasses.
 */
public class InvocationSemanticsUsageTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void acceptActionUsageIsTriggerActionRule() throws Exception {
        AcceptActionUsage acceptActionUsage = SysMLFactory.eINSTANCE.createAcceptActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("AcceptActionUsage_isTriggerAction_InvocationDelegate",
                "AcceptActionUsage", "isTriggerAction", 0, acceptActionUsage, null));
        assertFalse(acceptActionUsage.isTriggerAction());
    }

    @Test
    void actionUsageArgumentRule() throws Exception {
        ActionUsage actionUsage = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("ActionUsage_argument_InvocationDelegate",
                "ActionUsage", "argument", 1, actionUsage, semantics.intArg(1)));
        assertNull(actionUsage.argument(1));
    }

    @Test
    void actionUsageInputParameterRule() throws Exception {
        ActionUsage actionUsage = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("ActionUsage_inputParameter_InvocationDelegate",
                "ActionUsage", "inputParameter", 1, actionUsage, semantics.intArg(1)));
        assertNull(actionUsage.inputParameter(1));
    }

    @Test
    void actionUsageInputParametersRule() throws Exception {
        ActionUsage actionUsage = SysMLFactory.eINSTANCE.createActionUsage();
        assertTrue(((EList<?>) semantics.invokeInvocation("ActionUsage_inputParameters_InvocationDelegate",
                "ActionUsage", "inputParameters", 0, actionUsage, null)).isEmpty());
        assertTrue(actionUsage.inputParameters().isEmpty());
    }

    @Test
    void actionUsageIsSubactionUsageRule() throws Exception {
        ActionUsage actionUsage = SysMLFactory.eINSTANCE.createActionUsage();
        assertFalse((Boolean) semantics.invokeInvocation("ActionUsage_isSubactionUsage_InvocationDelegate",
                "ActionUsage", "isSubactionUsage", 0, actionUsage, null));
        assertFalse(actionUsage.isSubactionUsage());
    }

    @Test
    void actionUsageIsSubactionUsageCompositeOwnedByActionRule() throws Exception {
        var actionUsage = SysMLFactory.eINSTANCE.createActionUsage();
        actionUsage.setIsComposite(true);
        assertFalse((Boolean) semantics.invokeInvocation("ActionUsage_isSubactionUsage_InvocationDelegate",
                "ActionUsage", "isSubactionUsage", 0, actionUsage, null));
        assertFalse(actionUsage.isSubactionUsage());
    }

    @Test
    void calculationUsageModelLevelEvaluableRule() throws Exception {
        CalculationUsage calculationUsage = SysMLFactory.eINSTANCE.createCalculationUsage();
        var visited = new BasicEList<Feature>();
        assertFalse((Boolean) semantics.invokeInvocation("CalculationUsage_modelLevelEvaluable_InvocationDelegate",
                "CalculationUsage", "modelLevelEvaluable", 1, calculationUsage, semantics.args(visited)));
        assertFalse(calculationUsage.modelLevelEvaluable(visited));
    }

    @Test
    void constraintUsageModelLevelEvaluableRule() throws Exception {
        ConstraintUsage constraintUsage = SysMLFactory.eINSTANCE.createConstraintUsage();
        var visited = new BasicEList<Feature>();
        assertFalse((Boolean) semantics.invokeInvocation("ConstraintUsage_modelLevelEvaluable_InvocationDelegate",
                "ConstraintUsage", "modelLevelEvaluable", 1, constraintUsage, semantics.args(visited)));
        assertFalse(constraintUsage.modelLevelEvaluable(visited));
    }

    @Test
    void constraintUsageNamingFeatureRule() throws Exception {
        ConstraintUsage constraintUsage = SysMLFactory.eINSTANCE.createConstraintUsage();
        assertNull(semantics.invokeInvocation("ConstraintUsage_namingFeature_InvocationDelegate",
                "ConstraintUsage", "namingFeature", 0, constraintUsage, null));
        assertNull(constraintUsage.namingFeature());
    }

    @Test
    void viewUsageIncludeAsExposedRule() throws Exception {
        ViewUsage viewUsage = SysMLFactory.eINSTANCE.createViewUsage();
        Comment element = SysMLFactory.eINSTANCE.createComment();
        assertTrue((Boolean) semantics.invokeInvocation("ViewUsage_includeAsExposed_InvocationDelegate",
                "ViewUsage", "includeAsExposed", 1, viewUsage, semantics.args(element)));
        assertTrue(viewUsage.includeAsExposed(element));
    }

    @Test
    void stateUsageIsSubstateUsageRule() throws Exception {
        StateUsage stateUsage = SysMLFactory.eINSTANCE.createStateUsage();
        assertFalse((Boolean) semantics.invokeInvocation("StateUsage_isSubstateUsage_InvocationDelegate",
                "StateUsage", "isSubstateUsage", 1, stateUsage, semantics.args(Boolean.FALSE)));
        assertFalse(stateUsage.isSubstateUsage(false));
    }

    @Test
    void stateUsageIsSubstateUsageCompositeOwnedByStateDefinitionRule() throws Exception {
        var stateUsage = SysMLFactory.eINSTANCE.createStateUsage();
        stateUsage.setIsComposite(true);
        assertFalse((Boolean) semantics.invokeInvocation("StateUsage_isSubstateUsage_InvocationDelegate",
                "StateUsage", "isSubstateUsage", 1, stateUsage, semantics.args(Boolean.FALSE)));
        assertFalse(stateUsage.isSubstateUsage(false));
    }

    @Test
    void transitionUsageSourceFeatureRule() throws Exception {
        TransitionUsage transitionUsage = SysMLFactory.eINSTANCE.createTransitionUsage();
        assertNull(semantics.invokeInvocation("TransitionUsage_sourceFeature_InvocationDelegate",
                "TransitionUsage", "sourceFeature", 0, transitionUsage, null));
        assertNull(transitionUsage.sourceFeature());
    }

    @Test
    void transitionUsageTriggerPayloadParameterRule() throws Exception {
        TransitionUsage transitionUsage = SysMLFactory.eINSTANCE.createTransitionUsage();
        assertNull(semantics.invokeInvocation("TransitionUsage_triggerPayloadParameter_InvocationDelegate",
                "TransitionUsage", "triggerPayloadParameter", 0, transitionUsage, null));
        assertNull(transitionUsage.triggerPayloadParameter());
    }

    @Test
    void usageNamingFeatureRule() throws Exception {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("Usage_namingFeature_InvocationDelegate",
                "Usage", "namingFeature", 0, usage, null));
        assertNull(usage.namingFeature());
    }

    @Test
    void usageReferencedFeatureTargetRule() throws Exception {
        ActionUsage usage = SysMLFactory.eINSTANCE.createActionUsage();
        assertNull(semantics.invokeInvocation("Usage_referencedFeatureTarget_InvocationDelegate",
                "Usage", "referencedFeatureTarget", 0, usage, null));
        assertNull(usage.referencedFeatureTarget());
    }

    @Test
    void performActionUsageNamingFeatureRule() throws Exception {
        PerformActionUsage performActionUsage = SysMLFactory.eINSTANCE.createPerformActionUsage();
        assertNull(semantics.invokeInvocation("PerformActionUsage_namingFeature_InvocationDelegate",
                "PerformActionUsage", "namingFeature", 0, performActionUsage, null));
        assertNull(performActionUsage.namingFeature());
    }

    @Test
    void referenceUsageNamingFeatureRule() throws Exception {
        ReferenceUsage referenceUsage = SysMLFactory.eINSTANCE.createReferenceUsage();
        assertNull(semantics.invokeInvocation("ReferenceUsage_namingFeature_InvocationDelegate",
                "ReferenceUsage", "namingFeature", 0, referenceUsage, null));
        assertNull(referenceUsage.namingFeature());
    }
}
